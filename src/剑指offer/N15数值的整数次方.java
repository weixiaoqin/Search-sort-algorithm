package ��ָoffer;
//����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
//���ǣ�����=0������>0;����<0 �������ָ��=0��ָ��>0;ָ��<0 �������
public class N15��ֵ�������η� {
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
