package adaptor;

public class Main {
    public static void main(String[] args) {
        Macbook macbook = new Macbook();     // C-type
        iPhone iPhone = new iPhone();        // 8-pin
        PortablePan pan = new PortablePan(); // useCable

        PortableCharger portableCharger = new PortableCharger();
        portableCharger.charge(pan);
        portableCharger.charge(new CtypeToUseAdaptor(macbook)); // adaptor로 C-type -> UseCable로

        // 8pin -> USB X
        // 8pin -> C type -> USB
        portableCharger.charge(new CtypeToUseAdaptor(new LighteningCableToCtype(iPhone)));

    }
}
