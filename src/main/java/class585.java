public class class585 {
    boolean field332 = true;
    float field333;
    int field334;
    int field335 = 0;
    boolean field336 = false;
    boolean field337 = false;
    int field338;
    float field339;
    class258 field340;
    float field341;
    float field342;
    float field343 = 0.0F;
    int field344 = 0;
    int field345 = 0;
    int[] field346 = null;
    class257 field347;
    float field348 = 0.0F;
    int field349;
    int[] field350;
    float[] field351;
    boolean field352 = false;
    int field353 = -1;
    int field354;
    int field355 = 0;
    int field356 = 0;
    float field357 = 0.0F;
    int field358 = 0;
    boolean field359 = true;
    int field360 = -1;
    int[] field361 = null;
    float field362 = 1.0F;
    int[] field363 = new int[4096];
    boolean field364 = false;
    int field365 = -1;
    int[] field366 = null;
    int field367 = 0;
    int field368 = 0;
    float field369 = 0.0F;

    class585(class257 var1, class258 var2) {
        this.field347 = var1;
        this.field340 = var2;
        this.field349 = this.field347.field7918;
        this.field350 = this.field347.field7914;
        this.field351 = this.field347.field7920;
    }

    int method335() {
        return this.field363[0] % this.field349;
    }

    int method336() {
        return this.field363[0] / this.field349;
    }

    final void method337(boolean var1) {
        this.field352 = var1;
    }

    final void method338(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29) {
        if (!var1) {
            this.method341(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
        } else {
            int var31;
            if (var29 != this.field353) {
                this.field346 = this.field347.method4445(var29);
                if (this.field346 == null) {
                    this.field335 = 255 - (var22 >> 24 & 255);
                    int var77 = class543.field3817[class526.method2228(this.field347.method4454(var29), (byte) 0) & '\uffff'];
                    var31 = -16777216 | (var22 >> 16 & 255) * (var77 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var77 >> 8 & 255) & '\uff00' | (var22 & 255) * (var77 & 255) >> 8;
                    this.method340(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, class507.method2511(var31, var25, var26, -41484220), class507.method2511(var31, var25, var27, 775030860), class507.method2511(var31, var25, var28, -1648568028));
                    return;
                }

                this.field355 = this.field347.method4447(var29) ? 64 : this.field347.field7949 * -806628381 * 1107560907;
                this.field356 = this.field355 - 1;
                this.field358 = this.field347.method4462(var29);
                this.field359 = this.field347.method4460(var29);
            }

            this.field334 = var25;
            float var30;
            if (var4 > var5 || var4 > var6) {
                if (var5 <= var6) {
                    var30 = var7;
                    var7 = var8;
                    var8 = var30;
                    var30 = var4;
                    var4 = var5;
                    var5 = var30;
                    var30 = var10;
                    var10 = var11;
                    var11 = var30;
                    var30 = var16;
                    var16 = var17;
                    var17 = var30;
                    var30 = var19;
                    var19 = var20;
                    var20 = var30;
                    var30 = var13;
                    var13 = var14;
                    var14 = var30;
                    var30 = var26;
                    var26 = var27;
                    var27 = var30;
                    var31 = var22;
                    var22 = var23;
                    var23 = var31;
                } else {
                    var30 = var7;
                    var7 = var9;
                    var9 = var30;
                    var30 = var4;
                    var4 = var6;
                    var6 = var30;
                    var30 = var10;
                    var10 = var12;
                    var12 = var30;
                    var30 = var16;
                    var16 = var18;
                    var18 = var30;
                    var30 = var19;
                    var19 = var21;
                    var21 = var30;
                    var30 = var13;
                    var13 = var15;
                    var15 = var30;
                    var30 = var26;
                    var26 = var28;
                    var28 = var30;
                    var31 = var22;
                    var22 = var24;
                    var24 = var31;
                }
            }

            var16 /= var13;
            var17 /= var14;
            var18 /= var15;
            var19 /= var13;
            var20 /= var14;
            var21 /= var15;
            var10 = 1.0F / var10;
            var11 = 1.0F / var11;
            var12 = 1.0F / var12;
            var13 = 1.0F / var13;
            var14 = 1.0F / var14;
            var15 = 1.0F / var15;
            var30 = (float) (var22 >> 24 & 255);
            float var76 = (float) (var23 >> 24 & 255);
            float var32 = (float) (var24 >> 24 & 255);
            float var33 = (float) (var22 >> 16 & 255);
            float var34 = (float) (var23 >> 16 & 255);
            float var35 = (float) (var24 >> 16 & 255);
            float var36 = (float) (var22 >> 8 & 255);
            float var37 = (float) (var23 >> 8 & 255);
            float var38 = (float) (var24 >> 8 & 255);
            float var39 = (float) (var22 & 255);
            float var40 = (float) (var23 & 255);
            float var41 = (float) (var24 & 255);
            float var42 = 0.0F;
            float var43 = 0.0F;
            float var44 = 0.0F;
            float var45 = 0.0F;
            float var46 = 0.0F;
            float var47 = 0.0F;
            float var48 = 0.0F;
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52;
            if (var5 != var4) {
                var52 = var5 - var4;
                var42 = (var8 - var7) / var52;
                var43 = (var11 - var10) / var52;
                var44 = (var14 - var13) / var52;
                var45 = (var17 - var16) / var52;
                var46 = (var20 - var19) / var52;
                var47 = (var27 - var26) / var52;
                var48 = (var76 - var30) / var52;
                var49 = (var34 - var33) / var52;
                var50 = (var37 - var36) / var52;
                var51 = (var40 - var39) / var52;
            }

            var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            float var55 = 0.0F;
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            float var62;
            if (var6 != var5) {
                var62 = var6 - var5;
                var52 = (var9 - var8) / var62;
                var53 = (var12 - var11) / var62;
                var54 = (var15 - var14) / var62;
                var55 = (var18 - var17) / var62;
                var56 = (var21 - var20) / var62;
                var57 = (var28 - var27) / var62;
                var58 = (var32 - var76) / var62;
                var59 = (var35 - var34) / var62;
                var60 = (var38 - var37) / var62;
                var61 = (var41 - var40) / var62;
            }

            var62 = 0.0F;
            float var63 = 0.0F;
            float var64 = 0.0F;
            float var65 = 0.0F;
            float var66 = 0.0F;
            float var67 = 0.0F;
            float var68 = 0.0F;
            float var69 = 0.0F;
            float var70 = 0.0F;
            float var71 = 0.0F;
            float var72;
            if (var4 != var6) {
                var72 = var4 - var6;
                var62 = (var7 - var9) / var72;
                var63 = (var10 - var12) / var72;
                var64 = (var13 - var15) / var72;
                var65 = (var16 - var18) / var72;
                var66 = (var19 - var21) / var72;
                var67 = (var26 - var28) / var72;
                var68 = (var30 - var32) / var72;
                var69 = (var33 - var35) / var72;
                var70 = (var36 - var38) / var72;
                var71 = (var39 - var41) / var72;
            }

            if (var4 < (float) this.field354) {
                if (var5 > (float) this.field354) {
                    var5 = (float) this.field354;
                }

                if (var6 > (float) this.field354) {
                    var6 = (float) this.field354;
                }

                if (var5 < var6) {
                    var9 = var7;
                    var12 = var10;
                    var15 = var13;
                    var18 = var16;
                    var21 = var19;
                    var28 = var26;
                    var32 = var30;
                    var35 = var33;
                    var38 = var36;
                    var41 = var39;
                    if (var4 < 0.0F) {
                        var7 -= var42 * var4;
                        var9 -= var62 * var4;
                        var10 -= var43 * var4;
                        var12 -= var63 * var4;
                        var13 -= var44 * var4;
                        var15 -= var64 * var4;
                        var16 -= var45 * var4;
                        var18 -= var65 * var4;
                        var19 -= var46 * var4;
                        var21 -= var66 * var4;
                        var26 -= var47 * var4;
                        var28 -= var67 * var4;
                        var30 -= var48 * var4;
                        var32 -= var68 * var4;
                        var33 -= var48 * var4;
                        var35 -= var68 * var4;
                        var36 -= var48 * var4;
                        var38 -= var68 * var4;
                        var39 -= var48 * var4;
                        var41 -= var68 * var4;
                        var4 = 0.0F;
                    }

                    if (var5 < 0.0F) {
                        var8 -= var52 * var5;
                        var11 -= var53 * var5;
                        var14 -= var54 * var5;
                        var17 -= var55 * var5;
                        var20 -= var56 * var5;
                        var27 -= var57 * var5;
                        var76 -= var58 * var5;
                        var34 -= var59 * var5;
                        var37 -= var60 * var5;
                        var40 -= var61 * var5;
                        var5 = 0.0F;
                    }

                    if ((var4 == var5 || var62 >= var42) && (var4 != var5 || var62 <= var52)) {
                        var4 = (float) ((int) (var4 + 0.5F));
                        var5 = (float) ((int) (var5 + 0.5F));
                        var6 = (float) ((int) (var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for (var4 = (float) this.field363[(int) var4]; --var5 >= 0.0F; var4 += (float) this.field349) {
                            this.method343(var2, var3, this.field350, this.field346, (int) var4, (int) var7, (int) var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var30, var32, var33, var35, var36, var38, var39, var41);
                            var7 += var42;
                            var9 += var62;
                            var10 += var43;
                            var12 += var63;
                            var13 += var44;
                            var15 += var64;
                            var16 += var45;
                            var18 += var65;
                            var19 += var46;
                            var21 += var66;
                            var26 += var47;
                            var28 += var67;
                            var30 += var48;
                            var32 += var68;
                            var33 += var49;
                            var35 += var69;
                            var36 += var50;
                            var38 += var70;
                            var39 += var51;
                            var41 += var71;
                        }

                        while (--var6 >= 0.0F) {
                            this.method343(var2, var3, this.field350, this.field346, (int) var4, (int) var8, (int) var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var76, var32, var34, var35, var37, var38, var40, var41);
                            var8 += var52;
                            var9 += var62;
                            var11 += var53;
                            var12 += var63;
                            var14 += var54;
                            var15 += var64;
                            var17 += var55;
                            var18 += var65;
                            var20 += var56;
                            var21 += var66;
                            var27 += var57;
                            var28 += var67;
                            var76 += var58;
                            var32 += var68;
                            var34 += var59;
                            var35 += var69;
                            var37 += var60;
                            var38 += var70;
                            var40 += var61;
                            var41 += var71;
                            var4 += (float) this.field349;
                        }
                    } else {
                        var4 = (float) ((int) (var4 + 0.5F));
                        var5 = (float) ((int) (var5 + 0.5F));
                        var6 = (float) ((int) (var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for (var4 = (float) this.field363[(int) var4]; --var5 >= 0.0F; var4 += (float) this.field349) {
                            this.method343(var2, var3, this.field350, this.field346, (int) var4, (int) var9, (int) var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var32, var30, var35, var33, var38, var36, var41, var39);
                            var7 += var42;
                            var9 += var62;
                            var10 += var43;
                            var12 += var63;
                            var13 += var44;
                            var15 += var64;
                            var16 += var45;
                            var18 += var65;
                            var19 += var46;
                            var21 += var66;
                            var26 += var47;
                            var28 += var67;
                            var30 += var48;
                            var32 += var68;
                            var33 += var49;
                            var35 += var69;
                            var36 += var50;
                            var38 += var70;
                            var39 += var51;
                            var41 += var71;
                        }

                        while (--var6 >= 0.0F) {
                            this.method343(var2, var3, this.field350, this.field346, (int) var4, (int) var9, (int) var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var32, var76, var35, var34, var38, var37, var41, var40);
                            var8 += var52;
                            var9 += var62;
                            var11 += var53;
                            var12 += var63;
                            var14 += var54;
                            var15 += var64;
                            var17 += var55;
                            var18 += var65;
                            var20 += var56;
                            var21 += var66;
                            var27 += var57;
                            var28 += var67;
                            var76 += var58;
                            var32 += var68;
                            var34 += var59;
                            var35 += var69;
                            var37 += var60;
                            var38 += var70;
                            var40 += var61;
                            var41 += var71;
                            var4 += (float) this.field349;
                        }
                    }
                } else {
                    var8 = var7;
                    var11 = var10;
                    var14 = var13;
                    var17 = var16;
                    var20 = var19;
                    var27 = var26;
                    var72 = var30;
                    float var73 = var33;
                    float var74 = var36;
                    float var75 = var39;
                    if (var4 < 0.0F) {
                        var7 -= var42 * var4;
                        var8 -= var62 * var4;
                        var10 -= var43 * var4;
                        var11 -= var63 * var4;
                        var13 -= var44 * var4;
                        var14 -= var64 * var4;
                        var16 -= var45 * var4;
                        var17 -= var65 * var4;
                        var19 -= var46 * var4;
                        var20 -= var66 * var4;
                        var26 -= var47 * var4;
                        var27 -= var67 * var4;
                        var30 -= var48 * var4;
                        var72 -= var68 * var4;
                        var33 -= var48 * var4;
                        var73 -= var68 * var4;
                        var36 -= var48 * var4;
                        var74 -= var68 * var4;
                        var39 -= var48 * var4;
                        var75 -= var68 * var4;
                        var4 = 0.0F;
                    }

                    if (var6 < 0.0F) {
                        var9 -= var52 * var6;
                        var12 -= var53 * var6;
                        var15 -= var54 * var6;
                        var18 -= var55 * var6;
                        var21 -= var56 * var6;
                        var28 -= var57 * var6;
                        var32 -= var58 * var6;
                        var35 -= var59 * var6;
                        var38 -= var60 * var6;
                        var41 -= var61 * var6;
                        var6 = 0.0F;
                    }

                    if ((var4 == var6 || var62 >= var42) && (var4 != var6 || var52 <= var42)) {
                        var4 = (float) ((int) (var4 + 0.5F));
                        var6 = (float) ((int) (var6 + 0.5F));
                        var5 = (float) ((int) (var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for (var4 = (float) this.field363[(int) var4]; --var6 >= 0.0F; var4 += (float) this.field349) {
                            this.method343(var2, var3, this.field350, this.field346, (int) var4, (int) var7, (int) var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var30, var72, var33, var73, var36, var74, var39, var75);
                            var8 += var62;
                            var7 += var42;
                            var11 += var63;
                            var10 += var43;
                            var14 += var64;
                            var13 += var44;
                            var17 += var65;
                            var16 += var45;
                            var20 += var66;
                            var19 += var46;
                            var27 += var67;
                            var26 += var47;
                            var72 += var68;
                            var30 += var48;
                            var73 += var69;
                            var33 += var49;
                            var74 += var70;
                            var36 += var50;
                            var75 += var71;
                            var39 += var51;
                        }

                        while (--var5 >= 0.0F) {
                            this.method343(var2, var3, this.field350, this.field346, (int) var4, (int) var7, (int) var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var30, var32, var33, var35, var36, var38, var39, var41);
                            var7 += var42;
                            var9 += var52;
                            var10 += var43;
                            var12 += var53;
                            var13 += var44;
                            var15 += var54;
                            var16 += var45;
                            var18 += var55;
                            var19 += var46;
                            var21 += var56;
                            var26 += var47;
                            var28 += var57;
                            var30 += var48;
                            var32 += var58;
                            var33 += var49;
                            var35 += var59;
                            var36 += var50;
                            var38 += var60;
                            var39 += var51;
                            var41 += var61;
                            var4 += (float) this.field349;
                        }
                    } else {
                        var4 = (float) ((int) (var4 + 0.5F));
                        var6 = (float) ((int) (var6 + 0.5F));
                        var5 = (float) ((int) (var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for (var4 = (float) this.field363[(int) var4]; --var6 >= 0.0F; var4 += (float) this.field349) {
                            this.method343(var2, var3, this.field350, this.field346, (int) var4, (int) var8, (int) var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var72, var30, var73, var33, var74, var36, var75, var39);
                            var7 += var42;
                            var8 += var62;
                            var10 += var43;
                            var11 += var63;
                            var13 += var44;
                            var14 += var64;
                            var16 += var45;
                            var17 += var65;
                            var19 += var46;
                            var20 += var66;
                            var26 += var47;
                            var27 += var67;
                            var30 += var48;
                            var72 += var68;
                            var33 += var49;
                            var73 += var69;
                            var36 += var50;
                            var74 += var70;
                            var39 += var51;
                            var75 += var71;
                        }

                        while (--var5 >= 0.0F) {
                            this.method343(var2, var3, this.field350, this.field346, (int) var4, (int) var9, (int) var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var32, var30, var35, var33, var38, var36, var41, var39);
                            var9 += var52;
                            var7 += var42;
                            var12 += var53;
                            var10 += var43;
                            var15 += var54;
                            var13 += var44;
                            var18 += var55;
                            var16 += var45;
                            var21 += var56;
                            var19 += var46;
                            var28 += var57;
                            var26 += var47;
                            var32 += var58;
                            var30 += var48;
                            var35 += var59;
                            var33 += var49;
                            var38 += var60;
                            var36 += var50;
                            var41 += var61;
                            var39 += var51;
                            var4 += (float) this.field349;
                        }
                    }
                }

            }
        }
    }

    final void method339(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12) {
        if (this.field336) {
            if (var8 > this.field338) {
                var8 = this.field338;
            }

            if (var7 < 0) {
                var7 = 0;
            }
        }

        if (var7 < var8) {
            var4 += var7 - 1;
            var9 += var10 * (float) var7;
            var11 += var12 * (float) var7;
            int var13;
            int var14;
            int var15;
            if (this.field340.field7896) {
                if (this.field332) {
                    var6 = var8 - var7 >> 2;
                    var10 *= 4.0F;
                    if (this.field335 == 0) {
                        if (var6 > 0) {
                            do {
                                var5 = class543.field3817[(int) var9 & '\uffff'];
                                var9 += var10;
                                ++var4;
                                if (!var1 || var11 < this.field351[var4]) {
                                    var3[var4] = var5;
                                    if (var1) {
                                        this.field351[var4] = var11;
                                    }
                                }

                                var11 += var12;
                                ++var4;
                                if (!var1 || var11 < this.field351[var4]) {
                                    var3[var4] = var5;
                                    if (var1) {
                                        this.field351[var4] = var11;
                                    }
                                }

                                var11 += var12;
                                ++var4;
                                if (!var1 || var11 < this.field351[var4]) {
                                    var3[var4] = var5;
                                    if (var1) {
                                        this.field351[var4] = var11;
                                    }
                                }

                                var11 += var12;
                                ++var4;
                                if (!var1 || var11 < this.field351[var4]) {
                                    var3[var4] = var5;
                                    if (var1) {
                                        this.field351[var4] = var11;
                                    }
                                }

                                var11 += var12;
                                --var6;
                            } while (var6 > 0);
                        }

                        var6 = var8 - var7 & 3;
                        if (var6 > 0) {
                            var5 = class543.field3817[(int) var9 & '\uffff'];

                            do {
                                ++var4;
                                if (!var1 || var11 < this.field351[var4]) {
                                    var3[var4] = var5;
                                    if (var1) {
                                        this.field351[var4] = var11;
                                    }
                                }

                                var11 += var12;
                                --var6;
                            } while (var6 > 0);
                        }
                    } else {
                        var13 = this.field335;
                        var14 = 256 - this.field335;
                        if (var6 > 0) {
                            do {
                                var5 = class543.field3817[(int) var9 & '\uffff'];
                                var9 += var10;
                                var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                                ++var4;
                                if (!var1 || var11 < this.field351[var4]) {
                                    var15 = var3[var4];
                                    if (var2) {
                                        var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                    } else {
                                        var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                    }

                                    if (var1) {
                                        this.field351[var4] = var11;
                                    }
                                }

                                var11 += var12;
                                ++var4;
                                if (!var1 || var11 < this.field351[var4]) {
                                    var15 = var3[var4];
                                    if (var2) {
                                        var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                    } else {
                                        var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                    }

                                    if (var1) {
                                        this.field351[var4] = var11;
                                    }
                                }

                                var11 += var12;
                                ++var4;
                                if (!var1 || var11 < this.field351[var4]) {
                                    var15 = var3[var4];
                                    if (var2) {
                                        var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                    } else {
                                        var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                    }

                                    if (var1) {
                                        this.field351[var4] = var11;
                                    }
                                }

                                var11 += var12;
                                ++var4;
                                if (!var1 || var11 < this.field351[var4]) {
                                    var15 = var3[var4];
                                    if (var2) {
                                        var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                    } else {
                                        var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                    }

                                    if (var1) {
                                        this.field351[var4] = var11;
                                    }
                                }

                                var11 += var12;
                                --var6;
                            } while (var6 > 0);
                        }

                        var6 = var8 - var7 & 3;
                        if (var6 > 0) {
                            var5 = class543.field3817[(int) var9 & '\uffff'];
                            var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                            do {
                                ++var4;
                                if (!var1 || var11 < this.field351[var4]) {
                                    var15 = var3[var4];
                                    if (var2) {
                                        var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                    } else {
                                        var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                    }

                                    if (var1) {
                                        this.field351[var4] = var11;
                                    }
                                }

                                var11 += var12;
                                --var6;
                            } while (var6 > 0);
                        }
                    }
                } else {
                    var6 = var8 - var7;
                    if (this.field335 != 0) {
                        var13 = this.field335;
                        var14 = 256 - this.field335;

                        do {
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var5 = class543.field3817[(int) var9 & '\uffff'];
                                var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                                var15 = var3[var4];
                                if (var2) {
                                    var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                } else {
                                    var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                }

                                if (var1) {
                                    this.field351[var4] = var11;
                                }
                            }

                            var9 += var10;
                            var11 += var12;
                            --var6;
                        } while (var6 > 0);
                    } else {
                        do {
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var3[var4] = class543.field3817[(int) var9 & '\uffff'];
                                if (var1) {
                                    this.field351[var4] = var11;
                                }
                            }

                            var11 += var12;
                            var9 += var10;
                            --var6;
                        } while (var6 > 0);
                    }
                }
            } else if (this.field332) {
                var6 = var8 - var7 >> 2;
                var10 *= 4.0F;
                if (this.field335 == 0) {
                    if (var6 > 0) {
                        do {
                            var5 = class543.field3817[(int) var9 & '\uffff'];
                            var9 += var10;
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var3[var4] = var5;
                            }

                            var11 += var12;
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var3[var4] = var5;
                            }

                            var11 += var12;
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var3[var4] = var5;
                            }

                            var11 += var12;
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var3[var4] = var5;
                            }

                            var11 += var12;
                            --var6;
                        } while (var6 > 0);
                    }

                    var6 = var8 - var7 & 3;
                    if (var6 > 0) {
                        var5 = class543.field3817[(int) var9 & '\uffff'];

                        do {
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var3[var4] = var5;
                            }

                            var11 += var12;
                            --var6;
                        } while (var6 > 0);
                    }
                } else {
                    var13 = this.field335;
                    var14 = 256 - this.field335;
                    if (var6 > 0) {
                        do {
                            var5 = class543.field3817[(int) var9 & '\uffff'];
                            var9 += var10;
                            var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var15 = var3[var4];
                                if (var2) {
                                    var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                } else {
                                    var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                }
                            }

                            var11 += var12;
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var15 = var3[var4];
                                if (var2) {
                                    var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                } else {
                                    var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                }
                            }

                            var11 += var12;
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var15 = var3[var4];
                                if (var2) {
                                    var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                } else {
                                    var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                }
                            }

                            var11 += var12;
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var15 = var3[var4];
                                if (var2) {
                                    var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                } else {
                                    var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                }
                            }

                            var11 += var12;
                            --var6;
                        } while (var6 > 0);
                    }

                    var6 = var8 - var7 & 3;
                    if (var6 > 0) {
                        var5 = class543.field3817[(int) var9 & '\uffff'];
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                        do {
                            ++var4;
                            if (!var1 || var11 < this.field351[var4]) {
                                var15 = var3[var4];
                                if (var2) {
                                    var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                } else {
                                    var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                                }
                            }

                            var11 += var12;
                            --var6;
                        } while (var6 > 0);
                    }
                }
            } else {
                var6 = var8 - var7;
                if (this.field335 != 0) {
                    var13 = this.field335;
                    var14 = 256 - this.field335;

                    do {
                        ++var4;
                        if (!var1 || var11 < this.field351[var4]) {
                            var5 = class543.field3817[(int) var9 & '\uffff'];
                            var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                            var15 = var3[var4];
                            if (var2) {
                                var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                            } else {
                                var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                            }
                        }

                        var9 += var10;
                        var11 += var12;
                        --var6;
                    } while (var6 > 0);
                } else {
                    do {
                        ++var4;
                        if (!var1 || var11 < this.field351[var4]) {
                            var3[var4] = class543.field3817[(int) var9 & '\uffff'];
                        }

                        var11 += var12;
                        var9 += var10;
                        --var6;
                    } while (var6 > 0);
                }
            }

        }
    }

    final void method340(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13, int var14, int var15) {
        if (!var1) {
            this.method341(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
        } else if (this.field352) {
            this.field347.method4837((int) var7, (int) var4, (int) var8, (int) var5, -16777216 | var13, 274127005);
            this.field347.method4837((int) var8, (int) var5, (int) var9, (int) var6, -16777216 | var13, 1972878198);
            this.field347.method4837((int) var9, (int) var6, (int) var7, (int) var4, -16777216 | var13, 1919229824);
        } else {
            float var16 = var8 - var7;
            float var17 = var5 - var4;
            float var18 = var9 - var7;
            float var19 = var6 - var4;
            float var20 = var11 - var10;
            float var21 = var12 - var10;
            float var22 = (float) ((var14 & 16711680) - (var13 & 16711680));
            float var23 = (float) ((var15 & 16711680) - (var13 & 16711680));
            float var24 = (float) ((var14 & '\uff00') - (var13 & '\uff00'));
            float var25 = (float) ((var15 & '\uff00') - (var13 & '\uff00'));
            float var26 = (float) ((var14 & 255) - (var13 & 255));
            float var27 = (float) ((var15 & 255) - (var13 & 255));
            float var28;
            if (var6 != var5) {
                var28 = (var9 - var8) / (var6 - var5);
            } else {
                var28 = 0.0F;
            }

            float var29;
            if (var5 != var4) {
                var29 = var16 / var17;
            } else {
                var29 = 0.0F;
            }

            float var30;
            if (var6 != var4) {
                var30 = var18 / var19;
            } else {
                var30 = 0.0F;
            }

            float var31 = var16 * var19 - var18 * var17;
            if (var31 != 0.0F) {
                float var32 = (var20 * var19 - var21 * var17) / var31;
                float var33 = (var21 * var16 - var20 * var18) / var31;
                float var34 = (var22 * var19 - var23 * var17) / var31;
                float var35 = (var23 * var16 - var22 * var18) / var31;
                float var36 = (var24 * var19 - var25 * var17) / var31;
                float var37 = (var25 * var16 - var24 * var18) / var31;
                float var38 = (var26 * var19 - var27 * var17) / var31;
                float var39 = (var27 * var16 - var26 * var18) / var31;
                float var40;
                float var41;
                float var42;
                if (var4 <= var5 && var4 <= var6) {
                    if (var4 < (float) this.field354) {
                        if (var5 > (float) this.field354) {
                            var5 = (float) this.field354;
                        }

                        if (var6 > (float) this.field354) {
                            var6 = (float) this.field354;
                        }

                        var10 = var10 - var32 * var7 + var32;
                        var40 = (float) (var13 & 16711680) - var34 * var7 + var34;
                        var41 = (float) (var13 & '\uff00') - var36 * var7 + var36;
                        var42 = (float) (var13 & 255) - var38 * var7 + var38;
                        if (var5 < var6) {
                            var9 = var7;
                            if (var4 < 0.0F) {
                                var9 = var7 - var30 * var4;
                                var7 -= var29 * var4;
                                var10 -= var33 * var4;
                                var40 -= var35 * var4;
                                var41 -= var37 * var4;
                                var42 -= var39 * var4;
                                var4 = 0.0F;
                            }

                            if (var5 < 0.0F) {
                                var8 -= var28 * var5;
                                var5 = 0.0F;
                            }

                            if ((var4 == var5 || var30 >= var29) && (var4 != var5 || var30 <= var28)) {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var5;
                                var5 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var5 >= 0.0F; var4 += (float) this.field349) {
                                    this.method346(var2, var3, this.field350, (int) var4, 0, 0, (int) var7, (int) var9, var10, var32, var40, var34, var41, var36, var42, var38);
                                    var9 += var30;
                                    var7 += var29;
                                    var10 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method346(var2, var3, this.field350, (int) var4, 0, 0, (int) var8, (int) var9, var10, var32, var40, var34, var41, var36, var42, var38);
                                    var9 += var30;
                                    var8 += var28;
                                    var10 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                    var4 += (float) this.field349;
                                }

                            } else {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var5;
                                var5 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var5 >= 0.0F; var4 += (float) this.field349) {
                                    this.method346(var2, var3, this.field350, (int) var4, 0, 0, (int) var9, (int) var7, var10, var32, var40, var34, var41, var36, var42, var38);
                                    var9 += var30;
                                    var7 += var29;
                                    var10 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method346(var2, var3, this.field350, (int) var4, 0, 0, (int) var9, (int) var8, var10, var32, var40, var34, var41, var36, var42, var38);
                                    var9 += var30;
                                    var8 += var28;
                                    var10 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                    var4 += (float) this.field349;
                                }

                            }
                        } else {
                            var8 = var7;
                            if (var4 < 0.0F) {
                                var8 = var7 - var30 * var4;
                                var7 -= var29 * var4;
                                var10 -= var33 * var4;
                                var40 -= var35 * var4;
                                var41 -= var37 * var4;
                                var42 -= var39 * var4;
                                var4 = 0.0F;
                            }

                            if (var6 < 0.0F) {
                                var9 -= var28 * var6;
                                var6 = 0.0F;
                            }

                            if (var4 != var6 && var30 < var29 || var4 == var6 && var28 > var29) {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F)) - var6;
                                var6 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var6 >= 0.0F; var4 += (float) this.field349) {
                                    this.method346(var2, var3, this.field350, (int) var4, 0, 0, (int) var8, (int) var7, var10, var32, var40, var34, var41, var36, var42, var38);
                                    var8 += var30;
                                    var7 += var29;
                                    var10 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                }

                                while (--var5 >= 0.0F) {
                                    this.method346(var2, var3, this.field350, (int) var4, 0, 0, (int) var9, (int) var7, var10, var32, var40, var34, var41, var36, var42, var38);
                                    var9 += var28;
                                    var7 += var29;
                                    var10 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                    var4 += (float) this.field349;
                                }

                            } else {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F)) - var6;
                                var6 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var6 >= 0.0F; var4 += (float) this.field349) {
                                    this.method346(var2, var3, this.field350, (int) var4, 0, 0, (int) var7, (int) var8, var10, var32, var40, var34, var41, var36, var42, var38);
                                    var8 += var30;
                                    var7 += var29;
                                    var10 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                }

                                while (--var5 >= 0.0F) {
                                    this.method346(var2, var3, this.field350, (int) var4, 0, 0, (int) var7, (int) var9, var10, var32, var40, var34, var41, var36, var42, var38);
                                    var9 += var28;
                                    var7 += var29;
                                    var10 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                    var4 += (float) this.field349;
                                }

                            }
                        }
                    }
                } else if (var5 <= var6) {
                    if (var5 < (float) this.field354) {
                        if (var6 > (float) this.field354) {
                            var6 = (float) this.field354;
                        }

                        if (var4 > (float) this.field354) {
                            var4 = (float) this.field354;
                        }

                        var11 = var11 - var32 * var8 + var32;
                        var40 = (float) (var14 & 16711680) - var34 * var8 + var34;
                        var41 = (float) (var14 & '\uff00') - var36 * var8 + var36;
                        var42 = (float) (var14 & 255) - var38 * var8 + var38;
                        if (var6 < var4) {
                            var7 = var8;
                            if (var5 < 0.0F) {
                                var7 = var8 - var29 * var5;
                                var8 -= var28 * var5;
                                var11 -= var33 * var5;
                                var40 -= var35 * var5;
                                var41 -= var37 * var5;
                                var42 -= var39 * var5;
                                var5 = 0.0F;
                            }

                            if (var6 < 0.0F) {
                                var9 -= var30 * var6;
                                var6 = 0.0F;
                            }

                            if ((var5 == var6 || var29 >= var28) && (var5 != var6 || var29 <= var30)) {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F)) - var6;
                                var6 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var6 >= 0.0F; var5 += (float) this.field349) {
                                    this.method346(var2, var3, this.field350, (int) var5, 0, 0, (int) var8, (int) var7, var11, var32, var40, var34, var41, var36, var42, var38);
                                    var7 += var29;
                                    var8 += var28;
                                    var11 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                }

                                while (--var4 >= 0.0F) {
                                    this.method346(var2, var3, this.field350, (int) var5, 0, 0, (int) var9, (int) var7, var11, var32, var40, var34, var41, var36, var42, var38);
                                    var7 += var29;
                                    var9 += var30;
                                    var11 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                    var5 += (float) this.field349;
                                }

                            } else {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F)) - var6;
                                var6 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var6 >= 0.0F; var5 += (float) this.field349) {
                                    this.method346(var2, var3, this.field350, (int) var5, 0, 0, (int) var7, (int) var8, var11, var32, var40, var34, var41, var36, var42, var38);
                                    var7 += var29;
                                    var8 += var28;
                                    var11 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                }

                                while (--var4 >= 0.0F) {
                                    this.method346(var2, var3, this.field350, (int) var5, 0, 0, (int) var7, (int) var9, var11, var32, var40, var34, var41, var36, var42, var38);
                                    var7 += var29;
                                    var9 += var30;
                                    var11 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                    var5 += (float) this.field349;
                                }

                            }
                        } else {
                            var9 = var8;
                            if (var5 < 0.0F) {
                                var9 = var8 - var29 * var5;
                                var8 -= var28 * var5;
                                var11 -= var33 * var5;
                                var40 -= var35 * var5;
                                var41 -= var37 * var5;
                                var42 -= var39 * var5;
                                var5 = 0.0F;
                            }

                            if (var4 < 0.0F) {
                                var7 -= var30 * var4;
                                var4 = 0.0F;
                            }

                            if (var29 < var28) {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var4;
                                var4 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var4 >= 0.0F; var5 += (float) this.field349) {
                                    this.method346(var2, var3, this.field350, (int) var5, 0, 0, (int) var9, (int) var8, var11, var32, var40, var34, var41, var36, var42, var38);
                                    var9 += var29;
                                    var8 += var28;
                                    var11 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method346(var2, var3, this.field350, (int) var5, 0, 0, (int) var7, (int) var8, var11, var32, var40, var34, var41, var36, var42, var38);
                                    var7 += var30;
                                    var8 += var28;
                                    var11 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                    var5 += (float) this.field349;
                                }

                            } else {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var4;
                                var4 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var4 >= 0.0F; var5 += (float) this.field349) {
                                    this.method346(var2, var3, this.field350, (int) var5, 0, 0, (int) var8, (int) var9, var11, var32, var40, var34, var41, var36, var42, var38);
                                    var9 += var29;
                                    var8 += var28;
                                    var11 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method346(var2, var3, this.field350, (int) var5, 0, 0, (int) var8, (int) var7, var11, var32, var40, var34, var41, var36, var42, var38);
                                    var7 += var30;
                                    var8 += var28;
                                    var11 += var33;
                                    var40 += var35;
                                    var41 += var37;
                                    var42 += var39;
                                    var5 += (float) this.field349;
                                }

                            }
                        }
                    }
                } else if (var6 < (float) this.field354) {
                    if (var4 > (float) this.field354) {
                        var4 = (float) this.field354;
                    }

                    if (var5 > (float) this.field354) {
                        var5 = (float) this.field354;
                    }

                    var12 = var12 - var32 * var9 + var32;
                    var40 = (float) (var15 & 16711680) - var34 * var9 + var34;
                    var41 = (float) (var15 & '\uff00') - var36 * var9 + var36;
                    var42 = (float) (var15 & 255) - var38 * var9 + var38;
                    if (var4 < var5) {
                        var8 = var9;
                        if (var6 < 0.0F) {
                            var8 = var9 - var28 * var6;
                            var9 -= var30 * var6;
                            var12 -= var33 * var6;
                            var40 -= var35 * var6;
                            var41 -= var37 * var6;
                            var42 -= var39 * var6;
                            var6 = 0.0F;
                        }

                        if (var4 < 0.0F) {
                            var7 -= var29 * var4;
                            var4 = 0.0F;
                        }

                        if (var28 < var30) {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F)) - var4;
                            var4 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var4 >= 0.0F; var6 += (float) this.field349) {
                                this.method346(var2, var3, this.field350, (int) var6, 0, 0, (int) var8, (int) var9, var12, var32, var40, var34, var41, var36, var42, var38);
                                var8 += var28;
                                var9 += var30;
                                var12 += var33;
                                var40 += var35;
                                var41 += var37;
                                var42 += var39;
                            }

                            while (--var5 >= 0.0F) {
                                this.method346(var2, var3, this.field350, (int) var6, 0, 0, (int) var8, (int) var7, var12, var32, var40, var34, var41, var36, var42, var38);
                                var8 += var28;
                                var7 += var29;
                                var12 += var33;
                                var40 += var35;
                                var41 += var37;
                                var42 += var39;
                                var6 += (float) this.field349;
                            }

                        } else {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F)) - var4;
                            var4 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var4 >= 0.0F; var6 += (float) this.field349) {
                                this.method346(var2, var3, this.field350, (int) var6, 0, 0, (int) var9, (int) var8, var12, var32, var40, var34, var41, var36, var42, var38);
                                var8 += var28;
                                var9 += var30;
                                var12 += var33;
                                var40 += var35;
                                var41 += var37;
                                var42 += var39;
                            }

                            while (--var5 >= 0.0F) {
                                this.method346(var2, var3, this.field350, (int) var6, 0, 0, (int) var7, (int) var8, var12, var32, var40, var34, var41, var36, var42, var38);
                                var8 += var28;
                                var7 += var29;
                                var12 += var33;
                                var40 += var35;
                                var41 += var37;
                                var42 += var39;
                                var6 += (float) this.field349;
                            }

                        }
                    } else {
                        var7 = var9;
                        if (var6 < 0.0F) {
                            var7 = var9 - var28 * var6;
                            var9 -= var30 * var6;
                            var12 -= var33 * var6;
                            var40 -= var35 * var6;
                            var41 -= var37 * var6;
                            var42 -= var39 * var6;
                            var6 = 0.0F;
                        }

                        if (var5 < 0.0F) {
                            var8 -= var29 * var5;
                            var5 = 0.0F;
                        }

                        if (var28 < var30) {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F)) - var5;
                            var5 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var5 >= 0.0F; var6 += (float) this.field349) {
                                this.method346(var2, var3, this.field350, (int) var6, 0, 0, (int) var7, (int) var9, var12, var32, var40, var34, var41, var36, var42, var38);
                                var7 += var28;
                                var9 += var30;
                                var12 += var33;
                                var40 += var35;
                                var41 += var37;
                                var42 += var39;
                            }

                            while (--var4 >= 0.0F) {
                                this.method346(var2, var3, this.field350, (int) var6, 0, 0, (int) var8, (int) var9, var12, var32, var40, var34, var41, var36, var42, var38);
                                var8 += var29;
                                var9 += var30;
                                var12 += var33;
                                var40 += var35;
                                var41 += var37;
                                var42 += var39;
                                var6 += (float) this.field349;
                            }

                        } else {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F)) - var5;
                            var5 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var5 >= 0.0F; var6 += (float) this.field349) {
                                this.method346(var2, var3, this.field350, (int) var6, 0, 0, (int) var9, (int) var7, var12, var32, var40, var34, var41, var36, var42, var38);
                                var7 += var28;
                                var9 += var30;
                                var12 += var33;
                                var40 += var35;
                                var41 += var37;
                                var42 += var39;
                            }

                            while (--var4 >= 0.0F) {
                                this.method346(var2, var3, this.field350, (int) var6, 0, 0, (int) var9, (int) var8, var12, var32, var40, var34, var41, var36, var42, var38);
                                var8 += var29;
                                var9 += var30;
                                var12 += var33;
                                var40 += var35;
                                var41 += var37;
                                var42 += var39;
                                var6 += (float) this.field349;
                            }

                        }
                    }
                }
            }
        }
    }

    final void method341(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13) {
        if (this.field352) {
            this.field347.method4837((int) var7, (int) var4, (int) var8, (int) var5, var13, 2105435176);
            this.field347.method4837((int) var8, (int) var5, (int) var9, (int) var6, var13, 2069930213);
            this.field347.method4837((int) var9, (int) var6, (int) var7, (int) var4, var13, 2012738813);
        } else {
            float var14 = var8 - var7;
            float var15 = var5 - var4;
            float var16 = var9 - var7;
            float var17 = var6 - var4;
            float var18 = var11 - var10;
            float var19 = var12 - var10;
            float var20 = 0.0F;
            if (var5 != var4) {
                var20 = (var8 - var7) / (var5 - var4);
            }

            float var21 = 0.0F;
            if (var6 != var5) {
                var21 = (var9 - var8) / (var6 - var5);
            }

            float var22 = 0.0F;
            if (var6 != var4) {
                var22 = (var7 - var9) / (var4 - var6);
            }

            float var23 = var14 * var17 - var16 * var15;
            if (var23 != 0.0F) {
                float var24 = (var18 * var17 - var19 * var15) / var23;
                float var25 = (var19 * var14 - var18 * var16) / var23;
                if (var4 <= var5 && var4 <= var6) {
                    if (var4 < (float) this.field354) {
                        if (var5 > (float) this.field354) {
                            var5 = (float) this.field354;
                        }

                        if (var6 > (float) this.field354) {
                            var6 = (float) this.field354;
                        }

                        var10 = var10 - var24 * var7 + var24;
                        if (var5 < var6) {
                            var9 = var7;
                            if (var4 < 0.0F) {
                                var9 = var7 - var22 * var4;
                                var7 -= var20 * var4;
                                var10 -= var25 * var4;
                                var4 = 0.0F;
                            }

                            if (var5 < 0.0F) {
                                var8 -= var21 * var5;
                                var5 = 0.0F;
                            }

                            if (var4 != var5 && var22 < var20 || var4 == var5 && var22 > var21) {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var5;
                                var5 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var5 >= 0.0F; var4 += (float) this.field349) {
                                    this.method342(var1, var2, var3, this.field350, (int) var4, var13, 0, (int) var9, (int) var7, var10, var24);
                                    var9 += var22;
                                    var7 += var20;
                                    var10 += var25;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method342(var1, var2, var3, this.field350, (int) var4, var13, 0, (int) var9, (int) var8, var10, var24);
                                    var9 += var22;
                                    var8 += var21;
                                    var10 += var25;
                                    var4 += (float) this.field349;
                                }

                            } else {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var5;
                                var5 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var5 >= 0.0F; var4 += (float) this.field349) {
                                    this.method342(var1, var2, var3, this.field350, (int) var4, var13, 0, (int) var7, (int) var9, var10, var24);
                                    var9 += var22;
                                    var7 += var20;
                                    var10 += var25;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method342(var1, var2, var3, this.field350, (int) var4, var13, 0, (int) var8, (int) var9, var10, var24);
                                    var9 += var22;
                                    var8 += var21;
                                    var10 += var25;
                                    var4 += (float) this.field349;
                                }

                            }
                        } else {
                            var8 = var7;
                            if (var4 < 0.0F) {
                                var8 = var7 - var22 * var4;
                                var7 -= var20 * var4;
                                var10 -= var25 * var4;
                                var4 = 0.0F;
                            }

                            if (var6 < 0.0F) {
                                var9 -= var21 * var6;
                                var6 = 0.0F;
                            }

                            if ((var4 == var6 || var22 >= var20) && (var4 != var6 || var21 <= var20)) {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F)) - var6;
                                var6 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var6 >= 0.0F; var4 += (float) this.field349) {
                                    this.method342(var1, var2, var3, this.field350, (int) var4, var13, 0, (int) var7, (int) var8, var10, var24);
                                    var8 += var22;
                                    var7 += var20;
                                    var10 += var25;
                                }

                                while (--var5 >= 0.0F) {
                                    this.method342(var1, var2, var3, this.field350, (int) var4, var13, 0, (int) var7, (int) var9, var10, var24);
                                    var9 += var21;
                                    var7 += var20;
                                    var10 += var25;
                                    var4 += (float) this.field349;
                                }

                            } else {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F)) - var6;
                                var6 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var6 >= 0.0F; var4 += (float) this.field349) {
                                    this.method342(var1, var2, var3, this.field350, (int) var4, var13, 0, (int) var8, (int) var7, var10, var24);
                                    var8 += var22;
                                    var7 += var20;
                                    var10 += var25;
                                }

                                while (--var5 >= 0.0F) {
                                    this.method342(var1, var2, var3, this.field350, (int) var4, var13, 0, (int) var9, (int) var7, var10, var24);
                                    var9 += var21;
                                    var7 += var20;
                                    var10 += var25;
                                    var4 += (float) this.field349;
                                }

                            }
                        }
                    }
                } else if (var5 <= var6) {
                    if (var5 < (float) this.field354) {
                        if (var6 > (float) this.field354) {
                            var6 = (float) this.field354;
                        }

                        if (var4 > (float) this.field354) {
                            var4 = (float) this.field354;
                        }

                        var11 = var11 - var24 * var8 + var24;
                        if (var6 < var4) {
                            var7 = var8;
                            if (var5 < 0.0F) {
                                var7 = var8 - var20 * var5;
                                var8 -= var21 * var5;
                                var11 -= var25 * var5;
                                var5 = 0.0F;
                            }

                            if (var6 < 0.0F) {
                                var9 -= var22 * var6;
                                var6 = 0.0F;
                            }

                            if (var5 != var6 && var20 < var21 || var5 == var6 && var20 > var22) {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F)) - var6;
                                var6 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var6 >= 0.0F; var5 += (float) this.field349) {
                                    this.method342(var1, var2, var3, this.field350, (int) var5, var13, 0, (int) var7, (int) var8, var11, var24);
                                    var7 += var20;
                                    var8 += var21;
                                    var11 += var25;
                                }

                                while (--var4 >= 0.0F) {
                                    this.method342(var1, var2, var3, this.field350, (int) var5, var13, 0, (int) var7, (int) var9, var11, var24);
                                    var7 += var20;
                                    var9 += var22;
                                    var11 += var25;
                                    var5 += (float) this.field349;
                                }

                            } else {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F)) - var6;
                                var6 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var6 >= 0.0F; var5 += (float) this.field349) {
                                    this.method342(var1, var2, var3, this.field350, (int) var5, var13, 0, (int) var8, (int) var7, var11, var24);
                                    var7 += var20;
                                    var8 += var21;
                                    var11 += var25;
                                }

                                while (--var4 >= 0.0F) {
                                    this.method342(var1, var2, var3, this.field350, (int) var5, var13, 0, (int) var9, (int) var7, var11, var24);
                                    var7 += var20;
                                    var9 += var22;
                                    var11 += var25;
                                    var5 += (float) this.field349;
                                }

                            }
                        } else {
                            var9 = var8;
                            if (var5 < 0.0F) {
                                var9 = var8 - var20 * var5;
                                var8 -= var21 * var5;
                                var11 -= var25 * var5;
                                var5 = 0.0F;
                            }

                            if (var4 < 0.0F) {
                                var7 -= var22 * var4;
                                var4 = 0.0F;
                            }

                            if (var20 < var21) {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var4;
                                var4 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var4 >= 0.0F; var5 += (float) this.field349) {
                                    this.method342(var1, var2, var3, this.field350, (int) var5, var13, 0, (int) var9, (int) var8, var11, var24);
                                    var9 += var20;
                                    var8 += var21;
                                    var11 += var25;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method342(var1, var2, var3, this.field350, (int) var5, var13, 0, (int) var7, (int) var8, var11, var24);
                                    var7 += var22;
                                    var8 += var21;
                                    var11 += var25;
                                    var5 += (float) this.field349;
                                }

                            } else {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var4;
                                var4 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var4 >= 0.0F; var5 += (float) this.field349) {
                                    this.method342(var1, var2, var3, this.field350, (int) var5, var13, 0, (int) var8, (int) var9, var11, var24);
                                    var9 += var20;
                                    var8 += var21;
                                    var11 += var25;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method342(var1, var2, var3, this.field350, (int) var5, var13, 0, (int) var8, (int) var7, var11, var24);
                                    var7 += var22;
                                    var8 += var21;
                                    var11 += var25;
                                    var5 += (float) this.field349;
                                }

                            }
                        }
                    }
                } else if (var6 < (float) this.field354) {
                    if (var4 > (float) this.field354) {
                        var4 = (float) this.field354;
                    }

                    if (var5 > (float) this.field354) {
                        var5 = (float) this.field354;
                    }

                    var12 = var12 - var24 * var9 + var24;
                    if (var4 < var5) {
                        var8 = var9;
                        if (var6 < 0.0F) {
                            var8 = var9 - var21 * var6;
                            var9 -= var22 * var6;
                            var12 -= var25 * var6;
                            var6 = 0.0F;
                        }

                        if (var4 < 0.0F) {
                            var7 -= var20 * var4;
                            var4 = 0.0F;
                        }

                        if (var21 < var22) {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F)) - var4;
                            var4 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var4 >= 0.0F; var6 += (float) this.field349) {
                                this.method342(var1, var2, var3, this.field350, (int) var6, var13, 0, (int) var8, (int) var9, var12, var24);
                                var8 += var21;
                                var9 += var22;
                                var12 += var25;
                            }

                            while (--var5 >= 0.0F) {
                                this.method342(var1, var2, var3, this.field350, (int) var6, var13, 0, (int) var8, (int) var7, var12, var24);
                                var8 += var21;
                                var7 += var20;
                                var12 += var25;
                                var6 += (float) this.field349;
                            }

                        } else {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F)) - var4;
                            var4 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var4 >= 0.0F; var6 += (float) this.field349) {
                                this.method342(var1, var2, var3, this.field350, (int) var6, var13, 0, (int) var9, (int) var8, var12, var24);
                                var8 += var21;
                                var9 += var22;
                                var12 += var25;
                            }

                            while (--var5 >= 0.0F) {
                                this.method342(var1, var2, var3, this.field350, (int) var6, var13, 0, (int) var7, (int) var8, var12, var24);
                                var8 += var21;
                                var7 += var20;
                                var12 += var25;
                                var6 += (float) this.field349;
                            }

                        }
                    } else {
                        var7 = var9;
                        if (var6 < 0.0F) {
                            var7 = var9 - var21 * var6;
                            var9 -= var22 * var6;
                            var12 -= var25 * var6;
                            var6 = 0.0F;
                        }

                        if (var5 < 0.0F) {
                            var8 -= var20 * var5;
                            var5 = 0.0F;
                        }

                        if (var21 < var22) {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F)) - var5;
                            var5 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var5 >= 0.0F; var6 += (float) this.field349) {
                                this.method342(var1, var2, var3, this.field350, (int) var6, var13, 0, (int) var7, (int) var9, var12, var24);
                                var7 += var21;
                                var9 += var22;
                                var12 += var25;
                            }

                            while (--var4 >= 0.0F) {
                                this.method342(var1, var2, var3, this.field350, (int) var6, var13, 0, (int) var8, (int) var9, var12, var24);
                                var8 += var20;
                                var9 += var22;
                                var12 += var25;
                                var6 += (float) this.field349;
                            }

                        } else {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F)) - var5;
                            var5 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var5 >= 0.0F; var6 += (float) this.field349) {
                                this.method342(var1, var2, var3, this.field350, (int) var6, var13, 0, (int) var9, (int) var7, var12, var24);
                                var7 += var21;
                                var9 += var22;
                                var12 += var25;
                            }

                            while (--var4 >= 0.0F) {
                                this.method342(var1, var2, var3, this.field350, (int) var6, var13, 0, (int) var9, (int) var8, var12, var24);
                                var8 += var20;
                                var9 += var22;
                                var12 += var25;
                                var6 += (float) this.field349;
                            }

                        }
                    }
                }
            }
        }
    }

    final void method342(boolean var1, boolean var2, boolean var3, int[] var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11) {
        if (this.field336) {
            if (var9 > this.field338) {
                var9 = this.field338;
            }

            if (var8 < 0) {
                var8 = 0;
            }
        }

        if (var8 < var9) {
            var5 += var8 - 1;
            var7 = var9 - var8 >> 2;
            var10 += var11 * (float) var8;
            int var12;
            int var13;
            int var14;
            if (this.field340.field7896) {
                if (this.field335 == 0) {
                    while (true) {
                        --var7;
                        if (var7 < 0) {
                            var7 = var9 - var8 & 3;

                            while (true) {
                                --var7;
                                if (var7 < 0) {
                                    return;
                                }

                                ++var5;
                                if (!var2 || var10 < this.field351[var5]) {
                                    if (var1) {
                                        var4[var5] = var6;
                                    }

                                    if (var2) {
                                        this.field351[var5] = var10;
                                    }
                                }

                                var10 += var11;
                            }
                        }

                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            if (var1) {
                                var4[var5] = var6;
                            }

                            if (var2) {
                                this.field351[var5] = var10;
                            }
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            if (var1) {
                                var4[var5] = var6;
                            }

                            if (var2) {
                                this.field351[var5] = var10;
                            }
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            if (var1) {
                                var4[var5] = var6;
                            }

                            if (var2) {
                                this.field351[var5] = var10;
                            }
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            if (var1) {
                                var4[var5] = var6;
                            }

                            if (var2) {
                                this.field351[var5] = var10;
                            }
                        }

                        var10 += var11;
                    }
                } else if (this.field335 != 254) {
                    var12 = this.field335;
                    var13 = 256 - this.field335;
                    var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

                    while (true) {
                        --var7;
                        if (var7 < 0) {
                            var7 = var9 - var8 & 3;

                            while (true) {
                                --var7;
                                if (var7 < 0) {
                                    return;
                                }

                                ++var5;
                                if (!var2 || var10 < this.field351[var5]) {
                                    if (var1) {
                                        var14 = var4[var5];
                                        if (var3) {
                                            var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                        } else {
                                            var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                        }
                                    }

                                    if (var2) {
                                        this.field351[var5] = var10;
                                    }
                                }

                                var10 += var11;
                            }
                        }

                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            if (var1) {
                                var14 = var4[var5];
                                if (var3) {
                                    var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                } else {
                                    var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                }
                            }

                            if (var2) {
                                this.field351[var5] = var10;
                            }
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            if (var1) {
                                var14 = var4[var5];
                                if (var3) {
                                    var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                } else {
                                    var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                }
                            }

                            if (var2) {
                                this.field351[var5] = var10;
                            }
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            if (var1) {
                                var14 = var4[var5];
                                if (var3) {
                                    var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                } else {
                                    var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                }
                            }

                            if (var2) {
                                this.field351[var5] = var10;
                            }
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            if (var1) {
                                var14 = var4[var5];
                                if (var3) {
                                    var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                } else {
                                    var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                }
                            }

                            if (var2) {
                                this.field351[var5] = var10;
                            }
                        }

                        var10 += var11;
                    }
                } else if (var8 != 0 && var9 <= this.field338 - 1) {
                    while (true) {
                        --var7;
                        if (var7 < 0) {
                            var7 = var9 - var8 & 3;

                            while (true) {
                                --var7;
                                if (var7 < 0) {
                                    return;
                                }

                                ++var5;
                                if ((!var2 || var10 < this.field351[var5]) && var1) {
                                    var4[var5 - 1] = var4[var5];
                                }

                                var10 += var11;
                            }
                        }

                        ++var5;
                        if ((!var2 || var10 < this.field351[var5]) && var1) {
                            var4[var5 - 1] = var4[var5];
                        }

                        var10 += var11;
                        ++var5;
                        if ((!var2 || var10 < this.field351[var5]) && var1) {
                            var4[var5 - 1] = var4[var5];
                        }

                        var10 += var11;
                        ++var5;
                        if ((!var2 || var10 < this.field351[var5]) && var1) {
                            var4[var5 - 1] = var4[var5];
                        }

                        var10 += var11;
                        ++var5;
                        if ((!var2 || var10 < this.field351[var5]) && var1) {
                            var4[var5 - 1] = var4[var5];
                        }

                        var10 += var11;
                    }
                }
            } else if (var1) {
                if (this.field335 == 0) {
                    while (true) {
                        --var7;
                        if (var7 < 0) {
                            var7 = var9 - var8 & 3;

                            while (true) {
                                --var7;
                                if (var7 < 0) {
                                    return;
                                }

                                ++var5;
                                if (!var2 || var10 < this.field351[var5]) {
                                    var4[var5] = var6;
                                }

                                var10 += var11;
                            }
                        }

                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var4[var5] = var6;
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var4[var5] = var6;
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var4[var5] = var6;
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var4[var5] = var6;
                        }

                        var10 += var11;
                    }
                } else if (this.field335 != 254) {
                    var12 = this.field335;
                    var13 = 256 - this.field335;
                    var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

                    while (true) {
                        --var7;
                        if (var7 < 0) {
                            var7 = var9 - var8 & 3;

                            while (true) {
                                --var7;
                                if (var7 < 0) {
                                    return;
                                }

                                ++var5;
                                if (!var2 || var10 < this.field351[var5]) {
                                    var14 = var4[var5];
                                    if (var3) {
                                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                    } else {
                                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                                    }
                                }

                                var10 += var11;
                            }
                        }

                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var14 = var4[var5];
                            if (var3) {
                                var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                            } else {
                                var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                            }
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var14 = var4[var5];
                            if (var3) {
                                var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                            } else {
                                var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                            }
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var14 = var4[var5];
                            if (var3) {
                                var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                            } else {
                                var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                            }
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var14 = var4[var5];
                            if (var3) {
                                var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                            } else {
                                var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                            }
                        }

                        var10 += var11;
                    }
                } else if (var8 != 0 && var9 <= this.field338 - 1) {
                    while (true) {
                        --var7;
                        if (var7 < 0) {
                            var7 = var9 - var8 & 3;

                            while (true) {
                                --var7;
                                if (var7 < 0) {
                                    return;
                                }

                                ++var5;
                                if (!var2 || var10 < this.field351[var5]) {
                                    var4[var5 - 1] = var4[var5];
                                }

                                var10 += var11;
                            }
                        }

                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var4[var5 - 1] = var4[var5];
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var4[var5 - 1] = var4[var5];
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var4[var5 - 1] = var4[var5];
                        }

                        var10 += var11;
                        ++var5;
                        if (!var2 || var10 < this.field351[var5]) {
                            var4[var5 - 1] = var4[var5];
                        }

                        var10 += var11;
                    }
                }
            }
        }
    }

    final void method343(boolean var1, boolean var2, int[] var3, int[] var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25) {
        int var26 = var7 - var6;
        float var27 = 1.0F / (float) var26;
        float var28 = (var9 - var8) * var27;
        float var29 = (var11 - var10) * var27;
        float var30 = (var13 - var12) * var27;
        float var31 = (var15 - var14) * var27;
        float var32 = (var17 - var16) * var27;
        float var33 = (var19 - var18) * var27;
        float var34 = (var21 - var20) * var27;
        float var35 = (var23 - var22) * var27;
        float var36 = (var25 - var24) * var27;
        if (this.field336) {
            if (var7 > this.field338) {
                var7 = this.field338;
            }

            if (var6 < 0) {
                var8 -= var28 * (float) var6;
                var10 -= var29 * (float) var6;
                var12 -= var30 * (float) var6;
                var14 -= var31 * (float) var6;
                var16 -= var32 * (float) var6;
                var18 -= var33 * (float) var6;
                var20 -= var34 * (float) var6;
                var22 -= var35 * (float) var6;
                var24 -= var36 * (float) var6;
                var6 = 0;
            }
        }

        if (var6 < var7) {
            var26 = var7 - var6;

            for (var5 += var6; var26-- > 0; var24 += var36) {
                float var37 = 1.0F / var8;
                float var38 = 1.0F / var10;
                if (!var1 || var37 < this.field351[var5]) {
                    int var39 = (int) (var12 * var38 * (float) this.field355);
                    if (this.field359) {
                        var39 &= this.field356;
                    } else if (var39 < 0) {
                        var39 = 0;
                    } else if (var39 > this.field356) {
                        var39 = this.field356;
                    }

                    int var40 = (int) (var14 * var38 * (float) this.field355);
                    if (this.field359) {
                        var40 &= this.field356;
                    } else if (var40 < 0) {
                        var40 = 0;
                    } else if (var40 > this.field356) {
                        var40 = this.field356;
                    }

                    int var41 = this.field346[var40 * this.field355 + var39];
                    boolean var42 = true;
                    int var46;
                    if (this.field358 == 2) {
                        var46 = var41 >> 24 & 255;
                    } else if (this.field358 == 1) {
                        var46 = var41 != 0 ? 255 : 0;
                    } else {
                        var46 = (int) var18;
                    }

                    if (var46 != 0) {
                        int var43;
                        int var44;
                        int var45;
                        if (var46 != 255) {
                            var43 = -16777216 | (int) (var20 * (float) (var41 >> 16 & 255)) << 8 & 16711680 | (int) (var22 * (float) (var41 >> 8 & 255)) & '\uff00' | (int) (var24 * (float) (var41 & 255)) >> 8;
                            if (var16 != 0.0F) {
                                var44 = (int) (255.0F - var16);
                                var45 = ((this.field334 & 16711935) * (int) var16 & -16711936 | (this.field334 & '\uff00') * (int) var16 & 16711680) >>> 8;
                                var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                            }

                            var44 = var3[var5];
                            var45 = 255 - var46;
                            var43 = ((var44 & 16711935) * var45 + (var43 & 16711935) * var46 & -16711936) + ((var44 & '\uff00') * var45 + (var43 & '\uff00') * var46 & 16711680) >> 8;
                            if (var2) {
                                var3[var5] = (var46 | var3[var5] >> 24) << 24 | var43;
                            } else {
                                var3[var5] = var43;
                            }

                            if (var1) {
                                this.field351[var5] = var37;
                            }
                        } else {
                            var43 = -16777216 | (int) (var20 * (float) (var41 >> 16 & 255)) << 8 & 16711680 | (int) (var22 * (float) (var41 >> 8 & 255)) & '\uff00' | (int) (var24 * (float) (var41 & 255)) >> 8;
                            if (var16 != 0.0F) {
                                var44 = (int) (255.0F - var16);
                                var45 = ((this.field334 & 16711935) * (int) var16 & -16711936 | (this.field334 & '\uff00') * (int) var16 & 16711680) >>> 8;
                                var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                            }

                            if (var2) {
                                var3[var5] = var46 << 24 | var43;
                            } else {
                                var3[var5] = var43;
                            }

                            if (var1) {
                                this.field351[var5] = var37;
                            }
                        }
                    }
                }

                ++var5;
                var8 += var28;
                var10 += var29;
                var12 += var30;
                var14 += var31;
                var16 += var32;
                var18 += var33;
                var20 += var34;
                var22 += var35;
            }

        }
    }

    final void method344(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29, float var30, int var31, float var32, int var33, float var34) {
        if (!var1) {
            this.method341(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
        } else {
            this.field334 = var25;
            float var35;
            int var36;
            if (var4 > var5 || var4 > var6) {
                if (var5 <= var6) {
                    var35 = var7;
                    var7 = var8;
                    var8 = var35;
                    var35 = var4;
                    var4 = var5;
                    var5 = var35;
                    var35 = var10;
                    var10 = var11;
                    var11 = var35;
                    var35 = var16;
                    var16 = var17;
                    var17 = var35;
                    var35 = var19;
                    var19 = var20;
                    var20 = var35;
                    var35 = var13;
                    var13 = var14;
                    var14 = var35;
                    var35 = var26;
                    var26 = var27;
                    var27 = var35;
                    var35 = var30;
                    var30 = var32;
                    var32 = var35;
                    var36 = var22;
                    var22 = var23;
                    var23 = var36;
                    var36 = var29;
                    var29 = var31;
                    var31 = var36;
                } else {
                    var35 = var7;
                    var7 = var9;
                    var9 = var35;
                    var35 = var4;
                    var4 = var6;
                    var6 = var35;
                    var35 = var10;
                    var10 = var12;
                    var12 = var35;
                    var35 = var16;
                    var16 = var18;
                    var18 = var35;
                    var35 = var19;
                    var19 = var21;
                    var21 = var35;
                    var35 = var13;
                    var13 = var15;
                    var15 = var35;
                    var35 = var26;
                    var26 = var28;
                    var28 = var35;
                    var35 = var30;
                    var30 = var34;
                    var34 = var35;
                    var36 = var22;
                    var22 = var24;
                    var24 = var36;
                    var36 = var29;
                    var29 = var33;
                    var33 = var36;
                }
            }

            int var96;
            if (var29 != this.field353) {
                this.field346 = this.field347.method4445(var29);
                if (this.field346 == null) {
                    this.field335 = 255 - (var22 >> 24 & 255);
                    var96 = class543.field3817[class526.method2228(this.field347.method4454(var29), (byte) 0) & '\uffff'];
                    var36 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
                    this.method340(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, class507.method2511(var36, var25, var26, 178916628), class507.method2511(var36, var25, var27, 259766388), class507.method2511(var36, var25, var28, 1834724145));
                    return;
                }

                this.field355 = this.field347.method4447(var29) ? 64 : this.field347.field7949 * -806628381 * 1107560907;
                this.field356 = this.field355 - 1;
                this.field358 = this.field347.method4462(var29);
            }

            this.field357 = var30;
            if (var31 != this.field360) {
                this.field361 = this.field347.method4445(var31);
                if (this.field361 == null) {
                    this.field335 = 255 - (var22 >> 24 & 255);
                    var96 = class543.field3817[class526.method2228(this.field347.method4454(var31), (byte) 0) & '\uffff'];
                    var36 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
                    this.method340(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, class507.method2511(var36, var25, var26, -1083739692), class507.method2511(var36, var25, var27, 1950239977), class507.method2511(var36, var25, var28, -1378847638));
                    return;
                }

                this.field345 = this.field347.method4447(var31) ? 64 : this.field347.field7949 * -806628381 * 1107560907;
                this.field344 = this.field345 - 1;
            }

            this.field348 = var32;
            if (var33 != this.field365) {
                this.field366 = this.field347.method4445(var33);
                if (this.field366 == null) {
                    this.field335 = 255 - (var22 >> 24 & 255);
                    var96 = class543.field3817[class526.method2228(this.field347.method4454(var33), (byte) 0) & '\uffff'];
                    var36 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
                    this.method340(true, var2, var3, (float) ((int) var4), (float) ((int) var5), (float) ((int) var6), (float) ((int) var7), (float) ((int) var8), (float) ((int) var9), (float) ((int) var10), (float) ((int) var11), (float) ((int) var12), class507.method2511(var36, var25, var26, -1901757234), class507.method2511(var36, var25, var27, -1655415346), class507.method2511(var36, var25, var28, 90316289));
                    return;
                }

                this.field367 = this.field347.method4447(var33) ? 64 : this.field347.field7949 * -806628381 * 1107560907;
                this.field368 = this.field367 - 1;
            }

            this.field369 = var34;
            var16 /= var13;
            var17 /= var14;
            var18 /= var15;
            var19 /= var13;
            var20 /= var14;
            var21 /= var15;
            var10 = 1.0F / var10;
            var11 = 1.0F / var11;
            var12 = 1.0F / var12;
            var13 = 1.0F / var13;
            var14 = 1.0F / var14;
            var15 = 1.0F / var15;
            var35 = (float) (var22 >> 24 & 255);
            float var95 = (float) (var23 >> 24 & 255);
            float var37 = (float) (var24 >> 24 & 255);
            float var38 = (float) (var22 >> 16 & 255);
            float var39 = (float) (var23 >> 16 & 255);
            float var40 = (float) (var24 >> 16 & 255);
            float var41 = (float) (var22 >> 8 & 255);
            float var42 = (float) (var23 >> 8 & 255);
            float var43 = (float) (var24 >> 8 & 255);
            float var44 = (float) (var22 & 255);
            float var45 = (float) (var23 & 255);
            float var46 = (float) (var24 & 255);
            float var47 = 1.0F;
            float var48 = 0.0F;
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 1.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            float var55 = 0.0F;
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            float var62 = 0.0F;
            float var63 = 0.0F;
            float var64 = 0.0F;
            float var65;
            if (var5 != var4) {
                var65 = var5 - var4;
                var53 = (var8 - var7) / var65;
                var54 = (var11 - var10) / var65;
                var55 = (var14 - var13) / var65;
                var56 = (var17 - var16) / var65;
                var57 = (var20 - var19) / var65;
                var58 = (var27 - var26) / var65;
                var59 = (var95 - var35) / var65;
                var60 = (var39 - var38) / var65;
                var61 = (var42 - var41) / var65;
                var62 = (var45 - var44) / var65;
                var63 = (var48 - var47) / var65;
                var64 = (var51 - var50) / var65;
            }

            var65 = 0.0F;
            float var66 = 0.0F;
            float var67 = 0.0F;
            float var68 = 0.0F;
            float var69 = 0.0F;
            float var70 = 0.0F;
            float var71 = 0.0F;
            float var72 = 0.0F;
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77;
            if (var6 != var5) {
                var77 = var6 - var5;
                var65 = (var9 - var8) / var77;
                var66 = (var12 - var11) / var77;
                var67 = (var15 - var14) / var77;
                var68 = (var18 - var17) / var77;
                var69 = (var21 - var20) / var77;
                var70 = (var28 - var27) / var77;
                var71 = (var37 - var95) / var77;
                var72 = (var40 - var39) / var77;
                var73 = (var43 - var42) / var77;
                var74 = (var46 - var45) / var77;
                var75 = (var49 - var48) / var77;
                var76 = (var52 - var51) / var77;
            }

            var77 = 0.0F;
            float var78 = 0.0F;
            float var79 = 0.0F;
            float var80 = 0.0F;
            float var81 = 0.0F;
            float var82 = 0.0F;
            float var83 = 0.0F;
            float var84 = 0.0F;
            float var85 = 0.0F;
            float var86 = 0.0F;
            float var87 = 0.0F;
            float var88 = 0.0F;
            float var89;
            if (var4 != var6) {
                var89 = var4 - var6;
                var77 = (var7 - var9) / var89;
                var78 = (var10 - var12) / var89;
                var79 = (var13 - var15) / var89;
                var80 = (var16 - var18) / var89;
                var81 = (var19 - var21) / var89;
                var82 = (var26 - var28) / var89;
                var83 = (var35 - var37) / var89;
                var84 = (var38 - var40) / var89;
                var85 = (var41 - var43) / var89;
                var86 = (var44 - var46) / var89;
                var87 = (var47 - var49) / var89;
                var88 = (var50 - var52) / var89;
            }

            if (var4 < (float) this.field354) {
                if (var5 > (float) this.field354) {
                    var5 = (float) this.field354;
                }

                if (var6 > (float) this.field354) {
                    var6 = (float) this.field354;
                }

                if (var5 < var6) {
                    var9 = var7;
                    var12 = var10;
                    var15 = var13;
                    var18 = var16;
                    var21 = var19;
                    var28 = var26;
                    var37 = var35;
                    var40 = var38;
                    var43 = var41;
                    var46 = var44;
                    var49 = var47;
                    var52 = var50;
                    if (var4 < 0.0F) {
                        var7 -= var53 * var4;
                        var9 -= var77 * var4;
                        var10 -= var54 * var4;
                        var12 -= var78 * var4;
                        var13 -= var55 * var4;
                        var15 -= var79 * var4;
                        var16 -= var56 * var4;
                        var18 -= var80 * var4;
                        var19 -= var57 * var4;
                        var21 -= var81 * var4;
                        var26 -= var58 * var4;
                        var28 -= var82 * var4;
                        var35 -= var59 * var4;
                        var37 -= var83 * var4;
                        var38 -= var60 * var4;
                        var40 -= var84 * var4;
                        var41 -= var61 * var4;
                        var43 -= var85 * var4;
                        var44 -= var62 * var4;
                        var46 -= var86 * var4;
                        var47 -= var63 * var4;
                        var49 -= var87 * var4;
                        var50 -= var64 * var4;
                        var52 -= var88 * var4;
                        var4 = 0.0F;
                    }

                    if (var5 < 0.0F) {
                        var8 -= var65 * var5;
                        var11 -= var66 * var5;
                        var14 -= var67 * var5;
                        var17 -= var68 * var5;
                        var20 -= var69 * var5;
                        var27 -= var70 * var5;
                        var95 -= var71 * var5;
                        var39 -= var72 * var5;
                        var42 -= var73 * var5;
                        var45 -= var74 * var5;
                        var48 -= var75 * var5;
                        var51 -= var76 * var5;
                        var5 = 0.0F;
                    }

                    if ((var4 == var5 || var77 >= var53) && (var4 != var5 || var77 <= var65)) {
                        var4 = (float) ((int) (var4 + 0.5F));
                        var5 = (float) ((int) (var5 + 0.5F));
                        var6 = (float) ((int) (var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for (var4 = (float) this.field363[(int) var4]; --var5 >= 0.0F; var4 += (float) this.field349) {
                            this.method345(var2, var3, this.field350, (int) var4, (int) var7, (int) var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var35, var37, var38, var40, var41, var43, var44, var46, var47, var49, var50, var52);
                            var7 += var53;
                            var9 += var77;
                            var10 += var54;
                            var12 += var78;
                            var13 += var55;
                            var15 += var79;
                            var16 += var56;
                            var18 += var80;
                            var19 += var57;
                            var21 += var81;
                            var26 += var58;
                            var28 += var82;
                            var35 += var59;
                            var37 += var83;
                            var38 += var60;
                            var40 += var84;
                            var41 += var61;
                            var43 += var85;
                            var44 += var62;
                            var46 += var86;
                            var47 += var63;
                            var49 += var87;
                            var50 += var64;
                            var52 += var88;
                        }

                        while (--var6 >= 0.0F) {
                            this.method345(var2, var3, this.field350, (int) var4, (int) var8, (int) var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var95, var37, var39, var40, var42, var43, var45, var46, var48, var49, var51, var52);
                            var8 += var65;
                            var9 += var77;
                            var11 += var66;
                            var12 += var78;
                            var14 += var67;
                            var15 += var79;
                            var17 += var68;
                            var18 += var80;
                            var20 += var69;
                            var21 += var81;
                            var27 += var70;
                            var28 += var82;
                            var95 += var71;
                            var37 += var83;
                            var39 += var72;
                            var40 += var84;
                            var42 += var73;
                            var43 += var85;
                            var45 += var74;
                            var46 += var86;
                            var48 += var75;
                            var49 += var87;
                            var51 += var76;
                            var52 += var88;
                            var4 += (float) this.field349;
                        }
                    } else {
                        var4 = (float) ((int) (var4 + 0.5F));
                        var5 = (float) ((int) (var5 + 0.5F));
                        var6 = (float) ((int) (var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for (var4 = (float) this.field363[(int) var4]; --var5 >= 0.0F; var4 += (float) this.field349) {
                            this.method345(var2, var3, this.field350, (int) var4, (int) var9, (int) var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var37, var35, var40, var38, var43, var41, var46, var44, var49, var47, var52, var50);
                            var7 += var53;
                            var9 += var77;
                            var10 += var54;
                            var12 += var78;
                            var13 += var55;
                            var15 += var79;
                            var16 += var56;
                            var18 += var80;
                            var19 += var57;
                            var21 += var81;
                            var26 += var58;
                            var28 += var82;
                            var35 += var59;
                            var37 += var83;
                            var38 += var60;
                            var40 += var84;
                            var41 += var61;
                            var43 += var85;
                            var44 += var62;
                            var46 += var86;
                            var47 += var63;
                            var49 += var87;
                            var50 += var64;
                            var52 += var88;
                        }

                        while (--var6 >= 0.0F) {
                            this.method345(var2, var3, this.field350, (int) var4, (int) var9, (int) var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var37, var95, var40, var39, var43, var42, var46, var45, var49, var48, var52, var51);
                            var8 += var65;
                            var9 += var77;
                            var11 += var66;
                            var12 += var78;
                            var14 += var67;
                            var15 += var79;
                            var17 += var68;
                            var18 += var80;
                            var20 += var69;
                            var21 += var81;
                            var27 += var70;
                            var28 += var82;
                            var95 += var71;
                            var37 += var83;
                            var39 += var72;
                            var40 += var84;
                            var42 += var73;
                            var43 += var85;
                            var45 += var74;
                            var46 += var86;
                            var48 += var75;
                            var49 += var87;
                            var51 += var76;
                            var52 += var88;
                            var4 += (float) this.field349;
                        }
                    }
                } else {
                    var8 = var7;
                    var11 = var10;
                    var14 = var13;
                    var17 = var16;
                    var20 = var19;
                    var27 = var26;
                    var89 = var35;
                    float var90 = var38;
                    float var91 = var41;
                    float var92 = var44;
                    float var93 = var47;
                    float var94 = var50;
                    if (var4 < 0.0F) {
                        var7 -= var53 * var4;
                        var8 -= var77 * var4;
                        var10 -= var54 * var4;
                        var11 -= var78 * var4;
                        var13 -= var55 * var4;
                        var14 -= var79 * var4;
                        var16 -= var56 * var4;
                        var17 -= var80 * var4;
                        var19 -= var57 * var4;
                        var20 -= var81 * var4;
                        var26 -= var58 * var4;
                        var27 -= var82 * var4;
                        var35 -= var59 * var4;
                        var89 -= var83 * var4;
                        var38 -= var60 * var4;
                        var90 -= var84 * var4;
                        var41 -= var61 * var4;
                        var91 -= var85 * var4;
                        var44 -= var62 * var4;
                        var92 -= var86 * var4;
                        var47 -= var63 * var4;
                        var93 -= var87 * var4;
                        var50 -= var64 * var4;
                        var94 -= var88 * var4;
                        var4 = 0.0F;
                    }

                    if (var6 < 0.0F) {
                        var9 -= var65 * var6;
                        var12 -= var66 * var6;
                        var15 -= var67 * var6;
                        var18 -= var68 * var6;
                        var21 -= var69 * var6;
                        var28 -= var70 * var6;
                        var37 -= var71 * var6;
                        var40 -= var72 * var6;
                        var43 -= var73 * var6;
                        var46 -= var74 * var6;
                        var49 -= var75 * var6;
                        var52 -= var76 * var6;
                        var6 = 0.0F;
                    }

                    if ((var4 == var6 || var77 >= var53) && (var4 != var6 || var65 <= var53)) {
                        var4 = (float) ((int) (var4 + 0.5F));
                        var6 = (float) ((int) (var6 + 0.5F));
                        var5 = (float) ((int) (var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for (var4 = (float) this.field363[(int) var4]; --var6 >= 0.0F; var4 += (float) this.field349) {
                            this.method345(var2, var3, this.field350, (int) var4, (int) var7, (int) var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var35, var89, var38, var90, var41, var91, var44, var92, var47, var93, var50, var94);
                            var8 += var77;
                            var7 += var53;
                            var11 += var78;
                            var10 += var54;
                            var14 += var79;
                            var13 += var55;
                            var17 += var80;
                            var16 += var56;
                            var20 += var81;
                            var19 += var57;
                            var27 += var82;
                            var26 += var58;
                            var89 += var83;
                            var35 += var59;
                            var90 += var84;
                            var38 += var60;
                            var91 += var85;
                            var41 += var61;
                            var92 += var86;
                            var44 += var62;
                            var93 += var87;
                            var47 += var63;
                            var94 += var88;
                            var50 += var64;
                        }

                        while (--var5 >= 0.0F) {
                            this.method345(var2, var3, this.field350, (int) var4, (int) var7, (int) var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var35, var37, var38, var40, var41, var43, var44, var46, var47, var49, var50, var52);
                            var7 += var53;
                            var9 += var65;
                            var10 += var54;
                            var12 += var66;
                            var13 += var55;
                            var15 += var67;
                            var16 += var56;
                            var18 += var68;
                            var19 += var57;
                            var21 += var69;
                            var26 += var58;
                            var28 += var70;
                            var35 += var59;
                            var37 += var71;
                            var38 += var60;
                            var40 += var72;
                            var41 += var61;
                            var43 += var73;
                            var44 += var62;
                            var46 += var74;
                            var47 += var63;
                            var49 += var75;
                            var50 += var64;
                            var52 += var76;
                            var4 += (float) this.field349;
                        }
                    } else {
                        var4 = (float) ((int) (var4 + 0.5F));
                        var6 = (float) ((int) (var6 + 0.5F));
                        var5 = (float) ((int) (var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for (var4 = (float) this.field363[(int) var4]; --var6 >= 0.0F; var4 += (float) this.field349) {
                            this.method345(var2, var3, this.field350, (int) var4, (int) var8, (int) var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var89, var35, var90, var38, var91, var41, var92, var44, var93, var47, var94, var50);
                            var7 += var53;
                            var8 += var77;
                            var10 += var54;
                            var11 += var78;
                            var13 += var55;
                            var14 += var79;
                            var16 += var56;
                            var17 += var80;
                            var19 += var57;
                            var20 += var81;
                            var26 += var58;
                            var27 += var82;
                            var35 += var59;
                            var89 += var83;
                            var38 += var60;
                            var90 += var84;
                            var41 += var61;
                            var91 += var85;
                            var44 += var62;
                            var92 += var86;
                            var47 += var63;
                            var93 += var87;
                            var50 += var64;
                            var94 += var88;
                        }

                        while (--var5 >= 0.0F) {
                            this.method345(var2, var3, this.field350, (int) var4, (int) var9, (int) var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var37, var35, var40, var38, var43, var41, var46, var44, var49, var47, var52, var50);
                            var9 += var65;
                            var7 += var53;
                            var12 += var66;
                            var10 += var54;
                            var15 += var67;
                            var13 += var55;
                            var18 += var68;
                            var16 += var56;
                            var21 += var69;
                            var19 += var57;
                            var28 += var70;
                            var26 += var58;
                            var37 += var71;
                            var35 += var59;
                            var40 += var72;
                            var38 += var60;
                            var43 += var73;
                            var41 += var61;
                            var46 += var74;
                            var44 += var62;
                            var49 += var75;
                            var47 += var63;
                            var52 += var76;
                            var50 += var64;
                            var4 += (float) this.field349;
                        }
                    }
                }

            }
        }
    }

    final void method345(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25, float var26, float var27, float var28) {
        int var29 = var6 - var5;
        float var30 = 1.0F / (float) var29;
        float var31 = (var8 - var7) * var30;
        float var32 = (var10 - var9) * var30;
        float var33 = (var12 - var11) * var30;
        float var34 = (var14 - var13) * var30;
        float var35 = (var16 - var15) * var30;
        float var36 = (var18 - var17) * var30;
        float var37 = (var20 - var19) * var30;
        float var38 = (var22 - var21) * var30;
        float var39 = (var24 - var23) * var30;
        float var40 = (var26 - var25) * var30;
        float var41 = (var28 - var27) * var30;
        if (this.field336) {
            if (var6 > this.field338) {
                var6 = this.field338;
            }

            if (var5 < 0) {
                var7 -= var31 * (float) var5;
                var9 -= var32 * (float) var5;
                var11 -= var33 * (float) var5;
                var13 -= var34 * (float) var5;
                var15 -= var35 * (float) var5;
                var17 -= var36 * (float) var5;
                var19 -= var37 * (float) var5;
                var21 -= var38 * (float) var5;
                var23 -= var39 * (float) var5;
                var25 -= var40 * (float) var5;
                var27 -= var41 * (float) var5;
                var5 = 0;
            }
        }

        if (var5 < var6) {
            var29 = var6 - var5;

            for (var4 += var5; var29-- > 0; var27 += var41) {
                float var42 = 1.0F / var7;
                float var43 = 1.0F / var9;
                if (!var1 || var42 < this.field351[var4]) {
                    float var44 = var11 * var43;
                    float var45 = var13 * var43;
                    int var46 = (int) (var44 * (float) this.field355 * this.field357) & this.field356;
                    int var47 = (int) (var45 * (float) this.field355 * this.field357) & this.field356;
                    int var48 = this.field346[var47 * this.field355 + var46];
                    var46 = (int) (var44 * (float) this.field345 * this.field348) & this.field344;
                    var47 = (int) (var45 * (float) this.field345 * this.field348) & this.field344;
                    int var49 = this.field361[var47 * this.field345 + var46];
                    var46 = (int) (var44 * (float) this.field367 * this.field369) & this.field368;
                    var47 = (int) (var45 * (float) this.field367 * this.field369) & this.field368;
                    int var50 = this.field366[var47 * this.field367 + var46];
                    float var51 = 1.0F - (var25 + var27);
                    var48 = -16777216 | (int) (var25 * (float) (var48 >> 16 & 255)) << 16 | (int) (var25 * (float) (var48 >> 8 & 255)) << 8 | (int) (var25 * (float) (var48 & 255));
                    var49 = -16777216 | (int) (var27 * (float) (var49 >> 16 & 255)) << 16 | (int) (var27 * (float) (var49 >> 8 & 255)) << 8 | (int) (var27 * (float) (var49 & 255));
                    var50 = -16777216 | (int) (var51 * (float) (var50 >> 16 & 255)) << 16 | (int) (var51 * (float) (var50 >> 8 & 255)) << 8 | (int) (var51 * (float) (var50 & 255));
                    int var52 = var48 + var49 + var50;
                    int var53 = -16777216 | (int) (var19 * (float) (var52 >> 16 & 255)) << 8 & 16711680 | (int) (var21 * (float) (var52 >> 8 & 255)) & '\uff00' | (int) (var23 * (float) (var52 & 255)) >> 8;
                    if (var15 != 0.0F) {
                        int var54 = (int) (255.0F - var15);
                        int var55 = ((this.field334 & 16711935) * (int) var15 & -16711936 | (this.field334 & '\uff00') * (int) var15 & 16711680) >>> 8;
                        var53 = (((var53 & 16711935) * var54 & -16711936 | (var53 & '\uff00') * var54 & 16711680) >>> 8) + var55;
                    }

                    if (var2) {
                        var3[var4] = ((int) var17 | var3[var4] >> 24) << 24 | var53;
                    } else {
                        var3[var4] = var53;
                    }

                    if (var1) {
                        this.field351[var4] = var42;
                    }
                }

                ++var4;
                var7 += var31;
                var9 += var32;
                var11 += var33;
                var13 += var34;
                var15 += var35;
                var17 += var36;
                var19 += var37;
                var21 += var38;
                var23 += var39;
                var25 += var40;
            }

        }
    }

    final void method346(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
        if (this.field336) {
            if (var8 > this.field338) {
                var8 = this.field338;
            }

            if (var7 < 0) {
                var7 = 0;
            }
        }

        if (var7 < var8) {
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            if (this.field337) {
                var4 += var7;
                var11 += var12 * (float) var7;
                var13 += var14 * (float) var7;
                var15 += var16 * (float) var7;
                if (this.field332) {
                    var6 = var8 - var7 >> 2;
                    var12 *= 4.0F;
                    var14 *= 4.0F;
                    var16 *= 4.0F;
                    if (this.field335 == 0) {
                        if (var6 > 0) {
                            do {
                                var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                var11 += var12;
                                var13 += var14;
                                var15 += var16;
                                var3[var4++] = var5;
                                var3[var4++] = var5;
                                var3[var4++] = var5;
                                var3[var4++] = var5;
                                --var6;
                            } while (var6 > 0);
                        }

                        var6 = var8 - var7 & 3;
                        if (var6 > 0) {
                            var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;

                            do {
                                var3[var4++] = var5;
                                --var6;
                            } while (var6 > 0);
                        }
                    } else if (!this.field364) {
                        var17 = this.field335;
                        var18 = 256 - this.field335;
                        if (var6 > 0) {
                            do {
                                var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                var11 += var12;
                                var13 += var14;
                                var15 += var16;
                                var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                                var19 = var3[var4];
                                if (var2) {
                                    var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    var19 = var3[var4];
                                    var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    var19 = var3[var4];
                                    var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    var19 = var3[var4];
                                    var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                } else {
                                    var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    var19 = var3[var4];
                                    var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    var19 = var3[var4];
                                    var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    var19 = var3[var4];
                                    var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                }

                                --var6;
                            } while (var6 > 0);
                        }

                        var6 = var8 - var7 & 3;
                        if (var6 > 0) {
                            var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                            var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                            do {
                                var19 = var3[var4];
                                if (var2) {
                                    var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                } else {
                                    var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                }

                                --var6;
                            } while (var6 > 0);
                        }
                    } else {
                        if (var6 > 0) {
                            do {
                                var5 = (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                var11 += var12;
                                var13 += var14;
                                var15 += var16;
                                var18 = var4++;
                                var20 = var3[var18];
                                var21 = var5 + var20;
                                var22 = (var5 & 16711935) + (var20 & 16711935);
                                var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                var21 = var4++;
                                int var24 = var3[var21];
                                int var25 = var5 + var24;
                                int var26 = (var5 & 16711935) + (var24 & 16711935);
                                var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                var3[var21] = -16777216 | var25 - var24 | var24 - (var24 >>> 8);
                                var25 = var4++;
                                int var28 = var3[var25];
                                int var29 = var5 + var28;
                                int var30 = (var5 & 16711935) + (var28 & 16711935);
                                var28 = (var30 & 16777472) + (var29 - var30 & 65536);
                                var3[var25] = -16777216 | var29 - var28 | var28 - (var28 >>> 8);
                                var29 = var4++;
                                int var32 = var3[var29];
                                int var33 = var5 + var32;
                                int var34 = (var5 & 16711935) + (var32 & 16711935);
                                var32 = (var34 & 16777472) + (var33 - var34 & 65536);
                                var3[var29] = -16777216 | var33 - var32 | var32 - (var32 >>> 8);
                                --var6;
                            } while (var6 > 0);
                        }

                        var6 = var8 - var7 & 3;
                        if (var6 > 0) {
                            var5 = (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;

                            do {
                                var18 = var4++;
                                var20 = var3[var18];
                                var21 = var5 + var20;
                                var22 = (var5 & 16711935) + (var20 & 16711935);
                                var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                --var6;
                            } while (var6 > 0);
                        }
                    }
                } else {
                    var6 = var8 - var7;
                    if (this.field335 == 0) {
                        do {
                            var3[var4++] = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                            var11 += var12;
                            var13 += var14;
                            var15 += var16;
                            --var6;
                        } while (var6 > 0);
                    } else if (!this.field364) {
                        var17 = this.field335;
                        var18 = 256 - this.field335;

                        do {
                            var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                            var11 += var12;
                            var13 += var14;
                            var15 += var16;
                            var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                            var19 = var3[var4];
                            if (var2) {
                                var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                            } else {
                                var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                            }

                            --var6;
                        } while (var6 > 0);
                    } else {
                        do {
                            var18 = var4++;
                            var19 = (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                            var20 = var3[var18];
                            var21 = var19 + var20;
                            var22 = (var19 & 16711935) + (var20 & 16711935);
                            var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                            var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                            var11 += var12;
                            var13 += var14;
                            var15 += var16;
                            --var6;
                        } while (var6 > 0);
                    }
                }

            } else {
                var4 += var7 - 1;
                var9 += var10 * (float) var7;
                var11 += var12 * (float) var7;
                var13 += var14 * (float) var7;
                var15 += var16 * (float) var7;
                if (this.field340.field7896) {
                    if (this.field332) {
                        var6 = var8 - var7 >> 2;
                        var12 *= 4.0F;
                        var14 *= 4.0F;
                        var16 *= 4.0F;
                        if (this.field335 == 0) {
                            if (var6 > 0) {
                                do {
                                    var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                    var11 += var12;
                                    var13 += var14;
                                    var15 += var16;
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var3[var4] = var5;
                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var3[var4] = var5;
                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var3[var4] = var5;
                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var3[var4] = var5;
                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    --var6;
                                } while (var6 > 0);
                            }

                            var6 = var8 - var7 & 3;
                            if (var6 > 0) {
                                var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;

                                do {
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var3[var4] = var5;
                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    --var6;
                                } while (var6 > 0);
                            }
                        } else if (!this.field364) {
                            var17 = this.field335;
                            var18 = 256 - this.field335;
                            if (var6 > 0) {
                                do {
                                    var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                    var11 += var12;
                                    var13 += var14;
                                    var15 += var16;
                                    var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var19 = var3[var4];
                                        if (var2) {
                                            var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        } else {
                                            var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        }

                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var19 = var3[var4];
                                        if (var2) {
                                            var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        } else {
                                            var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        }

                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var19 = var3[var4];
                                        if (var2) {
                                            var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        } else {
                                            var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        }

                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var19 = var3[var4];
                                        if (var2) {
                                            var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        } else {
                                            var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        }

                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    --var6;
                                } while (var6 > 0);
                            }

                            var6 = var8 - var7 & 3;
                            if (var6 > 0) {
                                var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                                do {
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var19 = var3[var4];
                                        if (var2) {
                                            var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        } else {
                                            var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        }

                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    --var6;
                                } while (var6 > 0);
                            }
                        } else {
                            if (var6 > 0) {
                                do {
                                    var5 = (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                    var11 += var12;
                                    var13 += var14;
                                    var15 += var16;
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var20 = var3[var4];
                                        var21 = var5 + var20;
                                        var22 = (var5 & 16711935) + (var20 & 16711935);
                                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                        var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var20 = var3[var4];
                                        var21 = var5 + var20;
                                        var22 = (var5 & 16711935) + (var20 & 16711935);
                                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                        var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var20 = var3[var4];
                                        var21 = var5 + var20;
                                        var22 = (var5 & 16711935) + (var20 & 16711935);
                                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                        var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var20 = var3[var4];
                                        var21 = var5 + var20;
                                        var22 = (var5 & 16711935) + (var20 & 16711935);
                                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                        var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    --var6;
                                } while (var6 > 0);
                            }

                            var6 = var8 - var7 & 3;
                            if (var6 > 0) {
                                var5 = (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;

                                do {
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var20 = var3[var4];
                                        var21 = var5 + var20;
                                        var22 = (var5 & 16711935) + (var20 & 16711935);
                                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                        var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    --var6;
                                } while (var6 > 0);
                            }
                        }

                    } else {
                        var6 = var8 - var7;
                        if (this.field335 != 0) {
                            if (this.field364) {
                                do {
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var19 = (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                        var20 = var3[var4];
                                        var21 = var19 + var20;
                                        var22 = (var19 & 16711935) + (var20 & 16711935);
                                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                        var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    var11 += var12;
                                    var13 += var14;
                                    var15 += var16;
                                    --var6;
                                } while (var6 > 0);
                            } else {
                                var17 = this.field335;
                                var18 = 256 - this.field335;

                                do {
                                    ++var4;
                                    if (!var1 || var9 < this.field351[var4]) {
                                        var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                                        var19 = var3[var4];
                                        if (var2) {
                                            var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        } else {
                                            var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                        }

                                        if (var1) {
                                            this.field351[var4] = var9;
                                        }
                                    }

                                    var9 += var10;
                                    var11 += var12;
                                    var13 += var14;
                                    var15 += var16;
                                    --var6;
                                } while (var6 > 0);
                            }
                        } else {
                            do {
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var3[var4] = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                    if (var1) {
                                        this.field351[var4] = var9;
                                    }
                                }

                                var9 += var10;
                                var11 += var12;
                                var13 += var14;
                                var15 += var16;
                                --var6;
                            } while (var6 > 0);
                        }

                    }
                } else if (this.field332) {
                    var6 = var8 - var7 >> 2;
                    var12 *= 4.0F;
                    var14 *= 4.0F;
                    var16 *= 4.0F;
                    if (this.field335 == 0) {
                        if (var6 > 0) {
                            do {
                                var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                var11 += var12;
                                var13 += var14;
                                var15 += var16;
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var3[var4] = var5;
                                }

                                var9 += var10;
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var3[var4] = var5;
                                }

                                var9 += var10;
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var3[var4] = var5;
                                }

                                var9 += var10;
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var3[var4] = var5;
                                }

                                var9 += var10;
                                --var6;
                            } while (var6 > 0);
                        }

                        var6 = var8 - var7 & 3;
                        if (var6 > 0) {
                            var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;

                            do {
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var3[var4] = var5;
                                }

                                var9 += var10;
                                --var6;
                            } while (var6 > 0);
                        }
                    } else if (!this.field364) {
                        var17 = this.field335;
                        var18 = 256 - this.field335;
                        if (var6 > 0) {
                            do {
                                var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                var11 += var12;
                                var13 += var14;
                                var15 += var16;
                                var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var19 = var3[var4];
                                    if (var2) {
                                        var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    } else {
                                        var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    }
                                }

                                var9 += var10;
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var19 = var3[var4];
                                    if (var2) {
                                        var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    } else {
                                        var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    }
                                }

                                var9 += var10;
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var19 = var3[var4];
                                    if (var2) {
                                        var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    } else {
                                        var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    }
                                }

                                var9 += var10;
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var19 = var3[var4];
                                    if (var2) {
                                        var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    } else {
                                        var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    }
                                }

                                var9 += var10;
                                --var6;
                            } while (var6 > 0);
                        }

                        var6 = var8 - var7 & 3;
                        if (var6 > 0) {
                            var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                            var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                            do {
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var19 = var3[var4];
                                    if (var2) {
                                        var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    } else {
                                        var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    }
                                }

                                var9 += var10;
                                --var6;
                            } while (var6 > 0);
                        }
                    } else {
                        if (var6 > 0) {
                            do {
                                var5 = (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                var11 += var12;
                                var13 += var14;
                                var15 += var16;
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var20 = var3[var4];
                                    var21 = var5 + var20;
                                    var22 = (var5 & 16711935) + (var20 & 16711935);
                                    var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                    var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                }

                                var9 += var10;
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var20 = var3[var4];
                                    var21 = var5 + var20;
                                    var22 = (var5 & 16711935) + (var20 & 16711935);
                                    var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                    var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                }

                                var9 += var10;
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var20 = var3[var4];
                                    var21 = var5 + var20;
                                    var22 = (var5 & 16711935) + (var20 & 16711935);
                                    var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                    var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                }

                                var9 += var10;
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var20 = var3[var4];
                                    var21 = var5 + var20;
                                    var22 = (var5 & 16711935) + (var20 & 16711935);
                                    var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                    var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                }

                                var9 += var10;
                                --var6;
                            } while (var6 > 0);
                        }

                        var6 = var8 - var7 & 3;
                        if (var6 > 0) {
                            var5 = (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;

                            do {
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var20 = var3[var4];
                                    var21 = var5 + var20;
                                    var22 = (var5 & 16711935) + (var20 & 16711935);
                                    var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                    var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                }

                                var9 += var10;
                                --var6;
                            } while (var6 > 0);
                        }
                    }

                } else {
                    var6 = var8 - var7;
                    if (this.field335 != 0) {
                        if (this.field364) {
                            do {
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var19 = (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                    var20 = var3[var4];
                                    var21 = var19 + var20;
                                    var22 = (var19 & 16711935) + (var20 & 16711935);
                                    var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                    var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                                }

                                var9 += var10;
                                var11 += var12;
                                var13 += var14;
                                var15 += var16;
                                --var6;
                            } while (var6 > 0);
                        } else {
                            var17 = this.field335;
                            var18 = 256 - this.field335;

                            do {
                                ++var4;
                                if (!var1 || var9 < this.field351[var4]) {
                                    var5 = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                                    var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                                    var19 = var3[var4];
                                    if (var2) {
                                        var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    } else {
                                        var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                                    }
                                }

                                var9 += var10;
                                var11 += var12;
                                var13 += var14;
                                var15 += var16;
                                --var6;
                            } while (var6 > 0);
                        }
                    } else {
                        do {
                            ++var4;
                            if (!var1 || var9 < this.field351[var4]) {
                                var3[var4] = -16777216 | (int) var11 & 16711680 | (int) var13 & '\uff00' | (int) var15 & 255;
                            }

                            var9 += var10;
                            var11 += var12;
                            var13 += var14;
                            var15 += var16;
                            --var6;
                        } while (var6 > 0);
                    }

                }
            }
        }
    }

    final void method347(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15) {
        if (!var1) {
            this.method341(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
        } else if (this.field352) {
            this.field347.method4837((int) var7, (int) var4, (int) var8, (int) var5, class543.field3817[(int) var13 & '\uffff'], 1880466444);
            this.field347.method4837((int) var8, (int) var5, (int) var9, (int) var6, class543.field3817[(int) var13 & '\uffff'], 2111586741);
            this.field347.method4837((int) var9, (int) var6, (int) var7, (int) var4, class543.field3817[(int) var13 & '\uffff'], 957545038);
        } else {
            float var16 = var8 - var7;
            float var17 = var5 - var4;
            float var18 = var9 - var7;
            float var19 = var6 - var4;
            float var20 = var14 - var13;
            float var21 = var15 - var13;
            float var22 = var11 - var10;
            float var23 = var12 - var10;
            float var24;
            if (var6 != var5) {
                var24 = (var9 - var8) / (var6 - var5);
            } else {
                var24 = 0.0F;
            }

            float var25;
            if (var5 != var4) {
                var25 = var16 / var17;
            } else {
                var25 = 0.0F;
            }

            float var26;
            if (var6 != var4) {
                var26 = var18 / var19;
            } else {
                var26 = 0.0F;
            }

            float var27 = var16 * var19 - var18 * var17;
            if (var27 != 0.0F) {
                float var28 = (var20 * var19 - var21 * var17) / var27;
                float var29 = (var21 * var16 - var20 * var18) / var27;
                float var30 = (var22 * var19 - var23 * var17) / var27;
                float var31 = (var23 * var16 - var22 * var18) / var27;
                if (var4 <= var5 && var4 <= var6) {
                    if (var4 < (float) this.field354) {
                        if (var5 > (float) this.field354) {
                            var5 = (float) this.field354;
                        }

                        if (var6 > (float) this.field354) {
                            var6 = (float) this.field354;
                        }

                        var13 = var13 - var28 * var7 + var28;
                        var10 = var10 - var30 * var7 + var30;
                        if (var5 < var6) {
                            var9 = var7;
                            if (var4 < 0.0F) {
                                var9 = var7 - var26 * var4;
                                var7 -= var25 * var4;
                                var13 -= var29 * var4;
                                var10 -= var31 * var4;
                                var4 = 0.0F;
                            }

                            if (var5 < 0.0F) {
                                var8 -= var24 * var5;
                                var5 = 0.0F;
                            }

                            if ((var4 == var5 || var26 >= var25) && (var4 != var5 || var26 <= var24)) {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var5;
                                var5 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var5 >= 0.0F; var4 += (float) this.field349) {
                                    this.method339(var2, var3, this.field350, (int) var4, 0, 0, (int) var7, (int) var9, var13, var28, var10, var30);
                                    var9 += var26;
                                    var7 += var25;
                                    var13 += var29;
                                    var10 += var31;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method339(var2, var3, this.field350, (int) var4, 0, 0, (int) var8, (int) var9, var13, var28, var10, var30);
                                    var9 += var26;
                                    var8 += var24;
                                    var13 += var29;
                                    var10 += var31;
                                    var4 += (float) this.field349;
                                }

                            } else {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var5;
                                var5 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var5 >= 0.0F; var4 += (float) this.field349) {
                                    this.method339(var2, var3, this.field350, (int) var4, 0, 0, (int) var9, (int) var7, var13, var28, var10, var30);
                                    var9 += var26;
                                    var7 += var25;
                                    var13 += var29;
                                    var10 += var31;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method339(var2, var3, this.field350, (int) var4, 0, 0, (int) var9, (int) var8, var13, var28, var10, var30);
                                    var9 += var26;
                                    var8 += var24;
                                    var13 += var29;
                                    var10 += var31;
                                    var4 += (float) this.field349;
                                }

                            }
                        } else {
                            var8 = var7;
                            if (var4 < 0.0F) {
                                var8 = var7 - var26 * var4;
                                var7 -= var25 * var4;
                                var13 -= var29 * var4;
                                var10 -= var31 * var4;
                                var4 = 0.0F;
                            }

                            if (var6 < 0.0F) {
                                var9 -= var24 * var6;
                                var6 = 0.0F;
                            }

                            if (var4 != var6 && var26 < var25 || var4 == var6 && var24 > var25) {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F)) - var6;
                                var6 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var6 >= 0.0F; var4 += (float) this.field349) {
                                    this.method339(var2, var3, this.field350, (int) var4, 0, 0, (int) var8, (int) var7, var13, var28, var10, var30);
                                    var8 += var26;
                                    var7 += var25;
                                    var13 += var29;
                                    var10 += var31;
                                }

                                while (--var5 >= 0.0F) {
                                    this.method339(var2, var3, this.field350, (int) var4, 0, 0, (int) var9, (int) var7, var13, var28, var10, var30);
                                    var9 += var24;
                                    var7 += var25;
                                    var13 += var29;
                                    var10 += var31;
                                    var4 += (float) this.field349;
                                }

                            } else {
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var5 = (float) ((int) (var5 + 0.5F)) - var6;
                                var6 -= var4;

                                for (var4 = (float) this.field363[(int) var4]; --var6 >= 0.0F; var4 += (float) this.field349) {
                                    this.method339(var2, var3, this.field350, (int) var4, 0, 0, (int) var7, (int) var8, var13, var28, var10, var30);
                                    var8 += var26;
                                    var7 += var25;
                                    var13 += var29;
                                    var10 += var31;
                                }

                                while (--var5 >= 0.0F) {
                                    this.method339(var2, var3, this.field350, (int) var4, 0, 0, (int) var7, (int) var9, var13, var28, var10, var30);
                                    var9 += var24;
                                    var7 += var25;
                                    var13 += var29;
                                    var10 += var31;
                                    var4 += (float) this.field349;
                                }

                            }
                        }
                    }
                } else if (var5 <= var6) {
                    if (var5 < (float) this.field354) {
                        if (var6 > (float) this.field354) {
                            var6 = (float) this.field354;
                        }

                        if (var4 > (float) this.field354) {
                            var4 = (float) this.field354;
                        }

                        var14 = var14 - var28 * var8 + var28;
                        var11 = var11 - var30 * var8 + var30;
                        if (var6 < var4) {
                            var7 = var8;
                            if (var5 < 0.0F) {
                                var7 = var8 - var25 * var5;
                                var8 -= var24 * var5;
                                var14 -= var29 * var5;
                                var11 -= var31 * var5;
                                var5 = 0.0F;
                            }

                            if (var6 < 0.0F) {
                                var9 -= var26 * var6;
                                var6 = 0.0F;
                            }

                            if ((var5 == var6 || var25 >= var24) && (var5 != var6 || var25 <= var26)) {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F)) - var6;
                                var6 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var6 >= 0.0F; var5 += (float) this.field349) {
                                    this.method339(var2, var3, this.field350, (int) var5, 0, 0, (int) var8, (int) var7, var14, var28, var11, var30);
                                    var7 += var25;
                                    var8 += var24;
                                    var14 += var29;
                                    var11 += var31;
                                }

                                while (--var4 >= 0.0F) {
                                    this.method339(var2, var3, this.field350, (int) var5, 0, 0, (int) var9, (int) var7, var14, var28, var11, var30);
                                    var7 += var25;
                                    var9 += var26;
                                    var14 += var29;
                                    var11 += var31;
                                    var5 += (float) this.field349;
                                }

                            } else {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F)) - var6;
                                var6 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var6 >= 0.0F; var5 += (float) this.field349) {
                                    this.method339(var2, var3, this.field350, (int) var5, 0, 0, (int) var7, (int) var8, var14, var28, var11, var30);
                                    var7 += var25;
                                    var8 += var24;
                                    var14 += var29;
                                    var11 += var31;
                                }

                                while (--var4 >= 0.0F) {
                                    this.method339(var2, var3, this.field350, (int) var5, 0, 0, (int) var7, (int) var9, var14, var28, var11, var30);
                                    var7 += var25;
                                    var9 += var26;
                                    var14 += var29;
                                    var11 += var31;
                                    var5 += (float) this.field349;
                                }

                            }
                        } else {
                            var9 = var8;
                            if (var5 < 0.0F) {
                                var9 = var8 - var25 * var5;
                                var8 -= var24 * var5;
                                var14 -= var29 * var5;
                                var11 -= var31 * var5;
                                var5 = 0.0F;
                            }

                            if (var4 < 0.0F) {
                                var7 -= var26 * var4;
                                var4 = 0.0F;
                            }

                            if (var25 < var24) {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var4;
                                var4 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var4 >= 0.0F; var5 += (float) this.field349) {
                                    this.method339(var2, var3, this.field350, (int) var5, 0, 0, (int) var9, (int) var8, var14, var28, var11, var30);
                                    var9 += var25;
                                    var8 += var24;
                                    var14 += var29;
                                    var11 += var31;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method339(var2, var3, this.field350, (int) var5, 0, 0, (int) var7, (int) var8, var14, var28, var11, var30);
                                    var7 += var26;
                                    var8 += var24;
                                    var14 += var29;
                                    var11 += var31;
                                    var5 += (float) this.field349;
                                }

                            } else {
                                var5 = (float) ((int) (var5 + 0.5F));
                                var4 = (float) ((int) (var4 + 0.5F));
                                var6 = (float) ((int) (var6 + 0.5F)) - var4;
                                var4 -= var5;

                                for (var5 = (float) this.field363[(int) var5]; --var4 >= 0.0F; var5 += (float) this.field349) {
                                    this.method339(var2, var3, this.field350, (int) var5, 0, 0, (int) var8, (int) var9, var14, var28, var11, var30);
                                    var9 += var25;
                                    var8 += var24;
                                    var14 += var29;
                                    var11 += var31;
                                }

                                while (--var6 >= 0.0F) {
                                    this.method339(var2, var3, this.field350, (int) var5, 0, 0, (int) var8, (int) var7, var14, var28, var11, var30);
                                    var7 += var26;
                                    var8 += var24;
                                    var14 += var29;
                                    var11 += var31;
                                    var5 += (float) this.field349;
                                }

                            }
                        }
                    }
                } else if (var6 < (float) this.field354) {
                    if (var4 > (float) this.field354) {
                        var4 = (float) this.field354;
                    }

                    if (var5 > (float) this.field354) {
                        var5 = (float) this.field354;
                    }

                    var15 = var15 - var28 * var9 + var28;
                    var12 = var12 - var30 * var9 + var30;
                    if (var4 < var5) {
                        var8 = var9;
                        if (var6 < 0.0F) {
                            var8 = var9 - var24 * var6;
                            var9 -= var26 * var6;
                            var15 -= var29 * var6;
                            var12 -= var31 * var6;
                            var6 = 0.0F;
                        }

                        if (var4 < 0.0F) {
                            var7 -= var25 * var4;
                            var4 = 0.0F;
                        }

                        if (var24 < var26) {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F)) - var4;
                            var4 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var4 >= 0.0F; var6 += (float) this.field349) {
                                this.method339(var2, var3, this.field350, (int) var6, 0, 0, (int) var8, (int) var9, var15, var28, var12, var30);
                                var8 += var24;
                                var9 += var26;
                                var15 += var29;
                                var12 += var31;
                            }

                            while (--var5 >= 0.0F) {
                                this.method339(var2, var3, this.field350, (int) var6, 0, 0, (int) var8, (int) var7, var15, var28, var12, var30);
                                var8 += var24;
                                var7 += var25;
                                var15 += var29;
                                var12 += var31;
                                var6 += (float) this.field349;
                            }

                        } else {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F)) - var4;
                            var4 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var4 >= 0.0F; var6 += (float) this.field349) {
                                this.method339(var2, var3, this.field350, (int) var6, 0, 0, (int) var9, (int) var8, var15, var28, var12, var30);
                                var8 += var24;
                                var9 += var26;
                                var15 += var29;
                                var12 += var31;
                            }

                            while (--var5 >= 0.0F) {
                                this.method339(var2, var3, this.field350, (int) var6, 0, 0, (int) var7, (int) var8, var15, var28, var12, var30);
                                var8 += var24;
                                var7 += var25;
                                var15 += var29;
                                var12 += var31;
                                var6 += (float) this.field349;
                            }

                        }
                    } else {
                        var7 = var9;
                        if (var6 < 0.0F) {
                            var7 = var9 - var24 * var6;
                            var9 -= var26 * var6;
                            var15 -= var29 * var6;
                            var12 -= var31 * var6;
                            var6 = 0.0F;
                        }

                        if (var5 < 0.0F) {
                            var8 -= var25 * var5;
                            var5 = 0.0F;
                        }

                        if (var24 < var26) {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F)) - var5;
                            var5 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var5 >= 0.0F; var6 += (float) this.field349) {
                                this.method339(var2, var3, this.field350, (int) var6, 0, 0, (int) var7, (int) var9, var15, var28, var12, var30);
                                var7 += var24;
                                var9 += var26;
                                var15 += var29;
                                var12 += var31;
                            }

                            while (--var4 >= 0.0F) {
                                this.method339(var2, var3, this.field350, (int) var6, 0, 0, (int) var8, (int) var9, var15, var28, var12, var30);
                                var8 += var25;
                                var9 += var26;
                                var15 += var29;
                                var12 += var31;
                                var6 += (float) this.field349;
                            }

                        } else {
                            var6 = (float) ((int) (var6 + 0.5F));
                            var5 = (float) ((int) (var5 + 0.5F));
                            var4 = (float) ((int) (var4 + 0.5F)) - var5;
                            var5 -= var6;

                            for (var6 = (float) this.field363[(int) var6]; --var5 >= 0.0F; var6 += (float) this.field349) {
                                this.method339(var2, var3, this.field350, (int) var6, 0, 0, (int) var9, (int) var7, var15, var28, var12, var30);
                                var7 += var24;
                                var9 += var26;
                                var15 += var29;
                                var12 += var31;
                            }

                            while (--var4 >= 0.0F) {
                                this.method339(var2, var3, this.field350, (int) var6, 0, 0, (int) var9, (int) var8, var15, var28, var12, var30);
                                var8 += var25;
                                var9 += var26;
                                var15 += var29;
                                var12 += var31;
                                var6 += (float) this.field349;
                            }

                        }
                    }
                }
            }
        }
    }
}
