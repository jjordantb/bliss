import java.util.Iterator;

public class class76 {
    static int field1461 = 1;
    static int field1462 = 3;
    static int field1463 = 2;
    static int field1465 = 4;
    static class219 field1466;
    class373 field1459 = new class373();
    long field1460 = -1L;
    long field1464;

    public class76(InputStream var1) {
        this.method1107(var1, (byte) 2);
    }

    public static void method1109(class848 var0, long var1) {
        try {
            class198.field7040 = class198.field7045;
            class198.field7045 = 0;
            class27.resetTimer((byte) 1);
            Iterator var3 = class198.field7046.iterator();

            while (var3.hasNext()) {
                class726 var4 = (class726) var3.next();
                boolean var5 = var4.method1722(var0, var1);
                if (!var5) {
                    var3.remove();
                    class198.field7042[class198.field7044] = var4;
                    class198.field7044 = class198.field7044 + 1 & class948.field3284[class198.field7038];
                }
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ge.f(" + ')');
        }
    }

    static final void method1110(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class749.field4018;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ge.amo(" + ')');
        }
    }

    public static byte[] method1111(byte[] var0, int var1, int var2, byte var3) {
        try {
            byte[] var4;
            if (var1 > 0) {
                var4 = new byte[var2];

                for (int var5 = 0; var5 < var2; ++var5) {
                    var4[var5] = var0[var1 + var5];
                }
            } else {
                var4 = var0;
            }

            class227 var8 = new class227();
            var8.method4010(-1537662698);
            var8.method4011(var4, (long) (8 * var2));
            byte[] var6 = new byte[64];
            var8.method4012(var6, 0, -1569457483);
            return var6;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "ge.i(" + ')');
        }
    }

    static void method1112(class356 var0, int var1) {
        try {
            var0.field1794 = null;
            if (class356.field1796 < 20) {
                class356.field1795.method5209(var0, -104859728);
                ++class356.field1796;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ge.p(" + ')');
        }
    }

    static final void method1113(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9149.method2717(-2143087996);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ge.akl(" + ')');
        }
    }

    void method1107(InputStream var1, byte var2) {
        try {
            this.field1464 = var1.method6375((short) 9142);
            this.field1460 = var1.method6375((short) 28083);

            for (int var3 = var1.method6371(); var3 != 0; var3 = var1.method6371()) {
                Object var4;
                if (1 == var3) {
                    var4 = new class433(this);
                } else if (var3 == 4) {
                    var4 = new class915(this);
                } else if (3 == var3) {
                    var4 = new class793(this);
                } else {
                    if (var3 != 2) {
                        throw new RuntimeException("");
                    }

                    var4 = new class62(this);
                }

                ((class697) var4).method3820(var1, 1753656698);
                this.field1459.method897((Node) var4, 120722253);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ge.a(" + ')');
        }
    }

    public void method1108(class139 var1, byte var2) {
        try {
            if (this.field1464 == var1.field641 && this.field1460 == var1.field1167) {
                for (class697 var3 = (class697) this.field1459.method901(1766612795); var3 != null; var3 = (class697) this.field1459.method906(49146)) {
                    var3.method3821(var1, -2022437727);
                }

                ++var1.field1167;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ge.f(" + ')');
        }
    }
}
