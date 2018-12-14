public class class756 {
    static int field4320 = 32768;
    static int field4321 = 1;
    public int field4322 = 0;
    public int field4324 = 0;
    class180 field4323;
    class180 field4325;
    class1 field4326 = new class1(64);
    class821 field4327 = null;

    public class756(class423 var1, class180 var2, class180 var3, class821 var4) {
        this.field4325 = var2;
        this.field4323 = var3;
        this.field4327 = var4;
        if (this.field4325 != null) {
            this.field4322 = this.field4325.method3286(1, -331738803);
        }

        if (this.field4323 != null) {
            this.field4324 = this.field4323.method3286(1, 1090973479);
        }

    }

    public static int method2714(int var0, int var1, byte var2) {
        try {
            int var3;
            for (var3 = 0; var1 > 0; --var1) {
                var3 = var3 << 1 | var0 & 1;
                var0 >>>= 1;
            }

            return var3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ti.u(" + ')');
        }
    }

    static void method2715(class848 var0, class478 var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            if (class740.field3198 < 100) {
                class423.method5713(var0, var1, (byte) -95);
            }

            var0.method4986(var2, var3, var2 + var4, var5 + var3);
            int var8;
            int var9;
            if (class740.field3198 < 100) {
                byte var7 = 20;
                var8 = var2 + var4 / 2;
                var9 = var5 / 2 + var3 - 18 - var7;
                var0.method4984(var2, var3, var4, var5, -16777216, 0);
                var0.method4838(var8 - 152, var9, 304, 34, class730.field2682[class730.field2953].getRGB(), 0);
                var0.method4984(var8 - 150, var9 + 2, class740.field3198 * 3, 30, class730.field2670[class730.field2953].getRGB(), 0);
                class501.field3182.method1681(class814.field4812.method2927(class321.field1066, -875414210), var8, var9 + var7, class730.field2672[class730.field2953].getRGB(), -1, -863370132);
            } else {
                int var18 = class896.field9358 - (int) ((float) var4 / class491.field7808);
                var8 = class747.field4148 + (int) ((float) var5 / class491.field7808);
                var9 = (int) ((float) var4 / class491.field7808) + class896.field9358;
                int var10 = class747.field4148 - (int) ((float) var5 / class491.field7808);
                class596.field2146 = class896.field9358 - (int) ((float) var4 / class491.field7808);
                class510.field4165 = class747.field4148 - (int) ((float) var5 / class491.field7808);
                class740.field3199 = (int) ((float) (2 * var4) / class491.field7808);
                class162.field6603 = (int) ((float) (var5 * 2) / class491.field7808);
                class740.method4416(var18 + class491.field7820, var8 + class491.field7813, class491.field7820 + var9, var10 + class491.field7813, var2, var3, var4 + var2, 1 + var3 + var5);
                class740.method4405(var0);
                class373 var11 = class740.method4409(var0);
                class335.method41(var0, var11, 0, 0, 1029726200);
                if (class10.field6652 > 0) {
                    --class622.field9010;
                    if (class622.field9010 == 0) {
                        --class10.field6652;
                        class622.field9010 = 20;
                    }
                }

                if (class730.field2648) {
                    int var12 = var2 + var4 - 5;
                    int var13 = var5 + var3 - 8;
                    class958.field3479.method1662("Fps:" + class69.field1807, var12, var13, 16776960, -1, (byte) -35);
                    var13 -= 15;
                    Runtime var14 = Runtime.getRuntime();
                    int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
                    int var16 = 16776960;
                    if (var15 > 65536) {
                        var16 = 16711680;
                    }

                    class958.field3479.method1662("Mem:" + var15 + "k", var12, var13, var16, -1, (byte) -2);
                    var13 -= 15;
                }
            }

        } catch (RuntimeException var17) {
            throw class158.method3445(var17, "ti.bv(" + ')');
        }
    }

    static class327 method2716(class180 var0, int var1, int var2, int var3) {
        try {
            InputStream var4 = new InputStream(var0.method3285(var1, var2, (byte) 3));
            class327 var5 = new class327(var2, var4.method6379(-1014876746), var4.method6379(-346433981), var4.method6420((byte) -81), var4.method6420((byte) 27), var4.method6371() == 1, var4.method6371(), var4.method6371());
            int var6 = var4.method6371();

            for (int var7 = 0; var7 < var6; ++var7) {
                var5.field15.method897(new class542(var4.method6371(), var4.method6374(), var4.method6374(), var4.method6374(), var4.method6374(), var4.method6374(), var4.method6374(), var4.method6374(), var4.method6374()), 2080542038);
            }

            var5.method8(955144381);
            return var5;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "ti.k(" + ')');
        }
    }

    String method2712(class103 var1, int[] var2, long var3) {
        try {
            if (this.field4327 != null) {
                String var5 = this.field4327.method2994(var1, var2, var3);
                if (var5 != null) {
                    return var5;
                }
            }

            return Long.toString(var3);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ti.f(" + ')');
        }
    }

    public class282 method2713(int var1, short var2) {
        try {
            class282 var3 = (class282) this.field4326.method2974((long) var1);
            if (var3 != null) {
                return var3;
            } else {
                byte[] var4;
                if (var1 >= 32768) {
                    var4 = this.field4323.method3285(1, var1 & 32767, (byte) -26);
                } else {
                    var4 = this.field4325.method3285(1, var1, (byte) -31);
                }

                var3 = new class282();
                var3.field10615 = this;
                if (var4 != null) {
                    var3.method6649(new InputStream(var4), 1219453152);
                }

                if (var1 >= 32768) {
                    var3.method6648(-877048074);
                }

                this.field4326.method2984(var3, (long) var1);
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ti.a(" + ')');
        }
    }
}
