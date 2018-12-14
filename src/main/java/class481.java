public class class481 {
    static int field8319 = 0;
    static int field8321 = 1;
    static int field8322 = 2;
    static int field8323 = 192;
    static class48 field8333;
    static int field8335 = 512;
    static int field8340 = 24;
    static int field8341 = 24;
    static int field8343 = 128;
    static int field8344 = 13;
    static int field8345 = 16;
    static class879 field8347;
    static class48 field8348;
    static int[] field8349 = new int[4];
    int field8320;
    boolean field8324;
    int field8325;
    int field8326;
    int field8327;
    int field8328;
    int field8329;
    int field8330;
    int field8331;
    int field8332;
    int field8334;
    class48 field8336;
    int field8337;
    int field8338;
    int field8339;
    int field8342;
    int field8346;

    public class481(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11) {
        this.field8325 = var3;
        this.field8320 = var4;
        this.field8327 = var5;
        this.field8324 = var8;
        this.field8329 = var2;
        this.field8346 = var7;
        this.field8342 = var6;
        this.field8339 = var1;
        this.field8337 = var9;
        this.field8328 = var10;
        this.field8326 = var11;
    }

    static void method4694() {
        field8347 = null;
        field8348 = null;
    }

    static void method4696(class848 var0) {
        if (field8347 == null) {
            class25 var1 = new class25(580, 1104, 1);
            var1.method3460((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
            var1.method3450(0, 128, 0);
            var1.method3450(0, -128, 0);

            for (int var2 = 0; var2 <= 24; ++var2) {
                int var3 = var2 * 8192 / 24;
                int var4 = class703.field3413[var3];
                int var5 = class703.field3404[var3];

                int var6;
                int var7;
                int var8;
                int var9;
                int var10;
                for (var6 = 1; var6 < 24; ++var6) {
                    var7 = var6 * 8192 / 24;
                    var8 = class703.field3404[var7] >> 7;
                    var9 = class703.field3413[var7] * var4 >> 21;
                    var10 = class703.field3413[var7] * var5 >> 21;
                    var1.method3450(var10, var8, -var9);
                }

                if (var2 > 0) {
                    var6 = var2 * 23 + 2;
                    var7 = var6 - 23;
                    var1.method3451(0, var7, var6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);

                    for (var8 = 1; var8 < 23; ++var8) {
                        var9 = var7 + 1;
                        var10 = var6 + 1;
                        var1.method3451(var7, var9, var6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
                        var1.method3451(var9, var10, var6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
                        var7 = var9;
                        var6 = var10;
                    }

                    var1.method3451(var6, var7, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
                }
            }

            var1.field6458 = var1.field6446;
            var1.field6463 = null;
            var1.field6451 = null;
            var1.field6465 = null;
            field8347 = var0.method4861(var1, 51200, 33, 64, 768);
        }

    }

    static void method4701(class848 var0) {
        if (field8348 == null) {
            int[] var1 = new int[16384];
            int[] var2 = new int[16384];

            for (int var3 = 0; var3 < 64; ++var3) {
                int var4 = 64 - var3;
                var4 *= var4;
                int var5 = 128 - var3 - 1;
                int var6 = var3 * 128;
                int var7 = var5 * 128;

                for (int var8 = 0; var8 < 64; ++var8) {
                    int var9 = 64 - var8;
                    var9 *= var9;
                    int var10 = 128 - var8 - 1;
                    int var11 = 256 - (var9 + var4 << 8) / 4096;
                    var11 = var11 * 3072 / 1536;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 255) {
                        var11 = 255;
                    }

                    int var12 = var11 / 2;
                    var2[var6 + var8] = var2[var6 + var10] = var2[var7 + var8] = var2[var7 + var10] = -16777216 | var11 << 16;
                    var1[var6 + var8] = var1[var6 + var10] = var1[var7 + var8] = var1[var7 + var10] = 127 - var12 << 24 | 16777215;
                }
            }

            field8348 = var0.method4854(var2, 0, 128, 128, 128, -529255066);
            field8333 = var0.method4854(var1, 0, 128, 128, 128, -965635972);
        }

    }

    boolean method4695(class848 var1, class481 var2) {
        return this.field8336 != null || this.method4698(var1, var2);
    }

    void method4697(class848 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        if (this.field8336 != null) {
            float[] var12 = new float[3];
            float var13 = (float) (-(this.field8325 - var8 << 16));
            float var14 = (float) (this.field8320 - var9 << 15);
            float var15 = (float) (-(this.field8327 - var10 << 16));
            float[] var16 = new float[3];
            var1.method4868().method1021(var16);
            var13 += var16[0];
            var14 += var16[1];
            var15 += var16[2];
            var1.method4890(var13, var14, var15, var12);
            if (var12[2] >= 0.0F) {
                int var17 = (int) (var12[0] - (float) (this.field8331 / 2));
                int var18 = (int) (var12[1] - (float) (this.field8331 / 2));
                if (var18 < var5 && var18 + this.field8331 > 0 && var17 < var4 && var17 + this.field8331 > 0) {
                    this.field8336.method3117(var17, var18, this.field8331, this.field8331, 0, var11 << 24 | 16777215, 1);
                }
            }
        }

    }

    boolean method4698(class848 var1, class481 var2) {
        if (this.field8336 == null) {
            if (this.field8339 == 0) {
                if (class544.field3785.method4621(this.field8329, (short) 14716)) {
                    int[] var3 = class544.field3785.method4623(this.field8329, 0.7F, this.field8334, this.field8334, false, (byte) 2);
                    this.field8336 = var1.method4854(var3, 0, this.field8334, this.field8334, this.field8334, -1518966523);
                }
            } else if (this.field8339 == 2) {
                this.method4702(var1, var2);
            } else if (this.field8339 == 1) {
                this.method4700(var1, var2);
            }
        }

        return this.field8336 != null;
    }

    boolean method4699(int var1, int var2, int var3, int var4) {
        int var5;
        int var6;
        int var7;
        if (!this.field8324) {
            var5 = this.field8325 - var1;
            var6 = this.field8320 - var2;
            var7 = this.field8327 - var3;
            this.field8330 = (int) Math.sqrt((double) (var5 * var5 + var6 * var6 + var7 * var7));
            if (this.field8330 == 0) {
                this.field8330 = 1;
            }

            var5 = (var5 << 8) / this.field8330;
            var6 = (var6 << 8) / this.field8330;
            var7 = (var7 << 8) / this.field8330;
        } else {
            this.field8330 = 1073741823;
            var5 = this.field8325;
            var6 = this.field8320;
            var7 = this.field8327;
        }

        int var8 = (int) (Math.sqrt((double) (var5 * var5 + var6 * var6 + var7 * var7)) * 256.0D);
        if (var8 > 128) {
            var5 = (var5 << 16) / var8;
            var6 = (var6 << 16) / var8;
            var7 = (var7 << 16) / var8;
            this.field8331 = this.field8342 * var4 / (this.field8324 ? 1024 : this.field8330);
        } else {
            this.field8331 = 0;
        }

        if (this.field8331 < 8) {
            this.field8336 = null;
            return false;
        } else {
            int var9 = class18.method3687(this.field8331, (byte) 16);
            if (var9 > var4) {
                var9 = class236.method4619(var4, 2050702522);
            }

            if (var9 > 512) {
                var9 = 512;
            }

            if (var9 != this.field8334) {
                this.field8334 = var9;
            }

            this.field8338 = (int) (Math.asin((double) ((float) var6 / 256.0F)) * 2607.5945876176133D) & 16383;
            this.field8332 = (int) (Math.atan2((double) var5, (double) (-var7)) * 2607.5945876176133D) & 16383;
            this.field8336 = null;
            return true;
        }
    }

    void method4700(class848 var1, class481 var2) {
        method4696(var1);
        method4701(var1);
        var1.method4830(field8349);
        var1.method4986(0, 0, this.field8334, this.field8334);
        var1.method4831(2, 0);
        var1.method4984(0, 0, this.field8334, this.field8334, -16777216 | this.field8346, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (var2 != null) {
            if (var2.field8324) {
                var3 = -var2.field8325;
                var4 = -var2.field8320;
                var5 = -var2.field8327;
            } else {
                var3 = var2.field8325 - this.field8325;
                var4 = var2.field8320 - this.field8320;
                var5 = var2.field8327 - this.field8327;
            }
        }

        int var6;
        int var7;
        int var8;
        if (this.field8338 != 0) {
            var6 = class703.field3413[this.field8338];
            var7 = class703.field3404[this.field8338];
            var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }

        if (this.field8332 != 0) {
            var6 = class703.field3413[this.field8332];
            var7 = class703.field3404[this.field8332];
            var8 = var5 * var6 + var3 * var7 >> 14;
            var5 = var5 * var7 - var3 * var6 >> 14;
            var3 = var8;
        }

        class879 var13 = field8347.method6017((byte) 0, 51200, true);
        var13.method5986((short) 0, (short) this.field8329);
        var1.method5063(1.0F);
        var1.method4872(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        var7 = 1024 * this.field8334 / (var13.method6006() - var13.method6099());
        if (this.field8346 != 0) {
            var7 = var7 * 13 / 16;
        }

        class344 var14 = var1.method4870();
        class344 var9 = var1.method4860();
        var9.method280((float) (this.field8334 / 2), (float) (this.field8334 / 2), (float) var7, (float) var7, 50.0F, 50000.0F, (float) var1.method4800((short) 17114).method2481(), (float) var1.method4800((short) -20188).method2493(), 1024.0F);
        var1.method5054(var9);
        var1.method4867(new class135());
        class135 var10 = new class135();
        var10.method1016(0.0F, 0.0F, (float) (50 - var13.method5978()));
        var13.method5965(var10, (class211) null, 1);
        int var11 = this.field8334 * 13 / 16;
        int var12 = (this.field8334 - var11) / 2;
        field8333.method3117(var12, var12, var11, var11, 0, -16777216 | this.field8346, 1);
        this.field8336 = var1.method4856(0, 0, this.field8334, this.field8334, true);
        var1.method4831(2, 0);
        var1.method4984(0, 0, this.field8334, this.field8334, 0, 0);
        field8348.method3117(0, 0, this.field8334, this.field8334, 1, 0, 0);
        this.field8336.method3115(0, 0, 3);
        var1.method5054(var14);
        var1.method4986(field8349[0], field8349[1], field8349[2], field8349[3]);
    }

    void method4702(class848 var1, class481 var2) {
        class25 var3 = class25.method3454(class537.field3750, this.field8329, 0);
        if (var3 != null) {
            var1.method4830(field8349);
            var1.method4986(0, 0, this.field8334, this.field8334);
            var1.method4831(2, 0);
            var1.method4984(0, 0, this.field8334, this.field8334, 0, 0);
            int var4 = 0;
            int var5 = 0;
            int var6 = 256;
            if (var2 != null) {
                if (var2.field8324) {
                    var4 = -var2.field8325;
                    var5 = -var2.field8320;
                    var6 = -var2.field8327;
                } else {
                    var4 = this.field8325 - var2.field8325;
                    var5 = this.field8320 - var2.field8320;
                    var6 = this.field8327 - var2.field8327;
                }
            }

            int var7;
            int var8;
            int var9;
            int var10;
            if (this.field8338 != 0) {
                var7 = -this.field8338 & 16383;
                var8 = class703.field3413[var7];
                var9 = class703.field3404[var7];
                var10 = var5 * var9 - var6 * var8 >> 14;
                var6 = var5 * var8 + var6 * var9 >> 14;
                var5 = var10;
            }

            if (this.field8332 != 0) {
                var7 = -this.field8332 & 16383;
                var8 = class703.field3413[var7];
                var9 = class703.field3404[var7];
                var10 = var6 * var8 + var4 * var9 >> 14;
                var6 = var6 * var9 - var4 * var8 >> 14;
                var4 = var10;
            }

            var1.method5063(1.0F);
            var1.method4872(this.field8346, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
            var3.method3457(this.field8337 & 16383, this.field8328 & 16383, this.field8326 & 16383);
            class879 var16 = var1.method4861(var3, 2048, 0, 64, 768);
            var8 = var16.method6006() - var16.method6099();
            var9 = var16.method5977() - var16.method5976();
            var10 = var8 > var9 ? var8 : var9;
            int var11 = 1024 * this.field8334 / var10;
            class344 var12 = var1.method4870();
            class344 var13 = var1.method4860();
            var13.method280((float) (this.field8334 / 2), (float) (this.field8334 / 2), (float) var11, (float) var11, 50.0F, 50000.0F, (float) var1.method4800((short) -8264).method2481(), (float) var1.method4800((short) 11671).method2493(), 1024.0F);
            var1.method5054(var13);
            class135 var14 = new class135();
            var1.method4867(var14);
            class135 var15 = var1.method5048();
            var15.method1016(0.0F, 0.0F, (float) (50 - var16.method5978()));
            var16.method5965(var15, (class211) null, 1);
            this.field8336 = var1.method4856(0, 0, this.field8334, this.field8334, true);
            this.field8336.method3115(0, 0, 3);
            var1.method5054(var12);
            var1.method4986(field8349[0], field8349[1], field8349[2], field8349[3]);
        }

    }
}
