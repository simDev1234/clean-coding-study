package adaptor;

public class Macbook implements CtypeCable{
    @Override
    public String getCtypeConnectDeviceName() {
        return getClass().getSimpleName();
    }
}
