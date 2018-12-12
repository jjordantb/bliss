public class class416 {
   public int field9522;
   public int field9523 = 1238942292;
   public int[] field9524 = null;
   public int[] field9525 = null;
   public int field9526 = -39715579;
   public int field9527 = 1703838282;
   public int field9528 = -985193475;
   public boolean field9529 = true;
   public short[][] field9530;
   static int field9531 = 4;
   public boolean field9532 = true;
   public int field9533;
   public boolean field9534 = true;
   public short[][][] field9535;
   public int field9536 = 618853911;
   public int field9537 = 1051634129;

   void method5645(class907 var1, int var2) {
      try {
         boolean var3 = false;

         while(true) {
            while(true) {
               int var4 = var1.method6371();
               if (var4 == 0) {
                  if (var2 != -1224635914) {
                     throw new IllegalStateException();
                  }

                  if (!var3) {
                     if (this.field9524 == null) {
                        this.field9523 = 1238942292;
                        this.field9524 = new int[4];
                        this.field9525 = new int[4];
                     }

                     for(var4 = 0; var4 < this.field9524.length; ++var4) {
                        this.field9524[var4] = 0;
                        this.field9525[var4] = var4 * 20;
                     }
                  }

                  return;
               }

               int var5;
               if (1 == var4) {
                  if (this.field9524 == null) {
                     this.field9523 = 1238942292;
                     this.field9524 = new int[4];
                     this.field9525 = new int[4];
                  }

                  for(var5 = 0; var5 < this.field9524.length; ++var5) {
                     this.field9524[var5] = var1.method6367(2110626558);
                     this.field9525[var5] = var1.method6367(1614151446);
                  }

                  var3 = true;
               } else if (var4 == 2) {
                  this.field9526 = var1.method6423(1235052657) * 39715579;
               } else if (var4 == 3) {
                  this.field9523 = var1.method6371() * -1837748075;
                  this.field9524 = new int[-942466371 * this.field9523];
                  this.field9525 = new int[-942466371 * this.field9523];
               } else if (4 == var4) {
                  this.field9529 = false;
               } else if (var4 == 5) {
                  this.field9533 = var1.method6390((byte)3) * -990069469;
               } else if (var4 == 6) {
                  this.field9522 = var1.method6390((byte)66) * 1632959877;
               } else if (7 != var4) {
                  if (var4 == 8) {
                     this.field9532 = false;
                  } else if (9 == var4) {
                     this.field9527 = var1.method6371() * 851919141;
                  } else if (10 == var4) {
                     this.field9534 = false;
                  } else if (11 == var4) {
                     this.field9528 = var1.method6371() * -328397825;
                  } else if (var4 == 12) {
                     this.field9536 = var1.method6374() * -618853911;
                     this.field9537 = var1.method6374() * -1051634129;
                  } else if (var4 == 13) {
                     var1.method6371();
                     var1.method6371();
                     var1.method6371();
                     var1.method6371();
                     var1.method6371();
                  }
               } else {
                  this.field9530 = new short[10][4];
                  this.field9535 = new short[10][4][];

                  for(var5 = 0; var5 < 10; ++var5) {
                     for(int var6 = 0; var6 < 4; ++var6) {
                        int var7 = var1.method6374();
                        if (var7 == 65535) {
                           var7 = -1;
                        }

                        this.field9530[var5][var6] = (short)var7;
                        int var8 = var1.method6374();
                        this.field9535[var5][var6] = new short[var8];

                        for(int var9 = 0; var9 < var8; ++var9) {
                           int var10 = var1.method6374();
                           if (65535 == var10) {
                              var10 = -1;
                           }

                           this.field9535[var5][var6][var9] = (short)var10;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "pk.a(" + ')');
      }
   }

   public class416(class180 var1) {
      byte[] var2 = var1.method3264(-363169051 * class590.field1581.field1585, (byte)61);
      this.method5645(new class907(var2), -1224635914);
   }

   static void method5646(class744 var0, short var1) {
      try {
         var0.field3161[var0.field3156 * 681479919 - 2] = class735.field3009.method4224(var0.field3161[var0.field3156 * 681479919 - 2], 245040087).method5327(class827.field9037, var0.field3161[681479919 * var0.field3156 - 1], 236962620) ? 1 : 0;
         var0.field3156 -= -391880689;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pk.c(" + ')');
      }
   }

   static final void method5647(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         String var4 = (String)var2.field3157[(var2.field3158 -= 969361751) * -203050393];
         if (class960.method2212(var4, var2, -1435282371) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field847 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pk.lk(" + ')');
      }
   }

   static final void method5648(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         int var3 = class615.field8903.field9150.method2717(-2143866938);
         if (var2 != var3) {
            if (class552.method457(class730.field2733 * -1233866115, (byte)44)) {
               if (var3 == 0 && -1256171511 * class540.field3920 != -1) {
                  class58.method1581(class771.field3732, -1256171511 * class540.field3920, 0, var2, false, -2115031871);
                  class228.method4589(57327767);
                  class540.field3921 = false;
               } else if (var2 == 0) {
                  class809.method2888((byte)-103);
                  class540.field3921 = false;
               } else {
                  class917.method6448(var2, -1911723714);
               }
            }

            class615.field8903.method5391(class615.field8903.field9150, var2, -2050981993);
            class95.method523(656179282);
            class730.field2647 = false;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pk.aiw(" + ')');
      }
   }

   static void method5649(int var0, String var1, boolean var2, byte var3) {
      try {
         class47.method3085(-1211644762);
         class814.method2931(-77044061);
         class406.method5547(600492820);
         class397.method3475(var0, var1, var2, (short)256);
         class785.field3827.method1850(55121200);
         class785.field3827.method1856(class730.field2681, (byte)3);
         class867.method5833(class593.field1623, -1982421296);
         class158.method3443(class593.field1623, class562.field827, 556232880);
         class452.method3868(886607379);
         class924.method6252(class324.field621, -1865975129);
         class881.method6172(-1533729788);
         class362.method1508(272313527);
         if (class730.field2733 * -1233866115 == 19) {
            class967.method1750(1, 1559775234);
         } else if (14 == class730.field2733 * -1233866115) {
            class967.method1750(15, 326523598);
         } else if (18 == -1233866115 * class730.field2733) {
            class967.method1750(16, 508660854);
         } else if (-1233866115 * class730.field2733 == 0) {
            class967.method1750(17, 582518486);
         } else if (class730.field2733 * -1233866115 != 11 && class730.field2733 * -1233866115 != 7) {
            if (8 == class730.field2733 * -1233866115) {
               class967.method1750(9, 1249490303);
            }
         } else {
            class984.method1876(-2131925444);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pk.fk(" + ')');
      }
   }

   static final void method5650(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class327 var3 = class459.method3965(-577360818);
         if (var3 != null) {
            boolean var4 = var3.method7(var2 >> 28 & 3, var2 >> 14 & 16383, var2 & 16383, class384.field1429, -253186022);
            if (var4) {
               class122.method1608(class384.field1429[1], class384.field1429[2], -548972447);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pk.ado(" + ')');
      }
   }

   static final void method5651(class744 var0, byte var1) {
      try {
         var0.field3156 -= -783761378;
         class730.field2905 = (short)var0.field3161[var0.field3156 * 681479919];
         if (class730.field2905 <= 0) {
            class730.field2905 = 256;
         }

         class730.field2913 = (short)var0.field3161[1 + 681479919 * var0.field3156];
         if (class730.field2913 <= 0) {
            class730.field2913 = 320;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pk.akt(" + ')');
      }
   }
}
