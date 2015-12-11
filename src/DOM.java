import java.awt.*;
import java.util.Vector;

/**
 * Created by Sandy on 2015/12/9.
 */
public interface DOM {
    public void addVirtualCharacter(int clientNumber);
    public void addItem(String name, int index, boolean shared);
    public void updateVirtualCharacter(int clientNumber, int dir, int speed, int x, int y);
    public void updateItem(int index, boolean shared, int owner);
    public Vector getAllDynamicObjects();
    public Point getVirtualCharacterXY();
    public void keyGETPressed();
}
