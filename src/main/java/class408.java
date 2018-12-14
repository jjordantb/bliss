import java.io.IOException;

public class class408 {
    public static class408 field9218 = new class408("RC", 1);
    public static class408 field9219 = new class408("BUILDLIVE", 3);
    public static class408 field9220 = new class408("LIVE", 0);
    public static class408 field9221 = new class408("WIP", 2);
    static class408 field9222 = new class408("INTBETA", 4);
    public String field9223;
    public int field9224;

    class408(String var1, int var2) {
        this.field9223 = var1;
        this.field9224 = var2;
    }

    public static class408 method5469(int var0, byte var1) {
        try {
            class408[] var2 = class877.method5924((byte) 16);

            for (int var3 = 0; var3 < var2.length; ++var3) {
                class408 var4 = var2[var3];
                if (var0 == var4.field9224) {
                    return var4;
                }
            }

            return null;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "si.f(" + ')');
        }
    }

    public static void method5470(class202 var0, byte var1) {
        try {
            class117.method1342(var0, 200000, (short) 3156);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "si.b(" + ')');
        }
    }

    static void method5471(byte var0) {
        try {
            if (class919.field10431 != null) {
                try {
                    class919.field10431.close();
                } catch (IOException var2) {
                    ;
                }
            }

            class919.field10431 = null;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "si.i(" + ')');
        }
    }
}
