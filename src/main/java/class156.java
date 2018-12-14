public class class156 extends Animable {
    class669 field6582;
    class879 field6583;

    class156(SceneGraph var1, class669 var2, int var3, int var4, int var5, int var6, int var7) {
        super(var1, var3, var4, var5, var6, var7, var5 >> 9, var5 >> 9, var7 >> 9, var7 >> 9, false, (byte) 0);
        this.field6582 = var2;
    }

    public class719 method2165(class848 var1, byte var2) {
        return null;
    }

    boolean method2157(class848 var1, int var2, int var3, byte var4) {
        return false;
    }

    boolean method2173(int var1) {
        return false;
    }

    boolean method2206(byte var1) {
        try {
            if (this.field6583 != null) {
                return !this.field6583.method6036();
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akx.bf(" + ')');
        }
    }

    void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
    }

    void method2164(class848 var1, int var2) {
    }

    public int method2168(int var1) {
        try {
            return this.field6583 != null ? this.field6583.method5976() : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akx.bm(" + ')');
        }
    }

    void method2205(byte var1) {
    }

    class192 method2201(class848 var1, int var2) {
        try {
            if (this.field6583 == null) {
                this.field6583 = this.field6582.method4118(var1, 809073544);
            }

            if (this.field6583 != null) {
                class135 var3 = var1.method5048();
                class135 var4 = this.method1521();
                class446 var5 = this.getRegion();
                var3.method1024(var4);
                SceneTile var6 = super.field3638.field3861[super.field3639][(int) var5.regionOffset.offsetX >> 9][(int) var5.regionOffset.offsetY >> 9];
                if (var6 != null && var6.opt2 != null) {
                    var3.method1018(0.0F, (float) (-var6.opt2.field9059), 0.0F);
                }

                this.field6583.method5965(var3, (class211) null, 0);
            }

            return null;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "akx.bo(" + ')');
        }
    }

    boolean method2183(short var1) {
        try {
            return this.field6583 != null ? this.field6583.method5989() : false;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akx.be(" + ')');
        }
    }
}
