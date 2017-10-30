package mailReport;
/**
 * @author Shubham Jain
 *
 */
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage.RecipientType;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.remote.BrowserType;


import automationframework.AppDriver;
import automationframework.AutomationLog;
import automationframework.ExcelLib;
import pageobjects.Page;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/*This file is used for sending the report after execution of all suites using email*/
public class SendMailClass 
{
	public SendMailClass(){
		
	}
/*	static ExcelLib xl = new ExcelLib();
	static String browserType = xl.getXLcellValue("Controller", 1, 0);
	static String serverName = xl.getXLcellValue("Controller", 1, 1);*/
	
    private static String OSNAMES = System.getProperty("os.name").toLowerCase();
    static String OS = OSNAMES.split(" ")[0];
	static Date currentDate = new Date();
    static SimpleDateFormat dateFormatForFileName = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");//dd/MM/yyyy
    static String fileDateFormet = dateFormatForFileName.format(currentDate);
	static String testoutputfolderpath = System.getProperty("user.dir")+ File.separator +"target"+ File.separator+ "site";
//    static String testoutputfolderpath = System.getProperty("user.dir")+ File.separator +"src"+ File.separator+ "logs2";
//	static String zipFilefolderpath = System.getProperty("user.dir")+ File.separator +"reports"+File.separator+"results"+fileDateFormet;  // Zip Reports Files
	static String zipFilefolderpath = System.getProperty("user.dir")+ File.separator +"reports"+File.separator+"results"+fileDateFormet+".txt";  // Zip Reports Files
//    static String zipFilefolderpath = System.getProperty("user.dir")+ File.separator +"reports"+File.separator+"results2017-10-30 15-57-28";
	static String zipLogFilefolderpath = System.getProperty("user.dir")+ File.separator +"logs"+File.separator+"logs.txt";
	static File folder = new File(testoutputfolderpath);
	static File zipFile = new File(zipFilefolderpath);
	static String subject = "Shubham Automation Application Test Cucumber report on browser";
    
	public static void execute() throws Exception{
		SendMailClass.zipFolder(folder, zipFile);
	}
	
 /*   public static void execute() throws Exception
    {
   	
    //	ExcelLib xl = new ExcelLib();
    	//////////////////////// Create a zip file of test-output folder /////////////////
    	
    	SendMailClass.zipFolder(folder, zipFile);
    	//////////////////////////////////////////////////////////////////////////////////
   
        path of file which contains report
        String path = zipFilefolderpath;
        String path2 = zipLogFilefolderpath;
         //Report file = path&gt;
        No of recipients of the report, you can have many separated by comma
        
        String mailto = "shubham.jain@cuelogic.co.in";
        String mailcc = "shubham.jain@cuelogic.co.in";
        String mailbcc = "shubham.jain@cuelogic.co.in";
        
        
        String[] to={mailto};
        String[] cc={mailcc};
        String[] bcc={mailbcc};

        
        email user name and password of sender 
   
   
        SendMailClass.sendMail("shubham.jain@cuelogic.co.in",   
                            "shubhamjain1234",                     
                            "smtp.gmail.com",
                            "465",
                            "true",
                            "true",
                            "javax.net.ssl.SSLSocketFactory",
                            "false",
                             to,
                             cc,
                             bcc,
                            subject,
                            "Greetings, This is Final Automation Test Report. This Auto-generated report please do not reply",
                            path,
                            path2,
                            "Test-Report");
      }

      public  static boolean sendMail(String userName,
                String passWord,
                String host,
                String port,
                String starttls,
                String auth,
                String socketFactoryClass,
                String fallback,
                String[] to,
                String[] cc,
                String[] bcc,
                String subject,
                String text,
                String attachmentPath,
                String attachmentPath2,
                String attachmentName){

        //Object Instantiation of a properties file.
        Properties props = new Properties();

        props.put("mail.smtp.user", userName);

        props.put("mail.smtp.host", host);

        if(!"".equals(port)){
        props.put("mail.smtp.port", port);
        }

        if(!"".equals(starttls)){
            props.put("mail.smtp.starttls.enable",starttls);
            props.put("mail.smtp.auth", auth);
        }

        if(!"".equals(port)){
            props.put("mail.smtp.socketFactory.port", port);
        }
        if(!"".equals(socketFactoryClass)){
            props.put("mail.smtp.socketFactory.class",socketFactoryClass);
        }
        if(!"".equals(fallback)){
            props.put("mail.smtp.socketFactory.fallback", fallback);
        }

        try{

            Session session = Session.getDefaultInstance(props, null);

            MimeMessage msg = new MimeMessage(session);
            
            msg.setText(text);

            msg.setSubject(subject);

            Multipart multipart = new MimeMultipart();
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            //////////////////////////////////
			BodyPart objMessageBodyPart = new MimeBodyPart();

			objMessageBodyPart.setText(text);
			/////////////////////////////////
            messageBodyPart.setText(text);
            messageBodyPart.setContent(text, "text/html");
            DataSource source = new FileDataSource(attachmentPath);
                                  
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("Reports");
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(objMessageBodyPart);

            /////////////////////////////// Add another File ////////////////
            
            DataSource source2 = new FileDataSource(attachmentPath2);  
            BodyPart messageBodyPart2 = new MimeBodyPart();           
            messageBodyPart2.setText(text);
            messageBodyPart2.setDataHandler(new DataHandler(source2));
            messageBodyPart2.setFileName(attachmentPath2);
            messageBodyPart2.setFileName("Logs.txt");
            multipart.addBodyPart(messageBodyPart2);
            
            /////////////////////////////////////////////////////////////////////
            
            msg.setContent(multipart);
            
            msg.setFrom(new InternetAddress(userName));

            for(int i=0;i<to.length;i++){
                msg.addRecipient(Message.RecipientType.TO, new
InternetAddress(to[i]));
            }

            for(int i=0;i<cc.length;i++){
                msg.addRecipient(Message.RecipientType.CC, new
InternetAddress(cc[i]));
            }

            for(int i=0;i<bcc.length;i++){
                msg.addRecipient(Message.RecipientType.BCC, new
InternetAddress(bcc[i]));
            }

            msg.saveChanges();

            Transport transport = session.getTransport("smtp");

            transport.connect(host, userName, passWord);

            transport.sendMessage(msg, msg.getAllRecipients());

            transport.close();
            AutomationLog.info("Email is sucessfully sent");
			//closing .exe of chrome or phantom driver binaries
			AppDriver.clearBrowserContext(Page.driver);
            return true;

        } catch (Exception mex){
            mex.printStackTrace();
            return false;
        }
    }
           */ 
      public static void zipFolder(final File folder, final File zipFile) throws IOException {
          zipFolder(folder, new FileOutputStream(zipFile));
          
      }

      public static void zipFolder(final File folder, final OutputStream outputStream) throws IOException {
          try (ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream)) {
              processFolder(folder, zipOutputStream, folder.getPath().length() + 1);
          }
      }

      private static void processFolder(final File folder, final ZipOutputStream zipOutputStream, final int prefixLength)
              throws IOException {
          for (final File file : folder.listFiles()) {
              if (file.isFile()) {
                  final ZipEntry zipEntry = new ZipEntry(file.getPath().substring(prefixLength));
                  zipOutputStream.putNextEntry(zipEntry);
                  try (FileInputStream inputStream = new FileInputStream(file)) {
                      IOUtils.copy(inputStream, zipOutputStream);
                  }
                  zipOutputStream.closeEntry();
              } else if (file.isDirectory()) {
                  processFolder(file, zipOutputStream, prefixLength);
              }
          }
      }
}
