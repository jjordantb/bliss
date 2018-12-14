public class class333 {
    public static class844 field139;
    int field127;
    int field128;
    int field129;
    int field130;
    int field131;
    int field132;
    int field133;
    int field134;
    int field135;
    int field136;
    int field137;
    int field138;

    static final void method111(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            var2.field3156 -= 2;
            int var4 = var2.field3161[var2.field3156];
            int var5 = var2.field3161[1 + var2.field3156];
            if (-1 == var4 && var5 == -1) {
                var0.parent = null;
            } else {
                var0.parent = class554.method427(var4, var5, -156511736);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "pc.iv(" + ')');
        }
    }

    static boolean method112(int var0, int var1) {
        try {
            return var0 == 14 || var0 == 18;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "pc.fm(" + ')');
        }
    }

    boolean method110(class333 var1, byte var2) {
        try {
            return this.field134 == var1.field134 && this.field137 == var1.field137 && this.field127 == var1.field127;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "pc.a(" + ')');
        }
    }
}
