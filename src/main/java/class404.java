public class class404 extends class48 {
   int field9236;
   class801 field9237;
   class813 field9238;
   int field9239;
   boolean field9240;
   boolean field9241;
   int field9242;
   int field9243;
   int field9244;
   int field9245;
   class325 field9246;
   boolean field9247;
   boolean field9248;
   boolean field9249;

   public int method3106() {
      return this.field9236;
   }

   class404(class325 var1, int var2, int var3, int[] var4, int var5, int var6) {
      this.field9241 = false;
      this.field9242 = 0;
      this.field9239 = 0;
      this.field9244 = 0;
      this.field9245 = 0;
      this.field9246 = var1;
      this.field9236 = var2;
      this.field9243 = var3;
      this.field9238 = null;
      this.field9237 = var1.method614(var2, var3, false, var4, var5, var6);
      this.field9237.method2849(true, true);
      this.field9249 = this.field9237.method2861() != var2;
      this.field9247 = this.field9237.method2845() != var3;
      this.field9248 = !this.field9249 && this.field9237.method2848();
      this.field9240 = !this.field9247 && this.field9237.method2848();
      this.field9246.method563(12);
   }

   public void method3158(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.field9246.method5051(var5, var6, var3, var4);
      if (var7 != null) {
         for(int var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] |= -16777216;
         }

         this.method5491(var1, var2, var3, var4, var7, 0, var3);
      }

   }

   public void method3115(int var1, int var2, int var3) {
      int[] var4 = this.field9246.method5051(var1, var2, this.field9236, this.field9243);
      int[] var5 = new int[this.field9236 * this.field9243];
      this.field9237.method2852(0, 0, this.field9236, this.field9243, var5, 0);
      int var6;
      int var7;
      int var8;
      if (var3 == 0) {
         for(var6 = 0; var6 < this.field9243; ++var6) {
            var7 = var6 * this.field9236;

            for(var8 = 0; var8 < this.field9236; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 8 & -16777216;
            }
         }
      } else if (var3 == 1) {
         for(var6 = 0; var6 < this.field9243; ++var6) {
            var7 = var6 * this.field9236;

            for(var8 = 0; var8 < this.field9236; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 16 & -16777216;
            }
         }
      } else if (var3 == 2) {
         for(var6 = 0; var6 < this.field9243; ++var6) {
            var7 = var6 * this.field9236;

            for(var8 = 0; var8 < this.field9236; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 24 & -16777216;
            }
         }
      } else if (var3 == 3) {
         for(var6 = 0; var6 < this.field9243; ++var6) {
            var7 = var6 * this.field9236;

            for(var8 = 0; var8 < this.field9236; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | (var4[var7 + var8] != 0 ? -16777216 : 0);
            }
         }
      }

      this.method5491(0, 0, this.field9236, this.field9243, var5, 0, this.field9236);
   }

   public void method3104(int var1, int var2, int var3, int var4) {
      this.field9239 = var1;
      this.field9242 = var2;
      this.field9245 = var3;
      this.field9244 = var4;
      this.field9241 = this.field9239 != 0 || this.field9242 != 0 || this.field9245 != 0 || this.field9244 != 0;
   }

   public int method5594() {
      return this.field9236 + this.field9239 + this.field9245;
   }

   public int method3108() {
      return this.field9243;
   }

   public int method3109() {
      return this.field9243 + this.field9242 + this.field9244;
   }

   public class813 method3110() {
      return this.field9238;
   }

   public void method3114(int var1, int var2, int var3, int var4, int var5) {
      this.field9246.method596();
      this.field9246.method633(var5);
      class523 var6 = this.field9246.field701;
      var6.field4362 = this.field9237;
      var6.method2762(var3, var4);
      var1 += this.field9239;
      var2 += this.field9242;
      float var7 = (float)this.field9246.method4800((short)-1641).method2481();
      float var8 = (float)this.field9246.method4800((short)-380).method2493();
      var6.field4365.method274((float)this.field9236 * 2.0F / var7, (float)this.field9243 * 2.0F / var8, 1.0F, 1.0F);
      var6.field4365.field325[12] = ((float)var1 + this.field9246.method574()) * 2.0F / var7 - 1.0F;
      var6.field4365.field325[13] = ((float)var2 + this.field9246.method574()) * 2.0F / var8 - 1.0F;
      var6.field4365.field325[14] = -1.0F;
      var6.field4366.method274(this.field9237.method2846((float)this.field9236), this.field9237.method2847((float)this.field9243), 1.0F, 1.0F);
      var6.field4363 = this.field9246.field646;
      var6.field4368 = 0;
      var6.field4369 = this.field9246.field800;
      var6.method2763();
   }

   void method3118(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.field9246.method596();
      this.field9246.method633(var7);
      class523 var9 = this.field9246.field701;
      var9.field4362 = this.field9237;
      var9.method2762(var5, var6);
      if (this.field9241) {
         var3 = var3 * this.field9236 / this.method5594();
         var4 = var4 * this.field9243 / this.method3109();
         var1 += this.field9239 * var3 / this.field9236;
         var2 += this.field9242 * var4 / this.field9243;
      }

      float var10 = (float)this.field9246.method4800((short)7730).method2481();
      float var11 = (float)this.field9246.method4800((short)-15790).method2493();
      var9.field4365.method274((float)var3 * 2.0F / var10, (float)var4 * 2.0F / var11, 1.0F, 1.0F);
      var9.field4365.field325[12] = ((float)var1 + this.field9246.method574()) * 2.0F / var10 - 1.0F;
      var9.field4365.field325[13] = ((float)var2 + this.field9246.method574()) * 2.0F / var11 - 1.0F;
      var9.field4365.field325[14] = -1.0F;
      var9.field4366.method274(this.field9237.method2846((float)this.field9236), this.field9237.method2847((float)this.field9243), 1.0F, 1.0F);
      var9.field4363 = this.field9246.field646;
      var9.field4368 = 0;
      var9.field4369 = this.field9246.field800;
      var9.method2763();
   }

   public void method3105(int[] var1) {
      var1[0] = this.field9239;
      var1[1] = this.field9242;
      var1[2] = this.field9245;
      var1[3] = this.field9244;
   }

   void method3125(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      this.field9246.method596();
      this.field9246.method633(var9);
      float var12;
      float var13;
      if (this.field9241) {
         float var11 = (float)this.method5594();
         var12 = (float)this.method3109();
         var13 = (var3 - var1) / var11;
         float var14 = (var4 - var2) / var11;
         float var15 = (var5 - var1) / var12;
         float var16 = (var6 - var2) / var12;
         float var17 = var15 * (float)this.field9242;
         float var18 = var16 * (float)this.field9242;
         float var19 = var13 * (float)this.field9239;
         float var20 = var14 * (float)this.field9239;
         float var21 = -var13 * (float)this.field9245;
         float var22 = -var14 * (float)this.field9245;
         float var23 = -var15 * (float)this.field9244;
         float var24 = -var16 * (float)this.field9244;
         var1 = var1 + var19 + var17;
         var2 = var2 + var20 + var18;
         var3 = var3 + var21 + var17;
         var4 = var4 + var22 + var18;
         var5 = var5 + var19 + var23;
         var6 = var6 + var20 + var24;
      }

      class523 var25 = this.field9246.field701;
      var25.field4362 = this.field9237;
      var25.method2762(var7, var8);
      var12 = (float)this.field9246.method4800((short)-6090).method2481();
      var13 = (float)this.field9246.method4800((short)1699).method2493();
      var25.field4365.method299();
      var25.field4365.field325[0] = (var3 - var1) * 2.0F / var12;
      var25.field4365.field325[1] = (var4 - var2) * 2.0F / var13;
      var25.field4365.field325[4] = (var5 - var1) * 2.0F / var12;
      var25.field4365.field325[5] = (var6 - var2) * 2.0F / var13;
      var25.field4365.field325[12] = (var1 + this.field9246.method574()) * 2.0F / var12 - 1.0F;
      var25.field4365.field325[13] = (var2 + this.field9246.method574()) * 2.0F / var13 - 1.0F;
      var25.field4365.field325[14] = -1.0F;
      var25.field4366.method274(this.field9237.method2846((float)this.field9236), this.field9237.method2847((float)this.field9243), 1.0F, 1.0F);
      var25.field4363 = this.field9246.field646;
      var25.field4368 = 0;
      var25.field4369 = this.field9246.field800;
      var25.method2763();
   }

   void method3127(float var1, float var2, float var3, float var4, float var5, float var6, int var7, class23 var8, int var9, int var10) {
      this.field9246.method596();
      class523 var11 = this.field9246.field701;
      var11.field4362 = this.field9237;
      var11.method2762(1, -1);
      float var12 = (float)this.field9246.method4800((short)1715).method2481();
      float var13 = (float)this.field9246.method4800((short)551).method2493();
      var11.field4365.method299();
      if (this.field9241) {
         float var14 = (float)this.field9236 / (float)this.method5594();
         float var15 = (float)this.field9243 / (float)this.method3109();
         var11.field4365.field325[0] = (var3 - var1) * var14;
         var11.field4365.field325[1] = (var4 - var2) * var14;
         var11.field4365.field325[4] = (var5 - var1) * var15;
         var11.field4365.field325[5] = (var6 - var2) * var15;
         var11.field4365.field325[12] = (var1 + (float)this.field9239) * var14 + this.field9246.method574();
         var11.field4365.field325[13] = (var2 + (float)this.field9242) * var15 + this.field9246.method574();
      } else {
         var11.field4365.field325[0] = var3 - var1;
         var11.field4365.field325[1] = var4 - var2;
         var11.field4365.field325[4] = var5 - var1;
         var11.field4365.field325[5] = var6 - var2;
         var11.field4365.field325[12] = var1 + this.field9246.method574();
         var11.field4365.field325[13] = var2 + this.field9246.method574();
      }

      class344 var16 = this.field9246.field680;
      var16.method299();
      var16.field325[0] = 2.0F / var12;
      var16.field325[5] = 2.0F / var13;
      var16.field325[12] = -1.0F;
      var16.field325[13] = -1.0F;
      var16.field325[14] = -1.0F;
      var11.field4365.method271(var16);
      var11.field4366.method274(this.field9237.method2846((float)this.field9236), this.field9237.method2847((float)this.field9243), 1.0F, 1.0F);
      var11.field4363 = this.field9246.field646;
      var11.field4368 = 0;
      var11.field4369 = this.field9246.field800;
      class801 var17 = ((class121)var8).field2385;
      var11.field4361 = var17;
      var11.field4367.method299();
      var11.field4367.field325[0] = (var3 - var1) * var17.method2846(1.0F);
      var11.field4367.field325[1] = (var4 - var2) * var17.method2846(1.0F);
      var11.field4367.field325[4] = (var5 - var1) * var17.method2847(1.0F);
      var11.field4367.field325[5] = (var6 - var2) * var17.method2847(1.0F);
      var11.field4367.field325[12] = (var1 - (float)var9) * var17.method2846(1.0F);
      var11.field4367.field325[13] = (var2 - (float)var10) * var17.method2847(1.0F);
      var11.method2764();
   }

   class404(class325 var1, class801 var2, int var3, int var4) {
      this.field9241 = false;
      this.field9242 = 0;
      this.field9239 = 0;
      this.field9244 = 0;
      this.field9245 = 0;
      this.field9246 = var1;
      this.field9236 = var3;
      this.field9243 = var4;
      this.field9237 = var2;
      this.field9238 = null;
      this.field9249 = this.field9237.method2861() != var3;
      this.field9247 = this.field9237.method2845() != var4;
      this.field9248 = !this.field9249 && this.field9237.method2848();
      this.field9240 = !this.field9247 && this.field9237.method2848();
      this.field9246.method563(12);
   }

   class404(class325 var1, class801 var2) {
      this(var1, var2, var2.method2861(), var2.method2845());
   }

   class404(class325 var1, int var2, int var3, boolean var4, boolean var5) {
      this.field9241 = false;
      this.field9242 = 0;
      this.field9239 = 0;
      this.field9244 = 0;
      this.field9245 = 0;
      this.field9246 = var1;
      this.field9236 = var2;
      this.field9243 = var3;
      if (var5) {
         class33 var6 = var1.method615(var4 ? class264.field8191 : class264.field8194, class482.field8399, var2, var3);
         this.field9238 = var6.method3326(0);
         this.field9237 = var6;
      } else {
         this.field9237 = var1.method612(var4 ? class264.field8191 : class264.field8194, class482.field8399, var2, var3);
         this.field9238 = null;
      }

      this.field9237.method2849(true, true);
      this.field9249 = this.field9237.method2861() != var2;
      this.field9247 = this.field9237.method2845() != var3;
      this.field9248 = !this.field9249 && this.field9237.method2848();
      this.field9240 = !this.field9247 && this.field9237.method2848();
      this.field9246.method563(12);
   }

   public void method3145(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field9246.method596();
      this.field9246.method633(var7);
      class523 var8 = this.field9246.field701;
      var8.field4362 = this.field9237;
      var8.method2762(var5, var6);
      float var9 = (float)this.field9246.method4800((short)4017).method2481();
      float var10 = (float)this.field9246.method4800((short)-4315).method2493();
      var8.field4363 = this.field9246.field646;
      var8.field4368 = 0;
      var8.field4369 = this.field9246.field800;
      boolean var11 = this.field9240 && this.field9242 == 0 && this.field9244 == 0;
      boolean var12 = this.field9248 && this.field9239 == 0 && this.field9245 == 0;
      if (var12 & var11) {
         var8.field4365.method274((float)var3 * 2.0F / var9, (float)var4 * 2.0F / var10, 1.0F, 1.0F);
         var8.field4365.field325[12] = ((float)var1 + this.field9246.method574()) * 2.0F / var9 - 1.0F;
         var8.field4365.field325[13] = ((float)var2 + this.field9246.method574()) * 2.0F / var10 - 1.0F;
         var8.field4365.field325[14] = -1.0F;
         var8.field4366.method274(this.field9237.method2846((float)var3), this.field9237.method2847((float)var4), 1.0F, 1.0F);
         var8.method2763();
      } else {
         int var13;
         int var14;
         int var15;
         int var16;
         if (var12) {
            var13 = var2 + var4;
            var14 = this.method3109();
            var8.field4366.method274(this.field9237.method2846((float)var3), this.field9237.method2847((float)this.field9243), 1.0F, 1.0F);
            var15 = var2 + this.field9242;

            for(var16 = var15 + this.field9243; var16 <= var13; var16 += var14) {
               var8.field4365.method274((float)var3 * 2.0F / var9, (float)this.field9243 * 2.0F / var10, 1.0F, 1.0F);
               var8.field4365.field325[12] = ((float)var1 + this.field9246.method574()) * 2.0F / var9 - 1.0F;
               var8.field4365.field325[13] = ((float)var15 + this.field9246.method574()) * 2.0F / var10 - 1.0F;
               var8.field4365.field325[14] = -1.0F;
               var8.method2763();
               var15 += var14;
            }

            if (var15 < var13) {
               var16 = var13 - var15;
               var8.field4366.method274(this.field9237.method2846((float)var3), this.field9237.method2847((float)var16), 1.0F, 1.0F);
               var8.field4365.method274((float)var3 * 2.0F / var9, (float)var16 * 2.0F / var10, 1.0F, 1.0F);
               var8.field4365.field325[12] = ((float)var1 + this.field9246.method574()) * 2.0F / var9 - 1.0F;
               var8.field4365.field325[13] = ((float)var15 + this.field9246.method574()) * 2.0F / var10 - 1.0F;
               var8.field4365.field325[14] = -1.0F;
               var8.method2763();
            }
         } else if (var11) {
            var13 = var1 + var3;
            var14 = this.method5594();
            var8.field4366.method274(this.field9237.method2846((float)this.field9236), this.field9237.method2847((float)var4), 1.0F, 1.0F);
            var15 = var1 + this.field9239;

            for(var16 = var15 + this.field9236; var16 <= var13; var16 += var14) {
               var8.field4365.method274((float)this.field9236 * 2.0F / var9, (float)var4 * 2.0F / var10, 1.0F, 1.0F);
               var8.field4365.field325[12] = ((float)var15 + this.field9246.method574()) * 2.0F / var9 - 1.0F;
               var8.field4365.field325[13] = ((float)var2 + this.field9246.method574()) * 2.0F / var10 - 1.0F;
               var8.field4365.field325[14] = -1.0F;
               var8.method2763();
               var15 += var14;
            }

            if (var15 < var13) {
               var16 = var13 - var15;
               var8.field4366.method274(this.field9237.method2846((float)var16), this.field9237.method2847((float)var4), 1.0F, 1.0F);
               var8.field4365.method274((float)var16 * 2.0F / var9, (float)var4 * 2.0F / var10, 1.0F, 1.0F);
               var8.field4365.field325[12] = ((float)var15 + this.field9246.method574()) * 2.0F / var9 - 1.0F;
               var8.field4365.field325[13] = ((float)var2 + this.field9246.method574()) * 2.0F / var10 - 1.0F;
               var8.field4365.field325[14] = -1.0F;
               var8.method2763();
            }
         } else {
            var13 = var2 + var4;
            var14 = var1 + var3;
            var15 = this.method5594();
            var16 = this.method3109();
            int var17 = var2 + this.field9242;

            int var18;
            int var19;
            int var20;
            for(var18 = var17 + this.field9243; var18 <= var13; var18 += var16) {
               var8.field4366.method274(this.field9237.method2846((float)this.field9236), this.field9237.method2847((float)this.field9243), 1.0F, 1.0F);
               var19 = var1 + this.field9239;

               for(var20 = var19 + this.field9236; var20 <= var14; var20 += var15) {
                  var8.field4365.method274((float)this.field9236 * 2.0F / var9, (float)this.field9243 * 2.0F / var10, 1.0F, 1.0F);
                  var8.field4365.field325[12] = ((float)var19 + this.field9246.method574()) * 2.0F / var9 - 1.0F;
                  var8.field4365.field325[13] = ((float)var17 + this.field9246.method574()) * 2.0F / var10 - 1.0F;
                  var8.field4365.field325[14] = -1.0F;
                  var8.method2763();
                  var19 += var15;
               }

               if (var19 < var14) {
                  var20 = var14 - var19;
                  var8.field4366.method274(this.field9237.method2846((float)var20), this.field9237.method2847((float)this.field9243), 1.0F, 1.0F);
                  var8.field4365.method274((float)var20 * 2.0F / var9, (float)this.field9243 * 2.0F / var10, 1.0F, 1.0F);
                  var8.field4365.field325[12] = ((float)var19 + this.field9246.method574()) * 2.0F / var9 - 1.0F;
                  var8.field4365.field325[13] = ((float)var17 + this.field9246.method574()) * 2.0F / var10 - 1.0F;
                  var8.field4365.field325[14] = -1.0F;
                  var8.method2763();
               }

               var17 += var16;
            }

            if (var17 < var13) {
               var18 = var13 - var17;
               var8.field4366.method274(this.field9237.method2846((float)this.field9236), this.field9237.method2847((float)var18), 1.0F, 1.0F);
               var19 = var1 + this.field9239;

               for(var20 = var19 + this.field9236; var20 <= var14; var20 += var15) {
                  var8.field4365.method274((float)this.field9236 * 2.0F / var9, (float)var18 * 2.0F / var10, 1.0F, 1.0F);
                  var8.field4365.field325[12] = ((float)var19 + this.field9246.method574()) * 2.0F / var9 - 1.0F;
                  var8.field4365.field325[13] = ((float)var17 + this.field9246.method574()) * 2.0F / var10 - 1.0F;
                  var8.field4365.field325[14] = -1.0F;
                  var8.method2763();
                  var19 += var15;
               }

               if (var19 < var14) {
                  var20 = var14 - var19;
                  var8.field4366.method274(this.field9237.method2846((float)var20), this.field9237.method2847((float)var18), 1.0F, 1.0F);
                  var8.field4365.method274((float)var20 * 2.0F / var9, (float)var18 * 2.0F / var10, 1.0F, 1.0F);
                  var8.field4365.field325[12] = ((float)var19 + this.field9246.method574()) * 2.0F / var9 - 1.0F;
                  var8.field4365.field325[13] = ((float)var17 + this.field9246.method574()) * 2.0F / var10 - 1.0F;
                  var8.field4365.field325[14] = -1.0F;
                  var8.method2763();
               }
            }
         }
      }

   }

   void method5491(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.field9237.method2850(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method3137(int var1, int var2, class23 var3, int var4, int var5) {
      this.field9246.method596();
      class523 var6 = this.field9246.field701;
      var6.field4362 = this.field9237;
      var6.method2762(1, -1);
      var1 += this.field9239;
      var2 += this.field9242;
      float var7 = (float)this.field9246.method4800((short)-10311).method2481();
      float var8 = (float)this.field9246.method4800((short)-2951).method2493();
      var6.field4365.method274((float)this.field9236 * 2.0F / var7, (float)this.field9243 * 2.0F / var8, 1.0F, 1.0F);
      var6.field4365.field325[12] = ((float)var1 + this.field9246.method574()) * 2.0F / var7 - 1.0F;
      var6.field4365.field325[13] = ((float)var2 + this.field9246.method574()) * 2.0F / var8 - 1.0F;
      var6.field4365.field325[14] = -1.0F;
      var6.field4366.method274(this.field9237.method2846((float)this.field9236), this.field9237.method2847((float)this.field9243), 1.0F, 1.0F);
      var6.field4363 = this.field9246.field646;
      var6.field4368 = 0;
      var6.field4369 = this.field9246.field800;
      class801 var9 = ((class121)var3).field2385;
      var6.field4361 = var9;
      var6.field4367.method274(var9.method2846((float)this.field9236), var9.method2847((float)this.field9243), 1.0F, 1.0F);
      var6.field4367.field325[12] = var9.method2846((float)(var1 - var4));
      var6.field4367.field325[13] = var9.method2847((float)(var2 - var5));
      var6.method2764();
   }
}
