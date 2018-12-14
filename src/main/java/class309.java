public class class309 {
    class879 field370;
    class240 field371;
    int field372 = 0;
    Interactable field373;
    byte field374;
    int field375;
    int field376;
    boolean field377 = false;
    boolean field378 = false;
    Animator field379;
    int field380;
    int field381 = -1;
    boolean[] field382;
    class552 field383;
    boolean field384;
    class770 field385;
    boolean field386 = false;
    int field387;
    class726 field388;
    byte field389;

    class309(class848 var1, class240 var2, ObjectDefinition var3, int var4, int var5, int var6, int var7, Interactable var8, boolean var9, int var10) {
        this.field371 = var2;
        this.field387 = var3.field2197;
        this.field375 = var4;
        this.field376 = var5;
        this.field373 = var8;
        this.field378 = -1 != var10;
        this.field389 = (byte) var6;
        this.field374 = (byte) var7;
        this.field377 = var9;
        this.field384 = var1.method4916() && var3.field2265 && !this.field377;
        this.field379 = new class511(var8, false);
        this.method355(false, var10, 1, 126217673);
    }

    static final void method359(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            if (var3 == -1) {
                var0.field3161[++var0.field3156 - 1] = -1;
            } else {
                var0.field3161[++var0.field3156 - 1] = class848.field8597.method3399(var2, 2082342727).method4309((char) var3, 166344309);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ck.acw(" + ')');
        }
    }

    public static void method360(class112 var0, int var1, int var2, class265 var3, int var4) {
        try {
            class744 var5 = class909.method6439(407967339);
            var5.field3150 = var3;
            class307.method389(var0, var1, var2, var5, 536465062);
            var5.field3150 = null;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ck.u(" + ')');
        }
    }

    public static void method361(boolean var0, int var1) {
        try {
            if (class302.field3768 == null) {
                class848.method5065(-1748236923);
            }

            if (var0) {
                class302.field3768.method117((byte) -102);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ck.b(" + ')');
        }
    }

    static final void method362(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            class200.method4351(var3, var0, (byte) 0);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ck.qo(" + ')');
        }
    }

    static final void method363(class744 var0, short var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = class85.field1121.method1566(var2).field4237;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ck.aby(" + ')');
        }
    }

    static final void method364(class744 var0, byte var1) {
        try {
            if (class730.field2785 != null) {
                var0.field3161[++var0.field3156 - 1] = class556.field503;
            } else {
                var0.field3161[++var0.field3156 - 1] = 0;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ck.wx(" + ')');
        }
    }

    static final void method365(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
        try {
            var2.field3156 -= 3;
            int var4 = var2.field3161[var2.field3156];
            short var5 = (short) var2.field3161[var2.field3156 + 1];
            short var6 = (short) var2.field3161[var2.field3156 + 2];
            if (var4 >= 0 && var4 < 5) {
                var0.method836(var4, var5, var6, -162772929);
                class814.method2932(var0, -882757286);
                if (var0.field879 == -1 && !var1.closed) {
                    class539.method2341(var0.field867, var4, 227307662);
                }
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "ck.gv(" + ')');
        }
    }

    public void method348(int var1, int var2) {
        try {
            this.field378 = true;
            this.method355(false, var1, 1, -933534749);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ck.a(" + ')');
        }
    }

    void method349(class552 var1, int var2) {
        try {
            this.field383 = var1;
            this.field370 = null;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ck.b(" + ')');
        }
    }

    int method350(int var1) {
        try {
            return -this.method356(-46753485);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ck.p(" + ')');
        }
    }

    final class879 method351(class848 var1, int var2, boolean var3, boolean var4, byte var5) {
        try {
            ObjectDefinition var6 = this.field371.method4713(this.field387);
            if (var6.field2198 != null) {
                var6 = var6.method1487((class415) (class730.field2705 == 0 ? class949.field3324 : class827.field9037), 1333630702);
            }

            if (var6 == null) {
                this.method358(var1, -475225909);
                this.field381 = -1;
                return null;
            } else {
                if (!this.field378 && this.field381 != var6.field2197) {
                    this.method355(true, -1, 0, 2114520079);
                    this.field386 = false;
                    this.field370 = null;
                }

                this.method354(this.field373, 1121645041);
                if (var4) {
                    var4 &= this.field384 & !this.field386 & class615.field8903.field9147.method5182(-896655100) != 0;
                }

                if (var3 && !var4) {
                    this.field381 = var6.field2197;
                    return null;
                } else {
                    RegionOffset var7 = this.field373.getRegion().regionOffset;
                    SceneGraph var8 = class730.field2697.method5317(-1611682495);
                    if (var4) {
                        var8.method2441(this.field385, this.field374, (int) var7.offsetX, (int) var7.offsetY, this.field382, 528677416);
                        this.field386 = false;
                    }

                    SceneGraphLevel var9 = var8.field3862[this.field374];
                    SceneGraphLevel var10;
                    if (this.field377) {
                        var10 = var8.field3864[0];
                    } else {
                        var10 = this.field374 < 3 ? var8.field3862[1 + this.field374] : null;
                    }

                    class879 var11 = null;
                    if (this.field379.method2775((byte) -82)) {
                        if (var4) {
                            var2 |= 262144;
                        }

                        var11 = var6.method1484(var1, var2, 11 != this.field375 ? -1598457753 * this.field375 * -1523702953 : 10, 11 == this.field375 ? 4 + this.field376 : 748228569 * this.field376 * -1809022871, var9, var10, (int) var7.offsetX, var9.method3887((int) var7.offsetX, (int) var7.offsetY, -1408801129), (int) var7.offsetY, this.field379, this.field383, (byte) 18);
                        if (var11 != null) {
                            if (var4) {
                                if (this.field382 == null) {
                                    this.field382 = new boolean[4];
                                }

                                this.field385 = var11.method6102(this.field385);
                                var8.method2449(this.field385, this.field374, (int) var7.offsetX, (int) var7.offsetY, this.field382, -1719073428);
                                this.field386 = true;
                            }

                            this.field372 = var11.method5976();
                            var11.method5973();
                        } else {
                            this.field382 = null;
                            this.field385 = null;
                            this.field372 = 0;
                        }

                        this.field370 = null;
                    } else if (this.field370 != null && (this.field370.method5948() & var2) == var2 && this.field381 == var6.field2197) {
                        var11 = this.field370;
                    } else {
                        if (this.field370 != null) {
                            var2 |= this.field370.method5948();
                        }

                        class486 var12 = var6.method1495(var1, var2, this.field375 != 11 ? -1598457753 * this.field375 * -1523702953 : 10, 11 == this.field375 ? this.field376 + 4 : 748228569 * this.field376 * -1809022871, var9, var10, (int) var7.offsetX, var9.method3887((int) var7.offsetX, (int) var7.offsetY, -1367024792), (int) var7.offsetY, var4, this.field383, -105046202);
                        if (var12 != null) {
                            this.field370 = var11 = (class879) var12.field8554;
                            if (var4) {
                                this.field385 = (class770) var12.field8555;
                                this.field382 = null;
                                var8.method2449(this.field385, this.field374, (int) var7.offsetX, (int) var7.offsetY, (boolean[]) null, -1920595487);
                                this.field386 = true;
                            }

                            this.field372 = var11.method5976();
                            var11.method5973();
                        } else {
                            this.field382 = null;
                            this.field385 = null;
                            this.field370 = null;
                            this.field372 = 0;
                        }
                    }

                    this.field381 = var6.field2197;
                    return var11;
                }
            }
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "ck.i(" + ')');
        }
    }

    void method352(class848 var1, class879 var2, class135 var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
        try {
            class933[] var10 = var2.method6089();
            class396[] var11 = var2.method5941();
            if ((this.field388 == null || this.field388.field2548) && (var10 != null || var11 != null)) {
                ObjectDefinition var12 = this.field371.method4713(this.field387);
                if (var12.field2198 != null) {
                    var12 = var12.method1487((class415) (class730.field2705 == 0 ? class949.field3324 : class827.field9037), 1897177328);
                }

                if (var12 != null) {
                    this.field388 = class726.method1732(class730.field2866, true);
                }
            }

            if (this.field388 != null) {
                var2.method6096(var3);
                if (var8) {
                    this.field388.method1731(var1, (long) class730.field2866, var10, var11, false);
                } else {
                    this.field388.method1733((long) class730.field2866);
                }

                this.field388.method1727(this.field389, var4, var5, var6, var7);
            }

        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "ck.k(" + ')');
        }
    }

    void method353(class848 var1, int var2) {
        try {
            this.method351(var1, 262144, true, true, (byte) 2);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ck.u(" + ')');
        }
    }

    void method354(Interactable var1, int var2) {
        try {
            if (this.field379.method2775((byte) -77)) {
                if (this.field379.method2778(class730.field2866 - this.field380, 1976097000)) {
                    if (class615.field8903.field9147.method5182(-184271029) == 2) {
                        this.field386 = false;
                    }

                    if (this.field379.method2788(-1768742219)) {
                        this.field379.method2777(-1, -1793536388);
                        this.field378 = false;
                        this.method355(false, -1, 0, 66091574);
                    }
                }
            } else {
                this.method355(false, -1, 0, 2063242000);
            }

            this.field380 = class730.field2866;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ck.r(" + ')');
        }
    }

    void method355(boolean var1, int var2, int var3, int var4) {
        try {
            int var5 = var2;
            boolean var6 = false;
            if (var2 == -1) {
                ObjectDefinition var7 = this.field371.method4713(this.field387);
                ObjectDefinition var8 = var7;
                if (var7.field2198 != null) {
                    var7 = var7.method1487((class415) (class730.field2705 == 0 ? class949.field3324 : class827.field9037), 1802349433);
                }

                if (var7 == null) {
                    return;
                }

                if (var7 == var8) {
                    var8 = null;
                }

                if (var7.method1489(934270378)) {
                    if (var1 && this.field379.method2775((byte) -5) && var7.method1483(this.field379.method2779(2076230166), 1402053046)) {
                        return;
                    }

                    if (var7.field2197 != this.field381) {
                        var6 = var7.field2263;
                    }

                    var5 = var7.method1491((byte) 14);
                    if (var7.method1490(-1966445745)) {
                        var3 = 0;
                    } else {
                        var3 = 1;
                    }
                } else if (var8 != null && var8.method1489(934270378)) {
                    if (var1 && this.field379.method2775((byte) -12) && var8.method1483(this.field379.method2779(1572334487), 1867786247)) {
                        return;
                    }

                    if (this.field381 != var7.field2197) {
                        var6 = var8.field2263;
                    }

                    var5 = var8.method1491((byte) 14);
                    if (var8.method1490(-1966445745)) {
                        var3 = 0;
                    } else {
                        var3 = 1;
                    }
                }
            }

            if (var5 == -1) {
                this.field379.method2799(-1, false, 79187064);
            } else {
                this.field379.method2780(var5, 0, var3, var6, (byte) 0);
                this.field380 = class730.field2866;
                this.field386 = false;
                this.field370 = null;
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "ck.q(" + ')');
        }
    }

    int method356(int var1) {
        try {
            return this.field372;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ck.f(" + ')');
        }
    }

    boolean method357(int var1) {
        try {
            return this.field384;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ck.d(" + ')');
        }
    }

    void method358(class848 var1, int var2) {
        try {
            if (this.field385 != null) {
                RegionOffset var3 = this.field373.getRegion().regionOffset;
                class730.field2697.method5317(-1611682495).method2441(this.field385, this.field374, (int) var3.offsetX, (int) var3.offsetY, this.field382, 677085165);
                this.field382 = null;
                this.field385 = null;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ck.x(" + ')');
        }
    }
}
