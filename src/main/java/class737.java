import java.util.Iterator;

public class class737 extends class686 {
    int field3074;
    short field3075;
    short field3076;
    short field3077;
    short field3078;
    class363 field3079;
    short field3080;
    short field3081;
    int field3082;

    class737(class363 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13, boolean var14) {
        this.field3079 = var1;
        super.field7608 = var2 << 12;
        super.field7612 = var3 << 12;
        super.field7613 = var4 << 12;
        super.field7615 = var10;
        this.field3076 = this.field3077 = (short) var9;
        super.field7614 = var11;
        super.field7617 = var12;
        super.field7610 = var14;
        this.field3078 = (short) var5;
        this.field3081 = (short) var6;
        this.field3080 = (short) var7;
        this.field3074 = var8;
        super.field7616 = this.field3079.field2401.field10333;
        this.method1826();
    }

    void method1825(class363 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13, boolean var14) {
        this.field3079 = var1;
        super.field7608 = var2 << 12;
        super.field7612 = var3 << 12;
        super.field7613 = var4 << 12;
        super.field7615 = var10;
        this.field3076 = this.field3077 = (short) var9;
        super.field7614 = var11;
        super.field7617 = var12;
        super.field7610 = var14;
        this.field3078 = (short) var5;
        this.field3081 = (short) var6;
        this.field3080 = (short) var7;
        this.field3074 = var8;
        super.field7616 = this.field3079.field2401.field10333;
        this.method1826();
    }

    void method1826() {
        int var1 = this.field3079.field2388.field2539;
        if (this.field3079.field2388.field2538[var1] != null) {
            this.field3079.field2388.field2538[var1].method1827();
        }

        this.field3079.field2388.field2538[var1] = this;
        this.field3075 = (short) this.field3079.field2388.field2539;
        this.field3079.field2388.field2539 = var1 + 1 & 8191;
        this.field3079.field2387.method5209(this, -1945856763);
    }

    void method1827() {
        this.field3079.field2388.field2538[this.field3075] = null;
        class198.field7039[class198.field7049] = this;
        class198.field7049 = class198.field7049 + 1 & 1023;
        this.method2028(225174472);
        this.method5122(-850214067);
    }

    void method1828(SceneGraph var1, class848 var2, long var3) {
        int var5 = super.field7608 >> 12 + var1.field3849;
        int var6 = super.field7613 >> 12 + var1.field3849;
        int var7 = super.field7612 >> 12;
        if (var7 <= 0 && var7 >= -262144 && var5 >= 0 && var5 < var1.field3859 && var6 >= 0 && var6 < var1.field3894) {
            class726 var8 = this.field3079.field2388;
            class114 var9 = this.field3079.field2395;
            SceneGraphLevel[] var10 = var1.field3862;
            int var11 = var8.field2543;
            SceneTile var12 = var1.field3861[var8.field2543][var5][var6];
            if (var12 != null) {
                var11 = var12.floorLevel;
            }

            int var13 = var10[var11].method3888(var5, var6, (byte) -12);
            int var14;
            if (var11 < var1.field3893 - 1) {
                var14 = var10[var11 + 1].method3888(var5, var6, (byte) -120);
            } else {
                var14 = var13 - (8 << var1.field3849);
            }

            if (var9.field1770) {
                if (var9.field1756 == -1 && var7 > var13) {
                    this.method1827();
                    return;
                }

                if (var9.field1756 >= 0 && var7 > var10[var9.field1756].method3888(var5, var6, (byte) -9)) {
                    this.method1827();
                    return;
                }

                if (var9.field1757 == -1 && var7 < var14) {
                    this.method1827();
                    return;
                }

                if (var9.field1757 >= 0 && var7 < var10[var9.field1757 + 1].method3888(var5, var6, (byte) -1)) {
                    this.method1827();
                    return;
                }
            }

            int var15;
            for (var15 = var1.field3893 - 1; var15 > 0 && var7 > var10[var15].method3888(var5, var6, (byte) -107); --var15) {
                ;
            }

            if (var9.field1769 && var15 == 0 && var7 > var10[0].method3888(var5, var6, (byte) -119)) {
                this.method1827();
            } else if (var15 == var1.field3893 - 1 && var10[var15].method3888(var5, var6, (byte) -125) - var7 > 8 << var1.field3849) {
                this.method1827();
            } else {
                var12 = var1.field3861[var15][var5][var6];
                int var17;
                if (var12 == null) {
                    if (var15 == 0 || var1.field3861[0][var5][var6] == null) {
                        var12 = var1.field3861[0][var5][var6] = new SceneTile(0);
                    }

                    boolean var16 = var1.field3861[0][var5][var6].field7005 != null;
                    if (var15 == 3 && var16) {
                        this.method1827();
                        return;
                    }

                    for (var17 = 1; var17 <= var15; ++var17) {
                        if (var1.field3861[var17][var5][var6] == null) {
                            var12 = var1.field3861[var17][var5][var6] = new SceneTile(var17);
                            if (var16) {
                                ++var12.floorLevel;
                            }
                        }
                    }
                }

                if (var9.field1768) {
                    int var20 = super.field7608 >> 12;
                    var17 = super.field7613 >> 12;
                    class719 var18;
                    if (var12.boundaryObject != null) {
                        var18 = var12.boundaryObject.method2165(var2, (byte) -82);
                        if (var18 != null && var18.method2058(var20, var7, var17)) {
                            this.method1827();
                            return;
                        }
                    }

                    if (var12.boundaryObject2 != null) {
                        var18 = var12.boundaryObject2.method2165(var2, (byte) -77);
                        if (var18 != null && var18.method2058(var20, var7, var17)) {
                            this.method1827();
                            return;
                        }
                    }

                    if (var12.opt2 != null) {
                        var18 = var12.opt2.method2165(var2, (byte) 0);
                        if (var18 != null && var18.method2058(var20, var7, var17)) {
                            this.method1827();
                            return;
                        }
                    }

                    for (IterableSceneEntity var21 = var12.iterableSceneEntity; var21 != null; var21 = var21.next) {
                        class719 var19 = var21.animable.method2165(var2, (byte) -58);
                        if (var19 != null && var19.method2058(var20, var7, var17)) {
                            this.method1827();
                            return;
                        }
                    }
                }

                var8.field2541.field9777.method5866(this, (byte) -3);
            }
        } else {
            this.method1827();
        }

    }

    void method1829(long var1, int var3) {
        this.field3077 = (short) (this.field3077 - var3);
        if (this.field3077 <= 0) {
            this.method1827();
        } else {
            int var4 = super.field7608 >> 12;
            int var5 = super.field7612 >> 12;
            int var6 = super.field7613 >> 12;
            class726 var7 = this.field3079.field2388;
            class114 var8 = this.field3079.field2395;
            if (var8.field1743 != 0) {
                int var9;
                if (this.field3076 - this.field3077 <= var8.field1792) {
                    var9 = (super.field7615 >> 8 & '\uff00') + (this.field3082 >> 16 & 255) + var8.field1785 * var3;
                    int var10 = (super.field7615 & '\uff00') + (this.field3082 >> 8 & 255) + var8.field1786 * var3;
                    int var11 = (super.field7615 << 8 & '\uff00') + (this.field3082 & 255) + var8.field1787 * var3;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }

                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 65535) {
                        var10 = 65535;
                    }

                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 65535) {
                        var11 = 65535;
                    }

                    super.field7615 &= -16777216;
                    super.field7615 |= ((var9 & '\uff00') << 8) + (var10 & '\uff00') + ((var11 & '\uff00') >> 8);
                    this.field3082 &= -16777216;
                    this.field3082 |= ((var9 & 255) << 16) + ((var10 & 255) << 8) + (var11 & 255);
                }

                if (this.field3076 - this.field3077 <= var8.field1751) {
                    var9 = (super.field7615 >> 16 & '\uff00') + (this.field3082 >> 24 & 255) + var8.field1788 * var3;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }

                    super.field7615 &= 16777215;
                    super.field7615 |= (var9 & '\uff00') << 16;
                    this.field3082 &= 16777215;
                    this.field3082 |= (var9 & 255) << 24;
                }
            }

            if (var8.field1734 != -1 && this.field3076 - this.field3077 <= var8.field1789) {
                this.field3074 += var8.field1790 * var3;
            }

            if (var8.field1738 != -1 && this.field3076 - this.field3077 <= var8.field1791) {
                super.field7614 += var8.field1784 * var3;
            }

            double var12 = (double) this.field3078;
            double var14 = (double) this.field3081;
            double var16 = (double) this.field3080;
            boolean var18 = false;
            int var19;
            int var20;
            int var21;
            int var22;
            long var23;
            if (var8.field1725 == 1) {
                var19 = var4 - this.field3079.field2394.field134;
                var20 = var5 - this.field3079.field2394.field137;
                var21 = var6 - this.field3079.field2394.field127;
                var22 = (int) Math.sqrt((double) (var19 * var19 + var20 * var20 + var21 * var21)) >> 2;
                var23 = (long) (var8.field1753 * var22 * var3);
                this.field3074 = (int) ((long) this.field3074 - ((long) this.field3074 * var23 >> 18));
            } else if (var8.field1725 == 2) {
                var19 = var4 - this.field3079.field2394.field134;
                var20 = var5 - this.field3079.field2394.field137;
                var21 = var6 - this.field3079.field2394.field127;
                var22 = var19 * var19 + var20 * var20 + var21 * var21;
                var23 = (long) (var8.field1753 * var22 * var3);
                this.field3074 = (int) ((long) this.field3074 - ((long) this.field3074 * var23 >> 28));
            }

            class713 var65;
            class660 var66;
            if (var8.field1729 != null) {
                Iterator var64 = var7.field2544.iterator();

                label213:
                while (true) {
                    do {
                        if (!var64.hasNext()) {
                            break label213;
                        }

                        var65 = (class713) var64.next();
                        var66 = var65.field3534;
                    } while (var66.field9650 == 1);

                    boolean var68 = false;

                    for (int var25 = 0; var25 < var8.field1729.length; ++var25) {
                        if (var8.field1729[var25] == var66.field9640) {
                            var68 = true;
                            break;
                        }
                    }

                    if (var68) {
                        double var69 = (double) (var4 - var65.field3536);
                        double var26 = (double) (var5 - var65.field3537);
                        double var28 = (double) (var6 - var65.field3539);
                        double var30 = var69 * var69 + var26 * var26 + var28 * var28;
                        if (var30 <= (double) var66.field9641) {
                            double var32 = Math.sqrt(var30);
                            if (var32 == 0.0D) {
                                var32 = 1.0D;
                            }

                            double var34 = (var69 * (double) var65.field3535 + var26 * (double) var66.field9644 + var28 * (double) var65.field3540) * 65535.0D / ((double) var66.field9651 * var32);
                            if (var34 >= (double) var66.field9653) {
                                double var36 = 0.0D;
                                if (var66.field9646 == 1) {
                                    var36 = var32 / 16.0D * (double) var66.field9630;
                                } else if (var66.field9646 == 2) {
                                    var36 = var32 / 16.0D * (var32 / 16.0D) * (double) var66.field9630;
                                }

                                if (var66.field9649 == 0) {
                                    if (var66.field9652 == 0) {
                                        var12 += ((double) var65.field3535 - var36) * (double) var3;
                                        var14 += ((double) var66.field9644 - var36) * (double) var3;
                                        var16 += ((double) var65.field3540 - var36) * (double) var3;
                                        var18 = true;
                                    } else {
                                        super.field7608 = (int) ((double) super.field7608 + ((double) var65.field3535 - var36) * (double) var3);
                                        super.field7612 = (int) ((double) super.field7612 + ((double) var66.field9644 - var36) * (double) var3);
                                        super.field7613 = (int) ((double) super.field7613 + ((double) var65.field3540 - var36) * (double) var3);
                                    }
                                } else {
                                    double var38 = var69 / var32 * (double) var66.field9651;
                                    double var40 = var26 / var32 * (double) var66.field9651;
                                    double var42 = var28 / var32 * (double) var66.field9651;
                                    if (var66.field9652 == 0) {
                                        var12 += var38 * (double) var3;
                                        var14 += var40 * (double) var3;
                                        var16 += var42 * (double) var3;
                                        var18 = true;
                                    } else {
                                        super.field7608 = (int) ((double) super.field7608 + var38 * (double) var3);
                                        super.field7612 = (int) ((double) super.field7612 + var40 * (double) var3);
                                        super.field7613 = (int) ((double) super.field7613 + var42 * (double) var3);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (var8.field1752 != null) {
                for (var19 = 0; var19 < var8.field1752.length; ++var19) {
                    var65 = (class713) class198.field7047.method2942((long) var8.field1752[var19]);

                    while (var65 != null) {
                        var66 = var65.field3534;
                        double var44 = (double) (var4 - var65.field3536);
                        double var46 = (double) (var5 - var65.field3537);
                        double var48 = (double) (var6 - var65.field3539);
                        double var50 = var44 * var44 + var46 * var46 + var48 * var48;
                        if (var50 > (double) var66.field9641) {
                            var65 = (class713) class198.field7047.method2943(-2145025597);
                        } else {
                            double var52 = Math.sqrt(var50);
                            if (var52 == 0.0D) {
                                var52 = 1.0D;
                            }

                            double var54 = (var44 * (double) var65.field3535 + var46 * (double) var66.field9644 + var48 * (double) var65.field3540) * 65535.0D / ((double) var66.field9651 * var52);
                            if (var54 < (double) var66.field9653) {
                                var65 = (class713) class198.field7047.method2943(-1619963382);
                            } else {
                                double var56 = 0.0D;
                                if (var66.field9646 == 1) {
                                    var56 = var52 / 16.0D * (double) var66.field9630;
                                } else if (var66.field9646 == 2) {
                                    var56 = var52 / 16.0D * (var52 / 16.0D) * (double) var66.field9630;
                                }

                                if (var66.field9649 == 0) {
                                    if (var66.field9652 == 0) {
                                        var12 += ((double) var65.field3535 - var56) * (double) var3;
                                        var14 += ((double) var66.field9644 - var56) * (double) var3;
                                        var16 += ((double) var65.field3540 - var56) * (double) var3;
                                        var18 = true;
                                    } else {
                                        super.field7608 = (int) ((double) super.field7608 + ((double) var65.field3535 - var56) * (double) var3);
                                        super.field7612 = (int) ((double) super.field7612 + ((double) var66.field9644 - var56) * (double) var3);
                                        super.field7613 = (int) ((double) super.field7613 + ((double) var65.field3540 - var56) * (double) var3);
                                    }
                                } else {
                                    double var58 = var44 / var52 * (double) var66.field9651;
                                    double var60 = var46 / var52 * (double) var66.field9651;
                                    double var62 = var48 / var52 * (double) var66.field9651;
                                    if (var66.field9652 == 0) {
                                        var12 += var58 * (double) var3;
                                        var14 += var60 * (double) var3;
                                        var16 += var62 * (double) var3;
                                        var18 = true;
                                    } else {
                                        super.field7608 = (int) ((double) super.field7608 + var58 * (double) var3);
                                        super.field7612 = (int) ((double) super.field7612 + var60 * (double) var3);
                                        super.field7613 = (int) ((double) super.field7613 + var62 * (double) var3);
                                    }
                                }

                                var65 = (class713) class198.field7047.method2943(-1920939025);
                            }
                        }
                    }
                }
            }

            if (var8.field1735 != null) {
                if (var8.field1754 == null) {
                    var8.field1754 = new int[var8.field1735.length];

                    for (var19 = 0; var19 < var8.field1735.length; ++var19) {
                        class554.method423(var8.field1735[var19], 1300932054);
                        var8.field1754[var19] = ((class722) class660.field9638.method2942((long) var8.field1735[var19])).field3631;
                    }
                }

                for (var19 = 0; var19 < var8.field1754.length; ++var19) {
                    class660 var67 = class660.field9636[var8.field1754[var19]];
                    if (var67.field9652 == 0) {
                        var12 += (double) (var67.field9643 * var3);
                        var14 += (double) (var67.field9644 * var3);
                        var16 += (double) (var67.field9645 * var3);
                        var18 = true;
                    } else {
                        super.field7608 += var67.field9643 * var3;
                        super.field7612 += var67.field9644 * var3;
                        super.field7613 += var67.field9645 * var3;
                    }
                }
            }

            if (var18) {
                while (true) {
                    if (var12 <= 32767.0D && var14 <= 32767.0D && var16 <= 32767.0D && var12 >= -32767.0D && var14 >= -32767.0D && var16 >= -32767.0D) {
                        this.field3078 = (short) ((int) var12);
                        this.field3081 = (short) ((int) var14);
                        this.field3080 = (short) ((int) var16);
                        break;
                    }

                    var12 /= 2.0D;
                    var14 /= 2.0D;
                    var16 /= 2.0D;
                    this.field3074 <<= 1;
                }
            }

            super.field7608 = (int) ((long) super.field7608 + ((long) this.field3078 * (long) (this.field3074 << 2) >> 23) * (long) var3);
            super.field7612 = (int) ((long) super.field7612 + ((long) this.field3081 * (long) (this.field3074 << 2) >> 23) * (long) var3);
            super.field7613 = (int) ((long) super.field7613 + ((long) this.field3080 * (long) (this.field3074 << 2) >> 23) * (long) var3);
        }

    }
}
