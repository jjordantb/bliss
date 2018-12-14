import java.awt.*;

public class class744 {
    static EventQueue field3179;
    class265 field3150;
    Object[] field3151;
    long[] field3152;
    int[] field3153 = new int[5];
    class139 field3154;
    int[][] field3155 = new int[5][5000];
    int field3156 = 0;
    Object[] field3157 = new Object[1000];
    int field3158 = 0;
    Actor field3159;
    class24 field3160;
    int[] field3161 = new int[1000];
    int field3162 = 0;
    class237 field3163 = new class237();
    class237 field3164 = new class237();
    int[] field3165;
    class596[] field3166 = new class596[50];
    int field3167 = 0;
    long[] field3168 = new long[1000];
    class420 field3169;
    class864 field3170;
    int field3171 = 0;
    int field3172;
    class140 field3173;
    int[] field3174;
    class20[] field3175;
    int field3176 = -1;
    class346 field3177;
    boolean field3178;

    static final void method1901(class744 var0, byte var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            var0.field3161[++var0.field3156 - 1] = class906.field10363.method2713(var2, (short) -1307).field10617[var3];
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "qt.aci(" + ')');
        }
    }

    static final void method1902(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class818.method2902(var3, var4, var0, 1666748525);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "qt.jr(" + ')');
        }
    }

    static final void method1903(long var0) {
        try {
            int var2 = class730.field2734;
            int var3 = class730.field2736;
            int var4;
            int var5;
            if (class456.field7163 != var2) {
                var4 = var2 - class456.field7163;
                var5 = (int) ((long) var4 * var0 / 320L);
                if (var4 > 0) {
                    if (var5 == 0) {
                        var5 = 1;
                    } else if (var5 > var4) {
                        var5 = var4;
                    }
                } else if (var5 == 0) {
                    var5 = -1;
                } else if (var5 < var4) {
                    var5 = var4;
                }

                class456.field7163 += var5;
            }

            if (class530.field3741 != var3) {
                var4 = var3 - class530.field3741;
                var5 = (int) (var0 * (long) var4 / 320L);
                if (var4 > 0) {
                    if (var5 == 0) {
                        var5 = 1;
                    } else if (var5 > var4) {
                        var5 = var4;
                    }
                } else if (var5 == 0) {
                    var5 = -1;
                } else if (var5 < var4) {
                    var5 = var4;
                }

                class530.field3741 += var5;
            }

            class730.field2931 += class730.field2740 * (float) var0 / 40.0F * 8.0F;
            class730.field2738 += 8.0F * ((float) var0 * class730.field2741 / 40.0F);
            class819.method2938((byte) -110);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "qt.hd(" + ')');
        }
    }

    static final void method1904(class744 var0, int var1) {
        try {
            if (var0.field3167 != 0) {
                class596 var2 = var0.field3166[--var0.field3167];
                var0.field3177 = var2.field2143;
                var0.field3175 = var0.field3177.field173;
                var0.field3174 = var0.field3177.field174;
                var0.field3176 = var2.field2140;
                var0.field3165 = var2.field2142;
                var0.field3151 = var2.field2145;
                var0.field3152 = var2.field2144;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "qt.av(" + ')');
        }
    }
}
