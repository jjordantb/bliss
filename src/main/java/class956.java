import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class class956 extends class352 implements KeyListener, FocusListener {
    static int[] field3608 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int field3609 = 128;
    static int field3611 = 112;
    class373 field3610 = new class373();
    boolean[] field3612 = new boolean[112];
    Component field3613;
    class373 field3614 = new class373();

    class956(Component var1) {
        class766.method2759((byte) -1);
        this.method2108(var1, (byte) 0);
    }

    public static void method2113(int var0, int var1, int var2) {
        try {
            if (class818.field4611 != 0) {
                if (var0 < 0) {
                    for (int var3 = 0; var3 < 16; ++var3) {
                        class639.field9810[var3] = var1;
                    }
                } else {
                    class639.field9810[var0] = var1;
                }
            }

            class818.field4614.method6561(var0, var1, 852255594);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acn.u(" + ')');
        }
    }

    void method2108(Component var1, byte var2) {
        try {
            this.method2109(-1697556244);
            this.field3613 = var1;
            this.field3613.addKeyListener(this);
            this.field3613.addFocusListener(this);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acn.h(" + ')');
        }
    }

    void method2109(int var1) {
        try {
            if (this.field3613 != null) {
                this.field3613.removeKeyListener(this);
                this.field3613.removeFocusListener(this);
                this.field3613 = null;

                for (int var2 = 0; var2 < 112; ++var2) {
                    this.field3612[var2] = false;
                }

                this.field3610.method905((byte) 1);
                this.field3614.method905((byte) 1);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acn.v(" + ')');
        }
    }

    void method2110(int var1, char var2, int var3, int var4) {
        try {
            class492 var5 = new class492();
            var5.field7788 = var1;
            var5.field7792 = var2;
            var5.field7790 = var3;
            var5.field7791 = class27.resetTimer((byte) 1);
            this.field3614.method897(var5, -134660083);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "acn.g(" + ')');
        }
    }

    public class742 method1393(byte var1) {
        try {
            return (class742) this.field3610.method898(2081715499);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acn.p(" + ')');
        }
    }

    public boolean method1392(int var1, int var2) {
        try {
            return var1 >= 0 && var1 < 112 ? this.field3612[var1] : false;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acn.b(" + ')');
        }
    }

    public void method1394(int var1) {
        try {
            this.method2109(-789412244);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acn.i(" + ')');
        }
    }

    void method2111(KeyEvent var1, int var2, int var3) {
        try {
            int var4 = var1.getKeyCode();
            if (var4 != 0) {
                if (var4 >= 0 && var4 < field3608.length) {
                    var4 = field3608[var4];
                    if (var2 == 0 && (var4 & 128) != 0) {
                        var4 = 0;
                    } else {
                        var4 &= -129;
                    }
                } else {
                    var4 = 0;
                }
            } else {
                var4 = 0;
            }

            if (var4 != 0) {
                this.method2110(var2, '\uffff', var4, -2128667292);
                var1.consume();
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "acn.c(" + ')');
        }
    }

    public synchronized void method1398(int var1) {
        try {
            this.field3610.method905((byte) 1);

            for (class492 var2 = (class492) this.field3614.method898(2094124912); var2 != null; var2 = (class492) this.field3614.method898(2145579859)) {
                var2.field7789 = this.method2112(-2041069828);
                if (var2.field7788 == 0) {
                    if (!this.field3612[var2.field7790]) {
                        class492 var6 = new class492();
                        var6.field7788 = 0;
                        var6.field7792 = '\uffff';
                        var6.field7790 = var2.field7790;
                        var6.field7791 = var2.field7791;
                        var6.field7789 = var2.field7789;
                        this.field3610.method897(var6, 1964794553);
                        this.field3612[var2.field7790] = true;
                    }

                    var2.field7788 = 2;
                    this.field3610.method897(var2, -407108127);
                } else if (1 == var2.field7788) {
                    if (this.field3612[var2.field7790]) {
                        this.field3610.method897(var2, 1996250465);
                        this.field3612[var2.field7790] = false;
                    }
                } else if (var2.field7788 == -1) {
                    for (int var3 = 0; var3 < 112; ++var3) {
                        if (this.field3612[var3]) {
                            class492 var4 = new class492();
                            var4.field7788 = 1;
                            var4.field7792 = '\uffff';
                            var4.field7790 = var3;
                            var4.field7791 = var2.field7791;
                            var4.field7789 = var2.field7789;
                            this.field3610.method897(var4, 98009925);
                            this.field3612[var3] = false;
                        }
                    }
                } else if (3 == var2.field7788) {
                    this.field3610.method897(var2, 1631613634);
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "acn.f(" + ')');
        }
    }

    public synchronized void keyReleased(KeyEvent var1) {
        try {
            class730.field2619.add((byte) var1.getKeyCode());
            this.method2111(var1, 1, 1838328599);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acn.keyReleased(" + ')');
        }
    }

    public synchronized void keyTyped(KeyEvent var1) {
        try {
            char var2 = var1.getKeyChar();
            if (var2 != '\uffff' && class745.method2594(var2, 503878234)) {
                this.method2110(3, var2, -1, -1849643187);
                var1.consume();
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acn.keyTyped(" + ')');
        }
    }

    public void focusGained(FocusEvent var1) {
    }

    int method2112(int var1) {
        try {
            int var2 = 0;
            if (this.field3612[81]) {
                var2 |= 1;
            }

            if (this.field3612[82]) {
                var2 |= 4;
            }

            if (this.field3612[86]) {
                var2 |= 2;
            }

            return var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acn.e(" + ')');
        }
    }

    public synchronized void focusLost(FocusEvent var1) {
        try {
            this.method2110(-1, '\u0000', 0, -1444007331);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acn.focusLost(" + ')');
        }
    }

    public synchronized void keyPressed(KeyEvent var1) {
        try {
            this.method2111(var1, 0, 1184410257);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acn.keyPressed(" + ')');
        }
    }
}
