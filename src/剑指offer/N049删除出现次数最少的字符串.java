package 剑指offer;
//链接：https://www.nowcoder.com/questionTerminal/05182d328eb848dda7fdd5e029a56da9?orderByHotValue=1&page=6&onlyReference=false
//来源：牛客网
//
//实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。 
//
//输入描述:
//字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
//
//
//
//输出描述:
//删除字符串中出现次数最少的字符后的字符串。
//
//示例1
//输入
//abcdd
//输出
//dd
import java.util.*;
public class N049删除出现次数最少的字符串 {

		 public static void main(String[] args){
		        Scanner sc=new Scanner(System.in);
		        while(sc.hasNext()){
		             
		        String string=sc.nextLine();
		        char[] A=string.toCharArray();
		        Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		       
		         
		        for(char c:A){
		            if(!m.containsKey(c)){
		                 m.put(c,1);
		                 
		            }else{
		                m.put(c,m.get(c)+1);
		                
		            }     
		        }
		        Collection<Integer> al=m.values();
		        int index=Collections.min(al);
		      StringBuffer sb=new StringBuffer("");
		        for(char c:A){
		            if(m.get(c)!=index)
		                sb.append(c);
		        }
		             
		            System.out.print(sb.toString());
		             
		       }
		        
		    }
}
