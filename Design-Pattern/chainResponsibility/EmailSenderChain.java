package chainResponsibility;

public class EmailSenderChain extends MessageSenderChain {
    @Override
    protected void execute(User user, MessageDetail messageDetail) {
        System.out.println("이메일 전송");
    }
}
