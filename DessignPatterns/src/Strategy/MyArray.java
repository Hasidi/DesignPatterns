package Strategy;


public class MyArray {
	
	int[] m_arr;
	Sorter m_sorter;
	
	public MyArray(int[] arr, Sorter sorter) {
		m_arr = new int[arr.length];
		System.arraycopy(arr, 0, m_arr, 0, arr.length);
		m_sorter = sorter;
	}
	
	public void setSorter(Sorter sorter) {
		m_sorter = sorter;
	}
	public Sorter getSorter() {
		return m_sorter;
	}
	
	public void sortArray() {
		System.out.println("sorting using the " + m_sorter.toString());
		m_arr = m_sorter.sort(m_arr);
	}
	public String printArray() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int a : m_arr) {
			sb.append(a+", ");
		}
		sb.delete(sb.length()-2, sb.length()).append("]");
		System.out.println(sb);
		return sb.toString();
	}
	
}
