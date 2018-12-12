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

   static void method1159(class946 var0, boolean var1, int var2) {
      try {
         if (-278777595 * class602.field8673 < 410) {
            if (var0 == class923.field10295) {
               if (Client.field2817 && (class568.field645 * -112110875 & 16) != 0) {
                  class984.method1875(Client.field2820, Client.field2735 + " " + class822.field9048 + " " + class56.method1545(16777215, -1880818524) + class814.field4796.method2927(class321.field1066, -875414210), class175.field5075 * 697885143, 16, -1, 0L, 0, 0, true, false, (long)(1888274983 * var0.field4028), false, -1698066743);
               }
            } else {
               String var6;
               if (var0.field3384 == 0) {
                  boolean var3 = true;
                  if (-1 != class923.field10295.field3383 * 1792775047 && -1 != 1792775047 * var0.field3383) {
                     int var4 = 1792775047 * class923.field10295.field3383 < var0.field3383 * 1792775047 ? 1792775047 * class923.field10295.field3383 : var0.field3383 * 1792775047;
                     int var5 = 696798311 * class923.field10295.field3385 - 696798311 * var0.field3385;
                     if (var5 < 0) {
                        var5 = -var5;
                     }

                     if (var5 > var4) {
                        var3 = false;
                     }
                  }

                  String var9 = Client.field2926 == class469.field7320 ? class814.field4802.method2927(class321.field1066, -875414210) : class814.field4785.method2927(class321.field1066, -875414210);
                  if (var0.field3385 * 696798311 >= var0.field3392 * 1868645317) {
                     var6 = var0.method1993(true, -1760788524) + (var3 ? class637.method5935(var0.field3385 * 696798311, 696798311 * class923.field10295.field3385, (byte)4) : class56.method1545(16777215, -1771684039)) + class822.field9046 + var9 + var0.field3385 * 696798311 + class822.field9049;
                  } else {
                     var6 = var0.method1993(true, -2010483537) + (var3 ? class637.method5935(var0.field3385 * 696798311, 696798311 * class923.field10295.field3385, (byte)4) : class56.method1545(16777215, -1929125845)) + class822.field9046 + var9 + 696798311 * var0.field3385 + "+" + (1868645317 * var0.field3392 - var0.field3385 * 696798311) + class822.field9049;
                  }
               } else if (-1 == var0.field3384) {
                  var6 = var0.method1993(true, -1641888806);
               } else {
                  var6 = var0.method1993(true, -2028633086) + class822.field9046 + class814.field4786.method2927(class321.field1066, -875414210) + var0.field3384 * 242930343 + class822.field9049;
               }

               if (Client.field2817 && !var1 && (-112110875 * class568.field645 & 8) != 0) {
                  class984.method1875(Client.field2820, Client.field2735 + " " + class822.field9048 + " " + class56.method1545(16777215, -1806308451) + var6, 697885143 * class175.field5075, 15, -1, (long)(1888274983 * var0.field4028), 0, 0, true, false, (long)(1888274983 * var0.field4028), false, -2028889244);
               }

               if (var1) {
                  class984.method1875(class56.method1545(13421772, -1997294576) + var6, "", -1, -1, 0, 0L, 0, 0, false, true, (long)(var0.field4028 * 1888274983), false, -1271989822);
               } else {
                  for(int var10 = 7; var10 >= 0; --var10) {
                     if (Client.field2801[var10] != null) {
                        short var11 = 0;
                        if (Client.field2926 == class469.field7324 && Client.field2801[var10].equalsIgnoreCase(class814.field4780.method2927(class321.field1066, -875414210))) {
                           if (Client.field2796 && var0.field3385 * 696798311 > class923.field10295.field3385 * 696798311) {
                              var11 = 2000;
                           }

                           if (class923.field10295.field3387 * -1473655357 != 0 && -1473655357 * var0.field3387 != 0) {
                              if (var0.field3387 * -1473655357 == class923.field10295.field3387 * -1473655357) {
                                 var11 = 2000;
                              } else {
                                 var11 = 0;
                              }
                           } else if (var0.field3401) {
                              var11 = 2000;
                           }
                        } else if (Client.field2802[var10]) {
                           var11 = 2000;
                        }

                        short var13 = (short)(var11 + Client.field2799[var10]);
                        int var7 = -1 != Client.field2886[var10] ? Client.field2886[var10] : Client.field2671 * 1395924385;
                        class984.method1875(Client.field2801[var10], class56.method1545(16777215, -1822012281) + var6, var7, var13, -1, (long)(1888274983 * var0.field4028), 0, 0, true, false, (long)(var0.field4028 * 1888274983), false, -1451194858);
                     }
                  }
               }

               if (!var1) {
                  for(class357 var12 = (class357)class602.field8647.method901(1766612795); var12 != null; var12 = (class357)class602.field8647.method906(49146)) {
                     if (23 == 946432351 * var12.field1702) {
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
