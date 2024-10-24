package create.prototype.models;

// Doesn't support clone
public class General extends GameUnit {

    private String state = "idle";

    public void boostMoral() {
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General [state=" + state + "] @ " + this.getPosition();
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(General.class + " doesn't not support cloning");
    }

    @Override
    protected void onInitialize() {
        throw new UnsupportedOperationException(General.class + " doesn't not support onInitialize");
    }

}
