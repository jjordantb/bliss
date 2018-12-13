import java.io.IOException;

final class class455 implements class648 {
   static int[] field7199;

   public long method5549(String var1, byte var2) {
      try {
         return class880.method6175(var1, (byte)51);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ex.a(" + ')');
      }
   }

   static final void method3816(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)-40);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class333.method111(var3, var4, var0, 280747696);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ex.ip(" + ')');
      }
   }

   static class838 method3817(int var0) {
      try {
         class439 var1 = null;
         class838 var2 = new class838(class730.field2926, 0);

         try {
            var1 = class22.method3434("", class730.field2926.field7321, false, -1804643872);
            byte[] var3 = new byte[(int)var1.method4277(-423906976)];

            int var5;
            for(int var4 = 0; var4 < var3.length; var4 += var5) {
               var5 = var1.method4278(var3, var4, var3.length - var4, (short)4730);
               if (-1 == var5) {
                  throw new IOException();
               }
            }

            var2 = new class838(new InputStream(var3), class730.field2926, 0);
         } catch (Exception var7) {
            ;
         }

         try {
            if (var1 != null) {
               var1.method4276(1294013462);
            }
         } catch (Exception var6) {
            ;
         }

         return var2;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "ex.a(" + ')');
      }
   }

   static final void method3818(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class341.method250(var3, var4, var0, 1246330568);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ex.fd(" + ')');
      }
   }
}
