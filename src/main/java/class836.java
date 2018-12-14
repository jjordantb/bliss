public class class836 extends class347 {
    static boolean field9181 = false;
    static int field9182 = 1;
    int field9179 = 1;
    int field9180 = 1;

    public class836() {
        super(1, false);
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, 936289557);
            if (super.field270.field6612) {
                int var4 = 1 + this.field9180 + this.field9180;
                int var5 = 65536 / var4;
                int var6 = 1 + this.field9179 + this.field9179;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];

                int var9;
                for (var9 = var1 - this.field9180; var9 <= this.field9180 + var1; ++var9) {
                    int[] var10 = this.method201(0, var9 & class322.field834, -1887337990);
                    int[] var11 = new int[class322.field831];
                    int var12 = 0;

                    int var13;
                    for (var13 = -this.field9179; var13 <= this.field9179; ++var13) {
                        var12 += var10[var13 & class322.field829];
                    }

                    for (var13 = 0; var13 < class322.field831; var12 += var10[var13 + this.field9179 & class322.field829]) {
                        var11[var13] = var7 * var12 >> 16;
                        var12 -= var10[var13 - this.field9179 & class322.field829];
                        ++var13;
                    }

                    var8[this.field9180 + var9 - var1] = var11;
                }

                for (var9 = 0; var9 < class322.field831; ++var9) {
                    int var15 = 0;

                    for (int var16 = 0; var16 < var4; ++var16) {
                        var15 += var8[var16][var9];
                    }

                    var3[var9] = var15 * var5 >> 16;
                }
            }

            return var3;
        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "ahq.i(" + ')');
        }
    }

    int[][] method204(int var1, byte var2) {
        try {
            int[][] var3 = super.field266.method162(var1, (byte) 5);
            if (super.field266.field211) {
                int var4 = this.field9180 + this.field9180 + 1;
                int var5 = 65536 / var4;
                int var6 = 1 + this.field9179 + this.field9179;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];

                int var12;
                int var13;
                int var14;
                for (int var9 = var1 - this.field9180; var9 <= this.field9180 + var1; ++var9) {
                    int[][] var10 = this.method206(0, var9 & class322.field834, (byte) 8);
                    int[][] var11 = new int[3][class322.field831];
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    int[] var15 = var10[0];
                    int[] var16 = var10[1];
                    int[] var17 = var10[2];

                    for (int var18 = -this.field9179; var18 <= this.field9179; ++var18) {
                        int var19 = var18 & class322.field829;
                        var12 += var15[var19];
                        var13 += var16[var19];
                        var14 += var17[var19];
                    }

                    int[] var30 = var11[0];
                    int[] var31 = var11[1];
                    int[] var20 = var11[2];

                    int var22;
                    for (int var21 = 0; var21 < class322.field831; var14 += var17[var22]) {
                        var30[var21] = var12 * var7 >> 16;
                        var31[var21] = var7 * var13 >> 16;
                        var20[var21] = var7 * var14 >> 16;
                        var22 = var21 - this.field9179 & class322.field829;
                        var12 -= var15[var22];
                        var13 -= var16[var22];
                        var14 -= var17[var22];
                        ++var21;
                        var22 = var21 + this.field9179 & class322.field829;
                        var12 += var15[var22];
                        var13 += var16[var22];
                    }

                    var8[this.field9180 + var9 - var1] = var11;
                }

                int[] var24 = var3[0];
                int[] var25 = var3[1];
                int[] var26 = var3[2];

                for (var12 = 0; var12 < class322.field831; ++var12) {
                    var13 = 0;
                    var14 = 0;
                    int var27 = 0;

                    for (int var28 = 0; var28 < var4; ++var28) {
                        int[][] var29 = var8[var28];
                        var13 += var29[0][var12];
                        var14 += var29[1][var12];
                        var27 += var29[2][var12];
                    }

                    var24[var12] = var5 * var13 >> 16;
                    var25[var12] = var5 * var14 >> 16;
                    var26[var12] = var5 * var27 >> 16;
                }
            }

            return var3;
        } catch (RuntimeException var23) {
            throw class158.method3445(var23, "ahq.k(" + ')');
        }
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            switch (var1) {
                case 0:
                    this.field9179 = var2.method6371();
                    break;
                case 1:
                    this.field9180 = var2.method6371();
                    break;
                case 2:
                    super.field268 = var2.method6371() == 1;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ahq.r(" + ')');
        }
    }
}
