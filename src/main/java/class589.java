public class class589 extends Animable implements class265 {
    public class309 field274;
    boolean field271;
    boolean field272 = true;
    class719 field273;

    public class589(SceneGraph var1, class848 var2, ObjectDefinitionLoader var3, ObjectDefinition var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17) {
        super(var1, var5, var6, var7, var8, var9, var11, var12, var13, var14, var4.field2241 == 1, class147.method1144(var15, var16, -1836023814));
        this.field274 = new class309(var2, var3, var4, var15, var16, super.field3639, var6, this, var10, var17);
        this.field271 = var4.field2214 != 0 && !var10;
        this.method2169(1, 823536706);
    }

    static final void method214(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -18);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class309.method365(var3, var4, var0, (byte) 0);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "wb.gw(" + ')');
        }
    }

    static final void method215(class744 var0, byte var1) {
        try {
            if (class396.field6515 != null && class721.field3635 < class198.field7051) {
                var0.field3161[++var0.field3156 - 1] = class396.field6515[++class721.field3635 - 1] & '\uffff';
            } else {
                var0.field3161[++var0.field3156 - 1] = -1;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wb.ads(" + ')');
        }
    }

    public static void method216(int var0, int var1) {
        try {
            class682 var2 = class370.method881(5, (long) var0);
            var2.method4336(-1791340902);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wb.x(" + ')');
        }
    }

    boolean method2183(short var1) {
        try {
            return this.field272;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wb.be(" + ')');
        }
    }

    public class719 method2165(class848 var1, byte var2) {
        try {
            return this.field273;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wb.bc(" + ')');
        }
    }

    public int method2170(byte var1) {
        try {
            return this.field274.method350(2130168413);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wb.bx(" + ')');
        }
    }

    class192 method2201(class848 var1, int var2) {
        try {
            class879 var3 = this.field274.method351(var1, 2048, false, true, (byte) -57);
            if (var3 == null) {
                return null;
            } else {
                class135 var4 = this.method1521();
                class192 var5 = class221.method4033(this.field271, 2063497884);
                this.field274.method352(var1, var3, var4, super.field8299, super.field8297, super.field8296, super.field8298, true, -1012043162);
                var3.method5965(var4, super.field3642[0], 0);
                if (this.field274.field388 != null) {
                    class874 var6 = this.field274.field388.method1729();
                    var1.method4866(var6);
                }

                this.field272 = var3.method5989() || this.field274.field388 != null;
                class446 var8 = this.getRegion();
                if (this.field273 == null) {
                    this.field273 = class905.method6344((int) var8.regionOffset.offsetX, (int) var8.regionOffset.field5300, (int) var8.regionOffset.offsetY, var3, 2102300676);
                } else {
                    class364.method1613(this.field273, (int) var8.regionOffset.offsetX, (int) var8.regionOffset.field5300, (int) var8.regionOffset.offsetY, var3, (byte) 75);
                }

                return var5;
            }
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "wb.bo(" + ')');
        }
    }

    void method2164(class848 var1, int var2) {
        try {
            class879 var3 = this.field274.method351(var1, 262144, true, true, (byte) 67);
            if (var3 != null) {
                this.field274.method352(var1, var3, this.method1521(), super.field8299, super.field8297, super.field8296, super.field8298, false, -2006037308);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wb.bb(" + ')');
        }
    }

    public void method212(class552 var1, int var2) {
        try {
            this.field274.method349(var1, -38768975);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wb.bl(" + ')');
        }
    }

    boolean method2157(class848 var1, int var2, int var3, byte var4) {
        try {
            class879 var5 = this.field274.method351(var1, 131072, false, false, (byte) 7);
            return var5 == null ? false : var5.method6097(var2, var3, this.method1521(), false, 0);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "wb.bu(" + ')');
        }
    }

    final boolean method2173(int var1) {
        return false;
    }

    public boolean method4558(int var1) {
        try {
            return this.field274.method357(1788044006);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wb.i(" + ')');
        }
    }

    public int getID() {
        try {
            return this.field274.field387;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wb.a(" + ')');
        }
    }

    @Override
    public void method4552(class848 var1, int var2) {

    }

    public int method4548(int var1) {
        try {
            return this.field274.field375;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wb.f(" + ')');
        }
    }

    public int method4549(short var1) {
        try {
            return this.field274.field376;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wb.b(" + ')');
        }
    }

    public void method4550(byte var1) {
    }

    public void method4556(class848 var1, int var2) {
        try {
            this.field274.method358(var1, -475225909);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "wb.d(" + ')');
        }
    }

    boolean method2206(byte var1) {
        return false;
    }

    final void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
        try {
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "wb.bk(" + ')');
        }
    }

    final void method2205(byte var1) {
        try {
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wb.bq(" + ')');
        }
    }

    public int method2168(int var1) {
        try {
            return this.field274.method356(677575417);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "wb.bm(" + ')');
        }
    }
}
