public class class359 {
    public static int field1869 = 5;
    public static int field1870 = 0;
    public static int field1871 = 1;
    public static int field1872 = 2;
    public static int field1873 = 6;

    class359() throws Throwable {
        throw new Error();
    }

    static void method1345(class848 var0, byte[][][] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, byte var12) {
        try {
            if (var9 != 0 && var2 != 0) {
                if (9 == var9) {
                    var9 = 1;
                    var10 = 1 + var10 & 3;
                }

                if (10 == var9) {
                    var9 = 1;
                    var10 = 3 + var10 & 3;
                }

                if (var9 == 11) {
                    var9 = 8;
                    var10 = var10 + 3 & 3;
                }

                var0.method4809(var3, var4, var7, var8, var5, var6, var1[var9 - 1][var10], var2, var11);
            }

        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "kn.a(" + ')');
        }
    }

    static void method1346(class344 var0, int var1) {
        try {
            class602.field8661.method269(var0);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kn.ab(" + ')');
        }
    }
}
