import jaggl.OpenGL;

public class class275 extends class806 {
   int field10591;
   class430[] field10592 = new class430[4];
   static int field10593 = 16;
   int field10594;
   class13 field10595;
   int field10596;
   int field10597;
   class430 field10598;
   int field10599;

   public int method2483() {
      return this.field10594;
   }

   public int method2481() {
      return this.field10594;
   }

   public int method2493() {
      return this.field10599;
   }

   public void method2839(int var1, class813 var2) {
      int var3 = 1 << var1;
      class430 var4 = (class430)var2;
      if (var2 == null) {
         this.field10596 &= ~var3;
         this.field10592[var1] = null;
         if (this.field10596 == 0) {
            this.field10599 = 0;
            this.field10594 = 0;
         }
      } else {
         if ((this.field10596 | var3) != var3) {
            if (this.field10594 != var4.method2343() || this.field10599 != var4.method2344()) {
               throw new RuntimeException();
            }
         } else {
            this.field10599 = var4.method2344();
            this.field10594 = var4.method2343();
            if (this == this.field10595.method4800((short)-4129)) {
               this.field10595.method3640();
            }
         }

         this.field10596 |= var3;
         this.field10592[var1] = var4;
      }

      if (this == this.field10595.method4800((short)-22905)) {
         this.method6621(var1);
      } else {
         this.field10597 |= var3;
      }

   }

   public void method2834(class893 var1) {
      class430 var2 = (class430)var1;
      if (var1 == null) {
         this.field10596 &= -17;
         this.field10598 = null;
         if (this.field10596 == 0) {
            this.field10599 = 0;
            this.field10594 = 0;
         }
      } else {
         if ((this.field10596 | 16) != 16) {
            if (this.field10594 != var2.method2343() || this.field10599 != var2.method2344()) {
               throw new RuntimeException();
            }
         } else {
            this.field10599 = var2.method2344();
            this.field10594 = var2.method2343();
            if (this == this.field10595.method4800((short)-7371)) {
               this.field10595.method3640();
            }
         }

         this.field10596 |= 16;
         this.field10598 = var2;
      }

      if (this == this.field10595.method4800((short)16488)) {
         this.method6623();
      } else {
         this.field10597 |= 16;
      }

   }

   void method6621(int var1) {
      class430 var2 = this.field10592[var1];
      if (var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT(36160, '賠' + var1, 36161, 0);
      } else {
         var2.method4232('賠' + var1);
      }

   }

   public void method2488() {
      if (this.field10591 != 0) {
         this.field10595.method3632(this.field10591);
         this.field10591 = 0;
      }

   }

   public boolean method2836() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
      return var1 == 36053;
   }

   boolean method2484() {
      OpenGL.glBindFramebufferEXT(36160, this.field10591);

      for(int var1 = 0; var1 < 4; ++var1) {
         if ((this.field10597 & 1 << var1) != 0) {
            this.method6621(var1);
         }
      }

      if ((this.field10597 & 16) != 0) {
         this.method6623();
      }

      this.field10597 = 0;
      this.field10595.method3608();
      return true;
   }

   boolean method2482() {
      OpenGL.glBindFramebufferEXT(36160, 0);
      return true;
   }

   void method6622(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if (var7 | var8) {
         int var9 = this.field10599;
         int var10 = this.field10595.method4800((short)-16350).method2493();
         int var11 = 0;
         if (var8) {
            var11 |= 256;
         }

         if (var7) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT(36008, this.field10591);
         OpenGL.glBlitFramebufferEXT(var1, var9 - var2 - var4, var1 + var3, var9 - var2, var5, var10 - var6 - var4, var5 + var3, var10 - var6, var11, 9728);
         OpenGL.glBindFramebufferEXT(36008, 0);
      }

   }

   boolean method2486() {
      OpenGL.glBindFramebufferEXT(36160, this.field10591);

      for(int var1 = 0; var1 < 4; ++var1) {
         if ((this.field10597 & 1 << var1) != 0) {
            this.method6621(var1);
         }
      }

      if ((this.field10597 & 16) != 0) {
         this.method6623();
      }

      this.field10597 = 0;
      this.field10595.method3608();
      return true;
   }

   public int method2492() {
      return this.field10594;
   }

   public void method2837(int var1, class813 var2) {
      int var3 = 1 << var1;
      class430 var4 = (class430)var2;
      if (var2 == null) {
         this.field10596 &= ~var3;
         this.field10592[var1] = null;
         if (this.field10596 == 0) {
            this.field10599 = 0;
            this.field10594 = 0;
         }
      } else {
         if ((this.field10596 | var3) != var3) {
            if (this.field10594 != var4.method2343() || this.field10599 != var4.method2344()) {
               throw new RuntimeException();
            }
         } else {
            this.field10599 = var4.method2344();
            this.field10594 = var4.method2343();
            if (this == this.field10595.method4800((short)3587)) {
               this.field10595.method3640();
            }
         }

         this.field10596 |= var3;
         this.field10592[var1] = var4;
      }

      if (this == this.field10595.method4800((short)8575)) {
         this.method6621(var1);
      } else {
         this.field10597 |= var3;
      }

   }

   public void method2838(int var1, class813 var2) {
      int var3 = 1 << var1;
      class430 var4 = (class430)var2;
      if (var2 == null) {
         this.field10596 &= ~var3;
         this.field10592[var1] = null;
         if (this.field10596 == 0) {
            this.field10599 = 0;
            this.field10594 = 0;
         }
      } else {
         if ((this.field10596 | var3) != var3) {
            if (this.field10594 != var4.method2343() || this.field10599 != var4.method2344()) {
               throw new RuntimeException();
            }
         } else {
            this.field10599 = var4.method2344();
            this.field10594 = var4.method2343();
            if (this == this.field10595.method4800((short)26777)) {
               this.field10595.method3640();
            }
         }

         this.field10596 |= var3;
         this.field10592[var1] = var4;
      }

      if (this == this.field10595.method4800((short)-1151)) {
         this.method6621(var1);
      } else {
         this.field10597 |= var3;
      }

   }

   public void method2840(class893 var1) {
      class430 var2 = (class430)var1;
      if (var1 == null) {
         this.field10596 &= -17;
         this.field10598 = null;
         if (this.field10596 == 0) {
            this.field10599 = 0;
            this.field10594 = 0;
         }
      } else {
         if ((this.field10596 | 16) != 16) {
            if (this.field10594 != var2.method2343() || this.field10599 != var2.method2344()) {
               throw new RuntimeException();
            }
         } else {
            this.field10599 = var2.method2344();
            this.field10594 = var2.method2343();
            if (this == this.field10595.method4800((short)-16571)) {
               this.field10595.method3640();
            }
         }

         this.field10596 |= 16;
         this.field10598 = var2;
      }

      if (this == this.field10595.method4800((short)11041)) {
         this.method6623();
      } else {
         this.field10597 |= 16;
      }

   }

   public boolean method2833() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
      return var1 == 36053;
   }

   public boolean method2841() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
      return var1 == 36053;
   }

   public int method2491() {
      return this.field10594;
   }

   boolean method2485() {
      OpenGL.glBindFramebufferEXT(36160, 0);
      return true;
   }

   void method6623() {
      if (this.field10598 == null) {
         OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
      } else {
         this.field10598.method4232(36096);
      }

   }

   public void method2489() {
      if (this.field10591 != 0) {
         this.field10595.method3632(this.field10591);
         this.field10591 = 0;
      }

   }

   public int method2490() {
      return this.field10594;
   }

   public void method2487() {
      if (this.field10591 != 0) {
         this.field10595.method3632(this.field10591);
         this.field10591 = 0;
      }

   }

   public boolean method2835() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
      return var1 == 36053;
   }

   void method6624(int var1) {
      OpenGL.glDrawBuffer('賠' + var1);
   }

   public int method2480() {
      return this.field10599;
   }

   class275(class13 var1) {
      if (!var1.field6857) {
         throw new IllegalStateException("");
      } else {
         this.field10595 = var1;
         int[] var2 = new int[1];
         OpenGL.glGenFramebuffersEXT(1, var2, 0);
         this.field10591 = var2[0];
      }
   }
}
