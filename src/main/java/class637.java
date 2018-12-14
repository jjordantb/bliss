public class class637 {
    static int field9857;
    int field9846;
    float field9847 = 1.0F;
    int field9848;
    int field9849;
    float field9850 = 1.0F;
    int field9851;
    float field9852;
    int field9853;
    int field9854;
    int field9855;
    int field9856;

    class637(int var1, float var2, float var3, int var4, int var5, int var6) {
        this.field9856 = var1;
        this.field9847 = var2;
        this.field9850 = var3;
        this.field9849 = var4;
        this.field9846 = var5;
        this.field9851 = var6;
    }

    class637(int var1) {
        this.field9856 = var1;
    }

    static final void method5934(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            if (var0.field3161[var0.field3156] <= var0.field3161[1 + var0.field3156]) {
                var0.field3176 += var0.field3174[var0.field3176];
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "as.ai(" + ')');
        }
    }

    static String method5935(int var0, int var1, byte var2) {
        try {
            int var3 = var1 - var0;
            if (var3 < -9) {
                return class56.method1545(16711680, -1412514938);
            } else if (var3 < -6) {
                return class56.method1545(16723968, -1450525850);
            } else if (var3 < -3) {
                return class56.method1545(16740352, -1831141729);
            } else if (var3 < 0) {
                return class56.method1545(16756736, -1637160945);
            } else if (var3 > 9) {
                return class56.method1545(65280, -1407228246);
            } else if (var3 > 6) {
                return class56.method1545(4259584, -1287123002);
            } else if (var3 > 3) {
                return class56.method1545(8453888, -1329263745);
            } else {
                return var3 > 0 ? class56.method1545(12648192, -1738690779) : class56.method1545(16776960, -1985964349);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "as.bg(" + ')');
        }
    }

    public static class701 method5936(class643 var0, class246 var1, byte var2) {
        try {
            class701 var3 = class339.method136((byte) 56);
            var3.field3369 = var0;
            var3.field3365 = var0.field10034;
            if (-1 == var3.field3365) {
                var3.field3364 = new class513(260);
            } else if (var3.field3365 == -2) {
                var3.field3364 = new class513(10000);
            } else if (var3.field3365 <= 18) {
                var3.field3364 = new class513(20);
            } else if (var3.field3365 <= 98) {
                var3.field3364 = new class513(100);
            } else {
                var3.field3364 = new class513(260);
            }

            var3.field3364.method2649(var1, (byte) 74);
            var3.field3364.method2651(var3.field3369.field10018, (byte) -23);
            var3.field3367 = 0;
            return var3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "as.f(" + ')');
        }
    }

    static final void method5937(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class818.method2904(var3, var4, var0, -1849275031);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "as.em(" + ')');
        }
    }

    static final void method5938(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            String var4 = (String) var0.field3157[--var0.field3158];
            if (99 == var2) {
                class213.method3810(var4, 1242487535);
            } else if (var2 == 98) {
                class252.method4422(var4, -1177455078);
            } else {
                class702.method1969(var2, var3, "", "", "", var4, -541387718);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "as.sy(" + ')');
        }
    }

    public static void method5939(String var0, String var1, int var2, boolean var3, int var4) {
        try {
            if (class730.field2733 == 8) {
                class701 var5 = method5936(class643.field10009, class730.field2674.field7765, (byte) 19);
                var5.field3364.method6362(0, 16711935);
                int var6 = var5.field3364.field10376;
                var5.field3364.method6366(var0, 2138689470);
                var5.field3364.method6366(var1, 2115793947);
                var5.field3364.method6361(var2);
                var5.field3364.method6361(var3 ? 1 : 0);
                var5.field3364.field10376 += 7;
                var5.field3364.method6388(class861.field9024, var6, var5.field3364.field10376, -1325657598);
                var5.field3364.method6369(var5.field3364.field10376 - var6, 1585504133);
                class730.field2674.method4380(var5, (byte) -20);
                if (var2 < 13) {
                    class730.field2661 = true;
                    class806.method2842((byte) 12);
                }

                class739.field2999 = class162.field6589;
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "as.i(" + ')');
        }
    }

    class637 method5932(int var1) {
        try {
            return new class637(this.field9856, this.field9847, this.field9850, this.field9849, this.field9846, this.field9851);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "as.a(" + ')');
        }
    }

    void method5933(class637 var1, int var2) {
        try {
            this.field9847 = var1.field9847;
            this.field9850 = var1.field9850;
            this.field9849 = var1.field9849;
            this.field9846 = var1.field9846;
            this.field9856 = var1.field9856;
            this.field9851 = var1.field9851;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "as.f(" + ')');
        }
    }
}
