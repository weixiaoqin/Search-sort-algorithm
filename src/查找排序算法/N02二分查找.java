package ���������㷨;
//���ֲ�����һ�ֲ�ѯЧ�ʷǳ��ߵĲ����㷨���ֳ��۰���ҡ�[ǰ�᣺�����]
//�ŵ��ǱȽϴ����٣������ٶȿ죬ƽ�����ܺã�
//��ȱ����Ҫ������Ϊ������Ҳ���ɾ�����ѡ�
//��ˣ��۰���ҷ��������ڲ������䶯������Ƶ���������б�
/*public class N02���ֲ��� {//ѭ��ʵ��
  public int binarySearch(int a [],int key) {
	  if(a.length==0) return -1;
	  int low,high,mid;
	  low=0;
	  high=a.length-1;
	  
	  while(low<=high) {
		  mid=(low+high)/2;
		  if(a[mid]==key) {//����򷵻�mid
			  return mid;
		  }
		  else if(a[mid]<key) {//�ؼ�����Mid���ұߣ�
			  low=mid+1;
		  }
		  else { //�ؼ�����Mid�����
			  high=mid-1;
		  }
	  }
	  
	  return -1;
  }
}*/

public class N02���ֲ��� {//�ݹ�ʵ��
	  public int binarySearch(int a [],int key,int low,int high) {
		  if(a.length==0||low<high||a[low]>key||a[high]<key) return -1;
		   int mid=(low+high)/2;
			  
			  if(a[mid]==key) {//����򷵻�mid
				  return mid;
			  }
			  else if(a[mid]<key) {//�ؼ�����Mid���ұߣ�
				  return binarySearch(a,key,mid+1,high);
			  }
			  else { //�ؼ�����Mid�����
				  return binarySearch(a,key,low,mid-1);
			  }
		  
		  return -1;
	  }
	}
