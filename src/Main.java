import controller.NotificationController;

public class Main {
//    public static void main(String[] args) {
//        ShapeFactory factory = new ShapeFactory();
//        IShape  shape1 = factory.getShape("circle");
//        IShape  shape2 = factory.getShape("rectangle");
//        shape1.draw();
//        shape2.draw();
//    }
    public static void main(String[] args) {
        NotificationController n1 = new NotificationController();
        n1.sendNotification("whatsapp");

        System.out.println("----------------------");

        NotificationController n2 = new NotificationController();
        n1.sendNotification("email");
        System.out.println("----------------------");

        NotificationController n3 = new NotificationController();
        n1.sendNotification("sms");

        System.out.println("----------------------");

        NotificationController n4 = new NotificationController();
        n1.sendNotification("instagram");
    }
}