package com.ykt.backstage.common.utils;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.util.List;


public class ExcelUtil {
    public static void createHeadRow(Sheet sheet, HSSFCellStyle cellStyle, List<String> titles) {
        Row headRow = sheet.createRow(0);
        for (int i = 0; i < titles.size(); i++) {
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 22 / 10);
            Cell cell = headRow.createCell(i);
            cell.setCellValue(titles.get(i));
            cell.setCellStyle(cellStyle);
        }

    }

    public static void createContentRows(Sheet sheet, List<List<String>> objectList, HSSFCellStyle cellStyle) {
        //设置居中
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        int i = 1;
        for (List<String> contents : objectList) {
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, sheet.getColumnWidth(i) * 22 / 10);

            Row row = sheet.createRow(i);
            for (int j = 0; j < contents.size(); j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(contents.get(j));
                cell.setCellStyle(cellStyle);
            }
            i++;
        }
    }

    public static HSSFCellStyle getHeadRowStyle(HSSFWorkbook workbook) {
        HSSFCellStyle cellStyle = workbook.createCellStyle();
        //设置居中
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        //设置字体
        HSSFFont font = workbook.createFont();
        font.setFontName("黑体");//设置字体名称
        font.setFontHeightInPoints((short) 11);//设置字号
        font.setItalic(false);//设置是否为斜体
        font.setBold(true);//设置是否加粗
        cellStyle.setFont(font);
        //加边框
        cellStyle.setBorderBottom(BorderStyle.THIN);//下边框
        cellStyle.setBorderLeft(BorderStyle.THIN);//左边框
        cellStyle.setBorderRight(BorderStyle.THIN);//右边框
        cellStyle.setBorderTop(BorderStyle.THIN); //上边框

        //设置自动换行
        cellStyle.setWrapText(true);

        return cellStyle;
    }

    public static HSSFCellStyle getContentRowsStyle(HSSFWorkbook workbook) {
        HSSFCellStyle cellStyle = workbook.createCellStyle();
        //设置居中
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        //设置字体
        HSSFFont font = workbook.createFont();
        font.setFontName("黑体");//设置字体名称
        font.setFontHeightInPoints((short) 10);//设置字号
        font.setItalic(false);//设置是否为斜体
        cellStyle.setFont(font);
        //加边框
        cellStyle.setBorderBottom(BorderStyle.THIN);//下边框
        cellStyle.setBorderLeft(BorderStyle.THIN);//左边框
        cellStyle.setBorderRight(BorderStyle.THIN);//右边框
        cellStyle.setBorderTop(BorderStyle.THIN); //上边框

        //设置自动换行
        cellStyle.setWrapText(true);

        return cellStyle;
    }
}
