public class class489 {
   class478 field8409;
   class325 field8410;
   class1 field8411 = new class1(256);

   class489(class325 var1, class478 var2) {
      this.field8410 = var1;
      this.field8409 = var2;
   }

   class801 method4724(int var1, int var2) {
      long var3 = (long)(var2 << 16 | var1);
      Object var5 = this.field8411.method2974(var3);
      if (var5 != null) {
         return (class801)var5;
      } else if (!this.field8409.method4621(var1, (short)28916)) {
         return null;
      } else {
         class414 var6 = this.field8409.method4625(var1, 828461869);
         if (var2 == -1) {
            var2 = var6.field9372 ? 64 : this.field8410.field715;
         }

         class801 var8;
         if (var6.field9397 && this.field8410.method4883()) {
            float[] var9 = this.field8409.method4632(var1, 0.7F, var2, var2, false, (byte)-110);
            var8 = this.field8410.method611(class264.field8191, var2, var2, true, var9);
         } else {
            int[] var7;
            if (var6.field9382 * -2138060883 != 2 && class355.method1414(var6.field9383, -2037069646)) {
               var7 = this.field8409.method4622(var1, 0.7F, var2, var2, true, -470804931);
            } else {
               var7 = this.field8409.method4623(var1, 0.7F, var2, var2, false, (byte)2);
            }

            var8 = this.field8410.method609(var2, var2, true, var7);
         }

         var8.method2849(var6.field9394, var6.field9395);
         this.field8411.method2984(var8, var3);
         return var8;
      }
   }

   void method4725() {
      this.field8411.method2976(5, -1019724952);
   }

   void method4726() {
      this.field8411.method2977();
   }

   class801 method4727(int var1) {
      return this.method4724(var1, -1);
   }
}
