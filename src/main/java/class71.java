public final class class71 {
    int field1432;
    Object field1433;

    class71(Object var1, int var2) {
        this.field1433 = var1;
        this.field1432 = var2;
    }

    static void method1084(int var0) {
        try {
            if (class602.field8639 != null) {
                class602.field8639 = null;
                class431.method4254(class514.field4319, class936.field10310, class965.field2535, class382.field1411, (byte) 2);
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "ha.z(" + ')');
        }
    }

    static final void method1085(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            var0.field3161[++var0.field3156 - 1] = var3.field900;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ha.pb(" + ')');
        }
    }

    static final void method1086(class744 var0, byte var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            var0.field3160.field6484[var2] = var3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ha.adx(" + ')');
        }
    }

    public static void method1087(int var0, class180 var1, int var2, int var3, int var4, boolean var5, class856 var6, byte var7) {
        try {
            if (var0 > 0) {
                class818.field4611 = 1;
                class818.field4621 = var1;
                class818.field4622 = var2;
                class818.field4623 = var3;
                class818.field4625 = null;
                class818.field4616 = var4;
                class342.field294 = var5;
                class573.field105 = class818.field4614.method6560((byte) -72) / var0;
                if (class573.field105 < 1) {
                    class573.field105 = 1;
                }

                class166.field6898 = var6;
            } else {
                if (var6 != null) {
                    var6.method5196(1056339184);
                }

                class58.method1581(var1, var2, var3, var4, var5, -1991321667);
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "ha.n(" + ')');
        }
    }

    static final void method1088(Widget[] var0, int var1, byte var2) {
        try {
            for (int var3 = 0; var3 < var0.length; ++var3) {
                Widget var4 = var0[var3];
                if (var4 == null) {
                    if (var2 <= 1) {
                        break;
                    }
                } else {
                    if (var4.field869 == 0) {
                        if (var4.children2 != null) {
                            method1088(var4.children2, var1, (byte) 26);
                        }

                        class256 var5 = (class256) class730.field2823.method2942((long) var4.field867);
                        if (var5 != null) {
                            class929.method6262(var5.field8101, var1, -837806860);
                        }
                    }

                    class202 var7;
                    if (var1 == 0 && var4.field1000 != null) {
                        var7 = new class202();
                        var7.field7578 = var4;
                        var7.field7583 = var4.field1000;
                        class408.method5470(var7, (byte) -11);
                    }

                    if (1 == var1 && var4.field975 != null) {
                        if (var4.field879 >= 0) {
                            Widget var8 = class449.method3756(var4.field867, (byte) -12);
                            if (var8 == null || var8.children1 == null || var4.field879 >= var8.children1.length || var8.children1[var4.field879] != var4) {
                                continue;
                            }
                        }

                        var7 = new class202();
                        var7.field7578 = var4;
                        var7.field7583 = var4.field975;
                        class408.method5470(var7, (byte) 34);
                    }
                }
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ha.lj(" + ')');
        }
    }

    static final void method1089(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            if (-1 != var2) {
                WidgetContainer.method892(var2, 2038530463);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ha.anj(" + ')');
        }
    }

    static boolean method1090(class70 var0, class284 var1, byte var2) {
        try {
            return var0 != null && var0.method1040(var1, class730.field2669, class730.field2668, class381.field1417, -622376364);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ha.i(" + ')');
        }
    }

    static final void method1091(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = class854.method5150(var2, false, (byte) 63);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ha.ui(" + ')');
        }
    }
}
