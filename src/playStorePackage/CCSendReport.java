package playStorePackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

public class CCSendReport {
	public static void SendMailReport()
	{
	
	  try {
		  ProcessBuilder pb = new ProcessBuilder("MailReport.bat");
		  //Map<String, String> env = pb.environment();
		  Process p = pb.start();
		  //p.waitFor();
		  BufferedReader buf = new BufferedReader(new InputStreamReader(
		  p.getInputStream()));
		  String line = "";
		  while ((line = buf.readLine()) != null) {
		  System.out.println(line);
		  }
		  } catch (Exception e) {
		  e.printStackTrace();
		  }
	}
}
