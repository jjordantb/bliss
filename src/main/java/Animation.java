public class Animation {
    public static boolean field6670 = false;
    public int[] field6653;
    public int id;
    public int[] field6656;
    public boolean field6657 = false;
    public int[] field6658;
    public int field6659 = -1;
    public boolean field6660 = false;
    public boolean[] field6661;
    public int field6662 = 5;
    public int field6663 = -1;
    public int field6664 = -1;
    public int field6665 = 99;
    public int field6666 = -1;
    public int[] field6667;
    public int field6668 = 2;
    public boolean field6669 = false;
    public int[][] field6671;
    public int[] field6672;
    public int field6673 = -1;
    public int[] field6674;
    class769 field6654;
    NodeTable field6675;

    static final void method3564(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class730.field2905;
            var0.field3161[++var0.field3156 - 1] = class730.field2913;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "qe.akz(" + ')');
        }
    }

    public static void method3565(int var0, int var1, int var2, int var3, ObjectDefinition var4, Npc var5, Player var6, byte var7) {
        try {
            class206 var8 = new class206();
            var8.field7067 = var0;
            var8.field7068 = var1 << 9;
            var8.field7066 = var2 << 9;
            if (var4 != null) {
                var8.field7078 = var4;
                int var9 = var4.field2218;
                int var10 = var4.field2215;
                if (var3 == 1 || var3 == 3) {
                    var9 = var4.field2215;
                    var10 = var4.field2218;
                }

                var8.field7070 = var1 + var9 << 9;
                var8.field7071 = var2 + var10 << 9;
                var8.field7086 = var4.field2254;
                var8.field7087 = var4.field2258;
                var8.field7073 = var4.field2240 << 9;
                var8.field7092 = var4.field2257;
                var8.field7093 = var4.field2259;
                var8.field7065 = var4.field2260;
                var8.field7075 = var4.field2261;
                var8.field7094 = var4.field2227;
                var8.field7095 = var4.field2271;
                var8.field7084 = var4.field2270;
                var8.field7072 = var4.field2269 << 9;
                if (var4.field2198 != null) {
                    var8.field7080 = true;
                    var8.method3766(-2011876770);
                }

                if (var8.field7075 != null) {
                    var8.field7097 = var8.field7093 + (int) (Math.random() * (double) (var8.field7065 - var8.field7093));
                }

                class206.field7064.method897(var8, 2135348486);
            } else if (var5 != null) {
                var8.field7076 = var5;
                NpcDefinition var12 = var5.field1637;
                if (var12.field9924 != null) {
                    var8.field7080 = true;
                    var12 = var12.method6110(class827.field9037, 1825815932);
                }

                if (var12 != null) {
                    var8.field7070 = var12.field9923 + var1 << 9;
                    var8.field7071 = var2 + var12.field9923 << 9;
                    var8.field7086 = class176.method3169(var5, 2096811251);
                    var8.field7087 = var12.field9916;
                    var8.field7073 = var12.field9876 << 9;
                    var8.field7092 = var12.field9915;
                    var8.field7095 = var12.field9897;
                    var8.field7084 = var12.field9926;
                    var8.field7072 = var12.field9911 << 9;
                }

                class206.field7098.method897(var8, 387904128);
            } else if (var6 != null) {
                var8.field7077 = var6;
                var8.field7070 = var1 + var6.method2550() << 9;
                var8.field7071 = var2 + var6.method2550() << 9;
                var8.field7086 = class509.method2534(var6, 2035612836);
                var8.field7087 = var6.field3375;
                var8.field7073 = var6.field3393 << 9;
                var8.field7092 = var6.field3394;
                var8.field7095 = 256;
                var8.field7084 = 256;
                var8.field7072 = 0;
                class206.field7083.method2947(var8, (long) var6.field4028);
            }

        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "qe.p(" + ')');
        }
    }

    static final void method3566(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 95);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class553.method453(var3, var4, var0, (short) 28140);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "qe.gu(" + ')');
        }
    }

    static Actor method3567(int var0, int var1, int var2, byte var3) {
        try {
            SceneTile var4 = class730.field2697.method5317(-1611682495).field3861[var0][var1][var2];
            if (var4 == null) {
                return null;
            } else {
                Actor var5 = null;
                int var6 = -1;

                for (IterableSceneEntity var7 = var4.iterableSceneEntity; var7 != null; var7 = var7.next) {
                    Animable var8 = var7.animable;
                    if (var8 instanceof Actor) {
                        Actor var9 = (Actor) var8;
                        int var10 = (var9.method2550() - 1) * 256 + 252;
                        RegionOffset var11 = var9.getRegion().regionOffset;
                        int var12 = (int) var11.offsetX - var10 >> 9;
                        int var13 = (int) var11.offsetY - var10 >> 9;
                        int var14 = var10 + (int) var11.offsetX >> 9;
                        int var15 = var10 + (int) var11.offsetY >> 9;
                        if (var12 <= var1 && var13 <= var2 && var14 >= var1 && var15 >= var2) {
                            int var16 = (1 + var14 - var1) * (var15 + 1 - var2);
                            if (var16 > var6) {
                                var5 = var9;
                                var6 = var16;
                            }
                        }
                    }
                }

                return var5;
            }
        } catch (RuntimeException var17) {
            throw class158.method3445(var17, "qe.id(" + ')');
        }
    }

    static final void method3568(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
        try {
            var0.field896 = var2.field3161[--var2.field3156] == 1;
            class814.method2932(var0, 2128713505);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "qe.ds(" + ')');
        }
    }

    static int method3569(int var0, int var1, int var2) {
        try {
            double var3 = Math.log((double) var1) / Math.log(2.0D);
            double var5 = Math.log((double) var0) / Math.log(2.0D);
            double var7 = Math.random() * (var3 - var5) + var5;
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "qe.m(" + ')');
        }
    }

    public String method3558(int var1, String var2, int var3) {
        try {
            if (this.field6675 == null) {
                return var2;
            } else {
                class437 var4 = (class437) this.field6675.method2942((long) var1);
                return var4 == null ? var2 : (String) var4.field7515;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "qe.k(" + ')');
        }
    }

    void method3559(InputStream var1, int var2, int var3) {
        try {
            int var4;
            int var5;
            if (1 == var2) {
                var4 = var1.method6374();
                this.field6653 = new int[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field6653[var5] = var1.method6374();
                }

                this.field6656 = new int[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field6656[var5] = var1.method6374();
                }

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field6656[var5] += var1.method6374() << 16;
                }
            } else if (2 == var2) {
                this.field6659 = var1.method6374();
            } else if (var2 == 3) {
                this.field6661 = new boolean[256];
                var4 = var1.method6371();

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field6661[var1.method6371()] = true;
                }
            } else if (5 == var2) {
                this.field6662 = var1.method6371();
            } else if (6 == var2) {
                this.field6663 = var1.method6374();
            } else if (var2 == 7) {
                this.field6664 = var1.method6374();
            } else if (var2 == 8) {
                this.field6665 = var1.method6371();
            } else if (var2 == 9) {
                this.field6666 = var1.method6371();
            } else if (10 == var2) {
                this.field6673 = var1.method6371();
            } else if (var2 == 11) {
                this.field6668 = var1.method6371();
            } else if (var2 == 12) {
                var4 = var1.method6371();
                this.field6658 = new int[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field6658[var5] = var1.method6374();
                }

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field6658[var5] += var1.method6374() << 16;
                }
            } else {
                int var7;
                if (13 == var2) {
                    var4 = var1.method6374();
                    this.field6671 = new int[var4][];

                    for (var5 = 0; var5 < var4; ++var5) {
                        int var6 = var1.method6371();
                        if (var6 > 0) {
                            this.field6671[var5] = new int[var6];
                            this.field6671[var5][0] = var1.method6390((byte) -28);

                            for (var7 = 1; var7 < var6; ++var7) {
                                this.field6671[var5][var7] = var1.method6374();
                            }
                        }
                    }
                } else if (14 == var2) {
                    this.field6669 = true;
                } else if (var2 == 15) {
                    this.field6660 = true;
                } else if (16 != var2) {
                    if (18 == var2) {
                        this.field6657 = true;
                    } else if (19 == var2) {
                        if (this.field6672 == null) {
                            this.field6672 = new int[this.field6671.length];

                            for (var4 = 0; var4 < this.field6671.length; ++var4) {
                                this.field6672[var4] = 255;
                            }
                        }

                        this.field6672[var1.method6371()] = var1.method6371();
                    } else if (20 == var2) {
                        if (this.field6667 == null || this.field6674 == null) {
                            this.field6667 = new int[this.field6671.length];
                            this.field6674 = new int[this.field6671.length];

                            for (var4 = 0; var4 < this.field6671.length; ++var4) {
                                this.field6667[var4] = 256;
                                this.field6674[var4] = 256;
                            }
                        }

                        var4 = var1.method6371();
                        this.field6667[var4] = var1.method6374();
                        this.field6674[var4] = var1.method6374();
                    } else if (var2 == 249) {
                        var4 = var1.method6371();
                        if (this.field6675 == null) {
                            var5 = class18.method3687(var4, (byte) 16);
                            this.field6675 = new NodeTable(var5);
                        }

                        for (var5 = 0; var5 < var4; ++var5) {
                            boolean var10 = var1.method6371() == 1;
                            var7 = var1.method6390((byte) -17);
                            Object var8;
                            if (var10) {
                                var8 = new class437(var1.method6379(102394051));
                            } else {
                                var8 = new class722(var1.method6420((byte) 14));
                            }

                            this.field6675.method2947((Node) var8, (long) var7);
                        }
                    }
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "qe.f(" + ')');
        }
    }

    void method3560(byte var1) {
        try {
            if (this.field6666 == -1) {
                if (this.field6661 != null) {
                    this.field6666 = 2;
                } else {
                    this.field6666 = 0;
                }
            }

            if (-1 == this.field6673) {
                if (this.field6661 != null) {
                    this.field6673 = 2;
                } else {
                    this.field6673 = 0;
                }
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "qe.b(" + ')');
        }
    }

    public boolean method3561(int var1) {
        try {
            if (this.field6656 == null) {
                return true;
            } else {
                boolean var2 = true;
                int[] var3 = this.field6656;

                for (int var4 = 0; var4 < var3.length; ++var4) {
                    int var5 = var3[var4];
                    if (this.field6654.method2253(var5 >>> 16, -1720040211) == null) {
                        var2 = false;
                    }
                }

                return var2;
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "qe.p(" + ')');
        }
    }

    public int method3562(int var1, int var2, int var3) {
        try {
            if (this.field6675 == null) {
                return var2;
            } else {
                class722 var4 = (class722) this.field6675.method2942((long) var1);
                return var4 == null ? var2 : var4.field3631;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "qe.i(" + ')');
        }
    }

    // Animation???
    void method3563(InputStream var1, int var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    if (var2 >= -360107567) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                this.method3559(var1, var3, -1717065205);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "qe.a(" + ')');
        }
    }
}
