package model;

public class OtherNotifications implements INotification{
    private String type;
    public OtherNotifications(String type) {
        this.type = type;
    }
    public String notifyUser() {
        return " "+ this.type +" Notification Sent! ";
    }
}
