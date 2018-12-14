public class class660 {
    public static int field9627 = 1;
    public static int field9631 = 2;
    public static int field9634 = 0;
    public static class660[] field9636 = new class660[16];
    public static NodeTable field9638 = new NodeTable(16);
    public static int field9647 = 1;
    public static int field9648 = 0;
    static int field9628 = 2;
    static int field9629 = 0;
    static int field9633 = 1;
    static int field9635 = 1;
    static class1 field9639 = new class1(64);
    static int field9642 = 0;
    public int field9630;
    public int field9640;
    public long field9641;
    public int field9643;
    public int field9644;
    public int field9645;
    public int field9646;
    public int field9649 = 0;
    public int field9650;
    public int field9651;
    public int field9652 = 0;
    public int field9653;
    int field9632;
    boolean field9637 = false;

    static final void method5747(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 2);
            var0.field3161[++var0.field3156 - 1] = var3.field881;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "hy.qh(" + ')');
        }
    }

    static final void method5748(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            if (class730.field2924 != 0 && var2 < class730.field2934) {
                var0.field3157[++var0.field3158 - 1] = class730.field2841[var2];
                if (class730.field2937[var2] != null) {
                    var0.field3157[++var0.field3158 - 1] = class730.field2937[var2];
                } else {
                    var0.field3157[++var0.field3158 - 1] = "";
                }
            } else {
                var0.field3157[++var0.field3158 - 1] = "";
                var0.field3157[++var0.field3158 - 1] = "";
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "hy.wr(" + ')');
        }
    }

    static final void method5749(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9129.method2273(var2, 1352882135);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "hy.aos(" + ')');
        }
    }

    public static int method5750(byte var0) {
        try {
            if (class53.field2311 && class296.field10468 != null) {
                return 3;
            } else {
                return class730.field2780 ? 2 : 1;
            }
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "hy.gc(" + ')');
        }
    }

    static final void method5751(class744 var0, int var1) {
        try {
            var0.field3176 += var0.field3174[var0.field3176];
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "hy.j(" + ')');
        }
    }

    void method5744(InputStream var1, int var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    if (var2 == -1336450331) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                this.method5745(var1, var3, 1980463854);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "hy.b(" + ')');
        }
    }

    void method5745(InputStream var1, int var2, int var3) {
        try {
            if (1 == var2) {
                this.field9632 = var1.method6374();
            } else if (2 == var2) {
                var1.method6371();
            } else if (var2 == 3) {
                this.field9643 = var1.method6420((byte) -21);
                this.field9644 = var1.method6420((byte) 12);
                this.field9645 = var1.method6420((byte) 61);
            } else if (4 == var2) {
                this.field9646 = var1.method6371();
                this.field9630 = var1.method6420((byte) 6);
            } else if (6 == var2) {
                this.field9650 = var1.method6371();
            } else if (var2 == 8) {
                this.field9652 = 1;
            } else if (9 == var2) {
                this.field9649 = 1;
            } else if (var2 == 10) {
                this.field9637 = true;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "hy.p(" + ')');
        }
    }

    void method5746(int var1) {
        try {
            this.field9653 = class703.field3404[this.field9632 << 3];
            long var2 = (long) this.field9643;
            long var4 = (long) this.field9644;
            long var6 = (long) this.field9645;
            this.field9651 = (int) Math.sqrt((double) (var2 * var2 + var4 * var4 + var6 * var6));
            if (this.field9630 == 0) {
                this.field9630 = 1;
            }

            if (this.field9646 == 0) {
                this.field9641 = 2147483647L;
            } else if (this.field9646 == 1) {
                this.field9641 = (long) (this.field9651 * 8 / this.field9630);
                this.field9641 = this.field9641 * 8888916578422759065L * this.field9641 * 6688605316592129449L;
            } else if (this.field9646 == 2) {
                this.field9641 = (long) (this.field9651 * 8 / this.field9630);
            }

            if (this.field9637) {
                this.field9651 = this.field9651 * -1363693449 * -1 * 1414342983;
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "hy.i(" + ')');
        }
    }
}
