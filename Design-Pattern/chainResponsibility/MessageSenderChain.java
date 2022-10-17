package chainResponsibility;

import java.util.Objects;

public abstract class MessageSenderChain {
    private MessageSenderChain next;

    public MessageSenderChain next(MessageSenderChain next) {
        this.next = next;
        return next;
    }

    public void send(User user, MessageDetail messageDetail) {
        // TODO
        execute(user, messageDetail);
        
        // next
        if (!Objects.nonNull(next)) {
            next.send(user, messageDetail);
        }
    }

    protected abstract void execute(User user, MessageDetail messageDetail);
}
