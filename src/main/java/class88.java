public class class88 extends class913 {
   int field1141;
   class169 field1142;
   int field1143;
   int field1144;
   class13 field1145;
   int field1146;
   int field1147;
   int field1148;
   static int[] field1149 = new int[6];
   static int[][] field1150 = new int[6][];

   class88(class13 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field1145 = var1;
      this.field1148 = var4;
      this.field1146 = var5;
      this.field1141 = var6;
      this.field1143 = var7;
      this.field1147 = var2;
      this.field1144 = var3;
   }

   class169 method6478() {
      if (this.field1142 == null) {
         class478 var1 = this.field1145.field8581;
         field1149[0] = this.field1147;
         field1149[1] = this.field1144;
         field1149[2] = this.field1148;
         field1149[3] = this.field1146;
         field1149[4] = this.field1141;
         field1149[5] = this.field1143;
         boolean var2 = false;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < 6; ++var4) {
            if (!var1.method4621(field1149[var4], (short)24122)) {
               return null;
            }

            class414 var5 = var1.method4625(field1149[var4], 730950560);
            int var6 = var5.field9372 ? 64 : 128;
            if (var6 > var3) {
               var3 = var6;
            }

            if (var5.field9391 > 0) {
               var2 = true;
            }
         }

         for(var4 = 0; var4 < 6; ++var4) {
            field1150[var4] = var1.method4622(field1149[var4], 1.0F, var3, var3, false, 1735234411);
         }

         this.field1142 = new class169(this.field1145, class264.field8194, class482.field8399, var3, var2, field1150);
      }

      return this.field1142;
   }
}
