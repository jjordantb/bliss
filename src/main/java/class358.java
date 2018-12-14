public final class class358 extends class284 {
    static int field1895;
    static int field1896;
    static class358[] field1897 = new class358[0];
    int field1898;
    int field1899;
    int field1900;
    long field1901;
    int field1902;

    public int method6666(int var1) {
        try {
            return this.field1898;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajn.a(" + ')');
        }
    }

    public int method6667(byte var1) {
        try {
            return this.field1899;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajn.f(" + ')');
        }
    }

    public int method6680(int var1) {
        try {
            return this.field1900;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajn.b(" + ')');
        }
    }

    public long method6669(byte var1) {
        try {
            return this.field1901;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajn.i(" + ')');
        }
    }

    public void method6670(int var1) {
        try {
            class358[] var2 = field1897;
            synchronized (field1897) {
                if (field1895 < field1896 - 1) {
                    field1897[++field1895 - 1] = this;
                }

            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ajn.d(" + ')');
        }
    }

    public int method6668(int var1) {
        try {
            return this.field1902;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajn.p(" + ')');
        }
    }
}
