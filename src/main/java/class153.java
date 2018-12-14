public class class153 {
    public static int field5400 = 8;
    public static int field5401 = 4;
    public static int field5403 = 2;
    static int field5402 = 2;
    static int field5404 = 1;
    static int field5405 = 16;
    public byte[][][] field5406;

    public class153(int var1, int var2, int var3) {
        this.field5406 = new byte[var1][var2][var3];
    }

    static final void method3389(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            var2.field3156 -= 2;
            var0.field918 = var2.field3161[var2.field3156];
            var0.field919 = var2.field3161[var2.field3156 + 1];
            class814.method2932(var0, -147880968);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kf.fq(" + ')');
        }
    }

    static final void method3390(class744 var0, int var1) {
        try {
            --var0.field3156;
            int var2 = var0.field3161[var0.field3156];
            class256 var3 = (class256) class730.field2823.method2942((long) var2);
            if (var3 != null && 3 == var3.field8100) {
                class526.method2226(var3, true, true, -113822480);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "kf.sh(" + ')');
        }
    }

    static final void method3391(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            class122.method1608(var2 >> 14 & 16383, var2 & 16383, -548972447);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kf.aeb(" + ')');
        }
    }

    public static void method3392(int var0) {
        try {
            class5.method2959(1590487126);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "kf.f(" + ')');
        }
    }

    static void method3393(byte[] var0, int var1) {
        try {
            InputStream var2 = new InputStream(var0);

            while (true) {
                int var3 = var2.method6371();
                if (var3 == 0) {
                    if (var1 == -475561782) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                if (1 == var3) {
                    int var4 = var2.method6374();
                    if (class540.field3923 == -1) {
                        class540.field3923 = var4;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kf.x(" + ')');
        }
    }

    public static int method3394(CharSequence var0, int var1) {
        try {
            int var2 = var0.length();
            int var3 = 0;

            for (int var4 = 0; var4 < var2; ++var4) {
                var3 = (var3 << 5) - var3 + class84.method940(var0.charAt(var4), 1088430238);
            }

            return var3;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kf.r(" + ')');
        }
    }

    static final void method3395(class744 var0, int var1) {
        try {
            if (var0.field3161[--var0.field3156] == 1) {
                var0.field3176 += var0.field3174[var0.field3176];
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kf.bw(" + ')');
        }
    }

    public static void method3396(Npc var0, byte var1) {
        try {
            for (class206 var2 = (class206) class206.field7098.method901(1766612795); var2 != null; var2 = (class206) class206.field7098.method906(49146)) {
                if (var0 == var2.field7076) {
                    if (var2.field7090 != null) {
                        class56.field2321.method3875(var2.field7090);
                        var2.field7090 = null;
                    }

                    var2.method545(-1460969981);
                    break;
                }
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kf.k(" + ')');
        }
    }

    public void method3385(int var1) {
        try {
            for (int var2 = 0; var2 < this.field5406.length; ++var2) {
                for (int var3 = 0; var3 < this.field5406[0].length; ++var3) {
                    for (int var4 = 0; var4 < this.field5406[0][0].length; ++var4) {
                        this.field5406[var2][var3][var4] = 0;
                    }
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kf.a(" + ')');
        }
    }

    public boolean method3386(int var1, int var2, int var3) {
        try {
            if (var1 >= 0 && var2 >= 0 && var1 < this.field5406[1].length && var2 < this.field5406[1][var1].length) {
                return (this.field5406[1][var1][var2] & 2) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kf.f(" + ')');
        }
    }

    public boolean method3387(int var1, int var2, int var3, int var4, byte var5) {
        try {
            if ((this.field5406[0][var3][var4] & 2) != 0) {
                return true;
            } else if ((this.field5406[var2][var3][var4] & 16) != 0) {
                return false;
            } else {
                return this.method3388(var2, var3, var4, 739061165) == var1;
            }
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "kf.b(" + ')');
        }
    }

    int method3388(int var1, int var2, int var3, int var4) {
        try {
            if ((this.field5406[var1][var2][var3] & 8) != 0) {
                return 0;
            } else {
                return var1 > 0 && (this.field5406[1][var2][var3] & 2) != 0 ? var1 - 1 : var1;
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "kf.p(" + ')');
        }
    }
}
