public class class738 implements class832 {
    static int field3001;
    class156 field3000;

    class738(class156 var1) {
        this.field3000 = var1;
    }

    static int method1796(class471 var0, class471 var1, int var2, boolean var3, int var4, boolean var5, int var6) {
        try {
            int var7 = class636.method5913(var0, var1, var2, var3, -1657159001);
            if (var7 != 0) {
                return var3 ? -var7 : var7;
            } else if (-1 == var4) {
                return 0;
            } else {
                int var8 = class636.method5913(var0, var1, var4, var5, -552551191);
                return var5 ? -var8 : var8;
            }
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "mw.r(" + ')');
        }
    }

    static void method1797(class848 var0, int var1) {
        try {
            int var2 = -10660793;
            class352.method1404(var0, class622.field9006, class281.field10643, class809.field4595, class873.field9785, var2, -16777216, (byte) 123);
            class501.field3182.method1678(class814.field4781.method2927(class321.field1066, -875414210), class622.field9006 + 3, class281.field10643 + 14, var2, -1, 1583712486);
            int var3 = class912.field10424.method5524((byte) -10);
            int var4 = class912.field10424.method5513((byte) 38);
            int var5;
            MenuItem var6;
            int var7;
            if (!class602.field8638) {
                var5 = 0;

                for (var6 = (MenuItem) class602.field8647.method901(1766612795); var6 != null; var6 = (MenuItem) class602.field8647.method906(49146)) {
                    var7 = 31 + class281.field10643 + class602.field8634 * (class602.field8673 - 1 - var5);
                    class848.method5066(var3, var4, class622.field9006, class281.field10643, class809.field4595, class873.field9785, var7, var6, class501.field3182, class271.field10557, -1, -256, 247690373);
                    ++var5;
                }
            } else {
                var5 = 0;

                for (class497 var9 = (class497) class602.field8649.method2706(198728515); var9 != null; var9 = (class497) class602.field8649.method2707(30142288)) {
                    var7 = class281.field10643 + 31 + var5 * class602.field8634;
                    if (1 == var9.field8120) {
                        class848.method5066(var3, var4, class622.field9006, class281.field10643, class809.field4595, class873.field9785, var7, (MenuItem) var9.field8121.field4317.field208, class501.field3182, class271.field10557, -1, -256, 1821923505);
                    } else {
                        class621.method5260(var3, var4, class622.field9006, class281.field10643, class809.field4595, class873.field9785, var7, var9, class501.field3182, class271.field10557, -1, -256, (byte) -19);
                    }

                    ++var5;
                }

                if (class602.field8639 != null) {
                    class352.method1404(var0, class514.field4319, class936.field10310, class965.field2535, class382.field1411, var2, -16777216, (byte) 111);
                    class501.field3182.method1678(class602.field8639.field8122, class514.field4319 + 3, class936.field10310 + 14, var2, -1, -2064340267);
                    var5 = 0;

                    for (var6 = (MenuItem) class602.field8639.field8121.method2706(-783790871); var6 != null; var6 = (MenuItem) class602.field8639.field8121.method2707(505275870)) {
                        var7 = var5 * class602.field8634 + class936.field10310 + 31;
                        class848.method5066(var3, var4, class514.field4319, class936.field10310, class965.field2535, class382.field1411, var7, var6, class501.field3182, class271.field10557, -1, -256, 916241136);
                        ++var5;
                    }
                }
            }

        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "mw.ar(" + ')');
        }
    }

    public boolean method5380(Animable var1, int var2) {
        try {
            return this.field3000 == var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "mw.a(" + ')');
        }
    }
}
