public class class526 {
   public boolean field3656 = false;
   static class1 field3657 = new class1(64);
   static int field3658 = 0;
   public int field3659 = -2036085851;
   public int field3660 = 843301217;
   public int field3661 = -1449508928;
   public int field3662 = -603129954;
   public int field3663 = 1561394240;
   static class180 field3664;
   public boolean field3665 = false;
   public static class180 field3666;
   public static byte field3667;

   void method2221(class907 var1, int var2, int var3, int var4) {
      try {
         if (1 == var2) {
            this.field3659 = var1.method6374() * 2036085851;
            if (39181267 * this.field3659 == 65535) {
               this.field3659 = -2036085851;
            }
         } else if (var2 == 2) {
            this.field3663 = (var1.method6374() + 1) * 1635009521;
            this.field3661 = (var1.method6374() + 1) * 2057726207;
         } else if (3 == var2) {
            var1.method6372(-12558881);
         } else if (var2 == 4) {
            this.field3662 = var1.method6371() * -301564977;
         } else if (var2 == 5) {
            this.field3660 = var1.method6371() * 843301217;
         } else if (var2 == 6) {
            this.field3656 = true;
         } else if (7 == var2) {
            this.field3665 = true;
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "he.p(" + ')');
      }
   }

   void method2222(class907 var1, int var2, byte var3) {
      try {
         while(true) {
            int var4 = var1.method6371();
            if (var4 == 0) {
               if (var3 != 8) {
                  ;
               }

               return;
            }

            this.method2221(var1, var4, var2, 1303074058);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "he.b(" + ')');
      }
   }

   public static int method2223(int var0, int var1) {
      try {
         var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
         var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
         var0 = var0 + (var0 >>> 4) & 252645135;
         var0 += var0 >>> 8;
         var0 += var0 >>> 16;
         return var0 & 255;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "he.b(" + ')');
      }
   }

   public static class272 method2224(int var0) {
      try {
         return class818.field4614;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "he.g(" + ')');
      }
   }

   public static void method2225(int var0, int var1, int var2, int var3) {
      try {
         class389 var4 = Client.field2697.method5270(681479919);
         int var5 = var1 + -1760580017 * var4.field1521;
         int var6 = var2 + 283514611 * var4.field1522;
         if (Client.field2697.method5317(-1611682495) != null && Client.field2697.method5316(-257896295) != class335.field44 && var1 >= 0 && var2 >= 0 && var1 < Client.field2697.method5271(-1890552944) && var2 < Client.field2697.method5272(-1685955624)) {
            long var7 = (long)(var0 << 28 | var6 << 14 | var5);
            class508 var9 = (class508) Client.field2666.method2942(var7);
            if (var9 == null) {
               Client.field2697.method5317(-1611682495).method2453(var0, var1, var2, (byte)86);
            } else {
               class31 var10 = (class31)var9.field3966.method901(1766612795);
               if (var10 == null) {
                  Client.field2697.method5317(-1611682495).method2453(var0, var1, var2, (byte)28);
               } else {
                  class864 var11 = (class864) Client.field2697.method5317(-1611682495).method2453(var0, var1, var2, (byte)119);
                  if (var11 == null) {
                     var11 = new class864(Client.field2697.method5317(-1611682495), var1 << 265, Client.field2697.method5317(-1611682495).field3862[var0].method3888(var1, var2, (byte)-15), var2 << 265, var0, var0);
                  } else {
                     var11.field9015 = 2004197937;
                     var11.field9019 = -474510257;
                     var11.field3638 = Client.field2697.method5317(-1611682495);
                  }

                  var11.field9021 = 397105967 * var10.field5319;
                  var11.field9012 = -2063762687 * var10.field5318;

                  label64:
                  while(true) {
                     class31 var12 = (class31)var9.field3966.method906(49146);
                     if (var12 == null) {
                        if (var3 <= -111188266) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     if (1768239597 * var12.field5319 != -441234013 * var11.field9021) {
                        var11.field9019 = 1259142109 * var12.field5319;
                        var11.field9014 = -1936319903 * var12.field5318;

                        while(true) {
                           class31 var13 = (class31)var9.field3966.method906(49146);
                           if (var13 == null) {
                              if (var3 <= -111188266) {
                                 return;
                              }
                              break label64;
                           }

                           if (var13.field5319 * 1768239597 != -441234013 * var11.field9021 && var13.field5319 * 1768239597 != var11.field9019 * -909380271) {
                              var11.field9015 = -843548765 * var13.field5319;
                              var11.field9016 = var13.field5318 * -597974721;
                           }
                        }
                     }

                     if (var3 <= -111188266) {
                        return;
                     }
                  }

                  int var15 = class679.method4271(256 + (var1 << 9), 256 + (var2 << 9), var0, -859881334);
                  var11.method1515((float)(var1 << 265), (float)var15, (float)(var2 << 265));
                  var11.field9011 = 0;
                  var11.field3639 = (byte)var0;
                  var11.field3640 = (byte)var0;
                  if (Client.field2697.method5296(361928521).method3386(var1, var2, -1635198415)) {
                     var11.field3640 = (byte)(var11.field3640 + 1);
                  }

                  Client.field2697.method5317(-1611682495).method2447(var0, var1, var2, var15, var11, 1648403764);
               }
            }
         }

      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "he.jy(" + ')');
      }
   }

   public static final void method2226(class256 var0, boolean var1, boolean var2, int var3) {
      try {
         int var4 = var0.field8101 * -1617025021;
         int var5 = (int)(7051297995265073167L * var0.field641);
         var0.method545(-1460969981);
         if (var1) {
            class407.method5536(var4, -2042512871);
         }

         class702.method1967(var4, (byte)-97);
         class564 var6 = class449.method3756(var5, (byte)18);
         if (var6 != null) {
            class814.method2932(var6, 999173);
         }

         class341.method263(-1483926701);
         if (!var2 && Client.field2822 * -257444687 != -1) {
            class929.method6262(-257444687 * Client.field2822, 1, -80338519);
         }

         class521 var7 = new class521(Client.field2823);

         for(class256 var8 = (class256)var7.method2749(-2012602178); var8 != null; var8 = (class256)var7.next()) {
            if (!var8.method546(-629325116)) {
               var8 = (class256)var7.method2749(-2012602178);
               if (var8 == null) {
                  if (var3 == -113822480) {
                     ;
                  }
                  break;
               }
            }

            if (var8.field8100 * 27137839 == 3) {
               int var9 = (int)(7051297995265073167L * var8.field641);
               if (var9 >>> 16 == var4) {
                  method2226(var8, true, var2, -113822480);
               }
            }
         }

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "he.lw(" + ')');
      }
   }

   public static final void method2227(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         class454.field7231 = 446226445 * var0;
         class764.field4349 = var1 * 2019382975;
         class637.field9857 = var2 * 584728181;
         class665.field9598 = -759692387 * var3;
         class617.field8843 = -2064447825 * var4;
         if (class617.field8843 * 1179258959 >= 100) {
            int var6 = -589460992 * class454.field7231 + 256;
            int var7 = 1647476224 * class764.field4349 + 256;
            int var8 = class679.method4271(var6, var7, class899.field9552 * 1855729883, -1477224800) - class637.field9857 * 771695069;
            int var9 = var6 - class103.field205 * -1740717447;
            int var10 = var8 - class184.field5230 * 1449634147;
            int var11 = var7 - -299812095 * class7.field4918;
            int var12 = (int)Math.sqrt((double)(var11 * var11 + var9 * var9));
            Client.field2737 = ((int)(Math.atan2((double)var10, (double)var12) * 2607.5945876176133D) & 16383) * -648269561;
            class232.field8266 = ((int)(Math.atan2((double)var9, (double)var11) * -2607.5945876176133D) & 16383) * -1587695039;
            class791.field446 = 0;
            if (-104436553 * Client.field2737 < 1024) {
               Client.field2737 = 1891900416;
            }

            if (Client.field2737 * -104436553 > 3072) {
               Client.field2737 = 1380733952;
            }
         }

         class563.field1083 = 2090692627;
         class516.field4332 = -1001372047;
         class495.field8099 = 178575833;
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "he.hs(" + ')');
      }
   }

   public static short method2228(int var0, byte var1) {
      try {
         int var2 = var0 >> 10 & 63;
         int var3 = var0 >> 3 & 112;
         int var4 = var0 & 127;
         var3 = var4 <= 64 ? var3 * var4 >> 7 : var3 * (127 - var4) >> 7;
         int var5 = var3 + var4;
         int var6;
         if (var5 != 0) {
            var6 = (var3 << 8) / var5;
         } else {
            var6 = var3 << 1;
         }

         return (short)(var2 << 10 | var6 >> 4 << 7 | var5);
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "he.i(" + ')');
      }
   }

   public static String method2229(CharSequence var0, int var1) {
      try {
         return class618.method5163(var0, (class21)null, (byte)-6);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "he.p(" + ')');
      }
   }

   static final void method2230(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class274.method6596(var3, var4, var0, (byte)-37);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "he.dj(" + ')');
      }
   }

   static void method2231(int var0) {
      try {
         class371.method867(false, 1336561252);
         if (1265667685 * class740.field3200 >= 0 && 1265667685 * class740.field3200 != 0) {
            class337.method77(1265667685 * class740.field3200, false, 622850291);
            class740.field3200 = -485258093;
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "he.cs(" + ')');
      }
   }
}