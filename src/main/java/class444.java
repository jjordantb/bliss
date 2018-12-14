import java.util.Random;

public class class444 extends class347 {
    static int field7588 = 2048;
    static int field7589 = 0;
    static int field7590 = 1024;
    static int field7591 = 1024;
    static int field7593 = 409;
    static int field7594 = 819;
    static int field7595 = 1024;
    static int field7597 = 0;
    static int field7600 = 0;
    static int field7602 = 1024;
    int field7592 = 819;
    int field7596 = 2048;
    int field7598 = 0;
    int field7599 = 1024;
    int field7601 = 409;
    int field7603 = 1024;
    int field7604 = 0;
    int field7605 = 1024;
    int field7606 = 1024;
    int field7607;

    public class444() {
        super(0, true);
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, 1803226244);
            if (super.field270.field6612) {
                int[][] var4 = super.field270.method3547(-772888514);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = this.field7599 * class322.field831 >> 12;
                int var15 = class322.field831 * this.field7596 >> 12;
                int var16 = class322.field832 * this.field7601 >> 12;
                int var17 = class322.field832 * this.field7592 >> 12;
                if (var17 <= 1) {
                    return var4[var1];
                } else {
                    this.field7607 = class322.field831 / 8 * this.field7603 >> 12;
                    int var18 = 1 + class322.field831 / var14;
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field7598);

                    while (true) {
                        while (true) {
                            int var22 = var14 + class977.method1813(var21, var15 - var14, (byte) 36);
                            int var23 = var16 + class977.method1813(var21, var17 - var16, (byte) -88);
                            int var24 = var22 + var8;
                            if (var24 > class322.field831) {
                                var22 = class322.field831 - var8;
                                var24 = class322.field831;
                            }

                            int var27;
                            int var30;
                            if (var11) {
                                var30 = 0;
                            } else {
                                int var25 = var9;
                                int[] var26 = var20[var9];
                                var27 = 0;
                                int var28 = var24 + var5;
                                if (var28 < 0) {
                                    var28 += class322.field831;
                                }

                                if (var28 > class322.field831) {
                                    var28 -= class322.field831;
                                }

                                while (true) {
                                    int[] var29 = var20[var25];
                                    if (var28 >= var29[0] && var28 <= var29[1]) {
                                        var30 = var26[2];
                                        if (var25 != var9) {
                                            int var41 = var5 + var8;
                                            if (var41 < 0) {
                                                var41 += class322.field831;
                                            }

                                            if (var41 > class322.field831) {
                                                var41 -= class322.field831;
                                            }

                                            int var31;
                                            int[] var32;
                                            for (var31 = 1; var31 <= var27; ++var31) {
                                                var32 = var20[(var31 + var9) % var12];
                                                var30 = Math.max(var30, var32[2]);
                                            }

                                            for (var31 = 0; var31 <= var27; ++var31) {
                                                var32 = var20[(var9 + var31) % var12];
                                                int var33 = var32[2];
                                                if (var33 != var30) {
                                                    int var34 = var32[0];
                                                    int var35 = var32[1];
                                                    int var36;
                                                    int var37;
                                                    if (var41 < var28) {
                                                        var36 = Math.max(var41, var34);
                                                        var37 = Math.min(var28, var35);
                                                    } else if (var34 == 0) {
                                                        var36 = 0;
                                                        var37 = Math.min(var28, var35);
                                                    } else {
                                                        var36 = Math.max(var41, var34);
                                                        var37 = class322.field831;
                                                    }

                                                    this.method4303(var21, var4, var36 + var7, var33, var37 - var36, var30 - var33, -1120469720);
                                                }
                                            }
                                        }

                                        var9 = var25;
                                        break;
                                    }

                                    ++var25;
                                    if (var25 >= var12) {
                                        var25 = 0;
                                    }

                                    ++var27;
                                }
                            }

                            if (var30 + var23 > class322.field832) {
                                var23 = class322.field832 - var30;
                            } else {
                                var10 = false;
                            }

                            int[] var39;
                            if (class322.field831 == var24) {
                                this.method4303(var21, var4, var6 + var8, var30, var22, var23, -22985350);
                                if (var10) {
                                    if (var2 == -484575331) {
                                        throw new IllegalStateException();
                                    }

                                    return var3;
                                }

                                var10 = true;
                                var39 = var19[var13++];
                                var39[0] = var8;
                                var39[1] = var24;
                                var39[2] = var30 + var23;
                                int[][] var40 = var20;
                                var20 = var19;
                                var19 = var40;
                                var12 = var13;
                                var13 = 0;
                                var7 = var6;
                                var6 = class977.method1813(var21, class322.field831, (byte) -66);
                                var5 = var6 - var7;
                                var8 = 0;
                                var27 = var5;
                                if (var5 < 0) {
                                    var27 = var5 + class322.field831;
                                }

                                if (var27 > class322.field831) {
                                    var27 -= class322.field831;
                                }

                                var9 = 0;

                                while (true) {
                                    int[] var42 = var20[var9];
                                    if (var27 >= var42[0] && var27 <= var42[1]) {
                                        var11 = false;
                                        break;
                                    }

                                    ++var9;
                                    if (var9 >= var12) {
                                        var9 = 0;
                                    }
                                }
                            } else {
                                var39 = var19[var13++];
                                var39[0] = var8;
                                var39[1] = var24;
                                var39[2] = var30 + var23;
                                this.method4303(var21, var4, var6 + var8, var30, var22, var23, -1208339553);
                                var8 = var24;
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        } catch (RuntimeException var38) {
            throw class158.method3445(var38, "ahv.i(" + ')');
        }
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            switch (var1) {
                case 0:
                    this.field7598 = var2.method6371();
                    break;
                case 1:
                    this.field7599 = var2.method6374();
                    break;
                case 2:
                    this.field7596 = var2.method6374();
                    break;
                case 3:
                    this.field7601 = var2.method6374();
                    break;
                case 4:
                    this.field7592 = var2.method6374();
                    break;
                case 5:
                    this.field7603 = var2.method6374();
                    break;
                case 6:
                    this.field7604 = var2.method6371();
                    break;
                case 7:
                    this.field7605 = var2.method6374();
                    break;
                case 8:
                    this.field7606 = var2.method6374();
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ahv.r(" + ')');
        }
    }

    final void method4303(Random var1, int[][] var2, int var3, int var4, int var5, int var6, int var7) {
        try {
            int var8 = this.field7606 > 0 ? 4096 - class977.method1813(var1, this.field7606, (byte) 90) : 4096;
            int var9 = this.field7607 * this.field7605 >> 12;
            int var10 = this.field7607 - (var9 > 0 ? class977.method1813(var1, var9, (byte) -95) : 0);
            if (var3 >= class322.field831) {
                var3 -= class322.field831;
            }

            int var11;
            int var12;
            if (var10 > 0) {
                if (var6 > 0 && var5 > 0) {
                    var11 = var5 / 2;
                    var12 = var6 / 2;
                    int var13 = var11 < var10 ? var11 : var10;
                    int var14 = var12 < var10 ? var12 : var10;
                    int var15 = var13 + var3;
                    int var16 = var5 - 2 * var13;

                    for (int var17 = 0; var17 < var6; ++var17) {
                        int[] var18 = var2[var4 + var17];
                        int var19;
                        int var20;
                        int var21;
                        if (var17 < var14) {
                            var19 = var8 * var17 / var14;
                            if (this.field7604 == 0) {
                                for (var20 = 0; var20 < var13; ++var20) {
                                    var21 = var20 * var8 / var13;
                                    var18[var3 + var20 & class322.field829] = var18[var5 + var3 - var20 - 1 & class322.field829] = var21 * var19 >> 12;
                                }
                            } else {
                                for (var20 = 0; var20 < var13; ++var20) {
                                    var21 = var8 * var20 / var13;
                                    var18[var20 + var3 & class322.field829] = var18[var5 + var3 - var20 - 1 & class322.field829] = var21 < var19 ? var21 : var19;
                                }
                            }

                            if (var15 + var16 > class322.field831) {
                                var20 = class322.field831 - var15;
                                class901.method6354(var18, var15, var20, var19);
                                class901.method6354(var18, 0, var16 - var20, var19);
                            } else {
                                class901.method6354(var18, var15, var16, var19);
                            }
                        } else {
                            var19 = var6 - var17 - 1;
                            if (var19 < var14) {
                                var20 = var19 * var8 / var14;
                                int var22;
                                if (this.field7604 == 0) {
                                    for (var21 = 0; var21 < var13; ++var21) {
                                        var22 = var21 * var8 / var13;
                                        var18[var21 + var3 & class322.field829] = var18[var3 + var5 - var21 - 1 & class322.field829] = var22 * var20 >> 12;
                                    }
                                } else {
                                    for (var21 = 0; var21 < var13; ++var21) {
                                        var22 = var8 * var21 / var13;
                                        var18[var21 + var3 & class322.field829] = var18[var3 + var5 - var21 - 1 & class322.field829] = var22 < var20 ? var22 : var20;
                                    }
                                }

                                if (var15 + var16 > class322.field831) {
                                    var21 = class322.field831 - var15;
                                    class901.method6354(var18, var15, var21, var20);
                                    class901.method6354(var18, 0, var16 - var21, var20);
                                } else {
                                    class901.method6354(var18, var15, var16, var20);
                                }
                            } else {
                                for (var20 = 0; var20 < var13; ++var20) {
                                    var18[var20 + var3 & class322.field829] = var18[var3 + var5 - var20 - 1 & class322.field829] = var8 * var20 / var13;
                                }

                                if (var15 + var16 > class322.field831) {
                                    var20 = class322.field831 - var15;
                                    class901.method6354(var18, var15, var20, var8);
                                    class901.method6354(var18, 0, var16 - var20, var8);
                                } else {
                                    class901.method6354(var18, var15, var16, var8);
                                }
                            }
                        }
                    }
                }
            } else if (var5 + var3 > class322.field831) {
                var11 = class322.field831 - var3;

                for (var12 = 0; var12 < var6; ++var12) {
                    int[] var24 = var2[var4 + var12];
                    class901.method6354(var24, var3, var11, var8);
                    class901.method6354(var24, 0, var5 - var11, var8);
                }
            } else {
                for (var11 = 0; var11 < var6; ++var11) {
                    class901.method6354(var2[var4 + var11], var3, var5, var8);
                }
            }

        } catch (RuntimeException var23) {
            throw class158.method3445(var23, "ahv.ac(" + ')');
        }
    }

    void method205(int var1) {
    }
}
