// Circle Class is super class of Cylinder class
public class Circle {
	public double radius;
	
	public Circle(){
		radius = 0;
	}
	public Circle(double radius){
		this.radius = radius;
	}
	public double radius(){
		return radius;
	}
	public double area(){
		return Math.PI * Math.pow(radius, 2);
	}
	public String toString(){
		return "Radius : " + radius;
	}
}
