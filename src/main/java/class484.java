public class class484 extends class304 {
   int field8517;
   static int field8518 = 1;
   int field8519;
   int field8520;
   static int field8521 = 0;
   int field8522;
   int field8523;
   int field8524;
   int field8525;
   int field8526;
   int field8527;
   int field8528;
   int field8529;
   int field8530;
   int field8531;
   static int field8532;

   class484(InputStream var1, int var2, int var3) {
      super(var1);
      int var4;
      if (var2 == 0) {
         var4 = var1.method6420((byte)-14);
         this.field8517 = var4 >>> 16;
         this.field8522 = var4 & '\uffff';
         this.field8520 = -1;
      } else {
         this.field8517 = -1;
         this.field8522 = -1;
         this.field8520 = var1.method6374();
      }

      if (var3 == 0) {
         var4 = var1.method6420((byte)26);
         this.field8528 = var4 >>> 16;
         this.field8526 = var4 & '\uffff';
         this.field8524 = -1;
      } else {
         this.field8528 = -1;
         this.field8526 = -1;
         this.field8524 = var1.method6374();
      }

      if (var2 == 0 && var3 == 0) {
         this.field8525 = var1.method6371();
      } else {
         this.field8525 = -1;
      }

      this.field8523 = var1.method6374();
      this.field8531 = var1.method6371();
      this.field8527 = var1.method6371();
      this.field8519 = var1.method6390((byte)75);
      this.field8530 = var1.method6374();
      this.field8529 = var1.method6371();
   }

   boolean method2387(int var1) {
      try {
         class745 var2 = class635.field9823.method1053(this.field8523, -1845152840);
         boolean var3 = var2.method2592((byte)118);
         Animation var4 = class936.field10313.method2256(var2.field4107, (byte)-64);
         var3 &= var4.method3561(1376129821);
         return var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "yu.p(" + ')');
      }
   }

   public void method2383(int var1) {
      try {
         int var2;
         int var3;
         int var4;
         if (this.field8517 >= 0) {
            var2 = 256 + this.field8517 * 512;
            var3 = 256 + this.field8522 * 512;
            var4 = this.field8525;
         } else {
            Actor var5 = class949.field3322[this.field8520].method6636(1024446891);
            class32 var6 = var5.method1511().field7637;
            var2 = (int)var6.field5296;
            var3 = (int)var6.field5299;
            var4 = var5.field3639;
         }

         int var10;
         int var11;
         if (this.field8522 >= 0) {
            var10 = this.field8528 * 512 + 256;
            var11 = this.field8526 * 512 + 256;
         } else {
            Actor var7 = class949.field3322[this.field8524].method6636(1821624579);
            class32 var8 = var7.method1511().field7637;
            var10 = (int)var8.field5296;
            var11 = (int)var8.field5299;
            if (var4 < 0) {
               var4 = var7.field3639;
            }
         }

         int var12 = this.field8529 << 2;
         class214 var13 = new class214(class730.field2697.method5317(-1611682495), this.field8523, var4, var4, var2, var3, this.field8531 << 2, class730.field2866, this.field8519 + class730.field2866, this.field8530, var12, this.field8520 + 1, 1 + this.field8524, this.field8527 << 2, false, 0);
         var13.method3782(var10, var11, this.field8527 << 2, class730.field2866 + this.field8519, 1057769456);
         class730.field2805.method897(new class107(var13), -428713736);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "yu.f(" + ')');
      }
   }

   static final void method4769(int[] var0, int var1, int var2, int var3, int var4) {
      try {
         --var1;
         --var2;

         for(int var5 = var2 - 7; var1 < var5; var0[var1] = var3) {
            ++var1;
            var0[var1] = var3;
            ++var1;
            var0[var1] = var3;
            ++var1;
            var0[var1] = var3;
            ++var1;
            var0[var1] = var3;
            ++var1;
            var0[var1] = var3;
            ++var1;
            var0[var1] = var3;
            ++var1;
            var0[var1] = var3;
            ++var1;
         }

         while(var1 <= var2) {
            ++var1;
            var0[var1] = var3;
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "yu.b(" + ')');
      }
   }
}
