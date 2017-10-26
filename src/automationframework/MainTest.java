package automationframework;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author Shubham Jain
 *
 */
public class MainTest {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("./shtry.sh", "myArg1", "myArg2");
		try {
		 Process p = pb.start();
		 BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		 String line = null;
		 
			while ((line = reader.readLine()) != null)
			 {
			    System.out.println(line);
			 }
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
