public final class class266 extends class655 {
    int[] field8206 = null;
    class132 field8207;
    int[] field8208 = null;

    class266(class132 var1, class151 var2) {
        super(var2);
        this.field8207 = var1;
        this.field8206 = var2.field5370;
        this.field8208 = var2.field5371;
    }

    final int method4577() {
        return this.field8208[this.field8207.method4059(1457769061)];
    }

    final int method4578() {
        return this.field8206[this.field8207.method4059(1410617434)];
    }

    public boolean method5619(int var1) {
        return true;
    }

    public final int method5614(int var1) {
        int var2 = this.field8206[var1];
        int var3 = this.field8208[var1];
        if (var2 != -1) {
            return var2;
        } else {
            return var3 != -1 ? var3 | 65536 : -1;
        }
    }
}
