public class class600 {
   String field9208;
   String field9209;
   String field9210;

   class600(String var1, String var2, String var3) {
      this.field9209 = var1;
      this.field9210 = var2;
      this.field9208 = var3;
   }

   static void method5464(boolean var0, int var1) {
      try {
         if (class342.field281.length() != 0) {
            class213.method3810("--> " + class342.field281, 1401138202);
            class519.method2669(class342.field281, false, var0, 1788237828);
            class342.field285 = 0;
            if (!var0) {
               class342.field279 = 0;
               class342.field281 = "";
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ft.q(" + ')');
      }
   }

   static final void method5465(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class643.method6122(var3, var4, var0, (byte)-4);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ft.jf(" + ')');
      }
   }

   static final void method5466(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      try {
         if (class730.field2697.method5317(-1611682495) == null) {
            class593.field1623.method4833(var0, var1, var2, var3, -16777216, (byte)7);
         } else {
            class32 var6 = class923.local.method1511().field7637;
            boolean var7 = false;
            if (3 != class730.field2705) {
               if (!class730.field2706) {
                  var7 = true;
               }
            } else if ((int)var6.field5296 < 0 || (int)var6.field5296 >= class730.field2697.method5271(-2116251282) * 512 || (int)var6.field5299 < 0 || (int)var6.field5299 >= class730.field2697.method5272(978326552) * 512) {
               var7 = true;
            }

            if (var7) {
               class593.field1623.method4833(var0, var1, var2, var3, -16777216, (byte)7);
            } else {
               ++class730.field2758;
               if (class923.local != null && (int)var6.field5296 - (class923.local.method2550() - 1) * 256 >> 9 == class95.field601 && (int)var6.field5299 - (class923.local.method2550() - 1) * 256 >> 9 == class95.field593) {
                  class95.field601 = -1;
                  class95.field593 = -1;
                  class888.method5534(-1897244526);
               }

               class278.method6628((byte)35);
               if (!var4) {
                  class228.method4591((byte)-26);
               }

               class701.method1973(var0, var1, var2, var3, true, 646093136);
               var0 = class730.field2918;
               var1 = class730.field2728;
               var2 = class730.field2645;
               var3 = class730.field2921;
               class347.method210(var0, var1, (byte)-46);
               int var8;
               int var9;
               if (class563.field1083 == 4) {
                  var8 = (int)class730.field2738;
                  if (class730.field2745 >> 8 > var8) {
                     var8 = class730.field2745 >> 8;
                  }

                  if (class730.field2665[4] && class730.field2907[4] + 128 > var8) {
                     var8 = 128 + class730.field2907[4];
                  }

                  var9 = class730.field2725 + (int)class730.field2931 & 16383;
                  class299.method6557(class456.field7163, class679.method4271((int)var6.field5296, (int)var6.field5299, class899.field9552, -1979916029) - 200, class530.field3741, var8, var9, (var8 >> 3) * 3 + 600 << 2, var3, -1059521295);
               } else if (2 == class563.field1083) {
                  var8 = (int)class730.field2738;
                  if (class730.field2745 >> 8 > var8) {
                     var8 = class730.field2745 >> 8;
                  }

                  if (class730.field2665[4] && 128 + class730.field2907[4] > var8) {
                     var8 = 128 + class730.field2907[4];
                  }

                  var9 = (int)class730.field2931 & 16383;
                  class299.method6557(class456.field7163, class679.method4271(class730.field2734, class730.field2736, class899.field9552, -898849874) - 200, class530.field3741, var8, var9, 3 * (var8 >> 3) + 600 << 2, var3, -1059521295);
               } else if (5 == class563.field1083) {
                  class449.method3762(var3, (byte)0);
               }

               var8 = class103.field205;
               var9 = class184.field5230;
               int var10 = class7.field4918;
               int var11 = class730.field2737;
               int var12 = class232.field8266;

               int var14;
               for(int var13 = 0; var13 < 5; ++var13) {
                  if (class730.field2665[var13]) {
                     var14 = (int)(Math.random() * (double)(2 * class730.field2842[var13] + 1) - (double)class730.field2842[var13] + Math.sin((double)class730.field2771[var13] * ((double)class730.field2908[var13] / 100.0D)) * (double)class730.field2907[var13]);
                     if (var13 == 0) {
                        class103.field205 += var14 << 2;
                     }

                     if (var13 == 1) {
                        class184.field5230 += var14 << 2;
                     }

                     if (2 == var13) {
                        class7.field4918 += var14 << 2;
                     }

                     if (var13 == 3) {
                        class232.field8266 = var14 + class232.field8266 & 16383;
                     }

                     if (4 == var13) {
                        class730.field2737 += var14;
                        if (class730.field2737 < 1024) {
                           class730.field2737 = 1024;
                        } else if (class730.field2737 > 3072) {
                           class730.field2737 = 3072;
                        }
                     }
                  }
               }

               if (class103.field205 < 0) {
                  class103.field205 = 0;
               }

               if (class103.field205 > (class730.field2697.method5317(-1611682495).field3859 << 9) - 1) {
                  class103.field205 = (class730.field2697.method5317(-1611682495).field3859 << 9) - 1;
               }

               if (class7.field4918 < 0) {
                  class7.field4918 = 0;
               }

               if (class7.field4918 > (class730.field2697.method5317(-1611682495).field3894 << 9) - 1) {
                  class7.field4918 = (class730.field2697.method5317(-1611682495).field3894 << 9) - 1;
               }

               class113.method1408(332559800);
               class593.field1623.method5059(var0, var1, var2, var3);
               class593.field1623.method4986(var0, var1, var0 + var2, var1 + var3);
               class5 var17 = class730.field2697.method5282((byte)15).method5665((byte)-16);
               var14 = var17.method2954(-461488593);
               class730.field2853.method1016((float)(-class103.field205), (float)(-class184.field5230), (float)(-class7.field4918));
               class730.field2853.method1025(0.0F, -1.0F, 0.0F, class703.method2002(-class232.field8266 & 16383));
               class730.field2853.method1025(-1.0F, 0.0F, 0.0F, class703.method2002(-class730.field2737 & 16383));
               class730.field2853.method1025(0.0F, 0.0F, -1.0F, class703.method2002(-class791.field446 & 16383));
               class593.field1623.method4867(class730.field2853);
               class810.method2895(class730.field2639, true, (float)(var2 / 2), (float)(var3 / 2), (float)(class730.field2922 << 1), (float)(class730.field2922 << 1), var2, var3, 1807453020);
               class593.field1623.method5054(class730.field2639);
               if (var17.method2955((byte)-25) != null) {
                  class593.field1623.method5063(1.0F);
                  class593.field1623.method4872(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                  var17.method2955((byte)-99).method2361(class593.field1623, class78.field1501 << 3, var0, var1, var2, var3, class730.field2737, class232.field8266, class791.field446, var14, true, false, (byte)-49);
               } else {
                  class593.field1623.method4831(3, var14);
               }

               class395.method3398(class730.field2853, class730.field2639, var2, var3, -1854574289);
               class730.field2697.method5282((byte)-11).method5672(class730.field2697, -1036263435);
               byte var15 = class615.field8903.field9131.method5267(-2013953489) == 2 ? (byte)class730.field2758 : 1;
               class730.field2697.method5317(-1611682495).method2434(class730.field2866, class103.field205, class184.field5230, class7.field4918, class730.field2697.method5284(1646760373), class730.field2774, class730.field2651, class730.field2776, class730.field2622, class730.field2778, 1 + class923.local.field3639, var15, (int)var6.field5296 >> 9, (int)var6.field5299 >> 9, class615.field8903.field9121.method5590(2137164627) == 0, true, 0, true);
               ++class730.field2704;
               class341.method252(170542119);
               if (class730.field2733 == 0) {
                  class830.method5377(var0, var1, var2, var3, 256, 256, -16777216);
                  class175.method3052(var0, var1, var2, var3, 256, 256, (byte)46);
                  class447.method4317(var0, var1, var2, var3, 256, 256, 996259282);
                  class285.method6663(var0, var1, var2, var3, 373406666);
               }

               class730.field2697.method5317(-1611682495).method2404(843420871);
               class730.field2899 = false;
               class103.field205 = var8;
               class184.field5230 = var9;
               class7.field4918 = var10;
               class730.field2737 = var11;
               class232.field8266 = var12;
               if (class730.field2644 && class794.field541.method235(1533564172) == 0) {
                  class730.field2644 = false;
               }

               if (class730.field2644) {
                  class593.field1623.method4833(var0, var1, var2, var3, -16777216, (byte)7);
                  class971.method1789(class814.field4748.method2927(class321.field1066, -875414210), false, class593.field1623, class958.field3479, class378.field1158, (byte)34);
               }

               class810.method2895(class730.field2639, false, (float)(var2 / 2 + var0), (float)(var3 / 2 + var1), (float)(class730.field2922 << 1), (float)(class730.field2922 << 1), var2, var3, -725589740);
               class593.field1623.method5054(class730.field2639);
               class359.method1346(class730.field2639, -760797041);
            }
         }

      } catch (RuntimeException var16) {
         throw class158.method3445(var16, "ft.in(" + ')');
      }
   }

   static class230 method5467(int var0) {
      try {
         class230 var1;
         if (class602.field8663) {
            if (class948.field3290 != null && class909.field10396 != null) {
               var1 = class909.field10396;
            } else {
               var1 = class271.field10557;
            }
         } else {
            var1 = class271.field10557;
         }

         class602.field8634 = var1.field8225 + var1.field8230;
         return var1;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ft.n(" + ')');
      }
   }
}
