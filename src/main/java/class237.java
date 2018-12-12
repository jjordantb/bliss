import java.awt.Canvas;

public class class237 {
   class131 field8254;
   class564 field8255;

   boolean method4648(class131 var1, int var2, int var3, int var4) {
      try {
         if (var1 != null) {
            class564 var5 = var1.method889(var2, (short)15753);
            if (var5 != null) {
               this.field8254 = var1;
               this.field8255 = var5;
               return true;
            }
         }

         this.method4651((byte)38);
         return false;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "qd.b(" + ')');
      }
   }

   boolean method4649(int var1, int var2, int var3) {
      try {
         class564 var4 = class554.method427(var1, var2, -156511736);
         if (var4 != null) {
            this.field8254 = class382.field1410[var1 >> 16];
            this.field8255 = var4;
            return true;
         } else {
            this.method4651((byte)92);
            return false;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qd.f(" + ')');
      }
   }

   class564 method4650(int var1) {
      try {
         return this.field8254.method889(this.field8255.field867 * -440872681, (short)10433);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qd.a(" + ')');
      }
   }

   void method4651(byte var1) {
      try {
         this.field8254 = null;
         this.field8255 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qd.p(" + ')');
      }
   }

   static final void method4652(class744 var0, short var1) {
      try {
         class740.field3209 = var0.field3161[(var0.field3156 -= -391880689) * 681479919] == 1;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qd.aez(" + ')');
      }
   }

   public static int method4653(byte var0) {
      try {
         Canvas var1 = new Canvas();
         var1.setSize(100, 100);
         class848 var2 = class317.method474(0, var1, (class478)null, (class180)null, 0, -1071815074);
         long var3 = class27.method3468((byte)1);

         int var5;
         for(var5 = 0; var5 < 10000; ++var5) {
            var2.method4840(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
         }

         var5 = (int)(class27.method3468((byte)1) - var3);
         var2.method4833(0, 0, 100, 100, -16777216, (byte)7);
         var2.method4996(1538379056);
         return var5;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "qd.f(" + ')');
      }
   }

   static final void method4654(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)54);
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var3.field987 * -1086526073;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qd.rb(" + ')');
      }
   }

   static void method4655(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         for(int var6 = var2; var6 <= var3; ++var6) {
            class484.method4769(class534.field1412[var6], var0, var1, var4, -1334363034);
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "qd.z(" + ')');
      }
   }

   static final void method4656(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int)class730.field2738 >> 3;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qd.agr(" + ')');
      }
   }

   static final void method4657(class357 var0, class744 var1, byte var2) {
      try {
         var1.field3161[(var1.field3156 += -391880689) * 681479919 - 1] = class341.method253(var0, (byte)-65);
         var1.field3157[(var1.field3158 += 969361751) * -203050393 - 1] = class221.method4037(var0, 533229453);
         var1.field3157[(var1.field3158 += 969361751) * -203050393 - 1] = class154.method3491(var0, (byte)14);
         var1.field3157[(var1.field3158 += 969361751) * -203050393 - 1] = class636.method5915(var0, -532801249);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qd.v(" + ')');
      }
   }

   public static final void method4658(int var0, boolean var1, int var2, int var3) {
      try {
         if (var0 >= 8000 && var0 <= 48000) {
            class752.field4179 = var0 * 1438282109;
            class752.field4167 = var1;
            class752.field4168 = var2 * 2095551653;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qd.a(" + ')');
      }
   }
}
