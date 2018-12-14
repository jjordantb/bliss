import java.util.Iterator;

public class class623 {

    public boolean field8945 = false;
    public long field8982;
    class572 field8937;
    class335 field8938;
    byte[][] field8939;
    class157 field8940;
    class335 field8941;
    class64 field8942;
    RegionBase field8943 = new RegionBase();
    RegionBase field8944 = new RegionBase();
    int field8946;
    int[] field8947;
    int field8948;
    class153 field8949;
    class418 field8950;
    byte[][] field8951;
    int field8952;
    int field8953;
    class327 field8954;
    boolean field8955;
    class923 field8956 = new class923(0, 0, 0, 0);
    float field8957;
    int field8958 = 0;
    class262[] field8959 = new class262[4];
    int[][] field8960;
    int field8961 = 1;
    class529 field8962;
    int[][] field8963;
    int field8964 = 0;
    int field8965 = 1;
    class572 field8966;
    int field8967;
    int[] field8968;
    byte[][][] field8969;
    int[] field8970;
    int[] field8971;
    int[] field8972;
    int[] field8973;
    SceneGraph field8974;
    byte[][] field8975;
    int field8976;
    ObjectDefinitionLoader field8977;
    byte[][] field8978;
    int[][] field8979;
    int[][][] field8980;
    byte[][] field8981;

    public class623(boolean var1) {
        this.field8955 = var1;
    }

    static final void method5318(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -54);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class640.method6189(var3, var4, var0, -1146943352);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "lt.ea(" + ')');
        }
    }

    static final void method5319(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
        try {
            String var4 = (String) var2.field3157[--var2.field3158];
            int[] var5 = class960.method2212(var4, var2, -1881953326);
            if (var5 != null) {
                var4 = var4.substring(0, var4.length() - 1);
            }

            var0.field980 = class634.method5872(var4, var2, -2046058202);
            var0.field981 = var5;
            var0.field963 = true;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "lt.ml(" + ')');
        }
    }

    public static class879 method5320(class848 var0, int var1, int var2, int var3, int var4, int var5, class879 var6, int var7, int var8, int var9, int var10, Animator var11, int var12) {
        try {
            if (var6 == null) {
                return null;
            } else {
                int var13 = 2055;
                if (var11 != null) {
                    var13 |= var11.method2785(-1790708337);
                    var13 &= -513;
                }

                long var14 = ((long) var8 << 48) + (long) ((var10 << 24) + (var9 << 16) + var5) + ((long) var7 << 32);
                class1 var16 = class759.field4330;
                class879 var17;
                synchronized (class759.field4330) {
                    var17 = (class879) class759.field4330.method2974(var14);
                }

                if (var17 == null || var0.method4836(var17.method5948(), var13) != 0) {
                    if (var17 != null) {
                        var13 = var0.method4817(var13, var17.method5948());
                    }

                    byte var33;
                    if (var5 == 1) {
                        var33 = 9;
                    } else if (2 == var5) {
                        var33 = 12;
                    } else if (var5 == 3) {
                        var33 = 15;
                    } else if (4 == var5) {
                        var33 = 18;
                    } else {
                        var33 = 21;
                    }

                    byte var18 = 3;
                    int[] var19 = new int[]{64, 96, 128};
                    class25 var20 = new class25(1 + var18 * var33, 2 * var18 * var33 - var33, 0);
                    int var21 = var20.method3450(0, 0, 0);
                    int[][] var22 = new int[var18][var33];

                    int var23;
                    int var24;
                    int var25;
                    int var28;
                    for (var23 = 0; var23 < var18; ++var23) {
                        var24 = var19[var23];
                        var25 = var19[var23];

                        for (int var26 = 0; var26 < var33; ++var26) {
                            int var27 = (var26 << 14) / var33;
                            var28 = var24 * class703.field3413[var27] >> 14;
                            int var29 = var25 * class703.field3404[var27] >> 14;
                            var22[var23][var26] = var20.method3450(var28, 0, var29);
                        }
                    }

                    for (var23 = 0; var23 < var18; ++var23) {
                        var24 = (128 + var23 * 256) / var18;
                        var25 = 256 - var24;
                        byte var39 = (byte) (var10 * var24 + var25 * var9 >> 8);
                        short var40 = (short) ((var25 * (var7 & 127) + var24 * (var8 & 127) & 32512) + ((var8 & 'ﰀ') * var24 + (var7 & 'ﰀ') * var25 & 16515072) + (var24 * (var8 & 896) + var25 * (var7 & 896) & 229376) >> 8);

                        for (var28 = 0; var28 < var33; ++var28) {
                            if (var23 == 0) {
                                var20.method3451(var21, var22[0][(1 + var28) % var33], var22[0][var28], (byte) 1, (byte) -1, var40, var39, (short) -1);
                            } else {
                                var20.method3451(var22[var23 - 1][var28], var22[var23 - 1][(1 + var28) % var33], var22[var23][(1 + var28) % var33], (byte) 1, (byte) -1, var40, var39, (short) -1);
                                var20.method3451(var22[var23 - 1][var28], var22[var23][(var28 + 1) % var33], var22[var23][var28], (byte) 1, (byte) -1, var40, var39, (short) -1);
                            }
                        }
                    }

                    var17 = var0.method4861(var20, var13, class519.field4213, 64, 768);
                    class1 var38 = class759.field4330;
                    synchronized (class759.field4330) {
                        class759.field4330.method2984(var17, var14);
                    }
                }

                int var34 = var6.method6099();
                int var35 = var6.method6006();
                int var36 = var6.method5978();
                int var37 = var6.method5979();
                if (var11 != null) {
                    var17 = var17.method6017((byte) 3, var13, true);
                    var17.method5955(var35 - var34 >> 1, 128, var37 - var36 >> 1);
                    var17.method5953(var34 + var35 >> 1, 0, var36 + var37 >> 1);
                    var11.method2787(var17, 574844997);
                } else {
                    var17 = var17.method6017((byte) 3, var13, true);
                    var17.method5955(var35 - var34 >> 1, 128, var37 - var36 >> 1);
                    var17.method5953(var34 + var35 >> 1, 0, var37 + var36 >> 1);
                }

                if (var2 != 0) {
                    var17.method5952(var2);
                }

                if (var3 != 0) {
                    var17.method6041(var3);
                }

                if (var4 != 0) {
                    var17.method5953(0, var4, 0);
                }

                return var17;
            }
        } catch (RuntimeException var32) {
            throw class158.method3445(var32, "lt.a(" + ')');
        }
    }

    public class529 method5269(byte var1) {
        try {
            return this.field8962;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.f(" + ')');
        }
    }

    public RegionBase getRegionBase(int var1) {
        try {
            return this.field8943;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.i(" + ')');
        }
    }

    public int method5271(int var1) {
        try {
            return this.field8976;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.k(" + ')');
        }
    }

    public int method5272(int var1) {
        try {
            return this.field8948;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.d(" + ')');
        }
    }

    public class64 method5273(int var1) {
        try {
            return this.field8942;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.u(" + ')');
        }
    }

    public class923 method5274(int var1) {
        try {
            return this.field8956;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.x(" + ')');
        }
    }

    public float method5275(int var1) {
        try {
            return this.field8957;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.r(" + ')');
        }
    }

    public int method5276(byte var1) {
        try {
            return this.field8952;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.q(" + ')');
        }
    }

    public int method5277(int var1) {
        try {
            return this.field8953;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.n(" + ')');
        }
    }

    void method5278(class572 var1, byte[][] var2, byte var3) {
        try {
            int var4;
            int var5;
            int var6;
            int var7;
            for (var4 = 0; var4 < var1.field4997; ++var4) {
                if (!this.field8955) {
                    class341.method252(-286862514);
                }

                for (var5 = 0; var5 < this.field8976 >> 3; ++var5) {
                    for (var6 = 0; var6 < this.field8948 >> 3; ++var6) {
                        var7 = this.field8980[var4][var5][var6];
                        if (-1 != var7) {
                            int var8 = var7 >> 24 & 3;
                            if (!var1.field5000 || var8 == 0) {
                                int var9 = var7 >> 1 & 3;
                                int var10 = var7 >> 14 & 1023;
                                int var11 = var7 >> 3 & 2047;
                                int var12 = var11 / 8 + (var10 / 8 << 8);

                                for (int var13 = 0; var13 < this.field8968.length; ++var13) {
                                    if (var12 == this.field8968[var13] && var2[var13] != null) {
                                        InputStream var14 = new InputStream(var2[var13]);
                                        var1.method3036(var14, var4, var5 * 8, var6 * 8, var8, var10, var11, var9, this.field8959, -828677341);
                                        var1.method99(class593.field1623, var14, var4, 8 * var5, 8 * var6, var8, var10, var11, var9, -2145736118);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            for (var4 = 0; var4 < var1.field4997; ++var4) {
                if (!this.field8955) {
                    class341.method252(788826930);
                }

                for (var5 = 0; var5 < this.field8976 >> 3; ++var5) {
                    for (var6 = 0; var6 < this.field8948 >> 3; ++var6) {
                        var7 = this.field8980[var4][var5][var6];
                        if (-1 == var7) {
                            var1.method3034(var4, 8 * var5, 8 * var6, 8, 8, 335584387);
                        }
                    }
                }
            }

        } catch (RuntimeException var15) {
            throw class158.method3445(var15, "lt.aq(" + ')');
        }
    }

    public byte[][] method5279(int var1, int var2) {
        try {
            return this.field8966 != null && this.field8966.field5002 != null && this.field8966.field5002[var1] != null ? this.field8966.field5002[var1] : null;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "lt.z(" + ')');
        }
    }

    public int[][] method5280(int var1) {
        try {
            return this.field8963;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.e(" + ')');
        }
    }

    public class262 method5281(int var1) {
        try {
            return this.field8959[var1];
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.t(" + ')');
        }
    }

    public class418 method5282(byte var1) {
        try {
            return this.field8950;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.h(" + ')');
        }
    }

    public ObjectDefinitionLoader getObjectDefinitionLoader() {
        try {
            return this.field8977;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.v(" + ')');
        }
    }

    public byte[][][] method5284(int var1) {
        try {
            return this.field8969;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.c(" + ')');
        }
    }

    public void method5285(byte[][][] var1, int var2) {
        try {
            this.field8969 = var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "lt.m(" + ')');
        }
    }

    public class572 method5286(int var1) {
        try {
            return this.field8966;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.w(" + ')');
        }
    }

    public void method5287(ObjectDefinitionLoader var1, int var2) {
        try {
            this.field8977 = var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "lt.j(" + ')');
        }
    }

    public void method5288(byte var1) {
        try {
            if (this.field8974 != null) {
                class621.method5261((byte) 1);
                this.field8974.field3873.method4610(-1174492425);
                this.field8974 = null;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.l(" + ')');
        }
    }

    public void method5289(int var1) {
        try {
            this.field8950 = new class418(class593.field1623, this.field8976 >> 3, this.field8948 >> 3);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.aa(" + ')');
        }
    }

    public void method5290(int var1) {
        try {
            this.field8952 = 200;
            this.field8953 = (int) (34.46D * (double) this.field8976);
            this.field8953 <<= 2;
            if (class593.field1623.method4810()) {
                this.field8953 += 512;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.ak(" + ')');
        }
    }

    void method5291(byte var1) {
        try {
            if (this.field8938 != class335.field44 && class335.field44 != this.field8941) {
                if (this.field8938 == class335.field52 || this.field8938 == class335.field43 || this.field8941 != this.field8938 && (class335.field45 == this.field8938 || this.field8941 == class335.field45)) {
                    class730.field2684 = 0;
                    class730.field2753 = 0;
                    class730.field2677.method2941((byte) -6);
                }

                this.field8941 = this.field8938;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.as(" + ')');
        }
    }

    public void method5292(class406 var1, int var2) {
        try {
            this.field8938 = var1.field9266;
            if (this.field8938 == class335.field46) {
                this.method5293(-1676557011);
            } else if (this.field8938 == class335.field45) {
                this.method5294(var1.field9265, -444215668);
            } else if (this.field8938 == class335.field44) {
                this.method5307((byte) -112);
            } else if (this.field8938.method36(-1578454249)) {
                this.method5295(var1.field9265, 1483918042);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "lt.ad(" + ')');
        }
    }

    void method5293(int var1) {
        try {
            this.method5297(class283.method6641(class615.field8903.field9124.method1910(-369768513), 2010588610), 226677224);
            int var2 = this.field8943.baseX;
            int var3 = this.field8943.baseY;
            int var4 = (class103.field205 >> 12) + (var2 >> 3);
            int var5 = (var3 >> 3) + (class7.field4918 >> 12);
            class923.local.field3639 = 0;
            class899.field9552 = 0;
            class923.local.method1995(8, 8, -1960083958);
            byte var6 = 18;
            this.field8979 = new int[var6][4];
            this.field8968 = new int[var6];
            this.field8947 = new int[var6];
            this.field8970 = new int[var6];
            this.field8971 = new int[var6];
            this.field8975 = new byte[var6][];
            this.field8951 = new byte[var6][];
            this.field8981 = new byte[var6][];
            this.field8972 = new int[var6];
            this.field8973 = new int[var6];
            this.field8978 = new byte[var6][];
            this.field8939 = new byte[var6][];
            int var11 = 0;

            int var7;
            for (var7 = (var4 - (this.field8976 >> 4)) / 8; var7 <= ((this.field8976 >> 4) + var4) / 8; ++var7) {
                for (int var8 = (var5 - (this.field8948 >> 4)) / 8; var8 <= ((this.field8948 >> 4) + var5) / 8; ++var8) {
                    int var9 = (var7 << 8) + var8;
                    this.field8968[var11] = var9;
                    this.field8947[var11] = class948.field3291.method3281(this.method5311(true, false, var7, var8, (byte) -40), -2024507927);
                    this.field8970[var11] = class948.field3291.method3281(this.method5311(false, false, var7, var8, (byte) 85), -1204727759);
                    this.field8971[var11] = class948.field3291.method3281("n" + var7 + '_' + var8, -386533519);
                    this.field8972[var11] = class948.field3291.method3281(this.method5311(true, true, var7, var8, (byte) -47), -1725557270);
                    this.field8973[var11] = class948.field3291.method3281(this.method5311(false, true, var7, var8, (byte) -30), -1962303314);
                    if (this.field8971[var11] == -1) {
                        this.field8947[var11] = -1;
                        this.field8970[var11] = -1;
                        this.field8972[var11] = -1;
                        this.field8973[var11] = -1;
                    }

                    ++var11;
                }
            }

            for (var7 = var11; var7 < this.field8971.length; ++var7) {
                this.field8971[var7] = -1;
                this.field8947[var7] = -1;
                this.field8970[var7] = -1;
                this.field8972[var7] = -1;
                this.field8973[var7] = -1;
            }

            byte var12;
            if (class730.field2733 == 19) {
                var12 = 1;
            } else if (18 == class730.field2733) {
                var12 = 16;
            } else if (14 == class730.field2733) {
                var12 = 15;
            } else {
                if (class730.field2733 != 8) {
                    throw new RuntimeException("" + class730.field2733);
                }

                var12 = 9;
            }

            this.method5299(var4, var5, var12, false, -815771659);
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "lt.av(" + ')');
        }
    }

    void method5294(class513 var1, int var2) {
        try {
            int var3 = var1.method6396((short) -9830);
            boolean var4 = var1.method6371() == 1;
            int var5 = var1.method6374();
            int var6 = var1.method6374();
            if (!this.field8955) {
                this.method5291((byte) 38);
            }

            this.method5297(class283.method6641(var3, -1114771755), 226677224);
            int var7 = (var1.field10375.length - var1.field10376) / 16;
            this.field8979 = new int[var7][4];

            int var8;
            int var9;
            for (var8 = 0; var8 < var7; ++var8) {
                for (var9 = 0; var9 < 4; ++var9) {
                    this.field8979[var8][var9] = var1.method6420((byte) 40);
                }
            }

            this.field8968 = new int[var7];
            this.field8947 = new int[var7];
            this.field8970 = new int[var7];
            this.field8971 = null;
            this.field8975 = new byte[var7][];
            this.field8951 = new byte[var7][];
            this.field8981 = null;
            this.field8972 = new int[var7];
            this.field8973 = new int[var7];
            this.field8978 = new byte[var7][];
            this.field8939 = new byte[var7][];
            var7 = 0;

            for (var8 = (var5 - (this.field8976 >> 4)) / 8; var8 <= (var5 + (this.field8976 >> 4)) / 8; ++var8) {
                for (var9 = (var6 - (this.field8948 >> 4)) / 8; var9 <= ((this.field8948 >> 4) + var6) / 8; ++var9) {
                    this.field8968[var7] = var9 + (var8 << 8);
                    this.field8947[var7] = class948.field3291.method3281(this.method5311(true, false, var8, var9, (byte) -113), -317623107);
                    this.field8970[var7] = class948.field3291.method3281(this.method5311(false, false, var8, var9, (byte) -82), -1013661811);
                    this.field8972[var7] = class948.field3291.method3281(this.method5311(true, true, var8, var9, (byte) -99), -1834537704);
                    this.field8973[var7] = class948.field3291.method3281(this.method5311(false, true, var8, var9, (byte) -80), -1244616261);
                    ++var7;
                }
            }

            this.method5299(var5, var6, 17, var4, -815771659);
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "lt.at(" + ')');
        }
    }

    void method5295(class513 var1, int var2) {
        try {
            int var3 = var1.method6397((byte) 93);
            if (1 == var3) {
                this.field8938 = class335.field52;
            } else if (2 == var3) {
                this.field8938 = class335.field47;
            } else if (var3 == 3) {
                this.field8938 = class335.field43;
            } else if (4 == var3) {
                this.field8938 = class335.field48;
            }

            int var4 = var1.method6401((byte) -29);
            int var5 = var1.method6403(1478539457);
            int var6 = var1.method6397((byte) 19);
            boolean var7 = (var6 & 1) != 0;
            int var8 = var1.method6396((short) -21481);
            if (!this.field8955) {
                this.method5291((byte) 124);
            }

            this.method5297(class283.method6641(var8, 1925270996), 226677224);
            var1.method2650(-1836176958);

            int var9;
            int var10;
            int var11;
            int var12;
            for (var9 = 0; var9 < 4; ++var9) {
                for (var10 = 0; var10 < this.field8976 >> 3; ++var10) {
                    for (var11 = 0; var11 < this.field8948 >> 3; ++var11) {
                        var12 = var1.method2647(1);
                        if (1 == var12) {
                            this.field8980[var9][var10][var11] = var1.method2647(26);
                        } else {
                            this.field8980[var9][var10][var11] = -1;
                        }
                    }
                }
            }

            var1.method2648((byte) 65);
            var9 = (var1.field10375.length - var1.field10376) / 16;
            this.field8979 = new int[var9][4];

            for (var10 = 0; var10 < var9; ++var10) {
                for (var11 = 0; var11 < 4; ++var11) {
                    this.field8979[var10][var11] = var1.method6420((byte) -51);
                }
            }

            this.field8968 = new int[var9];
            this.field8947 = new int[var9];
            this.field8970 = new int[var9];
            this.field8971 = null;
            this.field8975 = new byte[var9][];
            this.field8951 = new byte[var9][];
            this.field8981 = null;
            this.field8972 = new int[var9];
            this.field8973 = new int[var9];
            this.field8978 = new byte[var9][];
            this.field8939 = new byte[var9][];
            var9 = 0;

            for (var10 = 0; var10 < 4; ++var10) {
                for (var11 = 0; var11 < this.field8976 >> 3; ++var11) {
                    for (var12 = 0; var12 < this.field8948 >> 3; ++var12) {
                        int var13 = this.field8980[var10][var11][var12];
                        if (var13 != -1) {
                            int var14 = var13 >> 14 & 1023;
                            int var15 = var13 >> 3 & 2047;
                            int var16 = (var14 / 8 << 8) + var15 / 8;

                            int var17;
                            for (var17 = 0; var17 < var9; ++var17) {
                                if (var16 == this.field8968[var17]) {
                                    var16 = -1;
                                    break;
                                }
                            }

                            if (-1 != var16) {
                                this.field8968[var9] = var16;
                                var17 = var16 >> 8 & 255;
                                int var18 = var16 & 255;
                                this.field8947[var9] = class948.field3291.method3281(this.method5311(true, false, var17, var18, (byte) -94), -976709735);
                                this.field8970[var9] = class948.field3291.method3281(this.method5311(false, false, var17, var18, (byte) -94), -666597667);
                                this.field8972[var9] = class948.field3291.method3281(this.method5311(true, true, var17, var18, (byte) 105), -1176293113);
                                this.field8973[var9] = class948.field3291.method3281(this.method5311(false, true, var17, var18, (byte) 23), -1142086956);
                                ++var9;
                            }
                        }
                    }
                }
            }

            this.method5299(var5, var4, 17, var7, -815771659);
        } catch (RuntimeException var19) {
            throw class158.method3445(var19, "lt.ah(" + ')');
        }
    }

    public class153 method5296(int var1) {
        try {
            return this.field8949;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.y(" + ')');
        }
    }

    void method5297(class157 var1, int var2) {
        try {
            if (var1 != this.field8940) {
                this.field8976 = this.field8948 = var1.field6551;
                this.field8980 = new int[4][this.field8976 >> 3][this.field8948 >> 3];
                this.field8960 = new int[this.field8976][this.field8948];
                this.field8963 = new int[this.field8976][this.field8948];

                for (int var3 = 0; var3 < 4; ++var3) {
                    this.field8959[var3] = class47.method3087(this.field8976, this.field8948, -617039163);
                }

                this.field8969 = new byte[4][this.field8976][this.field8948];
                this.field8949 = new class153(4, this.field8976, this.field8948);
                this.method5289(-1528485886);
                this.field8940 = var1;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "lt.az(" + ')');
        }
    }

    public int[][] method5298(byte var1) {
        try {
            return this.field8960;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.g(" + ')');
        }
    }

    void method5299(int var1, int var2, int var3, boolean var4, int var5) {
        try {
            if (class730.field2705 == 2) {
                if (this.field8955) {
                    throw new IllegalStateException();
                }

                class730.field2705 = 3;
                class730.field2852 = -1;
            }

            if (var4 || this.field8967 != var1 || var2 != this.field8946) {
                this.field8967 = var1;
                this.field8946 = var2;
                if (!this.field8955) {
                    class967.method1750(var3, 430070283);
                    class971.method1789(class814.field4748.method2927(class321.field1066, -875414210), true, class593.field1623, class958.field3479, class378.field1158, (byte) 103);
                }

                if (this.field8943 != null) {
                    this.field8944 = this.field8943;
                } else {
                    this.field8944 = new RegionBase(0, 0, 0);
                }

                this.field8943 = new RegionBase(0, 8 * (this.field8967 - (this.field8976 >> 4)), 8 * (this.field8946 - (this.field8948 >> 4)));
                this.field8954 = class491.method4415(this.field8943.baseX, this.field8943.baseY);
                this.field8942 = null;
                if (!this.field8955) {
                    this.method5305(var3, 1177231331);
                }
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "lt.ap(" + ')');
        }
    }

    void method5300(int var1, byte var2) {
        try {
            try {
                Thread.sleep((long) var1);
            } catch (InterruptedException var4) {
                ;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "lt.aj(" + ')');
        }
    }

    void method5301(class572 var1, byte[][] var2, short var3) {
        try {
            int var4 = var2.length;

            int var5;
            for (var5 = 0; var5 < var4; ++var5) {
                byte[] var6 = var2[var5];
                if (var6 != null) {
                    InputStream var7 = new InputStream(var6);
                    int var8 = this.field8968[var5] >> 8;
                    int var9 = this.field8968[var5] & 255;
                    int var10 = 64 * var8 - this.field8943.baseX;
                    int var11 = 64 * var9 - this.field8943.baseY;
                    if (!this.field8955) {
                        class341.method252(408539711);
                    }

                    var1.method3035(var7, var10, var11, this.field8943.baseX, this.field8943.baseY, this.field8959, -391880689);
                    var1.method98(class593.field1623, var7, var10, var11, (byte) -72);
                }
            }

            for (var5 = 0; var5 < var4; ++var5) {
                int var13 = (this.field8968[var5] >> 8) * 64 - this.field8943.baseX;
                int var14 = (this.field8968[var5] & 255) * 64 - this.field8943.baseY;
                byte[] var15 = var2[var5];
                if (var15 == null && this.field8946 < 800) {
                    if (!this.field8955) {
                        class341.method252(-918952780);
                    }

                    var1.method3033(var13, var14, 64, 64, (byte) 0);
                }
            }

        } catch (RuntimeException var12) {
            throw class158.method3445(var12, "lt.ay(" + ')');
        }
    }

    void method5302(class572 var1, byte[][] var2, byte var3) {
        try {
            int var4 = this.field8975.length;

            for (int var5 = 0; var5 < var4; ++var5) {
                byte[] var6 = var2[var5];
                if (var6 != null) {
                    int var7 = 64 * (this.field8968[var5] >> 8) - this.field8943.baseX;
                    int var8 = (this.field8968[var5] & 255) * 64 - this.field8943.baseY;
                    if (!this.field8955) {
                        class341.method252(-802890876);
                    }

                    var1.method100(class593.field1623, var6, var7, var8, this.field8959, 1861855341);
                    if (this.field8955) {
                        this.method5300(10, (byte) 22);
                    }
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "lt.ag(" + ')');
        }
    }

    void method5303(int var1) {
        try {
            int var2 = this.field8981.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                if (this.field8981[var3] != null) {
                    int var4 = -1;

                    for (int var5 = 0; var5 < class730.field2702; ++var5) {
                        if (this.field8968[var3] == class730.field2732[var5]) {
                            var4 = var5;
                            break;
                        }
                    }

                    if (var4 == -1) {
                        class730.field2732[class730.field2702] = this.field8968[var3];
                        var4 = ++class730.field2702 - 1;
                    }

                    InputStream var19 = new InputStream(this.field8981[var3]);
                    int var6 = 0;

                    while (var19.field10376 < this.field8981[var3].length && var6 < 511 && class730.field2684 < 1023) {
                        int var7 = var4 | var6++ << 6;
                        int var8 = var19.method6374();
                        int var9 = var8 >> 14;
                        int var10 = var8 >> 7 & 63;
                        int var11 = var8 & 63;
                        int var12 = 64 * (this.field8968[var3] >> 8) - this.field8943.baseX + var10;
                        int var13 = var11 + (64 * (this.field8968[var3] & 255) - this.field8943.baseY);
                        NpcDefinition var14 = class258.field7913.method12(var19.method6374(), -806262033);
                        class437 var15 = (class437) class730.field2677.method2942((long) var7);
                        if (var15 == null && (var14.field9906 & 1) > 0 && var12 >= 0 && var14.field9923 + var12 < this.field8976 && var13 >= 0 && var13 + var14.field9923 < this.field8948) {
                            Npc var16 = new Npc(this.field8974);
                            var16.field4028 = var7;
                            class437 var17 = new class437(var16);
                            class730.field2677.method2947(var17, (long) var7);
                            class730.field2797[++class730.field2753 - 1] = var17;
                            class730.field2680[++class730.field2684 - 1] = var7;
                            var16.field4039 = class730.field2866;
                            var16.method1248(var14, 1908625985);
                            var16.method2549(var16.field1637.field9923, -948262466);
                            var16.field4079 = var16.field1637.field9917 << 3;
                            var16.method2543(var16.field1637.field9919.method1133((byte) 73).method89(694163818) << 11 & 16383, true, 822135678);
                            var16.method1240(var9, var12, var13, true, var16.method2550(), (byte) 78);
                        }
                    }
                }
            }

        } catch (RuntimeException var18) {
            throw class158.method3445(var18, "lt.au(" + ')');
        }
    }

    public int method5304(int var1) {
        try {
            return 100 - this.field8964 * 100 / this.field8965;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.b(" + ')');
        }
    }

    void method5305(int var1, int var2) {
        try {
            int var3 = this.field8943.baseX - this.field8944.baseX;
            int var4 = this.field8943.baseY - this.field8944.baseY;
            int var5;
            int var8;
            int var16;
            int var18;
            if (17 == var1) {
                for (var5 = 0; var5 < class730.field2753; ++var5) {
                    class437 var6 = class730.field2797[var5];
                    if (var6 != null) {
                        Npc var7 = (Npc) var6.field7515;

                        for (var8 = 0; var8 < var7.field4085.length; ++var8) {
                            var7.field4085[var8] -= var3;
                            var7.field4055[var8] -= var4;
                        }

                        RegionOffset var22 = RegionOffset.translate(var7.getRegion().regionOffset);
                        var22.offsetX -= (float) (512 * var3);
                        var22.offsetY -= (float) (var4 * 512);
                        var7.method1514(var22);
                        var22.method3291();
                    }
                }
            } else {
                boolean var15 = false;
                class730.field2684 = 0;
                var16 = this.field8976 * 512 - 512;
                var18 = this.field8948 * 512 - 512;

                for (var8 = 0; var8 < class730.field2753; ++var8) {
                    class437 var9 = class730.field2797[var8];
                    if (var9 != null) {
                        Npc var10 = (Npc) var9.field7515;
                        RegionOffset var11 = RegionOffset.translate(var10.getRegion().regionOffset);
                        var11.offsetX -= (float) (512 * var3);
                        var11.offsetY -= (float) (512 * var4);
                        var10.method1514(var11);
                        if ((int) var11.offsetX >= 0 && (int) var11.offsetX <= var16 && (int) var11.offsetY >= 0 && (int) var11.offsetY <= var18) {
                            boolean var12 = true;

                            for (int var13 = 0; var13 < var10.field4085.length; ++var13) {
                                var10.field4085[var13] -= var3;
                                var10.field4055[var13] -= var4;
                                if (var10.field4085[var13] < 0 || var10.field4085[var13] >= this.field8976 || var10.field4055[var13] < 0 || var10.field4055[var13] >= this.field8948) {
                                    var12 = false;
                                }
                            }

                            if (var12) {
                                class730.field2680[++class730.field2684 - 1] = var10.field4028;
                            } else {
                                var10.method1248((NpcDefinition) null, 2025506166);
                                var9.method545(-1460969981);
                                var15 = true;
                            }
                        } else {
                            var10.method1248((NpcDefinition) null, 1741344135);
                            var9.method545(-1460969981);
                            var15 = true;
                        }

                        var11.method3291();
                    }
                }

                if (var15) {
                    class730.field2753 = class730.field2677.method2944(2145683355);
                    var8 = 0;

                    class437 var27;
                    for (Iterator var25 = class730.field2677.iterator(); var25.hasNext(); class730.field2797[var8++] = var27) {
                        var27 = (class437) var25.next();
                    }
                }
            }

            for (var5 = 0; var5 < 2048; ++var5) {
                Player var17 = class730.loaded[var5];
                if (var17 != null) {
                    for (var18 = 0; var18 < var17.field4085.length; ++var18) {
                        var17.field4085[var18] -= var3;
                        var17.field4055[var18] -= var4;
                    }

                    RegionOffset var21 = RegionOffset.translate(var17.getRegion().regionOffset);
                    var21.offsetX -= (float) (512 * var3);
                    var21.offsetY -= (float) (var4 * 512);
                    var17.method1514(var21);
                    var21.method3291();
                }
            }

            class921[] var19 = class730.field2851;

            for (var16 = 0; var16 < var19.length; ++var16) {
                class921 var23 = var19[var16];
                if (var23 != null) {
                    var23.field10281 -= var3 * 512;
                    var23.field10282 -= var4 * 512;
                }
            }

            class563 var20;
            for (var20 = (class563) class563.field1071.method901(1766612795); var20 != null; var20 = (class563) class563.field1071.method906(49146)) {
                var20.field1069 -= var3;
                var20.field1074 -= var4;
                if (this.field8938 != class335.field48 && (var20.field1069 < 0 || var20.field1074 < 0 || var20.field1069 >= this.field8976 || var20.field1074 >= this.field8948)) {
                    var20.method545(-1460969981);
                }
            }

            for (var20 = (class563) class563.field1081.method901(1766612795); var20 != null; var20 = (class563) class563.field1081.method906(49146)) {
                var20.field1069 -= var3;
                var20.field1074 -= var4;
                if (this.field8938 != class335.field48 && (var20.field1069 < 0 || var20.field1074 < 0 || var20.field1069 >= this.field8976 || var20.field1074 >= this.field8948)) {
                    var20.method545(-1460969981);
                }
            }

            for (class508 var24 = (class508) class730.field2666.method2946(1670233657); var24 != null; var24 = (class508) class730.field2666.method2945((byte) -33)) {
                var18 = (int) (var24.field641 >> 28 & 3L);
                var8 = (int) (var24.field641 & 16383L);
                int var26 = var8 - this.field8943.baseX;
                int var28 = (int) (var24.field641 >> 14 & 16383L);
                int var29 = var28 - this.field8943.baseY;
                if (this.field8974 != null) {
                    if (var26 >= 0 && var29 >= 0 && var26 < this.field8976 && var29 < this.field8948 && var26 < this.field8974.field3859 && var29 < this.field8974.field3894) {
                        if (this.field8974.field3861 != null) {
                            this.field8974.method2453(var18, var26, var29, (byte) 116);
                        }
                    } else if (this.field8938 != class335.field48) {
                        var24.method545(-1460969981);
                    }
                }
            }

            if (class95.field601 != 0) {
                class95.field601 -= var3;
                class95.field593 -= var4;
            }

            class127.method1600(-1799857115);
            class897.method5624(false, -1299725311);
            if (17 == var1) {
                class730.field2734 -= var3 * 512;
                class730.field2736 -= var4 * 512;
                class456.field7163 -= 512 * var3;
                class530.field3741 -= 512 * var4;
                if (2 != class563.field1083) {
                    class563.field1083 = 4;
                    class516.field4332 = -1;
                    class495.field8099 = -1;
                }
            } else {
                class747.field4147 -= var3;
                class124.field2411 -= var4;
                SceneGraphLevel.field7231 -= var3;
                class764.field4349 -= var4;
                class103.field205 -= var3 * 512;
                class7.field4918 -= var4 * 512;
                if (Math.abs(var3) > this.field8976 || Math.abs(var4) > this.field8948) {
                    this.field8950.method5673(-1910257839);
                }
            }

            class906.method6342(2108312995);
            class410.method5637(632959802);
            class730.field2806.method2941((byte) -16);
            class730.field2805.method905((byte) 1);
            class730.field2631.method5208(268098313);
            class630.method5890((short) 255);
        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "lt.af(" + ')');
        }
    }

    void method5306(byte var1) {
        try {
            this.field8937 = null;
            this.field8966 = null;

            for (int var2 = 0; var2 < 4; ++var2) {
                if (this.field8959[var2] != null) {
                    this.field8959[var2].method4517(-2096339600);
                }
            }

            if (this.field8949 != null) {
                this.field8949.method3385(-1035232458);
            }

            if (this.field8950 != null) {
                this.field8950.method5669((byte) 38);
            }

            if (this.field8974 != null) {
                this.field8974.field3873.method4610(-1174492425);
                this.field8974 = null;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.aw(" + ')');
        }
    }

    void method5307(byte var1) {
        try {
            this.field8941 = this.field8938;
            this.method5297(class157.field6552, 226677224);

            int var2;
            int var3;
            int var4;
            for (var2 = 0; var2 < 4; ++var2) {
                for (var3 = 0; var3 < this.field8976 >> 3; ++var3) {
                    for (var4 = 0; var4 < this.field8948 >> 3; ++var4) {
                        this.field8980[var2][var3][var4] = -1;
                    }
                }
            }

            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            for (class459 var21 = (class459) class949.field3327.method901(1766612795); var21 != null; var21 = (class459) class949.field3327.method906(49146)) {
                var3 = var21.field7276;
                boolean var23 = (var3 & 1) == 1;
                var5 = var21.field7274 >> 3;
                var6 = var21.field7268 >> 3;
                var7 = var21.field7272;
                var8 = var21.field7273;
                var9 = var21.field7270;
                var10 = var21.field7271;
                var11 = var21.field7275;
                int var12 = var21.field7269;
                int var13 = 0;
                int var14 = 0;
                byte var15 = 1;
                byte var16 = 1;
                if (1 == var3) {
                    var14 = var11 - 1;
                    var15 = -1;
                } else if (2 == var3) {
                    var14 = var11 - 1;
                    var13 = var12 - 1;
                    var15 = -1;
                    var16 = -1;
                } else if (var3 == 3) {
                    var13 = var12 - 1;
                    var15 = 1;
                    var16 = -1;
                }

                for (int var17 = var6; var17 < var12 + var6; var13 += var16) {
                    int var18 = var14;

                    for (int var19 = var5; var19 < var5 + var11; var18 += var15) {
                        if (var23) {
                            this.field8980[var10][var7 + var13][var8 + var18] = (var17 << 3) + (var19 << 14) + (var9 << 24) + (var3 << 1);
                        } else {
                            this.field8980[var10][var7 + var18][var13 + var8] = (var3 << 1) + (var17 << 3) + (var19 << 14) + (var9 << 24);
                        }

                        ++var19;
                    }

                    ++var17;
                }
            }

            var2 = class345.field210.length;
            this.field8968 = new int[var2];
            this.field8947 = new int[var2];
            this.field8970 = new int[var2];
            this.field8971 = null;
            this.field8975 = new byte[var2][];
            this.field8951 = new byte[var2][];
            this.field8981 = null;
            this.field8972 = new int[var2];
            this.field8973 = new int[var2];
            this.field8978 = new byte[var2][];
            this.field8939 = new byte[var2][];
            var2 = 0;

            for (class459 var22 = (class459) class949.field3327.method901(1766612795); var22 != null; var22 = (class459) class949.field3327.method906(49146)) {
                var4 = var22.field7274 >>> 3;
                var5 = var22.field7268 >>> 3;
                var6 = var4 + var22.field7275;
                if ((var6 & 7) == 0) {
                    --var6;
                }

                var6 >>>= 3;
                var7 = var22.field7269 + var5;
                if ((var7 & 7) == 0) {
                    --var7;
                }

                var7 >>>= 3;

                for (var8 = var4 >>> 3; var8 <= var6; ++var8) {
                    label87:
                    for (var9 = var5 >>> 3; var9 <= var7; ++var9) {
                        var10 = var8 << 8 | var9;

                        for (var11 = 0; var11 < var2; ++var11) {
                            if (this.field8968[var11] == var10) {
                                continue label87;
                            }
                        }

                        this.field8968[var2] = var10;
                        this.field8947[var2] = class948.field3291.method3281(this.method5311(true, false, var8, var9, (byte) -52), -1034865468);
                        this.field8970[var2] = class948.field3291.method3281(this.method5311(false, false, var8, var9, (byte) 111), -1106973771);
                        this.field8972[var2] = class948.field3291.method3281(this.method5311(true, true, var8, var9, (byte) 24), -740435939);
                        this.field8973[var2] = class948.field3291.method3281(this.method5311(false, true, var8, var9, (byte) 86), -1244375919);
                        ++var2;
                    }
                }
            }

            this.field8979 = class345.field210;
            class345.field210 = null;
            this.method5299(this.field8976 >> 4, this.field8948 >> 4, 17, false, -815771659);
        } catch (RuntimeException var20) {
            throw class158.method3445(var20, "lt.ai(" + ')');
        }
    }

    public void method5308(int var1) {
        try {
            this.field8943 = new RegionBase();
            this.field8946 = 0;
            this.field8967 = 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.o(" + ')');
        }
    }

    public void method5309(int var1) {
        try {
            if (this.field8955) {
                this.method5315((byte) 2);
                class371.method867(true, 1336561252);
                class623 var2 = class730.field2697;
                this.field8968 = var2.field8968;
                this.field8947 = var2.field8947;
                this.field8970 = var2.field8970;
                this.field8971 = var2.field8971;
                this.field8972 = var2.field8972;
                this.field8973 = var2.field8973;
                this.field8979 = var2.field8979;
                this.field8975 = var2.field8975;
                this.field8951 = var2.field8951;
                this.field8981 = var2.field8981;
                this.field8978 = var2.field8978;
                this.field8939 = var2.field8939;
                this.field8959 = var2.field8959;
                this.field8949 = var2.field8949;
                this.field8950 = var2.field8950;
                this.field8980 = var2.field8980;
                this.field8952 = var2.field8952;
                this.field8953 = var2.field8953;
                this.field8954 = var2.field8954;
                this.field8942 = var2.field8942;
                this.field8960 = var2.field8960;
                this.field8963 = var2.field8963;
                this.field8969 = var2.field8969;
                this.field8938 = var2.field8938;
                this.field8940 = var2.field8940;
                this.field8943 = var2.field8943;
                this.field8944 = var2.field8944;
                this.field8967 = var2.field8967;
                this.field8946 = var2.field8946;
                this.field8976 = var2.field8976;
                this.field8948 = var2.field8948;
            } else if (19 == class730.field2733) {
                class967.method1750(1, -193120332);
            } else if (class730.field2733 == 14) {
                class967.method1750(15, 1644134026);
            } else if (class730.field2733 == 18) {
                class967.method1750(16, 1118439953);
            } else if (class730.field2733 == 0) {
                class967.method1750(17, 1835904519);
            } else if (8 == class730.field2733) {
                class967.method1750(9, -169912530);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.ao(" + ')');
        }
    }

    void method5310(class623 var1, byte var2) {
        try {
            boolean var3 = var1.field8955;
            var1.field8955 = this.field8955;
            this.field8955 = var3;
            class335 var4 = var1.field8941;
            var1.field8941 = this.field8941;
            this.field8941 = var4;
            var1.field8944 = this.field8943;
            this.field8944 = var1.field8943;
            this.field8950.method5676(var1.method5282((byte) 49), -1162508016);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "lt.ae(" + ')');
        }
    }

    String method5311(boolean var1, boolean var2, int var3, int var4, byte var5) {
        try {
            String var6 = "";
            if (var1) {
                var6 = var6 + "m" + var3 + '_' + var4;
            } else {
                var6 = var6 + "l" + var3 + '_' + var4;
            }

            if (var2) {
                var6 = 'u' + var6;
            }

            return var6;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "lt.al(" + ')');
        }
    }

    public int method5312(byte var1) {
        try {
            return 100 - this.field8958 * 100 / this.field8961;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.p(" + ')');
        }
    }

    void method5313(class572 var1, byte[][] var2, int var3) {
        try {
            for (int var4 = 0; var4 < var1.field4997; ++var4) {
                if (!this.field8955) {
                    class341.method252(140857778);
                }

                for (int var5 = 0; var5 < this.field8976 >> 3; ++var5) {
                    for (int var6 = 0; var6 < this.field8948 >> 3; ++var6) {
                        int var7 = this.field8980[var4][var5][var6];
                        if (-1 != var7) {
                            int var8 = var7 >> 24 & 3;
                            if (!var1.field5000 || var8 == 0) {
                                int var9 = var7 >> 1 & 3;
                                int var10 = var7 >> 14 & 1023;
                                int var11 = var7 >> 3 & 2047;
                                int var12 = (var10 / 8 << 8) + var11 / 8;

                                for (int var13 = 0; var13 < this.field8968.length; ++var13) {
                                    if (this.field8968[var13] == var12 && var2[var13] != null) {
                                        var1.method101(class593.field1623, var2[var13], var4, 8 * var5, var6 * 8, var8, 8 * (var10 & 7), (var11 & 7) * 8, var9, this.field8959, -174685332);
                                        break;
                                    }
                                }
                            }
                        }

                        if (this.field8955) {
                            this.method5300(5, (byte) 22);
                        }
                    }
                }
            }

        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "lt.an(" + ')');
        }
    }

    public boolean method5314(int var1) {
        try {
            if (!this.field8955) {
                class16.method3681(false, -583672467);
            }

            this.field8964 = 0;

            int var2;
            for (var2 = 0; var2 < this.field8975.length; ++var2) {
                if (-1 != this.field8947[var2] && this.field8975[var2] == null) {
                    this.field8975[var2] = class948.field3291.method3285(this.field8947[var2], 0, (byte) -67);
                    if (this.field8975[var2] == null) {
                        ++this.field8964;
                    }
                }

                if (-1 != this.field8970[var2] && this.field8951[var2] == null) {
                    this.field8951[var2] = class948.field3291.method3259(this.field8970[var2], 0, this.field8979[var2], -1251594466);
                    if (this.field8951[var2] == null) {
                        ++this.field8964;
                    }
                }

                if (this.field8972[var2] != -1 && this.field8978[var2] == null) {
                    this.field8978[var2] = class948.field3291.method3285(this.field8972[var2], 0, (byte) -60);
                    if (this.field8978[var2] == null) {
                        ++this.field8964;
                    }
                }

                if (this.field8973[var2] != -1 && this.field8939[var2] == null) {
                    this.field8939[var2] = class948.field3291.method3285(this.field8973[var2], 0, (byte) -33);
                    if (this.field8939[var2] == null) {
                        ++this.field8964;
                    }
                }

                if (this.field8971 != null && this.field8981[var2] == null && this.field8971[var2] != -1) {
                    this.field8981[var2] = class948.field3291.method3259(this.field8971[var2], 0, this.field8979[var2], -1874141869);
                    if (this.field8981[var2] == null) {
                        ++this.field8964;
                    }
                }
            }

            if (this.field8942 == null) {
                if (this.field8954 != null && class792.field510.method3265(this.field8954.field13 + "_staticelements", -400372089)) {
                    if (!class792.field510.method3282(this.field8954.field13 + "_staticelements", -2144896080)) {
                        ++this.field8964;
                    } else {
                        this.field8942 = class229.method4579(class792.field510, this.field8954.field13 + "_staticelements", class730.field2759, 565671699);
                    }
                } else {
                    this.field8942 = new class64(0);
                }
            }

            if (this.field8964 > 0) {
                if (this.field8965 < this.field8964) {
                    this.field8965 = this.field8964;
                }

                this.field8962 = class529.field3654;
                return false;
            } else {
                this.field8958 = 0;

                int var5;
                int var6;
                for (var2 = 0; var2 < this.field8975.length; ++var2) {
                    byte[] var3 = this.field8951[var2];
                    int var4;
                    if (var3 != null) {
                        var4 = (this.field8968[var2] >> 8) * 64 - this.field8943.baseX;
                        var5 = (this.field8968[var2] & 255) * 64 - this.field8943.baseY;
                        if (this.field8938.method36(-1692375482)) {
                            var4 = 10;
                            var5 = 10;
                        }

                        var6 = class555.method412(this.field8977, var3, var4, var5, this.field8976, this.field8948, (byte) -75);
                        if (var6 > 0) {
                            this.field8958 += var6;
                        }
                    }

                    var3 = this.field8939[var2];
                    if (var3 != null) {
                        var4 = 64 * (this.field8968[var2] >> 8) - this.field8943.baseX;
                        var5 = 64 * (this.field8968[var2] & 255) - this.field8943.baseY;
                        if (this.field8938.method36(-105390577)) {
                            var4 = 10;
                            var5 = 10;
                        }

                        var6 = class555.method412(this.field8977, var3, var4, var5, this.field8976, this.field8948, (byte) 54);
                        if (var6 > 0) {
                            this.field8958 += var6;
                        }
                    }
                }

                if (this.field8958 > 0) {
                    if (this.field8961 < this.field8958) {
                        this.field8961 = this.field8958;
                    }

                    this.field8962 = class529.field3652;
                    return false;
                } else {
                    if (!this.field8955 && this.field8962 != class529.field3653) {
                        class971.method1789(class814.field4748.method2927(class321.field1066, -875414210) + class822.field9047 + "(100%)", true, class593.field1623, class958.field3479, class378.field1158, (byte) -16);
                    }

                    this.field8962 = class529.field3655;
                    if (!this.field8955) {
                        class341.method252(-1142860499);
                    }

                    if (!this.field8955) {
                        for (var2 = 0; var2 < 2048; ++var2) {
                            Player var15 = class730.loaded[var2];
                            if (var15 != null) {
                                var15.field3638 = null;
                            }
                        }

                        for (var2 = 0; var2 < class730.field2797.length; ++var2) {
                            class437 var16 = class730.field2797[var2];
                            if (var16 != null) {
                                ((Interactable) var16.field7515).field3638 = null;
                            }
                        }
                    }

                    if (!this.field8955) {
                        class830.method5375(true, -1663847334);
                    }

                    if (!this.field8955) {
                        class118.method1461((byte) 84);
                    }

                    boolean var18 = false;
                    int var17;
                    if (class615.field8903.field9138.method2263(-1598768408) == 2) {
                        for (var17 = 0; var17 < this.field8975.length; ++var17) {
                            if (this.field8939[var17] != null || this.field8978[var17] != null) {
                                var18 = true;
                                break;
                            }
                        }
                    }

                    var17 = class874.method5850(class615.field8903.field9120.method2327((byte) 73), (byte) 16).field10374 * 8;
                    if (class593.field1623.method4810()) {
                        ++var17;
                    }

                    this.method5290(-1878791507);
                    this.method5306((byte) 12);
                    this.field8974 = new SceneGraph(class593.field1623, 9, 4, this.field8976, this.field8948, var17, var18, class593.field1623.method4876() > 0);
                    this.field8974.method2446(false, -740850409);
                    this.field8974.method2401(class730.field2795, (byte) -26);
                    if (class730.field2795 != 0) {
                        this.field8974.method2402(class202.field7587, -972568309);
                    } else {
                        this.field8974.method2402((class727) null, 1333003580);
                    }

                    this.field8956 = new class923();
                    this.field8957 = -0.05F + (float) (Math.random() / 10.0D);
                    this.field8966 = new class572(this.field8974, this.field8977, 4, this.field8976, this.field8948, false, this.field8949, this.field8950);
                    this.field8966.method3032(-403694446);
                    this.field8966.field4992 = class615.field8903.field9147.method5182(-809818345);
                    this.field8966.field4993 = class615.field8903.field9138.method2263(-2131698628) == 2;
                    this.field8966.field5068 = class615.field8903.field9126.method6339(-2037839529) == 1;
                    this.field8966.field4995 = class615.field8903.field9139.method2805(1917266854) == 1;
                    this.field8966.field4996 = class615.field8903.field9123.method5845(1803060969) == 1;
                    if (!this.field8938.method36(338257036)) {
                        this.method5301(this.field8966, this.field8975, (short) 821);
                    } else {
                        this.method5278(this.field8966, this.field8975, (byte) 53);
                    }

                    if (this.field8955) {
                        this.method5300(50, (byte) -75);
                    }

                    this.field8950.method5670(this.field8976 >> 4, this.field8948 >> 4, 1532552397);
                    this.field8950.method5672(this, 1783211969);
                    if (var18) {
                        this.field8974.method2446(true, -740850409);
                        this.field8937 = new class572(this.field8974, this.field8977, 1, this.field8976, this.field8948, true, this.field8949, this.field8950);
                        this.field8937.method3032(-1978540544);
                        this.field8937.field4992 = class615.field8903.field9147.method5182(-15786995);
                        this.field8937.field4993 = class615.field8903.field9138.method2263(864049094) == 2;
                        this.field8937.field5068 = class615.field8903.field9126.method6339(-1853244696) == 1;
                        this.field8937.field4995 = class615.field8903.field9139.method2805(281198825) == 1;
                        this.field8937.field4996 = class615.field8903.field9123.method5845(2103749887) == 1;
                        if (!this.field8938.method36(1753743768)) {
                            this.method5301(this.field8937, this.field8978, (short) 5882);
                            if (!this.field8955) {
                                class16.method3681(true, 1696867322);
                            }
                        } else {
                            this.method5278(this.field8937, this.field8978, (byte) 95);
                            if (!this.field8955) {
                                class16.method3681(true, -428383733);
                            }
                        }

                        this.field8937.method3031(0, this.field8966.field5024[0], -1177013471);
                        this.field8937.method3038(class593.field1623, (int[][][]) null, (class262[]) null, (byte) -27);
                        this.field8974.method2446(false, -740850409);
                        if (this.field8955) {
                            this.method5300(50, (byte) 33);
                        }
                    }

                    this.field8966.method3038(class593.field1623, var18 ? this.field8937.field5024 : null, this.field8959, (byte) 23);
                    if (!this.field8938.method36(-1767246323)) {
                        if (!this.field8955) {
                            class16.method3681(true, 1723627031);
                        }

                        this.method5302(this.field8966, this.field8951, (byte) -90);
                        if (this.field8981 != null) {
                            this.method5303(-388258926);
                        }
                    } else {
                        if (!this.field8955) {
                            class16.method3681(true, 2071599739);
                        }

                        this.method5313(this.field8966, this.field8951, 1378612829);
                    }

                    if (!this.field8955) {
                        class16.method3681(true, -741926161);
                    }

                    this.field8966.method3039(class593.field1623, var18 ? this.field8974.field3866[0] : null, (SceneGraphLevel) null, (byte) -119);
                    if (this.field8955) {
                        this.method5300(75, (byte) 18);
                    }

                    this.field8966.method105(class593.field1623, false, 1773155741);
                    if (this.field8955) {
                        this.method5300(75, (byte) 61);
                    }

                    if (!this.field8955) {
                        class16.method3681(true, 1278015476);
                    }

                    if (var18) {
                        this.field8974.method2446(true, -740850409);
                        if (!this.field8955) {
                            class16.method3681(true, -2085672109);
                        }

                        if (!this.field8938.method36(423424816)) {
                            this.method5302(this.field8937, this.field8939, (byte) -36);
                        } else {
                            this.method5313(this.field8937, this.field8939, -957252436);
                        }

                        if (!this.field8955) {
                            class16.method3681(true, 1319323091);
                        }

                        this.field8937.method3039(class593.field1623, (SceneGraphLevel) null, this.field8974.field3864[0], (byte) 43);
                        this.field8937.method105(class593.field1623, true, 1773155741);
                        if (!this.field8955) {
                            class16.method3681(true, 1345203008);
                        }

                        this.field8974.method2446(false, -740850409);
                        if (this.field8955) {
                            this.method5300(50, (byte) -40);
                        }
                    }

                    this.field8966.method3037(-702552699);
                    if (this.field8937 != null) {
                        this.field8937.method3037(-702552699);
                    }

                    this.field8974.method2444(-1802988635);
                    if (this.field8955) {
                        class27.resetTimer((byte) 1);

                        while (!class593.field1623.method4865(2085922748)) {
                            this.method5300(1, (byte) -1);
                        }
                    }

                    boolean var19 = false;
                    if (this.field8955) {
                        class623 var21 = class730.field2697;
                        this.method5310(var21, (byte) -125);
                        class625.field9752.method460(var21, -1651604);
                        var19 = true;
                        class27.resetTimer((byte) 1);
                        Object var20 = class730.field2642;
                        synchronized (class730.field2642) {
                            class730.field2698 = true;

                            try {
                                class730.field2642.wait();
                            } catch (InterruptedException var12) {
                                ;
                            }
                        }

                        class730.field2697 = this;
                        var21.method5306((byte) 12);
                        this.method5305(17, 1856850794);
                        this.method5291((byte) 34);
                    } else {
                        class341.method252(-913079296);
                        this.field8950.method5680((byte) 3);
                        class147.method1138(1506910584);
                    }

                    int var7;
                    for (var5 = 0; var5 < 4; ++var5) {
                        for (var6 = 0; var6 < this.field8976; ++var6) {
                            for (var7 = 0; var7 < this.field8948; ++var7) {
                                class526.method2225(var5, var6, var7, 814827061);
                            }
                        }
                    }

                    for (var5 = 0; var5 < class730.field2652.length; ++var5) {
                        if (class730.field2652[var5] != null) {
                            class730.field2652[var5].method4115(this.field8974, 1790221759);
                        }
                    }

                    class247.method4722((short) -8812);
                    class965.method1718(2113027902);
                    class701 var22;
                    if (class382.method1061((byte) -6) == class99.field625 && class730.field2692.method4377(537308016) != null && 17 == class730.field2733) {
                        var22 = class637.method5936(class643.field9977, class730.field2692.field7765, (byte) 55);
                        var22.field3364.method6364(1057001181, -2024753870);
                        class730.field2692.method4380(var22, (byte) -45);
                    }

                    if (!this.field8938.method36(1503430704)) {
                        var5 = (this.field8967 - (this.field8976 >> 4)) / 8;
                        var6 = (this.field8967 + (this.field8976 >> 4)) / 8;
                        var7 = (this.field8946 - (this.field8948 >> 4)) / 8;
                        int var8 = (this.field8946 + (this.field8948 >> 4)) / 8;

                        for (int var9 = var5 - 1; var9 <= 1 + var6; ++var9) {
                            for (int var10 = var7 - 1; var10 <= var8 + 1; ++var10) {
                                if (var9 >= var5 && var9 <= var6 && var10 >= var7 && var10 <= var8) {
                                    if (var1 >= 1047709682) {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    class948.field3291.method3274(this.method5311(true, false, var9, var10, (byte) 34), -1752946353);
                                    class948.field3291.method3274(this.method5311(false, false, var9, var10, (byte) -61), -1482810579);
                                    class948.field3291.method3274(this.method5311(true, true, var9, var10, (byte) -69), -1377878894);
                                    class948.field3291.method3274(this.method5311(false, true, var9, var10, (byte) -104), -180643080);
                                }
                            }
                        }
                    }

                    if (class730.field2733 == 1) {
                        class967.method1750(19, 1314741993);
                    } else if (class730.field2733 == 15) {
                        class967.method1750(14, 1781016763);
                    } else if (16 == class730.field2733) {
                        class967.method1750(18, 1023292756);
                    } else if (class730.field2733 == 9) {
                        class967.method1750(8, 6222714);
                    } else {
                        class967.method1750(0, 2061499324);
                        if (class730.field2692.method4377(537308016) != null) {
                            var22 = class637.method5936(class643.field9960, class730.field2692.field7765, (byte) 9);
                            class730.field2692.method4380(var22, (byte) -71);
                        }
                    }

                    class250.method4388(55767460);
                    if (this.field8945) {
                        class213.method3810(Long.toString(class27.resetTimer((byte) 1) - this.field8982), 180430926);
                        this.field8945 = false;
                    }

                    if (var19) {
                        Object var23 = class730.field2699;
                        synchronized (class730.field2699) {
                            class730.field2699.notify();
                        }
                    }

                    return true;
                }
            }
        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "lt.ab(" + ')');
        }
    }

    public void method5315(byte var1) {
        try {
            this.field8962 = class529.field3653;
            this.field8964 = 0;
            this.field8965 = 1;
            this.field8958 = 0;
            this.field8961 = 1;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.ax(" + ')');
        }
    }

    public class335 method5316(int var1) {
        try {
            return this.field8938;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.a(" + ')');
        }
    }

    public SceneGraph method5317(int var1) {
        try {
            return this.field8974;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lt.s(" + ')');
        }
    }
}
