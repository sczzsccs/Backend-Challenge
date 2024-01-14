public class SMS_Sender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("String SMS : " + message);
    }
}