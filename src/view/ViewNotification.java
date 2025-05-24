package view;

public class ViewNotification {
    public void success(String type) {
        System.out.println("✅ Notification of type [" + type + "] was sent successfully!");
    }
    public void failed(String message) {
        System.out.println("❌ Error: " + message);
    }
}
