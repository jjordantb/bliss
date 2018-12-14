import java.awt.*;

public class class654 extends class347 {
    public static Image field9352;
    static int field9346 = 4096;
    static boolean field9348 = false;
    static class111 field9350;
    static int field9351 = 0;
    int field9347 = 0;
    int field9349 = 4096;

    public class654() {
        super(1, false);
    }

    int[][] method204(int var1, byte var2) {
        try {
            int[][] var3 = super.field266.method162(var1, (byte) 37);
            if (super.field266.field211) {
                int[][] var4 = this.method206(0, var1, (byte) 8);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];

                for (int var11 = 0; var11 < class322.field831; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (var12 < this.field9347) {
                        var8[var11] = this.field9347;
                    } else if (var12 > this.field9349) {
                        var8[var11] = this.field9349;
                    } else {
                        var8[var11] = var12;
                    }

                    if (var13 < this.field9347) {
                        var9[var11] = this.field9347;
                    } else if (var13 > this.field9349) {
                        var9[var11] = this.field9349;
                    } else {
                        var9[var11] = var13;
                    }

                    if (var14 < this.field9347) {
                        var10[var11] = this.field9347;
                    } else if (var14 > this.field9349) {
                        var10[var11] = this.field9349;
                    } else {
                        var10[var11] = var14;
                    }
                }
            }

            return var3;
        } catch (RuntimeException var15) {
            throw class158.method3445(var15, "ahk.k(" + ')');
        }
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, 1756826230);
            if (super.field270.field6612) {
                int[] var4 = this.method201(0, var1, -1887337990);

                for (int var5 = 0; var5 < class322.field831; ++var5) {
                    int var6 = var4[var5];
                    if (var6 < this.field9347) {
                        var3[var5] = this.field9347;
                    } else if (var6 > this.field9349) {
                        var3[var5] = this.field9349;
                    } else {
                        var3[var5] = var6;
                    }
                }
            }

            return var3;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "ahk.i(" + ')');
        }
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            switch (var1) {
                case 0:
                    this.field9347 = var2.method6374();
                    break;
                case 1:
                    this.field9349 = var2.method6374();
                    break;
                case 2:
                    super.field268 = var2.method6371() == 1;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ahk.r(" + ')');
        }
    }
}
