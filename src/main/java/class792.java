public abstract class class792 extends Node {
    public static class180 field510;

    static final void method439(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            if (var2 >= 1 && var2 <= 2) {
                class739.method1795(var2, -1, -1, false, 2079536098);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "v.aff(" + ')');
        }
    }

    public static void method440(Player var0, byte var1) {
        try {
            class206 var2 = (class206) class206.field7083.method2942((long) var0.field4028);
            if (var2 != null) {
                if (var2.field7090 != null) {
                    class56.field2321.method3875(var2.field7090);
                    var2.field7090 = null;
                }

                var2.method545(-1460969981);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "v.d(" + ')');
        }
    }

    static final void method441(class744 var0, int var1) {
        try {
            var0.field3159.method2559(var0.field3161[--var0.field3156], 449530626);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "v.aoi(" + ')');
        }
    }

    static void method442(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            int var7 = class972.method1776(var2, class381.field1414, class381.field1415, -1212608691);
            int var8 = class972.method1776(var3, class381.field1414, class381.field1415, -1212608691);
            int var9 = class972.method1776(var0, class381.field1416, class381.field1413, -1212608691);
            int var10 = class972.method1776(var1, class381.field1416, class381.field1413, -1212608691);
            int var11 = class972.method1776(var2 + var5, class381.field1414, class381.field1415, -1212608691);
            int var12 = class972.method1776(var3 - var5, class381.field1414, class381.field1415, -1212608691);

            int var13;
            for (var13 = var7; var13 < var11; ++var13) {
                class484.method4769(class381.field1412[var13], var9, var10, var4, 1527963052);
            }

            for (var13 = var8; var13 > var12; --var13) {
                class484.method4769(class381.field1412[var13], var9, var10, var4, 1517942288);
            }

            var13 = class972.method1776(var5 + var0, class381.field1416, class381.field1413, -1212608691);
            int var14 = class972.method1776(var1 - var5, class381.field1416, class381.field1413, -1212608691);

            for (int var15 = var11; var15 <= var12; ++var15) {
                int[] var16 = class381.field1412[var15];
                class484.method4769(var16, var9, var13, var4, 1913708715);
                class484.method4769(var16, var14, var10, var4, -1275020335);
            }

        } catch (RuntimeException var17) {
            throw class158.method3445(var17, "v.t(" + ')');
        }
    }

    static void method443(int var0) {
        try {
            class342.field288 = false;
            class881.method6172(287742148);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "v.p(" + ')');
        }
    }
}
