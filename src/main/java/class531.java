public class class531 extends class345 {
    static class180 field3737;
    class366[] field3734;
    int field3735;
    byte[][] field3736;

    public class531(int var1) {
        this.field3735 = var1;
    }

    public boolean method2307(byte var1) {
        try {
            if (this.field3734 != null) {
                return true;
            } else {
                if (this.field3736 == null) {
                    class180 var2 = class394.field5418;
                    synchronized (class394.field5418) {
                        if (!class394.field5418.method3261(this.field3735, 334179097)) {
                            boolean var19 = false;
                            return var19;
                        }

                        int[] var3 = class394.field5418.method3277(this.field3735, -2074944518);
                        this.field3736 = new byte[var3.length][];

                        for (int var4 = 0; var4 < var3.length; ++var4) {
                            this.field3736[var4] = class394.field5418.method3285(this.field3735, var3[var4], (byte) -7);
                        }
                    }
                }

                boolean var16 = true;

                int var6;
                for (int var17 = 0; var17 < this.field3736.length; ++var17) {
                    byte[] var20 = this.field3736[var17];
                    InputStream var5 = new InputStream(var20);
                    var5.field10376 = 1;
                    var6 = var5.method6374();
                    class180 var7 = field3737;
                    synchronized (field3737) {
                        var16 &= field3737.method3280(var6, -457216440);
                    }
                }

                if (!var16) {
                    return false;
                } else {
                    class599 var18 = new class599();
                    class180 var22 = class394.field5418;
                    int[] var21;
                    synchronized (class394.field5418) {
                        var6 = class394.field5418.method3286(this.field3735, -222662329);
                        this.field3734 = new class366[var6];
                        var21 = class394.field5418.method3277(this.field3735, -2046558264);
                    }

                    for (int var23 = 0; var23 < var21.length; ++var23) {
                        byte[] var24 = this.field3736[var23];
                        InputStream var25 = new InputStream(var24);
                        var25.field10376 = 1;
                        int var8 = var25.method6374();
                        class652 var9 = null;

                        for (class652 var10 = (class652) var18.method1281(2084946117); var10 != null; var10 = (class652) var18.method1283((byte) -23)) {
                            if (var8 == var10.field9459) {
                                var9 = var10;
                                break;
                            }
                        }

                        if (var9 == null) {
                            class180 var26 = field3737;
                            synchronized (field3737) {
                                var9 = new class652(var8, field3737.method3264(var8, (byte) 34));
                            }

                            var18.method1282(var9, 805140432);
                        }

                        this.field3734[var21[var23]] = new class366(var24, var9);
                    }

                    this.field3736 = null;
                    return true;
                }
            }
        } catch (RuntimeException var15) {
            throw class158.method3445(var15, "aih.f(" + ')');
        }
    }

    public boolean method2308(int var1, byte var2) {
        try {
            return this.field3734[var1].field2428;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aih.p(" + ')');
        }
    }

    public boolean method2309(int var1, byte var2) {
        try {
            return this.field3734[var1].field2429;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aih.i(" + ')');
        }
    }

    public boolean method2310(int var1, int var2) {
        try {
            return this.field3734[var1].field2427;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aih.b(" + ')');
        }
    }
}
