
public class BubbleSort {

	public static void main(String[] args) {
		int array[] = { 11, 43, 34, 13, 55, 15, 53 };
		BubbleSort b = new BubbleSort();
		b.bubbleSort(array);
	}

	public void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("Sorted Arrays!");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}
}
