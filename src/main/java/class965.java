public final class class965 {
   static char[] field2532 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   static long[] field2533 = new long[12];
   static class613 field2534;
   static int field2535;

   static {
      for(int var0 = 0; var0 < field2533.length; ++var0) {
         field2533[var0] = (long)Math.pow(37.0D, (double)var0);
      }

   }

   class965() throws Throwable {
      throw new Error();
   }

   public static void method1716(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         class563 var8 = null;

         for(class563 var9 = (class563)class563.field1071.method901(1766612795); var9 != null; var9 = (class563)class563.field1071.method906(49146)) {
            if (2108312995 * var9.field1070 == var0 && 634196087 * var9.field1069 == var1 && -2146829167 * var9.field1074 == var2 && var3 == -431456739 * var9.field1076) {
               var8 = var9;
               break;
            }
         }

         if (var8 == null) {
            var8 = new class563();
            var8.field1070 = var0 * -196260341;
            var8.field1076 = var3 * 1088435253;
            var8.field1069 = 656787783 * var1;
            var8.field1074 = var2 * 284247153;
            if (var1 >= 0 && var2 >= 0 && var1 < class730.field2697.method5271(-1908372692) && var2 < class730.field2697.method5272(629047644)) {
               class118.method1468(var8, -162957807);
            }

            class563.field1071.method897(var8, 1633204361);
         }

         var8.field1075 = 240885009 * var4;
         var8.field1072 = var5 * 998055383;
         var8.field1068 = 1034640391 * var6;
         var8.field1078 = true;
         var8.field1079 = false;
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "rk.a(" + ')');
      }
   }

   static final void method1717(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class730.field2902[var2].field10623 * 1383593425;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rk.yf(" + ')');
      }
   }

   public static final void method1718(int var0) {
      try {
         class563 var1;
         for(var1 = (class563)class563.field1071.method901(1766612795); var1 != null; var1 = (class563)class563.field1071.method906(49146)) {
            if (!var1.field1079) {
               var1.field1078 = true;
               if (634196087 * var1.field1069 >= 0 && var1.field1074 * -2146829167 >= 0 && 634196087 * var1.field1069 < class730.field2697.method5271(-1871526843) && var1.field1074 * -2146829167 < class730.field2697.method5272(-1895886966)) {
                  class118.method1468(var1, 147943234);
               }
            } else {
               var1.method545(-1460969981);
            }
         }

         for(var1 = (class563)class563.field1081.method901(1766612795); var1 != null; var1 = (class563)class563.field1081.method906(49146)) {
            if (!var1.field1079) {
               var1.field1078 = true;
            } else {
               var1.method545(-1460969981);
            }
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "rk.b(" + ')');
      }
   }
}
