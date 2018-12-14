public class class85 extends class347 {
    public static class58 field1121;
    static boolean field1120 = false;

    public class85() {
        super(1, false);
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            if (var1 == 0) {
                super.field268 = var2.method6371() == 1;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ahc.r(" + ')');
        }
    }

    int[][] method204(int var1, byte var2) {
        try {
            int[][] var3 = super.field266.method162(var1, (byte) 45);
            if (super.field266.field211) {
                int[][] var4 = this.method206(0, var1, (byte) 8);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];

                for (int var11 = 0; var11 < class322.field831; ++var11) {
                    var8[var11] = 4096 - var5[var11];
                    var9[var11] = 4096 - var6[var11];
                    var10[var11] = 4096 - var7[var11];
                }
            }

            return var3;
        } catch (RuntimeException var12) {
            throw class158.method3445(var12, "ahc.k(" + ')');
        }
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, 1893218211);
            if (super.field270.field6612) {
                int[] var4 = this.method201(0, var1, -1887337990);

                for (int var5 = 0; var5 < class322.field831; ++var5) {
                    var3[var5] = 4096 - var4[var5];
                }
            }

            return var3;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ahc.i(" + ')');
        }
    }
}
