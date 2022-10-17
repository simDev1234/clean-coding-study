package chainResponsibility;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        MessageSenderChain smsSenderChain = new SmsSenderChain();
        smsSenderChain.next(new PushSenderChain()).next(new EmailSenderChain());
//        MessageSenderChain pushSenderChain = new PushSenderChain();
//        MessageSenderChain emailSenderChain = new EmailSenderChain();

//        smsSenderChain.next(pushSenderChain).next(emailSenderChain);
//        smsSenderChain.setNext(pushSenderChain);
//        pushSenderChain.setNext(emailSenderChain);

        smsSenderChain.send(user, new MessageDetail());
    }
}
