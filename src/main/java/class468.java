import jagdx.B;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;
import jagdx.S;
import java.awt.Canvas;

public class class468 extends class883 implements class319 {
   boolean field7335 = false;
   Canvas field7336;
   long field7337;
   class927 field7338;
   boolean field7339 = false;
   int field7340;
   int field7341;
   long field7342;
   long field7343;
   B field7344;

   void method2518(int var1, int var2) {
      this.method2488();
      this.field7340 = var1;
      this.field7341 = var2;
      if (this.field7335) {
         this.field7338.method6205();
      }

      this.method482();
      super.method2518(var1, var2);
   }

   public void method482() {
      this.method2488();
      this.field7344 = new B(this.field7336);
      this.field7344.A = true;
      this.field7344.B = 1;
      this.field7344.I = this.field7340;
      this.field7344.Z = this.field7341;
      if (this.field7335) {
         this.field7337 = IDirect3DDevice.GetSwapChain(this.field7338.field10241, 0);
         this.field7343 = IDirect3DSwapChain.GetBackBuffer(this.field7337, 0, 0);
         this.field7342 = IDirect3DDevice.GetDepthStencilSurface(this.field7338.field10241);
      } else {
         if (!class927.method6217(this.field7338.field10238, this.field7338.field10265, this.field7338.field10246, this.field7338.field785, this.field7344)) {
            throw new RuntimeException();
         }

         int var1 = this.field7344.G;
         this.field7337 = IDirect3DDevice.CreateAdditionalSwapChain(this.field7338.field10241, this.field7344);
         this.field7343 = IDirect3DSwapChain.GetBackBuffer(this.field7337, 0, 0);
         this.field7342 = IDirect3DDevice.CreateDepthStencilSurface(this.field7338.field10241, this.field7340, this.field7341, var1, this.field7344.D, this.field7344.F, false);
      }

      if (this.field7339) {
         this.method2484();
      }

   }

    @Override
    public boolean method483() {
        return false;
    }

    @Override
    public void method484() {

    }

    @Override
    public boolean method485() {
        return false;
    }

    @Override
    public void method486() {

    }

    @Override
    public void method487() {

    }

    public int method2480() {
      return this.field7341;
   }

   public int method2493() {
      return this.field7341;
   }

   public int method2517(int var1, int var2) {
      return IDirect3DSwapChain.Present(this.field7337, 0);
   }

   public int method2516() {
      return IDirect3DSwapChain.Present(this.field7337, 0);
   }

   void method4028() {
      if (this.field7343 != 0L) {
         IUnknown.Release(this.field7343);
         this.field7343 = 0L;
      }

      if (this.field7342 != 0L) {
         IUnknown.Release(this.field7342);
         this.field7342 = 0L;
      }

      if (this.field7337 != 0L) {
         IUnknown.Release(this.field7337);
         this.field7337 = 0L;
      }

      this.field7338.method6231(this);
   }

   public int method2481() {
      return this.field7340;
   }

   class468(class927 var1, Canvas var2, int var3, int var4, boolean var5) {
      super(var1);
      this.field7336 = var2;
      this.field7338 = var1;
      this.field7340 = var3;
      this.field7341 = var4;
      this.field7335 = var5;
      this.method482();
      this.field7338.method6208(this);
   }

   public boolean method2484() {
      this.field7339 = true;
      if (S.a(IDirect3DDevice.SetRenderTarget(this.field7338.field10241, 0, this.field7343))) {
         return false;
      } else {
         return S.a(IDirect3DDevice.SetDepthStencilSurface(this.field7338.field10241, this.field7342)) ? false : super.method2484();
      }
   }

   public void method2489() {
      if (this.field7343 != 0L) {
         IUnknown.Release(this.field7343);
         this.field7343 = 0L;
      }

      if (this.field7342 != 0L) {
         IUnknown.Release(this.field7342);
         this.field7342 = 0L;
      }

      if (this.field7337 != 0L) {
         IUnknown.Release(this.field7337);
         this.field7337 = 0L;
      }

      this.field7338.method6231(this);
   }

   public boolean method2486() {
      this.field7339 = true;
      if (S.a(IDirect3DDevice.SetRenderTarget(this.field7338.field10241, 0, this.field7343))) {
         return false;
      } else {
         return S.a(IDirect3DDevice.SetDepthStencilSurface(this.field7338.field10241, this.field7342)) ? false : super.method2484();
      }
   }

   boolean method2485() {
      this.field7339 = false;
      return S.f(IDirect3DDevice.SetDepthStencilSurface(this.field7338.field10241, 0L));
   }

   boolean method2482() {
      this.field7339 = false;
      return S.f(IDirect3DDevice.SetDepthStencilSurface(this.field7338.field10241, 0L));
   }

   public int method2483() {
      return this.field7340;
   }

   void method2519(int var1, int var2) {
      this.method2488();
      this.field7340 = var1;
      this.field7341 = var2;
      if (this.field7335) {
         this.field7338.method6205();
      }

      this.method482();
      super.method2518(var1, var2);
   }

   public void method2488() {
      if (this.field7343 != 0L) {
         IUnknown.Release(this.field7343);
         this.field7343 = 0L;
      }

      if (this.field7342 != 0L) {
         IUnknown.Release(this.field7342);
         this.field7342 = 0L;
      }

      if (this.field7337 != 0L) {
         IUnknown.Release(this.field7337);
         this.field7337 = 0L;
      }

      this.field7338.method6231(this);
   }

   public int method2491() {
      return this.field7340;
   }

   public int method2492() {
      return this.field7340;
   }

   public void method2487() {
      if (this.field7343 != 0L) {
         IUnknown.Release(this.field7343);
         this.field7343 = 0L;
      }

      if (this.field7342 != 0L) {
         IUnknown.Release(this.field7342);
         this.field7342 = 0L;
      }

      if (this.field7337 != 0L) {
         IUnknown.Release(this.field7337);
         this.field7337 = 0L;
      }

      this.field7338.method6231(this);
   }

   public int method2515() {
      return IDirect3DSwapChain.Present(this.field7337, 0);
   }

   public int method2520(int var1, int var2) {
      return IDirect3DSwapChain.Present(this.field7337, 0);
   }

   public int method2521(int var1, int var2) {
      return IDirect3DSwapChain.Present(this.field7337, 0);
   }

   public int method2522(int var1, int var2) {
      return IDirect3DSwapChain.Present(this.field7337, 0);
   }

   public int method2523(int var1, int var2) {
      return IDirect3DSwapChain.Present(this.field7337, 0);
   }

   public int method2490() {
      return this.field7340;
   }

   public void method488() {
      this.method2488();
      this.field7344 = new B(this.field7336);
      this.field7344.A = true;
      this.field7344.B = 1;
      this.field7344.I = this.field7340;
      this.field7344.Z = this.field7341;
      if (this.field7335) {
         this.field7337 = IDirect3DDevice.GetSwapChain(this.field7338.field10241, 0);
         this.field7343 = IDirect3DSwapChain.GetBackBuffer(this.field7337, 0, 0);
         this.field7342 = IDirect3DDevice.GetDepthStencilSurface(this.field7338.field10241);
      } else {
         if (!class927.method6217(this.field7338.field10238, this.field7338.field10265, this.field7338.field10246, this.field7338.field785, this.field7344)) {
            throw new RuntimeException();
         }

         int var1 = this.field7344.G;
         this.field7337 = IDirect3DDevice.CreateAdditionalSwapChain(this.field7338.field10241, this.field7344);
         this.field7343 = IDirect3DSwapChain.GetBackBuffer(this.field7337, 0, 0);
         this.field7342 = IDirect3DDevice.CreateDepthStencilSurface(this.field7338.field10241, this.field7340, this.field7341, var1, this.field7344.D, this.field7344.F, false);
      }

      if (this.field7339) {
         this.method2484();
      }

   }

   public void method489() {
      this.method2488();
      this.field7344 = new B(this.field7336);
      this.field7344.A = true;
      this.field7344.B = 1;
      this.field7344.I = this.field7340;
      this.field7344.Z = this.field7341;
      if (this.field7335) {
         this.field7337 = IDirect3DDevice.GetSwapChain(this.field7338.field10241, 0);
         this.field7343 = IDirect3DSwapChain.GetBackBuffer(this.field7337, 0, 0);
         this.field7342 = IDirect3DDevice.GetDepthStencilSurface(this.field7338.field10241);
      } else {
         if (!class927.method6217(this.field7338.field10238, this.field7338.field10265, this.field7338.field10246, this.field7338.field785, this.field7344)) {
            throw new RuntimeException();
         }

         int var1 = this.field7344.G;
         this.field7337 = IDirect3DDevice.CreateAdditionalSwapChain(this.field7338.field10241, this.field7344);
         this.field7343 = IDirect3DSwapChain.GetBackBuffer(this.field7337, 0, 0);
         this.field7342 = IDirect3DDevice.CreateDepthStencilSurface(this.field7338.field10241, this.field7340, this.field7341, var1, this.field7344.D, this.field7344.F, false);
      }

      if (this.field7339) {
         this.method2484();
      }

   }
}
