public abstract class class888 {
    static void method5530(class848 var0, int var1, int var2, int var3, int var4, int var5, class727 var6, class230 var7, String var8, int var9) {
        try {
            int var10 = 255 - class124.field2412 - class602.field8665;
            if (var10 < 0) {
                var10 = 0;
            }

            if (class166.field6897 == null || class371.field1090 == null) {
                if (class562.field827.method3280(class677.field7465, -457216440) && class562.field827.method3280(class17.field6936, -457216440)) {
                    class166.field6897 = var0.method4982(class922.method6242(class562.field827, class677.field7465, 0), true);
                    class922 var11 = class922.method6242(class562.field827, class17.field6936, 0);
                    class371.field1090 = var0.method4982(var11, true);
                    var11.method6247();
                    class295.field10479 = var0.method4982(var11, true);
                } else {
                    var0.method4984(var1, var2, var3, var5, var10 << 24 | class764.field4348, 1);
                }
            }

            if (class166.field6897 != null && class371.field1090 != null) {
                int var14 = (var3 - class371.field1090.method3106() * 2) / class166.field6897.method3106();

                for (int var12 = 0; var12 < var14; ++var12) {
                    class166.field6897.method3128(var1 + class371.field1090.method3106() + var12 * class166.field6897.method3106(), var2);
                }

                class371.field1090.method3128(var1, var2);
                class295.field10479.method3128(var3 + var1 - class295.field10479.method3106(), var2);
            }

            var6.method1678(var8, 3 + var1, (20 - var7.field8230) / 2 + var2 + var7.field8230, class958.field3480 | -16777216, -1, 772459815);
            var0.method4984(var1, var5 + var2, var3, var4 - var5, var10 << 24 | class764.field4348, 1);
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "nh.ac(" + ')');
        }
    }

    static final void method5531(class744 var0, int var1) {
        try {
            var0.field3156 -= 4;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            int var4 = var0.field3161[2 + var0.field3156];
            int var5 = var0.field3161[var0.field3156 + 3];
            var2 += var3 << 14;
            var2 += var4 << 28;
            var2 += var5;
            var0.field3161[++var0.field3156 - 1] = var2;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nh.uu(" + ')');
        }
    }

    static boolean method5532(int var0, int var1) {
        try {
            return var0 == 19 || 14 == var0 || 18 == var0 || var0 == 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "nh.fn(" + ')');
        }
    }

    public static final void method5533(byte var0) {
        try {
            class684 var1 = class423.method5712((short) 512);
            class701 var2 = class637.method5936(class643.field9966, var1.field7765, (byte) 59);
            var2.field3364.method6361(0);
            var1.method4380(var2, (byte) -71);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "nh.ml(" + ')');
        }
    }

    static void method5534(int var0) {
        try {
            class682 var1 = class370.method881(15, 0L);
            var1.method4336(-900144368);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "nh.ae(" + ')');
        }
    }

    public abstract boolean method5508(int var1);

    public abstract class284 method5509(int var1);

    public abstract boolean method5510(byte var1);

    public boolean method5511(byte var1) {
        try {
            return this.method5508(1488304464) || this.method5517(1935628895) || this.method5510((byte) 86);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "nh.d(" + ')');
        }
    }

    public abstract void method5512(byte var1);

    public abstract int method5513(byte var1);

    public abstract void method5516(int var1);

    public abstract boolean method5517(int var1);

    public abstract int method5524(byte var1);
}
