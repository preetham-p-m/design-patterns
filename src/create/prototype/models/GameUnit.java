package create.prototype.models;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        this.position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z) {
        this.position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        this.position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return this.position;
    }

    // #region Clone and its helpers

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit gameUnit = (GameUnit) super.clone();

        gameUnit.initialize();
        this.onInitialize();

        return gameUnit;
    }

    public void initialize() {
        this.position = Point3D.ZERO;
    }

    protected abstract void onInitialize();

    // #endregion
}
