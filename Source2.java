import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Credentials {

	String userName;
	String password;
	
	public Credentials(String userName , String password) {
		this.userName=userName;
		this.password=password;
	}
}

class Implementation {
	public String passwordValidator(Credentials details) throws Exception {
		 String out="";
		try { 
		int upc=0;
          int loc=0;
          int dit=0;
          int chr=0;
         
          String pass = details.password;
          int length=pass.length();
          for(int i=0;i<length;i++){
              char ch = pass.charAt(i);
              if(Character.isUpperCase(ch)){
                  upc++;
              }else if(Character.isLowerCase(ch)){
                  loc++;
              }else if(Character.isDigit(ch)){
                  dit++;
              }else if(ch=='~'||ch=='`'||ch=='!'||ch=='@'||ch=='#'||ch=='$'
              ||ch=='%'
              ||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='-'||ch=='_'
              ||ch=='+'
              ||ch=='='||ch=='{'||ch=='}'||ch=='['||ch==']'||ch=='|'||ch==';'
              ||ch==':'||ch=='"'||ch=='<'||ch=='>'||ch==','||ch=='.'||ch=='?'){
            	  chr++;
              }
          }
          System.out.println(upc +"" +loc+""+dit+""+chr);
          System.out.println(length);
          int m=chr+loc+dit+chr;
          if(chr>=1 && upc>=1 && loc>=1 && dit >=1 && m>=8 && m<=40){
        	  out="valid password";
                }
          else if(length<8 && length<40){
              throw new LengthMismatchException("length of the password is not between 8 to 40");
          }else if(chr<1 || upc<1 || loc<1 || dit<1){
        	  throw new MissingCharacterException("password must contain at least one special one special character, at least one uppder case alphabet, at least one lower case alphabet, and at least one digit");
              
             
          }}catch(MissingCharacterException e) {
          	out=e.getMessage();
          //System.out.println("jj");
          	//System.out.println(out);
          	//System.out.println();
          }catch(LengthMismatchException es) {
        	  
          	out= es.getMessage();
          	//System.out.println("jj");
          	//System.out.println(out);
          	//System.out.println();
	}catch(Exception er) {
		out=er.getMessage();
	}
		//System.out.println(out);
		return out;
	    
	}
	
	public String signUp(Credentials details) {
      boolean flag=false; 
      String out="";
		try {
            	String output =passwordValidator(details);
            	 System.out.println(output);
            	if(output=="valid password") {
            		flag=true;
          //  		System.out.println("7");
            	    out="signup successfully";
    	}
            	}catch(MissingCharacterException e) {
            	out=e.getMessage();
            }catch(LengthMismatchException es) {
            	out= es.getMessage();
	}catch(Exception er) {
		out=er.getMessage();
	}
		 return out;


	}}

class  MissingCharacterException extends Exception {

	public MissingCharacterException(String message) {
		super(message);
	 
	}
	
	
}

class LengthMismatchException extends Exception {

	public LengthMismatchException(String message) {
		super(message);
		 
	}
	
}

public class Source2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
		Credentials c1 = new Credentials("bob", "Aarv@kkkk");
		 
		Credentials c2 = new Credentials("fredrick","Se@66");
		
		Implementation obj = new Implementation();
	//	try {
		System.out.println(obj.passwordValidator(c1));
		System.out.println(obj.signUp(c2));
		//}catch(Exception e) {
			//System.out.println(e.getMessage());
		//}
	}
}