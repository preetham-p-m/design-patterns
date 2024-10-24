package create.prototype;

import create.prototype.models.SwordsMan;
import javafx.geometry.Point3D;

public class PrototypeMain {
    public static void main(String[] args) throws Exception {
        SwordsMan swordsMan = new SwordsMan();
        swordsMan.move(new Point3D(-1, 0, 0), 5);
        swordsMan.attack();

        SwordsMan swordsMan2 = (SwordsMan) swordsMan.clone();

        System.out.println(swordsMan);
        System.out.println(swordsMan2);
    }
}
