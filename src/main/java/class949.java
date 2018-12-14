public class class949 {
    public static NodeTable field3321 = new NodeTable(32);
    public static class283[] field3322;
    public static class415 field3324 = new class386();
    public static class304[] field3325;
    public static class373 field3327 = new class373();
    static short field3320;
    static class278[] field3323;
    static class22[] field3326;
    static int field3328 = 0;
    static int field3329 = 0;
    static boolean field3330 = false;
    static int field3331 = 1;
    static int field3332 = -1;
    static class456[] field3333;

    class949() throws Throwable {
        throw new Error();
    }

    static final void method1953(class744 var0, int var1) {
        try {
            String var2 = (String) var0.field3157[--var0.field3158];
            var0.field3156 -= 3;
            int var3 = var0.field3161[var0.field3156];
            int var4 = var0.field3161[var0.field3156 + 1];
            int var5 = var0.field3161[2 + var0.field3156];
            Animator.method2802(var2, var3 == 1, var4, var5, -671916771);
            var0.field3161[++var0.field3156 - 1] = class198.field7051;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "dn.abj(" + ')');
        }
    }

    static final void method1954(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -37);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class499.method4475(var3, var4, var0, -1818514022);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "dn.nx(" + ')');
        }
    }

    public static int method1955(int var0, int var1) {
        try {
            int var2 = 0;
            if (var0 < 0 || var0 >= 65536) {
                var0 >>>= 16;
                var2 += 16;
            }

            if (var0 >= 256) {
                var0 >>>= 8;
                var2 += 8;
            }

            if (var0 >= 16) {
                var0 >>>= 4;
                var2 += 4;
            }

            if (var0 >= 4) {
                var0 >>>= 2;
                var2 += 2;
            }

            if (var0 >= 1) {
                var0 >>>= 1;
                ++var2;
            }

            return var0 + var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "dn.d(" + ')');
        }
    }

    static void method1956(Widget var0, int var1, int var2, int var3) {
        try {
            if (class730.field2817) {
                class785 var4 = class354.field2139 != -1 ? class452.field7216.method5148(class354.field2139, -1080440130) : null;
                if (class730.method1761(var0).method1740(1299208806) && (Node.field645 & 32) != 0 && (var4 == null || var0.method827(class354.field2139, var4.field3822, -659898667) != var4.field3822)) {
                    class984.method1875(class730.field2820, class730.field2735 + " " + class822.field9048 + " " + var0.field953, class175.field5075, 58, var0.field1005, 0L, var0.field879, var0.field867, true, false, (long) (var0.field879 << 32 | var0.field867), false, -1876457786);
                }
            }

            for (int var8 = 9; var8 >= 5; --var8) {
                String var5 = class590.method1223(var0, var8, (byte) 123);
                if (var5 != null) {
                    class984.method1875(var5, var0.field953, class874.method5857(var0, var8, -1663637577), 1007, var0.field1005, (long) (1 + var8), var0.field879, var0.field867, true, false, (long) (var0.field879 << 32 | var0.field867), false, -1971978132);
                }
            }

            String var9 = class622.method5341(var0, -1338609331);
            if (var9 != null) {
                class984.method1875(var9, var0.field953, var0.field957, 25, var0.field1005, 0L, var0.field879, var0.field867, true, false, (long) (var0.field879 << 32 | var0.field867), false, -1797794884);
            }

            for (int var10 = 4; var10 >= 0; --var10) {
                String var6 = class590.method1223(var0, var10, (byte) 92);
                if (var6 != null) {
                    class984.method1875(var6, var0.field953, class874.method5857(var0, var10, -1654084952), 57, var0.field1005, (long) (1 + var10), var0.field879, var0.field867, true, false, (long) (var0.field879 << 32 | var0.field867), false, -1801587230);
                }
            }

            if (class730.method1761(var0).method1737((byte) -120)) {
                if (var0.field955 != null) {
                    class984.method1875(var0.field955, "", -1, 30, var0.field1005, 0L, var0.field879, var0.field867, true, false, (long) (var0.field879 << 32 | var0.field867), false, -1225913379);
                } else {
                    class984.method1875(class814.field4658.method2927(class321.field1066, -875414210), "", -1, 30, var0.field1005, 0L, var0.field879, var0.field867, true, false, (long) (var0.field879 << 32 | var0.field867), false, -1304653626);
                }
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "dn.v(" + ')');
        }
    }
}
