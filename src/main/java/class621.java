import java.util.Stack;

public abstract class class621 {
   public static int field8926;

   static void method5260(int var0, int var1, int var2, int var3, int var4, int var5, int var6, class497 var7, class727 var8, class230 var9, int var10, int var11, byte var12) {
      try {
         if (var0 > var2 && var0 < var4 + var2 && var1 > var6 - var9.field8230 - 1 && var1 < var9.field8225 + var6) {
            var10 = var11;
         }

         String var13 = class158.method3444(var7, (byte)-2);
         var8.method1668(var13, 3 + var2, var6, var10, 0, class730.field2683, class880.field10188, class602.field8668, class755.field4199, 65280);
      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "cr.au(" + ')');
      }
   }

   public static void method5261(byte var0) {
      try {
         Stack var1 = class192.field7025;
         synchronized(class192.field7025) {
            class192.field7025 = new Stack();
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cr.b(" + ')');
      }
   }

   static final void method5262(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-42);
         class131 var4 = class382.field1410[var2 >> 16];
         class625.method5829(var3, var4, var0, 1585899223);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "cr.go(" + ')');
      }
   }

   static final void method5263(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         var0.field3161[++var0.field3156 - 1] = var3.field886 ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "cr.og(" + ')');
      }
   }

   static char method5264(char var0, class423 var1, byte var2) {
      try {
         if (var0 >= 'À' && var0 <= 'ÿ') {
            if (var0 >= 'À' && var0 <= 'Æ') {
               return 'A';
            }

            if (var0 == 'Ç') {
               return 'C';
            }

            if (var0 >= 'È' && var0 <= 'Ë') {
               return 'E';
            }

            if (var0 >= 'Ì' && var0 <= 'Ï') {
               return 'I';
            }

            if ('Ñ' == var0 && var1 != class423.field9591) {
               return 'N';
            }

            if (var0 >= 'Ò' && var0 <= 'Ö') {
               return 'O';
            }

            if (var0 >= 'Ù' && var0 <= 'Ü') {
               return 'U';
            }

            if ('Ý' == var0) {
               return 'Y';
            }

            if (var0 == 'ß') {
               return 's';
            }

            if (var0 >= 'à' && var0 <= 'æ') {
               return 'a';
            }

            if (var0 == 'ç') {
               return 'c';
            }

            if (var0 >= 'è' && var0 <= 'ë') {
               return 'e';
            }

            if (var0 >= 'ì' && var0 <= 'ï') {
               return 'i';
            }

            if (var0 == 'ñ' && var1 != class423.field9591) {
               return 'n';
            }

            if (var0 >= 'ò' && var0 <= 'ö') {
               return 'o';
            }

            if (var0 >= 'ù' && var0 <= 'ü') {
               return 'u';
            }

            if (var0 == 'ý' || 'ÿ' == var0) {
               return 'y';
            }
         }

         if ('Œ' == var0) {
            return 'O';
         } else if (var0 == 'œ') {
            return 'o';
         } else if ('Ÿ' == var0) {
            return 'Y';
         } else {
            return var0;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "cr.f(" + ')');
      }
   }

   static final void method5265(class744 var0, int var1) {
      try {
         class564.method845(var0.field3159, var0, -908974507);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cr.apr(" + ')');
      }
   }
}
