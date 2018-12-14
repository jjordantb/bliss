public class class228 {
    static int field8213;
    static class922[] field8214;
    static int field8215;
    static class971 field8216;
    static int field8217;
    static int field8218;
    static int field8219;
    static int field8220;
    static class230 field8221;
    static class49 field8222;

    class228() throws Throwable {
        throw new Error();
    }

    public static void method4586(int var0, int[] var1, int var2) {
        try {
            if (var0 != -1 && class215.method3835(var0, var1, -2060750983)) {
                Widget[] var3 = class382.widgetContainers[var0].widgetsCopy;
                class932.method6294(var3, -1178956884);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ao.p(" + ')');
        }
    }

    static final void method4587(class744 var0, int var1) {
        try {
            class615.field8903.method5391(class615.field8903.field9141, var0.field3161[--var0.field3156] != 0 ? 1 : 0, -261887884);
            class95.method523(656179282);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ao.air(" + ')');
        }
    }

    static final void method4588(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -45);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class818.method2904(var3, var4, var0, -1849275031);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ao.ek(" + ')');
        }
    }

    public static void method4589(int var0) {
        try {
            class956.method2113(-1, 255, 328240529);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "ao.o(" + ')');
        }
    }

    static final void method4590(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            if (var2 < 0 || var2 > 5) {
                var2 = 2;
            }

            class337.method77(var2, false, 622850291);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ao.aic(" + ')');
        }
    }

    static final void method4591(byte var0) {
        try {
            for (class107 var1 = (class107) class730.field2805.method901(1766612795); var1 != null; var1 = (class107) class730.field2805.method906(49146)) {
                class214 var2 = var1.field1563;
                if (class730.field2866 > var2.field7143) {
                    var1.method545(-1460969981);
                    var2.method3788(686828159);
                } else if (class730.field2866 >= var2.field7138) {
                    var2.method3783(-36689971);
                    RegionOffset var5;
                    if (var2.field7152 > 0) {
                        if (class730.field2705 == 0) {
                            Actor var3 = class949.field3322[var2.field7152 - 1].method6636(1231902873);
                            if (var3 != null) {
                                RegionOffset var4 = var3.getRegion().regionOffset;
                                if ((int) var4.offsetX >= 0 && (int) var4.offsetX < class730.field2697.method5271(-1942094391) * 512 && (int) var4.offsetY >= 0 && (int) var4.offsetY < class730.field2697.method5272(-1804151587) * 512) {
                                    var2.method3782((int) var4.offsetX, (int) var4.offsetY, class679.method4271((int) var4.offsetX, (int) var4.offsetY, var3.field3639, -1503815167) - var2.field7139, class730.field2866, 1121215352);
                                }
                            }
                        } else {
                            class437 var7 = (class437) class730.field2677.method2942((long) (var2.field7152 - 1));
                            if (var7 != null) {
                                Npc var9 = (Npc) var7.field7515;
                                var5 = var9.getRegion().regionOffset;
                                if ((int) var5.offsetX >= 0 && (int) var5.offsetX < class730.field2697.method5271(-1876273086) * 512 && (int) var5.offsetY >= 0 && (int) var5.offsetY < class730.field2697.method5272(-203309822) * 512) {
                                    var2.method3782((int) var5.offsetX, (int) var5.offsetY, class679.method4271((int) var5.offsetX, (int) var5.offsetY, var2.field3639, -1366613250) - var2.field7139, class730.field2866, 2031199219);
                                }
                            }
                        }
                    }

                    if (var2.field7152 < 0) {
                        int var8 = -var2.field7152 - 1;
                        Player var10;
                        if (var8 == class730.field2623) {
                            var10 = class923.local;
                        } else {
                            var10 = class730.loaded[var8];
                        }

                        if (var10 != null) {
                            var5 = var10.getRegion().regionOffset;
                            if ((int) var5.offsetX >= 0 && (int) var5.offsetX < class730.field2697.method5271(-1981087344) * 512 && (int) var5.offsetY >= 0 && (int) var5.offsetY < class730.field2697.method5272(-1284142631) * 512) {
                                var2.method3782((int) var5.offsetX, (int) var5.offsetY, class679.method4271((int) var5.offsetX, (int) var5.offsetY, var2.field3639, -1135065402) - var2.field7139, class730.field2866, 1831333850);
                            }
                        }
                    }

                    var2.method3784(class730.field2943, (byte) 63);
                    class730.field2697.method5317(-1611682495).method2416(var2, true, (byte) 0);
                }
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ao.ie(" + ')');
        }
    }
}
