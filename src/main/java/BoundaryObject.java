import java.io.File;

public class BoundaryObject extends class676 implements class265 {

    static int[] field2497 = new int[]{1, 2, 4, 8};
    static int[] field2498 = new int[]{16, 32, 64, 128};
    boolean field2499;
    class879 field2500;
    class770 field2501;
    class719 field2502;
    int field2503;
    byte field2504;
    ObjectDefinitionLoader field2505;
    byte field2506;
    boolean field2507;
    boolean field2508;
    boolean field2509;

    public BoundaryObject(SceneGraph var1, class848 var2, ObjectDefinitionLoader var3, ObjectDefinition var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, boolean var13) {
        super(var1, var7, var8, var9, var5, var6, class606.method4793(var11, var12, 800544861));
        this.field2505 = var3;
        this.field2503 = var4.field2197;
        this.field2508 = var10;
        this.field2506 = (byte) var11;
        this.field2504 = (byte) var12;
        this.field2507 = var4.field2214 != 0 && !var10;
        this.field2499 = var13;
        this.field2509 = var2.method4916() && var4.field2265 && !this.field2508 && class615.field8903.field9147.method5182(57385915) != 0;
        int var14 = 2048;
        if (this.field2499) {
            var14 |= 65536;
        }

        if (var4.field2273) {
            var14 |= 524288;
        }

        class486 var15 = this.method1699(var2, var14, this.field2509, (byte) -72);
        if (var15 != null) {
            this.field2500 = (class879) var15.field8554;
            this.field2501 = (class770) var15.field8555;
            if (this.field2499 || var4.field2273) {
                this.field2500 = this.field2500.method6017((byte) 0, var14, false);
                if (var4.field2273) {
                    class923 var16 = class730.field2697.method5274(-2131923625);
                    this.field2500.method5987(var16.field10290, var16.field10291, var16.field10292, var16.field10293);
                }
            }
        }

        this.method2169(1, -1008898449);
    }

    public static boolean method1700(boolean var0, int var1) {
        try {
            boolean var2 = class593.field1623.method4883();
            if (var0 != var2) {
                if (var0) {
                    if (!class593.field1623.method4881()) {
                        var0 = false;
                    }
                } else {
                    class593.field1623.method4882();
                }

                if (var0 != var2) {
                    class615.field8903.method5391(class615.field8903.field9117, var0 ? 1 : 0, -1863602535);
                    class95.method523(656179282);
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.gg(" + ')');
        }
    }

    static final void method1701(class744 var0, int var1) {
        try {
            int var2 = var0.field3174[var0.field3176];
            String var3 = (String) class166.field6896[var2];
            if (var3 == null) {
                var0.field3157[++var0.field3158 - 1] = "";
            } else {
                var0.field3157[++var0.field3158 - 1] = var3;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wg.bp(" + ')');
        }
    }

    static final void method1702(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            class718 var3 = class333.field139.method5091(var2, -1520948528);
            var0.field3161[++var0.field3156 - 1] = var3.field3498;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wg.amx(" + ')');
        }
    }

    static void method1703(File var0, byte var1) {
        try {
            class882.field10202 = var0;
            if (!class882.field10202.exists()) {
                throw new RuntimeException("");
            } else {
                class882.field10203 = true;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.a(" + ')');
        }
    }

    static void method1704(int var0, int var1, int var2, int var3, int var4, int var5) {
        try {
            class484.method4769(class381.field1412[var2++], var0, var1, var4, 718097597);
            class484.method4769(class381.field1412[var3--], var0, var1, var4, 1200953445);

            for (int var6 = var2; var6 <= var3; ++var6) {
                int[] var7 = class381.field1412[var6];
                var7[var0] = var7[var1] = var4;
            }

        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "wg.v(" + ')');
        }
    }

    boolean method2206(byte var1) {
        try {
            if (this.field2500 != null) {
                return !this.field2500.method6036();
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.bf(" + ')');
        }
    }

    boolean method2183(short var1) {
        try {
            return this.field2500 != null ? this.field2500.method5989() : false;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.be(" + ')');
        }
    }

    public int method2168(int var1) {
        try {
            return this.field2500 != null ? this.field2500.method5976() : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.bm(" + ')');
        }
    }

    class879 method1698(class848 var1, int var2, int var3) {
        try {
            if (this.field2500 != null && var1.method4836(this.field2500.method5948(), var2) == 0) {
                return this.field2500;
            } else {
                class486 var4 = this.method1699(var1, var2, false, (byte) -90);
                return var4 != null ? (class879) var4.field8554 : null;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "wg.bl(" + ')');
        }
    }

    class486 method1699(class848 var1, int var2, boolean var3, byte var4) {
        try {
            ObjectDefinition var5 = this.field2505.getObjectDefinition(this.field2503);
            SceneGraphLevel var6;
            SceneGraphLevel var7;
            if (this.field2508) {
                var6 = super.field3638.field3866[super.field3640];
                var7 = super.field3638.field3864[0];
            } else {
                var6 = super.field3638.field3864[super.field3640];
                if (super.field3640 < 3) {
                    var7 = super.field3638.field3864[super.field3640 + 1];
                } else {
                    var7 = null;
                }
            }

            RegionOffset var8 = this.getRegion().regionOffset;
            return var5.method1495(var1, var2, this.field2506, this.field2504, var6, var7, (int) var8.offsetX, (int) var8.field5300, (int) var8.offsetY, var3, (class552) null, 566759128);
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "wg.br(" + ')');
        }
    }

    public boolean method4558(int var1) {
        try {
            return this.field2509;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.i(" + ')');
        }
    }

    class192 method2201(class848 var1, int var2) {
        try {
            if (this.field2500 == null) {
                return null;
            } else {
                class135 var3 = this.method1521();
                class192 var4 = class221.method4033(this.field2507, 1739349745);
                this.field2500.method5965(var3, super.field3642[0], 0);
                return var4;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "wg.bo(" + ')');
        }
    }

    boolean method2173(int var1) {
        try {
            return this.field2499;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.bw(" + ')');
        }
    }

    void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
        try {
            if (var2 instanceof BoundaryObject) {
                BoundaryObject var8 = (BoundaryObject) var2;
                if (this.field2500 != null && var8.field2500 != null) {
                    this.field2500.method5994(var8.field2500, var3, var4, var5, var6);
                }
            } else if (var2 instanceof class0) {
                class0 var10 = (class0) var2;
                if (this.field2500 != null && var10.field4953 != null) {
                    this.field2500.method5994(var10.field4953, var3, var4, var5, var6);
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "wg.bk(" + ')');
        }
    }

    void method2205(byte var1) {
        try {
            this.field2499 = false;
            if (this.field2500 != null) {
                this.field2500.method5947(this.field2500.method5948() & -65537);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.bq(" + ')');
        }
    }

    public int method4548(int var1) {
        try {
            return this.field2506;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.f(" + ')');
        }
    }

    public int method4549(short var1) {
        try {
            return this.field2504;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.b(" + ')');
        }
    }

    boolean method2157(class848 var1, int var2, int var3, byte var4) {
        try {
            class879 var5 = this.method1698(var1, 131072, -546231639);
            if (var5 != null) {
                class135 var6 = this.method1521();
                return var5.method6097(var2, var3, var6, false, 0);
            } else {
                return false;
            }
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "wg.bu(" + ')');
        }
    }

    public int getID() {
        try {
            return this.field2503;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.a(" + ')');
        }
    }

    public void method4556(class848 var1, int var2) {
        try {
            Object var3 = null;
            class770 var5;
            if (this.field2501 == null && this.field2509) {
                class486 var4 = this.method1699(var1, 262144, true, (byte) -99);
                var5 = (class770) (var4 != null ? var4.field8555 : null);
            } else {
                var5 = this.field2501;
                this.field2501 = null;
            }

            RegionOffset var7 = this.getRegion().regionOffset;
            if (var5 != null) {
                super.field3638.method2441(var5, super.field3640, (int) var7.offsetX, (int) var7.offsetY, (boolean[]) null, 580390895);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "wg.d(" + ')');
        }
    }

    public void method4552(class848 var1, int var2) {
        try {
            Object var3 = null;
            class770 var5;
            if (this.field2501 == null && this.field2509) {
                class486 var4 = this.method1699(var1, 262144, true, (byte) 2);
                var5 = (class770) (var4 != null ? var4.field8555 : null);
            } else {
                var5 = this.field2501;
                this.field2501 = null;
            }

            RegionOffset var7 = this.getRegion().regionOffset;
            if (var5 != null) {
                super.field3638.method2449(var5, super.field3640, (int) var7.offsetX, (int) var7.offsetY, (boolean[]) null, 2001227588);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "wg.k(" + ')');
        }
    }

    public class719 method2165(class848 var1, byte var2) {
        try {
            RegionOffset var3 = this.getRegion().regionOffset;
            if (this.field2502 == null) {
                this.field2502 = class905.method6344((int) var3.offsetX, (int) var3.field5300, (int) var3.offsetY, this.method1698(var1, 0, -187426704), 2051250714);
            }

            return this.field2502;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wg.bc(" + ')');
        }
    }

    void method2164(class848 var1, int var2) {
    }

    public void method4550(byte var1) {
        try {
            if (this.field2500 != null) {
                this.field2500.method6093();
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wg.p(" + ')');
        }
    }
}
