public class class740 extends class491 {
    public static int field3198 = 0;
    public static int field3199;
    public static boolean field3209 = false;
    public static NodeTable field3210 = new NodeTable(8);
    public static NodeTable field3211 = new NodeTable(8);
    public static boolean field3214 = true;
    static int field3197 = -1;
    static int field3200 = -1;
    static int field3201 = -1;
    static boolean field3202 = false;
    static int field3203 = -1;
    static int field3204 = -1;
    static boolean field3205 = false;
    static int field3206 = -1;
    static int field3207 = -1;
    static class19 field3208 = new class19(new class373());
    static String[] field3212 = new String[5];
    static int field3213;

    class740() throws Throwable {
        throw new Error();
    }

    static final void method1919(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
        try {
            var0.field909 = 1;
            var0.field876 = var2.field3161[--var2.field3156];
            class814.method2932(var0, 648135865);
            if (var0.field879 == -1 && !var1.closed) {
                class535.method2284(var0.field867, 1575385059);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "acu.dr(" + ')');
        }
    }

    public static void method1920(int var0, int var1, int var2, String var3, int var4) {
        try {
            Widget var5 = class554.method427(var1, var2, -156511736);
            if (var5 != null) {
                if (var5.field989 != null) {
                    class202 var6 = new class202();
                    var6.field7578 = var5;
                    var6.field7581 = var0;
                    var6.field7576 = var3;
                    var6.field7583 = var5.field989;
                    class408.method5470(var6, (byte) -29);
                }

                if (class730.method1761(var5).method1743(var0 - 1, (byte) -25)) {
                    class684 var11 = class423.method5712((short) 512);
                    if (class730.field2733 == 14 || class730.field2733 == 0) {
                        int var7 = var1 >> 16;
                        int var8 = var1 - (var7 << 16);
                        if (var7 == 746 && (var8 == 78 || var8 == 102)) {
                            field3214 = true;
                        } else if (var7 == 746) {
                            field3214 = false;
                        }

                        if ((var7 == 762 || var7 == 679) && class730.field2618) {
                            switch (var0) {
                                case 1:
                                    var0 = 8;
                                    break;
                                case 2:
                                    var0 = 1;
                                    break;
                                case 3:
                                    var0 = 2;
                                case 4:
                                case 5:
                                case 6:
                                default:
                                    break;
                                case 7:
                                    var0 = 3;
                                    break;
                                case 8:
                                    var0 = 7;
                            }
                        }

                        class701 var9;
                        if (var0 == 1) {
                            var9 = class637.method5936(class643.field9944, var11.field7765, (byte) 40);
                            class176.method3167(var9, var1, var2, var5.field1005, -1695827903);
                            var11.method4380(var9, (byte) -4);
                        }

                        if (var0 == 2) {
                            var9 = class637.method5936(class643.field9997, var11.field7765, (byte) 73);
                            class176.method3167(var9, var1, var2, var5.field1005, 1169430348);
                            var11.method4380(var9, (byte) -80);
                        }

                        if (var0 == 3) {
                            var9 = class637.method5936(class643.field9991, var11.field7765, (byte) 78);
                            class176.method3167(var9, var1, var2, var5.field1005, -1266676543);
                            var11.method4380(var9, (byte) -9);
                        }

                        if (4 == var0) {
                            var9 = class637.method5936(class643.field9985, var11.field7765, (byte) 31);
                            class176.method3167(var9, var1, var2, var5.field1005, -603023247);
                            var11.method4380(var9, (byte) -119);
                        }

                        if (5 == var0) {
                            var9 = class637.method5936(class643.field9930, var11.field7765, (byte) 30);
                            class176.method3167(var9, var1, var2, var5.field1005, -120093158);
                            var11.method4380(var9, (byte) -43);
                        }

                        if (var0 == 6) {
                            var9 = class637.method5936(class643.field9957, var11.field7765, (byte) 65);
                            class176.method3167(var9, var1, var2, var5.field1005, -206334631);
                            var11.method4380(var9, (byte) -32);
                        }

                        if (var0 == 7) {
                            var9 = class637.method5936(class643.field10020, var11.field7765, (byte) 62);
                            class176.method3167(var9, var1, var2, var5.field1005, 1351893071);
                            var11.method4380(var9, (byte) -81);
                        }

                        if (var0 == 8) {
                            var9 = class637.method5936(class643.field9936, var11.field7765, (byte) 74);
                            class176.method3167(var9, var1, var2, var5.field1005, 1834394135);
                            var11.method4380(var9, (byte) -56);
                        }

                        if (9 == var0) {
                            var9 = class637.method5936(class643.field10026, var11.field7765, (byte) 124);
                            class176.method3167(var9, var1, var2, var5.field1005, -1435192522);
                            var11.method4380(var9, (byte) -66);
                        }

                        if (var0 == 10) {
                            var9 = class637.method5936(class643.field9962, var11.field7765, (byte) 83);
                            class176.method3167(var9, var1, var2, var5.field1005, -87863525);
                            var11.method4380(var9, (byte) -62);
                        }
                    }
                }
            }

        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "acu.kp()");
        }
    }
}
