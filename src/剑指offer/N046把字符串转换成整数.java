package 剑指offer;
//题目描述
//将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
//但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
//数值为0或者字符串不是一个合法的数值则返回0。

public class N046把字符串转换成整数 {
	 public int StrToInt(String str) {
	        if(str==null||str.length()==0) return 0;
	        char [] a=str.toCharArray();
	        
	       if(a[0]=='-') //负号
	       {
	    	   int sum=0;
	    	   for(int i=1;i<a.length;i++) {
	    		   if(a[i]>'0'&&a[i]<'9') {
	    			   sum=sum*10+a[i]-'0';
	    		   }
	    		   else {
	    			   return 0;//遇到非数字的，返回0
	    		   }
	    	   }
	    	   return -1*sum;
	       }
	       
	       if(a[0]=='+') 
	       {
	    	   int sum=0;
	    	    	   for(int i=1;i<a.length;i++)
	    	    	   {
	    	    		   if(a[i]>'0'&&a[i]<'9')
	    	    		   {
	    	    			   sum=sum*10+a[i]-'0';
	    	    		   }
	    	    		   else 
	    	    		   {
	    	    			   return 0;
	    	    		   }
	    	    	   }
	    	    	   return sum;
	       }
	       
	       if(a[0]>'0'&&a[0]<'9')
	       {
	    	   int sum=0;
	    	    	   for(int i=0;i<a.length;i++) {
	    	    		   if(a[i]>'0'&&a[i]<'9') {
	    	    			   sum=sum*10+a[i]-'0';
	    	    		   }
	    	    		   else {
	    	    			   return 0;
	    	    		   }
	    	    	   }
	    	    	   return sum;
	       }
	       else return 0;
	       
	    }
}
