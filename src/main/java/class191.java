public class class191 {
   int field6999 = -1;
   int field7000 = -1;
   int[] field7001;
   class671 field7002;
   int field7003;
   public static long field7004;

   class191() {
      this.field7002 = class671.field7470;
      this.field7003 = -1;
   }

   void method3719(InputStream var1, int var2, int var3) {
      try {
         if (1 == var2) {
            this.field7000 = var1.method6374();
         } else if (2 == var2) {
            this.field7001 = new int[var1.method6371()];

            for(int var4 = 0; var4 < this.field7001.length; ++var4) {
               this.field7001[var4] = var1.method6374();
            }
         } else if (3 == var2) {
            this.field6999 = var1.method6371();
         } else if (4 == var2) {
            this.field7002 = (class671)class367.method1565(class295.method6515(-151911925), var1.method6371(), (byte)2);
         } else if (5 == var2) {
            this.field7003 = var1.method6423(1235052657);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "no.f(" + ')');
      }
   }

   void method3720(InputStream var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               if (var2 < 3) {
                  ;
               }

               return;
            }

            this.method3719(var1, var3, 1312976368);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "no.a(" + ')');
      }
   }

   public static class312 method3721(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         class673.field7513.field476 = var0;
         class673.field7513.field475 = var1;
         class673.field7513.field477 = var2;
         class673.field7513.field478 = var3;
         class673.field7513.field7417 = var4;
         return class673.field7513;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "no.b(" + ')');
      }
   }

   static final void method3722(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)55);
         var0.field3161[++var0.field3156 - 1] = var3.field917;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "no.rr(" + ')');
      }
   }

   static final void method3723(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class506 var3 = class395.method3397(var2, 1408826506);
         String var4 = "";
         if (var3 != null && var3.field4123 != null) {
            var4 = var3.field4123;
         }

         var0.field3157[++var0.field3158 - 1] = var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "no.abo(" + ')');
      }
   }

   public static void method3724(int var0, int var1) {
      try {
         class682 var2 = class370.method881(14, (long)var0);
         var2.method4336(-1882192793);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "no.o(" + ')');
      }
   }

   static final void method3725(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)36);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class79.method1156(var3, var4, var0, 924787839);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "no.il(" + ')');
      }
   }
}
