public class class350 extends class106 {
    public static int field1644;
    class120 field1641;
    String field1642;
    long field1643;

    class350(class120 var1) {
        this.field1641 = var1;
        this.field1643 = -1L;
        this.field1642 = null;
    }

    void method170(class420 var1, byte var2) {
        try {
            var1.method5784(this.field1643, this.field1642, 534643319);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "afp.f(" + ')');
        }
    }

    void method168(InputStream var1, int var2) {
        try {
            if (var1.method6371() != 255) {
                --var1.field10376;
                this.field1643 = var1.method6375((short) 12001);
            }

            this.field1642 = var1.method6429(-517364695);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "afp.a(" + ')');
        }
    }
}
