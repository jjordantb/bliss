public class class417 extends class138 {
    static int field9578 = 0;
    static class922 field9582;
    int field9577;
    int field9579;
    int field9580;
    int field9581;

    class417(int var1, int var2, int var3, int var4, int var5, int var6) {
        super(-1, var5, var6);
        this.field9580 = var1;
        this.field9577 = var2;
        this.field9579 = var3;
        this.field9581 = var4;
    }

    static class683 method5686(class180 var0, int var1, int var2) {
        try {
            byte[] var3 = var0.method3264(var1, (byte) 120);
            return var3 == null ? null : new class683(var3);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "yh.a(" + ')');
        }
    }

    static void method5687(int var0) {
    }

    static final void method5688(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            class684 var3 = class423.method5712((short) 512);
            class701 var4 = class637.method5936(class643.field10013, var3.field7765, (byte) 56);
            var4.field3364.method6361(var2);
            var3.method4380(var4, (byte) -69);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "yh.abr(" + ')');
        }
    }

    static final void method5689(class744 var0, byte var1) {
        try {
            String var2 = (String) var0.field3157[--var0.field3158];
            if (class143.field1540 != null && class143.field1540.equalsIgnoreCase(var2)) {
                var0.field3161[++var0.field3156 - 1] = 1;
            } else {
                var0.field3161[++var0.field3156 - 1] = 0;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "yh.vu(" + ')');
        }
    }

    public static void method5690(class112 var0, int var1, int var2, class878 var3, class864 var4, int var5) {
        try {
            class744 var6 = class909.method6439(1868919888);
            var6.field3170 = var4;
            class307.method389(var0, var1, var2, var6, 536465062);
            var6.field3170 = null;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "yh.x(" + ')');
        }
    }

    static void method5691(byte var0) {
        try {
            for (class497 var1 = (class497) class602.field8649.method2706(-431286975); var1 != null; var1 = (class497) class602.field8649.method2707(-2120194897)) {
                if (var1.field8120 > 1) {
                    var1.field8120 = 0;
                    class602.field8631.method2984(var1, ((MenuItem) var1.field8121.field4317.field208).field1706);
                    var1.field8121.method2710(2132471610);
                }
            }

            class602.field8646 = 0;
            class602.field8673 = 0;
            class602.field8647.method905((byte) 1);
            class602.field8637.method2941((byte) -19);
            class602.field8649.method2710(-116656816);
            class647.method5482(class602.field8633, 1921095656);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "yh.ax(" + ')');
        }
    }

    static final void method5692(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class82.field1110;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "yh.amq(" + ')');
        }
    }

    void method991(int var1, int var2, byte var3) {
        try {
            int var4 = var1 * this.field9580 >> 12;
            int var5 = var1 * this.field9579 >> 12;
            int var6 = var2 * this.field9577 >> 12;
            int var7 = var2 * this.field9581 >> 12;
            class388.method1188(var4, var6, var5, var7, super.field1169, -479015291);
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "yh.a(" + ')');
        }
    }

    void method984(int var1, int var2, byte var3) {
    }

    void method985(int var1, int var2, byte var3) {
    }
}
