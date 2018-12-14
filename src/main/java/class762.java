public class class762 {
    static int field4391;
    class180 field4388;
    class180 field4389;
    class554 field4390;

    public class762(class180 var1, class180 var2) {
        this.field4389 = var1;
        this.field4388 = var2;
    }

    static final void method2809(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -78);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class643.method6119(var3, var4, var0, 2041063660);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "fu.kj(" + ')');
        }
    }

    static final void method2810(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = var0.field3169.field9704;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "fu.xs(" + ')');
        }
    }

    static final void method2811(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class321.field1066.method89(694163818);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "fu.up(" + ')');
        }
    }

    static final boolean method2812(SceneTile[][][] var0, int var1, int var2, int var3, boolean var4, int var5) {
        try {
            byte[][][] var6 = class730.field2697.method5284(1330177323);
            byte var7 = var4 ? 1 : (byte) (class730.field2758 & 255);
            if (var7 == var6[class899.field9552][var2][var3]) {
                return false;
            } else {
                class153 var8 = class730.field2697.method5296(-334353018);
                if ((var8.field5406[class899.field9552][var2][var3] & 4) == 0) {
                    return false;
                } else {
                    byte var9 = 0;
                    int var10 = 0;
                    class730.field2716[var9] = var2;
                    int var27 = var9 + 1;
                    class730.field2829[var9] = var3;
                    var6[class899.field9552][var2][var3] = var7;

                    while (var10 != var27) {
                        int var11 = class730.field2716[var10] & '\uffff';
                        int var12 = class730.field2716[var10] >> 16 & 255;
                        int var13 = class730.field2716[var10] >> 24 & 255;
                        int var14 = class730.field2829[var10] & '\uffff';
                        int var15 = class730.field2829[var10] >> 16 & 255;
                        var10 = var10 + 1 & 4095;
                        boolean var16 = false;
                        if ((var8.field5406[class899.field9552][var11][var14] & 4) == 0) {
                            var16 = true;
                        }

                        boolean var17 = false;
                        int var18;
                        int var19;
                        int var20;
                        if (var0 != null) {
                            label257:
                            for (var18 = class899.field9552 + 1; var18 <= 3; ++var18) {
                                if (var0[var18] == null) {
                                    if (var5 != -777988087) {
                                        throw new IllegalStateException();
                                    }
                                } else if ((var8.field5406[var18][var11][var14] & 8) == 0) {
                                    Animable var21;
                                    int var23;
                                    SceneTile var28;
                                    IterableSceneEntity var29;
                                    if (var16 && var0[var18][var11][var14] != null) {
                                        if (var0[var18][var11][var14].field7007 != null) {
                                            var19 = class176.method3173(var12, -1319957905);
                                            if (var19 == var0[var18][var11][var14].field7007.field7433) {
                                                continue;
                                            }

                                            if (var0[var18][var11][var14].field7008 != null && var19 == var0[var18][var11][var14].field7008.field7433) {
                                                if (var5 != -777988087) {
                                                    throw new IllegalStateException();
                                                }
                                                continue;
                                            }

                                            if (var13 != 0) {
                                                var20 = class176.method3173(var13, -1159033021);
                                                if (var0[var18][var11][var14].field7007.field7433 == var20 || var0[var18][var11][var14].field7008 != null && var0[var18][var11][var14].field7008.field7433 == var20) {
                                                    continue;
                                                }
                                            }

                                            if (var15 != 0) {
                                                var20 = class176.method3173(var15, -1010197518);
                                                if (var20 == var0[var18][var11][var14].field7007.field7433) {
                                                    continue;
                                                }

                                                if (var0[var18][var11][var14].field7008 != null && var0[var18][var11][var14].field7008.field7433 == var20) {
                                                    if (var5 != -777988087) {
                                                        throw new IllegalStateException();
                                                    }
                                                    continue;
                                                }
                                            }
                                        }

                                        var28 = var0[var18][var11][var14];
                                        if (var28.field7006 != null) {
                                            for (var29 = var28.field7006; var29 != null; var29 = var29.next) {
                                                var21 = var29.animable;
                                                if (var21 instanceof class265) {
                                                    class265 var22 = (class265) var21;
                                                    var23 = var22.method4548(726839210);
                                                    int var24 = var22.method4549((short) 13168);
                                                    if (21 == var23) {
                                                        var23 = 19;
                                                    }

                                                    int var25 = var23 | var24 << 6;
                                                    if (var25 == var12 || var13 != 0 && var13 == var25) {
                                                        continue label257;
                                                    }

                                                    if (var15 != 0 && var15 == var25) {
                                                        if (var5 != -777988087) {
                                                            throw new IllegalStateException();
                                                        }
                                                        continue label257;
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    var28 = var0[var18][var11][var14];
                                    if (var28 != null && var28.field7006 != null) {
                                        for (var29 = var28.field7006; var29 != null; var29 = var29.next) {
                                            var21 = var29.animable;
                                            if (var21.field8297 != var21.field8299 || var21.field8296 != var21.field8298) {
                                                for (int var30 = var21.field8299; var30 <= var21.field8297; ++var30) {
                                                    for (var23 = var21.field8296; var23 <= var21.field8298; ++var23) {
                                                        var6[var18][var30][var23] = var7;
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    var6[var18][var11][var14] = var7;
                                    var17 = true;
                                }
                            }
                        }

                        if (var17) {
                            var18 = class730.field2697.method5317(-1611682495).field3862[class899.field9552 + 1].method3888(var11, var14, (byte) -36);
                            if (class730.field2774[var1] < var18) {
                                class730.field2774[var1] = var18;
                            }

                            var19 = var11 << 9;
                            var20 = var14 << 9;
                            if (class730.field2651[var1] > var19) {
                                class730.field2651[var1] = var19;
                            } else if (class730.field2776[var1] < var19) {
                                class730.field2776[var1] = var19;
                            }

                            if (class730.field2778[var1] > var20) {
                                class730.field2778[var1] = var20;
                            } else if (class730.field2622[var1] < var20) {
                                class730.field2622[var1] = var20;
                            }
                        }

                        if (!var16) {
                            if (var11 >= 1 && var7 != var6[class899.field9552][var11 - 1][var14]) {
                                class730.field2716[var27] = var11 - 1 | 1179648 | -754974720;
                                class730.field2829[var27] = var14 | 1245184;
                                var27 = var27 + 1 & 4095;
                                var6[class899.field9552][var11 - 1][var14] = var7;
                            }

                            ++var14;
                            if (var14 < class730.field2697.method5272(-1603394405)) {
                                if (var11 - 1 >= 0 && var7 != var6[class899.field9552][var11 - 1][var14] && (var8.field5406[class899.field9552][var11][var14] & 4) == 0 && (var8.field5406[class899.field9552][var11 - 1][var14 - 1] & 4) == 0) {
                                    class730.field2716[var27] = var11 - 1 | 1179648 | 1375731712;
                                    class730.field2829[var27] = var14 | 1245184;
                                    var27 = 1 + var27 & 4095;
                                    var6[class899.field9552][var11 - 1][var14] = var7;
                                }

                                if (var6[class899.field9552][var11][var14] != var7) {
                                    class730.field2716[var27] = var11 | 5373952 | 318767104;
                                    class730.field2829[var27] = var14 | 5439488;
                                    var27 = var27 + 1 & 4095;
                                    var6[class899.field9552][var11][var14] = var7;
                                }

                                if (1 + var11 < class730.field2697.method5271(-1968040539) && var7 != var6[class899.field9552][1 + var11][var14] && (var8.field5406[class899.field9552][var11][var14] & 4) == 0 && (var8.field5406[class899.field9552][1 + var11][var14 - 1] & 4) == 0) {
                                    class730.field2716[var27] = var11 + 1 | 5373952 | -1845493760;
                                    class730.field2829[var27] = var14 | 5439488;
                                    var27 = 1 + var27 & 4095;
                                    var6[class899.field9552][var11 + 1][var14] = var7;
                                }
                            }

                            --var14;
                            if (1 + var11 < class730.field2697.method5271(-1881854697) && var7 != var6[class899.field9552][var11 + 1][var14]) {
                                class730.field2716[var27] = 1 + var11 | 9568256 | 1392508928;
                                class730.field2829[var27] = var14 | 9633792;
                                var27 = var27 + 1 & 4095;
                                var6[class899.field9552][var11 + 1][var14] = var7;
                            }

                            --var14;
                            if (var14 >= 0) {
                                if (var11 - 1 >= 0 && var7 != var6[class899.field9552][var11 - 1][var14] && (var8.field5406[class899.field9552][var11][var14] & 4) == 0 && (var8.field5406[class899.field9552][var11 - 1][1 + var14] & 4) == 0) {
                                    class730.field2716[var27] = var11 - 1 | 13762560 | 301989888;
                                    class730.field2829[var27] = var14 | 13828096;
                                    var27 = var27 + 1 & 4095;
                                    var6[class899.field9552][var11 - 1][var14] = var7;
                                }

                                if (var7 != var6[class899.field9552][var11][var14]) {
                                    class730.field2716[var27] = var11 | 13762560 | -1828716544;
                                    class730.field2829[var27] = var14 | 13828096;
                                    var27 = var27 + 1 & 4095;
                                    var6[class899.field9552][var11][var14] = var7;
                                }

                                if (1 + var11 < class730.field2697.method5271(-1909288528) && var6[class899.field9552][var11 + 1][var14] != var7 && (var8.field5406[class899.field9552][var11][var14] & 4) == 0 && (var8.field5406[class899.field9552][var11 + 1][var14 + 1] & 4) == 0) {
                                    class730.field2716[var27] = 1 + var11 | 9568256 | -771751936;
                                    class730.field2829[var27] = var14 | 9633792;
                                    var27 = var27 + 1 & 4095;
                                    var6[class899.field9552][1 + var11][var14] = var7;
                                }
                            }
                        }
                    }

                    if (-1000000 != class730.field2774[var1]) {
                        class730.field2774[var1] += 40;
                        class730.field2651[var1] -= 512;
                        class730.field2776[var1] += 512;
                        class730.field2622[var1] += 512;
                        class730.field2778[var1] -= 512;
                    }

                    return true;
                }
            }
        } catch (RuntimeException var26) {
            throw class158.method3445(var26, "fu.iz(" + ')');
        }
    }

    public static void method2813(byte var0) {
        try {
            class660.field9639.method2977();
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "fu.k(" + ')');
        }
    }

    public class54 method2807(class925 var1, byte var2) {
        try {
            if (var1 == null) {
                return null;
            } else {
                class7 var3 = var1.method6197(1551623871);
                if (var3 == class7.field4912) {
                    return new class870((class374) var1);
                } else if (class7.field4911 == var3) {
                    return new class83(this.method2808(597799285), (class809) var1);
                } else if (var3 == class7.field4915) {
                    return new class128(this.field4389, (class562) var1);
                } else if (var3 == class7.field4916) {
                    return new class558(this.field4389, (class635) var1);
                } else if (var3 == class7.field4908) {
                    return new class127(this.field4389, this.field4388, (class634) var1);
                } else if (class7.field4909 == var3) {
                    return new class173(this.field4389, this.field4388, (class665) var1);
                } else if (class7.field4910 == var3) {
                    return new class631(this.field4389, this.field4388, (class710) var1);
                } else if (var3 == class7.field4907) {
                    return new class574(this.field4389, this.field4388, (class980) var1);
                } else if (var3 == class7.field4913) {
                    return new class232(this.field4389, (class912) var1);
                } else {
                    return var3 == class7.field4914 ? new class699(this.field4389, this.field4388, (class343) var1) : null;
                }
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "fu.a(" + ')');
        }
    }

    class554 method2808(int var1) {
        try {
            if (this.field4390 == null) {
                this.field4390 = new class554();
            }

            return this.field4390;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "fu.f(" + ')');
        }
    }
}
