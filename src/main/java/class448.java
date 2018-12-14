public class class448 extends class959 {
    byte field7100;
    InputStream field7101;
    int field7102;

    byte[] method2033(short var1) {
        try {
            if (!super.field3464 && this.field7101.field10376 >= this.field7101.field10375.length - this.field7100) {
                return this.field7101.field10375;
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akb.a(" + ')');
        }
    }

    int method2036(int var1) {
        try {
            return this.field7101 == null ? 0 : this.field7101.field10376 * 100 / (this.field7101.field10375.length - this.field7100);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akb.f(" + ')');
        }
    }
}
