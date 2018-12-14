public class class435 extends class347 {
    static int field7459 = 0;
    static boolean field7460 = false;
    static int field7461 = 0;

    public class435() {
        super(1, false);
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, 633455339);
            if (super.field270.field6612) {
                for (int var4 = 0; var4 < class322.field831; ++var4) {
                    this.method4222(var4, var1, 2004320511);
                    int[] var5 = this.method201(0, field7461, -1887337990);
                    var3[var4] = var5[field7459];
                }
            }

            return var3;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ahn.i(" + ')');
        }
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            if (var1 == 0) {
                super.field268 = var2.method6371() == 1;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ahn.r(" + ')');
        }
    }

    final void method4222(int var1, int var2, int var3) {
        try {
            int var4 = class322.field838[var1];
            int var5 = class322.field836[var2];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                field7459 = var1;
                field7461 = var2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                field7459 = var2;
                field7461 = var1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                field7459 = class322.field831 - var2;
                field7461 = var1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                field7459 = var1;
                field7461 = class322.field832 - var2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                field7459 = class322.field831 - var1;
                field7461 = class322.field832 - var2;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                field7459 = class322.field831 - var2;
                field7461 = class322.field832 - var1;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                field7459 = var2;
                field7461 = class322.field832 - var1;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                field7459 = class322.field831 - var1;
                field7461 = var2;
            }

            field7459 &= class322.field829;
            field7461 &= class322.field834;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "ahn.ac(" + ')');
        }
    }

    int[][] method204(int var1, byte var2) {
        try {
            int[][] var3 = super.field266.method162(var1, (byte) 40);
            if (super.field266.field211) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];

                for (int var7 = 0; var7 < class322.field831; ++var7) {
                    this.method4222(var7, var1, 2006108511);
                    int[][] var8 = this.method206(0, field7461, (byte) 8);
                    var4[var7] = var8[0][field7459];
                    var5[var7] = var8[1][field7459];
                    var6[var7] = var8[2][field7459];
                }
            }

            return var3;
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "ahn.k(" + ')');
        }
    }
}
