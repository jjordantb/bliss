import jaclib.ping.Ping;

public final class class170 {
    public static class180 field5104;
    class345 field5099 = new class345();
    int field5100;
    int field5101;
    NodeTable field5102;
    class514 field5103 = new class514();

    public class170(int var1) {
        this.field5100 = var1;
        this.field5101 = var1;

        int var2;
        for (var2 = 1; var2 + var2 < var1; var2 += var2) {
            ;
        }

        this.field5102 = new NodeTable(var2);
    }

    static final void method3073(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -49);
            var0.field3161[++var0.field3156 - 1] = class730.method1761(var3).method1742((byte) 14);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ot.sr(" + ')');
        }
    }

    static final void method3074(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9142.method1407(-1715403508);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ot.anm(" + ')');
        }
    }

    static final void method3075(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 9);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class274.method6596(var3, var4, var0, (byte) 88);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ot.dt(" + ')');
        }
    }

    public static int method3076(int var0) {
        try {
            if (class984.field3143 == 0) {
                class403.field10087.method6143(new class28("jaclib"), 1596959683);
                if (class403.field10087.method6142(-1994130525).method444(1033369240) != 100) {
                    return 1;
                }

                if (!((class28) class403.field10087.method6142(-1994130525)).method3533(-88973782)) {
                    class5.field4944.method1316(1045646617);
                    class28.method3536(1815020733);

                    try {
                        Ping.init();
                    } catch (Throwable var9) {
                        ;
                    }
                }

                class984.field3143 = 1;
            }

            int var1;
            int var5;
            if (class984.field3143 == 1) {
                class947.field3315 = class403.method6145(498211090);
                class403.field10106.method6143(new class830(class966.field2521), 1886459423);
                class403.field10088.method6143(new class28("jaggl"), 35492934);
                class403.field10095.method6143(new class28("jagdx"), 901862397);
                class403.field10089.method6143(new class28("sw3d"), 894420181);
                class403.field10091.method6143(new class28("hw3d"), 484486949);
                class403.field10092.method6143(new class28("jagtheora"), 1559153600);
                class403.field10115.method6143(new class830(class776.field3729), 63607433);
                class403.field10094.method6143(new class830(class428.field7416), 1106252958);
                class403.field10090.method6143(new class830(class429.field7413), -82697463);
                class403.field10096.method6143(new class830(field5104), -43844989);
                class403.field10097.method6143(new class830(class310.field532), 664247222);
                class403.field10100.method6143(new class830(class49.field5185), 1643462211);
                class403.field10099.method6143(new class830(class452.field7215), 1475366772);
                class403.field10098.method6143(new class830(class553.field518), 2057866589);
                class403.field10101.method6143(new class830(class831.field9108), 1522498653);
                class403.field10102.method6143(new class830(class754.field4207), 2023502986);
                class403.field10103.method6143(new class830(class785.field3826), 1517464080);
                class403.field10104.method6143(new class830(class335.field53), 1685456867);
                class403.field10113.method6143(new class830(class576.field72), 1053166996);
                class403.field10108.method6143(new class830(class808.field4597), 1037096117);
                class403.field10107.method6143(new class830(class544.field3795), 4556211);
                class403.field10105.method6143(new class229(class27.field6488, "huffman"), 827266290);
                class403.field10086.method6143(new class830(class120.field2292), 650895714);
                class403.field10110.method6143(new class830(class969.field2496), 199698192);
                class403.field10111.method6143(new class830(class526.field3666), 70682511);
                class403.field10112.method6143(new class82(class792.field510, "details"), -221178534);

                for (var1 = 0; var1 < class947.field3315.length; ++var1) {
                    if (class947.field3315[var1].method6142(-1994130525) == null) {
                        throw new RuntimeException();
                    }
                }

                var1 = 0;
                class403[] var2 = class947.field3315;

                for (int var3 = 0; var3 < var2.length; ++var3) {
                    class403 var4 = var2[var3];
                    var5 = var4.method6141(-1839796424);
                    int var6 = var4.method6142(-1994130525).method444(1033369240);
                    var1 += var5 * var6 / 100;
                }

                class984.field3144 = var1;
                class984.field3143 = 2;
            }

            if (class947.field3315 == null) {
                return 100;
            } else {
                var1 = 0;
                int var11 = 0;
                boolean var12 = true;
                class403[] var13 = class947.field3315;

                for (var5 = 0; var5 < var13.length; ++var5) {
                    class403 var14 = var13[var5];
                    int var7 = var14.method6141(212846361);
                    int var8 = var14.method6142(-1994130525).method444(1033369240);
                    if (var8 < 100) {
                        var12 = false;
                    }

                    var1 += var7;
                    var11 += var7 * var8 / 100;
                }

                if (var12) {
                    if (!((class28) class403.field10092.method6142(-1994130525)).method3533(104668639)) {
                        class730.field2787 = class5.field4944.method1317(-2027084439);
                    }

                    class947.field3315 = null;
                }

                var11 -= class984.field3144;
                var1 -= class984.field3144;
                var5 = var1 > 0 ? 100 * var11 / var1 : 100;
                if (!var12 && var5 > 99) {
                    var5 = 99;
                }

                return var5;
            }
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "ot.a(" + ')');
        }
    }

    static final void method3077(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -46);
            class773.method2313(var3, var0, 1480483039);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ot.qs(" + ')');
        }
    }

    public class345 method3070(long var1) {
        try {
            class345 var3 = (class345) this.field5102.method2942(var1);
            if (var3 != null) {
                this.field5103.method2704(var3, (byte) -98);
            }

            return var3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ot.a(" + ')');
        }
    }

    public void method3071(int var1) {
        try {
            this.field5103.method2710(-710330872);
            this.field5102.method2941((byte) -28);
            this.field5099 = new class345();
            this.field5101 = this.field5100;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ot.b(" + ')');
        }
    }

    public void method3072(class345 var1, long var2) {
        try {
            if (this.field5101 == 0) {
                class345 var4 = this.field5103.method2705(-2130705221);
                var4.method545(-1460969981);
                var4.method156(1224116599);
                if (var4 == this.field5099) {
                    var4 = this.field5103.method2705(-2124650372);
                    var4.method545(-1460969981);
                    var4.method156(-1522621021);
                }
            } else {
                --this.field5101;
            }

            this.field5102.method2947(var1, var2);
            this.field5103.method2704(var1, (byte) -113);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ot.f(" + ')');
        }
    }
}
