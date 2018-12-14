import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class class984 {
    static int field3143 = 0;
    static int field3144 = 0;
    static class48[] field3145;

    class984() throws Throwable {
        throw new Error();
    }

    static void method1875(String var0, String var1, int var2, int var3, int var4, long var5, int var7, int var8, boolean var9, boolean var10, long var11, boolean var13, int var14) {
        try {
            if (!class602.field8645 && class602.field8673 < 521) {
                var2 = var2 != -1 ? var2 : class730.field2919 * -280458557 * -1808468501;
                MenuItem var15 = new MenuItem(var0, var1, var2, var3, var4, var5, var7, var8, var9, var10, var11, var13);
                class647.method5482(var15, 1640099092);
            }

        } catch (RuntimeException var16) {
            throw class158.method3445(var16, "jw.y(" + ')');
        }
    }

    public static void method1876(int var0) {
        try {
            if (class657.field9544 != null) {
                class940[] var1 = class657.field9544;

                for (int var2 = 0; var2 < var1.length; ++var2) {
                    class940 var3 = var1[var2];
                    var3.method6315(-1773131058);
                }
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "jw.i(" + ')');
        }
    }

    static final void method1877(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 60);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class396.method3500(var3, var4, var0, -1168214437);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "jw.nm(" + ')');
        }
    }

    static final void method1878(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = class730.field2902[var2].field10622;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jw.ya(" + ')');
        }
    }

    static final void method1879(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            var0.field3161[++var0.field3156 - 1] = var2 % var3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "jw.zu(" + ')');
        }
    }

    static final void method1880(class744 var0, short var1) {
        try {
            class295.method6520(var0.field3161[--var0.field3156], -1, -1, false, 752651181);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jw.adl(" + ')');
        }
    }

    static final void method1881(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9119.method2717(-2145285486);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jw.ajz(" + ')');
        }
    }

    public static void method1882(class513 var0, int var1) {
        try {
            class149 var2 = (class149) class79.field1525.method901(1766612795);
            if (var2 != null) {
                int var3 = var0.field10376;
                var0.method6364(var2.field1533, -169937628);

                for (int var4 = 0; var4 < var2.field1529; ++var4) {
                    if (var2.field1527[var4] != 0) {
                        var0.method6361(var2.field1527[var4]);
                    } else {
                        try {
                            int var5 = var2.field1528[var4];
                            Field var6;
                            int var7;
                            if (var5 == 0) {
                                var6 = var2.field1530[var4];
                                var7 = var6.getInt((Object) null);
                                var0.method6361(0);
                                var0.method6364(var7, -1175769775);
                            } else if (var5 == 1) {
                                var6 = var2.field1530[var4];
                                var6.setInt((Object) null, var2.field1526[var4]);
                                var0.method6361(0);
                            } else if (var5 == 2) {
                                var6 = var2.field1530[var4];
                                var7 = var6.getModifiers();
                                var0.method6361(0);
                                var0.method6364(var7, -2147062003);
                            }

                            Method var24;
                            if (var5 != 3) {
                                if (var5 == 4) {
                                    var24 = var2.field1532[var4];
                                    var7 = var24.getModifiers();
                                    var0.method6361(0);
                                    var0.method6364(var7, -187993349);
                                }
                            } else {
                                var24 = var2.field1532[var4];
                                byte[][] var25 = var2.field1531[var4];
                                Object[] var8 = new Object[var25.length];

                                for (int var9 = 0; var9 < var25.length; ++var9) {
                                    ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var25[var9]));
                                    var8[var9] = var10.readObject();
                                }

                                Object var26 = var24.invoke((Object) null, var8);
                                if (var26 == null) {
                                    var0.method6361(0);
                                } else if (var26 instanceof Number) {
                                    var0.method6361(1);
                                    var0.method6385(((Number) var26).longValue());
                                } else if (var26 instanceof String) {
                                    var0.method6361(2);
                                    var0.method6366((String) var26, 2146946191);
                                } else {
                                    var0.method6361(4);
                                }
                            }
                        } catch (ClassNotFoundException var11) {
                            var0.method6361(-10);
                        } catch (InvalidClassException var12) {
                            var0.method6361(-11);
                        } catch (StreamCorruptedException var13) {
                            var0.method6361(-12);
                        } catch (OptionalDataException var14) {
                            var0.method6361(-13);
                        } catch (IllegalAccessException var15) {
                            var0.method6361(-14);
                        } catch (IllegalArgumentException var16) {
                            var0.method6361(-15);
                        } catch (InvocationTargetException var17) {
                            var0.method6361(-16);
                        } catch (SecurityException var18) {
                            var0.method6361(-17);
                        } catch (IOException var19) {
                            var0.method6361(-18);
                        } catch (NullPointerException var20) {
                            var0.method6361(-19);
                        } catch (Exception var21) {
                            var0.method6361(-20);
                        } catch (Throwable var22) {
                            var0.method6361(-21);
                        }
                    }
                }

                var0.method6391(var3, -184215611);
                var2.method545(-1460969981);
            }

        } catch (RuntimeException var23) {
            throw class158.method3445(var23, "jw.b(" + ')');
        }
    }

    static class347 method1883(int var0, byte var1) {
        try {
            switch (var0) {
                case 0:
                    return new class787();
                case 1:
                    return new class457();
                case 2:
                    return new class126();
                case 3:
                    return new class287();
                case 4:
                    return new class177();
                case 5:
                    return new class836();
                case 6:
                    return new class654();
                case 7:
                    return new class65();
                case 8:
                    return new class313();
                case 9:
                    return new class144();
                case 10:
                    return new class835();
                case 11:
                    return new class148();
                case 12:
                    return new class633();
                case 13:
                    return new class582();
                case 14:
                    return new class688();
                case 15:
                    return new class578();
                case 16:
                    return new class130();
                case 17:
                    return new class577();
                case 18:
                    return new class218();
                case 19:
                    return new class707();
                case 20:
                    return new class570();
                case 21:
                    return new class704();
                case 22:
                    return new class85();
                case 23:
                    return new class435();
                case 24:
                    return new class712();
                case 25:
                    return new class723();
                case 26:
                    return new class983();
                case 27:
                    return new class181();
                case 28:
                    return new class444();
                case 29:
                    return new class34();
                case 30:
                    return new class37();
                case 31:
                    return new class355();
                case 32:
                    return new class628();
                case 33:
                    return new class234();
                case 34:
                    return new class172();
                case 35:
                    return new class982();
                case 36:
                    return new class668();
                case 37:
                    return new class109();
                case 38:
                    return new class499();
                case 39:
                    return new class43();
                default:
                    return null;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jw.d(" + ')');
        }
    }

    public static void method1884(int var0) {
        try {
            if (!class75.field1493) {
                class312.method418(class730.field2697.method5317(-1611682495).field3863, 234916861);
                if (class730.field2697.method5317(-1611682495).oglTiles != null) {
                    class312.method418(class730.field2697.method5317(-1611682495).oglTiles, -1747837187);
                }

                class75.field1493 = true;
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "jw.a(" + ')');
        }
    }

    static final void method1885(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
        try {
            boolean var4 = var2.field3161[--var2.field3156] == 1;
            if (var0.field886 != var4) {
                var0.field886 = var4;
                class814.method2932(var0, -1214371857);
            }

            if (-1 == var0.field879 && !var1.closed) {
                class162.method3543(var0.field867, (short) 945);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "jw.ct(" + ')');
        }
    }
}
