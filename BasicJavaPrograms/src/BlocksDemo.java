
public abstract class BlocksDemo {

	public BlocksDemo() {
		System.out.println("0-Argument Con");
	}
	
	{
		System.out.println("Non-static block");//Database Connect
	}
	static{
		System.out.println("Static Block");//JDBC
	}
	
	public void m(){//Concrete methods
		System.out.println("M method");
	}
	
	
	public abstract void n();
	
	
	
}

class Block extends BlocksDemo{
	
	@Override
	public void n() {
		System.out.println("N method implements");
	}
}

class Test{

	public static void main(String[] args) {
		System.out.println("Hi");
		
	   BlocksDemo bd1 = new Block();
		bd1.n();
	//	BlocksDemo bd2 = new BlocksDemo();
		//BlocksDemo bd3 = new BlocksDemo();
		//BlocksDemo bd4 = new BlocksDemo();
	}
}