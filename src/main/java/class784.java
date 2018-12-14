public class class784 extends Node {
    double field3952;
    short[][] field3953;

    class784(short[][] var1, double var2) {
        this.field3953 = var1;
        this.field3952 = var2;
    }

    static void method2476(class162 var0, byte var1) {
        try {
            class739.field2999 = var0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "abo.r(" + ')');
        }
    }

    long method2475(int var1) {
        try {
            return (long) (this.field3953.length << 32 | this.field3953[0].length);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "abo.a(" + ')');
        }
    }
}
