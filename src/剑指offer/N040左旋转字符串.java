package ��ָoffer;

import java.util.Queue;

import javax.management.Query;

//��Ŀ����
//�����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
//����һ���������ַ�����S���������ѭ������Kλ������������
//���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
public class N040����ת�ַ��� {
    public String LeftRotateString(String str,int n) {
///        Queue<Character> s=new Query();
    	if(str.length()==0) return "";//Ҫ���жϿ��ַ��������
        StringBuilder s=new StringBuilder("");
        s.append(str.substring(n));//��ȡ��n��֮����ַ�
        s.append(str.substring(0,n));//��ȡǰ���n���ַ�
        return s.toString();
        
    }
}
