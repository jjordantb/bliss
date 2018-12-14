import java.awt.*;

public class class646 implements class415 {
    static long field9251 = 4611686018427387903L;
    static long field9252 = 4611686018427387904L;
    static int[] field9253 = new int[32];
    static long field9254 = 500L;
    static long field9256 = 1L;

    static {
        int var0 = 2;

        for (int var1 = 0; var1 < 32; ++var1) {
            field9253[var1] = var0 - 1;
            var0 += var0;
        }

    }

    public int[] field9257;
    NodeTable field9250 = new NodeTable(128);
    int[] field9255;

    public class646() {
        this.field9255 = new int[class539.field3762.field9624];
        this.field9257 = new int[class539.field3762.field9624];
    }

    static final void method5498(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -44);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class534.method2293(var3, var4, var0, 2065875065);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "g.hc(" + ')');
        }
    }

    static final void method5499(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 31);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class957.method2100(var3, var4, var0, 805534141);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "g.ko(" + ')');
        }
    }

    static final void method5500(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class730.field2646;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "g.uy(" + ')');
        }
    }

    static final void method5501(class744 var0, short var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class730.field2661 ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "g.ahy(" + ')');
        }
    }

    public static void method5502(int var0, int var1) {
        try {
            if (var0 < 0 || var0 > 2) {
                var0 = 0;
            }

            class198.field7038 = var0;
            class198.field7042 = new class726[1 + class948.field3284[class198.field7038]];
            class198.field7043 = 0;
            class198.field7044 = 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "g.i(" + ')');
        }
    }

    static final void method5503(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            var0.field3161[++var0.field3156 - 1] = class563.method861(var2, var3, false, false, 1482071907);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "g.ul(" + ')');
        }
    }

    public static void method5504(byte var0) {
        try {
            if (class296.field10468 == null) {
                int var1 = class69.field1813;
                int var2 = class69.field1814;
                int var3 = class919.field10433 - class759.field4331 - var1;
                int var4 = class69.field1812 - class97.field614 - var2;
                if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
                    try {
                        Container var5 = class348.method193((byte) 92);
                        int var6 = 0;
                        int var7 = 0;
                        if (var5 == class701.field3371) {
                            Insets var8 = class701.field3371.getInsets();
                            var6 = var8.left;
                            var7 = var8.top;
                        }

                        Graphics var11 = var5.getGraphics();
                        var11.setColor(Color.black);
                        if (var1 > 0) {
                            var11.fillRect(var6, var7, var1, class69.field1812);
                        }

                        if (var2 > 0) {
                            var11.fillRect(var6, var7, class919.field10433, var2);
                        }

                        if (var3 > 0) {
                            var11.fillRect(var6 + class919.field10433 - var3, var7, var3, class69.field1812);
                        }

                        if (var4 > 0) {
                            var11.fillRect(var6, class69.field1812 + var7 - var4, class919.field10433, var4);
                        }
                    } catch (Exception var9) {
                        ;
                    }
                }
            }

        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "g.go(" + ')');
        }
    }

    static final void method5505(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 62);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class984.method1885(var3, var4, var0, (byte) 84);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "g.cc(" + ')');
        }
    }

    static final void method5506(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            var0.field1009 = var2.field3161[--var2.field3156];
            class814.method2932(var0, 2100669842);
            if (-1 == var0.field879 && !var1.closed) {
                class466.method4009(var0.field867, -1977969421);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "g.fc(" + ')');
        }
    }

    public int method5655(int var1, byte var2) {
        try {
            return this.field9257[var1];
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "g.d(" + ')');
        }
    }

    void method5492(int var1, int var2, int var3) {
        try {
            class490 var4 = class905.field10369.method5458(var1, -781710328);
            int var5 = var4.field7863;
            int var6 = var4.field7862;
            int var7 = var4.field7864;
            int var8 = field9253[var7 - var6];
            if (var2 < 0 || var2 > var8) {
                var2 = 0;
            }

            var8 <<= var6;
            this.method5495(var5, this.field9255[var5] & ~var8 | var2 << var6 & var8, (byte) 16);
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "g.k(" + ')');
        }
    }

    void method5493(int var1) {
        try {
            for (int var2 = 0; var2 < class539.field3762.field9624; ++var2) {
                this.field9255[var2] = 0;
                this.field9257[var2] = 0;
            }

            this.field9250 = new NodeTable(128);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "g.f(" + ')');
        }
    }

    public void method5494(int var1, int var2, int var3) {
        try {
            this.field9257[var1] = var2;
            class852 var4 = (class852) this.field9250.method2942((long) var1);
            if (var4 != null) {
                var4.field8727 = class27.resetTimer((byte) 1) + 500L;
            } else {
                var4 = new class852(class27.resetTimer((byte) 1) + 500L);
                this.field9250.method2947(var4, (long) var1);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "g.b(" + ')');
        }
    }

    void method5495(int var1, int var2, byte var3) {
        try {
            this.field9255[var1] = var2;
            class852 var4 = (class852) this.field9250.method2942((long) var1);
            if (var4 != null) {
                if (4611686018427387905L != var4.field8727) {
                    var4.field8727 = class27.resetTimer((byte) 1) + 500L | 4611686018427387904L;
                }
            } else {
                var4 = new class852(4611686018427387905L);
                this.field9250.method2947(var4, (long) var1);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "g.p(" + ')');
        }
    }

    public void method5496(int var1, int var2, int var3) {
        try {
            class490 var4 = class905.field10369.method5458(var1, -781710328);
            int var5 = var4.field7863;
            int var6 = var4.field7862;
            int var7 = var4.field7864;
            int var8 = field9253[var7 - var6];
            if (var2 < 0 || var2 > var8) {
                var2 = 0;
            }

            var8 <<= var6;
            this.method5494(var5, this.field9257[var5] & ~var8 | var2 << var6 & var8, 681479919);
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "g.i(" + ')');
        }
    }

    public int method5653(int var1, byte var2) {
        try {
            class490 var3 = class905.field10369.method5458(var1, -781710328);
            int var4 = var3.field7863;
            int var5 = var3.field7862;
            int var6 = var3.field7864;
            int var7 = field9253[var6 - var5];
            return this.field9257[var4] >> var5 & var7;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "g.u(" + ')');
        }
    }

    int method5497(boolean var1, int var2) {
        try {
            long var3 = class27.resetTimer((byte) 1);

            for (class852 var5 = (class852) (var1 ? this.field9250.method2946(1646690306) : this.field9250.method2945((byte) 18)); var5 != null; var5 = (class852) this.field9250.method2945((byte) -66)) {
                if ((var5.field8727 & 4611686018427387903L) < var3) {
                    if ((var5.field8727 & 4611686018427387904L) != 0L) {
                        int var6 = (int) var5.field641;
                        this.field9257[var6] = this.field9255[var6];
                        var5.method545(-1460969981);
                        return var6;
                    }

                    var5.method545(-1460969981);
                }
            }

            return -1;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "g.a(" + ')');
        }
    }
}
