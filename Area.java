
import java.util.Scanner;
public class Area {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		double radius,side,length,breadth,area;
		final double pi=3.14;
		int i=0;
		String shape;
		System.out.println("Enter the shape circle,square or rectangle to "
				+ "find their area ");
		shape=s.nextLine();
		if(shape.equals("circle"))
			i=1;
		else if(shape.equalsIgnoreCase("rectangle"))
		i=2;
		else if(shape.equalsIgnoreCase("square"))
			i=3;
		else i=0;
		switch(i)
		{
		case 1:System.out.println("Enter the radius\n");
		       radius=s.nextInt();
		       area=pi*radius*radius;
		       System.out.println("Area of circle is "+area);
		       break;
		case 2:System.out.println("Enter the length\n");
	       length=s.nextInt();
	       System.out.println("Enter the breadth\n");
	       breadth=s.nextInt();
	       area=length*breadth;
	       System.out.println("Area of rectangle is "+area);
	       break;
		case 3:System.out.println("Enter the side of square\n");
	       side=s.nextInt();
	       area=side*side;
	       System.out.println("Area of square is "+area);
	       break;
	       default:System.out.println("Enter the valid figure");
	       break;
		}
	}
}