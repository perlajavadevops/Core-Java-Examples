
public class ArraysDemo1 {

	public static void main(String[] args) {
		int[] arr = new int[2];//creating array: declared the array with size
		arr[0] = 1;//initilization
		arr[1] = 3;//ASCII --65
		//arr[2] = 9;//
		System.out.println("array length is "+arr.length);
		//System.out.println(arr[1]);
		//System.out.println(arr[0]);
		System.out.println(arr[2]);
		
		for(int i = 0; i< arr.length; i++){  //++i --pre incrment ,i++ post increment ,--i preincremnt ,i-- postdecremnt
			System.out.println(arr[i]);//0
		}
		
		
		
	}
}
