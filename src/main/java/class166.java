public class class166 {
   static int field6893 = 63;
   static int field6894 = 7;
   public static int field6895;
   public static Object[] field6896;
   public static class48 field6897;
   static class856 field6898;

   class166() throws Throwable {
      throw new Error();
   }

   public static void method3682(int var0, int var1, boolean var2, int var3) {
      try {
         if (class371.field1088.method2942((long)var0) == null) {
            if (!Client.field2787) {
               class176.method3166(var0, var2, 1982223094);
            } else {
               class689 var4 = new class689(var0, new class957(4096, class16.field6892, var0), var1, var2);
               var4.field7630.method1363(class321.field1066.method5705(1748854882), (byte)104);
               class371.field1088.method2947(var4, (long)var0);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "n.a(" + ')');
      }
   }

   static int[] method3683(class357 var0, byte var1) {
      try {
         int[] var2 = null;
         if (class745.method2593(946432351 * var0.field1702, (short)300)) {
            var2 = class85.field1121.method1566((int)(var0.field1701 * 2236412381003659263L)).field4285;
         } else if (-1 != var0.field1700 * -149710173) {
            var2 = class85.field1121.method1566(var0.field1700 * -149710173).field4285;
         } else if (class717.method2030(946432351 * var0.field1702, -838004269)) {
            class437 var3 = (class437) Client.field2677.method2942((long)((int)(2236412381003659263L * var0.field1701)));
            if (var3 != null) {
               class60 var4 = (class60)var3.field7515;
               class401 var5 = var4.field1637;
               if (var5.field9924 != null) {
                  var5 = var5.method6110(class827.field9037, 2033982126);
               }

               if (var5 != null) {
                  var2 = var5.field9867;
               }
            }
         } else if (class769.method2260(var0.field1702 * 946432351, (byte)-114)) {
            class50 var7 = Client.field2697.method5283(150013546).method4713((int)(2236412381003659263L * var0.field1701 >>> 32 & 2147483647L));
            if (var7.field2198 != null) {
               var7 = var7.method1487(class827.field9037, 1956265286);
            }

            if (var7 != null) {
               var2 = var7.field2202;
            }
         }

         return var2;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "n.ag(" + ')');
      }
   }

   static final void method3684(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class317.method469(var3, var0, -2024770880);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "n.qm(" + ')');
      }
   }
}