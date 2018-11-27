package com.withlzc.service.impl;

import com.withlzc.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/26 0026 21:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceImplTest {

    @Autowired
    private MailService mailService;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void sendSimpleMail() throws Exception{
        String to = "withlzc@gmail.com";
        String subject = "test simple mail subject";
        String content = "test simple mail content";
        mailService.sendSimpleMail(to, subject, content);
    }

    @Test
    public void sendHtmlMail() throws Exception {
        String to = "withlzc@gmail.com";
        String subject = "test html mail subject";
        String content = "<html>\n" +
                "<body>\n" +
                "  <h3>test html mail content</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail(to, subject, content);
    }

    @Test
    public void sendAttachmentsMail() throws Exception {
        String to = "withlzc@gmail.com";
        String subject = "test attachments mail subject";
        String content = "test attachments mail content";
        String filePath = "d:\\test.txt";
        mailService.sendAttachmentsMail(to, subject, content, filePath);
    }

    @Test
    public void sendInlineResourceMail() throws Exception{
        String to = "withlzc@gmail.com";
        String subject = "test inline resource mail subject";
        String rscId = "001";
        String content = "<html><body>test inline resource mail content: <img src=\'cid:"
                + rscId + "\'></body></html>";
        String rscPath = "d:\\test.png";

        mailService.sendInlineResourceMail(to, subject, content, rscId, rscPath);

    }

    @Test
    public void sendTemplateMail() throws Exception {
        String to = "withlzc@gmail.com";
        String subject = "test template mail subject";

        Context context = new Context();

        //userName test failed!!
        context.setVariable("userName", "testName");
        String content = templateEngine.process("emailTemplate", context);

        mailService.sendHtmlMail(to, subject, content);
    }

}