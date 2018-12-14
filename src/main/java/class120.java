public class class120 {
    public static class180 field2292;
    static int field2275 = 3;
    static int field2278 = 1;
    static int field2279 = 2;
    static int field2280 = 7;
    static int field2281 = 4;
    static int field2282 = 11;
    static int field2283 = 6;
    static int field2284 = 12;
    static int field2285 = 8;
    static int field2286 = 5;
    static int field2287 = 10;
    static int field2289 = 9;
    static int field2290 = 13;
    static class48[] field2291;
    int field2276 = -1;
    class373 field2277 = new class373();
    long field2288;

    public class120(InputStream var1) {
        this.method1501(var1, (short) 594);
    }

    static final void method1502(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            ItemDefinition var4 = class85.field1121.method1566(var2);
            if (var3 >= 1 && var3 <= 5 && var4.method2690(var3 - 1) != null && !var4.method2690(var3 - 1).equals("null")) {
                var0.field3157[++var0.field3158 - 1] = var4.method2690(var3 - 1);
            } else {
                var0.field3157[++var0.field3158 - 1] = "";
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "gn.aar(" + ')');
        }
    }

    static final void method1503(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class625.method5823(var3, var4, var0, (byte) 125);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "gn.jz(" + ')');
        }
    }

    static final void method1504(class744 var0, byte var1) {
        try {
            var0.field3156 -= 3;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            int var4 = var0.field3161[var0.field3156 + 2];
            Widget var5 = class554.method427(var2 << 16 | var3, var4, -156511736);
            class422.method5724((byte) 4);
            class725 var6 = class730.method1761(var5);
            class900.method6347(var5, var6.method1742((byte) -10), var6.field2557, 1387537939);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "gn.amf(" + ')');
        }
    }

    public void method1500(class420 var1, byte var2) {
        try {
            if (var1.field9706 == this.field2288 && this.field2276 == var1.field9696) {
                for (class106 var3 = (class106) this.field2277.method901(1766612795); var3 != null; var3 = (class106) this.field2277.method906(49146)) {
                    var3.method170(var1, (byte) 1);
                }

                ++var1.field9696;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "gn.f(" + ')');
        }
    }

    void method1501(InputStream var1, short var2) {
        try {
            this.field2288 = var1.method6375((short) 21326);
            this.field2276 = var1.method6420((byte) -33);

            for (int var3 = var1.method6371(); var3 != 0; var3 = var1.method6371()) {
                System.out.println(var3);
                Object var4;
                if (var3 == 3) {
                    var4 = new class350(this);
                } else if (1 == var3) {
                    var4 = new class798(this);
                } else if (13 == var3) {
                    var4 = new class201(this);
                } else if (var3 == 4) {
                    var4 = new class179(this);
                } else if (6 == var3) {
                    var4 = new class690(this);
                } else if (5 == var3) {
                    var4 = new class165(this);
                } else if (2 == var3) {
                    var4 = new class97(this);
                } else if (7 == var3) {
                    var4 = new class853(this);
                } else if (8 == var3) {
                    var4 = new class395(this);
                } else if (var3 == 9) {
                    var4 = new class672(this);
                } else if (var3 == 10) {
                    var4 = new class961(this);
                } else if (var3 == 11) {
                    var4 = new class326(this);
                } else {
                    if (12 != var3) {
                        throw new RuntimeException("");
                    }

                    var4 = new class460(this);
                }

                ((class106) var4).method168(var1, 804752437);
                this.field2277.method897((Node) var4, 843424958);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "gn.a(" + ')');
        }
    }
}
