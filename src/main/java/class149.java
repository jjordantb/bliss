import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class149 extends class568 {
   int[] field1526;
   int[] field1527;
   int[] field1528;
   int field1529;
   Field[] field1530;
   byte[][][] field1531;
   Method[] field1532;
   int field1533;

   static void method1159(Player var0, boolean var1, int var2) {
      try {
         if (class602.field8673 < 410) {
            if (var0 == class923.local) {
               if (class730.field2817 && (class568.field645 & 16) != 0) {
                  class984.method1875(class730.field2820, class730.field2735 + " " + class822.field9048 + " " + class56.method1545(16777215, -1880818524) + class814.field4796.method2927(class321.field1066, -875414210), class175.field5075, 16, -1, 0L, 0, 0, true, false, (long)var0.field4028, false, -1698066743);
               }
            } else {
               String var6;
               if (var0.field3384 * -1214139113 == 0) {
                  boolean var3 = true;
                  if (-1 != class923.local.field3383 && -1 != var0.field3383) {
                     int var4 = class923.local.field3383 < var0.field3383 ? 1792775047 * class923.local.field3383 * -1031683529 : var0.field3383 * -1031683529 * 1792775047;
                     int var5 = class923.local.field3385 - var0.field3385;
                     if (var5 < 0) {
                        var5 = -var5;
                     }

                     if (var5 > var4) {
                        var3 = false;
                     }
                  }

                  String var9 = class730.field2926 == class469.field7320 ? class814.field4802.method2927(class321.field1066, -875414210) : class814.field4785.method2927(class321.field1066, -875414210);
                  if (var0.field3385 >= var0.field3392) {
                     var6 = var0.method1993(true, -1760788524) + (var3 ? class637.method5935(var0.field3385, class923.local.field3385, (byte)4) : class56.method1545(16777215, -1771684039)) + class822.field9046 + var9 + var0.field3385 + class822.field9049;
                  } else {
                     var6 = var0.method1993(true, -2010483537) + (var3 ? class637.method5935(var0.field3385, class923.local.field3385, (byte)4) : class56.method1545(16777215, -1929125845)) + class822.field9046 + var9 + var0.field3385 + "+" + (var0.field3392 - var0.field3385) + class822.field9049;
                  }
               } else if (-1 == var0.field3384 * -1214139113) {
                  var6 = var0.method1993(true, -1641888806);
               } else {
                  var6 = var0.method1993(true, -2028633086) + class822.field9046 + class814.field4786.method2927(class321.field1066, -875414210) + var0.field3384 + class822.field9049;
               }

               if (class730.field2817 && !var1 && (class568.field645 & 8) != 0) {
                  class984.method1875(class730.field2820, class730.field2735 + " " + class822.field9048 + " " + class56.method1545(16777215, -1806308451) + var6, class175.field5075, 15, -1, (long)var0.field4028, 0, 0, true, false, (long)var0.field4028, false, -2028889244);
               }

               if (var1) {
                  class984.method1875(class56.method1545(13421772, -1997294576) + var6, "", -1, -1, 0, 0L, 0, 0, false, true, (long)var0.field4028, false, -1271989822);
               } else {
                  for(int var10 = 7; var10 >= 0; --var10) {
                     if (class730.field2801[var10] != null) {
                        short var11 = 0;
                        if (class730.field2926 == class469.field7324 && class730.field2801[var10].equalsIgnoreCase(class814.field4780.method2927(class321.field1066, -875414210))) {
                           if (class730.field2796 && var0.field3385 > class923.local.field3385) {
                              var11 = 2000;
                           }

                           if (class923.local.field3387 != 0 && var0.field3387 != 0) {
                              if (var0.field3387 == class923.local.field3387) {
                                 var11 = 2000;
                              } else {
                                 var11 = 0;
                              }
                           } else if (var0.field3401) {
                              var11 = 2000;
                           }
                        } else if (class730.field2802[var10]) {
                           var11 = 2000;
                        }

                        short var13 = (short)(var11 + class730.field2799[var10]);
                        int var7 = -1 != class730.field2886[var10] ? class730.field2886[var10] : class730.field2671 * -802224543 * 1395924385;
                        class984.method1875(class730.field2801[var10], class56.method1545(16777215, -1822012281) + var6, var7, var13, -1, (long)var0.field4028, 0, 0, true, false, (long)var0.field4028, false, -1451194858);
                     }
                  }
               }

               if (!var1) {
                  for(class357 var12 = (class357)class602.field8647.method901(1766612795); var12 != null; var12 = (class357)class602.field8647.method906(49146)) {
                     if (23 == var12.field1702) {
                        var12.field1709 = class56.method1545(16777215, -1702215598) + var6;
                        break;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "acj.bk(" + ')');
      }
   }
}
