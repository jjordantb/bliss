public class class267 {
    public float field8202;
    public float field8203;
    public float field8204;
    public float field8205;

    public class267(float var1, float var2, float var3, float var4) {
        this.method4570(var1, var2, var3, var4);
    }

    public class267() {
        this.method4576();
    }

    public void method4570(float var1, float var2, float var3, float var4) {
        this.field8205 = var1;
        this.field8204 = var2;
        this.field8202 = var3;
        this.field8203 = var4;
    }

    public void method4571(int var1) {
        this.method4570((float) (var1 >> 16 & 255) * 0.003921569F, (float) (var1 >> 8 & 255) * 0.003921569F, (float) (var1 >> 0 & 255) * 0.003921569F, (float) (var1 >> 24 & 255) * 0.003921569F);
    }

    public final void method4572() {
        this.field8205 = -this.field8205;
        this.field8204 = -this.field8204;
        this.field8202 = -this.field8202;
        this.field8203 = -this.field8203;
    }

    public final void method4573(class344 var1) {
        float var2 = this.field8205;
        float var3 = this.field8204;
        float var4 = this.field8202;
        float var5 = this.field8203;
        this.field8205 = var1.field325[0] * var2 + var1.field325[4] * var3 + var1.field325[8] * var4 + var1.field325[12] * var5;
        this.field8204 = var1.field325[1] * var2 + var1.field325[5] * var3 + var1.field325[9] * var4 + var1.field325[13] * var5;
        this.field8202 = var1.field325[2] * var2 + var1.field325[6] * var3 + var1.field325[10] * var4 + var1.field325[14] * var5;
        this.field8203 = var1.field325[3] * var2 + var1.field325[7] * var3 + var1.field325[11] * var4 + var1.field325[15] * var5;
    }

    public final void method4574(float var1) {
        this.field8205 *= var1;
        this.field8204 *= var1;
        this.field8202 *= var1;
        this.field8203 *= var1;
    }

    public void method4575(class267 var1) {
        this.method4570(var1.field8205, var1.field8204, var1.field8202, var1.field8203);
    }

    final void method4576() {
        this.field8203 = 0.0F;
        this.field8202 = 0.0F;
        this.field8204 = 0.0F;
        this.field8205 = 0.0F;
    }
}
