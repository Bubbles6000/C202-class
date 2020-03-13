
import java.util.*;
import java.util.regex.*;

public class fmr{
	public static void main (String[] args){

		for( int i = 0; i < args.length; i++) {
			if(args[i].equals("-h")){
				System.out.println("THis command takes in an input and a regrex and outputs the line and position of the found toke.\n");
				System.out.println("\t -h \t prints help.");
				System.exit(0);//this terminates the program automatically
			}//end of if

		}//end of for

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
