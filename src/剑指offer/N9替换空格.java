package ��ָoffer;

//��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.
//�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
public class N9�滻�ո�  {
	
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
  


