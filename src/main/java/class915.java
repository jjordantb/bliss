public class class915 extends class697 {
    byte field10397;
    String field10398;
    byte field10399;
    class76 field10400;

    class915(class76 var1) {
    }

    static final void method6440(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            class327 var3 = class491.method4412(var2);
            if (var3 == null) {
                var0.field3161[++var0.field3156 - 1] = -1;
            } else {
                var0.field3161[++var0.field3156 - 1] = var3.field18;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ags.aeq(" + ')');
        }
    }

    static int method6441(int var0) {
        try {
            if (class730.field2832 == null) {
                if (!class602.field8645) {
                    if (class422.field9604.field2975) {
                        if (class348.field220 != null) {
                            return class348.field220.idk;
                        }
                    } else if (class713.field3542 != null) {
                        return class713.field3542.idk;
                    }
                } else {
                    class230 var1 = class600.method5467(-2091565600);
                    int var2 = class912.field10424.method5524((byte) -81);
                    int var3 = class912.field10424.method5513((byte) -7);
                    int var4;
                    int var5;
                    int var6;
                    MenuItem var7;
                    if (!class602.field8638) {
                        if (var2 > class622.field9006 && var2 < class809.field4595 + class622.field9006) {
                            var4 = -1;

                            for (var5 = 0; var5 < class602.field8673; ++var5) {
                                if (class602.field8663) {
                                    var6 = class602.field8634 * (class602.field8673 - 1 - var5) + 1 + var1.field8230 + 20 + class281.field10643;
                                    if (var3 > var6 - var1.field8230 - 1 && var3 < var1.field8225 + var6) {
                                        var4 = var5;
                                    }
                                } else {
                                    var6 = (class602.field8673 - 1 - var5) * class602.field8634 + class281.field10643 + 31;
                                    if (var3 > var6 - var1.field8230 - 1 && var3 < var1.field8225 + var6) {
                                        var4 = var5;
                                    }
                                }
                            }

                            if (-1 != var4) {
                                var5 = 0;
                                class19 var9 = new class19(class602.field8647);

                                for (var7 = (MenuItem) var9.method3367(446818813); var7 != null; var7 = (MenuItem) var9.next()) {
                                    if (var5++ == var4) {
                                        return var7.idk;
                                    }
                                }
                            }
                        }
                    } else {
                        class906 var10;
                        if (var2 > class622.field9006 && var2 < class622.field9006 + class809.field4595) {
                            var4 = -1;

                            for (var5 = 0; var5 < class602.field8646; ++var5) {
                                if (class602.field8663) {
                                    var6 = var5 * class602.field8634 + 1 + class281.field10643 + 20 + var1.field8230;
                                    if (var3 > var6 - var1.field8230 - 1 && var3 < var1.field8225 + var6) {
                                        var4 = var5;
                                    }
                                } else {
                                    var6 = class281.field10643 + 31 + var5 * class602.field8634;
                                    if (var3 > var6 - var1.field8230 - 1 && var3 < var1.field8225 + var6) {
                                        var4 = var5;
                                    }
                                }
                            }

                            if (-1 != var4) {
                                var5 = 0;
                                var10 = new class906(class602.field8649);

                                for (class497 var11 = (class497) var10.method6341((short) 21512); var11 != null; var11 = (class497) var10.next()) {
                                    if (var5++ == var4) {
                                        return ((MenuItem) var11.field8121.field4317.field208).idk;
                                    }
                                }
                            }
                        } else if (class602.field8639 != null && var2 > class514.field4319 && var2 < class514.field4319 + class965.field2535) {
                            var4 = -1;

                            for (var5 = 0; var5 < class602.field8639.field8120; ++var5) {
                                if (class602.field8663) {
                                    var6 = 1 + var1.field8230 + class936.field10310 + 20 + var5 * class602.field8634;
                                    if (var3 > var6 - var1.field8230 - 1 && var3 < var1.field8225 + var6) {
                                        var4 = var5;
                                    }
                                } else {
                                    var6 = class602.field8634 * var5 + 31 + class936.field10310;
                                    if (var3 > var6 - var1.field8230 - 1 && var3 < var1.field8225 + var6) {
                                        var4 = var5;
                                    }
                                }
                            }

                            if (var4 != -1) {
                                var5 = 0;
                                var10 = new class906(class602.field8639.field8121);

                                for (var7 = (MenuItem) var10.method6341((short) 3172); var7 != null; var7 = (MenuItem) var10.next()) {
                                    if (var5++ == var4) {
                                        return var7.idk;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            return -1;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "ags.at(" + ')');
        }
    }

    void method3821(class139 var1, int var2) {
        try {
            var1.field1164 = this.field10398;
            if (this.field10398 != null) {
                var1.field1166 = this.field10399;
                var1.field1161 = this.field10397;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ags.f(" + ')');
        }
    }

    void method3820(InputStream var1, int var2) {
        try {
            this.field10398 = var1.method6429(-517364695);
            if (this.field10398 != null) {
                var1.method6371();
                this.field10399 = var1.method6372(-12558881);
                this.field10397 = var1.method6372(-12558881);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ags.a(" + ')');
        }
    }
}
