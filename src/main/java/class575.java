public class class575 implements Runnable {
    volatile boolean field140;
    class431 field141;
    class940 field142 = new class650();
    class940 field143 = null;
    long field144;
    int field145;
    long field146;
    String field147;
    int field148;
    boolean field149;

    public static class879 method124(class848 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            long var7 = (long) var5;
            class879 var9 = (class879) class921.field10285.method2974(var7);
            short var10 = 2055;
            if (var9 == null) {
                class25 var11 = class25.method3454(RegionBase.field1524, var5, 0);
                if (var11 == null) {
                    return null;
                }

                if (var11.field6462 < 13) {
                    var11.method3458(2);
                }

                var9 = var0.method4861(var11, var10, class253.field7970, 64, 768);
                class921.field10285.method2984(var9, var7);
            }

            var9 = var9.method6017((byte) 6, var10, true);
            if (var1 != 0) {
                var9.method6016(var1);
            }

            if (var2 != 0) {
                var9.method5952(var2);
            }

            if (var3 != 0) {
                var9.method6041(var3);
            }

            if (var4 != 0) {
                var9.method5953(0, var4, 0);
            }

            return var9;
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "jf.a(" + ')');
        }
    }

    public static int method125(int var0, int var1, int var2, byte var3) {
        try {
            var2 &= 3;
            if (var2 == 0) {
                return var0;
            } else if (1 == var2) {
                return var1;
            } else {
                return 2 == var2 ? 4095 - var0 : 4095 - var1;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "jf.b(" + ')');
        }
    }

    static final void method126(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            var0.field3161[++var0.field3156 - 1] = var3.field935;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "jf.pe(" + ')');
        }
    }

    public static final void method127(int var0) {
        try {
            class654.field9352 = null;
            class56.field2320 = null;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "jf.at(" + ')');
        }
    }

    static final void method128(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -71);
            var0.field3157[++var0.field3158 - 1] = var3.text;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "jf.rk(" + ')');
        }
    }

    int method113(int var1) {
        try {
            return this.field145;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jf.a(" + ')');
        }
    }

    public class431 method114(int var1) {
        try {
            return this.field141;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jf.r(" + ')');
        }
    }

    synchronized boolean method115(int var1) {
        try {
            return this.field142.method6318(this.field144);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jf.b(" + ')');
        }
    }

    synchronized void method116(class940 var1, int var2) {
        try {
            this.field143 = this.field142;
            this.field142 = var1;
            this.field144 = class27.resetTimer((byte) 1);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "jf.p(" + ')');
        }
    }

    synchronized void method117(byte var1) {
        try {
            this.field149 = true;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jf.f(" + ')');
        }
    }

    public int method118(int var1) {
        try {
            return this.field148;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jf.d(" + ')');
        }
    }

    public String method119(short var1) {
        try {
            return this.field147;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jf.u(" + ')');
        }
    }

    public long method120(int var1) {
        try {
            return this.field146;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jf.x(" + ')');
        }
    }

    public int method121(byte var1) {
        try {
            if (this.field141 == null) {
                return 0;
            } else {
                int var2 = this.field141.field7500;
                if (this.field141.field7502 && this.field148 < this.field141.field7504) {
                    return 1 + this.field148;
                } else if (var2 >= 0 && var2 < class657.field9543.length - 1) {
                    return this.field148 == this.field141.field7503 ? this.field141.field7504 : this.field141.field7503;
                } else {
                    return 100;
                }
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jf.k(" + ')');
        }
    }

    void method122(byte var1) {
        try {
            this.field140 = true;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jf.s(" + ')');
        }
    }

    public void run() {
        try {
            while (!this.field140) {
                long var1 = class27.resetTimer((byte) 1);
                synchronized (this) {
                    try {
                        ++this.field145;
                        if (this.field142 instanceof class650) {
                            this.field142.method6325(this.field149, 2139338781);
                        } else {
                            long var4 = class27.resetTimer((byte) 1);
                            if (class593.field1623 != null && this.field143 != null && this.field143.method6316(73548607) != 0 && this.field144 >= var4 - (long) this.field143.method6316(-462627527)) {
                                int var6 = (int) ((var4 - this.field144) * 255L / (long) this.field143.method6316(-362403732));
                                int var7 = 255 - var6;
                                var6 = var6 << 24 | 16777215;
                                var7 = var7 << 24 | 16777215;
                                class646.method5504((byte) -69);
                                class593.field1623.method4831(1, 0);
                                class48 var8 = class593.field1623.method4873(class759.field4331, class97.field614, true, -34894995);
                                class806 var9 = class593.field1623.method4942();
                                var9.method2839(0, var8.method3110());
                                class593.field1623.method5009(var9, (byte) 28);
                                this.field143.method6325(true, 2128455067);
                                class593.field1623.method4818(var9, (byte) 8);
                                var8.method3114(0, 0, 0, var7, 1);
                                class593.field1623.method5009(var9, (byte) -59);
                                class593.field1623.method4831(1, 0);
                                this.field142.method6325(true, 2141475636);
                                class593.field1623.method4818(var9, (byte) -56);
                                var8.method3114(0, 0, 0, var6, 1);
                            } else {
                                if (this.field143 != null) {
                                    this.field149 = true;
                                    this.field143.method6314((short) 371);
                                    this.field143 = null;
                                }

                                if (this.field149) {
                                    class646.method5504((byte) -56);
                                    if (class593.field1623 != null) {
                                        class593.field1623.method4831(1, 0);
                                    }
                                }

                                this.field142.method6325(this.field149 || class593.field1623 != null && class593.field1623.method4908(), 2145176958);
                            }

                            try {
                                if (class593.field1623 != null && !(this.field142 instanceof class650)) {
                                    class593.field1623.method4796((byte) 101);
                                }
                            } catch (class937 var15) {
                                class764.method2747(var15.getMessage() + class5.field4944.method1311((byte) 1), var15, (short) 3171);
                                class337.method77(0, true, 622850291);
                            }
                        }

                        this.field149 = false;
                        if (class593.field1623 != null && !(this.field142 instanceof class650) && this.field141.field7500 < class431.field7497.field7500) {
                            class791.method398((byte) -100);
                        }
                    } catch (Exception var16) {
                        continue;
                    }
                }

                long var11 = class27.resetTimer((byte) 1);
                int var13 = (int) (20L - (var11 - var1));
                if (var13 > 0) {
                    class764.method2745((long) var13);
                }
            }

        } catch (RuntimeException var18) {
            throw class158.method3445(var18, "jf.run(" + ')');
        }
    }

    synchronized void method123(long var1, String var3, int var4, class431 var5, int var6) {
        try {
            this.field146 = var1;
            this.field147 = var3;
            this.field148 = var4;
            this.field141 = var5;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "jf.i(" + ')');
        }
    }
}
