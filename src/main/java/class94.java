import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;
import jagdx.S;

public class class94 implements class920 {
    class927 field563;
    int field564;
    int field565;
    boolean field566;
    class482 field567;
    long field568 = 0L;

    class94(class927 var1, class482 var2, boolean var3) {
        this.field563 = var1;
        this.field567 = var2;
        this.field566 = var3;
        this.field563.method582(this);
    }

    public void method6489(int var1) {
        this.field565 = this.field567.field8406 * var1;
        if (this.field565 > this.field564) {
            if (this.field568 != 0L) {
                IUnknown.Release(this.field568);
            }

            int var2 = 8;
            byte var3;
            if (this.field566) {
                var3 = 0;
                var2 |= 512;
            } else {
                var3 = 1;
            }

            this.field568 = IDirect3DDevice.CreateIndexBuffer(this.field563.field10241, this.field565, var2, this.field567 == class482.field8400 ? 101 : 102, var3);
            this.field564 = this.field565;
        }

    }

    public void method1983() {
        IDirect3DIndexBuffer.Unlock(this.field568);
    }

    public boolean method1977(int var1, int var2, long var3) {
        return S.f(IDirect3DIndexBuffer.Upload(this.field568, var1, var2, this.field566 ? 8192 : 0, var3));
    }

    public void method2755() {
        if (this.field568 != 0L) {
            IUnknown.Release(this.field568);
            this.field568 = 0L;
        }

        this.field564 = 0;
        this.field565 = 0;
        this.field563.method552(this);
    }

    public int method1974() {
        return this.field565;
    }

    public long method1976(int var1, int var2) {
        return IDirect3DIndexBuffer.Lock(this.field568, var1, var2, this.field566 ? 8192 : 0);
    }
}
