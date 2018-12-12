public class class363 {
   int field2386;
   class616 field2387;
   class726 field2388;
   boolean field2389 = false;
   int field2390;
   int field2391;
   long field2392;
   int field2393;
   class333 field2394 = new class333();
   class114 field2395;
   int field2396;
   int field2397 = 0;
   int field2398;
   int field2399;
   class333 field2400 = new class333();
   class933 field2401;
   int field2402;
   boolean field2403 = false;
   boolean field2404 = false;

   void method1623(byte var1) {
      try {
         this.field2394.field138 = this.field2401.field10330;
         this.field2394.field128 = this.field2401.field10336;
         this.field2394.field129 = this.field2401.field10332;
         this.field2394.field130 = this.field2401.field10325;
         this.field2394.field131 = this.field2401.field10334;
         this.field2394.field132 = this.field2401.field10335;
         this.field2394.field133 = this.field2401.field10324;
         this.field2394.field136 = this.field2401.field10337;
         this.field2394.field135 = this.field2401.field10338;
         if (this.field2394.field138 == this.field2394.field130 && this.field2394.field133 == this.field2394.field130 && this.field2394.field128 == this.field2394.field131 && this.field2394.field136 == this.field2394.field131 && this.field2394.field132 == this.field2394.field129 && this.field2394.field135 == this.field2394.field132) {
            this.field2389 = true;
         } else if (this.field2389) {
            this.field2389 = false;
            this.field2400.field138 = this.field2394.field138;
            this.field2400.field128 = this.field2394.field128;
            this.field2400.field129 = this.field2394.field129;
            this.field2400.field130 = this.field2394.field130;
            this.field2400.field131 = this.field2394.field131;
            this.field2400.field132 = this.field2394.field132;
            this.field2400.field133 = this.field2394.field133;
            this.field2400.field136 = this.field2394.field136;
            this.field2400.field135 = this.field2394.field135;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "og.a(" + ')');
      }
   }

   void method1624(class848 var1, long var2, int var4, boolean var5, byte var6) {
      try {
         int var7;
         if (this.field2403) {
            var5 = false;
         } else if (class198.field7038 < this.field2395.field1763) {
            var5 = false;
         } else if (class198.field7040 > class948.field3289[class198.field7038]) {
            var5 = false;
         } else if (this.field2389) {
            var5 = false;
         } else if (-1 != this.field2395.field1765) {
            var7 = (int)(var2 - this.field2392);
            if (!this.field2395.field1760 && var7 > this.field2395.field1765) {
               var5 = false;
            } else {
               var7 %= this.field2395.field1765;
            }

            if (!this.field2395.field1742 && var7 < this.field2395.field1761) {
               var5 = false;
            }

            if (this.field2395.field1742 && var7 >= this.field2395.field1761) {
               var5 = false;
            }
         }

         this.field2391 = 0;

         for(class737 var32 = (class737)this.field2387.method5207(-16777216); var32 != null; var32 = (class737)this.field2387.method5211(-690243159)) {
            var32.method1829(var2, var4);
            this.field2391 += 961086567;
         }

         if (var5) {
            var7 = (this.field2394.field133 + this.field2394.field138 + this.field2394.field130) / 3;
            int var8 = (this.field2394.field131 + this.field2394.field128 + this.field2394.field136) / 3;
            int var9 = (this.field2394.field135 + this.field2394.field129 + this.field2394.field132) / 3;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            if (var7 != this.field2394.field134 || var8 != this.field2394.field137 || this.field2394.field127 != var9 || !this.field2404) {
               this.field2394.field134 = var7;
               this.field2394.field137 = var8;
               this.field2394.field127 = var9;
               var10 = this.field2394.field130 - this.field2394.field138;
               var11 = this.field2394.field131 - this.field2394.field128;
               var12 = this.field2394.field132 - this.field2394.field129;
               var13 = this.field2394.field133 - this.field2394.field138;
               var14 = this.field2394.field136 - this.field2394.field128;
               var15 = this.field2394.field135 - this.field2394.field129;
               this.field2396 = var11 * var15 - var14 * var12;
               this.field2390 = var13 * var12 - var10 * var15;
               this.field2398 = var14 * var10 - var13 * var11;

               while(true) {
                  if (this.field2396 <= 32767 && this.field2390 <= 32767 && this.field2398 <= 32767 && this.field2396 >= -32767 && this.field2390 >= -32767 && this.field2398 >= -32767) {
                     var16 = (int)Math.sqrt((double)(this.field2396 * this.field2396 + this.field2390 * this.field2390 + this.field2398 * this.field2398));
                     if (var16 <= 0) {
                        var16 = 1;
                     }

                     this.field2396 = this.field2396 * 32767 / var16;
                     this.field2390 = this.field2390 * 32767 / var16;
                     this.field2398 = this.field2398 * 32767 / var16;
                     if (this.field2395.field1759 > 0 || this.field2395.field1781 > 0) {
                        var17 = (int)(Math.atan2((double)this.field2398, (double)this.field2396) * 2607.5945876176133D);
                        var18 = (int)(Math.atan2((double)this.field2390, Math.sqrt((double)(this.field2396 * this.field2396 + this.field2398 * this.field2398))) * 2607.5945876176133D);
                        this.field2393 = this.field2395.field1759 - this.field2395.field1726;
                        this.field2399 = this.field2395.field1726 + var17 - (this.field2393 >> 1);
                        this.field2402 = this.field2395.field1781 - this.field2395.field1728;
                        this.field2386 = this.field2395.field1728 + var18 - (this.field2402 >> 1);
                     }

                     this.field2404 = true;
                     break;
                  }

                  this.field2396 >>= 1;
                  this.field2390 >>= 1;
                  this.field2398 >>= 1;
               }
            }

            this.field2397 += (int)((double)var4 * ((double)this.field2395.field1749 + Math.random() * (double)(this.field2395.field1750 - this.field2395.field1749)));
            if (this.field2397 > 63) {
               var10 = this.field2397 >> 6;
               this.field2397 &= 63;
               var11 = (var4 << 8) / var10;
               var12 = 0;

               for(var13 = 0; var13 < var10; var12 += var11) {
                  int var20;
                  int var21;
                  int var22;
                  if (this.field2395.field1759 <= 0 && this.field2395.field1781 <= 0) {
                     var14 = this.field2396;
                     var15 = this.field2390;
                     var16 = this.field2398;
                  } else {
                     var17 = this.field2399 + (int)((double)this.field2393 * Math.random());
                     var17 &= 16383;
                     var18 = class703.field3413[var17];
                     int var19 = class703.field3404[var17];
                     var20 = this.field2386 + (int)((double)this.field2402 * Math.random());
                     var20 &= 8191;
                     var21 = class703.field3413[var20];
                     var22 = class703.field3404[var20];
                     byte var23 = 13;
                     var14 = var19 * var21 >> var23;
                     var15 = (var22 << 1) * -1;
                     var16 = var21 * var18 >> var23;
                  }

                  float var34 = (float)Math.random();
                  float var35 = (float)Math.random();
                  if (var35 + var34 > 1.0F) {
                     var34 = 1.0F - var34;
                     var35 = 1.0F - var35;
                  }

                  float var36 = 1.0F - (var35 + var34);
                  var20 = (int)((float)this.field2394.field133 * var36 + (float)this.field2394.field138 * var34 + (float)this.field2394.field130 * var35);
                  var21 = (int)(var34 * (float)this.field2394.field128 + var35 * (float)this.field2394.field131 + (float)this.field2394.field136 * var36);
                  var22 = (int)((float)this.field2394.field135 * var36 + var34 * (float)this.field2394.field129 + (float)this.field2394.field132 * var35);
                  int var37 = this.field2395.field1730 + (int)(Math.random() * (double)(this.field2395.field1764 - this.field2395.field1730));
                  int var24 = this.field2395.field1747 + (int)(Math.random() * (double)(this.field2395.field1748 - this.field2395.field1747));
                  int var25 = this.field2395.field1775 + (int)(Math.random() * (double)(this.field2395.field1737 - this.field2395.field1775));
                  int var28;
                  if (this.field2395.field1766) {
                     double var26 = Math.random();
                     var28 = (int)((double)this.field2395.field1773 * var26 + (double)this.field2395.field1771) << 16 | (int)((double)this.field2395.field1776 * var26 + (double)this.field2395.field1774) << 8 | (int)((double)this.field2395.field1777 + var26 * (double)this.field2395.field1762) | (int)((double)this.field2395.field1732 + Math.random() * (double)this.field2395.field1782) << 24;
                  } else {
                     var28 = (int)((double)this.field2395.field1771 + Math.random() * (double)this.field2395.field1773) << 16 | (int)((double)this.field2395.field1774 + Math.random() * (double)this.field2395.field1776) << 8 | (int)((double)this.field2395.field1777 + Math.random() * (double)this.field2395.field1762) | (int)((double)this.field2395.field1732 + Math.random() * (double)this.field2395.field1782) << 24;
                  }

                  int var29 = this.field2395.field1746;
                  if (!var1.method5028() && !this.field2395.field1724) {
                     var29 = -1;
                  }

                  class737 var30;
                  if (class198.field7041 != class198.field7049) {
                     var30 = class198.field7039[class198.field7041];
                     class198.field7041 = class198.field7041 + 1 & 1023;
                     var30.method1825(this, var20, var21, var22, var14, var15, var16, var37, var24, var28, var25, var29, this.field2395.field1783, this.field2395.field1780);
                  } else {
                     var30 = new class737(this, var20, var21, var22, var14, var15, var16, var37, var24, var28, var25, var29, this.field2395.field1783, this.field2395.field1780);
                  }

                  if (var12 > 256) {
                     var30.method1829(var2, var12 >> 8);
                  }

                  this.field2391 += 961086567;
                  ++var13;
               }
            }
         }

         if (!this.field2394.method110(this.field2400, (byte)-35)) {
            class333 var33 = this.field2400;
            this.field2400 = this.field2394;
            this.field2394 = var33;
            this.field2394.field138 = this.field2401.field10330;
            this.field2394.field128 = this.field2401.field10336;
            this.field2394.field129 = this.field2401.field10332;
            this.field2394.field130 = this.field2401.field10325;
            this.field2394.field131 = this.field2401.field10334;
            this.field2394.field132 = this.field2401.field10335;
            this.field2394.field133 = this.field2401.field10324;
            this.field2394.field136 = this.field2401.field10337;
            this.field2394.field135 = this.field2401.field10338;
            this.field2394.field134 = this.field2400.field134;
            this.field2394.field137 = this.field2400.field137;
            this.field2394.field127 = this.field2400.field127;
         }

         class198.field7045 += this.field2391 * 679204695;
      } catch (RuntimeException var31) {
         throw class158.method3445(var31, "og.f(" + ')');
      }
   }

   void method1625(class545 var1, class848 var2, long var3) {
      try {
         for(class737 var5 = (class737)this.field2387.method5207(-16777216); var5 != null; var5 = (class737)this.field2387.method5211(-1399714769)) {
            var5.method1828(var1, var2, var3);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "og.b(" + ')');
      }
   }

   class363(class848 var1, class933 var2, class726 var3, long var4) {
      this.field2401 = var2;
      this.field2388 = var3;
      this.field2392 = var4;
      this.field2395 = this.field2401.method6284(-1416794725);
      if (!var1.method5028() && -1 != this.field2395.field1779) {
         this.field2395 = class980.method1912(this.field2395.field1779, 2005350387);
      }

      this.field2387 = new class616();
      this.field2397 = (int)((double)this.field2397 + Math.random() * 64.0D);
      this.method1623((byte)1);
      this.field2400.field138 = this.field2394.field138;
      this.field2400.field128 = this.field2394.field128;
      this.field2400.field129 = this.field2394.field129;
      this.field2400.field130 = this.field2394.field130;
      this.field2400.field131 = this.field2394.field131;
      this.field2400.field132 = this.field2394.field132;
      this.field2400.field133 = this.field2394.field133;
      this.field2400.field136 = this.field2394.field136;
      this.field2400.field135 = this.field2394.field135;
   }

   static final void method1626(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-62);
         class131 var4 = class382.field1410[var2 >> 16];
         class643.method6122(var3, var4, var0, (byte)-2);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "og.ji(" + ')');
      }
   }

   static final void method1627(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-5);
         var0.field3161[++var0.field3156 - 1] = var3.field885;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "og.ra(" + ')');
      }
   }

   static final void method1628(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = var0.field3169.field9699 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "og.xn(" + ')');
      }
   }

   public static final void method1629(String var0, byte var1) {
      try {
         if (var0 != null) {
            String var2 = class526.method2229(var0, -1974815014);
            if (var2 != null) {
               for(int var3 = 0; var3 < class730.field2934; ++var3) {
                  String var4 = class730.field2841[var3];
                  String var5 = class526.method2229(var4, -2036890011);
                  if (class559.method477(var0, var2, var4, var5, -1043868937)) {
                     --class730.field2934;

                     for(int var6 = var3; var6 < class730.field2934; ++var6) {
                        class730.field2841[var6] = class730.field2841[var6 + 1];
                        class730.field2936[var6] = class730.field2936[var6 + 1];
                        class730.field2937[var6] = class730.field2937[var6 + 1];
                        class730.field2754[var6] = class730.field2754[1 + var6];
                        class730.field2939[var6] = class730.field2939[var6 + 1];
                     }

                     class730.field2865 = class730.field2915;
                     class684 var9 = class423.method5712((short)512);
                     class701 var7 = class637.method5936(class643.field9998, var9.field7765, (byte)6);
                     var7.field3364.method6361(class305.method372(var0, 1644978699));
                     var7.field3364.method6366(var0, 2144124747);
                     var9.method4380(var7, (byte)-5);
                     break;
                  }
               }
            }
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "og.mx(" + ')');
      }
   }

   static final void method1630(class744 var0, int var1) {
      try {
         var0.field3158 -= 2;
         String var2 = (String)var0.field3157[var0.field3158];
         String var3 = (String)var0.field3157[1 + var0.field3158];
         if (class730.field2790 != 0 || (!class730.field2792 || class730.field2793) && !class730.field2783) {
            class684 var4 = class423.method5712((short)512);
            class701 var5 = class637.method5936(class643.field9981, var4.field7765, (byte)122);
            var5.field3364.method6362(0, 16711935);
            int var6 = var5.field3364.field10376;
            var5.field3364.method6366(var2, 2138877432);
            class831.method5386(var5.field3364, var3, 208361391);
            var5.field3364.method6369(var5.field3364.field10376 - var6, 1585504133);
            var4.method4380(var5, (byte)-93);
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "og.abi(" + ')');
      }
   }

   static final void method1631(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)22);
         class232.method4661(var3, var0, 2145679752);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "og.qd(" + ')');
      }
   }
}
