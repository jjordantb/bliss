import java.io.IOException;

public class class16 {
    public static class180 field6892;
    public int field6890;
    class1 field6889 = new class1(64);
    class180 field6891;

    public class16(class469 var1, class423 var2, class180 var3) {
        this.field6891 = var3;
        if (this.field6891 != null) {
            this.field6890 = this.field6891.method3286(class981.field3263.field3271, 650803238);
        } else {
            this.field6890 = 0;
        }

    }

    static void method3679(class848 var0, int var1) {
        try {
            if (class458.field7202.method910(1828905535) != 0) {
                class914 var2;
                if (class615.field8903.field9137.method3689(-627187888) == 0) {
                    for (var2 = (class914) class458.field7202.method901(1766612795); var2 != null; var2 = (class914) class458.field7202.method906(49146)) {
                        class85.field1121.method1571(var0, var0, var2.field10405, var2.field10402, var2.field10404, var2.field10401, false, false, var2.field10403, class202.field7587, var2.field10406 ? class923.local.field3388 : null, 1788760477);
                        var2.method545(-1460969981);
                    }

                    class881.method6172(-1387034810);
                } else {
                    if (class458.field7204 == null) {
                        MyCanvas var4 = new MyCanvas();
                        var4.setSize(36, 32);
                        class458.field7204 = class317.method474(0, var4, class962.field3627, class776.field3729, 0, -753690122);
                        class458.field7203 = class458.field7204.method4936(IterableSceneEntity.method3539(class526.field3666, class295.field10470, 0, (byte) 78), class922.method6248(class562.field827, class295.field10470, 0), true);
                    }

                    for (var2 = (class914) class458.field7202.method901(1766612795); var2 != null; var2 = (class914) class458.field7202.method906(49146)) {
                        class85.field1121.method1571(class458.field7204, var0, var2.field10405, var2.field10402, var2.field10404, var2.field10401, false, false, var2.field10403, class458.field7203, var2.field10406 ? class923.local.field3388 : null, 1451736551);
                        var2.method545(-1460969981);
                    }
                }
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "vt.f(" + ')');
        }
    }

    static final void method3680(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            class785 var4 = class452.field7216.method5148(var3, 1417186539);
            if (var4.method2380(1883696427)) {
                var0.field3157[++var0.field3158 - 1] = class258.field7913.method12(var2, 745591351).method6115(var3, var4.field3823, 1273707892);
            } else {
                var0.field3161[++var0.field3156 - 1] = class258.field7913.method12(var2, 1830480683).method6109(var3, var4.field3822, (byte) 106);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "vt.abu(" + ')');
        }
    }

    public static void method3681(boolean var0, int var1) {
        try {
            class341.method252(2092159420);
            if (class552.method457(class730.field2733, (byte) -21)) {
                class684[] var2 = class730.field2660;

                for (int var3 = 0; var3 < var2.length; ++var3) {
                    class684 var4 = var2[var3];
                    ++var4.field7774;
                    if (var4.field7774 < 50 && !var0) {
                        return;
                    }

                    var4.field7774 = 0;
                    if (!var4.field7782 && var4.method4377(537308016) != null) {
                        class701 var5 = class637.method5936(class643.field9951, var4.field7765, (byte) 20);
                        var4.method4380(var5, (byte) -114);

                        try {
                            var4.method4376(-1411124831);
                        } catch (IOException var7) {
                            var4.field7782 = true;
                        }
                    }
                }

                class341.method252(1802810094);
            }

        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "vt.a(" + ')');
        }
    }

    public void method3675(int var1, int var2) {
        try {
            class1 var3 = this.field6889;
            synchronized (this.field6889) {
                this.field6889.method2976(var1, -583338746);
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "vt.b(" + ')');
        }
    }

    public void method3676(int var1) {
        try {
            class1 var2 = this.field6889;
            synchronized (this.field6889) {
                this.field6889.method2977();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "vt.f(" + ')');
        }
    }

    public void method3677(byte var1) {
        try {
            class1 var2 = this.field6889;
            synchronized (this.field6889) {
                this.field6889.method2979();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "vt.p(" + ')');
        }
    }

    public class579 method3678(int var1, int var2) {
        try {
            class1 var3 = this.field6889;
            class579 var4;
            synchronized (this.field6889) {
                var4 = (class579) this.field6889.method2974((long) var1);
            }

            if (var4 != null) {
                return var4;
            } else {
                class180 var5 = this.field6891;
                byte[] var10;
                synchronized (this.field6891) {
                    var10 = this.field6891.method3285(class981.field3263.field3271, var1, (byte) -91);
                }

                var4 = new class579();
                if (var10 != null) {
                    var4.method80(new InputStream(var10), -1099657695);
                }

                class1 var11 = this.field6889;
                synchronized (this.field6889) {
                    this.field6889.method2984(var4, (long) var1);
                }

                return var4;
            }
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "vt.a(" + ')');
        }
    }
}
