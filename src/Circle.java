public class Circle 
{
	private Double radius;
	
	
	public Circle(Double r)
	{
		this.radius = r;
		System.out.println("you created a circle.");
	}
	
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double r) {
		this.radius = r;
	}
	
	public Double getArea() 
	{
		Double area;
		area = 3.1415*this.radius*this.radius;
		return area;
	}
	
	public Double getPerimeter() 
	{
		Double p;
		p = 3.1415*this.radius*2;
		return p;
	}
	
}