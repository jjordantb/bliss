public class class777 {
    static int field3711 = 4;
    static int field3713;
    static float[][] field3715 = new float[2][8];
    static int[][] field3716 = new int[2][8];
    static float field3718;
    static float field3719 = 100.0F;
    static float field3720 = 8.0F;
    static float field3721 = 32.703197F;
    int[][][] field3710 = new int[2][2][4];
    int[] field3712 = new int[2];
    int[] field3714 = new int[2];
    int[][][] field3717 = new int[2][2][4];

    static float method2288(float var0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) var0);
        return var1 * 3.1415927F / 11025.0F;
    }

    final void method2285(InputStream var1, class753 var2) {
        int var3 = var1.method6371();
        this.field3714[0] = var3 >> 4;
        this.field3714[1] = var3 & 15;
        if (var3 != 0) {
            this.field3712[0] = var1.method6374();
            this.field3712[1] = var1.method6374();
            int var4 = var1.method6371();

            int var5;
            int var6;
            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.field3714[var5]; ++var6) {
                    this.field3710[var5][0][var6] = var1.method6374();
                    this.field3717[var5][0][var6] = var1.method6374();
                }
            }

            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.field3714[var5]; ++var6) {
                    if ((var4 & 1 << var5 * 4 << var6) != 0) {
                        this.field3710[var5][1][var6] = var1.method6374();
                        this.field3717[var5][1][var6] = var1.method6374();
                    } else {
                        this.field3710[var5][1][var6] = this.field3710[var5][0][var6];
                        this.field3717[var5][1][var6] = this.field3717[var5][0][var6];
                    }
                }
            }

            if (var4 != 0 || this.field3712[1] != this.field3712[0]) {
                var2.method2619(var1);
            }
        } else {
            int[] var7 = this.field3712;
            this.field3712[1] = 0;
            var7[0] = 0;
        }

    }

    int method2286(int var1, float var2) {
        float var3;
        if (var1 == 0) {
            var3 = (float) this.field3712[0] + (float) (this.field3712[1] - this.field3712[0]) * var2;
            var3 *= 0.0030517578F;
            field3718 = (float) Math.pow(0.1D, (double) (var3 / 20.0F));
            field3713 = (int) (field3718 * 65536.0F);
        }

        if (this.field3714[var1] == 0) {
            return 0;
        } else {
            var3 = this.method2289(var1, 0, var2);
            field3715[var1][0] = -2.0F * var3 * (float) Math.cos((double) this.method2287(var1, 0, var2));
            field3715[var1][1] = var3 * var3;

            int var4;
            for (var4 = 1; var4 < this.field3714[var1]; ++var4) {
                var3 = this.method2289(var1, var4, var2);
                float var5 = -2.0F * var3 * (float) Math.cos((double) this.method2287(var1, var4, var2));
                float var6 = var3 * var3;
                field3715[var1][var4 * 2 + 1] = field3715[var1][var4 * 2 - 1] * var6;
                field3715[var1][var4 * 2] = field3715[var1][var4 * 2 - 1] * var5 + field3715[var1][var4 * 2 - 2] * var6;

                for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
                    field3715[var1][var7] += field3715[var1][var7 - 1] * var5 + field3715[var1][var7 - 2] * var6;
                }

                field3715[var1][1] += field3715[var1][0] * var5 + var6;
                field3715[var1][0] += var5;
            }

            if (var1 == 0) {
                for (var4 = 0; var4 < this.field3714[0] * 2; ++var4) {
                    field3715[0][var4] *= field3718;
                }
            }

            for (var4 = 0; var4 < this.field3714[var1] * 2; ++var4) {
                field3716[var1][var4] = (int) (field3715[var1][var4] * 65536.0F);
            }

            return this.field3714[var1] * 2;
        }
    }

    float method2287(int var1, int var2, float var3) {
        float var4 = (float) this.field3710[var1][0][var2] + var3 * (float) (this.field3710[var1][1][var2] - this.field3710[var1][0][var2]);
        var4 *= 1.2207031E-4F;
        return method2288(var4);
    }

    float method2289(int var1, int var2, float var3) {
        float var4 = (float) this.field3717[var1][0][var2] + var3 * (float) (this.field3717[var1][1][var2] - this.field3717[var1][0][var2]);
        var4 *= 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var4 / 20.0F));
    }
}
