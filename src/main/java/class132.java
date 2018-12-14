public final class class132 extends class223 {
    class927 field1178;
    class186 field1179;
    boolean field1180;

    class132(class927 var1, class222 var2) {
        super(var1, var2);
        this.field1178 = var1;
        this.field1180 = false;
    }

    public boolean method4100() {
        return this.field1178.field10254 == this.field1179;
    }

    class184 method4052(class325 var1, class220 var2) {
        return new class186((class927) var1, this, var2);
    }

    public boolean method4057(class184 var1) {
        if (this.field1179 == var1) {
            return true;
        } else if (!var1.method3237()) {
            return false;
        } else {
            this.field1179 = (class186) var1;
            super.field7369 = this.method4055(var1, -180449856);
            if (super.field7369 == -1) {
                throw new IllegalArgumentException();
            } else {
                if (this.field1180) {
                    this.field1178.method6209(this.field1179.field5259);
                    this.field1178.method6232(this.field1179.field5254);
                    this.field1178.field10254 = this.field1179;
                }

                return true;
            }
        }
    }

    public void method4066() {
        if (this.field1179 == null) {
            throw new class845();
        } else {
            this.field1178.method6209(this.field1179.field5259);
            this.field1178.method6232(this.field1179.field5254);
            this.field1178.field10254 = this.field1179;
            this.field1180 = true;
        }
    }

    public void method4098() {
        this.field1178.method6209(0L);
        this.field1178.method6232(0L);
        this.field1180 = false;
        this.field1178.field10254 = null;
        this.field1178.method616(1);
        this.field1178.method617((class659) null);
        this.field1178.method616(0);
        this.field1178.method617((class659) null);
    }

    class655 method4093(class151 var1) {
        return new class266(this, var1);
    }
}
