public abstract class class312 {
    public int field475;
    public int field476;
    public int field477;
    public int field478;

    static final void method417(class744 var0, int var1) {
        try {
            var0.field3158 -= 2;
            String var2 = (String) var0.field3157[var0.field3158];
            String var3 = (String) var0.field3157[var0.field3158 + 1];
            if (var0.field3161[--var0.field3156] == 1) {
                var0.field3157[++var0.field3158 - 1] = var2;
            } else {
                var0.field3157[++var0.field3158 - 1] = var3;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "nz.zj(" + ')');
        }
    }

    static void method418(SceneTile[][][] var0, int var1) {
        try {
            for (int var2 = 0; var2 < var0.length; ++var2) {
                SceneTile[][] var3 = var0[var2];

                for (int var4 = 0; var4 < var3.length; ++var4) {
                    for (int var5 = 0; var5 < var3[var4].length; ++var5) {
                        SceneTile var6 = var3[var4][var5];
                        if (var6 == null) {
                            if (var1 >= 257433765) {
                                return;
                            }
                        } else {
                            if (var6.opt2 instanceof class265) {
                                ((class265) var6.opt2).method4550((byte) -5);
                            }

                            if (var6.wallDecoration instanceof class265) {
                                ((class265) var6.wallDecoration).method4550((byte) -70);
                            }

                            if (var6.wallDecoration2 instanceof class265) {
                                ((class265) var6.wallDecoration2).method4550((byte) -47);
                            }

                            if (var6.boundaryObject instanceof class265) {
                                ((class265) var6.boundaryObject).method4550((byte) -87);
                            }

                            if (var6.boundaryObject2 instanceof class265) {
                                ((class265) var6.boundaryObject2).method4550((byte) -107);
                            }

                            for (IterableSceneEntity var7 = var6.iterableSceneEntity; var7 != null; var7 = var7.next) {
                                Animable var8 = var7.animable;
                                if (var8 instanceof class265) {
                                    ((class265) var8).method4550((byte) -107);
                                }
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "nz.f(" + ')');
        }
    }

    static final void method419(class744 var0, byte var1) {
        try {
            int var2 = class730.field2823.method2944(2031939050);
            if (-1 != class730.field2822) {
                ++var2;
            }

            var0.field3161[++var0.field3156 - 1] = var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "nz.alp(" + ')');
        }
    }

    public static void method420(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
        try {
            if (var0 >= class381.field1416 && var0 <= class381.field1413 && var2 >= class381.field1416 && var2 <= class381.field1413 && var4 >= class381.field1416 && var4 <= class381.field1413 && var6 >= class381.field1416 && var6 <= class381.field1413 && var1 >= class381.field1414 && var1 <= class381.field1415 && var3 >= class381.field1414 && var3 <= class381.field1415 && var5 >= class381.field1414 && var5 <= class381.field1415 && var7 >= class381.field1414 && var7 <= class381.field1415) {
                class502.method1900(var0, var1, var2, var3, var4, var5, var6, var7, var8, (byte) -73);
            } else {
                class717.method2032(var0, var1, var2, var3, var4, var5, var6, var7, var8, 1173232309);
            }

        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "nz.l(" + ')');
        }
    }

    public abstract boolean method415(int var1, int var2, int var3, class262 var4, int var5);
}
