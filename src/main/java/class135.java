public class class135 {
   float field1182;
   float field1183;
   float field1184;
   float field1185;
   float field1186;
   float field1187;
   float field1188;
   float field1189;
   float field1190;
   float field1191;
   float field1192;
   float field1193;
   public static class135 field1194 = new class135();

   public class135(class135 var1) {
      this.method1024(var1);
   }

   public void method1008(class446 var1) {
      this.method1026(var1.field7638);
      this.method1017(var1.field7637);
   }

   public void method1009() {
      this.field1183 = 0.0F;
      this.field1193 = 0.0F;
      this.field1182 = 0.0F;
      this.field1190 = 0.0F;
      this.field1189 = 0.0F;
      this.field1188 = 0.0F;
      this.field1186 = 0.0F;
      this.field1185 = 0.0F;
      this.field1192 = 0.0F;
      this.field1191 = 1.0F;
      this.field1187 = 1.0F;
      this.field1184 = 1.0F;
   }

   public void method1010(int var1, int var2, int var3, float var4, float var5, float var6) {
      if (var1 != 0) {
         float var7 = class580.field159[var1 & 16383];
         float var8 = class580.field158[var1 & 16383];
         this.field1191 = 1.0F;
         this.field1190 = 0.0F;
         this.field1189 = 0.0F;
         this.field1188 = 0.0F;
         this.field1185 = 0.0F;
         this.field1184 = 2.0F * var7 * (float)var2;
         this.field1187 = 2.0F * var7 * (float)var3;
         this.field1192 = 2.0F * var8 * (float)var2;
         this.field1186 = -2.0F * var8 * (float)var3;
         this.field1182 = (float)(2 * var2) * (0.5F * var8 - 0.5F * var7) + var4;
         this.field1193 = (float)(2 * var3) * (-0.5F * var8 - 0.5F * var7) + var5;
         this.field1183 = var6;
      } else {
         this.field1190 = 0.0F;
         this.field1189 = 0.0F;
         this.field1188 = 0.0F;
         this.field1186 = 0.0F;
         this.field1185 = 0.0F;
         this.field1192 = 0.0F;
         this.field1184 = (float)(2 * var2);
         this.field1187 = (float)(2 * var3);
         this.field1191 = 1.0F;
         this.field1182 = var4 - (float)var2;
         this.field1193 = var5 - (float)var3;
         this.field1183 = var6;
      }

   }

   public void method1011(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.field1184 = var1;
      this.field1186 = var4;
      this.field1189 = var7;
      this.field1182 = 0.0F;
      this.field1192 = var2;
      this.field1187 = var5;
      this.field1190 = var8;
      this.field1193 = 0.0F;
      this.field1185 = var3;
      this.field1188 = var6;
      this.field1191 = var9;
      this.field1183 = 0.0F;
   }

   public void method1012() {
      float var1 = this.field1182;
      float var2 = this.field1193;
      float var3 = this.field1186;
      this.field1186 = this.field1192;
      this.field1192 = var3;
      float var4 = this.field1189;
      this.field1189 = this.field1185;
      this.field1185 = var4;
      float var5 = this.field1190;
      this.field1190 = this.field1188;
      this.field1188 = var5;
      this.field1182 = -(var1 * this.field1184 + var2 * this.field1186 + this.field1183 * this.field1189);
      this.field1193 = -(var1 * this.field1192 + var2 * this.field1187 + this.field1183 * this.field1190);
      this.field1183 = -(var1 * this.field1185 + var2 * this.field1188 + this.field1183 * this.field1191);
   }

   public void method1013(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.cos((double)var4);
      float var6 = (float)Math.sin((double)var4);
      this.field1184 = var5 + var1 * var1 * (1.0F - var5);
      this.field1192 = var3 * var6 + var2 * var1 * (1.0F - var5);
      this.field1185 = -var2 * var6 + var3 * var1 * (1.0F - var5);
      this.field1186 = -var3 * var6 + var1 * var2 * (1.0F - var5);
      this.field1187 = var5 + var2 * var2 * (1.0F - var5);
      this.field1188 = var1 * var6 + var3 * var2 * (1.0F - var5);
      this.field1189 = var2 * var6 + var1 * var3 * (1.0F - var5);
      this.field1190 = -var1 * var6 + var2 * var3 * (1.0F - var5);
      this.field1191 = var5 + var3 * var3 * (1.0F - var5);
      this.field1183 = 0.0F;
      this.field1193 = 0.0F;
      this.field1182 = 0.0F;
   }

   public class135() {
      this.method1009();
   }

   void method1014(float var1, float var2, float var3, float var4) {
      float var5 = var1 * var1;
      float var6 = var1 * var2;
      float var7 = var1 * var3;
      float var8 = var1 * var4;
      float var9 = var2 * var2;
      float var10 = var2 * var3;
      float var11 = var2 * var4;
      float var12 = var3 * var3;
      float var13 = var3 * var4;
      this.field1184 = 1.0F - 2.0F * (var9 + var12);
      this.field1186 = 2.0F * (var6 - var13);
      this.field1189 = 2.0F * (var7 + var11);
      this.field1192 = 2.0F * (var6 + var13);
      this.field1187 = 1.0F - 2.0F * (var5 + var12);
      this.field1190 = 2.0F * (var10 - var8);
      this.field1185 = 2.0F * (var7 - var11);
      this.field1188 = 2.0F * (var10 + var8);
      this.field1191 = 1.0F - 2.0F * (var5 + var9);
      this.field1183 = 0.0F;
      this.field1193 = 0.0F;
      this.field1182 = 0.0F;
   }

   public void method1015(float var1, float var2, float var3) {
      this.field1184 *= var1;
      this.field1186 *= var1;
      this.field1189 *= var1;
      this.field1182 *= var1;
      this.field1192 *= var2;
      this.field1187 *= var2;
      this.field1190 *= var2;
      this.field1193 *= var2;
      this.field1185 *= var3;
      this.field1188 *= var3;
      this.field1191 *= var3;
      this.field1183 *= var3;
   }

   public void method1016(float var1, float var2, float var3) {
      this.field1190 = 0.0F;
      this.field1189 = 0.0F;
      this.field1188 = 0.0F;
      this.field1186 = 0.0F;
      this.field1185 = 0.0F;
      this.field1192 = 0.0F;
      this.field1191 = 1.0F;
      this.field1187 = 1.0F;
      this.field1184 = 1.0F;
      this.field1182 = var1;
      this.field1193 = var2;
      this.field1183 = var3;
   }

   void method1017(class32 var1) {
      this.method1018(var1.field5296, var1.field5300, var1.field5299);
   }

   public void method1018(float var1, float var2, float var3) {
      this.field1182 += var1;
      this.field1193 += var2;
      this.field1183 += var3;
   }

   public void method1019(float var1, float var2, float var3) {
      this.field1184 = var1;
      this.field1186 = 0.0F;
      this.field1189 = 0.0F;
      this.field1182 = 0.0F;
      this.field1192 = 0.0F;
      this.field1187 = var2;
      this.field1190 = 0.0F;
      this.field1193 = 0.0F;
      this.field1185 = 0.0F;
      this.field1188 = 0.0F;
      this.field1191 = var3;
      this.field1183 = 0.0F;
   }

   public void method1020(float var1, float var2, float var3, float[] var4) {
      var1 -= this.field1182;
      var2 -= this.field1193;
      var3 -= this.field1183;
      var4[0] = (float)((int)(this.field1184 * var1 + this.field1192 * var2 + this.field1185 * var3));
      var4[1] = (float)((int)(this.field1186 * var1 + this.field1187 * var2 + this.field1188 * var3));
      var4[2] = (float)((int)(this.field1189 * var1 + this.field1190 * var2 + this.field1191 * var3));
   }

   public float[] method1021(float[] var1) {
      var1[0] = this.field1182;
      var1[1] = this.field1193;
      var1[2] = this.field1183;
      return var1;
   }

   public void method1022(class135 var1, class135 var2) {
      this.field1184 = var1.field1184 * var2.field1184 + var1.field1192 * var2.field1186 + var1.field1185 * var2.field1189;
      this.field1192 = var1.field1184 * var2.field1192 + var1.field1192 * var2.field1187 + var1.field1185 * var2.field1190;
      this.field1185 = var1.field1184 * var2.field1185 + var1.field1192 * var2.field1188 + var1.field1185 * var2.field1191;
      this.field1186 = var1.field1186 * var2.field1184 + var1.field1187 * var2.field1186 + var1.field1188 * var2.field1189;
      this.field1187 = var1.field1186 * var2.field1192 + var1.field1187 * var2.field1187 + var1.field1188 * var2.field1190;
      this.field1188 = var1.field1186 * var2.field1185 + var1.field1187 * var2.field1188 + var1.field1188 * var2.field1191;
      this.field1189 = var1.field1189 * var2.field1184 + var1.field1190 * var2.field1186 + var1.field1191 * var2.field1189;
      this.field1190 = var1.field1189 * var2.field1192 + var1.field1190 * var2.field1187 + var1.field1191 * var2.field1190;
      this.field1191 = var1.field1189 * var2.field1185 + var1.field1190 * var2.field1188 + var1.field1191 * var2.field1191;
      this.field1182 = var1.field1182 * var2.field1184 + var1.field1193 * var2.field1186 + var1.field1183 * var2.field1189 + var2.field1182;
      this.field1193 = var1.field1182 * var2.field1192 + var1.field1193 * var2.field1187 + var1.field1183 * var2.field1190 + var2.field1193;
      this.field1183 = var1.field1182 * var2.field1185 + var1.field1193 * var2.field1188 + var1.field1183 * var2.field1191 + var2.field1183;
   }

   public void method1023(float[] var1) {
      float var2 = var1[0] - this.field1182;
      float var3 = var1[1] - this.field1193;
      float var4 = var1[2] - this.field1183;
      var1[0] = (float)((int)(this.field1184 * var2 + this.field1192 * var3 + this.field1185 * var4));
      var1[1] = (float)((int)(this.field1186 * var2 + this.field1187 * var3 + this.field1188 * var4));
      var1[2] = (float)((int)(this.field1189 * var2 + this.field1190 * var3 + this.field1191 * var4));
   }

   public void method1024(class135 var1) {
      this.field1184 = var1.field1184;
      this.field1186 = var1.field1186;
      this.field1189 = var1.field1189;
      this.field1182 = var1.field1182;
      this.field1192 = var1.field1192;
      this.field1187 = var1.field1187;
      this.field1190 = var1.field1190;
      this.field1193 = var1.field1193;
      this.field1185 = var1.field1185;
      this.field1188 = var1.field1188;
      this.field1191 = var1.field1191;
      this.field1183 = var1.field1183;
   }

   public void method1025(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.cos((double)var4);
      float var6 = (float)Math.sin((double)var4);
      float var7 = var5 + var1 * var1 * (1.0F - var5);
      float var8 = var3 * var6 + var2 * var1 * (1.0F - var5);
      float var9 = -var2 * var6 + var3 * var1 * (1.0F - var5);
      float var10 = -var3 * var6 + var1 * var2 * (1.0F - var5);
      float var11 = var5 + var2 * var2 * (1.0F - var5);
      float var12 = var1 * var6 + var3 * var2 * (1.0F - var5);
      float var13 = var2 * var6 + var1 * var3 * (1.0F - var5);
      float var14 = -var1 * var6 + var2 * var3 * (1.0F - var5);
      float var15 = var5 + var3 * var3 * (1.0F - var5);
      float var16 = this.field1184;
      float var17 = this.field1192;
      float var18 = this.field1186;
      float var19 = this.field1187;
      float var20 = this.field1189;
      float var21 = this.field1190;
      float var22 = this.field1182;
      float var23 = this.field1193;
      this.field1184 = var16 * var7 + var17 * var10 + this.field1185 * var13;
      this.field1192 = var16 * var8 + var17 * var11 + this.field1185 * var14;
      this.field1185 = var16 * var9 + var17 * var12 + this.field1185 * var15;
      this.field1186 = var18 * var7 + var19 * var10 + this.field1188 * var13;
      this.field1187 = var18 * var8 + var19 * var11 + this.field1188 * var14;
      this.field1188 = var18 * var9 + var19 * var12 + this.field1188 * var15;
      this.field1189 = var20 * var7 + var21 * var10 + this.field1191 * var13;
      this.field1190 = var20 * var8 + var21 * var11 + this.field1191 * var14;
      this.field1191 = var20 * var9 + var21 * var12 + this.field1191 * var15;
      this.field1182 = var22 * var7 + var23 * var10 + this.field1183 * var13;
      this.field1193 = var22 * var8 + var23 * var11 + this.field1183 * var14;
      this.field1183 = var22 * var9 + var23 * var12 + this.field1183 * var15;
   }

   void method1026(class567 var1) {
      this.method1014(var1.field815, var1.field812, var1.field816, var1.field817);
   }

   public void method1027(class135 var1) {
      float var2 = this.field1184;
      float var3 = this.field1192;
      float var4 = this.field1186;
      float var5 = this.field1187;
      float var6 = this.field1189;
      float var7 = this.field1190;
      float var8 = this.field1182;
      float var9 = this.field1193;
      float var10 = this.field1185;
      float var11 = this.field1188;
      float var12 = this.field1191;
      float var13 = this.field1183;
      this.field1184 = var2 * var1.field1184 + var3 * var1.field1186 + var10 * var1.field1189;
      this.field1192 = var2 * var1.field1192 + var3 * var1.field1187 + var10 * var1.field1190;
      this.field1185 = var2 * var1.field1185 + var3 * var1.field1188 + var10 * var1.field1191;
      this.field1186 = var4 * var1.field1184 + var5 * var1.field1186 + var11 * var1.field1189;
      this.field1187 = var4 * var1.field1192 + var5 * var1.field1187 + var11 * var1.field1190;
      this.field1188 = var4 * var1.field1185 + var5 * var1.field1188 + var11 * var1.field1191;
      this.field1189 = var6 * var1.field1184 + var7 * var1.field1186 + var12 * var1.field1189;
      this.field1190 = var6 * var1.field1192 + var7 * var1.field1187 + var12 * var1.field1190;
      this.field1191 = var6 * var1.field1185 + var7 * var1.field1188 + var12 * var1.field1191;
      this.field1182 = var8 * var1.field1184 + var9 * var1.field1186 + var13 * var1.field1189 + var1.field1182;
      this.field1193 = var8 * var1.field1192 + var9 * var1.field1187 + var13 * var1.field1190 + var1.field1193;
      this.field1183 = var8 * var1.field1185 + var9 * var1.field1188 + var13 * var1.field1191 + var1.field1183;
   }

   public void method1028(class135 var1) {
      if (var1 == this) {
         this.method1012();
      } else {
         this.field1184 = var1.field1184;
         this.field1186 = var1.field1192;
         this.field1189 = var1.field1185;
         this.field1192 = var1.field1186;
         this.field1187 = var1.field1187;
         this.field1190 = var1.field1188;
         this.field1185 = var1.field1189;
         this.field1188 = var1.field1190;
         this.field1191 = var1.field1191;
         this.field1182 = -(var1.field1182 * this.field1184 + var1.field1193 * this.field1186 + var1.field1183 * this.field1189);
         this.field1193 = -(var1.field1182 * this.field1192 + var1.field1193 * this.field1187 + var1.field1183 * this.field1190);
         this.field1183 = -(var1.field1182 * this.field1185 + var1.field1193 * this.field1188 + var1.field1183 * this.field1191);
      }

   }

   public void method1029(float[] var1) {
      float var2 = var1[0];
      float var3 = var1[1];
      float var4 = var1[2];
      var1[0] = this.field1184 * var2 + this.field1192 * var3 + this.field1185 * var4;
      var1[1] = this.field1186 * var2 + this.field1187 * var3 + this.field1188 * var4;
      var1[2] = this.field1189 * var2 + this.field1190 * var3 + this.field1191 * var4;
   }

   public void method1030(class446 var1) {
      float var2 = var1.field7638.field817 * var1.field7638.field817;
      float var3 = var1.field7638.field817 * var1.field7638.field815;
      float var4 = var1.field7638.field817 * var1.field7638.field812;
      float var5 = var1.field7638.field817 * var1.field7638.field816;
      float var6 = var1.field7638.field815 * var1.field7638.field815;
      float var7 = var1.field7638.field815 * var1.field7638.field812;
      float var8 = var1.field7638.field815 * var1.field7638.field816;
      float var9 = var1.field7638.field812 * var1.field7638.field812;
      float var10 = var1.field7638.field812 * var1.field7638.field816;
      float var11 = var1.field7638.field816 * var1.field7638.field816;
      this.field1184 = var6 + var2 - var11 - var9;
      this.field1192 = var7 + var5 + var7 + var5;
      this.field1185 = var8 - var4 - var4 + var8;
      this.field1186 = var7 - var5 - var5 + var7;
      this.field1187 = var9 + var2 - var6 - var11;
      this.field1188 = var10 + var3 + var10 + var3;
      this.field1189 = var8 + var4 + var8 + var4;
      this.field1190 = var10 - var3 - var3 + var10;
      this.field1191 = var11 + var2 - var9 - var6;
      this.field1182 = var1.field7637.field5296;
      this.field1193 = var1.field7637.field5300;
      this.field1183 = var1.field7637.field5299;
   }

   public void method1031(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.field1184 * var1 + this.field1186 * var2 + this.field1189 * var3 + this.field1182;
      var4[1] = this.field1192 * var1 + this.field1187 * var2 + this.field1190 * var3 + this.field1193;
      var4[2] = this.field1185 * var1 + this.field1188 * var2 + this.field1191 * var3 + this.field1183;
   }
}
