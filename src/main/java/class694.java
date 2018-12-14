import jagdx.*;
import jagdx.S;

public class class694 extends class641 implements class33 {
    class694(class927 var1, class264 var2, class482 var3, int var4, int var5) {
        super(var1, var2, var3, var4, var5, 1025, 0);
    }

    public class813 method3326(int var1) {
        return new class260(this, var1);
    }

    public void method2852(int var1, int var2, int var3, int var4, int[] var5, int var6) {
        long var7 = IDirect3DTexture.GetSurfaceLevel(super.field5084, 0);
        long var9 = IDirect3DDevice.CreateRenderTarget(super.field5087.field10241, var3, var4, 21, 0, 0, true);
        if (S.f(IDirect3DDevice.StretchRect(super.field5087.field10241, var7, var1, var2, var3, var4, var9, 0, 0, var3, var4, 1))) {
            IDirect3DSurface.Download(var9, 0, 0, var3, var4, var3 * 4, 16, super.field5087.field661);
            super.field5087.field660.clear();
            super.field5087.field660.asIntBuffer().get(var5);
        }

        IUnknown.Release(var7);
        IUnknown.Release(var9);
    }

    public int method2861() {
        return super.method2861();
    }

    public int method2845() {
        return super.method2845();
    }

    public float method2847(float var1) {
        return super.method2847(var1);
    }

    public boolean method2848() {
        return super.method2848();
    }

    public void method2850(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
        super.method2850(var1, var2, var3, var4, var5, var6, var7);
    }

    public void method5703() {
        super.method5703();
    }

    public void method5694(class566 var1) {
        super.method5694(var1);
    }

    public void method5693() {
        super.method5693();
    }

    public void method2851(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
        super.method2851(var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public float method2846(float var1) {
        return super.method2846(var1);
    }

    public boolean method2872() {
        return super.method2872();
    }

    public void method2849(boolean var1, boolean var2) {
        super.method2849(var1, var2);
    }
}
