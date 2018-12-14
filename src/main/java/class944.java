public class class944 extends class23 {
    class102 field3363;

    class944(class13 var1, int var2, int var3, byte[] var4) {
        this.field3363 = class102.method267(var1, class264.field8201, class482.field8399, var2, var3, false, var4, class264.field8201);
        this.field3363.method4212(false, false);
    }

    static class944 method1971(class13 var0, int var1, int var2, int[] var3, int[] var4) {
        byte[] var5 = new byte[var1 * var2];

        for (int var6 = 0; var6 < var2; ++var6) {
            int var7 = var6 * var1 + var3[var6];

            for (int var8 = 0; var8 < var4[var6]; ++var8) {
                var5[var7++] = -1;
            }
        }

        return new class944(var0, var1, var2, var5);
    }
}
