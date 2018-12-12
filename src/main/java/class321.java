public class class321 {
   static int field1033 = 14;
   static int field1034 = 1;
   static int field1035 = 2;
   int field1036;
   static int field1037 = 10;
   static int field1038 = 5;
   static int field1039 = 3;
   public static int field1040 = 0;
   static int field1041 = 4;
   static int field1042 = 11;
   int field1043;
   static int field1044 = 7;
   static int field1045 = 8;
   public class639 field1046;
   public static int field1047 = 31;
   static int field1048 = 3;
   static int field1049 = 12;
   static int field1050 = 13;
   static int field1051 = 16;
   static int field1052 = 15;
   static int field1053 = 9;
   public int field1054;
   static int field1055 = 2;
   boolean field1056;
   boolean field1057;
   static int field1058 = 6;
   short[] field1059;
   public int field1060;
   int field1061;
   int field1062;
   int field1063;
   static int field1064 = 5;
   static int field1065 = 4;
   public static class423 field1066;

   void method847(int var1) {
      try {
         switch(this.field1060) {
         case 2:
            this.field1043 = 1;
            this.field1036 = 0;
            this.field1061 = 2048;
            this.field1062 = 2048;
            break;
         case 3:
            this.field1043 = 1;
            this.field1036 = 0;
            this.field1061 = 2048;
            this.field1062 = 4096;
            break;
         case 4:
            this.field1043 = 4;
            this.field1036 = 0;
            this.field1061 = 2048;
            this.field1062 = 2048;
            break;
         case 5:
            this.field1043 = 4;
            this.field1036 = 0;
            this.field1061 = 2048;
            this.field1062 = 8192;
            break;
         case 6:
            this.field1043 = 3;
            this.field1036 = 1280;
            this.field1061 = 768;
            this.field1062 = 2048;
            break;
         case 7:
            this.field1043 = 3;
            this.field1036 = 1280;
            this.field1061 = 768;
            this.field1062 = 4096;
            break;
         case 8:
            this.field1043 = 3;
            this.field1036 = 1024;
            this.field1061 = 1024;
            this.field1062 = 2048;
            break;
         case 9:
            this.field1043 = 3;
            this.field1036 = 1024;
            this.field1061 = 1024;
            this.field1062 = 4096;
            break;
         case 10:
            this.field1043 = 3;
            this.field1036 = 1536;
            this.field1061 = 512;
            this.field1062 = 2048;
            break;
         case 11:
            this.field1043 = 3;
            this.field1036 = 1536;
            this.field1061 = 512;
            this.field1062 = 4096;
            break;
         case 12:
            this.field1043 = 2;
            this.field1036 = 0;
            this.field1061 = 2048;
            this.field1062 = 2048;
            break;
         case 13:
            this.field1043 = 2;
            this.field1036 = 0;
            this.field1061 = 2048;
            this.field1062 = 8192;
            break;
         case 14:
            this.field1043 = 1;
            this.field1036 = 1280;
            this.field1061 = 768;
            this.field1062 = 2048;
            break;
         case 15:
            this.field1043 = 1;
            this.field1036 = 1536;
            this.field1061 = 512;
            this.field1062 = 4096;
            break;
         case 16:
            this.field1043 = 1;
            this.field1036 = 1792;
            this.field1061 = 256;
            this.field1062 = 8192;
            break;
         default:
            this.field1036 = 0;
            this.field1043 = 0;
            this.field1061 = 2048;
            this.field1062 = 2048;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nj.b(" + ')');
      }
   }

   void method848(class848 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         this.field1046 = var1.method4877(var2, var3, var4, var5, var6, 1.0F);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "nj.a(" + ')');
      }
   }

   public void method849(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.field1043 = var1;
         this.field1036 = var4;
         this.field1061 = var3;
         this.field1062 = var2;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "nj.f(" + ')');
      }
   }

   void method850(int var1, boolean var2, byte var3) {
      try {
         int var5;
         if (!var2) {
            int var4 = this.field1063 + var1 * this.field1062 / 50 & 2047;
            switch(this.field1043) {
            case 1:
               var5 = 1024 + (class703.field3413[var4 << 3] >> 4);
               break;
            case 2:
               var5 = var4;
               break;
            case 3:
               var5 = class455.field7199[var4] >> 1;
               break;
            case 4:
               var5 = var4 >> 10 << 11;
               break;
            case 5:
               var5 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
               break;
            default:
               var5 = 2048;
            }
         } else {
            var5 = 2048;
         }

         this.field1046.method5903((float)((this.field1061 * var5 >> 11) + this.field1036) / 2048.0F, (byte)3);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "nj.p(" + ')');
      }
   }

   public class321(class848 var1, int var2, InputStream var3, int var4) {
      if (class455.field7199 == null) {
         class449.method3761((byte)0);
      }

      this.field1054 = var3.method6371();
      this.field1056 = (this.field1054 & 8) != 0;
      this.field1057 = (this.field1054 & 16) != 0;
      this.field1054 &= 7;
      int var5 = var3.method6374() << var4;
      int var6 = var3.method6374() << var4;
      int var7 = var3.method6374() << var4;
      int var8 = var3.method6371();
      int var9 = 1 + var8 * 2;
      this.field1059 = new short[var9];

      int var10;
      for(var10 = 0; var10 < this.field1059.length; ++var10) {
         short var11 = (short)var3.method6374();
         int var12 = var11 >>> 8;
         int var13 = var11 & 255;
         if (var12 >= var9) {
            var12 = var9 - 1;
         }

         if (var13 > var9 - var12) {
            var13 = var9 - var12;
         }

         this.field1059[var10] = (short)(var12 << 8 | var13);
      }

      var8 = (1 << var2 >> 1) + (var8 << var2);
      var10 = class134.field1398 != null ? class134.field1398[var3.method6374()] : class543.field3817[class526.method2228(var3.method6374(), (byte)0) & '\uffff'];
      int var14 = var3.method6371();
      this.field1060 = var14 & 31;
      this.field1063 = (var14 & 224) << 3;
      if (31 != this.field1060) {
         this.method847(567522459);
      }

      this.method848(var1, var5, var7, var6, var8, var10, -1201005825);
   }

   static final void method851(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (class730.field2785 != null && var2 < class556.field503) {
            var0.field3161[++var0.field3156 - 1] = class776.field3731[var2].field8117;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nj.wd(" + ')');
      }
   }

   static final void method852(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         class745.method2595(var2, 655510254);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nj.wm(" + ')');
      }
   }

   static final void method853(class744 var0, int var1) {
      try {
         var0.field3158 -= 2;
         String var2 = (String)var0.field3157[var0.field3158];
         String var3 = (String)var0.field3157[var0.field3158 + 1];
         var0.field3157[++var0.field3158 - 1] = var2 + var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "nj.zt(" + ')');
      }
   }

   static final void method854(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         var0.field3161[++var0.field3156 - 1] = class482.method4719(var2, var3, (byte)-125) ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "nj.afa(" + ')');
      }
   }

   static String method855(int var0, int var1, boolean var2, int var3) {
      try {
         if (var1 >= 2 && var1 <= 36) {
            if (var2 && var0 >= 0) {
               int var4 = 2;

               for(int var5 = var0 / var1; var5 != 0; ++var4) {
                  var5 /= var1;
               }

               char[] var6 = new char[var4];
               var6[0] = '+';

               for(int var7 = var4 - 1; var7 > 0; --var7) {
                  int var8 = var0;
                  var0 /= var1;
                  int var9 = var8 - var0 * var1;
                  if (var9 >= 10) {
                     var6[var7] = (char)(var9 + 87);
                  } else {
                     var6[var7] = (char)(var9 + 48);
                  }
               }

               return new String(var6);
            } else {
               return Integer.toString(var0, var1);
            }
         } else {
            throw new IllegalArgumentException("" + var1);
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "nj.x(" + ')');
      }
   }

   static final void method856(class744 var0, int var1) {
      try {
         if (class381.field1417.method1392(82, -596957727)) {
            var0.field3161[++var0.field3156 - 1] = 1;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nj.ady(" + ')');
      }
   }

   static final void method857(class564 var0, class131 var1, class744 var2, byte var3) {
      try {
         var2.field3156 -= 2;
         var0.field966 = var2.field3161[var2.field3156];
         var0.field977 = var2.field3161[1 + var2.field3156];
         class814.method2932(var0, 702048915);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nj.iy(" + ')');
      }
   }

   static final void method858(int var0, int var1, int var2, int var3, int var4) {
      try {
         if (var2 >= class381.field1414 && var2 <= class381.field1415) {
            var0 = class972.method1776(var0, class381.field1416, class381.field1413, -1212608691);
            var1 = class972.method1776(var1, class381.field1416, class381.field1413, -1212608691);
            class601.method5452(var0, var1, var2, var3, 181729650);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "nj.q(" + ')');
      }
   }

   public static void method859(int var0) {
      try {
         class117.method1344(1654985168);
         class341.method252(676003999);
         class870.method5883(-507349147);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "nj.k(" + ')');
      }
   }

   static void method860(int var0, byte var1) {
      try {
         if (20 == var0) {
            throw new Error();
         } else if (26 == var0) {
            throw new OutOfMemoryError();
         } else {
            try {
               if (var0 == 1) {
                  class792.method443(-200374470);
               } else if (var0 == 5) {
                  class213.method3810("" + class69.field1807, 1771664525);
               } else if (var0 == 24) {
                  class728 var2 = class730.field2697.method5317(-1611682495).field3857;
                  var2.field2459 = !var2.field2459;
               } else if (var0 == 8) {
                  class730.field2648 = true;
               } else if (27 == var0) {
                  class730.field2648 = false;
               } else if (var0 == 22) {
                  class730.field2631.method5208(355993737);
               } else {
                  int var3;
                  int var7;
                  Runtime var8;
                  if (16 == var0) {
                     class593.method1235(-851414705);

                     for(var7 = 0; var7 < 10; ++var7) {
                        System.gc();
                     }

                     var8 = Runtime.getRuntime();
                     var3 = (int)((var8.totalMemory() - var8.freeMemory()) / 1024L);
                     class213.method3810("" + var3, 1598262745);
                  } else if (10 == var0) {
                     class593.method1235(1839277481);

                     for(var7 = 0; var7 < 10; ++var7) {
                        System.gc();
                     }

                     var8 = Runtime.getRuntime();
                     var3 = (int)((var8.totalMemory() - var8.freeMemory()) / 1024L);
                     class213.method3810("" + var3, 840220855);
                     class984.method1884(-792495658);
                     class593.method1235(-1340221001);

                     for(int var4 = 0; var4 < 10; ++var4) {
                        System.gc();
                     }

                     var3 = (int)((var8.totalMemory() - var8.freeMemory()) / 1024L);
                     class213.method3810("" + var3, 1145170625);
                  } else if (15 == var0) {
                     class213.method3810(class606.field8572.method3929(-242181565) ? "Success" : "Failure", 1719326530);
                  } else if (2 == var0) {
                     class601.field9203.method2743(-89990065);
                  } else if (var0 == 14) {
                     class794.field541.method233((byte)-87);
                  } else if (13 == var0) {
                     class794.field541.method232((byte)0);
                  } else if (4 == var0) {
                     class837.field9161.setLocation(50, 50);
                  } else if (var0 == 25) {
                     class837.field9161.setLocation(class69.field1813, class69.field1814);
                  } else if (var0 == 23) {
                     Interactable.method2210((byte)-117);
                  } else if (21 == var0) {
                     class730.field2697.field8982 = class27.method3468((byte)1);
                     class730.field2697.field8945 = true;
                     Interactable.method2210((byte)-48);
                  } else {
                     class32 var9;
                     if (29 == var0) {
                        var9 = class923.local.method1511().field7637;
                        class213.method3810(((int)var9.field5296 >> 9) + " " + ((int)var9.field5299 >> 9), 2030018099);
                     } else if (var0 == 7) {
                        var9 = class923.local.method1511().field7637;
                        class213.method3810("" + class730.field2697.method5317(-1611682495).field3862[class923.local.field3639].method3888((int)var9.field5296 >> 9, (int)var9.field5299 >> 9, (byte)-102), 417961088);
                     } else if (var0 == 3) {
                        class213.method3810(class564.field860.method2982(-262201221) + " " + class564.field860.method2978(-480173906), 1301637250);
                        class213.method3810(class564.field863.method2982(509188014) + " " + class564.field863.method2978(2067697941), 1826870364);
                        class213.method3810(class85.field1121.field2336.method807() + " " + class85.field1121.field2336.method805(), 1449325870);
                     } else if (var0 == 6) {
                        class830.method5375(false, -1663847334);
                     } else if (var0 == 17) {
                        class730.field2649 = !class730.field2649;
                        class593.field1623.method4891(class730.field2649);
                        class876.method5875(-1727592457);
                     } else if (11 == var0) {
                        class730.field2795 = 0;
                        class730.field2697.method5309(72202504);
                     } else if (9 == var0) {
                        class730.field2795 = 1;
                        class730.field2697.method5309(418889356);
                     } else if (28 == var0) {
                        class730.field2795 = 2;
                        class730.field2697.method5309(989855246);
                     }
                  }
               }
            } catch (Exception var5) {
               class213.method3810(class814.field4656.method2927(field1066, -875414210), 1297300690);
            }

         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "nj.h(" + ')');
      }
   }
}
