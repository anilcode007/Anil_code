
public class Cat {

	public static void main(String[] args) {
		System.out.println(Cat.isCatPlaying(true, 23));
	}
	
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if(summer!=true && temperature >= 25 && temperature <=35) {
			return true;
		}
		else if(summer==true && temperature >= 25 && temperature <=45) {
			return true;
		}
		return false;
	}
	
}
