public class class945 {
   class1 field3422 = new class1(64);
   class1 field3423 = new class1(64);
   public static int field3424 = 64;
   class180 field3425;
   class180 field3426;
   public static int field3427 = 64;

   public class279 method2003(int var1, int var2) {
      try {
         class1 var3 = this.field3422;
         class279 var4;
         synchronized(this.field3422) {
            var4 = (class279)this.field3422.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field3425;
            byte[] var10;
            synchronized(this.field3425) {
               var10 = this.field3425.method3285(class981.field3230.field3271, var1, (byte)-51);
            }

            var4 = new class279();
            var4.field10585 = this;
            if (var10 != null) {
               var4.method6609(new InputStream(var10), -1377008682);
            }

            class1 var11 = this.field3422;
            synchronized(this.field3422) {
               this.field3422.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ub.a(" + ')');
      }
   }

   public void method2004(int var1, int var2, int var3) {
      try {
         this.field3422 = new class1(var1);
         this.field3423 = new class1(var2);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ub.f(" + ')');
      }
   }

   public void method2005(byte var1) {
      try {
         class1 var2 = this.field3422;
         synchronized(this.field3422) {
            this.field3422.method2977();
         }

         var2 = this.field3423;
         synchronized(this.field3423) {
            this.field3423.method2977();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ub.b(" + ')');
      }
   }

   public void method2006(byte var1) {
      try {
         class1 var2 = this.field3422;
         synchronized(this.field3422) {
            this.field3422.method2979();
         }

         var2 = this.field3423;
         synchronized(this.field3423) {
            this.field3423.method2979();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ub.i(" + ')');
      }
   }

   public class945(class469 var1, class423 var2, class180 var3, class180 var4) {
      this.field3425 = var3;
      this.field3426 = var4;
      this.field3425.method3286(class981.field3230.field3271, 1339445894);
      Math.random();
      Math.random();
      Math.random();
      Math.random();
   }

   public void method2007(int var1, int var2) {
      try {
         class1 var3 = this.field3422;
         synchronized(this.field3422) {
            this.field3422.method2976(var1, -2105806073);
         }

         var3 = this.field3423;
         synchronized(this.field3423) {
            this.field3423.method2976(var1, -1191128609);
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ub.p(" + ')');
      }
   }

   static final void method2008(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         if (var2 != null) {
            var0.field3161[++var0.field3156 - 1] = var2.length();
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ub.aaa(" + ')');
      }
   }

   static final void method2009(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         class856.method5200(var2, 1637585593);
         int var7 = 0;
         int var8 = var2 - var5;
         if (var8 < 0) {
            var8 = 0;
         }

         int var9 = var2;
         int var10 = -var2;
         int var11 = var8;
         int var12 = -var8;
         int var13 = -1;
         int var14 = -1;
         int[] var15 = class381.field1412[var1];
         int var16 = var0 - var8;
         int var17 = var0 + var8;
         class484.method4769(var15, var0 - var2, var16, var4, 822506078);
         class484.method4769(var15, var16, var17, var3, -940933309);
         class484.method4769(var15, var17, var2 + var0, var4, -1370408112);

         while(var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
               class964.field3633[var11] = var7;
               --var11;
               var12 -= var11 << 1;
            }

            ++var7;
            int[] var18;
            int[] var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            if (var10 >= 0) {
               --var9;
               var10 -= var9 << 1;
               if (var9 >= var8) {
                  var18 = class381.field1412[var1 + var9];
                  var19 = class381.field1412[var1 - var9];
                  var20 = var0 + var7;
                  var21 = var0 - var7;
                  class484.method4769(var18, var21, var20, var4, 1051915434);
                  class484.method4769(var19, var21, var20, var4, 793440117);
               } else {
                  var18 = class381.field1412[var1 + var9];
                  var19 = class381.field1412[var1 - var9];
                  var20 = class964.field3633[var9];
                  var21 = var0 + var7;
                  var22 = var0 - var7;
                  var23 = var20 + var0;
                  var24 = var0 - var20;
                  class484.method4769(var18, var22, var24, var4, -12764045);
                  class484.method4769(var18, var24, var23, var3, -194110803);
                  class484.method4769(var18, var23, var21, var4, 1394181568);
                  class484.method4769(var19, var22, var24, var4, -730104987);
                  class484.method4769(var19, var24, var23, var3, 737940457);
                  class484.method4769(var19, var23, var21, var4, 204079647);
               }
            }

            var18 = class381.field1412[var1 + var7];
            var19 = class381.field1412[var1 - var7];
            var20 = var0 + var9;
            var21 = var0 - var9;
            if (var7 < var8) {
               var22 = var11 < var7 ? class964.field3633[var7] : var11;
               var23 = var22 + var0;
               var24 = var0 - var22;
               class484.method4769(var18, var21, var24, var4, 1223209089);
               class484.method4769(var18, var24, var23, var3, 896350728);
               class484.method4769(var18, var23, var20, var4, -668389774);
               class484.method4769(var19, var21, var24, var4, -1129338234);
               class484.method4769(var19, var24, var23, var3, -1441853951);
               class484.method4769(var19, var23, var20, var4, 145211847);
            } else {
               class484.method4769(var18, var21, var20, var4, 242307563);
               class484.method4769(var19, var21, var20, var4, 1665587281);
            }
         }

      } catch (RuntimeException var25) {
         throw class158.method3445(var25, "ub.r(" + ')');
      }
   }
}
