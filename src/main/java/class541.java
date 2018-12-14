import jaclib.memory.I;
import jaggl.OpenGL;

public abstract class class541 {
    static int field3956 = 34963;
    static int field3957 = 34962;
    static int[] field3962 = new int[1];
    int field3954;
    int field3955;
    int field3958;
    class13 field3959;
    boolean field3960;
    boolean field3961 = false;

    class541(class13 var1, int var2, I var3, int var4, boolean var5) {
        this.field3959 = var1;
        this.field3955 = var2;
        this.field3954 = var4;
        this.field3960 = var5;
        OpenGL.glGenBuffersARB(1, field3962, 0);
        this.field3958 = field3962[0];
        this.method2477();
        OpenGL.glBufferDataARBa(var2, this.field3954, var3.f(), this.field3960 ? '裠' : '裤');
        this.field3959.field6799 += this.field3954;
    }

    class541(class13 var1, int var2, byte[] var3, int var4, boolean var5) {
        this.field3959 = var1;
        this.field3955 = var2;
        this.field3954 = var4;
        this.field3960 = var5;
        OpenGL.glGenBuffersARB(1, field3962, 0);
        this.field3958 = field3962[0];
        this.method2477();
        OpenGL.glBufferDataARBub(var2, this.field3954, var3, 0, this.field3960 ? '裠' : '裤');
        this.field3959.field6799 += this.field3954;
    }

    abstract void method2477();

    void method2478(byte[] var1, int var2) {
        this.method2477();
        if (var2 > this.field3954) {
            OpenGL.glBufferDataARBub(this.field3955, var2, var1, 0, this.field3960 ? '裠' : '裤');
            this.field3959.field6799 += var2 - this.field3954;
            this.field3954 = var2;
        } else {
            OpenGL.glBufferSubDataARBub(this.field3955, 0, var2, var1, 0);
        }

    }
}
