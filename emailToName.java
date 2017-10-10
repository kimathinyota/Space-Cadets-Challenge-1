//Challenge 1: Write a program which converts an email id into a name

import java.io.*;
import java.net.*;

public class emailToName {
	
	public static void main(String[] args) throws Exception{
		Toolbox myTB = new Toolbox();
		String emailID = myTB.readStringFromCmd();
		String fullWebURL = "http://www.ecs.soton.ac.uk/people/" + emailID+"/";
		URL namePage = new URL(fullWebURL);
		BufferedReader in = new BufferedReader(new InputStreamReader(namePage.openStream()));
		String inputLine;
		String name = "Not Found";
		int titlePos;
		while((inputLine = in.readLine()) != null) {
			titlePos = inputLine.indexOf("<title>");
			if(titlePos!=(0-1)){
				name = inputLine.substring(titlePos+7,inputLine.indexOf('|',titlePos) );
				break;
			}
			
		}
		in.close();
		System.out.println("Name: " + name);
	}
	
	
}


	
		
		
		
		
		
		
		
		
