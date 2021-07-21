
public class Duration {
	public static void main(String[] args) {
		getDurationString(120, 52);
		getDurationString((7200));
		

	}
   public static String getDurationString(int min, int sec) {
	  
	   if(min>=0 && sec<=59) {
		   int hrs=min/60;
		   int rmin=(min%60);
		   String i=hrs + "H" + rmin + "m" + sec + "s";
		   System.out.println(i);
		   return i;
	   
	   }else 
		   return "invalid value";
	   }
	   

public static String getDurationString(int seconds) {
	 if (seconds>=0) {
		 
	 }
	 }
}
