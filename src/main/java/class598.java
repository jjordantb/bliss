public class class598 {
    int[] field1800;
    int field1801;
    int[] field1802;
    int[] field1803;
    float[][] field1804;
    int field1805;

    class598() {
        class29.method3514(24);
        this.field1801 = class29.method3514(16);
        this.field1805 = class29.method3514(24);
        this.field1802 = new int[this.field1805];
        boolean var1 = class29.method3507() != 0;
        int var2;
        int var3;
        int var5;
        if (var1) {
            var2 = 0;

            for (var3 = class29.method3514(5) + 1; var2 < this.field1805; ++var3) {
                int var4 = class29.method3514(class949.method1955(this.field1805 - var2, -187995264));

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field1802[var2++] = var3;
                }
            }
        } else {
            boolean var14 = class29.method3507() != 0;

            for (var3 = 0; var3 < this.field1805; ++var3) {
                if (var14 && class29.method3507() == 0) {
                    this.field1802[var3] = 0;
                } else {
                    this.field1802[var3] = class29.method3514(5) + 1;
                }
            }
        }

        this.method1298();
        var2 = class29.method3514(4);
        if (var2 > 0) {
            float var15 = class29.method3512(class29.method3514(32));
            float var16 = class29.method3512(class29.method3514(32));
            var5 = class29.method3514(4) + 1;
            boolean var6 = class29.method3507() != 0;
            int var7;
            if (var2 == 1) {
                var7 = method1300(this.field1805, this.field1801);
            } else {
                var7 = this.field1805 * this.field1801;
            }

            this.field1803 = new int[var7];

            int var8;
            for (var8 = 0; var8 < var7; ++var8) {
                this.field1803[var8] = class29.method3514(var5);
            }

            this.field1804 = new float[this.field1805][this.field1801];
            float var9;
            int var10;
            int var11;
            if (var2 == 1) {
                for (var8 = 0; var8 < this.field1805; ++var8) {
                    var9 = 0.0F;
                    var10 = 1;

                    for (var11 = 0; var11 < this.field1801; ++var11) {
                        int var12 = var8 / var10 % var7;
                        float var13 = (float) this.field1803[var12] * var16 + var15 + var9;
                        this.field1804[var8][var11] = var13;
                        if (var6) {
                            var9 = var13;
                        }

                        var10 *= var7;
                    }
                }
            } else {
                for (var8 = 0; var8 < this.field1805; ++var8) {
                    var9 = 0.0F;
                    var10 = var8 * this.field1801;

                    for (var11 = 0; var11 < this.field1801; ++var11) {
                        float var17 = (float) this.field1803[var10] * var16 + var15 + var9;
                        this.field1804[var8][var11] = var17;
                        if (var6) {
                            var9 = var17;
                        }

                        ++var10;
                    }
                }
            }
        }

    }

    static int method1300(int var0, int var1) {
        int var2;
        for (var2 = (int) Math.pow((double) var0, 1.0D / (double) var1) + 1; class917.method6451(var2, var1, (short) 27381) > var0; --var2) {
            ;
        }

        return var2;
    }

    int method1297() {
        int var1;
        for (var1 = 0; this.field1800[var1] >= 0; var1 = class29.method3507() != 0 ? this.field1800[var1] : var1 + 1) {
            ;
        }

        return ~this.field1800[var1];
    }

    void method1298() {
        int[] var1 = new int[this.field1805];
        int[] var2 = new int[33];

        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        for (var3 = 0; var3 < this.field1805; ++var3) {
            var4 = this.field1802[var3];
            if (var4 != 0) {
                var5 = 1 << 32 - var4;
                var6 = var2[var4];
                var1[var3] = var6;
                if ((var6 & var5) != 0) {
                    var7 = var2[var4 - 1];
                } else {
                    var7 = var6 | var5;

                    for (var8 = var4 - 1; var8 >= 1; --var8) {
                        var9 = var2[var8];
                        if (var9 != var6) {
                            break;
                        }

                        int var10 = 1 << 32 - var8;
                        if ((var9 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }

                        var2[var8] = var9 | var10;
                    }
                }

                var2[var4] = var7;

                for (var8 = var4 + 1; var8 <= 32; ++var8) {
                    var9 = var2[var8];
                    if (var9 == var6) {
                        var2[var8] = var7;
                    }
                }
            }
        }

        this.field1800 = new int[8];
        var3 = 0;

        for (var4 = 0; var4 < this.field1805; ++var4) {
            var5 = this.field1802[var4];
            if (var5 != 0) {
                var6 = var1[var4];
                var7 = 0;

                for (var8 = 0; var8 < var5; ++var8) {
                    var9 = Integer.MIN_VALUE >>> var8;
                    if ((var6 & var9) != 0) {
                        if (this.field1800[var7] == 0) {
                            this.field1800[var7] = var3;
                        }

                        var7 = this.field1800[var7];
                    } else {
                        ++var7;
                    }

                    if (var7 >= this.field1800.length) {
                        int[] var12 = new int[this.field1800.length * 2];

                        for (int var11 = 0; var11 < this.field1800.length; ++var11) {
                            var12[var11] = this.field1800[var11];
                        }

                        this.field1800 = var12;
                    }

                    var9 >>>= 1;
                }

                this.field1800[var7] = ~var4;
                if (var7 >= var3) {
                    var3 = var7 + 1;
                }
            }
        }

    }

    float[] method1299() {
        return this.field1804[this.method1297()];
    }
}
