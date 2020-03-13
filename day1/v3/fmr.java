

import java.util.*;
import java.util.regex.*;
import java.io.*;


public class fmr{
	public static void main (String[] args){

		for(int i = 0; i < args.length; i++) {
			if(args[i].equals("-h")){
				System.out.println("This command takes in an input and a regrex and outputs the line and position of the found toke.\n");
				System.out.println("\t -h \t prints help.");
				
				//update help
				System.exit(0);//this terminates the program automatically
			}//end of if

		}//end of for

		int fileInput = -1;
		for( int = 0; i < args.length; i++) {
       			if(args[i].equals("-f")){
			
				fileinput = i;
				break;
			}//end of if

		}//end of fori

		if(fileinput != -1) {
			String filename = args[fileinput + 1];

			Pattern p = Patterm.compile(args[fileInput + 2]);

			try {
				FileReader freader = new FileReader(filename);
				BufferReader br = new BufferReader(freader);

				
				
				//hint

				String line;

				while((line = br.readLine()) != null){

				//I have to add code that finds regex per line

				}//end of while


			}catch(IOException e) {
				e.printStackTrace();
				System.exit(1);
			
			}//end of catch
		}//end of if

		String line = args[0];
		String regex = args[1];

		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(line);

		boolean found = false;

		while(m.find()) {
			System.out.println(m.start() + ":" + m.end());
			found = true;

		}//end of while

		if(!found) {
			System.out.println("No Match Found.")
				;
			
		}//end of if

	}//end of main

}//end of class
