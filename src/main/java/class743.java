public class class743 extends class535 {
    public class743(int var1, class838 var2) {
        super(var1, var2);
    }

    public class743(class838 var1) {
        super(var1);
    }

    static final void method1911(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            String var4 = (String) var2.field3157[--var2.field3158];
            if (class960.method2212(var4, var2, -438595363) != null) {
                var4 = var4.substring(0, var4.length() - 1);
            }

            var0.field954 = class634.method5872(var4, var2, -2046058202);
            var0.field963 = true;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "adm.mx(" + ')');
        }
    }

    int method2272(int var1) {
        try {
            return class157.field6552.field6556;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "adm.a(" + ')');
        }
    }

    public void method1908(byte var1) {
        try {
            int var2 = super.field3704.method5394(539663633).method2268(2126951423);
            if (var2 < 245) {
                super.field3708 = class157.field6552.field6556;
            }

            if (super.field3708 == class157.field6554.field6556 && var2 < 500) {
                super.field3708 = class157.field6553.field6556;
            }

            if (super.field3708 < class157.field6552.field6556 || super.field3708 > class157.field6557.field6556) {
                super.field3708 = this.method2272(-234312591);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "adm.s(" + ')');
        }
    }

    public int method2273(int var1, int var2) {
        try {
            int var3 = super.field3704.method5394(938739195).method2268(2050283643);
            if (var3 < 245) {
                return 3;
            } else {
                return class157.field6554.field6556 == var1 && var3 < 500 ? 3 : 1;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "adm.f(" + ')');
        }
    }

    void method2275(int var1, int var2) {
        try {
            super.field3708 = var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "adm.p(" + ')');
        }
    }

    public boolean method1909(int var1) {
        try {
            int var2 = super.field3704.method5394(-1209899111).method2268(1838142278);
            return var2 >= 245;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "adm.z(" + ')');
        }
    }

    public int method1910(int var1) {
        try {
            return super.field3708;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "adm.y(" + ')');
        }
    }
}
