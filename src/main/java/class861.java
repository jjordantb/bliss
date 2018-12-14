public final class class861 {
    public static int field9025;
    static int[] field9024;

    class861() throws Throwable {
        throw new Error();
    }

    static final void method5349(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class296.method6509(var3, var4, var0, -2030984421);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "pa.mb(" + ')');
        }
    }

    public static int method5350(CharSequence var0, int var1, int var2, byte[] var3, int var4, byte var5) {
        try {
            int var6 = var2 - var1;

            for (int var7 = 0; var7 < var6; ++var7) {
                char var8 = var0.charAt(var1 + var7);
                if (var8 > 0 && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                    var3[var4 + var7] = (byte) var8;
                } else if (var8 == '€') {
                    var3[var4 + var7] = -128;
                } else if (var8 == '‚') {
                    var3[var7 + var4] = -126;
                } else if (var8 == 'ƒ') {
                    var3[var4 + var7] = -125;
                } else if (var8 == '„') {
                    var3[var7 + var4] = -124;
                } else if (var8 == '…') {
                    var3[var4 + var7] = -123;
                } else if ('†' == var8) {
                    var3[var4 + var7] = -122;
                } else if ('‡' == var8) {
                    var3[var7 + var4] = -121;
                } else if ('ˆ' == var8) {
                    var3[var4 + var7] = -120;
                } else if (var8 == '‰') {
                    var3[var4 + var7] = -119;
                } else if (var8 == 'Š') {
                    var3[var4 + var7] = -118;
                } else if ('‹' == var8) {
                    var3[var7 + var4] = -117;
                } else if ('Œ' == var8) {
                    var3[var7 + var4] = -116;
                } else if ('Ž' == var8) {
                    var3[var4 + var7] = -114;
                } else if ('‘' == var8) {
                    var3[var7 + var4] = -111;
                } else if (var8 == '’') {
                    var3[var7 + var4] = -110;
                } else if (var8 == '“') {
                    var3[var4 + var7] = -109;
                } else if (var8 == '”') {
                    var3[var7 + var4] = -108;
                } else if (var8 == '•') {
                    var3[var4 + var7] = -107;
                } else if (var8 == '–') {
                    var3[var7 + var4] = -106;
                } else if ('—' == var8) {
                    var3[var4 + var7] = -105;
                } else if ('˜' == var8) {
                    var3[var7 + var4] = -104;
                } else if (var8 == '™') {
                    var3[var7 + var4] = -103;
                } else if ('š' == var8) {
                    var3[var7 + var4] = -102;
                } else if ('›' == var8) {
                    var3[var7 + var4] = -101;
                } else if ('œ' == var8) {
                    var3[var7 + var4] = -100;
                } else if ('ž' == var8) {
                    var3[var4 + var7] = -98;
                } else if ('Ÿ' == var8) {
                    var3[var7 + var4] = -97;
                } else {
                    var3[var4 + var7] = 63;
                }
            }

            return var6;
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "pa.k(" + ')');
        }
    }

    static void method5351(class744 var0, byte var1) {
        try {
            var0.field3161[var0.field3156 - 1] = class735.field3009.method4224(var0.field3161[var0.field3156 - 1], 245040087).method5325(class827.field9037, -1717639697) ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "pa.j(" + ')');
        }
    }

    static void method5352(String[] var0, int[] var1, int var2, int var3, int var4) {
        try {
            if (var2 < var3) {
                int var5 = (var3 + var2) / 2;
                int var6 = var2;
                String var7 = var0[var5];
                var0[var5] = var0[var3];
                var0[var3] = var7;
                int var8 = var1[var5];
                var1[var5] = var1[var3];
                var1[var3] = var8;

                for (int var9 = var2; var9 < var3; ++var9) {
                    if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
                        String var10 = var0[var9];
                        var0[var9] = var0[var6];
                        var0[var6] = var10;
                        int var11 = var1[var9];
                        var1[var9] = var1[var6];
                        var1[var6++] = var11;
                    }
                }

                var0[var3] = var0[var6];
                var0[var6] = var7;
                var1[var3] = var1[var6];
                var1[var6] = var8;
                method5352(var0, var1, var2, var6 - 1, 31286072);
                method5352(var0, var1, 1 + var6, var3, 31286072);
            }

        } catch (RuntimeException var12) {
            throw class158.method3445(var12, "pa.p(" + ')');
        }
    }
}
