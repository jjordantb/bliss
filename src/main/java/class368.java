public class class368 {
   class180 field2322;
   class1 field2323 = new class1(64);

   public void method1553(int var1) {
      try {
         class1 var2 = this.field2323;
         synchronized(this.field2323) {
            this.field2323.method2979();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sj.p(" + ')');
      }
   }

   public class931 method1554(int var1, int var2) {
      try {
         class1 var3 = this.field2323;
         class931 var4;
         synchronized(this.field2323) {
            var4 = (class931)this.field2323.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            byte[] var9 = this.field2322.method3285(class981.field3222.field3271, var1, (byte)-50);
            var4 = new class931();
            if (var9 != null) {
               var4.method6265(new InputStream(var9), 905111826);
            }

            class1 var5 = this.field2323;
            synchronized(this.field2323) {
               this.field2323.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "sj.a(" + ')');
      }
   }

   public void method1555(int var1) {
      try {
         class1 var2 = this.field2323;
         synchronized(this.field2323) {
            this.field2323.method2977();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sj.f(" + ')');
      }
   }

   public void method1556(int var1, byte var2) {
      try {
         class1 var3 = this.field2323;
         synchronized(this.field2323) {
            this.field2323.method2976(var1, 187343477);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sj.b(" + ')');
      }
   }

   public class368(class469 var1, class423 var2, class180 var3) {
      this.field2322 = var3;
      if (this.field2322 != null) {
         this.field2322.method3286(class981.field3222.field3271, 1281975621);
      }

   }

   static void method1557(class848 var0, byte var1) {
      try {
         var0.method4986(0, 0, class759.field4331, 350);
         var0.method4984(0, 0, class759.field4331, 350, class342.field278 << 24 | 3351159, 1);
         int var2 = 350 / class342.field290;
         int var3;
         if (class342.field282 > 0) {
            var3 = 346 - class342.field290 - 4;
            int var4 = var3 * var2 / (var2 + class342.field282 - 1);
            int var5 = 4;
            if (class342.field282 > 1) {
               var5 += (class342.field282 - 1 - class342.field283) * (var3 - var4) / (class342.field282 - 1);
            }

            var0.method4984(class759.field4331 - 16, var5, 12, var4, class342.field278 << 24 | 3351159, 2);

            for(int var6 = class342.field283; var6 < class342.field283 + var2 && var6 < class342.field282; ++var6) {
               String[] var7 = class715.method2097(class342.field287[var6], '\b', 846052986);
               int var8 = (class759.field4331 - 8 - 16) / var7.length;

               for(int var9 = 0; var9 < var7.length; ++var9) {
                  int var10 = 8 + var8 * var9;
                  var0.method4986(var10, 0, var10 + var8 - 8, 350);
                  class958.field3479.method1678(class118.method1459(var7[var9], (byte)76), var10, 350 - class342.field286 - 2 - class378.field1158.field8225 - class342.field290 * (var6 - class342.field283), -1, -16777216, 2087345638);
               }
            }
         }

         class202.field7587.method1662("718 1", class759.field4331 - 25, 330, -1, -16777216, (byte)-63);
         var0.method4986(0, 0, class759.field4331, 350);
         var0.method4798(0, 350 - class342.field286, class759.field4331, -1, -2042566638);
         class501.field3182.method1678("--> " + class118.method1459(class342.field281, (byte)-1), 10, 350 - class271.field10557.field8225 - 1, -1, -16777216, -10016873);
         if (class619.field8869) {
            var3 = -1;
            if (class730.field2866 % 30 > 15) {
               var3 = 16777215;
            }

            var0.method4858(10 + class271.field10557.method4605("--> " + class118.method1459(class342.field281, (byte)58).substring(0, class342.field279), -949897299), 350 - class271.field10557.field8225 - 11, 12, var3, (short)26562);
         }

         var0.method4827();
         class417.method5687(-1132401323);
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "sj.s(" + ')');
      }
   }

   static final void method1558(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class623.method5319(var3, var4, var0, (byte)32);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sj.mo(" + ')');
      }
   }

   public static boolean method1559(class180 var0, class180 var1, class180 var2, class272 var3, class752 var4, byte var5) {
      try {
         class818.field4624 = var0;
         class818.field4612 = var1;
         class818.field4613 = var2;
         class818.field4614 = var3;
         class818.field4615 = var4;
         class639.field9810 = new int[16];

         for(int var6 = 0; var6 < 16; ++var6) {
            class639.field9810[var6] = 255;
         }

         return true;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "sj.a(" + ')');
      }
   }
}
