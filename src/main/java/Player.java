public class Player extends Actor {
   public int field3373 = -1;
   public String field3374;
   public boolean field3375 = false;
   String field3376;
   public boolean field3377 = false;
   String field3378;
   public String field3379;
   public int field3380 = -1;
   public int field3381 = -1;
   public boolean field3382 = false;
   public int field3383 = -1;
   public int field3384 = 0;
   public int field3385 = 0;
   public boolean field3386 = false;
   public int field3387 = 0;
   public class365 field3388;
   public int field3389 = -1;
   public int field3390 = -1;
   public int field3391 = -1;
   public int field3392 = 0;
   public int field3393 = 0;
   public int field3394 = 255;
   int field3395;
   public boolean field3396 = false;
   public int field3397;
   public int field3398;
   public byte field3399 = 0;
   public int field3400 = -1;
   public boolean field3401 = false;
   public class917 field3402 = new class917(16);
   public boolean field3403 = false;

   public Player(class545 var1, int var2) {
      super(var1, var2);
   }

   public final void method1990(InputStream var1, byte var2) {
      try {
         var1.field10376 = 0;
         int var3 = var1.method6371();
         this.field3399 = (byte)(var3 & 1);
         boolean var4 = this.field3375;
         this.field3375 = (var3 & 2) != 0;
         boolean var5 = (var3 & 4) != 0;
         int var6 = super.method2550();
         this.method2549((var3 >> 3 & 7) + 1, -2030022890);
         boolean var7 = (var3 & 64) != 0;
         boolean var8 = (var3 & 128) != 0;
         class32 var9 = class32.method3290(this.method1511().field7637);
         var9.field5296 += (float)(this.method2550() - var6 << 8);
         var9.field5299 += (float)(this.method2550() - var6 << 8);
         this.method1514(var9);
         var9.method3291();
         if (var7) {
            this.field3378 = var1.method6413(681479919);
         } else {
            this.field3378 = null;
         }

         if (var8) {
            this.field3376 = var1.method6413(681479919);
         } else {
            this.field3376 = null;
         }

         this.field3381 = var1.method6372(-12558881);
         this.field3380 = var1.method6372(-12558881);
         this.field3377 = var1.method6372(-12558881) == 1;
         this.field3403 = var1.method6372(-12558881) == 1;
         if (class721.field3634 == class916.field10415 && class730.field2790 >= 5) {
            this.field3377 = false;
         }

         int var10 = -1;
         this.field3387 = 0;
         int[] var11 = new int[class413.field9412.field1542.length];
         class241[] var12 = new class241[class413.field9412.field1542.length];
         ItemDefinition[] var13 = new ItemDefinition[class413.field9412.field1542.length];

         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         for(var14 = 0; var14 < class413.field9412.field1542.length; ++var14) {
            if (1 != class413.field9412.field1542[var14]) {
               var15 = var1.method6371();
               if (var15 == 0) {
                  var11[var14] = 0;
               } else {
                  var16 = var1.method6371();
                  var17 = (var15 << 8) + var16;
                  if (var14 == 0 && 65535 == var17) {
                     var10 = var1.method6423(1235052657);
                     this.field3387 = var1.method6371();
                     break;
                  }

                  if (var17 >= 32768) {
                     var17 = class2.field4948[var17 - '耀'];
                     var11[var14] = var17 | 1073741824;
                     var13[var14] = class85.field1121.method1566(var17);
                     var18 = var13[var14].field4217;
                     if (var18 != 0) {
                        this.field3387 = var18;
                     }
                  } else {
                     var11[var14] = var17 - 256 | Integer.MIN_VALUE;
                  }
               }
            }
         }

         if (-1 == var10) {
            var14 = var1.method6374();
            var15 = 0;

            for(var16 = 0; var16 < class413.field9412.field1542.length; ++var16) {
               if (class413.field9412.field1542[var16] != 0) {
                  if (var2 != 3) {
                     return;
                  }
               } else {
                  if ((var14 & 1 << var15) != 0) {
                     var12[var16] = class916.method6461(var13[var16], var1, (byte)15);
                  }

                  ++var15;
               }
            }
         }

         int[] var22 = new int[10];

         for(var15 = 0; var15 < 10; ++var15) {
            var16 = var1.method6371();
            if (class629.field9737.length < 1 || var16 < 0 || var16 >= class629.field9737[var15][0].length) {
               var16 = 0;
            }

            var22[var15] = var16;
         }

         this.field3395 = var1.method6374();
         this.field3379 = var1.method6379(-594796753);
         this.field3374 = this.field3379;
         if (this == class923.local) {
            class862.field8932 = this.field3379;
         }

         this.field3385 = var1.method6371();
         if (var5) {
            this.field3384 = var1.method6374();
            if (65535 == this.field3384) {
               this.field3384 = -1;
            }

            this.field3392 = this.field3385;
            this.field3383 = -1;
         } else {
            this.field3384 = 0;
            this.field3392 = var1.method6371();
            this.field3383 = var1.method6371();
            if (255 == this.field3383) {
               this.field3383 = -1;
            }
         }

         var15 = this.field3393;
         this.field3393 = var1.method6371();
         if (this.field3393 != 0) {
            var16 = this.field3373;
            var17 = this.field3389;
            var18 = this.field3390;
            int var19 = this.field3391;
            int var20 = this.field3394;
            this.field3373 = var1.method6374();
            this.field3389 = var1.method6374();
            this.field3390 = var1.method6374();
            this.field3391 = var1.method6374();
            this.field3394 = var1.method6371();
            if (this.field3375 != var4 || this.field3393 != var15 || this.field3373 != var16 || this.field3389 != var17 || var18 != this.field3390 || var19 != this.field3391 || this.field3394 != var20) {
               class428.method4153(this, (byte)8);
            }
         } else {
            class792.method440(this, (byte)-41);
         }

         if (this.field3388 == null) {
            this.field3388 = new class365();
         }

         var16 = this.field3388.field2444;
         int[] var23 = this.field3388.field2443;
         this.field3388.method1644(this.method2560(-1515602233), var11, var12, var22, 1 == this.field3399, var10, 775068819);
         if (var16 != var10) {
            var9 = class32.method3290(this.method1511().field7637);
            var9.field5296 = (float)((super.field4085[0] << 9) + (this.method2550() << 8));
            var9.field5299 = (float)((super.field4055[0] << 9) + (this.method2550() << 8));
            this.method1514(var9);
            var9.method3291();
         }

         if (class730.field2623 == super.field4028 && var23 != null) {
            for(var18 = 0; var18 < var22.length; ++var18) {
               if (var23[var18] != var22[var18]) {
                  class85.field1121.method1574(-2137955741);
                  break;
               }
            }
         }

         if (super.field4031 != null) {
            super.field4031.method1720();
         }

         if (super.passiveAnimator.method2775((byte)-68) && super.field4058) {
            class507 var24 = this.method2554(-244281365);
            if (!var24.method2505(super.passiveAnimator.method2779(1971304294), (byte)-15)) {
               super.passiveAnimator.method2777(-1, -2110667700);
               super.field4058 = false;
            }
         }

      } catch (RuntimeException var21) {
         throw class158.method3445(var21, "akm.gf(" + ')');
      }
   }

   public class719 method2165(class848 var1, byte var2) {
      return null;
   }

   class192 method2201(class848 var1, int var2) {
      try {
         if (this.field3388 != null && this.method1992(var1, 2048, (byte)12)) {
            class135 var3 = var1.method5048();
            class135 var4 = this.method1521();
            class446 var5 = this.method1511();
            int var6 = super.field4048.method5553((byte)0);
            class190 var7 = super.field3638.field3861[super.field3639][(int)var5.field7637.field5296 >> 9][(int)var5.field7637.field5299 >> 9];
            if (var7 != null && var7.field7011 != null) {
               int var8 = super.field4086 - var7.field7011.field9059;
               super.field4086 = (int)((float)super.field4086 - (float)var8 / 10.0F);
            } else {
               super.field4086 = (int)((float)super.field4086 - (float)super.field4086 / 10.0F);
            }

            var3.method1024(var4);
            var3.method1018(0.0F, (float)(-20 - super.field4086), 0.0F);
            class192 var23 = null;
            super.field4093 = false;
            if (class615.field8903.field9127.method4421(-591782935) == 1) {
               class507 var9 = this.method2554(-97958061);
               if (var9.field4014 && (this.field3388.field2444 == -1 || class258.field7913.method12(this.field3388.field2444, -465726953).field9901)) {
                  Animator var10 = super.activeAnimator.method2775((byte)-70) && super.activeAnimator.method2782(-65534) ? super.activeAnimator : null;
                  Animator var11 = !super.passiveAnimator.method2775((byte)-61) || super.field4058 && var10 != null ? null : super.passiveAnimator;
                  class879 var12 = class623.method5320(var1, var6, super.field4061, super.field4037, super.field4038, 1, super.field4046[0], 0, 0, 160, 240, var11 != null ? var11 : var10, 1812843484);
                  if (var12 != null) {
                     if (super.field3642 == null || super.field3642.length < 1 + super.field4046.length) {
                        this.method2169(super.field4046.length + 1, -1332935516);
                     }

                     var23 = class221.method4033(true, 1694437358);
                     super.field4093 = true;
                     var1.method4869(false);
                     var12.method5965(var3, super.field3642[super.field4046.length], 0);
                     var1.method4869(true);
                  }
               }
            }

            int var24;
            if (this == class923.local) {
               for(var24 = class730.field2851.length - 1; var24 >= 0; --var24) {
                  class921 var25 = class730.field2851[var24];
                  if (var25 != null && var25.field10284 != -1) {
                     int var14;
                     if (var25.field10287 == 1) {
                        class437 var27 = (class437)class730.field2677.method2942((long)var25.field10277);
                        if (var27 != null) {
                           Npc var30 = (Npc)var27.field7515;
                           class32 var13 = class32.method3296(var30.method1511().field7637, class923.local.method1511().field7637);
                           var14 = (int)var13.field5296;
                           int var15 = (int)var13.field5299;
                           this.method1991(var1, var3, super.field4046[0], (long)var14, (long)var15, var25.field10284, 92160000L);
                        }
                     }

                     if (2 == var25.field10287) {
                        class32 var28 = class923.local.method1511().field7637;
                        long var16 = (long)(var25.field10281 - (int)var28.field5296);
                        long var18 = (long)(var25.field10282 - (int)var28.field5299);
                        long var20 = (long)(var25.field10278 << 9);
                        var20 *= var20;
                        this.method1991(var1, var3, super.field4046[0], var16, var18, var25.field10284, var20);
                     }

                     if (10 == var25.field10287 && var25.field10277 >= 0 && var25.field10277 < class730.loaded.length) {
                        Player var29 = class730.loaded[var25.field10277];
                        if (var29 != null) {
                           class32 var31 = class32.method3296(var29.method1511().field7637, class923.local.method1511().field7637);
                           int var32 = (int)var31.field5296;
                           var14 = (int)var31.field5299;
                           this.method1991(var1, var3, super.field4046[0], (long)var32, (long)var14, var25.field10284, 92160000L);
                        }
                     }
                  }
               }
            }

            var3.method1024(var4);
            var3.method1018(0.0F, (float)(-5 - super.field4086), 0.0F);
            if (super.field3642 == null || super.field3642.length < super.field4046.length) {
               this.method2169(super.field4046.length, 1335663590);
            }

            if (var23 == null) {
               var23 = class221.method4033(true, 1293324019);
            }

            this.method2573(var1, super.field4046, var3, false, 482140235);

            for(var24 = 0; var24 < super.field4046.length; ++var24) {
               if (super.field4046[var24] != null) {
                  super.field4046[var24].method5965(var3, super.field3642[var24], this == class923.local ? 1 : 0);
               }
            }

            if (super.field4031 != null) {
               class874 var26 = super.field4031.method1729();
               var1.method4866(var26);
            }

            for(var24 = 0; var24 < super.field4046.length; ++var24) {
               if (super.field4046[var24] != null) {
                  super.field4093 |= super.field4046[var24].method5989();
               }

               super.field4046[var24] = null;
            }

            super.field4030 = class730.field2758;
            return var23;
         } else {
            return null;
         }
      } catch (RuntimeException var22) {
         throw class158.method3445(var22, "akm.bo(" + ')');
      }
   }

   void method1991(class848 var1, class135 var2, class879 var3, long var4, long var6, int var8, long var9) {
      try {
         long var11 = var4 * var4 + var6 * var6;
         if (var11 >= 262144L && var11 <= var9) {
            int var13 = (int)(Math.atan2((double)var4, (double)var6) * 2607.5945876176133D - (double)super.field4048.method5553((byte)0)) & 16383;
            class879 var14 = class575.method124(var1, var13, super.field4061, super.field4037, super.field4038, var8, -2134746538);
            if (var14 != null) {
               var1.method4869(false);
               var14.method5965(var2, (class211)null, 0);
               var1.method4869(true);
            }
         }

      } catch (RuntimeException var16) {
         throw class158.method3445(var16, "akm.gb(" + ')');
      }
   }

   boolean method1992(class848 var1, int var2, byte var3) {
      try {
         int var4 = var2;
         class507 var5 = this.method2554(1841046440);
         Animator var6 = super.activeAnimator.method2775((byte)-54) && !super.activeAnimator.method2782(-65534) ? super.activeAnimator : null;
         Animator var7 = !super.passiveAnimator.method2775((byte)-28) || this.field3386 || super.field4058 && var6 != null ? null : super.passiveAnimator;
         int var8 = var5.field3993;
         int var9 = var5.field3994;
         if (var8 != 0 || var9 != 0 || var5.field4006 != 0 || var5.field4009 != 0) {
            var2 |= 7;
         }

         int var10 = super.field4048.method5553((byte)0);
         boolean var11 = super.field4094 != 0 && class730.field2866 >= super.field4069 && class730.field2866 < super.field4070;
         if (var11) {
            var2 |= 524288;
         }

         class879 var12 = super.field4046[0] = this.field3388.method1643(var1, var2, class283.field10614, class662.field9736, class258.field7913, class85.field1121, class936.field10313, class827.field9037, var6, var7, super.field4076, super.field4049, var10, true, class413.field9412, 1284357526);
         int var13 = class45.method3079((byte)1);
         if (class69.field1827 < 96 && var13 > 50) {
            class984.method1884(-824617958);
         }

         if (class721.field3634 != class916.field10415 && var13 < 50) {
            int var14;
            for(var14 = 50 - var13; var14 > class730.field2658; ++class730.field2658) {
               class138.field1171[class730.field2658] = new byte[102400];
            }

            while(var14 < class730.field2658) {
               --class730.field2658;
               class138.field1171[class730.field2658] = null;
            }
         } else if (class916.field10415 != class721.field3634) {
            class138.field1171 = new byte[50][];
            class730.field2658 = 0;
         }

         if (var12 == null) {
            return false;
         } else {
            super.field4053 = var12.method5976();
            var12.method5973();
            this.method2551(var12, 839093609);
            if (var8 == 0 && var9 == 0) {
               this.method2553(var10, this.method2550() << 9, this.method2550() << 9, 0, 0, 1352604124);
            } else {
               this.method2553(var10, var8, var9, var5.field3992, var5.field3998, 1427427127);
               if (super.field4061 != 0) {
                  var12.method5952(super.field4061);
               }

               if (super.field4037 != 0) {
                  var12.method6041(super.field4037);
               }

               if (super.field4038 != 0) {
                  var12.method5953(0, super.field4038, 0);
               }
            }

            if (var11) {
               var12.method5987(super.field4081, super.field4072, super.field4073, super.field4094 & 255);
            }

            if (!this.field3386) {
               this.method2552(var1, var5, var4, var8, var9, var10, 1438640232);
            }

            return true;
         }
      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "akm.gx(" + ')');
      }
   }

   public String method1993(boolean var1, int var2) {
      try {
         String var3 = "";
         if (this.field3378 != null) {
            var3 = this.field3378;
         }

         if (var1) {
            var3 = var3 + this.field3379;
         } else {
            var3 = var3 + this.field3374;
         }

         if (this.field3376 != null) {
            var3 = var3 + this.field3376;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "akm.gk(" + ')');
      }
   }

   public final void method1994(int var1, int var2, byte var3, int var4) {
      try {
         if (super.activeAnimator.method2775((byte)-119) && super.activeAnimator.method2776(1546485881).field6673 == 1) {
            super.field4057 = null;
            super.activeAnimator.method2777(-1, -1739646413);
         }

         for(int var5 = 0; var5 < super.field4040.length; ++var5) {
            if (-1 != super.field4040[var5].field10341) {
               class745 var6 = class635.field9823.method1053(super.field4040[var5].field10341, -1891757366);
               if (var6.field4117 && var6.field4107 != -1 && class936.field10313.method2256(var6.field4107, (byte)83).field6673 == 1) {
                  super.field4040[var5].field10340.method2777(-1, -1843943010);
                  super.field4040[var5].field10341 = -1;
               }
            }
         }

         this.field3400 = -1;
         if (var1 >= 0 && var1 < class730.field2697.method5271(-1987519551) && var2 >= 0 && var2 < class730.field2697.method5272(1479162339)) {
            if (super.field4085[0] >= 0 && super.field4085[0] < class730.field2697.method5271(-1906686754) && super.field4055[0] >= 0 && super.field4055[0] < class730.field2697.method5272(-964068282)) {
               if (class647.field9229.field9230 == var3) {
                  class110.method1389(this, var1, var2, class647.field9229.field9230, (byte)98);
               }

               this.method1996(var1, var2, var3, (byte)94);
            } else {
               this.method1995(var1, var2, -2022261810);
            }
         } else {
            this.method1995(var1, var2, -2049230528);
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "akm.gy(" + ')');
      }
   }

   public void method1995(int var1, int var2, int var3) {
      try {
         super.field4084 = 0;
         super.field4089 = 0;
         super.field4088 = 0;
         super.field4085[0] = var1;
         super.field4055[0] = var2;
         int var4 = this.method2550();
         class32 var5 = class32.method3290(this.method1511().field7637);
         var5.field5296 = (float)(256 * var4 + super.field4085[0] * 512);
         var5.field5299 = (float)(var4 * 256 + super.field4055[0] * 512);
         this.method1514(var5);
         var5.method3291();
         if (this == class923.local) {
            class730.field2697.method5282((byte)35).method5673(-1515011512);
         }

         if (super.field4031 != null) {
            super.field4031.method1720();
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "akm.gu(" + ')');
      }
   }

   public final void method1996(int var1, int var2, byte var3, byte var4) {
      try {
         if (super.field4084 < super.field4085.length - 1) {
            ++super.field4084;
         }

         for(int var5 = super.field4084; var5 > 0; --var5) {
            super.field4085[var5] = super.field4085[var5 - 1];
            super.field4055[var5] = super.field4055[var5 - 1];
            super.field4074[var5] = super.field4074[var5 - 1];
         }

         super.field4085[0] = var1;
         super.field4055[0] = var2;
         super.field4074[0] = var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "akm.gh(" + ')');
      }
   }

   public int method2550() {
      try {
         return this.field3388 != null && -1 != this.field3388.field2444 ? class258.field7913.method12(this.field3388.field2444, 1333509149).field9923 : super.method2550();
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "akm.q(" + ')');
      }
   }

   public int method2555(byte var1) {
      return -1;
   }

   public void method1997(String var1, int var2, int var3, int var4) {
      try {
         this.method2558(var1, var2, var3, class854.method5151((byte)6) * class6.field4931.field9528, (byte)-79);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "akm.gz(" + ')');
      }
   }

   final boolean method2173(int var1) {
      return false;
   }

   final void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "akm.bk(" + ')');
      }
   }

   final void method2205(byte var1) {
      try {
         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akm.bq(" + ')');
      }
   }

   public boolean method2557(byte var1) {
      try {
         return class6.field4931.field9534;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akm.by(" + ')');
      }
   }

   public String method1998(boolean var1, byte var2) {
      try {
         return var1 ? this.field3379 : this.field3374;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "akm.gr(" + ')');
      }
   }

   public class625 method2565(int var1) {
      try {
         if (super.field4082 != null) {
            if (super.field4082.field9748 == null) {
               return null;
            }

            if (class730.field2819 == 0 || class730.field2819 == 3 || class730.field2819 == 1 && class942.method6333(this.field3374, -1511804216)) {
               return super.field4082;
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akm.bl(" + ')');
      }
   }

   public Player(class545 var1) {
      super(var1);
   }

   boolean method2157(class848 var1, int var2, int var3, byte var4) {
      try {
         if (this.field3388 != null && this.method1992(var1, 131072, (byte)31)) {
            class135 var5 = this.method1521();
            boolean var6 = false;

            int var7;
            for(var7 = 0; var7 < super.field4046.length; ++var7) {
               if (super.field4046[var7] != null && super.field4046[var7].method6097(var2, var3, var5, true, 0)) {
                  var6 = true;
                  break;
               }
            }

            for(var7 = 0; var7 < super.field4046.length; ++var7) {
               super.field4046[var7] = null;
            }

            return var6;
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "akm.bu(" + ')');
      }
   }

   public final boolean method2000(int var1) {
      try {
         return this.field3388 != null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akm.ga(" + ')');
      }
   }

   void method2164(class848 var1, int var2) {
      try {
         if (this.field3388 != null && (super.field4092 || this.method1992(var1, 0, (byte)34))) {
            class135 var3 = var1.method5048();
            var3.method1008(this.method1511());
            var3.method1018(0.0F, -5.0F, 0.0F);
            this.method2573(var1, super.field4046, var3, super.field4092, 1138059762);

            for(int var4 = 0; var4 < super.field4046.length; ++var4) {
               super.field4046[var4] = null;
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "akm.bb(" + ')');
      }
   }

   int method2560(int var1) {
      try {
         return this.field3395;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akm.t(" + ')');
      }
   }
}
