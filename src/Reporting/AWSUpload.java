package Reporting;
/**
 * @author Shubham Jain
 * */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;

import automationframework.AutomationLog;
/**
 * Note : This Code only working and designed for Linux/Mac platform. Call/Use this class for linux/Mac platform only.
 * */
public class AWSUpload {

	    int iExitValue;
	    String sCommandString;
        static String Pemfilepath="/home/shubham/Experiment_zone/FTP-SCP-Project/src/lib/cuelogic.pem";
        static String targetFolder = "/home/shubham/Experiment_zone/FTP-SCP-Project/test-output3";
        static String shellSciptLocation = "sh /home/shubham/Experiment_zone/FTP-SCP-Project/shellscript2.sh";
        static String AWSAccountPublicIPAndPath = "ubuntu@54.152.13.148:/var/www/html/projects/kumo_reports/";
        
	    public void runScript(String command){
	        sCommandString = command;
	        CommandLine oCmdLine = CommandLine.parse(sCommandString);
	        DefaultExecutor oDefaultExecutor = new DefaultExecutor();
	        oDefaultExecutor.setExitValue(0);
	        try {
	            iExitValue = oDefaultExecutor.execute(oCmdLine);
	        } catch (ExecuteException e) {
	            System.err.println("Execution failed.");
	            AutomationLog.error("Error: " + e.getMessage());
	            e.printStackTrace();
	        } catch (IOException e) {
	            System.err.println("permission denied.");
	            AutomationLog.error("Error: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	   static public File createShellScript() {
	        String filename = "shellscript2.sh";
	        File fstream = new File(filename);

	        try{
	             // Create file 
	   	     SimpleDateFormat dateFormatForFoldername = new SimpleDateFormat("yyyy-MM-dd");//dd/MM/yyyy
	            Date currentDate = new Date();
	            String folderDateFormat = dateFormatForFoldername.format(currentDate);

	            PrintStream out = new PrintStream(new FileOutputStream(fstream));
	       	    String pass = "\"password\"";
	            out.println("echo "+pass+" | "+"sudo -S scp -i "+Pemfilepath+" -r "+targetFolder+" "+ AWSAccountPublicIPAndPath + folderDateFormat +"/");
	            out.println("echo \"Success\"");
	        
	            //Close the output stream
	            out.close();
	        }catch (Exception e){//Catch exception if any
	            System.err.println("Error: " + e.getMessage());
	            AutomationLog.error("Error: " + e.getMessage());
	        }
	        return fstream;

	   }
	    public static void execute(){
	        AWSUpload testScript = new AWSUpload();
	        createShellScript();
	        testScript.runScript(shellSciptLocation);  // before running it give 600 chmod permission to pem file
	    }
	}

