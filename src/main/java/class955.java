import java.awt.*;

public class class955 extends class848 implements class297 {
    static int[] field3544;
    static int[] field3556 = new int[Math.max(Math.max(104, 20), 24573)];
    static int field3561 = 20;
    static int field3562 = 104;
    static int field3564 = 20;
    static int field3565 = 24573;
    static int field3566 = 4;
    static float[] field3567 = new float[20];
    static int[] field3568 = new int[6];
    static int[] field3569;
    static float[] field3570;
    static int[] field3571;
    static int[] field3572;
    static int[] field3574;
    static short[] field3575;
    static byte[] field3576;

    static {
        field3569 = field3556;
        field3570 = field3567;
        field3544 = field3556;
        field3572 = field3556;
        field3571 = new int[8191];
        field3574 = new int[8191];
        field3575 = new short[8191];
        field3576 = new byte[8191];
    }

    class373 field3543 = new class373();
    class887 field3545;
    class344 field3546;
    boolean field3547 = false;
    int field3548 = 4096;
    class344 field3549;
    float field3550;
    class135 field3551;
    class344 field3552;
    class344 field3553;
    float field3554;
    int field3555;
    float field3557;
    float field3558;
    class135 field3559;
    class93[] field3560;
    long field3563 = 0L;
    int field3573 = 4096;
    boolean field3577 = false;

    public class955(Canvas var1, class478 var2, int var3, int var4) {
        super(var2);

        try {
            if (!class933.method6286(2126469897).method3930("sw3d", 1499520275)) {
                throw new RuntimeException("");
            } else {
                class189.method3362(-1686477693);
                this.q(super.field8581, super.field8581.method4628(452373566), 0);
                class771.method2300(false, true, -162450455);
                this.field3577 = true;
                this.field3549 = new class344();
                new RegionOffset();
                this.field3559 = new class135();
                new class567();
                this.field3552 = new class344();
                this.field3553 = new class344();
                this.field3546 = new class344();
                this.method4867(new class135());
                this.method5054(new class344());
                this.method2080(1);
                this.method2081(0);
                if (var1 != null) {
                    this.method5032(var1, var3, var4, -414919790);
                    this.method4816(var1, (byte) -90);
                }

                int var5 = super.field8581.method4628(468739561);

                for (short var6 = 0; var6 < var5; ++var6) {
                    class414 var7 = super.field8581.method4625(var6, 1423908475);
                    if (var7 != null) {
                        this.V(var6, var7.field9386, var7.field9382, var7.field9383, var7.field9390, var7.field9385, var7.field9372, var7.field9387, var7.field9388, var7.field9389, var7.field9363, var7.field9378, var7.field9392, var7.field9381, var7.field9394, var7.field9395, var7.field9391, var7.field9397, var7.field9398, var7.field9373);
                    }
                }

            }
        } catch (Throwable var8) {
            this.method4996(368074744);
            throw new RuntimeException();
        }
    }

    native void Q(int var1, int[] var2, float[] var3);

    native void q(class478 var1, int var2, int var3);

    native void R(int var1, int var2, int var3, int var4, int var5, int var6, class23 var7, int var8, int var9);

    native void da();

    native void Y(int var1);

    native void n(class792 var1);

    protected void finalize() {
        this.method4996(1915551427);
        if (this.field3563 != 0L) {
            class189.method3360(this, (short) 18758);
        }

    }

    void method2079(class874 var1, boolean var2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;

        for (class686 var8 = (class686) var1.field9777.method5869(-1980678448); var8 != null; var8 = (class686) var1.field9777.method5867(-1594607978)) {
            field3572[var3++] = var8.field7608;
            field3572[var3++] = var8.field7612;
            field3572[var3++] = var8.field7613;
            field3571[var4++] = var8.field7615;
            field3575[var6++] = (short) var8.field7617;
            field3574[var5++] = var8.field7614;
            if (var2) {
                field3576[var7++] = var8.field7616;
            }
        }

    }

    public class305 method4795() {
        return new class305(0, "SSE", 1, "CPU", 0L);
    }

    public void method4824() {
        this.field3558 = (float) this.method4800((short) 13884).method2481() / 2.0F;
        this.field3557 = (float) this.method4800((short) -4468).method2493() / 2.0F;
        this.field3550 = this.field3558;
        this.field3554 = this.field3557;
        this.k();
    }

    public void method4909() {
    }

    void method4846() {
        if (!this.field3547) {
            this.field3560 = null;
            this.field3545 = null;
            this.field3549 = null;

            for (class887 var1 = (class887) this.field3543.method901(1766612795); var1 != null; var1 = (class887) this.field3543.method906(49146)) {
                var1.ha();
            }

            this.field3543.method905((byte) 1);
            this.da();
            if (this.field3577) {
                class82.method919(false, true, (short) -22106);
                this.field3577 = false;
            }

            this.method2083();
            class189.method3363(-1408959178);
            this.field3547 = true;
        }

    }

    public void method4801(int var1) {
        class189.method3361((byte) 3);
        this.Y(var1);

        for (class887 var2 = (class887) this.field3543.method901(1766612795); var2 != null; var2 = (class887) this.field3543.method906(49146)) {
            var2.u();
        }

    }

    public boolean method4814() {
        return true;
    }

    public boolean method4878() {
        return false;
    }

    public boolean method4807() {
        return false;
    }

    public boolean method4916() {
        return true;
    }

    public boolean method4855() {
        return false;
    }

    public boolean method4879() {
        return true;
    }

    public native void method4843(int var1, int var2, int var3, int var4, int var5);

    public boolean method5028() {
        return true;
    }

    public native int[] method5051(int var1, int var2, int var3, int var4);

    public native void method4827();

    native void d(long var1, long var3);

    native void k();

    public void method5059(int var1, int var2, int var3, int var4) {
        this.field3558 = (float) var3 / 2.0F;
        this.field3557 = (float) var4 / 2.0F;
        this.field3550 = (float) var1 + this.field3558;
        this.field3554 = (float) var2 + this.field3557;
        this.A(var1, var2, var3, var4);
    }

    public native void method4826(float var1, float var2);

    public native void method4829(int var1, int var2, int var3, int var4);

    public native void method4830(int[] var1);

    public native void method4831(int var1, int var2);

    public native void method4984(int var1, int var2, int var3, int var4, int var5, int var6);

    public native void method4809(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

    public void method4840(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
        throw new IllegalStateException();
    }

    public native void method4839(int var1, int var2, int var3, int var4, int var5);

    public void method4934(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.YA(var1, var2, var3, var4, var5, var6);
    }

    public void method4845(int var1, int var2, int var3, int var4, int var5, int var6, class23 var7, int var8, int var9) {
        this.R(var1, var2, var3, var4, var5, var6, var7, var8, var9);
    }

    native void method4841(int var1, int var2, int var3, int var4, int var5);

    public void method4820(int var1, int var2, int var3, int var4, int var5, int var6, class23 var7, int var8, int var9, int var10, int var11, int var12) {
    }

    public void method4863(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
    }

    public class727 method4936(class230 var1, class922[] var2, boolean var3) {
        int[] var4 = new int[var2.length];
        int[] var5 = new int[var2.length];
        boolean var6 = false;

        for (int var7 = 0; var7 < var2.length; ++var7) {
            var4[var7] = var2[var7].field10269;
            var5[var7] = var2[var7].field10273;
            if (var2[var7].field10276 != null) {
                var6 = true;
            }
        }

        if (var3) {
            if (var6) {
                return new class910(this, this.field3545, var1, var2, (class48[]) null);
            } else {
                return new class187(this, this.field3545, var1, var2, (class48[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class950(this, this.field3545, var1, var2, (class48[]) null);
        }
    }

    public void method4889(float var1, float var2, float var3, float[] var4) {
        float var5 = this.field3546.field325[14] + this.field3546.field325[2] * var1 + this.field3546.field325[6] * var2 + this.field3546.field325[10] * var3;
        float var6 = this.field3546.field325[15] + this.field3546.field325[3] * var1 + this.field3546.field325[7] * var2 + this.field3546.field325[11] * var3;
        if (var5 >= -var6 && var5 <= var6) {
            float var7 = this.field3546.field325[12] + this.field3546.field325[0] * var1 + this.field3546.field325[4] * var2 + this.field3546.field325[8] * var3;
            if (var7 >= -var6 && var7 <= var6) {
                float var8 = this.field3546.field325[13] + this.field3546.field325[1] * var1 + this.field3546.field325[5] * var2 + this.field3546.field325[9] * var3;
                if (var8 >= -var6 && var8 <= var6) {
                    float var9 = this.field3552.field325[14] + this.field3552.field325[2] * var1 + this.field3552.field325[6] * var2 + this.field3552.field325[10] * var3;
                    var4[0] = this.field3550 + this.field3558 * var7 / var6;
                    var4[1] = this.field3554 + this.field3557 * var8 / var6;
                    var4[2] = var9;
                } else {
                    var4[2] = Float.NaN;
                    var4[1] = Float.NaN;
                    var4[0] = Float.NaN;
                }
            } else {
                var4[2] = Float.NaN;
                var4[1] = Float.NaN;
                var4[0] = Float.NaN;
            }
        } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
        }

    }

    public class792 method4849(int var1) {
        class887 var2 = new class887(this, var1);
        this.field3543.method897(var2, 1259364637);
        return var2;
    }

    public void method4850(class792 var1) {
        this.field3545 = (class887) var1;
        this.n(var1);
    }

    public class48 method4852(int var1, int var2, boolean var3, boolean var4) {
        return new class850(this, var1, var2, var4);
    }

    public class48 method4853(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
        return new class850(this, var1, var2, var3, var4, var5, false);
    }

    public class48 method4982(class922 var1, boolean var2) {
        class850 var3 = new class850(this, var1.field10274, var1.field10275, var1.field10276, 0, var1.field10269, var1.field10269, var1.field10273);
        var3.method3104(var1.field10272, var1.field10268, var1.field10271, var1.field10270);
        return var3;
    }

    public class48 method4856(int var1, int var2, int var3, int var4, boolean var5) {
        return new class850(this, var1, var2, var3, var4, !var5);
    }

    native void V(short var1, short var2, int var3, byte var4, byte var5, int var6, boolean var7, byte var8, byte var9, byte var10, byte var11, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, byte var17, boolean var18, boolean var19, int var20);

    public native void method4880(int var1, class23 var2, int var3, int var4);

    public class879 method4861(class25 var1, int var2, int var3, int var4, int var5) {
        return new class171(this, this.field3545, var1, var2, var3, var4, var5);
    }

    public int method4836(int var1, int var2) {
        int var3 = var1 & 1048575;
        int var4 = var2 & 1048575;
        return var3 & var4 ^ var4;
    }

    public int method4817(int var1, int var2) {
        return var1 | var2;
    }

    public class344 method4860() {
        return this.field3549;
    }

    public class135 method5048() {
        return this.field3559;
    }

    void method2080(int var1) {
        this.field3555 = var1;
        this.field3560 = new class93[this.field3555];

        for (int var2 = 0; var2 < this.field3555; ++var2) {
            this.field3560[var2] = new class93(this, this.field3573, this.field3548);
        }

    }

    void method2081(int var1) {
        this.field3560[var1].method517();
    }

    class93 method2082() {
        for (int var1 = 0; var1 < this.field3555; ++var1) {
            if (this.field3560[var1].field581 == Thread.currentThread()) {
                return this.field3560[var1];
            }
        }

        return null;
    }

    public void method4866(class874 var1) {
        if (var1.field9777.method5868((short) -13342) != 0) {
            this.method2079(var1, false);
            this.method2082().method512(this, field3572, field3571, field3574, field3575, var1.field9777.method5868((short) -17134));
        }

    }

    public void method4867(class135 var1) {
        this.field3551 = var1;
        this.field3552.method272(var1);
        this.AA(this.field3552.field325);
        this.field3546.method270(this.field3552, this.field3553);
    }

    public class135 method4868() {
        return this.field3551;
    }

    public void method5054(class344 var1) {
        this.field3553 = var1;
        this.wa(this.field3553.field325);
        this.field3546.method270(this.field3552, this.field3553);
    }

    native void JA(int var1, int var2, int var3, int var4);

    public native void method4835(int var1);

    public native void method4874(int var1, int var2, int var3);

    public native void method4869(boolean var1);

    public void method4844(int var1, class639[] var2) {
        int var3 = 0;

        for (int var4 = 0; var4 < var1; ++var4) {
            field3569[var3++] = var2[var4].method5902(823958259);
            field3569[var3++] = var2[var4].method5901(-2035778581);
            field3569[var3++] = var2[var4].method5904((byte) 52);
            field3569[var3++] = var2[var4].method5907(34190041);
            field3570[var4] = var2[var4].method5908(608404512);
            field3569[var3++] = var2[var4].method5905(-1429005837);
        }

        this.Q(var1, field3569, field3570);
    }

    public class621 method4851(int var1, int var2, int var3, int var4, int var5, int var6) {
        return null;
    }

    public class621 method5049(class621 var1, class621 var2, float var3, class621 var4) {
        return null;
    }

    public void method4950(class621 var1) {
    }

    void method4797(int var1, int var2) throws class937 {
        class426 var3 = (class426) this.method5013(2121679356);
        if (var3 == null) {
            throw new IllegalStateException();
        } else {
            var3.method2517(var1, var2);
            if (super.field8581 != null) {
                super.field8581.method4627(1305525906);
            }

        }
    }

    public boolean method4804() {
        return true;
    }

    public void method4882() {
    }

    public boolean method4883() {
        return false;
    }

    public void method5046() {
    }

    public class344 method4870() {
        return this.field3553;
    }

    public final void method4886(int var1, class919 var2) {
        this.M(var1, var2.field10426, var2.field10425, var2.field10427);
    }

    native void M(int var1, int var2, int var3, int var4);

    public class806 method4942() {
        return new class952(this);
    }

    public class893 method5058(int var1, int var2) {
        return new class294(var1, var2);
    }

    public native int method4802();

    public int method4876() {
        return 4;
    }

    public void method4890(float var1, float var2, float var3, float[] var4) {
        float var5 = this.field3546.field325[15] + this.field3546.field325[3] * var1 + this.field3546.field325[7] * var2 + this.field3546.field325[11] * var3;
        float var6 = this.field3546.field325[12] + this.field3546.field325[0] * var1 + this.field3546.field325[4] * var2 + this.field3546.field325[8] * var3;
        float var7 = this.field3546.field325[13] + this.field3546.field325[1] * var1 + this.field3546.field325[5] * var2 + this.field3546.field325[9] * var3;
        float var8 = this.field3552.field325[14] + this.field3552.field325[2] * var1 + this.field3552.field325[6] * var2 + this.field3552.field325[10] * var3;
        var4[0] = this.field3550 + this.field3558 * var6 / var5;
        var4[1] = this.field3554 + this.field3557 * var7 / var5;
        var4[2] = var8;
    }

    public void method4968() {
    }

    public native void method4986(int var1, int var2, int var3, int var4);

    public void method4838(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.method4839(var1, var2, var3, var5, var6);
        this.method4839(var1, var2 + var4 - 1, var3, var5, var6);
        this.method4843(var1, var2 + 1, var4 - 1, var5, var6);
        this.method4843(var1 + var3 - 1, var2 + 1, var4 - 1, var5, var6);
    }

    native void A(int var1, int var2, int var3, int var4);

    public void method5038(int var1) {
        this.field3573 = this.field3548 = var1;
        if (this.field3555 > 1) {
            throw new IllegalStateException();
        } else {
            this.method2080(this.field3555);
            this.method2081(0);
        }
    }

    public void method4811(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.method2082().method520(this, var1, var2, var3, var4, var5, var6, var7);
    }

    native void AA(float[] var1);

    public void method4875(boolean var1) {
    }

    public boolean method4908() {
        return true;
    }

    public native void method4872(int var1, float var2, float var3, float var4, float var5, float var6);

    public boolean method4881() {
        return false;
    }

    public void method4885(int var1, int var2, int var3, int var4) {
    }

    native void PA(class426 var1);

    native void YA(int var1, int var2, int var3, int var4, int var5, int var6);

    class749 method4819(Canvas var1, int var2, int var3) {
        return new class426(this, var1, var2, var3);
    }

    void method2083() {
        System.gc();
        System.runFinalization();
        class189.method3361((byte) 3);
    }

    public native void method5063(float var1);

    public int method4848(int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = 0;
        float var8 = this.field3546.field325[14] + this.field3546.field325[2] * (float) var1 + this.field3546.field325[6] * (float) var2 + this.field3546.field325[10] * (float) var3;
        float var9 = this.field3546.field325[14] + this.field3546.field325[2] * (float) var4 + this.field3546.field325[6] * (float) var5 + this.field3546.field325[10] * (float) var6;
        float var10 = this.field3546.field325[15] + this.field3546.field325[3] * (float) var1 + this.field3546.field325[7] * (float) var2 + this.field3546.field325[11] * (float) var3;
        float var11 = this.field3546.field325[15] + this.field3546.field325[3] * (float) var4 + this.field3546.field325[7] * (float) var5 + this.field3546.field325[11] * (float) var6;
        if (var8 < -var10 && var9 < -var11) {
            var7 |= 16;
        } else if (var8 > var10 && var9 > var11) {
            var7 |= 32;
        }

        float var12 = this.field3546.field325[12] + this.field3546.field325[0] * (float) var1 + this.field3546.field325[4] * (float) var2 + this.field3546.field325[8] * (float) var3;
        float var13 = this.field3546.field325[12] + this.field3546.field325[0] * (float) var4 + this.field3546.field325[4] * (float) var5 + this.field3546.field325[8] * (float) var6;
        if (var12 < -var10 && var13 < -var11) {
            var7 |= 1;
        }

        if (var12 > var10 && var13 > var11) {
            var7 |= 2;
        }

        float var14 = this.field3546.field325[13] + this.field3546.field325[1] * (float) var1 + this.field3546.field325[5] * (float) var2 + this.field3546.field325[9] * (float) var3;
        float var15 = this.field3546.field325[13] + this.field3546.field325[1] * (float) var4 + this.field3546.field325[5] * (float) var5 + this.field3546.field325[9] * (float) var6;
        if (var14 < -var10 && var15 < -var11) {
            var7 |= 4;
        }

        if (var14 > var10 && var15 > var11) {
            var7 |= 8;
        }

        return var7;
    }

    void method5060(float var1, float var2, float var3, float var4, float var5, float var6) {
    }

    public boolean method4810() {
        return true;
    }

    public native void method4888();

    public void method4891(boolean var1) {
    }

    public class23 method4857(int var1, int var2, int[] var3, int[] var4) {
        return new class280(this, this.field3545, var1, var2, var3, var4);
    }

    public SceneGraphLevel method4864(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
        return new class204(this, this.field3545, var1, var2, var3, var4, var5, var6, var7);
    }

    public final void method4887(int var1, class919 var2) {
        this.JA(var1, var2.field10426, var2.field10425, var2.field10427);
    }

    native void wa(float[] var1);

    native void F(short var1, int[] var2, short var3, int var4, byte var5, byte var6, int var7, boolean var8, byte var9, byte var10, byte var11, byte var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, byte var18, boolean var19, boolean var20, int var21);

    public native void method6550(boolean var1);
}
