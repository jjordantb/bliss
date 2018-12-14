public class class551 extends class304 {
    int field506;

    class551(InputStream var1) {
        super(var1);
        this.field506 = var1.method6374();
    }

    public static void method434(int var0, int var1, int var2, int var3, int var4, int var5) {
        try {
            if (var2 == var3) {
                class508.method2498(var0, var1, var2, var4, (byte) 95);
            } else if (var0 - var2 >= class381.field1416 && var0 + var2 <= class381.field1413 && var1 - var3 >= class381.field1414 && var1 + var3 <= class381.field1415) {
                class220.method4047(var0, var1, var2, var3, var4, -735376708);
            } else {
                class64.method1266(var0, var1, var2, var3, var4, 655524402);
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "xb.ao(" + ')');
        }
    }

    public void method2383(int var1) {
        try {
            class949.field3322[this.field506].method6637((byte) 15);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "xb.f(" + ')');
        }
    }
}
