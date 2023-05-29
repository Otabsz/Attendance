package Attendace;

//Plane class (subclass of Vehicle)
class Plane extends Vehicle {
 private double wingspan;

 public void fly() {
     System.out.println("Plane is flying.");
 }

 // Getter and Setter

 public double getWingspan() {
     return wingspan;
 }

 public void setWingspan(double wingspan) {
     this.wingspan = wingspan;
 }
}

	
