public class class204 extends class454 implements class297 {
   class955 field7634;
   long field7635;
   class373 field7636 = new class373();

   class204(class955 var1, class887 var2, int var3, int var4, int[][] var5, int[][] var6, int var7, int var8, int var9) {
      super(var3, var4, var7, var5);
      this.field7634 = var1;
      this.G(this.field7634, var2, var3, var4, this.field7229, var6, var7, var8, var9);
   }

   public final void method3917(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      this.ya(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11.field10426 * -1212608691, var11.field10425 * 1996750669, var11.field10427 * -1475891183, var12);
   }

   native void ay(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7);

   public native void method6550(boolean var1);

   public native void method3881(int var1, int var2, int var3);

   public native void method3898();

   native void ya(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int var11, int var12, int var13, boolean var14);

   native void ab(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int var11, int var12, int var13, boolean var14);

   public void method3883(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      boolean var16 = false;
      if (var10 != null) {
         int[] var17 = var10;

         for(int var18 = 0; var18 < var17.length; ++var18) {
            int var19 = var17[var18];
            if (var19 != -1) {
               var16 = true;
               break;
            }
         }
      }

      int var31 = var10.length;
      int[] var32 = new int[var31 * 3];
      int[] var33 = new int[var31 * 3];
      int[] var20 = new int[var31 * 3];
      int[] var21 = new int[var31 * 3];
      int[] var22 = new int[var31 * 3];
      int[] var23 = var11 != null ? new int[var31 * 3] : null;
      int[] var24 = var4 != null ? new int[var31 * 3] : null;
      int[] var25 = var6 != null ? new int[var31 * 3] : null;
      int var26 = 0;

      for(int var27 = 0; var27 < var31; ++var27) {
         int var28 = var7[var27];
         int var29 = var8[var27];
         int var30 = var9[var27];
         var32[var26] = var3[var28];
         var33[var26] = var5[var28];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var28];
         }

         if (var6 != null) {
            var25[var26] = var6[var28];
         }

         ++var26;
         var32[var26] = var3[var29];
         var33[var26] = var5[var29];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var29];
         }

         if (var6 != null) {
            var25[var26] = var6[var29];
         }

         ++var26;
         var32[var26] = var3[var30];
         var33[var26] = var5[var30];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var30];
         }

         if (var6 != null) {
            var25[var26] = var6[var30];
         }

         ++var26;
      }

      if (var16 || var23 != null) {
         this.ya(var1, var2, var32, var24, var33, var25, var20, var23, var21, var22, var14.field10426 * -1212608691, var14.field10425 * 1996750669, var14.field10427 * -1475891183, var15);
      }

   }

   public void method3885(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      int var7 = 0;
      float[] var8 = new float[this.field7636.method910(1828905535)];

      for(class639 var9 = (class639)this.field7636.method901(1766612795); var9 != null; var9 = (class639)this.field7636.method906(49146)) {
         var8[var7++] = var9.method5908(608404512);
      }

      this.t(var8);

      for(int var13 = 0; var13 < var3 + var3; ++var13) {
         for(int var10 = 0; var10 < var3 + var3; ++var10) {
            if (var4[var13][var10]) {
               int var11 = var1 - var3 + var13;
               int var12 = var2 - var3 + var10;
               if (var11 >= 0 && var11 < this.field7226 * -506105871 && var12 >= 0 && var12 < this.field7225 * -1148794921) {
                  this.field7634.method2082().method515(this, var11, var12);
               }
            }
         }
      }

   }

   public void method3886(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      this.field7634.method2082().method516(this, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public native class770 method3889(int var1, int var2, class770 var3);

   public native void method3890(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   public void method3903(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      this.field7634.method2082().method516(this, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public boolean method3908(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return true;
   }

   public void method3892(class639 var1, int[] var2) {
      this.field7636.method897(var1, 1770032903);
      this.A(var1.hashCode(), var1.method5902(823958259), var1.method5901(-2119819308), var1.method5904((byte)45), var1.method5907(-672312292), var1.method5905(-2045432623), var2);
   }

   native void A(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7);

   native void t(float[] var1);

   public final void method3897(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      this.ya(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11.field10426 * -1212608691, var11.field10425 * 1996750669, var11.field10427 * -1475891183, var12);
   }

   public native void method6551(boolean var1);

   public native void method3910(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   public final void method3882(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      this.ya(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11.field10426 * -1212608691, var11.field10425 * 1996750669, var11.field10427 * -1475891183, var12);
   }

   native void an(float[] var1);

   public final void method3896(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      this.ya(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11.field10426 * -1212608691, var11.field10425 * 1996750669, var11.field10427 * -1475891183, var12);
   }

   public native void method3899();

   public void method3915(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      int var7 = 0;
      float[] var8 = new float[this.field7636.method910(1828905535)];

      for(class639 var9 = (class639)this.field7636.method901(1766612795); var9 != null; var9 = (class639)this.field7636.method906(49146)) {
         var8[var7++] = var9.method5908(608404512);
      }

      this.t(var8);

      for(int var13 = 0; var13 < var3 + var3; ++var13) {
         for(int var10 = 0; var10 < var3 + var3; ++var10) {
            if (var4[var13][var10]) {
               int var11 = var1 - var3 + var13;
               int var12 = var2 - var3 + var10;
               if (var11 >= 0 && var11 < this.field7226 * -506105871 && var12 >= 0 && var12 < this.field7225 * -1148794921) {
                  this.field7634.method2082().method515(this, var11, var12);
               }
            }
         }
      }

   }

   public void method3901(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      int var7 = 0;
      float[] var8 = new float[this.field7636.method910(1828905535)];

      for(class639 var9 = (class639)this.field7636.method901(1766612795); var9 != null; var9 = (class639)this.field7636.method906(49146)) {
         var8[var7++] = var9.method5908(608404512);
      }

      this.t(var8);

      for(int var13 = 0; var13 < var3 + var3; ++var13) {
         for(int var10 = 0; var10 < var3 + var3; ++var10) {
            if (var4[var13][var10]) {
               int var11 = var1 - var3 + var13;
               int var12 = var2 - var3 + var10;
               if (var11 >= 0 && var11 < this.field7226 * -506105871 && var12 >= 0 && var12 < this.field7225 * -1148794921) {
                  this.field7634.method2082().method515(this, var11, var12);
               }
            }
         }
      }

   }

   public void method3884(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      boolean var16 = false;
      if (var10 != null) {
         int[] var17 = var10;

         for(int var18 = 0; var18 < var17.length; ++var18) {
            int var19 = var17[var18];
            if (var19 != -1) {
               var16 = true;
               break;
            }
         }
      }

      int var31 = var10.length;
      int[] var32 = new int[var31 * 3];
      int[] var33 = new int[var31 * 3];
      int[] var20 = new int[var31 * 3];
      int[] var21 = new int[var31 * 3];
      int[] var22 = new int[var31 * 3];
      int[] var23 = var11 != null ? new int[var31 * 3] : null;
      int[] var24 = var4 != null ? new int[var31 * 3] : null;
      int[] var25 = var6 != null ? new int[var31 * 3] : null;
      int var26 = 0;

      for(int var27 = 0; var27 < var31; ++var27) {
         int var28 = var7[var27];
         int var29 = var8[var27];
         int var30 = var9[var27];
         var32[var26] = var3[var28];
         var33[var26] = var5[var28];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var28];
         }

         if (var6 != null) {
            var25[var26] = var6[var28];
         }

         ++var26;
         var32[var26] = var3[var29];
         var33[var26] = var5[var29];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var29];
         }

         if (var6 != null) {
            var25[var26] = var6[var29];
         }

         ++var26;
         var32[var26] = var3[var30];
         var33[var26] = var5[var30];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var30];
         }

         if (var6 != null) {
            var25[var26] = var6[var30];
         }

         ++var26;
      }

      if (var16 || var23 != null) {
         this.ya(var1, var2, var32, var24, var33, var25, var20, var23, var21, var22, var14.field10426 * -1212608691, var14.field10425 * 1996750669, var14.field10427 * -1475891183, var15);
      }

   }

   public native void method3893(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   public void method3904(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      this.field7634.method2082().method516(this, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void method3905(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      this.field7634.method2082().method516(this, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void method3906(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      this.field7634.method2082().method516(this, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public native class770 method3907(int var1, int var2, class770 var3);

   public native class770 method3902(int var1, int var2, class770 var3);

   public native class770 method3909(int var1, int var2, class770 var3);

   public void method3913(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      boolean var16 = false;
      if (var10 != null) {
         int[] var17 = var10;

         for(int var18 = 0; var18 < var17.length; ++var18) {
            int var19 = var17[var18];
            if (var19 != -1) {
               var16 = true;
               break;
            }
         }
      }

      int var31 = var10.length;
      int[] var32 = new int[var31 * 3];
      int[] var33 = new int[var31 * 3];
      int[] var20 = new int[var31 * 3];
      int[] var21 = new int[var31 * 3];
      int[] var22 = new int[var31 * 3];
      int[] var23 = var11 != null ? new int[var31 * 3] : null;
      int[] var24 = var4 != null ? new int[var31 * 3] : null;
      int[] var25 = var6 != null ? new int[var31 * 3] : null;
      int var26 = 0;

      for(int var27 = 0; var27 < var31; ++var27) {
         int var28 = var7[var27];
         int var29 = var8[var27];
         int var30 = var9[var27];
         var32[var26] = var3[var28];
         var33[var26] = var5[var28];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var28];
         }

         if (var6 != null) {
            var25[var26] = var6[var28];
         }

         ++var26;
         var32[var26] = var3[var29];
         var33[var26] = var5[var29];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var29];
         }

         if (var6 != null) {
            var25[var26] = var6[var29];
         }

         ++var26;
         var32[var26] = var3[var30];
         var33[var26] = var5[var30];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var30];
         }

         if (var6 != null) {
            var25[var26] = var6[var30];
         }

         ++var26;
      }

      if (var16 || var23 != null) {
         this.ya(var1, var2, var32, var24, var33, var25, var20, var23, var21, var22, var14.field10426 * -1212608691, var14.field10425 * 1996750669, var14.field10427 * -1475891183, var15);
      }

   }

   public boolean method3911(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return true;
   }

   public native void method3891(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   public boolean method3912(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return true;
   }

   public void method3894(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      boolean var16 = false;
      if (var10 != null) {
         int[] var17 = var10;

         for(int var18 = 0; var18 < var17.length; ++var18) {
            int var19 = var17[var18];
            if (var19 != -1) {
               var16 = true;
               break;
            }
         }
      }

      int var31 = var10.length;
      int[] var32 = new int[var31 * 3];
      int[] var33 = new int[var31 * 3];
      int[] var20 = new int[var31 * 3];
      int[] var21 = new int[var31 * 3];
      int[] var22 = new int[var31 * 3];
      int[] var23 = var11 != null ? new int[var31 * 3] : null;
      int[] var24 = var4 != null ? new int[var31 * 3] : null;
      int[] var25 = var6 != null ? new int[var31 * 3] : null;
      int var26 = 0;

      for(int var27 = 0; var27 < var31; ++var27) {
         int var28 = var7[var27];
         int var29 = var8[var27];
         int var30 = var9[var27];
         var32[var26] = var3[var28];
         var33[var26] = var5[var28];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var28];
         }

         if (var6 != null) {
            var25[var26] = var6[var28];
         }

         ++var26;
         var32[var26] = var3[var29];
         var33[var26] = var5[var29];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var29];
         }

         if (var6 != null) {
            var25[var26] = var6[var29];
         }

         ++var26;
         var32[var26] = var3[var30];
         var33[var26] = var5[var30];
         var20[var26] = var10[var27];
         var21[var26] = var12[var27];
         var22[var26] = var13[var27];
         if (var11 != null) {
            var23[var26] = var11[var27];
         }

         if (var4 != null) {
            var24[var26] = var4[var30];
         }

         if (var6 != null) {
            var25[var26] = var6[var30];
         }

         ++var26;
      }

      if (var16 || var23 != null) {
         this.ya(var1, var2, var32, var24, var33, var25, var20, var23, var21, var22, var14.field10426 * -1212608691, var14.field10425 * 1996750669, var14.field10427 * -1475891183, var15);
      }

   }

   public void method3895(class639 var1, int[] var2) {
      this.field7636.method897(var1, 957931044);
      this.A(var1.hashCode(), var1.method5902(823958259), var1.method5901(-939748445), var1.method5904((byte)100), var1.method5907(-1170808732), var1.method5905(-2059498120), var2);
   }

   public void method3916(class639 var1, int[] var2) {
      this.field7636.method897(var1, 1406819574);
      this.A(var1.hashCode(), var1.method5902(823958259), var1.method5901(-1659137214), var1.method5904((byte)53), var1.method5907(-822697788), var1.method5905(-1817941652), var2);
   }

   native void au(float[] var1);

   native void ap(class955 var1, class887 var2, int var3, int var4, int[][] var5, int[][] var6, int var7, int var8, int var9);

   native void af(class955 var1, class887 var2, int var3, int var4, int[][] var5, int[][] var6, int var7, int var8, int var9);

   native void aw(class955 var1, class887 var2, int var3, int var4, int[][] var5, int[][] var6, int var7, int var8, int var9);

   public void method3900(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      this.field7634.method2082().method516(this, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   native void aj(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int var11, int var12, int var13, boolean var14);

   native void G(class955 var1, class887 var2, int var3, int var4, int[][] var5, int[][] var6, int var7, int var8, int var9);

   native void aq(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7);

   native void ag(float[] var1);

   public native void method3914(int var1, int var2, int var3);

   public native void method3880(class770 var1, int var2, int var3, int var4, int var5, boolean var6);
}
