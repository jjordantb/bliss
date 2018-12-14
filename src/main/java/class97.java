public class class97 extends class106 {
    public static int field614;
    byte field612;
    class120 field613;
    int field615;

    class97(class120 var1) {
        this.field613 = var1;
        this.field615 = -1;
    }

    void method168(InputStream var1, int var2) {
        try {
            this.field615 = var1.method6374();
            this.field612 = var1.method6372(-12558881);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ago.a(" + ')');
        }
    }

    void method170(class420 var1, byte var2) {
        try {
            var1.method5794(this.field615, this.field612, (byte) -101);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ago.f(" + ')');
        }
    }
}
