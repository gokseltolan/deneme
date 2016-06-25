public class Program
{
	public static void main(String[] args) 
	{
		int argCount = args.length;
		if(argCount == 2) 
		{
			String method = args[0];
			switch(method)
			{
			case "createCircle":
				Circle c = new Circle(Double.parseDouble(args[1]));
				System.out.println(" wıth radıus:" + c.getRadius());
				System.out.println(" wıth area:" + c.getArea());
				break;
			case "calculateArea":
				break;
			case "calculatePeri":
				break;
			default:
				System.out.println("The system did not find the method '" + method + "'");
				break;
				
			}
		}else
		{
			System.out.println("Are you sure you gave me ALL the information I need?");
		}
	}
}