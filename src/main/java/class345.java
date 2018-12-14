public class class345 extends Node {
    public static int[][] field210;
    public class345 field207;
    public class345 field208;
    public long field209;

    public static int method157(int var0, int var1, int var2, class312 var3, class262 var4, boolean var5, int[] var6, int[] var7) {
        try {
            int var9;
            for (int var8 = 0; var8 < 128; ++var8) {
                for (var9 = 0; var9 < 128; ++var9) {
                    class56.field2314[var8][var9] = 0;
                    class56.field2318[var8][var9] = 99999999;
                }
            }

            boolean var28;
            if (var2 == 1) {
                var28 = class209.method3775(var0, var1, var3, var4, -369838027);
            } else if (2 == var2) {
                var28 = class59.method1620(var0, var1, var3, var4, -1327541421);
            } else {
                var28 = class381.method1068(var0, var1, var2, var3, var4, (byte) 58);
            }

            var9 = var0 - 64;
            int var10 = var1 - 64;
            int var11 = class56.field2316;
            int var12 = class78.field1500;
            int var13;
            int var14;
            int var16;
            if (!var28) {
                if (!var5) {
                    return -1;
                }

                var13 = Integer.MAX_VALUE;
                var14 = Integer.MAX_VALUE;
                byte var15 = 10;
                var16 = var3.field476;
                int var17 = var3.field475;
                int var18 = var3.field477;
                int var19 = var3.field478;

                for (int var20 = var16 - var15; var20 <= var15 + var16; ++var20) {
                    for (int var21 = var17 - var15; var21 <= var17 + var15; ++var21) {
                        int var22 = var20 - var9;
                        int var23 = var21 - var10;
                        if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class56.field2318[var22][var23] < 100) {
                            int var24 = 0;
                            if (var20 < var16) {
                                var24 = var16 - var20;
                            } else if (var20 > var18 + var16 - 1) {
                                var24 = var20 - (var18 + var16 - 1);
                            }

                            int var25 = 0;
                            if (var21 < var17) {
                                var25 = var17 - var21;
                            } else if (var21 > var17 + var19 - 1) {
                                var25 = var21 - (var19 + var17 - 1);
                            }

                            int var26 = var24 * var24 + var25 * var25;
                            if (var26 < var13 || var26 == var13 && class56.field2318[var22][var23] < var14) {
                                var13 = var26;
                                var14 = class56.field2318[var22][var23];
                                var11 = var20;
                                var12 = var21;
                            }
                        }
                    }
                }

                if (var13 == Integer.MAX_VALUE) {
                    return -1;
                }
            }

            if (var0 == var11 && var12 == var1) {
                return 0;
            } else {
                byte var29 = 0;
                class56.field2315[var29] = var11;
                var13 = var29 + 1;
                class56.field2312[var29] = var12;

                for (int var30 = var14 = class56.field2314[var11 - var9][var12 - var10]; var0 != var11 || var1 != var12; var30 = class56.field2314[var11 - var9][var12 - var10]) {
                    if (var14 != var30) {
                        var14 = var30;
                        class56.field2315[var13] = var11;
                        class56.field2312[var13++] = var12;
                    }

                    if ((var30 & 2) != 0) {
                        ++var11;
                    } else if ((var30 & 8) != 0) {
                        --var11;
                    }

                    if ((var30 & 1) != 0) {
                        ++var12;
                    } else if ((var30 & 4) != 0) {
                        --var12;
                    }
                }

                var16 = 0;

                while (var13-- > 0) {
                    var6[var16] = class56.field2315[var13];
                    var7[var16++] = class56.field2312[var13];
                    if (var16 >= var6.length) {
                        break;
                    }
                }

                return var16;
            }
        } catch (RuntimeException var27) {
            throw class158.method3445(var27, "abv.a(" + ')');
        }
    }

    static final void method158(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            class327 var3 = class491.method4412(var2);
            if (var3 == null) {
                var0.field3161[++var0.field3156 - 1] = 0;
                var0.field3161[++var0.field3156 - 1] = 0;
            } else {
                var0.field3161[++var0.field3156 - 1] = var3.field20 - var3.field23;
                var0.field3161[++var0.field3156 - 1] = var3.field19 - var3.field22;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "abv.adj(" + ')');
        }
    }

    static class417 method159(InputStream var0, int var1) {
        try {
            return new class417(var0.method6367(1780611979), var0.method6367(2084327915), var0.method6367(1750072102), var0.method6367(1941131752), var0.method6390((byte) 56), var0.method6371());
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "abv.r(" + ')');
        }
    }

    public void method156(int var1) {
        try {
            if (this.field207 != null) {
                this.field207.field208 = this.field208;
                this.field208.field207 = this.field207;
                this.field208 = null;
                this.field207 = null;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "abv.c(" + ')');
        }
    }
}
