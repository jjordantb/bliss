public class class611 extends class535 {
    static int field8827 = 2;
    static int field8828 = 0;

    public class611(class838 var1) {
        super(var1);
    }

    public class611(int var1, class838 var2) {
        super(var1, var2);
    }

    static void method5155(class848 var0, int var1, int var2, Widget var3, class23 var4, int var5, int var6, int var7) {
        try {
            for (int var8 = 0; var8 < class730.field2684; ++var8) {
                class437 var9 = (class437) class730.field2677.method2942((long) class730.field2680[var8]);
                if (var9 != null) {
                    Npc var10 = (Npc) var9.field7515;
                    if (var10.method1241(1140952765) && class923.local.field3639 == var10.field3639) {
                        NpcDefinition var11 = var10.field1637;
                        if (var11 != null && var11.field9924 != null) {
                            var11 = var11.method6110(class827.field9037, 1665436225);
                        }

                        if (var11 != null && var11.field9884 && var11.field9899) {
                            RegionOffset var12 = var10.getRegion().regionOffset;
                            int var13 = (int) var12.offsetX / 128 - var1 / 128;
                            int var14 = (int) var12.offsetY / 128 - var2 / 128;
                            if (-1 != var11.field9922) {
                                class794.method468(var0, var4, var3, var5, var6, var13, var14, var11.field9922, (byte) 0);
                            } else {
                                class758.method2734(var3, var4, var5, var6, var13, var14, class307.field427[1], (byte) -17);
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var15) {
            throw class158.method3445(var15, "adl.q(" + ')');
        }
    }

    public static class48 method5156(class180 var0, int var1, byte var2) {
        try {
            class48 var3 = (class48) class791.field440.method2974((long) var1);
            if (var3 == null) {
                if (class657.field9549) {
                    var3 = class593.field1623.method4982(class922.method6234(var0, var1), true);
                } else {
                    var3 = class830.method5374(var0.method3264(var1, (byte) 15), -161656424);
                }

                class791.field440.method2984(var3, (long) var1);
            }

            return var3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "adl.f(" + ')');
        }
    }

    static final void method5157(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            String var4 = (String) var2.field3157[--var2.field3158];
            if (class960.method2212(var4, var2, -2000354906) != null) {
                var4 = var4.substring(0, var4.length() - 1);
            }

            var0.field1002 = class634.method5872(var4, var2, -2046058202);
            var0.field963 = true;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "adl.na(" + ')');
        }
    }

    public void method5152(int var1) {
        try {
            if (super.field3708 < 0 || super.field3708 > 2) {
                super.field3708 = this.method2272(-857466843);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "adl.s(" + ')');
        }
    }

    int method2272(int var1) {
        return 0;
    }

    public boolean method5153(int var1) {
        return true;
    }

    public int method5154(byte var1) {
        try {
            return super.field3708;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "adl.y(" + ')');
        }
    }

    public int method2273(int var1, int var2) {
        try {
            return var1 == 2 ? 2 : 1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "adl.f(" + ')');
        }
    }

    void method2275(int var1, int var2) {
        try {
            super.field3708 = var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "adl.p(" + ')');
        }
    }
}
