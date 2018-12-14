import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class class224 extends class837 {
    static class188[] field7303;
    Image field7302;

    class224(class257 var1, Canvas var2, int var3, int var4) {
        super(var1, var2, var3, var4);
        new Rectangle();
        this.method5396(251162115);
    }

    public int method2516() {
        try {
            return this.method2517(0, 0);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "akh.v(" + ')');
        }
    }

    public void method2488() {
    }

    void method5396(int var1) {
        try {
            super.method5396(251162115);
            DataBufferInt var2 = new DataBufferInt(super.field9158, super.field9158.length);
            DirectColorModel var3 = new DirectColorModel(32, 16711680, 65280, 255);
            WritableRaster var4 = Raster.createWritableRaster(var3.createCompatibleSampleModel(super.field9156, super.field9157), var2, (Point) null);
            this.field7302 = new BufferedImage(var3, var4, false, new Hashtable());
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "akh.z(" + ')');
        }
    }

    public final int method2517(int var1, int var2) {
        try {
            Graphics var3 = super.field9154.getGraphics();
            var3.drawImage(this.field7302, var1, var2, super.field9154);
            return 0;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "akh.g(" + ')');
        }
    }
}
