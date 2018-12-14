public class class38 extends class66 {
    byte[] field5346;

    class38() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    byte[] method3339(int var1, int var2, int var3) {
        this.field5346 = new byte[var1 * var2 * var3 * 2];
        this.method6493(var1, var2, var3);
        return this.field5346;
    }

    void method1291(int var1, byte var2) {
        int var3 = var1 * 2;
        int var4 = var2 & 255;
        this.field5346[var3++] = -1;
        this.field5346[var3] = (byte) (3 * var4 >> 5);
    }
}
