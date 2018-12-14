public class class717 {
    public class717 field3462;
    public class717 field3463;

    static final void method2029(class744 var0, byte var1) {
        try {
            class452.method3868(-207102051);
            class602.field8663 = false;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "mo.afj(" + ')');
        }
    }

    static boolean method2030(int var0, int var1) {
        try {
            if (9 != var0 && var0 != 10 && var0 != 11 && var0 != 12 && var0 != 13 && 1003 != var0) {
                return var0 == 8;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "mo.bb(" + ')');
        }
    }

    static final void method2031(long var0) {
        try {
            try {
                Thread.sleep(var0);
            } catch (InterruptedException var3) {
                ;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "mo.f(" + ')');
        }
    }

    static void method2032(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        try {
            if (var0 == var2 && var3 == var1 && var6 == var4 && var5 == var7) {
                class388.method1188(var0, var1, var6, var7, var8, -984237460);
            } else {
                int var10 = var0;
                int var11 = var1;
                int var12 = 3 * var0;
                int var13 = 3 * var1;
                int var14 = 3 * var2;
                int var15 = var3 * 3;
                int var16 = 3 * var4;
                int var17 = var5 * 3;
                int var18 = var14 + (var6 - var16) - var0;
                int var19 = var15 + (var7 - var17) - var1;
                int var20 = var16 - var14 - var14 + var12;
                int var21 = var17 - var15 - var15 + var13;
                int var22 = var14 - var12;
                int var23 = var15 - var13;

                for (int var24 = 128; var24 <= 4096; var24 += 128) {
                    int var25 = var24 * var24 >> 12;
                    int var26 = var25 * var24 >> 12;
                    int var27 = var26 * var18;
                    int var28 = var19 * var26;
                    int var29 = var25 * var20;
                    int var30 = var25 * var21;
                    int var31 = var24 * var22;
                    int var32 = var23 * var24;
                    int var33 = (var31 + var29 + var27 >> 12) + var0;
                    int var34 = (var32 + var28 + var30 >> 12) + var1;
                    class388.method1188(var10, var11, var33, var34, var8, -1643060817);
                    var10 = var33;
                    var11 = var34;
                }
            }

        } catch (RuntimeException var35) {
            throw class158.method3445(var35, "mo.ax(" + ')');
        }
    }

    public void method2028(int var1) {
        try {
            if (this.field3463 != null) {
                this.field3463.field3462 = this.field3462;
                this.field3462.field3463 = this.field3463;
                this.field3462 = null;
                this.field3463 = null;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "mo.a(" + ')');
        }
    }
}
