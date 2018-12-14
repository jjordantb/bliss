public class class339 {
    public static class591 field157;
    class180 field154;
    int field155;
    class711[] field156;

    public class339(class469 var1, class423 var2, class180 var3, boolean var4) {
        this.field154 = var3;
        this.field155 = this.field154.method3286(class981.field3242.field3271, -1837337583);
        if (var4) {
            this.field156 = new class711[this.field155];

            for (int var5 = 0; var5 < this.field155; ++var5) {
                class180 var6 = this.field154;
                byte[] var7;
                synchronized (this.field154) {
                    var7 = this.field154.method3285(class981.field3242.field3271, var5, (byte) -117);
                }

                class711 var9 = new class711();
                if (var7 != null) {
                    var9.method2021(new InputStream(var7), -2124220647);
                }

                this.field156[var5] = var9;
            }
        }

    }

    static class701 method136(byte var0) {
        try {
            return class701.field3368 == 0 ? new class701() : class701.field3370[--class701.field3368];
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "ur.a(" + ')');
        }
    }

    static void method137(class513 var0, int var1, int var2) {
        try {
            RegionBase var3 = class730.field2697.getRegionBase(681479919);
            boolean var4 = var0.method2647(1) == 1;
            if (var4) {
                class498.field8113[++class498.field8112 - 1] = var1;
            }

            int var5 = var0.method2647(2);
            Player var6 = class730.loaded[var1];
            if (var5 == 0) {
                if (var4) {
                    var6.field3396 = false;
                } else {
                    if (class730.field2623 == var1) {
                        throw new RuntimeException();
                    }

                    class370 var7 = class498.field8111[var1] = new class370();
                    var7.field1095 = (var6.field4055[0] + var3.baseY >> 6) + (var6.field3639 << 28) + (var3.baseX + var6.field4085[0] >> 6 << 14);
                    if (-1 != var6.field3400) {
                        var7.field1093 = var6.field3400;
                    } else {
                        var7.field1093 = var6.field4048.method5553((byte) 0);
                    }

                    var7.field1092 = var6.field4054;
                    var7.field1094 = var6.field3382;
                    var7.field1096 = var6.field3401;
                    if (var6.field3393 > 0) {
                        class792.method440(var6, (byte) -66);
                    }

                    class730.loaded[var1] = null;
                    if (var0.method2647(1) != 0) {
                        class936.method6278(var0, var1, 2107350837);
                    }
                }
            } else {
                int var8;
                int var9;
                int var15;
                if (var5 == 1) {
                    var15 = var0.method2647(3);
                    var8 = var6.field4085[0];
                    var9 = var6.field4055[0];
                    if (var15 == 0) {
                        --var8;
                        --var9;
                    } else if (var15 == 1) {
                        --var9;
                    } else if (2 == var15) {
                        ++var8;
                        --var9;
                    } else if (var15 == 3) {
                        --var8;
                    } else if (4 == var15) {
                        ++var8;
                    } else if (5 == var15) {
                        --var8;
                        ++var9;
                    } else if (6 == var15) {
                        ++var9;
                    } else if (7 == var15) {
                        ++var8;
                        ++var9;
                    }

                    if (var4) {
                        var6.field3397 = var8;
                        var6.field3398 = var9;
                        var6.field3396 = true;
                    } else {
                        var6.method1994(var8, var9, class498.field8105[var1], -2105155066);
                    }
                } else if (2 == var5) {
                    var15 = var0.method2647(4);
                    var8 = var6.field4085[0];
                    var9 = var6.field4055[0];
                    if (var15 == 0) {
                        var8 -= 2;
                        var9 -= 2;
                    } else if (1 == var15) {
                        --var8;
                        var9 -= 2;
                    } else if (2 == var15) {
                        var9 -= 2;
                    } else if (3 == var15) {
                        ++var8;
                        var9 -= 2;
                    } else if (var15 == 4) {
                        var8 += 2;
                        var9 -= 2;
                    } else if (5 == var15) {
                        var8 -= 2;
                        --var9;
                    } else if (6 == var15) {
                        var8 += 2;
                        --var9;
                    } else if (var15 == 7) {
                        var8 -= 2;
                    } else if (8 == var15) {
                        var8 += 2;
                    } else if (var15 == 9) {
                        var8 -= 2;
                        ++var9;
                    } else if (var15 == 10) {
                        var8 += 2;
                        ++var9;
                    } else if (11 == var15) {
                        var8 -= 2;
                        var9 += 2;
                    } else if (12 == var15) {
                        --var8;
                        var9 += 2;
                    } else if (var15 == 13) {
                        var9 += 2;
                    } else if (14 == var15) {
                        ++var8;
                        var9 += 2;
                    } else if (var15 == 15) {
                        var8 += 2;
                        var9 += 2;
                    }

                    if (var4) {
                        var6.field3397 = var8;
                        var6.field3398 = var9;
                        var6.field3396 = true;
                    } else {
                        var6.method1994(var8, var9, class498.field8105[var1], -2092850777);
                    }
                } else {
                    var15 = var0.method2647(1);
                    int var10;
                    int var11;
                    int var12;
                    int var13;
                    if (var15 == 0) {
                        var8 = var0.method2647(12);
                        var9 = var8 >> 10;
                        var10 = var8 >> 5 & 31;
                        if (var10 > 15) {
                            var10 -= 32;
                        }

                        var11 = var8 & 31;
                        if (var11 > 15) {
                            var11 -= 32;
                        }

                        var12 = var6.field4085[0] + var10;
                        var13 = var6.field4055[0] + var11;
                        if (var4) {
                            var6.field3397 = var12;
                            var6.field3398 = var13;
                            var6.field3396 = true;
                        } else {
                            var6.method1994(var12, var13, class498.field8105[var1], -2123912900);
                        }

                        var6.field3639 = var6.field3640 = (byte) (var6.field3639 + var9 & 3);
                        if (class730.field2697.method5296(-232228879).method3386(var12, var13, 1039567132)) {
                            ++var6.field3640;
                        }

                        if (class730.field2623 == var1 && class899.field9552 != var6.field3639) {
                            class899.field9552 = var6.field3639;
                        }
                    } else {
                        var8 = var0.method2647(30);
                        var9 = var8 >> 28;
                        var10 = var8 >> 14 & 16383;
                        var11 = var8 & 16383;
                        var12 = (var10 + var3.baseX + var6.field4085[0] & 16383) - var3.baseX;
                        var13 = (var11 + var3.baseY + var6.field4055[0] & 16383) - var3.baseY;
                        if (var4) {
                            var6.field3397 = var12;
                            var6.field3398 = var13;
                            var6.field3396 = true;
                        } else {
                            var6.method1994(var12, var13, class498.field8105[var1], -2073670245);
                        }

                        var6.field3639 = var6.field3640 = (byte) (var9 + var6.field3639 & 3);
                        if (class730.field2697.method5296(934483887).method3386(var12, var13, 624472586)) {
                            ++var6.field3640;
                        }

                        if (var1 == class730.field2623) {
                            class899.field9552 = var6.field3639;
                        }
                    }
                }
            }

        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "ur.i(" + ')');
        }
    }

    public class711 method135(int var1, int var2) {
        try {
            return var1 < 0 ? new class711() : this.field156[var1];
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ur.a(" + ')');
        }
    }
}
