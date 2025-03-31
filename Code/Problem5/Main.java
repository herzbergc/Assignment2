public class Main {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.CreateNotification(NotificationChannelType.SMS)

        notification.send("Hello!");
    }
}