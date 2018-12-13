public class class542 extends Node {
   int field3943;
   int field3944;
   int field3945;
   int field3946;
   int field3947;
   int field3948;
   int field3949;
   int field3950;
   int field3951;

   boolean method2470(int var1, int var2, int var3, int var4) {
      try {
         return this.field3950 == var1 && var2 >= this.field3945 && var2 <= this.field3946 && var3 >= this.field3948 && var3 <= this.field3944;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aca.f(" + ')');
      }
   }

   boolean method2471(int var1, int var2, int var3) {
      try {
         return var1 >= this.field3945 && var1 <= this.field3946 && var2 >= this.field3948 && var2 <= this.field3944;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aca.a(" + ')');
      }
   }

   boolean method2472(int var1, int var2, byte var3) {
      try {
         return var1 >= this.field3943 && var1 <= this.field3947 && var2 >= this.field3949 && var2 <= this.field3951;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aca.b(" + ')');
      }
   }

   void method2473(int var1, int var2, int[] var3, int var4) {
      try {
         var3[0] = this.field3950;
         var3[1] = this.field3945 - this.field3943 + var1;
         var3[2] = var2 + (this.field3948 - this.field3949);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aca.p(" + ')');
      }
   }

   class542(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.field3950 = var1;
      this.field3945 = var2;
      this.field3948 = var3;
      this.field3946 = var4;
      this.field3944 = var5;
      this.field3943 = var6;
      this.field3949 = var7;
      this.field3947 = var8;
      this.field3951 = var9;
   }

   void method2474(int var1, int var2, int[] var3, int var4) {
      try {
         var3[0] = 0;
         var3[1] = this.field3943 - this.field3945 + var1;
         var3[2] = this.field3949 - this.field3948 + var2;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aca.i(" + ')');
      }
   }
}
