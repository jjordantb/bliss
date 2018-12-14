public class class811 {
    public static int field4653;
    public static int field4654;
    static int field4645 = 1;
    static int field4648 = 0;
    static int field4649 = 2;
    public int field4651;
    class137 field4644;
    class272 field4646;
    class180 field4647;
    class111 field4650 = null;
    int field4652 = 0;

    public class811(class180 var1, int var2) {
        this.field4647 = var1;
        this.field4651 = var2;
        this.field4646 = new class272();
        this.field4646.method6569(9, 128, 346222187);
    }

    static final void method2922(class744 var0, byte var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            var0.field3161[++var0.field3156 - 1] = var3.field1031;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "dw.pt(" + ')');
        }
    }

    static final void method2923(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class418.method5685(2134288170).method89(694163818);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "dw.ahv(" + ')');
        }
    }

    static final void method2924(int var0, int var1, int var2, boolean var3, int var4) {
        try {
            if (class215.method3835(var0, (int[]) null, -1346924535)) {
                class381.method1066(class382.widgetContainers[var0].widgetsCopy, -1, var1, var2, var3, (short) -10580);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "dw.kv(" + ')');
        }
    }

    static void method2925(int var0, boolean var1, int var2) {
        try {
            class682 var3 = class370.method881(21, (long) var0);
            var3.method4340((byte) 33);
            var3.field7687 = var1 ? 1 : 0;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "dw.au(" + ')');
        }
    }

    static final void method2926(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class75.method1118(var3, var4, true, 1, var0, 390526000);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "dw.ha(" + ')');
        }
    }

    class137 method2918(int var1) {
        try {
            return this.field4644;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "dw.f(" + ')');
        }
    }

    class272 method2919(int var1) {
        try {
            return this.field4646;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "dw.a(" + ')');
        }
    }

    public boolean method2920(byte var1) {
        try {
            return this.field4652 == 2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "dw.p(" + ')');
        }
    }

    public boolean method2921(byte var1) {
        try {
            class182.method3307(-727077730);
            if (this.field4652 == 0) {
                this.field4644 = class137.method958(this.field4647, this.field4651, 0);
                if (this.field4644 == null) {
                    return false;
                }

                this.field4650 = new class111(class818.field4613, class818.field4612);
                this.field4652 = 1;
            }

            if (1 == this.field4652) {
                if (!this.field4646.method6562(this.field4644, class818.field4624, this.field4650, 22050, -1303478218)) {
                    return false;
                }

                this.field4652 = 2;
            }

            return true;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "dw.b(" + ')');
        }
    }
}
