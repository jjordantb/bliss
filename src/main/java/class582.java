public class class582 extends class347 {
    public class582() {
        super(0, true);
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, 1728864266);
            if (super.field270.field6612) {
                int var4 = class322.field836[var1];

                for (int var5 = 0; var5 < class322.field831; ++var5) {
                    var3[var5] = this.method141(class322.field838[var5], var4, (byte) -64) % 4096;
                }
            }

            return var3;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ahb.i(" + ')');
        }
    }

    int method141(int var1, int var2, byte var3) {
        try {
            int var4 = var1 + 57 * var2;
            var4 ^= var4 << 1;
            return 4096 - (1376312589 + (789221 + var4 * var4 * 15731) * var4 & Integer.MAX_VALUE) / 262144;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ahb.ac(" + ')');
        }
    }
}
