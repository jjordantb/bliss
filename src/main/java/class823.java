public class class823 {
    public static class420 field9045;
    public int field9043;
    class180 field9044;

    public class823(class469 var1, class423 var2, class180 var3) {
        new class1(64);
        this.field9044 = var3;
        this.field9043 = this.field9044.method3286(class981.field3231.field3271, -2127064505);
    }

    static final void method5361(class744 var0, int var1) {
        try {
            var0.field3156 -= 3;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            int var4 = var0.field3161[2 + var0.field3156];
            class362.method1505(var0.field3159.field4095, var2 & '\uffff', var3, var4, var0.field3178, var0, 2022077336);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "uz.aoo(" + ')');
        }
    }

    static final void method5362(boolean var0, int var1) {
        try {
            class513 var2 = class730.field2692.field7768;

            while (true) {
                if (var2.method2644(class730.field2692.field7771, (byte) -70) < 15) {
                    if (var1 == 596994841) {
                        return;
                    }
                    break;
                }

                int var3 = var2.method2647(15);
                if (32767 == var3) {
                    break;
                }

                boolean var4 = false;
                class437 var5 = (class437) class730.field2677.method2942((long) var3);
                Npc var6;
                if (var5 == null) {
                    var6 = new Npc(class730.field2697.method5317(-1611682495));
                    var6.field4028 = var3;
                    var5 = new class437(var6);
                    class730.field2677.method2947(var5, (long) var3);
                    class730.field2797[++class730.field2753 - 1] = var5;
                    var4 = true;
                }

                var6 = (Npc) var5.field7515;
                class730.field2680[++class730.field2684 - 1] = var3;
                var6.field4039 = class730.field2688;
                if (var6.field1637 != null && var6.field1637.method6112((byte) 88)) {
                    class153.method3396(var6, (byte) 40);
                }

                int var7 = var2.method2647(3) + 4 << 11 & 16383;
                int var8;
                if (var0) {
                    var8 = var2.method2647(8);
                    if (var8 > 127) {
                        var8 -= 256;
                    }
                } else {
                    var8 = var2.method2647(5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                }

                var6.method1248(class258.field7913.method12(var2.method2647(15), 229452067), 1407104224);
                int var9;
                if (var0) {
                    var9 = var2.method2647(8);
                    if (var9 > 127) {
                        var9 -= 256;
                    }
                } else {
                    var9 = var2.method2647(5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                }

                int var10 = var2.method2647(2);
                int var11 = var2.method2647(1);
                if (var11 == 1) {
                    class730.field2687[++class730.field2789 - 1] = var3;
                }

                int var12 = var2.method2647(1);
                var6.method2549(var6.field1637.field9923, -1253182390);
                var6.field4079 = var6.field1637.field9917 << 3;
                if (var4) {
                    var6.method2543(var7, true, -2079607043);
                }

                var6.method1240(var10, var9 + class923.local.field4085[0], var8 + class923.local.field4055[0], 1 == var12, var6.method2550(), (byte) 58);
                if (var6.field1637.method6112((byte) -9)) {
                    Animation.method3565(var6.field3639, var6.field4085[0], var6.field4055[0], 0, (ObjectDefinition) null, var6, (Player) null, (byte) -66);
                }
            }

            var2.method2648((byte) 38);
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "uz.jo(" + ')');
        }
    }

    static final void method5363(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class273.method6598((byte) -1);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "uz.acr(" + ')');
        }
    }

    public static void method5364(int var0, int var1) {
        try {
            class682 var2 = class370.method881(20, (long) var0);
            var2.method4336(-1607796466);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "uz.ax(" + ')');
        }
    }

    static void method5365(int var0, boolean var1, int var2) {
        try {
            class682 var3 = class370.method881(22, (long) var0);
            var3.method4340((byte) 61);
            var3.field7687 = var1 ? 1 : 0;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "uz.ai(" + ')');
        }
    }
}
