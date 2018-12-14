public class class73 {
    int field1452 = 0;
    class393 field1453;
    int field1454 = 0;
    int field1455 = 0;
    class13 field1456;
    class604 field1457;
    class9[] field1458;

    class73(class13 var1) {
        this.field1456 = var1;
        this.field1457 = new class604(var1);
        this.field1458 = new class9[16];
        this.field1458[1] = new class30(var1);
        this.field1458[2] = new class795(var1, this.field1457);
        this.field1458[4] = new class301(var1, this.field1457);
        this.field1458[5] = new class512(var1, this.field1457);
        this.field1458[6] = new class918(var1);
        this.field1458[7] = new class953(var1);
        this.field1458[3] = this.field1453 = new class393(var1);
        this.field1458[8] = new class815(var1, this.field1457);
        this.field1458[9] = new class720(var1, this.field1457);
        if (!this.field1458[8].method2997()) {
            this.field1458[8] = this.field1458[4];
        }

        if (!this.field1458[9].method2997()) {
            this.field1458[9] = this.field1458[8];
        }

    }

    boolean method1104(int var1) {
        return this.field1458[var1].method2997();
    }

    void method1105(int var1, int var2, int var3, boolean var4, boolean var5) {
        var5 &= this.field1456.method3607();
        if (!var5 && (var1 == 4 || var1 == 8 || var1 == 9)) {
            if (var1 == 4) {
                var3 = var2;
            }

            var1 = 2;
        }

        if (var1 != 0 && var4) {
            var1 |= Integer.MIN_VALUE;
        }

        if (this.field1455 != var1) {
            if (this.field1455 != 0) {
                this.field1458[this.field1455 & Integer.MAX_VALUE].method3000();
            }

            if (var1 != 0) {
                this.field1458[var1 & Integer.MAX_VALUE].method3001(var4);
                this.field1458[var1 & Integer.MAX_VALUE].method3014(var4);
                this.field1458[var1 & Integer.MAX_VALUE].method2999(var2, var3);
            }

            this.field1455 = var1;
            this.field1452 = var2;
            this.field1454 = var3;
        } else if (this.field1455 != 0) {
            this.field1458[this.field1455 & Integer.MAX_VALUE].method3014(var4);
            if (this.field1452 != var2 || this.field1454 != var3) {
                this.field1458[this.field1455 & Integer.MAX_VALUE].method2999(var2, var3);
                this.field1452 = var2;
                this.field1454 = var3;
            }
        }

    }

    boolean method1106(class203 var1, int var2) {
        if (this.field1455 == 0) {
            return false;
        } else {
            this.field1458[this.field1455 & Integer.MAX_VALUE].method2996(var1, var2);
            return true;
        }
    }
}
