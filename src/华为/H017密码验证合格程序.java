package 华为;
//密码要求:
//1.长度超过8位
//2.包括大小写字母.数字.其它符号,以上四种至少三种
//3.不能有相同长度超2的子串重复
//说明:长度超过2的子串
//
//输入描述:
//一组或多组长度超过2的子符串。每组占一行
//
//输出描述:
//如果符合要求输出：OK，否则输出NG
//
//021Abc9000
//021Abc9Abc1
//021ABC9000
//021$bc9000
//
//OK
//NG
//NG
//OK
import java.util.Scanner;
public class H017密码验证合格程序 {
	
	public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLine()) {
            String psw = cin.nextLine();
            if (checkLength(psw)&&checkCharKinds(psw)&&checkCharRepeat(psw))
                System.out.println("OK");
            else
                System.out.println("NG");
        }
    }

	
	    // 1.长度超过8位
	    public static boolean checkLength(String password){
	        if (password==null || password.length()<=8)//长度小于等于8，return false
	            return false;
	        else return true;//长度大于8,return true;
	    }
	    // 2.包括大小写字母.数字.其它符号,以上四种至少三种
	    public static boolean checkCharKinds(String password){
	        int Digit=0 , lowercase=0,uppercase=0,others=0;//定义标识符
	        char[] ch = password.toCharArray();//把密码字符串转换成字符数组
	        for (int i = 0; i < ch.length; i++) {//只循环一次就能完成4个判断
	            if (ch[i]>='0'&&ch[i]<='9') {//数字字符
	                Digit=1;
	                continue;//继续下一个循环
	            }
	            else if (ch[i]>='a'&&ch[i]<='z') {//小写字母
	                lowercase=1;
	                continue;
	            }
	            else if (ch[i]>='A'&&ch[i]<='Z') {//大写字母
	                uppercase=1;
	                continue;
	            }
	            else {//其他字符
	                others=1;
	                continue;
	            }
	        }
	        int total = Digit+lowercase+uppercase+others;//计算所包含的字符种类
	        return total>=3 ? true : false;//r如果包含3种以上的字符，则返回true
	    }
	    
	    // 3.不能有相同长度超2的子串重复；即不能有长度>=3的子串重复
	    public static boolean checkCharRepeat(String password){
	        for(int i=0 ;i<password.length()-2 ;i++){//循环扫描密码串
	            String substr1 =password.substring(i, i+3);//每次截取前3个连续的字符，作为待对比的子串
	            if (password.substring(i+1).contains(substr1))//判断往后截取的字符串substring(i+1)是否包含子串
	               return false;//如果包含重复的字符串，返回false
	        }
	        return true;
	    }
	    
	    
}
