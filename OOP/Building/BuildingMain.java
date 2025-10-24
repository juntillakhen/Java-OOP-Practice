package Building;

public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding resBuilding = new ResidentialBuilding(
            "123 Annex Street", 5, 2500.0, 20, 15000.0
        );

        CommercialBuilding comBuilding = new CommercialBuilding(
            "45 Business Ave", 10, 8000.0, 5000.0, 300.0
        );

        resBuilding.displayDetails();
        System.out.println("\n-------------------------------\n");
        comBuilding.displayDetails();
    }
}
