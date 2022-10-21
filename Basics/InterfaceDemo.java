interface Shape{
	void area();
	double PI=3.14;
}
class Rectangle implements Shape{
	double len,br;
	Rectangle()                        //default constructor
	{}
	Rectangle(double len, double br){
		this.len=len;
		this.br=br;
	}
	public void area(){            // overriding area method from interface 
		double area=len * br;
		System.out.println("Area of Rectangle is: "+area);
	}	 
}
class Square implements Shape{
	double side;
	Square()                      	    //default constructor
	{}
	Square(double side){
		this.side=side;
	}
	public void area(){            // overriding area method from interface 
		double area=side * side;
		System.out.println("Area of Square is: "+area);
	} 
}
class Circle implements Shape{
	double radius;
	Circle()                         	    //default constructor
	{}
	Circle(double radius){
		this.radius=radius;
	}
	public void area(){            // overriding area method from interface 
		double area=PI* radius * radius;
		System.out.println("Area of Cirlce is: "+area);
	}
}

class InterfaceDemo{
	public static void main(String args[]){
		Rectangle rect = new Rectangle(4.0,5.0);
		rect.area();
		//rect.printArea();
		
		Circle c = new Circle(4);
		c.area();
		//c.printArea();
		
		Square s = new Square(5);
		s.area();
	   // s.printArea();
	}
}

/*
Area of Rectangle is: 20.0
Area of Cirlce is: 50.24
Area of Square is: 25.0
*/