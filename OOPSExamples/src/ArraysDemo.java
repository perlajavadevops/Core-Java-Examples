import java.util.Arrays;
import java.util.List;


public class ArraysDemo {

	public static void main(String[] args) {
		//int[] arr =  new int[5];//
		int arr[] =  new int[5];
		arr[0] = 90;
		arr[1] = 100;
		arr[2] = 200;
		arr[3] = 5;
		arr[4] = 60;
		
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("============================");
		
		Arrays.sort(arr);
		//List al = Arrays.asList(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//Collections
		//Convert arrays to collection objects(List)
	}
}
