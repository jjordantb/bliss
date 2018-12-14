public class class236 extends class535 {
    public static int field8239 = 2;
    public static int field8240 = 1;
    public static int field8241 = 0;

    public class236(int var1, class838 var2) {
        super(var1, var2);
        class646.method5502(super.field3708, -1410466853);
    }

    public class236(class838 var1) {
        super(var1);
        class646.method5502(super.field3708, -1776530085);
    }

    public static int method4619(int var0, int var1) {
        try {
            int var2 = var0 >>> 1;
            var2 |= var2 >>> 1;
            var2 |= var2 >>> 2;
            var2 |= var2 >>> 4;
            var2 |= var2 >>> 8;
            var2 |= var2 >>> 16;
            return var0 & ~var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ade.i(" + ')');
        }
    }

    public int method4616(int var1) {
        try {
            return super.field3708;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ade.y(" + ')');
        }
    }

    public void method4617(int var1) {
        try {
            if (super.field3704.method5394(-463714341).method2268(1268482556) < 245) {
                super.field3708 = 0;
            }

            if (super.field3708 < 0 || super.field3708 > 2) {
                super.field3708 = this.method2272(-334062973);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ade.s(" + ')');
        }
    }

    public int method2273(int var1, int var2) {
        try {
            return super.field3704.method5394(-2143176849).method2268(1386061533) < 245 ? 3 : 1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ade.f(" + ')');
        }
    }

    void method2275(int var1, int var2) {
        try {
            super.field3708 = var1;
            class646.method5502(super.field3708, -663288448);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ade.p(" + ')');
        }
    }

    int method2272(int var1) {
        try {
            return super.field3704.method5394(-1188800813).method2268(1637246770) < 245 ? 0 : 2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ade.a(" + ')');
        }
    }

    public boolean method4618(byte var1) {
        try {
            return super.field3704.method5394(-325188584).method2268(2056702911) >= 245;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ade.z(" + ')');
        }
    }
}
