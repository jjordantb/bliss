import java.awt.datatransfer.Clipboard;

public class class397 extends class676 implements class265 {
   class719 field6489;
   public class309 field6490;
   boolean field6491;
   static int[] field6492 = new int[]{1, 2, 4, 8};
   static int[] field6493 = new int[]{16, 32, 64, 128};
   boolean field6494 = true;
   static class348 field6495;
   public static Clipboard field6496;

   class192 method2177(class848 var1) {
      class879 var2 = this.field6490.method351(var1, 2048, false, true, (byte)90);
      if (var2 == null) {
         return null;
      } else {
         class135 var3 = this.method1521();
         class446 var4 = this.method1511();
         class192 var5 = class221.method4033(this.field6491, 1239765065);
         int var6 = (int)var4.field7637.field5296 >> 9;
         int var7 = (int)var4.field7637.field5299 >> 9;
         this.field6490.method352(var1, var2, var3, var6, var6, var7, var7, true, -1223011244);
         var2.method5965(var3, this.field3642[0], 0);
         if (this.field6490.field388 != null) {
            class874 var8 = this.field6490.field388.method1729();
            var1.method4866(var8);
         }

         this.field6494 = var2.method5989() || this.field6490.field388 != null;
         if (this.field6489 == null) {
            this.field6489 = class905.method6344((int)var4.field7637.field5296, (int)var4.field7637.field5300, (int)var4.field7637.field5299, var2, 2146599220);
         } else {
            class364.method1613(this.field6489, (int)var4.field7637.field5296, (int)var4.field7637.field5300, (int)var4.field7637.field5299, var2, (byte)1);
         }

         return var5;
      }
   }

   public void method4552(class848 var1, int var2) {
      try {
         this.field6490.method353(var1, 889648408);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "wr.k(" + ')');
      }
   }

   boolean method2183(short var1) {
      try {
         return this.field6494;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wr.be(" + ')');
      }
   }

   public class719 method2165(class848 var1, byte var2) {
      try {
         return this.field6489;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "wr.bc(" + ')');
      }
   }

   public int method2168(int var1) {
      try {
         return this.field6490.method356(945802681);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wr.bm(" + ')');
      }
   }

   public void method4559(class848 var1) {
      this.field6490.method358(var1, -475225909);
   }

   public void method3472(class552 var1, int var2) {
      try {
         this.field6490.method349(var1, 502075834);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "wr.bl(" + ')');
      }
   }

   class192 method2201(class848 var1, int var2) {
      try {
         class879 var3 = this.field6490.method351(var1, 2048, false, true, (byte)-12);
         if (var3 == null) {
            return null;
         } else {
            class135 var4 = this.method1521();
            class446 var5 = this.method1511();
            class192 var6 = class221.method4033(this.field6491, 1511204499);
            int var7 = (int)var5.field7637.field5296 >> 9;
            int var8 = (int)var5.field7637.field5299 >> 9;
            this.field6490.method352(var1, var3, var4, var7, var7, var8, var8, true, 327958726);
            var3.method5965(var4, this.field3642[0], 0);
            if (this.field6490.field388 != null) {
               class874 var9 = this.field6490.field388.method1729();
               var1.method4866(var9);
            }

            this.field6494 = var3.method5989() || this.field6490.field388 != null;
            if (this.field6489 == null) {
               this.field6489 = class905.method6344((int)var5.field7637.field5296, (int)var5.field7637.field5300, (int)var5.field7637.field5299, var3, 1999876467);
            } else {
               class364.method1613(this.field6489, (int)var5.field7637.field5296, (int)var5.field7637.field5300, (int)var5.field7637.field5299, var3, (byte)127);
            }

            return var6;
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "wr.bo(" + ')');
      }
   }

   void method2164(class848 var1, int var2) {
      try {
         class879 var3 = this.field6490.method351(var1, 262144, true, true, (byte)-57);
         if (var3 != null) {
            class135 var4 = this.method1521();
            class446 var5 = this.method1511();
            int var6 = (int)var5.field7637.field5296 >> 9;
            int var7 = (int)var5.field7637.field5299 >> 9;
            this.field6490.method352(var1, var3, var4, var6, var6, var7, var7, false, -2048622161);
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "wr.bb(" + ')');
      }
   }

   void method2178(class848 var1) {
      class879 var2 = this.field6490.method351(var1, 262144, true, true, (byte)-72);
      if (var2 != null) {
         class135 var3 = this.method1521();
         class446 var4 = this.method1511();
         int var5 = (int)var4.field7637.field5296 >> 9;
         int var6 = (int)var4.field7637.field5299 >> 9;
         this.field6490.method352(var1, var2, var3, var5, var5, var6, var6, false, -1344370284);
      }

   }

   public int method4555() {
      return -1598457753 * this.field6490.field375;
   }

   final void method2162(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "wr.bk(" + ')');
      }
   }

   boolean method2159(class848 var1, int var2, int var3) {
      class879 var4 = this.field6490.method351(var1, 131072, false, false, (byte)94);
      return var4 == null ? false : var4.method6097(var2, var3, this.method1521(), false, 0);
   }

   public int method2170(byte var1) {
      try {
         return this.field6490.method350(2122093474);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wr.bx(" + ')');
      }
   }

   public int method4548(int var1) {
      try {
         return -1598457753 * this.field6490.field375;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wr.f(" + ')');
      }
   }

   public int method4549(short var1) {
      try {
         return 748228569 * this.field6490.field376;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wr.b(" + ')');
      }
   }

   public void method4550(byte var1) {
   }

   public boolean method4558(int var1) {
      try {
         return this.field6490.method357(-1088806112);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wr.i(" + ')');
      }
   }

   public int method4554() {
      return -1598457753 * this.field6490.field375;
   }

   public void method4556(class848 var1, int var2) {
      try {
         this.field6490.method358(var1, -475225909);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "wr.d(" + ')');
      }
   }

   public int method4564() {
      return this.field6490.field387 * 1686561661;
   }

   boolean method2156() {
      return this.field6494;
   }

   final boolean method2207() {
      return false;
   }

   public int method4561() {
      return 748228569 * this.field6490.field376;
   }

   public int method4557() {
      return 748228569 * this.field6490.field376;
   }

   public void method4553() {
   }

   boolean method2206(byte var1) {
      return false;
   }

   final boolean method2173(int var1) {
      return false;
   }

   public void method4562(class848 var1) {
      this.field6490.method358(var1, -475225909);
   }

   final void method2184() {
      throw new IllegalStateException();
   }

   public boolean method4560() {
      return this.field6490.method357(-1547751108);
   }

   boolean method2160() {
      return false;
   }

   boolean method2172() {
      return false;
   }

   boolean method2181() {
      return false;
   }

   public class719 method2174(class848 var1) {
      return this.field6489;
   }

   void method2180(class848 var1) {
      class879 var2 = this.field6490.method351(var1, 262144, true, true, (byte)47);
      if (var2 != null) {
         class135 var3 = this.method1521();
         class446 var4 = this.method1511();
         int var5 = (int)var4.field7637.field5296 >> 9;
         int var6 = (int)var4.field7637.field5299 >> 9;
         this.field6490.method352(var1, var2, var3, var5, var5, var6, var6, false, 428224872);
      }

   }

   public int method3473() {
      return this.field6490.method350(2124766078);
   }

   public int method3474() {
      return this.field6490.method350(2101700797);
   }

   boolean method2190() {
      return this.field6494;
   }

   public class397(class545 var1, class848 var2, class240 var3, class50 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13) {
      super(var1, var7, var8, var9, var5, var6, class858.method5221(var11, var12, (byte)-51));
      this.field6490 = new class309(var2, var3, var4, var11, var12, this.field3639, var6, this, var10, var13);
      this.field6491 = 1532834983 * var4.field2214 != 0 && !var10;
      this.method2169(1, 1122698828);
   }

   public void method4547(class848 var1) {
      this.field6490.method353(var1, 1649698074);
   }

   boolean method2179(class848 var1, int var2, int var3) {
      class879 var4 = this.field6490.method351(var1, 131072, false, false, (byte)27);
      return var4 == null ? false : var4.method6097(var2, var3, this.method1521(), false, 0);
   }

   public int method4551(byte var1) {
      try {
         return this.field6490.field387 * 1686561661;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wr.a(" + ')');
      }
   }

   final void method2182(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   final void method2195(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   public void method4563(class848 var1) {
      this.field6490.method358(var1, -475225909);
   }

   final void method2185() {
      throw new IllegalStateException();
   }

   public int method2186() {
      return this.field6490.method356(1082725147);
   }

   public int method2187() {
      return this.field6490.method356(864713404);
   }

   public int method2188() {
      return this.field6490.method356(642665450);
   }

   boolean method2176() {
      return this.field6494;
   }

   boolean method2189() {
      return this.field6494;
   }

   boolean method2157(class848 var1, int var2, int var3, byte var4) {
      try {
         class879 var5 = this.field6490.method351(var1, 131072, false, false, (byte)30);
         return var5 == null ? false : var5.method6097(var2, var3, this.method1521(), false, 0);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "wr.bu(" + ')');
      }
   }

   public class719 method2175(class848 var1) {
      return this.field6489;
   }

   boolean method2158() {
      return this.field6494;
   }

   final boolean method2191() {
      return false;
   }

   final void method2205(byte var1) {
      try {
         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wr.bq(" + ')');
      }
   }

   final boolean method2193() {
      return false;
   }

   final boolean method2194() {
      return false;
   }

   boolean method2192(class848 var1, int var2, int var3) {
      class879 var4 = this.field6490.method351(var1, 131072, false, false, (byte)23);
      return var4 == null ? false : var4.method6097(var2, var3, this.method1521(), false, 0);
   }

   public static void method3475(int var0, String var1, boolean var2, short var3) {
      try {
         if (var0 == 0) {
            class593.field1623 = class317.method474(0, class837.field9161, class962.field3627, class776.field3729, class615.field8903.field9116.method1098(-497177413) * 2, -659449737);
            if (var1 != null) {
               class593.field1623.method4831(1, 0);
               class230 var15 = class398.method3539(class526.field3666, class295.field10469 * 1178461027, 0, (byte)84);
               class727 var17 = class593.field1623.method4936(var15, class922.method6248(class562.field827, 1178461027 * class295.field10469, 0), true);
               class646.method5504((byte)42);
               class971.method1789(var1, true, class593.field1623, var17, var15, (byte)-38);
            }
         } else {
            label126: {
               class848 var4 = null;
               class230 var5;
               class727 var6;
               if (var1 != null) {
                  var4 = class317.method474(0, class837.field9161, class962.field3627, class776.field3729, 0, -199455021);
                  var4.method4831(1, 0);
                  var5 = class398.method3539(class526.field3666, class295.field10469 * 1178461027, 0, (byte)29);
                  var6 = var4.method4936(var5, class922.method6248(class562.field827, class295.field10469 * 1178461027, 0), true);
                  class646.method5504((byte)9);
                  class971.method1789(var1, true, var4, var6, var5, (byte)53);
               }

               try {
                  label115: {
                     try {
                        class593.field1623 = class317.method474(var0, class837.field9161, class962.field3627, class776.field3729, class615.field8903.field9116.method1098(-1644099824) * 2, 1353555803);
                        if (var1 != null) {
                           var4.method4831(1, 0);
                           var5 = class398.method3539(class526.field3666, class295.field10469 * 1178461027, 0, (byte)32);
                           var6 = var4.method4936(var5, class922.method6248(class562.field827, class295.field10469 * 1178461027, 0), true);
                           class646.method5504((byte)0);
                           class971.method1789(var1, true, var4, var6, var5, (byte)-21);
                        }

                        if (class593.field1623.method4814()) {
                           boolean var14 = true;

                           try {
                              var14 = class86.field1134.field3064 * 399637415 > 256;
                           } catch (Throwable var10) {
                              ;
                           }

                           class792 var18;
                           if (var14) {
                              var18 = class593.field1623.method4849(146800640);
                           } else {
                              var18 = class593.field1623.method4849(104857600);
                           }

                           class593.field1623.method4850(var18);
                        }
                     } catch (Throwable var11) {
                        int var16 = class615.field8903.field9137.method3689(-1530002941);
                        if (var16 == 2) {
                           Client.field2643 = true;
                        }

                        class615.field8903.method5391(class615.field8903.field9137, 0, -1712068885);
                        method3475(var16, var1, var2, (short)256);
                        break label115;
                     }

                     if (var4 != null) {
                        try {
                           var4.method4996(1031621435);
                        } catch (Throwable var9) {
                           ;
                        }
                     }
                     break label126;
                  }
               } catch (RuntimeException var12) {
                  if (var4 != null) {
                     try {
                        var4.method4996(1902974655);
                     } catch (Throwable var8) {
                        ;
                     }
                  }

                  throw var12;
               }

               if (var4 != null) {
                  try {
                     var4.method4996(362695969);
                  } catch (Throwable var7) {
                     ;
                  }
               }

               return;
            }
         }

         if (var2) {
            class615.field8903.method5390(class615.field8903.field9137, !var2, -1907250649);
         }

         class615.field8903.method5391(class615.field8903.field9137, var0, -1004506906);
         if (!var2) {
            class615.field8903.method5390(class615.field8903.field9137, !var2, -1748771368);
         }

         class21.method3416(-707841245);
         class593.field1623.method5038(10000);
         class593.field1623.method4835(32);
         Client.field2697.method5290(-818859939);
         class593.field1623.method4875(false);
         if (class593.field1623.method4878()) {
            class729.method1700(class615.field8903.field9117.method5848(-1411340111) == 1, -1054485931);
         }

         Client.field2697.method5289(526823496);
         Client.field2697.method5282((byte)64).method5673(-1897479103);
         Client.field2647 = false;
         Client.field2657 = true;
         class495.field8098 = null;
         class593.field1623.method4826(0.0F, 1.0F);
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "wr.fe(" + ')');
      }
   }

   static final void method3476(class744 var0, byte var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9138.method2262(-1981564122) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wr.any(" + ')');
      }
   }

   static final void method3477(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         int var2 = var0.field3161[var0.field3156 * 681479919];
         boolean var3 = var0.field3161[var0.field3156 * 681479919 + 1] == 1;
         if (class740.field3210 != null) {
            class568 var4 = class740.field3210.method2942((long)var2);
            if (var4 != null && !var3) {
               var4.method545(-1460969981);
            } else if (var4 == null && var3) {
               var4 = new class568();
               class740.field3210.method2947(var4, (long)var2);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "wr.aeh(" + ')');
      }
   }

   static final void method3478(class513 var0, byte var1) {
      try {
         int var2 = 0;
         var0.method2650(1090191163);

         int var3;
         int var4;
         int var5;
         for(var3 = 0; var3 < 1168366243 * class498.field8102; ++var3) {
            var4 = class498.field8108[var3];
            if ((class498.field8104[var4] & 1) == 0) {
               if (var2 > 0) {
                  --var2;
                  class498.field8104[var4] = (byte)(class498.field8104[var4] | 2);
               } else {
                  var5 = var0.method2647(1);
                  if (var5 == 0) {
                     var2 = class127.method1597(var0, 2074736782);
                     class498.field8104[var4] = (byte)(class498.field8104[var4] | 2);
                  } else {
                     class339.method137(var0, var4, -1265435014);
                  }
               }
            }
         }

         var0.method2648((byte)81);
         if (var2 != 0) {
            throw new RuntimeException();
         } else {
            var0.method2650(1796731201);

            for(var3 = 0; var3 < class498.field8102 * 1168366243; ++var3) {
               var4 = class498.field8108[var3];
               if ((class498.field8104[var4] & 1) != 0) {
                  if (var2 > 0) {
                     --var2;
                     class498.field8104[var4] = (byte)(class498.field8104[var4] | 2);
                  } else {
                     var5 = var0.method2647(1);
                     if (var5 == 0) {
                        var2 = class127.method1597(var0, 2076159127);
                        class498.field8104[var4] = (byte)(class498.field8104[var4] | 2);
                     } else {
                        class339.method137(var0, var4, -1556347349);
                     }
                  }
               }
            }

            var0.method2648((byte)23);
            if (var2 != 0) {
               throw new RuntimeException();
            } else {
               var0.method2650(-909299389);

               for(var3 = 0; var3 < 1430471535 * class498.field8103; ++var3) {
                  var4 = class498.field8107[var3];
                  if ((class498.field8104[var4] & 1) != 0) {
                     if (var2 > 0) {
                        --var2;
                        class498.field8104[var4] = (byte)(class498.field8104[var4] | 2);
                     } else {
                        var5 = var0.method2647(1);
                        if (var5 == 0) {
                           var2 = class127.method1597(var0, 2121776092);
                           class498.field8104[var4] = (byte)(class498.field8104[var4] | 2);
                        } else if (class936.method6278(var0, var4, -166989889)) {
                           class498.field8104[var4] = (byte)(class498.field8104[var4] | 2);
                        }
                     }
                  }
               }

               var0.method2648((byte)92);
               if (var2 != 0) {
                  throw new RuntimeException();
               } else {
                  var0.method2650(526089082);

                  for(var3 = 0; var3 < class498.field8103 * 1430471535; ++var3) {
                     var4 = class498.field8107[var3];
                     if ((class498.field8104[var4] & 1) == 0) {
                        if (var2 > 0) {
                           --var2;
                           class498.field8104[var4] = (byte)(class498.field8104[var4] | 2);
                        } else {
                           var5 = var0.method2647(1);
                           if (var5 == 0) {
                              var2 = class127.method1597(var0, 2129494225);
                              class498.field8104[var4] = (byte)(class498.field8104[var4] | 2);
                           } else if (class936.method6278(var0, var4, -1080126826)) {
                              class498.field8104[var4] = (byte)(class498.field8104[var4] | 2);
                           }
                        }
                     }
                  }

                  var0.method2648((byte)49);
                  if (var2 != 0) {
                     throw new RuntimeException();
                  } else {
                     class498.field8102 = 0;
                     class498.field8103 = 0;

                     for(var3 = 1; var3 < 2048; ++var3) {
                        class498.field8104[var3] = (byte)(class498.field8104[var3] >> 1);
                        class946 var7 = Client.field2786[var3];
                        if (var7 != null) {
                           class498.field8108[(class498.field8102 += -656365301) * 1168366243 - 1] = var3;
                        } else {
                           class498.field8107[(class498.field8103 += 854162319) * 1430471535 - 1] = var3;
                        }
                     }

                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "wr.b(" + ')');
      }
   }

   public static class471 method3479(int var0) {
      try {
         return class601.field9201 * 1056867697 < class601.field9199.length ? class601.field9199[(class601.field9201 += -700736623) * 1056867697 - 1] : null;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "wr.k(" + ')');
      }
   }
}
