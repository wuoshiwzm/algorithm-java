//快排 - 使用partition排序
public class quickSort {

	//
	public static void main(String[] args) {
		
		//int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
	
		//randomSort(arr,0,arr.length-1);
		sort(arr,0,arr.length-1);
	}

	//随机快排
	public static void randomSort(int[] arr, int left, int right) {
		
		for (int i : arr) {
			System.out.printf(i+  "/");
		}
		System.out.println();
		
		//把随机位置的数拿出来做为比较数，不用最后一位数
		swap(arr, left + (int) (Math.random() * (right - left + 1)), right);
		
		if(left>=right)  return;
		int[] firstSort = partition(arr, left, right, arr[right]);
 
		int less = firstSort[0];
		int more = firstSort[1];

		sort(arr,0,less);
		sort(arr,more-1,right);
	
		return ;
		
	}
	
	// 快速排序用partition方法
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

	// 国旗问题的算法
	public static int[] partition(int[] arr, int left, int right, int num) {

		int less = left - 1;
		int more = right + 1;
		int cur = left;

		while (cur < more) {
			// 小于给定数 交换
			if (num > arr[cur]) {
				swap(arr, cur++, ++less);
			}
			// 大于定数 交换
			else if (num < arr[cur]) {
				swap(arr, cur, --more);
			}
			// 等于定数
			else if (num == arr[cur]) {
				cur++;
			}
		}
	
		int[] res = {less,more};

		return res;
	}

	// 数组交换位置
	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		return arr;
	}

}
