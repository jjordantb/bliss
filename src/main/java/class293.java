import java.util.Random;

public abstract class class293 {
    public static int[] field10447 = new int[4096];
    static int field10438 = 4095;
    static int field10440 = 12;
    static int field10444 = 4096;

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field10447[var0] = method6498(var0);
        }

    }

    short[] field10437 = new short[512];
    short[] field10439;
    int field10441 = 4;
    int field10442 = 0;
    int field10443 = 4;
    int field10445 = 4;
    int field10446 = 4;

    class293(int var1, int var2, int var3, int var4, int var5) {
        this.field10442 = var1;
        this.field10443 = var3;
        this.field10441 = var4;
        this.field10445 = var5;
        this.field10446 = var2;
        this.method6497();
        this.method6499();
    }

    static final int method6498(int var0) {
        int var1 = var0 * (var0 * var0 >> 12) >> 12;
        int var2 = var0 * 6 - '\uf000';
        int var3 = 'ꀀ' + (var2 * var0 >> 12);
        return var3 * var1 >> 12;
    }

    static int method6500(int var0, int var1, int var2, int var3) {
        int var4 = var0 & 15;
        int var5 = var4 < 8 ? var1 : var2;
        int var6 = var4 < 4 ? var2 : (var4 != 12 && var4 != 14 ? var3 : var1);
        return ((var4 & 1) == 0 ? var5 : -var5) + ((var4 & 2) == 0 ? var6 : -var6);
    }

    void method6493(int var1, int var2, int var3) {
        int[] var4 = new int[var1];
        int[] var5 = new int[var2];
        int[] var6 = new int[var3];

        int var7;
        for (var7 = 0; var7 < var1; ++var7) {
            var4[var7] = (var7 << 12) / var1;
        }

        for (var7 = 0; var7 < var2; ++var7) {
            var5[var7] = (var7 << 12) / var2;
        }

        for (var7 = 0; var7 < var3; ++var7) {
            var6[var7] = (var7 << 12) / var3;
        }

        this.method6494();

        for (var7 = 0; var7 < var3; ++var7) {
            for (int var8 = 0; var8 < var2; ++var8) {
                for (int var9 = 0; var9 < var1; ++var9) {
                    for (int var10 = 0; var10 < this.field10446; ++var10) {
                        int var11 = this.field10439[var10] << 12;
                        int var12 = this.field10443 * var11 >> 12;
                        int var13 = this.field10441 * var11 >> 12;
                        int var14 = this.field10445 * var11 >> 12;
                        int var15 = var4[var9] * var11 >> 12;
                        int var16 = var5[var8] * var11 >> 12;
                        int var17 = var6[var7] * var11 >> 12;
                        var15 *= this.field10443;
                        var16 *= this.field10441;
                        var17 *= this.field10445;
                        int var18 = var15 >> 12;
                        int var19 = var18 + 1;
                        var18 &= 255;
                        int var20 = var16 >> 12;
                        int var21 = var20 + 1;
                        var20 &= 255;
                        int var22 = var17 >> 12;
                        int var23 = var22 + 1;
                        var22 &= 255;
                        if (var19 >= var12) {
                            var19 = 0;
                        } else {
                            var19 &= 255;
                        }

                        if (var21 >= var13) {
                            var21 = 0;
                        } else {
                            var21 &= 255;
                        }

                        if (var23 >= var14) {
                            var23 = 0;
                        } else {
                            var23 &= 255;
                        }

                        var15 &= 4095;
                        var16 &= 4095;
                        var17 &= 4095;
                        int var24 = field10447[var15];
                        int var25 = field10447[var16];
                        int var26 = field10447[var17];
                        int var27 = var15 - 4096;
                        int var28 = var16 - 4096;
                        int var29 = var17 - 4096;
                        short var30 = this.field10437[var22];
                        short var31 = this.field10437[var23];
                        short var32 = this.field10437[var20 + var30];
                        short var33 = this.field10437[var21 + var30];
                        short var34 = this.field10437[var20 + var31];
                        short var35 = this.field10437[var21 + var31];
                        int var36 = method6500(this.field10437[var18 + var32], var15, var16, var17);
                        int var37 = method6500(this.field10437[var19 + var32], var27, var16, var17);
                        int var38 = var36 + (var24 * (var37 - var36) >> 12);
                        var36 = method6500(this.field10437[var18 + var33], var15, var28, var17);
                        var37 = method6500(this.field10437[var19 + var33], var27, var28, var17);
                        int var39 = var36 + (var24 * (var37 - var36) >> 12);
                        int var40 = var38 + (var25 * (var39 - var38) >> 12);
                        var36 = method6500(this.field10437[var18 + var34], var15, var16, var29);
                        var37 = method6500(this.field10437[var19 + var34], var27, var16, var29);
                        var38 = var36 + (var24 * (var37 - var36) >> 12);
                        var36 = method6500(this.field10437[var18 + var35], var15, var28, var29);
                        var37 = method6500(this.field10437[var19 + var35], var27, var28, var29);
                        var39 = var36 + (var24 * (var37 - var36) >> 12);
                        int var41 = var38 + (var25 * (var39 - var38) >> 12);
                        this.method6496(var10, var40 + (var26 * (var41 - var40) >> 12));
                    }

                    this.method6505();
                }
            }
        }

    }

    abstract void method6494();

    abstract void method6496(int var1, int var2);

    void method6497() {
        this.field10439 = new short[this.field10446];

        for (int var1 = 0; var1 < this.field10446; ++var1) {
            this.field10439[var1] = (short) ((int) Math.pow(2.0D, (double) var1));
        }

    }

    void method6499() {
        Random var1 = new Random((long) this.field10442);

        int var2;
        for (var2 = 0; var2 < 255; ++var2) {
            this.field10437[var2] = (short) var2;
        }

        for (var2 = 0; var2 < 255; ++var2) {
            int var3 = 255 - var2;
            int var4 = class977.method1813(var1, var3, (byte) -33);
            short var5 = this.field10437[var4];
            this.field10437[var4] = this.field10437[var3];
            this.field10437[var3] = this.field10437[var3 + 256] = var5;
        }

    }

    abstract void method6505();
}
