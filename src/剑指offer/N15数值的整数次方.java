package 剑指offer;
//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
//考虑，底数=0；底数>0;底数<0 的情况；指数=0；指数>0;指数<0 的情况；
public class N15数值的整数次方 {
    public double Power(double base, int exponent) {
        if(base==0) return 0;
       
        if(exponent==0){
            return 1.0;
        }
        double count=base; 
        if(exponent>0) {
            for(int i=1;i<exponent;i++){
            count*=base;
            }
        }
       
      else {
          exponent=-exponent;
           for(int i=1;i<exponent;i++){
            count*=base;
        }
          count=1.0/count;
       }
       
        return count;
  }
}
