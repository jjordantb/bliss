public class class914 extends Node {
    int field10401;
    int field10402;
    int field10403;
    int field10404;
    int field10405;
    boolean field10406;

    class914(int var1, int var2, int var3, int var4, int var5, boolean var6) {
        this.field10405 = var1;
        this.field10402 = var2;
        this.field10404 = var3;
        this.field10401 = var4;
        this.field10403 = var5;
        this.field10406 = var6;
    }

    static final void method6442(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            String var4 = (String) var2.field3157[--var2.field3158];
            if (class960.method2212(var4, var2, -1331366076) != null) {
                var4 = var4.substring(0, var4.length() - 1);
            }

            var0.field986 = class634.method5872(var4, var2, -2046058202);
            var0.field963 = true;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "aaw.ol(" + ')');
        }
    }

    static void method6443(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[var0.field3156 - 3];
            int var3 = var0.field3161[var0.field3156 - 2];
            int var4 = var0.field3161[var0.field3156 - 1];
            var0.field3156 -= 3;
            if (var2 > var0.field3153[var3]) {
                throw new RuntimeException();
            } else if (var2 > var0.field3153[var4]) {
                throw new RuntimeException();
            } else if (var3 == var4) {
                throw new RuntimeException();
            } else {
                class804.method2826(var0.field3155[var3], var0.field3155[var4], 0, var2 - 1, -8746626);
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "aaw.apb(" + ')');
        }
    }
}
