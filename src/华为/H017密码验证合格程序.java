package ��Ϊ;
//����Ҫ��:
//1.���ȳ���8λ
//2.������Сд��ĸ.����.��������,����������������
//3.��������ͬ���ȳ�2���Ӵ��ظ�
//˵��:���ȳ���2���Ӵ�
//
//��������:
//һ�����鳤�ȳ���2���ӷ�����ÿ��ռһ��
//
//�������:
//�������Ҫ�������OK���������NG
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
public class H017������֤�ϸ���� {
	
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

	
	    // 1.���ȳ���8λ
	    public static boolean checkLength(String password){
	        if (password==null || password.length()<=8)//����С�ڵ���8��return false
	            return false;
	        else return true;//���ȴ���8,return true;
	    }
	    // 2.������Сд��ĸ.����.��������,����������������
	    public static boolean checkCharKinds(String password){
	        int Digit=0 , lowercase=0,uppercase=0,others=0;//�����ʶ��
	        char[] ch = password.toCharArray();//�������ַ���ת�����ַ�����
	        for (int i = 0; i < ch.length; i++) {//ֻѭ��һ�ξ������4���ж�
	            if (ch[i]>='0'&&ch[i]<='9') {//�����ַ�
	                Digit=1;
	                continue;//������һ��ѭ��
	            }
	            else if (ch[i]>='a'&&ch[i]<='z') {//Сд��ĸ
	                lowercase=1;
	                continue;
	            }
	            else if (ch[i]>='A'&&ch[i]<='Z') {//��д��ĸ
	                uppercase=1;
	                continue;
	            }
	            else {//�����ַ�
	                others=1;
	                continue;
	            }
	        }
	        int total = Digit+lowercase+uppercase+others;//�������������ַ�����
	        return total>=3 ? true : false;//r�������3�����ϵ��ַ����򷵻�true
	    }
	    
	    // 3.��������ͬ���ȳ�2���Ӵ��ظ����������г���>=3���Ӵ��ظ�
	    public static boolean checkCharRepeat(String password){
	        for(int i=0 ;i<password.length()-2 ;i++){//ѭ��ɨ�����봮
	            String substr1 =password.substring(i, i+3);//ÿ�ν�ȡǰ3���������ַ�����Ϊ���Աȵ��Ӵ�
	            if (password.substring(i+1).contains(substr1))//�ж������ȡ���ַ���substring(i+1)�Ƿ�����Ӵ�
	               return false;//��������ظ����ַ���������false
	        }
	        return true;
	    }
	    
	    
}
