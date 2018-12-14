public class class39 {
    int field5356;
    long field5357;

    class39(class61[] var1) {
        for (int var2 = 0; var2 < var1.length; ++var2) {
            this.method3357(var1[var2]);
        }

    }

    class39(class61 var1) {
        this.field5357 = (long) var1.field1598;
        this.field5356 = 1;
    }

    public final class61 method3356(int var1) {
        return class61.method1224(this.method3358(var1));
    }

    final void method3357(class61 var1) {
        this.field5357 |= (long) (var1.field1598 << class61.field1600 * this.field5356++);
    }

    final int method3358(int var1) {
        return (int) (this.field5357 >> class61.field1600 * var1) & 15;
    }

    public final int method3359() {
        return this.field5356;
    }
}
