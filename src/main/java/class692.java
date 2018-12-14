public class class692 {
    public short[] field7130;
    public int[] field7131;
    public short[] field7132;
    public long field7133;

    public class692(NpcDefinition var1, boolean var2) {
        if (var2) {
            this.field7131 = new int[var1.field9865.length];
            System.arraycopy(var1.field9865, 0, this.field7131, 0, this.field7131.length);
        } else {
            this.field7131 = new int[var1.field9866.length];
            System.arraycopy(var1.field9866, 0, this.field7131, 0, this.field7131.length);
        }

        if (var1.field9870 != null) {
            this.field7132 = new short[var1.field9870.length];
            System.arraycopy(var1.field9870, 0, this.field7132, 0, this.field7132.length);
        }

        if (var1.field9890 != null) {
            this.field7130 = new short[var1.field9890.length];
            System.arraycopy(var1.field9890, 0, this.field7130, 0, this.field7130.length);
        }

    }

    public class692(long var1, int[] var3, short[] var4, short[] var5) {
        this.field7133 = var1;
        this.field7131 = var3;
        this.field7132 = var4;
        this.field7130 = var5;
    }

    public static class24 method3776(InputStream var0, byte var1) {
        try {
            class24 var2 = new class24();
            var2.field6482 = var0.method6374();
            var2.field6483 = class906.field10363.method2713(var2.field6482, (short) -12386);
            return var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "up.a(" + ')');
        }
    }

    static final void method3777(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9153.method2717(-2147059683);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "up.akq(" + ')');
        }
    }

    static final void method3778(class744 var0, int var1) {
        try {
            var0.field3158 -= 2;
            String var2 = (String) var0.field3157[var0.field3158];
            String var3 = (String) var0.field3157[var0.field3158 + 1];
            int var4 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = var2.indexOf(var3, var4);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "up.aay(" + ')');
        }
    }
}
