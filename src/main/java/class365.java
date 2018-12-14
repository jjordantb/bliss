public class class365 {
    public static int field2437 = 1073741824;
    public static short[][] field2440;
    public static int field2448 = Integer.MIN_VALUE;
    static int field2438 = 1073741823;
    static int[] field2442 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
    static class1 field2449 = new class1(260);
    static class1 field2450 = new class1(5);
    static int field2451;
    public int[] field2443;
    public int field2444 = -1;
    public boolean field2447;
    long field2436;
    int[] field2439;
    class241[] field2441;
    long field2445;
    int field2446;

    static void method1645(int var0) {
        try {
            class730.field2674.method4374((byte) 4);
            if (class904.field10354 < 2) {
                class569.field24.method2743(-1528906992);
                class904.field10352 = 0;
                ++class904.field10354;
            } else {
                class904.field10355 = null;
                class904.field10356 = class235.field8242;
                class967.method1750(19, 561881815);
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "pf.z(" + ')');
        }
    }

    public void method1636(int var1, int var2, class422 var3, int var4) {
        try {
            int var5 = field2442[var1];
            if (var3.method5716(var2, -1709524743) != null) {
                this.field2439[var5] = var2 | Integer.MIN_VALUE;
                this.method1640(-1951489461);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "pf.f(" + ')');
        }
    }

    public void method1637(int var1, int var2, byte var3) {
        try {
            this.field2443[var1] = var2;
            this.method1640(2147284588);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "pf.b(" + ')');
        }
    }

    public void method1638(boolean var1, int var2) {
        try {
            this.field2447 = var1;
            this.method1640(1206946871);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "pf.p(" + ')');
        }
    }

    public void method1639(int var1, int var2, class58 var3, byte var4) {
        try {
            if (-1 == var2) {
                this.field2439[var1] = 0;
            } else if (var3.method1566(var2) != null) {
                this.field2439[var1] = var2 | 1073741824;
                this.method1640(-1390071548);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "pf.i(" + ')');
        }
    }

    void method1640(int var1) {
        try {
            long[] var2 = InputStream.field10382;
            this.field2445 = -1L;
            this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) (this.field2446 >> 8)) & 255L)];
            this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) this.field2446) & 255L)];

            int var3;
            for (var3 = 0; var3 < this.field2439.length; ++var3) {
                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) (this.field2439[var3] >> 24)) & 255L)];
                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) (this.field2439[var3] >> 16)) & 255L)];
                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) (this.field2439[var3] >> 8)) & 255L)];
                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) this.field2439[var3]) & 255L)];
            }

            if (this.field2441 != null) {
                for (var3 = 0; var3 < this.field2441.length; ++var3) {
                    if (this.field2441[var3] != null) {
                        int[] var4;
                        int[] var5;
                        if (this.field2447) {
                            var4 = this.field2441[var3].field8376;
                            var5 = this.field2441[var3].field8378;
                        } else {
                            var4 = this.field2441[var3].field8375;
                            var5 = this.field2441[var3].field8371;
                        }

                        int var6;
                        if (var4 != null) {
                            for (var6 = 0; var6 < var4.length; ++var6) {
                                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) (var4[var6] >> 8)) & 255L)];
                                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) var4[var6]) & 255L)];
                            }
                        }

                        if (var5 != null) {
                            for (var6 = 0; var6 < var5.length; ++var6) {
                                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) (var5[var6] >> 8)) & 255L)];
                                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) var5[var6]) & 255L)];
                            }
                        }

                        if (this.field2441[var3].field8379 != null) {
                            for (var6 = 0; var6 < this.field2441[var3].field8379.length; ++var6) {
                                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) (this.field2441[var3].field8379[var6] >> 8)) & 255L)];
                                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) this.field2441[var3].field8379[var6]) & 255L)];
                            }
                        }

                        if (this.field2441[var3].field8380 != null) {
                            for (var6 = 0; var6 < this.field2441[var3].field8380.length; ++var6) {
                                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) (this.field2441[var3].field8380[var6] >> 8)) & 255L)];
                                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) this.field2441[var3].field8380[var6]) & 255L)];
                            }
                        }
                    }
                }
            }

            for (var3 = 0; var3 < 10; ++var3) {
                this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) this.field2443[var3]) & 255L)];
            }

            this.field2445 = this.field2445 >>> 8 ^ var2[(int) ((this.field2445 ^ (long) (this.field2447 ? 1 : 0)) & 255L)];
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "pf.k(" + ')');
        }
    }

    public class879 method1641(class848 var1, int var2, class422 var3, class329 var4, class58 var5, class769 var6, class415 var7, Animator var8, int var9) {
        try {
            if (-1 != this.field2444) {
                return var4.method12(this.field2444, 491367243).method6107(var1, var2, var7, var8, (class692) null, -218177955);
            } else {
                int var10 = var8 != null ? var2 | var8.method2785(-1790708337) : var2;
                class1 var11 = field2450;
                class879 var12;
                synchronized (field2450) {
                    var12 = (class879) field2450.method2974(this.field2445);
                }

                if (var12 == null || var1.method4836(var12.method5948(), var10) != 0) {
                    if (var12 != null) {
                        var10 = var1.method4817(var10, var12.method5948());
                    }

                    boolean var13 = false;

                    int var15;
                    for (int var14 = 0; var14 < this.field2439.length; ++var14) {
                        var15 = this.field2439[var14];
                        class241 var16 = null;
                        if ((var15 & 1073741824) != 0) {
                            if (this.field2441 != null && this.field2441[var14] != null) {
                                var16 = this.field2441[var14];
                            }

                            if (!var5.method1566(var15 & 1073741823).method2681(this.field2447, var16, (byte) 0)) {
                                var13 = true;
                            }
                        } else if ((var15 & Integer.MIN_VALUE) != 0 && !var3.method5716(var15 & 1073741823, -939984800).method1449(-783889357)) {
                            var13 = true;
                        }
                    }

                    if (var13) {
                        return null;
                    }

                    class25[] var25 = new class25[this.field2439.length];
                    var15 = 0;

                    int var17;
                    for (int var26 = 0; var26 < this.field2439.length; ++var26) {
                        var17 = this.field2439[var26];
                        class241 var18 = null;
                        class25 var19;
                        if ((var17 & 1073741824) != 0) {
                            if (this.field2441 != null && this.field2441[var26] != null) {
                                var18 = this.field2441[var26];
                            }

                            var19 = var5.method1566(var17 & 1073741823).method2686(this.field2447, var18, 327827223);
                            if (var19 != null) {
                                var25[var15++] = var19;
                            }
                        } else if ((var17 & Integer.MIN_VALUE) != 0) {
                            var19 = var3.method5716(var17 & 1073741823, -276971058).method1450(1209505122);
                            if (var19 != null) {
                                var25[var15++] = var19;
                            }
                        }
                    }

                    class25 var27 = new class25(var25, var15);
                    int var23 = var10 | 16384;
                    var12 = var1.method4861(var27, var23, field2451, 64, 768);

                    for (var17 = 0; var17 < 10; ++var17) {
                        for (int var29 = 0; var29 < field2440[var17].length; ++var29) {
                            if (this.field2443[var17] < class629.field9737[var17][var29].length) {
                                var12.method5984(field2440[var17][var29], class629.field9737[var17][var29][this.field2443[var17]]);
                            }
                        }
                    }

                    var12.method5947(var10);
                    class1 var28 = field2450;
                    synchronized (field2450) {
                        field2450.method2984(var12, this.field2445);
                    }
                }

                if (var8 == null) {
                    return var12;
                } else {
                    class879 var24 = var12.method6017((byte) 4, var10, true);
                    var8.method2795(var24, 0, -1353467740);
                    return var24;
                }
            }
        } catch (RuntimeException var22) {
            throw class158.method3445(var22, "pf.u(" + ')');
        }
    }

    public class879 method1642(class848 var1, int var2, class422 var3, class769 var4, Animator var5, int var6, int var7, int var8, byte var9) {
        try {
            int var10 = var5 != null ? var2 | var5.method2785(-1790708337) : var2;
            long var11 = (long) var8 << 32 | (long) (var7 << 16) | (long) var6;
            class1 var13 = field2450;
            class879 var14;
            synchronized (field2450) {
                var14 = (class879) field2450.method2974(var11);
            }

            if (var14 == null || var1.method4836(var14.method5948(), var10) != 0) {
                if (var14 != null) {
                    var10 = var1.method4817(var10, var14.method5948());
                }

                class25[] var15 = new class25[3];
                int var16 = 0;
                if (!var3.method5716(var6, -1760783131).method1449(-783889357) || !var3.method5716(var7, -1162557302).method1449(-783889357) || !var3.method5716(var8, -839635617).method1449(-783889357)) {
                    return null;
                }

                class25 var17 = var3.method5716(var6, -156721354).method1450(1042420956);
                if (var17 != null) {
                    var15[var16++] = var17;
                }

                var17 = var3.method5716(var7, 773247218).method1450(74933704);
                if (var17 != null) {
                    var15[var16++] = var17;
                }

                var17 = var3.method5716(var8, 744132841).method1450(552695292);
                if (var17 != null) {
                    var15[var16++] = var17;
                }

                var17 = new class25(var15, var16);
                int var23 = var10 | 16384;
                var14 = var1.method4861(var17, var23, field2451, 64, 768);

                for (int var18 = 0; var18 < 10; ++var18) {
                    for (int var19 = 0; var19 < field2440[var18].length; ++var19) {
                        if (this.field2443[var18] < class629.field9737[var18][var19].length) {
                            var14.method5984(field2440[var18][var19], class629.field9737[var18][var19][this.field2443[var18]]);
                        }
                    }
                }

                var14.method5947(var10);
                class1 var24 = field2450;
                synchronized (field2450) {
                    field2450.method2984(var14, var11);
                }
            }

            if (var5 == null) {
                return var14;
            } else {
                var14 = var14.method6017((byte) 4, var10, true);
                var5.method2795(var14, 0, -716564268);
                return var14;
            }
        } catch (RuntimeException var22) {
            throw class158.method3445(var22, "pf.x(" + ')');
        }
    }

    public class879 method1643(class848 var1, int var2, class193 var3, class422 var4, class329 var5, class58 var6, class769 var7, class415 var8, Animator var9, Animator var10, Animator[] var11, int[] var12, int var13, boolean var14, class385 var15, int var16) {
        try {
            if (this.field2444 != -1) {
                return var5.method12(this.field2444, 1899433887).method6116(var1, var2, var3, var8, var9, var10, var11, var12, var13, (class692) null, -884053309);
            } else {
                int var17 = var2;
                long var18 = this.field2445;
                int[] var20 = this.field2439;
                boolean var21 = false;
                boolean var22 = false;
                int var24;
                if (var9 != null) {
                    Animation var23 = var9.method2776(28542107);
                    if (var23 != null && (var23.field6663 >= 0 || var23.field6664 >= 0)) {
                        var20 = new int[this.field2439.length];

                        for (var24 = 0; var24 < var20.length; ++var24) {
                            var20[var24] = this.field2439[var24];
                        }

                        if (var23.field6663 >= 0 && -1 != var15.field1541) {
                            var21 = true;
                            if (65535 == var23.field6663) {
                                var20[var15.field1541] = 0;

                                for (var24 = 0; var24 < var15.field1547.length; ++var24) {
                                    var20[var15.field1547[var24]] = 0;
                                }

                                var18 ^= -4294967296L;
                            } else {
                                var20[var15.field1541] = var23.field6663 | 1073741824;

                                for (var24 = 0; var24 < var15.field1547.length; ++var24) {
                                    var20[var15.field1547[var24]] = 0;
                                }

                                var18 ^= (long) var20[var15.field1541] << 32;
                            }
                        }

                        if (var23.field6664 >= 0 && -1 != var15.field1545) {
                            var22 = true;
                            if (var23.field6664 == 65535) {
                                var20[var15.field1545] = 0;

                                for (var24 = 0; var24 < var15.field1548.length; ++var24) {
                                    var20[var15.field1548[var24]] = 0;
                                }

                                var18 ^= 4294967295L;
                            } else {
                                var20[var15.field1545] = var23.field6664 | 1073741824;

                                for (var24 = 0; var24 < var15.field1548.length; ++var24) {
                                    var20[var15.field1548[var24]] = 0;
                                }

                                var18 ^= (long) var20[var15.field1545];
                            }
                        }
                    }
                }

                boolean var42 = false;
                var24 = var11 != null ? var11.length : 0;

                for (int var25 = 0; var25 < var24; ++var25) {
                    if (var11[var25] != null) {
                        var17 |= var11[var25].method2785(-1790708337);
                        var42 = true;
                    }
                }

                if (var9 != null) {
                    var17 |= var9.method2785(-1790708337);
                    var42 = true;
                }

                if (var10 != null) {
                    var17 |= var10.method2785(-1790708337);
                    var42 = true;
                }

                boolean var43 = false;
                if (var12 != null) {
                    for (int var26 = 0; var26 < var12.length; ++var26) {
                        if (var12[var26] != -1) {
                            var17 |= 32;
                            var43 = true;
                        }
                    }
                }

                class1 var27 = field2449;
                class879 var44;
                synchronized (field2449) {
                    var44 = (class879) field2449.method2974(var18);
                }

                class507 var45 = null;
                if (this.field2446 != -1) {
                    var45 = var3.method3736(this.field2446, (byte) 29);
                }

                int var30;
                int var31;
                if (var44 == null || var1.method4836(var44.method5948(), var17) != 0) {
                    if (var44 != null) {
                        var17 = var1.method4817(var17, var44.method5948());
                    }

                    boolean var29 = false;
                    var30 = 0;

                    while (true) {
                        int var34;
                        if (var30 >= var20.length) {
                            if (var29) {
                                if (-1L != this.field2436) {
                                    class1 var48 = field2449;
                                    synchronized (field2449) {
                                        var44 = (class879) field2449.method2974(this.field2436);
                                    }
                                }

                                if (var44 == null || var1.method4836(var44.method5948(), var17) != 0) {
                                    return null;
                                }
                            } else {
                                class25[] var49 = new class25[var20.length];

                                int var51;
                                for (var31 = 0; var31 < var20.length; ++var31) {
                                    var51 = var20[var31];
                                    class241 var52 = null;
                                    boolean var54 = 5 == var31 && var21 || var31 == 3 && var22;
                                    class25 var35;
                                    if ((var51 & 1073741824) != 0) {
                                        if (!var54 && this.field2441 != null && this.field2441[var31] != null) {
                                            var52 = this.field2441[var31];
                                        }

                                        var35 = var6.method1566(var51 & 1073741823).method2674(this.field2447, var52, -1675025463);
                                        if (var35 != null) {
                                            var49[var31] = var35;
                                        }
                                    } else if ((var51 & Integer.MIN_VALUE) != 0) {
                                        var35 = var4.method5716(var51 & 1073741823, -959041423).method1448((byte) 93);
                                        if (var35 != null) {
                                            var49[var31] = var35;
                                        }
                                    }
                                }

                                int var57;
                                if (var45 != null && var45.field3968 != null) {
                                    for (var31 = 0; var31 < var45.field3968.length; ++var31) {
                                        if (var49[var31] == null) {
                                            if (var16 <= -992714828) {
                                                throw new IllegalStateException();
                                            }
                                        } else {
                                            var51 = 0;
                                            var57 = 0;
                                            var34 = 0;
                                            int var56 = 0;
                                            int var36 = 0;
                                            int var37 = 0;
                                            if (var45.field3968[var31] != null) {
                                                var51 = var45.field3968[var31][0];
                                                var57 = var45.field3968[var31][1];
                                                var34 = var45.field3968[var31][2];
                                                var56 = var45.field3968[var31][3] << 3;
                                                var36 = var45.field3968[var31][4] << 3;
                                                var37 = var45.field3968[var31][5] << 3;
                                            }

                                            if (var56 != 0 || var36 != 0 || var37 != 0) {
                                                var49[var31].method3457(var56, var36, var37);
                                            }

                                            if (var51 != 0 || var57 != 0 || var34 != 0) {
                                                var49[var31].method3456(var51, var57, var34);
                                            }
                                        }
                                    }
                                }

                                class25 var50 = new class25(var49, var49.length);
                                int var28 = var17 | 16384;
                                var44 = var1.method4861(var50, var28, field2451, 64, 850);

                                for (var51 = 0; var51 < 10; ++var51) {
                                    for (var57 = 0; var57 < field2440[var51].length; ++var57) {
                                        if (this.field2443[var51] < class629.field9737[var51][var57].length) {
                                            var44.method5984(field2440[var51][var57], class629.field9737[var51][var57][this.field2443[var51]]);
                                        }
                                    }
                                }

                                if (var14) {
                                    var44.method5947(var17);
                                    class1 var53 = field2449;
                                    synchronized (field2449) {
                                        field2449.method2984(var44, var18);
                                    }

                                    this.field2436 = var18;
                                }
                            }
                            break;
                        }

                        var31 = var20[var30];
                        class241 var32 = null;
                        boolean var33 = false;
                        if (var21) {
                            if (var15.field1541 == var30) {
                                var33 = true;
                            } else {
                                for (var34 = 0; var34 < var15.field1547.length; ++var34) {
                                    if (var15.field1547[var34] == var30) {
                                        var33 = true;
                                        break;
                                    }
                                }
                            }
                        }

                        if (var22) {
                            if (var30 == var15.field1545) {
                                var33 = true;
                            } else {
                                for (var34 = 0; var34 < var15.field1548.length; ++var34) {
                                    if (var15.field1548[var34] == var30) {
                                        var33 = true;
                                        break;
                                    }
                                }
                            }
                        }

                        if ((var31 & 1073741824) != 0) {
                            if (!var33 && this.field2441 != null && this.field2441[var30] != null) {
                                var32 = this.field2441[var30];
                            }

                            if (!var6.method1566(var31 & 1073741823).method2680(this.field2447, var32, (byte) -1)) {
                                var29 = true;
                            }
                        } else if ((var31 & Integer.MIN_VALUE) != 0 && !var4.method5716(var31 & 1073741823, 1033806901).method1451(169549971)) {
                            var29 = true;
                        }

                        ++var30;
                    }
                }

                class879 var46 = var44.method6017((byte) 4, var17, true);
                if (!var42 && !var43) {
                    return var46;
                } else {
                    class135[] var47 = null;
                    if (var45 != null) {
                        var47 = var45.method2503((byte) 92);
                    }

                    if (var43 && var47 != null) {
                        for (var30 = 0; var30 < var12.length; ++var30) {
                            if (var47[var30] != null) {
                                var46.method5970(var47[var30], 1 << var30, true);
                            }
                        }
                    }

                    var30 = 0;

                    for (var31 = 1; var30 < var24; var31 <<= 1) {
                        if (var11[var30] != null) {
                            var11[var30].method2786(var46, 0, var31, (byte) 57);
                        }

                        ++var30;
                    }

                    if (var43) {
                        for (var30 = 0; var30 < var12.length; ++var30) {
                            if (-1 == var12[var30]) {
                                if (var16 <= -992714828) {
                                    throw new IllegalStateException();
                                }
                            } else {
                                var31 = var12[var30] - var13;
                                var31 &= 16383;
                                class135 var55 = new class135();
                                var55.method1013(0.0F, 1.0F, 0.0F, class703.method2002(var31));
                                var46.method5970(var55, 1 << var30, false);
                            }
                        }
                    }

                    if (var43 && var47 != null) {
                        for (var30 = 0; var30 < var12.length; ++var30) {
                            if (var47[var30] != null) {
                                var46.method5970(var47[var30], 1 << var30, false);
                            }
                        }
                    }

                    if (var9 != null && var10 != null) {
                        class878.method5920(var46, var9, var10, -2147197181);
                    } else if (var9 != null) {
                        var9.method2795(var46, 0, -390031954);
                    } else if (var10 != null) {
                        var10.method2795(var46, 0, 1377070013);
                    }

                    return var46;
                }
            }
        } catch (RuntimeException var41) {
            throw class158.method3445(var41, "pf.d(" + ')');
        }
    }

    public void method1644(int var1, int[] var2, class241[] var3, int[] var4, boolean var5, int var6, int var7) {
        try {
            if (var1 != this.field2446) {
                this.field2446 = var1;
            }

            this.field2439 = var2;
            this.field2441 = var3;
            this.field2443 = var4;
            this.field2447 = var5;
            this.field2444 = var6;
            this.method1640(-330295212);
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "pf.a(" + ')');
        }
    }
}
