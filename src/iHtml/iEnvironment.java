package iHtml;

public class iEnvironment
{
	//not editable fields
	public static final String[] MODES = {"html", "css", "js/jq", "file"};
	public static final String[] GEN_CMMDS = { "create", "history", "edit", "link to ", "attrib", "mode", "chmod", "help", "template", "view" };
	public static final String[] TEMPLATES = { "basic", "light", "advanced", "heavy", "seo-optimized", "custom" };
	public static final String[] EDIT_CMMDS = { "line", "file", "link", "add" };
	
	//iEnvironment settings
	private static String EnvMode;
	private static String EnvTemplate;
	
	//set and get for mode:
	public static String GetMode()
    {
        return EnvMode;
    }
    public static void SetMode(String newMode)
    {
        EnvMode = newMode;
    }
    
    //template set & get:
    public static String GetTemplate()
    {
        return EnvTemplate;
    }
    public static void SetTemplate(String newTemplate)
    {
        EnvTemplate = newTemplate;
    }
		
	/*
	 * Section 1
	 * Possible constructions
	 */
	public iEnvironment()
    {
        EnvMode = "html";
        EnvTemplate = "basic";
    }
	public iEnvironment(String given)
    {
        if (IsMode(given))
        {
            EnvMode = given;
            EnvTemplate = "basic";
        }
        else if (IsTemplate(given))
        {
            EnvMode = "html";
            EnvTemplate = given;
        }
        else
        {
            EnvMode = "html";
            EnvTemplate = "basic";
        }
    }
	public iEnvironment(String m, String template)
    {
        if (IsMode(m))
        {
            EnvMode = m;
        }
        if (IsTemplate(template))
        {
            EnvTemplate = template;
        }
    }
	
	/*
	 * 		Section 2.0
	 * 	validation methods
	 */
	//in-place validation
	public static boolean IsMode(String m)
	{
		for(String loc_m: MODES)
		{
			if(loc_m == m) return true;
		}
		return false;
	}
	public static boolean IsGenCmmd(String gc)
	{
		for(String loc_gc: GEN_CMMDS)
		{
			if(loc_gc == gc) return true;
		}
		return false;
	}
	public static boolean IsTemplate(String templ)
	{
		for(String t: TEMPLATES)
		{
			if(t == templ) return true;
		}
		return false;
	}
	public static boolean IsEditCmmd(String edit)
	{
		for(String ed: EDIT_CMMDS)
		{
			if(ed == edit) return true;
		}
		return false;
	}
		
	//equivalent to ToString
	public static String ToString()
    {
        return "Current mode:  " + EnvMode +
               "\nUsing template:  " + EnvTemplate +
               "\n";
    }
	
	/*
	 * Proected version/copyright information 
	 */
	private final static String copyrightInfo="";

	public static String GetCopyright() {
		return copyrightInfo;
	}
}
