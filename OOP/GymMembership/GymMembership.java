package GymMembership;

public class GymMembership {
    protected String memberName;
    protected String membershipType;  
    protected int duration; 

    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public double calculateFees() {
        double monthlyRate;

        switch (membershipType.toLowerCase()) {
            case "basic":
                monthlyRate = 30.0;
                break;
            case "standard":
                monthlyRate = 50.0;
                break;
            default:
                monthlyRate = 40.0; 
        }

        return monthlyRate * duration;
    }

    public void checkSpecialOffers() {
        if (duration >= 12) {
            System.out.println("Special Offer: 10% discount for 12+ months membership!");
        } else {
            System.out.println("No special offers available for your membership.");
        }
    }

    public void displayMembershipDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Total Fee: $" + calculateFees());
    }
}

class PremiumMembership extends GymMembership {
    private boolean personalTrainerAvailable;
    private boolean spaAccess;

    public PremiumMembership(String memberName, int duration, boolean personalTrainerAvailable, boolean spaAccess) {
        super(memberName, "Premium", duration);
        this.personalTrainerAvailable = personalTrainerAvailable;
        this.spaAccess = spaAccess;
    }

    public double calculateFees() {
        double baseFee = 70.0 * duration; 
        if (personalTrainerAvailable) baseFee += 20.0 * duration; 
        if (spaAccess) baseFee += 15.0 * duration; 
        return baseFee;
    }

    public void checkSpecialOffers() {
        if (duration >= 6) {
            System.out.println("Premium Offer: Free personal training session for 6+ months membership!");
        } else {
            System.out.println("No special offers available for your premium membership.");
        }
    }

    public void displayMembershipDetails() {
        System.out.println("Premium Membership Details:");
        super.displayMembershipDetails();
        System.out.println("Personal Trainer Available: " + (personalTrainerAvailable ? "Yes" : "No"));
        System.out.println("Spa Access: " + (spaAccess ? "Yes" : "No"));
    }
}
