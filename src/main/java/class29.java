public class class29 extends Node {
    static int[] field6517;
    static float[] field6522;
    static int field6524;
    static float[] field6525;
    static int field6526;
    static int field6527;
    static class598[] field6528;
    static class233[] field6529;
    static class973[] field6531;
    static boolean[] field6532;
    static int[] field6533;
    static boolean field6534 = false;
    static byte[] field6539;
    static float[] field6540;
    static float[] field6542;
    static float[] field6543;
    static class560[] field6544;
    static float[] field6545;
    static int[] field6546;
    static int field6548;
    static float[] field6549;
    int field6518;
    int field6519;
    int field6520;
    int field6521;
    float[] field6523;
    int field6530;
    int field6535;
    boolean field6536;
    int field6537;
    boolean field6538;
    byte[] field6541;
    byte[][] field6547;
    int field6550;

    class29(byte[] var1) {
        this.method3505(var1);
    }

    static void method3506(byte[] var0, int var1) {
        field6539 = var0;
        field6524 = var1;
        field6548 = 0;
    }

    static int method3507() {
        int var0 = field6539[field6524] >> field6548 & 1;
        ++field6548;
        field6524 += field6548 >> 3;
        field6548 &= 7;
        return var0;
    }

    static boolean method3508(class180 var0) {
        if (!field6534) {
            byte[] var1 = var0.method3285(0, 0, (byte) -48);
            if (var1 == null) {
                return false;
            }

            method3513(var1);
        }

        return true;
    }

    static class29 method3509(class180 var0, int var1, int var2) {
        if (!method3508(var0)) {
            var0.method3260(var1, var2, -875831506);
            return null;
        } else {
            byte[] var3 = var0.method3285(var1, var2, (byte) -123);
            return var3 == null ? null : new class29(var3);
        }
    }

    public static class29 method3510(class180 var0, int var1) {
        if (!method3508(var0)) {
            var0.method3280(var1, -457216440);
            return null;
        } else {
            byte[] var2 = var0.method3264(var1, (byte) 72);
            return var2 == null ? null : new class29(var2);
        }
    }

    static float method3512(int var0) {
        int var1 = var0 & 2097151;
        int var2 = var0 & Integer.MIN_VALUE;
        int var3 = (var0 & 2145386496) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }

        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    static void method3513(byte[] var0) {
        method3506(var0, 0);
        field6526 = 1 << method3514(4);
        field6527 = 1 << method3514(4);
        field6549 = new float[field6527];

        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        for (var1 = 0; var1 < 2; ++var1) {
            var2 = var1 != 0 ? field6527 : field6526;
            var3 = var2 >> 1;
            var4 = var2 >> 2;
            var5 = var2 >> 3;
            float[] var6 = new float[var3];

            for (int var7 = 0; var7 < var4; ++var7) {
                var6[2 * var7] = (float) Math.cos((double) (4 * var7) * 3.141592653589793D / (double) var2);
                var6[2 * var7 + 1] = -((float) Math.sin((double) (4 * var7) * 3.141592653589793D / (double) var2));
            }

            float[] var13 = new float[var3];

            for (int var8 = 0; var8 < var4; ++var8) {
                var13[2 * var8] = (float) Math.cos((double) (2 * var8 + 1) * 3.141592653589793D / (double) (2 * var2));
                var13[2 * var8 + 1] = (float) Math.sin((double) (2 * var8 + 1) * 3.141592653589793D / (double) (2 * var2));
            }

            float[] var14 = new float[var4];

            for (int var9 = 0; var9 < var5; ++var9) {
                var14[2 * var9] = (float) Math.cos((double) (4 * var9 + 2) * 3.141592653589793D / (double) var2);
                var14[2 * var9 + 1] = -((float) Math.sin((double) (4 * var9 + 2) * 3.141592653589793D / (double) var2));
            }

            int[] var15 = new int[var5];
            int var10 = class949.method1955(var5 - 1, -1369747861);

            for (int var11 = 0; var11 < var5; ++var11) {
                var15[var11] = class756.method2714(var11, var10, (byte) 19);
            }

            if (var1 != 0) {
                field6543 = var6;
                field6525 = var13;
                field6545 = var14;
                field6517 = var15;
            } else {
                field6540 = var6;
                field6522 = var13;
                field6542 = var14;
                field6546 = var15;
            }
        }

        var1 = method3514(8) + 1;
        field6528 = new class598[var1];

        for (var2 = 0; var2 < var1; ++var2) {
            field6528[var2] = new class598();
        }

        var2 = method3514(6) + 1;

        for (var3 = 0; var3 < var2; ++var3) {
            method3514(16);
        }

        var2 = method3514(6) + 1;
        field6544 = new class560[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            field6544[var3] = new class560();
        }

        var3 = method3514(6) + 1;
        field6529 = new class233[var3];

        for (var4 = 0; var4 < var3; ++var4) {
            field6529[var4] = new class233();
        }

        var4 = method3514(6) + 1;
        field6531 = new class973[var4];

        for (var5 = 0; var5 < var4; ++var5) {
            field6531[var5] = new class973();
        }

        var5 = method3514(6) + 1;
        field6532 = new boolean[var5];
        field6533 = new int[var5];

        for (int var12 = 0; var12 < var5; ++var12) {
            field6532[var12] = method3507() != 0;
            method3514(16);
            method3514(16);
            field6533[var12] = method3514(8);
        }

        field6534 = true;
    }

    static int method3514(int var0) {
        int var1 = 0;

        int var2;
        int var3;
        for (var2 = 0; var0 >= 8 - field6548; var0 -= var3) {
            var3 = 8 - field6548;
            int var4 = (1 << var3) - 1;
            var1 += (field6539[field6524] >> field6548 & var4) << var2;
            field6548 = 0;
            ++field6524;
            var2 += var3;
        }

        if (var0 > 0) {
            var3 = (1 << var0) - 1;
            var1 += (field6539[field6524] >> field6548 & var3) << var2;
            field6548 += var0;
        }

        return var1;
    }

    void method3505(byte[] var1) {
        InputStream var2 = new InputStream(var1);
        this.field6518 = var2.method6420((byte) 55);
        this.field6535 = var2.method6420((byte) 18);
        this.field6520 = var2.method6420((byte) -10);
        this.field6521 = var2.method6420((byte) -87);
        if (this.field6521 < 0) {
            this.field6521 = ~this.field6521;
            this.field6536 = true;
        }

        int var3 = var2.method6420((byte) 96);
        this.field6547 = new byte[var3][];

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = 0;

            int var6;
            do {
                var6 = var2.method6371();
                var5 += var6;
            } while (var6 >= 255);

            byte[] var7 = new byte[var5];
            var2.method6381(var7, 0, var5, -953523806);
            this.field6547[var4] = var7;
        }

    }

    public class656 method3511(int[] var1) {
        if (var1 != null && var1[0] <= 0) {
            return null;
        } else {
            if (this.field6541 == null) {
                this.field6519 = 0;
                this.field6523 = new float[field6527];
                this.field6541 = new byte[this.field6535];
                this.field6530 = 0;
                this.field6550 = 0;
            }

            for (; this.field6550 < this.field6547.length; ++this.field6550) {
                if (var1 != null && var1[0] <= 0) {
                    return null;
                }

                float[] var2 = this.method3515(this.field6550);
                if (var2 != null) {
                    int var3 = this.field6530;
                    int var4 = var2.length;
                    if (var4 > this.field6535 - var3) {
                        var4 = this.field6535 - var3;
                    }

                    for (int var5 = 0; var5 < var4; ++var5) {
                        int var6 = (int) (128.0F + var2[var5] * 128.0F);
                        if ((var6 & -256) != 0) {
                            var6 = ~var6 >> 31;
                        }

                        this.field6541[var3++] = (byte) (var6 - 128);
                    }

                    if (var1 != null) {
                        var1[0] -= var3 - this.field6530;
                    }

                    this.field6530 = var3;
                }
            }

            this.field6523 = null;
            byte[] var7 = this.field6541;
            this.field6541 = null;
            return new class656(this.field6518, var7, this.field6520, this.field6521, this.field6536);
        }
    }

    float[] method3515(int var1) {
        method3506(this.field6547[var1], 0);
        method3507();
        int var2 = method3514(class949.method1955(field6533.length - 1, -1535771411));
        boolean var3 = field6532[var2];
        int var4 = var3 ? field6527 : field6526;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3507() != 0;
            var6 = method3507() != 0;
        }

        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field6526 >> 2);
            var9 = (var4 >> 2) + (field6526 >> 2);
            var10 = field6526 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }

        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field6526 >> 2);
            var12 = var4 - (var4 >> 2) + (field6526 >> 2);
            var13 = field6526 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }

        class973 var14 = field6531[field6533[var2]];
        int var15 = var14.field2611;
        int var16 = var14.field2613[var15];
        boolean var17 = !field6544[var16].method505();
        boolean var18 = var17;

        float[] var20;
        for (var16 = 0; var16 < var14.field2612; ++var16) {
            class233 var19 = field6529[var14.field2614[var16]];
            var20 = field6549;
            var19.method4692(var20, var4 >> 1, var18);
        }

        int var41;
        if (!var17) {
            var16 = var14.field2611;
            var41 = var14.field2613[var16];
            field6544[var41].method506(field6549, var4 >> 1);
        }

        int var22;
        int var43;
        if (var17) {
            for (var16 = var4 >> 1; var16 < var4; ++var16) {
                field6549[var16] = 0.0F;
            }
        } else {
            var16 = var4 >> 1;
            var41 = var4 >> 2;
            var43 = var4 >> 3;
            float[] var21 = field6549;

            for (var22 = 0; var22 < var16; ++var22) {
                var21[var22] *= 0.5F;
            }

            for (var22 = var16; var22 < var4; ++var22) {
                var21[var22] = -var21[var4 - var22 - 1];
            }

            float[] var45 = var3 ? field6543 : field6540;
            float[] var23 = var3 ? field6525 : field6522;
            float[] var24 = var3 ? field6545 : field6542;
            int[] var25 = var3 ? field6517 : field6546;

            int var26;
            float var27;
            float var28;
            float var29;
            float var30;
            for (var26 = 0; var26 < var41; ++var26) {
                var27 = var21[4 * var26] - var21[var4 - 4 * var26 - 1];
                var28 = var21[4 * var26 + 2] - var21[var4 - 4 * var26 - 3];
                var29 = var45[2 * var26];
                var30 = var45[2 * var26 + 1];
                var21[var4 - 4 * var26 - 1] = var27 * var29 - var28 * var30;
                var21[var4 - 4 * var26 - 3] = var27 * var30 + var28 * var29;
            }

            float var31;
            float var32;
            for (var26 = 0; var26 < var43; ++var26) {
                var27 = var21[var16 + 3 + 4 * var26];
                var28 = var21[var16 + 1 + 4 * var26];
                var29 = var21[4 * var26 + 3];
                var30 = var21[4 * var26 + 1];
                var21[var16 + 3 + 4 * var26] = var27 + var29;
                var21[var16 + 1 + 4 * var26] = var28 + var30;
                var31 = var45[var16 - 4 - 4 * var26];
                var32 = var45[var16 - 3 - 4 * var26];
                var21[4 * var26 + 3] = (var27 - var29) * var31 - (var28 - var30) * var32;
                var21[4 * var26 + 1] = (var28 - var30) * var31 + (var27 - var29) * var32;
            }

            var26 = class949.method1955(var4 - 1, 1223920235);

            int var46;
            int var47;
            int var48;
            int var49;
            for (var46 = 0; var46 < var26 - 3; ++var46) {
                var47 = var4 >> var46 + 2;
                var48 = 8 << var46;

                for (var49 = 0; var49 < 2 << var46; ++var49) {
                    int var50 = var4 - var47 * 2 * var49;
                    int var51 = var4 - var47 * (2 * var49 + 1);

                    for (int var33 = 0; var33 < var4 >> var46 + 4; ++var33) {
                        int var34 = 4 * var33;
                        float var35 = var21[var50 - 1 - var34];
                        float var36 = var21[var50 - 3 - var34];
                        float var37 = var21[var51 - 1 - var34];
                        float var38 = var21[var51 - 3 - var34];
                        var21[var50 - 1 - var34] = var35 + var37;
                        var21[var50 - 3 - var34] = var36 + var38;
                        float var39 = var45[var33 * var48];
                        float var40 = var45[var33 * var48 + 1];
                        var21[var51 - 1 - var34] = (var35 - var37) * var39 - (var36 - var38) * var40;
                        var21[var51 - 3 - var34] = (var36 - var38) * var39 + (var35 - var37) * var40;
                    }
                }
            }

            for (var46 = 1; var46 < var43 - 1; ++var46) {
                var47 = var25[var46];
                if (var46 < var47) {
                    var48 = 8 * var46;
                    var49 = 8 * var47;
                    var31 = var21[var48 + 1];
                    var21[var48 + 1] = var21[var49 + 1];
                    var21[var49 + 1] = var31;
                    var31 = var21[var48 + 3];
                    var21[var48 + 3] = var21[var49 + 3];
                    var21[var49 + 3] = var31;
                    var31 = var21[var48 + 5];
                    var21[var48 + 5] = var21[var49 + 5];
                    var21[var49 + 5] = var31;
                    var31 = var21[var48 + 7];
                    var21[var48 + 7] = var21[var49 + 7];
                    var21[var49 + 7] = var31;
                }
            }

            for (var46 = 0; var46 < var16; ++var46) {
                var21[var46] = var21[2 * var46 + 1];
            }

            for (var46 = 0; var46 < var43; ++var46) {
                var21[var4 - 1 - 2 * var46] = var21[4 * var46];
                var21[var4 - 2 - 2 * var46] = var21[4 * var46 + 1];
                var21[var4 - var41 - 1 - 2 * var46] = var21[4 * var46 + 2];
                var21[var4 - var41 - 2 - 2 * var46] = var21[4 * var46 + 3];
            }

            for (var46 = 0; var46 < var43; ++var46) {
                var28 = var24[2 * var46];
                var29 = var24[2 * var46 + 1];
                var30 = var21[var16 + 2 * var46];
                var31 = var21[var16 + 2 * var46 + 1];
                var32 = var21[var4 - 2 - 2 * var46];
                float var52 = var21[var4 - 1 - 2 * var46];
                float var53 = var29 * (var30 - var32) + var28 * (var31 + var52);
                var21[var16 + 2 * var46] = (var30 + var32 + var53) * 0.5F;
                var21[var4 - 2 - 2 * var46] = (var30 + var32 - var53) * 0.5F;
                var53 = var29 * (var31 + var52) - var28 * (var30 - var32);
                var21[var16 + 2 * var46 + 1] = (var31 - var52 + var53) * 0.5F;
                var21[var4 - 1 - 2 * var46] = (-var31 + var52 + var53) * 0.5F;
            }

            for (var46 = 0; var46 < var41; ++var46) {
                var21[var46] = var21[2 * var46 + var16] * var23[2 * var46] + var21[2 * var46 + 1 + var16] * var23[2 * var46 + 1];
                var21[var16 - 1 - var46] = var21[2 * var46 + var16] * var23[2 * var46 + 1] - var21[2 * var46 + 1 + var16] * var23[2 * var46];
            }

            for (var46 = 0; var46 < var41; ++var46) {
                var21[var4 - var41 + var46] = -var21[var46];
            }

            for (var46 = 0; var46 < var41; ++var46) {
                var21[var46] = var21[var41 + var46];
            }

            for (var46 = 0; var46 < var41; ++var46) {
                var21[var41 + var46] = -var21[var41 - var46 - 1];
            }

            for (var46 = 0; var46 < var41; ++var46) {
                var21[var16 + var46] = var21[var4 - var46 - 1];
            }

            for (var46 = var8; var46 < var9; ++var46) {
                var28 = (float) Math.sin(((double) (var46 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field6549[var46] *= (float) Math.sin(1.5707963267948966D * (double) var28 * (double) var28);
            }

            for (var46 = var11; var46 < var12; ++var46) {
                var28 = (float) Math.sin(((double) (var46 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field6549[var46] *= (float) Math.sin(1.5707963267948966D * (double) var28 * (double) var28);
            }
        }

        float[] var42 = null;
        if (this.field6519 > 0) {
            var43 = this.field6519 + var4 >> 2;
            var42 = new float[var43];
            int var44;
            if (!this.field6538) {
                for (var44 = 0; var44 < this.field6537; ++var44) {
                    var22 = (this.field6519 >> 1) + var44;
                    var42[var44] += this.field6523[var22];
                }
            }

            if (!var17) {
                for (var44 = var8; var44 < var4 >> 1; ++var44) {
                    var22 = var42.length - (var4 >> 1) + var44;
                    var42[var22] += field6549[var44];
                }
            }
        }

        var20 = this.field6523;
        this.field6523 = field6549;
        field6549 = var20;
        this.field6519 = var4;
        this.field6537 = var12 - (var4 >> 1);
        this.field6538 = var17;
        return var42;
    }
}
