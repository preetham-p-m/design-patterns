package create.prototype.models;

// Supports Clone
public class SwordsMan extends GameUnit {
    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "SwordsMan [state=" + state + "] @ " + this.getPosition();
    }

    @Override
    protected void onInitialize() {
        this.state = "idle";
    }
}
