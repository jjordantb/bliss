public class class558 extends class128 {
    int field546 = 0;

    class558(class180 var1, class635 var2) {
        super(var1, var2);
    }

    static final void method481(int var0, byte var1) {
        try {
            class730.field2774 = new int[var0];
            class730.field2651 = new int[var0];
            class730.field2776 = new int[var0];
            class730.field2622 = new int[var0];
            class730.field2778 = new int[var0];
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "zh.iw(" + ')');
        }
    }

    public void method1543(boolean var1, byte var2) {
        try {
            int var3 = super.field2346.field823.method1786(super.field2345.method5594(), class730.field2775, -2041461531) + super.field2346.field825;
            int var4 = super.field2346.field826.method3090(super.field2345.method3109(), class730.field2784, -2132177466) + super.field2346.field822;
            super.field2345.method3156((float) (var3 + super.field2345.method5594() / 2), (float) (var4 + super.field2345.method3109() / 2), 4096, this.field546);
            this.field546 += ((class635) super.field2346).field9822 * -157704951;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "zh.f(" + ')');
        }
    }
}
