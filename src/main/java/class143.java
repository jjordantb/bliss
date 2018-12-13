public class class143 {
   int[] field1539;
   public static String field1540;

   public int method1172(int var1, int var2) {
      try {
         int var3 = (this.field1539.length >> 1) - 1;
         int var4 = var1 & var3;

         while(true) {
            int var5 = this.field1539[var4 + var4 + 1];
            if (var5 == -1) {
               return -1;
            }

            if (var1 == this.field1539[var4 + var4]) {
               return var5;
            }

            var4 = var4 + 1 & var3;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "eo.a(" + ')');
      }
   }

   public class143(int[] var1) {
      int var2;
      for(var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
         ;
      }

      this.field1539 = new int[var2 + var2];

      int var3;
      for(var3 = 0; var3 < var2 + var2; ++var3) {
         this.field1539[var3] = -1;
      }

      int var4;
      for(var3 = 0; var3 < var1.length; this.field1539[1 + var4 + var4] = var3++) {
         for(var4 = var1[var3] & var2 - 1; this.field1539[1 + var4 + var4] != -1; var4 = var4 + 1 & var2 - 1) {
            ;
         }

         this.field1539[var4 + var4] = var1[var3];
      }

   }

   static int method1173(int var0, byte var1) {
      try {
         return var0 == 16711935 ? -1 : class22.method3436(var0, (byte)-114);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "eo.p(" + ')');
      }
   }

   static final void method1174(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)-23);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class576.method67(var3, var4, var0, 970111404);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "eo.gf(" + ')');
      }
   }

   static final void method1175(class744 var0, int var1) {
      try {
         var0.field3157[++var0.field3158 - 1] = class629.method5806(-1872384633).toString();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "eo.agn(" + ')');
      }
   }

   public static void method1176(class180 var0, byte var1) {
      try {
         class114.field1727 = var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "eo.a(" + ')');
      }
   }

   static void method1177(int var0, int var1, byte var2) {
      try {
         class682 var3 = class370.method881(12, (long)var0);
         var3.method4340((byte)78);
         var3.field7687 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "eo.ay(" + ')');
      }
   }
}
