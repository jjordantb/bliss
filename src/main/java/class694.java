import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import jagdx.S;

public class class694 extends class641 implements class33 {
   public int method2857() {
      return super.method2845();
   }

   public class813 method3326(int var1) {
      return new class260(this, var1);
   }

   public void method2852(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      long var7 = IDirect3DTexture.GetSurfaceLevel(this.field5084, 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(this.field5087.field10241, var3, var4, 21, 0, 0, true);
      if (S.f(IDirect3DDevice.StretchRect(this.field5087.field10241, var7, var1, var2, var3, var4, var9, 0, 0, var3, var4, 1))) {
         IDirect3DSurface.Download(var9, 0, 0, var3, var4, var3 * 4, 16, this.field5087.field661);
         this.field5087.field660.clear();
         this.field5087.field660.asIntBuffer().get(var5);
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

   public void method5704(class566 var1) {
      super.method5694(var1);
   }

   public float method2847(float var1) {
      return super.method2847(var1);
   }

   public boolean method2848() {
      return super.method2848();
   }

   public class813 method3330(int var1) {
      return new class260(this, var1);
   }

   public void method2850(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      super.method2850(var1, var2, var3, var4, var5, var6, var7);
   }

   public int method2855() {
      return super.method2861();
   }

   public void method2870(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
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

   public void method2876(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      long var7 = IDirect3DTexture.GetSurfaceLevel(this.field5084, 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(this.field5087.field10241, var3, var4, 21, 0, 0, true);
      if (S.f(IDirect3DDevice.StretchRect(this.field5087.field10241, var7, var1, var2, var3, var4, var9, 0, 0, var3, var4, 1))) {
         IDirect3DSurface.Download(var9, 0, 0, var3, var4, var3 * 4, 16, this.field5087.field661);
         this.field5087.field660.clear();
         this.field5087.field660.asIntBuffer().get(var5);
      }

      IUnknown.Release(var7);
      IUnknown.Release(var9);
   }

   public void method5698() {
      super.method5693();
   }

   public void method2875(boolean var1, boolean var2) {
      super.method2849(var1, var2);
   }

   public int method2844() {
      return super.method2845();
   }

   public float method2846(float var1) {
      return super.method2846(var1);
   }

   public void method5695() {
      super.method5703();
   }

   public float method2858(float var1) {
      return super.method2846(var1);
   }

   public float method2859(float var1) {
      return super.method2846(var1);
   }

   public class813 method3327(int var1) {
      return new class260(this, var1);
   }

   public void method5696() {
      super.method5693();
   }

   public float method2878(float var1) {
      return super.method2847(var1);
   }

   public float method2863(float var1) {
      return super.method2847(var1);
   }

   public float method2864(float var1) {
      return super.method2847(var1);
   }

   public void method2865(boolean var1, boolean var2) {
      super.method2849(var1, var2);
   }

   public void method2866(boolean var1, boolean var2) {
      super.method2849(var1, var2);
   }

   public void method2867(boolean var1, boolean var2) {
      super.method2849(var1, var2);
   }

   public boolean method2872() {
      return super.method2872();
   }

   public void method2868(boolean var1, boolean var2) {
      super.method2849(var1, var2);
   }

   public void method2849(boolean var1, boolean var2) {
      super.method2849(var1, var2);
   }

   public void method2871(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      super.method2850(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method5699() {
      super.method5703();
   }

   public void method2873(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      super.method2851(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public class813 method3328(int var1) {
      return new class260(this, var1);
   }

   public void method2862(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      long var7 = IDirect3DTexture.GetSurfaceLevel(this.field5084, 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(this.field5087.field10241, var3, var4, 21, 0, 0, true);
      if (S.f(IDirect3DDevice.StretchRect(this.field5087.field10241, var7, var1, var2, var3, var4, var9, 0, 0, var3, var4, 1))) {
         IDirect3DSurface.Download(var9, 0, 0, var3, var4, var3 * 4, 16, this.field5087.field661);
         this.field5087.field660.clear();
         this.field5087.field660.asIntBuffer().get(var5);
      }

      IUnknown.Release(var7);
      IUnknown.Release(var9);
   }

   public void method5701() {
      super.method5693();
   }

   public boolean method2877() {
      return super.method2872();
   }

   public boolean method2880() {
      return super.method2872();
   }

   public int method2853() {
      return super.method2845();
   }

   public void method5700() {
      super.method5703();
   }

   public float method2860(float var1) {
      return super.method2846(var1);
   }

   public void method5702(class566 var1) {
      super.method5694(var1);
   }

   public void method5697(class566 var1) {
      super.method5694(var1);
   }

   public void method2856(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      super.method2851(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public class813 method3329(int var1) {
      return new class260(this, var1);
   }

   public boolean method2854() {
      return super.method2848();
   }

   public void method2869(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      super.method2851(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   class694(class927 var1, class264 var2, class482 var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5, 1025, 0);
   }

   public boolean method2879() {
      return super.method2848();
   }

   public float method2874(float var1) {
      return super.method2847(var1);
   }
}
