public class MainEntry3 {
    public static void main(String[] args) {
        MessageService emailService = new MessageService(new EmailSender());
        emailService.send("Hello via Email");

        MessageService smsService = new MessageService(new SMS_Sender());
        smsService.send("Hello via SMS");
    }
}