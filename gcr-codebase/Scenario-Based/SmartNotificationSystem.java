public class SmartNotificationSystem {

    static class Notification {
        protected String recipientName;
        protected String message;

        Notification(String recipientName, String message) {
            this.recipientName = recipientName;
            this.message = message;
        }

        void sendNotification() {
            System.out.println("Sending generic notification to " + recipientName + ": " + message);
        }
    }

    static class EmailNotification extends Notification {
        EmailNotification(String recipientName, String message) {
            super(recipientName, message);
        }

        @Override
        void sendNotification() {
            System.out.println("[EMAIL] To: " + recipientName + " | Message: " + message);
        }
    }

    static class SMSNotification extends Notification {
        SMSNotification(String recipientName, String message) {
            super(recipientName, message);
        }

        @Override
        void sendNotification() {
            System.out.println("[SMS] To: " + recipientName + " | Message: " + message);
        }
    }

    static class PushNotification extends Notification {
        PushNotification(String recipientName, String message) {
            super(recipientName, message);
        }

        @Override
        void sendNotification() {
            System.out.println("[PUSH] To: " + recipientName + " | Message: " + message);
        }
    }

    static void dispatchAll(Notification[] notifications) {
        System.out.println("All sent notifications:");
        for (Notification notification : notifications) {
            notification.sendNotification();
        }
    }

    public static void main(String[] args) {
        Notification[] notifications = {
            new EmailNotification("Aarav", "Your invoice is ready."),
            new SMSNotification("Diya", "Your OTP is 6249."),
            new PushNotification("Kabir", "Flash sale starts now!")
        };

        dispatchAll(notifications);
    }
}
