package aaa.bbb;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelloWorld1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello23344455566");
		
		try {
			 Process p = Runtime.getRuntime().exec("C:\\a.cmd");
			 BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			 String line = null;
			 while ((line = br.readLine()) != null) {
			  System.out.println(line);
			 }
			} catch (Exception e) {
			 System.err.println(e);
			}
			
	}

}
