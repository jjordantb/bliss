import java.util.Iterator;

public class class968 extends class535 {
    public static int field2553 = 0;
    public static int field2554 = 1;
    static class922 field2552;

    public class968(class838 var1) {
        super(var1);
    }

    public class968(int var1, class838 var2) {
        super(var2);
    }

    static final void method1736(int var0) {
        try {
            Iterator var1 = class730.field2806.iterator();

            while (var1.hasNext()) {
                class178 var2 = (class178) var1.next();
                class150 var3 = var2.field5225;
                var3.method3380(1, -748759469);
                if (var3.method3381(1662190190)) {
                    var2.method545(-1460969981);
                    var3.method3377((byte) 54);
                } else if (class730.field2697.method5317(-1611682495) != null && var3.method3378((byte) -116)) {
                    class730.field2697.method5317(-1611682495).method2416(var3, true, (byte) 0);
                }
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aez.ik(" + ')');
        }
    }

    int method2272(int var1) {
        return 1;
    }

    int method2273(int var1, int var2) {
        return 1;
    }

    void method2275(int var1, int var2) {
        try {
            super.field3708 = var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aez.p(" + ')');
        }
    }

    public int method1734(int var1) {
        try {
            return super.field3708;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "aez.z(" + ')');
        }
    }

    public void method1735(int var1) {
        try {
            if (super.field3708 != 1 && super.field3708 != 0) {
                super.field3708 = this.method2272(129601204);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "aez.s(" + ')');
        }
    }
}
