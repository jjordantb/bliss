public class class874 {
    public static int field9778 = 8191;
    public class873 field9777 = new class873();

    public static class900 method5850(int var0, byte var1) {
        try {
            class900[] var2 = class877.method5926((byte) 6);

            for (int var3 = 0; var3 < var2.length; ++var3) {
                class900 var4 = var2[var3];
                if (var0 == var4.field10373) {
                    return var4;
                }
            }

            return null;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "cu.f(" + ')');
        }
    }

    public static void method5851(boolean var0, int var1) {
        try {
            class615.field8903.method5391(class615.field8903.field9130, 1, -88613435);
            class615.field8903.method5391(class615.field8903.field9131, 1, -1737662716);
            class615.field8903.method5391(class615.field8903.field9113, 0, -1276472095);
            class615.field8903.method5391(class615.field8903.field9122, 0, 1091201372);
            class615.field8903.method5391(class615.field8903.field9139, 0, 768834217);
            class615.field8903.method5391(class615.field8903.field9135, 0, -439702695);
            class615.field8903.method5391(class615.field8903.field9121, 0, 574040425);
            class615.field8903.method5391(class615.field8903.field9127, 0, 225296186);
            class615.field8903.method5391(class615.field8903.field9147, 0, -333444087);
            class615.field8903.method5391(class615.field8903.field9123, 0, 588304620);
            class615.field8903.method5391(class615.field8903.field9126, 0, -1305346186);
            class615.field8903.method5391(class615.field8903.field9138, 0, -1914273282);
            class615.field8903.method5391(class615.field8903.field9115, 0, -1475894438);
            class615.field8903.method5391(class615.field8903.field9116, 0, -502768695);
            class615.field8903.method5391(class615.field8903.field9129, 0, 474163397);
            class615.field8903.method5391(class615.field8903.field9124, class157.field6552.field6556, -782084930);
            class615.field8903.method5391(class615.field8903.field9117, 0, 302731106);
            class615.field8903.method5391(class615.field8903.field9133, 0, 1005723133);
            class308.method382(1113089752);
            class615.field8903.method5391(class615.field8903.field9132, 2, 55764026);
            class615.field8903.method5391(class615.field8903.field9142, 1, 777762630);
            class362.method1508(-982122818);
            class730.field2697.method5282((byte) 2).method5673(-338889856);
            class730.field2657 = true;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "cu.r(" + ')');
        }
    }

    public static class45 method5852(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            if (class615.field8903.field9119.method2717(-2146999869) != 0 && var1 != 0 && class540.field3926 < 50 && var0 != -1) {
                class45 var7 = new class45((byte) 1, var0, var1, var2, var3, var4, var5, (Interactable) null);
                class540.field3927[++class540.field3926 - 1] = var7;
                return var7;
            } else {
                return null;
            }
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "cu.s(" + ')');
        }
    }

    static class103[] method5853(int var0) {
        try {
            return new class103[]{class103.field194, class103.field204, class103.field200, class103.field199, class103.field197, class103.field189, class103.field202, class103.field196, class103.field198, class103.field187, class103.field192, class103.field188, class103.field193, class103.field195};
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "cu.a(" + ')');
        }
    }

    static final void method5854(class744 var0, int var1) {
        try {
            int var2 = var0.field3174[var0.field3176];
            var0.field3161[++var0.field3156 - 1] = ((Npc) var0.field3159).field1634.method4030(var2, (byte) -36);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "cu.ad(" + ')');
        }
    }

    static final void method5855(class744 var0, int var1) {
        try {
            var0.field3158 -= 2;
            String var2 = (String) var0.field3157[var0.field3158];
            String var3 = (String) var0.field3157[var0.field3158 + 1];
            class727.method1682(var2, var3, 1069612159);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "cu.ahk(" + ')');
        }
    }

    public static void method5856(int var0, String var1, int var2) {
        try {
            int var3 = class498.field8102;
            int[] var4 = class498.field8108;
            boolean var5 = false;

            for (int var6 = 0; var6 < var3; ++var6) {
                Player var7 = class730.loaded[var4[var6]];
                if (var7 != null && class923.local != var7 && var7.field3374 != null && var7.field3374.equalsIgnoreCase(var1)) {
                    class643 var8 = null;
                    if (var0 == 1) {
                        var8 = class643.field9980;
                    } else if (4 == var0) {
                        var8 = class643.field9947;
                    } else if (var0 == 5) {
                        var8 = class643.field10007;
                    } else if (6 == var0) {
                        var8 = class643.field9979;
                    } else if (7 == var0) {
                        var8 = class643.field9993;
                    } else if (9 == var0) {
                        var8 = class643.field9986;
                    }

                    if (var8 != null) {
                        class701 var9 = class637.method5936(var8, class730.field2692.field7765, (byte) 102);
                        var9.field3364.method6361(0);
                        var9.field3364.method6400(var4[var6]);
                        class730.field2692.method4380(var9, (byte) -127);
                    }

                    var5 = true;
                    break;
                }
            }

            if (!var5) {
                class727.method1683(4, class814.field4727.method2927(class321.field1066, -875414210) + var1, (byte) -70);
            }

        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "cu.ki(" + ')');
        }
    }

    static int method5857(Widget var0, int var1, int var2) {
        try {
            if (!class730.method1761(var0).method1743(var1, (byte) -58) && var0.field989 == null) {
                return -1;
            } else {
                return var0.field956 != null && var0.field956.length > var1 ? var0.field956[var1] : -1;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "cu.mb(" + ')');
        }
    }

    public static boolean method5858(int var0) {
        try {
            try {
                if (class818.field4611 == 2) {
                    if (class775.field3700 == null) {
                        class775.field3700 = class137.method958(class818.field4621, class818.field4622, class818.field4623);
                        if (class775.field3700 == null) {
                            return false;
                        }
                    }

                    if (class654.field9350 == null) {
                        class654.field9350 = new class111(class818.field4613, class818.field4612);
                    }

                    class272 var1 = class818.field4614;
                    if (class818.field4625 != null) {
                        var1 = class818.field4625;
                    }

                    if (var1.method6562(class775.field3700, class818.field4624, class654.field9350, 22050, -1561598857)) {
                        class818.field4614 = var1;
                        class818.field4614.method6563(-389032580);
                        int var2;
                        if (class916.field10417 > 0) {
                            class818.field4611 = 3;
                            class818.field4614.method6568(class916.field10417 > class818.field4616 ? class818.field4616 * -2102749749 * 643426275 : 604206485 * class916.field10417 * -420794947, 1723899960);

                            for (var2 = 0; var2 < class639.field9810.length; ++var2) {
                                class818.field4614.method6561(var2, class639.field9810[var2], -1005144329);
                                class639.field9810[var2] = 255;
                            }
                        } else {
                            class818.field4611 = 0;
                            class818.field4614.method6568(class818.field4616, 1701699390);

                            for (var2 = 0; var2 < class639.field9810.length; ++var2) {
                                class818.field4614.method6561(var2, class639.field9810[var2], 195931719);
                                class639.field9810[var2] = 255;
                            }
                        }

                        if (class818.field4625 == null) {
                            if (class613.field8894 > 0L) {
                                class818.field4614.method6586(class775.field3700, class342.field294, true, class613.field8894);
                            } else {
                                class818.field4614.method6565(class775.field3700, class342.field294, (byte) 22);
                            }

                            if (class166.field6898 != null) {
                                class166.field6898.method5196(983998013);
                            }
                        }

                        if (class818.field4615 != null) {
                            class818.field4615.method2625(class818.field4614, 1142164638);
                        }

                        class775.field3700 = null;
                        class654.field9350 = null;
                        class818.field4621 = null;
                        class613.field8894 = 0L;
                        class818.field4625 = null;
                        class166.field6898 = null;
                        boolean var3 = true;
                        return var3;
                    }
                }
            } catch (Exception var4) {
                var4.printStackTrace();
                class818.field4614.method6566((byte) 10);
                class182.method3307(-1412773251);
            }

            return false;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "cu.t(" + ')');
        }
    }

    static final void method5859(class744 var0, int var1) {
        try {
            class935.method6309(1193411158);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "cu.agq(" + ')');
        }
    }
}
