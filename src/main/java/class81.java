import java.io.IOException;

public class class81 extends class341 {
    class348 field1085;

    static final void method866(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class643.method6119(var3, var4, var0, -724499626);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "aae.li(" + ')');
        }
    }

    void method246(int var1) {
        try {
            try {
                this.field1085.method179(-2144712239);
            } catch (Exception var3) {
                ;
            }

            this.field1085 = null;
            ++super.field304;
            super.field314 = -1;
            super.field312 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aae.k(" + ')');
        }
    }

    public boolean method238(int var1) {
        try {
            int var4;
            if (this.field1085 != null) {
                long var2 = class27.resetTimer((byte) 1);
                var4 = (int) (var2 - super.field310);
                super.field310 = var2;
                if (var4 > 200) {
                    var4 = 200;
                }

                super.field309 += var4;
                if (super.field309 > 30000) {
                    try {
                        this.field1085.method179(-2044434923);
                    } catch (Exception var21) {
                        ;
                    }

                    this.field1085 = null;
                }
            }

            if (this.field1085 == null) {
                return this.method235(1210007977) == 0 && this.method228(899560496) == 0;
            } else {
                boolean var19;
                try {
                    class448 var6;
                    for (var6 = (class448) super.field305.method2706(1668468099); var6 != null; var6 = (class448) super.field305.method2707(-1920602300)) {
                        super.field313.field10376 = 0;
                        super.field313.method6361(1);
                        super.field313.method6360(var6.field209);
                        this.field1085.method187(super.field313.field10375, 0, super.field313.field10375.length, 1349162562);
                        super.field311.method2704(var6, (byte) -109);
                    }

                    for (var6 = (class448) super.field307.method2706(-1137298228); var6 != null; var6 = (class448) super.field307.method2707(1503165244)) {
                        super.field313.field10376 = 0;
                        super.field313.method6361(0);
                        super.field313.method6360(var6.field209);
                        this.field1085.method187(super.field313.field10375, 0, super.field313.field10375.length, 385615633);
                        super.field301.method2704(var6, (byte) -76);
                    }

                    for (int var24 = 0; var24 < 100; ++var24) {
                        var4 = this.field1085.method176(1329342411);
                        if (var4 < 0) {
                            throw new IOException();
                        }

                        if (var4 == 0) {
                            if (var1 != -358267640) {
                                throw new IllegalStateException();
                            }
                            break;
                        }

                        super.field309 = 0;
                        byte var5 = 0;
                        if (super.field316 == null) {
                            var5 = 10;
                        } else if (super.field316.field7102 == 0) {
                            var5 = 1;
                        }

                        int var7;
                        int var8;
                        int var9;
                        if (var5 > 0) {
                            var7 = var5 - super.field306.field10376;
                            if (var7 > var4) {
                                var7 = var4;
                            }

                            this.field1085.method177(super.field306.field10375, super.field306.field10376, var7, (byte) 56);
                            if (super.field312 != 0) {
                                for (var8 = 0; var8 < var7; ++var8) {
                                    super.field306.field10375[super.field306.field10376 + var8] ^= super.field312;
                                }
                            }

                            super.field306.field10376 += var7;
                            if (super.field306.field10376 >= var5) {
                                if (super.field316 == null) {
                                    super.field306.field10376 = 0;
                                    var8 = super.field306.method6371();
                                    var9 = super.field306.method6420((byte) -46);
                                    int var10 = super.field306.method6371();
                                    int var11 = super.field306.method6420((byte) 41);
                                    int var12 = var10 & 127;
                                    boolean var13 = (var10 & 128) != 0;
                                    long var14 = ((long) var8 << 32) + (long) var9;
                                    Object var16 = null;
                                    class448 var17;
                                    if (var13) {
                                        for (var17 = (class448) super.field301.method2706(737223474); var17 != null; var17 = (class448) super.field301.method2707(-1305306888)) {
                                            if (var17.field209 == var14) {
                                                if (var1 != -358267640) {
                                                    throw new IllegalStateException();
                                                }
                                                break;
                                            }
                                        }
                                    } else {
                                        for (var17 = (class448) super.field311.method2706(-1834989032); var17 != null; var17 = (class448) super.field311.method2707(247272517)) {
                                            if (var14 == var17.field209) {
                                                if (var1 != -358267640) {
                                                    throw new IllegalStateException();
                                                }
                                                break;
                                            }
                                        }
                                    }

                                    if (var17 == null) {
                                        throw new IOException();
                                    }

                                    int var18 = var12 == 0 ? 5 : 9;
                                    super.field316 = var17;
                                    super.field316.field7101 = new InputStream(super.field316.field7100 + var18 + var11);
                                    super.field316.field7101.method6361(var12);
                                    super.field316.field7101.method6364(var11, 756032699);
                                    super.field316.field7102 = 10;
                                    super.field306.field10376 = 0;
                                } else {
                                    if (super.field316.field7102 != 0) {
                                        throw new IOException();
                                    }

                                    if (-1 == super.field306.field10375[0]) {
                                        super.field316.field7102 = 1;
                                        super.field306.field10376 = 0;
                                    } else {
                                        super.field316 = null;
                                    }
                                }
                            }
                        } else {
                            var7 = super.field316.field7101.field10375.length - super.field316.field7100;
                            var8 = 512 - super.field316.field7102;
                            if (var8 > var7 - super.field316.field7101.field10376) {
                                var8 = var7 - super.field316.field7101.field10376;
                            }

                            if (var8 > var4) {
                                var8 = var4;
                            }

                            this.field1085.method177(super.field316.field7101.field10375, super.field316.field7101.field10376, var8, (byte) -56);
                            if (super.field312 != 0) {
                                for (var9 = 0; var9 < var8; ++var9) {
                                    super.field316.field7101.field10375[super.field316.field7101.field10376 + var9] ^= super.field312;
                                }
                            }

                            super.field316.field7101.field10376 += var8;
                            super.field316.field7102 += var8;
                            if (super.field316.field7101.field10376 == var7) {
                                super.field316.method156(-278229196);
                                super.field316.field3464 = false;
                                super.field316 = null;
                            } else if (512 == super.field316.field7102) {
                                super.field316.field7102 = 0;
                            }
                        }
                    }

                    var19 = true;
                } catch (IOException var22) {
                    try {
                        this.field1085.method179(-2108190565);
                    } catch (Exception var20) {
                        ;
                    }

                    this.field1085 = null;
                    ++super.field304;
                    super.field314 = -2;
                    if (this.method235(1098571032) == 0 && this.method228(-1686765895) == 0) {
                        return true;
                    }

                    return false;
                }

                return var19;
            }
        } catch (RuntimeException var23) {
            throw class158.method3445(var23, "aae.d(" + ')');
        }
    }

    public void method230(boolean var1, int var2) {
        try {
            if (this.field1085 != null) {
                try {
                    super.field313.field10376 = 0;
                    super.field313.method6361(var1 ? 2 : 3);
                    super.field313.method6360(0L);
                    this.field1085.method187(super.field313.field10375, 0, super.field313.field10375.length, 1744086498);
                } catch (IOException var6) {
                    try {
                        this.field1085.method179(-2080652682);
                    } catch (Exception var5) {
                        ;
                    }

                    this.field1085 = null;
                    ++super.field304;
                    super.field314 = -2;
                }
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "aae.x(" + ')');
        }
    }

    public void method232(byte var1) {
        try {
            if (this.field1085 != null) {
                try {
                    super.field313.field10376 = 0;
                    super.field313.method6361(7);
                    super.field313.method6360(0L);
                    this.field1085.method187(super.field313.field10375, 0, super.field313.field10375.length, 1169980549);
                } catch (IOException var5) {
                    try {
                        this.field1085.method179(-2123957197);
                    } catch (Exception var4) {
                        ;
                    }

                    this.field1085 = null;
                    ++super.field304;
                    super.field314 = -2;
                }
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "aae.r(" + ')');
        }
    }

    public void method240(short var1) {
        try {
            if (this.field1085 != null) {
                this.field1085.method186((byte) 53);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "aae.n(" + ')');
        }
    }

    public void method233(byte var1) {
        try {
            if (this.field1085 != null) {
                this.field1085.method179(-2087316954);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "aae.q(" + ')');
        }
    }

    void method865(byte var1) {
        try {
            if (this.field1085 != null) {
                try {
                    super.field313.field10376 = 0;
                    super.field313.method6361(6);
                    super.field313.method6411(3, (byte) 103);
                    super.field313.method6362(0, 16711935);
                    this.field1085.method187(super.field313.field10375, 0, super.field313.field10375.length, 759871193);
                } catch (IOException var5) {
                    try {
                        this.field1085.method179(-2111171220);
                    } catch (Exception var4) {
                        ;
                    }

                    this.field1085 = null;
                    ++super.field304;
                    super.field314 = -2;
                }
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "aae.ah(" + ')');
        }
    }

    public void method231(Object var1, boolean var2, int var3) {
        try {
            if (this.field1085 != null) {
                try {
                    this.field1085.method179(-2074632995);
                } catch (Exception var8) {
                    ;
                }

                this.field1085 = null;
            }

            this.field1085 = (class348) var1;
            this.method865((byte) -1);
            this.method230(var2, -1391987547);
            super.field306.field10376 = 0;
            super.field316 = null;

            while (true) {
                class448 var4 = (class448) super.field311.method2705(-2123417897);
                if (var4 == null) {
                    while (true) {
                        var4 = (class448) super.field301.method2705(-2132898612);
                        if (var4 == null) {
                            if (super.field312 != 0) {
                                try {
                                    super.field313.field10376 = 0;
                                    super.field313.method6361(4);
                                    super.field313.method6361(super.field312);
                                    super.field313.method6364(0, -1954980636);
                                    this.field1085.method187(super.field313.field10375, 0, super.field313.field10375.length, 1173685692);
                                } catch (IOException var7) {
                                    try {
                                        this.field1085.method179(-2053859803);
                                    } catch (Exception var6) {
                                        ;
                                    }

                                    this.field1085 = null;
                                    ++super.field304;
                                    super.field314 = -2;
                                }
                            }

                            super.field309 = 0;
                            super.field310 = class27.resetTimer((byte) 1);
                            return;
                        }

                        super.field307.method2704(var4, (byte) -21);
                    }
                }

                super.field305.method2704(var4, (byte) -106);
            }
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "aae.u(" + ')');
        }
    }
}
