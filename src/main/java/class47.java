public class class47 {
    boolean field5171;
    int field5172;
    byte field5173;
    short field5174;
    short field5175;
    byte field5176;
    short field5177;
    int field5178;

    class47(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11) {
        this.field5172 = var1;
        this.field5175 = (short) var5;
        this.field5177 = (short) var6;
        this.field5174 = (short) var7;
        this.field5176 = (byte) var8;
        this.field5173 = (byte) var9;
        this.field5171 = var10;
        this.field5178 = var11;
    }

    public static void method3085(int var0) {
        try {
            if (class302.field3768 != null) {
                class302.field3768.method122((byte) -63);
            }

            if (class12.field6680 != null) {
                while (true) {
                    try {
                        class12.field6680.join();
                        break;
                    } catch (InterruptedException var2) {
                        ;
                    }
                }
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "aq.y(" + ')');
        }
    }

    static final void method3086(class848 var0, int var1, int var2, int var3, int var4, int var5) {
        try {
            var0.method4986(var1, var2, var1 + var3, var2 + var4);
            var0.method4833(var1, var2, var3, var4, -16777216, (byte) 7);
            if (class740.field3198 >= 100) {
                float var6 = (float) class491.field7815 / (float) class491.field7814;
                int var7 = var3;
                int var8 = var4;
                if (var6 < 1.0F) {
                    var8 = (int) (var6 * (float) var3);
                } else {
                    var7 = (int) ((float) var4 / var6);
                }

                var1 += (var3 - var7) / 2;
                var2 += (var4 - var8) / 2;
                if (class77.field1516 == null || class77.field1516.method3106() != var3 || class77.field1516.method3108() != var4) {
                    class740.method4416(class491.field7820, class491.field7813 + class491.field7815, class491.field7820 + class491.field7814, class491.field7813, var1, var2, var7 + var1, var8 + var2);
                    class740.method4405(var0);
                    class77.field1516 = var0.method4856(var1, var2, var7, var8, false);
                }

                class77.field1516.method3128(var1, var2);
                int var9 = var7 * class740.field3199 / class491.field7814;
                int var10 = class162.field6603 * var8 / class491.field7815;
                int var11 = var1 + var7 * class596.field2146 / class491.field7814;
                int var12 = var8 + var2 - class510.field4165 * var8 / class491.field7815 - var10;
                int var13 = -1996554240;
                if (class469.field7320 == class730.field2926) {
                    var13 = -1996488705;
                }

                var0.method4984(var11, var12, var9, var10, var13, 1);
                var0.method4838(var11, var12, var9, var10, var13, 0);
                if (class10.field6652 > 0) {
                    int var14;
                    if (class622.field9010 > 50) {
                        var14 = 500 - class622.field9010 * 5;
                    } else {
                        var14 = class622.field9010 * 5;
                    }

                    for (class392 var15 = (class392) class491.field7811.method901(1766612795); var15 != null; var15 = (class392) class491.field7811.method906(49146)) {
                        class718 var16 = class491.field7826.method5091(var15.field5396, -1892291274);
                        if (class517.method2719(var16, 1502593597)) {
                            int var17;
                            int var18;
                            if (class740.field3207 == var15.field5396) {
                                var17 = var7 * var15.field5395 / class491.field7814 + var1;
                                var18 = var2 + (class491.field7815 - var15.field5398) * var8 / class491.field7815;
                                var0.method4833(var17 - 2, var18 - 2, 4, 4, var14 << 24 | 16776960, (byte) 7);
                            } else if (-1 != class740.field3204 && var16.field3532 == class740.field3204) {
                                var17 = var1 + var15.field5395 * var7 / class491.field7814;
                                var18 = var8 * (class491.field7815 - var15.field5398) / class491.field7815 + var2;
                                var0.method4833(var17 - 2, var18 - 2, 4, 4, var14 << 24 | 16776960, (byte) 7);
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var19) {
            throw class158.method3445(var19, "aq.br(" + ')');
        }
    }

    public static class262 method3087(int var0, int var1, int var2) {
        try {
            class262 var3 = new class262();
            var3.field8179 = -1;
            var3.field8180 = -1;
            var3.field8181 = 1 + var0 + 5;
            var3.field8182 = 5 + var1 + 1;
            var3.field8183 = new int[var3.field8181][var3.field8182];
            var3.method4517(-1639552658);
            return var3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aq.a(" + ')');
        }
    }
}
