import java.nio.ByteBuffer;

public class class74 {
    static float field1451;
    class525 field1436;
    class686[][] field1437;
    class525 field1438;
    class92 field1439;
    int field1440 = 64;
    int field1441 = 768;
    int field1442;
    class920 field1443;
    int field1444 = 64;
    int[] field1445;
    int[] field1446;
    int[] field1447;
    int field1448 = class949.method1955(1600, 308928473);
    class686[][] field1449;
    int field1450 = 1600;

    class74(class325 var1) {
        this.field1444 = 64;
        this.field1445 = new int[8191];
        this.field1446 = new int[1600];
        this.field1447 = new int[64];
        this.field1437 = new class686[1600][64];
        this.field1449 = new class686[64][768];
        this.field1442 = 0;
        this.field1439 = var1.method663(new class39[]{new class39(new class61[]{class61.field1601, class61.field1588, class61.field1590}), new class39(class61.field1587)});
        this.field1438 = var1.method641(true);
        this.field1436 = var1.method641(false);
        this.field1436.method2237(393168, 12);
        this.field1443 = var1.method640(false);
        this.field1443.method6489(49146);
        ByteBuffer var2 = var1.field660;
        var2.clear();

        int var3;
        for (var3 = 0; var3 < 8191; ++var3) {
            int var4 = var3 * 4;
            var2.putShort((short) var4);
            var2.putShort((short) (var4 + 1));
            var2.putShort((short) (var4 + 2));
            var2.putShort((short) (var4 + 2));
            var2.putShort((short) (var4 + 3));
            var2.putShort((short) var4);
        }

        this.field1443.method1977(0, var2.position(), var1.field661);
        var2.clear();

        for (var3 = 0; var3 < 8191; ++var3) {
            var2.putFloat(0.0F);
            var2.putFloat(-1.0F);
            var2.putFloat(0.0F);
            var2.putFloat(0.0F);
            var2.putFloat(-1.0F);
            var2.putFloat(0.0F);
            var2.putFloat(0.0F);
            var2.putFloat(-1.0F);
            var2.putFloat(0.0F);
            var2.putFloat(0.0F);
            var2.putFloat(-1.0F);
            var2.putFloat(0.0F);
        }

        this.field1436.method1977(0, var2.position(), var1.field661);
    }

    void method1100(class325 var1) {
        this.field1438.method2237(786336, 24);
    }

    void method1101() {
        this.field1438.method2755();
    }

    void method1102(class325 var1, class874 var2) {
        var1.method4869(false);
        field1451 = var1.field735;
        float var3 = var1.field674.field325[2];
        float var4 = var1.field674.field325[6];
        float var5 = var1.field674.field325[10];
        float var6 = var1.field674.field325[14];
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

            this.field1445[var7++] = var13;
        }

        int var20 = var9 - var8;
        int var21;
        if (var20 + 2 > 1600) {
            var21 = 1 + class949.method1955(var20, -1647802809) - this.field1448;
            var20 = (var20 >> var21) + 2;
        } else {
            var21 = 0;
            var20 += 2;
        }

        class846 var22 = var10.field8726;
        var7 = 0;
        var1.method643(this.field1443);
        class834 var14 = var1.field693;
        var14.method5412(class344.field326);
        var14.field9168.method299();
        var14.field9167 = -1;
        int var15 = -2;
        boolean var16 = true;

        for (boolean var17 = true; var22 != var10; this.method1103(var1, var20)) {
            this.field1442 = 0;

            int var18;
            for (var18 = 0; var18 < var20; ++var18) {
                this.field1446[var18] = 0;
            }

            for (var18 = 0; var18 < 64; ++var18) {
                this.field1447[var18] = 0;
            }

            for (; var22 != var10; var22 = var22.field8726) {
                class686 var23 = (class686) var22;
                if (var17) {
                    var15 = var23.field7617;
                    var16 = var23.field7610;
                    var17 = false;
                }

                if (var7 > 0 && (var15 != var23.field7617 || var16 != var23.field7610)) {
                    var17 = true;
                    break;
                }

                int var19 = this.field1445[var7++] - var8 >> var21;
                if (var19 < 1600) {
                    if (this.field1446[var19] < 64) {
                        this.field1437[var19][this.field1446[var19]++] = var23;
                    } else {
                        if (this.field1446[var19] == 64) {
                            if (this.field1442 == 64) {
                                continue;
                            }

                            this.field1446[var19] += 1 + this.field1442++;
                        }

                        class686[] var10000 = this.field1449[this.field1446[var19] - 64 - 1];
                        int var10002 = this.field1446[var19] - 64 - 1;
                        int var10004 = this.field1447[this.field1446[var19] - 64 - 1];
                        this.field1447[var10002] = this.field1447[this.field1446[var19] - 64 - 1] + 1;
                        var10000[var10004] = var23;
                    }
                }
            }

            var14.field9166 = var1.field795.method4727(var15 >= 0 ? var15 : -1);
            if (var16 && var1.field735 != field1451) {
                var1.method5063(field1451);
            } else if (var1.field735 != 1.0F) {
                var1.method5063(1.0F);
            }
        }

        if (var1.field735 != field1451) {
            var1.method5063(field1451);
        }

        var1.method4869(true);
    }

    void method1103(class325 var1, int var2) {
        int var3 = 0;
        class344 var4 = var1.field674;
        float var5 = var4.field325[0];
        float var6 = var4.field325[4];
        float var7 = var4.field325[8];
        float var8 = var4.field325[1];
        float var9 = var4.field325[5];
        float var10 = var4.field325[9];
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        ByteBuffer var20 = var1.field660;
        var20.clear();

        for (int var21 = var2 - 1; var21 >= 0; --var21) {
            int var22 = this.field1446[var21] > 64 ? 64 : this.field1446[var21];
            if (var22 > 0) {
                int var23;
                byte var27;
                byte var28;
                byte var29;
                float var31;
                float var32;
                for (var23 = var22 - 1; var23 >= 0; --var23) {
                    class686 var24 = this.field1437[var21][var23];
                    int var25 = var24.field7615;
                    byte var26 = (byte) (var25 >> 16);
                    var27 = (byte) (var25 >> 8);
                    var28 = (byte) var25;
                    var29 = (byte) (var25 >>> 24);
                    float var30 = (float) (var24.field7608 >> 12);
                    var31 = (float) (var24.field7612 >> 12);
                    var32 = (float) (var24.field7613 >> 12);
                    int var33 = var24.field7614 >> 12;
                    var20.putFloat(var30 + var11 * (float) (-var33));
                    var20.putFloat(var31 + var12 * (float) (-var33));
                    var20.putFloat(var32 + var13 * (float) (-var33));
                    if (var1.field790 == 0) {
                        var20.put(var28);
                        var20.put(var27);
                        var20.put(var26);
                        var20.put(var29);
                    } else {
                        var20.put(var26);
                        var20.put(var27);
                        var20.put(var28);
                        var20.put(var29);
                    }

                    var20.putFloat(0.0F);
                    var20.putFloat(0.0F);
                    var20.putFloat(var30 + var17 * (float) var33);
                    var20.putFloat(var31 + var18 * (float) var33);
                    var20.putFloat(var32 + var19 * (float) var33);
                    if (var1.field790 == 0) {
                        var20.put(var28);
                        var20.put(var27);
                        var20.put(var26);
                        var20.put(var29);
                    } else {
                        var20.put(var26);
                        var20.put(var27);
                        var20.put(var28);
                        var20.put(var29);
                    }

                    var20.putFloat(0.0F);
                    var20.putFloat(1.0F);
                    var20.putFloat(var30 + var11 * (float) var33);
                    var20.putFloat(var31 + var12 * (float) var33);
                    var20.putFloat(var32 + var13 * (float) var33);
                    if (var1.field790 == 0) {
                        var20.put(var28);
                        var20.put(var27);
                        var20.put(var26);
                        var20.put(var29);
                    } else {
                        var20.put(var26);
                        var20.put(var27);
                        var20.put(var28);
                        var20.put(var29);
                    }

                    var20.putFloat(1.0F);
                    var20.putFloat(1.0F);
                    var20.putFloat(var30 + var14 * (float) var33);
                    var20.putFloat(var31 + var15 * (float) var33);
                    var20.putFloat(var32 + var16 * (float) var33);
                    if (var1.field790 == 0) {
                        var20.put(var28);
                        var20.put(var27);
                        var20.put(var26);
                        var20.put(var29);
                    } else {
                        var20.put(var26);
                        var20.put(var27);
                        var20.put(var28);
                        var20.put(var29);
                    }

                    var20.putFloat(1.0F);
                    var20.putFloat(0.0F);
                    ++var3;
                }

                if (this.field1446[var21] > 64) {
                    var23 = this.field1446[var21] - 64 - 1;

                    for (int var36 = this.field1447[var23] - 1; var36 >= 0; --var36) {
                        class686 var37 = this.field1449[var23][var36];
                        int var38 = var37.field7615;
                        var27 = (byte) (var38 >> 16);
                        var28 = (byte) (var38 >> 8);
                        var29 = (byte) var38;
                        byte var39 = (byte) (var38 >>> 24);
                        var31 = (float) (var37.field7608 >> 12);
                        var32 = (float) (var37.field7612 >> 12);
                        float var40 = (float) (var37.field7613 >> 12);
                        int var34 = var37.field7614 >> 12;
                        var20.putFloat(var31 + var11 * (float) (-var34));
                        var20.putFloat(var32 + var12 * (float) (-var34));
                        var20.putFloat(var40 + var13 * (float) (-var34));
                        if (var1.field790 == 0) {
                            var20.put(var29);
                            var20.put(var28);
                            var20.put(var27);
                            var20.put(var39);
                        } else {
                            var20.put(var27);
                            var20.put(var28);
                            var20.put(var29);
                            var20.put(var39);
                        }

                        var20.putFloat(0.0F);
                        var20.putFloat(0.0F);
                        var20.putFloat(var31 + var17 * (float) var34);
                        var20.putFloat(var32 + var18 * (float) var34);
                        var20.putFloat(var40 + var19 * (float) var34);
                        if (var1.field790 == 0) {
                            var20.put(var29);
                            var20.put(var28);
                            var20.put(var27);
                            var20.put(var39);
                        } else {
                            var20.put(var27);
                            var20.put(var28);
                            var20.put(var29);
                            var20.put(var39);
                        }

                        var20.putFloat(0.0F);
                        var20.putFloat(1.0F);
                        var20.putFloat(var31 + var11 * (float) var34);
                        var20.putFloat(var32 + var12 * (float) var34);
                        var20.putFloat(var40 + var13 * (float) var34);
                        if (var1.field790 == 0) {
                            var20.put(var29);
                            var20.put(var28);
                            var20.put(var27);
                            var20.put(var39);
                        } else {
                            var20.put(var27);
                            var20.put(var28);
                            var20.put(var29);
                            var20.put(var39);
                        }

                        var20.putFloat(1.0F);
                        var20.putFloat(1.0F);
                        var20.putFloat(var31 + var14 * (float) var34);
                        var20.putFloat(var32 + var15 * (float) var34);
                        var20.putFloat(var40 + var16 * (float) var34);
                        if (var1.field790 == 0) {
                            var20.put(var29);
                            var20.put(var28);
                            var20.put(var27);
                            var20.put(var39);
                        } else {
                            var20.put(var27);
                            var20.put(var28);
                            var20.put(var29);
                            var20.put(var39);
                        }

                        var20.putFloat(1.0F);
                        var20.putFloat(0.0F);
                        ++var3;
                    }
                }
            }
        }

        this.field1438.method1977(0, var20.position(), var1.field661);
        var1.method642(0, this.field1438);
        var1.method642(1, this.field1436);
        var1.method714(this.field1439);
        class834 var35 = var1.field693;
        var35.method5410(var3);
    }
}
