public class class255 {
   public String field8114;
   public String field8115;
   String field8116;
   public int field8117;
   public String field8118;
   public byte field8119;

   static final void method4495(class564 var0, class131 var1, class744 var2, byte var3) {
      try {
         String var4 = (String)var2.field3157[(var2.field3158 -= 969361751) * -203050393];
         int[] var5 = class960.method2212(var4, var2, -1009686334);
         if (var5 != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field882 = class634.method5872(var4, var2, -2046058202);
         var0.field985 = var5;
         var0.field963 = true;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ah.oo(" + ')');
      }
   }

   static final void method4496(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = Client.field2902[var2].method6658((byte)8);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ah.yc(" + ')');
      }
   }

   static final void method4497(class744 var0, int var1) {
      try {
         var0.field3156 -= -1175642067;
         int var2 = var0.field3161[681479919 * var0.field3156];
         int var3 = var0.field3161[var0.field3156 * 681479919 + 1];
         int var4 = var0.field3161[2 + var0.field3156 * 681479919];
         class740.method1920(1, var2 << 16 | var3, var4, "", -172660954);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ah.alj(" + ')');
      }
   }

   static class485 method4498(class907 var0, int var1) {
      try {
         return new class485(var0.method6367(1844791454), var0.method6367(1564642079), var0.method6367(1940740922), var0.method6367(1868310527), var0.method6390((byte)51), var0.method6390((byte)-10), var0.method6371());
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ah.r(" + ')');
      }
   }

   static void method4499(class848 var0, int var1) {
      try {
         if ((class602.field8673 * -278777595 >= 2 || Client.field2817) && Client.field2832 == null) {
            String var2;
            if (Client.field2817 && -278777595 * class602.field8673 < 2) {
               var2 = Client.field2820 + class814.field4790.method2927(class321.field1066, -875414210) + Client.field2735 + " " + class822.field9048;
            } else if (class118.method1458((byte)122) && -278777595 * class602.field8673 > 2) {
               var2 = class342.method217(class713.field3542, 2135114234);
            } else {
               class357 var3 = class713.field3542;
               if (var3 == null) {
                  return;
               }

               var2 = class342.method217(var3, 2142692033);
               int[] var4 = class166.method3683(var3, (byte)-32);
               if (var4 != null) {
                  var2 = var2 + class82.method918(var4, (byte)1);
               }
            }

            if (-278777595 * class602.field8673 > 2) {
               var2 = var2 + class56.method1545(16777215, -1452738255) + " / " + (class602.field8673 * -278777595 - 2) + class814.field4688.method2927(class321.field1066, -875414210);
            }

            if (class602.field8653 != null) {
               class727 var6 = class602.field8653.method822(class785.field3827, Client.field2681, 2046154242);
               if (var6 == null) {
                  var6 = class501.field3182;
               }

               var6.method1673(var2, -828992241 * class602.field8654, 1604938967 * class602.field8669, -2093041337 * class602.field8653.field881, class602.field8653.field887 * 457937409, 1045422783 * class602.field8653.field895, -2065110161 * class602.field8653.field976, 872550387 * class602.field8653.field939, -1594110459 * class602.field8653.field849, Client.field2683, 1401020893 * class880.field10188, Client.field2881, class602.field8668, class755.field4199, -1153250817);
               class431.method4254(Client.field2881[0], Client.field2881[1], Client.field2881[2], Client.field2881[3], (byte)2);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ah.ay(" + ')');
      }
   }
}
