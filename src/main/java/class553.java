public class class553 {
    public static class180 field518;
    public static int field519;
    static int field511 = 1;
    static int field512 = 4;
    static int field513 = 0;
    static int field514 = 3;
    static int field515 = 2;
    static int field516 = 6;
    static int field517 = 7;

    class553() throws Throwable {
        throw new Error();
    }

    static final void method450(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -1);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class180.method3287(var3, var4, var0, 1204631441);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kw.ni(" + ')');
        }
    }

    static final void method451(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            class471 var3 = class695.method3937(var2, (byte) -81);
            if (var3 != null) {
                var0.field3161[++var0.field3156 - 1] = var3.field3476;
                var0.field3157[++var0.field3158 - 1] = var3.field8237;
                class188 var4 = var3.method4615(-1575528470);
                var0.field3161[++var0.field3156 - 1] = var4.field5348;
                var0.field3157[++var0.field3158 - 1] = var4.field5347;
                var0.field3161[++var0.field3156 - 1] = var3.field3472;
                var0.field3161[++var0.field3156 - 1] = var3.field8238;
                var0.field3157[++var0.field3158 - 1] = var3.field8236;
            } else {
                var0.field3161[++var0.field3156 - 1] = -1;
                var0.field3157[++var0.field3158 - 1] = "";
                var0.field3161[++var0.field3156 - 1] = 0;
                var0.field3157[++var0.field3158 - 1] = "";
                var0.field3161[++var0.field3156 - 1] = 0;
                var0.field3161[++var0.field3156 - 1] = 0;
                var0.field3157[++var0.field3158 - 1] = "";
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kw.alq(" + ')');
        }
    }

    static final void method452(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9124.method1909(-391880689) ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kw.anw(" + ')');
        }
    }

    static final void method453(Widget var0, WidgetContainer var1, class744 var2, short var3) {
        try {
            var2.field3156 -= 3;
            int var4 = var2.field3161[var2.field3156];
            short var5 = (short) var2.field3161[1 + var2.field3156];
            short var6 = (short) var2.field3161[2 + var2.field3156];
            if (var4 >= 0 && var4 < 5) {
                var0.method830(var4, var5, var6, -1261920411);
                class814.method2932(var0, 1064187264);
                if (var0.field879 == -1 && !var1.closed) {
                    class933.method6289(var0.field867, var4, (byte) 1);
                }
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "kw.gy(" + ')');
        }
    }
}
