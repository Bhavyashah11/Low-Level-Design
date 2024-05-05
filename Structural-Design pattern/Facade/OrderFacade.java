package Facade;

public class OrderFacade {
    ProductDAO productDAO;
    Payment payment;
    Invoice invoice;
    sendNotification notification;

    OrderFacade(){
        productDAO = new ProductDAO();
        payment = new Payment();
        invoice = new Invoice();
        notification = new sendNotification();
    }

    public void createOrder(){
        productDAO.getProduct(123);
        payment.makePayment();
        invoice.createInvoice();
        notification.sendNotifications();
    }
}
