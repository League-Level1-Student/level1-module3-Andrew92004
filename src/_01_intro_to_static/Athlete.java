package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber = 1;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;
   public String toString(){
	return name + " " + bibNumber + " ";
}
    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    	bibNumber = nextBibNumber++;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
 
    	Athlete one = new Athlete("Steven", 1);  
    	System.out.println(one.toString() + raceLocation);
    	Athlete two = new Athlete("Donald", 2);
    	System.out.println(two.toString()  + raceLocation);
    }
}