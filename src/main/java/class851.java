public class class851 {
   class180 field8729;
   class1 field8730 = new class1(64);
   public static class509 field8731;

   public void method5145(int var1) {
      try {
         class1 var2 = this.field8730;
         synchronized(this.field8730) {
            this.field8730.method2979();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "uv.p(" + ')');
      }
   }

   public class851(class469 var1, class423 var2, class180 var3) {
      this.field8729 = var3;
      if (this.field8729 != null) {
         this.field8729.method3286(class981.field3227.field3271 * -1006924897, 1020653544);
      }

   }

   public void method5146(int var1, byte var2) {
      try {
         class1 var3 = this.field8730;
         synchronized(this.field8730) {
            this.field8730.method2976(var1, -2004411058);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uv.b(" + ')');
      }
   }

   public void method5147(int var1) {
      try {
         class1 var2 = this.field8730;
         synchronized(this.field8730) {
            this.field8730.method2977();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "uv.f(" + ')');
      }
   }

   public class785 method5148(int var1, int var2) {
      try {
         class1 var3 = this.field8730;
         class785 var4;
         synchronized(this.field8730) {
            var4 = (class785)this.field8730.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field8729;
            byte[] var10;
            synchronized(this.field8729) {
               var10 = this.field8729.method3285(-1006924897 * class981.field3227.field3271, var1, (byte)-62);
            }

            var4 = new class785();
            if (var10 != null) {
               var4.method2378(new class907(var10), -1070488617);
            }

            class1 var11 = this.field8730;
            synchronized(this.field8730) {
               this.field8730.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "uv.a(" + ')');
      }
   }

   static final void method5149(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[(var0.field3158 -= 969361751) * -203050393];
         boolean var3 = var0.field3161[(var0.field3156 -= -391880689) * 681479919] == 1;
         class716.method2047(var2, var3, 729356820);
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class198.field7051 * 367592105;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "uv.adv(" + ')');
      }
   }
}
