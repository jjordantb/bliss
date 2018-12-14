import jaggl.OpenGL;

import java.awt.*;

public class class825 extends class883 {

    OpenGL field9054;
    long field9055;
    int field9056;
    Canvas field9057;
    int field9058;

    class825(class608 var1, Canvas var2, long var3) {
        super(var1);
        this.field9057 = var2;
        this.field9054 = var1.field8612;
        this.field9055 = var3;
        this.method5370();
    }

    class825(class608 var1, Canvas var2) {
        this(var1, var2, var1.field8612.prepareSurface(var2));
    }

    public int method2493() {
        return this.field9058;
    }

    void method5370() {
        Dimension var1 = this.field9057.getSize();
        this.field9058 = var1.height;
        this.field9056 = var1.width;
    }

    public int method2517(int var1, int var2) {
        return 0;
    }

    boolean method2484() {
        return this.field9054.setSurface(this.field9055) && super.method2484();
    }

    boolean method2482() {
        return true;
    }

    public void method2488() {
        this.field9054.releaseSurface(this.field9057, this.field9055);
    }

    void method2518(int var1, int var2) {
        this.field9054.surfaceResized(this.field9055);
        this.method5370();
        super.method2518(var1, var2);
    }

    public int method2516() {
        this.field9054.swapBuffers(this.field9055);
        return 0;
    }

    public int method2481() {
        return this.field9056;
    }
}
