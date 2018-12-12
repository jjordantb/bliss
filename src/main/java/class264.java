public class class264 {
   public int field8190;
   public static class264 field8191 = new class264(9, 4);
   public static class264 field8192 = new class264(0, 1);
   public static class264 field8193 = new class264(1, 1);
   public static class264 field8194 = new class264(5, 3);
   public static class264 field8195 = new class264(2, 1);
   static class264 field8196 = new class264(6, 3);
   static class264 field8197 = new class264(4, 4);
   public static class264 field8198 = new class264(8, 1);
   public static class264 field8199 = new class264(3, 2);
   public int field8200;
   public static class264 field8201 = new class264(7, 1);

   class264(int var1, int var2) {
      this.field8200 = var1 * -57892181;
      this.field8190 = var2 * -1192469397;
   }

   static final void method4565(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         class890.method5559(class923.field10295, var0.field3161[var0.field3156 * 681479919], var0.field3161[681479919 * var0.field3156 + 1], -16777216);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ce.sm(" + ')');
      }
   }

   static final void method4566(class744 var0, byte var1) {
      try {
         class615.field8903.method5391(class615.field8903.field9135, var0.field3161[(var0.field3156 -= -391880689) * 681479919], -2054835114);
         class95.method523(656179282);
         Client.field2647 = false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ce.aie(" + ')');
      }
   }

   static final void method4567(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class362.method1506(var3, var4, var0, (byte)-16);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ce.no(" + ')');
      }
   }

   static void method4568(String[] var0, int var1) {
      try {
         if (var0.length > 1) {
            for(int var2 = 0; var2 < var0.length; ++var2) {
               if (var0[var2].startsWith("pause")) {
                  int var3 = 5;

                  try {
                     var3 = Integer.parseInt(var0[var2].substring(6));
                  } catch (Exception var5) {
                     ;
                  }

                  class213.method3810("Pausing for " + var3 + " seconds...", 357563950);
                  class342.field289 = var0;
                  class342.field284 = -1428832631 * (var2 + 1);
                  class7.field4919 = (class27.method3468((byte)1) + (long)(var3 * 1000)) * 6717445677357895093L;
                  break;
               }

               class342.field281 = var0[var2];
               class600.method5464(false, 1496417723);
            }
         } else {
            class342.field281 = class342.field281 + var0[0];
            class342.field279 += var0[0].length() * 1914783065;
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ce.d(" + ')');
      }
   }

   static void method4569(int var0) {
      try {
         if (-1217082313 * class342.field285 > 0) {
            int var1 = 0;

            for(int var2 = 0; var2 < class342.field287.length; ++var2) {
               if (class342.field287[var2].indexOf("--> ") != -1) {
                  ++var1;
                  if (var1 == class342.field285 * -1217082313) {
                     class342.field281 = class342.field287[var2].substring(class342.field287[var2].indexOf(62) + 2);
                     break;
                  }
               }
            }
         } else {
            class342.field281 = "";
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ce.x(" + ')');
      }
   }
}
