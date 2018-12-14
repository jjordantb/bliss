public class class459 extends Node {
    public int field7268;
    public int field7269;
    public int field7270;
    public int field7271;
    public int field7272;
    public int field7273;
    public int field7274;
    public int field7275;
    public int field7276;

    class459(InputStream var1) {
        int var2 = var1.method6420((byte) -8);
        this.field7270 = var2 >>> 28;
        this.field7274 = var2 >>> 14 & 16383;
        this.field7268 = var2 & 16383;
        this.field7275 = var1.method6371();
        this.field7269 = var1.method6371();
        this.field7271 = var1.method6371();
        this.field7272 = var1.method6371();
        this.field7273 = var1.method6371();
        this.field7276 = var1.method6371();
    }

    public static class327 method3965(int var0) {
        try {
            return class491.field7793;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "aak.cl(" + ')');
        }
    }

    static final void method3966(class744 var0, int var1) {
        try {
            Widget var2 = class449.method3756(var0.field3161[--var0.field3156], (byte) 45);
            var0.field3161[++var0.field3156 - 1] = var2.field1005;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "aak.rz(" + ')');
        }
    }

    static final void method3967(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            class506 var3 = class395.method3397(var2, 1475903999);
            int var4 = -1;
            if (var3 != null) {
                var4 = var3.field4128;
            }

            var0.field3161[++var0.field3156 - 1] = var4;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "aak.act(" + ')');
        }
    }
}
