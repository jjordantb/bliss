import jaggl.OpenGL;

public class class680 {
    static float field7543;
    class847 field7540;
    int field7541 = 1600;
    int field7542 = 64;
    class269 field7544;
    class847 field7545;
    class847 field7546;
    int field7547 = 768;
    class782 field7548 = new class782(786336);
    int field7549;
    float[] field7550 = new float[16];
    int[] field7551;
    int[] field7552;
    int[] field7553;
    class686[][] field7554;
    int field7555 = 64;
    int field7556;
    class686[][] field7557;

    class680() {
        this.field7542 = 64;
        this.field7547 = 768;
        this.field7541 = 1600;
        this.field7549 = class949.method1955(1600, -1704489835);
        this.field7555 = 64;
        this.field7551 = new int[8191];
        this.field7552 = new int[1600];
        this.field7553 = new int[64];
        this.field7554 = new class686[1600][64];
        this.field7557 = new class686[64][768];
        this.field7556 = 0;
    }

    void method4281(class13 var1, class874 var2) {
        if (var1.field6797 != null) {
            this.method4283(var1);
            float var3 = var1.field6797.field325[2];
            float var4 = var1.field6797.field325[6];
            float var5 = var1.field6797.field325[10];
            float var6 = var1.field6797.field325[14];

            try {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class846 var10 = var2.field9777.field9787;

                for (class846 var11 = var10.field8726; var11 != var10; var11 = var11.field8726) {
                    class686 var12 = (class686) var11;
                    int var13 = (int) (var3 * (float) (var12.field7608 >> 12) + var4 * (float) (var12.field7612 >> 12) + var5 * (float) (var12.field7613 >> 12) + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }

                    if (var13 < var8) {
                        var8 = var13;
                    }

                    this.field7551[var7++] = var13;
                }

                int var20 = var9 - var8;
                int var21;
                if (var20 + 2 > 1600) {
                    var21 = 1 + class949.method1955(var20, 1151745545) - this.field7549;
                    var20 = (var20 >> var21) + 2;
                } else {
                    var21 = 0;
                    var20 += 2;
                }

                class846 var22 = var10.field8726;
                var7 = 0;
                int var14 = -2;
                boolean var15 = true;

                for (boolean var16 = true; var22 != var10; this.method4282(var1, var20)) {
                    this.field7556 = 0;

                    int var17;
                    for (var17 = 0; var17 < var20; ++var17) {
                        this.field7552[var17] = 0;
                    }

                    for (var17 = 0; var17 < 64; ++var17) {
                        this.field7553[var17] = 0;
                    }

                    for (; var22 != var10; var22 = var22.field8726) {
                        class686 var23 = (class686) var22;
                        if (var16) {
                            var14 = var23.field7617;
                            var15 = var23.field7610;
                            var16 = false;
                        }

                        if (var7 > 0 && (var14 != var23.field7617 || var15 != var23.field7610)) {
                            var16 = true;
                            break;
                        }

                        int var18 = this.field7551[var7++] - var8 >> var21;
                        if (var18 < 1600) {
                            if (this.field7552[var18] < 64) {
                                this.field7554[var18][this.field7552[var18]++] = var23;
                            } else {
                                if (this.field7552[var18] == 64) {
                                    if (this.field7556 == 64) {
                                        continue;
                                    }

                                    this.field7552[var18] += 1 + this.field7556++;
                                }

                                class686[] var10000 = this.field7557[this.field7552[var18] - 64 - 1];
                                int var10002 = this.field7552[var18] - 64 - 1;
                                int var10004 = this.field7553[this.field7552[var18] - 64 - 1];
                                this.field7553[var10002] = this.field7553[this.field7552[var18] - 64 - 1] + 1;
                                var10000[var10004] = var23;
                            }
                        }
                    }

                    if (var14 >= 0) {
                        var1.method3658(var14);
                    } else {
                        var1.method3658(-1);
                    }

                    if (var15 && var1.field6817 != field7543) {
                        var1.method5063(field7543);
                    } else if (var1.field6817 != 1.0F) {
                        var1.method5063(1.0F);
                    }
                }
            } catch (Exception var19) {
                ;
            }

            this.method4285(var1);
        }

    }

    void method4282(class13 var1, int var2) {
        OpenGL.glGetFloatv(2982, this.field7550, 0);
        float var3 = this.field7550[0];
        float var4 = this.field7550[4];
        float var5 = this.field7550[8];
        float var6 = this.field7550[1];
        float var7 = this.field7550[5];
        float var8 = this.field7550[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field7548.field10376 = 0;
        int var18;
        int var19;
        int var20;
        class686 var21;
        int var22;
        byte var23;
        byte var24;
        byte var25;
        byte var26;
        float var27;
        float var28;
        float var29;
        int var30;
        int var31;
        int var32;
        class686 var33;
        int var34;
        byte var35;
        float var36;
        if (var1.field6830) {
            for (var18 = var2 - 1; var18 >= 0; --var18) {
                var19 = this.field7552[var18] > 64 ? 64 : this.field7552[var18];
                if (var19 > 0) {
                    for (var20 = var19 - 1; var20 >= 0; --var20) {
                        var21 = this.field7554[var18][var20];
                        var22 = var21.field7615;
                        var23 = (byte) (var22 >> 16);
                        var24 = (byte) (var22 >> 8);
                        var25 = (byte) var22;
                        var26 = (byte) (var22 >>> 24);
                        var27 = (float) (var21.field7608 >> 12);
                        var28 = (float) (var21.field7612 >> 12);
                        var29 = (float) (var21.field7613 >> 12);
                        var30 = var21.field7614 >> 12;
                        this.field7548.method2468(0.0F);
                        this.field7548.method2468(0.0F);
                        this.field7548.method2468(var27 + var9 * (float) (-var30));
                        this.field7548.method2468(var28 + var10 * (float) (-var30));
                        this.field7548.method2468(var29 + var11 * (float) (-var30));
                        this.field7548.method6361(var23);
                        this.field7548.method6361(var24);
                        this.field7548.method6361(var25);
                        this.field7548.method6361(var26);
                        this.field7548.method2468(0.0F);
                        this.field7548.method2468(1.0F);
                        this.field7548.method2468(var27 + var15 * (float) var30);
                        this.field7548.method2468(var28 + var16 * (float) var30);
                        this.field7548.method2468(var29 + var17 * (float) var30);
                        this.field7548.method6361(var23);
                        this.field7548.method6361(var24);
                        this.field7548.method6361(var25);
                        this.field7548.method6361(var26);
                        this.field7548.method2468(1.0F);
                        this.field7548.method2468(1.0F);
                        this.field7548.method2468(var27 + var9 * (float) var30);
                        this.field7548.method2468(var28 + var10 * (float) var30);
                        this.field7548.method2468(var29 + var11 * (float) var30);
                        this.field7548.method6361(var23);
                        this.field7548.method6361(var24);
                        this.field7548.method6361(var25);
                        this.field7548.method6361(var26);
                        this.field7548.method2468(1.0F);
                        this.field7548.method2468(0.0F);
                        this.field7548.method2468(var27 + var12 * (float) var30);
                        this.field7548.method2468(var28 + var13 * (float) var30);
                        this.field7548.method2468(var29 + var14 * (float) var30);
                        this.field7548.method6361(var23);
                        this.field7548.method6361(var24);
                        this.field7548.method6361(var25);
                        this.field7548.method6361(var26);
                    }

                    if (this.field7552[var18] > 64) {
                        var20 = this.field7552[var18] - 64 - 1;

                        for (var32 = this.field7553[var20] - 1; var32 >= 0; --var32) {
                            var33 = this.field7557[var20][var32];
                            var34 = var33.field7615;
                            var24 = (byte) (var34 >> 16);
                            var25 = (byte) (var34 >> 8);
                            var26 = (byte) var34;
                            var35 = (byte) (var34 >>> 24);
                            var28 = (float) (var33.field7608 >> 12);
                            var29 = (float) (var33.field7612 >> 12);
                            var36 = (float) (var33.field7613 >> 12);
                            var31 = var33.field7614 >> 12;
                            this.field7548.method2468(0.0F);
                            this.field7548.method2468(0.0F);
                            this.field7548.method2468(var28 + var9 * (float) (-var31));
                            this.field7548.method2468(var29 + var10 * (float) (-var31));
                            this.field7548.method2468(var36 + var11 * (float) (-var31));
                            this.field7548.method6361(var24);
                            this.field7548.method6361(var25);
                            this.field7548.method6361(var26);
                            this.field7548.method6361(var35);
                            this.field7548.method2468(0.0F);
                            this.field7548.method2468(1.0F);
                            this.field7548.method2468(var28 + var15 * (float) var31);
                            this.field7548.method2468(var29 + var16 * (float) var31);
                            this.field7548.method2468(var36 + var17 * (float) var31);
                            this.field7548.method6361(var24);
                            this.field7548.method6361(var25);
                            this.field7548.method6361(var26);
                            this.field7548.method6361(var35);
                            this.field7548.method2468(1.0F);
                            this.field7548.method2468(1.0F);
                            this.field7548.method2468(var28 + var9 * (float) var31);
                            this.field7548.method2468(var29 + var10 * (float) var31);
                            this.field7548.method2468(var36 + var11 * (float) var31);
                            this.field7548.method6361(var24);
                            this.field7548.method6361(var25);
                            this.field7548.method6361(var26);
                            this.field7548.method6361(var35);
                            this.field7548.method2468(1.0F);
                            this.field7548.method2468(0.0F);
                            this.field7548.method2468(var28 + var12 * (float) var31);
                            this.field7548.method2468(var29 + var13 * (float) var31);
                            this.field7548.method2468(var36 + var14 * (float) var31);
                            this.field7548.method6361(var24);
                            this.field7548.method6361(var25);
                            this.field7548.method6361(var26);
                            this.field7548.method6361(var35);
                        }
                    }
                }
            }
        } else {
            for (var18 = var2 - 1; var18 >= 0; --var18) {
                var19 = this.field7552[var18] > 64 ? 64 : this.field7552[var18];
                if (var19 > 0) {
                    for (var20 = var19 - 1; var20 >= 0; --var20) {
                        var21 = this.field7554[var18][var20];
                        var22 = var21.field7615;
                        var23 = (byte) (var22 >> 16);
                        var24 = (byte) (var22 >> 8);
                        var25 = (byte) var22;
                        var26 = (byte) (var22 >>> 24);
                        var27 = (float) (var21.field7608 >> 12);
                        var28 = (float) (var21.field7612 >> 12);
                        var29 = (float) (var21.field7613 >> 12);
                        var30 = var21.field7614 >> 12;
                        this.field7548.method2469(0.0F);
                        this.field7548.method2469(0.0F);
                        this.field7548.method2469(var27 + var9 * (float) (-var30));
                        this.field7548.method2469(var28 + var10 * (float) (-var30));
                        this.field7548.method2469(var29 + var11 * (float) (-var30));
                        this.field7548.method6361(var23);
                        this.field7548.method6361(var24);
                        this.field7548.method6361(var25);
                        this.field7548.method6361(var26);
                        this.field7548.method2469(0.0F);
                        this.field7548.method2469(1.0F);
                        this.field7548.method2469(var27 + var15 * (float) var30);
                        this.field7548.method2469(var28 + var16 * (float) var30);
                        this.field7548.method2469(var29 + var17 * (float) var30);
                        this.field7548.method6361(var23);
                        this.field7548.method6361(var24);
                        this.field7548.method6361(var25);
                        this.field7548.method6361(var26);
                        this.field7548.method2469(1.0F);
                        this.field7548.method2469(1.0F);
                        this.field7548.method2469(var27 + var9 * (float) var30);
                        this.field7548.method2469(var28 + var10 * (float) var30);
                        this.field7548.method2469(var29 + var11 * (float) var30);
                        this.field7548.method6361(var23);
                        this.field7548.method6361(var24);
                        this.field7548.method6361(var25);
                        this.field7548.method6361(var26);
                        this.field7548.method2469(1.0F);
                        this.field7548.method2469(0.0F);
                        this.field7548.method2469(var27 + var12 * (float) var30);
                        this.field7548.method2469(var28 + var13 * (float) var30);
                        this.field7548.method2469(var29 + var14 * (float) var30);
                        this.field7548.method6361(var23);
                        this.field7548.method6361(var24);
                        this.field7548.method6361(var25);
                        this.field7548.method6361(var26);
                    }

                    if (this.field7552[var18] > 64) {
                        var20 = this.field7552[var18] - 64 - 1;

                        for (var32 = this.field7553[var20] - 1; var32 >= 0; --var32) {
                            var33 = this.field7557[var20][var32];
                            var34 = var33.field7615;
                            var24 = (byte) (var34 >> 16);
                            var25 = (byte) (var34 >> 8);
                            var26 = (byte) var34;
                            var35 = (byte) (var34 >>> 24);
                            var28 = (float) (var33.field7608 >> 12);
                            var29 = (float) (var33.field7612 >> 12);
                            var36 = (float) (var33.field7613 >> 12);
                            var31 = var33.field7614 >> 12;
                            this.field7548.method2469(0.0F);
                            this.field7548.method2469(0.0F);
                            this.field7548.method2469(var28 + var9 * (float) (-var31));
                            this.field7548.method2469(var29 + var10 * (float) (-var31));
                            this.field7548.method2469(var36 + var11 * (float) (-var31));
                            this.field7548.method6361(var24);
                            this.field7548.method6361(var25);
                            this.field7548.method6361(var26);
                            this.field7548.method6361(var35);
                            this.field7548.method2469(0.0F);
                            this.field7548.method2469(1.0F);
                            this.field7548.method2469(var28 + var15 * (float) var31);
                            this.field7548.method2469(var29 + var16 * (float) var31);
                            this.field7548.method2469(var36 + var17 * (float) var31);
                            this.field7548.method6361(var24);
                            this.field7548.method6361(var25);
                            this.field7548.method6361(var26);
                            this.field7548.method6361(var35);
                            this.field7548.method2469(1.0F);
                            this.field7548.method2469(1.0F);
                            this.field7548.method2469(var28 + var9 * (float) var31);
                            this.field7548.method2469(var29 + var10 * (float) var31);
                            this.field7548.method2469(var36 + var11 * (float) var31);
                            this.field7548.method6361(var24);
                            this.field7548.method6361(var25);
                            this.field7548.method6361(var26);
                            this.field7548.method6361(var35);
                            this.field7548.method2469(1.0F);
                            this.field7548.method2469(0.0F);
                            this.field7548.method2469(var28 + var12 * (float) var31);
                            this.field7548.method2469(var29 + var13 * (float) var31);
                            this.field7548.method2469(var36 + var14 * (float) var31);
                            this.field7548.method6361(var24);
                            this.field7548.method6361(var25);
                            this.field7548.method6361(var26);
                            this.field7548.method6361(var35);
                        }
                    }
                }
            }
        }

        if (this.field7548.field10376 != 0) {
            this.field7544.method4536(24, this.field7548.field10375, this.field7548.field10376);
            var1.method3631(this.field7546, (class847) null, this.field7540, this.field7545);
            var1.method3668(7, 0, this.field7548.field10376 / 24);
        }

    }

    void method4283(class13 var1) {
        field7543 = var1.field6817;
        var1.method3635();
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        var1.method3664(false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    void method4284(class13 var1) {
        this.field7544 = var1.method3627(24, (byte[]) null, 196584, true);
        this.field7545 = new class847(this.field7544, 5126, 2, 0);
        this.field7546 = new class847(this.field7544, 5126, 3, 8);
        this.field7540 = new class847(this.field7544, 5121, 4, 20);
    }

    void method4285(class13 var1) {
        var1.method3664(true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (var1.field6817 != field7543) {
            var1.method5063(field7543);
        }

    }
}
