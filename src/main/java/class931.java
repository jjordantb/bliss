public class class931 {
    public static int field10299;
    public char field10298;

    static final void method6267(class744 var0, byte var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class752.method2642(var3, var4, var0, (short) 909);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "tz.ge(" + ')');
        }
    }

    static final void method6268(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 23);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class602.method5085(var3, var4, var0, -1670344500);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "tz.mt(" + ')');
        }
    }

    void method6265(InputStream var1, int var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    if (var2 != 65280) {
                        ;
                    }

                    return;
                }

                this.method6266(var1, var3, 212722615);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "tz.a(" + ')');
        }
    }

    void method6266(InputStream var1, int var2, int var3) {
        try {
            if (var2 == 1) {
                this.field10298 = class954.method2092(var1.method6372(-12558881), 1844674077);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "tz.f(" + ')');
        }
    }
}
