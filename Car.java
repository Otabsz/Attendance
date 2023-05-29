package Attendace;

//Car class (subclass of Vehicle)
class Car extends Vehicle {
 private String tireType;

 public void drive() {
     System.out.println("Car is being driven.");
 }

 // Getter and Setter

 public String getTireType() {
     return tireType;
 }

 public void setTireType(String tireType) {
     this.tireType = tireType;
 }
}
