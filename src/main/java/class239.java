import jaggl.OpenGL;

public class class239 extends class345 implements class430 {
    static int[] field8314 = new int[1];
    int field8311;
    int field8312;
    int field8313;
    class482 field8315;
    class264 field8316;
    int field8317;
    class13 field8318;

    class239(class13 var1, class264 var2, class482 var3, int var4, int var5, int var6) {
        this.field8318 = var1;
        this.field8313 = var4;
        this.field8312 = var5;
        this.field8316 = var2;
        this.field8315 = var3;
        OpenGL.glGenRenderbuffersEXT(1, field8314, 0);
        this.field8311 = field8314[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8311);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, var6, class13.method3657(this.field8316, this.field8315), this.field8313, this.field8312);
        this.field8317 = this.field8313 * this.field8312 * this.field8316.field8190 * this.field8315.field8406;
    }

    class239(class13 var1, class264 var2, class482 var3, int var4, int var5) {
        this.field8318 = var1;
        this.field8313 = var4;
        this.field8312 = var5;
        this.field8316 = var2;
        this.field8315 = var3;
        OpenGL.glGenRenderbuffersEXT(1, field8314, 0);
        this.field8311 = field8314[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8311);
        OpenGL.glRenderbufferStorageEXT(36161, class13.method3657(this.field8316, this.field8315), this.field8313, this.field8312);
        this.field8317 = this.field8313 * this.field8312 * this.field8316.field8190 * this.field8315.field8406;
    }

    public int method2344() {
        return this.field8312;
    }

    public int method2343() {
        return this.field8313;
    }

    public void method4232(int var1) {
        OpenGL.glFramebufferRenderbufferEXT(36160, var1, 36161, this.field8311);
    }

    public void method2755() {
        if (this.field8311 > 0) {
            int[] var1 = new int[]{this.field8311};
            OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
            this.field8311 = 0;
        }

    }
}
