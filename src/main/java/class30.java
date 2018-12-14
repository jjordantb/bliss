import jaggl.OpenGL;

public class class30 extends class9 {
    static float field5271 = 22.5F;
    static int field5272 = 12;
    static int field5273 = 36;
    static int field5275 = 96;
    static char field5276 = 0;
    static char field5277 = '\u0001';
    static int field5280 = 64;
    class169[] field5274;
    class41 field5278;
    boolean field5279;
    boolean field5281 = false;

    class30(class13 var1) {
        super(var1);
        if (var1.field6865) {
            this.field5279 = var1.field6852 < 3;
            int var2 = this.field5279 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;

            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = 2.0F * (float) var8 / 64.0F - 1.0F;
                    float var10 = 2.0F * (float) var7 / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + 1.0F + var10 * var10)));
                    var9 *= var11;
                    var10 *= var11;

                    for (int var12 = 0; var12 < 6; ++var12) {
                        float var13;
                        if (var12 == 0) {
                            var13 = -var9;
                        } else if (var12 == 1) {
                            var13 = var9;
                        } else if (var12 == 2) {
                            var13 = var10;
                        } else if (var12 == 3) {
                            var13 = -var10;
                        } else if (var12 == 4) {
                            var13 = -var11;
                        } else {
                            var13 = var11;
                        }

                        int var14;
                        int var15;
                        int var16;
                        if (var13 > 0.0F) {
                            var14 = (int) (Math.pow((double) var13, 96.0D) * (double) var2);
                            var15 = (int) (Math.pow((double) var13, 36.0D) * (double) var2);
                            var16 = (int) (Math.pow((double) var13, 12.0D) * (double) var2);
                        } else {
                            var16 = 0;
                            var15 = 0;
                            var14 = 0;
                        }

                        var4[var12][var6] = (byte) var14;
                        var5[var12][var6] = (byte) var15;
                        var3[var12][var6] = (byte) var16;
                    }

                    ++var6;
                }
            }

            this.field5274 = new class169[3];
            this.field5274[0] = new class169(super.field4965, class264.field8201, class482.field8399, 64, false, var4, class264.field8201);
            this.field5274[1] = new class169(super.field4965, class264.field8201, class482.field8399, 64, false, var5, class264.field8201);
            this.field5274[2] = new class169(super.field4965, class264.field8201, class482.field8399, 64, false, var3, class264.field8201);
            this.method3253();
        }

    }

    void method2999(int var1, int var2) {
        if (this.field5281) {
            super.field4965.method3638(1);
            super.field4965.method3639(this.field5274[var1 - 1]);
            super.field4965.method3638(0);
        }

    }

    boolean method2997() {
        return true;
    }

    void method3001(boolean var1) {
        if (this.field5278 != null && var1) {
            if (!this.field5279) {
                super.field4965.method3638(2);
                super.field4965.method3639(super.field4965.field6827);
                super.field4965.method3638(0);
            }

            this.field5278.method3055('\u0000');
            this.field5281 = true;
        } else {
            super.field4965.method3669(0, 34168, 770);
        }

    }

    void method3000() {
        if (this.field5281) {
            if (!this.field5279) {
                super.field4965.method3638(2);
                super.field4965.method3639((class203) null);
            }

            super.field4965.method3638(1);
            super.field4965.method3639((class203) null);
            super.field4965.method3638(0);
            this.field5278.method3055('\u0001');
            this.field5281 = false;
        } else {
            super.field4965.method3669(0, 5890, 770);
        }

        super.field4965.method3641(8448, 8448);
    }

    void method2996(class203 var1, int var2) {
        super.field4965.method3639(var1);
        super.field4965.method3626(var2);
    }

    void method3014(boolean var1) {
        super.field4965.method3641(8448, 7681);
    }

    void method3253() {
        this.field5278 = new class41(super.field4965, 2);
        this.field5278.method3056(0);
        super.field4965.method3638(1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field5279) {
            super.field4965.method3641(7681, 8448);
            super.field4965.method3642(0, 34168, 768);
            super.field4965.method3638(2);
            super.field4965.method3641(260, 7681);
            super.field4965.method3642(0, 34168, 768);
            super.field4965.method3642(1, 34168, 770);
            super.field4965.method3669(0, 34167, 770);
        } else {
            super.field4965.method3641(260, 7681);
            super.field4965.method3642(0, 5890, 770);
            super.field4965.method3669(0, 34167, 770);
        }

        super.field4965.method3638(0);
        this.field5278.method3054();
        this.field5278.method3056(1);
        super.field4965.method3638(1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field5279) {
            super.field4965.method3641(8448, 8448);
            super.field4965.method3642(0, 5890, 768);
            super.field4965.method3638(2);
            super.field4965.method3641(8448, 8448);
            super.field4965.method3642(0, 5890, 768);
            super.field4965.method3642(1, 34168, 768);
            super.field4965.method3669(0, 5890, 770);
        } else {
            super.field4965.method3641(8448, 8448);
            super.field4965.method3642(0, 5890, 768);
            super.field4965.method3669(0, 5890, 770);
        }

        super.field4965.method3638(0);
        this.field5278.method3054();
    }
}
