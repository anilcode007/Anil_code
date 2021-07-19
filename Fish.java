package oops;

public class Fish extends Animal {
   private String name;
   private String fins;
   private String habitate;
public Fish(String name, String fins, String habitate) {
	super(name, 1, 1, 1, 1);
	this.name = name;
	this.fins = fins;
	this.habitate = habitate;
}
   
   public void gills() {
	   System.out.println("gills are necessity for underwater life");
   }
   
   public void move() {
	   System.out.println("with the help of fins it will swim");
   }
   
  
   public void swim(double speed) {
	   System.out.println("jellyfish move at speed of:" +speed +"kmph");
	   move();
   }
}
