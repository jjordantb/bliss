public final class class539 {
   class568[] field3756;
   int field3757;
   long field3758;
   class568 field3759;
   class568 field3760;
   int field3761 = 0;
   public static class661 field3762;

   public class568 method2331(long var1) {
      try {
         this.field3758 = var1 * 236245195989619781L;
         class568 var3 = this.field3756[(int)(var1 & (long)(1721892305 * this.field3757 - 1))];

         for(this.field3760 = var3.field640; var3 != this.field3760; this.field3760 = this.field3760.field640) {
            if (this.field3760.field641 * 7051297995265073167L == var1) {
               class568 var4 = this.field3760;
               this.field3760 = this.field3760.field640;
               return var4;
            }
         }

         this.field3760 = null;
         return null;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "se.a(" + ')');
      }
   }

   public class568 method2332(int var1) {
      try {
         if (this.field3760 == null) {
            return null;
         } else {
            for(class568 var2 = this.field3756[(int)(this.field3758 * 4770221757987511949L & (long)(1721892305 * this.field3757 - 1))]; var2 != this.field3760; this.field3760 = this.field3760.field640) {
               if (this.field3760.field641 * 7051297995265073167L == 4770221757987511949L * this.field3758) {
                  class568 var3 = this.field3760;
                  this.field3760 = this.field3760.field640;
                  return var3;
               }
            }

            this.field3760 = null;
            return null;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "se.f(" + ')');
      }
   }

   public int method2333(class568[] var1, int var2) {
      try {
         int var3 = 0;

         for(int var4 = 0; var4 < 1721892305 * this.field3757; ++var4) {
            class568 var5 = this.field3756[var4];

            for(class568 var6 = var5.field640; var6 != var5; var6 = var6.field640) {
               var1[var3++] = var6;
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "se.b(" + ')');
      }
   }

   public int method2334(int var1) {
      try {
         int var2 = 0;

         for(int var3 = 0; var3 < 1721892305 * this.field3757; ++var3) {
            class568 var4 = this.field3756[var3];

            for(class568 var5 = var4.field640; var5 != var4; var5 = var5.field640) {
               ++var2;
            }
         }

         return var2;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "se.p(" + ')');
      }
   }

   public class568 method2335(int var1) {
      try {
         this.field3761 = 0;
         return this.method2336((byte)-79);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "se.k(" + ')');
      }
   }

   public class568 method2336(byte var1) {
      try {
         class568 var2;
         if (1311298783 * this.field3761 > 0 && this.field3759 != this.field3756[this.field3761 * 1311298783 - 1]) {
            var2 = this.field3759;
            this.field3759 = var2.field640;
            return var2;
         } else {
            while(1311298783 * this.field3761 < 1721892305 * this.field3757) {
               var2 = this.field3756[(this.field3761 += 489154335) * 1311298783 - 1].field640;
               if (this.field3756[this.field3761 * 1311298783 - 1] != var2) {
                  this.field3759 = var2.field640;
                  return var2;
               }
            }

            return null;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "se.d(" + ')');
      }
   }

   public class539(int var1) {
      this.field3757 = -249857231 * var1;
      this.field3756 = new class568[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class568 var3 = this.field3756[var2] = new class568();
         var3.field640 = var3;
         var3.field642 = var3;
      }

   }

   public void method2337(class568 var1, long var2) {
      try {
         if (var1.field642 != null) {
            var1.method545(-1460969981);
         }

         class568 var4 = this.field3756[(int)(var2 & (long)(this.field3757 * 1721892305 - 1))];
         var1.field642 = var4.field642;
         var1.field640 = var4;
         var1.field642.field640 = var1;
         var1.field640.field642 = var1;
         var1.field641 = var2 * 4191220306876042991L;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "se.i(" + ')');
      }
   }

   static final void method2338(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class506 var3 = class395.method3397(var2, 689328854);
         String var4 = "";
         if (var3 != null && var3.field4125 != null) {
            var4 = var3.field4125;
         }

         var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "se.ach(" + ')');
      }
   }

   public static void method2339(class477 var0, byte var1) {
      try {
         if (class470.field8223 == null) {
            throw new IllegalStateException("");
         } else {
            class470.field8223.field8224.add(var0);
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "se.i(" + ')');
      }
   }

   public static class245[] method2340(int var0) {
      try {
         return new class245[]{class245.field8535, class245.field8536, class245.field8537, class245.field8534, class245.field8533, class245.field8538};
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "se.a(" + ')');
      }
   }

   public static void method2341(int var0, int var1, int var2) {
      try {
         class682 var3 = class370.method881(18, (long)var1 << 32 | (long)var0);
         var3.method4336(-777100649);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "se.ao(" + ')');
      }
   }
}
