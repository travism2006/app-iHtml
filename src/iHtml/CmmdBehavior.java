package iHtml;

public class CmmdBehavior
{
	private static String delimitChar = " ";
	static Object newEnv;
	//general-use constructors:
	//@SuppressWarnings("unused")
	public CmmdBehavior()
     {
         newEnv = new iEnvironment();
     }
     public CmmdBehavior(String given)
     {
    	 newEnv = new iEnvironment(given);
     }
     public CmmdBehavior(String mode, String template)
     {
    	 newEnv = new iEnvironment(mode, template);
     }
	
	//General Parsing of Input
	public static String[] breakDownInput(String statement)
	{
		if(statement.contains(delimitChar))
		{
			String[] parsedInput = statement.split(delimitChar);
			return parsedInput;
		}
		else {return null;}
	}
	
	//goes through input statement and determines valid cmmds
	public static boolean validCmmds(String[] args)
	{
		boolean[] validStatement = new boolean[args.length];
		for(String arg: args)
		{
			if(iEnvironment.IsEditCmmd(arg))
			{
				System.out.println("valid edit");
				validStatement[arg.indexOf(arg)] = true;
				continue;
			}
			else if(iEnvironment.IsGenCmmd(arg))
			{
				System.out.println("valid gen");
				validStatement[arg.indexOf(arg)] = true;
				continue;
			}
			else if(iEnvironment.IsMode(arg))
			{
				System.out.println("valid mode");
				validStatement[arg.indexOf(arg)] = true;
				continue;
			}
			else if(iEnvironment.IsTemplate(arg))
			{
				System.out.println("valid template");
				validStatement[arg.indexOf(arg)] = true;
				continue;
			}
			else
			{
				validStatement[arg.indexOf(arg)] = false;
				continue;
			}
		}
		
		
		//if all of var validStatement is true, then return true
		int count=0;
		for (int i = 0; i < validStatement.length; i++) {
			if(validStatement[i] == true)
				count++;
		}
		if(count == validStatement.length)
			return true;
		else
			return false;
	}
	
	//TODO FIXME
	public static String HelpCmmd()
    {
        return "General Cmmds" +
            "\n  create - Creates a template based on HTML, CSS, JavaScript/jQuery" +
            "\n  history - displays the log of all interpreted commands" +
            "\n  edit - switches environment to edit" +
            "\n  link to - makes a link to named path" +
            "\n  attrib - adds valid attribute to the current line in a %PATH%.html file" +
            "\n  mode - displays the current mode" +
            "\n  chmod - change the current mode" +
            "\n  help - displays all commands with descriptions" +
            "\n\nEdit Cmmds" +
            "\n  line - gives user access to specific line to edit" +
            "\n  file - gives user limited access to editable files" +
            "\n  link - gives user control over an editable link in-line in current file" +
            "\n  add - appends input to the location specified or at the end of the file" +
            "\n\nTemplates" +
            "\n  basic - creates a 'basic' HTML or CSS document" +
            "\n  light - creates a 'light' HTML or CSS document" +
            "\n  advanced - creates a 'advanced' HTML or CSS document" +
            "\n  heavy - creates a 'heavy' HTML or CSS document" +
            "\n  seo-optimized - creates a 'seo-optimized' (seo[-]opt) HTML document" +
            "\n  custom - allows user to create their own template/code" +
            "\n\nModes" +
            "\n  html - engages all valid HTML(5) rules, and access to HTML(5) variables and methods" +
            "\n  css - engages all valid CSS(3) rules, and access to CSS(3) variables and methods" +
            "\n  js - engages all valid JavaScript(JS) rules, and access to JS variables and methods" +
            "\n  jq - engages all valid jQuery rules, and access to jQuery variables and methods" +
            "\n  file - enables access to files created in the current sesssion";
    }

	//TODO FIXME
    public static String HelpGenCmmd()
    {
        return "General Cmmds" +
            "\n  create - Creates a template based on HTML, CSS, JavaScript/jQuery" +
            "\n  history - displays the log of all interpreted commands" +
            "\n  edit - switches environment to edit" +
            "\n  link to - makes a link to named path" +
            "\n  attrib - adds valid attribute to the current line in a %PATH%.html file" +
            "\n  mode - displays the current mode" +
            "\n  chmod - change the current mode" +
            "\n  help - displays all commands with descriptions\n\n";
    }

	//TODO FIXME
    public static String HelpEditCmmd()
    {
        return "\nEdit Cmmds" +
            "\n  line - gives user access to specific line to edit" +
            "\n  file - gives user limited access to editable files" +
            "\n  link - gives user control over an editable link in-line in current file" +
            "\n  add - appends input to the location specified or at the end of the file" +
            "\n\nTemplates" +
            "\n  basic - creates a 'basic' HTML or CSS document" +
            "\n  light - creates a 'light' HTML or CSS document" +
            "\n  advanced - creates a 'advanced' HTML or CSS document" +
            "\n  heavy - creates a 'heavy' HTML or CSS document" +
            "\n  seo-optimized - creates a 'seo-optimized' (seo[-]opt) HTML document" +
            "\n  custom - allows user to create their own template/code" +
            "\n\nModes" +
            "\n  html - engages all valid HTML(5) rules, and access to HTML(5) variables and methods" +
            "\n  css - engages all valid CSS(3) rules, and access to CSS(3) variables and methods" +
            "\n  js - engages all valid JavaScript(JS) rules, and access to JS variables and methods" +
            "\n  jq - engages all valid jQuery rules, and access to jQuery variables and methods" +
            "\n  file - enables access to files created in the current sesssion\n\n";
    }
}