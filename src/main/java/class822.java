public class class822 {
   static String field9046 = " (";
   public static String field9047;
   static String field9048 = "->";
   static String field9049 = ")";
   static String field9050 = ",";
   static String field9051;
   static String field9052 = "true";
   static String field9053;

   static {
      field9051 = Loader.field6960;
      field9047 = "<br>";
      field9053 = "</col>";
   }

   class822() throws Throwable {
      throw new Error();
   }

   static final void method5366(class744 var0, short var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = var0.field3159.method2170((byte)51);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "b.apg(" + ')');
      }
   }

   public static int method5367(CharSequence var0, CharSequence var1, class423 var2, int var3) {
      try {
         int var4 = var0.length();
         int var5 = var1.length();
         int var6 = 0;
         int var7 = 0;
         char var8 = 0;
         char var9 = 0;

         while(var6 - var8 < var4 || var7 - var9 < var5) {
            if (var6 - var8 >= var4) {
               return -1;
            }

            if (var7 - var9 >= var5) {
               return 1;
            }

            char var10;
            boolean var11;
            if (var8 != 0) {
               var10 = var8;
               var11 = false;
            } else {
               var10 = var0.charAt(var6++);
            }

            char var12;
            if (var9 != 0) {
               var12 = var9;
               var11 = false;
            } else {
               var12 = var1.charAt(var7++);
            }

            var8 = class285.method6660(var10, (byte)59);
            var9 = class285.method6660(var12, (byte)39);
            var10 = class621.method5264(var10, var2, (byte)93);
            var12 = class621.method5264(var12, var2, (byte)61);
            if (var12 != var10 && Character.toUpperCase(var10) != Character.toUpperCase(var12)) {
               var10 = Character.toLowerCase(var10);
               var12 = Character.toLowerCase(var12);
               if (var12 != var10) {
                  return class103.method153(var10, var2, 82862076) - class103.method153(var12, var2, -2040847947);
               }
            }
         }

         int var16 = Math.min(var4, var5);

         char var13;
         int var19;
         for(var19 = 0; var19 < var16; ++var19) {
            if (class423.field9585 == var2) {
               var6 = var4 - 1 - var19;
               var7 = var5 - 1 - var19;
            } else {
               var7 = var19;
               var6 = var19;
            }

            char var17 = var0.charAt(var6);
            var13 = var1.charAt(var7);
            if (var17 != var13 && Character.toUpperCase(var17) != Character.toUpperCase(var13)) {
               var17 = Character.toLowerCase(var17);
               var13 = Character.toLowerCase(var13);
               if (var13 != var17) {
                  return class103.method153(var17, var2, -1920723606) - class103.method153(var13, var2, -495715201);
               }
            }
         }

         var19 = var4 - var5;
         if (var19 != 0) {
            return var19;
         } else {
            for(int var18 = 0; var18 < var16; ++var18) {
               var13 = var0.charAt(var18);
               char var14 = var1.charAt(var18);
               if (var14 != var13) {
                  return class103.method153(var13, var2, -129620717) - class103.method153(var14, var2, -153765629);
               }
            }

            return 0;
         }
      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "b.a(" + ')');
      }
   }

   public static class103 method5368(int var0, int var1) {
      try {
         class103[] var2 = class874.method5853(1246199085);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var0 == var2[var3].field201) {
               return var2[var3];
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "b.f(" + ')');
      }
   }

   static final void method5369(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = class85.field1121.method1566(var2).field4248 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "b.aak(" + ')');
      }
   }
}
