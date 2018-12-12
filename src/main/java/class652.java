public class class652 extends class568 {
   public static int field9449 = 3;
   public static int field9450 = 1;
   int field9451;
   public static int field9452 = 0;
   public static int field9453 = 5;
   static int field9454 = 6;
   public static int field9455 = 7;
   public static int field9456 = 8;
   public static int field9457 = 9;
   boolean[] field9458;
   int field9459;
   public static int field9460 = 10;
   int[] field9461;
   int[][] field9462;
   int[] field9463;
   public static int field9464 = 2;

   class652(int var1, byte[] var2) {
      this.field9459 = 1362718155 * var1;
      class907 var3 = new class907(var2);
      this.field9451 = var3.method6371() * -1914825713;
      this.field9461 = new int[92429039 * this.field9451];
      this.field9462 = new int[92429039 * this.field9451][];
      this.field9458 = new boolean[this.field9451 * 92429039];
      this.field9463 = new int[92429039 * this.field9451];

      int var4;
      for(var4 = 0; var4 < 92429039 * this.field9451; ++var4) {
         this.field9461[var4] = var3.method6371();
         if (this.field9461[var4] == 6) {
            this.field9461[var4] = 2;
         }
      }

      for(var4 = 0; var4 < this.field9451 * 92429039; ++var4) {
         this.field9458[var4] = var3.method6371() == 1;
      }

      for(var4 = 0; var4 < this.field9451 * 92429039; ++var4) {
         this.field9463[var4] = var3.method6374();
      }

      for(var4 = 0; var4 < this.field9451 * 92429039; ++var4) {
         this.field9462[var4] = new int[var3.method6371()];
      }

      for(var4 = 0; var4 < this.field9451 * 92429039; ++var4) {
         for(int var5 = 0; var5 < this.field9462[var4].length; ++var5) {
            this.field9462[var4][var5] = var3.method6371();
         }
      }

   }

   static final void method5638(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class730.field2939[var2] ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aax.wu(" + ')');
      }
   }
}
