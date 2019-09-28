

public class car{
    private drivers[] drive; // creating an array 
    private int numOfDrivers; // keeping how many data points are in the array 
    private riders [] ride; 
    private int numbOfRiders;
    
    public car (int max){
        drive = new drivers [max]; 
        numOfDrivers = 0;
        ride = new riders [max];
        numbOfRiders = 0; 

    }
    public void insertRider (String firstName, String lastName, int age, String likes){
        ride[numbOfRiders] = new rider(firstName, lastName, age, likes);
        numbOfRiders++; 
    }
    public void insertDriver (String firstName, String lastName, int age, String likes){
        ride[numbOfRiders] = new driver(firstName, lastName, age, likes);
        numbOfRiders++; 
    }
}