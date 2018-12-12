public class class910 extends class727 implements class297 {
   long field10422;

   native void bf(class955 var1, class887 var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);

   native void n(class955 var1, class887 var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);

   public native void method6550(boolean var1);

   native void method1680(char var1, int var2, int var3, int var4, boolean var5);

   void method1674(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8) {
      this.P(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   native void P(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8);

   native void method1675(char var1, int var2, int var3, int var4, boolean var5);

   native void method1676(char var1, int var2, int var3, int var4, boolean var5);

   void method1679(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8) {
      this.P(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public native void method6551(boolean var1);

   native void am(class955 var1, class887 var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);

   class910(class955 var1, class887 var2, class230 var3, class922[] var4, class48[] var5) {
      super(var1, var3);
      byte[][] var6 = new byte[var4.length][];
      int[] var7 = new int[var4.length];
      int[] var8 = new int[var4.length];
      int[] var9 = new int[var4.length];
      int[] var10 = new int[var4.length];

      for(int var11 = 0; var11 < var4.length; ++var11) {
         class922 var12 = var4[var11];
         if (var12.field10276 != null) {
            var6[var11] = var12.field10276;
         } else {
            byte[] var13 = var12.field10275;
            byte[] var14 = var6[var11] = new byte[var13.length];

            for(int var15 = 0; var15 < var13.length; ++var15) {
               var14[var15] = (byte)(var13[var15] == 0 ? 0 : -1);
            }
         }

         var7[var11] = var12.field10269;
         var8[var11] = var12.field10273;
         var9[var11] = var12.field10272;
         var10[var11] = var12.field10268;
      }

      this.n(var1, var2, var6, var7, var8, var9, var10);
   }

   native void bd(class955 var1, class887 var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);

   native void be(class955 var1, class887 var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);

   native void by(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8);
}
