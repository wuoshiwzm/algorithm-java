
//堆排的算法
//堆中i的 左子节点 2*i+1  右子节点 2*i+2
//堆中i的父节点 (i-1)/2
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
	
	//创建大根堆
	public static void geneBigHeap() {
		
	}
	
	
	//创建小根堆
	

	
	
	/**
	 * 堆节点向上更新
	 * @param arr 堆数组
	 * @param index 要插入的点
	 */
	public static void heapInsert(int[] arr, int index) {
		
		//如杲节点大于父节点，就和父节点交换 并把目前index变成父节点
		while(arr[index]>arr[(index-1)/2]) {
			int fatherIndex = (index-1)/2;
			swap(arr,index,fatherIndex);
			index = fatherIndex;
		}

	}
	
	//堆的heepipy  下移
	public void heepify(int[] arr, int index, int size) {
		int left = index * 2 + 1;//index的左子节点
		while (left < size) {//遍历到左子节点是数组最后一位或超出为止
			//选择左右子节点中最大的一个
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
	

	
	//堆排序
	public static void heapSort() {
		 
	}
	
}
