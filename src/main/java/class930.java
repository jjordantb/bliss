public class class930 extends class138 {
   int field10300;
   int field10301;
   int field10302;
   static int field10303 = 1;
   int field10304;
   int field10305;
   int field10306;
   int field10307;
   int field10308;

   void method991(int var1, int var2, byte var3) {
      try {
         int var4 = var1 * this.field10301 >> 12;
         int var5 = this.field10302 * var2 >> 12;
         int var6 = this.field10308 * var1 >> 12;
         int var7 = this.field10304 * var2 >> 12;
         int var8 = this.field10305 * var1 >> 12;
         int var9 = this.field10306 * var2 >> 12;
         int var10 = this.field10300 * var1 >> 12;
         int var11 = this.field10307 * var2 >> 12;
         class312.method420(var4, var5, var6, var7, var8, var9, var10, var11, super.field1169, (byte)-73);
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "yy.a(" + ')');
      }
   }

   class930(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(-1, var9, var10);
      this.field10301 = var1;
      this.field10302 = var2;
      this.field10308 = var3;
      this.field10304 = var4;
      this.field10305 = var5;
      this.field10306 = var6;
      this.field10300 = var7;
      this.field10307 = var8;
   }

   void method985(int var1, int var2, byte var3) {
   }

   void method984(int var1, int var2, byte var3) {
   }

   static final void method6269(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-58);
         var0.field3161[++var0.field3156 - 1] = var3.field894;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "yy.rq(" + ')');
      }
   }

   static final int method6270(int var0, int var1, int var2, int var3) {
      try {
         if (var1 == var0) {
            return var0;
         } else {
            int var4 = 128 - var2;
            int var5 = var2 * (var1 & 127) + var4 * (var0 & 127) >> 7;
            int var6 = var4 * (var0 & 896) + (var1 & 896) * var2 >> 7;
            int var7 = (var0 & 'ﰀ') * var4 + var2 * (var1 & 'ﰀ') >> 7;
            return var7 & 'ﰀ' | var6 & 896 | var5 & 127;
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "yy.c(" + ')');
      }
   }
}
