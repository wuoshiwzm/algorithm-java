
//���ŵ��㷨
//����i�� ���ӽڵ� 2*i+1  ���ӽڵ� 2*i+2
//����i�ĸ��ڵ� (i-1)/2
public class heapSort extends tools{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] f = {5.70,5.91,6.40,6.80,7.05,8.90,8.70,9.00,9.05};
		
		double res = 0.0;
		for(int i =0;i<9;i++) {
			res += (f[i]-7.50)*(f[i]-7.50);
		}
		System.out.println(res);
	}
	
	//���������
	public static void geneBigHeap() {
		
	}
	
	
	//����С����
	

	
	
	/**
	 * �ѽڵ����ϸ���
	 * @param arr ������
	 * @param index Ҫ����ĵ�
	 */
	public static void heapInsert(int[] arr, int index) {
		
		//��꽽ڵ���ڸ��ڵ㣬�ͺ͸��ڵ㽻�� ����Ŀǰindex��ɸ��ڵ�
		while(arr[index]>arr[(index-1)/2]) {
			int fatherIndex = (index-1)/2;
			swap(arr,index,fatherIndex);
			index = fatherIndex;
		}

	}
	
	//�ѵ�heepipy  ����
	public void heepify(int[] arr, int index, int size) {
		int left = index * 2 + 1;//index�����ӽڵ�
		while (left < size) {//���������ӽڵ����������һλ�򳬳�Ϊֹ
			//ѡ�������ӽڵ�������һ��
			int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
			largest = arr[largest] > arr[index] ? largest : index;
			if (largest == index) {
				break;
			}
			swap(arr, largest, index);
			index = largest;
			left = index * 2 + 1;
		}
		
	}
	

	
	//������
	public static void heapSort() {
		 
	}
	
}
