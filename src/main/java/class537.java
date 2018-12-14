import java.util.Calendar;

public class class537 implements class195 {
    static class180 field3750;
    boolean field3743;
    int field3744;
    int field3745;
    int field3746;
    int field3747;
    int field3748;
    int field3749;

    public static String method2316(long var0, int var2, boolean var3, int var4) {
        try {
            Calendar var5;
            if (var3) {
                class540.method2465(var0);
                var5 = class308.field418;
            } else {
                class411.method5593(var0);
                var5 = class308.field416;
            }

            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            return var2 == 3 ? class378.method973(var0, var2, var3, (byte) 1) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class308.field417[var2][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "te.f(" + ')');
        }
    }

    static final void method2317(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            String var4 = (String) var2.field3157[--var2.field3158];
            if (class960.method2212(var4, var2, -637719265) != null) {
                var4 = var4.substring(0, var4.length() - 1);
            }

            var0.field988 = class634.method5872(var4, var2, -2046058202);
            var0.field963 = true;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "te.ld(" + ')');
        }
    }

    static final void method2318(class744 var0, short var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            class507 var3 = class283.field10614.method3736(var2, (byte) 24);
            if (var3.field3970 != null && var3.field3970.length > 0) {
                int var4 = 0;
                int var5 = var3.field3971[0];

                for (int var6 = 1; var6 < var3.field3970.length; ++var6) {
                    if (var3.field3971[var6] > var5) {
                        var4 = var6;
                        var5 = var3.field3971[var6];
                    }
                }

                var0.field3161[++var0.field3156 - 1] = var3.field3970[var4];
            } else {
                var0.field3161[++var0.field3156 - 1] = var3.field3969;
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "te.abx(" + ')');
        }
    }

    public boolean method3708(class195 var1) {
        try {
            if (!(var1 instanceof class537)) {
                return false;
            } else {
                class537 var2 = (class537) var1;
                if (var2.field3749 != this.field3749) {
                    return false;
                } else if (this.field3744 != var2.field3744) {
                    return false;
                } else if (this.field3745 != var2.field3745) {
                    return false;
                } else if (this.field3746 != var2.field3746) {
                    return false;
                } else if (var2.field3748 != this.field3748) {
                    return false;
                } else if (this.field3747 != var2.field3747) {
                    return false;
                } else {
                    return this.field3743 == var2.field3743;
                }
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "te.f(" + ')');
        }
    }

    public long method3707() {
        try {
            long[] var1 = InputStream.field10382;
            long var2 = -1L;
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) this.field3749) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) (this.field3744 >> 8)) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) this.field3744) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) (this.field3745 >> 24)) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) (this.field3745 >> 16)) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) (this.field3745 >> 8)) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) this.field3745) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) this.field3746) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) (this.field3748 >> 24)) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) (this.field3748 >> 16)) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) (this.field3748 >> 8)) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) this.field3748) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) this.field3747) & 255L)];
            var2 = var2 >>> 8 ^ var1[(int) ((var2 ^ (long) (this.field3743 ? 1 : 0)) & 255L)];
            return var2;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "te.a(" + ')');
        }
    }
}
