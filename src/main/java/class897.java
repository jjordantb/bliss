import java.io.IOException;
import java.net.Socket;

public class class897 extends class727 {
    int[] field9418;
    int[] field9419;
    int[] field9420;
    byte[][] field9421;
    int[] field9422;
    class257 field9423;

    class897(class257 var1, class230 var2, class922[] var3, int[] var4, int[] var5) {
        super(var1, var2);
        this.field9423 = var1;
        this.field9419 = var4;
        this.field9418 = var5;
        this.field9421 = new byte[var3.length][];
        this.field9422 = new int[var3.length];
        this.field9420 = new int[var3.length];

        for (int var6 = 0; var6 < var3.length; ++var6) {
            this.field9421[var6] = var3[var6].field10275;
            this.field9422[var6] = var3[var6].field10268;
            this.field9420[var6] = var3[var6].field10272;
        }

    }

    public static void method5624(boolean var0, int var1) {
        try {
            class206 var2;
            for (var2 = (class206) class206.field7064.method901(1766612795); var2 != null; var2 = (class206) class206.field7064.method906(49146)) {
                if (var2.field7090 != null) {
                    class56.field2321.method3875(var2.field7090);
                    var2.field7090 = null;
                }

                if (var2.field7069 != null) {
                    class56.field2321.method3875(var2.field7069);
                    var2.field7069 = null;
                }

                var2.method545(-1460969981);
            }

            if (var0) {
                for (var2 = (class206) class206.field7098.method901(1766612795); var2 != null; var2 = (class206) class206.field7098.method906(49146)) {
                    if (var2.field7090 != null) {
                        class56.field2321.method3875(var2.field7090);
                        var2.field7090 = null;
                    }

                    var2.method545(-1460969981);
                }

                for (var2 = (class206) class206.field7083.method2946(1763526126); var2 != null; var2 = (class206) class206.field7083.method2945((byte) -17)) {
                    if (var2.field7090 != null) {
                        class56.field2321.method3875(var2.field7090);
                        var2.field7090 = null;
                    }

                    var2.method545(-1460969981);
                }
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "xw.a(" + ')');
        }
    }

    public static int method5625(int var0, int var1, int var2, short var3) {
        try {
            if (class740.field3198 < 100) {
                return -2;
            } else {
                int var4 = -2;
                int var5 = Integer.MAX_VALUE;
                int var6 = var1 - class491.field7820;
                int var7 = var2 - class491.field7813;

                for (class392 var8 = (class392) class491.field7811.method901(1766612795); var8 != null; var8 = (class392) class491.field7811.method906(49146)) {
                    if (var8.field5396 != var0) {
                        if (var3 >= 128) {
                            throw new IllegalStateException();
                        }
                    } else {
                        int var9 = var8.field5395;
                        int var10 = var8.field5398;
                        int var11 = var9 + class491.field7820 << 14 | var10 + class491.field7813;
                        int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                        if (var4 < 0 || var12 < var5) {
                            var4 = var11;
                            var5 = var12;
                        }
                    }
                }

                return var4;
            }
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "xw.ck(" + ')');
        }
    }

    public static class348 method5626(Socket var0, int var1, int var2) throws IOException {
        try {
            return new class108(var0, var1);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "xw.a(" + ')');
        }
    }

    static final void method5627(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            if (var2 != class615.field8903.field9133.method5728(-1741518508)) {
                class615.field8903.method5391(class615.field8903.field9133, var2, -814728981);
                class95.method523(656179282);
                class730.field2647 = false;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "xw.ajd(" + ')');
        }
    }

    void method5620(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        int var10 = var3 >>> 24;
        int var11 = 255 - var10;

        for (int var12 = -var7; var12 < 0; ++var12) {
            for (int var13 = -var6; var13 < 0; ++var13) {
                if (var1[var4++] != 0) {
                    int var14 = ((var3 & '\uff00') * var10 & 16711680) + (var10 * (var3 & 16711935) & -16711936) >> 8;
                    int var15 = var2[var5];
                    var2[var5++] = ((var11 * (var15 & 16711935) & -16711936) + (var11 * (var15 & '\uff00') & 16711680) >> 8) + var14;
                } else {
                    ++var5;
                }
            }

            var5 += var8;
            var4 += var9;
        }

    }

    void method1674(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8) {
        if (this.field9423.field7914 != null) {
            if (var6 == null) {
                this.method1680(var1, var2, var3, var4, var5);
            } else {
                var2 += this.field9420[var1];
                var3 += this.field9422[var1];
                int var9 = this.field9419[var1];
                int var10 = this.field9418[var1];
                int var11 = this.field9423.field7918;
                int var12 = var2 + var3 * var11;
                int var13 = var11 - var9;
                int var14 = 0;
                int var15 = 0;
                int var16;
                if (var3 < this.field9423.field7923) {
                    var16 = this.field9423.field7923 - var3;
                    var10 -= var16;
                    var3 = this.field9423.field7923;
                    var15 += var16 * var9;
                    var12 += var16 * var11;
                }

                if (var10 + var3 > this.field9423.field7924) {
                    var10 -= var10 + var3 - this.field9423.field7924;
                }

                if (var2 < this.field9423.field7921) {
                    var16 = this.field9423.field7921 - var2;
                    var9 -= var16;
                    var2 = this.field9423.field7921;
                    var15 += var16;
                    var12 += var16;
                    var14 += var16;
                    var13 += var16;
                }

                if (var9 + var2 > this.field9423.field7938) {
                    var16 = var9 + var2 - this.field9423.field7938;
                    var9 -= var16;
                    var14 += var16;
                    var13 += var16;
                }

                if (var9 > 0 && var10 > 0) {
                    if (-16777216 == (var4 & -16777216)) {
                        this.method5621(this.field9421[var1], this.field9423.field7914, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.field9419[var1], var6, var7, var8);
                    } else {
                        this.method5623(this.field9421[var1], this.field9423.field7914, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.field9419[var1], var6, var7, var8);
                    }
                }
            }
        }

    }

    void method5621(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class23 var13, int var14, int var15) {
        class924 var16 = (class924) var13;
        int[] var17 = var16.field10289;
        int[] var18 = var16.field10288;
        int var19 = var11;
        if (var15 > var11) {
            var19 = var15;
            var5 += this.field9423.field7918 * (var15 - var11);
            var4 += (var15 - var11) * var12;
        }

        int var20 = var17.length + var15 < var7 + var11 ? var15 + var17.length : var11 + var7;

        for (int var21 = var19; var21 < var20; ++var21) {
            int var22 = var17[var21 - var15] + var14;
            int var23 = var18[var21 - var15];
            int var24 = var6;
            int var25;
            if (var10 > var22) {
                var25 = var10 - var22;
                if (var25 >= var23) {
                    var4 += var6 + var9;
                    var5 += var8 + var6;
                    continue;
                }

                var23 -= var25;
            } else {
                var25 = var22 - var10;
                if (var25 >= var6) {
                    var4 += var6 + var9;
                    var5 += var8 + var6;
                    continue;
                }

                var4 += var25;
                var24 = var6 - var25;
                var5 += var25;
            }

            var25 = 0;
            if (var24 < var23) {
                var23 = var24;
            } else {
                var25 = var24 - var23;
            }

            for (int var26 = 0; var26 < var23; ++var26) {
                if (var1[var4++] != 0) {
                    var2[var5++] = var3;
                } else {
                    ++var5;
                }
            }

            var4 += var25 + var9;
            var5 += var8 + var25;
        }

    }

    void method5622(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        int var10 = -(var6 >> 2);
        var6 = -(var6 & 3);

        for (int var11 = -var7; var11 < 0; ++var11) {
            int var12;
            for (var12 = var10; var12 < 0; ++var12) {
                if (var1[var4++] != 0) {
                    var2[var5++] = var3;
                } else {
                    ++var5;
                }

                if (var1[var4++] != 0) {
                    var2[var5++] = var3;
                } else {
                    ++var5;
                }

                if (var1[var4++] != 0) {
                    var2[var5++] = var3;
                } else {
                    ++var5;
                }

                if (var1[var4++] != 0) {
                    var2[var5++] = var3;
                } else {
                    ++var5;
                }
            }

            for (var12 = var6; var12 < 0; ++var12) {
                if (var1[var4++] != 0) {
                    var2[var5++] = var3;
                } else {
                    ++var5;
                }
            }

            var5 += var8;
            var4 += var9;
        }

    }

    void method5623(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class23 var13, int var14, int var15) {
        class924 var16 = (class924) var13;
        int[] var17 = var16.field10289;
        int[] var18 = var16.field10288;
        int var19 = var10 - this.field9423.field7921;
        int var20 = var11;
        if (var15 > var11) {
            var20 = var15;
            var5 += (var15 - var11) * this.field9423.field7918;
            var4 += (var15 - var11) * var12;
        }

        int var21 = var15 + var17.length < var11 + var7 ? var17.length + var15 : var7 + var11;
        int var22 = var3 >>> 24;
        int var23 = 255 - var22;

        for (int var24 = var20; var24 < var21; ++var24) {
            int var25 = var14 + var17[var24 - var15];
            int var26 = var18[var24 - var15];
            int var27 = var6;
            int var28;
            if (var19 > var25) {
                var28 = var19 - var25;
                if (var28 >= var26) {
                    var4 += var6 + var9;
                    var5 += var6 + var8;
                    continue;
                }

                var26 -= var28;
            } else {
                var28 = var25 - var19;
                if (var28 >= var6) {
                    var4 += var9 + var6;
                    var5 += var8 + var6;
                    continue;
                }

                var4 += var28;
                var27 = var6 - var28;
                var5 += var28;
            }

            var28 = 0;
            if (var27 < var26) {
                var26 = var27;
            } else {
                var28 = var27 - var26;
            }

            for (int var29 = -var26; var29 < 0; ++var29) {
                if (var1[var4++] != 0) {
                    int var30 = ((var3 & '\uff00') * var22 & 16711680) + (var22 * (var3 & 16711935) & -16711936) >> 8;
                    int var31 = var2[var5];
                    var2[var5++] = var30 + ((var23 * (var31 & 16711935) & -16711936) + ((var31 & '\uff00') * var23 & 16711680) >> 8);
                } else {
                    ++var5;
                }
            }

            var4 += var28 + var9;
            var5 += var28 + var8;
        }

    }

    void method1680(char var1, int var2, int var3, int var4, boolean var5) {
        if (this.field9423.field7914 != null) {
            var2 += this.field9420[var1];
            var3 += this.field9422[var1];
            int var6 = this.field9419[var1];
            int var7 = this.field9418[var1];
            int var8 = this.field9423.field7918;
            int var9 = var2 + var3 * var8;
            int var10 = var8 - var6;
            int var11 = 0;
            int var12 = 0;
            int var13;
            if (var3 < this.field9423.field7923) {
                var13 = this.field9423.field7923 - var3;
                var7 -= var13;
                var3 = this.field9423.field7923;
                var12 += var6 * var13;
                var9 += var13 * var8;
            }

            if (var7 + var3 > this.field9423.field7924) {
                var7 -= var3 + var7 - this.field9423.field7924;
            }

            if (var2 < this.field9423.field7921) {
                var13 = this.field9423.field7921 - var2;
                var6 -= var13;
                var2 = this.field9423.field7921;
                var12 += var13;
                var9 += var13;
                var11 += var13;
                var10 += var13;
            }

            if (var6 + var2 > this.field9423.field7938) {
                var13 = var6 + var2 - this.field9423.field7938;
                var6 -= var13;
                var11 += var13;
                var10 += var13;
            }

            if (var6 > 0 && var7 > 0) {
                if ((var4 & -16777216) == -16777216) {
                    this.method5622(this.field9421[var1], this.field9423.field7914, var4, var12, var9, var6, var7, var10, var11);
                } else if ((var4 & -16777216) != 0) {
                    this.method5620(this.field9421[var1], this.field9423.field7914, var4, var12, var9, var6, var7, var10, var11);
                }
            }
        }

    }
}
