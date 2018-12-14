public abstract class class461 {
    static final void method3990(class744 var0, byte var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            if (class923.local.field3388 != null) {
                int var4;
                for (var4 = 0; var4 < class354.field2137.length; ++var4) {
                    if (var2 == class354.field2137[var4]) {
                        class923.local.field3388.method1636(var4, var3, class662.field9736, -1907587275);
                        return;
                    }
                }

                for (var4 = 0; var4 < class354.field2130.length; ++var4) {
                    if (class354.field2130[var4] == var2) {
                        class923.local.field3388.method1636(var4, var3, class662.field9736, 909710113);
                        break;
                    }
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "mv.cj(" + ')');
        }
    }

    static final void method3991(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            if (var3.field953 == null) {
                var0.field3157[++var0.field3158 - 1] = "";
            } else {
                var0.field3157[++var0.field3158 - 1] = var3.field953;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "mv.pk(" + ')');
        }
    }

    static final void method3992(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
        try {
            var2.field3156 -= 2;
            var0.field893 = var2.field3161[var2.field3156];
            var0.field894 = var2.field3161[1 + var2.field3156];
            class814.method2932(var0, -1480345787);
            if (var0.field869 == 0) {
                class948.method1938(var1, var0, false, 112223880);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "mv.ft(" + ')');
        }
    }

    static final void method3993(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            class812.method2916(var3, var0, 761620533);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "mv.qf(" + ')');
        }
    }

    static boolean method3994(int var0) {
        try {
            boolean var1 = true;
            if (class417.field9582 == null) {
                if (class562.field827.method3280(class370.field1097, -457216440)) {
                    class417.field9582 = class922.method6234(class562.field827, class370.field1097);
                } else {
                    var1 = false;
                }
            }

            if (class968.field2552 == null) {
                if (class562.field827.method3280(class228.field8219, -457216440)) {
                    class968.field2552 = class922.method6234(class562.field827, class228.field8219);
                } else {
                    var1 = false;
                }
            }

            if (class5.field4945 == null) {
                if (class562.field827.method3280(class348.field221, -457216440)) {
                    class5.field4945 = class922.method6234(class562.field827, class348.field221);
                } else {
                    var1 = false;
                }
            }

            if (class228.field8221 == null) {
                if (class526.field3666.method3280(class228.field8213, -457216440)) {
                    class228.field8221 = class213.method3814(class526.field3666, class228.field8213, -1873768956);
                } else {
                    var1 = false;
                }
            }

            if (class228.field8214 == null) {
                if (class562.field827.method3280(class228.field8213, -457216440)) {
                    class228.field8214 = class922.method6236(class562.field827, class228.field8213);
                } else {
                    var1 = false;
                }
            }

            return var1;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "mv.f(" + ')');
        }
    }

    final int method3977(long var1) {
        try {
            long var3 = this.method3979(-2070209737);
            if (var3 > 0L) {
                class764.method2745(var3);
            }

            return this.method3981(var1);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "mv.f(" + ')');
        }
    }

    abstract void method3978(int var1);

    abstract long method3979(int var1);

    abstract int method3981(long var1);

    abstract long method3984(int var1);
}
