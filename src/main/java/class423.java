import java.util.Locale;

public class class423 implements class331 {
   public static class423 field9583;
   public static class423 field9584;
   public static class423 field9585;
   public static class423 field9586;
   static class423 field9587;
   String field9588;
   int field9589;
   public static int field9590;
   public static class423 field9591;
   String field9592;
   Locale field9593;
   static class423[] field9594;

   static {
      field9583 = new class423("EN", "en", "English", class916.field10415, 0, "GB");
      field9584 = new class423("DE", "de", "German", class916.field10415, 1, "DE");
      field9585 = new class423("FR", "fr", "French", class916.field10415, 2, "FR");
      field9586 = new class423("PT", "pt", "Portuguese", class916.field10415, 3, "BR");
      field9587 = new class423("NL", "nl", "Dutch", class916.field10418, 4, "NL");
      field9590 = 6;
      field9591 = new class423("ES", "es", "Spanish", class916.field10418, 5, "ES");
      class423[] var0 = method5708(13792257);
      field9594 = new class423[var0.length];
      class423[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class423 var3 = var1[var2];
         if (field9594[-1719637847 * var3.field9589] != null) {
            throw new IllegalStateException();
         }

         field9594[-1719637847 * var3.field9589] = var3;
      }

   }

   public String method5705(int var1) {
      try {
         return this.field9588;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rt.b(" + ')');
      }
   }

   public static class423 method5706(int var0, int var1) {
      try {
         return var0 >= 0 && var0 < field9594.length ? field9594[var0] : null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rt.d(" + ')');
      }
   }

   class423(String var1, String var2, String var3, class916 var4, int var5, String var6) {
      this.field9592 = var1;
      this.field9588 = var2;
      this.field9589 = -501302375 * var5;
      Locale var7 = null;
      if (var6 != null) {
         var7 = new Locale(this.method5705(287861187), var6);
      }

      if (var7 != null) {
         this.field9593 = var7;
      } else {
         this.field9593 = new Locale(this.method5705(218016567));
      }

   }

   public String toString() {
      try {
         return this.method5705(-527740170).toLowerCase(Locale.ENGLISH);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "rt.toString(" + ')');
      }
   }

   public Locale method5707(int var1) {
      try {
         return this.field9593;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rt.p(" + ')');
      }
   }

   public int method89(int var1) {
      try {
         return this.field9589 * -1719637847;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rt.f(" + ')');
      }
   }

   public int method91() {
      return this.field9589 * -1719637847;
   }

   public static class423[] method5708(int var0) {
      try {
         return new class423[]{field9591, field9585, field9587, field9584, field9583, field9586};
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "rt.a(" + ')');
      }
   }

   static final void method5709(class744 var0, byte var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9113.method970((byte)103) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rt.ans(" + ')');
      }
   }

   static final void method5710(class564 var0, class744 var1, int var2) {
      try {
         if (Client.method1761(var0).method1737((byte)-12) && Client.field2633 == null) {
            class118.method1463(var0.field867 * -440872681, var0.field879 * -1309843523, 1723723267);
            Client.field2633 = class554.method427(-440872681 * var0.field867, var0.field879 * -1309843523, -156511736);
            class814.method2932(Client.field2633, 1608408687);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "rt.cl(" + ')');
      }
   }

   public int method90() {
      return this.field9589 * -1719637847;
   }

   static final void method5711(class744 var0, byte var1) {
      try {
         var0.field3156 -= -783761378;
         int var2 = var0.field3161[var0.field3156 * 681479919];
         int var3 = var0.field3161[681479919 * var0.field3156 + 1];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var2 - var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "rt.yp(" + ')');
      }
   }

   public static class684 method5712(short var0) {
      try {
         return class669.method4121(-1233866115 * Client.field2733, 1765230881) ? Client.field2674 : Client.field2692;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "rt.fc(" + ')');
      }
   }

   static final void method5713(class848 var0, class478 var1, byte var2) {
      try {
         if (class740.field7793 != null) {
            class27.method3468((byte)1);
            class27.method3468((byte)1);
            if (class740.field3198 * -1289394455 < 10) {
               if (!class740.field7823.method3282(class740.field7793.field13, -2140139718)) {
                  class740.field3198 = class792.field510.method3275(class740.field7793.field13, -1210672889) / 10 * 1078186329;
                  return;
               }

               class348.method192(16711935);
               class740.field3198 = -2103038598;
            }

            if (10 == class740.field3198 * -1289394455) {
               class740.field7820 = class740.field7793.field23 * 1364716801 >> 6 << 6;
               class740.field7813 = 1345239131 * class740.field7793.field22 >> 6 << 6;
               class740.field7814 = (class740.field7793.field20 * -2052483955 >> 6 << 6) - class740.field7820 + 64;
               class740.field7815 = 64 + ((class740.field7793.field19 * 929385381 >> 6 << 6) - class740.field7813);
               int[] var3 = new int[3];
               int var4 = -1;
               int var5 = -1;
               class32 var6 = class923.field10295.method1511().field7637;
               class389 var7 = Client.field2697.method5270(681479919);
               if (class740.field7793.method7(class923.field10295.field3639, ((int)var6.field5296 >> 9) + -1760580017 * var7.field1521, 283514611 * var7.field1522 + ((int)var6.field5299 >> 9), var3, 46106083)) {
                  var4 = var3[1] - class740.field7820;
                  var5 = var3[2] - class740.field7813;
               }

               if (!class740.field3205 && var4 >= 0 && var4 < class740.field7814 && var5 >= 0 && var5 < class740.field7815) {
                  var4 += (int)(Math.random() * 10.0D) - 5;
                  var5 += (int)(Math.random() * 10.0D) - 5;
                  class896.field9358 = var4 * -2076584633;
                  class747.field4148 = -435591305 * var5;
               } else if (1646852571 * class740.field3203 != -1 && -1 != class740.field3197 * 679054909) {
                  class740.field7793.method6(1646852571 * class740.field3203, class740.field3197 * 679054909, var3, -1594439812);
                  if (var3 != null) {
                     class896.field9358 = -2076584633 * (var3[1] - class740.field7820);
                     class747.field4148 = (var3[2] - class740.field7813) * -435591305;
                  }

                  class740.field3197 = 1505298155;
                  class740.field3203 = 1801430445;
                  class740.field3205 = false;
               } else {
                  class740.field7793.method6(class740.field7793.field17 * -1973484731 >> 14 & 16383, -1973484731 * class740.field7793.field17 & 16383, var3, -1810513482);
                  class896.field9358 = (var3[1] - class740.field7820) * -2076584633;
                  class747.field4148 = (var3[2] - class740.field7813) * -435591305;
               }

               if (1110271707 * class740.field7793.field18 == 37) {
                  class740.field7808 = 3.0F;
                  class740.field7809 = 3.0F;
               } else if (class740.field7793.field18 * 1110271707 == 50) {
                  class740.field7808 = 4.0F;
                  class740.field7809 = 4.0F;
               } else if (class740.field7793.field18 * 1110271707 == 75) {
                  class740.field7808 = 6.0F;
                  class740.field7809 = 6.0F;
               } else if (1110271707 * class740.field7793.field18 == 100) {
                  class740.field7808 = 8.0F;
                  class740.field7809 = 8.0F;
               } else if (1110271707 * class740.field7793.field18 == 200) {
                  class740.field7808 = 16.0F;
                  class740.field7809 = 16.0F;
               } else {
                  class740.field7808 = 8.0F;
                  class740.field7809 = 8.0F;
               }

               class740.field7829 = (int)class740.field7808 >> 1;
               class740.field7804 = class470.method4592(class740.field7829, 51229796);
               class640.method6191(65536);
               class740.method4413();
               class439.field7537 = new class373();
               class740.field7802 += (int)(Math.random() * 5.0D) - 2;
               if (class740.field7802 < -8) {
                  class740.field7802 = -8;
               }

               if (class740.field7802 > 8) {
                  class740.field7802 = 8;
               }

               class740.field7803 += (int)(Math.random() * 5.0D) - 2;
               if (class740.field7803 < -16) {
                  class740.field7803 = -16;
               }

               if (class740.field7803 > 16) {
                  class740.field7803 = 16;
               }

               class740.method4414(var1, class740.field7802 >> 2 << 10, class740.field7803 >> 1);
               class740.field7826.method5094(1024, 256, 303697513);
               class740.field7800.method2004(256, 256, -1144646938);
               class740.field7795.method4709(4096, (byte)82);
               class905.field10369.method5456(256, (byte)85);
               class740.field3198 = 88890100;
            } else if (20 == class740.field3198 * -1289394455) {
               class16.method3681(true, 1135939269);
               class740.method4406(var0, class740.field7802, class740.field7803);
               class740.field3198 = 266670300;
               class16.method3681(true, -167716120);
               class147.method1138(1781088902);
            } else if (60 == -1289394455 * class740.field3198) {
               if (class740.field7823.method3265(class740.field7793.field13 + "_staticelements", -400372089)) {
                  if (!class740.field7823.method3282(class740.field7793.field13 + "_staticelements", -2145213052)) {
                     return;
                  }

                  class740.field7810 = class229.method4579(class740.field7823, class740.field7793.field13 + "_staticelements", Client.field2759, 565671699);
               } else {
                  class740.field7810 = new class64(0);
               }

               class740.method4404();
               class740.field3198 = -1836368298;
               class16.method3681(true, -425949519);
               class147.method1138(1992969478);
            } else if (70 == -1289394455 * class740.field3198) {
               class733.field2976 = new class219(var0, 11, true, class837.field9161);
               class740.field3198 = 1398190689;
               class16.method3681(true, 2032737613);
               class147.method1138(1735117784);
            } else if (class740.field3198 * -1289394455 == 73) {
               class213.field7198 = new class219(var0, 12, true, class837.field9161);
               class740.field3198 = 337782380;
               class16.method3681(true, -1803108343);
               class147.method1138(1554661852);
            } else if (76 == class740.field3198 * -1289394455) {
               class783.field3964 = new class219(var0, 14, true, class837.field9161);
               class740.field3198 = -722625929;
               class16.method3681(true, 116445632);
               class147.method1138(2075393869);
            } else if (79 == -1289394455 * class740.field3198) {
               class538.field3763 = new class219(var0, 17, true, class837.field9161);
               class740.field3198 = -1783034238;
               class16.method3681(true, 325987584);
               class147.method1138(1544627507);
            } else if (class740.field3198 * -1289394455 == 82) {
               class858.field8899 = new class219(var0, 19, true, class837.field9161);
               class740.field3198 = 1451524749;
               class16.method3681(true, -828062204);
               class147.method1138(1642218574);
            } else if (class740.field3198 * -1289394455 == 85) {
               class878.field9820 = new class219(var0, 22, true, class837.field9161);
               class740.field3198 = 391116440;
               class16.method3681(true, -315961699);
               class147.method1138(1825490798);
            } else if (88 == -1289394455 * class740.field3198) {
               class76.field1466 = new class219(var0, 26, true, class837.field9161);
               class740.field3198 = -669291869;
               class16.method3681(true, 1357229880);
               class147.method1138(1747834568);
            } else {
               class569.field26 = new class219(var0, 30, true, class837.field9161);
               class740.field3198 = 444450500;
               class16.method3681(true, 1961372940);
               class147.method1138(1885514262);
               System.gc();
            }
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "rt.bq(" + ')');
      }
   }
}
