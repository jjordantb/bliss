public class class710 extends class827 {
    public int field3451;
    public int field3452;
    public int field3453;
    public int field3454;
    public int field3455;
    public int field3456;

    class710(class971 var1, class49 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
        super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
        this.field3453 = var10;
        this.field3452 = var11;
        this.field3456 = var12;
        this.field3454 = var13;
        this.field3455 = var14;
        this.field3451 = var15;
    }

    static final void method2027(class744 var0, int var1) {
        try {
            int var2 = var0.field3174[var0.field3176];
            Integer var3 = (Integer) class166.field6896[var2];
            if (var3 == null) {
                class579 var4 = class899.field9551.method3678(var2, 65536);
                if (var4.field77 != 'i' && var4.field77 != '1') {
                    var0.field3161[++var0.field3156 - 1] = -1;
                } else {
                    var0.field3161[++var0.field3156 - 1] = 0;
                }
            } else {
                var0.field3161[++var0.field3156 - 1] = var3.intValue();
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "zx.bq(" + ')');
        }
    }

    public class7 method6197(int var1) {
        try {
            return class7.field4910;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "zx.f(" + ')');
        }
    }
}
