class Vehicle3 {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // Display the range
    void range() {
        System.out.println("Range is " + (fuelcap * mpg) + " Miles.");
    }
}

public class VehicleDemo3 {
    public static void main(String[] args) {
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportscar = new Vehicle3();
        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in minivan
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // compute the range assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.print("Minivan can carry " + minivan.passengers + " passengers. ");
        minivan.range();     // display range of minivan

        System.out.print("Sportscar can carry " + sportscar.passengers + " passengers. ");
        sportscar.range();   // display range of sportscar
    }


}
