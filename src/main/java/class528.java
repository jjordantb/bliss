public class class528 {
   static int field3668 = 3;
   static int field3669 = 0;
   static int field3670 = 2;
   public static int field3671 = 1;

   class528() throws Throwable {
      throw new Error();
   }

   static final void method2241(class744 var0, byte var1) {
      try {
         if (class381.field1417.method1392(81, -841277867)) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 1;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lg.ade(" + ')');
      }
   }

   static boolean method2242(int var0, int var1, int var2, int var3) {
      try {
         class545 var4 = Client.field2697.method5317(-1611682495);
         boolean var5 = true;
         class265 var6 = (class265)var4.method2425(var0, var1, var2, 693483522);
         if (var6 != null) {
            var5 &= class511.method2616(var6, (byte)-60);
         }

         var6 = (class265)var4.method2429(var0, var1, var2, Client.field2942, 664102063);
         if (var6 != null) {
            var5 &= class511.method2616(var6, (byte)-4);
         }

         var6 = (class265)var4.method2452(var0, var1, var2, (byte)95);
         if (var6 != null) {
            var5 &= class511.method2616(var6, (byte)-3);
         }

         return var5;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "lg.k(" + ')');
      }
   }

   static final void method2243(class744 var0, int var1) {
      try {
         class602.field8666 = var0.field3161[(var0.field3156 -= -391880689) * 681479919] * 985311877;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lg.afn(" + ')');
      }
   }

   public static class125[] method2244(byte var0) {
      try {
         if (class495.field8098 == null) {
            class125[] var1 = class200.method4354(class382.field1409, (short)486);
            class125[] var2 = new class125[var1.length];
            int var3 = 0;
            int var4 = class615.field8903.field9132.method2605(-1747444886);

            label81:
            for(int var5 = 0; var5 < var1.length; ++var5) {
               class125 var6 = var1[var5];
               if (var6.field2326 * -1087459453 > 0 && -1087459453 * var6.field2326 < 24) {
                  if (var0 == 0) {
                     throw new IllegalStateException();
                  }
               } else if (var6.field2325 * 28445523 >= 800 && var6.field2327 * 262154323 >= 600) {
                  if (var4 == 2) {
                     if (var6.field2325 * 28445523 > 800) {
                        continue;
                     }

                     if (var6.field2327 * 262154323 > 600) {
                        if (var0 == 0) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  if (1 != var4 || var6.field2325 * 28445523 <= 1024 && var6.field2327 * 262154323 <= 768) {
                     for(int var7 = 0; var7 < var3; ++var7) {
                        class125 var8 = var2[var7];
                        if (var6.field2325 * 28445523 == 28445523 * var8.field2325 && 262154323 * var8.field2327 == 262154323 * var6.field2327) {
                           if (-1087459453 * var6.field2326 > -1087459453 * var8.field2326) {
                              var2[var7] = var6;
                           }
                           continue label81;
                        }
                     }

                     var2[var3] = var6;
                     ++var3;
                  }
               }
            }

            class495.field8098 = new class125[var3];
            System.arraycopy(var2, 0, class495.field8098, 0, var3);
            int[] var10 = new int[class495.field8098.length];

            for(int var11 = 0; var11 < class495.field8098.length; ++var11) {
               class125 var12 = class495.field8098[var11];
               var10[var11] = 28445523 * var12.field2325 * 262154323 * var12.field2327;
            }

            class564.method839(var10, class495.field8098, (byte)98);
         }

         return class495.field8098;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "lg.hm(" + ')');
      }
   }

   static final void method2245(int var0) {
      try {
         class563 var1;
         for(var1 = (class563)class563.field1071.method901(1766612795); var1 != null; var1 = (class563)class563.field1071.method906(49146)) {
            class640.method6187(var1, false, (byte)8);
         }

         for(var1 = (class563)class563.field1081.method901(1766612795); var1 != null; var1 = (class563)class563.field1081.method906(49146)) {
            class640.method6187(var1, true, (byte)8);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "lg.i(" + ')');
      }
   }

   static void method2246(int var0) {
      try {
         class95.field595 = 0;
         class95.field601 = 1129029761;
         class95.field593 = 1835291189;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "lg.f(" + ')');
      }
   }

   public static int method2247(byte[] var0, int var1, int var2) {
      try {
         return class182.method3306(var0, 0, var1, -1922082533);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lg.f(" + ')');
      }
   }
}
