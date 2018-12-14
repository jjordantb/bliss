import jaggl.OpenGL;

public abstract class class714 implements class659 {
    static int field3595 = 3553;
    static int field3596 = 34037;
    static int field3597 = 34067;
    static int field3604 = 0;
    static int field3606 = 32879;
    static int[] field3607 = new int[1];
    boolean field3594;
    int field3598;
    int field3599;
    int field3600;
    class566 field3601;
    class264 field3602;
    class482 field3603;
    class608 field3605;

    class714(class608 var1, int var2, class264 var3, class482 var4, int var5, boolean var6) {
        this.field3601 = class566.field624;
        this.field3605 = var1;
        this.field3598 = var2;
        this.field3602 = var3;
        this.field3603 = var4;
        this.field3594 = var6;
        this.field3599 = var5;
        OpenGL.glGenTextures(1, field3607, 0);
        this.field3600 = field3607[0];
        this.method2101();
        this.method2105(0);
    }

    public void method5703() {
        int var1 = this.field3605.method645();
        int var2 = this.field3605.field8617[var1];
        if (var2 != this.field3598) {
            if (var2 != 0) {
                OpenGL.glBindTexture(var2, 0);
                OpenGL.glDisable(var2);
            }

            OpenGL.glEnable(this.field3598);
            this.field3605.field8617[var1] = this.field3598;
        }

        OpenGL.glBindTexture(this.field3598, this.field3600);
    }

    public void method5694(class566 var1) {
        if (this.field3601 != var1) {
            this.field3601 = var1;
            this.method2101();
        }

    }

    void method2101() {
        this.field3605.method617(this);
        if (this.field3601 == class566.field624) {
            OpenGL.glTexParameteri(this.field3598, 10241, this.field3594 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3598, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3598, 10241, this.field3594 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3598, 10240, 9728);
        }

    }

    boolean method2102() {
        int var1 = this.method2106();
        this.field3605.method617(this);
        OpenGL.glGenerateMipmapEXT(this.field3598);
        this.field3594 = true;
        this.method2101();
        this.method2105(var1);
        return true;
    }

    void method2103(int var1, int var2, int var3, int[] var4) {
        if (var2 > 0 && !class51.method1530(var2, 2042466148)) {
            throw new IllegalArgumentException("");
        } else if (var3 > 0 && !class51.method1530(var3, 1957388461)) {
            throw new IllegalArgumentException("");
        } else if (this.field3602 != class264.field8191) {
            throw new IllegalArgumentException("");
        } else {
            int var5 = 0;
            int var6 = var2 < var3 ? var2 : var3;
            int var7 = var2 >> 1;
            int var8 = var3 >> 1;
            int[] var9 = var4;
            int[] var10 = new int[var7 * var8];

            while (true) {
                OpenGL.glTexImage2Di(var1, var5, class608.method5077(this.field3602, this.field3603), var2, var3, 0, 32993, this.field3605.field8627, var9, 0);
                if (var6 <= 1) {
                    return;
                }

                int var11 = 0;
                int var12 = 0;
                int var13 = var12 + var2;

                for (int var14 = 0; var14 < var8; ++var14) {
                    for (int var15 = 0; var15 < var7; ++var15) {
                        int var16 = var9[var12++];
                        int var17 = var9[var12++];
                        int var18 = var9[var13++];
                        int var19 = var9[var13++];
                        int var20 = var16 >> 24 & 255;
                        int var21 = var16 >> 16 & 255;
                        int var22 = var16 >> 8 & 255;
                        int var23 = var16 & 255;
                        var20 += var17 >> 24 & 255;
                        var21 += var17 >> 16 & 255;
                        var22 += var17 >> 8 & 255;
                        var23 += var17 & 255;
                        var20 += var18 >> 24 & 255;
                        var21 += var18 >> 16 & 255;
                        var22 += var18 >> 8 & 255;
                        var23 += var18 & 255;
                        var20 += var19 >> 24 & 255;
                        var21 += var19 >> 16 & 255;
                        var22 += var19 >> 8 & 255;
                        var23 += var19 & 255;
                        var10[var11++] = (var20 & 1020) << 22 | (var21 & 1020) << 14 | (var22 & 1020) << 6 | (var23 & 1020) >> 2;
                    }

                    var12 += var2;
                    var13 += var2;
                }

                int[] var24 = var10;
                var10 = var9;
                var9 = var24;
                var2 = var7;
                var3 = var8;
                var7 >>= 1;
                var8 >>= 1;
                var6 >>= 1;
                ++var5;
            }
        }
    }

    void method2104(int var1, int var2, int var3, float[] var4) {
        if (var2 > 0 && !class51.method1530(var2, 1815330854)) {
            throw new IllegalArgumentException("");
        } else if (var3 > 0 && !class51.method1530(var3, 1992937673)) {
            throw new IllegalArgumentException("");
        } else {
            int var5 = this.field3602.field8190;
            int var6 = 0;
            int var7 = var2 < var3 ? var2 : var3;
            int var8 = var2 >> 1;
            int var9 = var3 >> 1;
            float[] var10 = var4;
            float[] var11 = new float[var8 * var9 * var5];

            while (true) {
                OpenGL.glTexImage2Df(var1, var6, class608.method5077(this.field3602, this.field3603), var2, var3, 0, class608.method5076(this.field3602), 5126, var10, 0);
                if (var7 <= 1) {
                    return;
                }

                int var12 = var2 * var5;

                for (int var13 = 0; var13 < var5; ++var13) {
                    int var14 = var13;
                    int var15 = var13;
                    int var16 = var13 + var12;

                    for (int var17 = 0; var17 < var9; ++var17) {
                        for (int var18 = 0; var18 < var8; ++var18) {
                            float var19 = var10[var15];
                            var15 += var5;
                            var19 += var10[var15];
                            var15 += var5;
                            var19 += var10[var16];
                            var16 += var5;
                            var19 += var10[var16];
                            var16 += var5;
                            var11[var14] = var19 * 0.25F;
                            var14 += var5;
                        }

                        var15 += var12;
                        var16 += var12;
                    }
                }

                float[] var20 = var11;
                var11 = var10;
                var10 = var20;
                var2 = var8;
                var3 = var9;
                var8 >>= 1;
                var9 >>= 1;
                var7 >>= 1;
                ++var6;
            }
        }
    }

    void method2105(int var1) {
        this.field3605.field667 -= var1;
        this.field3605.field667 += this.method2106();
    }

    int method2106() {
        int var1 = this.field3602.field8190 * this.field3603.field8406 * this.field3599;
        return this.field3594 ? var1 * 4 / 3 : var1;
    }

    public void method5693() {
        if (this.field3600 > 0) {
            this.field3605.method5073(this.field3600, this.method2106());
            this.field3600 = 0;
        }

    }

    void method2107(int var1, int var2, int var3, byte[] var4) {
        if (var2 > 0 && !class51.method1530(var2, 1815267823)) {
            throw new IllegalArgumentException("");
        } else if (var3 > 0 && !class51.method1530(var3, 1849521842)) {
            throw new IllegalArgumentException("");
        } else {
            int var5 = this.field3602.field8190;
            int var6 = 0;
            int var7 = var2 < var3 ? var2 : var3;
            int var8 = var2 >> 1;
            int var9 = var3 >> 1;
            byte[] var10 = var4;
            byte[] var11 = new byte[var8 * var9 * var5];

            while (true) {
                OpenGL.glTexImage2Dub(var1, var6, class608.method5077(this.field3602, this.field3603), var2, var3, 0, class608.method5076(this.field3602), 5121, var10, 0);
                if (var7 <= 1) {
                    return;
                }

                int var12 = var2 * var5;

                for (int var13 = 0; var13 < var5; ++var13) {
                    int var14 = var13;
                    int var15 = var13;
                    int var16 = var13 + var12;

                    for (int var17 = 0; var17 < var9; ++var17) {
                        for (int var18 = 0; var18 < var8; ++var18) {
                            byte var19 = var10[var15];
                            var15 += var5;
                            int var21 = var19 + var10[var15];
                            var15 += var5;
                            var21 += var10[var16];
                            var16 += var5;
                            var21 += var10[var16];
                            var16 += var5;
                            var11[var14] = (byte) (var21 >> 2);
                            var14 += var5;
                        }

                        var15 += var12;
                        var16 += var12;
                    }
                }

                byte[] var20 = var11;
                var11 = var10;
                var10 = var20;
                var2 = var8;
                var3 = var9;
                var8 >>= 1;
                var9 >>= 1;
                var7 >>= 1;
                ++var6;
            }
        }
    }
}
