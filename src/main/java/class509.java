public class class509 {
    public static class139 field4024;
    static int field4023;
    public int field4020 = 0;
    public int field4021;
    class1 field4019 = new class1(64);
    class180 field4022;

    public class509(class469 var1, class423 var2, class180 var3) {
        this.field4022 = var3;
        this.field4021 = this.field4022.method3286(class981.field3250.field3271, 774356441);
    }

    static final void method2531(class744 var0, int var1) {
        try {
            var0.field3156 -= 3;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            int var4 = var0.field3161[var0.field3156 + 2];
            if (var3 == -1) {
                throw new RuntimeException();
            } else {
                class833 var5 = class808.field4598.method4721(var3, 1528209569);
                if (var5.field9171 != var2) {
                    throw new RuntimeException();
                } else {
                    int[] var6 = var5.method5429(var4, (short) 19520);
                    int var7 = 0;
                    if (var6 != null) {
                        var7 = var6.length;
                    }

                    var0.field3161[++var0.field3156 - 1] = var7;
                }
            }
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "pp.vs(" + ')');
        }
    }

    static final void method2532(class744 var0, int var1) {
        try {
            String var2 = (String) var0.field3157[--var0.field3158];
            class363.method1629(var2, (byte) 62);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "pp.vl(" + ')');
        }
    }

    static final void method2533(class744 var0, int var1) {
        try {
            if (class53.field2311 && class296.field10468 != null) {
                class739.method1795(class615.field8903.field9109.method6159((byte) 70), -1, -1, false, -489329335);
            }

            if (class382.method1061((byte) 35) == class99.field625) {
                class749.method2525(1556288352);
                System.exit(0);
            } else {
                class118.method1462(-849889720);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "pp.afq(" + ')');
        }
    }

    static int method2534(Player var0, int var1) {
        try {
            int var2 = var0.field3390;
            class507 var3 = var0.method2554(657972326);
            int var4 = var0.passiveAnimator.method2779(1741170329);
            if (-1 != var4 && !var0.field4058) {
                if (var3.field3979 != var4 && var4 != var3.field4007 && var3.field3982 != var4 && var4 != var3.field4004) {
                    if (var4 == var3.field4013 || var3.field3980 == var4 || var3.field3986 == var4 || var3.field3985 == var4) {
                        var2 = var0.field3389;
                    }
                } else {
                    var2 = var0.field3391;
                }
            } else {
                var2 = var0.field3373;
            }

            return var2;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "pp.r(" + ')');
        }
    }

    static void method2535(int var0) {
        try {
            if (class20.method3418(-185972710)) {
                if (class342.field287 == null) {
                    class534.method2290(-219758847);
                }

                class342.field288 = true;
                class342.field278 = 0;
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "pp.f(" + ')');
        }
    }

    static final void method2536(int var0, int var1, byte var2) {
        try {
            if (class730.field2926 != class469.field7320) {
                if (!class133.method998(var0, var1, false, class647.method5483(var0, var1, 1, 1, 1978833308), -1273389367)) {
                    class133.method998(var0, var1, false, class191.method3721(var0, var1, 1, 1, 0, (byte) -5), 1260408128);
                }
            } else if (!class133.method998(var0, var1, false, class191.method3721(var0, var1, 1, 1, 0, (byte) -71), 301836586)) {
                class133.method998(var0, var1, false, class647.method5483(var0, var1, 1, 1, 1349485510), 605242163);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "pp.jv(" + ')');
        }
    }

    public class593 method2527(int var1, int var2) {
        try {
            class1 var3 = this.field4019;
            class593 var4;
            synchronized (this.field4019) {
                var4 = (class593) this.field4019.method2974((long) var1);
            }

            if (var4 != null) {
                return var4;
            } else {
                class180 var5 = this.field4022;
                byte[] var10;
                synchronized (this.field4022) {
                    var10 = this.field4022.method3285(class981.field3250.field3271, var1, (byte) -18);
                }

                var4 = new class593();
                var4.field1617 = this;
                var4.field1605 = var1;
                if (var10 != null) {
                    var4.method1230(new InputStream(var10), 690302848);
                }

                var4.method1228((byte) 75);
                class1 var11 = this.field4019;
                synchronized (this.field4019) {
                    this.field4019.method2984(var4, (long) var1);
                }

                return var4;
            }
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "pp.a(" + ')');
        }
    }

    public void method2528(byte var1) {
        try {
            class1 var2 = this.field4019;
            synchronized (this.field4019) {
                this.field4019.method2979();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "pp.p(" + ')');
        }
    }

    public void method2529(int var1, byte var2) {
        try {
            class1 var3 = this.field4019;
            synchronized (this.field4019) {
                this.field4019.method2976(var1, -1937713048);
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "pp.b(" + ')');
        }
    }

    public void method2530(byte var1) {
        try {
            class1 var2 = this.field4019;
            synchronized (this.field4019) {
                this.field4019.method2977();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "pp.f(" + ')');
        }
    }
}
