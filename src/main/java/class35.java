public class class35 {
    public static int field5340 = 4;
    public static int field5341 = 1;
    public static int field5342 = 3;
    public static int field5343 = 0;
    public static int field5344 = 2;
    static Widget field5345;

    class35() throws Throwable {
        throw new Error();
    }

    static final byte[] method3335(byte[] var0, int var1) {
        try {
            InputStream var2 = new InputStream(var0);
            int var3 = var2.method6371();
            int var4 = var2.method6420((byte) -98);
            if (var4 >= 0 && (class180.field5293 == 0 || var4 <= class180.field5293)) {
                if (var3 == 0) {
                    byte[] var10 = new byte[var4];
                    var2.method6381(var10, 0, var4, -953523806);
                    return var10;
                } else {
                    int var5 = var2.method6420((byte) -15);
                    if (var5 < 0 || class180.field5293 != 0 && var5 > class180.field5293) {
                        throw new RuntimeException();
                    } else {
                        byte[] var6 = new byte[var5];
                        if (1 == var3) {
                            class244.method4772(var6, var5, var0, var4, 9);
                        } else {
                            class2 var7 = class180.field5285;
                            synchronized (class180.field5285) {
                                class180.field5285.method2970(var2, var6, -2006263589);
                            }
                        }

                        return var6;
                    }
                }
            } else {
                throw new RuntimeException();
            }
        } catch (Throwable var9) {
            if (Loader.field6963) {
                return new byte[100];
            } else {
                throw class158.method3445(var9, "jy.ad(" + ')');
            }
        }
    }

    static final void method3336(class744 var0, byte var1) {
        try {
            var0.field3156 -= 3;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            int var4 = var0.field3161[var0.field3156 + 2];
            class740.method1920(8, var2 << 16 | var3, var4, "", 1153707798);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "jy.all(" + ')');
        }
    }

    public static class392 method3337(int var0) {
        try {
            if (class491.field7811 != null && class740.field3208 != null) {
                class740.field3208.method3365(class491.field7811, 1595014600);
                class392 var1 = (class392) class740.field3208.method3367(1453357547);
                if (var1 == null) {
                    return null;
                } else {
                    class718 var2 = class491.field7826.method5091(var1.field5396, -113320818);
                    return var2 != null && var2.field3531 && var2.method2063(class491.field7798, 391184195) ? var1 : class806.method2843(-20548648);
                }
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jy.cn(" + ')');
        }
    }

    static final void method3338(class744 var0, byte var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class69.method1337(var3, var4, var0, 2047482896);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "jy.fh(" + ')');
        }
    }
}
