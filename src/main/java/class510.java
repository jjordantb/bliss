public final class class510 implements Comparable {
    static int field4165;
    long field4161;
    Object field4162;
    long field4163;
    Object field4164;

    class510(Object var1, Object var2) {
        this.field4162 = var1;
        this.field4164 = var2;
    }

    static final void method2622(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
        try {
            String var4 = (String) var2.field3157[--var2.field3158];
            if (class960.method2212(var4, var2, -209664788) != null) {
                var4 = var4.substring(0, var4.length() - 1);
            }

            var0.field845 = class634.method5872(var4, var2, -2046058202);
            var0.field963 = true;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kx.lv(" + ')');
        }
    }

    static final void method2623(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 52);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class122.method1603(var3, var4, var0, -1603621953);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kx.km(" + ')');
        }
    }

    public static boolean method2624(int var0, int var1) {
        try {
            return var0 == 1 || var0 == 3 || var0 == 5;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kx.b(" + ')');
        }
    }

    int method2621(class510 var1, int var2) {
        try {
            if (this.field4161 < var1.field4161) {
                return -1;
            } else {
                return this.field4161 > var1.field4161 ? 1 : 0;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "kx.a(" + ')');
        }
    }

    public int compareTo(Object var1) {
        try {
            return this.method2621((class510) var1, -1964859807);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kx.compareTo(" + ')');
        }
    }

    public boolean equals(Object var1) {
        try {
            if (var1 instanceof class510) {
                return this.field4164.equals(((class510) var1).field4164);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kx.equals(" + ')');
        }
    }
}
