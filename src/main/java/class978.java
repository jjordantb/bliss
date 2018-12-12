import java.util.LinkedList;
import java.util.Queue;

public class class978 {
   static int field3123 = 0;
   static class550 field3124 = new class550();
   static boolean field3125 = true;
   static long field3126 = 7881601697932874601L;
   static Queue field3127 = new LinkedList();
   static class771 field3128 = new class771();
   public static String[] field3129;

   class978() throws Throwable {
      throw new Error();
   }

   static void method1842(class346 var0, int var1, class744 var2, int var3) {
      try {
         var2.field3156 = 0;
         var2.field3158 = 0;
         var2.field3176 = -286750741;
         var2.field3177 = var0;
         var2.field3175 = var2.field3177.field173;
         var2.field3174 = var2.field3177.field174;
         class20 var4 = null;
         var2.field3167 = 0;

         try {
            try {
               class384.field1425 = 0;

               while(true) {
                  class384.field1425 += -138185287;
                  if (-560594807 * class384.field1425 > var1) {
                     throw new RuntimeException("");
                  }

                  var4 = var2.field3175[(var2.field3176 += 286750741) * 1883543357];
                  if (class384.field1427 && (class384.field1428 == null || var2.field3177.field171 != null && var2.field3177.field171.indexOf(class384.field1428) != -1)) {
                     System.out.println(var2.field3177.field171 + ": " + var4);
                  }

                  if (var2.field3174[1883543357 * var2.field3176] == 1) {
                     var2.field3178 = true;
                  } else {
                     var2.field3178 = false;
                  }

                  if (class20.field5444 == var4 && var2.field3167 * -932179775 == 0) {
                     class449.method3758((byte)116);
                     break;
                  }

                  class849.method4783(var4, var2, (byte)11);
               }
            } catch (Exception var8) {
               StringBuilder var6 = new StringBuilder(30);
               var6.append("").append(7051297995265073167L * var2.field3177.field641).append(" ");

               for(int var7 = var2.field3167 * -932179775 - 1; var7 >= 0; --var7) {
                  var6.append("").append(7051297995265073167L * var2.field3166[var7].field2143.field641).append(" ");
               }

               var6.append("").append(-2008816077 * var4.field6425);
               class764.method2747(var6.toString(), var8, (short)-1126);
               class449.method3758((byte)46);
            }

         } catch (RuntimeException var9) {
            class449.method3758((byte)2);
            throw var9;
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "px.s(" + ')');
      }
   }

   static final void method1843(class744 var0, byte var1) {
      try {
         var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = ((class946)var0.field3159).method1993(true, -1660599936);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "px.aom(" + ')');
      }
   }

   static boolean method1844(CharSequence var0, int var1, boolean var2, int var3) {
      try {
         if (var1 >= 2 && var1 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = var0.length();

            for(int var8 = 0; var8 < var7; ++var8) {
               char var9 = var0.charAt(var8);
               if (var8 == 0) {
                  if ('-' == var9) {
                     var4 = true;
                     continue;
                  }

                  if (var9 == '+' && var2) {
                     if (var3 != -1628070489) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }
               }

               int var12;
               if (var9 >= '0' && var9 <= '9') {
                  var12 = var9 - 48;
               } else if (var9 >= 'A' && var9 <= 'Z') {
                  var12 = var9 - 55;
               } else {
                  if (var9 < 'a' || var9 > 'z') {
                     return false;
                  }

                  var12 = var9 - 87;
               }

               if (var12 >= var1) {
                  return false;
               }

               if (var4) {
                  var12 = -var12;
               }

               int var10 = var6 * var1 + var12;
               if (var10 / var1 != var6) {
                  return false;
               }

               var6 = var10;
               var5 = true;
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + var1);
         }
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "px.p(" + ')');
      }
   }

   static void method1845(int var0) {
      try {
         if (class980.method1915(class730.field2733 * -1233866115, -1337586273)) {
            if (class730.field2674.method4377(537308016) == null) {
               class967.method1750(4, 1378010016);
            } else {
               class967.method1750(14, 310060879);
            }
         } else if (-1233866115 * class730.field2733 != 4 && class730.field2733 * -1233866115 != 3) {
            if (class730.field2733 * -1233866115 == 6) {
               class967.method1750(19, 1046566062);
            }
         } else {
            class967.method1750(19, 1879261492);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "px.o(" + ')');
      }
   }

   static final void method1846(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         if (class730.field2785 != null && var2 < -1801543887 * class556.field503) {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = class776.field3731[var2].field8114;
         } else {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = "";
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "px.wp(" + ')');
      }
   }
}
