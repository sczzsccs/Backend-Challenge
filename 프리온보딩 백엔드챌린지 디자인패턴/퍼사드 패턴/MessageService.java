public class MessageService {
    private MessageSender sender;
    public MessageService(MessageSender messageSender) {
        this.sender = messageSender;
    }

    public void send(String message) {
        sender.send(message);
    }
}