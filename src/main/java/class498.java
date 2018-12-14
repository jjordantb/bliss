import java.io.IOException;

public class class498 {
    static int field8102 = 0;
    static int field8103 = 0;
    static byte[] field8104 = new byte[2048];
    static byte[] field8105 = new byte[2048];
    static InputStream[] field8106 = new InputStream[2048];
    static int[] field8107 = new int[2048];
    static int[] field8108 = new int[2048];
    static int field8109 = 1;
    static int field8110 = 2;
    static class370[] field8111 = new class370[2048];
    static int field8112 = 0;
    static int[] field8113 = new int[2048];

    class498() throws Throwable {
        throw new Error();
    }

    public static void method4491(InputStream var0, byte var1) {
        try {
            byte[] var2 = new byte[24];

            try {
                class69.field1839.method6156(0L);
                class69.field1839.method6152(var2, 430767444);

                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
                    ;
                }

                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }

            var0.method6425(var2, 0, 24, (short) -371);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ak.r(" + ')');
        }
    }

    static final void method4492(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -13);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class979.method1837(var3, var4, var0, (byte) -123);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ak.jn(" + ')');
        }
    }

    static final void method4493(class744 var0, int var1) {
        try {
            class362.method1509(var0.field3161[--var0.field3156], (byte) 0);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ak.aef(" + ')');
        }
    }

    static final void method4494(class744 var0, byte var1) {
        try {
            System.out.println(var0.field3157[--var0.field3158]);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ak.afw(" + ')');
        }
    }
}
