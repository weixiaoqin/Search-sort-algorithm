package ½£Ö¸offer;

public class N9Ìæ»»¿Õ¸ñ  {
	
	    public String replaceSpace(StringBuffer str) {
	        String s = str.toString();
	      
	        StringBuffer sb = new StringBuffer();
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)==' ')
	                sb.append("%20");
	            else{
	                sb.append(s.charAt(i));
	            }      
	        }
	       return sb.toString();     
	    }
}
  

