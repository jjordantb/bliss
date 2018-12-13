public class class606 {
   public int field8568;
   public int field8569;
   public int field8570;
   public int field8571;
   public static class839 field8572;

   class606 method4786(int var1, int var2) {
      try {
         return new class606(this.field8570, var1, this.field8568, this.field8571);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "dk.a(" + ')');
      }
   }

   class606(int var1, int var2, int var3, int var4) {
      this.field8570 = var1;
      this.field8569 = var2;
      this.field8568 = var3;
      this.field8571 = var4;
   }

   static void method4787(String[] var0, short[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            short var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for(int var9 = var2; var9 < var3; ++var9) {
               if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
                  String var10 = var0[var9];
                  var0[var9] = var0[var6];
                  var0[var6] = var10;
                  short var11 = var1[var9];
                  var1[var9] = var1[var6];
                  var1[var6++] = var11;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method4787(var0, var1, var2, var6 - 1, 2073959826);
            method4787(var0, var1, var6 + 1, var3, 2006941575);
         }

      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "dk.f(" + ')');
      }
   }

   static final void method4788(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)26);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class623.method5319(var3, var4, var0, (byte)-11);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "dk.mw(" + ')');
      }
   }

   static final void method4789(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class701 var3 = class637.method5936(class643.field10027, class730.field2692.field7765, (byte)54);
         var3.field3364.method6362(var2, 16711935);
         class730.field2692.method4380(var3, (byte)-99);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "dk.sd(" + ')');
      }
   }

   static final void method4790(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class84.method938(var2, (byte)2);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "dk.ahg(" + ')');
      }
   }

   static final void method4791(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         var0.field3161[++var0.field3156 - 1] = var3.field935;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "dk.pp(" + ')');
      }
   }

   static final void method4792(class744 var0, int var1) {
      try {
         Widget var2 = var0.field3159.field4095.method889(var0.field3161[--var0.field3156], (short)13294);
         var2.children1 = null;
         var2.children2 = null;
         class814.method2932(var2, -1361442228);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "dk.apv(" + ')');
      }
   }

   static int method4793(int var0, int var1, int var2) {
      try {
         return class15.field6900.field6921 != var0 && var0 != class15.field6902.field6921 ? class729.field2497[var1 & 3] : class729.field2498[var1 & 3];
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "dk.by(" + ')');
      }
   }
}
