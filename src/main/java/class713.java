public class class713 extends Node {
    static float[] field3541 = new float[3];
    static MenuItem field3542;
    class660 field3534;
    float field3535;
    int field3536;
    int field3537;
    class396 field3538;
    int field3539;
    float field3540;

    class713(class396 var1, class726 var2) {
        this.field3538 = var1;
        this.field3534 = this.field3538.method3493((byte) 3);
        this.method2075(-1046035099);
    }

    static final void method2076(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
        try {
            var0.field948 = var2.field3161[--var2.field3156];
            class814.method2932(var0, 1196529132);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "acf.dx(" + ')');
        }
    }

    void method2075(int var1) {
        try {
            this.field3536 = this.field3538.field6508;
            this.field3537 = this.field3538.field6512;
            this.field3539 = this.field3538.field6513;
            if (this.field3538.field6514 != null) {
                this.field3538.field6514.method294((float) this.field3534.field9643, (float) this.field3534.field9644, (float) this.field3534.field9645, field3541);
            }

            this.field3535 = field3541[0];
            this.field3540 = field3541[2];
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acf.a(" + ')');
        }
    }
}
