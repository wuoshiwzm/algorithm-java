//归并排序求小和： 小和：一个数组每个元素左侧小于它的数加起来
public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,3,4,4,5,1,2,6,8};
		
		int test = mergeSort(arr,0,10);
		System.out.println(test);
	}
	
	public static int mergeSort(int[] arr,int l,int r) {
		if(l==r) {
			return 0;
		}
		System.out.print("left->"+l+" vlaue  "+arr[l]+"");
		System.out.println("right->"+r+"  value  "+arr[r]+"\n");
		int mid =l+((r-l)>>1);// calculate middle position
		return mergeSort(arr,l,mid)
				+mergeSort(arr ,mid+1,r)
				+merge(arr,l,mid,r);
	}
	
	
	//合并并计算小和
	public static int merge(int[] arr, int l, int m, int r ) {
		int[] help = new int[r-l+1];
		int i=0;
		int p1=l;
		int p2 = m+1;
		int res =0;
		while(p1<=m && p2<=r) {
			res += arr[p1]<arr[p2]?(r-p2+1)*arr[p1]:0;
			help[i++] = arr[p2]<arr[p2]?arr[p1++]:arr[p2++];
		}
		while(p1<=m) {
			help[i++] = arr[p1++];
		}
		while(p2<=r){
			help[i++]=arr[p2++];
		}	
		for(i =0;i<help.length;i++) {
			arr[l+i] = help[i];
		}
		return res;
	}

}
