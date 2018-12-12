public class class187 extends class727 implements class297 {
   long field5355;

   void method1674(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8) {
      this.MA(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public native void method6550(boolean var1);

   native void n(class955 var1, class887 var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);

   native void MA(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8);

   native void method1680(char var1, int var2, int var3, int var4, boolean var5);

   class187(class955 var1, class887 var2, class230 var3, class922[] var4, class48[] var5) {
      super(var1, var3);
      byte[][] var6 = new byte[var4.length][];
      int[] var7 = new int[var4.length];
      int[] var8 = new int[var4.length];
      int[] var9 = new int[var4.length];
      int[] var10 = new int[var4.length];

      for(int var11 = 0; var11 < var4.length; ++var11) {
         var6[var11] = var4[var11].field10275;
         var7[var11] = var4[var11].field10269;
         var8[var11] = var4[var11].field10273;
         var9[var11] = var4[var11].field10272;
         var10[var11] = var4[var11].field10268;
      }

      this.n(var1, var2, var6, var7, var8, var9, var10);
   }
}
