public class class631 extends class576 {
    class48 field9779;
    class48 field9780;
    class48 field9781;
    class48 field9782;
    class48 field9783;
    class48 field9784;

    class631(class180 var1, class180 var2, class710 var3) {
        super(var1, var2, var3);
    }

    static int method5861(MenuItem var0, class230 var1, int var2) {
        try {
            String var3 = class342.method217(var0, 2106133220);
            int[] var4 = class166.method3683(var0, (byte) -16);
            if (var4 != null) {
                var3 = var3 + class82.method918(var4, (byte) 1);
            }

            int var5 = var1.method4595(var3, class602.field8668, 1319235613);
            if (var0.field1705) {
                var5 += class932.field10344.method3106() + 4;
            }

            return var5;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "zb.bm(" + ')');
        }
    }

    public static String method5862(InputStream var0, int var1) {
        try {
            return class602.method5088(var0, 32767, 116620582);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "zb.b(" + ')');
        }
    }

    static void method5863(int var0) {
        try {
            class740.field3210.method2941((byte) -14);
            class740.field3211.method2941((byte) -2);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "zb.bp(" + ')');
        }
    }

    static final void method5864(class744 var0, byte var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            class147.method1145(var2, new class256(var3, 3), (int[]) null, true, -1040917955);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "zb.sp(" + ')');
        }
    }

    void method60(boolean var1, int var2, int var3, int var4) {
        try {
            if (var1) {
                int[] var5 = new int[4];
                class593.field1623.method4830(var5);
                class593.field1623.method4986(var2, var3, super.field70.field9032 + var2, super.field70.field9036 + var3);
                int var6 = this.field9781.method5594();
                int var7 = this.field9781.method3109();
                int var8 = this.field9780.method5594();
                int var9 = this.field9780.method3109();
                this.field9781.method3128(var2, (super.field70.field9036 - var7) / 2 + var3);
                this.field9780.method3128(var2 + super.field70.field9032 - var8, (super.field70.field9036 - var9) / 2 + var3);
                class593.field1623.method4986(var2, var3, super.field70.field9032 + var2, var3 + this.field9783.method3109());
                this.field9783.method3119(var6 + var2, var3, super.field70.field9032 - var6 - var8, super.field70.field9036);
                int var10 = this.field9784.method3109();
                class593.field1623.method4986(var2, super.field70.field9036 + var3 - var10, var2 + super.field70.field9032, var3 + super.field70.field9036);
                this.field9784.method3119(var6 + var2, var3 + super.field70.field9036 - var10, super.field70.field9032 - var6 - var8, super.field70.field9036);
                class593.field1623.method4986(var5[0], var5[1], var5[2], var5[3]);
            }

        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "zb.x(" + ')');
        }
    }

    void method5860(int var1, int var2, int var3, int var4, int var5) {
        try {
            this.field9782.method3119(var1, var2, var3, var4);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "zb.c(" + ')');
        }
    }

    public boolean method1537(int var1) {
        try {
            if (!super.method1537(-571978774)) {
                return false;
            } else {
                class710 var2 = (class710) super.field70;
                if (!super.field67.method3280(var2.field3453, -457216440)) {
                    return false;
                } else if (!super.field67.method3280(var2.field3452, -457216440)) {
                    return false;
                } else if (!super.field67.method3280(var2.field3456, -457216440)) {
                    return false;
                } else if (!super.field67.method3280(var2.field3454, -457216440)) {
                    return false;
                } else if (!super.field67.method3280(var2.field3455, -457216440)) {
                    return false;
                } else {
                    return super.field67.method3280(var2.field3451, -457216440);
                }
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "zb.b(" + ')');
        }
    }

    void method59(boolean var1, int var2, int var3, int var4) {
        try {
            int var5 = var2 + this.field9781.method5594();
            int var6 = super.field70.field9032 + var2 - this.field9780.method5594();
            int var7 = var3 + this.field9783.method3109();
            int var8 = super.field70.field9036 + var3 - this.field9784.method3109();
            int var9 = var6 - var5;
            int var10 = var8 - var7;
            int var11 = this.method66(1969642247) * var9 / 10000;
            int[] var12 = new int[4];
            class593.field1623.method4830(var12);
            class593.field1623.method4986(var5, var7, var5 + var11, var8);
            this.method5860(var5, var7, var9, var10, -1231781770);
            class593.field1623.method4986(var11 + var5, var7, var6, var8);
            this.field9779.method3119(var5, var7, var9, var10);
            class593.field1623.method4986(var12[0], var12[1], var12[2], var12[3]);
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "zb.r(" + ')');
        }
    }

    public void method1538(int var1) {
        try {
            super.method1538(215816169);
            class710 var2 = (class710) super.field70;
            this.field9782 = class611.method5156(super.field67, var2.field3453, (byte) 53);
            this.field9779 = class611.method5156(super.field67, var2.field3452, (byte) -54);
            this.field9781 = class611.method5156(super.field67, var2.field3456, (byte) -41);
            this.field9780 = class611.method5156(super.field67, var2.field3454, (byte) -125);
            this.field9783 = class611.method5156(super.field67, var2.field3455, (byte) 95);
            this.field9784 = class611.method5156(super.field67, var2.field3451, (byte) -11);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "zb.a(" + ')');
        }
    }
}
