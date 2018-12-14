import jaggl.OpenGL;

public class class939 extends class760 {
    static int field10317 = 16;
    int field10315;
    class608 field10316;
    int field10318;
    int field10319;
    int field10320;
    class288 field10321;
    int field10322;
    class288[] field10323 = new class288[4];

    class939(class608 var1) {
        super(var1);
        this.field10316 = var1;
        int[] var2 = new int[1];
        OpenGL.glGenFramebuffersEXT(1, var2, 0);
        this.field10320 = var2[0];
    }

    public boolean method2836() {
        int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    public int method2481() {
        return this.field10322;
    }

    public int method2493() {
        return this.field10319;
    }

    public void method2839(int var1, class813 var2) {
        int var3 = 1 << var1;
        class288 var4 = (class288) var2;
        if (var2 == null) {
            this.field10318 &= ~var3;
            this.field10323[var1] = null;
            if (this.field10318 == 0) {
                this.field10319 = 0;
                this.field10322 = 0;
            }
        } else {
            if (this.field10318 != 0) {
                if (this.field10322 != var4.method2343() || this.field10319 != var4.method2344()) {
                    throw new RuntimeException();
                }
            } else {
                this.field10319 = var4.method2344();
                this.field10322 = var4.method2343();
                this.method2803();
            }

            this.field10318 |= var3;
            this.field10323[var1] = var4;
        }

        if (this == this.field10316.method4800((short) -4810)) {
            this.method6282(var1);
        } else {
            this.field10315 |= var3;
        }

    }

    void method6281() {
        if (this.field10321 == null) {
            OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
        } else {
            this.field10321.method6700(36096);
        }

    }

    public void method2488() {
        if (this.field10320 != 0) {
            this.field10316.method5072(this.field10320);
            this.field10320 = 0;
        }

    }

    boolean method2484() {
        OpenGL.glBindFramebufferEXT(36160, this.field10320);

        for (int var1 = 0; var1 < 4; ++var1) {
            if ((this.field10315 & 1 << var1) != 0) {
                this.method6282(var1);
            }
        }

        if ((this.field10315 & 16) != 0) {
            this.method6281();
        }

        this.field10315 = 0;
        return super.method2484();
    }

    boolean method2482() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    void method6282(int var1) {
        class288 var2 = this.field10323[var1];
        if (var2 == null) {
            OpenGL.glFramebufferRenderbufferEXT(36160, '賠' + var1, 36161, 0);
        } else {
            var2.method6700('賠' + var1);
        }

    }

    public void method2834(class893 var1) {
        class288 var2 = (class288) var1;
        if (var1 == null) {
            this.field10318 &= -17;
            this.field10321 = null;
            if (this.field10318 == 0) {
                this.field10319 = 0;
                this.field10322 = 0;
            }
        } else {
            if (this.field10318 != 0) {
                if (this.field10322 != var2.method2343() || this.field10319 != var2.method2344()) {
                    throw new RuntimeException();
                }
            } else {
                this.field10319 = var2.method2344();
                this.field10322 = var2.method2343();
                this.method2803();
            }

            this.field10318 |= 16;
            this.field10321 = var2;
        }

        if (this == this.field10316.method4800((short) -4671)) {
            this.method6281();
        } else {
            this.field10315 |= 16;
        }

    }
}
