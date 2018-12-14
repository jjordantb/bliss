public class class129 extends Node {
    public short field1084;

    public class129(short var1) {
        this.field1084 = var1;
    }

    static void method863(int var0, int var1, int var2, int var3, int var4, int var5) {
        try {
            int var6 = class972.method1776(var2, class381.field1414, class381.field1415, -1212608691);
            int var7 = class972.method1776(var3, class381.field1414, class381.field1415, -1212608691);
            int var8 = class972.method1776(var0, class381.field1416, class381.field1413, -1212608691);
            int var9 = class972.method1776(var1, class381.field1416, class381.field1413, -1212608691);

            for (int var10 = var6; var10 <= var7; ++var10) {
                class484.method4769(class381.field1412[var10], var8, var9, var4, 420313117);
            }

        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "abe.s(" + ')');
        }
    }

    static final void method864(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            class128.method1582(var0.field3161[var0.field3156], var0.field3161[var0.field3156 + 1], 255, -649427988);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "abe.sj(" + ')');
        }
    }
}
