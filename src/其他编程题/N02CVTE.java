package 其他编程题;
import java.util.*;
public class N02CVTE{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            String [] s1=s.split(",");
            
            int sum=0;
            for(int i=0;i<s1.length;i++)
            {
                for(int j=i+1;j<s1.length;j++)
                {
                    if(Integer.parseInt(s1[i])>Integer.parseInt(s1[j])) sum++;
                }
                
            }
            System.out.println(sum);
        }
    }
}
