public abstract class class856 {
    public static class180 field8889;

    static final void method5199(class744 var0, int var1) {
        try {
            var0.field3156 -= 3;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            int var4 = var0.field3161[2 + var0.field3156];
            class740.method1920(5, var2 << 16 | var3, var4, "", 761274889);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "dy.aln(" + ')');
        }
    }

    static void method5200(int var0, int var1) {
        try {
            if (class964.field3633 == null || class964.field3633.length < var0) {
                class964.field3633 = new int[var0];
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "dy.z(" + ')');
        }
    }

    public static void method5201(String var0, int var1) {
        try {
            if (8 == class730.field2733) {
                class701 var2 = class637.method5936(class643.field9974, class730.field2674.field7765, (byte) 6);
                var2.field3364.method6362(0, 16711935);
                int var3 = var2.field3364.field10376;
                var2.field3364.method6366(var0, 2135681130);
                var2.field3364.field10376 += 7;
                var2.field3364.method6388(class861.field9024, var3, var2.field3364.field10376, -1237713398);
                var2.field3364.method6369(var2.field3364.field10376 - var3, 1585504133);
                class730.field2674.method4380(var2, (byte) -126);
                class215.field7206 = class245.field8537;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "dy.p(" + ')');
        }
    }

    abstract void method5196(int var1);
}
