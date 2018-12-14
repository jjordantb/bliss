public class RegionOffset {
    static int field5297;
    static int field5298;
    static RegionOffset[] field5301;

    static {
        new RegionOffset(0.0F, 0.0F, 0.0F);
        field5301 = new RegionOffset[0];
    }

    public float offsetX;
    public float offsetY;
    public float field5300;

    public RegionOffset(float var1, float var2, float var3) {
        this.offsetX = var1;
        this.field5300 = var2;
        this.offsetY = var3;
    }

    public RegionOffset() {
    }

    RegionOffset(RegionOffset var1) {
        this.offsetX = var1.offsetX;
        this.field5300 = var1.field5300;
        this.offsetY = var1.offsetY;
    }

    public static RegionOffset method3289(float var0, float var1, float var2) {
        RegionOffset[] var3 = field5301;
        synchronized (field5301) {
            RegionOffset var4;
            if (field5298 == 0) {
                var4 = new RegionOffset(var0, var1, var2);
                return var4;
            } else {
                field5301[--field5298].method3292(var0, var1, var2);
                var4 = field5301[field5298];
                return var4;
            }
        }
    }

    public static RegionOffset translate(RegionOffset var0) {
        RegionOffset[] var1 = field5301;
        synchronized (field5301) {
            RegionOffset var2;
            if (field5298 == 0) {
                var2 = new RegionOffset(var0);
                return var2;
            } else {
                field5301[--field5298].method3298(var0);
                var2 = field5301[field5298];
                return var2;
            }
        }
    }

    public static final RegionOffset method3296(RegionOffset var0, RegionOffset var1) {
        RegionOffset var2 = translate(var0);
        var2.method3300(var1);
        return var2;
    }

    public static void method3302(int var0) {
        field5297 = var0;
        field5301 = new RegionOffset[var0];
        field5298 = 0;
    }

    public void method3291() {
        RegionOffset[] var1 = field5301;
        synchronized (field5301) {
            if (field5298 < field5297 - 1) {
                field5301[field5298++] = this;
            }

        }
    }

    public void method3292(float var1, float var2, float var3) {
        this.offsetX = var1;
        this.field5300 = var2;
        this.offsetY = var3;
    }

    final void method3293() {
        this.offsetX = -this.offsetX;
        this.field5300 = -this.field5300;
        this.offsetY = -this.offsetY;
    }

    final void method3294(RegionOffset var1) {
        this.offsetX += var1.offsetX;
        this.field5300 += var1.field5300;
        this.offsetY += var1.offsetY;
    }

    public final void method3295(float var1, float var2, float var3) {
        this.offsetX -= var1;
        this.field5300 -= var2;
        this.offsetY -= var3;
    }

    public final float method3297() {
        return (float) Math.sqrt((double) (this.offsetX * this.offsetX + this.field5300 * this.field5300 + this.offsetY * this.offsetY));
    }

    public void method3298(RegionOffset var1) {
        this.method3292(var1.offsetX, var1.field5300, var1.offsetY);
    }

    public String toString() {
        return this.offsetX + ", " + this.field5300 + ", " + this.offsetY;
    }

    final void method3299(class567 var1) {
        class567 var2 = class567.method786(this.offsetX, this.field5300, this.offsetY, 0.0F);
        class567 var3 = class567.method791(var1);
        class567 var4 = class567.method794(var3, var2);
        var4.method792(var1);
        this.method3292(var4.field815, var4.field812, var4.field816);
        var2.method795();
        var3.method795();
        var4.method795();
    }

    final void method3300(RegionOffset var1) {
        this.offsetX -= var1.offsetX;
        this.field5300 -= var1.field5300;
        this.offsetY -= var1.offsetY;
    }

    public final void method3301(class135 var1) {
        float var2 = this.offsetX;
        float var3 = this.field5300;
        this.offsetX = var1.field1184 * var2 + var1.field1186 * var3 + var1.field1189 * this.offsetY + var1.field1182;
        this.field5300 = var1.field1192 * var2 + var1.field1187 * var3 + var1.field1190 * this.offsetY + var1.field1193;
        this.offsetY = var1.field1185 * var2 + var1.field1188 * var3 + var1.field1191 * this.offsetY + var1.field1183;
    }

    public final void method3303(class135 var1) {
        float var2 = this.offsetX;
        float var3 = this.field5300;
        this.offsetX = var1.field1184 * var2 + var1.field1186 * var3 + var1.field1189 * this.offsetY;
        this.field5300 = var1.field1192 * var2 + var1.field1187 * var3 + var1.field1190 * this.offsetY;
        this.offsetY = var1.field1185 * var2 + var1.field1188 * var3 + var1.field1191 * this.offsetY;
    }
}
