package Strategy;

public class MergeSort implements Sorter{
	int[] m_arr = null;
	int[] m_tmp = null;
	
	@Override
	public int[] sort(int[] arr) {
		m_arr = rec_sort(arr);
//		System.arraycopy(arr, 0, m_arr, 0, arr.length);
//		
		return m_arr;
	}
	
	@Override
	public String toString() {
		return "Merge_Sort";
	}
	
	private int[] rec_sort(int[] a) {
		if (a.length <= 1)
			return a;
		int middle = a.length / 2; // 3,8 . middle = 3+(8-3)/2
		int left[] = new int[middle];
		System.arraycopy(a, 0, left, 0, left.length);
		left = rec_sort(left);
		int right[] = new int[a.length-middle];
		System.arraycopy(a, middle, right, 0, right.length);
		right = rec_sort(right);
		int[] merged = merge(left, right);
		return merged;
	}
	
	private int[] merge(int[]a, int[]b) {
		int i = 0; int j = 0; int p =0;
		int[] ans = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				ans[p] = a[i];
				i++;
			}
			else {
				ans[p] = b[j];
				j++;
			}
			p++;
		}
		if (i < a.length) {
			System.arraycopy(a, i, ans, p, a.length - i);
		}
		if (j < b.length) {
			System.arraycopy(b, j, ans, p, b.length - j);
		}
		return ans;
	}
	
}
