package com.withlzc.service;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/26 0026 21:28
 */
public interface MailService {

    public void sendSimpleMail(String to, String subject, String content);

    public void sendHtmlMail(String to, String subject, String content);

    public void sendAttachmentsMail(String to, String subject, String content, String filePath);

    public void sendInlineResourceMail(String to, String subject, String content, String rscId, String rscPath);

}
