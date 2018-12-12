public class class43 extends class347 {
   public static class180 field5088;
   public static int field5089 = -1;
   int field5090 = -1;
   int field5091;
   int field5092;
   int[] field5093;

   int method207(short var1) {
      try {
         return this.field5090;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "agy.q(" + ')');
      }
   }

   void method200(int var1) {
      try {
         super.method200(1881168514);
         this.field5093 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "agy.f(" + ')');
      }
   }

   boolean method3062(int var1) {
      try {
         if (this.field5093 != null) {
            return true;
         } else if (this.field5090 >= 0) {
            class922 var2 = field5089 >= 0 ? class922.method6242(field5088, field5089, this.field5090) : class922.method6234(field5088, this.field5090);
            var2.method6239();
            this.field5093 = var2.method6245();
            this.field5091 = var2.field10269;
            this.field5092 = var2.field10273;
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "agy.ac(" + ')');
      }
   }

   void method209(int var1, InputStream var2, byte var3) {
      try {
         if (var1 == 0) {
            this.field5090 = var2.method6374();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agy.r(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = super.field266.method162(var1, (byte)40);
         if (super.field266.field211 && this.method3062(-2021836506)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field5091 * (class322.field832 != this.field5092 ? this.field5092 * var1 / class322.field832 : var1);
            int var8;
            int var9;
            if (this.field5091 == class322.field831) {
               for(var8 = 0; var8 < class322.field831; ++var8) {
                  var9 = this.field5093[var7++];
                  var6[var8] = (var9 & 255) << 4;
                  var5[var8] = (var9 & '\uff00') >> 4;
                  var4[var8] = (var9 & 16711680) >> 12;
               }
            } else {
               for(var8 = 0; var8 < class322.field831; ++var8) {
                  var9 = var8 * this.field5091 / class322.field831;
                  int var10 = this.field5093[var9 + var7];
                  var6[var8] = (var10 & 255) << 4;
                  var5[var8] = (var10 & '\uff00') >> 4;
                  var4[var8] = (var10 & 16711680) >> 12;
               }
            }
         }

         return var3;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "agy.k(" + ')');
      }
   }

   public class43() {
      super(0, false);
   }

   static final void method3067(class744 var0, int var1) {
      try {
         if (class730.field2901 != null) {
            var0.field3157[++var0.field3158 - 1] = class730.field2901;
         } else {
            var0.field3157[++var0.field3158 - 1] = "";
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "agy.wj(" + ')');
      }
   }
}
