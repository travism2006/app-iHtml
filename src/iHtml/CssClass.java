package iHtml;

class CssClass
{
    //----------------------Section 1.0------------------------//
    //  Css (3) code commands and equivalences are below.
    //---------------------------------------------------------//

    //   CSS (3) Cmmds & Equavelences
    //   cmmds
    public static String[] OpenCssCmmds =
    {
        "a", "big", "body", "hr", "button", "caption", "center", "comment", "div",
        "h1", "h2", "h3", "h4", "h5",  "h6", "img", "li", "ol", "p", "script",
        "small", "span", "strong", "sub", "sup", "table", "td", "th", "tr", "ul"
    };

    public static String[] CloseCssCmmds =
    {
        "end a", "end big", "end body", "end button", "end caption", "end center", "end comment", "end div",
        "end h1", "end h2", "end h3", "end h4", "end h5",  "end h6", "end li", "end ol", "end p", "end script",
        "end small", "end span", "end strong", "end sub", "end sup", "end table", "end td", "end th", "end tr",
        "end ul", "end hr"
    };

    public static String[] CssAtrributes =
    {
        "height", "width",  "color", "background-color", "display", "target"
    };

    public static String[] CssTextAttrib = 
    {
        "text-color", "font-family", "text-decoration", "font-szie", "text-align"
    };

    public static String[] CssMarginAttrib = 
    {
    };

    public static String[] CssPaddingAttrib =
    {
    };

    public static String[] CssBorderAttrib =
    {
        "border", "border-color", "border-radius","border-width",
        "border-bottom", "border-bottom-color", "border-bottom-width", "border-bottom-left-radius", "border-bottom-right-radius",
        "border-left", "border-left-color", "border-left-radius",
        "border-right", "border-right-color", "border-right-radius",
        "border-top", "border-top-color", "border-top-left-radius", "border-top-right-radius", "border-top-width"
    };

    //   equivalent CSS code
    public static String[] OpenCssEqual = { "" };

    public static String[] CloseCssEqual = { "" };
    
    /*
     *		Section 2.0
     * Validation methods below. 
     */
    public static boolean IsOpenCssCmmd(String inputCmmd)
    {

    	if(iEnvironment.GetMode() != "html") return false;
    	else
    	{
    		for(String loc: OpenCssCmmds)
        	{
        		if(loc==inputCmmd) return true;
        	}
    	}
    	return false;
    }
    public static boolean IsCloseCssCmmd(String inputCmmd)
    {

    	if(iEnvironment.GetMode() != "css") return false;
    	else
    	{
    		for(String loc: CloseCssCmmds)
        	{
        		if(loc==inputCmmd) return true;
        	}
    	}
    	return false;
    }
    
    //Check input against valid CSS attributes
    public static boolean IsCssAtribCmmd(String cssin)
    {
    	if(iEnvironment.GetMode() != "css") return false;
    	else
    	{
    		for(String loc: CssAtrributes)
        	{
        		if(loc==cssin) return true;
        	}
    	}
    	return false;
    }
    
    
}