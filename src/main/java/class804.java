public class class804 extends class304 {
    int field4410;
    int field4411;
    int field4412;

    class804(InputStream var1) {
        super(var1);
        this.field4412 = var1.method6374();
        this.field4411 = var1.method6374();
        this.field4410 = var1.method6371();
    }

    static void method2824(Widget var0, int var1, int var2, int var3) {
        try {
            class602.field8653 = var0;
            class602.field8654 = var1;
            class602.field8669 = var2;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "yf.av(" + ')');
        }
    }

    static final void method2825(class744 var0, int var1) {
        try {
            class615.field8903.method5391(class615.field8903.field9147, var0.field3161[--var0.field3156], -2102625264);
            class730.field2697.method5309(732894181);
            class95.method523(656179282);
            class730.field2647 = false;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "yf.aib(" + ')');
        }
    }

    public static void method2826(int[] var0, int[] var1, int var2, int var3, int var4) {
        try {
            if (var2 < var3) {
                int var5 = (var2 + var3) / 2;
                int var6 = var2;
                int var7 = var0[var5];
                var0[var5] = var0[var3];
                var0[var3] = var7;
                int var8 = var1[var5];
                var1[var5] = var1[var3];
                var1[var3] = var8;
                int var9 = Integer.MAX_VALUE == var7 ? 0 : 1;

                for (int var10 = var2; var10 < var3; ++var10) {
                    if (var0[var10] < var7 + (var10 & var9)) {
                        int var11 = var0[var10];
                        var0[var10] = var0[var6];
                        var0[var6] = var11;
                        int var12 = var1[var10];
                        var1[var10] = var1[var6];
                        var1[var6++] = var12;
                    }
                }

                var0[var3] = var0[var6];
                var0[var6] = var7;
                var1[var3] = var1[var6];
                var1[var6] = var8;
                method2826(var0, var1, var2, var6 - 1, 1275694928);
                method2826(var0, var1, 1 + var6, var3, 415383023);
            }

        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "yf.i(" + ')');
        }
    }

    static final void method2827(class744 var0, byte var1) {
        try {
            var0.field3156 -= 3;
            class730.field2819 = var0.field3161[var0.field3156];
            class184.field5231 = class11.method3572(var0.field3161[var0.field3156 + 1], 2087599862);
            if (class184.field5231 == null) {
                class184.field5231 = class12.field6677;
            }

            class730.field2895 = var0.field3161[2 + var0.field3156];
            class684 var2 = class423.method5712((short) 512);
            class701 var3 = class637.method5936(class643.field9990, var2.field7765, (byte) 32);
            var3.field3364.method6361(class730.field2819);
            var3.field3364.method6361(class184.field5231.field6679);
            var3.field3364.method6361(class730.field2895);
            var2.method4380(var3, (byte) -13);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "yf.abz(" + ')');
        }
    }

    public void method2383(int var1) {
        try {
            class283 var2 = class949.field3322[this.field4412];
            class278 var3 = class949.field3323[this.field4411];
            var3.method6625(var2, this.field4410, 1628828546);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "yf.f(" + ')');
        }
    }
}
