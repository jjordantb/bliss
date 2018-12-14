public class class690 extends class106 {
    int field7118;
    class120 field7119;

    class690(class120 var1) {
        this.field7119 = var1;
        this.field7118 = -1;
    }

    void method168(InputStream var1, int var2) {
        try {
            this.field7118 = var1.method6374();
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "agr.a(" + ')');
        }
    }

    void method170(class420 var1, byte var2) {
        try {
            var1.method5790(this.field7118, 1995709305);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "agr.f(" + ')');
        }
    }
}
