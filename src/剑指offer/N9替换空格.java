package ��ָoffer;

public class N9�滻�ո�  {
	public String replaceSpace(StringBuffer str) {
		for(int i=0;i<str.length-1;i++) {
			char c=str.charAt(i);
			if(c==' ') {
				str.replace(i, i+1, "%20");
			}
			
		}
		return str.toString();
	}
  
}
  

