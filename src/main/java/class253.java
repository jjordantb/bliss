import java.io.IOException;
import java.net.Socket;

public abstract class class253 {
   int field7968;
   String field7969;
   static int field7970;

   Socket method4477(int var1) throws IOException {
      try {
         return new Socket(this.field7969, 98195689 * this.field7968);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "tv.b(" + ')');
      }
   }

   public abstract Socket method4478(int var1) throws IOException;

   public abstract Socket method4479() throws IOException;

   static final void method4480(short var0) {
      try {
         class513 var1 = Client.field2692.field7768;

         for(int var2 = 0; var2 < Client.field2789 * -976358333; ++var2) {
            int var3 = Client.field2687[var2];
            class60 var4 = (class60)((class437) Client.field2677.method2942((long)var3)).field7515;
            int var5 = var1.method6371();
            if ((var5 & 2) != 0) {
               var5 += var1.method6371() << 8;
            }

            if ((var5 & '耀') != 0) {
               var5 += var1.method6371() << 16;
            }

            if ((var5 & 65536) != 0) {
               var5 += var1.method6371() << 24;
            }

            if ((var5 & 32) != 0) {
               var4.method1245(var1.method6379(68173648), 0, 0, 973412325);
            }

            if ((var5 & 16) != 0) {
               var4.field4054 = var1.method6403(1478539457) * 283914955;
               if (65535 == var4.field4054 * 1433412323) {
                  var4.field4054 = -283914955;
               }
            }

            if ((var5 & 524288) != 0) {
               var4.field4081 = var1.method6399(507762157);
               var4.field4072 = var1.method6399(-666954662);
               var4.field4073 = var1.method6398(-154305803);
               var4.field4094 = (byte)var1.method6395(-1014855659);
               var4.field4069 = (Client.field2866 * 443738891 + var1.method6403(1478539457)) * 1828453179;
               var4.field4070 = (Client.field2866 * 443738891 + var1.method6403(1478539457)) * -473408095;
            }

            if ((var5 & 128) != 0) {
               var4.field1626 = var1.method6402(-1091754982) * 1312461425;
               var4.field1627 = var1.method6403(1478539457) * 2139727009;
            }

            int var7;
            if ((var5 & 8) != 0) {
               int[] var6 = new int[class458.method3829((byte)-124).length];

               for(var7 = 0; var7 < class458.method3829((byte)-5).length; ++var7) {
                  var6[var7] = var1.method6423(1235052657);
               }

               var7 = var1.method6371();
               class488.method4740(var4, var6, var7, true, (byte)108);
            }

            if ((var5 & 512) != 0) {
               var4.field1631 = var1.method6401((byte)-68) * -312753929;
               if (-1317338937 * var4.field1631 == 65535) {
                  var4.field1631 = 312753929;
               }
            }

            int[] var8;
            int var9;
            int var10;
            int var11;
            int var17;
            int[] var18;
            if ((var5 & 8192) != 0) {
               var17 = var1.method6395(-1014855659);
               var18 = new int[var17];
               var8 = new int[var17];

               for(var9 = 0; var9 < var17; ++var9) {
                  var10 = var1.method6374();
                  if ((var10 & '쀀') == 49152) {
                     var11 = var1.method6401((byte)11);
                     var18[var9] = var10 << 16 | var11;
                  } else {
                     var18[var9] = var10;
                  }

                  var8[var9] = var1.method6374();
               }

               var4.method2579(var18, var8, 2082086484);
            }

            int var12;
            int var13;
            int var19;
            if ((var5 & 4) != 0) {
               var17 = var1.method6396((short)-3904);
               if (var17 > 0) {
                  for(var7 = 0; var7 < var17; ++var7) {
                     var19 = -1;
                     var9 = -1;
                     var10 = -1;
                     var11 = var1.method6382(1723054621);
                     if (var11 == 32767) {
                        var11 = var1.method6382(1723054621);
                        var9 = var1.method6382(1723054621);
                        var19 = var1.method6382(1723054621);
                        var10 = var1.method6382(1723054621);
                     } else if (32766 != var11) {
                        var9 = var1.method6382(1723054621);
                     } else {
                        var11 = -1;
                     }

                     var12 = var1.method6382(1723054621);
                     var13 = var1.method6395(-1014855659);
                     var4.method2548(var11, var9, var19, var10, Client.field2866 * 443738891, var12, var13, (byte)6);
                  }
               }
            }

            long var14;
            int[] var20;
            short[] var22;
            short[] var24;
            if ((var5 & 4096) != 0) {
               var17 = var4.field1637.field9865.length;
               var7 = 0;
               if (var4.field1637.field9870 != null) {
                  var7 = var4.field1637.field9870.length;
               }

               var19 = 0;
               if (var4.field1637.field9890 != null) {
                  var19 = var4.field1637.field9890.length;
               }

               var9 = var1.method6371();
               if (1 == (var9 & 1)) {
                  var4.field1628 = null;
               } else {
                  var20 = null;
                  if ((var9 & 2) == 2) {
                     var20 = new int[var17];

                     for(var11 = 0; var11 < var17; ++var11) {
                        var20[var11] = var1.method6423(1235052657);
                     }
                  }

                  var24 = null;
                  if (4 == (var9 & 4)) {
                     var24 = new short[var7];

                     for(var12 = 0; var12 < var7; ++var12) {
                        var24[var12] = (short)var1.method6374();
                     }
                  }

                  var22 = null;
                  if ((var9 & 8) == 8) {
                     var22 = new short[var19];

                     for(var13 = 0; var13 < var19; ++var13) {
                        var22[var13] = (short)var1.method6374();
                     }
                  }

                  var14 = (long)var3 | (long)((var4.field1629 += -230300471) * -156273287 - 1) << 32;
                  var4.field1628 = new class692(var14, var20, var24, var22);
               }
            }

            boolean var25;
            if ((var5 & 33554432) != 0) {
               var17 = var1.method6402(1014024931);
               var7 = var1.method6420((byte)-18);
               if (var17 == 65535) {
                  var17 = -1;
               }

               var19 = var1.method6395(-1014855659);
               var9 = var19 & 7;
               var10 = var19 >> 3 & 15;
               if (var10 == 15) {
                  var10 = -1;
               }

               var25 = (var19 >> 7 & 1) == 1;
               var4.method2546(var17, var7, var9, var10, var25, 3, 1962048388);
            }

            if ((var5 & 64) != 0) {
               var17 = var1.method6403(1478539457);
               var7 = var1.method6414(-416273786);
               if (var17 == 65535) {
                  var17 = -1;
               }

               var19 = var1.method6397((byte)76);
               var9 = var19 & 7;
               var10 = var19 >> 3 & 15;
               if (15 == var10) {
                  var10 = -1;
               }

               var25 = 1 == (var19 >> 7 & 1);
               var4.method2546(var17, var7, var9, var10, var25, 0, 2031478624);
            }

            if ((var5 & 256) != 0) {
               var17 = var1.method6402(1324789017);
               var7 = var1.method6409(-2017462427);
               if (65535 == var17) {
                  var17 = -1;
               }

               var19 = var1.method6396((short)-19864);
               var9 = var19 & 7;
               var10 = var19 >> 3 & 15;
               if (var10 == 15) {
                  var10 = -1;
               }

               var25 = 1 == (var19 >> 7 & 1);
               var4.method2546(var17, var7, var9, var10, var25, 1, -774185979);
            }

            if ((var5 & 16384) != 0) {
               var17 = var1.method6396((short)-15927);
               var18 = new int[var17];
               var8 = new int[var17];
               int[] var21 = new int[var17];

               for(var10 = 0; var10 < var17; ++var10) {
                  var11 = var1.method6423(1235052657);
                  var18[var10] = var11;
                  var8[var10] = var1.method6396((short)-8275);
                  var21[var10] = var1.method6401((byte)48);
               }

               class711.method2025(var4, var18, var8, var21, 1644064563);
            }

            if ((var5 & 1024) != 0) {
               var17 = var1.method6403(1478539457);
               var4.field4052 = var1.method6371() * 918505277;
               var4.field4060 = var1.method6397((byte)19) * -494980103;
               var4.field4083 = (var17 & '耀') != 0;
               var4.field4051 = (var17 & 32767) * -257621575;
               var4.field4050 = var4.field4052 * 1195117671 + Client.field2866 * 1208636921 + -1132907677 * var4.field4051;
            }

            if ((var5 & 1048576) != 0) {
               var4.field1634.method4031((byte)-105);
               var17 = var1.field10375[(var1.field10376 += 116413311) * 385051775 - 1] & 255;

               for(var7 = 0; var7 < var17; ++var7) {
                  var19 = var1.method6374();
                  var9 = var1.method6410((byte)67);
                  var4.field1634.method4029(var19, var9, 304714746);
               }
            }

            if ((var5 & 2048) != 0) {
               var4.field4062 = var1.method6399(1984951178) * 1925713613;
               var4.field4064 = var1.method6372(-12558881) * 516351707;
               var4.field4063 = var1.method6398(736826018) * 1712047767;
               var4.field4065 = var1.method6398(1643626542) * 2089924823;
               var4.field4059 = (var1.method6401((byte)-54) + 443738891 * Client.field2866) * 996079737;
               var4.field4067 = (var1.method6403(1478539457) + Client.field2866 * 443738891) * 1000906529;
               var4.field4068 = var1.method6402(-1999232161) * 1386670945;
               var4.field4062 += var4.field4085[0] * 1925713613;
               var4.field4064 += var4.field4055[0] * 516351707;
               var4.field4063 += var4.field4085[0] * 1712047767;
               var4.field4065 += var4.field4055[0] * 2089924823;
               var4.field4084 = -1013322787;
               var4.field4089 = 0;
            }

            if ((var5 & 4194304) != 0) {
               var17 = var1.field10375[(var1.field10376 += 116413311) * 385051775 - 1] & 255;

               for(var7 = 0; var7 < var17; ++var7) {
                  var19 = var1.method6396((short)-28984);
                  var9 = var1.method6420((byte)38);
                  var10 = var1.method6405((byte)8);
                  var4.method1244(var19, var9, var10, -783761378);
               }
            }

            if ((var5 & 16777216) != 0) {
               var17 = var1.method6403(1478539457);
               var7 = var1.method6420((byte)38);
               if (var17 == 65535) {
                  var17 = -1;
               }

               var19 = var1.method6397((byte)28);
               var9 = var19 & 7;
               var10 = var19 >> 3 & 15;
               if (15 == var10) {
                  var10 = -1;
               }

               var25 = 1 == (var19 >> 7 & 1);
               var4.method2546(var17, var7, var9, var10, var25, 2, -1163482569);
            }

            if ((var5 & 8388608) != 0) {
               var4.field1633 = var1.method6379(1858696307);
               if ("".equals(var4.field1633) || var4.field1633.equals(var4.field1637.field9863)) {
                  var4.field1633 = var4.field1637.field9863;
               }
            }

            if ((var5 & 131072) != 0) {
               var17 = var1.field10375[(var1.field10376 += 116413311) * 385051775 - 1] & 255;

               for(var7 = 0; var7 < var17; ++var7) {
                  var19 = var1.method6402(1053667933);
                  var9 = var1.method6420((byte)-33);
                  var4.field1634.method4029(var19, var9, 1573935280);
               }
            }

            if ((var5 & 2097152) != 0) {
               var17 = var4.field1637.field9866.length;
               var7 = 0;
               if (var4.field1637.field9870 != null) {
                  var7 = var4.field1637.field9870.length;
               }

               byte var23 = 0;
               if (var4.field1637.field9890 != null) {
                  var7 = var4.field1637.field9890.length;
               }

               var9 = var1.method6371();
               if ((var9 & 1) != 1) {
                  var20 = null;
                  if ((var9 & 2) == 2) {
                     var20 = new int[var17];

                     for(var11 = 0; var11 < var17; ++var11) {
                        var20[var11] = var1.method6423(1235052657);
                     }
                  }

                  var24 = null;
                  if ((var9 & 4) == 4) {
                     var24 = new short[var7];

                     for(var12 = 0; var12 < var7; ++var12) {
                        var24[var12] = (short)var1.method6403(1478539457);
                     }
                  }

                  var22 = null;
                  if (8 == (var9 & 8)) {
                     var22 = new short[var23];

                     for(var13 = 0; var13 < var23; ++var13) {
                        var22[var13] = (short)var1.method6401((byte)2);
                     }
                  }

                  var14 = (long)var3 | (long)((var4.field1630 += 55499771) * -1842219213 - 1) << 32;
                  new class692(var14, var20, var24, var22);
               }
            }

            if ((var5 & 262144) != 0) {
               var4.field1636 = var1.method6401((byte)16) * 933118661;
               if (var4.field1636 * 1817570317 == 65535) {
                  var4.field1636 = var4.field1637.field9885 * 1520279523;
               }
            }

            if ((var5 & 1) != 0) {
               if (var4.field1637.method6112((byte)32)) {
                  class153.method3396(var4, (byte)7);
               }

               var4.method1248(class258.field7913.method12(var1.method6423(1235052657), 384117949), 1598792788);
               var4.method2549(var4.field1637.field9923 * -2095128707, -2141370583);
               var4.field4079 = -1186616623 * (var4.field1637.field9917 * -1927065533 << 3);
               if (var4.field1637.method6112((byte)23)) {
                  class160.method3565(var4.field3639, var4.field4085[0], var4.field4055[0], 0, (class50)null, var4, (class946)null, (byte)68);
               }
            }
         }

      } catch (RuntimeException var16) {
         throw class158.method3445(var16, "tv.kd(" + ')');
      }
   }
}
