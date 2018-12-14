public class class197 implements class70 {
    int field6994;
    int field6995;
    int[] field6996;

    class197(int var1, int var2, int[] var3) {
        this.field6995 = var1;
        this.field6994 = var2;
        this.field6996 = var3;
    }

    static final void method3714(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 23);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class544.method2364(var3, var4, var0, 2094067145);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "oj.di(" + ')');
        }
    }

    static final void method3715(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 69);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class932.method6296(var3, var4, var0, 230712598);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "oj.jc(" + ')');
        }
    }

    static final void method3716(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            if (var2 >= 0 && var2 < 2) {
                class730.field2748[var2] = new int[var3 << 1][4];
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "oj.afc(" + ')');
        }
    }

    static final void method3717(class744 var0, byte var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class964.method2134(var3, var4, var0, 2138038025);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "oj.ns(" + ')');
        }
    }

    public boolean method1040(class284 var1, class742[] var2, int var3, class352 var4, int var5) {
        try {
            if (var1 == null) {
                if (-1 != this.field6995) {
                    return false;
                }
            } else {
                if (this.field6995 != var1.method6666(-1372966703)) {
                    return false;
                }

                if (this.field6994 > var1.method6668(1840203341)) {
                    return false;
                }

                int[] var6 = this.field6996;

                for (int var7 = 0; var7 < var6.length; ++var7) {
                    int var8 = var6[var7];
                    if (!var4.method1392(var8, 741080989)) {
                        return false;
                    }
                }
            }

            return true;
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "oj.a(" + ')');
        }
    }
}
