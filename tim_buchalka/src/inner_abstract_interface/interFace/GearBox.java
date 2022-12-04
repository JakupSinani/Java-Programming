package inner_abstract_interface.interFace;

public class GearBox {
    private boolean clutchIsIn;

    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}
