public class class505 extends class824 implements class265 {
    boolean field4133;
    class879 field4134;
    class770 field4135;
    int idkID;
    boolean field4137;
    byte field4138;
    ObjectDefinitionLoader field4139;
    boolean field4140;
    class719 field4141;
    boolean field4142;

    public class505(SceneGraph var1, class848 var2, ObjectDefinitionLoader var3, ObjectDefinition var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, boolean var12) {
        super(var1, var7, var8, var9, var5, var6, var4.field2250);
        this.field4139 = var3;
        this.idkID = var4.field2197;
        this.field4137 = var10;
        this.field4138 = (byte) var11;
        this.field4140 = var4.field2214 != 0 && !var10;
        this.field4133 = var12;
        this.field4142 = var2.method4916() && var4.field2265 && !this.field4137 && class615.field8903.field9147.method5182(-1930969884) != 0;
        int var13 = 2048;
        if (this.field4133) {
            var13 |= 65536;
        }

        if (var4.field2273) {
            var13 |= 524288;
        }

        class486 var14 = this.method2607(var2, var13, this.field4142, -2037171144);
        if (var14 != null) {
            this.field4134 = (class879) var14.field8554;
            this.field4135 = (class770) var14.field8555;
            if (this.field4133 || var4.field2273) {
                this.field4134 = this.field4134.method6017((byte) 0, var13, false);
                if (var4.field2273) {
                    class923 var15 = class730.field2697.method5274(-1945230052);
                    this.field4134.method5987(var15.field10290, var15.field10291, var15.field10292, var15.field10293);
                }
            }
        }

        this.method2169(1, -105360757);
    }

    static final void method2608(class744 var0, int var1) {
        try {
            int var2 = var0.field3174[var0.field3176];
            int var3 = var0.field3161[--var0.field3156];
            if (var3 >= 0 && var3 < var0.field3153[var2]) {
                var0.field3161[++var0.field3156 - 1] = var0.field3155[var2][var3];
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wo.au(" + ')');
        }
    }

    public class719 method2165(class848 var1, byte var2) {
        try {
            RegionOffset var3 = this.getRegion().regionOffset;
            if (this.field4141 == null) {
                this.field4141 = class905.method6344((int) var3.offsetX, (int) var3.field5300, (int) var3.offsetY, this.method2606(var1, 0, (byte) 68), 2029931481);
            }

            return this.field4141;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wo.bc(" + ')');
        }
    }

    public int method2168(int var1) {
        try {
            return this.field4134 != null ? this.field4134.method5976() : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wo.bm(" + ')');
        }
    }

    class879 method2606(class848 var1, int var2, byte var3) {
        try {
            if (this.field4134 != null && var1.method4836(this.field4134.method5948(), var2) == 0) {
                return this.field4134;
            } else {
                class486 var4 = this.method2607(var1, var2, false, -1886813239);
                return var4 != null ? (class879) var4.field8554 : null;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "wo.by(" + ')');
        }
    }

    class486 method2607(class848 var1, int var2, boolean var3, int var4) {
        try {
            ObjectDefinition var5 = this.field4139.getObjectDefinition(this.idkID);
            SceneGraphLevel var6;
            SceneGraphLevel var7;
            if (this.field4137) {
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
            return var5.method1495(var1, var2, class15.field6918.field6921, this.field4138, var6, var7, (int) var8.offsetX, (int) var8.field5300, (int) var8.offsetY, var3, (class552) null, -474476261);
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "wo.bl(" + ')');
        }
    }

    void method2164(class848 var1, int var2) {
    }

    boolean method2157(class848 var1, int var2, int var3, byte var4) {
        try {
            class879 var5 = this.method2606(var1, 131072, (byte) 22);
            if (var5 != null) {
                class135 var6 = this.method1521();
                return var5.method6097(var2, var3, var6, false, 0);
            } else {
                return false;
            }
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "wo.bu(" + ')');
        }
    }

    boolean method2173(int var1) {
        try {
            return this.field4133;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wo.bw(" + ')');
        }
    }

    void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
        try {
            if (var2 instanceof class505) {
                class505 var8 = (class505) var2;
                if (this.field4134 != null && var8.field4134 != null) {
                    this.field4134.method5994(var8.field4134, var3, var4, var5, var6);
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "wo.bk(" + ')');
        }
    }

    void method2205(byte var1) {
        try {
            this.field4133 = false;
            if (this.field4134 != null) {
                this.field4134.method5947(this.field4134.method5948() & -65537);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wo.bq(" + ')');
        }
    }

    public int method4548(int var1) {
        try {
            return class15.field6918.field6921;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wo.f(" + ')');
        }
    }

    public int method4549(short var1) {
        try {
            return this.field4138;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wo.b(" + ')');
        }
    }

    public void method4550(byte var1) {
        try {
            if (this.field4134 != null) {
                this.field4134.method6093();
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wo.p(" + ')');
        }
    }

    public boolean method4558(int var1) {
        try {
            return this.field4142;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wo.i(" + ')');
        }
    }

    public void method4556(class848 var1, int var2) {
        try {
            Object var3 = null;
            class770 var5;
            if (this.field4135 == null && this.field4142) {
                class486 var4 = this.method2607(var1, 262144, true, -1850458180);
                var5 = (class770) (var4 != null ? var4.field8555 : null);
            } else {
                var5 = this.field4135;
                this.field4135 = null;
            }

            RegionOffset var7 = this.getRegion().regionOffset;
            if (var5 != null) {
                super.field3638.method2441(var5, super.field3640, (int) var7.offsetX, (int) var7.offsetY, (boolean[]) null, 174451452);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "wo.d(" + ')');
        }
    }

    class192 method2201(class848 var1, int var2) {
        try {
            if (this.field4134 == null) {
                return null;
            } else {
                class135 var3 = this.method1521();
                class192 var4 = class221.method4033(this.field4140, 2139686110);
                this.field4134.method5965(var3, super.field3642[0], 0);
                return var4;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "wo.bo(" + ')');
        }
    }

    public void method4552(class848 var1, int var2) {
        try {
            Object var3 = null;
            class770 var5;
            if (this.field4135 == null && this.field4142) {
                class486 var4 = this.method2607(var1, 262144, true, -2121821591);
                var5 = (class770) (var4 != null ? var4.field8555 : null);
            } else {
                var5 = this.field4135;
                this.field4135 = null;
            }

            RegionOffset var7 = this.getRegion().regionOffset;
            if (var5 != null) {
                super.field3638.method2449(var5, super.field3640, (int) var7.offsetX, (int) var7.offsetY, (boolean[]) null, -412237236);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "wo.k(" + ')');
        }
    }

    public int getID() {
        try {
            return this.idkID;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wo.a(" + ')');
        }
    }

    boolean method2183(short var1) {
        try {
            return this.field4134 != null ? this.field4134.method5989() : false;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wo.be(" + ')');
        }
    }

    boolean method2206(byte var1) {
        try {
            if (this.field4134 != null) {
                return !this.field4134.method6036();
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wo.bf(" + ')');
        }
    }
}
