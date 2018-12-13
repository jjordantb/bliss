public class class543 {
   static int field3816 = 0;
   public static int[] field3817;
   static int field3818 = 0;
   public static int[] field3819;
   static int field3820;

   class543() throws Throwable {
      throw new Error();
   }

   static final void method2374(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class506 var3 = class395.method3397(var2, 1063164911);
         String var4 = "";
         if (var3 != null && var3.field4129 != null) {
            var4 = var3.field4129;
         }

         var0.field3157[++var0.field3158 - 1] = var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pt.abe(" + ')');
      }
   }

   public static void method2375(class180 var0, int var1) {
      try {
         class295.field10471 = var0.method3281("hitbar_default", -1490079436);
         class295.field10473 = var0.method3281("timerbar_default", -1467775420);
         class762.field4391 = var0.method3281("headicons_pk", -1596188459);
         class878.field9819 = var0.method3281("headicons_prayer", -926614872);
         class295.field10472 = var0.method3281("hint_headicons", -604307983);
         class295.field10475 = var0.method3281("hint_mapmarkers", -1518589898);
         class701.field3366 = var0.method3281("mapflag", -633755996);
         class776.field3727 = var0.method3281("cross", -929033367);
         class942.field10348 = var0.method3281("mapdots", -1089743906);
         class295.field10476 = var0.method3281("name_icons", -946611786);
         class161.field6604 = var0.method3281("floorshadows", -2138341450);
         class229.field8211 = var0.method3281("compass", -1033709469);
         class665.field9599 = var0.method3281("otherlevel", -1683756229);
         class573.field110 = var0.method3281("hint_mapedge", -769864981);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pt.f(" + ')');
      }
   }

   static final void method2376(int var0) {
      try {
         int var1 = 0;
         class545 var2 = class730.field2697.method5317(-1611682495);

         for(int var3 = 0; var3 < class730.field2697.method5271(-2029823795); ++var3) {
            for(int var4 = 0; var4 < class730.field2697.method5272(-105400653); ++var4) {
               if (class762.method2812(var2.field3861, var1, var3, var4, true, -777988087)) {
                  ++var1;
               }

               if (var1 >= 512) {
                  return;
               }
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pt.iu(" + ')');
      }
   }

   static final void method2377(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         var0.field3161[++var0.field3156 - 1] = var3.field894;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pt.pg(" + ')');
      }
   }
}
