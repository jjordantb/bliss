final class class141 implements class768 {
    static IterableSceneEntity method1092(Animable var0, byte var1) {
        try {
            IterableSceneEntity var2;
            if (IterableSceneEntity.previous == null) {
                var2 = new IterableSceneEntity();
            } else {
                var2 = IterableSceneEntity.previous;
                IterableSceneEntity.previous = IterableSceneEntity.previous.next;
                var2.next = null;
                --IterableSceneEntity.index;
            }

            var2.animable = var0;
            return var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "k.a(" + ')');
        }
    }

    public static void method1093(class971 var0, class49 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        try {
            class228.field8216 = var0;
            class228.field8222 = var1;
            class228.field8215 = var2;
            class228.field8218 = var3;
            class228.field8217 = var4;
            class228.field8220 = var5;
            class370.field1097 = var6;
            class228.field8219 = var7;
            class348.field221 = var8;
            class417.field9582 = null;
            class968.field2552 = null;
            class5.field4945 = null;
            class245.field8540 = var9;
            class228.field8213 = var10;
            class461.method3994(-1268692886);
            class534.field3722 = true;
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "k.a(" + ')');
        }
    }

    static class197 method1094(InputStream var0, int var1) {
        try {
            int var2 = var0.method6371();
            int var3 = var0.method6371();
            int var4 = var0.method6371();
            int[] var5 = new int[var4];

            for (int var6 = 0; var6 < var4; ++var6) {
                var5[var6] = var0.method6371();
            }

            return new class197(var2, var3, var5);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "k.p(" + ')');
        }
    }

    static final void method1095(class744 var0, int var1) {
        try {
            var0.field3156 -= 3;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            int var4 = var0.field3161[2 + var0.field3156];
            class449.method3756(var2, (byte) 83);
            class362.method1505(class382.widgetContainers[var2 >>> 16], var2 & '\uffff', var3, var4, var0.field3178, var0, -782842809);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "k.ba(" + ')');
        }
    }

    public Object method2233(byte[] var1, class230 var2, boolean var3, int var4) {
        try {
            return class593.field1623.method4936(var2, class922.method6237(var1), var3);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "k.a(" + ')');
        }
    }
}
