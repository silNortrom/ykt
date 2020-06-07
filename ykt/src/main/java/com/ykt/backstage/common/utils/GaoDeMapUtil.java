package com.ykt.backstage.common.utils;// package com.bestpost.common.utils;
//
//
//
// import com.bestpost.common.RRException;
// import net.sf.json.JSONArray;
// import net.sf.json.JSONObject;
// import org.apache.commons.collections.MapUtils;
// import org.springframework.boot.SpringApplication;
//
// import java.io.*;
// import java.net.HttpURLConnection;
// import java.net.URL;
// import java.net.URLConnection;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.regex.Pattern;
//
//
// /**
//  * @Author: tangyun
//  * @Date: 2019/6/25
//  */
// public class GaoDeMapUtil {
//     private static String key = "5761f5d13e7c80dbfd65001b750ee252";
//
//     /**
//      * 向指定 URL 发送POST方法的请求
//      *
//      * @param url   发送请求的 URL
//      * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
//      * @return 所代表远程资源的响应结果
//      */
//     public static String sendPost(String url, String param) {
//         PrintWriter out = null;
//         BufferedReader in = null;
//         String result = "";
//         try {
//             URL realUrl = new URL(url);
//             // 打开和URL之间的连接
//             URLConnection conn = realUrl.openConnection();
//             // 设置通用的请求属性
//             conn.setRequestProperty("accept", "*/*");
//             conn.setRequestProperty("connection", "Keep-Alive");
//             conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
//             // 发送POST请求必须设置如下两行
//             conn.setDoOutput(true);
//             conn.setDoInput(true);
//             // 获取URLConnection对象对应的输出流
//             out = new PrintWriter(conn.getOutputStream());
//             // 发送请求参数
//             out.print(param);
//             // flush输出流的缓冲
//             out.flush();
//             // 定义BufferedReader输入流来读取URL的响应
//             in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//             String line;
//             while ((line = in.readLine()) != null) {
//                 result += line;
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         // 使用finally块来关闭输出流、输入流
//         finally {
//             try {
//                 if (out != null) {
//                     out.close();
//                 }
//                 if (in != null) {
//                     in.close();
//                 }
//             } catch (IOException ex) {
//                 ex.printStackTrace();
//             }
//         }
//         return result;
//     }
//     /**
//      * 向指定 URL 发送GET方法的请求
//      *
//      * @param url   发送请求的 URL
//      * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
//      * @return 所代表远程资源的响应结果
//      */
//     public static String sendGet(String url, String param) {
//         String result = "";
//         BufferedReader in = null;
//         try {
//             String urlNameString = url + "?" + param;
//             URL realUrl = new URL(urlNameString);
//             // 打开和URL之间的连接
//             URLConnection connection = realUrl.openConnection();
//             // 设置通用的请求属性
//             connection.setRequestProperty("accept", "*/*");
//             connection.setRequestProperty("connection", "Keep-Alive");
//             connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
//             // 建立实际的连接
//             connection.connect();
//             // 获取所有响应头字段
//             Map<String, List<String>> map = connection.getHeaderFields();
//
//             // 定义 BufferedReader输入流来读取URL的响应
//             in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//             String line;
//             while ((line = in.readLine()) != null) {
//                 result += line;
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         // 使用finally块来关闭输入流
//         finally {
//             try {
//                 if (in != null) {
//                     in.close();
//                 }
//             } catch (Exception e2) {
//                 e2.printStackTrace();
//             }
//         }
//         return result;
//     }
//
//
//     /**
//      * 高德api 根据地址获取经纬度
//      *
//      * @param name
//      * @return
//      */
//     public static String getLatAndLogByName(String name) {
//         StringBuffer s = new StringBuffer();
//         s.append("key=" + key + "&address=" + name);
//         String res = sendPost("https://restapi.amap.com/v3/geocode/geo", s.toString());
//         JSONObject jsonObject = JSONObject.fromObject(res);
//         JSONArray jsonArray = JSONArray.fromObject(jsonObject.getString("geocodes"));
//         JSONObject location = (JSONObject) jsonArray.get(0);
//         String add = location.get("location").toString();
//         return add;
//     }
//
//
//
//
//     /**
//      * 高德api 地址获取距离内的所有poi
//      *
//      * @param locations
//      * @return
//      */
//     public static Map<String,List<POI>> getPOIByLatAndLog(String[] locations,int distance) {
//         if (locations.length>20||locations.length==1){
//             throw new RRException("请求转换地址过多或过少");
//         }
//         Map<String,List<POI>> map = new HashMap<>();
//         StringBuffer s = new StringBuffer();
//         for (int i = 0;i<locations.length;i++) {
//             if (i==0){
//                 s.append("location=" + locations[i]);
//             }else {
//                 s.append("|"+locations[i]);
//             }
//         }
//         s.append("&key=" + key + "&radius="+distance+"&extensions=all&output=json&batch=true");
//         String res = sendPost("https://restapi.amap.com/v3/geocode/regeo", s.toString());
//         JSONObject jsonObject = JSONObject.fromObject(res);
//         if ("1".equals(jsonObject.getString("status"))){
//             String str = jsonObject.getString("regeocodes");
//             JSONArray jsonArrayAll = JSONArray.fromObject(jsonObject.getString("regeocodes"));
//             for (int j = 0;j<jsonArrayAll.size();j++){
//                 JSONObject jsonObject1 = (JSONObject) jsonArrayAll.get(j);
//                 JSONArray jsonArray = JSONArray.fromObject(jsonObject1.getString("pois"));
//
//                 List<POI> list = new ArrayList<>();
//                 for (int i = 0;i<jsonArray.size();i++){
//                     JSONObject poiAll = (JSONObject) jsonArray.get(i);
//                     POI poi = new POI();
//                     poi.setName(poiAll.get("name").toString());
//                     poi.setLocation(poiAll.get("location").toString());
//                     poi.setDistance(Double.parseDouble(poiAll.get("distance").toString()));
//                     list.add(poi);
//                 }
//                 map.put(locations[j],list);
//
//             }
//
//         }
//
//         return map;
//     }
//
//
//
//     public static void main(String[] args) {
//         String s1= getLatAndLogByName("四川省成都市双流区牧华路二段3301号");
//         String s2= getLatAndLogByName("四川省成都市双流区牧华路二段3302号");
//         String s3= getLatAndLogByName("四川省成都市双流区牧华路二段3350号");
//         String s4= getLatAndLogByName("四川省成都市双流区牧华路二段3360号");
//
//         Map<String,List<POI>> map1 = getPOIByLatAndLog(new String[]{s1,s2,s3,s4},200);
//
//         while (true){
//
//         }
//         }
//
// }
// /**
//  * poi类
//  */
// class POI{
//     private String name;
//     private String location;
//     private double distance;
//
//     public String getName() { return name; }
//
//     public void setName(String name) { this.name = name; }
//
//     public String getLocation() { return location; }
//
//     public void setLocation(String location) { this.location = location; }
//
//     public double getDistance() { return distance; }
//
//     public void setDistance(double distance) { this.distance = distance; }
// }
