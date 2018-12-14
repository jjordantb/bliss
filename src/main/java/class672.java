public class class672 extends class106 {
    class120 field7466;
    long field7467;
    int field7468;

    class672(class120 var1) {
        this.field7466 = var1;
    }

    void method170(class420 var1, byte var2) {
        try {
            var1.method5788(this.field7468, this.field7467);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "agn.f(" + ')');
        }
    }

    void method168(InputStream var1, int var2) {
        try {
            this.field7468 = var1.method6420((byte) -40);
            this.field7467 = var1.method6375((short) 26335);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "agn.a(" + ')');
        }
    }
}
