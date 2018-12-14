public class class355 extends class347 {
    int field2021 = 1365;
    int field2022 = 0;
    int field2023 = 0;
    int field2024 = 20;

    public class355() {
        super(0, true);
    }

    public static boolean method1414(int var0, int var1) {
        try {
            return var0 != 1 && 7 != var0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "aht.a(" + ')');
        }
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            switch (var1) {
                case 0:
                    this.field2021 = var2.method6374();
                    break;
                case 1:
                    this.field2024 = var2.method6374();
                    break;
                case 2:
                    this.field2023 = var2.method6374();
                    break;
                case 3:
                    this.field2022 = var2.method6374();
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "aht.r(" + ')');
        }
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, 1793310792);
            if (super.field270.field6612) {
                for (int var4 = 0; var4 < class322.field831; ++var4) {
                    int var5 = this.field2023 + (class322.field838[var4] << 12) / this.field2021;
                    int var6 = (class322.field836[var1] << 12) / this.field2021 + this.field2022;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;

                    int var13;
                    for (var13 = 0; var12 + var11 < 16384 && var13 < this.field2024; ++var13) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var11 - var12 + var7;
                        var11 = var9 * var9 >> 12;
                        var12 = var10 * var10 >> 12;
                    }

                    var3[var4] = var13 < this.field2024 - 1 ? (var13 << 12) / this.field2024 : 0;
                }
            }

            return var3;
        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "aht.i(" + ')');
        }
    }
}
