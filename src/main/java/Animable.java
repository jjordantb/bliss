public abstract class Animable extends Interactable {

    public short field8296;
    public short field8297;
    public short field8298;
    public short field8299;
    public boolean field8300;
    byte field8301;

    Animable(SceneGraph var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, byte var12) {
        super(var1);
        super.field3639 = (byte) var2;
        super.field3640 = (byte) var3;
        this.method1514(new RegionOffset((float) var4, (float) var5, (float) var6));
        this.field8299 = (short) var7;
        this.field8297 = (short) var8;
        this.field8296 = (short) var9;
        this.field8298 = (short) var10;
        this.field8300 = var11;
        this.field8301 = var12;
    }

    void method4691(int var1) {
    }

    int method2161(class639[] var1, int var2) {
        try {
            int var3 = 0;

            int var4;
            int var5;
            int var10;
            label120:
            for (var4 = this.field8299; var4 <= this.field8297; ++var4) {
                label118:
                for (var5 = this.field8296; var5 <= this.field8298; ++var5) {
                    long var6 = super.field3638.field3899[super.field3639][var4][var5];
                    long var8 = 0L;

                    while (true) {
                        label113:
                        while (true) {
                            if (var8 > 48L) {
                                continue label118;
                            }

                            var10 = (int) (var6 >>> (int) var8 & 65535L);
                            if (var10 <= 0) {
                                continue label118;
                            }

                            class321 var11 = super.field3638.field3903[var10 - 1];

                            for (int var12 = 0; var12 < var3; ++var12) {
                                if (var11.field1046 == var1[var12]) {
                                    var8 += 16L;
                                    continue label113;
                                }
                            }

                            var1[var3++] = var11.field1046;
                            if (var3 == 4) {
                                break label120;
                            }

                            var8 += 16L;
                        }
                    }
                }
            }

            for (var4 = var3; var4 < 4; ++var4) {
                var1[var4] = null;
            }

            if (this.field8301 != 0) {
                var4 = this.field8299 - super.field3638.field3898;
                var5 = this.field8296 - super.field3638.field3858;
                short var13;
                int var14;
                int var15;
                short var16;
                if (1 == this.field8301) {
                    if (var5 > var4) {
                        var13 = this.field8299;
                        var14 = this.field8296 - 1;
                        var15 = 1 + this.field8299;
                        var16 = this.field8296;
                    } else {
                        var13 = this.field8299;
                        var14 = 1 + this.field8296;
                        var15 = this.field8299 - 1;
                        var16 = this.field8296;
                    }
                } else if (var5 > -var4) {
                    var13 = this.field8299;
                    var14 = this.field8296 - 1;
                    var15 = this.field8299 - 1;
                    var16 = this.field8296;
                } else {
                    var13 = this.field8299;
                    var14 = this.field8296 + 1;
                    var15 = this.field8299 + 1;
                    var16 = this.field8296;
                }

                label84:
                for (var10 = 0; var10 < var3; ++var10) {
                    long var17 = super.field3638.field3899[super.field3639][var13][var14];

                    class321 var19;
                    while (0L != var17) {
                        var19 = super.field3638.field3903[(int) ((var17 & 65535L) - 1L)];
                        var17 >>>= 16;
                        if (var19.field1046 == var1[var10]) {
                            continue label84;
                        }
                    }

                    var17 = super.field3638.field3899[super.field3639][var15][var16];

                    while (0L != var17) {
                        var19 = super.field3638.field3903[(int) ((var17 & 65535L) - 1L)];
                        var17 >>>= 16;
                        if (var19.field1046 == var1[var10]) {
                            continue label84;
                        }
                    }

                    for (int var21 = var10; var21 < var3 - 1; ++var21) {
                        var1[var21] = var1[var21 + 1];
                    }

                    --var3;
                }
            }

            return var3;
        } catch (RuntimeException var20) {
            throw class158.method3445(var20, "ajf.dg(" + ')');
        }
    }

    boolean method2167(int var1) {
        try {
            for (int var2 = this.field8299; var2 <= this.field8297; ++var2) {
                for (int var3 = this.field8296; var3 <= this.field8298; ++var3) {
                    int var4 = super.field3638.field3883 + (var2 - super.field3638.field3898);
                    if (var4 >= 0 && var4 < super.field3638.field3908.length) {
                        int var5 = var3 - super.field3638.field3858 + super.field3638.field3883;
                        if (var5 >= 0 && var5 < super.field3638.field3908.length && super.field3638.field3908[var4][var5]) {
                            return true;
                        }
                    }
                }
            }

            return false;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ajf.dq(" + ')');
        }
    }

    boolean method2171(class848 var1, byte var2) {
        try {
            return super.field3638.field3857.method1654(super.field3640, this.field8299, this.field8297, this.field8296, this.field8298, this.method2165(var1, (byte) -61));
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ajf.dl(" + ')');
        }
    }
}
