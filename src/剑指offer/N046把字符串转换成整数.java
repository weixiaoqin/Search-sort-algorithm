package ��ָoffer;
//��Ŀ����
//��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�
//����string����������Ҫ��ʱ����0)��Ҫ����ʹ���ַ���ת�������Ŀ⺯����
//��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��

public class N046���ַ���ת�������� {
	 public int StrToInt(String str) {
	        if(str==null||str.length()==0) return 0;
	        char [] a=str.toCharArray();
	        
	       if(a[0]=='-') //����
	       {
	    	   int sum=0;
	    	   for(int i=1;i<a.length;i++) {
	    		   if(a[i]>'0'&&a[i]<'9') {
	    			   sum=sum*10+a[i]-'0';
	    		   }
	    		   else {
	    			   return 0;//���������ֵģ�����0
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
