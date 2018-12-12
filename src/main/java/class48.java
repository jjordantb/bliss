public abstract class class48 implements class653 {
   final void method3103(float var1, float var2, float var3, float var4, float var5, float var6, class23 var7, int var8, int var9) {
      this.method3127(var1, var2, var3, var4, var5, var6, 1, var7, var8, var9);
   }

   public abstract void method3104(int var1, int var2, int var3, int var4);

   public abstract void method3105(int[] var1);

   public abstract int method3106();

   public abstract int method3108();

   public abstract int method3109();

   public abstract class813 method3110();

   public abstract void method3114(int var1, int var2, int var3, int var4, int var5);

   public abstract void method3115(int var1, int var2, int var3);

   public final void method3116(int var1, int var2, int var3, int var4) {
      this.method3118(var1, var2, var3, var4, 1, 0, 1, 1);
   }

   public final void method3117(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method3118(var1, var2, var3, var4, var5, var6, var7, 1);
   }

   abstract void method3118(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   public final void method3119(int var1, int var2, int var3, int var4) {
      this.method3145(var1, var2, var3, var4, 1, 0, 1);
   }

   public abstract int method5594();

   final void method3120(float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9) {
      if (var5 != 0) {
         double var10 = (double)(var6 & '\uffff') * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)var5;
         float var13 = (float)Math.cos(var10) * (float)var5;
         float var14 = (-var3 * var13 + -var4 * var12) / 4096.0F + var1;
         float var15 = (--var3 * var12 + -var4 * var13) / 4096.0F + var2;
         float var16 = (((float)this.method5594() - var3) * var13 + -var4 * var12) / 4096.0F + var1;
         float var17 = (-((float)this.method5594() - var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var18 = (-var3 * var13 + ((float)this.method3109() - var4) * var12) / 4096.0F + var1;
         float var19 = (--var3 * var12 + ((float)this.method3109() - var4) * var13) / 4096.0F + var2;
         this.method3124(var14, var15, var16, var17, var18, var19, var7, var8, var9);
      }

   }

   public final void method3121(float var1, float var2, int var3, int var4, int var5, int var6, int var7) {
      this.method3120(var1, var2, (float)this.method5594() / 2.0F, (float)this.method3109() / 2.0F, var3, var4, var5, var6, var7);
   }

   public final void method3122(float var1, float var2, int var3, int var4, class23 var5, int var6, int var7) {
      this.method3142(var1, var2, (float)this.method5594() / 2.0F, (float)this.method3109() / 2.0F, var3, var4, var5, var6, var7);
   }

   public final void method3124(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9) {
      this.method3125(var1, var2, var3, var4, var5, var6, var7, var8, var9, 1);
   }

   abstract void method3125(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10);

   abstract void method3127(float var1, float var2, float var3, float var4, float var5, float var6, int var7, class23 var8, int var9, int var10);

   public final void method3128(int var1, int var2) {
      this.method3114(var1, var2, 1, 0, 1);
   }

   public abstract void method3137(int var1, int var2, class23 var3, int var4, int var5);

   public final void method3142(float var1, float var2, float var3, float var4, int var5, int var6, class23 var7, int var8, int var9) {
      if (var5 != 0) {
         double var10 = (double)(var6 & '\uffff') * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)var5;
         float var13 = (float)Math.cos(var10) * (float)var5;
         float var14 = (-var3 * var13 + -var4 * var12) / 4096.0F + var1;
         float var15 = (--var3 * var12 + -var4 * var13) / 4096.0F + var2;
         float var16 = (((float)this.method5594() - var3) * var13 + -var4 * var12) / 4096.0F + var1;
         float var17 = (-((float)this.method5594() - var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var18 = (-var3 * var13 + ((float)this.method3109() - var4) * var12) / 4096.0F + var1;
         float var19 = (--var3 * var12 + ((float)this.method3109() - var4) * var13) / 4096.0F + var2;
         this.method3103(var14, var15, var16, var17, var18, var19, var7, var8, var9);
      }

   }

   public abstract void method3145(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public final void method3156(float var1, float var2, int var3, int var4) {
      this.method3120(var1, var2, (float)this.method5594() / 2.0F, (float)this.method3109() / 2.0F, var3, var4, 1, 0, 1);
   }

   public abstract void method3158(int var1, int var2, int var3, int var4, int var5, int var6);
}
