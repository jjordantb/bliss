import java.awt.*;

public class class870 implements class54 {
    class374 field9803;

    class870(class374 var1) {
        this.field9803 = var1;
    }

    static void method5883(int var0) {
        try {
            if (class540.field3915 != null) {
                RegionOffset var1 = RegionOffset.translate(class923.local.getRegion().regionOffset);
                RegionBase var2 = class730.field2697.getRegionBase(681479919);
                var1.offsetX += (float) (var2.baseX << 9);
                var1.offsetY += (float) (var2.baseY << 9);
                var1.method3295((float) class540.field3915.field1930, var1.field5300, (float) class540.field3915.field1927);
                float var3 = var1.method3297();
                var1.method3291();
                float var4 = 0.0F;
                if (var3 < (float) class540.field3915.field1928) {
                    var4 = 1.0F;
                } else if (var3 > (float) class540.field3915.field1929) {
                    var4 = 0.0F;
                } else {
                    var3 -= (float) class540.field3915.field1928;
                    var4 = 1.0F - var3 / (float) class540.field3915.field1926;
                }

                Widget.method846((int) (256.0F * var4), 497351807);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "fs.h(" + ')');
        }
    }

    public static class848 method5884(Canvas var0, class478 var1, int var2, int var3, byte var4) {
        try {
            return new class257(var0, var1, var2, var3);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "fs.a(" + ')');
        }
    }

    static final void method5885(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class553.method453(var3, var4, var0, (short) 11583);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "fs.gh(" + ')');
        }
    }

    static final void method5886(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class75.method1118(var3, var4, false, 0, var0, 317795036);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "fs.hg(" + ')');
        }
    }

    static final void method5887(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class569.method11(var3, var4, var0, -16777216);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "fs.kc(" + ')');
        }
    }

    static final void method5888(class744 var0, int var1) {
        try {
            class615.field8903.method5391(class615.field8903.field9127, var0.field3161[--var0.field3156] == 1 ? 1 : 0, -1896213464);
            class95.method523(656179282);
            class730.field2647 = false;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "fs.ait(" + ')');
        }
    }

    static void method5889(int var0) {
        try {
            if (class721.field3634 != class916.field10410) {
                class662.field9734.method5799(-1042470924);
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "fs.np(" + ')');
        }
    }

    public boolean method1537(int var1) {
        return true;
    }

    public void method1538(int var1) {
    }

    public void method1543(boolean var1, byte var2) {
        try {
            if (var1) {
                class593.field1623.method4984(0, 0, class759.field4331, class97.field614, this.field9803.field1181, 0);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "fs.f(" + ')');
        }
    }
}
