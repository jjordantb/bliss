public class class788 {
    static int field3833 = 9;
    static int field3834 = 2;
    static int field3835 = 5;
    static int field3836 = 1;
    static int field3837 = 4;
    static int field3838 = 11;
    static int field3839 = 7;
    static int field3840 = 3;
    static int field3841 = 10;
    static int field3842 = 6;
    static int field3843 = 8;

    class788() throws Throwable {
        throw new Error();
    }

    static final void method2395(class744 var0, int var1) {
        try {
            NodeTable var2 = var0.field3177.field183[var0.field3174[var0.field3176]];
            class722 var3 = (class722) var2.method2942((long) var0.field3161[--var0.field3156]);
            if (var3 != null) {
                var0.field3176 += var3.field3631;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "iw.bd(" + ')');
        }
    }

    static final void method2396(class744 var0, byte var1) {
        try {
            int var2 = var0.field3174[var0.field3176];
            Long var3 = var0.field3169.method5791(class730.field2926.field7327 << 16 | var2, -2092321657);
            long var4;
            if (var3 == null) {
                var4 = -1L;
            } else {
                var4 = var3.longValue();
            }

            var0.field3168[++var0.field3162 - 1] = var4;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "iw.bn(" + ')');
        }
    }

    static final void method2397(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9152.method4766((byte) -7) == 1 ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "iw.aji(" + ')');
        }
    }

    static final void method2398(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156] - 1;
            ItemDefinition var4 = class85.field1121.method1566(var2);
            if (var3 == var4.field4254) {
                var0.field3161[++var0.field3156 - 1] = var4.field4244;
            } else if (var3 == var4.field4239) {
                var0.field3161[++var0.field3156 - 1] = var4.field4245;
            } else {
                var0.field3161[++var0.field3156 - 1] = -1;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "iw.aaq(" + ')');
        }
    }
}
