public class class544 {
   int field3769;
   int field3770;
   class879 field3771;
   class481 field3772;
   static int field3773 = 512;
   class671 field3774;
   int field3775;
   int field3776;
   int field3777;
   int field3778;
   class481[] field3779;
   class48 field3780;
   int field3781;
   int field3782;
   class481[] field3783;
   boolean field3784 = true;
   static class478 field3785;
   int field3786;
   int field3787;
   byte[] field3788;
   boolean field3789;
   class544 field3790;
   int field3791;
   int field3792;
   int field3793 = -697848799;
   static int field3794;
   public static class180 field3795;

   public void method2353(int var1, int var2, int var3) {
      try {
         boolean var10000 = this.field3789;
         this.field3791 = -1739514523 * (var1 * (var2 - -1519560585 * this.field3777) / 255 + -1519560585 * this.field3777);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lm.b(" + ')');
      }
   }

   public void method2354(class544 var1, int var2) {
      try {
         if (this.field3789) {
            this.field3777 = 967778107 * this.field3791;
         } else if (var1 != null && var1.field3789) {
            this.field3777 = -910867015 - 967778107 * var1.field3791;
         } else {
            this.field3777 = 0;
         }

         this.field3789 = true;
         this.field3790 = var1;
         this.field3791 = 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lm.p(" + ')');
      }
   }

   public void method2355(byte var1) {
      try {
         this.field3789 = false;
         this.field3790 = null;
         this.field3791 = 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lm.i(" + ')');
      }
   }

   public boolean method2356(byte var1) {
      try {
         return this.field3789;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lm.k(" + ')');
      }
   }

   public class544 method2357(int var1) {
      try {
         return this.field3790;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lm.d(" + ')');
      }
   }

   public boolean method2358(class848 var1, int var2, int var3, int var4) {
      try {
         if (-51566561 * this.field3793 != var2) {
            this.field3793 = 697848799 * var2;
            int var5 = class236.method4619(var2, 1272872211);
            if (var5 > 512) {
               var5 = 512;
            }

            if (var5 <= 0) {
               var5 = 1;
            }

            if (var5 != this.field3776 * -1994130525) {
               this.field3776 = var5 * 285085707;
               this.field3780 = null;
            }

            if (this.field3779 != null) {
               this.field3775 = 0;
               int[] var6 = new int[this.field3779.length];

               for(int var7 = 0; var7 < this.field3779.length; ++var7) {
                  class481 var8 = this.field3779[var7];
                  if (var8.method4699(this.field3787 * 1173193129, 796478559 * this.field3778, -226559159 * this.field3792, this.field3793 * -51566561)) {
                     var6[this.field3775 * 1858024591] = var8.field8330;
                     this.field3783[(this.field3775 += 400255599) * 1858024591 - 1] = var8;
                  }
               }

               class519.method2666(var6, this.field3783, 0, 1858024591 * this.field3775 - 1, -641027314);
            }

            this.field3784 = true;
         }

         boolean var11 = false;
         if (this.field3784) {
            this.field3784 = false;

            for(int var10 = this.field3775 * 1858024591 - 1; var10 >= 0; --var10) {
               boolean var12 = this.field3783[var10].method4695(var1, this.field3772);
               this.field3784 |= !var12;
               var11 |= var12;
            }
         }

         if (var3 != 0 && var1.method4807()) {
            if (this.field3771 == null && this.field3786 * -680590445 >= 0) {
               this.method2359(var1, -1803183146);
            }
         } else {
            this.field3771 = null;
         }

         if (this.field3790 != null && this.field3790 != this) {
            this.field3790.method2355((byte)-39);
            var11 |= this.field3790.method2358(var1, var2, var3, -136782694);
         }

         return var11;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "lm.u(" + ')');
      }
   }

   void method2359(class848 var1, int var2) {
      try {
         try {
            boolean var3 = class537.field3750.method3261(-680590445 * this.field3786, 581664063);
            if (var3) {
               var1.method4872(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
               class25 var4 = class25.method3454(class537.field3750, this.field3786 * -680590445, 0);
               this.field3771 = var1.method4861(var4, 1099776, 0, 255, 1);
               byte[] var5 = this.field3771.method5983();
               if (var5 == null) {
                  this.field3788 = null;
               } else {
                  this.field3788 = new byte[var5.length];
                  System.arraycopy(var5, 0, this.field3788, 0, var5.length);
               }
            }
         } catch (Exception var6) {
            ;
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "lm.x(" + ')');
      }
   }

   public void method2360(class848 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         this.method2361(var1, var2, var3, var4, var5, var6, var7, var8, 0, var10, true, false, (byte)-1);
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "lm.r(" + ')');
      }
   }

   public void method2361(class848 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, boolean var12, byte var13) {
      try {
         int var14 = 0;
         if (this.field3789) {
            var14 = this.field3791 * 1447218285;
         }

         if (this.field3790 != null) {
            class544 var15 = this;
            class544 var16 = this.field3790;
            if (this.hashCode() > var16.hashCode()) {
               var15 = this.field3790;
               var16 = this;
               var14 = 255 - var14;
            }

            var15.method2363(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14, 2089062848);
            var16.method2363(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, false, var12, 255 - var14, 357729081);
         } else {
            this.method2363(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14, 1191709910);
         }

      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "lm.q(" + ')');
      }
   }

   void method2362(class848 var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         class135 var7 = var1.method4868();
         class135 var8 = new class135();
         var8.method1016(0.0F, 0.0F, 0.0F);
         var8.method1025(0.0F, -1.0F, 0.0F, class703.method2002(-var3 & 16383));
         var8.method1025(-1.0F, 0.0F, 0.0F, class703.method2002(-var2 & 16383));
         var8.method1025(0.0F, 0.0F, -1.0F, class703.method2002(-var4 & 16383));
         var1.method4867(var8);
         class135 var9 = new class135();
         if (738421895 * this.field3781 != var5) {
            this.field3771.method5985((byte)var5, this.field3788);
            this.field3781 = var5 * -299787977;
         }

         this.field3771.method5965(var9, (class211)null, 0);
         var1.method4867(var7);
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "lm.s(" + ')');
      }
   }

   void method2363(class848 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, boolean var12, int var13, int var14) {
      try {
         int var15 = 255 - var13;
         if (this.field3771 == null) {
            var1.method4831(2, 0);
            var8 = var8 + var2 & 16383;
            if (this.field3770 * 1461948177 != -1 && this.field3776 * -1994130525 != 0) {
               class414 var16 = field3785.method4625(this.field3770 * 1461948177, 434799685);
               if (this.field3780 == null && field3785.method4621(this.field3770 * 1461948177, (short)28045)) {
                  int[] var17 = 2 == -2138060883 * var16.field9382 ? field3785.method4623(this.field3770 * 1461948177, 0.7F, -1994130525 * this.field3776, this.field3776 * -1994130525, false, (byte)2) : field3785.method4622(this.field3770 * 1461948177, 0.7F, -1994130525 * this.field3776, -1994130525 * this.field3776, false, 833981844);
                  this.field3769 = var17[0] * 1667694183;
                  this.field3782 = 918308719 * var17[var17.length - 1];
                  this.field3780 = var1.method4854(var17, 0, this.field3776 * -1994130525, this.field3776 * -1994130525, this.field3776 * -1994130525, 2072553439);
               }

               int var25 = var15 == 255 ? (var16.field9382 * -2138060883 == 2 ? 1 : 0) : 1;
               if (1 == var25 && var11) {
                  var1.method4984(var3, var4, var5, var6, var10, 0);
               }

               if (this.field3780 != null) {
                  int var18 = var7 * var6 / -4096;

                  int var19;
                  for(var19 = (var5 - var6) / 2 + var8 * var6 / 4096; var19 > var6; var19 -= var6) {
                     ;
                  }

                  while(var19 < 0) {
                     var19 += var6;
                  }

                  int var20;
                  if (this.field3774 != class671.field7469) {
                     while(var18 > var6) {
                        var18 -= var6;
                     }

                     while(var18 < 0) {
                        var18 += var6;
                     }

                     for(var20 = var19 - var6; var20 < var5; var20 += var6) {
                        for(int var21 = var18 - var6; var21 < var6; var21 += var6) {
                           this.field3780.method3117(var3 + var20, var4 + var21, var6, var6, 0, var15 << 24 | 16777215, var25);
                        }
                     }
                  } else {
                     for(var20 = var19 - var6; var20 < var5; var20 += var6) {
                        this.field3780.method3117(var3 + var20, var18 + var4, var6, var6, 0, var15 << 24 | 16777215, var25);
                     }

                     if ((150420823 * this.field3769 & -16777216) != 0) {
                        var1.method4833(0, 0, var5, 1 + var4 + var18, 150420823 * this.field3769, (byte)7);
                     }

                     if ((this.field3782 * 1184429967 & -16777216) != 0) {
                        var1.method4833(0, var18 + var4 + var6, var5, var6 - (var6 + var18 + var4), this.field3782 * 1184429967, (byte)7);
                     }
                  }
               }
            } else {
               var1.method4984(var3, var4, var5, var6, var15 << 24 | var10, 1);
            }
         } else if (var12) {
            class344 var23 = var1.method4870();
            class344 var26 = var1.method4870();
            var23.field325[2] = var23.field325[3];
            var23.field325[6] = var23.field325[7];
            var23.field325[10] = var23.field325[11];
            var23.field325[14] = var23.field325[15];
            var1.method5054(var23);
            this.method2362(var1, var7, var8, var9, var13, -1456826082);
            var1.method5054(var26);
         } else {
            if (var11) {
               var1.method4831(3, var10);
            }

            this.method2362(var1, var7, var8, var9, var13, -1935584987);
         }

         for(int var24 = this.field3775 * 1858024591 - 1; var24 >= 0; --var24) {
            this.field3783[var24].method4697(var1, var3, var4, var5, var6, var7, var8, 1173193129 * this.field3787, this.field3778 * 796478559, this.field3792 * -226559159, var15);
         }

         var1.method4831(2, 0);
      } catch (RuntimeException var22) {
         throw class158.method3445(var22, "lm.n(" + ')');
      }
   }

   public class544(int var1, class481[] var2, int var3, int var4, int var5, int var6, class671 var7, int var8) {
      this.field3787 = var4 * 91665049;
      this.field3778 = var5 * -2049962081;
      this.field3792 = var6 * 2095769337;
      this.field3770 = 318980593 * var1;
      this.field3779 = var2;
      this.field3774 = var7;
      if (var2 != null) {
         this.field3783 = new class481[var2.length];
         this.field3772 = var3 >= 0 ? var2[var3] : null;
      } else {
         this.field3783 = null;
         this.field3772 = null;
      }

      this.field3786 = var8 * -2035969381;
   }

   static final void method2364(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         var0.field1031 = var2.field3161[(var2.field3156 -= -391880689) * 681479919] * -216431639;
         class814.method2932(var0, 2056943984);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lm.dv(" + ')');
      }
   }

   static final void method2365(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class932.method6296(var3, var4, var0, 1469378212);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lm.jw(" + ')');
      }
   }

   static final void method2366(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class773.method2313(var3, var0, 1480483039);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lm.qk(" + ')');
      }
   }

   static final void method2367(class744 var0, byte var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int)class730.field2931 >> 3;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lm.agv(" + ')');
      }
   }

   public static void method2368(long[] var0, int[] var1, byte var2) {
      try {
         class449.method3760(var0, var1, 0, var0.length - 1, -373410323);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lm.k(" + ')');
      }
   }

   public static void method2369(class312 var0) {
      method2370(0, var0);
   }

   public static void method2370(int var0, class312 var1) {
      int var2 = class345.method157(class923.field10295.field4085[0], class923.field10295.field4055[0], class923.field10295.method2550(), var1, class730.field2697.method5281(class923.field10295.field3639), true, class730.field2731, class730.field2719);
      class701 var3 = null;
      if (var0 == 0) {
         var3 = class637.method5936(class643.field10012, class730.field2692.field7765, (byte)51);
      }

      if (var0 == 1) {
         var3 = class637.method5936(class643.field9988, class730.field2692.field7765, (byte)28);
      }

      var3.field3364.method6361(5 + var2 * 2);
      class389 var4 = class730.field2697.method5270(681479919);
      var3.field3364.method6419(var4.field1521 * -1760580017);
      var3.field3364.method6415(class980.method1913(-545107710) ? 1 : 0, (byte)1);
      var3.field3364.method6419(var4.field1522 * 283514611);

      for(int var5 = var2 - 1; var5 >= 0; --var5) {
         var3.field3364.method6361(class56.field2315[var5]);
         var3.field3364.method6361(class56.field2312[var5]);
      }

      class95.field602 = false;
      if (var2 > 0) {
         class95.field593 = class56.field2312[var2 - 1] * -1835291189;
         class95.field601 = class56.field2315[var2 - 1] * -1129029761;
      }

      class730.field2692.method4380(var3, (byte)-115);
   }

   static class701 method2371(int var0, int var1, int var2) {
      try {
         class701 var3 = null;
         if (var2 == 0) {
            var3 = class637.method5936(class643.field10012, class730.field2692.field7765, (byte)51);
         }

         if (var2 == 1) {
            var3 = class637.method5936(class643.field9988, class730.field2692.field7765, (byte)28);
         }

         class389 var4 = class730.field2697.method5270(681479919);
         var3.field3364.method6419(var4.field1521 * -1760580017 + var0);
         var3.field3364.method6415(class980.method1913(-545107710) ? 1 : 0, (byte)1);
         var3.field3364.method6419(var1 + var4.field1522 * 283514611);
         class95.field601 = var1 * -1129029761;
         class95.field593 = var0 * -1835291189;
         class95.field602 = false;
         class888.method5534(-1884278472);
         return var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lm.bp(" + ')');
      }
   }

   static final void method2372(class744 var0, byte var1) {
      try {
         var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = class537.method2316((long)var0.field3161[(var0.field3156 -= -391880689) * 681479919] * 60000L, class321.field1066.method89(694163818), true, -1759893587) + " UTC";
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lm.aam(" + ')');
      }
   }
}
