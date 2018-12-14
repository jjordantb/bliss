public class class695 {
    static int field7262 = 7;
    int field7251;
    int[] field7252;
    byte[] field7253;
    byte[][] field7254;
    int[] field7255;
    int[] field7256;
    int[] field7257;
    class143 field7258;
    int field7259;
    int[] field7260;
    int[][] field7261;
    int[] field7263;
    int[][] field7264;
    int field7265;
    class143[] field7266;
    int field7267;

    class695(byte[] var1, int var2, byte[] var3) {
        this.field7251 = class528.method2247(var1, var1.length, -1939068825);
        if (var2 != this.field7251) {
            throw new RuntimeException();
        } else {
            if (var3 != null) {
                if (var3.length != 64) {
                    throw new RuntimeException();
                }

                this.field7253 = class76.method1111(var1, 0, var1.length, (byte) 28);

                for (int var4 = 0; var4 < 64; ++var4) {
                    if (this.field7253[var4] != var3[var4]) {
                        throw new RuntimeException();
                    }
                }
            }

            this.method3936(var1, -1483175870);
        }
    }

    public static class471 method3937(int var0, byte var1) {
        try {
            return class886.field10136 && var0 >= class769.field3692 && var0 <= class886.field10135 ? class277.field10606[var0 - class769.field3692] : null;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jo.a(" + ')');
        }
    }

    static final void method3938(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -58);
            var0.field3161[++var0.field3156 - 1] = var3.field935;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "jo.rs(" + ')');
        }
    }

    static final void method3939(class744 var0, byte var1) {
        try {
            class842.method5468((String) var0.field3157[--var0.field3158], -1257906929);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jo.sa(" + ')');
        }
    }

    static final void method3940(class744 var0, short var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class730.field2800 == null ? -1 : -440872681 * class730.field2800.field867 * 533296807;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jo.api(" + ')');
        }
    }

    void method3936(byte[] var1, int var2) {
        try {
            InputStream var3 = new InputStream(class35.method3335(var1, -1012105553));
            int var4 = var3.method6371();
            if (var4 >= 5 && var4 <= 7) {
                if (var4 >= 6) {
                    this.field7267 = var3.method6420((byte) -6);
                } else {
                    this.field7267 = 0;
                }

                int var5 = var3.method6371();
                boolean var6 = (var5 & 1) != 0;
                boolean var7 = (var5 & 2) != 0;
                if (var4 >= 7) {
                    this.field7265 = var3.method6384(-2145456050);
                } else {
                    this.field7265 = var3.method6374();
                }

                int var8 = 0;
                int var9 = -1;
                this.field7256 = new int[this.field7265];
                int var10;
                if (var4 >= 7) {
                    for (var10 = 0; var10 < this.field7265; ++var10) {
                        this.field7256[var10] = var8 += var3.method6384(-1791555856);
                        if (this.field7256[var10] > var9) {
                            var9 = this.field7256[var10];
                        }
                    }
                } else {
                    for (var10 = 0; var10 < this.field7265; ++var10) {
                        this.field7256[var10] = var8 += var3.method6374();
                        if (this.field7256[var10] > var9) {
                            var9 = this.field7256[var10];
                        }
                    }
                }

                this.field7259 = var9 + 1;
                this.field7260 = new int[this.field7259];
                if (var7) {
                    this.field7254 = new byte[this.field7259][];
                }

                this.field7252 = new int[this.field7259];
                this.field7263 = new int[this.field7259];
                this.field7264 = new int[this.field7259][];
                this.field7255 = new int[this.field7259];
                if (var6) {
                    this.field7257 = new int[this.field7259];

                    for (var10 = 0; var10 < this.field7259; ++var10) {
                        this.field7257[var10] = -1;
                    }

                    for (var10 = 0; var10 < this.field7265; ++var10) {
                        this.field7257[this.field7256[var10]] = var3.method6420((byte) -104);
                    }

                    this.field7258 = new class143(this.field7257);
                }

                for (var10 = 0; var10 < this.field7265; ++var10) {
                    this.field7260[this.field7256[var10]] = var3.method6420((byte) -119);
                }

                if (var7) {
                    for (var10 = 0; var10 < this.field7265; ++var10) {
                        byte[] var11 = new byte[64];
                        var3.method6381(var11, 0, 64, -953523806);
                        this.field7254[this.field7256[var10]] = var11;
                    }
                }

                for (var10 = 0; var10 < this.field7265; ++var10) {
                    this.field7252[this.field7256[var10]] = var3.method6420((byte) -83);
                }

                int var12;
                int var13;
                int var14;
                int var15;
                int var17;
                if (var4 >= 7) {
                    for (var10 = 0; var10 < this.field7265; ++var10) {
                        this.field7263[this.field7256[var10]] = var3.method6384(-2118512247);
                    }

                    for (var10 = 0; var10 < this.field7265; ++var10) {
                        var17 = this.field7256[var10];
                        var12 = this.field7263[var17];
                        var8 = 0;
                        var13 = -1;
                        this.field7264[var17] = new int[var12];

                        for (var14 = 0; var14 < var12; ++var14) {
                            var15 = this.field7264[var17][var14] = var8 += var3.method6384(-1695883199);
                            if (var15 > var13) {
                                var13 = var15;
                            }
                        }

                        this.field7255[var17] = 1 + var13;
                        if (var12 == 1 + var13) {
                            this.field7264[var17] = null;
                        }
                    }
                } else {
                    for (var10 = 0; var10 < this.field7265; ++var10) {
                        this.field7263[this.field7256[var10]] = var3.method6374();
                    }

                    for (var10 = 0; var10 < this.field7265; ++var10) {
                        var17 = this.field7256[var10];
                        var12 = this.field7263[var17];
                        var8 = 0;
                        var13 = -1;
                        this.field7264[var17] = new int[var12];

                        for (var14 = 0; var14 < var12; ++var14) {
                            var15 = this.field7264[var17][var14] = var8 += var3.method6374();
                            if (var15 > var13) {
                                var13 = var15;
                            }
                        }

                        this.field7255[var17] = 1 + var13;
                        if (var12 == 1 + var13) {
                            this.field7264[var17] = null;
                        }
                    }
                }

                if (var6) {
                    this.field7261 = new int[1 + var9][];
                    this.field7266 = new class143[1 + var9];

                    for (var10 = 0; var10 < this.field7265; ++var10) {
                        var17 = this.field7256[var10];
                        var12 = this.field7263[var17];
                        this.field7261[var17] = new int[this.field7255[var17]];

                        for (var13 = 0; var13 < this.field7255[var17]; ++var13) {
                            this.field7261[var17][var13] = -1;
                        }

                        for (var13 = 0; var13 < var12; ++var13) {
                            if (this.field7264[var17] != null) {
                                var14 = this.field7264[var17][var13];
                            } else {
                                var14 = var13;
                            }

                            this.field7261[var17][var14] = var3.method6420((byte) 46);
                        }

                        this.field7266[var17] = new class143(this.field7261[var17]);
                    }
                }

            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var16) {
            throw class158.method3445(var16, "jo.a(" + ')');
        }
    }
}
