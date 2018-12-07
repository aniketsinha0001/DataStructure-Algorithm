import java.util.Scanner;

public class LinearSearch {

	public static void main(String... a) {
		int flag = 0;
		int array[] = { 11, 15, 2, 14, 55, 24 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element to Search!");
		try {
			int item = sc.nextInt();
			int i;
			for (i = 0; i < array.length; i++) {
				if (array[i] == item) {
					System.out.println("Item Found in Array at Index: " + i);
					flag = 1 + i;
					break;
				} else {
					flag = 0;
				}

			}
			if (flag != 0) {
				System.out.println(item + " Item Found at Index " + i);
			} else {
				System.out.println("Not Found!");
			}
		} catch (Exception e) {
			System.out.println("Please Enter Number Only!");
		}

	}
}
