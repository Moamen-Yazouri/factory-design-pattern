package controller;
import factory.NotificationFactory;
import model.INotification;
import view.ViewNotification;
public class NotificationController {
    private final NotificationFactory factory;
    private final ViewNotification view;
    public NotificationController() {
        this.factory = new NotificationFactory();
        this.view = new ViewNotification();
    }

    public void sendNotification (String type) {
        try {
           INotification notification = factory.createNotification(type);
           String message = notification.notifyUser();
           view.success(message);
        }
        catch(Error err) {
            view.failed(err.getMessage());
        }
    }
}
