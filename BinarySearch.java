import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int array[] = { 10, 20, 33, 50, 60, 72, 82 };
		int first = 0, last = array.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element to Search!");
		try{
		int item = sc.nextInt();
		
		BinarySearch b=new BinarySearch();
		int location=b.binarySearch(item, array, first, last);
		
		if(location!=-1){
			System.out.println("Item found At Location :"+location);
		}
		else{
			System.out.println("Not Found!");
		}

	}
		catch (Exception e) {
			System.out.println("Please Enter Number Only");
		}
	}
	public int binarySearch(int item, int a[], int first, int last) {
		int mid = (first + last) / 2;

		if (a[mid] == item) {

			System.out.println("Item Found at index: " + mid);

			return mid;
		} else if (a[mid] > item) {
			// last=mid-1;
			return binarySearch(item, a, first, mid - 1);
		} else if (a[mid] < item) {
			// first=mid+1;

			return binarySearch(item, a, mid + 1, last);
		}

		return -1;
	}

}
