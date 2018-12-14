public class class688 extends class347 {
    int field7639 = 585;

    public class688() {
        super(0, true);
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            switch (var1) {
                case 0:
                    this.field7639 = var2.method6374();
                default:
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ahz.r(" + ')');
        }
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, 1728216367);
            if (super.field270.field6612) {
                int var4 = class322.field836[var1];

                for (int var5 = 0; var5 < class322.field831; ++var5) {
                    int var6 = class322.field838[var5];
                    int var7;
                    if (var6 > this.field7639 && var6 < 4096 - this.field7639 && var4 > 2048 - this.field7639 && var4 < 2048 + this.field7639) {
                        var7 = 2048 - var6;
                        var7 = var7 < 0 ? -var7 : var7;
                        var7 <<= 12;
                        var7 /= 2048 - this.field7639;
                        var3[var5] = 4096 - var7;
                    } else if (var6 > 2048 - this.field7639 && var6 < 2048 + this.field7639) {
                        var7 = var4 - 2048;
                        var7 = var7 < 0 ? -var7 : var7;
                        var7 -= this.field7639;
                        var7 <<= 12;
                        var3[var5] = var7 / (2048 - this.field7639);
                    } else if (var4 >= this.field7639 && var4 <= 4096 - this.field7639) {
                        if (var6 >= this.field7639 && var6 <= 4096 - this.field7639) {
                            var3[var5] = 0;
                        } else {
                            var7 = 2048 - var4;
                            var7 = var7 < 0 ? -var7 : var7;
                            var7 <<= 12;
                            var7 /= 2048 - this.field7639;
                            var3[var5] = 4096 - var7;
                        }
                    } else {
                        var7 = var6 - 2048;
                        var7 = var7 < 0 ? -var7 : var7;
                        var7 -= this.field7639;
                        var7 <<= 12;
                        var3[var5] = var7 / (2048 - this.field7639);
                    }
                }
            }

            return var3;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "ahz.i(" + ')');
        }
    }
}
