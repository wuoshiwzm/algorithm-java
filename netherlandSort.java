//������������
public class netherlandSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] $arr1 = {1,2,6,8,9,54,3,23,0,3,2};
		int[] $arr = {9,9,9,10,9,3,3,3,1,1,1,1};
		int[] res = partition($arr,0,11,3);
			
			for(int a:res)
				System.out.print(a+"--");
		
	}
	
	//����������㷨
	public static int[] partition(int[] arr,int left, int right,int num) {

		int less = left -1;
		int more = right +1;
		int cur = left;
		
		while(cur<more) {
			//С�ڸ�����  ����
			if(num>arr[cur]) {
				swap(arr,cur++,++less);
			}
			//���ڶ��� ����
			else if(num<arr[cur]) {
				swap(arr,cur,--more);
			}
			//���ڶ���
			else if(num == arr[cur]) {
				cur++;
			}
		}	
		
		return arr;
	}
	
	//���齻��λ��
	public static int[] swap(int[] arr, int i,int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		return arr;
	}
	
	
	
	
	

}
