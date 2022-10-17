package adaptor;

public class PortableCharger {
    public void charge(UseCable useCable){
        System.out.println("PortableCharager : " + useCable.getConnectDeviceName() +" USB 충전중");
    }
}
