package com.ykt.backstage.common.utils;

import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailUtil {
    public static void sendMail(String to, String code) throws Exception {
        // 1.创建连接对象
        Properties props = new Properties();
        // 开启debug调试
        //props.setProperty("mail.debug", "true");
        // 发送服务器需要身份验证
        props.setProperty("mail.smtp.auth", "true");
        // 设置邮件服务器主机名
        props.setProperty("mail.host", "smtp.163.com");
        // 发送邮件协议名称
        props.setProperty("mail.transport.protocol", "smtp");
        Session session = Session.getDefaultInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // XCXSystem@163.com是发送邮箱的邮箱账号 XCX123456789是替换码
                return new PasswordAuthentication("XCXSystem@163.com", "XCX123456789");
            }
        });
        // 2.创建邮件对象
        Message message = new MimeMessage(session);
        // 发件人
        message.setFrom(new InternetAddress("XCXSystem@163.com"));
        // 收件人
        message.setRecipient(RecipientType.TO, new InternetAddress(to));
        //主题
        message.setSubject("来自百德邮政的验证码邮件");
        //正文
        message.setContent("<h1>来自百德邮政的验证码邮件</h1><h3>您的验证码为：" + code, "text/html;charset=utf-8");
        // 3.发送验证码邮件
        Transport.send(message);
    }
}