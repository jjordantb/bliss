public class class26 extends class304 {
    int field6497;
    int field6498;

    class26(InputStream var1) {
        super(var1);
        this.field6498 = var1.method6374();
        this.field6497 = var1.method6374();
    }

    static final void method3480(class744 var0, int var1) {
        try {
            var0.field3156 -= 3;
            class587.method167(var0.field3161[var0.field3156], var0.field3161[var0.field3156 + 1], var0.field3161[2 + var0.field3156], 255, 256, 1698817492);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "xt.st(" + ')');
        }
    }

    public static boolean method3481(byte var0) {
        try {
            return class818.field4611 != 0;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "xt.z(" + ')');
        }
    }

    public static boolean method3482(int var0, byte var1) {
        try {
            return var0 >= class15.field6922.field6921 && var0 <= class15.field6902.field6921 || class15.field6903.field6921 == var0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "xt.b(" + ')');
        }
    }

    static final int method3483(class848 var0, class593 var1, byte var2) {
        try {
            if (var1.field1611 != -1) {
                return var1.field1611;
            } else {
                if (var1.field1609 != -1) {
                    class414 var3 = var0.field8581.method4625(var1.field1609, 1590345714);
                    if (!var3.field9378) {
                        return var3.field9386;
                    }
                }

                return var1.field1608;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "xt.e(" + ')');
        }
    }

    static final void method3484(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9141.method1734(1991711560) == 1 ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "xt.ajc(" + ')');
        }
    }

    public void method2383(int var1) {
        try {
            class949.field3322[this.field6498].method6636(975748334).method2543(this.field6497, true, -2120305810);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "xt.f(" + ')');
        }
    }
}
