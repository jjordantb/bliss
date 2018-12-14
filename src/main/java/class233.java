public class class233 {
    int field8302 = class29.method3514(24);
    int field8303 = class29.method3514(24);
    int field8304 = class29.method3514(6) + 1;
    int field8305 = class29.method3514(24) + 1;
    int field8306 = class29.method3514(16);
    int field8307 = class29.method3514(8);
    int[] field8308;

    class233() {
        int[] var1 = new int[this.field8304];

        int var2;
        for (var2 = 0; var2 < this.field8304; ++var2) {
            int var3 = 0;
            int var4 = class29.method3514(3);
            boolean var5 = class29.method3507() != 0;
            if (var5) {
                var3 = class29.method3514(5);
            }

            var1[var2] = var3 << 3 | var4;
        }

        this.field8308 = new int[this.field8304 * 8];

        for (var2 = 0; var2 < this.field8304 * 8; ++var2) {
            this.field8308[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? class29.method3514(8) : -1;
        }

    }

    void method4692(float[] var1, int var2, boolean var3) {
        int var4;
        for (var4 = 0; var4 < var2; ++var4) {
            var1[var4] = 0.0F;
        }

        if (!var3) {
            var4 = class29.field6528[this.field8307].field1801;
            int var5 = this.field8302 - this.field8303;
            int var6 = var5 / this.field8305;
            int[] var7 = new int[var6];

            for (int var8 = 0; var8 < 8; ++var8) {
                int var9 = 0;

                while (var9 < var6) {
                    int var10;
                    int var11;
                    if (var8 == 0) {
                        var10 = class29.field6528[this.field8307].method1297();

                        for (var11 = var4 - 1; var11 >= 0; --var11) {
                            if (var9 + var11 < var6) {
                                var7[var9 + var11] = var10 % this.field8304;
                            }

                            var10 /= this.field8304;
                        }
                    }

                    for (var10 = 0; var10 < var4; ++var10) {
                        var11 = var7[var9];
                        int var12 = this.field8308[var11 * 8 + var8];
                        if (var12 >= 0) {
                            int var13 = this.field8303 + var9 * this.field8305;
                            class598 var14 = class29.field6528[var12];
                            int var15;
                            if (this.field8306 == 0) {
                                var15 = this.field8305 / var14.field1801;

                                for (int var19 = 0; var19 < var15; ++var19) {
                                    float[] var20 = var14.method1299();

                                    for (int var18 = 0; var18 < var14.field1801; ++var18) {
                                        var1[var13 + var19 + var18 * var15] += var20[var18];
                                    }
                                }
                            } else {
                                var15 = 0;

                                while (var15 < this.field8305) {
                                    float[] var16 = var14.method1299();

                                    for (int var17 = 0; var17 < var14.field1801; ++var17) {
                                        var1[var13 + var15] += var16[var17];
                                        ++var15;
                                    }
                                }
                            }
                        }

                        ++var9;
                        if (var9 >= var6) {
                            break;
                        }
                    }
                }
            }
        }

    }
}
