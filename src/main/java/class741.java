import java.util.Queue;

public class class741 extends class312 {
    public static class45 method1886(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
        try {
            if ((var5 ? class615.field8903.field9149.method2717(-2143588734) : class615.field8903.field9119.method2717(-2141973598)) != 0 && var1 != 0 && class540.field3926 < 50 && var0 != -1) {
                class45 var8 = new class45((byte) (var5 ? 3 : 2), var0, var1, var2, var3, var4, var6, (Interactable) null);
                class540.field3927[++class540.field3926 - 1] = var8;
                return var8;
            } else {
                return null;
            }
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "ack.y(" + ')');
        }
    }

    public static void method1887(int var0) {
        try {
            Queue var1 = class978.field3127;
            synchronized (class978.field3127) {
                while (true) {
                    class105 var2 = (class105) class978.field3127.poll();
                    if (var2 == null) {
                        return;
                    }

                    var2.method6670(1323074796);
                }
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ack.k(" + ')');
        }
    }

    public boolean method415(int var1, int var2, int var3, class262 var4, int var5) {
        try {
            return class923.method6258(var2, var3, var1, var1, super.field476, super.field475, super.field477, super.field478, -173263894);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "ack.a(" + ')');
        }
    }
}
