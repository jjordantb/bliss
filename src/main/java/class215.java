public class class215 {
   public static int field7205 = 6;
   static class245 field7206;

   class215() throws Throwable {
      throw new Error();
   }

   static final void method3833(class744 var0, byte var1) {
      try {
         var0.field3157[++var0.field3158 - 1] = var0.field3151[var0.field3174[var0.field3176]];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ps.ap(" + ')');
      }
   }

   public static short[] method3834(short[] var0, byte var1) {
      try {
         if (var0 == null) {
            return null;
         } else {
            short[] var2 = new short[var0.length];
            System.arraycopy(var0, 0, var2, 0, var0.length);
            return var2;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ps.f(" + ')');
      }
   }

   public static boolean method3835(int var0, int[] var1, int var2) {
      try {
         if (class866.field9767[var0]) {
            return true;
         } else {
            class382.widgetContainers[var0] = class886.method6167(var0, var1, class382.widgetContainers[var0], false, (byte)3);
            if (class382.widgetContainers[var0] == null) {
               return false;
            } else {
               class866.field9767[var0] = true;
               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ps.i(" + ')');
      }
   }
}
