public class class171 extends class879 implements class297 {
   long field5094;
   class955 field5095;
   class887 field5096;
   class396[] field5097;
   class933[] field5098;

   public native int method6078();

   class171(class955 var1) {
      this.field5095 = var1;
      this.field5096 = null;
      this.ba(var1);
   }

   void method6023() {
      if (this.field5095.field3555 > 1) {
         synchronized(this) {
            while(this.field9859) {
               try {
                  this.wait();
               } catch (InterruptedException var3) {
                  ;
               }
            }

            this.field9859 = true;
         }
      }

   }

   native void ba(class955 var1);

   public native void method6550(boolean var1);

   public void method6096(class135 var1) {
      this.method3068(class955.field3544, var1);
      int var2 = 0;
      int var3;
      if (this.field5098 != null) {
         for(var3 = 0; var3 < this.field5098.length; ++var3) {
            class933 var4 = this.field5098[var3];
            var4.field10330 = class955.field3544[var2++] * -1879868075;
            var4.field10336 = class955.field3544[var2++] * -2041556771;
            var4.field10332 = class955.field3544[var2++] * -1434499227;
            var4.field10325 = class955.field3544[var2++] * 1070341177;
            var4.field10334 = class955.field3544[var2++] * 1802851857;
            var4.field10335 = class955.field3544[var2++] * 103846281;
            var4.field10324 = class955.field3544[var2++] * -2103324039;
            var4.field10337 = class955.field3544[var2++] * -526039059;
            var4.field10338 = class955.field3544[var2++] * 491030489;
         }
      }

      if (this.field5097 != null) {
         for(var3 = 0; var3 < this.field5097.length; ++var3) {
            class396 var6 = this.field5097[var3];
            class396 var5 = var6;
            if (var6.field6509 != null) {
               var5 = var6.field6509;
            }

            if (var6.field6514 == null) {
               var6.field6514 = new class344();
            }

            var6.field6514.method272(var1);
            var5.field6508 = class955.field3544[var2++] * -1436341053;
            var5.field6512 = class955.field3544[var2++] * 449866009;
            var5.field6513 = class955.field3544[var2++] * 1336328763;
         }
      }

   }

   void method3068(int[] var1, class135 var2) {
      this.field5095.method2082().method514(this, var1, var2);
   }

   public class879 method6017(byte var1, int var2, boolean var3) {
      return this.field5095.method2082().method510(this, var1, var2, var3);
   }

   native void BA(class171 var1, class171 var2, int var3, boolean var4, boolean var5);

   public void method6093() {
   }

   public native int method5948();

   public void method5994(class879 var1, int var2, int var3, int var4, boolean var5) {
      this.field5095.method2082().method519(this, var1, var2, var3, var4, var5);
   }

   public native void method6016(int var1);

   public native void method5951(int var1);

   public native void method5952(int var1);

   public native void method6041(int var1);

   public native void method5953(int var1, int var2, int var3);

   public native void method5954();

   public native void method5946(int var1);

   public native void method5961(int var1, int var2, class454 var3, class454 var4, int var5, int var6, int var7);

   public native int method6006();

   public native int method5977();

   native boolean method5949();

   final void method5964(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.J(this.field5094, var1, var2, var3, var4, var5, var6, var7);
   }

   public native void method6011(int var1);

   native void method5967(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

   public native void method6021(int var1, int var2, class454 var3, class454 var4, int var5, int var6, int var7);

   public native void method6015(int var1, int var2, int var3);

   public void method5970(class135 var1, int var2, boolean var3) {
      class344 var4 = this.field5095.method2082().field586;
      var4.method272(var1);
      this.aa(var4.field325, var2, var3);
   }

   native void aa(float[] var1, int var2, boolean var3);

   native void fq(long var1, int var3, int[] var4, int var5, int var6, int var7, int var8, boolean var9);

   public boolean method6097(int var1, int var2, class135 var3, boolean var4, int var5) {
      return this.field5095.method2082().method518(this, var1, var2, var3, var4);
   }

   public void method6083(class879 var1, int var2, int var3, int var4, boolean var5) {
      this.field5095.method2082().method519(this, var1, var2, var3, var4, var5);
   }

   public native int method5972();

   public native int method5973();

   public native void method6059(int var1);

   public native int method6047();

   public native int method5976();

   public native class770 method6027(class770 var1);

   native void method5974(int var1, int var2, int var3, int var4);

   public native int method5979();

   public native void method5980(int var1);

   public native void method5981(int var1);

   public native int method5982();

   native void method6084();

   public native byte[] method5983();

   public native void method5984(short var1, short var2);

   native void fp(class171 var1, class171 var2, int var3, boolean var4, boolean var5);

   native void IA(byte var1, byte[] var2);

   public class396[] method6077() {
      return this.field5097;
   }

   public native void method5987(int var1, int var2, int var3, int var4);

   public boolean method5988() {
      return true;
   }

   public native void method6070(short var1, short var2);

   void method5959() {
      if (this.field5095.field3555 > 1) {
         synchronized(this) {
            this.field9859 = false;
            this.notifyAll();
         }
      }

   }

   public class933[] method6089() {
      return this.field5098;
   }

   public class396[] method5941() {
      return this.field5097;
   }

   public native void method5990(short var1, short var2);

   public class933[] method6075() {
      return this.field5098;
   }

   native void U(class955 var1, class887 var2, int var3, int var4, int[] var5, int[] var6, int[] var7, int[] var8, short[] var9, int var10, short[] var11, short[] var12, short[] var13, byte[] var14, byte[] var15, byte[] var16, byte[] var17, short[] var18, short[] var19, int[] var20, byte var21, short[] var22, int var23, byte[] var24, short[] var25, short[] var26, short[] var27, int[] var28, int[] var29, int[] var30, byte[] var31, byte[] var32, int[] var33, int[] var34, int[] var35, int[] var36, int var37, int var38, int var39, int var40, int var41, int var42, int[] var43);

   public class879 method5997(byte var1, int var2, boolean var3) {
      return this.field5095.method2082().method510(this, var1, var2, var3);
   }

   public class879 method6067(byte var1, int var2, boolean var3) {
      return this.field5095.method2082().method510(this, var1, var2, var3);
   }

   public class879 method5999(byte var1, int var2, boolean var3) {
      return this.field5095.method2082().method510(this, var1, var2, var3);
   }

   public native boolean method5989();

   public native int method6088();

   public native void method6002(int var1);

   public native void method6003(int var1);

   public native void method6103(int var1);

   public void method6005() {
   }

   public void method6049() {
   }

   public native void method6007(int var1);

   public native void method6008(int var1);

   native void method5966(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

   public native void method6010(int var1);

   public native void method5986(short var1, short var2);

   public native void method6012(int var1);

   public native void method5971(int var1);

   public native void method6069(short var1, short var2);

   public void method5969(class135 var1, class211 var2, int var3) {
      if (var2 == null) {
         this.field5095.method2082().method513(this, var1, (int[])null, var3);
      } else {
         class955.field3568[5] = 0;
         this.field5095.method2082().method513(this, var1, class955.field3568, var3);
         var2.field7246 = class955.field3568[0];
         var2.field7247 = class955.field3568[1];
         var2.field7248 = class955.field3568[2];
         var2.field7245 = class955.field3568[3];
         var2.field7250 = class955.field3568[4];
         var2.field7249 = class955.field3568[5] != 0;
      }

   }

   public native void method5992(int var1, int var2, int var3);

   public native void method6094(int var1, int var2, int var3);

   public native void method6019(int var1, int var2, int var3);

   public native void method6020(int var1, int var2, class454 var3, class454 var4, int var5, int var6, int var7);

   public native int method6099();

   public native void method6022(int var1, int var2, class454 var3, class454 var4, int var5, int var6, int var7);

   void method6013() {
      if (this.field5095.field3555 > 1) {
         synchronized(this) {
            while(this.field9859) {
               try {
                  this.wait();
               } catch (InterruptedException var3) {
                  ;
               }
            }

            this.field9859 = true;
         }
      }

   }

   public void method5996(class879 var1, int var2, int var3, int var4, boolean var5) {
      this.field5095.method2082().method519(this, var1, var2, var3, var4, var5);
   }

   public void method5965(class135 var1, class211 var2, int var3) {
      if (var2 == null) {
         this.field5095.method2082().method513(this, var1, (int[])null, var3);
      } else {
         class955.field3568[5] = 0;
         this.field5095.method2082().method513(this, var1, class955.field3568, var3);
         var2.field7246 = class955.field3568[0];
         var2.field7247 = class955.field3568[1];
         var2.field7248 = class955.field3568[2];
         var2.field7245 = class955.field3568[3];
         var2.field7250 = class955.field3568[4];
         var2.field7249 = class955.field3568[5] != 0;
      }

   }

   void method6025() {
      if (this.field5095.field3555 > 1) {
         synchronized(this) {
            this.field9859 = false;
            this.notifyAll();
         }
      }

   }

   native boolean method6026();

   native boolean method6024();

   native void method6028();

   native void method6031();

   native void method6030();

   native void method6068();

   final void method6032(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.J(this.field5094, var1, var2, var3, var4, var5, var6, var7);
   }

   native void fe(class955 var1);

   void method6018() {
      if (this.field5095.field3555 > 1) {
         synchronized(this) {
            while(this.field9859) {
               try {
                  this.wait();
               } catch (InterruptedException var3) {
                  ;
               }
            }

            this.field9859 = true;
         }
      }

   }

   native void gc(float[] var1, int var2, boolean var3);

   native void method6034(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

   native void J(long var1, int var3, int[] var4, int var5, int var6, int var7, int var8, boolean var9);

   native void method6035(int var1, int var2, int var3, int var4);

   public void method6080(class135 var1, int var2, boolean var3) {
      class344 var4 = this.field5095.method2082().field586;
      var4.method272(var1);
      this.aa(var4.field325, var2, var3);
   }

   public void method6037(class135 var1, int var2, boolean var3) {
      class344 var4 = this.field5095.method2082().field586;
      var4.method272(var1);
      this.aa(var4.field325, var2, var3);
   }

   public void method6029(class135 var1, class211 var2, int var3) {
      if (var2 == null) {
         this.field5095.method2082().method513(this, var1, (int[])null, var3);
      } else {
         class955.field3568[5] = 0;
         this.field5095.method2082().method513(this, var1, class955.field3568, var3);
         var2.field7246 = class955.field3568[0];
         var2.field7247 = class955.field3568[1];
         var2.field7248 = class955.field3568[2];
         var2.field7245 = class955.field3568[3];
         var2.field7250 = class955.field3568[4];
         var2.field7249 = class955.field3568[5] != 0;
      }

   }

   native void gn(byte var1, byte[] var2);

   class171(class955 var1, class887 var2, class25 var3, int var4, int var5, int var6, int var7) {
      this.field5095 = var1;
      this.field5096 = var2;
      this.field5098 = var3.field6479;
      this.field5097 = var3.field6445;
      int var8 = var3.field6479 == null ? 0 : var3.field6479.length;
      int var9 = var3.field6445 == null ? 0 : var3.field6445.length;
      int var10 = 0;
      int[] var11 = new int[var8 * 3 + var9];

      int var12;
      for(var12 = 0; var12 < var8; ++var12) {
         var11[var10++] = this.field5098[var12].field10326 * -710317103;
         var11[var10++] = this.field5098[var12].field10327 * 1705862021;
         var11[var10++] = this.field5098[var12].field10328 * 1636170731;
      }

      for(var12 = 0; var12 < var9; ++var12) {
         var11[var10++] = this.field5097[var12].field6511 * -180596249;
      }

      var12 = var3.field6481 == null ? 0 : var3.field6481.length;
      int[] var13 = new int[var12 * 8];
      int var14 = 0;

      int var15;
      class606 var16;
      for(var15 = 0; var15 < var12; ++var15) {
         var16 = var3.field6481[var15];
         class526 var17 = class568.method550(var16.field8570 * 1834782277, -67897652);
         var13[var14++] = var16.field8569 * 1512514121;
         var13[var14++] = var17.field3663 * 1951943953;
         var13[var14++] = var17.field3661 * 893949695;
         var13[var14++] = var17.field3659 * 39181267;
         var13[var14++] = var17.field3660 * -310074719;
         var13[var14++] = var17.field3662 * 1092922159;
         var13[var14++] = var17.field3665 ? -1 : 0;
      }

      for(var15 = 0; var15 < var12; ++var15) {
         var16 = var3.field6481[var15];
         var13[var14++] = var16.field8568 * -1606786303;
      }

      this.U(this.field5095, this.field5096, var3.field6446, var3.field6458, var3.field6448, var3.field6474, var3.field6450, var3.field6451, var3.field6452, var3.field6453, var3.field6476, var3.field6478, var3.field6456, var3.field6457, var3.field6465, var3.field6459, var3.field6467, var3.field6461, var3.field6449, var3.field6463, var3.field6464, var3.field6447, var3.field6466, var3.field6454, var3.field6455, var3.field6468, var3.field6470, var3.field6471, var3.field6472, var3.field6473, var3.field6477, var3.field6460, var3.field6469, var3.field6475, var3.field6480, var11, var8, var9, var4, var5, var6, var7, var13);
   }

   public boolean method5995(int var1, int var2, class135 var3, boolean var4, int var5) {
      return this.field5095.method2082().method518(this, var1, var2, var3, var4);
   }

   public boolean method6082() {
      return true;
   }

   public native void method5947(int var1);

   public native int method6042();

   public native int method6043();

   public native int method5993();

   public native int method6100();

   public native int method6046();

   native void method5968(int var1, int var2, int var3, int var4);

   public native int method6048();

   public native void method6014(int var1);

   public native int method6050();

   public native int method6051();

   final void method6033(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.J(this.field5094, var1, var2, var3, var4, var5, var6, var7);
   }

   native void fk(class955 var1);

   public class933[] method6074() {
      return this.field5098;
   }

   public native int method6055();

   public native class770 method6092(class770 var1);

   public native void method5944(int var1);

   public native void method6038(int var1);

   native void fx(long var1, int var3, int[] var4, int var5, int var6, int var7, int var8, boolean var9);

   public native int method6060();

   public native int method6061();

   public native int method6062();

   public native void method5955(int var1, int var2, int var3);

   public void method6064(byte var1, byte[] var2) {
      this.IA(var1, var2);
   }

   public void method6065(byte var1, byte[] var2) {
      this.IA(var1, var2);
   }

   public native void method6066(short var1, short var2);

   public boolean method6098() {
      return true;
   }

   public native void method6044(short var1, short var2);

   public void method5985(byte var1, byte[] var2) {
      this.IA(var1, var2);
   }

   public class396[] method6009() {
      return this.field5097;
   }

   public native void method6071(int var1, int var2, int var3, int var4);

   public native class770 method6102(class770 var1);

   void method5958() {
      if (this.field5095.field3555 > 1) {
         synchronized(this) {
            while(this.field9859) {
               try {
                  this.wait();
               } catch (InterruptedException var3) {
                  ;
               }
            }

            this.field9859 = true;
         }
      }

   }

   public native void method6040(short var1, short var2);

   public native int method5978();

   public class396[] method6076() {
      return this.field5097;
   }

   public native byte[] method6063();

   public native void method6072(int var1, int var2, int var3, int var4);

   public native int method6053();

   public native void method5956(int var1, int var2, int var3);

   public boolean method6081() {
      return true;
   }

   public class396[] method6079() {
      return this.field5097;
   }

   public native boolean method6001();

   public native boolean method5998();

   public native boolean method6101();

   public native boolean method6085();

   public native int method6045();

   public native void method6086();

   public native int method5940();

   public native void method5975(short var1, short var2);

   public native int method6054();

   public void method6004(class135 var1) {
      this.method3068(class955.field3544, var1);
      int var2 = 0;
      int var3;
      if (this.field5098 != null) {
         for(var3 = 0; var3 < this.field5098.length; ++var3) {
            class933 var4 = this.field5098[var3];
            var4.field10330 = class955.field3544[var2++] * -1879868075;
            var4.field10336 = class955.field3544[var2++] * -2041556771;
            var4.field10332 = class955.field3544[var2++] * -1434499227;
            var4.field10325 = class955.field3544[var2++] * 1070341177;
            var4.field10334 = class955.field3544[var2++] * 1802851857;
            var4.field10335 = class955.field3544[var2++] * 103846281;
            var4.field10324 = class955.field3544[var2++] * -2103324039;
            var4.field10337 = class955.field3544[var2++] * -526039059;
            var4.field10338 = class955.field3544[var2++] * 491030489;
         }
      }

      if (this.field5097 != null) {
         for(var3 = 0; var3 < this.field5097.length; ++var3) {
            class396 var6 = this.field5097[var3];
            class396 var5 = var6;
            if (var6.field6509 != null) {
               var5 = var6.field6509;
            }

            if (var6.field6514 == null) {
               var6.field6514 = new class344();
            }

            var6.field6514.method272(var1);
            var5.field6508 = class955.field3544[var2++] * -1436341053;
            var5.field6512 = class955.field3544[var2++] * 449866009;
            var5.field6513 = class955.field3544[var2++] * 1336328763;
         }
      }

   }

   public void method6090(class135 var1) {
      this.method3068(class955.field3544, var1);
      int var2 = 0;
      int var3;
      if (this.field5098 != null) {
         for(var3 = 0; var3 < this.field5098.length; ++var3) {
            class933 var4 = this.field5098[var3];
            var4.field10330 = class955.field3544[var2++] * -1879868075;
            var4.field10336 = class955.field3544[var2++] * -2041556771;
            var4.field10332 = class955.field3544[var2++] * -1434499227;
            var4.field10325 = class955.field3544[var2++] * 1070341177;
            var4.field10334 = class955.field3544[var2++] * 1802851857;
            var4.field10335 = class955.field3544[var2++] * 103846281;
            var4.field10324 = class955.field3544[var2++] * -2103324039;
            var4.field10337 = class955.field3544[var2++] * -526039059;
            var4.field10338 = class955.field3544[var2++] * 491030489;
         }
      }

      if (this.field5097 != null) {
         for(var3 = 0; var3 < this.field5097.length; ++var3) {
            class396 var6 = this.field5097[var3];
            class396 var5 = var6;
            if (var6.field6509 != null) {
               var5 = var6.field6509;
            }

            if (var6.field6514 == null) {
               var6.field6514 = new class344();
            }

            var6.field6514.method272(var1);
            var5.field6508 = class955.field3544[var2++] * -1436341053;
            var5.field6512 = class955.field3544[var2++] * 449866009;
            var5.field6513 = class955.field3544[var2++] * 1336328763;
         }
      }

   }

   public void method6091(class135 var1) {
      this.method3068(class955.field3544, var1);
      int var2 = 0;
      int var3;
      if (this.field5098 != null) {
         for(var3 = 0; var3 < this.field5098.length; ++var3) {
            class933 var4 = this.field5098[var3];
            var4.field10330 = class955.field3544[var2++] * -1879868075;
            var4.field10336 = class955.field3544[var2++] * -2041556771;
            var4.field10332 = class955.field3544[var2++] * -1434499227;
            var4.field10325 = class955.field3544[var2++] * 1070341177;
            var4.field10334 = class955.field3544[var2++] * 1802851857;
            var4.field10335 = class955.field3544[var2++] * 103846281;
            var4.field10324 = class955.field3544[var2++] * -2103324039;
            var4.field10337 = class955.field3544[var2++] * -526039059;
            var4.field10338 = class955.field3544[var2++] * 491030489;
         }
      }

      if (this.field5097 != null) {
         for(var3 = 0; var3 < this.field5097.length; ++var3) {
            class396 var6 = this.field5097[var3];
            class396 var5 = var6;
            if (var6.field6509 != null) {
               var5 = var6.field6509;
            }

            if (var6.field6514 == null) {
               var6.field6514 = new class344();
            }

            var6.field6514.method272(var1);
            var5.field6508 = class955.field3544[var2++] * -1436341053;
            var5.field6512 = class955.field3544[var2++] * 449866009;
            var5.field6513 = class955.field3544[var2++] * 1336328763;
         }
      }

   }

   native void method6104(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

   native void fc(class955 var1, class887 var2, int var3, int var4, int[] var5, int[] var6, int[] var7, int[] var8, short[] var9, int var10, short[] var11, short[] var12, short[] var13, byte[] var14, byte[] var15, byte[] var16, byte[] var17, short[] var18, short[] var19, int[] var20, byte var21, short[] var22, int var23, byte[] var24, short[] var25, short[] var26, short[] var27, int[] var28, int[] var29, int[] var30, byte[] var31, byte[] var32, int[] var33, int[] var34, int[] var35, int[] var36, int var37, int var38, int var39, int var40, int var41, int var42, int[] var43);

   native void fw(class955 var1);

   public native void method6551(boolean var1);

   public native boolean method6036();

   public native void method6073(int var1, int var2, int var3, int var4);

   public native int method5950();

   public boolean method6039(int var1, int var2, class135 var3, boolean var4, int var5) {
      return this.field5095.method2082().method518(this, var1, var2, var3, var4);
   }

   native void gt(float[] var1, int var2, boolean var3);

   public native int method6052();

   native void gl(float[] var1, int var2, boolean var3);

   native void gq(float[] var1, int var2, boolean var3);

   native void gp(byte var1, byte[] var2);

   public class879 method6000(byte var1, int var2, boolean var3) {
      return this.field5095.method2082().method510(this, var1, var2, var3);
   }

   native void ge(byte var1, byte[] var2);
}
