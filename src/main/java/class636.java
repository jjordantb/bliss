public class class636 {
    public char field9815;
    public int field9816 = 0;

    static final void method5911(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            var0.field3161[++var0.field3156 - 1] = var3.field879;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "is.pr(" + ')');
        }
    }

    public static boolean method5912(int var0, byte var1) {
        try {
            return var0 >= class15.field6916.field6921 && var0 <= class15.field6914.field6921;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "is.u(" + ')');
        }
    }

    static int method5913(class471 var0, class471 var1, int var2, boolean var3, int var4) {
        try {
            int var5;
            int var6;
            if (1 == var2) {
                var5 = var0.field3472;
                var6 = var1.field3472;
                if (!var3) {
                    if (-1 == var5) {
                        var5 = 2001;
                    }

                    if (var6 == -1) {
                        var6 = 2001;
                    }
                }

                return var5 - var6;
            } else if (var2 == 2) {
                return class822.method5367(var0.method4615(1486003850).field5347, var1.method4615(1779443598).field5347, class321.field1066, -1018238154);
            } else if (3 == var2) {
                if (var0.field8237.equals("-")) {
                    if (var1.field8237.equals("-")) {
                        return 0;
                    } else {
                        return var3 ? -1 : 1;
                    }
                } else if (var1.field8237.equals("-")) {
                    return var3 ? 1 : -1;
                } else {
                    return class822.method5367(var0.field8237, var1.field8237, class321.field1066, -1275230374);
                }
            } else if (var2 == 4) {
                return var0.method2052(-963368374) ? (var1.method2052(740881863) ? 0 : 1) : (var1.method2052(229552705) ? -1 : 0);
            } else if (var2 == 5) {
                return var0.method2050((byte) -26) ? (var1.method2050((byte) 52) ? 0 : 1) : (var1.method2050((byte) -31) ? -1 : 0);
            } else if (var2 == 6) {
                return var0.method2051(1077942153) ? (var1.method2051(1938157273) ? 0 : 1) : (var1.method2051(807716549) ? -1 : 0);
            } else if (var2 == 7) {
                return var0.method2053(1154945223) ? (var1.method2053(1235018049) ? 0 : 1) : (var1.method2053(2089010141) ? -1 : 0);
            } else if (var2 == 8) {
                var5 = var0.field8238;
                var6 = var1.field8238;
                if (var3) {
                    if (1000 == var5) {
                        var5 = -1;
                    }

                    if (1000 == var6) {
                        var6 = -1;
                    }
                } else {
                    if (var5 == -1) {
                        var5 = 1000;
                    }

                    if (var6 == -1) {
                        var6 = 1000;
                    }
                }

                return var5 - var6;
            } else {
                return var0.field8235 - var1.field8235;
            }
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "is.q(" + ')');
        }
    }

    static final void method5914(class744 var0, byte var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class646.method5506(var3, var4, var0, -1691554468);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "is.fk(" + ')');
        }
    }

    public static String method5915(MenuItem var0, int var1) {
        try {
            if (!class602.field8645 && var0 != null) {
                int[] var2 = class166.method3683(var0, (byte) 10);
                return var2 == null ? "" : class82.method918(var2, (byte) 1);
            } else {
                return "";
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "is.af(" + ')');
        }
    }

    static final void method5916(class744 var0, short var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            class295.method6520(var2, var3 >> 14 & 16383, var3 & 16383, true, 1858886715);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "is.aer(" + ')');
        }
    }

    static final void method5917(class744 var0, byte var1) {
        try {
            if (class86.field1134.field3046 < 6) {
                var0.field3161[++var0.field3156 - 1] = 0;
            } else if (6 == class86.field1134.field3046 && class86.field1134.field3048 < 10) {
                var0.field3161[++var0.field3156 - 1] = 0;
            } else {
                var0.field3161[++var0.field3156 - 1] = 1;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "is.afd(" + ')');
        }
    }

    void method5909(InputStream var1, int var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    return;
                }

                this.method5910(var1, var3, -1399588257);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "is.a(" + ')');
        }
    }

    void method5910(InputStream var1, int var2, int var3) {
        try {
            if (1 == var2) {
                this.field9815 = class954.method2092(var1.method6372(-12558881), 2055712019);
            } else if (5 == var2) {
                this.field9816 = var1.method6374();
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "is.f(" + ')');
        }
    }
}
