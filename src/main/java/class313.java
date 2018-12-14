public class class313 extends class347 {
    static int field463 = 1;
    static int field465 = 2;
    static int field466 = 0;
    static int field467 = 0;
    int[] field464;
    int[] field468;
    int field469 = 0;
    int[][] field470;
    short[] field471 = new short[257];

    public class313() {
        super(1, true);
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, 887884013);
            if (super.field270.field6612) {
                int[] var4 = this.method201(0, var1, -1887337990);

                for (int var5 = 0; var5 < class322.field831; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    if (var6 > 256) {
                        var6 = 256;
                    }

                    var3[var5] = this.field471[var6];
                }
            }

            return var3;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "age.i(" + ')');
        }
    }

    final int[] method403(int var1, byte var2) {
        try {
            if (var1 < 0) {
                return this.field468;
            } else {
                return var1 >= this.field470.length ? this.field464 : this.field470[var1];
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "age.ac(" + ')');
        }
    }

    void method405(int var1) {
        try {
            int var2;
            int var3;
            int var4;
            int[] var5;
            int[] var6;
            int var7;
            int var8;
            int var9;
            int var10;
            switch (this.field469) {
                case 1:
                    for (var2 = 0; var2 < 257; ++var2) {
                        var3 = var2 << 4;

                        for (var4 = 1; var4 < this.field470.length - 1; ++var4) {
                            if (this.field470[var4][0] > var3) {
                                if (var1 != -1265044202) {
                                    throw new IllegalStateException();
                                }
                                break;
                            }
                        }

                        var5 = this.field470[var4 - 1];
                        var6 = this.field470[var4];
                        var7 = (var3 - var5[0] << 12) / (var6[0] - var5[0]);
                        var8 = 4096 - class322.field839[var7 >> 5 & 255] >> 1;
                        var9 = 4096 - var8;
                        var10 = var5[1] * var9 + var6[1] * var8 >> 12;
                        if (var10 <= -32768) {
                            var10 = -32767;
                        }

                        if (var10 >= 32768) {
                            var10 = 32767;
                        }

                        this.field471[var2] = (short) var10;
                    }

                    return;
                case 2:
                    for (var2 = 0; var2 < 257; ++var2) {
                        var3 = var2 << 4;

                        for (var4 = 1; var4 < this.field470.length - 1 && this.field470[var4][0] <= var3; ++var4) {
                            ;
                        }

                        var5 = this.field470[var4 - 1];
                        var6 = this.field470[var4];
                        var7 = this.method403(var4 - 2, (byte) 20)[1];
                        var8 = var5[1];
                        var9 = var6[1];
                        var10 = this.method403(1 + var4, (byte) 30)[1];
                        int var11 = (var3 - var5[0] << 12) / (var6[0] - var5[0]);
                        int var12 = var11 * var11 >> 12;
                        int var13 = var8 + (var10 - var9 - var7);
                        int var14 = var7 - var8 - var13;
                        int var15 = var9 - var7;
                        int var17 = var12 * (var13 * var11 >> 12) >> 12;
                        int var18 = var12 * var14 >> 12;
                        int var19 = var11 * var15 >> 12;
                        int var20 = var8 + var19 + var17 + var18;
                        if (var20 <= -32768) {
                            var20 = -32767;
                        }

                        if (var20 >= 32768) {
                            var20 = 32767;
                        }

                        this.field471[var2] = (short) var20;
                    }

                    return;
                default:
                    for (var2 = 0; var2 < 257; ++var2) {
                        var3 = var2 << 4;

                        for (var4 = 1; var4 < this.field470.length - 1 && this.field470[var4][0] <= var3; ++var4) {
                            ;
                        }

                        var5 = this.field470[var4 - 1];
                        var6 = this.field470[var4];
                        var7 = (var3 - var5[0] << 12) / (var6[0] - var5[0]);
                        var8 = 4096 - var7;
                        var9 = var8 * var5[1] + var7 * var6[1] >> 12;
                        if (var9 <= -32768) {
                            var9 = -32767;
                        }

                        if (var9 >= 32768) {
                            var9 = 32767;
                        }

                        this.field471[var2] = (short) var9;
                    }

            }
        } catch (RuntimeException var21) {
            throw class158.method3445(var21, "age.am(" + ')');
        }
    }

    void method205(int var1) {
        try {
            if (this.field470 == null) {
                this.field470 = new int[][]{new int[2], {4096, 4096}};
            }

            if (this.field470.length < 2) {
                throw new RuntimeException();
            } else {
                if (2 == this.field469) {
                    this.method406((byte) -127);
                }

                class322.method814((byte) -67);
                this.method405(-1265044202);
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "age.x(" + ')');
        }
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            if (var1 == 0) {
                this.field469 = var2.method6371();
                this.field470 = new int[var2.method6371()][2];

                for (int var4 = 0; var4 < this.field470.length; ++var4) {
                    this.field470[var4][0] = var2.method6374();
                    this.field470[var4][1] = var2.method6374();
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "age.r(" + ')');
        }
    }

    final void method406(byte var1) {
        try {
            int[] var2 = this.field470[0];
            int[] var3 = this.field470[1];
            int[] var4 = this.field470[this.field470.length - 2];
            int[] var5 = this.field470[this.field470.length - 1];
            this.field468 = new int[]{var2[0] + (var2[0] - var3[0]), var2[1] - var3[1] + var2[1]};
            this.field464 = new int[]{var4[0] - var5[0] + var4[0], var4[1] + (var4[1] - var5[1])};
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "age.bd(" + ')');
        }
    }
}
