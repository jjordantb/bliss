public class class133 extends class304 {
    int field1173;

    class133(InputStream var1) {
        super(var1);
        this.field1173 = var1.method6374();
    }

    static final void method996(Interactable var0, int var1, boolean var2, int var3) {
        try {
            int var7;
            int var8;
            if (var0 instanceof Animable && var0 instanceof class265) {
                Animable var10 = (Animable) var0;
                int var5 = var10.field8297 - var10.field8299 + 1 << 9;
                int var6 = 1 + (var10.field8298 - var10.field8296) << 9;
                var7 = (var10.field8299 << 9) + var5 / 2;
                var8 = var6 / 2 + (var10.field8296 << 9);
            } else {
                RegionOffset var4 = var0.getRegion().regionOffset;
                var7 = (int) var4.offsetX;
                var8 = (int) var4.offsetY;
            }

            class176.method3171(var0.field3639, var7, var8, 0, var1, var2, 1992555297);
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "yt.jg(" + ')');
        }
    }

    static final void method997(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 76);
            class752.method2640(var3, var0, -767212097);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "yt.qe(" + ')');
        }
    }

    static final boolean method998(int var0, int var1, boolean var2, class312 var3, int var4) {
        try {
            int var5 = class923.local.field4085[0];
            int var6 = class923.local.field4055[0];
            if (var5 >= 0 && var5 < class730.field2697.method5271(-2029828730) && var6 >= 0 && var6 < class730.field2697.method5272(911412275)) {
                if (var0 >= 0 && var0 < class730.field2697.method5271(-2140756422) && var1 >= 0 && var1 < class730.field2697.method5272(1432313507)) {
                    int var7 = class345.method157(var5, var6, class923.local.method2550(), var3, class730.field2697.method5281(class923.local.field3639), var2, class730.field2731, class730.field2719);
                    if (var7 < 1) {
                        return false;
                    } else {
                        class95.field601 = class730.field2731[var7 - 1];
                        class95.field593 = class730.field2719[var7 - 1];
                        class95.field602 = false;
                        class888.method5534(-2054792212);
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "yt.jz(" + ')');
        }
    }

    public void method2383(int var1) {
        try {
            class949.field3326[this.field1173].method3431((byte) 12);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "yt.f(" + ')');
        }
    }
}
