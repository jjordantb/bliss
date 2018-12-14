public class class110 {
    int field1926;
    int field1927;
    int field1928;
    int field1929;
    int field1930;

    class110(int var1, int var2, int var3, int var4, int var5) {
        this.field1930 = var2;
        this.field1927 = var3;
        this.field1928 = var4;
        this.field1929 = var5;
        this.field1926 = this.field1929 - this.field1928;
    }

    static final void method1384(class744 var0, byte var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            int var4 = var0.field3161[--var0.field3156];
            --var4;
            if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
                var0.field3157[++var0.field3158 - 1] = var3.actions[var4];
            } else {
                var0.field3157[++var0.field3158 - 1] = "";
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "mp.pu(" + ')');
        }
    }

    static final void method1385(class744 var0, byte var1) {
        try {
            var0.field3156 -= 4;
            class587.method167(var0.field3161[var0.field3156], var0.field3161[var0.field3156 + 1], var0.field3161[var0.field3156 + 2], var0.field3161[3 + var0.field3156], 256, 1676570424);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "mp.tz(" + ')');
        }
    }

    static final void method1386(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = class730.field2902[var2].field10625;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "mp.yu(" + ')');
        }
    }

    static final void method1387(class744 var0, byte var1) {
        try {
            var0.field3156 -= 2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "mp.afs(" + ')');
        }
    }

    static final void method1388(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            class237 var3;
            if (var0.field3178) {
                var3 = var0.field3164;
            } else {
                var3 = var0.field3163;
            }

            var0.field3161[++var0.field3156 - 1] = var3.method4648(var0.field3159.field4095, var2, -1, 867608709) ? 1 : 0;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "mp.aob(" + ')');
        }
    }

    public static final void method1389(Player var0, int var1, int var2, byte var3, byte var4) {
        try {
            int var5 = var0.field4085[0];
            int var6 = var0.field4055[0];
            if (var5 >= 0 && var5 < class730.field2697.method5271(-2022633621) && var6 >= 0 && var6 < class730.field2697.method5272(211521322) && var1 >= 0 && var1 < class730.field2697.method5271(-2074801405) && var2 >= 0 && var2 < class730.field2697.method5272(1180671988)) {
                int var7 = class345.method157(var5, var6, var0.method2550(), class507.method2510(var1, var2, (short) 808), class730.field2697.method5281(var0.field3639), true, class730.field2731, class730.field2719);
                if (var7 >= 1 && var7 <= 3) {
                    for (int var8 = 0; var8 < var7 - 1; ++var8) {
                        var0.method1996(class730.field2731[var8], class730.field2719[var8], var3, (byte) 55);
                    }
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "mp.jl(" + ')');
        }
    }
}
