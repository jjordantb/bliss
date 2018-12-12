public class class279 {
   class945 field10585;
   public int field10586;
   public int field10587;
   public boolean field10588 = false;

   void method6609(InputStream var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.method6612(var1, var3, 227910133);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ul.a(" + ')');
      }
   }

   public boolean method6610(byte var1) {
      try {
         return this.field10585.field3426.method3280(this.field10587, -457216440);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ul.p(" + ')');
      }
   }

   public class48 method6611(class848 var1, int var2, boolean var3, byte var4) {
      try {
         long var5 = (long)(this.field10587 | var2 << 16 | (var3 ? 262144 : 0) | var1.field8580 << 19);
         class48 var7 = (class48)this.field10585.field3423.method2974(var5);
         if (var7 != null) {
            return var7;
         } else if (!this.field10585.field3426.method3280(this.field10587, -457216440)) {
            return null;
         } else {
            class922 var8 = class922.method6242(this.field10585.field3426, this.field10587, 0);
            if (var8 != null) {
               var8.field10268 = 0;
               var8.field10271 = 0;
               var8.field10272 = 0;
               var8.field10270 = 0;
               if (var3) {
                  var8.method6235();
               }

               for(int var12 = 0; var12 < var2; ++var12) {
                  var8.method6244();
               }
            }

            var7 = var1.method4982(var8, true);
            if (var7 != null) {
               this.field10585.field3423.method2984(var7, var5);
            }

            return var7;
         }
      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "ul.b(" + ')');
      }
   }

   void method6612(InputStream var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            this.field10587 = var1.method6423(1235052657);
         } else if (2 == var2) {
            this.field10586 = var1.method6390((byte)1);
         } else if (3 == var2) {
            this.field10588 = true;
         } else if (var2 == 4) {
            this.field10587 = -1;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ul.f(" + ')');
      }
   }

   static final void method6613(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (class740.field3210 != null) {
            class568 var3 = class740.field3210.method2942((long)var2);
            var0.field3161[++var0.field3156 - 1] = var3 != null ? 1 : 0;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ul.aeo(" + ')');
      }
   }

   static final void method6614(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (var2 >= 1 && var2 <= 2) {
            class615.field8903.method5391(class615.field8903.field9109, var2, 708632362);
            class615.field8903.method5391(class615.field8903.field9140, var2, 837898760);
            class95.method523(656179282);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ul.afu(" + ')');
      }
   }

   static void method6615(double var0) {
      try {
         if (class736.field3116 != var0) {
            for(int var2 = 0; var2 < 256; ++var2) {
               int var3 = (int)(Math.pow((double)var2 / 255.0D, var0) * 255.0D);
               class736.field3115[var2] = var3 > 255 ? 255 : var3;
            }

            class736.field3116 = var0;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ul.i(" + ')');
      }
   }

   static final void method6616(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-20);
         int var4 = var0.field3161[--var0.field3156];
         --var4;
         if (var3.field920 != null && var4 < var3.field920.length && var3.field920[var4] != null) {
            var0.field3157[++var0.field3158 - 1] = var3.field920[var4];
         } else {
            var0.field3157[++var0.field3158 - 1] = "";
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ul.sg(" + ')');
      }
   }
}
