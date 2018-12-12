public class class214 extends Animable {
   int field7135;
   int field7136;
   int field7137;
   public int field7138;
   public int field7139;
   int field7140;
   Animator field7141;
   int field7142;
   public int field7143;
   double field7144;
   boolean field7145;
   boolean field7146 = false;
   double field7147;
   int field7148;
   double field7149;
   double field7150;
   double field7151;
   public int field7152;
   int field7153 = 0;
   boolean field7154 = false;
   class726 field7155;

   public int method2168(int var1) {
      try {
         return this.field7153;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aka.bm(" + ')');
      }
   }

   public final void method3782(int var1, int var2, int var3, int var4, int var5) {
      try {
         class32 var6 = class32.method3290(this.method1511().field7637);
         if (!this.field7146) {
            float var7 = (float)var1 - var6.field5296;
            float var8 = (float)var2 - var6.field5299;
            float var9 = (float)Math.sqrt((double)(var8 * var8 + var7 * var7));
            if (0.0F != var9) {
               var6.field5296 += (float)this.field7148 * var7 / var9;
               var6.field5299 += (float)this.field7148 * var8 / var9;
            }

            if (this.field7145) {
               var6.field5300 = (float)(class679.method4271((int)var6.field5296, (int)var6.field5299, super.field3639, -1463922586) - this.field7136);
            }

            this.method1514(var6);
         }

         double var10 = (double)(this.field7143 + 1 - var4);
         this.field7147 = (double)((float)var1 - var6.field5296) / var10;
         this.field7144 = (double)((float)var2 - var6.field5299) / var10;
         this.field7149 = Math.sqrt(this.field7144 * this.field7144 + this.field7147 * this.field7147);
         if (-1 != this.field7142) {
            if (!this.field7146) {
               this.field7150 = -this.field7149 * Math.tan(0.02454369D * (double)this.field7142);
            }

            this.field7151 = 2.0D * ((double)((float)var3 - var6.field5300) - var10 * this.field7150) / (var10 * var10);
         } else {
            this.field7150 = (double)((float)var3 - var6.field5300) / var10;
         }

         var6.method3291();
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "aka.a(" + ')');
      }
   }

   public void method3783(int var1) {
      try {
         if (!this.field7146 && this.field7137 != 0) {
            Object var2 = null;
            if (class730.field2705 == 0) {
               var2 = class949.field3322[this.field7137 - 1].method6636(1781553547);
            } else {
               int var3;
               if (this.field7137 < 0) {
                  var3 = -this.field7137 - 1;
                  if (class730.field2623 == var3) {
                     var2 = class923.local;
                  } else {
                     var2 = class730.loaded[var3];
                  }
               } else {
                  var3 = this.field7137 - 1;
                  class437 var4 = (class437)class730.field2677.method2942((long)var3);
                  if (var4 != null) {
                     var2 = (Actor)var4.field7515;
                  }
               }
            }

            if (var2 != null) {
               class32 var15 = ((Actor)var2).method1511().field7637;
               this.method1515(var15.field5296, (float)(class679.method4271((int)var15.field5296, (int)var15.field5299, super.field3639, -1098231500) - this.field7136), var15.field5299);
               if (this.field7135 >= 0) {
                  class507 var16 = ((Actor)var2).method2554(399670605);
                  int var5 = 0;
                  int var6 = 0;
                  if (var16.field3968 != null && var16.field3968[this.field7135] != null) {
                     var5 += var16.field3968[this.field7135][0];
                     var6 += var16.field3968[this.field7135][2];
                  }

                  if (var16.field4011 != null && var16.field4011[this.field7135] != null) {
                     var5 += var16.field4011[this.field7135][0];
                     var6 += var16.field4011[this.field7135][2];
                  }

                  if (var5 != 0 || var6 != 0) {
                     int var7 = ((Actor)var2).field4048.method5553((byte)0);
                     int var8 = var7;
                     if (((Actor)var2).field4049 != null && ((Actor)var2).field4049[this.field7135] != -1) {
                        var8 = ((Actor)var2).field4049[this.field7135];
                     }

                     int var9 = var8 - var7 & 16383;
                     int var10 = class703.field3413[var9];
                     int var11 = class703.field3404[var9];
                     int var12 = var6 * var10 + var5 * var11 >> 14;
                     var6 = var6 * var11 - var10 * var5 >> 14;
                     class32 var13 = class32.method3290(this.method1511().field7637);
                     var13.field5296 += (float)var12;
                     var13.field5299 += (float)var6;
                     this.method1514(var13);
                     var13.method3291();
                  }
               }
            }
         }

      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "aka.f(" + ')');
      }
   }

   public final void method3784(int var1, byte var2) {
      try {
         this.field7146 = true;
         class446 var3 = new class446(this.method1511());
         var3.field7637.field5296 = (float)((double)var3.field7637.field5296 + this.field7147 * (double)var1);
         var3.field7637.field5299 = (float)((double)var3.field7637.field5299 + this.field7144 * (double)var1);
         if (this.field7145) {
            var3.field7637.field5300 = (float)(class679.method4271((int)var3.field7637.field5296, (int)var3.field7637.field5299, super.field3639, -1903626222) - this.field7136);
         } else if (this.field7142 != -1) {
            var3.field7637.field5300 = (float)((double)var3.field7637.field5300 + (double)var1 * (double)var1 * 0.5D * this.field7151 + (double)var1 * this.field7150);
            this.field7150 += (double)var1 * this.field7151;
         } else {
            var3.field7637.field5300 = (float)((double)var3.field7637.field5300 + this.field7150 * (double)var1);
         }

         var3.field7638.method789(1.0F, 0.0F, 0.0F, (float)Math.atan2(this.field7150, this.field7149));
         class567 var4 = class567.method785();
         var4.method789(0.0F, 1.0F, 0.0F, (float)Math.atan2(this.field7147, this.field7144) - 3.1415927F);
         var3.field7638.method792(var4);
         var4.method795();
         this.method1513(var3);
         if (this.field7141.method2778(1, 1832022530) && this.field7141.method2788(588331212)) {
            this.field7141.method2790(981301272);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aka.b(" + ')');
      }
   }

   void method4691(int var1) {
      try {
         class32 var2 = this.method1511().field7637;
         super.field8299 = super.field8297 = (short)((int)(var2.field5296 / 512.0F));
         super.field8296 = super.field8298 = (short)((int)(var2.field5299 / 512.0F));
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aka.ew(" + ')');
      }
   }

   public class719 method2165(class848 var1, byte var2) {
      return null;
   }

   boolean method2206(byte var1) {
      return false;
   }

   boolean method2157(class848 var1, int var2, int var3, byte var4) {
      return false;
   }

   final boolean method2173(int var1) {
      return false;
   }

   final void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "aka.bk(" + ')');
      }
   }

   final void method2205(byte var1) {
      try {
         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aka.bq(" + ')');
      }
   }

   class192 method2201(class848 var1, int var2) {
      try {
         class879 var3 = this.method3787(var1, 2048, -1431142826);
         if (var3 == null) {
            return null;
         } else {
            class135 var4 = this.method1521();
            this.method3785(var1, var3, var4, 752544216);
            class192 var5 = class221.method4033(false, 1890696440);
            var3.method5965(var4, super.field3642[0], 0);
            if (this.field7155 != null) {
               class874 var6 = this.field7155.method1729();
               var1.method4866(var6);
            }

            this.field7154 = var3.method5989();
            var3.method5973();
            this.field7153 = var3.method5976();
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aka.bo(" + ')');
      }
   }

   void method3785(class848 var1, class879 var2, class135 var3, int var4) {
      try {
         var2.method6096(var3);
         class933[] var5 = var2.method6089();
         class396[] var6 = var2.method5941();
         if ((this.field7155 == null || this.field7155.field2548) && (var5 != null || var6 != null)) {
            this.field7155 = class726.method1732(class730.field2866, true);
         }

         if (this.field7155 != null) {
            this.field7155.method1731(var1, (long)class730.field2866, var5, var6, false);
            this.field7155.method1727(super.field3639, super.field8299, super.field8297, super.field8296, super.field8298);
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aka.i(" + ')');
      }
   }

   boolean method2183(short var1) {
      try {
         return this.field7154;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aka.be(" + ')');
      }
   }

   class879 method3787(class848 var1, int var2, int var3) {
      try {
         class745 var4 = class635.field9823.method1053(this.field7140, -1880515681);
         return var4.method2590(var1, var2, this.field7141, (byte)2, 2089191246);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aka.p(" + ')');
      }
   }

   void method2164(class848 var1, int var2) {
      try {
         class879 var3 = this.method3787(var1, 0, -1431142826);
         if (var3 != null) {
            class135 var4 = this.method1521();
            this.field7153 = var3.method5976();
            var3.method5973();
            this.method3785(var1, var3, var4, 1295394803);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aka.bb(" + ')');
      }
   }

   public void method3788(int var1) {
      try {
         if (this.field7155 != null) {
            this.field7155.method1721();
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aka.k(" + ')');
      }
   }

   public class214(class545 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, boolean var15, int var16) {
      super(var1, var3, var4, var5, class679.method4271(var5, var6, var3, -1556375135) - var7, var6, var5 >> 9, var5 >> 9, var6 >> 9, var6 >> 9, false, (byte)0);
      this.field7140 = var2;
      this.field7138 = var8;
      this.field7143 = var9;
      this.field7142 = var10;
      this.field7148 = var11;
      this.field7137 = var12;
      this.field7152 = var13;
      this.field7136 = var7;
      this.field7139 = var14;
      this.field7145 = var15;
      this.field7146 = false;
      this.field7135 = var16;
      int var17 = class635.field9823.method1053(this.field7140, -1811500435).field4107;
      this.field7141 = new class511(this, false);
      this.field7141.method2777(var17, -1768064453);
      this.method2169(1, 291576769);
   }
}
