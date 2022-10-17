package adaptor;

public class PortablePan implements UseCable {
    @Override
    public String getConnectDeviceName() {
        return getClass().getSimpleName();
    }
}
