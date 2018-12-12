public class class983 extends class347 {
   int field3146 = 0;
   static int field3147 = 0;
   static int field3148 = 4096;
   int field3149 = -1593028608;

   void method1888(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field3146 = var2.method6374() * 1298582163;
         break;
      case 1:
         this.field3149 = var2.method6374() * 2091520197;
      }

   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, -15447091);
         if (this.field270.field6612) {
            int[] var4 = this.method201(0, var1, -1887337990);

            for(int var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               int var6 = var4[var5];
               var3[var5] = var6 >= this.field3146 * 1295115163 && var6 <= 1628368397 * this.field3149 ? 4096 : 0;
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "ahu.i(" + ')');
      }
   }

   public class983() {
      super(1, true);
   }

   int[] method1889(int var1) {
      int[] var2 = this.field270.method3546(var1, 1989709916);
      if (this.field270.field6612) {
         int[] var3 = this.method201(0, var1, -1887337990);

         for(int var4 = 0; var4 < -1474554145 * class322.field831; ++var4) {
            int var5 = var3[var4];
            var2[var4] = var5 >= this.field3146 * 1295115163 && var5 <= 1628368397 * this.field3149 ? 4096 : 0;
         }
      }

      return var2;
   }

   int[] method1890(int var1) {
      int[] var2 = this.field270.method3546(var1, 1976104707);
      if (this.field270.field6612) {
         int[] var3 = this.method201(0, var1, -1887337990);

         for(int var4 = 0; var4 < -1474554145 * class322.field831; ++var4) {
            int var5 = var3[var4];
            var2[var4] = var5 >= this.field3146 * 1295115163 && var5 <= 1628368397 * this.field3149 ? 4096 : 0;
         }
      }

      return var2;
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field3146 = var2.method6374() * 1298582163;
            break;
         case 1:
            this.field3149 = var2.method6374() * 2091520197;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahu.r(" + ')');
      }
   }

   void method1891(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field3146 = var2.method6374() * 1298582163;
         break;
      case 1:
         this.field3149 = var2.method6374() * 2091520197;
      }

   }

   static final void method1892(class744 var0, byte var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class619.field8869 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ahu.us(" + ')');
      }
   }

   public static void method1893(String[] var0, int[] var1, int var2) {
      try {
         class861.method5352(var0, var1, 0, var0.length - 1, 31286072);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ahu.b(" + ')');
      }
   }
}
