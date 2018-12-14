public class class617 {
    static int field8843;
    class1 field8841 = new class1(64);
    class180 field8842;

    public class617(class469 var1, class423 var2, class180 var3) {
        this.field8842 = var3;
        if (this.field8842 != null) {
            this.field8842.method3286(class981.field3241.field3271, -1236940551);
        }

    }

    static final void method5168(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class643.field10036;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rr.amt(" + ')');
        }
    }

    static final void method5169(class744 var0, short var1) {
        try {
            if (14 == class730.field2733) {
                class601.field9194 = var0.field3161[--var0.field3156] == 1;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rr.alm(" + ')');
        }
    }

    static final void method5170(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class811.field4654;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rr.amj(" + ')');
        }
    }

    public void method5164(byte var1) {
        try {
            class1 var2 = this.field8841;
            synchronized (this.field8841) {
                this.field8841.method2977();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "rr.f(" + ')');
        }
    }

    public void method5165(int var1, int var2) {
        try {
            class1 var3 = this.field8841;
            synchronized (this.field8841) {
                this.field8841.method2976(var1, -1679910575);
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "rr.b(" + ')');
        }
    }

    public void method5166(int var1) {
        try {
            class1 var2 = this.field8841;
            synchronized (this.field8841) {
                this.field8841.method2979();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "rr.p(" + ')');
        }
    }

    public class123 method5167(int var1, int var2) {
        try {
            class1 var3 = this.field8841;
            class123 var4;
            synchronized (this.field8841) {
                var4 = (class123) this.field8841.method2974((long) var1);
            }

            if (var4 != null) {
                return var4;
            } else {
                byte[] var9 = this.field8842.method3285(class981.field3241.field3271, var1, (byte) 14);
                var4 = new class123();
                if (var9 != null) {
                    var4.method1633(new InputStream(var9), 2030266422);
                }

                class1 var5 = this.field8841;
                synchronized (this.field8841) {
                    this.field8841.method2984(var4, (long) var1);
                }

                return var4;
            }
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "rr.a(" + ')');
        }
    }
}
