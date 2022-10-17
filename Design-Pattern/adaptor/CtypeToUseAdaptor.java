package adaptor;

public class CtypeToUseAdaptor implements UseCable {

    private CtypeCable ctypeCable;

    public CtypeToUseAdaptor(CtypeCable ctypeCable) {
        this.ctypeCable = ctypeCable;
    }

    @Override
    public String getConnectDeviceName() {
        return ctypeCable.getCtypeConnectDeviceName();
    }
}
