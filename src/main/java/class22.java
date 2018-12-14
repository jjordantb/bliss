import java.io.File;
import java.io.IOException;

public class class22 {
    int field6430;
    class15 field6431;
    int field6432;
    int field6433;
    int field6434;
    int field6435;

    class22(InputStream var1) {
        this.field6430 = var1.method6423(1235052657);
        this.field6431 = (class15) class367.method1565(class351.method1227(114624527), var1.method6371(), (byte) 2);
    }

    public static class439 method3434(String var0, String var1, boolean var2, int var3) {
        try {
            File var4 = new File(class69.field1840, "preferences" + var0 + ".dat");
            if (var4.exists()) {
                label49:
                {
                    class439 var14;
                    try {
                        class439 var13 = new class439(var4, "rw", 10000L);
                        var14 = var13;
                    } catch (IOException var11) {
                        break label49;
                    }

                    return var14;
                }
            }

            String var6 = "";
            if (33 == class971.field2987) {
                var6 = "_rc";
            } else if (class971.field2987 == 34) {
                var6 = "_wip";
            }

            File var5 = new File(class323.field631, "matrix_" + var1 + "_preferences" + var0 + var6 + ".dat");
            class439 var7;
            class439 var8;
            if (!var2 && var5.exists()) {
                label41:
                {
                    try {
                        var7 = new class439(var5, "rw", 10000L);
                        var8 = var7;
                    } catch (IOException var10) {
                        break label41;
                    }

                    return var8;
                }
            }

            try {
                var7 = new class439(var4, "rw", 10000L);
                var8 = var7;
            } catch (IOException var9) {
                throw new RuntimeException();
            }

            return var8;
        } catch (RuntimeException var12) {
            throw class158.method3445(var12, "dm.u(" + ')');
        }
    }

    static class346 method3435(class112 var0, int var1, int var2, int var3) {
        try {
            int var4 = var0.field2129 | var1 << 10;
            class346 var5 = (class346) class966.field2520.method3070((long) var4 << 16);
            if (var5 != null) {
                return var5;
            } else {
                byte[] var6 = class969.field2496.method3264(class969.field2496.method3269(var4, 63686679), (byte) 22);
                if (var6 != null) {
                    if (var6.length <= 1) {
                        return null;
                    } else {
                        try {
                            var5 = class78.method1125(var6, (byte) 16);
                        } catch (Exception var8) {
                            throw new RuntimeException(var8.getMessage() + " " + var4);
                        }

                        var5.field176 = var0;
                        class966.field2520.method3072(var5, (long) var4 << 16);
                        return var5;
                    }
                } else {
                    var4 = var0.field2129 | var2 + 65536 << 10;
                    var5 = (class346) class966.field2520.method3070((long) var4 << 16);
                    if (var5 != null) {
                        return var5;
                    } else {
                        var6 = class969.field2496.method3264(class969.field2496.method3269(var4, 63686679), (byte) 82);
                        if (var6 != null) {
                            if (var6.length <= 1) {
                                return null;
                            } else {
                                try {
                                    var5 = class78.method1125(var6, (byte) 16);
                                } catch (Exception var9) {
                                    throw new RuntimeException(var9.getMessage() + " " + var4);
                                }

                                var5.field176 = var0;
                                class966.field2520.method3072(var5, (long) var4 << 16);
                                return var5;
                            }
                        } else {
                            var4 = var0.field2129 | 67107840;
                            var5 = (class346) class966.field2520.method3070((long) var4 << 16);
                            if (var5 != null) {
                                return var5;
                            } else {
                                var6 = class969.field2496.method3264(class969.field2496.method3269(var4, 63686679), (byte) 52);
                                if (var6 != null) {
                                    if (var6.length <= 1) {
                                        return null;
                                    } else {
                                        try {
                                            var5 = class78.method1125(var6, (byte) 16);
                                        } catch (Exception var10) {
                                            throw new RuntimeException(var10.getMessage() + " " + var4);
                                        }

                                        var5.field176 = var0;
                                        class966.field2520.method3072(var5, (long) var4 << 16);
                                        return var5;
                                    }
                                } else {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "dm.b(" + ')');
        }
    }

    public static int method3436(int var0, byte var1) {
        try {
            double var2 = (double) (var0 >> 16 & 255) / 256.0D;
            double var4 = (double) (var0 >> 8 & 255) / 256.0D;
            double var6 = (double) (var0 & 255) / 256.0D;
            double var8 = var2;
            if (var4 < var2) {
                var8 = var4;
            }

            if (var6 < var8) {
                var8 = var6;
            }

            double var10 = var2;
            if (var4 > var2) {
                var10 = var4;
            }

            if (var6 > var10) {
                var10 = var6;
            }

            double var12 = 0.0D;
            double var14 = 0.0D;
            double var16 = (var10 + var8) / 2.0D;
            if (var10 != var8) {
                if (var16 < 0.5D) {
                    var14 = (var10 - var8) / (var8 + var10);
                }

                if (var16 >= 0.5D) {
                    var14 = (var10 - var8) / (2.0D - var10 - var8);
                }

                if (var2 == var10) {
                    var12 = (var4 - var6) / (var10 - var8);
                } else if (var4 == var10) {
                    var12 = (var6 - var2) / (var10 - var8) + 2.0D;
                } else if (var6 == var10) {
                    var12 = 4.0D + (var2 - var4) / (var10 - var8);
                }
            }

            var12 /= 6.0D;
            int var18 = (int) (256.0D * var12);
            int var19 = (int) (var14 * 256.0D);
            int var20 = (int) (256.0D * var16);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }

            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }

            if (var20 > 243) {
                var19 >>= 4;
            } else if (var20 > 217) {
                var19 >>= 3;
            } else if (var20 > 192) {
                var19 >>= 2;
            } else if (var20 > 179) {
                var19 >>= 1;
            }

            return ((var18 & 255) >> 2 << 10) + (var19 >> 5 << 7) + (var20 >> 1);
        } catch (RuntimeException var22) {
            throw class158.method3445(var22, "dm.r(" + ')');
        }
    }

    static final void method3437(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = var0.field3169.field9715;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "dm.xo(" + ')');
        }
    }

    static void method3438(String var0, String var1, short var2) {
        try {
            class881.field10140 = 264;
            class881.field10177 = class730.field2692;
            class521.method2751(false, false, var0, var1, -1L);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "dm.t(" + ')');
        }
    }

    public static void method3439(int var0, int var1, int var2, int var3) {
        try {
            if (class800.field4577 != null && class800.field4577.method2920((byte) 74) && class800.field4577.field4651 == var0) {
                class115.method1272(class800.field4577, var1, (byte) 20);
                class540.field3920 = var0;
                class800.field4577 = null;
                class508.field3967 = null;
                class701 var4 = class637.method5936(class643.field9941, class730.field2692.field7765, (byte) 49);
                var4.field3364.method6364(-1, -735665420);
                class730.field2692.method4380(var4, (byte) -21);
            } else {
                var1 = var1 * class615.field8903.field9150.method2717(-2143915756) >> 8;
                if (var0 == -1 && !class540.field3921) {
                    class809.method2888((byte) -85);
                } else if (-1 != var0 && (class540.field3920 != var0 || !class396.method3499(-861777344)) && var1 != 0 && !class540.field3921) {
                    class71.method1087(var2, class771.field3732, var0, 0, var1, false, new class700(), (byte) -36);
                    class228.method4589(-1484268589);
                }

                if (class540.field3920 != var0) {
                    class508.field3967 = null;
                }

                class540.field3920 = var0;
                class540.field3928 = null;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "dm.g(" + ')');
        }
    }

    void method3431(byte var1) {
        try {
            class965.method1716(this.field6432, this.field6433, this.field6434, this.field6431.field6923, -1, this.field6431.field6921, this.field6435, -694910012);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "dm.f(" + ')');
        }
    }

    boolean method3432(byte var1) {
        try {
            if (this.field6430 < 0) {
                return true;
            } else {
                ObjectDefinition var2 = class972.field2965.getObjectDefinition(this.field6430);
                boolean var3 = var2.method1481(this.field6431.field6921, (byte) 42);
                int[] var4 = var2.method1492(-1156078162);
                if (var4 != null) {
                    int[] var5 = var4;

                    for (int var6 = 0; var6 < var5.length; ++var6) {
                        int var7 = var5[var6];
                        var3 &= class936.field10313.method2256(var7, (byte) -42).method3561(714689881);
                    }
                }

                return var3;
            }
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "dm.b(" + ')');
        }
    }

    void method3433(int var1, int var2, int var3, int var4, byte var5) {
        try {
            class965.method1716(var1, var2, var3, this.field6431.field6923, this.field6430, this.field6431.field6921, var4, -392910268);
            this.field6432 = var1;
            this.field6433 = var2;
            this.field6434 = var3;
            this.field6435 = var4;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "dm.a(" + ')');
        }
    }
}
