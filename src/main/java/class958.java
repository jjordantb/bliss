public abstract class class958 {
    public static class727 field3479;
    public static int field3480;
    static int field3473 = 2;
    static int field3474 = 4;
    static int field3475 = 8;
    static int field3477 = 1;
    public int field3472;
    public int field3476;
    int field3478;

    static final void method2054(class744 var0, int var1) {
        try {
            int var2 = var0.field3174[var0.field3176];
            var0.field3161[++var0.field3156 - 1] = class827.field9037.method5653(var2, (byte) 38);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "oh.at(" + ')');
        }
    }

    static final void method2055(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9148.method2717(-2143352335);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "oh.ajf(" + ')');
        }
    }

    public static final int method2056(int var0, int var1, byte var2) {
        try {
            if (var0 == -2) {
                return 12345678;
            } else if (var0 == -1) {
                if (var1 < 2) {
                    var1 = 2;
                } else if (var1 > 126) {
                    var1 = 126;
                }

                return var1;
            } else {
                var1 = (var0 & 127) * var1 >> 7;
                if (var1 < 2) {
                    var1 = 2;
                } else if (var1 > 126) {
                    var1 = 126;
                }

                return (var0 & 'ﾀ') + var1;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "oh.n(" + ')');
        }
    }

    static boolean method2057(int var0) {
        try {
            ++class730.field2694;
            class730.field2695 = true;
            return true;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "oh.ne(" + ')');
        }
    }

    public boolean method2050(byte var1) {
        try {
            return (this.field3476 & 2) != 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "oh.f(" + ')');
        }
    }

    public boolean method2051(int var1) {
        try {
            return (this.field3476 & 4) != 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "oh.b(" + ')');
        }
    }

    public boolean method2052(int var1) {
        try {
            return (this.field3476 & 8) != 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "oh.p(" + ')');
        }
    }

    public boolean method2053(int var1) {
        try {
            return (this.field3476 & 1) != 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "oh.a(" + ')');
        }
    }
}
