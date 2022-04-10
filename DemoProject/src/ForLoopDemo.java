
public class ForLoopDemo {
	
	public static void main(String[] args) {
		/*System.out.println(1);
		System.out.println(2);
		*/
		//2 ;  2<10; 0=1
		//1*1=1,1*2=1
		//2
		/*int num =2; 
		for(int i = 0;i<10;i++ ){//20
			System.out.println(num+"*"+i+" = "+(num*i));//0 1 2
		}*/
		
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <=i; ++j) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}

}
/*1
 *1 2 
 *1 2 3
 *1 2 3 4
 * 
 * =================
 * 1 2 3 4
 * 1 2 3
 * 1 2 
 * 1 
 * 
 *====================
 *  *
 * * *
 * `*
 */


