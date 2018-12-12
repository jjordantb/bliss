import java.nio.ByteBuffer;
import java.util.Arrays;

public class class562 implements class925 {
   public int field822;
   public class971 field823;
   public int field824;
   public int field825;
   public class49 field826;
   public static class180 field827;

   public class7 method6197(int var1) {
      try {
         return class7.field4915;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "gl.f(" + ')');
      }
   }

   public class7 method6198() {
      return class7.field4915;
   }

   class562(int var1, class971 var2, class49 var3, int var4, int var5) {
      this.field824 = var1 * -1500420259;
      this.field823 = var2;
      this.field826 = var3;
      this.field825 = var4 * -455546715;
      this.field822 = -463734461 * var5;
   }

   public class7 method6199() {
      return class7.field4915;
   }

   static final void method809(class564 var0, class131 var1, class744 var2, byte var3) {
      try {
         String var4 = (String)var2.field3157[(var2.field3158 -= 969361751) * -203050393];
         if (class960.method2212(var4, var2, -172692776) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field934 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "gl.ln(" + ')');
      }
   }

   static final void method810(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)76);
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var3.field895 * 1045422783;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "gl.rv(" + ')');
      }
   }

   static final void method811(class744 var0, int var1) {
      try {
         var0.field3156 -= -1567522756;
         class671.method4237(var0.field3161[var0.field3156 * 681479919], var0.field3161[1 + var0.field3156 * 681479919], var0.field3161[681479919 * var0.field3156 + 2], var0.field3161[3 + 681479919 * var0.field3156], true, 256, 1228357249);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "gl.tk(" + ')');
      }
   }

   public static Object method812(byte[] var0, boolean var1, short var2) {
      try {
         if (var0 == null) {
            return null;
         } else if (var0.length > 136) {
            ByteBuffer var3 = ByteBuffer.allocateDirect(var0.length);
            var3.position(0);
            var3.put(var0);
            return var3;
         } else {
            return var1 ? Arrays.copyOf(var0, var0.length) : var0;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "gl.a(" + ')');
      }
   }
}
