public class class924 extends class23 {
    int[] field10288;
    int[] field10289;

    class924(int var1, int var2, int[] var3, int[] var4) {
        this.field10289 = var3;
        this.field10288 = var4;
    }

    static void method6251(class744 var0, byte var1) {
        try {
            var0.field3161[var0.field3156 - 1] = class735.field3009.method4224(var0.field3161[var0.field3156 - 1], 245040087).field8989;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wi.p(" + ')');
        }
    }

    public static void method6252(class48[] var0, int var1) {
        try {
            class544.field3794 = var0.length;
            class602.field8668 = new class48[class544.field3794 + 10];
            class755.field4199 = new int[class544.field3794 + 10];
            System.arraycopy(var0, 0, class602.field8668, 0, class544.field3794);

            int var2;
            for (var2 = 0; var2 < class544.field3794; ++var2) {
                class755.field4199[var2] = class602.field8668[var2].method3109();
            }

            for (var2 = class544.field3794; var2 < class602.field8668.length; ++var2) {
                class755.field4199[var2] = 12;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wi.ao(" + ')');
        }
    }

    static final void method6253(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class957.method2100(var3, var4, var0, 805534141);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "wi.kv(" + ')');
        }
    }

    static InputStream method6254(int var0) {
        try {
            InputStream var1 = IterableSceneEntity.method3541(-68618923);
            var1.method6385(0L);
            var1.method6366(class881.field10171, 2126310592);
            var1.method6385(class881.field10183);
            var1.method6385(class730.field2656);
            var1.method6412(class449.field7058, class449.field7062, 1411965819);
            return var1;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "wi.w(" + ')');
        }
    }

    static void method6255(class744 var0, int var1) {
        try {
            var0.field3157[++var0.field3158 - 1] = class735.field3009.method4224(var0.field3161[--var0.field3156], 245040087).field8985;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wi.f(" + ')');
        }
    }

    static final void method6256(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            if (class730.field2785 != null && var2 < class556.field503) {
                var0.field3157[++var0.field3158 - 1] = class776.field3731[var2].field8115;
            } else {
                var0.field3157[++var0.field3158 - 1] = "";
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wi.wz(" + ')');
        }
    }

    public static void method6257(class180 var0, class180 var1, int var2, byte var3) {
        try {
            class394.field5418 = var0;
            class531.field3737 = var1;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "wi.a(" + ')');
        }
    }
}
