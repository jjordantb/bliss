import java.awt.Font;

public final class class56 {
   static int[] field2312 = new int[4096];
   static int field2313 = 128;
   static int[][] field2314 = new int[128][128];
   static int[] field2315 = new int[4096];
   static int field2316;
   static int field2317 = 128;
   static int[][] field2318 = new int[128][128];
   static int field2319 = 4095;
   static Font field2320;
   public static class451 field2321;

   class56() throws Throwable {
      throw new Error();
   }

   public static String method1545(int var0, int var1) {
      try {
         return "<col=" + Integer.toHexString(var0) + ">";
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lv.f(" + ')');
      }
   }

   public static void method1546(int var0, byte var1) {
      try {
         class689 var2 = (class689)class371.field1088.method2942((long)var0);
         if (var2 != null) {
            var2.field7630.method1370((byte)57);
            class176.method3166(var2.field7628, var2.field7627, 1982223094);
            var2.method545(-1460969981);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lv.b(" + ')');
      }
   }

   static final void method1547(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         class423.method5710(var3, var0, 378164107);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lv.cx(" + ')');
      }
   }

   static final void method1548(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (var0 - var2 >= class381.field1416 && var0 + var2 <= class381.field1413 && var1 - var2 >= class381.field1414 && var2 + var1 <= class381.field1415) {
            class945.method2009(var0, var1, var2, var3, var4, var5, 1691112571);
         } else {
            class673.method4260(var0, var1, var2, var3, var4, var5, (byte)55);
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "lv.u(" + ')');
      }
   }

   public static int method1549(int var0, int var1, int var2) {
      try {
         int var3;
         if (var1 > var0) {
            var3 = var0;
            var0 = var1;
            var1 = var3;
         }

         while(var1 != 0) {
            var3 = var0 % var1;
            var0 = var1;
            var1 = var3;
         }

         return var0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lv.f(" + ')');
      }
   }

   static void method1550(MenuItem var0, byte var1) {
      try {
         if (!class602.field8645) {
            var0.method545(-1460969981);
            --class602.field8673;
            if (!var0.field1708) {
               long var2 = var0.field1706;

               class497 var4;
               for(var4 = (class497)class602.field8637.method2942(var2); var4 != null && !var4.field8122.equals(var0.name); var4 = (class497)class602.field8637.method2943(-1565779381)) {
                  ;
               }

               if (var4 != null && var4.method4502(var0, -948596623)) {
                  class456.method3794(var4, -2092429244);
               }
            } else {
               for(class497 var5 = (class497)class602.field8649.method2706(-1184499761); var5 != null; var5 = (class497)class602.field8649.method2707(79001809)) {
                  if (var5.field8122.equals(var0.name)) {
                     boolean var6 = false;

                     for(MenuItem var8 = (MenuItem)var5.field8121.method2706(-611796752); var8 != null; var8 = (MenuItem)var5.field8121.method2707(241315594)) {
                        if (var8 == var0) {
                           if (var5.method4502(var0, -948596623)) {
                              class456.method3794(var5, -1144026748);
                           }

                           var6 = true;
                           break;
                        }
                     }

                     if (var6) {
                        if (var1 != 2) {
                           ;
                        }
                        break;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "lv.m(" + ')');
      }
   }
}
