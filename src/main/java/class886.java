import java.nio.ByteBuffer;
import java.util.Arrays;

public class class886 {
   static int field10133 = -1;
   static int field10134 = 2;
   public static int field10135;
   static boolean field10136 = false;
   static int field10137 = 1;

   class886() throws Throwable {
      throw new Error();
   }

   static final void method6165(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class256 var3 = (class256) Client.field2823.method2942((long)var2);
         if (var3 != null) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 1;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "oc.rx(" + ')');
      }
   }

   public static byte[] method6166(Object var0, boolean var1, int var2) {
      try {
         if (var0 == null) {
            return null;
         } else if (var0 instanceof byte[]) {
            byte[] var6 = (byte[])var0;
            return var1 ? Arrays.copyOf(var6, var6.length) : var6;
         } else if (var0 instanceof ByteBuffer) {
            ByteBuffer var3 = (ByteBuffer)var0;
            byte[] var4 = new byte[var3.capacity()];
            var3.position(0);
            var3.get(var4);
            return var4;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "oc.f(" + ')');
      }
   }

   public static class131 method6167(int var0, int[] var1, class131 var2, boolean var3, byte var4) {
      try {
         if (!class91.field562.method3261(var0, 2091513640)) {
            return null;
         } else {
            int var5 = class91.field562.method3286(var0, -1254954272);
            class564[] var6;
            if (var5 == 0) {
               var6 = new class564[0];
            } else if (var2 == null) {
               var6 = new class564[var5];
            } else {
               var6 = var2.field1103;
            }

            if (var2 == null) {
               var2 = new class131(var3, var6);
            } else {
               var2.field1103 = var6;
               var2.field1101 = var3;
            }

            for(int var7 = 0; var7 < var5; ++var7) {
               if (var2.field1103[var7] == null) {
                  byte[] var8 = class91.field562.method3259(var0, var7, var1, -1925510913);
                  if (var8 != null) {
                     class564 var9 = var2.field1103[var7] = new class564();
                     var9.field867 = (var7 + (var0 << 16)) * 533296807;
                     var9.method820(new class907(var8), 1142190823);
                  }
               }
            }

            return var2;
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "oc.k(" + ')');
      }
   }
}