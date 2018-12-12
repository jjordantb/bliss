public class class719 {
   int field3481;
   int field3482;
   int field3483;
   int field3484;
   int field3485;
   int field3486;
   int field3487;
   int field3488;
   int field3489;
   int field3490;

   class719(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.field3486 = var1;
      this.field3481 = var2;
      this.field3483 = var3;
      this.field3484 = var4 * var4;
      this.field3485 = this.field3486 + var5;
      this.field3489 = this.field3486 + var6;
      this.field3487 = this.field3481 + var7;
      this.field3482 = this.field3481 + var8;
      this.field3488 = this.field3483 + var9;
      this.field3490 = this.field3483 + var10;
   }

   public boolean method2058(int var1, int var2, int var3) {
      if (var1 >= this.field3485 && var1 <= this.field3489) {
         if (var2 >= this.field3487 && var2 <= this.field3482) {
            if (var3 >= this.field3488 && var3 <= this.field3490) {
               int var4 = var1 - this.field3486;
               int var5 = var3 - this.field3483;
               return var4 * var4 + var5 * var5 < this.field3484;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   void method2059(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.field3486 = var1;
      this.field3481 = var2;
      this.field3483 = var3;
      this.field3484 = var4 * var4;
      this.field3485 = this.field3486 + var5;
      this.field3489 = this.field3486 + var6;
      this.field3487 = this.field3481 + var7;
      this.field3482 = this.field3481 + var8;
      this.field3488 = this.field3483 + var9;
      this.field3490 = this.field3483 + var10;
   }
}
