public class class75 {
    static boolean field1493 = false;
    static int field1494;
    static int field1495;
    static int field1496;

    class75() throws Throwable {
        throw new Error();
    }

    public static void method1117(class180 var0, int var1, int var2, int var3, boolean var4, class272 var5, int var6) {
        try {
            class58.method1581(var0, var1, var2, var3, var4, -2042287938);
            class818.field4625 = var5;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "av.b(" + ')');
        }
    }

    static final void method1118(Widget var0, WidgetContainer var1, boolean var2, int var3, class744 var4, int var5) {
        try {
            var4.field3156 -= 2;
            int var6 = var4.field3161[var4.field3156];
            int var7 = var4.field3161[var4.field3156 + 1];
            if (-1 == var0.field879 && !var1.closed) {
                class284.method6687(var0.field867, 1388671560);
                class466.method4009(var0.field867, 106150101);
                class917.method6455(var0.field867, 2057190103);
            }

            if (-1 == var6) {
                var0.field909 = 1;
                var0.field876 = -1;
                var0.field1005 = -1;
            } else {
                var0.field1005 = var6;
                var0.field1006 = var7;
                var0.field938 = var2;
                ItemDefinition var8 = class85.field1121.method1566(var6);
                var0.field915 = var8.field4231;
                var0.field987 = var8.field4232;
                var0.field917 = var8.field4233;
                var0.field1022 = var8.field4234;
                var0.field973 = var8.field4235;
                var0.field1009 = var8.field4230;
                var0.field926 = var3;
                if (var0.field946 > 0) {
                    var0.field1009 = var0.field1009 * 32 / var0.field946;
                } else if (var0.field978 > 0) {
                    var0.field1009 = var0.field1009 * 32 / var0.field978;
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "av.hh(" + ')');
        }
    }

    static final void method1119(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -54);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class394.method3410(var3, var4, var0, -1611318497);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "av.iu(" + ')');
        }
    }

    static final void method1120(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            var0.field3161[++var0.field3156 - 1] = class848.field8597.method3399(var2, -1634888229).field7618[var3];
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "av.acy(" + ')');
        }
    }

    static final void method1121(class744 var0, int var1) {
        try {
            if (class182.field5317 == 2) {
                class182.field5314 = true;
            } else if (class182.field5317 == 1) {
                class182.field5315 = true;
            } else if (class182.field5317 == 3) {
                class182.field5316 = true;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "av.anf(" + ')');
        }
    }

    static void method1122(int var0) {
        try {
            class95.field595 = 0;
            class95.field596 = -1;
            class95.field601 = -1;
            class95.field593 = -1;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "av.a(" + ')');
        }
    }
}
