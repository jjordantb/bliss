public class class320 {
    int field818;
    class514 field819 = new class514();
    NodeTable field820;
    int field821;

    public class320(int var1) {
        this.field818 = var1;
        this.field821 = var1;

        int var2;
        for (var2 = 1; var2 + var2 < var1; var2 += var2) {
            ;
        }

        this.field820 = new NodeTable(var2);
    }

    public final void method799(Object var1, class195 var2) {
        this.method802(var1, var2, 1);
    }

    final void method800(class195 var1) {
        long var2 = var1.method3707();

        for (class89 var4 = (class89) this.field820.method2942(var2); var4 != null; var4 = (class89) this.field820.method2943(-2034265675)) {
            if (var4.field1135.method3708(var1)) {
                this.method801(var4);
                break;
            }
        }

    }

    final void method801(class89 var1) {
        if (var1 != null) {
            var1.method545(-1460969981);
            var1.method156(460842830);
            this.field821 += var1.field1136;
        }

    }

    final void method802(Object var1, class195 var2, int var3) {
        if (var3 > this.field818) {
            throw new IllegalStateException();
        } else {
            this.method800(var2);
            this.field821 -= var3;

            while (this.field821 < 0) {
                class89 var4 = (class89) this.field819.method2705(-2126444104);
                this.method801(var4);
            }

            class145 var5 = new class145(var2, var1, var3);
            this.field820.method2947(var5, var2.method3707());
            this.field819.method2704(var5, (byte) -62);
            var5.field209 = 0L;
        }
    }

    public final void method803(int var1) {
        for (class89 var2 = (class89) this.field819.method2706(-1518160714); var2 != null; var2 = (class89) this.field819.method2707(-216095047)) {
            if (var2.method953()) {
                if (var2.method952() == null) {
                    var2.method545(-1460969981);
                    var2.method156(-1671221720);
                    this.field821 += var2.field1136;
                }
            } else if (++var2.field209 > (long) var1) {
                class685 var3 = new class685(var2.field1135, var2.method952(), var2.field1136);
                this.field820.method2947(var3, var2.field641);
                class599.method1287(var3, var2, -1652592361);
                var2.method545(-1460969981);
                var2.method156(-1787171462);
            }
        }

    }

    public final void method804() {
        this.field819.method2710(1635607496);
        this.field820.method2941((byte) -95);
        this.field821 = this.field818;
    }

    public final int method805() {
        return this.field818;
    }

    public final Object method806(class195 var1) {
        long var2 = var1.method3707();

        for (class89 var4 = (class89) this.field820.method2942(var2); var4 != null; var4 = (class89) this.field820.method2943(-1776975649)) {
            if (var4.field1135.method3708(var1)) {
                Object var5 = var4.method952();
                if (var5 != null) {
                    if (var4.method953()) {
                        class145 var6 = new class145(var1, var5, var4.field1136);
                        this.field820.method2947(var6, var4.field641);
                        this.field819.method2704(var6, (byte) -106);
                        var6.field209 = 0L;
                        var4.method545(-1460969981);
                        var4.method156(-869627360);
                    } else {
                        this.field819.method2704(var4, (byte) -38);
                        var4.field209 = 0L;
                    }

                    return var5;
                }

                var4.method545(-1460969981);
                var4.method156(307674222);
                this.field821 += var4.field1136;
            }
        }

        return null;
    }

    public final int method807() {
        return this.field821;
    }

    public final void method808() {
        for (class89 var1 = (class89) this.field819.method2706(707727981); var1 != null; var1 = (class89) this.field819.method2707(590574136)) {
            if (var1.method953()) {
                var1.method545(-1460969981);
                var1.method156(243040905);
                this.field821 += var1.field1136;
            }
        }

    }
}
