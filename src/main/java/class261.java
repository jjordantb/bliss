public class class261 {
    class478 field8124;
    class1 field8125 = new class1(256);
    class13 field8126;

    class261(class13 var1, class478 var2) {
        this.field8126 = var1;
        this.field8124 = var2;
    }

    class678 method4510(int var1) {
        return this.method4511(var1, -1);
    }

    class678 method4511(int var1, int var2) {
        Object var3 = this.field8125.method2974((long) var1);
        if (var3 != null) {
            return (class678) var3;
        } else if (!this.field8124.method4621(var1, (short) 25920)) {
            return null;
        } else {
            class414 var4 = this.field8124.method4625(var1, 107897040);
            if (var2 == -1) {
                var2 = var4.field9372 ? 64 : this.field8126.field6805;
            }

            class678 var6;
            if (var4.field9397 && this.field8126.method4883()) {
                float[] var7 = this.field8124.method4632(var1, 0.7F, var2, var2, false, (byte) -119);
                var6 = new class678(this.field8126, 3553, class264.field8191, class482.field8396, var2, var2, var4.field9391 != 0, var7, class264.field8191);
            } else {
                int[] var5;
                if (var4.field9382 != 2 && class355.method1414(var4.field9383, -769385379)) {
                    var5 = this.field8124.method4622(var1, 0.7F, var2, var2, true, 1090878298);
                } else {
                    var5 = this.field8124.method4623(var1, 0.7F, var2, var2, false, (byte) 2);
                }

                var6 = new class678(this.field8126, 3553, var2, var2, var4.field9391 != 0, var5, 0, 0, false);
            }

            var6.method4212(var4.field9394, var4.field9395);
            this.field8125.method2984(var6, (long) var1);
            return var6;
        }
    }

    void method4512() {
        this.field8125.method2976(5, -56778652);
    }

    void method4513() {
        this.field8125.method2977();
    }
}
