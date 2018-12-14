public class class179 extends class106 {
    class120 field5219;
    byte field5220;
    byte field5221;
    boolean field5222;
    byte field5223;
    byte field5224;

    class179(class120 var1) {
        this.field5219 = var1;
    }

    void method168(InputStream var1, int var2) {
        try {
            this.field5222 = var1.method6371() == 1;
            this.field5220 = var1.method6372(-12558881);
            this.field5221 = var1.method6372(-12558881);
            this.field5224 = var1.method6372(-12558881);
            this.field5223 = var1.method6372(-12558881);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "agi.a(" + ')');
        }
    }

    void method170(class420 var1, byte var2) {
        try {
            var1.field9699 = this.field5222;
            var1.field9715 = this.field5220;
            var1.field9701 = this.field5221;
            var1.field9702 = this.field5224;
            var1.field9703 = this.field5223;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "agi.f(" + ')');
        }
    }
}
