package ��Ϊ;
//��Ŀ����
//������
//
//����һ��������������������ַ�������ʽ�������
//
//���򲻿��Ǹ���������������ֺ���0����������ʽҲ����0��������Ϊ100�������Ϊ001
//
// 
//
//��������:
//����һ��int����
//
//�������:
//������������ַ�������ʽ�������
public class H11���ֵߵ� {
	 public static void main(String [] args){
	        Scanner in=new Scanner(System.in);
	        
	        while(in.hasNextLine()){
	            String s=in.nextLine();
//	            char [] chars=s.toCharArray();
//	            for(int i=s.length()-1;i>=0;i--){
//	                System.out.print(s.charAt(i));
//	            }
	            for(int i=s.length()-1;i>=0;i--) {
	            	char c=s.charAt(i);
	            	System.out.print(c);
	            }
	        }
	    }
}


//import java.util.*;
//public class Main{
//    public static void main(String [] args){//�ַ�����ת
//        Scanner in=new Scanner(System.in);
//        
//        while(in.hasNextLine()){
//            String s=in.nextLine();
//            for(int i=s.length()-1;i>=0;i--){
//                System.out.print(s.charAt(i));
//            }
//        }
//    }
//}