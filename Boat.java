package Attendace;

//Boat class (subclass of Vehicle)
class Boat extends Vehicle {
 private String mainSailColor;

 public void floatOnWater() {
     System.out.println("Boat is floating on water.");
 }

 // Getter and Setter

 public String getMainSailColor() {
     return mainSailColor;
 }

 public void setMainSailColor(String mainSailColor) {
     this.mainSailColor = mainSailColor;
 }
}
