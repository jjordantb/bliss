public class class166 {
    public static int field6895;
    public static Object[] field6896;
    public static class48 field6897;
    static int field6893 = 63;
    static int field6894 = 7;
    static class856 field6898;

    class166() throws Throwable {
        throw new Error();
    }

    public static void method3682(int var0, int var1, boolean var2, int var3) {
        try {
            if (class371.field1088.method2942((long) var0) == null) {
                if (!class730.field2787) {
                    class176.method3166(var0, var2, 1982223094);
                } else {
                    class689 var4 = new class689(var0, new class957(4096, class16.field6892, var0), var1, var2);
                    var4.field7630.method1363(class321.field1066.method5705(1748854882), (byte) 104);
                    class371.field1088.method2947(var4, (long) var0);
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "n.a(" + ')');
        }
    }

    static int[] method3683(MenuItem var0, byte var1) {
        try {
            int[] var2 = null;
            if (class745.method2593(var0.opcode, (short) 300)) {
                var2 = class85.field1121.method1566((int) var0.field1701).field4285;
            } else if (-1 != var0.field1700) {
                var2 = class85.field1121.method1566(var0.field1700).field4285;
            } else if (class717.method2030(var0.opcode, -838004269)) {
                class437 var3 = (class437) class730.field2677.method2942((long) ((int) var0.field1701));
                if (var3 != null) {
                    Npc var4 = (Npc) var3.field7515;
                    NpcDefinition var5 = var4.field1637;
                    if (var5.field9924 != null) {
                        var5 = var5.method6110(class827.field9037, 2033982126);
                    }

                    if (var5 != null) {
                        var2 = var5.field9867;
                    }
                }
            } else if (class769.method2260(var0.opcode, (byte) -114)) {
                ObjectDefinition var7 = class730.field2697.method5283(150013546).method4713((int) (var0.field1701 >>> 32 & 2147483647L));
                if (var7.field2198 != null) {
                    var7 = var7.method1487(class827.field9037, 1956265286);
                }

                if (var7 != null) {
                    var2 = var7.field2202;
                }
            }

            return var2;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "n.ag(" + ')');
        }
    }

    static final void method3684(class744 var0, byte var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            class317.method469(var3, var0, -2024770880);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "n.qm(" + ')');
        }
    }
}
