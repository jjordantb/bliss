public class class285 {
    public static class330 field10627;
    public int field10622;
    public int field10623;
    public int field10624;
    public int field10625;
    public int field10626;
    byte field10621;

    public class285(InputStream var1) {
        this.field10621 = var1.method6372(-12558881);
        this.field10622 = var1.method6374();
        this.field10623 = var1.method6420((byte) -69);
        this.field10624 = var1.method6420((byte) 31);
        this.field10625 = var1.method6420((byte) 13);
        this.field10626 = var1.method6420((byte) -44);
    }

    public class285() {
    }

    public static void method6659(byte var0) {
        try {
            class1 var1 = class365.field2449;
            synchronized (class365.field2449) {
                class365.field2449.method2977();
            }

            var1 = class365.field2450;
            synchronized (class365.field2450) {
                class365.field2450.method2977();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "km.n(" + ')');
        }
    }

    static char method6660(char var0, byte var1) {
        try {
            if ('Æ' == var0) {
                return 'E';
            } else if (var0 == 'æ') {
                return 'e';
            } else if (var0 == 'ß') {
                return 's';
            } else if ('Œ' == var0) {
                return 'E';
            } else {
                return (char) ('œ' == var0 ? 'e' : '\u0000');
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "km.b(" + ')');
        }
    }

    static final void method6661(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class396.method3500(var3, var4, var0, -1060016490);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "km.nj(" + ')');
        }
    }

    static final void method6662(class744 var0, int var1) {
        try {
            var0.field3156 -= 6;
            int var2 = var0.field3161[var0.field3156];
            if (var2 >= 2) {
                throw new RuntimeException();
            } else {
                class730.field2749 = var2;
                int var3 = var0.field3161[var0.field3156 + 1];
                if (var3 + 1 >= class730.field2748[class730.field2749].length >> 1) {
                    throw new RuntimeException();
                } else {
                    class730.field2751 = var3;
                    class730.field2839 = 0;
                    class730.field2834 = var0.field3161[var0.field3156 + 2];
                    class730.field2755 = var0.field3161[3 + var0.field3156];
                    int var4 = var0.field3161[4 + var0.field3156];
                    if (var4 >= 2) {
                        throw new RuntimeException();
                    } else {
                        class730.field2750 = var4;
                        int var5 = var0.field3161[5 + var0.field3156];
                        if (1 + var5 >= class730.field2748[class730.field2750].length >> 1) {
                            throw new RuntimeException();
                        } else {
                            class730.field2752 = var5;
                            class563.field1083 = 1;
                            class516.field4332 = -1;
                            class495.field8099 = -1;
                        }
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "km.agi(" + ')');
        }
    }

    static final void method6663(int var0, int var1, int var2, int var3, int var4) {
        try {
            int var5 = class730.field2765;
            int var6 = class730.field2766;
            class48 var7;
            if (1 == class730.field2729) {
                var7 = class974.field2983[class730.field2767 / 100];
                var7.method3128(var5 - 8, var6 - 8);
            }

            if (2 == class730.field2729) {
                var7 = class974.field2983[4 + class730.field2767 / 100];
                var7.method3128(var5 - 8, var6 - 8);
            }

        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "km.jr(" + ')');
        }
    }

    static final void method6664(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9123.method2273(var2, 1352882135);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "km.aor(" + ')');
        }
    }

    static final void method6665(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            class198.method3752(var0.field3161[var0.field3156], var0.field3161[1 + var0.field3156], 0, -1721946915);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "km.agz(" + ')');
        }
    }

    public int method6657(int var1) {
        try {
            return this.field10621 & 7;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "km.a(" + ')');
        }
    }

    public int method6658(byte var1) {
        try {
            return (this.field10621 & 8) == 8 ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "km.f(" + ')');
        }
    }
}
