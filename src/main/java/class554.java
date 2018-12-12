import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class class554 implements Runnable {
   volatile boolean field479;
   class600[] field480;
   Thread field481;

   class600 method421(int var1, int var2) {
      try {
         return this.field480 != null && var1 >= 0 && var1 < this.field480.length ? this.field480[var1] : null;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "fr.a(" + ')');
      }
   }

   boolean method422(int var1) {
      try {
         if (this.field479) {
            return true;
         } else {
            if (this.field481 == null) {
               this.field481 = new Thread(this);
               this.field481.start();
            }

            return this.field479;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fr.f(" + ')');
      }
   }

   public void run() {
      try {
         try {
            int var1 = class916.field10415 == class721.field3634 ? 80 : class601.field9200.field4347 + 7000;
            BufferedReader var2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + class601.field9200.field4343 + ":" + var1 + "/news.ws?game=" + class730.field2926.field7327)).openStream())));
            String var3 = var2.readLine();

            ArrayList var4;
            for(var4 = new ArrayList(); var3 != null; var3 = var2.readLine()) {
               var4.add(var3);
            }

            String[] var5 = new String[var4.size()];
            var4.toArray(var5);
            if (var5.length % 3 != 0) {
               return;
            }

            this.field480 = new class600[var5.length / 3];

            for(int var6 = 0; var6 < var5.length; var6 += 3) {
               this.field480[var6 / 3] = new class600(var5[var6], var5[var6 + 1], var5[2 + var6]);
            }
         } catch (IOException var7) {
            ;
         }

         this.field479 = true;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "fr.run(" + ')');
      }
   }

   public static class660 method423(int var0, int var1) {
      try {
         class660 var2 = (class660)class660.field9639.method2974((long)var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class923.field10294.method3285(1, var0, (byte)-28);
            var2 = new class660();
            var2.field9640 = var0;
            if (var3 != null) {
               var2.method5744(new InputStream(var3), 1143811540);
            }

            var2.method5746(-1168443566);
            if (2 == var2.field9650 && class660.field9638.method2942((long)var0) == null) {
               class660.field9638.method2947(new class722(class660.field9642), (long)var0);
               class660.field9636[++class660.field9642 - 1] = var2;
            }

            class660.field9639.method2984(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "fr.f(" + ')');
      }
   }

   static void method424(Npc var0, boolean var1, byte var2) {
      try {
         if (class602.field8673 < 410) {
            NpcDefinition var3 = var0.field1637;
            String var4 = var0.field1633;
            if (var3.field9924 != null) {
               var3 = var3.method6110(class827.field9037, 1662486316);
               if (var3 == null) {
                  return;
               }

               var4 = var3.name;
            }

            if (var3.field9899) {
               if (var0.field1636 != 0) {
                  String var5 = class730.field2926 == class469.field7320 ? class814.field4802.method2927(class321.field1066, -875414210) : class814.field4785.method2927(class321.field1066, -875414210);
                  if (var0.field1636 <= 0) {
                     var4 = var4 + class637.method5935(var0.field1636, class923.local.field3385, (byte)4);
                  } else {
                     var4 = var4 + class637.method5935(var0.field1636, class923.local.field3385, (byte)4) + class822.field9046 + var5 + var0.field1636 + class822.field9049;
                  }
               }

               if (class730.field2817 && !var1) {
                  class785 var11 = class354.field2139 != -1 ? class452.field7216.method5148(class354.field2139, 1875400558) : null;
                  if ((class568.field645 & 2) != 0 && (var11 == null || var3.method6109(class354.field2139, var11.field3822, (byte)47) != var11.field3822)) {
                     class984.method1875(class730.field2820, class730.field2735 + " " + class822.field9048 + " " + class56.method1545(16776960, -2021390481) + var4, class175.field5075, 8, -1, (long)var0.field4028, 0, 0, true, false, (long)var0.field4028, false, -1507413924);
                  }
               }

               if (!var1) {
                  String[] var12 = var3.field9878;
                  if (class730.field2904) {
                     var12 = class2.method2971(var12, -1228297238);
                  }

                  if (var12 != null) {
                     int var6;
                     short var7;
                     for(var6 = var12.length - 1; var6 >= 0; --var6) {
                        if (var12[var6] != null && (var3.field9894 == 0 || !var12[var6].equalsIgnoreCase(class814.field4780.method2927(class321.field1066, -875414210)) && !var12[var6].equalsIgnoreCase(class814.field4779.method2927(class321.field1066, -875414210)))) {
                           var7 = 0;
                           int var8 = class730.field2671;
                           if (var6 == 0) {
                              var7 = 9;
                           }

                           if (var6 == 1) {
                              var7 = 10;
                           }

                           if (var6 == 2) {
                              var7 = 11;
                           }

                           if (3 == var6) {
                              var7 = 12;
                           }

                           if (var6 == 4) {
                              var7 = 13;
                           }

                           if (var6 == 5) {
                              var7 = 1003;
                           }

                           if (var3.field9881 == var6) {
                              var8 = var3.field9864;
                           }

                           if (var6 == var3.field9882) {
                              var8 = var3.field9880;
                           }

                           class984.method1875(var12[var6], class56.method1545(16776960, -1768803512) + var4, var12[var6].equalsIgnoreCase(class814.field4780.method2927(class321.field1066, -875414210)) ? var3.field9883 * 1737724111 * 1183282735 : var8, var7, -1, (long)var0.field4028, 0, 0, true, false, (long)var0.field4028, false, -1881687525);
                        }
                     }

                     if (var3.field9894 == 1) {
                        for(var6 = 0; var6 < var12.length; ++var6) {
                           if (var12[var6] != null && (var12[var6].equalsIgnoreCase(class814.field4780.method2927(class321.field1066, -875414210)) || var12[var6].equalsIgnoreCase(class814.field4779.method2927(class321.field1066, -875414210)))) {
                              var7 = 0;
                              if (!class923.local.field3403 && !var0.field1633.equalsIgnoreCase("Chicken God") && !var0.field1633.equalsIgnoreCase("WildyWyrm") && var0.field1636 > class923.local.field3385) {
                                 var7 = 2000;
                              }

                              short var13 = 0;
                              int var9 = class730.field2671;
                              if (var6 == 0) {
                                 var13 = 9;
                              }

                              if (1 == var6) {
                                 var13 = 10;
                              }

                              if (2 == var6) {
                                 var13 = 11;
                              }

                              if (3 == var6) {
                                 var13 = 12;
                              }

                              if (var6 == 4) {
                                 var13 = 13;
                              }

                              if (5 == var6) {
                                 var13 = 1003;
                              }

                              if (var13 != 0) {
                                 var13 += var7;
                              }

                              if (var6 == var3.field9881) {
                                 var9 = var3.field9864;
                              }

                              if (var3.field9882 == var6) {
                                 var9 = var3.field9880;
                              }

                              class984.method1875(var12[var6], class56.method1545(16776960, -1391055346) + var4, var12[var6].equalsIgnoreCase(class814.field4780.method2927(class321.field1066, -875414210)) ? var3.field9883 * 1737724111 * 1183282735 : var9, var13, -1, (long)var0.field4028, 0, 0, true, false, (long)var0.field4028, false, -1360691095);
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "fr.bw(" + ')');
      }
   }

   static final void method425(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (var2 < 0 || var2 > 1) {
            var2 = 0;
         }

         class729.method1700(var2 == 1, -1375344490);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fr.ail(" + ')');
      }
   }

   public static byte[] method426(String var0, byte var1) {
      try {
         int var2 = var0.length();
         if (var2 == 0) {
            return new byte[0];
         } else {
            int var3 = 3 + var2 & -4;
            int var4 = var3 / 4 * 3;
            if (var3 - 2 < var2 && class78.method1123(var0.charAt(var3 - 2), 1186467127) != -1) {
               if (var3 - 1 >= var2 || class78.method1123(var0.charAt(var3 - 1), 1292628022) == -1) {
                  --var4;
               }
            } else {
               var4 -= 2;
            }

            byte[] var5 = new byte[var4];
            class59.method1621(var0, var5, 0, (byte)-114);
            return var5;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "fr.b(" + ')');
      }
   }

   public static class564 method427(int var0, int var1, int var2) {
      try {
         class564 var3 = class449.method3756(var0, (byte)-11);
         if (-1 == var1) {
            return var3;
         } else {
            return var3 != null && var3.field1017 != null && var1 < var3.field1017.length ? var3.field1017[var1] : null;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "fr.p(" + ')');
      }
   }

   static final boolean method428(class240 var0, int var1, int var2, byte var3) {
      try {
         ObjectDefinition var4 = var0.method4713(var1);
         if (11 == var2) {
            var2 = 10;
         }

         if (var2 >= 5 && var2 <= 8) {
            var2 = 4;
         }

         return var4.method1481(var2, (byte)91);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fr.ct(" + ')');
      }
   }

   public static void method429(int var0, int var1) {
      try {
         if (var0 != -1 && !class866.field9767[var0]) {
            class91.field562.method3267(var0, -692047844);
            class382.field1410[var0] = null;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fr.d(" + ')');
      }
   }
}
