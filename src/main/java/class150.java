public class class150 extends Animable {
    int field5387 = 0;
    int field5388;
    Animator field5389;
    class726 field5390;
    boolean field5391 = true;
    int field5392 = 0;

    public class150(SceneGraph var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, boolean var14) {
        super(var1, var4, var5, var6, var7, var8, var9, var10, var11, var12, false, (byte) 0);
        this.field5388 = var2;
        this.field5392 = var13;
        class745 var15 = class635.field9823.method1053(this.field5388, -2103306753);
        int var16 = var15.field4107;
        if (var16 != -1) {
            this.field5389 = new class511(this, false);
            int var17 = var15.field4117 ? 0 : 2;
            if (var14) {
                var17 = 1;
            }

            this.field5389.method2780(var16, var3, var17, false, (byte) 0);
        }

        this.method2169(1, -656221662);
    }

    void method3376(class848 var1, class879 var2, class135 var3, byte var4) {
        try {
            var2.method6096(var3);
            class933[] var5 = var2.method6089();
            class396[] var6 = var2.method5941();
            if ((this.field5390 == null || this.field5390.field2548) && (var5 != null || var6 != null)) {
                this.field5390 = class726.method1732(class730.field2866, true);
            }

            if (this.field5390 != null) {
                this.field5390.method1731(var1, (long) class730.field2866, var5, var6, false);
                this.field5390.method1727(super.field3639, super.field8299, super.field8297, super.field8296, super.field8298);
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "akr.i(" + ')');
        }
    }

    public void method3377(byte var1) {
        try {
            if (this.field5390 != null) {
                this.field5390.method1721();
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akr.k(" + ')');
        }
    }

    public class719 method2165(class848 var1, byte var2) {
        return null;
    }

    public final boolean method3378(byte var1) {
        try {
            return this.field5389 != null && !this.field5389.method2782(-65534);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akr.f(" + ')');
        }
    }

    class879 method3379(class848 var1, int var2, int var3, int var4) {
        try {
            class745 var5 = class635.field9823.method1053(var3, -1949428738);
            SceneGraphLevel var6 = super.field3638.field3864[super.field3639];
            SceneGraphLevel var7 = super.field3640 < 3 ? super.field3638.field3864[1 + super.field3640] : null;
            RegionOffset var8 = this.getRegion().regionOffset;
            return this.field5389 != null && !this.field5389.method2788(1032843646) ? var5.method2591(var1, var2, true, var6, var7, (int) var8.offsetX, (int) var8.field5300, (int) var8.offsetY, this.field5389, (byte) 2, 345220259) : var5.method2591(var1, var2, true, var6, var7, (int) var8.offsetX, (int) var8.field5300, (int) var8.offsetY, (Animator) null, (byte) 2, -2126228993);
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "akr.p(" + ')');
        }
    }

    void method2164(class848 var1, int var2) {
        try {
            class879 var3 = this.method3379(var1, 0, this.field5388, -1760774279);
            if (var3 != null) {
                this.method3376(var1, var3, this.method1521(), (byte) -58);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "akr.bb(" + ')');
        }
    }

    final void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
        try {
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "akr.bk(" + ')');
        }
    }

    boolean method2157(class848 var1, int var2, int var3, byte var4) {
        return false;
    }

    final boolean method2173(int var1) {
        return false;
    }

    public final void method3380(int var1, int var2) {
        try {
            if (this.field5389 != null && !this.field5389.method2788(-891942946)) {
                this.field5389.method2778(var1, 2083264997);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "akr.a(" + ')');
        }
    }

    final void method2205(byte var1) {
        try {
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akr.bq(" + ')');
        }
    }

    public int method2168(int var1) {
        try {
            return this.field5387;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akr.bm(" + ')');
        }
    }

    class192 method2201(class848 var1, int var2) {
        try {
            class879 var3 = this.method3379(var1, 2048 | (this.field5392 != 0 ? 5 : 0), this.field5388, -1982313638);
            if (var3 == null) {
                return null;
            } else {
                if (this.field5392 != 0) {
                    var3.method6016(this.field5392 * 2048);
                }

                class135 var4 = this.method1521();
                this.method3376(var1, var3, var4, (byte) -52);
                class192 var5 = class221.method4033(false, 1486074028);
                var3.method5965(var4, super.field3642[0], 0);
                if (this.field5390 != null) {
                    class874 var6 = this.field5390.method1729();
                    var1.method4866(var6);
                }

                this.field5391 = var3.method5989();
                this.field5387 = var3.method5976();
                var3.method5973();
                return var5;
            }
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "akr.bo(" + ')');
        }
    }

    boolean method2183(short var1) {
        try {
            return this.field5391;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akr.be(" + ')');
        }
    }

    public final boolean method3381(int var1) {
        try {
            return this.field5389 == null || this.field5389.method2788(1776258671);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akr.b(" + ')');
        }
    }

    boolean method2206(byte var1) {
        return false;
    }
}
