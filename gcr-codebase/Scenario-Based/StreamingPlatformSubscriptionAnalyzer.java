public class StreamingPlatformSubscriptionAnalyzer {

    static class Subscription {
        protected String subscriberName;
        protected String subscriptionId;

        Subscription(String subscriberName, String subscriptionId) {
            this.subscriberName = subscriberName;
            this.subscriptionId = subscriptionId;
        }

        double calculateMonthlyCharge() {
            return 0.0;
        }
    }

    static class BasicPlan extends Subscription {
        BasicPlan(String subscriberName, String subscriptionId) {
            super(subscriberName, subscriptionId);
        }

        @Override
        double calculateMonthlyCharge() {
            return 199.0;
        }
    }

    static class PremiumPlan extends Subscription {
        PremiumPlan(String subscriberName, String subscriptionId) {
            super(subscriberName, subscriptionId);
        }

        @Override
        double calculateMonthlyCharge() {
            return 499.0;
        }
    }

    static class FamilyPlan extends Subscription {
        FamilyPlan(String subscriberName, String subscriptionId) {
            super(subscriberName, subscriptionId);
        }

        @Override
        double calculateMonthlyCharge() {
            return 799.0;
        }
    }

    static Subscription searchBySubscriptionId(Subscription[] subscriptions, String id) {
        for (Subscription subscription : subscriptions) {
            if (subscription.subscriptionId.equalsIgnoreCase(id)) {
                return subscription;
            }
        }
        return null;
    }

    static void displaySubscribersByStartingLetter(Subscription[] subscriptions, char letter) {
        System.out.println("Subscribers starting with '" + letter + "':");
        for (Subscription subscription : subscriptions) {
            if (!subscription.subscriberName.isEmpty() &&
                Character.toLowerCase(subscription.subscriberName.charAt(0)) == Character.toLowerCase(letter)) {
                System.out.println(subscription.subscriberName + " (" + subscription.subscriptionId + ")");
            }
        }
    }

    static double calculateTotalMonthlyRevenue(Subscription[] subscriptions) {
        double total = 0.0;
        for (Subscription subscription : subscriptions) {
            total += subscription.calculateMonthlyCharge();
        }
        return total;
    }

    static Subscription mostExpensiveSubscription(Subscription[] subscriptions) {
        if (subscriptions.length == 0) {
            return null;
        }

        Subscription mostExpensive = subscriptions[0];
        for (int i = 1; i < subscriptions.length; i++) {
            if (subscriptions[i].calculateMonthlyCharge() > mostExpensive.calculateMonthlyCharge()) {
                mostExpensive = subscriptions[i];
            }
        }
        return mostExpensive;
    }

    public static void main(String[] args) {
        Subscription[] subscriptions = {
            new BasicPlan("Aman", "SUB101"),
            new PremiumPlan("Bhavya", "SUB102"),
            new FamilyPlan("Ananya", "SUB103"),
            new PremiumPlan("Chetan", "SUB104")
        };

        Subscription found = searchBySubscriptionId(subscriptions, "SUB102");
        if (found != null) {
            System.out.println("Found subscription: " + found.subscriberName + " -> " + found.calculateMonthlyCharge());
        }

        displaySubscribersByStartingLetter(subscriptions, 'A');
        System.out.println("Total monthly revenue: " + calculateTotalMonthlyRevenue(subscriptions));

        Subscription costly = mostExpensiveSubscription(subscriptions);
        if (costly != null) {
            System.out.println("Most expensive plan holder: " + costly.subscriberName + " Charge: " + costly.calculateMonthlyCharge());
        }
    }
}
