public class class151 {
    public static class180 field5372;
    public int[] field5370;
    public int[] field5371;
    int field5365 = -1;
    class495 field5366;
    class495 field5367;
    String field5368;
    String field5369;

    public static void method3371(int var0) {
        try {
            class1 var1 = class365.field2449;
            synchronized (class365.field2449) {
                class365.field2449.method2979();
            }

            var1 = class365.field2450;
            synchronized (class365.field2450) {
                class365.field2450.method2979();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "eq.z(" + ')');
        }
    }

    static final void method3372(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -7);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class510.method2622(var3, var4, var0, (byte) -113);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "eq.lj(" + ')');
        }
    }

    static final void method3373(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class715.method2098(var3, var4, var0, (byte) -50);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "eq.kp(" + ')');
        }
    }

    void method3370(class501 var1, byte var2) {
        try {
            int var3 = var1.method1906(2085203042);
            this.field5366 = class240.method4716(-1585817819)[var3];
            int var4;
            if (this.field5366 == class495.field8094) {
                var4 = var1.method1906(656081273);
                this.field5367 = class240.method4716(-12226797)[var4];
                this.field5365 = var1.method1906(1114947725);
            }

            this.field5368 = var1.method1905(1509343502);
            this.field5369 = var1.method1905(1509343502);
            var4 = var1.method1906(1761622063);
            this.field5370 = new int[var4];
            this.field5371 = new int[var4];

            for (int var5 = 0; var5 < var4; ++var5) {
                this.field5370[var5] = var1.method1906(-781974415);
                this.field5371[var5] = var1.method1906(372809823);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "eq.a(" + ')');
        }
    }
}
