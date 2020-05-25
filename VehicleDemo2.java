class Vehicle2 {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon
}

public class VehicleDemo2 {
    public static void main(String[] args) {
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportscar = new Vehicle2();
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

        System.out.println("Minivan can carry " + minivan.passengers + " passengers" +
                " with a range of " + range1 + " Miles.");

        System.out.println("Sportscar can carry " + sportscar.passengers + " passengers" +
                " with a range of " + range2 + " Miles.");
    }


}
