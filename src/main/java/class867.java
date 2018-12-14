public class class867 {
    static char[] field9753;
    static char[] field9754 = new char[64];
    static int[] field9755;

    static {
        int var0;
        for (var0 = 0; var0 < 26; ++var0) {
            field9754[var0] = (char) (65 + var0);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            field9754[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            field9754[var0] = (char) (var0 + 48 - 52);
        }

        field9754[62] = '+';
        field9754[63] = '/';
        field9753 = new char[64];

        for (var0 = 0; var0 < 26; ++var0) {
            field9753[var0] = (char) (65 + var0);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            field9753[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            field9753[var0] = (char) (48 + var0 - 52);
        }

        field9753[62] = '*';
        field9753[63] = '-';
        field9755 = new int[128];

        for (var0 = 0; var0 < field9755.length; ++var0) {
            field9755[var0] = -1;
        }

        for (var0 = 65; var0 <= 90; ++var0) {
            field9755[var0] = var0 - 65;
        }

        for (var0 = 97; var0 <= 122; ++var0) {
            field9755[var0] = 26 + (var0 - 97);
        }

        for (var0 = 48; var0 <= 57; ++var0) {
            field9755[var0] = var0 - 48 + 52;
        }

        int[] var2 = field9755;
        field9755[43] = 62;
        var2[42] = 62;
        int[] var1 = field9755;
        field9755[47] = 63;
        var1[45] = 63;
    }

    class867() throws Throwable {
        throw new Error();
    }

    public static void method5832(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        try {
            class22.method3439(var5, var6, 100, 1873797164);
            class540.field3928 = new class110(var0, var1 << 9, var2 << 9, var3 << 8, 8 * var4);
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "rq.t(" + ')');
        }
    }

    public static void method5833(class848 var0, int var1) {
        try {
            class202.field7587 = (class727) class785.field3827.method1857(class730.field2681, class295.field10470, true, true, -2063324548);
            class295.field10474 = class785.field3827.method1853(class730.field2681, class295.field10470, 414059625);
            class958.field3479 = (class727) class785.field3827.method1857(class730.field2681, class295.field10469, true, true, -2063324548);
            class378.field1158 = class785.field3827.method1853(class730.field2681, class295.field10469, 350969034);
            class501.field3182 = (class727) class785.field3827.method1857(class730.field2681, class295.field10477, true, true, -2063324548);
            class271.field10557 = class785.field3827.method1853(class730.field2681, class295.field10477, -1335234186);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rq.p(" + ')');
        }
    }
}
