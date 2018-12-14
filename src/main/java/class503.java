public class class503 {
    public static short[] field4103;
    static int field4098;
    static int field4099 = 100;
    static class506[] field4100 = new class506[100];
    static int field4101 = 0;
    static String field4102;

    class503() throws Throwable {
        throw new Error();
    }

    static final void method2581(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            class256 var4 = (class256) class730.field2823.method2942((long) var2);
            if (var4 != null && var4.field8101 == var3) {
                var0.field3161[++var0.field3156 - 1] = 1;
            } else {
                var0.field3161[++var0.field3156 - 1] = 0;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ej.sc(" + ')');
        }
    }

    static final void method2582(class744 var0, int var1) {
        try {
            var0.field3158 -= 2;
            String var2 = (String) var0.field3157[var0.field3158];
            String var3 = (String) var0.field3157[1 + var0.field3158];
            var0.field3156 -= 2;
            int var4 = var0.field3161[var0.field3156];
            int var5 = var0.field3161[var0.field3156 + 1];
            if (var3 == null) {
                var3 = "";
            }

            if (var3.length() > 80) {
                var3 = var3.substring(0, 80);
            }

            class684 var6 = class423.method5712((short) 512);
            class701 var7 = class637.method5936(class643.field10022, var6.field7765, (byte) 119);
            var7.field3364.method6361(class305.method372(var2, 824741758) + 2 + class305.method372(var3, 1825350693));
            var7.field3364.method6366(var2, 2106957480);
            var7.field3364.method6361(var4 - 1);
            var7.field3364.method6361(var5);
            var7.field3364.method6366(var3, 2102628417);
            var6.method4380(var7, (byte) -56);
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "ej.abn(" + ')');
        }
    }

    static final void method2583(class744 var0, int var1) {
        try {
            class615.field8903.method5391(class615.field8903.field9135, var0.field3161[--var0.field3156], -2044130238);
            class95.method523(656179282);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ej.aiu(" + ')');
        }
    }

    static final void method2584(class744 var0, short var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 78);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class752.method2642(var3, var4, var0, (short) 909);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ej.gn(" + ')');
        }
    }

    static final void method2585(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            var0.field3161[++var0.field3156 - 1] = var3.field1009;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ej.pq(" + ')');
        }
    }

    static final void method2586(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = var0.field3169.field9700[var2];
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ej.xa(" + ')');
        }
    }

    public static void method2587(boolean var0, short var1) {
        try {
            if (class730.field2705 != 2 && class730.field2705 != 3) {
                if (!var0) {
                    class304[] var2 = class949.field3325;

                    for (int var3 = 0; var3 < var2.length; ++var3) {
                        class304 var4 = var2[var3];
                        var4.method2384(-2077321818);
                    }
                }

                class730.field2705 = 2;
                class345.field210 = null;
                class665.field9597 = null;
                class730.field2706 = false;
                class59.method1617(1960223809);
                class701 var6 = class637.method5936(class643.field9948, class730.field2692.field7765, (byte) 30);
                var6.field3364.method6361(var0 ? 1 : 0);
                class730.field2692.method4380(var6, (byte) -61);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ej.i(" + ')');
        }
    }
}
