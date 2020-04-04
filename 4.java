//package nebula;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public static void main(String[] args) {

 
public class Nomor4{
	
   private Pattern pattern;
   private Matcher matcher;
 
   private static final String HEX_PATTERN = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
	        
   public Nomor2(){
	  pattern = Pattern.compile(HEX_PATTERN);
 
   }
   public boolean validate(final String hex){
		  
	  matcher = pattern.matcher(hex);
	  return matcher.matches();
	    	    
   }
}
