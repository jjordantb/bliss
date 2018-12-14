public class class211 extends class717 {
    public int field7245;
    public int field7246;
    public int field7247;
    public int field7248;
    public boolean field7249 = false;
    public int field7250;

    public boolean method3926(int var1, int var2) {
        if (!this.field7249) {
            return false;
        } else {
            int var3 = this.field7248 - this.field7246;
            int var4 = this.field7245 - this.field7247;
            int var5 = var3 * var3 + var4 * var4;
            int var6 = var1 * var3 + var2 * var4 - (this.field7246 * var3 + this.field7247 * var4);
            int var7;
            int var8;
            if (var6 <= 0) {
                var7 = this.field7246 - var1;
                var8 = this.field7247 - var2;
                return var7 * var7 + var8 * var8 < this.field7250 * this.field7250;
            } else if (var6 > var5) {
                var7 = this.field7248 - var1;
                var8 = this.field7245 - var2;
                return var7 * var7 + var8 * var8 < this.field7250 * this.field7250;
            } else {
                var6 = (var6 << 10) / var5;
                var7 = this.field7246 + (var3 * var6 >> 10) - var1;
                var8 = this.field7247 + (var4 * var6 >> 10) - var2;
                return var7 * var7 + var8 * var8 < this.field7250 * this.field7250;
            }
        }
    }
}
