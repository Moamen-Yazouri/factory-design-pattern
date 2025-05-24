package factory;
import model.*;
public class NotificationFactory {
    public INotification createNotification(String type) {
        if (type == null) return null;

        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new WhatsappNotification();
            default -> new OtherNotifications(type);
        };
    }
}
