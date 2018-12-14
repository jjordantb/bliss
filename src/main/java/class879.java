public abstract class class879 {
    static float field9858 = 3.1415927F;
    protected boolean field9859 = false;

    public abstract class396[] method5941();

    int method5942(float var1, float var2, float var3) {
        float var4 = var1 < 0.0F ? -var1 : var1;
        float var5 = var2 < 0.0F ? -var2 : var2;
        float var6 = var3 < 0.0F ? -var3 : var3;
        if (var5 > var4 && var5 > var6) {
            return var2 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return var3 > 0.0F ? 2 : 3;
        } else {
            return var1 > 0.0F ? 4 : 5;
        }
    }

    void method5943(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8, int var9, float var10, float var11, float var12, float[] var13) {
        var1 -= var4;
        var2 -= var5;
        var3 -= var6;
        float var14 = (float) var1 * var8[0] + (float) var2 * var8[1] + (float) var3 * var8[2];
        float var15 = (float) var1 * var8[3] + (float) var2 * var8[4] + (float) var3 * var8[5];
        float var16 = (float) var1 * var8[6] + (float) var2 * var8[7] + (float) var3 * var8[8];
        float var17;
        float var18;
        if (var7 == 0) {
            var17 = var14 + var10 + 0.5F;
            var18 = -var16 + var12 + 0.5F;
        } else if (var7 == 1) {
            var17 = var14 + var10 + 0.5F;
            var18 = var16 + var12 + 0.5F;
        } else if (var7 == 2) {
            var17 = -var14 + var10 + 0.5F;
            var18 = -var15 + var11 + 0.5F;
        } else if (var7 == 3) {
            var17 = var14 + var10 + 0.5F;
            var18 = -var15 + var11 + 0.5F;
        } else if (var7 == 4) {
            var17 = var16 + var12 + 0.5F;
            var18 = -var15 + var11 + 0.5F;
        } else {
            var17 = -var16 + var12 + 0.5F;
            var18 = -var15 + var11 + 0.5F;
        }

        float var19;
        if (var9 == 1) {
            var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (var9 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (var9 == 3) {
            var19 = var17;
            var17 = var18;
            var18 = -var19;
        }

        var13[0] = var17;
        var13[1] = var18;
    }

    float[] method5945(int var1, int var2, int var3, int var4, float var5, float var6, float var7) {
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) var4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) var4 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[2] = var11;
        var8[3] = 0.0F;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        var8[6] = -var11;
        var8[7] = 0.0F;
        var8[8] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        var10 = (float) var2 / 32767.0F;
        var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        var12 = 1.0F - var10;
        float var16 = (float) Math.sqrt((double) (var1 * var1 + var3 * var3));
        if (var16 == 0.0F && var10 == 0.0F) {
            var9 = var8;
        } else {
            if (var16 != 0.0F) {
                var14 = (float) (-var3) / var16;
                var15 = (float) var1 / var16;
            }

            var13[0] = var10 + var14 * var14 * var12;
            var13[1] = var15 * var11;
            var13[2] = var15 * var14 * var12;
            var13[3] = -var15 * var11;
            var13[4] = var10;
            var13[5] = var14 * var11;
            var13[6] = var14 * var15 * var12;
            var13[7] = -var14 * var11;
            var13[8] = var10 + var15 * var15 * var12;
            var9[0] = var8[0] * var13[0] + var8[1] * var13[3] + var8[2] * var13[6];
            var9[1] = var8[0] * var13[1] + var8[1] * var13[4] + var8[2] * var13[7];
            var9[2] = var8[0] * var13[2] + var8[1] * var13[5] + var8[2] * var13[8];
            var9[3] = var8[3] * var13[0] + var8[4] * var13[3] + var8[5] * var13[6];
            var9[4] = var8[3] * var13[1] + var8[4] * var13[4] + var8[5] * var13[7];
            var9[5] = var8[3] * var13[2] + var8[4] * var13[5] + var8[5] * var13[8];
            var9[6] = var8[6] * var13[0] + var8[7] * var13[3] + var8[8] * var13[6];
            var9[7] = var8[6] * var13[1] + var8[7] * var13[4] + var8[8] * var13[7];
            var9[8] = var8[6] * var13[2] + var8[7] * var13[5] + var8[8] * var13[8];
        }

        var9[0] *= var5;
        var9[1] *= var5;
        var9[2] *= var5;
        var9[3] *= var6;
        var9[4] *= var6;
        var9[5] *= var6;
        var9[6] *= var7;
        var9[7] *= var7;
        var9[8] *= var7;
        return var9;
    }

    public abstract void method5947(int var1);

    public abstract int method5948();

    abstract boolean method5949();

    public abstract int method5950();

    public abstract void method5951(int var1);

    public abstract void method5952(int var1);

    public abstract void method5953(int var1, int var2, int var3);

    public abstract void method5954();

    public abstract void method5955(int var1, int var2, int var3);

    void method5957(SceneGraphLevel var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        int var12 = -var5 / 2;
        int var13 = -var6 / 2;
        int var14 = var1.method3887(var2 + var12, var4 + var13, -1693901736);
        int var15 = var5 / 2;
        int var16 = -var6 / 2;
        int var17 = var1.method3887(var2 + var15, var4 + var16, -1350603421);
        int var18 = -var5 / 2;
        int var19 = var6 / 2;
        int var20 = var1.method3887(var2 + var18, var4 + var19, -2095633165);
        int var21 = var5 / 2;
        int var22 = var6 / 2;
        int var23 = var1.method3887(var2 + var21, var4 + var22, -2087321793);
        int var24 = var14 < var17 ? var14 : var17;
        int var25 = var20 < var23 ? var20 : var23;
        int var26 = var17 < var23 ? var17 : var23;
        int var27 = var14 < var20 ? var14 : var20;
        int var28;
        int var29;
        if (var6 != 0) {
            var28 = (int) (Math.atan2((double) (var24 - var25), (double) var6) * 2607.5945876176133D) & 16383;
            if (var28 != 0) {
                if (var7 != 0) {
                    if (var28 > 8192) {
                        var29 = 16384 - var7;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (var28 > var7) {
                        var28 = var7;
                    }
                }

                this.method5952(var28);
            }
        }

        if (var5 != 0) {
            var28 = (int) (Math.atan2((double) (var27 - var26), (double) var5) * 2607.5945876176133D) & 16383;
            if (var28 != 0) {
                if (var8 != 0) {
                    if (var28 > 8192) {
                        var29 = 16384 - var8;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (var28 > var8) {
                        var28 = var8;
                    }
                }

                this.method6041(var28);
            }
        }

        var28 = var14 + var23;
        if (var17 + var20 < var28) {
            var28 = var17 + var20;
        }

        var28 = (var28 >> 1) - var3;
        if (var28 != 0) {
            this.method5953(0, var28, 0);
        }

    }

    abstract void method5958();

    abstract void method5959();

    public final void method5960(class531 var1, int var2, class531 var3, int var4, int var5, int var6, int var7, boolean var8) {
        if (var2 != -1) {
            this.method5958();
            if (!this.method5949()) {
                this.method5959();
            } else {
                class366 var9 = var1.field3734[var2];
                class652 var10 = var9.field2419;
                class366 var11 = null;
                if (var3 != null) {
                    var11 = var3.field3734[var4];
                    if (var11.field2419 != var10) {
                        var11 = null;
                    }
                }

                this.method6058(var10, var9, var11, var5, var6, var7, (boolean[]) null, false, var8, 65535, (int[]) null);
                this.method6084();
                this.method5959();
            }
        }

    }

    public abstract void method5961(int var1, int var2, SceneGraphLevel var3, SceneGraphLevel var4, int var5, int var6, int var7);

    public final void method5962(class531 var1, int var2, class531 var3, int var4, int var5, int var6, class531 var7, int var8, class531 var9, int var10, int var11, int var12, boolean[] var13, boolean var14) {
        if (var2 != -1) {
            if (var13 != null && var8 != -1) {
                this.method5958();
                if (!this.method5949()) {
                    this.method5959();
                } else {
                    class366 var15 = var1.field3734[var2];
                    class652 var16 = var15.field2419;
                    class366 var17 = null;
                    if (var3 != null) {
                        var17 = var3.field3734[var4];
                        if (var17.field2419 != var16) {
                            var17 = null;
                        }
                    }

                    this.method6058(var16, var15, var17, var5, var6, 0, var13, false, var14, 65535, (int[]) null);
                    class366 var18 = var7.field3734[var8];
                    class366 var19 = null;
                    if (var9 != null) {
                        var19 = var9.field3734[var10];
                        if (var19.field2419 != var16) {
                            var19 = null;
                        }
                    }

                    this.method5964(0, new int[0], 0, 0, 0, 0, var14);
                    this.method6058(var18.field2419, var18, var19, var11, var12, 0, var13, true, var14, 65535, (int[]) null);
                    this.method6084();
                    this.method5959();
                }
            } else {
                this.method5960(var1, var2, var3, var4, var5, var6, 0, var14);
            }
        }

    }

    public final void method5963(class531 var1, int var2) {
        if (var2 != -1) {
            this.method5958();
            if (!this.method5949()) {
                this.method5959();
            } else {
                class366 var3 = var1.field3734[var2];
                class652 var4 = var3.field2419;

                for (int var5 = 0; var5 < var3.field2413; ++var5) {
                    short var6 = var3.field2421[var5];
                    if (var4.field9458[var6]) {
                        if (var3.field2425[var5] != -1) {
                            this.method5968(0, 0, 0, 0);
                        }

                        this.method5968(var4.field9461[var6], var3.field2422[var5], var3.field2418[var5], var3.field2424[var5]);
                    }
                }

                this.method6084();
                this.method5959();
            }
        }

    }

    abstract void method5964(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

    public abstract void method5965(class135 var1, class211 var2, int var3);

    abstract void method5967(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

    abstract void method5968(int var1, int var2, int var3, int var4);

    public abstract void method5970(class135 var1, int var2, boolean var3);

    public abstract int method5972();

    public abstract int method5973();

    public abstract int method5976();

    public abstract int method5977();

    public abstract int method5978();

    public abstract int method5979();

    public abstract void method5980(int var1);

    public abstract void method5981(int var1);

    public abstract int method5982();

    public abstract byte[] method5983();

    public abstract void method5984(short var1, short var2);

    public abstract void method5985(byte var1, byte[] var2);

    public abstract void method5986(short var1, short var2);

    public abstract void method5987(int var1, int var2, int var3, int var4);

    public abstract boolean method5988();

    public abstract boolean method5989();

    void method5991(int var1, int var2, int var3, int var4, int var5, int var6, float[] var7, float var8, int var9, float var10, float[] var11) {
        var1 -= var4;
        var2 -= var5;
        var3 -= var6;
        float var12 = (float) var1 * var7[0] + (float) var2 * var7[1] + (float) var3 * var7[2];
        float var13 = (float) var1 * var7[3] + (float) var2 * var7[4] + (float) var3 * var7[5];
        float var14 = (float) var1 * var7[6] + (float) var2 * var7[7] + (float) var3 * var7[8];
        float var15 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        if (var8 != 1.0F) {
            var15 *= var8;
        }

        float var16 = var13 + 0.5F + var10;
        float var17;
        if (var9 == 1) {
            var17 = var15;
            var15 = -var16;
            var16 = var17;
        } else if (var9 == 2) {
            var15 = -var15;
            var16 = -var16;
        } else if (var9 == 3) {
            var17 = var15;
            var15 = var16;
            var16 = -var17;
        }

        var11[0] = var15;
        var11[1] = var16;
    }

    public abstract void method5994(class879 var1, int var2, int var3, int var4, boolean var5);

    public abstract int method6006();

    public abstract void method6016(int var1);

    public abstract class879 method6017(byte var1, int var2, boolean var3);

    public abstract boolean method6036();

    public abstract void method6041(int var1);

    public final void method6056(class531 var1, int var2, class531 var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int[] var10) {
        if (var2 != -1) {
            this.method5958();
            if (!this.method5949()) {
                this.method5959();
            } else {
                class366 var11 = var1.field3734[var2];
                class652 var12 = var11.field2419;
                class366 var13 = null;
                if (var3 != null) {
                    var13 = var3.field3734[var4];
                    if (var13.field2419 != var12) {
                        var13 = null;
                    }
                }

                this.method6058(var12, var11, var13, var5, var6, var7, (boolean[]) null, false, var9, var8, var10);
                this.method6084();
                this.method5959();
            }
        }

    }

    void method6057(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int[] var9) {
        int var10;
        if (var6 == 1) {
            if (var1 != 0 && var1 != 1) {
                if (var1 == 3) {
                    var10 = var3;
                    var3 = var5;
                    var5 = var10;
                } else if (var1 == 2) {
                    var10 = var3;
                    var3 = -var5 & 16383;
                    var5 = var10 & 16383;
                }
            } else {
                var10 = -var3;
                var3 = var5;
                var5 = var10;
            }
        } else if (var6 == 2) {
            if (var1 != 0 && var1 != 1) {
                if (var1 == 2) {
                    var3 = -var3 & 16383;
                    var5 = -var5 & 16383;
                }
            } else {
                var3 = -var3;
                var5 = -var5;
            }
        } else if (var6 == 3) {
            if (var1 != 0 && var1 != 1) {
                if (var1 == 3) {
                    var10 = var3;
                    var3 = var5;
                    var5 = var10;
                } else if (var1 == 2) {
                    var10 = var3;
                    var3 = var5 & 16383;
                    var5 = -var10 & 16383;
                }
            } else {
                var10 = var3;
                var3 = -var5;
                var5 = var10;
            }
        }

        if (var8 != 65535) {
            this.method5967(var1, var2, var3, var4, var5, var7, var8, var9);
        } else {
            this.method5964(var1, var2, var3, var4, var5, var6, var7);
        }

    }

    void method6058(class652 var1, class366 var2, class366 var3, int var4, int var5, int var6, boolean[] var7, boolean var8, boolean var9, int var10, int[] var11) {
        int var12;
        if (var3 != null && var4 != 0) {
            var12 = 0;
            int var35 = 0;

            for (int var36 = 0; var36 < var1.field9451; ++var36) {
                boolean var15 = false;
                if (var12 < var2.field2413 && var2.field2421[var12] == var36) {
                    var15 = true;
                }

                boolean var16 = false;
                if (var35 < var3.field2413 && var3.field2421[var35] == var36) {
                    var16 = true;
                }

                if (var15 || var16) {
                    if (var7 != null && var7[var36] != var8 && var1.field9461[var36] != 0) {
                        if (var15) {
                            ++var12;
                        }

                        if (var16) {
                            ++var35;
                        }
                    } else {
                        short var17 = 0;
                        int var18 = var1.field9461[var36];
                        if (var18 == 3 || var18 == 10) {
                            var17 = 128;
                        }

                        short var19;
                        short var20;
                        short var21;
                        short var22;
                        byte var23;
                        if (var15) {
                            var19 = var2.field2422[var12];
                            var20 = var2.field2418[var12];
                            var21 = var2.field2424[var12];
                            var22 = var2.field2425[var12];
                            var23 = var2.field2426[var12];
                            ++var12;
                        } else {
                            var19 = var17;
                            var20 = var17;
                            var21 = var17;
                            var22 = -1;
                            var23 = 0;
                        }

                        short var24;
                        short var25;
                        short var26;
                        short var27;
                        byte var28;
                        if (var16) {
                            var24 = var3.field2422[var35];
                            var25 = var3.field2418[var35];
                            var26 = var3.field2424[var35];
                            var27 = var3.field2425[var35];
                            var28 = var3.field2426[var35];
                            ++var35;
                        } else {
                            var24 = var17;
                            var25 = var17;
                            var26 = var17;
                            var27 = -1;
                            var28 = 0;
                        }

                        int var29;
                        int var30;
                        int var31;
                        if ((var23 & 2) == 0 && (var28 & 1) == 0) {
                            int var32;
                            if (var18 == 2) {
                                var32 = var24 - var19 & 16383;
                                int var33 = var25 - var20 & 16383;
                                int var34 = var26 - var21 & 16383;
                                if (var32 >= 8192) {
                                    var32 -= 16384;
                                }

                                if (var33 >= 8192) {
                                    var33 -= 16384;
                                }

                                if (var34 >= 8192) {
                                    var34 -= 16384;
                                }

                                var29 = var19 + var32 * var4 / var5 & 16383;
                                var30 = var20 + var33 * var4 / var5 & 16383;
                                var31 = var21 + var34 * var4 / var5 & 16383;
                            } else if (var18 == 9) {
                                var32 = var24 - var19 & 16383;
                                if (var32 >= 8192) {
                                    var32 -= 16384;
                                }

                                var29 = var19 + var32 * var4 / var5 & 16383;
                                var31 = 0;
                                var30 = 0;
                            } else if (var18 == 7) {
                                var32 = var24 - var19 & 63;
                                if (var32 >= 32) {
                                    var32 -= 64;
                                }

                                var29 = var19 + var32 * var4 / var5 & 63;
                                var30 = var20 + (var25 - var20) * var4 / var5;
                                var31 = var21 + (var26 - var21) * var4 / var5;
                            } else {
                                var29 = var19 + (var24 - var19) * var4 / var5;
                                var30 = var20 + (var25 - var20) * var4 / var5;
                                var31 = var21 + (var26 - var21) * var4 / var5;
                            }
                        } else {
                            var29 = var19;
                            var30 = var20;
                            var31 = var21;
                        }

                        if (var22 != -1) {
                            this.method6057(0, var1.field9462[var22], 0, 0, 0, var6, var9, var10 & var1.field9463[var22], var11);
                        } else if (var27 != -1) {
                            this.method6057(0, var1.field9462[var27], 0, 0, 0, var6, var9, var10 & var1.field9463[var27], var11);
                        }

                        this.method6057(var18, var1.field9462[var36], var29, var30, var31, var6, var9, var10 & var1.field9463[var36], var11);
                    }
                }
            }
        } else {
            for (var12 = 0; var12 < var2.field2413; ++var12) {
                short var13 = var2.field2421[var12];
                if (var7 == null || var7[var13] == var8 || var1.field9461[var13] == 0) {
                    short var14 = var2.field2425[var12];
                    if (var14 != -1) {
                        this.method6057(0, var1.field9462[var14], 0, 0, 0, var6, var9, var10 & var1.field9463[var14], var11);
                    }

                    this.method6057(var1.field9461[var13], var1.field9462[var13], var2.field2422[var12], var2.field2418[var12], var2.field2424[var12], var6, var9, var10 & var1.field9463[var13], var11);
                }
            }
        }

    }

    abstract void method6084();

    void method6087(int var1, int var2, int var3, int var4, int var5, int var6, float[] var7, int var8, float var9, float[] var10) {
        var1 -= var4;
        var2 -= var5;
        var3 -= var6;
        float var11 = (float) var1 * var7[0] + (float) var2 * var7[1] + (float) var3 * var7[2];
        float var12 = (float) var1 * var7[3] + (float) var2 * var7[4] + (float) var3 * var7[5];
        float var13 = (float) var1 * var7[6] + (float) var2 * var7[7] + (float) var3 * var7[8];
        float var14 = (float) Math.sqrt((double) (var11 * var11 + var12 * var12 + var13 * var13));
        float var15 = (float) Math.atan2((double) var11, (double) var13) / 6.2831855F + 0.5F;
        float var16 = (float) Math.asin((double) (var12 / var14)) / 3.1415927F + 0.5F + var9;
        float var17;
        if (var8 == 1) {
            var17 = var15;
            var15 = -var16;
            var16 = var17;
        } else if (var8 == 2) {
            var15 = -var15;
            var16 = -var16;
        } else if (var8 == 3) {
            var17 = var15;
            var15 = var16;
            var16 = -var17;
        }

        var10[0] = var15;
        var10[1] = var16;
    }

    public abstract class933[] method6089();

    public abstract void method6093();

    class251 method6095(class25 var1, int[] var2, int var3) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        float[][] var7 = null;
        if (var1.field6467 != null) {
            int var8 = var1.field6466;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];

            int var15;
            for (var15 = 0; var15 < var8; ++var15) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }

            int var20;
            for (var15 = 0; var15 < var3; ++var15) {
                int var16 = var2[var15];
                if (var1.field6467[var16] != -1) {
                    int var17 = var1.field6467[var16] & 255;

                    for (int var18 = 0; var18 < 3; ++var18) {
                        short var19;
                        if (var18 == 0) {
                            var19 = var1.field6476[var16];
                        } else if (var18 == 1) {
                            var19 = var1.field6478[var16];
                        } else {
                            var19 = var1.field6456[var16];
                        }

                        var20 = var1.field6448[var19];
                        int var21 = var1.field6474[var19];
                        int var22 = var1.field6450[var19];
                        if (var20 < var9[var17]) {
                            var9[var17] = var20;
                        }

                        if (var20 > var10[var17]) {
                            var10[var17] = var20;
                        }

                        if (var21 < var11[var17]) {
                            var11[var17] = var21;
                        }

                        if (var21 > var12[var17]) {
                            var12[var17] = var21;
                        }

                        if (var22 < var13[var17]) {
                            var13[var17] = var22;
                        }

                        if (var22 > var14[var17]) {
                            var14[var17] = var22;
                        }
                    }
                }
            }

            var4 = new int[var8];
            var5 = new int[var8];
            var6 = new int[var8];
            var7 = new float[var8][];

            for (var15 = 0; var15 < var8; ++var15) {
                byte var23 = var1.field6454[var15];
                if (var23 > 0) {
                    var4[var15] = (var9[var15] + var10[var15]) / 2;
                    var5[var15] = (var11[var15] + var12[var15]) / 2;
                    var6[var15] = (var13[var15] + var14[var15]) / 2;
                    float var24;
                    float var25;
                    float var26;
                    if (var23 == 1) {
                        var20 = var1.field6471[var15];
                        if (var20 == 0) {
                            var24 = 1.0F;
                            var26 = 1.0F;
                        } else if (var20 > 0) {
                            var24 = 1.0F;
                            var26 = (float) var20 / 1024.0F;
                        } else {
                            var26 = 1.0F;
                            var24 = (float) (-var20) / 1024.0F;
                        }

                        var25 = 64.0F / (float) var1.field6472[var15];
                    } else if (var23 == 2) {
                        var24 = 64.0F / (float) var1.field6471[var15];
                        var25 = 64.0F / (float) var1.field6472[var15];
                        var26 = 64.0F / (float) var1.field6473[var15];
                    } else {
                        var24 = (float) var1.field6471[var15] / 1024.0F;
                        var25 = (float) var1.field6472[var15] / 1024.0F;
                        var26 = (float) var1.field6473[var15] / 1024.0F;
                    }

                    var7[var15] = this.method5945(var1.field6455[var15], var1.field6468[var15], var1.field6470[var15], var1.field6477[var15] & 255, var24, var25, var26);
                }
            }
        }

        return new class251(this, var4, var5, var6, var7);
    }

    public abstract void method6096(class135 var1);

    public abstract boolean method6097(int var1, int var2, class135 var3, boolean var4, int var5);

    public abstract int method6099();

    public abstract class770 method6102(class770 var1);
}
