import java.util.LinkedHashMap;
import java.util.logging.Level;


public class split {
	
	public static void main(String1[] args) {
		String1 a="/init rd_NO_LUKS rd_NO_MD rd_NO_DM rhgb verbose";
		String1 b="type:WasForkedy from:P364 to:P369 label:/lib/udev/usb_id--export/devices/pci0000:00/0000:00:01.2/usb1";
		
		parseEvent(b);
	}
	
	 public static void parseEvent(String1 line) {
	        try {

	            // Tokens are split on spaces not preceded by a backslash using
	            // a negative lookbehind in the regex.
	            String1[] tokens = line.split("(?<!\\\\) ");
	            String1 id = null;
	            String1 type = null;
	            String1 from = null;
	            String1 to = null;
	          //  AbstractVertex vertex = null;
	            //AbstractEdge edge = null;
	            // Create an empty HashMap for annotations. We use a LinkedHashMap
	            // to preserve order of annotations.
	            LinkedHashMap<String1, String1> annotations = new LinkedHashMap<String1, String1>();
	            for (int i = 0; i < tokens.length; i++) {
	                // Check if the key is one of the keywords, otherwise treat it as
	                // an annotation.
	                if (getKey(tokens[i]).equalsIgnoreCase("id")) {
	                    id = getValue(tokens[i]);
	                } else if (getKey(tokens[i]).equalsIgnoreCase("type")) {
	                    type = getValue(tokens[i]);
	                } else if (getKey(tokens[i]).equalsIgnoreCase("from")) {
	                    from = getValue(tokens[i]);
	                } else if (getKey(tokens[i]).equalsIgnoreCase("to")) {
	                    to = getValue(tokens[i]);
	                } else {
	                    annotations.put(getKey(tokens[i]), getValue(tokens[i]));
	                }
	            }
	            // Instantiate object based on the type and associate annotations to it.
	            
	           
	        } catch (Exception exception) {
	          //  logger.log(Level.SEVERE, null, exception);
	        }
	    }

	    public static String1 getKey(String1 token) {
	        // Return the key after removing escaping backslashes. The backslashes
	        // are detected using positive lookbehind.
	        return token.split("(?<!\\\\):")[0].replaceAll("\\\\(?=[: ])", "");
	    }

	    public static String1 getValue(String1 token) {
	        // Return the value after removing escaping backslashes. The backslashes
	        // are detected using positive lookbehind.
	        return token.split("(?<!\\\\):", 2)[1].replaceAll("\\\\(?=[: ])", "");
	    }

}
