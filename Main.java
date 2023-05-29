package Attendace;

public class Main {

	 public static void main(String[] args) {
		// Creating instances of the classes
	        ToyotaVios toyotaVios = new ToyotaVios();
	        toyotaVios.setSpeed(120);
	        toyotaVios.setColor("Red");
	        toyotaVios.setPrice(25000.00);
	        toyotaVios.setTireType("Radial");
	        toyotaVios.drive();
	        toyotaVios.stop();
	        
	        System.out.println(" Speed: " + toyotaVios.getSpeed());
	        System.out.println(" Color: " + toyotaVios.getColor());
	        System.out.println(" Price: " + toyotaVios.getPrice());
	        System.out.println(" Tire Type: " + toyotaVios.getTireType());
	        
	        U2SpyPlane u2SpyPlane = new U2SpyPlane();
	        u2SpyPlane.setSpeed(500);
	        u2SpyPlane.setColor("Silver");
	        u2SpyPlane.setPrice(10000000.00);
	        u2SpyPlane.setWingspan(80.5);
	        u2SpyPlane.fly();
	        u2SpyPlane.stop();
	        
	        System.out.println(" Speed: " + u2SpyPlane.getSpeed());
	        System.out.println(" Color: " + u2SpyPlane.getColor());
	        System.out.println(" Price: " + u2SpyPlane.getPrice());
	        System.out.println(" Wingspan: " + u2SpyPlane.getWingspan());

	        FandangoYacht fandangoYacht = new FandangoYacht();
	        fandangoYacht.setSpeed(25);
	        fandangoYacht.setColor("White");
	        fandangoYacht.setPrice(500000.00);
	        fandangoYacht.setMainSailColor("Blue");
	        fandangoYacht.floatOnWater();
	        fandangoYacht.stop();
	        
	        System.out.println(" Speed: " + fandangoYacht.getSpeed());
	        System.out.println(" Color: " + fandangoYacht.getColor());
	        System.out.println(" Price: " + fandangoYacht.getPrice());
	        System.out.println(" Main Sail Color: " + fandangoYacht.getMainSailColor());
	    }
}