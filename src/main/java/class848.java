import java.awt.*;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class class848 {
    public static int field8575 = 2;
    public static int field8576 = 3;
    public static int field8577 = 5;
    public static int field8578 = 1;
    public static int field8582 = 0;
    public static int field8584 = 2;
    public static int field8587 = 0;
    public static int field8591 = 1;
    public static class152 field8597;
    protected static int field8583 = 2;
    protected static int field8585 = 1;
    protected static int field8588 = 8;
    protected static int field8589 = 16;
    protected static int field8590 = 32;
    protected static int field8593 = 4;
    static int field8573 = 4;
    static boolean[] field8579 = new boolean[8];
    static int field8596 = 8;
    public int field8580;
    public class478 field8581;
    protected class783 field8574;
    protected class749 field8594;
    protected Hashtable field8595 = new Hashtable();
    class806[] field8586 = new class806[4];
    int field8592 = -1;

    class848(class478 var1) {
        this.field8581 = var1;
        int var2 = -1;

        for (int var3 = 0; var3 < 8; ++var3) {
            if (!field8579[var3]) {
                field8579[var3] = true;
                var2 = var3;
                break;
            }
        }

        if (var2 == -1) {
            throw new IllegalStateException("");
        } else {
            this.field8580 = var2;
        }
    }

    static void method5065(int var0) {
        try {
            if (class776.field3728 != null) {
                class302.field3768 = new class575();
                class302.field3768.method123(class657.field9542, class776.field3728.field7501.method2927(class321.field1066, -875414210), class776.field3728.field7503, class776.field3728, 180676280);
                class12.field6680 = new Thread(class302.field3768, "");
                class12.field6680.start();
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "ra.f(" + ')');
        }
    }

    static void method5066(int var0, int var1, int var2, int var3, int var4, int var5, int var6, MenuItem var7, class727 var8, class230 var9, int var10, int var11, int var12) {
        try {
            if (var0 > var2 && var0 < var2 + var4 && var1 > var6 - var9.field8230 - 1 && var1 < var6 + var9.field8225 && var7.field1704) {
                var10 = var11;
            }

            int[] var13 = class166.method3683(var7, (byte) -16);
            String var14 = class342.method217(var7, 1974058841);
            if (var13 != null) {
                var14 = var14 + class82.method918(var13, (byte) 1);
            }

            var8.method1668(var14, 3 + var2, var6, var10, 0, class730.field2683, class880.field10188, class602.field8668, class755.field4199, 65280);
            if (var7.field1705) {
                class932.field10344.method3128(var2 + 5 + var9.method4605(var14, 1318090489), var6 - var9.field8230);
            }

        } catch (RuntimeException var15) {
            throw class158.method3445(var15, "ra.an(" + ')');
        }
    }

    static final void method5067(class744 var0, byte var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 22);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class758.method2738(var3, var4, var0, -2057554129);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ra.kw(" + ')');
        }
    }

    static long method5068(CharSequence var0, byte var1) {
        try {
            long var2 = 0L;
            int var4 = var0.length();

            for (int var5 = 0; var5 < var4; ++var5) {
                var2 *= 37L;
                char var6 = var0.charAt(var5);
                if (var6 >= 'A' && var6 <= 'Z') {
                    var2 += (long) (1 + var6 - 65);
                } else if (var6 >= 'a' && var6 <= 'z') {
                    var2 += (long) (1 + var6 - 97);
                } else if (var6 >= '0' && var6 <= '9') {
                    var2 += (long) (var6 + 27 - 48);
                }

                if (var2 >= 177917621779460413L) {
                    if (var1 == 0) {
                        throw new IllegalStateException();
                    }
                    break;
                }
            }

            while (var2 % 37L == 0L && var2 != 0L) {
                var2 /= 37L;
            }

            return var2;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "ra.a(" + ')');
        }
    }

    static void method5069(class848 var0, Widget var1, int var2, int var3, byte var4) {
        try {
            class118 var5 = var1.method826(var0, 1502538903);
            if (var5 != null) {
                class23 var6 = var5.field2156;
                var0.method4986(var2, var3, var1.field881 + var2, var1.field887 + var3);
                if (var1.field881 != var5.field2152 || var5.field2153 != var1.field887) {
                    throw new IllegalStateException("");
                }

                if (2 != class95.field595 && 5 != class95.field595 && class379.field1139 != null) {
                    RegionBase var7 = class730.field2697.getRegionBase(681479919);
                    int var8;
                    int var9;
                    int var10;
                    int var11;
                    if (2 == class563.field1083) {
                        var8 = class730.field2734;
                        var9 = class730.field2736;
                        var10 = (int) (-class730.field2931) & 16383;
                        var11 = 4096;
                    } else {
                        RegionOffset var12 = class923.local.getRegion().regionOffset;
                        var8 = (int) var12.offsetX;
                        var9 = (int) var12.offsetY;
                        var10 = class730.field2782 + (int) (-class730.field2931) & 16383;
                        var11 = 4096 - class730.field2730 * 16;
                    }

                    int var22 = var8 / 128 + 48;
                    int var13 = 48 + class730.field2697.method5272(789210081) * 4 - var9 / 128;
                    class379.field1139.method3142((float) var2 + (float) var1.field881 / 2.0F, (float) var3 + (float) var1.field887 / 2.0F, (float) var22, (float) var13, var11, var10 << 2, var6, var2, var3);
                    class64 var14 = class730.field2697.method5273(-337725639);

                    int var16;
                    int var17;
                    int var18;
                    int var19;
                    int var20;
                    for (class722 var15 = (class722) class95.field600.method901(1766612795); var15 != null; var15 = (class722) class95.field600.method906(49146)) {
                        var16 = var15.field3631;
                        var17 = (var14.field1684[var16] >> 14 & 16383) - var7.baseX;
                        var18 = (var14.field1684[var16] & 16383) - var7.baseY;
                        var19 = 2 + 4 * var17 - var8 / 128;
                        var20 = 2 + 4 * var18 - var9 / 128;
                        class794.method468(var0, var6, var1, var2, var3, var19, var20, var14.field1686[var16], (byte) 0);
                    }

                    int var23;
                    for (var23 = 0; var23 < class95.field606; ++var23) {
                        var16 = 2 + class95.field597[var23] * 4 - var8 / 128;
                        var17 = 2 + 4 * class95.field598[var23] - var9 / 128;
                        ObjectDefinition var25 = class730.field2697.getObjectDefinitionLoader().getObjectDefinition(class95.field599[var23]);
                        if (var25.field2198 != null) {
                            var25 = var25.method1487(class827.field9037, 1042930561);
                            if (var25 == null) {
                                continue;
                            }

                            if (-1 == var25.field2231) {
                                if (var4 >= 10) {
                                    return;
                                }
                                continue;
                            }
                        }

                        class794.method468(var0, var6, var1, var2, var3, var16, var17, var25.field2231, (byte) 0);
                    }

                    for (class508 var24 = (class508) class730.field2666.method2946(1742338274); var24 != null; var24 = (class508) class730.field2666.method2945((byte) 24)) {
                        var16 = (int) (var24.field641 >> 28 & 3L);
                        if (var16 == class95.field596) {
                            var17 = (int) (var24.field641 & 16383L) - var7.baseX;
                            var18 = (int) (var24.field641 >> 14 & 16383L) - var7.baseY;
                            var19 = 2 + var17 * 4 - var8 / 128;
                            var20 = 2 + var18 * 4 - var9 / 128;
                            class758.method2734(var1, var6, var2, var3, var19, var20, class307.field427[0], (byte) 16);
                        }
                    }

                    class611.method5155(var0, var8, var9, var1, var6, var2, var3, 826111295);
                    class158.method3441(var8, var9, var1, var6, var2, var3, 1913514572);
                    class295.method6522(var8, var9, var1, var5, var2, var3, -1636621855);
                    if (2 != class563.field1083) {
                        if (class95.field601 != 0) {
                            var23 = class95.field601 * 4 + 2 - var8 / 128 + (class923.local.method2550() - 1) * 2;
                            var16 = 2 + class95.field593 * 4 - var9 / 128 + (class923.local.method2550() - 1) * 2;
                            class758.method2734(var1, var6, var2, var3, var23, var16, class984.field3145[class95.field602 ? 1 : 0], (byte) 23);
                        }

                        if (!class923.local.field3377) {
                            var0.method4833(var2 + var1.field881 / 2 - 1, var1.field887 / 2 + var3 - 1, 3, 3, -1, (byte) 7);
                        }
                    }
                } else {
                    var0.method4880(-16777216, var6, var2, var3);
                }
            }

        } catch (RuntimeException var21) {
            throw class158.method3445(var21, "ra.r(" + ')');
        }
    }

    public abstract class305 method4795();

    public final void method4796(byte var1) throws class937 {
        try {
            this.method4797(0, 0);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ra.u(" + ')');
        }
    }

    abstract void method4797(int var1, int var2) throws class937;

    public final void method4798(int var1, int var2, int var3, int var4, int var5) {
        try {
            this.method4839(var1, var2, var3, var4, 1);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "ra.bd(" + ')');
        }
    }

    public final class783 method4800(short var1) {
        try {
            return this.field8574;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ra.at(" + ')');
        }
    }

    public abstract void method4801(int var1);

    public abstract int method4802();

    public abstract boolean method4804();

    public abstract boolean method4807();

    public abstract void method4809(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

    public abstract boolean method4810();

    public abstract void method4811(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

    public void method4812(int[] var1) {
        try {
            if (this.field8594 != null) {
                var1[0] = this.field8594.method2481();
                var1[1] = this.field8594.method2493();
            } else {
                var1[1] = 0;
                var1[0] = 0;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ra.av(" + ')');
        }
    }

    public abstract boolean method4814();

    public final void method4815(Canvas var1, int var2) {
        try {
            if (this.field8595.containsKey(var1)) {
                class749 var3 = (class749) this.field8595.get(var1);
                var3.method2488();
                this.field8595.remove(var1);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ra.az(" + ')');
        }
    }

    public final void method4816(Canvas var1, byte var2) {
        try {
            class749 var3 = (class749) this.field8595.get(var1);
            if (var3 == null) {
                throw new RuntimeException();
            } else if (this.field8592 <= 0 && this.field8574 == this.field8594) {
                if (this.field8574 != null) {
                    this.field8574.method2482();
                }

                if (this.field8592 < 0) {
                    this.field8574 = var3;
                }

                this.field8594 = var3;
                var3.method2484();
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ra.as(" + ')');
        }
    }

    public abstract int method4817(int var1, int var2);

    public final void method4818(class806 var1, byte var2) {
        try {
            if (this.field8592 >= 0 && this.field8586[this.field8592] == var1) {
                this.field8586[--this.field8592 + 1] = null;
                var1.method2482();
                if (this.field8592 >= 0) {
                    this.field8574 = this.field8586[this.field8592];
                    this.field8586[this.field8592].method2484();
                } else {
                    this.field8574 = this.field8594;
                    this.field8594.method2484();
                }

            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ra.aw(" + ')');
        }
    }

    abstract class749 method4819(Canvas var1, int var2, int var3);

    public abstract void method4820(int var1, int var2, int var3, int var4, int var5, int var6, class23 var7, int var8, int var9, int var10, int var11, int var12);

    public abstract void method4824();

    public abstract void method4826(float var1, float var2);

    public abstract void method4827();

    public abstract void method4829(int var1, int var2, int var3, int var4);

    public abstract void method4830(int[] var1);

    public abstract void method4831(int var1, int var2);

    public final void method4832(int var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            this.method4838(var1, var2, var3, var4, var5, 1);
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "ra.ar(" + ')');
        }
    }

    public final void method4833(int var1, int var2, int var3, int var4, int var5, byte var6) {
        try {
            this.method4984(var1, var2, var3, var4, var5, 1);
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "ra.ac(" + ')');
        }
    }

    public final void method4834(int var1, int var2, int var3, int var4, int var5) {
        try {
            this.method4841(var1, var2, var3, var4, 1);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "ra.am(" + ')');
        }
    }

    public abstract void method4835(int var1);

    public abstract int method4836(int var1, int var2);

    public final void method4837(int var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            this.method4934(var1, var2, var3, var4, var5, 1);
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "ra.be(" + ')');
        }
    }

    public abstract void method4838(int var1, int var2, int var3, int var4, int var5, int var6);

    public abstract void method4839(int var1, int var2, int var3, int var4, int var5);

    public abstract void method4840(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13);

    abstract void method4841(int var1, int var2, int var3, int var4, int var5);

    public abstract void method4843(int var1, int var2, int var3, int var4, int var5);

    public abstract void method4844(int var1, class639[] var2);

    public abstract void method4845(int var1, int var2, int var3, int var4, int var5, int var6, class23 var7, int var8, int var9);

    abstract void method4846();

    public abstract int method4848(int var1, int var2, int var3, int var4, int var5, int var6);

    public abstract class792 method4849(int var1);

    public abstract void method4850(class792 var1);

    public abstract class621 method4851(int var1, int var2, int var3, int var4, int var5, int var6);

    public abstract class48 method4852(int var1, int var2, boolean var3, boolean var4);

    public abstract class48 method4853(int[] var1, int var2, int var3, int var4, int var5, boolean var6);

    public class48 method4854(int[] var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            return this.method4853(var1, var2, var3, var4, var5, true);
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "ra.bp(" + ')');
        }
    }

    public abstract boolean method4855();

    public abstract class48 method4856(int var1, int var2, int var3, int var4, boolean var5);

    public abstract class23 method4857(int var1, int var2, int[] var3, int[] var4);

    public final void method4858(int var1, int var2, int var3, int var4, short var5) {
        try {
            this.method4843(var1, var2, var3, var4, 1);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "ra.bf(" + ')');
        }
    }

    public abstract class344 method4860();

    public abstract class879 method4861(class25 var1, int var2, int var3, int var4, int var5);

    public abstract void method4863(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

    public abstract SceneGraphLevel method4864(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7);

    public boolean method4865(int var1) {
        return true;
    }

    public abstract void method4866(class874 var1);

    public abstract void method4867(class135 var1);

    public abstract class135 method4868();

    public abstract void method4869(boolean var1);

    public abstract class344 method4870();

    public abstract void method4872(int var1, float var2, float var3, float var4, float var5, float var6);

    public class48 method4873(int var1, int var2, boolean var3, int var4) {
        try {
            return this.method4852(var1, var2, var3, false);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ra.bq(" + ')');
        }
    }

    public abstract void method4874(int var1, int var2, int var3);

    public abstract void method4875(boolean var1);

    public abstract int method4876();

    public class639 method4877(int var1, int var2, int var3, int var4, int var5, float var6) {
        try {
            return new class639(var1, var2, var3, var4, var5, var6);
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "ra.cg(" + ')');
        }
    }

    public abstract boolean method4878();

    public abstract boolean method4879();

    public abstract void method4880(int var1, class23 var2, int var3, int var4);

    public abstract boolean method4881();

    public abstract void method4882();

    public abstract boolean method4883();

    public abstract void method4885(int var1, int var2, int var3, int var4);

    public abstract void method4886(int var1, class919 var2);

    public abstract void method4887(int var1, class919 var2);

    public abstract void method4888();

    public abstract void method4889(float var1, float var2, float var3, float[] var4);

    public abstract void method4890(float var1, float var2, float var3, float[] var4);

    public abstract void method4891(boolean var1);

    public abstract boolean method4908();

    public abstract void method4909();

    public abstract boolean method4916();

    public abstract void method4934(int var1, int var2, int var3, int var4, int var5, int var6);

    public abstract class727 method4936(class230 var1, class922[] var2, boolean var3);

    public abstract class806 method4942();

    public abstract void method4950(class621 var1);

    public abstract void method4968();

    public abstract class48 method4982(class922 var1, boolean var2);

    public abstract void method4984(int var1, int var2, int var3, int var4, int var5, int var6);

    public abstract void method4986(int var1, int var2, int var3, int var4);

    public void method4996(int var1) {
        try {
            field8579[this.field8580] = false;
            Enumeration var2 = this.field8595.keys();

            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                class749 var4 = (class749) this.field8595.get(var3);
                var4.method2488();
            }

            this.method4846();
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ra.y(" + ')');
        }
    }

    public final void method5009(class806 var1, byte var2) {
        try {
            if (this.field8592 >= 3) {
                throw new RuntimeException();
            } else {
                if (this.field8592 >= 0) {
                    this.field8586[this.field8592].method2482();
                } else {
                    this.field8594.method2482();
                }

                this.field8574 = this.field8586[++this.field8592] = var1;
                var1.method2484();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ra.af(" + ')');
        }
    }

    final class749 method5013(int var1) {
        try {
            return this.field8594;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ra.ah(" + ')');
        }
    }

    final void method5017(Canvas var1, class749 var2, byte var3) {
        try {
            if (var2 == null) {
                throw new RuntimeException();
            } else {
                this.field8595.put(var1, var2);
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ra.al(" + ')');
        }
    }

    public void method5018(float var1, float var2, float var3, int var4) {
        try {
            this.method5060(var1, var2, var3, 0.0F, 1.0F, 1.0F);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ra.ce(" + ')');
        }
    }

    public abstract boolean method5028();

    public final void method5032(Canvas var1, int var2, int var3, int var4) {
        try {
            if (!this.field8595.containsKey(var1)) {
                class977.method1815(var1, (short) 32072);
                this.method5017(var1, this.method4819(var1, var2, var3), (byte) 109);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ra.ai(" + ')');
        }
    }

    public abstract void method5038(int var1);

    public final void method5043(Canvas var1, int var2, int var3, byte var4) {
        try {
            class749 var5 = (class749) this.field8595.get(var1);
            if (var5 == null) {
                throw new RuntimeException();
            } else {
                var5.method2518(var2, var3);
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ra.ap(" + ')');
        }
    }

    public abstract void method5046();

    public abstract class135 method5048();

    public abstract class621 method5049(class621 var1, class621 var2, float var3, class621 var4);

    public abstract int[] method5051(int var1, int var2, int var3, int var4);

    public abstract void method5054(class344 var1);

    protected void finalize() {
        try {
            this.method4996(1104723109);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "ra.finalize(" + ')');
        }
    }

    public abstract class893 method5058(int var1, int var2);

    public abstract void method5059(int var1, int var2, int var3, int var4);

    abstract void method5060(float var1, float var2, float var3, float var4, float var5, float var6);

    public abstract void method5063(float var1);
}
