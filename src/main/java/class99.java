public class class99 {
    public static class99 field625 = new class99();
    static class99 field626 = new class99();
    static class99 field627 = new class99();

    static final void method533(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -102);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class458.method3830(var3, var4, var0, -1946261030);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "md.hk(" + ')');
        }
    }

    static final void method534(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = class85.field1121.method1566(var2).field4290;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "md.aax(" + ')');
        }
    }

    static final void method535(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Npc var3 = (Npc) var0.field3159;
            int var4 = var3.method1246(var2, -1877195973);
            int var5 = var3.method1250(var2, (byte) -50);
            var0.field3161[++var0.field3156 - 1] = var4;
            var0.field3161[++var0.field3156 - 1] = var5;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "md.apt(" + ')');
        }
    }

    static void method537(Widget var0, int var1, int var2, byte var3) {
        try {
            if (var0.field871 == 0) {
                var0.field868 = var0.field1011;
            } else if (var0.field871 == 1) {
                var0.field868 = var0.field1011 + (var1 - var0.field881) / 2;
            } else if (2 == var0.field871) {
                var0.field868 = var1 - var0.field881 - var0.field1011;
            } else if (var0.field871 == 3) {
                var0.field868 = var1 * var0.field1011 >> 14;
            } else if (4 == var0.field871) {
                var0.field868 = (var1 - var0.field881) / 2 + (var1 * var0.field1011 >> 14);
            } else {
                var0.field868 = var1 - var0.field881 - (var0.field1011 * var1 >> 14);
            }

            if (var0.field872 == 0) {
                var0.field880 = var0.field884;
            } else if (var0.field872 == 1) {
                var0.field880 = var0.field884 + (var2 - var0.field887) / 2;
            } else if (var0.field872 == 2) {
                var0.field880 = var2 - var0.field887 - var0.field884;
            } else if (3 == var0.field872) {
                var0.field880 = var0.field884 * var2 >> 14;
            } else if (var0.field872 == 4) {
                var0.field880 = (var0.field884 * var2 >> 14) + (var2 - var0.field887) / 2;
            } else {
                var0.field880 = var2 - var0.field887 - (var0.field884 * var2 >> 14);
            }

            if (class730.field2828 && (class730.method1761(var0).field2563 != 0 || var0.field869 == 0)) {
                if (var0.field868 < 0) {
                    var0.field868 = 0;
                } else if (var0.field868 + var0.field881 > var1) {
                    var0.field868 = var1 - var0.field881;
                }

                if (var0.field880 < 0) {
                    var0.field880 = 0;
                } else if (var0.field880 + var0.field887 > var2) {
                    var0.field880 = var2 - var0.field887;
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "md.li(" + ')');
        }
    }

    public static void method538(int var0) {
        try {
            for (class689 var1 = (class689) class371.field1088.method2946(2004354413); var1 != null; var1 = (class689) class371.field1088.method2945((byte) -69)) {
                if (!var1.field7633) {
                    class56.method1546(var1.field7628, (byte) 49);
                } else {
                    var1.field7633 = false;
                }
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "md.u(" + ')');
        }
    }
}
