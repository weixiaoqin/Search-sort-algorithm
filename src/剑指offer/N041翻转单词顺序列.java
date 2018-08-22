package 剑指offer;
//例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
public class N041翻转单词顺序列{
  public String reverse(String str) {
	  if(str.trim().equals("")){//如果字符串为空格，去掉两边空格trim之后为空字符串
          return str;//返回空格字符串
      }
	  if(str.length()==0) return "";//如果字符串为空，返回空字符串
	  StringBuilder sb=new StringBuilder();
	  String [] s=str.split(" ");
	  for(int i=s.length-1;i>0;i--) {
		  sb.append(s[i]);
		  sb.append(" ");
	  }
	  sb.append(s[0]);
	  return sb.toString();
  }
}
