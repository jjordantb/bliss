import java.io.File;

public class class273 {
    public static String field10566;
    public static String field10567;

    static {
        String var0 = "Unknown";

        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var7) {
            ;
        }

        var0.toLowerCase();
        var0 = "Unknown";

        try {
            var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var6) {
            ;
        }

        var0.toLowerCase();
        var0 = "Unknown";

        try {
            var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var5) {
            ;
        }

        field10567 = var0.toLowerCase();
        var0 = "Unknown";

        try {
            var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var4) {
            ;
        }

        field10566 = var0.toLowerCase();
        var0 = "Unknown";

        try {
            var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var3) {
            ;
        }

        var0.toLowerCase();
        var0 = "~/";

        try {
            var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var2) {
            ;
        }

        new File(var0);
    }

    class273() throws Throwable {
        throw new Error();
    }

    public static final void method6597(String var0, int var1) {
        try {
            if (var0 != null) {
                String var2 = class526.method2229(var0, 2076308091);
                if (var2 != null) {
                    for (int var3 = 0; var3 < class730.field2923; ++var3) {
                        String var4 = class730.field2685[var3];
                        String var5 = class526.method2229(var4, -1598414380);
                        if (class559.method477(var0, var2, var4, var5, -1043868937)) {
                            --class730.field2923;

                            for (int var6 = var3; var6 < class730.field2923; ++var6) {
                                class730.field2685[var6] = class730.field2685[var6 + 1];
                                class730.field2927[var6] = class730.field2927[1 + var6];
                                class730.field2928[var6] = class730.field2928[var6 + 1];
                                class730.field2929[var6] = class730.field2929[var6 + 1];
                                class730.field2686[var6] = class730.field2686[1 + var6];
                                class730.field2703[var6] = class730.field2703[1 + var6];
                                class730.field2932[var6] = class730.field2932[1 + var6];
                            }

                            class730.field2865 = class730.field2915;
                            class684 var9 = class423.method5712((short) 512);
                            class701 var7 = class637.method5936(class643.field10017, var9.field7765, (byte) 9);
                            var7.field3364.method6361(class305.method372(var0, 2053997873));
                            var7.field3364.method6366(var0, 2123529676);
                            var9.method4380(var7, (byte) -90);
                            break;
                        }
                    }
                }
            }

        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "uk.ms(" + ')');
        }
    }

    public static int method6598(byte var0) {
        try {
            return class503.field4098;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "uk.d(" + ')');
        }
    }
}
