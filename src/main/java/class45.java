public class class45 {
   int field5105;
   static byte field5106 = 3;
   int field5107 = -1996485639;
   static byte field5108 = 1;
   int field5109;
   byte field5110;
   int field5111;
   int field5112;
   static byte field5113 = 2;
   int field5114;
   class624 field5115;
   int field5116;
   class656 field5117;
   class436 field5118;
   int field5119 = -1381628957;
   class29 field5120;

   class45(byte var1, int var2, int var3, int var4, int var5, int var6, int var7, class963 var8) {
      this.field5110 = var1;
      this.field5109 = 74897619 * var2;
      this.field5105 = var3 * -155194551;
      this.field5111 = var4 * -1463623301;
      this.field5116 = 1215243635 * var5;
      this.field5112 = var6 * 877520607;
      this.field5114 = 184873165 * var7;
      if (var8 != null && var8 instanceof class476) {
         class476 var9 = (class476)var8;
         this.field5119 = var9.field8299 * 1381628957;
         this.field5107 = var9.field8296 * 1996485639;
      }

   }

   boolean method3078(byte var1) {
      try {
         return this.field5110 == 2 || this.field5110 == 3;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mj.a(" + ')');
      }
   }

   public static int method3079(byte var0) {
      try {
         class1 var1 = class365.field2449;
         synchronized(class365.field2449) {
            int var2 = class365.field2449.method2973((byte)-120);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mj.r(" + ')');
      }
   }

   static final void method3080(class513 var0, int var1, class946 var2, int var3) {
      try {
         byte var4 = class647.field9231.field9230;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         boolean var10;
         if ((var3 & 4) != 0) {
            var5 = var0.method6374();
            var6 = var0.method6409(-1799671861);
            if (65535 == var5) {
               var5 = -1;
            }

            var7 = var0.method6395(-1014855659);
            var8 = var7 & 7;
            var9 = var7 >> 3 & 15;
            if (var9 == 15) {
               var9 = -1;
            }

            var10 = 1 == (var7 >> 7 & 1);
            var2.method2546(var5, var6, var8, var9, var10, 0, 831413227);
         }

         if ((var3 & 64) != 0) {
            var2.field3400 = var0.method6374() * -1530078181;
            if (2050671733 * var2.field4084 == 0) {
               var2.method2542(var2.field3400 * 1208589843, (byte)1);
               var2.field3400 = 1530078181;
            }
         }

         if ((var3 & '耀') != 0) {
            var5 = var0.method6402(-2063469305);
            var6 = var0.method6414(1789880026);
            if (65535 == var5) {
               var5 = -1;
            }

            var7 = var0.method6395(-1014855659);
            var8 = var7 & 7;
            var9 = var7 >> 3 & 15;
            if (15 == var9) {
               var9 = -1;
            }

            var10 = 1 == (var7 >> 7 & 1);
            var2.method2546(var5, var6, var8, var9, var10, 1, -589042001);
         }

         int var18;
         if ((var3 & 8) != 0) {
            var5 = var0.method6396((short)-2029);
            if (var5 > 0) {
               for(var6 = 0; var6 < var5; ++var6) {
                  var7 = -1;
                  var8 = -1;
                  var9 = -1;
                  var18 = var0.method6382(1723054621);
                  if (32767 == var18) {
                     var18 = var0.method6382(1723054621);
                     var8 = var0.method6382(1723054621);
                     var7 = var0.method6382(1723054621);
                     var9 = var0.method6382(1723054621);
                  } else if (32766 != var18) {
                     var8 = var0.method6382(1723054621);
                  } else {
                     var18 = -1;
                  }

                  int var11 = var0.method6382(1723054621);
                  int var12 = var0.method6397((byte)93);
                  var2.method2548(var18, var8, var7, var9, 443738891 * class730.field2866, var11, var12, (byte)121);
               }
            }
         }

         if ((var3 & 4194304) != 0) {
            var5 = var0.method6402(1614800884);
            var6 = var0.method6420((byte)-4);
            if (var5 == 65535) {
               var5 = -1;
            }

            var7 = var0.method6395(-1014855659);
            var8 = var7 & 7;
            var9 = var7 >> 3 & 15;
            if (15 == var9) {
               var9 = -1;
            }

            var10 = (var7 >> 7 & 1) == 1;
            var2.method2546(var5, var6, var8, var9, var10, 2, 1066291785);
         }

         if ((var3 & 8388608) != 0) {
            var5 = var0.method6402(-668422700);
            var6 = var0.method6414(843947647);
            if (65535 == var5) {
               var5 = -1;
            }

            var7 = var0.method6395(-1014855659);
            var8 = var7 & 7;
            var9 = var7 >> 3 & 15;
            if (var9 == 15) {
               var9 = -1;
            }

            var10 = 1 == (var7 >> 7 & 1);
            var2.method2546(var5, var6, var8, var9, var10, 3, 305107810);
         }

         if ((var3 & 16) != 0) {
            var5 = var0.method6395(-1014855659);
            byte[] var14 = new byte[var5];
            class907 var16 = new class907(var14);
            var0.method6381(var14, 0, var5, -953523806);
            class498.field8106[var1] = var16;
            var2.method1990(var16, (byte)3);
         }

         if ((var3 & 1) != 0) {
            var5 = var0.method6402(2081840809);
            if (65535 == var5) {
               var5 = -1;
            }

            var2.field4054 = var5 * 283914955;
         }

         if ((var3 & 2048) != 0) {
            var4 = var0.method6407((byte)-95);
         }

         if ((var3 & 262144) != 0) {
            var2.field3401 = var0.method6396((short)-25952) == 1;
         }

         String var19;
         if ((var3 & 131072) != 0) {
            var19 = var0.method6379(711431277);
            var6 = var0.method6371();
            if ((var6 & 1) != 0) {
               class702.method1969(2, var6, var2.method1993(true, -2017419584), var2.method1998(false, (byte)-87), var2.field3379, var19, 252423564);
            }

            var2.method1997(var19, 0, 0, -1714990450);
         }

         if ((var3 & 8192) != 0) {
            var5 = var0.method6401((byte)-70);
            var2.field4052 = var0.method6371() * 918505277;
            var2.field4060 = var0.method6396((short)-3023) * -494980103;
            var2.field4083 = (var5 & '耀') != 0;
            var2.field4051 = -257621575 * (var5 & 32767);
            var2.field4050 = 1208636921 * class730.field2866 + -1132907677 * var2.field4051 + 1195117671 * var2.field4052;
         }

         if ((var3 & 4096) != 0) {
            var2.field4062 = var0.method6398(1080678389) * 1925713613;
            var2.field4064 = var0.method6372(-12558881) * 516351707;
            var2.field4063 = var0.method6372(-12558881) * 1712047767;
            var2.field4065 = var0.method6407((byte)-17) * 2089924823;
            var2.field4059 = (var0.method6374() + class730.field2866 * 443738891) * 996079737;
            var2.field4067 = (var0.method6374() + class730.field2866 * 443738891) * 1000906529;
            var2.field4068 = var0.method6374() * 1386670945;
            if (var2.field3396) {
               var2.field4062 += 259583125 * var2.field3397;
               var2.field4064 += var2.field3398 * -611622223;
               var2.field4063 += -1551443089 * var2.field3397;
               var2.field4065 += 1804486437 * var2.field3398;
               var2.field4084 = 0;
            } else {
               var2.field4062 += 1925713613 * var2.field4085[0];
               var2.field4064 += var2.field4055[0] * 516351707;
               var2.field4063 += var2.field4085[0] * 1712047767;
               var2.field4065 += 2089924823 * var2.field4055[0];
               var2.field4084 = -1013322787;
            }

            var2.field4089 = 0;
         }

         if ((var3 & 128) != 0) {
            class498.field8105[var1] = var0.method6399(44745097);
         }

         int[] var15;
         int[] var17;
         if ((var3 & 16384) != 0) {
            var5 = var0.method6371();
            var15 = new int[var5];
            var17 = new int[var5];
            int[] var20 = new int[var5];

            for(var9 = 0; var9 < var5; ++var9) {
               var15[var9] = var0.method6423(1235052657);
               var17[var9] = var0.method6395(-1014855659);
               var20[var9] = var0.method6403(1478539457);
            }

            class711.method2025(var2, var15, var17, var20, 1644064563);
         }

         if ((var3 & 32) != 0) {
            int[] var21 = new int[class458.method3829((byte)-10).length];

            for(var6 = 0; var6 < class458.method3829((byte)0).length; ++var6) {
               var21[var6] = var0.method6423(1235052657);
            }

            var6 = var0.method6371();
            class488.method4740(var2, var21, var6, false, (byte)-1);
         }

         if ((var3 & 512) != 0) {
            var2.field3382 = var0.method6371() == 1;
         }

         if ((var3 & 1048576) != 0) {
            var5 = var0.method6371();
            var15 = new int[var5];
            var17 = new int[var5];

            for(var8 = 0; var8 < var5; ++var8) {
               var9 = var0.method6374();
               if (49152 == (var9 & '쀀')) {
                  var18 = var0.method6403(1478539457);
                  var15[var8] = var9 << 16 | var18;
               } else {
                  var15[var8] = var9;
               }

               var17[var8] = var0.method6374();
            }

            var2.method2579(var15, var17, -305715436);
         }

         if ((var3 & 65536) != 0) {
            var5 = var0.field10375[(var0.field10376 += 116413311) * 385051775 - 1] & 255;

            for(var6 = 0; var6 < var5; ++var6) {
               var7 = var0.method6401((byte)117);
               var8 = var0.method6420((byte)-15);
               var2.field3402.method6447(var7, var8, (byte)1);
            }
         }

         if ((var3 & 256) != 0) {
            var19 = var0.method6379(-1807701355);
            if (var2 == class923.field10295) {
               class702.method1969(2, 0, var2.method1993(true, -1880046656), var2.method1998(false, (byte)-103), var2.field3379, var19, -588173673);
            }

            var2.method1997(var19, 0, 0, -1278251821);
         }

         if ((var3 & 2097152) != 0) {
            var2.field4081 = var0.method6372(-12558881);
            var2.field4072 = var0.method6398(981809760);
            var2.field4073 = var0.method6407((byte)-7);
            var2.field4094 = (byte)var0.method6396((short)-10460);
            var2.field4069 = (443738891 * class730.field2866 + var0.method6374()) * 1828453179;
            var2.field4070 = (class730.field2866 * 443738891 + var0.method6374()) * -473408095;
         }

         if ((var3 & 524288) != 0) {
            var2.field3402.method6444((byte)-63);
            var5 = var0.field10375[(var0.field10376 += 116413311) * 385051775 - 1] & 255;

            for(var6 = 0; var6 < var5; ++var6) {
               var7 = var0.method6402(-722350822);
               var8 = var0.method6414(1512777839);
               var2.field3402.method6447(var7, var8, (byte)1);
            }
         }

         if (var2.field3396) {
            if (var4 == 127) {
               var2.method1995(659113193 * var2.field3397, -504032157 * var2.field3398, -2047021901);
            } else {
               byte var22;
               if (class647.field9231.field9230 != var4) {
                  var22 = var4;
               } else {
                  var22 = class498.field8105[var1];
               }

               class469.method4017(var2, var22, 1037382874);
               var2.method1994(659113193 * var2.field3397, -504032157 * var2.field3398, var22, -2128158189);
            }
         }

      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "mj.u(" + ')');
      }
   }

   static final void method3081(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class4.field4946 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mj.amu(" + ')');
      }
   }
}
