import jaggl.OpenGL;

public class class826 implements class288 {
    int field9038;
    class196 field9039;

    class826(class196 var1, int var2) {
        this.field9038 = var2;
        this.field9039 = var1;
    }

    public int method2344() {
        return this.field9039.method2845();
    }

    public void method6700(int var1) {
        OpenGL.glFramebufferTexture2DEXT(36160, var1, this.field9039.field3598, this.field9039.field3600, this.field9038);
    }

    public void method2755() {
    }

    public int method2343() {
        return this.field9039.method2861();
    }
}
