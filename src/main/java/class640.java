import java.math.BigInteger;

public class class640 {
    public static class420 field10201;
    class213 field10194;
    BigInteger field10195;
    class448 field10196;
    BigInteger field10197;
    class341 field10198;
    InputStream field10199;
    class702[] field10200;

    public class640(class341 var1, class213 var2, BigInteger var3, BigInteger var4) {
        this.field10198 = var1;
        this.field10194 = var2;
        this.field10195 = var3;
        this.field10197 = var4;
        if (!this.field10198.method227((byte) 14)) {
            this.field10196 = this.field10198.method225(255, 255, (byte) 0, true, -562787120);
        }

    }

    static final void method6186(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class931.field10299;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jn.ams(" + ')');
        }
    }

    static final void method6187(class563 var0, boolean var1, byte var2) {
        try {
            if (var0.field1079) {
                if (var0.field1067 < 0 || class554.method428(class730.field2697.method5283(681883413), var0.field1067, var0.field1073, (byte) -3)) {
                    if (!var1) {
                        class745.method2596(var0.field1070, var0.field1076, var0.field1069, var0.field1074, var0.field1067, var0.field1080, var0.field1073, -1, -1628738260);
                    } else {
                        class928.method6201(var0.field1070, var0.field1076, var0.field1069, var0.field1074, (class552) null, (byte) 68);
                    }

                    var0.method545(-1460969981);
                }
            } else if (var0.field1078 && var0.field1069 >= 1 && var0.field1074 >= 1 && var0.field1069 <= class730.field2697.method5271(-2002349453) - 2 && var0.field1074 <= class730.field2697.method5272(1538814162) - 2 && (var0.field1075 < 0 || class554.method428(class730.field2697.method5283(-2135125377), var0.field1075, var0.field1072, (byte) -66))) {
                if (!var1) {
                    class745.method2596(var0.field1070, var0.field1076, var0.field1069, var0.field1074, var0.field1075, var0.field1068, var0.field1072, -1, 628810012);
                } else {
                    class928.method6201(var0.field1070, var0.field1076, var0.field1069, var0.field1074, var0.field1077, (byte) 110);
                }

                var0.field1078 = false;
                if (!var1 && var0.field1075 == var0.field1067 && var0.field1067 == -1) {
                    var0.method545(-1460969981);
                } else if (!var1 && var0.field1067 == var0.field1075 && var0.field1080 == var0.field1068 && var0.field1072 == var0.field1073) {
                    var0.method545(-1460969981);
                }
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "jn.k(" + ')');
        }
    }

    static final void method6188(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 21);
            var0.field3161[++var0.field3156 - 1] = var3.field1009;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "jn.ri(" + ')');
        }
    }

    static final void method6189(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            var0.field941 = var2.field3161[--var2.field3156] == 1;
            class814.method2932(var0, 664370665);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "jn.ed(" + ')');
        }
    }

    static final void method6190(Widget var0, WidgetContainer var1, class744 var2, short var3) {
        try {
            var0.field962 = (String) var2.field3157[--var2.field3158];
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "jn.jg(" + ')');
        }
    }

    static void method6191(int var0) {
        try {
            if (class896.field9358 < 0) {
                class896.field9358 = 0;
                class740.field3206 = -1;
                class740.field3201 = -1;
            }

            if (class896.field9358 > class491.field7814) {
                class896.field9358 = class491.field7814;
                class740.field3206 = -1;
                class740.field3201 = -1;
            }

            if (class747.field4148 < 0) {
                class747.field4148 = 0;
                class740.field3206 = -1;
                class740.field3201 = -1;
            }

            if (class747.field4148 > class491.field7815) {
                class747.field4148 = class491.field7815;
                class740.field3206 = -1;
                class740.field3201 = -1;
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "jn.bg(" + ')');
        }
    }

    public boolean method6182(int var1) {
        try {
            if (this.field10199 != null) {
                return true;
            } else {
                if (this.field10196 == null) {
                    if (this.field10198.method227((byte) 14)) {
                        return false;
                    }

                    this.field10196 = this.field10198.method225(255, 255, (byte) 0, true, 503469901);
                }

                if (this.field10196.field3464) {
                    return false;
                } else {
                    InputStream var2 = new InputStream(this.field10196.method2033((short) 8819));
                    var2.field10376 = 5;
                    int var3 = var2.method6371();
                    var2.field10376 += 72 * var3;
                    byte[] var4 = new byte[var2.field10375.length - var2.field10376];
                    var2.method6381(var4, 0, var4.length, -953523806);
                    byte[] var5;
                    if (this.field10195 != null && this.field10197 != null && !Loader.field6965) {
                        BigInteger var6 = new BigInteger(var4);
                        BigInteger var7 = var6.modPow(this.field10195, this.field10197);
                        var5 = var7.toByteArray();
                    } else {
                        var5 = var4;
                    }

                    if (var5.length != 64 && var5.length != 65) {
                        throw new RuntimeException();
                    } else {
                        byte[] var9 = class76.method1111(var2.field10375, 5, var2.field10376 - var4.length - 5, (byte) -63);

                        for (int var10 = 0; var10 < 64; ++var10) {
                            if (var9[var10] != var5[var10]) {
                                throw new RuntimeException();
                            }
                        }

                        this.field10200 = new class702[var3];
                        this.field10199 = var2;
                        return true;
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "jn.a(" + ')');
        }
    }

    public class702 method6183(int var1, class675 var2, class675 var3, int var4) {
        try {
            return this.method6184(var1, var2, var3, true, 2087192447);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "jn.f(" + ')');
        }
    }

    class702 method6184(int var1, class675 var2, class675 var3, boolean var4, int var5) {
        try {
            if (this.field10199 == null) {
                throw new RuntimeException();
            } else if (var1 >= 0 && var1 < this.field10200.length) {
                if (this.field10200[var1] != null) {
                    return this.field10200[var1];
                } else {
                    this.field10199.field10376 = 6 + var1 * 72;
                    int var6 = this.field10199.method6420((byte) 13);
                    int var7 = this.field10199.method6420((byte) 84);
                    byte[] var8 = new byte[64];
                    this.field10199.method6381(var8, 0, 64, -953523806);
                    class702 var9 = new class702(var1, var2, var3, this.field10198, this.field10194, var6, var8, var7, var4);
                    this.field10200[var1] = var9;
                    return var9;
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "jn.b(" + ')');
        }
    }

    public void method6185(int var1) {
        try {
            if (this.field10200 != null) {
                int var2;
                for (var2 = 0; var2 < this.field10200.length; ++var2) {
                    if (this.field10200[var2] != null) {
                        this.field10200[var2].method1959((byte) 32);
                    }
                }

                for (var2 = 0; var2 < this.field10200.length; ++var2) {
                    if (this.field10200[var2] != null) {
                        this.field10200[var2].method1960(437628699);
                    }
                }
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jn.p(" + ')');
        }
    }
}
