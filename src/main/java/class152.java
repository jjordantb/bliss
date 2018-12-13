public class class152 {
   class180 field5410;
   class180 field5411;
   class1 field5412 = new class1(64);
   static int field5413 = 0;
   static int field5414 = 32768;
   public static int field5415;

   public class205 method3399(int var1, int var2) {
      try {
         class205 var3 = (class205)this.field5412.method2974((long)var1);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            if (var1 >= 32768) {
               var4 = this.field5411.method3285(0, var1 & 32767, (byte)-102);
            } else {
               var4 = this.field5410.method3285(0, var1, (byte)-91);
            }

            var3 = new class205();
            if (var4 != null) {
               var3.method4308(new InputStream(var4), 754160666);
            }

            if (var1 >= 32768) {
               var3.method4310(-1787095576);
            }

            this.field5412.method2984(var3, (long)var1);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ks.a(" + ')');
      }
   }

   public class152(class423 var1, class180 var2, class180 var3) {
      this.field5410 = var2;
      this.field5411 = var3;
      if (this.field5410 != null) {
         this.field5410.method3286(0, 1395155699);
      }

      if (this.field5411 != null) {
         this.field5411.method3286(0, 393673779);
      }

   }

   static final void method3400(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class610.method5138(var3, var4, var0, (byte)-101);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ks.hf(" + ')');
      }
   }

   static final void method3401(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)44);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class625.method5823(var3, var4, var0, (byte)59);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ks.jv(" + ')');
      }
   }

   static final void method3402(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)-44);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class562.method809(var3, var4, var0, (byte)-112);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ks.lo(" + ')');
      }
   }

   static final void method3403(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         var0.field3156 -= 2;
         int var3 = var0.field3161[var0.field3156];
         int var4 = var0.field3161[1 + var0.field3156];
         class230 var5 = class398.method3539(class526.field3666, var4, 0, (byte)57);
         var0.field3161[++var0.field3156 - 1] = var5.method4603(var2, var3, class324.field621, 1970071925);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ks.zf(" + ')');
      }
   }

   static int[] method3404(class701 var0, int var1) {
      try {
         InputStream var2 = new InputStream(518);
         int[] var3 = new int[4];

         int var4;
         for(var4 = 0; var4 < 4; ++var4) {
            var3[var4] = (int)(Math.random() * 9.9999999E7D);
         }

         var2.method6361(10);
         var2.method6364(var3[0], 287776861);
         var2.method6364(var3[1], -691239943);
         var2.method6364(var3[2], 341776687);
         var2.method6364(var3[3], -551127202);

         for(var4 = 0; var4 < 10; ++var4) {
            var2.method6364((int)(Math.random() * 9.9999999E7D), -1703203090);
         }

         var2.method6362((int)(Math.random() * 9.9999999E7D), 16711935);
         var2.method6412(class449.field7058, class449.field7062, 1970926718);
         var0.field3364.method6425(var2.field10375, 0, var2.field10376, (short)-19107);
         return var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ks.s(" + ')');
      }
   }
}
