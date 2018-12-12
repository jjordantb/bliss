public class class398 {
   static class398 field6584;
   public Animable field6585;
   public class398 field6586;
   static int field6587 = 0;

   void method3537(byte var1) {
      try {
         if (field6587 < 500) {
            this.field6585 = null;
            this.field6586 = field6584;
            field6584 = this;
            ++field6587;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nk.f(" + ')');
      }
   }

   static final void method3538(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (class730.field2785 != null && var2 < class556.field503) {
            var0.field3157[++var0.field3158 - 1] = class776.field3731[var2].field8118;
         } else {
            var0.field3157[++var0.field3158 - 1] = "";
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nk.wv(" + ')');
      }
   }

   public static class230 method3539(class180 var0, int var1, int var2, byte var3) {
      try {
         byte[] var4 = var0.method3285(var1, var2, (byte)-42);
         return var4 == null ? null : new class230(var4);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nk.a(" + ')');
      }
   }

   static final void method3540(long var0) {
      try {
         if (class730.field2697.method5317(-1611682495) != null) {
            if (4 != class563.field1083 && 5 != class563.field1083) {
               if (class563.field1083 == 2) {
                  class744.method1903(var0);
               }
            } else {
               class812.method2914(var0);
            }
         }

         class76.method1109(class593.field1623, (long)class730.field2866);
         if (-1 != class730.field2822) {
            class758.method2735(class730.field2822, -333860368);
         }

         int var2;
         for(var2 = 0; var2 < class730.field2667; ++var2) {
            class730.field2883[var2] = class730.field2882[var2];
            class730.field2882[var2] = false;
         }

         class730.field2814 = class730.field2866;
         class347.method210(-1, -1, (byte)-69);
         if (class730.field2822 != -1) {
            class730.field2667 = 0;
            class154.method3488(1847385357);
         }

         class593.field1623.method4827();
         class972.method1777(class593.field1623, (byte)38);
         var2 = class915.method6441(695848123);
         if (-1 == var2) {
            var2 = class730.field2919;
         }

         if (var2 == -1) {
            var2 = class730.field2813;
         }

         class779.method2323(var2, 614001892);
         int var3 = class923.local.method2550() << 8;
         class32 var4 = class923.local.method1511().field7637;
         class389.method1154(class923.local.field3639, var3 + (int)var4.field5296, (int)var4.field5299 + var3, class730.field2943, (short)8192);
         class730.field2943 = 0;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nk.ia(" + ')');
      }
   }

   static InputStream method3541(int var0) {
      try {
         InputStream var1 = new InputStream(518);
         class881.field10161 = new int[4];
         class881.field10161[0] = (int)(Math.random() * 9.9999999E7D);
         class881.field10161[1] = (int)(Math.random() * 9.9999999E7D);
         class881.field10161[2] = (int)(Math.random() * 9.9999999E7D);
         class881.field10161[3] = (int)(Math.random() * 9.9999999E7D);
         var1.method6361(10);
         var1.method6364(class881.field10161[0], -805516494);
         var1.method6364(class881.field10161[1], -2077289504);
         var1.method6364(class881.field10161[2], 699745273);
         var1.method6364(class881.field10161[3], -753217368);
         return var1;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "nk.m(" + ')');
      }
   }
}
