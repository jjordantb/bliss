public class class624 {
   int field9756;
   static int field9757 = 22050;
   int field9758;
   class380[] field9759 = new class380[10];

   class624(class907 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.method6371();
         if (var3 != 0) {
            var1.field10376 -= 116413311;
            this.field9759[var2] = new class380();
            this.field9759[var2].method1115(var1);
         }
      }

      this.field9758 = var1.method6374();
      this.field9756 = var1.method6374();
   }

   public class656 method5834() {
      byte[] var1 = this.method5836();
      return new class656(22050, var1, 22050 * this.field9758 / 1000, 22050 * this.field9756 / 1000);
   }

   public final int method5835() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field9759[var2] != null && this.field9759[var2].field1483 / 20 < var1) {
            var1 = this.field9759[var2].field1483 / 20;
         }
      }

      if (this.field9758 < this.field9756 && this.field9758 / 20 < var1) {
         var1 = this.field9758 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.field9759[var2] != null) {
               this.field9759[var2].field1483 -= var1 * 20;
            }
         }

         if (this.field9758 < this.field9756) {
            this.field9758 -= var1 * 20;
            this.field9756 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] method5836() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field9759[var2] != null && this.field9759[var2].field1482 + this.field9759[var2].field1483 > var1) {
            var1 = this.field9759[var2].field1482 + this.field9759[var2].field1483;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.field9759[var4] != null) {
               int var5 = this.field9759[var4].field1482 * 22050 / 1000;
               int var6 = this.field9759[var4].field1483 * 22050 / 1000;
               int[] var7 = this.field9759[var4].method1116(var5, this.field9759[var4].field1482);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public static class624 method5837(class180 var0, int var1, int var2) {
      byte[] var3 = var0.method3285(var1, var2, (byte)-90);
      return var3 == null ? null : new class624(new class907(var3));
   }
}
