import jagdx.IDirect3DDevice;
import jagdx.S;

public class class225 extends class760 {
   boolean field7291;
   class443[] field7292 = new class443[4];
   int field7293;
   int field7294;
   int field7295;
   class927 field7296;
   class334 field7297 = null;
   static int field7298 = 16;

   boolean method3995(long var1) {
      return S.f(IDirect3DDevice.SetDepthStencilSurface(this.field7296.field10241, var1));
   }

   public int method2481() {
      return this.field7293;
   }

   public int method2493() {
      return this.field7294;
   }

   public void method2834(class893 var1) {
      class334 var2 = (class334)var1;
      if (var1 != null) {
         if (this.field7295 != 0) {
            if (this.field7293 != var2.method2343() || this.field7294 != var2.method2344()) {
               throw new RuntimeException();
            }
         } else {
            this.field7294 = var2.method2344();
            this.field7293 = var2.method2343();
            this.method2803();
         }

         this.field7295 |= 16;
         this.field7297 = var2;
         if (this.field7291) {
            this.method3995(var2.method52());
         }
      } else {
         this.field7295 &= -17;
         this.field7297 = null;
         if (this.field7291) {
            this.method3995(0L);
         }

         if (this.field7295 == 0) {
            this.field7294 = 0;
            this.field7293 = 0;
         }
      }

   }

   public void method2839(int var1, class813 var2) {
      int var3 = 1 << var1;
      class443 var4 = (class443)var2;
      if (var2 != null) {
         if (this.field7295 != 0) {
            if (this.field7293 != var4.method2343() || this.field7294 != var4.method2344()) {
               throw new RuntimeException();
            }
         } else {
            this.field7294 = var4.method2344();
            this.field7293 = var4.method2343();
            this.method2803();
         }

         this.field7295 |= var3;
         this.field7292[var1] = var4;
         if (this.field7291) {
            this.method3997(var1, var4.method4342());
         }
      } else {
         this.field7295 &= ~var3;
         this.field7292[var1] = null;
         if (this.field7291) {
            this.method3997(var1, 0L);
         }

         if (this.field7295 == 0) {
            this.field7294 = 0;
            this.field7293 = 0;
         }
      }

   }

   public int method2480() {
      return this.field7294;
   }

   public boolean method2836() {
      return this.field7292[0] != null;
   }

   boolean method2482() {
      for(int var1 = 1; var1 < 4; ++var1) {
         class443 var2 = this.field7292[var1];
         if (var2 != null) {
            this.method3997(var1, 0L);
         }
      }

      if (this.field7297 != null) {
         this.method3995(0L);
      }

      this.field7291 = false;
      return true;
   }

   public void method2488() {
      if (this.field7297 != null) {
         this.field7297.method2755();
      }

      for(int var1 = 0; var1 < this.field7292.length; ++var1) {
         if (this.field7292[var1] != null) {
            this.field7292[var1].method2755();
         }
      }

   }

   void method3996() {
      if (this.field7297 != null) {
         this.field7297.method49();
      }

      for(int var1 = 0; var1 < this.field7292.length; ++var1) {
         if (this.field7292[var1] != null) {
            this.field7292[var1].method4347();
         }
      }

   }

   class225(class927 var1) {
      super(var1);
      this.field7296 = var1;
   }

   public void method2837(int var1, class813 var2) {
      int var3 = 1 << var1;
      class443 var4 = (class443)var2;
      if (var2 != null) {
         if (this.field7295 != 0) {
            if (this.field7293 != var4.method2343() || this.field7294 != var4.method2344()) {
               throw new RuntimeException();
            }
         } else {
            this.field7294 = var4.method2344();
            this.field7293 = var4.method2343();
            this.method2803();
         }

         this.field7295 |= var3;
         this.field7292[var1] = var4;
         if (this.field7291) {
            this.method3997(var1, var4.method4342());
         }
      } else {
         this.field7295 &= ~var3;
         this.field7292[var1] = null;
         if (this.field7291) {
            this.method3997(var1, 0L);
         }

         if (this.field7295 == 0) {
            this.field7294 = 0;
            this.field7293 = 0;
         }
      }

   }

   public void method2840(class893 var1) {
      class334 var2 = (class334)var1;
      if (var1 != null) {
         if (this.field7295 != 0) {
            if (this.field7293 != var2.method2343() || this.field7294 != var2.method2344()) {
               throw new RuntimeException();
            }
         } else {
            this.field7294 = var2.method2344();
            this.field7293 = var2.method2343();
            this.method2803();
         }

         this.field7295 |= 16;
         this.field7297 = var2;
         if (this.field7291) {
            this.method3995(var2.method52());
         }
      } else {
         this.field7295 &= -17;
         this.field7297 = null;
         if (this.field7291) {
            this.method3995(0L);
         }

         if (this.field7295 == 0) {
            this.field7294 = 0;
            this.field7293 = 0;
         }
      }

   }

   public boolean method2833() {
      return this.field7292[0] != null;
   }

   public void method2838(int var1, class813 var2) {
      int var3 = 1 << var1;
      class443 var4 = (class443)var2;
      if (var2 != null) {
         if (this.field7295 != 0) {
            if (this.field7293 != var4.method2343() || this.field7294 != var4.method2344()) {
               throw new RuntimeException();
            }
         } else {
            this.field7294 = var4.method2344();
            this.field7293 = var4.method2343();
            this.method2803();
         }

         this.field7295 |= var3;
         this.field7292[var1] = var4;
         if (this.field7291) {
            this.method3997(var1, var4.method4342());
         }
      } else {
         this.field7295 &= ~var3;
         this.field7292[var1] = null;
         if (this.field7291) {
            this.method3997(var1, 0L);
         }

         if (this.field7295 == 0) {
            this.field7294 = 0;
            this.field7293 = 0;
         }
      }

   }

   public boolean method2841() {
      return this.field7292[0] != null;
   }

   public boolean method2835() {
      return this.field7292[0] != null;
   }

   public void method2487() {
      if (this.field7297 != null) {
         this.field7297.method2755();
      }

      for(int var1 = 0; var1 < this.field7292.length; ++var1) {
         if (this.field7292[var1] != null) {
            this.field7292[var1].method2755();
         }
      }

   }

   public void method2489() {
      if (this.field7297 != null) {
         this.field7297.method2755();
      }

      for(int var1 = 0; var1 < this.field7292.length; ++var1) {
         if (this.field7292[var1] != null) {
            this.field7292[var1].method2755();
         }
      }

   }

   public int method2490() {
      return this.field7293;
   }

   public int method2491() {
      return this.field7293;
   }

   public int method2492() {
      return this.field7293;
   }

   public int method2483() {
      return this.field7293;
   }

   boolean method3997(int var1, long var2) {
      return S.f(IDirect3DDevice.SetRenderTarget(this.field7296.field10241, var1, var2));
   }

   boolean method2486() {
      for(int var1 = 0; var1 < 4; ++var1) {
         class443 var2 = this.field7292[var1];
         if (var2 != null) {
            long var3 = var2.method4342();
            this.method3997(var1, var3);
         }
      }

      if (this.field7297 != null) {
         this.method3995(this.field7297.method52());
      }

      this.field7291 = true;
      return super.method2484();
   }

   boolean method2484() {
      for(int var1 = 0; var1 < 4; ++var1) {
         class443 var2 = this.field7292[var1];
         if (var2 != null) {
            long var3 = var2.method4342();
            this.method3997(var1, var3);
         }
      }

      if (this.field7297 != null) {
         this.method3995(this.field7297.method52());
      }

      this.field7291 = true;
      return super.method2484();
   }

   boolean method2485() {
      for(int var1 = 1; var1 < 4; ++var1) {
         class443 var2 = this.field7292[var1];
         if (var2 != null) {
            this.method3997(var1, 0L);
         }
      }

      if (this.field7297 != null) {
         this.method3995(0L);
      }

      this.field7291 = false;
      return true;
   }
}
