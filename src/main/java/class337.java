public class class337 {
    class1 field73 = new class1(64);
    class180 field74;

    public class337(class469 var1, class423 var2, class180 var3) {
        this.field74 = var3;
        if (this.field74 != null) {
            this.field74.method3286(class981.field3225.field3271, -279300149);
        }

    }

    public static boolean method76(byte var0) {
        try {
            class149 var1 = (class149) class79.field1525.method901(1766612795);
            return var1 != null;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "pj.f(" + ')');
        }
    }

    public static void method77(int var0, boolean var1, int var2) {
        try {
            class416.method5649(var0, class814.field4748.method2927(class321.field1066, -875414210), var1, (byte) 31);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "pj.fw(" + ')');
        }
    }

    static void method78(int var0, int var1, int var2, int var3, int var4, int var5, class552 var6, byte var7) {
        try {
            class563 var8 = null;

            for (class563 var9 = (class563) class563.field1081.method901(1766612795); var9 != null; var9 = (class563) class563.field1081.method906(49146)) {
                if (var0 == var9.field1070 && var1 == var9.field1069 && var2 == var9.field1074 && var9.field1076 == var3) {
                    var8 = var9;
                    break;
                }
            }

            if (var8 == null) {
                var8 = new class563();
                var8.field1070 = var0;
                var8.field1076 = var3;
                var8.field1069 = var1;
                var8.field1074 = var2;
                class563.field1081.method897(var8, 1693481470);
            }

            var8.field1075 = var4;
            var8.field1072 = var5;
            var8.field1077 = var6;
            var8.field1078 = true;
            var8.field1079 = false;
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "pj.f(" + ')');
        }
    }

    public void method72(int var1, int var2) {
        try {
            class1 var3 = this.field73;
            synchronized (this.field73) {
                this.field73.method2976(var1, -1076736355);
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "pj.b(" + ')');
        }
    }

    public void method73(byte var1) {
        try {
            class1 var2 = this.field73;
            synchronized (this.field73) {
                this.field73.method2977();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "pj.f(" + ')');
        }
    }

    public void method74(int var1) {
        try {
            class1 var2 = this.field73;
            synchronized (this.field73) {
                this.field73.method2979();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "pj.p(" + ')');
        }
    }

    public class747 method75(int var1, int var2) {
        try {
            class1 var3 = this.field73;
            class747 var4;
            synchronized (this.field73) {
                var4 = (class747) this.field73.method2974((long) var1);
            }

            if (var4 != null) {
                return var4;
            } else {
                class180 var5 = this.field74;
                byte[] var10;
                synchronized (this.field74) {
                    var10 = this.field74.method3285(class981.field3225.field3271, var1, (byte) -90);
                }

                var4 = new class747();
                if (var10 != null) {
                    var4.method2609(new InputStream(var10), 1705012994);
                }

                class1 var11 = this.field73;
                synchronized (this.field73) {
                    this.field73.method2984(var4, (long) var1);
                }

                return var4;
            }
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "pj.a(" + ')');
        }
    }
}
