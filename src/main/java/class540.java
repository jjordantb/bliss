import java.util.Date;

public class class540 {
    public static int field3920 = -1;
    public static boolean field3921 = false;
    public static int field3922 = 2;
    public static int field3923 = -1;
    public static class752 field3925;
    public static class779 field3930;
    static int field3913 = 50;
    static int field3914 = 8192;
    static class110 field3915 = null;
    static int field3916 = 8192;
    static int field3917 = 0;
    static int field3918 = 4096;
    static int field3919 = 4096;
    static int field3924 = 16384;
    static int field3926 = 0;
    static class45[] field3927 = new class45[50];
    static class110 field3928 = null;
    static int field3929 = 16384;

    class540() throws Throwable {
        throw new Error();
    }

    static final void method2462(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class394.method3410(var3, var4, var0, -883658200);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "mm.io(" + ')');
        }
    }

    static final void method2463(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -33);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class611.method5157(var3, var4, var0, -617787103);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "mm.nr(" + ')');
        }
    }

    public static String method2464(long var0, int var2, boolean var3, class423 var4, short var5) {
        try {
            char var6 = ',';
            char var7 = '.';
            if (var4 == class423.field9583) {
                var6 = '.';
                var7 = ',';
            }

            if (var4 == class423.field9585) {
                var7 = ' ';
            }

            boolean var8 = false;
            if (var0 < 0L) {
                var8 = true;
                var0 = -var0;
            }

            StringBuilder var9 = new StringBuilder(26);
            int var10;
            int var11;
            if (var2 > 0) {
                for (var10 = 0; var10 < var2; ++var10) {
                    var11 = (int) var0;
                    var0 /= 10L;
                    var9.append((char) (var11 + 48 - 10 * (int) var0));
                }

                var9.append(var6);
            }

            var10 = 0;

            while (true) {
                var11 = (int) var0;
                var0 /= 10L;
                var9.append((char) (48 + var11 - (int) var0 * 10));
                if (var0 == 0L) {
                    if (var8) {
                        var9.append('-');
                    }

                    return var9.reverse().toString();
                }

                if (var3) {
                    ++var10;
                    if (var10 % 3 == 0) {
                        var9.append(var7);
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class158.method3445(var12, "mm.i(" + ')');
        }
    }

    static void method2465(long var0) {
        try {
            class308.field418.setTime(new Date(var0));
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "mm.k(" + ')');
        }
    }

    public static void method2466(int var0, int var1, int var2, int var3, int var4, int var5, String var6, int var7) {
        try {
            class281 var8 = new class281();
            var8.field10638 = var0;
            var8.field10637 = var1;
            var8.field10641 = var2;
            var8.field10640 = var4 + class730.field2866;
            var8.field10639 = var3;
            var8.field10642 = var6;
            var8.field10636 = var5;
            class730.field2631.method5209(var8, 1639821588);
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "mm.nv(" + ')');
        }
    }

    static final void method2467(class744 var0, byte var1) {
        try {
            int var2 = var0.field3174[var0.field3176];
            var0.field3161[++var0.field3156 - 1] = class827.field9037.field9257[var2];
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "mm.c(" + ')');
        }
    }
}
