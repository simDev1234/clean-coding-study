package adaptor;

public class LighteningCableToCtype implements CtypeCable {

    private LighteningCable lighteningCable;
    public LighteningCableToCtype(LighteningCable lighteningCable) {
        this.lighteningCable = lighteningCable;
    }

    @Override
    public String getCtypeConnectDeviceName() {
        return lighteningCable.getLighteningConnectDeviceName();
    }
}
