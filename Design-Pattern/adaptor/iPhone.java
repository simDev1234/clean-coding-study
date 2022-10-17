package adaptor;

public class iPhone implements LighteningCable{
    @Override
    public String getLighteningConnectDeviceName() {
        return getClass().getSimpleName();
    }
}
