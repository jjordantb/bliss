public final class class344 {
   public float[] field325 = new float[16];
   public static class344 field326 = new class344();

   public class344(class344 var1) {
      this.method269(var1);
   }

   public void method269(class344 var1) {
      System.arraycopy(var1.field325, 0, this.field325, 0, 16);
   }

   public void method270(class344 var1, class344 var2) {
      float var3 = var1.field325[0] * var2.field325[0] + var1.field325[1] * var2.field325[4] + var1.field325[2] * var2.field325[8] + var1.field325[3] * var2.field325[12];
      float var4 = var1.field325[0] * var2.field325[1] + var1.field325[1] * var2.field325[5] + var1.field325[2] * var2.field325[9] + var1.field325[3] * var2.field325[13];
      float var5 = var1.field325[0] * var2.field325[2] + var1.field325[1] * var2.field325[6] + var1.field325[2] * var2.field325[10] + var1.field325[3] * var2.field325[14];
      float var6 = var1.field325[0] * var2.field325[3] + var1.field325[1] * var2.field325[7] + var1.field325[2] * var2.field325[11] + var1.field325[3] * var2.field325[15];
      float var7 = var1.field325[4] * var2.field325[0] + var1.field325[5] * var2.field325[4] + var1.field325[6] * var2.field325[8] + var1.field325[7] * var2.field325[12];
      float var8 = var1.field325[4] * var2.field325[1] + var1.field325[5] * var2.field325[5] + var1.field325[6] * var2.field325[9] + var1.field325[7] * var2.field325[13];
      float var9 = var1.field325[4] * var2.field325[2] + var1.field325[5] * var2.field325[6] + var1.field325[6] * var2.field325[10] + var1.field325[7] * var2.field325[14];
      float var10 = var1.field325[4] * var2.field325[3] + var1.field325[5] * var2.field325[7] + var1.field325[6] * var2.field325[11] + var1.field325[7] * var2.field325[15];
      float var11 = var1.field325[8] * var2.field325[0] + var1.field325[9] * var2.field325[4] + var1.field325[10] * var2.field325[8] + var1.field325[11] * var2.field325[12];
      float var12 = var1.field325[8] * var2.field325[1] + var1.field325[9] * var2.field325[5] + var1.field325[10] * var2.field325[9] + var1.field325[11] * var2.field325[13];
      float var13 = var1.field325[8] * var2.field325[2] + var1.field325[9] * var2.field325[6] + var1.field325[10] * var2.field325[10] + var1.field325[11] * var2.field325[14];
      float var14 = var1.field325[8] * var2.field325[3] + var1.field325[9] * var2.field325[7] + var1.field325[10] * var2.field325[11] + var1.field325[11] * var2.field325[15];
      float var15 = var1.field325[12] * var2.field325[0] + var1.field325[13] * var2.field325[4] + var1.field325[14] * var2.field325[8] + var1.field325[15] * var2.field325[12];
      float var16 = var1.field325[12] * var2.field325[1] + var1.field325[13] * var2.field325[5] + var1.field325[14] * var2.field325[9] + var1.field325[15] * var2.field325[13];
      float var17 = var1.field325[12] * var2.field325[2] + var1.field325[13] * var2.field325[6] + var1.field325[14] * var2.field325[10] + var1.field325[15] * var2.field325[14];
      float var18 = var1.field325[12] * var2.field325[3] + var1.field325[13] * var2.field325[7] + var1.field325[14] * var2.field325[11] + var1.field325[15] * var2.field325[15];
      this.field325[0] = var3;
      this.field325[1] = var4;
      this.field325[2] = var5;
      this.field325[3] = var6;
      this.field325[4] = var7;
      this.field325[5] = var8;
      this.field325[6] = var9;
      this.field325[7] = var10;
      this.field325[8] = var11;
      this.field325[9] = var12;
      this.field325[10] = var13;
      this.field325[11] = var14;
      this.field325[12] = var15;
      this.field325[13] = var16;
      this.field325[14] = var17;
      this.field325[15] = var18;
   }

   public void method271(class344 var1) {
      float var2 = this.field325[0] * var1.field325[0] + this.field325[1] * var1.field325[4] + this.field325[2] * var1.field325[8] + this.field325[3] * var1.field325[12];
      float var3 = this.field325[0] * var1.field325[1] + this.field325[1] * var1.field325[5] + this.field325[2] * var1.field325[9] + this.field325[3] * var1.field325[13];
      float var4 = this.field325[0] * var1.field325[2] + this.field325[1] * var1.field325[6] + this.field325[2] * var1.field325[10] + this.field325[3] * var1.field325[14];
      float var5 = this.field325[0] * var1.field325[3] + this.field325[1] * var1.field325[7] + this.field325[2] * var1.field325[11] + this.field325[3] * var1.field325[15];
      float var6 = this.field325[4] * var1.field325[0] + this.field325[5] * var1.field325[4] + this.field325[6] * var1.field325[8] + this.field325[7] * var1.field325[12];
      float var7 = this.field325[4] * var1.field325[1] + this.field325[5] * var1.field325[5] + this.field325[6] * var1.field325[9] + this.field325[7] * var1.field325[13];
      float var8 = this.field325[4] * var1.field325[2] + this.field325[5] * var1.field325[6] + this.field325[6] * var1.field325[10] + this.field325[7] * var1.field325[14];
      float var9 = this.field325[4] * var1.field325[3] + this.field325[5] * var1.field325[7] + this.field325[6] * var1.field325[11] + this.field325[7] * var1.field325[15];
      float var10 = this.field325[8] * var1.field325[0] + this.field325[9] * var1.field325[4] + this.field325[10] * var1.field325[8] + this.field325[11] * var1.field325[12];
      float var11 = this.field325[8] * var1.field325[1] + this.field325[9] * var1.field325[5] + this.field325[10] * var1.field325[9] + this.field325[11] * var1.field325[13];
      float var12 = this.field325[8] * var1.field325[2] + this.field325[9] * var1.field325[6] + this.field325[10] * var1.field325[10] + this.field325[11] * var1.field325[14];
      float var13 = this.field325[8] * var1.field325[3] + this.field325[9] * var1.field325[7] + this.field325[10] * var1.field325[11] + this.field325[11] * var1.field325[15];
      float var14 = this.field325[12] * var1.field325[0] + this.field325[13] * var1.field325[4] + this.field325[14] * var1.field325[8] + this.field325[15] * var1.field325[12];
      float var15 = this.field325[12] * var1.field325[1] + this.field325[13] * var1.field325[5] + this.field325[14] * var1.field325[9] + this.field325[15] * var1.field325[13];
      float var16 = this.field325[12] * var1.field325[2] + this.field325[13] * var1.field325[6] + this.field325[14] * var1.field325[10] + this.field325[15] * var1.field325[14];
      float var17 = this.field325[12] * var1.field325[3] + this.field325[13] * var1.field325[7] + this.field325[14] * var1.field325[11] + this.field325[15] * var1.field325[15];
      this.field325[0] = var2;
      this.field325[1] = var3;
      this.field325[2] = var4;
      this.field325[3] = var5;
      this.field325[4] = var6;
      this.field325[5] = var7;
      this.field325[6] = var8;
      this.field325[7] = var9;
      this.field325[8] = var10;
      this.field325[9] = var11;
      this.field325[10] = var12;
      this.field325[11] = var13;
      this.field325[12] = var14;
      this.field325[13] = var15;
      this.field325[14] = var16;
      this.field325[15] = var17;
   }

   public void method272(class135 var1) {
      this.field325[0] = var1.field1184;
      this.field325[1] = var1.field1192;
      this.field325[2] = var1.field1185;
      this.field325[3] = 0.0F;
      this.field325[4] = var1.field1186;
      this.field325[5] = var1.field1187;
      this.field325[6] = var1.field1188;
      this.field325[7] = 0.0F;
      this.field325[8] = var1.field1189;
      this.field325[9] = var1.field1190;
      this.field325[10] = var1.field1191;
      this.field325[11] = 0.0F;
      this.field325[12] = var1.field1182;
      this.field325[13] = var1.field1193;
      this.field325[14] = var1.field1183;
      this.field325[15] = 1.0F;
   }

   public void method273() {
      float var1 = 1.0F / this.method296();
      float var2 = (this.field325[5] * this.field325[10] * this.field325[15] - this.field325[5] * this.field325[11] * this.field325[14] - this.field325[6] * this.field325[9] * this.field325[15] + this.field325[6] * this.field325[11] * this.field325[13] + this.field325[7] * this.field325[9] * this.field325[14] - this.field325[7] * this.field325[10] * this.field325[13]) * var1;
      float var3 = (-this.field325[1] * this.field325[10] * this.field325[15] + this.field325[1] * this.field325[11] * this.field325[14] + this.field325[2] * this.field325[9] * this.field325[15] - this.field325[2] * this.field325[11] * this.field325[13] - this.field325[3] * this.field325[9] * this.field325[14] + this.field325[3] * this.field325[10] * this.field325[13]) * var1;
      float var4 = (this.field325[1] * this.field325[6] * this.field325[15] - this.field325[1] * this.field325[7] * this.field325[14] - this.field325[2] * this.field325[5] * this.field325[15] + this.field325[2] * this.field325[7] * this.field325[13] + this.field325[3] * this.field325[5] * this.field325[14] - this.field325[3] * this.field325[6] * this.field325[13]) * var1;
      float var5 = (-this.field325[1] * this.field325[6] * this.field325[11] + this.field325[1] * this.field325[7] * this.field325[10] + this.field325[2] * this.field325[5] * this.field325[11] - this.field325[2] * this.field325[7] * this.field325[9] - this.field325[3] * this.field325[5] * this.field325[10] + this.field325[3] * this.field325[6] * this.field325[9]) * var1;
      float var6 = (-this.field325[4] * this.field325[10] * this.field325[15] + this.field325[4] * this.field325[11] * this.field325[14] + this.field325[6] * this.field325[8] * this.field325[15] - this.field325[6] * this.field325[11] * this.field325[12] - this.field325[7] * this.field325[8] * this.field325[14] + this.field325[7] * this.field325[10] * this.field325[12]) * var1;
      float var7 = (this.field325[0] * this.field325[10] * this.field325[15] - this.field325[0] * this.field325[11] * this.field325[14] - this.field325[2] * this.field325[8] * this.field325[15] + this.field325[2] * this.field325[11] * this.field325[12] + this.field325[3] * this.field325[8] * this.field325[14] - this.field325[3] * this.field325[10] * this.field325[12]) * var1;
      float var8 = (-this.field325[0] * this.field325[6] * this.field325[15] + this.field325[0] * this.field325[7] * this.field325[14] + this.field325[2] * this.field325[4] * this.field325[15] - this.field325[2] * this.field325[7] * this.field325[12] - this.field325[3] * this.field325[4] * this.field325[14] + this.field325[3] * this.field325[6] * this.field325[12]) * var1;
      float var9 = (this.field325[0] * this.field325[6] * this.field325[11] - this.field325[0] * this.field325[7] * this.field325[10] - this.field325[2] * this.field325[4] * this.field325[11] + this.field325[2] * this.field325[7] * this.field325[8] + this.field325[3] * this.field325[4] * this.field325[10] - this.field325[3] * this.field325[6] * this.field325[8]) * var1;
      float var10 = (this.field325[4] * this.field325[9] * this.field325[15] - this.field325[4] * this.field325[11] * this.field325[13] - this.field325[5] * this.field325[8] * this.field325[15] + this.field325[5] * this.field325[11] * this.field325[12] + this.field325[7] * this.field325[8] * this.field325[13] - this.field325[7] * this.field325[9] * this.field325[12]) * var1;
      float var11 = (-this.field325[0] * this.field325[9] * this.field325[15] + this.field325[0] * this.field325[11] * this.field325[13] + this.field325[1] * this.field325[8] * this.field325[15] - this.field325[1] * this.field325[11] * this.field325[12] - this.field325[3] * this.field325[8] * this.field325[13] + this.field325[3] * this.field325[9] * this.field325[12]) * var1;
      float var12 = (this.field325[0] * this.field325[5] * this.field325[15] - this.field325[0] * this.field325[7] * this.field325[13] - this.field325[1] * this.field325[4] * this.field325[15] + this.field325[1] * this.field325[7] * this.field325[12] + this.field325[3] * this.field325[4] * this.field325[13] - this.field325[3] * this.field325[5] * this.field325[12]) * var1;
      float var13 = (-this.field325[0] * this.field325[5] * this.field325[11] + this.field325[0] * this.field325[7] * this.field325[9] + this.field325[1] * this.field325[4] * this.field325[11] - this.field325[1] * this.field325[7] * this.field325[8] - this.field325[3] * this.field325[4] * this.field325[9] + this.field325[3] * this.field325[5] * this.field325[8]) * var1;
      float var14 = (-this.field325[4] * this.field325[9] * this.field325[14] + this.field325[4] * this.field325[10] * this.field325[13] + this.field325[5] * this.field325[8] * this.field325[14] - this.field325[5] * this.field325[10] * this.field325[12] - this.field325[6] * this.field325[8] * this.field325[13] + this.field325[6] * this.field325[9] * this.field325[12]) * var1;
      float var15 = (this.field325[0] * this.field325[9] * this.field325[14] - this.field325[0] * this.field325[10] * this.field325[13] - this.field325[1] * this.field325[8] * this.field325[14] + this.field325[1] * this.field325[10] * this.field325[12] + this.field325[2] * this.field325[8] * this.field325[13] - this.field325[2] * this.field325[9] * this.field325[12]) * var1;
      float var16 = (-this.field325[0] * this.field325[5] * this.field325[14] + this.field325[0] * this.field325[6] * this.field325[13] + this.field325[1] * this.field325[4] * this.field325[14] - this.field325[1] * this.field325[6] * this.field325[12] - this.field325[2] * this.field325[4] * this.field325[13] + this.field325[2] * this.field325[5] * this.field325[12]) * var1;
      float var17 = (this.field325[0] * this.field325[5] * this.field325[10] - this.field325[0] * this.field325[6] * this.field325[9] - this.field325[1] * this.field325[4] * this.field325[10] + this.field325[1] * this.field325[6] * this.field325[8] + this.field325[2] * this.field325[4] * this.field325[9] - this.field325[2] * this.field325[5] * this.field325[8]) * var1;
      this.field325[0] = var2;
      this.field325[1] = var3;
      this.field325[2] = var4;
      this.field325[3] = var5;
      this.field325[4] = var6;
      this.field325[5] = var7;
      this.field325[6] = var8;
      this.field325[7] = var9;
      this.field325[8] = var10;
      this.field325[9] = var11;
      this.field325[10] = var12;
      this.field325[11] = var13;
      this.field325[12] = var14;
      this.field325[13] = var15;
      this.field325[14] = var16;
      this.field325[15] = var17;
   }

   public void method274(float var1, float var2, float var3, float var4) {
      this.field325[0] = var1;
      this.field325[1] = 0.0F;
      this.field325[2] = 0.0F;
      this.field325[3] = 0.0F;
      this.field325[4] = 0.0F;
      this.field325[5] = var2;
      this.field325[6] = 0.0F;
      this.field325[7] = 0.0F;
      this.field325[8] = 0.0F;
      this.field325[9] = 0.0F;
      this.field325[10] = var3;
      this.field325[11] = 0.0F;
      this.field325[12] = 0.0F;
      this.field325[13] = 0.0F;
      this.field325[14] = 0.0F;
      this.field325[15] = var4;
   }

   public boolean method275() {
      return this.field325[0] == 1.0F && this.field325[1] == 0.0F && this.field325[2] == 0.0F && this.field325[3] == 0.0F && this.field325[4] == 0.0F && this.field325[5] == 1.0F && this.field325[6] == 0.0F && this.field325[7] == 0.0F && this.field325[8] == 0.0F && this.field325[9] == 0.0F && this.field325[10] == 1.0F && this.field325[11] == 0.0F && this.field325[12] == 0.0F && this.field325[13] == 0.0F && this.field325[14] == 0.0F && this.field325[15] == 1.0F;
   }

   public void method276(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.field325[0] * var1 + this.field325[4] * var2 + this.field325[8] * var3 + this.field325[12];
      var4[1] = this.field325[1] * var1 + this.field325[5] * var2 + this.field325[9] * var3 + this.field325[13];
      var4[2] = this.field325[2] * var1 + this.field325[6] * var2 + this.field325[10] * var3 + this.field325[14];
      if (var4.length > 3) {
         var4[3] = this.field325[3] * var1 + this.field325[7] * var2 + this.field325[11] * var3 + this.field325[15];
      }

   }

   public class344() {
      this.method299();
   }

   public float[] method277(float[] var1) {
      var1[0] = this.field325[0];
      var1[1] = this.field325[4];
      var1[2] = this.field325[8];
      var1[3] = this.field325[12];
      var1[4] = this.field325[1];
      var1[5] = this.field325[5];
      var1[6] = this.field325[9];
      var1[7] = this.field325[13];
      return var1;
   }

   public void method278(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field325[0] = 2.0F / (var2 - var1);
      this.field325[1] = 0.0F;
      this.field325[2] = 0.0F;
      this.field325[3] = 0.0F;
      this.field325[4] = 0.0F;
      this.field325[5] = 2.0F / (var4 - var3);
      this.field325[6] = 0.0F;
      this.field325[7] = 0.0F;
      this.field325[8] = 0.0F;
      this.field325[9] = 0.0F;
      this.field325[10] = 2.0F / (var6 - var5);
      this.field325[11] = 0.0F;
      this.field325[12] = -(var2 + var1) / (var2 - var1);
      this.field325[13] = -(var4 + var3) / (var4 - var3);
      this.field325[14] = -(var6 + var5) / (var6 - var5);
      this.field325[15] = 1.0F;
   }

   public void method279(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.field325[0] = var3 * 2.0F / var7;
      this.field325[1] = 0.0F;
      this.field325[2] = 0.0F;
      this.field325[3] = 0.0F;
      this.field325[4] = 0.0F;
      this.field325[5] = var4 * 2.0F / var8;
      this.field325[6] = 0.0F;
      this.field325[7] = 0.0F;
      this.field325[8] = 2.0F * var1 / var7 - 1.0F;
      this.field325[9] = 2.0F * var2 / var8 - 1.0F;
      this.field325[10] = (var6 + var5) / (var6 - var5);
      this.field325[11] = 1.0F;
      this.field325[12] = 0.0F;
      this.field325[13] = 0.0F;
      this.field325[14] = 2.0F * var6 * var5 / (var5 - var6);
      this.field325[15] = 0.0F;
   }

   public void method280(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.method278(-(var1 * var9) / var3, var9 * (var7 - var1) / var3, -(var2 * var9) / var4, var9 * (var8 - var2) / var4, var5, var6);
   }

   public float method281() {
      return -(this.field325[15] + this.field325[14]) / (this.field325[11] + this.field325[10]);
   }

   public float method282() {
      return (this.field325[14] - this.field325[15]) / (this.field325[11] - this.field325[10]);
   }

   public float[] method283(float[] var1) {
      float var2 = this.field325[3] + this.field325[0];
      float var3 = this.field325[7] + this.field325[4];
      float var4 = this.field325[11] + this.field325[8];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.field325[15] + this.field325[12]) / var5);
      return var1;
   }

   public float[] method284(float[] var1) {
      float var2 = this.field325[3] + this.field325[2];
      float var3 = this.field325[7] + this.field325[6];
      float var4 = this.field325[11] + this.field325[10];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.field325[15] + this.field325[14]) / var5);
      return var1;
   }

   public float[] method285(float[] var1) {
      float var2 = this.field325[3] - this.field325[2];
      float var3 = this.field325[7] - this.field325[6];
      float var4 = this.field325[11] - this.field325[10];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.field325[15] - this.field325[14]) / var5);
      return var1;
   }

   public void method286() {
      float var1 = this.field325[0];
      float var2 = this.field325[4];
      float var3 = this.field325[8];
      float var4 = this.field325[12];
      float var5 = this.field325[1];
      float var6 = this.field325[5];
      float var7 = this.field325[9];
      float var8 = this.field325[13];
      float var9 = this.field325[2];
      float var10 = this.field325[6];
      float var11 = this.field325[10];
      float var12 = this.field325[14];
      float var13 = this.field325[3];
      float var14 = this.field325[7];
      float var15 = this.field325[11];
      float var16 = this.field325[15];
      this.field325[0] = var1;
      this.field325[1] = var2;
      this.field325[2] = var3;
      this.field325[3] = var4;
      this.field325[4] = var5;
      this.field325[5] = var6;
      this.field325[6] = var7;
      this.field325[7] = var8;
      this.field325[8] = var9;
      this.field325[9] = var10;
      this.field325[10] = var11;
      this.field325[11] = var12;
      this.field325[12] = var13;
      this.field325[13] = var14;
      this.field325[14] = var15;
      this.field325[15] = var16;
   }

   public float[] method287(float[] var1) {
      System.arraycopy(this.field325, 0, var1, 0, 16);
      var1[3] = 0.0F;
      var1[7] = 0.0F;
      var1[11] = 0.0F;
      var1[12] = 0.0F;
      var1[13] = 0.0F;
      var1[14] = 0.0F;
      var1[15] = 1.0F;
      return var1;
   }

   public float[] method288(float[] var1) {
      var1[0] = this.field325[0];
      var1[1] = this.field325[4];
      var1[2] = this.field325[8];
      var1[3] = this.field325[12];
      var1[4] = this.field325[1];
      var1[5] = this.field325[5];
      var1[6] = this.field325[9];
      var1[7] = this.field325[13];
      var1[8] = this.field325[2];
      var1[9] = this.field325[6];
      var1[10] = this.field325[10];
      var1[11] = this.field325[14];
      var1[12] = this.field325[3];
      var1[13] = this.field325[7];
      var1[14] = this.field325[11];
      var1[15] = this.field325[15];
      return var1;
   }

   public float[] method289(float[] var1) {
      var1[0] = this.field325[0];
      var1[1] = this.field325[1];
      var1[2] = this.field325[4];
      var1[3] = this.field325[5];
      var1[4] = this.field325[8];
      var1[5] = this.field325[9];
      var1[6] = this.field325[12];
      var1[7] = this.field325[13];
      return var1;
   }

   public float[] method290(float[] var1) {
      float var2 = this.field325[3] - this.field325[1];
      float var3 = this.field325[7] - this.field325[5];
      float var4 = this.field325[11] - this.field325[9];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.field325[15] - this.field325[13]) / var5);
      return var1;
   }

   public void method291(int var1, int var2, int var3, float var4, float var5, float var6) {
      float[] var9;
      float[] var10;
      float[] var11;
      float[] var12;
      float[] var13;
      if (var1 != 0) {
         float var7 = class580.field159[var1 & 16383];
         float var8 = class580.field158[var1 & 16383];
         this.field325[0] = var7 * (float)var2;
         this.field325[5] = var7 * (float)var3;
         this.field325[1] = var8 * (float)var2;
         this.field325[4] = -var8 * (float)var3;
         this.field325[10] = 1.0F;
         var9 = this.field325;
         var10 = this.field325;
         var11 = this.field325;
         this.field325[9] = 0.0F;
         var11[8] = 0.0F;
         var10[6] = 0.0F;
         var9[2] = 0.0F;
      } else {
         this.field325[0] = (float)var2;
         this.field325[5] = (float)var3;
         this.field325[10] = 1.0F;
         var12 = this.field325;
         var13 = this.field325;
         var9 = this.field325;
         var10 = this.field325;
         var11 = this.field325;
         this.field325[9] = 0.0F;
         var11[8] = 0.0F;
         var10[6] = 0.0F;
         var9[4] = 0.0F;
         var13[2] = 0.0F;
         var12[1] = 0.0F;
      }

      var12 = this.field325;
      var13 = this.field325;
      this.field325[11] = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.field325[15] = 1.0F;
      this.field325[12] = var4;
      this.field325[13] = var5;
      this.field325[14] = var6;
   }

   public float[] method292(float[] var1) {
      var1[0] = this.field325[0];
      var1[1] = this.field325[1];
      var1[2] = this.field325[2];
      var1[3] = this.field325[4];
      var1[4] = this.field325[5];
      var1[5] = this.field325[6];
      var1[6] = this.field325[8];
      var1[7] = this.field325[9];
      var1[8] = this.field325[10];
      return var1;
   }

   public float[] method293(float[] var1) {
      var1[0] = this.field325[0];
      var1[1] = this.field325[1];
      var1[2] = 0.0F;
      var1[3] = 0.0F;
      var1[4] = this.field325[4];
      var1[5] = this.field325[5];
      var1[6] = 0.0F;
      var1[7] = 0.0F;
      var1[8] = this.field325[12];
      var1[9] = this.field325[13];
      var1[10] = this.field325[14];
      var1[11] = 0.0F;
      var1[12] = 0.0F;
      var1[13] = 0.0F;
      var1[14] = 0.0F;
      var1[15] = 1.0F;
      return var1;
   }

   public void method294(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.field325[0] * var1 + this.field325[4] * var2 + this.field325[8] * var3;
      var4[1] = this.field325[1] * var1 + this.field325[5] * var2 + this.field325[9] * var3;
      var4[2] = this.field325[2] * var1 + this.field325[6] * var2 + this.field325[10] * var3;
      if (var4.length > 3) {
         var4[3] = this.field325[3] * var1 + this.field325[7] * var2 + this.field325[11] * var3;
      }

   }

   public void method295(float[] var1) {
      float var2 = var1[0];
      float var3 = var1[1];
      float var4 = var1[2];
      var1[0] = this.field325[0] * var2 + this.field325[4] * var3 + this.field325[8] * var4 + this.field325[12];
      var1[1] = this.field325[1] * var2 + this.field325[5] * var3 + this.field325[9] * var4 + this.field325[13];
      var1[2] = this.field325[2] * var2 + this.field325[6] * var3 + this.field325[10] * var4 + this.field325[14];
   }

   float method296() {
      return this.field325[0] * this.field325[5] * this.field325[10] * this.field325[15] - this.field325[0] * this.field325[5] * this.field325[11] * this.field325[14] - this.field325[0] * this.field325[6] * this.field325[9] * this.field325[15] + this.field325[0] * this.field325[6] * this.field325[11] * this.field325[13] + this.field325[0] * this.field325[7] * this.field325[9] * this.field325[14] - this.field325[0] * this.field325[7] * this.field325[10] * this.field325[13] - this.field325[1] * this.field325[4] * this.field325[10] * this.field325[15] + this.field325[1] * this.field325[4] * this.field325[11] * this.field325[14] + this.field325[1] * this.field325[6] * this.field325[8] * this.field325[15] - this.field325[1] * this.field325[6] * this.field325[11] * this.field325[12] - this.field325[1] * this.field325[7] * this.field325[8] * this.field325[14] + this.field325[1] * this.field325[7] * this.field325[10] * this.field325[12] + this.field325[2] * this.field325[4] * this.field325[9] * this.field325[15] - this.field325[2] * this.field325[4] * this.field325[11] * this.field325[13] - this.field325[2] * this.field325[5] * this.field325[8] * this.field325[15] + this.field325[2] * this.field325[5] * this.field325[11] * this.field325[12] + this.field325[2] * this.field325[7] * this.field325[8] * this.field325[13] - this.field325[2] * this.field325[7] * this.field325[9] * this.field325[12] - this.field325[3] * this.field325[4] * this.field325[9] * this.field325[14] + this.field325[3] * this.field325[4] * this.field325[10] * this.field325[13] + this.field325[3] * this.field325[5] * this.field325[8] * this.field325[14] - this.field325[3] * this.field325[5] * this.field325[10] * this.field325[12] - this.field325[3] * this.field325[6] * this.field325[8] * this.field325[13] + this.field325[3] * this.field325[6] * this.field325[9] * this.field325[12];
   }

   public float[] method297(float[] var1) {
      float var2 = this.field325[3] - this.field325[0];
      float var3 = this.field325[7] - this.field325[4];
      float var4 = this.field325[11] - this.field325[8];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.field325[15] - this.field325[12]) / var5);
      return var1;
   }

   public float[] method298(float[] var1) {
      float var2 = this.field325[3] + this.field325[1];
      float var3 = this.field325[7] + this.field325[5];
      float var4 = this.field325[11] + this.field325[9];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.field325[15] + this.field325[13]) / var5);
      return var1;
   }

   public void method299() {
      this.field325[0] = 1.0F;
      this.field325[1] = 0.0F;
      this.field325[2] = 0.0F;
      this.field325[3] = 0.0F;
      this.field325[4] = 0.0F;
      this.field325[5] = 1.0F;
      this.field325[6] = 0.0F;
      this.field325[7] = 0.0F;
      this.field325[8] = 0.0F;
      this.field325[9] = 0.0F;
      this.field325[10] = 1.0F;
      this.field325[11] = 0.0F;
      this.field325[12] = 0.0F;
      this.field325[13] = 0.0F;
      this.field325[14] = 0.0F;
      this.field325[15] = 1.0F;
   }

   public float[] method300(float[] var1) {
      System.arraycopy(this.field325, 0, var1, 0, 16);
      return var1;
   }
}
