public class class428 {
   class180 field7414;
   class1 field7415 = new class1(128);
   public static class180 field7416;

   public void method4148(int var1) {
      try {
         class1 var2 = this.field7415;
         synchronized(this.field7415) {
            this.field7415.method2977();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sp.f(" + ')');
      }
   }

   public void method4149(int var1, int var2) {
      try {
         class1 var3 = this.field7415;
         synchronized(this.field7415) {
            this.field7415.method2976(var1, -328942985);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sp.b(" + ')');
      }
   }

   public void method4150(int var1) {
      try {
         class1 var2 = this.field7415;
         synchronized(this.field7415) {
            this.field7415.method2979();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sp.p(" + ')');
      }
   }

   public class758 method4151(int var1, byte var2) {
      try {
         class1 var3 = this.field7415;
         class758 var4;
         synchronized(this.field7415) {
            var4 = (class758)this.field7415.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field7414;
            byte[] var10;
            synchronized(this.field7414) {
               var10 = this.field7414.method3285(-1006924897 * class981.field3239.field3271, var1, (byte)-122);
            }

            var4 = new class758();
            if (var10 != null) {
               var4.method2733(new class907(var10), (byte)-31);
            }

            class1 var11 = this.field7415;
            synchronized(this.field7415) {
               this.field7415.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "sp.a(" + ')');
      }
   }

   public class428(class469 var1, class423 var2, class180 var3) {
      this.field7414 = var3;
      this.field7414.method3286(-1006924897 * class981.field3239.field3271, -978414795);
   }

   static final void method4152(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         int var2 = var0.field3161[var0.field3156 * 681479919];
         int var3 = var0.field3161[var0.field3156 * 681479919 + 1];
         class785 var4 = class452.field7216.method5148(var3, 1053350248);
         if (var4.method2380(1883696427)) {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = class936.field10313.method2256(var2, (byte)-26).method3558(var3, var4.field3823, -130818690);
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class936.field10313.method2256(var2, (byte)51).method3562(var3, -388931549 * var4.field3822, 240769181);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sp.abq(" + ')');
      }
   }

   public static void method4153(class946 var0, byte var1) {
      try {
         class206 var2 = (class206)class206.field7083.method2942((long)(1888274983 * var0.field4028));
         if (var2 == null) {
            class160.method3565(var0.field3639, var0.field4085[0], var0.field4055[0], 0, (class50)null, (class60)null, var0, (byte)58);
         } else {
            var2.method3766(-1931224140);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sp.u(" + ')');
      }
   }
}
