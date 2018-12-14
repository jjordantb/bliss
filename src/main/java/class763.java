import jaclib.memory.I;

public class class763 {
    I field4354;
    class13 field4355;

    class763(class13 var1, I var2) {
        this.field4355 = var1;
        this.field4354 = var2;
    }

    class763(class13 var1, byte[] var2, int var3) {
        this.field4355 = var1;
        this.field4354 = this.field4355.field6868.f(var3, false);
        if (var2 != null) {
            this.field4354.b(var2, 0, 0, var3);
        }

    }

    void method2752(byte[] var1, int var2) {
        if (this.field4354 == null || this.field4354.a() < var2) {
            this.field4354 = this.field4355.field6868.f(var2, false);
        }

        this.field4354.b(var1, 0, 0, var2);
    }
}
