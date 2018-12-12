public class class960 extends class568 {
   int field3643 = Integer.MIN_VALUE;
   int field3644 = Integer.MIN_VALUE;
   int field3645 = Integer.MAX_VALUE;
   class392 field3646;
   int field3647 = Integer.MAX_VALUE;
   int field3648 = Integer.MIN_VALUE;
   int field3649 = Integer.MAX_VALUE;
   int field3650 = Integer.MIN_VALUE;
   int field3651 = Integer.MAX_VALUE;

   boolean method2211(int var1, int var2, byte var3) {
      try {
         if (var1 >= this.field3649 && var1 <= this.field3644 && var2 >= this.field3645 && var2 <= this.field3650) {
            return true;
         } else {
            return var1 >= this.field3651 && var1 <= this.field3648 && var2 >= this.field3647 && var2 <= this.field3643;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aaj.a(" + ')');
      }
   }

   class960(class392 var1) {
      this.field3646 = var1;
   }

   static final int[] method2212(String var0, class744 var1, int var2) {
      try {
         int[] var3 = null;
         if (var0.length() > 0 && var0.charAt(var0.length() - 1) == 'Y') {
            int var4 = var1.field3161[--var1.field3156];
            if (var4 > 0) {
               for(var3 = new int[var4]; var4-- > 0; var3[var4] = var1.field3161[--var1.field3156]) {
                  ;
               }
            }
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aaj.kl(" + ')');
      }
   }
}
