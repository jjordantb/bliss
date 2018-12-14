public class class755 extends class535 {
    public static int field4197 = 0;
    public static int field4198 = 1;
    static int[] field4199;

    public class755(int var1, class838 var2) {
        super(var1, var2);
    }

    public class755(class838 var1) {
        super(var1);
    }

    static final void method2655(int var0) {
        try {
            int[] var1 = class498.field8108;

            int var2;
            for (var2 = 0; var2 < class498.field8102; ++var2) {
                Player var3 = class730.loaded[var1[var2]];
                if (var3 != null) {
                    var3.method2556(-586581534);
                }
            }

            for (var2 = 0; var2 < class730.field2684; ++var2) {
                long var4 = (long) class730.field2680[var2];
                class437 var6 = (class437) class730.field2677.method2942(var4);
                if (var6 == null) {
                    if (var0 == -1062447355) {
                        throw new IllegalStateException();
                    }
                } else {
                    ((Actor) var6.field7515).method2556(1089221669);
                }
            }

            if (class730.field2705 == 0) {
                for (var2 = 0; var2 < class949.field3322.length; ++var2) {
                    class283 var8 = class949.field3322[var2];
                    if (var8.field10613) {
                        var8.method6636(1581721425).method2556(390417691);
                    }
                }
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "add.gz(" + ')');
        }
    }

    public boolean method2652(byte var1) {
        return true;
    }

    public int method2273(int var1, int var2) {
        try {
            if (var1 != 0 && super.field3704.field9114.method5154((byte) 10) == 2) {
                return 3;
            } else {
                return var1 != 0 && super.field3704.field9139.method2805(948081550) != 1 ? 2 : 1;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "add.f(" + ')');
        }
    }

    void method2275(int var1, int var2) {
        try {
            super.field3708 = var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "add.p(" + ')');
        }
    }

    public int method2653(int var1) {
        try {
            return super.field3708;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "add.y(" + ')');
        }
    }

    int method2272(int var1) {
        return 1;
    }

    public void method2654(byte var1) {
        try {
            if (super.field3708 != 0 && super.field3704.field9139.method2805(1435565446) != 1) {
                super.field3708 = 0;
            }

            if (super.field3708 != 0 && super.field3704.field9114.method5154((byte) 20) == 2) {
                super.field3708 = 0;
            }

            if (super.field3708 < 0 || super.field3708 > 1) {
                super.field3708 = this.method2272(-1720172189);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "add.s(" + ')');
        }
    }
}
