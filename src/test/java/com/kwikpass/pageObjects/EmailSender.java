package com.kwikpass.pageObjects;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kwikpass.utilities.ReadConfig;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class EmailSender{

	ReadConfig readconfig = new ReadConfig();
	public String fromemail = readconfig.getfrommail();
	public String frompass = readconfig.getfrompass();
	public String toemail = readconfig.gettoemail();
    @Test(enabled = true)
    public void SendEmail() {
        // Sender's email configuration
    	
        String senderEmail = fromemail;
        String senderPassword = frompass;
        // Recipient's email
        String recipientEmail = toemail;

        // Email properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Create a session with the SMTP server
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create a MimeMessage
            Message message = new MimeMessage(session);

            // Set the sender and recipient addresses
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));

            // Set the email subject
            message.setSubject("Kwikpass Automation Testing Report");

            // Set the email body
            MimeBodyPart textMime = new MimeBodyPart();
            textMime.setText("Hi All,\n\n" + "Please find the attached automation test report.\n"
                    + "NOTE :- PLEASE DOWNLOAD THE FILE TO REVIEW REPORT.\n\n" + "Thank you,\n" + "Naveen Unakal");

            // Attach the HTML report to the email
            // Replace "path/to/your/report.html" with the actual path to your HTML report
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(new Date());// time stamp
            String repName = "Kwikpass-Automation-Testing-Report-" + timeStamp + ".html";
            String reportFilePath = System.getProperty("user.dir") + "/test-output/" + repName;
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(reportFilePath);

            // Create the Multipart object and add the parts to it
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(attachmentPart);
            multipart.addBodyPart(textMime);

            // Set the content of the message
            message.setContent(multipart);

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully!");

            // Assert that the email was sent successfully
            Assert.assertTrue(true, "Email sent successfully!");

        } catch (Exception e) {
            e.printStackTrace();

            // Assert that the email sending failed
            Assert.fail("Failed to send email: " + e.getMessage());
        }
    }
}
