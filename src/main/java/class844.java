public class class844 {
    public static int field8682 = 64;
    public static int field8683 = 128;
    class1 field8679 = new class1(128);
    class180 field8680;
    class1 field8681 = new class1(64);
    class180 field8684;

    public class844(class469 var1, class423 var2, class180 var3, class180 var4) {
        this.field8680 = var3;
        this.field8684 = var4;
        this.field8680.method3286(class981.field3252.field3271, -1187243048);
    }

    static final void method5096(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 40);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class640.method6190(var3, var4, var0, (short) -26204);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "od.jb(" + ')');
        }
    }

    static final void method5097(class744 var0, byte var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class510.method2622(var3, var4, var0, (byte) -60);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "od.ls(" + ')');
        }
    }

    static final void method5098(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class912.field10424.method5513((byte) -67);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "od.ux(" + ')');
        }
    }

    static final void method5099(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class896.field9358 + class491.field7820;
            var0.field3161[++var0.field3156 - 1] = class747.field4148 + class491.field7813;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "od.adq(" + ')');
        }
    }

    static void method5100(InputStream var0, int var1) {
        try {
            while (true) {
                int var2 = var0.method6371();
                switch (var2) {
                    case 0:
                        class949.field3328 = var0.method6374();
                        class949.field3329 = var0.method6374();
                        break;
                    case 255:
                        return;
                }
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "od.f(" + ')');
        }
    }

    static final void method5101(class744 var0, int var1) {
        try {
            var0.field3160 = new class24();
            var0.field3160.field6482 = var0.field3161[--var0.field3156];
            var0.field3160.field6483 = class906.field10363.method2713(var0.field3160.field6482, (short) -31803);
            var0.field3160.field6484 = new int[var0.field3160.field6483.method6653((short) -407)];
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "od.ace(" + ')');
        }
    }

    public class718 method5091(int var1, int var2) {
        try {
            class1 var3 = this.field8679;
            class718 var4;
            synchronized (this.field8679) {
                var4 = (class718) this.field8679.method2974((long) var1);
            }

            if (var4 != null) {
                return var4;
            } else {
                class180 var5 = this.field8680;
                byte[] var10;
                synchronized (this.field8680) {
                    var10 = this.field8680.method3285(class981.field3252.field3271, var1, (byte) -50);
                }

                var4 = new class718();
                var4.field3499 = var1;
                var4.field3491 = this;
                if (var10 != null) {
                    var4.method2060(new InputStream(var10), 677294156);
                }

                var4.method2062(-2028802869);
                class1 var11 = this.field8679;
                synchronized (this.field8679) {
                    this.field8679.method2984(var4, (long) var1);
                }

                return var4;
            }
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "od.a(" + ')');
        }
    }

    public void method5092(int var1, byte var2) {
        try {
            class1 var3 = this.field8679;
            synchronized (this.field8679) {
                this.field8679.method2976(var1, -346772344);
            }

            var3 = this.field8681;
            synchronized (this.field8681) {
                this.field8681.method2976(var1, -549143520);
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "od.p(" + ')');
        }
    }

    public void method5093(int var1) {
        try {
            class1 var2 = this.field8679;
            synchronized (this.field8679) {
                this.field8679.method2977();
            }

            var2 = this.field8681;
            synchronized (this.field8681) {
                this.field8681.method2977();
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "od.b(" + ')');
        }
    }

    public void method5094(int var1, int var2, int var3) {
        try {
            this.field8679 = new class1(var1);
            this.field8681 = new class1(var2);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "od.f(" + ')');
        }
    }

    public void method5095(int var1) {
        try {
            class1 var2 = this.field8679;
            synchronized (this.field8679) {
                this.field8679.method2979();
            }

            var2 = this.field8681;
            synchronized (this.field8681) {
                this.field8681.method2979();
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "od.i(" + ')');
        }
    }
}
