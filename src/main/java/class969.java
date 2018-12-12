public class class969 {
   public class70 field2495;
   public static class180 field2496;

   public class969(class180 var1) {
      byte[] var2 = var1.method3264(class590.field1577.field1585, (byte)11);
      this.method1690(new InputStream(var2), 1724191904);
   }

   void method1690(InputStream var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               if (var2 != 1724191904) {
                  throw new IllegalStateException();
               }

               return;
            }

            if (1 == var3) {
               this.field2495 = ObjectDefinition.method1496(var1, (byte)-47);
            }
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pr.a(" + ')');
      }
   }

   static final void method1691(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)58);
         class131 var4 = class382.field1410[var2 >> 16];
         class232.method4660(var3, var4, var0, 1344346794);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pr.gl(" + ')');
      }
   }

   static final void method1692(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9114.method5153(-575221319) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pr.anr(" + ')');
      }
   }

   public static String method1693(long var0) {
      try {
         if (var0 > 0L && var0 < 6582952005840035281L) {
            if (var0 % 37L == 0L) {
               return null;
            } else {
               int var2 = 0;

               for(long var3 = var0; 0L != var3; var3 /= 37L) {
                  ++var2;
               }

               StringBuilder var5 = new StringBuilder(var2);

               while(0L != var0) {
                  long var6 = var0;
                  var0 /= 37L;
                  var5.append(class965.field2532[(int)(var6 - 37L * var0)]);
               }

               return var5.reverse().toString();
            }
         } else {
            return null;
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "pr.f(" + ')');
      }
   }

   static final void method1694(class564 var0, class131 var1, class744 var2, short var3) {
      try {
         var0.field907 = var2.field3161[--var2.field3156] == 1;
         class814.method2932(var0, -275285651);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pr.fs(" + ')');
      }
   }

   static final void method1695(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-91);
         class131 var4 = class382.field1410[var2 >> 16];
         class610.method5138(var3, var4, var0, (byte)-121);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pr.hd(" + ')');
      }
   }

   static final void method1696(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (2 == class730.field2924 && var2 >= 0 && var2 < class730.field2923) {
            var0.field3161[++var0.field3156 - 1] = class730.field2703[var2] ? 1 : 0;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pr.wt(" + ')');
      }
   }

   static final void method1697(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3157[++var0.field3158 - 1] = var0.field3169.field9711[var2];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pr.xw(" + ')');
      }
   }
}
