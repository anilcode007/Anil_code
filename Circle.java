
public class Circle {
public static void main(String[] args) {
	area(2);
	sides((-3.5),(3.8));
}

public static double area(double radius) {
	if(radius>0) {
	double areaofcircle= 3.142 * radius * radius;
	System.out.println(areaofcircle);
	return areaofcircle;
} else 
	System.out.println("invalid value");
   return -1.0;
}
public static double sides(double x, double y) {
	if(x>0 && y>0) {
		double areaofrectangle= x*y;
		System.out.println(areaofrectangle);
		return areaofrectangle;
	} else
		System.out.println("invalid");
	return -1.0;
}
}