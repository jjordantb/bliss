import jaggl.OpenGL;

public class class594 implements class288 {
    class592 field2014;
    int field2015;

    class594(class592 var1, int var2) {
        this.field2015 = var2;
        this.field2014 = var1;
    }

    public void method6700(int var1) {
        OpenGL.glFramebufferTexture2DEXT(36160, var1, this.field2014.field3598, this.field2014.field3600, this.field2015);
    }

    public int method2343() {
        return this.field2014.method2861();
    }

    public int method2344() {
        return this.field2014.method2845();
    }

    public void method2755() {
    }
}
