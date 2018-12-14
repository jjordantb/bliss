public class class121 extends class23 {
    class801 field2385;

    class121(class325 var1, int var2, int var3, int[] var4) {
        this.field2385 = var1.method609(var2, var3, false, var4);
        this.field2385.method2849(false, false);
    }

    class121(class325 var1, int var2, int var3, byte[] var4) {
        this.field2385 = var1.method610(class264.field8201, var2, var3, false, var4);
        this.field2385.method2849(false, false);
    }

    static class121 method1622(class325 var0, int var1, int var2, int[] var3, int[] var4) {
        int var6;
        int var7;
        int var8;
        if (var0.method607(class264.field8201, class482.field8399)) {
            byte[] var9 = new byte[var1 * var2];

            for (var6 = 0; var6 < var2; ++var6) {
                var7 = var6 * var1 + var3[var6];

                for (var8 = 0; var8 < var4[var6]; ++var8) {
                    var9[var7++] = -1;
                }
            }

            return new class121(var0, var1, var2, var9);
        } else {
            int[] var5 = new int[var1 * var2];

            for (var6 = 0; var6 < var2; ++var6) {
                var7 = var6 * var1 + var3[var6];

                for (var8 = 0; var8 < var4[var6]; ++var8) {
                    var5[var7++] = -16777216;
                }
            }

            return new class121(var0, var1, var2, var5);
        }
    }
}
