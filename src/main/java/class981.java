public class class981 {
    public static class981 field3217 = new class981(14, 10);
    public static class981 field3220 = new class981(12, 7);
    public static class981 field3221 = new class981(9, 7);
    public static class981 field3222 = new class981(24);
    public static class981 field3224 = new class981(8, 8);
    public static class981 field3225 = new class981(54);
    public static class981 field3227 = new class981(11);
    public static class981 field3228 = new class981(30);
    public static class981 field3230 = new class981(34);
    public static class981 field3231 = new class981(15);
    public static class981 field3232 = new class981(16);
    public static class981 field3235 = new class981(19);
    public static class981 field3236 = new class981(3);
    public static class981 field3238 = new class981(5);
    public static class981 field3239 = new class981(1);
    public static class981 field3240 = new class981(10, 8);
    public static class981 field3241 = new class981(25);
    public static class981 field3242 = new class981(26);
    public static class981 field3245 = new class981(29);
    public static class981 field3247 = new class981(31);
    public static class981 field3248 = new class981(32);
    public static class981 field3249 = new class981(33);
    public static class981 field3250 = new class981(4);
    public static class981 field3251 = new class981(35);
    public static class981 field3252 = new class981(36);
    public static class981 field3254 = new class981(6, 8);
    public static class981 field3260 = new class981(13, 8);
    public static class981 field3262 = new class981(46);
    public static class981 field3263 = new class981(47);
    public static String field3273;
    public static class945 field3274;
    static class981 field3218 = new class981(22);
    static class981 field3219 = new class981(17);
    static class981 field3223 = new class981(38);
    static class981 field3226 = new class981(2);
    static class981 field3229 = new class981(43);
    static class981 field3233 = new class981(44);
    static class981 field3234 = new class981(18);
    static class981 field3237 = new class981(21);
    static class981 field3243 = new class981(27);
    static class981 field3244 = new class981(28);
    static class981 field3246 = new class981(20);
    static class981 field3253 = new class981(37);
    static class981 field3255 = new class981(39);
    static class981 field3256 = new class981(40);
    static class981 field3257 = new class981(41);
    static class981 field3258 = new class981(42);
    static class981 field3259 = new class981(7);
    static class981 field3261 = new class981(45);
    static class981 field3264 = new class981(48);
    static class981 field3265 = new class981(49);
    static class981 field3266 = new class981(50);
    static class981 field3267 = new class981(51);
    static class981 field3268 = new class981(53);
    static class981 field3269 = new class981(23);
    static class981 field3270 = new class981(70);
    public int field3271;
    int field3272;

    class981(int var1, int var2) {
        this.field3271 = var1;
        this.field3272 = var2;
    }

    class981(int var1) {
        this(var1, 0);
    }

    public static String method1928(int var0, byte var1) {
        try {
            class689 var2 = (class689) class371.field1088.method2942((long) var0);
            if (var2 != null) {
                class36 var3 = var2.field7630.method1371((byte) -78);
                if (var3 != null) {
                    double var4 = var2.field7630.method1378((short) 4615);
                    if ((double) var3.method3332((byte) 8) <= var4 && (double) var3.method3333(-327557193) >= var4) {
                        return var3.method3334(-700699994);
                    }
                }
            }

            return null;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ew.i(" + ')');
        }
    }

    static void method1929(byte var0) {
        try {
            ItemNode.field6616.method2977();
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "ew.z(" + ')');
        }
    }

    public static int method1930(String var0, byte var1) {
        try {
            return var0.length() + 2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ew.y(" + ')');
        }
    }

    static void method1931(int var0) {
        try {
            class881.field10140 = 136;
            class881.field10177 = class730.field2674;
            if (class730.field2825 != null) {
                InputStream var1 = new InputStream(class730.field2825);
                class881.field10146 = var1.method6375((short) 19840);
                class881.field10183 = var1.method6375((short) 15472);
            }

            if (class881.field10146 < 0L) {
                class919.method6486(35, 1176559477);
            } else {
                class521.method2751(false, true, "", "", class881.field10146);
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "ew.y(" + ')');
        }
    }

    static float method1932(float var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7) {
        try {
            float var8 = 0.0F;
            float var9 = var3 - var0;
            float var10 = var4 - var1;
            float var11 = var5 - var2;
            float var12 = 0.0F;
            float var13 = 0.0F;
            float var14 = 0.0F;

            for (SceneGraph var15 = class730.field2697.method5317(-1611682495); var8 < 1.1F; var8 += 0.1F) {
                float var16 = var9 * var8 + var0;
                float var17 = var1 + var8 * var10;
                float var18 = var8 * var11 + var2;
                int var19 = (int) var16 >> 9;
                int var20 = (int) var18 >> 9;
                if (var19 > 0 && var20 > 0 && var19 < class730.field2697.method5271(-1954958237) && var20 < class730.field2697.method5272(-1173220944)) {
                    int var21 = class923.local.field3639;
                    if (var21 < 3 && (class730.field2697.method5296(936952439).field5406[1][var19][var20] & 2) != 0) {
                        ++var21;
                    }

                    int var22 = var15.field3864[var21].method3887((int) var16, (int) var18, -1328298083);
                    if ((float) var22 < var17) {
                        if (var6 >= 2) {
                            return var8 - 0.1F + method1932(var12, var13, var14, var16, var17, var18, var6 - 1, 1869450178) * 0.1F;
                        }

                        return var8;
                    }
                }

                var12 = var16;
                var13 = var17;
                var14 = var18;
            }

            return -1.0F;
        } catch (RuntimeException var23) {
            throw class158.method3445(var23, "ew.bn(" + ')');
        }
    }

    static final void method1933(class744 var0, int var1) {
        try {
            class615.field8903.method5391(class615.field8903.field9121, var0.field3161[--var0.field3156] == 1 ? 1 : 0, -1686668837);
            class95.method523(656179282);
            class730.field2647 = false;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ew.aio(" + ')');
        }
    }

    public int method1925(int var1, int var2) {
        try {
            return var1 & (1 << this.field3272) - 1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ew.b(" + ')');
        }
    }

    public int method1926(short var1) {
        try {
            return 1 << this.field3272;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ew.a(" + ')');
        }
    }

    public int method1927(int var1, int var2) {
        try {
            return var1 >>> this.field3272;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ew.f(" + ')');
        }
    }
}
