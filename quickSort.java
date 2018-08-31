//���� - ʹ��partition����
public class quickSort {

	//
	public static void main(String[] args) {
		
		//int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
	
		//randomSort(arr,0,arr.length-1);
		sort(arr,0,arr.length-1);
	}

	//�������
	public static void randomSort(int[] arr, int left, int right) {
		
		for (int i : arr) {
			System.out.printf(i+  "/");
		}
		System.out.println();
		
		//�����λ�õ����ó�����Ϊ�Ƚ������������һλ��
		swap(arr, left + (int) (Math.random() * (right - left + 1)), right);
		
		if(left>=right)  return;
		int[] firstSort = partition(arr, left, right, arr[right]);
 
		int less = firstSort[0];
		int more = firstSort[1];

		sort(arr,0,less);
		sort(arr,more-1,right);
	
		return ;
		
	}
	
	// ����������partition����
	public static void sort(int[] arr, int left, int right) {
//		System.out.printf("left: "+left);
//		System.out.println("right"+right);
	
		for (int i : arr) {
			System.out.printf(i+  "/");
		}
		System.out.println();
		
		if(left>=right)  return;
		int[] firstSort = partition(arr, left, right, arr[right]);
 
		int less = firstSort[0];
		int more = firstSort[1];

		sort(arr,0,less);
		sort(arr,more-1,right);
	
		return ;
	}

	// ����������㷨
	public static int[] partition(int[] arr, int left, int right, int num) {

		int less = left - 1;
		int more = right + 1;
		int cur = left;

		while (cur < more) {
			// С�ڸ����� ����
			if (num > arr[cur]) {
				swap(arr, cur++, ++less);
			}
			// ���ڶ��� ����
			else if (num < arr[cur]) {
				swap(arr, cur, --more);
			}
			// ���ڶ���
			else if (num == arr[cur]) {
				cur++;
			}
		}
	
		int[] res = {less,more};

		return res;
	}

	// ���齻��λ��
	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		return arr;
	}

}
