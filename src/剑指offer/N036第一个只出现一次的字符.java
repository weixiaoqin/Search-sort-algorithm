package 剑指offer;

//在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
//如果没有则返回 -1（需要区分大小写）.

//用key value的方法，对一次扫描字符串，key存储字符，value存储该字符出现的字数
//第二次，扫描字符串，判断哈希表中该字符的数字是否为1次
public class N036第一个只出现一次的字符 {
	public int FirstNotRepeatingChar(String str)
    {
    HashMap<Character, Integer> map=new HashMap<>();
    for(int i=0;i<str.length();i++) {
    	char c=str.charAt(i);
    		if(map.containsKey(c)) {
    			int t=map.get(c);
    			t++;
    			map.put(c, t);//次数累加
    		}
    		else map.put(c, 1);//之前没有存储的字符
   	}
    
    for(int i=0;i<str.length();i++) {
    	if(map.get(str.charAt(i))==1)
    		return i;
    }
    return -1;
   }
   
 }

    
