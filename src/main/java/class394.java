public class class394 {
    static class180 field5418;
    class180 field5416;
    class1 field5417 = new class1(16);

    public class394(class469 var1, class423 var2, class180 var3) {
        this.field5416 = var3;
        this.field5416.method3286(class981.field3245.field3271, -1713499559);
    }

    static final void method3410(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            var2.field3156 -= 4;
            var0.field876 = var2.field3161[var2.field3156];
            var0.field865 = var2.field3161[1 + var2.field3156];
            if (1 == var2.field3161[var2.field3156 + 2]) {
                var0.field909 = 9;
            } else {
                var0.field909 = 8;
            }

            if (var2.field3161[var2.field3156 + 3] == 1) {
                var0.field938 = true;
            } else {
                var0.field938 = false;
            }

            if (-1 == var0.field879 && !var1.closed) {
                class535.method2284(var0.field867, 1592451280);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nf.iw(" + ')');
        }
    }

    static final void method3411(class744 var0, int var1) {
        try {
            if (class730.field2637 != null) {
                var0.field3157[++var0.field3158 - 1] = class730.field2637;
            } else {
                var0.field3157[++var0.field3158 - 1] = "";
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "nf.aht(" + ')');
        }
    }

    static final void method3412(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -76);
            WidgetContainer var4 = class382.widgetContainers[var2 >>> 16];
            Widget var5 = class317.method471(var4, var3, -635605619);
            var0.field3161[++var0.field3156 - 1] = var5 == null ? -1 : -440872681 * var5.field867 * 533296807;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nf.rt(" + ')');
        }
    }

    public static void method3413(int var0) {
        try {
            if (19 == class730.field2733 && !class673.method4261((byte) 16) && !class556.method431(-391880689)) {
                class967.method1750(2, 1642271064);
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "nf.a(" + ')');
        }
    }

    static final void method3414(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = var2 >> 28;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "nf.ts(" + ')');
        }
    }

    public class544 method3405(int var1, int var2, int var3, int var4, class277 var5, byte var6) {
        try {
            class481[] var7 = null;
            class191 var8 = this.method3409(var1, 1130929596);
            if (var8.field7001 != null) {
                var7 = new class481[var8.field7001.length];

                for (int var9 = 0; var9 < var7.length; ++var9) {
                    class176 var10 = var5.method6631(var8.field7001[var9], -1248511043);
                    var7[var9] = new class481(var10.field5218, var10.field5215, var10.field5210, var10.field5216, var10.field5208, var10.field5217, var10.field5214, var10.field5213, var10.field5212, var10.field5211, var10.field5209);
                }
            }

            return new class544(var8.field7000, var7, var8.field6999, var2, var3, var4, var8.field7002, var8.field7003);
        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "nf.f(" + ')');
        }
    }

    public void method3406(byte var1) {
        try {
            class1 var2 = this.field5417;
            synchronized (this.field5417) {
                this.field5417.method2977();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "nf.b(" + ')');
        }
    }

    public void method3407(int var1, int var2) {
        try {
            class1 var3 = this.field5417;
            synchronized (this.field5417) {
                this.field5417.method2976(var1, 21848590);
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nf.p(" + ')');
        }
    }

    public void method3408(int var1) {
        try {
            class1 var2 = this.field5417;
            synchronized (this.field5417) {
                this.field5417.method2979();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "nf.i(" + ')');
        }
    }

    class191 method3409(int var1, int var2) {
        try {
            class1 var3 = this.field5417;
            class191 var4;
            synchronized (this.field5417) {
                var4 = (class191) this.field5417.method2974((long) var1);
            }

            if (var4 != null) {
                return var4;
            } else {
                class180 var5 = this.field5416;
                byte[] var10;
                synchronized (this.field5416) {
                    var10 = this.field5416.method3285(class981.field3245.field3271, var1, (byte) -79);
                }

                var4 = new class191();
                if (var10 != null) {
                    var4.method3720(new InputStream(var10), (byte) -47);
                }

                class1 var11 = this.field5417;
                synchronized (this.field5417) {
                    this.field5417.method2984(var4, (long) var1);
                }

                return var4;
            }
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "nf.a(" + ')');
        }
    }
}
