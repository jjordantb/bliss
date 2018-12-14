public class class896 extends class304 {
    public static int field9358;
    int field9353;
    int field9354;
    int field9355;
    int field9356;
    int field9357;

    class896(InputStream var1) {
        super(var1);
        this.field9355 = var1.method6374();
        int var2 = var1.method6420((byte) -113);
        this.field9353 = var2 >>> 16;
        this.field9357 = var2 & '\uffff';
        this.field9356 = var1.method6371();
        this.field9354 = var1.method6371();
    }

    public static void method5588(String var0, boolean var1, int var2) {
        try {
            Animator.method2802(var0, var1, -1, -1, 1460451610);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "yb.ng(" + ')');
        }
    }

    static final void method5589(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            var2.field3156 -= 4;
            var0.field1008 = var2.field3161[var2.field3156];
            var0.field1029 = var2.field3161[var2.field3156 + 1];
            var0.field927 = var2.field3161[var2.field3156 + 2];
            var0.field901 = var2.field3161[3 + var2.field3156];
            class814.method2932(var0, -2015708067);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "yb.ig(" + ')');
        }
    }

    public void method2383(int var1) {
        try {
            class949.field3326[this.field9355].method3433(this.field9356, this.field9353, this.field9357, this.field9354, (byte) 61);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "yb.f(" + ')');
        }
    }
}
