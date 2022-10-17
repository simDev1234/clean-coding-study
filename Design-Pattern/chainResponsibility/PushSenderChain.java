package chainResponsibility;

public class PushSenderChain extends MessageSenderChain {
    @Override
    protected void execute(User user, MessageDetail messageDetail) {
        System.out.println("Push 메세지 전송");
    }
}
