public class class905 {
    public static class843 field10369;
    int field10364;
    int field10365;
    int field10366;
    int field10367;
    int field10368;

    class905(int var1, int var2, int var3, int var4, int var5) {
        this.field10366 = var1;
        this.field10365 = var2;
        this.field10364 = var3;
        this.field10367 = var4;
        this.field10368 = var5;
    }

    static class719 method6344(int var0, int var1, int var2, class879 var3, int var4) {
        try {
            if (var3 == null) {
                return null;
            } else {
                class719 var5 = new class719(var0, var1, var2, var3.method5972(), var3.method6099(), var3.method6006(), var3.method5976(), var3.method5977(), var3.method5978(), var3.method5979());
                return var5;
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "tl.dp(" + ')');
        }
    }

    public static int method6345(int var0, int var1, int var2, byte var3) {
        try {
            var2 &= 3;
            if (var2 == 0) {
                return var1;
            } else if (1 == var2) {
                return 7 - var0;
            } else {
                return var2 == 2 ? 7 - var1 : var0;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "tl.f(" + ')');
        }
    }

    static final void method6346(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            String var4 = (String) var2.field3157[--var2.field3158];
            if (class960.method2212(var4, var2, -71305478) != null) {
                var4 = var4.substring(0, var4.length() - 1);
            }

            var0.field889 = class634.method5872(var4, var2, -2046058202);
            var0.field963 = true;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "tl.nq(" + ')');
        }
    }

    public int hashCode() {
        try {
            return this.field10366;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "tl.hashCode(" + ')');
        }
    }
}
