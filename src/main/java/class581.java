import java.awt.*;
import java.awt.image.BufferedImage;

public class class581 {
    Robot field166 = new Robot();

    public class581() throws Exception {
    }

    public void method144(Component var1, int[] var2, int var3, int var4, Point var5) {
        try {
            if (var2 != null) {
                BufferedImage var6 = new BufferedImage(var3, var4, 2);
                var6.setRGB(0, 0, var3, var4, var2, 0, var3);
                var1.setCursor(var1.getToolkit().createCustomCursor(var6, var5, (String) null));
            } else {
                var1.setCursor((Cursor) null);
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "mg.setcustomcursor(" + ')');
        }
    }
}
