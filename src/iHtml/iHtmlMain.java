package iHtml;

import java.io.*;
import java.util.Scanner;

public class iHtmlMain {

	///<summary>
	///  The purpose of this iHtml application is to use precision when making
	///  your website.  It is designed similar to the command prompt/terminal
	///  on your computer.  
	///<summary>
	
	public static void main(String[] args) throws IOException
	{
		//prop's of console
		Console.class.getName().replace(Console.class.getName(), "HTML Interpreter Program");
				
		//prepare for input
		Scanner sc = new Scanner(System.in);
		
		String currMod = iEnvironment.GetMode(), currTempl=iEnvironment.GetTemplate();
		StringBuilder allText = null;
		Object iHtmlObj = new CmmdBehavior();
		
		//corrected print out
		System.out.println(iEnvironment.GetCopyright());
		System.out.println("Press enter to continue");
		sc.nextLine();
		System.out.println("<DEFAULT mode  " + iEnvironment.GetMode() + "engaged>");
		
		if(iEnvironment.IsMode(currMod)) System.out.print(currMod + "~ ");
		String input = sc.nextLine();
		
		//check for chmod to prompt
		while (input != null && iEnvironment.IsMode(input) == false)
		{
		    System.out.println(currMod + "~");
		    input = sc.nextLine();
		    if (iEnvironment.IsMode(input))
		    {
		    	System.out.println("Valid mode accepted; mode is now " + input);
				//iHtmlObj = input;
		    }
		    else
		    {
		    	System.out.println("invalid mode <" + input + ">");
		    	System.out.print("chmod to~");
		        input = sc.nextLine();
		    }
		}
		
		//continuously gather input from user
		//Check for Exit Command
        while (input != null && !input.equals("exit"))
        {

            //start interpreter mode
            input = sc.nextLine();

            //1.2--Interpretation
            /*        
             * This section covers the intrepretation of
             * the users html input.
             */

            try {
				//Use HtmlClass for checking and appending
				//scan opening/beginning HTML and append to allText
				HtmlClass.AppendBeginningHtmlTo(allText, input);

				//check closing HTML, and then append to allText
				HtmlClass.AppendEndHtmlTo(allText, input);
			} catch (Exception e) {
				e.printStackTrace();
			}

            //#region TODO--FIXME
            /*
             * // Example #2: Write one string to a text file. 
             * string text = "A class is the most powerful data type in C#. 
             * Like a structure, " + "a class defines the data and behavior of the data type. ";
             * // WriteAllText creates a file, writes the specified string to the file, & then 
             * closes the file.    You do NOT need to call Flush() or Close().
             * System.IO.File.WriteAllText(@"C:\Users\Public\TestFolder\WriteText.txt", text);
             */

            /*            Section 1.3
             *      The following code works on the file writing to.
             */

            //TODO--==--FIXME
            /* 'Done' Command
            if (inputCmmd.ToUpper().Equals("DONE"))
            {
                //prompt for new file
                Console.WriteLine("Pipe to a new file?");
                answer = Console.ReadLine();
                Pipe to new file
                //check answer
                if (answer.Equals(answer.ToUpper().Equals("Y")) || answer.Equals(answer.ToUpper().Equals("YES")))
                {
                    Console.Write("Name the new file to pipe to:\t");
                    fName = Console.ReadLine();                        
                }
                
                else
                {//otherwise the user means to access an existing file
                	//Existing File Check
                    try
                    {
                        Console.Write("Accessing recent file (path + name):\t");
                        fName = Console.ReadLine();
                        if (!System.IO.File.Exists(fName))
                        {
                            //throw new System.IO.FileNotFoundException(fName + "D.N.E.");
                        }
                    }
                    //catch (System.IO.FileNotFoundException fne)
                    {
                        Console.WriteLine(fne);
                        break;
                    }
                }
                Console.WriteLine(allText);
                //check against (any) exceptions......and then (eventually) exit the application
            }

        */
        }

        System.out.println(allText + "\n\nEnter to exit...");
        sc.next();
		sc.close();
	}
}