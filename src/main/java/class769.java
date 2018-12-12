public class class769 {
   class180 field3691;
   public static int field3692;
   class1 field3693 = new class1(100);
   class1 field3694 = new class1(64);

   public class531 method2253(int var1, int var2) {
      try {
         class1 var3 = this.field3693;
         class531 var4;
         synchronized(this.field3693) {
            var4 = (class531)this.field3693.method2974((long)var1);
            if (var4 == null) {
               var4 = new class531(var1);
               this.field3693.method2984(var4, (long)var1);
            }

            if (!var4.method2307((byte)45)) {
               Object var5 = null;
               return (class531)var5;
            }
         }

         return var4;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "qj.f(" + ')');
      }
   }

   public void method2254(int var1) {
      try {
         class1 var2 = this.field3694;
         synchronized(this.field3694) {
            this.field3694.method2977();
         }

         var2 = this.field3693;
         synchronized(this.field3693) {
            this.field3693.method2977();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qj.b(" + ')');
      }
   }

   public void method2255(int var1) {
      try {
         class1 var2 = this.field3694;
         synchronized(this.field3694) {
            this.field3694.method2979();
         }

         var2 = this.field3693;
         synchronized(this.field3693) {
            this.field3693.method2979();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qj.i(" + ')');
      }
   }

   public class769(class469 var1, class423 var2, class180 var3, class180 var4, class180 var5) {
      this.field3691 = var3;
      if (this.field3691 != null) {
         int var6 = this.field3691.method3266(1196471561) - 1;
         class981.field3220.method1926((short)21776);
         this.field3691.method3286(var6, -1829120689);
      }

      class924.method6257(var4, var5, 2, (byte)2);
   }

   public class160 method2256(int var1, byte var2) {
      try {
         class1 var3 = this.field3694;
         class160 var4;
         synchronized(this.field3694) {
            var4 = (class160)this.field3694.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field3691;
            byte[] var10;
            synchronized(this.field3691) {
               var10 = this.field3691.method3285(class981.field3220.method1927(var1, 180156567), class981.field3220.method1925(var1, -1217474734), (byte)-6);
            }

            var4 = new class160();
            var4.field6655 = var1 * -523719415;
            var4.field6654 = this;
            if (var10 != null) {
               var4.method3563(new class907(var10), -795902444);
            }

            var4.method3560((byte)-46);
            class1 var11 = this.field3694;
            synchronized(this.field3694) {
               this.field3694.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "qj.a(" + ')');
      }
   }

   public void method2257(int var1, byte var2) {
      try {
         class1 var3 = this.field3694;
         synchronized(this.field3694) {
            this.field3694.method2976(var1, -208985286);
         }

         var3 = this.field3693;
         synchronized(this.field3693) {
            this.field3693.method2976(var1, -1704294236);
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "qj.p(" + ')');
      }
   }

   static final void method2258(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         int var2 = var0.field3161[var0.field3156 * 681479919];
         int var3 = var0.field3161[1 + 681479919 * var0.field3156];
         class785 var4 = class452.field7216.method5148(var3, -1755093541);
         if (var4.method2380(1883696427)) {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = class85.field1121.method1566(var2).method2687(var3, var4.field3823, (short)26472);
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class85.field1121.method1566(var2).method2683(var3, var4.field3822 * -388931549, -2143571113);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qj.aat(" + ')');
      }
   }

   static final void method2259(class744 var0, int var1) {
      try {
         var0.field3156 -= -1175642067;
         int var2 = var0.field3161[var0.field3156 * 681479919];
         int var3 = var0.field3161[1 + var0.field3156 * 681479919];
         int var4 = var0.field3161[var0.field3156 * 681479919 + 2];
         class740.method1920(10, var2 << 16 | var3, var4, "", -1433549098);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qj.alu(" + ')');
      }
   }

   static boolean method2260(int var0, byte var1) {
      try {
         if (var0 != 3 && 4 != var0 && 5 != var0 && 6 != var0 && var0 != 1001 && 1002 != var0) {
            return 2 == var0;
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qj.bu(" + ')');
      }
   }
}
