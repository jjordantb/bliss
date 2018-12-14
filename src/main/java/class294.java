public class class294 implements class893, class297 {
    long field10434 = 0L;
    int field10435;
    int field10436;

    class294(int var1, int var2) {
        this.field10435 = var1;
        this.field10436 = var2;
        this.g(var1, var2);
    }

    native void g(int var1, int var2);

    public int method2343() {
        return this.field10435;
    }

    public int method2344() {
        return this.field10436;
    }

    public void method2755() {
        this.method6550(false);
    }

    native void za(long var1, boolean var3);

    public void method6550(boolean var1) {
        this.za(this.field10434, var1);
    }
}
