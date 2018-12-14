public class SceneTile { // 192

    public SceneTile field7005;
    public IterableSceneEntity field7006;
    public class676 field7007; // Boundary ?
    public class676 field7008; // Boundary ?
    public class732 field7009; // boundary decor?
    public class732 field7010;// boundary decor?
    public class824 field7011;
    public byte floorLevel;
    class168 field7012;
    short field7013;
    short field7014;
    short field7015;
    short field7017;

    public SceneTile(int var1) {
        this.floorLevel = (byte) var1;
    }

    static void method3726(int var0) {
        try {
            if (class543.field3817 == null) {
                class543.field3817 = new int[65536];
                double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);
                int var3 = 0;

                for (int var4 = 0; var4 < 512; ++var4) {
                    float var5 = 360.0F * ((float) (var4 >> 3) / 64.0F + 0.0078125F);
                    float var6 = 0.0625F + (float) (var4 & 7) / 8.0F;

                    for (int var7 = 0; var7 < 128; ++var7) {
                        float var8 = (float) var7 / 128.0F;
                        float var9 = 0.0F;
                        float var10 = 0.0F;
                        float var11 = 0.0F;
                        float var12 = var5 / 60.0F;
                        int var13 = (int) var12;
                        int var14 = var13 % 6;
                        float var15 = var12 - (float) var13;
                        float var16 = (1.0F - var6) * var8;
                        float var17 = (1.0F - var15 * var6) * var8;
                        float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                        if (var14 == 0) {
                            var9 = var8;
                            var10 = var18;
                            var11 = var16;
                        } else if (var14 == 1) {
                            var9 = var17;
                            var10 = var8;
                            var11 = var16;
                        } else if (2 == var14) {
                            var9 = var16;
                            var10 = var8;
                            var11 = var18;
                        } else if (3 == var14) {
                            var9 = var16;
                            var10 = var17;
                            var11 = var8;
                        } else if (4 == var14) {
                            var9 = var18;
                            var10 = var16;
                            var11 = var8;
                        } else if (5 == var14) {
                            var9 = var8;
                            var10 = var16;
                            var11 = var17;
                        }

                        var9 = (float) Math.pow((double) var9, var1);
                        var10 = (float) Math.pow((double) var10, var1);
                        var11 = (float) Math.pow((double) var11, var1);
                        int var19 = (int) (256.0F * var9);
                        int var20 = (int) (var10 * 256.0F);
                        int var21 = (int) (256.0F * var11);
                        int var22 = var21 + (var19 << 16) + -16777216 + (var20 << 8);
                        class543.field3817[var3++] = var22;
                    }
                }

            }
        } catch (RuntimeException var24) {
            throw class158.method3445(var24, "np.b(" + ')');
        }
    }

    static final void method3727(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class456.method3792(var3, var4, var0, (byte) 65);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "np.ju(" + ')');
        }
    }

    static final void method3728(class744 var0, byte var1) {
        try {
            var0.field3158 -= 2;
            var0.field3156 -= 2;
            String var2 = (String) var0.field3157[var0.field3158];
            int var3 = var0.field3161[var0.field3156];
            int var4 = var0.field3161[var0.field3156 + 1];
            String var5 = (String) var0.field3157[var0.field3158 + 1];
            class399.method3530(var2, var3 == 1, var4, var5, 37914209);
            var0.field3161[++var0.field3156 - 1] = class198.field7051;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "np.abb(" + ')');
        }
    }

    static final void method3729(class744 var0, short var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9138.method2273(var2, 1352882135);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "np.aoa(" + ')');
        }
    }

    static final void method3730(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 24);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class75.method1118(var3, var4, true, 1, var0, 1939929714);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "np.hy(" + ')');
        }
    }

    static final void method3731(class744 var0, int var1) {
        try {
            var0.field3162 -= 2;
            if (var0.field3168[var0.field3162] == var0.field3168[1 + var0.field3162]) {
                var0.field3176 += var0.field3174[var0.field3176];
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "np.bx(" + ')');
        }
    }

    static void method3732(int var0) {
        try {
            class701 var1 = class637.method5936(class643.field10028, class730.field2692.field7765, (byte) 103);
            var1.field3364.method6361(class660.method5750((byte) -123));
            var1.field3364.method6362(class759.field4331, 16711935);
            var1.field3364.method6362(class97.field614, 16711935);
            var1.field3364.method6361(class615.field8903.field9116.method1098(-196354448));
            class730.field2692.method4380(var1, (byte) -93);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "np.gp(" + ')');
        }
    }
}
