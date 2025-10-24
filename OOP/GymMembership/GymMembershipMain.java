package GymMembership;

public class GymMembershipMain {
    public static void main(String[] args) {
        GymMembership basicMember = new GymMembership("Khen Juntilla", "Basic Training Exercise", 10);
        basicMember.displayMembershipDetails();
        basicMember.checkSpecialOffers();

        System.out.println("\n--------------------------\n");

        PremiumMembership premiumMember = new PremiumMembership("Brother Louie", 8, true, true);
        premiumMember.displayMembershipDetails();
        premiumMember.checkSpecialOffers();
    }
}
