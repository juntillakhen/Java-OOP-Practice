package Building;

public class Building {
    protected String address;
    protected int numberOfFloors;
    protected double totalArea; 

    public Building(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    public void displayDetails() {
        System.out.println("Address: " + address);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Total Area: " + totalArea + " sqm");
    }
}

class ResidentialBuilding extends Building {
    private int numberOfApartments;
    private double rentPerApartment;

    public ResidentialBuilding(String address, int numberOfFloors, double totalArea, int numberOfApartments, double rentPerApartment) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    public void displayDetails() {
        System.out.println("Residential Building Details:");
        super.displayDetails();
        System.out.println("Number of Apartments: " + numberOfApartments);
        System.out.println("Rent per Apartment: ₱" + rentPerApartment);
        System.out.println("Total Rent: ₱" + calculateTotalRent());
    }
}

class CommercialBuilding extends Building {
    private double officeSpace; 
    private double rentPerSquareMeter;

    public CommercialBuilding(String address, int numberOfFloors, double totalArea, double officeSpace, double rentPerSquareMeter) {
        super(address, numberOfFloors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSquareMeter = rentPerSquareMeter;
    }

    public double calculateTotalRent() {
        return officeSpace * rentPerSquareMeter;
    }

    public void displayDetails() {
        System.out.println("Commercial Building Details:");
        super.displayDetails();
        System.out.println("Office Space: " + officeSpace + " sqm");
        System.out.println("Rent per Square Meter: ₱" + rentPerSquareMeter);
        System.out.println("Total Rent: ₱" + calculateTotalRent());
    }
}

