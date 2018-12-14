public class class49 {
    public static class180 field5185;
    static class49 field5182 = new class49();
    static class49 field5183 = new class49();
    static class49 field5184 = new class49();

    static final void method3091(class744 var0, int var1) {
        try {
            Npc var2 = (Npc) var0.field3159;
            boolean var3 = false;
            NpcDefinition var4 = var2.field1637;
            if (var4.field9924 != null) {
                var4 = var4.method6110(class827.field9037, 1885989341);
            }

            if (var4 != null) {
                var3 = var4.field9899;
            }

            var0.field3161[++var0.field3156 - 1] = var3 ? 1 : 0;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "fj.apz(" + ')');
        }
    }

    static final void method3092(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class534.method2293(var3, var4, var0, 1567634168);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "fj.hr(" + ')');
        }
    }

    static final void method3093(class744 var0, byte var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class827.method5356(var3, var4, var0, -588058138);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "fj.hz(" + ')');
        }
    }

    static final void method3094(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            int var3 = var2 >> 14 & 16383;
            int var4 = var2 & 16383;
            RegionBase var5 = class730.field2697.getRegionBase(681479919);
            var3 -= var5.baseX;
            if (var3 < 0) {
                var3 = 0;
            } else if (var3 >= class730.field2697.method5271(-1870653657)) {
                var3 = class730.field2697.method5271(-2106000427);
            }

            var4 -= var5.baseY;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 >= class730.field2697.method5272(787275205)) {
                var4 = class730.field2697.method5272(11403406);
            }

            class730.field2734 = (var3 << 9) + 256;
            class730.field2736 = (var4 << 9) + 256;
            class563.field1083 = 2;
            class516.field4332 = -1;
            class495.field8099 = -1;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "fj.agl(" + ')');
        }
    }

    public int method3090(int var1, int var2, int var3) {
        try {
            int var4 = class97.field614 > var2 ? -1111710645 * class97.field614 * 1445266787 : var2;
            if (this == field5183) {
                return 0;
            } else if (field5182 == this) {
                return var4 - var1;
            } else {
                return field5184 == this ? (var4 - var1) / 2 : 0;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "fj.f(" + ')');
        }
    }
}
