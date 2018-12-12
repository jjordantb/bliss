public class class533 extends class535 {
   static int field3695 = 1;
   public static int field3696 = 2;
   public static int field3697 = 0;

   public class533(int var1, class838 var2) {
      super(var1, var2);
   }

   public void method2261(int var1) {
      try {
         if (super.field3708 < 0 && super.field3708 > 2) {
            super.field3708 = this.method2272(1892526868);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adf.s(" + ')');
      }
   }

   public boolean method2262(int var1) {
      return true;
   }

   void method2275(int var1, int var2) {
      try {
         super.field3708 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "adf.p(" + ')');
      }
   }

   public int method2263(int var1) {
      try {
         return super.field3708;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adf.y(" + ')');
      }
   }

   public class533(class838 var1) {
      super(var1);
   }

   public int method2273(int var1, int var2) {
      try {
         return var1 != 0 && super.field3704.field9139.method2805(544778968) != 1 ? 2 : 1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "adf.f(" + ')');
      }
   }

   int method2272(int var1) {
      return 1;
   }

   static void method2264(class564 var0, int var1) {
      try {
         if (class730.field2817) {
            if (var0.field972 != null) {
               class564 var2 = class554.method427(class543.field3820, class730.field2818, -156511736);
               if (var2 != null) {
                  class202 var3 = new class202();
                  var3.field7578 = var0;
                  var3.field7582 = var2;
                  var3.field7583 = var0.field972;
                  class408.method5470(var3, (byte)-24);
               }
            }

            class701 var5 = class637.method5936(class643.field9933, class730.field2692.field7765, (byte)35);
            var5.field3364.method6362(var0.field1005, 16711935);
            var5.field3364.method6400(var0.field879);
            var5.field3364.method6364(class543.field3820, -935068496);
            var5.field3364.method6364(var0.field867, -1060289644);
            var5.field3364.method6362(class730.field2818, 16711935);
            var5.field3364.method6400(class730.field2888);
            class730.field2692.method4380(var5, (byte)-64);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "adf.kx(" + ')');
      }
   }

   static final void method2265(int var0) {
      try {
         for(int var1 = class827.field9037.method5497(true, -2004625733); var1 != -1; var1 = class827.field9037.method5497(false, -1890624062)) {
            class58.method1579(var1, (byte)-94);
            class730.field2856[++class730.field2764 - 1 & 31] = var1;
         }

         for(class682 var12 = class700.method6331((byte)12); var12 != null; var12 = class700.method6331((byte)12)) {
            int var2 = var12.method4337(766012260);
            long var3 = var12.method4338(-391880689);
            if (1 == var2) {
               class14.field6693[(int)var3] = var12.field7687;
               class730.field2717 |= class474.field8271[(int)var3];
               class730.field2858[++class730.field2859 - 1 & 31] = (int)var3;
            } else if (2 == var2) {
               class978.field3129[(int)var3] = var12.field7688;
               class730.field2768[++class730.field2861 - 1 & 31] = (int)var3;
            } else {
               class564 var5;
               if (var2 == 3) {
                  var5 = class449.method3756((int)var3, (byte)-62);
                  if (!var12.field7688.equals(var5.field937)) {
                     var5.field937 = var12.field7688;
                     class814.method2932(var5, 753227077);
                  }
               } else if (var2 == 22) {
                  var5 = class449.method3756((int)var3, (byte)-82);
                  if (var5.field971 != (1 == var12.field7687)) {
                     var5.field971 = 1 == var12.field7687;
                     class814.method2932(var5, 130202608);
                  }
               } else {
                  int var6;
                  int var7;
                  int var8;
                  if (4 == var2) {
                     var5 = class449.method3756((int)var3, (byte)-20);
                     var6 = var12.field7687;
                     var7 = var12.field7685;
                     var8 = var12.field7686;
                     if (var5.field909 != var6 || var7 != var5.field876 || var8 != var5.field865) {
                        var5.field909 = var6;
                        var5.field876 = var7;
                        var5.field865 = var8;
                        var5.field1032 = null;
                        class814.method2932(var5, 422949042);
                     }
                  } else if (5 == var2) {
                     var5 = class449.method3756((int)var3, (byte)56);
                     if (var5.field1015 != var12.field7687) {
                        if (var12.field7687 != -1) {
                           if (var5.field877 == null) {
                              var5.field877 = new class522();
                           }

                           var5.field877.method2777(var12.field7687, -1984687950);
                        } else {
                           var5.field877 = null;
                        }

                        var5.field1015 = var12.field7687;
                        class814.method2932(var5, -2102110719);
                     }
                  } else if (6 == var2) {
                     int var14 = var12.field7687;
                     var6 = var14 >> 10 & 31;
                     var7 = var14 >> 5 & 31;
                     var8 = var14 & 31;
                     int var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
                     class564 var10 = class449.method3756((int)var3, (byte)-37);
                     if (var9 != var10.field895) {
                        var10.field895 = var9;
                        class814.method2932(var10, -37482416);
                     }
                  } else if (var2 == 7) {
                     var5 = class449.method3756((int)var3, (byte)-71);
                     boolean var13 = 1 == var12.field7687;
                     if (var13 != var5.field886) {
                        var5.field886 = var13;
                        class814.method2932(var5, -1924243832);
                     }
                  } else if (var2 == 8) {
                     var5 = class449.method3756((int)var3, (byte)54);
                     if (var12.field7687 != var5.field915 || var12.field7685 != var5.field987 || var12.field7686 != var5.field1009) {
                        var5.field915 = var12.field7687;
                        var5.field987 = var12.field7685;
                        var5.field1009 = var12.field7686;
                        if (var5.field1005 != -1) {
                           if (var5.field946 > 0) {
                              var5.field1009 = var5.field1009 * 32 / var5.field946;
                           } else if (var5.field978 > 0) {
                              var5.field1009 = var5.field1009 * 32 / var5.field978;
                           }
                        }

                        class814.method2932(var5, -1617809711);
                     }
                  } else if (var2 == 9) {
                     var5 = class449.method3756((int)var3, (byte)49);
                     if (var12.field7687 != var5.field1005 || var12.field7685 != var5.field1006) {
                        var5.field1005 = var12.field7687;
                        var5.field1006 = var12.field7685;
                        class814.method2932(var5, 748648909);
                     }
                  } else if (var2 == 10) {
                     var5 = class449.method3756((int)var3, (byte)88);
                     if (var5.field1022 != var12.field7687 || var12.field7685 != var5.field973 || var5.field917 != var12.field7686) {
                        var5.field1022 = var12.field7687;
                        var5.field973 = var12.field7685;
                        var5.field917 = var12.field7686;
                        class814.method2932(var5, -875934873);
                     }
                  } else if (11 == var2) {
                     var5 = class449.method3756((int)var3, (byte)37);
                     var5.field871 = 0;
                     var5.field868 = var5.field1011 = var12.field7687;
                     var5.field872 = 0;
                     var5.field880 = var5.field884 = var12.field7685;
                     class814.method2932(var5, -429816482);
                  } else if (var2 == 12) {
                     var5 = class449.method3756((int)var3, (byte)43);
                     var6 = var12.field7687;
                     if (var5 != null && var5.field869 == 0) {
                        if (var6 > var5.field894 - var5.field887) {
                           var6 = var5.field894 - var5.field887;
                        }

                        if (var6 < 0) {
                           var6 = 0;
                        }

                        if (var5.field892 != var6) {
                           var5.field892 = var6;
                           class814.method2932(var5, -1007823726);
                        }
                     }
                  } else if (var2 == 14) {
                     var5 = class449.method3756((int)var3, (byte)63);
                     var5.field900 = var12.field7687;
                  } else if (15 == var2) {
                     class95.field602 = true;
                     class95.field601 = var12.field7687;
                     class95.field593 = var12.field7685;
                  } else if (var2 == 16) {
                     var5 = class449.method3756((int)var3, (byte)-2);
                     var5.field935 = var12.field7687;
                  } else if (var2 == 20) {
                     var5 = class449.method3756((int)var3, (byte)-1);
                     var5.field936 = 1 == var12.field7687;
                  } else if (21 == var2) {
                     var5 = class449.method3756((int)var3, (byte)-52);
                     var5.field908 = 1 == var12.field7687;
                  } else if (var2 == 17) {
                     var5 = class449.method3756((int)var3, (byte)62);
                     var5.field1014 = var12.field7687;
                  } else if (var2 == 18) {
                     var5 = class449.method3756((int)var3, (byte)3);
                     var6 = (int)(var3 >> 32);
                     var5.method836(var6, (short)var12.field7687, (short)var12.field7685, -1799363747);
                  } else if (19 == var2) {
                     var5 = class449.method3756((int)var3, (byte)-87);
                     var6 = (int)(var3 >> 32);
                     var5.method830(var6, (short)var12.field7687, (short)var12.field7685, 571287910);
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "adf.gh(" + ')');
      }
   }
}
