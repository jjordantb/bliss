public class class11 {
   class11() throws Throwable {
      throw new Error();
   }

   static final void method3571(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int)(Client.field2626 * -5648129435911399733L >> 32);
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int)(Client.field2626 * -5648129435911399733L & -1L);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lk.ahf(" + ')');
      }
   }

   public static class12 method3572(int var0, int var1) {
      try {
         class12[] var2 = class734.method1820((byte)89);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class12 var4 = var2[var3];
            if (var0 == var4.field6679 * 1790024195) {
               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lk.f(" + ')');
      }
   }

   static final void method3573(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class906.field10363.method2713(var2, (short)-17718).method6653((short)-22372);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lk.adi(" + ')');
      }
   }

   public static void method3574(int var0) {
      try {
         if (class657.field9543 == null) {
            class657.field9543 = class431.method4251(-664645155);
            class776.field3728 = class657.field9543[0];
            class657.field9542 = class27.method3468((byte)1) * 3538585047679075717L;
         }

         if (class302.field3768 == null) {
            class848.method5065(-418466538);
         }

         class431 var1 = class776.field3728;
         int var2 = class176.method3172((byte)-86);
         if (class776.field3728 == var1) {
            class503.field4102 = class776.field3728.field7501.method2927(class321.field1066, -875414210);
            if (class776.field3728.field7502) {
               class657.field9548 = (360399239 * class776.field3728.field7503 + (-1620354451 * class776.field3728.field7504 - 360399239 * class776.field3728.field7503) * var2 / 100) * -1030314565;
            }

            if (class776.field3728.field7505) {
               class503.field4102 = class503.field4102 + class657.field9548 * 1131632499 + "%";
            }
         } else if (class776.field3728 == class431.field7499) {
            class302.field3768 = null;
            class967.method1750(19, 732690062);
         } else {
            class503.field4102 = var1.field7495.method2927(class321.field1066, -875414210);
            if (class776.field3728.field7505) {
               class503.field4102 = class503.field4102 + var1.field7504 * -1620354451 + "%";
            }

            class657.field9548 = 982601375 * var1.field7504;
            if (class776.field3728.field7502 || var1.field7502) {
               class657.field9542 = class27.method3468((byte)1) * 3538585047679075717L;
            }
         }

         if (class302.field3768 != null) {
            class302.field3768.method123(-4360787748556788915L * class657.field9542, class503.field4102, 1131632499 * class657.field9548, class776.field3728, -130919578);
            if (class657.field9544 != null) {
               for(int var3 = 1 + -1936794913 * class657.field9545; var3 < class657.field9544.length; ++var3) {
                  if (class657.field9544[var3].method6324((byte)31) >= 100 && -1936794913 * class657.field9545 == var3 - 1 && 12 != -1233866115 * Client.field2733 && class302.field3768.method115(-1321940215)) {
                     try {
                        class657.field9544[var3].method6315(-1481032979);
                     } catch (Exception var5) {
                        class657.field9544 = null;
                        break;
                     }

                     class302.field3768.method116(class657.field9544[var3], -847859584);
                     class657.field9545 += 64708895;
                     if (class657.field9545 * -1936794913 >= class657.field9544.length - 1 && class657.field9544.length > 1) {
                        class657.field9545 = (class965.field2534.method5204((byte)7) ? 0 : -1) * 64708895;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "lk.a(" + ')');
      }
   }
}
