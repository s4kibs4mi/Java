// Cylinder Class is inheriting Circle Class
public class Cylinder extends Circle{
	public double height;
	public Cylinder(){
		height = 0;
	}
	public Cylinder(double radius,double height){
		super.radius = radius;
		this.height = height;
	}
	public double volume(){
		return super.area() * height;
	}
	public double area(){
		return 2 * super.area() + 2 * Math.PI * radius * height;
	}
	public String toString(){
		return "Radius : " + radius + ", Height : " + height;
	}
}
