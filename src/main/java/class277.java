public class class277 {
    static class471[] field10606;
    class1 field10604 = new class1(16);
    class180 field10605;

    public class277(class469 var1, class423 var2, class180 var3) {
        this.field10605 = var3;
        this.field10605.method3286(class981.field3228.field3271, -1961959383);
    }

    static void method6634(WidgetContainer var0, Widget var1, int var2) {
        try {
            if (var1 != null) {
                int var4;
                if (var1.field879 != -1) {
                    Widget var3 = var0.method889(var1.field885, (short) 26063);
                    if (var3 != null) {
                        if (var3.children2 == var3.children1) {
                            var3.children2 = new Widget[var3.children1.length];
                            var3.children2[var3.children2.length - 1] = var1;
                            class901.method6351(var3.children1, 0, var3.children2, 0, var1.field879);
                            class901.method6351(var3.children1, 1 + var1.field879, var3.children2, var1.field879, var3.children1.length - var1.field879 - 1);
                        } else {
                            var4 = 0;

                            Widget[] var5;
                            for (var5 = var3.children2; var4 < var5.length; ++var4) {
                                if (var5[var4] == var1) {
                                    if (var2 != -1270501871) {
                                        return;
                                    }
                                    break;
                                }
                            }

                            if (var4 < var5.length) {
                                class901.method6351(var5, 1 + var4, var5, var4, var5.length - var4 - 1);
                                var5[var3.children2.length - 1] = var1;
                            }
                        }
                    }
                } else {
                    Widget[] var7 = var0.method888((byte) 61);

                    for (var4 = 0; var4 < var7.length && var1 != var7[var4]; ++var4) {
                        ;
                    }

                    if (var4 < var7.length) {
                        class901.method6351(var7, var4 + 1, var7, var4, var7.length - var4 - 1);
                        var7[var7.length - 1] = var1;
                    }
                }
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "fh.y(" + ')');
        }
    }

    static final void method6635(class744 var0, int var1) {
        try {
            var0.field3156 -= 4;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            int var4 = var0.field3161[var0.field3156 + 2];
            int var5 = var0.field3161[var0.field3156 + 3];
            RegionBase var6 = class730.field2697.getRegionBase(681479919);
            class526.method2227((var2 >> 14 & 16383) - var6.baseX, (var2 & 16383) - var6.baseY, var3 << 2, var4, var5, (byte) 72);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "fh.agc(" + ')');
        }
    }

    public void method6630(short var1) {
        try {
            class1 var2 = this.field10604;
            synchronized (this.field10604) {
                this.field10604.method2977();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "fh.f(" + ')');
        }
    }

    public class176 method6631(int var1, int var2) {
        try {
            class1 var3 = this.field10604;
            class176 var4;
            synchronized (this.field10604) {
                var4 = (class176) this.field10604.method2974((long) var1);
            }

            if (var4 != null) {
                return var4;
            } else {
                class180 var5 = this.field10605;
                byte[] var10;
                synchronized (this.field10605) {
                    var10 = this.field10605.method3285(class981.field3228.field3271, var1, (byte) -82);
                }

                var4 = new class176();
                if (var10 != null) {
                    var4.method3161(new InputStream(var10), (byte) -59);
                }

                class1 var11 = this.field10604;
                synchronized (this.field10604) {
                    this.field10604.method2984(var4, (long) var1);
                }

                return var4;
            }
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "fh.a(" + ')');
        }
    }

    public void method6632(int var1) {
        try {
            class1 var2 = this.field10604;
            synchronized (this.field10604) {
                this.field10604.method2979();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "fh.p(" + ')');
        }
    }

    public void method6633(int var1, short var2) {
        try {
            class1 var3 = this.field10604;
            synchronized (this.field10604) {
                this.field10604.method2976(var1, -985699563);
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "fh.b(" + ')');
        }
    }
}
