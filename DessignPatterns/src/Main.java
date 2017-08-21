
import Strategy.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = new int[] {1,2,3,4,5,6};
//		int b[] = new int[a.length];
//		System.arraycopy(a, 0, b, 0, a.length);
//		a[0] = 430;
//		System.out.println(a[0]);
//		System.out.println(b[0]);
		
		int[] arr = new int[] {3, 1, 2, 7, 4, 0, 8 , 4};
		Sorter sorter = new MergeSort();
		MyArray myArr = new MyArray(arr, sorter);
		myArr.sortArray();
		myArr.printArray();
		
	}

}
