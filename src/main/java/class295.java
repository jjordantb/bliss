public class class295 {
    public static class48 field10479;
    static int field10469;
    static int field10470;
    static int field10471;
    static int field10472;
    static int field10473;
    static class230 field10474;
    static int field10475;
    static int field10476;
    static int field10477;
    static class48[] field10478;

    class295() throws Throwable {
        throw new Error();
    }

    public static int method6513(int var0) {
        try {
            return class302.field3768.method113(1397176668);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "d.p(" + ')');
        }
    }

    static void method6514(byte[] var0, int var1) {
        try {
            InputStream var2 = new InputStream(var0);

            while (true) {
                int var3 = var2.method6371();
                if (var3 == 0) {
                    if (var1 == -1819630218) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                if (1 == var3) {
                    int[] var4 = class418.field9568 = new int[6];
                    var4[0] = var2.method6374();
                    var4[1] = var2.method6374();
                    var4[2] = var2.method6374();
                    var4[3] = var2.method6374();
                    var4[4] = var2.method6374();
                    var4[5] = var2.method6374();
                }
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "d.u(" + ')');
        }
    }

    static class671[] method6515(int var0) {
        try {
            return new class671[]{class671.field7470, class671.field7469};
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "d.a(" + ')');
        }
    }

    static final void method6516(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class740.method1919(var3, var4, var0, (byte) 5);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "d.dy(" + ')');
        }
    }

    static final void method6517(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9127.method4420((byte) 0) ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "d.anu(" + ')');
        }
    }

    static final void method6518(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9122.method2652((byte) -40) ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "d.ang(" + ')');
        }
    }

    static final void method6519(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class44.method3084((byte) 89);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "d.ajt(" + ')');
        }
    }

    public static void method6520(int var0, int var1, int var2, boolean var3, int var4) {
        try {
            if (class615.field8903.field9137.method3689(-1456138007) != 0) {
                class740.field3200 = class615.field8903.field9137.method3689(-993679742);
                class337.method77(0, true, 622850291);
            } else {
                class371.method867(false, 1336561252);
            }

            class740.field3203 = var1;
            class740.field3197 = var2;
            class740.field3205 = var3;
            class740.method4399(var0);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "d.cd(" + ')');
        }
    }

    static void method6521(int var0, int var1, int var2, int var3, int var4) {
        try {
            float var5 = (float) class491.field7815 / (float) class491.field7814;
            int var6 = var2;
            int var7 = var3;
            if (var5 < 1.0F) {
                var7 = (int) (var5 * (float) var2);
            } else {
                var6 = (int) ((float) var3 / var5);
            }

            var0 -= (var2 - var6) / 2;
            var1 -= (var3 - var7) / 2;
            class896.field9358 = class491.field7814 * var0 / var6;
            class747.field4148 = class491.field7815 - class491.field7815 * var1 / var7;
            class740.field3206 = -1;
            class740.field3201 = -1;
            class640.method6191(65536);
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "d.cv(" + ')');
        }
    }

    static void method6522(int var0, int var1, Widget var2, class118 var3, int var4, int var5, int var6) {
        try {
            class921[] var7 = class730.field2851;

            for (int var8 = 0; var8 < var7.length; ++var8) {
                class921 var9 = var7[var8];
                if (var9 != null && var9.field10287 != 0 && class730.field2866 % 20 < 10) {
                    int var13;
                    if (1 == var9.field10287) {
                        class437 var10 = (class437) class730.field2677.method2942((long) var9.field10277);
                        if (var10 != null) {
                            Npc var11 = (Npc) var10.field7515;
                            RegionOffset var12 = var11.getRegion().regionOffset;
                            var13 = (int) var12.offsetX / 128 - var0 / 128;
                            int var14 = (int) var12.offsetY / 128 - var1 / 128;
                            class515.method2695(var2, var3, var4, var5, var13, var14, var9.field10279, 360000L);
                        }
                    }

                    if (var9.field10287 == 2) {
                        int var18 = var9.field10281 / 128 - var0 / 128;
                        int var20 = var9.field10282 / 128 - var1 / 128;
                        long var15 = (long) (var9.field10278 << 7);
                        var15 *= var15;
                        class515.method2695(var2, var3, var4, var5, var18, var20, var9.field10279, var15);
                    }

                    if (10 == var9.field10287 && var9.field10277 >= 0 && var9.field10277 < class730.loaded.length) {
                        Player var19 = class730.loaded[var9.field10277];
                        if (var19 != null) {
                            RegionOffset var21 = var19.getRegion().regionOffset;
                            int var22 = (int) var21.offsetX / 128 - var0 / 128;
                            var13 = (int) var21.offsetY / 128 - var1 / 128;
                            class515.method2695(var2, var3, var4, var5, var22, var13, var9.field10279, 360000L);
                        }
                    }
                }
            }

        } catch (RuntimeException var17) {
            throw class158.method3445(var17, "d.s(" + ')');
        }
    }
}
