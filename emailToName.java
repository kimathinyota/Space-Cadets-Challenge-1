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
		String title;
		int base = 0;
		int pos;
		
		while((inputLine = in.readLine()) != null) {
			base = 0;
			while(inputLine.charAt(base)!='<' && base<inputLine.length()){
				base+=1;
			}
			if(base==inputLine.length()){
				base=0;
			}
			title = inputLine.substring(base,base+7);
			if(title.equals("<title>")==true){ // == operator didn't work so i used equals method to compare the strings
				pos = base + 7; //pos = position of first character after <title> in inputLine string
				name = "";
				while(inputLine.charAt(pos)!='|' && pos<inputLine.length()){
					name+=inputLine.charAt(pos);
					pos+=1;
				}
				break;
			}
		}
		in.close();
		System.out.println("Name: " + name);
	}
	
	
}

	
		
		
		
		
		
		
		
		