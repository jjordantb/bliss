public abstract class class649 implements Runnable {
    volatile boolean field9262 = false;
    volatile boolean field9263 = false;
    volatile class752[] field9264 = new class752[2];

    static final void method5541(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -16);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class91.method495(var3, var4, var0, 1489338850);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ly.cf(" + ')');
        }
    }

    static final void method5542(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class640.method6189(var3, var4, var0, -1329146498);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ly.eh(" + ')');
        }
    }

    static final void method5543(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -42);
            class812.method2916(var3, var0, 59297703);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ly.qy(" + ')');
        }
    }

    static final void method5544(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class881.field10143;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ly.ahs(" + ')');
        }
    }

    static final void method5545(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            String var4 = (String) var2.field3157[--var2.field3158];
            if (!var4.equals(var0.text)) {
                var0.text = var4;
                class814.method2932(var0, 1811665074);
            }

            if (-1 == var0.field879 && !var1.closed) {
                class281.method6690(var0.field867, (byte) -31);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ly.ec(" + ')');
        }
    }

    public static void method5546(int var0, int var1) {
        try {
            class682 var2 = class370.method881(11, (long) var0);
            var2.method4336(-2016878849);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ly.y(" + ')');
        }
    }
}
