import java.io.File;

public class class222 {
    static int field7370 = 4;
    static int field7372 = 256;
    static int field7376 = 2;
    class151[] field7371;
    String field7373;
    class151[] field7374;
    class220[] field7375;

    public class222(byte[] var1) throws class938 {
        this.method4106(var1, 1575472907);
    }

    static final void method4107(class744 var0, int var1) {
        try {
            String var2 = (String) var0.field3157[--var0.field3158];
            boolean var3 = class5.field4944.method1304(new File(var2), -714101418);
            var0.field3161[++var0.field3156 - 1] = var3 ? 1 : 0;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "el.agp(" + ')');
        }
    }

    static final void method4108(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9133.method5728(-1741518508);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "el.aks(" + ')');
        }
    }

    static final void method4109(class744 var0, int var1) {
        try {
            byte var2 = class923.local.field3639;
            RegionOffset var3 = class923.local.getRegion().regionOffset;
            RegionBase var4 = class730.field2697.getRegionBase(681479919);
            int var5 = ((int) var3.offsetX >> 9) + var4.baseX;
            int var6 = ((int) var3.offsetY >> 9) + var4.baseY;
            var0.field3161[++var0.field3156 - 1] = (var5 << 14) + (var2 << 28) + var6;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "el.tt(" + ')');
        }
    }

    void method4106(byte[] var1, int var2) throws class938 {
        try {
            class501 var3 = new class501(var1);
            int var4 = var3.method1906(1157029171);
            if (var4 != 4) {
                throw new class938(this, var4, 4);
            } else {
                this.field7373 = var3.method1905(1509343502);
                this.field7371 = new class151[var3.method1906(725581167)];
                this.field7374 = new class151[var3.method1906(1366230292)];
                this.field7375 = new class220[var3.method1906(594275655)];

                int var5;
                for (var5 = 0; var5 < this.field7371.length; ++var5) {
                    this.field7371[var5] = new class151();
                    this.field7371[var5].method3370(var3, (byte) 107);
                }

                for (var5 = 0; var5 < this.field7374.length; ++var5) {
                    this.field7374[var5] = new class151();
                    this.field7374[var5].method3370(var3, (byte) 107);
                }

                for (var5 = 0; var5 < this.field7375.length; ++var5) {
                    this.field7375[var5] = new class220();
                    this.field7375[var5].method4039(var3, (byte) -15);
                }

            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "el.a(" + ')');
        }
    }
}
