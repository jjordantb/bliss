public abstract class class749 extends class783 {
    public static int field4018;

    static final void method2524(class744 var0, short var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 56);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class969.method1694(var3, var4, var0, (short) 19287);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "wk.fr(" + ')');
        }
    }

    public static void method2525(int var0) {
        try {
            class439 var1 = null;

            try {
                var1 = class22.method3434("2", class730.field2926.field7321, true, -1804643872);
                InputStream var2 = new InputStream(class730.field2872 * 6 + 3);
                var2.method6361(1);
                var2.method6362(class730.field2872, 16711935);

                for (int var3 = 0; var3 < class14.field6693.length; ++var3) {
                    if (class474.field8271[var3]) {
                        var2.method6362(var3, 16711935);
                        var2.method6364(class14.field6693[var3], -679720276);
                    }
                }

                var1.method4275(var2.field10375, 0, var2.field10376, 840147185);
            } catch (Exception var5) {
                ;
            }

            try {
                if (var1 != null) {
                    var1.method4276(746438158);
                }
            } catch (Exception var4) {
                ;
            }

            class730.field2874 = class27.resetTimer((byte) 1);
            class730.field2717 = false;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "wk.gr(" + ')');
        }
    }

    static final void method2526(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class221.method4036(var3, var4, var0, (short) 255);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "wk.en(" + ')');
        }
    }

    public abstract int method2516();

    public abstract int method2517(int var1, int var2);

    abstract void method2518(int var1, int var2);
}
