public abstract class class770 extends class345 {
    public static class812 field3733;

    public static MenuItem method2302(int var0) {
        try {
            return class348.field220;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "na.al(" + ')');
        }
    }

    static final void method2303(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -49);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class374.method1005(var3, var4, var0, -866344405);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "na.mr(" + ')');
        }
    }

    public static final void method2304(int var0) {
        try {
            for (int var1 = 0; var1 < 5; ++var1) {
                class730.field2665[var1] = false;
            }

            class730.field2749 = -1;
            class730.field2750 = -1;
            class665.field9598 = 0;
            class617.field8843 = 0;
            class563.field1083 = 5;
            class516.field4332 = -1;
            class495.field8099 = -1;
            class730.field2903 = class730.field2866;
            class740.field3213 = class103.field205;
            class614.field8888 = class184.field5230;
            class859.field8849 = class7.field4918;
            class75.field1496 = class730.field2737;
            ItemNode.field6621 = class232.field8266;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "na.hb(" + ')');
        }
    }

    public static final void method2305(boolean var0, int var1, byte var2) {
        try {
            class139 var3 = var0 ? class507.field4015 : class509.field4024;
            if (var3 != null && var1 >= 0 && var1 < var3.field1162) {
                class78 var4 = var3.field1165[var1];
                if (-1 == var4.field1499) {
                    String var5 = var4.field1497;
                    class684 var6 = class423.method5712((short) 512);
                    class701 var7 = class637.method5936(class643.field9972, var6.field7765, (byte) 56);
                    var7.field3364.method6361(3 + class305.method372(var5, -175153344));
                    var7.field3364.method6361(var0 ? 1 : 0);
                    var7.field3364.method6362(var1, 16711935);
                    var7.field3364.method6366(var5, 2135659343);
                    var6.method4380(var7, (byte) -99);
                }
            }

        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "na.mw(" + ')');
        }
    }

    static final void method2306(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class730.field2827;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "na.uf(" + ')');
        }
    }
}
