import java.awt.*;

public class class105 extends class284 {
    static int field222 = 174;
    static int field223 = 161;
    static int field224 = 170;
    static int field225 = 163;
    static int field226 = 164;
    static int field227 = 165;
    static int field228 = 520;
    static int field230 = 168;
    static int field231 = 169;
    static int field232 = 519;
    static int field233 = 171;
    static int field234 = 172;
    static int field235 = 173;
    static int field236 = 674;
    static int field237 = 512;
    static int field238 = 513;
    static int field239 = 514;
    static int field240 = 167;
    static int field241 = 516;
    static int field242 = 517;
    static int field244 = 672;
    static int field245 = 160;
    static int field246 = 521;
    static int field247 = 522;
    static int field248 = 525;
    static int field250 = 162;
    static class105[] field251 = new class105[0];
    static int field254 = 515;
    static int field255 = 166;
    static int field256 = 518;
    int field229;
    int field243;
    long field249;
    int field252;
    int field253;

    static void method199(int var0, byte var1) {
        try {
            class358.field1896 = var0;
            class358.field1897 = new class358[var0];
            class358.field1895 = 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajw.ad(" + ')');
        }
    }

    public int method195(byte var1) {
        try {
            return this.field253;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajw.at(" + ')');
        }
    }

    public int method196(byte var1) {
        try {
            return this.field252;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajw.ah(" + ')');
        }
    }

    public int method6666(int var1) {
        try {
            switch (this.field252) {
                case 160:
                case 512:
                    return -1;
                case 161:
                case 163:
                case 513:
                case 515:
                    return 0;
                case 162:
                case 514:
                    return 3;
                case 164:
                case 166:
                case 516:
                case 518:
                    return 2;
                case 165:
                case 517:
                    return 5;
                case 167:
                case 169:
                case 519:
                case 521:
                    return 1;
                case 168:
                case 520:
                    return 4;
                case 170:
                case 522:
                    return 6;
                default:
                    return -2;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajw.a(" + ')');
        }
    }

    public int method6668(int var1) {
        try {
            switch (this.field252) {
                case 160:
                case 512:
                    return 0;
                case 163:
                case 166:
                case 169:
                case 173:
                case 515:
                case 518:
                case 521:
                case 525:
                    return 2;
                default:
                    return 1;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajw.p(" + ')');
        }
    }

    public long method6669(byte var1) {
        try {
            return this.field249;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajw.i(" + ')');
        }
    }

    public int method6667(byte var1) {
        try {
            return this.field243;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajw.f(" + ')');
        }
    }

    public int method6680(int var1) {
        try {
            return this.field229;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajw.b(" + ')');
        }
    }

    public boolean method197(int var1) {
        try {
            switch (this.field252) {
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 169:
                case 170:
                case 171:
                case 172:
                case 173:
                case 174:
                case 672:
                case 674:
                    return true;
                default:
                    return false;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajw.ai(" + ')');
        }
    }

    public void method6670(int var1) {
        try {
            class105[] var2 = field251;
            synchronized (field251) {
                if (class19.field5364 < class310.field533 - 1) {
                    field251[++class19.field5364 - 1] = this;
                }

            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ajw.d(" + ')');
        }
    }

    public void method198(Point var1, int var2) {
        try {
            this.field243 -= var1.x * 2113899933;
            this.field229 -= var1.y * -1537929791;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ajw.al(" + ')');
        }
    }
}
