import jaggl.OpenGL;

import java.awt.*;

public class class479 extends class749 {
    class13 field8256;
    Canvas field8257;
    OpenGL field8258;
    long field8259;
    int field8260;
    int field8261;
    boolean field8262;

    class479(class13 var1, Canvas var2) {
        this(var1, var2, var1.field6803.prepareSurface(var2));
    }

    class479(class13 var1, Canvas var2, long var3) {
        this.field8262 = false;
        this.field8256 = var1;
        this.field8257 = var2;
        this.field8258 = var1.field6803;
        this.field8259 = var3;
        this.method4659();
    }

    public int method2481() {
        return this.field8260;
    }

    boolean method2484() {
        if (this.field8262) {
            throw new IllegalStateException();
        } else {
            this.field8258.setSurface(this.field8259);
            this.field8256.method3608();
            return true;
        }
    }

    public int method2493() {
        return this.field8261;
    }

    void method2518(int var1, int var2) {
        if (this.field8262) {
            throw new IllegalStateException();
        } else {
            this.field8258.surfaceResized(this.field8259);
            this.method4659();
            if (this == this.field8256.method4800((short) 2050)) {
                this.field8256.method3640();
            }

        }
    }

    void method4659() {
        Dimension var1 = this.field8257.getSize();
        this.field8261 = var1.height;
        this.field8260 = var1.width;
    }

    public int method2516() {
        if (this.field8262) {
            throw new IllegalStateException();
        } else {
            this.field8258.swapBuffers(this.field8259);
            return 0;
        }
    }

    public int method2517(int var1, int var2) {
        return 0;
    }

    public void method2488() {
        if (this.field8262) {
            throw new IllegalStateException();
        } else {
            this.field8258.releaseSurface(this.field8257, this.field8259);
            this.field8262 = true;
        }
    }

    boolean method2482() {
        return true;
    }
}
