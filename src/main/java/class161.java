public class class161 {
    static int field6604;
    static class276 field6608 = new class276(0, 0);
    public boolean field6612 = false;
    int field6605;
    int field6606;
    int[][] field6607;
    int field6609 = -1;
    int field6610 = 0;
    class599 field6611 = new class599();
    class276[] field6613;

    class161(int var1, int var2, int var3) {
        this.field6605 = var2;
        this.field6606 = var1;
        this.field6607 = new int[this.field6606][var3];
        this.field6613 = new class276[this.field6605];
    }

    static void method3548(class744 var0, short var1) {
        try {
            var0.field3157[++var0.field3158 - 1] = class735.field3009.method4224(var0.field3161[var0.field3156 - 2], 245040087).field9003[var0.field3161[var0.field3156 - 1]];
            var0.field3156 -= 2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kt.e(" + ')');
        }
    }

    static final void method3549(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            String var4 = (String) var2.field3157[--var2.field3158];
            if (class960.method2212(var4, var2, -1163069607) != null) {
                var4 = var4.substring(0, var4.length() - 1);
            }

            var0.field996 = class634.method5872(var4, var2, -2046058202);
            var0.field963 = true;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kt.ob(" + ')');
        }
    }

    static final void method3550(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            switch (var2) {
                case 1391:
                    var2 = 13978;
                    break;
                case 3420:
                    var2 = 1101;
                    break;
                case 8784:
                    var2 = 29897;
                    break;
                case 8786:
                    var2 = 29898;
                    break;
                case 8788:
                    var2 = 29896;
                    break;
                case 12183:
                    var2 = 1607;
                    break;
                case 15262:
                    var2 = 11694;
                    break;
                case 19709:
                    var2 = 4091;
                    break;
                case 20767:
                    var2 = 29895;
            }

            ItemDefinition var3 = class85.field1121.method1566(var2);
            if (var3.field4273 >= 0 && var3.field4226 >= 0) {
                var0.field3161[++var0.field3156 - 1] = var3.field4226;
            } else {
                var0.field3161[++var0.field3156 - 1] = var2;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "kt.aag(" + ')');
        }
    }

    static final void method3551(boolean var0, byte var1) {
        try {
            class811.method2924(class730.field2822, class759.field4331, class97.field614, var0, 1828905535);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kt.kg(" + ')');
        }
    }

    static final void method3552(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            class327 var3 = class459.method3965(-1164141102);
            if (var3 != null) {
                boolean var4 = var3.method7(var2 >> 28 & 3, var2 >> 14 & 16383, var2 & 16383, class384.field1429, 1911692873);
                if (var4) {
                    var0.field3161[++var0.field3156 - 1] = class384.field1429[1];
                    var0.field3161[++var0.field3156 - 1] = class384.field1429[2];
                } else {
                    var0.field3161[++var0.field3156 - 1] = -1;
                    var0.field3161[++var0.field3156 - 1] = -1;
                }
            } else {
                var0.field3161[++var0.field3156 - 1] = -1;
                var0.field3161[++var0.field3156 - 1] = -1;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kt.aep(" + ')');
        }
    }

    final void method3545(int var1) {
        try {
            for (int var2 = 0; var2 < this.field6606; ++var2) {
                this.field6607[var2] = null;
            }

            this.field6613 = null;
            this.field6607 = null;
            this.field6611.method1286(-1936025325);
            this.field6611 = null;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kt.a(" + ')');
        }
    }

    public final int[] method3546(int var1, int var2) {
        try {
            if (this.field6606 != this.field6605) {
                if (this.field6606 != 1) {
                    class276 var3 = this.field6613[var1];
                    if (var3 == null) {
                        this.field6612 = true;
                        if (this.field6610 >= this.field6606) {
                            class276 var4 = (class276) this.field6611.method1278(975410288);
                            var3 = new class276(var1, var4.field10590);
                            this.field6613[var4.field10589] = null;
                            var4.method545(-1460969981);
                        } else {
                            var3 = new class276(var1, this.field6610);
                            ++this.field6610;
                        }

                        this.field6613[var1] = var3;
                    } else {
                        this.field6612 = false;
                    }

                    this.field6611.method1279(var3, 943102582);
                    return this.field6607[var3.field10590];
                } else {
                    this.field6612 = var1 != this.field6609;
                    this.field6609 = var1;
                    return this.field6607[0];
                }
            } else {
                this.field6612 = this.field6613[var1] == null;
                this.field6613[var1] = field6608;
                return this.field6607[var1];
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kt.f(" + ')');
        }
    }

    public final int[][] method3547(int var1) {
        try {
            if (this.field6605 != this.field6606) {
                throw new RuntimeException();
            } else {
                for (int var2 = 0; var2 < this.field6606; ++var2) {
                    this.field6613[var2] = field6608;
                }

                return this.field6607;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kt.b(" + ')');
        }
    }
}
