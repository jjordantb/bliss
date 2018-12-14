public class class271 extends class250 {
    static class230 field10557;
    int field10558;
    int field10559;
    int field10560;

    class271(InputStream var1) {
        super(var1);
        int var2 = var1.method6420((byte) 10);
        this.field10560 = var2 >>> 16;
        this.field10558 = var2 & '\uffff';
        this.field10559 = var1.method6371();
    }

    static final void method6595(class744 var0, byte var1) {
        try {
            class590.method1219(-1811053545);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "afh.alk(" + ')');
        }
    }

    public void method2383(int var1) {
        try {
            int var2 = this.field10560 * 512 + 256;
            int var3 = this.field10558 * 512 + 256;
            int var4 = this.field10559;
            if (var4 < 3 && class730.field2697.method5296(431893651).method3386(this.field10560, this.field10558, -103237646)) {
                ++var4;
            }

            class150 var5 = new class150(class730.field2697.method5317(-1611682495), super.field7786, 0, this.field10559, var4, var2, class679.method4271(var2, var3, this.field10559, -1690985874) - super.field7784, var3, this.field10560, this.field10560, this.field10558, this.field10558, super.field7785, false);
            class730.field2806.method2947(new class178(var5), (long) (this.field10560 << 16 | this.field10558));
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "afh.f(" + ')');
        }
    }
}
