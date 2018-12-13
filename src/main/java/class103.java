public class class103 {
   public static class103 field187 = new class103(6, 0, 4, 2);
   public static class103 field188 = new class103(7, 0, 1, 1);
   static class103 field189 = new class103(14, 0, 4, 1);
   public int field190;
   public int field191;
   public static class103 field192 = new class103(0, 2, 2, 1);
   static class103 field193 = new class103(8, 0, 4, 1);
   static class103 field194 = new class103(9, 0, 4, 1);
   static class103 field195 = new class103(4, 1, 1, 1);
   public static class103 field196 = new class103(11, 0, 1, 2);
   static class103 field197 = new class103(12, 0, 1, 0);
   static class103 field198 = new class103(13, 0, 1, 0);
   static class103 field199 = new class103(2, 4, 4, 0);
   static class103 field200 = new class103(15, 0, 1, 0);
   public int field201;
   public static class103 field202 = new class103(10, 2, 2, 0);
   public int field203;
   public static class103 field204 = new class103(1, 2, 2, 0);
   public static int field205;
   public static class48 field206;

   class103(int var1, int var2, int var3, int var4) {
      this.field201 = var1;
      this.field191 = var2;
      this.field203 = var3;
      this.field190 = var4;
   }

   static final void method152(class744 var0, byte var1) {
      try {
         if (class640.field10201 != null) {
            var0.field3161[++var0.field3156 - 1] = 1;
            var0.field3169 = class640.field10201;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pg.xh(" + ')');
      }
   }

   static int method153(char var0, class423 var1, int var2) {
      try {
         int var3 = var0 << 4;
         if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
            char var4 = Character.toLowerCase(var0);
            var3 = (var4 << 4) + 1;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pg.p(" + ')');
      }
   }

   static void method154(Widget var0, int var1, int var2, int var3) {
      try {
         class118 var4 = var0.method826(class593.field1623, 1629882987);
         if (var4 != null) {
            class593.field1623.method4986(var1, var2, var0.field881 + var1, var2 + var0.field887);
            if (class95.field595 < 3) {
               int var5 = (int)(-class730.field2931);
               var5 = var5 + class730.field2782 * 2 & 16383;
               var5 <<= 2;
               class422.field9603.method3122((float)var1 + (float)var0.field881 / 2.0F, (float)var2 + (float)var0.field887 / 2.0F, 4135, var5, var4.field2156, var1, var2);
            } else {
               class593.field1623.method4880(-16777216, var4.field2156, var1, var2);
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "pg.lp(" + ')');
      }
   }

   static final void method155(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)-5);
         var0.field3161[++var0.field3156 - 1] = var3.field886 ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pg.rf(" + ')');
      }
   }
}
