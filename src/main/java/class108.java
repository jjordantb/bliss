import java.io.IOException;
import java.net.Socket;

public class class108 extends class348 {
    Socket field1560;
    class735 field1561;
    class209 field1562;

    class108(Socket var1, int var2) throws IOException {
        this.field1560 = var1;
        this.field1560.setSoTimeout(30000);
        this.field1560.setTcpNoDelay(true);
        this.field1561 = new class735(this.field1560.getInputStream(), var2);
        this.field1562 = new class209(this.field1560.getOutputStream(), var2);
    }

    static final void method1199(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acl.uv(" + ')');
        }
    }

    public boolean method175(int var1, byte var2) throws IOException {
        try {
            return this.field1561.method1799(var1, 1797469509);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acl.f(" + ')');
        }
    }

    public int method176(int var1) throws IOException {
        try {
            return this.field1561.method1800((byte) 19);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acl.b(" + ')');
        }
    }

    public int method177(byte[] var1, int var2, int var3, byte var4) throws IOException {
        try {
            return this.field1561.method1802(var1, var2, var3, (byte) 54);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "acl.p(" + ')');
        }
    }

    public void method187(byte[] var1, int var2, int var3, int var4) throws IOException {
        try {
            this.field1562.method3767(var1, var2, var3, -2010830691);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "acl.i(" + ')');
        }
    }

    public void method179(int var1) {
        try {
            this.field1562.method3770(678482839);

            try {
                this.field1560.close();
            } catch (IOException var3) {
                ;
            }

            this.field1561.method1801(2033353307);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acl.k(" + ')');
        }
    }

    public void method186(byte var1) {
        try {
            this.field1561.method1798(-867525250);
            this.field1562.method3769((byte) 103);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acl.d(" + ')');
        }
    }

    protected void finalize() {
        try {
            this.method179(-2126133391);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "acl.finalize(" + ')');
        }
    }
}
