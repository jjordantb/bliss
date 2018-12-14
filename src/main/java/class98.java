public class class98 {
    static class98 field608 = new class98(2);
    static class98 field609 = new class98(1);
    static class98 field611 = new class98(0);
    int field610;

    class98(int var1) {
        this.field610 = var1;
    }

    static final void method527(class744 var0, int var1) {
        try {
            int var2 = var0.field3174[var0.field3176];
            class747 var3 = class669.field7396.method75(var2, -1387183809);
            if (var3 == null) {
                throw new RuntimeException();
            } else {
                Integer var4 = var0.field3169.method5779(class730.field2926.field7327 << 16 | var3.field4144, var3.field4145, var3.field4146, -1943222730);
                int var5;
                if (var4 == null) {
                    var5 = 0;
                } else {
                    var5 = var4.intValue();
                }

                var0.field3161[++var0.field3156 - 1] = var5;
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ob.bh(" + ')');
        }
    }

    static final void method528(class744 var0, byte var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class984.method1885(var3, var4, var0, (byte) 57);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ob.ca(" + ')');
        }
    }

    static final void method529(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 62);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class69.method1337(var3, var4, var0, 1932699563);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ob.fb(" + ')');
        }
    }

    static final void method530(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            ItemDefinition var3 = class85.field1121.method1566(var2);
            var0.field3161[++var0.field3156 - 1] = var3.field4289 ? 1 : 0;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ob.aba(" + ')');
        }
    }
}
