abstract class Shape{
	double area;
	abstract void calArea();   //Abstract method
	void printArea(){                //concrete method
		System.out.println("Area is: "+area);
	}
}
class Circle extends Shape{
	double radius;
	Circle()                        //default constructor
	{}
	Circle(double radius){
		this.radius=radius;
	}
	void calArea(){                 // Overriding abstract method from parent 
		area=3.14 * radius * radius;
	}
}
class Rectangle extends Shape{
	double len;
	double br;
	Rectangle()                        //default constructor
	{}
	Rectangle(double len, double br){
		this.len=len;
		this.br=br;
	}
	void calArea(){                 // Overriding abstract method from parent 
		area=len * br;
	}
}
class Square extends Shape{
	double side;
	Square()                        //default constructor
	{}
	Square(double side){
		this.side=side;
	}
	void calArea(){                 // Overriding abstract method from parent 
		area=side * side;
	}
}
class AbstractDemo{
	public static void main(String args[]){
		Rectangle rect = new Rectangle(4.0,5.0);
		rect.calArea();
		rect.printArea();
		
		Circle c = new Circle(4);
		c.calArea();
		c.printArea();
		
		Square s = new Square(5);
		s.calArea();
	    s.printArea();
	}
}
/*
o/p:
Area is: 20.0
Area is: 50.24
Area is: 25.0
*/