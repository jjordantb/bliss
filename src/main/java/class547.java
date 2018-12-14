public class class547 extends class824 implements class265 {
    static long field412;
    public class309 field411;
    boolean field408 = true;
    boolean field409;
    class719 field410;

    public class547(SceneGraph var1, class848 var2, ObjectDefinitionLoader var3, ObjectDefinition var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12) {
        super(var1, var7, var8, var9, var5, var6, var4.field2250);
        this.field411 = new class309(var2, var3, var4, class15.field6918.field6921, var11, var5, var6, this, var10, var12);
        this.field409 = var4.field2214 != 0 && !var10;
        this.method2169(1, 397760713);
    }

    static final void method378(class744 var0, byte var1) {
        try {
            class684 var2 = class423.method5712((short) 512);
            class701 var3 = class637.method5936(class643.field10016, var2.field7765, (byte) 18);
            var3.field3364.method6361(0);
            int var4 = var3.field3364.field10376;
            var3.field3364.method6361(2);
            var3.field3364.method6362(var0.field3160.field6482, 16711935);
            var0.field3160.field6483.method6656(var3.field3364, var0.field3160.field6484, 1820223429);
            var3.field3364.method6426(var3.field3364.field10376 - var4, (byte) -61);
            var2.method4380(var3, (byte) -22);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "wm.adk(" + ')');
        }
    }

    public static void method379(byte var0) {
        try {
            class967.method1750(17, 1188643494);
            class526.method2231(-1182326447);
            System.gc();
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "wm.lx(" + ')');
        }
    }

    static final void method380(class744 var0, short var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            int[] var3 = class256.method4490(var2, 1679514983);
            class901.method6355(var3, 0, var0.field3161, var0.field3156, 3);
            var0.field3156 += 3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wm.akm(" + ')');
        }
    }

    boolean method2157(class848 var1, int var2, int var3, byte var4) {
        try {
            class879 var5 = this.field411.method351(var1, 131072, false, false, (byte) -17);
            return var5 == null ? false : var5.method6097(var2, var3, this.method1521(), false, 0);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "wm.bu(" + ')');
        }
    }

    boolean method2183(short var1) {
        try {
            return this.field408;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wm.be(" + ')');
        }
    }

    public class719 method2165(class848 var1, byte var2) {
        try {
            return this.field410;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wm.bc(" + ')');
        }
    }

    public int method2170(byte var1) {
        try {
            return this.field411.method350(2132571778);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wm.bx(" + ')');
        }
    }

    class192 method2201(class848 var1, int var2) {
        try {
            class879 var3 = this.field411.method351(var1, 2048, false, true, (byte) 42);
            if (var3 == null) {
                return null;
            } else {
                class135 var4 = this.method1521();
                class446 var5 = this.getRegion();
                class192 var6 = class221.method4033(this.field409, 1432921779);
                int var7 = (int) var5.regionOffset.offsetX >> 9;
                int var8 = (int) var5.regionOffset.offsetY >> 9;
                this.field411.method352(var1, var3, var4, var7, var7, var8, var8, true, 244174707);
                var3.method5965(var4, super.field3642[0], 0);
                if (this.field411.field388 != null) {
                    class874 var9 = this.field411.field388.method1729();
                    var1.method4866(var9);
                }

                this.field408 = var3.method5989() || this.field411.field388 != null;
                if (this.field410 == null) {
                    this.field410 = class905.method6344((int) var5.regionOffset.offsetX, (int) var5.regionOffset.field5300, (int) var5.regionOffset.offsetY, var3, 2034122433);
                } else {
                    class364.method1613(this.field410, (int) var5.regionOffset.offsetX, (int) var5.regionOffset.field5300, (int) var5.regionOffset.offsetY, var3, (byte) 83);
                }

                return var6;
            }
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "wm.bo(" + ')');
        }
    }

    final boolean method2173(int var1) {
        return false;
    }

    final void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
        try {
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "wm.bk(" + ')');
        }
    }

    final void method2205(byte var1) {
        try {
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wm.bq(" + ')');
        }
    }

    public int getID() {
        try {
            return this.field411.field387;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wm.a(" + ')');
        }
    }

    @Override
    public void method4552(class848 var1, int var2) {

    }

    public int method4548(int var1) {
        try {
            return this.field411.field375;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wm.f(" + ')');
        }
    }

    public int method4549(short var1) {
        try {
            return this.field411.field376;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wm.b(" + ')');
        }
    }

    boolean method2206(byte var1) {
        return false;
    }

    public void method375(class552 var1, byte var2) {
        try {
            this.field411.method349(var1, -748656560);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wm.by(" + ')');
        }
    }

    public void method4556(class848 var1, int var2) {
        try {
            this.field411.method358(var1, -475225909);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wm.d(" + ')');
        }
    }

    public int method2168(int var1) {
        try {
            return this.field411.method356(-2145027593);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wm.bm(" + ')');
        }
    }

    public boolean method4558(int var1) {
        try {
            return this.field411.method357(260525653);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wm.i(" + ')');
        }
    }

    void method2164(class848 var1, int var2) {
        try {
            class879 var3 = this.field411.method351(var1, 262144, true, true, (byte) -16);
            if (var3 != null) {
                RegionOffset var4 = this.getRegion().regionOffset;
                int var5 = (int) var4.offsetX >> 9;
                int var6 = (int) var4.offsetY >> 9;
                this.field411.method352(var1, var3, this.method1521(), var5, var5, var6, var6, false, 1937927561);
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "wm.bb(" + ')');
        }
    }

    public void method4550(byte var1) {
    }
}
