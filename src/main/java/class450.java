public class class450 extends class816 {
    static int[][] field7120 = new int[6][];
    static int[] field7128 = new int[6];
    class891 field7121;
    int field7122;
    int field7123;
    int field7124;
    class325 field7125;
    int field7126;
    int field7127;
    int field7129;

    class450(class325 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.field7125 = var1;
        this.field7124 = var4;
        this.field7129 = var5;
        this.field7126 = var6;
        this.field7127 = var7;
        this.field7122 = var2;
        this.field7123 = var3;
    }

    class891 method2898() {
        if (this.field7121 == null) {
            class478 var1 = this.field7125.field8581;
            field7128[0] = this.field7122;
            field7128[1] = this.field7123;
            field7128[2] = this.field7124;
            field7128[3] = this.field7129;
            field7128[4] = this.field7126;
            field7128[5] = this.field7127;
            boolean var2 = false;
            int var3 = 0;

            int var4;
            for (var4 = 0; var4 < 6; ++var4) {
                if (!var1.method4621(field7128[var4], (short) 30897)) {
                    return null;
                }

                class414 var5 = var1.method4625(field7128[var4], 548251560);
                int var6 = var5.field9372 ? 64 : 128;
                if (var6 > var3) {
                    var3 = var6;
                }

                if (var5.field9391 > 0) {
                    var2 = true;
                }
            }

            for (var4 = 0; var4 < 6; ++var4) {
                field7120[var4] = var1.method4622(field7128[var4], 1.0F, var3, var3, false, -1308282836);
            }

            this.field7121 = this.field7125.method674(var3, var2, field7120);
        }

        return this.field7121;
    }
}
