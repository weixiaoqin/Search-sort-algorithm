package ��ָoffer;
//���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����
public class N041��ת����˳����{
  public String reverse(String str) {
	  if(str.trim().equals("")){//����ַ���Ϊ�ո�ȥ�����߿ո�trim֮��Ϊ���ַ���
          return str;//���ؿո��ַ���
      }
	  if(str.length()==0) return "";//����ַ���Ϊ�գ����ؿ��ַ���
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
