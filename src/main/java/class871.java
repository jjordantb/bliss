public class class871 {
    public static int field9806 = 0;
    static int field9807 = 1;
    public char field9808;
    public int field9809 = 1;

    static final void method5898(Actor var0, byte var1) {
        try {
            Animator var2 = var0.passiveAnimator;
            if (var2.method2775((byte) -67) && var2.method2778(1, 1987990558) && var2.method2788(-1549707079)) {
                if (var0.field4058) {
                    var2.method2797(var0.method2554(-646688457).method2504(-2063556157), false, true, (byte) 71);
                    var0.field4058 = var2.method2775((byte) -43);
                }

                var2.method2790(-381553454);
            }

            for (int var3 = 0; var3 < var0.field4040.length; ++var3) {
                if (-1 != var0.field4040[var3].field10341) {
                    Animator var4 = var0.field4040[var3].field10340;
                    if (var4.method2782(-65534)) {
                        class745 var5 = class635.field9823.method1053(var0.field4040[var3].field10341, -2105534401);
                        Animation var6 = var4.method2776(301840356);
                        if (var5.field4117) {
                            if (3 == var6.field6666) {
                                if (var0.field4089 > 0 && var0.field4059 <= class730.field2866 && var0.field4067 < class730.field2866) {
                                    var4.method2777(-1, -1544973787);
                                    var0.field4040[var3].field10341 = -1;
                                    continue;
                                }
                            } else if (1 == var6.field6666 && var0.field4089 > 0 && var0.field4059 <= class730.field2866 && var0.field4067 < class730.field2866) {
                                if (var1 <= 0) {
                                    throw new IllegalStateException();
                                }
                                continue;
                            }
                        }
                    }

                    if (var4.method2778(1, 2118435651) && var4.method2788(-618238980)) {
                        var4.method2777(-1, -1633965272);
                        var0.field4040[var3].field10341 = -1;
                    }
                }
            }

            Animator var8 = var0.activeAnimator;
            if (var8.method2775((byte) -111)) {
                label94:
                {
                    Animation var9 = var8.method2776(-239895480);
                    if (var9.field6666 == 3) {
                        if (var0.field4089 > 0 && var0.field4059 <= class730.field2866 && var0.field4067 < class730.field2866) {
                            var0.field4057 = null;
                            var8.method2777(-1, -1775890638);
                            break label94;
                        }
                    } else if (var9.field6666 == 1) {
                        if (var0.field4089 > 0 && var0.field4059 <= class730.field2866 && var0.field4067 < class730.field2866) {
                            var8.method2784(1, -1445580533);
                            break label94;
                        }

                        var8.method2784(0, -1445580533);
                    }

                    if (var8.method2778(1, 1800694800) && var8.method2788(2113161557)) {
                        var0.field4057 = null;
                        var8.method2777(-1, -1505745932);
                    }
                }
            }

            for (int var10 = 0; var10 < var0.field4076.length; ++var10) {
                class761 var11 = var0.field4076[var10];
                if (var11 == null) {
                    if (var1 <= 0) {
                        break;
                    }
                } else if (var11.field4392 > 0) {
                    --var11.field4392;
                } else if (var11.method2778(1, 1635339259) && var11.method2788(-1916061004)) {
                    var0.field4076[var10] = null;
                }
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "tm.if(" + ')');
        }
    }

    static boolean method5899(int var0, int var1, int var2) {
        try {
            if (var1 >= 1000 && var0 < 1000) {
                return true;
            } else if (var1 < 1000 && var0 < 1000) {
                if (class308.method381(var0, 1576950944)) {
                    return true;
                } else {
                    return !class308.method381(var1, 1956430101);
                }
            } else {
                return var1 >= 1000 && var0 >= 1000;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "tm.bv(" + ')');
        }
    }

    static void method5900(int var0) {
        try {
            if (class730.field2825 != null) {
                class516.method2727((byte) -48);
            } else if (class881.field10145 != -1) {
                class647.method5489(1290556720);
            } else {
                class22.method3438(class881.field10170, class881.field10171, (short) 5737);
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "tm.a(" + ')');
        }
    }

    void method5896(InputStream var1, int var2, int var3) {
        try {
            if (1 == var2) {
                this.field9808 = class954.method2092(var1.method6372(-12558881), 2112352543);
            } else if (var2 == 2) {
                this.field9809 = 0;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "tm.f(" + ')');
        }
    }

    void method5897(InputStream var1, int var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    if (var2 != 1327711716) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                this.method5896(var1, var3, -168938577);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "tm.a(" + ')');
        }
    }
}
