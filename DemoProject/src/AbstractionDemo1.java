abstract class Shape {

	public int a = 90;//access modifiers
	abstract double area();

	//concrete method
	public void m(){
		System.out.println("m method of astract");
	}
	
	public Shape() {
		System.out.println("Abstract class constructor");
		
	}
	
}

//one abstract can extend another abstract class?
/*abstract class Shape1 extends Shape{
	
}*/

class Circle extends Shape{
	
	@Override
	double area() {
		return 2;
	}
}

class Rectangle extends Shape{
	@Override
	double area() {
		return 4;
	}
}

public class AbstractionDemo1 {

	public static void main(String[] args) {
		//Shape shape = new Shape();
		Shape shape = new Circle();
		System.out.println("Circle: "+shape.area());
		shape.m();
		System.out.println(shape.a);
		Shape shape1 = new Rectangle();
		System.out.println("Rectangle: "+shape1.area());
		
		//Rectangle rectangle = new Rectangle();//will it create object for super(base, parent) class? child(derived and sub class)
		
		
	}
}
