package iHtml;

public class HtmlClass
{
    //------------------------------------------------------------------
    //                              Section 1.0
    //  HTML commands and their equivalent code segments.
    //------------------------------------------------------------------

    // 1.1-HTML Commands
    public static String[] OpenHtmlCmmds = { "a", "big", "body", "br", "button", "caption", "center", "comment", "div", "doctype html", "em",
                                 "form", "head", "html", "h1", "h2", "h3", "h4", "h5",  "h6", "img", "li", "link", "meta", "ol",
                                 "p", "script", "small", "span", "strong", "style", "sub", "sup", "table", "td", "th", "title",
                                "tr", "ul"
                             };
    public static String[] EndHtmlCmmds = {"end a", "end big", "end body", "end button", "end caption", "end center", "end comment", "end div", "end em",
                                 "end form", "end head", "end html", "end h1", "end h2", "end h3", "end h4", "end h5",  "end h6", "end li", "end ol",
                                 "end p", "end script", "end small", "end span", "end strong", "end style", "end sub", "end sup", "end table", "end td",
                                 "end th", "end title", "end tr", "end ul"
                                };

    // 1.2-HTML Equivalent
    public static String[] HtmlEqual = { "<a>", "<big>", "<body>", "<br />", "<button>", "<caption>", "<center>", "<!--", "<div>", "<!DOCTYPE html>\n", "<em>",
                                 "<form>", "<head>", "<html>", "<h1>", "<h2>", "<h3>", "<h4>", "<h5>", "<h6>", "<img />", "<li>", "<link />", "<meta />", "<ol>",
                                 "<p>", "<script>", "<small>", "<span>", "<strong>","<style>", "<sub>", "<sub>", "<table>", "<td>", "<th>", "<title>", "<tr>", "<ul>"
                             };
    public static String[] EndHtmlEqual = { "</a>", "</big>", "</body>", "</button>", "</caption>", "</center>", "-->", "</div>", "</em>", "</form>", "</head>", "</html>", "</h1>",
                                    "</h2>", "</h3>", "</h4>", "</h5>", "</h6>", "</li>", "</ol>", "</p>", "</script>", "</small>", "</span>", "</strong>", "</style>",
                                    "</sub>", "</sup>", "</table>", "</td>", "</th>", "</title>", "</tr>", "</ul>"
                                };

    public static String[] AttributeCmmd = { "href", "src", "target", "id", "class", "content", "rel", "type", "width", "height", "alt",
                                   "lang", "name", "scope", "rowspan", "colspan", "hreflang", "charset", "http-equiv", "abbr",
                                    "autoplay", "controls", "loop", "poster"};

    // Scan HTML Commands
    public static String AppendBeginningHtmlTo(StringBuilder allText, String inputCmmd)
    {
        for (int pos = 0; pos < OpenHtmlCmmds.length; pos++)
        {
            if (OpenHtmlCmmds[pos].equals(inputCmmd))
            {
                //for debugging purposes
                //  System.out.println(HtmlClass.HtmlEqual[pos] + " " + pos.ToString());
                //add the equivalent HTML command-interpreted for all text
                allText.append(HtmlEqual[pos]).append("\n");
            }
        }
        return "";
    }
 
    public static String AppendEndHtmlTo(StringBuilder allText, String inputCmmd)
    {
        for (int pos = 0; pos < EndHtmlCmmds.length; pos++)
        {
            if (EndHtmlCmmds[pos].equals(inputCmmd))
            {
                //for debugging purposes
                //System.out.println(EndHtmlEqual[pos]);
                //System.out.println(EndHtmlEqual[pos] + " " + String.valueOf(pos));

                //add the equivalent HTML command-interpreted for all text
                allText.append(EndHtmlEqual[pos]).append("\n");
            }
        }
        return "";
    }

    //check Html-mode input cmmds:
    public static boolean IsAttribCmmd(String input)
    {
    	if(iEnvironment.GetMode() != "html") return false;
    	else
    	{
    		for(String loc: AttributeCmmd)
        	{
        		if(loc==input) return true;
        	}
    	}
    	return false;
    }
    
    public static boolean IsOpenHtmlCmmd(String input)
    {
    	if(iEnvironment.GetMode() != "html") return false;
    	else
    	{
    		for(String loc: OpenHtmlCmmds)
        	{
        		if(loc==input) return true;
        	}
    	}
    	return false;
    }
    public static boolean IsCloseHtmlCmmd(String input)
    {
    	if(iEnvironment.GetMode() != "html") return false;
    	else
    	{
    		for(String loc: EndHtmlCmmds)
        	{
        		if(loc==input) return true;
        	}
    	}
    	return false;
    }
}