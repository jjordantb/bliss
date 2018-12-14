public class class916 implements class331 {
    public static class916 field10410 = new class916("LOCAL", "", 4);
    public static class916 field10411 = new class916("WTI", "", 5);
    public static class916 field10412 = new class916("WTQA", "", 2);
    public static class916 field10413 = new class916("WTRC", "", 1);
    public static class916 field10415 = new class916("LIVE", "", 0);
    public static class916 field10418 = new class916("WTWIP", "", 3);
    static class916 field10414 = new class916("INTBETA", "", 6);
    static int field10417;
    static class48[] field10419;
    static int field10420;

    static {
        method6460(-2140357445);
    }

    int field10409;
    String field10416;

    class916(String var1, String var2, int var3) {
        this.field10416 = var1;
        this.field10409 = var3;
    }

    public static boolean method6456(class916 var0, int var1) {
        try {
            return field10413 == var0 || var0 == field10412 || field10418 == var0 || field10411 == var0 || field10414 == var0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "qq.b(" + ')');
        }
    }

    public static final int method6457(int var0, int var1, int var2, int var3) {
        try {
            if (var2 > 243) {
                var1 >>= 4;
            } else if (var2 > 217) {
                var1 >>= 3;
            } else if (var2 > 192) {
                var1 >>= 2;
            } else if (var2 > 179) {
                var1 >>= 1;
            }

            return (var2 >> 1) + ((var0 & 255) >> 2 << 10) + (var1 >> 5 << 7);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "qq.s(" + ')');
        }
    }

    static void method6458(byte var0) {
        try {
            class921.field10285.method2977();
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "qq.b(" + ')');
        }
    }

    static final void method6459(class744 var0, byte var1) {
        try {
            var0.field3156 -= 2;
            if (var0.field3161[var0.field3156] >= var0.field3161[1 + var0.field3156]) {
                var0.field3176 += var0.field3174[var0.field3176];
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "qq.al(" + ')');
        }
    }

    public static class916[] method6460(int var0) {
        try {
            return new class916[]{field10414, field10410, field10411, field10415, field10413, field10418, field10412};
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "qq.a(" + ')');
        }
    }

    public static class241 method6461(ItemDefinition var0, InputStream var1, byte var2) {
        try {
            class241 var3 = new class241(var0);
            int var4 = var1.method6371();
            boolean var5 = (var4 & 1) != 0;
            boolean var6 = (var4 & 2) != 0;
            boolean var7 = (var4 & 4) != 0;
            boolean var8 = (var4 & 8) != 0;
            if (var5) {
                var3.field8375[0] = var1.method6423(1235052657);
                var3.field8376[0] = var1.method6423(1235052657);
                if (-1 != var0.field4255 || -1 != var0.field4264) {
                    var3.field8375[1] = var1.method6423(1235052657);
                    var3.field8376[1] = var1.method6423(1235052657);
                }

                if (var0.field4277 != -1 || var0.field4259 != -1) {
                    var3.field8375[2] = var1.method6423(1235052657);
                    var3.field8376[2] = var1.method6423(1235052657);
                }
            }

            if (var6) {
                var3.field8371[0] = var1.method6423(1235052657);
                var3.field8378[0] = var1.method6423(1235052657);
                if (var0.field4267 != -1 || var0.field4282 != -1) {
                    var3.field8371[1] = var1.method6423(1235052657);
                    var3.field8378[1] = var1.method6423(1235052657);
                }
            }

            int var9;
            int[] var10;
            int var11;
            if (var7) {
                var9 = var1.method6374();
                var10 = new int[]{var9 & 15, var9 >> 4 & 15, var9 >> 8 & 15, var9 >> 12 & 15};

                for (var11 = 0; var11 < 4; ++var11) {
                    if (var10[var11] != 15) {
                        var3.field8379[var10[var11]] = (short) var1.method6374();
                    }
                }
            }

            if (var8) {
                var9 = var1.method6371();
                var10 = new int[]{var9 & 15, var9 >> 4 & 15};

                for (var11 = 0; var11 < 2; ++var11) {
                    if (15 != var10[var11]) {
                        var3.field8380[var10[var11]] = (short) var1.method6374();
                    }
                }
            }

            return var3;
        } catch (RuntimeException var12) {
            throw class158.method3445(var12, "qq.a(" + ')');
        }
    }

    static void method6462(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
        try {
            int var8 = class972.method1776(var2, class381.field1414, class381.field1415, -1212608691);
            int var9 = class972.method1776(var3, class381.field1414, class381.field1415, -1212608691);
            int var10 = class972.method1776(var0, class381.field1416, class381.field1413, -1212608691);
            int var11 = class972.method1776(var1, class381.field1416, class381.field1413, -1212608691);
            int var12 = class972.method1776(var2 + var6, class381.field1414, class381.field1415, -1212608691);
            int var13 = class972.method1776(var3 - var6, class381.field1414, class381.field1415, -1212608691);

            int var14;
            for (var14 = var8; var14 < var12; ++var14) {
                class484.method4769(class381.field1412[var14], var10, var11, var5, -1884573988);
            }

            for (var14 = var9; var14 > var13; --var14) {
                class484.method4769(class381.field1412[var14], var10, var11, var5, 712014890);
            }

            var14 = class972.method1776(var0 + var6, class381.field1416, class381.field1413, -1212608691);
            int var15 = class972.method1776(var1 - var6, class381.field1416, class381.field1413, -1212608691);

            for (int var16 = var12; var16 <= var13; ++var16) {
                int[] var17 = class381.field1412[var16];
                class484.method4769(var17, var10, var14, var5, -665045806);
                class484.method4769(var17, var14, var15, var4, -1572233497);
                class484.method4769(var17, var15, var11, var5, -2046400935);
            }

        } catch (RuntimeException var18) {
            throw class158.method3445(var18, "qq.q(" + ')');
        }
    }

    static void processAction(MenuItem var0, int var1, int var2, short var3) {
        try {
            System.out.println(var0);
            if (var0 != null && class602.field8647.field1104 != var0) {
                int var4 = var0.regionX;
                int var5 = var0.regionY;
                int var6 = var0.opcode;
                int var7 = (int) var0.field1701;
                long var8 = var0.field1701;
                if (var6 >= 2000) {
                    var6 -= 2000;
                }

                RegionBase var10 = class730.field2697.getRegionBase(681479919);
                if (23 == var6) {
                    if (class730.field2790 > 0 && class123.method1634(1267311211)) {
                        class439.method4280(class923.local.field3639, var4 + var10.baseX, var5 + var10.baseY, 2043472934);
                    } else {
                        if (Loader.field6958) {
                            class701 var11 = class544.method2371(var4, var5, var7);
                            if (1 == var7) {
                                var11.field3364.method6361(-1);
                                var11.field3364.method6361(-1);
                                var11.field3364.method6362((int) class730.field2931, 16711935);
                                var11.field3364.method6361(57);
                                var11.field3364.method6361(class730.field2782);
                                var11.field3364.method6361(class730.field2730);
                                var11.field3364.method6361(89);
                                RegionOffset var12 = class923.local.getRegion().regionOffset;
                                var11.field3364.method6362((int) var12.offsetX, 16711935);
                                var11.field3364.method6362((int) var12.offsetY, 16711935);
                                var11.field3364.method6361(63);
                            } else {
                                class730.field2765 = var1;
                                class730.field2766 = var2;
                                class730.field2729 = 1;
                                class730.field2767 = 0;
                            }

                            class730.field2692.method4380(var11, (byte) -115);
                        } else {
                            class544.method2370(var7, class507.method2510(var4, var5, (short) 808));
                            if (var7 == 0) {
                                class730.field2765 = var1;
                                class730.field2766 = var2;
                                class730.field2729 = 1;
                                class730.field2767 = 0;
                            }
                        }

                        class133.method998(var4, var5, true, class507.method2510(var4, var5, (short) 808), -1776617382);
                    }
                }

                class643 var26 = null;
                if (var6 == 18) {
                    var26 = class643.field9939;
                } else if (var6 == 19) {
                    var26 = class643.field9987;
                } else if (var6 == 20) {
                    var26 = class643.field9959;
                } else if (21 == var6) {
                    var26 = class643.field9992;
                } else if (22 == var6) {
                    var26 = class643.field9975;
                } else if (1004 == var6) {
                    var26 = class643.field10032;
                }

                class701 var27;
                if (var26 != null) {
                    if (var26 != class643.field10032) {
                        class544.method2369(class647.method5483(var4, var5, 1, 1, 1978833308));
                    }

                    class730.field2765 = var1;
                    class730.field2766 = var2;
                    class730.field2729 = 2;
                    class730.field2767 = 0;
                    var27 = class637.method5936(var26, class730.field2692.field7765, (byte) 23);
                    var27.field3364.method6362(var10.baseY + var5, 16711935);
                    var27.field3364.method6421(var4 + var10.baseX, 1653379787);
                    var27.field3364.method6362(var7, 16711935);
                    var27.field3364.method6415(class980.method1913(984220338) ? 1 : 0, (byte) 1);
                    class730.field2692.method4380(var27, (byte) -56);
                    class509.method2536(var4, var5, (byte) -67);
                }

                if (59 == var6) {
                    class730.field2765 = var1;
                    class730.field2766 = var2;
                    class730.field2729 = 1;
                    class730.field2767 = 0;
                    var27 = class637.method5936(class643.field10024, class730.field2692.field7765, (byte) 6);
                    var27.field3364.method6364(class543.field3820, 969641873);
                    var27.field3364.method6362(class730.field2818, 16711935);
                    var27.field3364.method6362(var10.baseY + var5, 16711935);
                    var27.field3364.method6419(class730.field2888);
                    var27.field3364.method6421(var10.baseX + var4, 1993411127);
                    class730.field2692.method4380(var27, (byte) -125);
                    class133.method998(var4, var5, true, class507.method2510(var4, var5, (short) 808), -1460658515);
                }

                if (var6 == 57 || var6 == 1007) {
                    class740.method1920(var7, var5, var4, var0.name, 400950689);
                }

                if (1008 == var6 || 1009 == var6 || var6 == 1010 || 1011 == var6 || var6 == 1012) {
                    class972.method1778(var6, var7, var4, 1889973846);
                }

                int var17;
                int var18;
                class701 var40;
                if (2 == var6) {
                    int var28 = (int) var8 >> 14 & 31;
                    int var13 = (int) var8 >> 20 & 3;
                    int var14 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
                    class15 var15 = (class15) class367.method1565(class351.method1227(114624527), var28, (byte) 2);
                    class312 var19;
                    if (class15.field6919 != var15 && class15.field6912 != var15 && class15.field6918 != var15) {
                        if (class26.method3482(var15.field6921, (byte) 28)) {
                            var19 = class391.method3417(var4, var5, 0, 0, var15, var13, 740164949);
                        } else {
                            var19 = class979.method1834(var4, var5, 0, 0, var15, var13, (byte) -22);
                        }
                    } else {
                        ObjectDefinition var16 = class730.field2697.method5283(-1208362615).method4713(var14);
                        if (var13 != 0 && var13 != 2) {
                            var17 = var16.field2215;
                            var18 = var16.field2218;
                        } else {
                            var17 = var16.field2218;
                            var18 = var16.field2215;
                        }

                        var19 = class391.method3417(var4, var5, var17, var18, class15.field6922, 0, 1300552038);
                    }

                    class544.method2369(var19);
                    class730.field2765 = var1;
                    class730.field2766 = var2;
                    class730.field2729 = 2;
                    class730.field2767 = 0;
                    var40 = class637.method5936(class643.field9967, class730.field2692.field7765, (byte) 52);
                    var40.field3364.method6415(class980.method1913(-427290804) ? 1 : 0, (byte) 1);
                    var40.field3364.method6400(class730.field2888);
                    var40.field3364.method6400(var10.baseY + var5);
                    var40.field3364.method6408((int) (var8 >>> 32) & Integer.MAX_VALUE);
                    var40.field3364.method6364(class543.field3820, 671195475);
                    var40.field3364.method6421(class730.field2818, 462918069);
                    var40.field3364.method6419(var4 + var10.baseX);
                    var40.field3364.method6361(var13);
                    class730.field2692.method4380(var40, (byte) -39);
                    class386.method1170(var4, var5, var8);
                }

                if (var6 == 30 && class730.field2633 == null) {
                    class118.method1463(var5, var4, 1723723267);
                    class730.field2633 = class554.method427(var5, var4, -156511736);
                    class814.method2932(class730.field2633, 194587581);
                }

                class643 var29 = null;
                if (var6 == 44) {
                    var29 = class643.field9980;
                } else if (var6 == 45) {
                    var29 = class643.field9976;
                } else if (var6 == 46) {
                    var29 = class643.field10001;
                } else if (var6 == 47) {
                    var29 = class643.field9947;
                } else if (48 == var6) {
                    var29 = class643.field10007;
                } else if (var6 == 49) {
                    var29 = class643.field9979;
                } else if (50 == var6) {
                    var29 = class643.field9993;
                } else if (51 == var6) {
                    var29 = class643.field10015;
                } else if (var6 == 52) {
                    var29 = class643.field9986;
                } else if (var6 == 53) {
                    var29 = class643.field9937;
                }

                if (var29 != null) {
                    Player var30 = class730.loaded[var7];
                    if (var30 != null) {
                        class544.method2369(class191.method3721(var30.field4085[0], var30.field4055[0], var30.method2550(), var30.method2550(), 0, (byte) 13));
                        class730.field2765 = var1;
                        class730.field2766 = var2;
                        class730.field2729 = 2;
                        class730.field2767 = 0;
                        class701 var32 = class637.method5936(var29, class730.field2692.field7765, (byte) 74);
                        var32.field3364.method6361(class980.method1913(1625676244) ? 1 : 0);
                        var32.field3364.method6400(var7);
                        class730.field2692.method4380(var32, (byte) -105);
                        class133.method998(var30.field4085[0], var30.field4055[0], true, class191.method3721(var30.field4085[0], var30.field4055[0], var30.method2550(), var30.method2550(), 0, (byte) 13), 278987907);
                    }
                }

                class701 var31;
                if (var6 == 16) {
                    class730.field2765 = var1;
                    class730.field2766 = var2;
                    class730.field2729 = 2;
                    class730.field2767 = 0;
                    var31 = class637.method5936(class643.field10035, class730.field2692.field7765, (byte) 82);
                    var31.field3364.method6362(class730.field2888, 16711935);
                    var31.field3364.method6362(class923.local.field4028, 16711935);
                    var31.field3364.method6408(class543.field3820);
                    var31.field3364.method6400(class730.field2818);
                    var31.field3364.method6415(class980.method1913(-1804963392) ? 1 : 0, (byte) 1);
                    class730.field2692.method4380(var31, (byte) -113);
                }

                if (var6 == 17) {
                    class730.field2765 = var1;
                    class730.field2766 = var2;
                    class730.field2729 = 2;
                    class730.field2767 = 0;
                    var31 = class637.method5936(class643.field9999, class730.field2692.field7765, (byte) 15);
                    var31.field3364.method6400(class730.field2888);
                    var31.field3364.method6400(var4 + var10.baseX);
                    var31.field3364.method6419(var10.baseY + var5);
                    var31.field3364.method6406(class543.field3820, (byte) 1);
                    var31.field3364.method6419(class730.field2818);
                    var31.field3364.method6400(var7);
                    class730.field2692.method4380(var31, (byte) -59);
                    class509.method2536(var4, var5, (byte) -97);
                }

                if (58 == var6) {
                    Widget var33 = class554.method427(var5, var4, -156511736);
                    if (var33 != null) {
                        class533.method2264(var33, 1371871585);
                    }
                }

                class643 var34 = null;
                if (9 == var6) {
                    var34 = class643.field9961;
                } else if (var6 == 10) {
                    var34 = class643.field9950;
                } else if (11 == var6) {
                    var34 = class643.field10031;
                } else if (12 == var6) {
                    var34 = class643.field9968;
                } else if (var6 == 13) {
                    var34 = class643.field10014;
                } else if (var6 == 1003) {
                    var34 = class643.field9995;
                }

                class701 var45;
                if (var34 != null) {
                    class437 var35 = (class437) class730.field2677.method2942((long) var7);
                    if (var35 != null) {
                        Npc var37 = (Npc) var35.field7515;
                        if (var34 != class643.field9995) {
                            class544.method2369(class191.method3721(var37.field4085[0], var37.field4055[0], var37.method2550(), var37.method2550(), 0, (byte) -51));
                        }

                        class730.field2765 = var1;
                        class730.field2766 = var2;
                        class730.field2729 = 2;
                        class730.field2767 = 0;
                        var45 = class637.method5936(var34, class730.field2692.field7765, (byte) 15);
                        var45.field3364.method6419(var7);
                        var45.field3364.method6415(class980.method1913(1824393579) ? 1 : 0, (byte) 1);
                        class730.field2692.method4380(var45, (byte) -120);
                        class133.method998(var37.field4085[0], var37.field4055[0], true, class191.method3721(var37.field4085[0], var37.field4055[0], var37.method2550(), var37.method2550(), 0, (byte) -51), -1636676956);
                    }
                }

                class643 var36 = null;
                if (3 == var6) {
                    var36 = class643.field9956;
                } else if (4 == var6) {
                    var36 = class643.field9989;
                } else if (5 == var6) {
                    var36 = class643.field9970;
                } else if (6 == var6) {
                    var36 = class643.field9953;
                } else if (1001 == var6) {
                    var36 = class643.field9949;
                } else if (1002 == var6) {
                    var36 = class643.field9955;
                }

                if (var36 != null) {
                    class730.field2765 = var1;
                    class730.field2766 = var2;
                    class730.field2729 = 2;
                    class730.field2767 = 0;
                    int var38 = (int) var8 >> 20 & 3;
                    if (class643.field9955 != var36) {
                        int var46 = (int) var8 >> 14 & 31;
                        int var42 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
                        var17 = var4;
                        var18 = var5;
                        switch (var42) {
                            case 20211:
                                var4 = 2539 - var10.baseX;
                                var5 = 3545 - var10.baseY;
                                break;
                            case 43526:
                                var5 = 3553 - var10.baseY;
                                break;
                            case 43587:
                                var4 = 2533 - var10.baseX;
                                var5 = 3547 - var10.baseY;
                                break;
                            case 43597:
                                var4 = 2537 - var10.baseX;
                                var5 = 3546 - var10.baseY;
                                break;
                            case 64696:
                                var4 = 3005 - var10.baseX;
                                var5 = 3954 - var10.baseY;
                                break;
                            case 65362:
                                var4 = 3004 - var10.baseX;
                                var5 = 3938 - var10.baseY;
                                break;
                            case 69377:
                                var4 = 2487 - var10.baseX;
                                var5 = 3431 - var10.baseY;
                                break;
                            case 69378:
                                var4 = 2483 - var10.baseX;
                                var5 = 3431 - var10.baseY;
                        }

                        class15 var20 = (class15) class367.method1565(class351.method1227(114624527), var46, (byte) 2);
                        class312 var24;
                        if (class15.field6919 != var20 && class15.field6912 != var20 && class15.field6918 != var20) {
                            if (class26.method3482(var20.field6921, (byte) 28)) {
                                var24 = class391.method3417(var4, var5, 0, 0, var20, var38, 740164949);
                            } else {
                                var24 = class979.method1834(var4, var5, 0, 0, var20, var38, (byte) -22);
                            }
                        } else {
                            ObjectDefinition var21 = class730.field2697.method5283(-1208362615).method4713(var42);
                            int var22;
                            int var23;
                            if (var38 != 0 && var38 != 2) {
                                var22 = var21.field2215;
                                var23 = var21.field2218;
                            } else {
                                var22 = var21.field2218;
                                var23 = var21.field2215;
                            }

                            var24 = class391.method3417(var4, var5, var22, var23, class15.field6922, 0, 1300552038);
                        }

                        class544.method2369(var24);
                        var4 = var17;
                        var5 = var18;
                    }

                    var45 = class637.method5936(var36, class730.field2692.field7765, (byte) 94);
                    var45.field3364.method6393(class980.method1913(1030396767) ? 1 : 0, 1999137832);
                    var45.field3364.method6406((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 1);
                    var45.field3364.method6421(var4 + var10.baseX, 1077977138);
                    var45.field3364.method6400(var10.baseY + var5);
                    var45.field3364.method6361(var38);
                    class730.field2692.method4380(var45, (byte) -13);
                    class386.method1170(var4, var5, var8);
                }

                if (8 == var6) {
                    class437 var39 = (class437) class730.field2677.method2942((long) var7);
                    if (var39 != null) {
                        Npc var47 = (Npc) var39.field7515;
                        class544.method2369(class191.method3721(var47.field4085[0], var47.field4055[0], var47.method2550(), var47.method2550(), 0, (byte) -81));
                        class730.field2765 = var1;
                        class730.field2766 = var2;
                        class730.field2729 = 2;
                        class730.field2767 = 0;
                        var40 = class637.method5936(class643.field9938, class730.field2692.field7765, (byte) 103);
                        var40.field3364.method6361(class980.method1913(-510062351) ? 1 : 0);
                        var40.field3364.method6364(class543.field3820, -828026807);
                        var40.field3364.method6421(var7, 1218473206);
                        var40.field3364.method6400(class730.field2818);
                        var40.field3364.method6421(class730.field2888, 249731045);
                        class730.field2692.method4380(var40, (byte) -11);
                        class133.method998(var47.field4085[0], var47.field4055[0], true, class191.method3721(var47.field4085[0], var47.field4055[0], var47.method2550(), var47.method2550(), 0, (byte) -81), 420897053);
                    }
                }

                if (25 == var6) {
                    Widget var41 = class554.method427(var5, var4, -156511736);
                    if (var41 != null) {
                        class422.method5724((byte) 4);
                        class725 var48 = class730.method1761(var41);
                        class900.method6347(var41, var48.method1742((byte) -122), var48.field2557, 1387537939);
                        class730.field2820 = class622.method5341(var41, -447348156);
                        if (class730.field2820 == null) {
                            class730.field2820 = "Null";
                        }

                        class730.field2735 = var41.field953 + class56.method1545(16777215, -1652576288);
                    }
                } else {
                    if (15 == var6) {
                        Player var43 = class730.loaded[var7];
                        if (var43 != null) {
                            class544.method2369(class191.method3721(var43.field4085[0], var43.field4055[0], var43.method2550(), var43.method2550(), 0, (byte) -81));
                            class730.field2765 = var1;
                            class730.field2766 = var2;
                            class730.field2729 = 2;
                            class730.field2767 = 0;
                            var45 = class637.method5936(class643.field10035, class730.field2692.field7765, (byte) 92);
                            var45.field3364.method6362(class730.field2888, 16711935);
                            var45.field3364.method6362(var7, 16711935);
                            var45.field3364.method6408(class543.field3820);
                            var45.field3364.method6400(class730.field2818);
                            var45.field3364.method6415(class980.method1913(1486448273) ? 1 : 0, (byte) 1);
                            class730.field2692.method4380(var45, (byte) -120);
                            class133.method998(var43.field4085[0], var43.field4055[0], true, class191.method3721(var43.field4085[0], var43.field4055[0], var43.method2550(), var43.method2550(), 0, (byte) -81), -1518106468);
                        }
                    }

                    if (var6 == 60) {
                        if (class730.field2790 > 0 && class123.method1634(838408640)) {
                            class439.method4280(class923.local.field3639, var10.baseX + var4, var10.baseY + var5, 1886787992);
                        } else {
                            class730.field2765 = var1;
                            class730.field2766 = var2;
                            class730.field2729 = 1;
                            class730.field2767 = 0;
                            class701 var44 = class637.method5936(class643.field10019, class730.field2692.field7765, (byte) 98);
                            var44.field3364.method6362(var10.baseY + var5, 16711935);
                            var44.field3364.method6419(var10.baseX + var4);
                            class730.field2692.method4380(var44, (byte) -43);
                        }
                    }

                    if (class730.field2817) {
                        class422.method5724((byte) 4);
                    }

                    if (class35.field5345 != null && class730.field2769 == 0) {
                        class814.method2932(class35.field5345, 1534658392);
                    }
                }
            }

        } catch (RuntimeException var25) {
            throw class158.method3445(var25, "qq.bs(" + ')');
        }
    }

    static final void method6464(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class881.field10143;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "qq.aho(" + ')');
        }
    }

    public int method89(int var1) {
        try {
            return this.field10409;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "qq.f(" + ')');
        }
    }
}
