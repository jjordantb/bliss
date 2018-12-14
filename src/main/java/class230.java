import java.awt.*;

public class class230 {
    static String[] field8229 = new String[100];
    public int field8225;
    public int field8228;
    public int field8230;
    byte[][] field8226;
    byte[] field8227;

    class230(byte[] var1) {
        InputStream var2 = new InputStream(var1);
        int var3 = var2.method6371();
        if (var3 != 0) {
            throw new RuntimeException("");
        } else {
            boolean var4 = var2.method6371() == 1;
            this.field8227 = new byte[256];
            var2.method6381(this.field8227, 0, 256, -953523806);
            if (var4) {
                int[] var5 = new int[256];
                int[] var6 = new int[256];

                int var7;
                for (var7 = 0; var7 < 256; ++var7) {
                    var5[var7] = var2.method6371();
                }

                for (var7 = 0; var7 < 256; ++var7) {
                    var6[var7] = var2.method6371();
                }

                byte[][] var12 = new byte[256][];

                int var10;
                for (int var8 = 0; var8 < 256; ++var8) {
                    var12[var8] = new byte[var5[var8]];
                    byte var9 = 0;

                    for (var10 = 0; var10 < var12[var8].length; ++var10) {
                        var9 += var2.method6372(-12558881);
                        var12[var8][var10] = var9;
                    }
                }

                byte[][] var13 = new byte[256][];

                int var14;
                for (var14 = 0; var14 < 256; ++var14) {
                    var13[var14] = new byte[var5[var14]];
                    byte var15 = 0;

                    for (int var11 = 0; var11 < var13[var14].length; ++var11) {
                        var15 += var2.method6372(-12558881);
                        var13[var14][var11] = var15;
                    }
                }

                this.field8226 = new byte[256][256];

                for (var14 = 0; var14 < 256; ++var14) {
                    if (var14 != 32) {
                        for (var10 = 0; var10 < 256; ++var10) {
                            if (var10 != 32) {
                                this.field8226[var14][var10] = (byte) class684.method4382(var12, var13, var6, this.field8227, var5, var14, var10, -2019008168);
                            }
                        }
                    }
                }

                this.field8228 = var6[32] + var5[32];
            } else {
                this.field8228 = var2.method6371();
            }

            var2.method6371();
            var2.method6371();
            this.field8230 = var2.method6371();
            this.field8225 = var2.method6371();
        }
    }

    public static int method4606(int var0) {
        try {
            boolean var1 = true;
            boolean var2 = false;
            boolean var3 = false;
            if (class86.field1134.field3064 < 512 && class86.field1134.field3064 != 0) {
                var1 = false;
            }

            if (class407.field9261.startsWith("win")) {
                var3 = true;
                var2 = true;
            } else {
                var2 = true;
            }

            if (class182.field5314) {
                var1 = false;
            }

            if (class182.field5315) {
                var2 = false;
            }

            if (class182.field5316) {
                var3 = false;
            }

            if (!var1 && !var2 && !var3) {
                return class895.method5596(571472892);
            } else {
                int var4 = -1;
                int var5 = -1;
                int var6 = -1;
                if (var1) {
                    try {
                        var4 = ItemDefinition.method2689(2, 1000, 280501708);
                    } catch (Exception var12) {
                        ;
                    }
                }

                if (var3) {
                    try {
                        var6 = ItemDefinition.method2689(3, 1000, -2071277019);
                        if (class615.field8903.field9137.method3689(-491668376) == 3) {
                            class305 var7 = class593.field1623.method4795();
                            long var8 = var7.field407 & 281474976710655L;
                            switch (var7.field398) {
                                case 4098:
                                    var2 &= var8 >= 60129613779L;
                                    break;
                                case 4318:
                                    var2 &= var8 >= 64425238954L;
                            }
                        }
                    } catch (Exception var11) {
                        ;
                    }
                }

                if (var2) {
                    try {
                        var5 = ItemDefinition.method2689(1, 1000, -1485617713);
                    } catch (Exception var10) {
                        ;
                    }
                }

                if (var4 == -1 && -1 == var5 && -1 == var6) {
                    return class895.method5596(571472892);
                } else {
                    var6 = (int) ((float) var6 * 1.1F);
                    var5 = (int) ((float) var5 * 1.1F);
                    if (var4 > var6 && var4 > var5) {
                        return class188.method3346(var4, -2143732206);
                    } else {
                        return var6 > var5 ? class665.method5714(3, var6, -683313294) : class665.method5714(1, var5, -1159261404);
                    }
                }
            }
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "uw.b(" + ')');
        }
    }

    static final void method4607(class744 var0, byte var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            var0.field3156 -= 2;
            int var4 = var0.field3161[var0.field3156];
            int var5 = var0.field3161[1 + var0.field3156];
            class785 var6 = class452.field7216.method5148(var4, 381661715);
            if (var5 != var6.field3822) {
                var3.method835(var4, var5, 1713038115);
            } else {
                var3.method833(var4, 1279288503);
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "uw.hm(" + ')');
        }
    }

    public static void method4608(Node var0, Node var1, byte var2) {
        try {
            if (var0.field642 != null) {
                var0.method545(-1460969981);
            }

            var0.field642 = var1.field642;
            var0.field640 = var1;
            var0.field642.field640 = var0;
            var0.field640.field642 = var0;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "uw.p(" + ')');
        }
    }

    static final void method4609(class744 var0, byte var1) {
        try {
            var0.field3158 -= 2;
            class831.method5384((String) var0.field3157[var0.field3158], (String) var0.field3157[1 + var0.field3158], "", var0.field3161[--var0.field3156] == 1, false, (byte) -37);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "uw.aft(" + ')');
        }
    }

    public int method4594(int var1, char var2, int var3) {
        try {
            return this.field8226 != null ? this.field8226[var1][var2] : 0;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "uw.p(" + ')');
        }
    }

    public int method4595(String var1, class653[] var2, int var3) {
        try {
            if (var1 == null) {
                return 0;
            } else {
                int var4 = -1;
                int var5 = -1;
                int var6 = 0;
                int var7 = var1.length();

                for (int var8 = 0; var8 < var7; ++var8) {
                    char var9 = var1.charAt(var8);
                    if (var9 == '<') {
                        var4 = var8;
                    } else {
                        if (var9 == '>' && var4 != -1) {
                            String var10 = var1.substring(var4 + 1, var8);
                            var4 = -1;
                            if (var10.equals("lt")) {
                                var9 = '<';
                            } else if (var10.equals("gt")) {
                                var9 = '>';
                            } else if (var10.equals("nbsp")) {
                                var9 = ' ';
                            } else if (var10.equals("shy")) {
                                var9 = '\u00ad';
                            } else if (var10.equals("times")) {
                                var9 = '×';
                            } else if (var10.equals("euro")) {
                                var9 = '€';
                            } else if (var10.equals("copy")) {
                                var9 = '©';
                            } else {
                                if (!var10.equals("reg")) {
                                    if (var10.startsWith("img=") && var2 != null) {
                                        try {
                                            int var11 = class82.method917(var10.substring(4), (short) -2448);
                                            var6 += var2[var11].method5594();
                                            var5 = -1;
                                        } catch (Exception var12) {
                                            ;
                                        }
                                    }
                                    continue;
                                }

                                var9 = '®';
                            }
                        }

                        if (-1 == var4) {
                            var6 += this.field8227[class84.method940(var9, 1088430238) & 255] & 255;
                            if (this.field8226 != null && var5 != -1) {
                                var6 += this.field8226[var5][var9];
                            }

                            var5 = var9;
                        }
                    }
                }

                return var6;
            }
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "uw.d(" + ')');
        }
    }

    public int method4596(int var1, int var2) {
        try {
            return this.field8227[var1] & 255;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "uw.i(" + ')');
        }
    }

    public String method4597(String var1, int var2, class653[] var3, byte var4) {
        try {
            if (this.method4595(var1, var3, 1319235613) <= var2) {
                return var1;
            } else {
                var2 -= this.method4595("...", (class653[]) null, 1319235613);
                int var5 = -1;
                int var6 = -1;
                int var7 = 0;
                int var8 = var1.length();
                String var9 = "";

                for (int var10 = 0; var10 < var8; ++var10) {
                    char var11 = var1.charAt(var10);
                    if (var11 == '<') {
                        var5 = var10;
                    } else {
                        if ('>' == var11 && var5 != -1) {
                            String var12 = var1.substring(1 + var5, var10);
                            var5 = -1;
                            if (var12.equals("lt")) {
                                var11 = '<';
                            } else if (var12.equals("gt")) {
                                var11 = '>';
                            } else if (var12.equals("nbsp")) {
                                var11 = ' ';
                            } else if (var12.equals("shy")) {
                                var11 = '\u00ad';
                            } else if (var12.equals("times")) {
                                var11 = '×';
                            } else if (var12.equals("euro")) {
                                var11 = '€';
                            } else if (var12.equals("copy")) {
                                var11 = '©';
                            } else {
                                if (!var12.equals("reg")) {
                                    if (var12.startsWith("img=") && var3 != null) {
                                        try {
                                            int var13 = class82.method917(var12.substring(4), (short) 4410);
                                            var7 += var3[var13].method5594();
                                            var6 = -1;
                                            if (var7 > var2) {
                                                return var9 + "...";
                                            }

                                            var9 = var1.substring(0, var10 + 1);
                                        } catch (Exception var14) {
                                            ;
                                        }
                                    }
                                    continue;
                                }

                                var11 = '®';
                            }
                        }

                        if (var5 == -1) {
                            var7 += this.field8227[class84.method940(var11, 1088430238) & 255] & 255;
                            if (this.field8226 != null && var6 != -1) {
                                var7 += this.field8226[var6][var11];
                            }

                            var6 = var11;
                            int var16 = var7;
                            if (this.field8226 != null) {
                                var16 = var7 + this.field8226[var11][46];
                            }

                            if (var16 > var2) {
                                return var9 + "...";
                            }

                            var9 = var1.substring(0, 1 + var10);
                        }
                    }
                }

                return var1;
            }
        } catch (RuntimeException var15) {
            throw class158.method3445(var15, "uw.u(" + ')');
        }
    }

    public int method4598(String var1, int[] var2, String[] var3, class653[] var4, byte var5) {
        try {
            return this.method4599(var1, var2, var3, var4, true, 116413311);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "uw.x(" + ')');
        }
    }

    int method4599(String var1, int[] var2, String[] var3, class653[] var4, boolean var5, int var6) {
        try {
            if (var1 == null) {
                return 0;
            } else {
                int var7 = 0;
                int var8 = 0;
                int var9 = -1;
                int var10 = 0;
                int var11 = 0;
                int var12 = -1;
                int var13 = -1;
                int var14 = 0;
                int var15 = var1.length();

                for (int var16 = 0; var16 < var15; ++var16) {
                    int var17 = class84.method940(var1.charAt(var16), 1088430238) & 255;
                    int var18 = 0;
                    if (60 == var17) {
                        var12 = var16;
                    } else {
                        int var19;
                        if (-1 != var12) {
                            if (var17 != 62) {
                                continue;
                            }

                            var19 = var12;
                            String var20 = var1.substring(var12 + 1, var16);
                            var12 = -1;
                            if (var20.equals("br")) {
                                var3[var14] = var1.substring(var8, 1 + var16);
                                ++var14;
                                if (var14 >= var3.length) {
                                    return 0;
                                }

                                var8 = 1 + var16;
                                var7 = 0;
                                var9 = -1;
                                var13 = -1;
                                continue;
                            }

                            if (var20.equals("lt")) {
                                var18 += this.method4596(60, 1793318064);
                                if (this.field8226 != null && var13 != -1) {
                                    var18 += this.field8226[var13][60];
                                }

                                var13 = 60;
                            } else if (var20.equals("gt")) {
                                var18 += this.method4596(62, 2036265548);
                                if (this.field8226 != null && var13 != -1) {
                                    var18 += this.field8226[var13][62];
                                }

                                var13 = 62;
                            } else if (var20.equals("nbsp")) {
                                var18 += this.method4596(160, 1914153156);
                                if (this.field8226 != null && -1 != var13) {
                                    var18 += this.field8226[var13][160];
                                }

                                var13 = 160;
                            } else if (var20.equals("shy")) {
                                var18 += this.method4596(173, 1038686003);
                                if (this.field8226 != null && var13 != -1) {
                                    var18 += this.field8226[var13][173];
                                }

                                var13 = 173;
                            } else if (var20.equals("times")) {
                                var18 += this.method4596(215, 1326596861);
                                if (this.field8226 != null && -1 != var13) {
                                    var18 += this.field8226[var13][215];
                                }

                                var13 = 215;
                            } else if (var20.equals("euro")) {
                                var18 += this.method4596(8364, 1505492652);
                                if (this.field8226 != null && -1 != var13) {
                                    var18 += this.field8226[var13][8364];
                                }

                                var13 = 8364;
                            } else if (var20.equals("copy")) {
                                var18 += this.method4596(169, 1424701879);
                                if (this.field8226 != null && var13 != -1) {
                                    var18 += this.field8226[var13][169];
                                }

                                var13 = 169;
                            } else if (var20.equals("reg")) {
                                var18 += this.method4596(174, 1748502620);
                                if (this.field8226 != null && -1 != var13) {
                                    var18 += this.field8226[var13][174];
                                }

                                var13 = 174;
                            } else if (var20.startsWith("img=") && var4 != null) {
                                try {
                                    int var21 = class82.method917(var20.substring(4), (short) 14575);
                                    var18 += var4[var21].method5594();
                                    var13 = -1;
                                } catch (Exception var22) {
                                    ;
                                }
                            }

                            var17 = -1;
                        } else {
                            var19 = var16;
                            var18 += this.method4596(var17, 1755594476);
                            if (this.field8226 != null && var13 != -1) {
                                var18 += this.field8226[var13][var17];
                            }

                            var13 = var17;
                        }

                        if (var18 > 0) {
                            var7 += var18;
                            if (var2 != null) {
                                if (var17 == 32) {
                                    var9 = var16;
                                    var10 = var7;
                                    var11 = var5 ? 1 : 0;
                                }

                                if (var7 > var2[var14 < var2.length ? var14 : var2.length - 1]) {
                                    if (var9 >= 0) {
                                        var3[var14] = var1.substring(var8, var9 + 1 - var11);
                                        ++var14;
                                        if (var14 >= var3.length) {
                                            return 0;
                                        }

                                        var8 = var9 + 1;
                                        var9 = -1;
                                        var7 -= var10;
                                        var13 = -1;
                                    } else {
                                        var3[var14] = var1.substring(var8, var19);
                                        ++var14;
                                        if (var14 >= var3.length) {
                                            return 0;
                                        }

                                        var8 = var19;
                                        var9 = -1;
                                        var7 = var18;
                                        var13 = -1;
                                    }
                                }

                                if (45 == var17) {
                                    var9 = var16;
                                    var10 = var7;
                                    var11 = 0;
                                }
                            }
                        }
                    }
                }

                if (var1.length() > var8) {
                    var3[var14] = var1.substring(var8, var1.length());
                    ++var14;
                }

                return var14;
            }
        } catch (RuntimeException var23) {
            throw class158.method3445(var23, "uw.r(" + ')');
        }
    }

    public int method4600(String var1, int var2, class653[] var3, int var4) {
        try {
            int var5 = this.method4598(var1, new int[]{var2}, field8229, var3, (byte) 91);
            int var6 = 0;

            for (int var7 = 0; var7 < var5; ++var7) {
                int var8 = this.method4595(field8229[var7], var3, 1319235613);
                if (var8 > var6) {
                    var6 = var8;
                }
            }

            return var6;
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "uw.q(" + ')');
        }
    }

    public int method4601(String var1, int var2, int var3, class653[] var4, int var5) {
        try {
            if (var3 == 0) {
                var3 = this.field8228;
            }

            int var6 = this.method4598(var1, new int[]{var2}, field8229, var4, (byte) 11);
            int var7 = (var6 - 1) * var3;
            return var7 + this.field8230 + this.field8225;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "uw.s(" + ')');
        }
    }

    public int method4602(String var1, int var2, int var3, int var4, int var5, class653[] var6, byte var7) {
        try {
            if (var3 == 0) {
                var3 = this.field8228;
            }

            int var8 = this.method4598(var1, new int[]{var2}, field8229, var6, (byte) -28);
            if (var8 == 0) {
                return 0;
            } else {
                if (var5 < 0) {
                    var5 = 0;
                }

                var5 /= var3;
                if (var5 >= var8) {
                    var5 = var8 - 1;
                }

                String var9 = field8229[var5];
                int var10 = 0;
                int var11 = 0;

                int var12;
                for (var12 = 0; var12 < var4 && var10 < var9.length(); var12 = this.method4595(var9.substring(0, var10), var6, 1319235613)) {
                    var11 = var12;
                    ++var10;
                }

                if (var10 == var9.length() && var9.endsWith("<br>")) {
                    var10 -= 4;
                }

                if (var4 - var11 < var12 - var4) {
                    --var10;
                }

                for (int var13 = 0; var13 < var5; ++var13) {
                    var10 += field8229[var13].length();
                }

                return var10;
            }
        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "uw.y(" + ')');
        }
    }

    public int method4603(String var1, int var2, class653[] var3, int var4) {
        try {
            return this.method4598(var1, new int[]{var2}, field8229, var3, (byte) -64);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "uw.n(" + ')');
        }
    }

    public Point method4604(String var1, int var2, int var3, int var4, class653[] var5, int var6) {
        try {
            if (var4 <= 0) {
                return new Point(0, var3 + this.field8230);
            } else {
                if (var4 > var1.length()) {
                    var4 = var1.length();
                }

                if (var3 == 0) {
                    var3 = this.field8228;
                }

                int var7 = this.method4599(var1, new int[]{var2}, field8229, var5, false, 116413311);
                int var8 = 0;

                for (int var9 = 0; var9 < var7; ++var9) {
                    int var10 = field8229[var9].length();
                    if (var10 + var8 > var4 || var7 - 1 == var9 && var4 == var1.length()) {
                        String var11 = var1.substring(var8, var4);
                        if (var11.endsWith("<br>")) {
                            var11 = "";
                            int var10000 = var8 + var10;
                            ++var9;
                        }

                        int var12 = this.method4595(var11, var5, 1319235613);
                        int var13 = var9 * var3 + this.field8230;
                        return new Point(var12, var13);
                    }

                    var8 += var10;
                }

                return null;
            }
        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "uw.z(" + ')');
        }
    }

    public int method4605(String var1, int var2) {
        try {
            return this.method4595(var1, (class653[]) null, 1319235613);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "uw.k(" + ')');
        }
    }
}
