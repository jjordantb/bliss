public class class262 {
   public static int field8133 = 2883872;
   static int field8134 = 2;
   static int field8135 = 4;
   static int field8136 = 8;
   static int field8137 = 67108864;
   static int field8138 = 32;
   static int field8139 = 64;
   static int field8140 = 128;
   static int field8141 = 1109655552;
   static int field8142 = 512;
   static int field8143 = 1675886592;
   static int field8144 = 2048;
   static int field8145 = 4096;
   static int field8146 = 1134821376;
   static int field8147 = 16384;
   static int field8148 = 32768;
   static int field8149 = 65536;
   static int field8150 = 2116288512;
   public static int field8151 = 262144;
   static int field8152 = 524288;
   static int field8153 = 1625554944;
   static int field8154 = 256;
   public static int field8155 = 8388608;
   static int field8156 = 16777216;
   static int field8157 = 131072;
   static int field8158 = 8192;
   public static int field8159 = 536870912;
   static int field8160 = 1084489728;
   static int field8161 = 1612972032;
   public static int field8162 = 1073741824;
   public static int field8163 = 2883842;
   public static int field8164 = 2883848;
   static int field8165 = 1024;
   public static int field8166 = 2883968;
   static int field8167 = 268435456;
   public static int field8168 = 33554432;
   public static int field8169 = 134217728;
   static int field8170 = 16;
   static int field8171 = 1310982144;
   public static int field8172 = 2097152;
   static int field8173 = 2015625216;
   static int field8174 = 1;
   static int field8175 = 2028208128;
   static int field8176 = 1336147968;
   static int field8177 = 4194304;
   static int field8178 = 1210318848;
   public int field8179;
   public int field8180;
   int field8181;
   int field8182;
   public int[][] field8183;

   public void method4517(int var1) {
      try {
         for(int var2 = 0; var2 < this.field8181 * 843157589; ++var2) {
            for(int var3 = 0; var3 < -16196483 * this.field8182; ++var3) {
               if (var2 != 0 && var3 != 0 && var2 < this.field8181 * 843157589 - 5 && var3 < -16196483 * this.field8182 - 5) {
                  this.field8183[var2][var3] = 2097152;
               } else {
                  this.field8183[var2][var3] = -1;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lz.f(" + ')');
      }
   }

   public void method4518(int var1, int var2, int var3, int var4, boolean var5, boolean var6, byte var7) {
      try {
         var1 -= 1487776559 * this.field8179;
         var2 -= this.field8180 * 1415525851;
         if (var3 == 0) {
            if (var4 == 0) {
               this.method4521(var1, var2, 128, -1042521454);
               this.method4521(var1 - 1, var2, 8, 1975526490);
            }

            if (1 == var4) {
               this.method4521(var1, var2, 2, 1615298449);
               this.method4521(var1, var2 + 1, 32, -1090831475);
            }

            if (2 == var4) {
               this.method4521(var1, var2, 8, -807916897);
               this.method4521(var1 + 1, var2, 128, 1020755534);
            }

            if (var4 == 3) {
               this.method4521(var1, var2, 32, 1108581466);
               this.method4521(var1, var2 - 1, 2, -1801098216);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (var4 == 0) {
               this.method4521(var1, var2, 1, -10556195);
               this.method4521(var1 - 1, 1 + var2, 16, 1839392519);
            }

            if (var4 == 1) {
               this.method4521(var1, var2, 4, -1867058614);
               this.method4521(1 + var1, 1 + var2, 64, 1914117352);
            }

            if (var4 == 2) {
               this.method4521(var1, var2, 16, -247629730);
               this.method4521(1 + var1, var2 - 1, 1, 1013576008);
            }

            if (var4 == 3) {
               this.method4521(var1, var2, 64, -1124572932);
               this.method4521(var1 - 1, var2 - 1, 4, 1892546696);
            }
         }

         if (2 == var3) {
            if (var4 == 0) {
               this.method4521(var1, var2, 130, -1051181631);
               this.method4521(var1 - 1, var2, 8, 477434855);
               this.method4521(var1, var2 + 1, 32, -572198250);
            }

            if (1 == var4) {
               this.method4521(var1, var2, 10, -793198954);
               this.method4521(var1, var2 + 1, 32, -523767496);
               this.method4521(1 + var1, var2, 128, 337648584);
            }

            if (2 == var4) {
               this.method4521(var1, var2, 40, -1529569840);
               this.method4521(var1 + 1, var2, 128, -37825090);
               this.method4521(var1, var2 - 1, 2, 1713925250);
            }

            if (var4 == 3) {
               this.method4521(var1, var2, 160, -2113348130);
               this.method4521(var1, var2 - 1, 2, -796571658);
               this.method4521(var1 - 1, var2, 8, -1813504580);
            }
         }

         if (var5) {
            if (var3 == 0) {
               if (var4 == 0) {
                  this.method4521(var1, var2, 65536, 270651632);
                  this.method4521(var1 - 1, var2, 4096, 1117923632);
               }

               if (1 == var4) {
                  this.method4521(var1, var2, 1024, 332662493);
                  this.method4521(var1, var2 + 1, 16384, -34799266);
               }

               if (2 == var4) {
                  this.method4521(var1, var2, 4096, -1355552414);
                  this.method4521(var1 + 1, var2, 65536, -965543728);
               }

               if (var4 == 3) {
                  this.method4521(var1, var2, 16384, 1838981871);
                  this.method4521(var1, var2 - 1, 1024, -84490113);
               }
            }

            if (var3 == 1 || var3 == 3) {
               if (var4 == 0) {
                  this.method4521(var1, var2, 512, 1154206794);
                  this.method4521(var1 - 1, 1 + var2, 8192, 1783227876);
               }

               if (1 == var4) {
                  this.method4521(var1, var2, 2048, 407329062);
                  this.method4521(var1 + 1, var2 + 1, 32768, 693643788);
               }

               if (2 == var4) {
                  this.method4521(var1, var2, 8192, -559170136);
                  this.method4521(var1 + 1, var2 - 1, 512, 1135401378);
               }

               if (3 == var4) {
                  this.method4521(var1, var2, 32768, -2138252025);
                  this.method4521(var1 - 1, var2 - 1, 2048, -1526325758);
               }
            }

            if (var3 == 2) {
               if (var4 == 0) {
                  this.method4521(var1, var2, 66560, 246239500);
                  this.method4521(var1 - 1, var2, 4096, -1798504629);
                  this.method4521(var1, 1 + var2, 16384, 469277356);
               }

               if (var4 == 1) {
                  this.method4521(var1, var2, 5120, -644288660);
                  this.method4521(var1, var2 + 1, 16384, -672805993);
                  this.method4521(var1 + 1, var2, 65536, 1011283510);
               }

               if (var4 == 2) {
                  this.method4521(var1, var2, 20480, -2135869248);
                  this.method4521(1 + var1, var2, 65536, -660763031);
                  this.method4521(var1, var2 - 1, 1024, 53790200);
               }

               if (var4 == 3) {
                  this.method4521(var1, var2, 81920, -1242086458);
                  this.method4521(var1, var2 - 1, 1024, -921740680);
                  this.method4521(var1 - 1, var2, 4096, -704699869);
               }
            }
         }

         if (var6) {
            if (var3 == 0) {
               if (var4 == 0) {
                  this.method4521(var1, var2, 536870912, 105188977);
                  this.method4521(var1 - 1, var2, 33554432, -1557461646);
               }

               if (var4 == 1) {
                  this.method4521(var1, var2, 8388608, 378184094);
                  this.method4521(var1, var2 + 1, 134217728, -581903657);
               }

               if (2 == var4) {
                  this.method4521(var1, var2, 33554432, 17287891);
                  this.method4521(1 + var1, var2, 536870912, 1366614715);
               }

               if (3 == var4) {
                  this.method4521(var1, var2, 134217728, -259723125);
                  this.method4521(var1, var2 - 1, 8388608, 1673528275);
               }
            }

            if (var3 == 1 || var3 == 3) {
               if (var4 == 0) {
                  this.method4521(var1, var2, 4194304, -827204996);
                  this.method4521(var1 - 1, var2 + 1, 67108864, 1483620152);
               }

               if (var4 == 1) {
                  this.method4521(var1, var2, 16777216, 1148972070);
                  this.method4521(1 + var1, var2 + 1, 268435456, 192304498);
               }

               if (2 == var4) {
                  this.method4521(var1, var2, 67108864, -1069320096);
                  this.method4521(var1 + 1, var2 - 1, 4194304, 665627788);
               }

               if (3 == var4) {
                  this.method4521(var1, var2, 268435456, -165102103);
                  this.method4521(var1 - 1, var2 - 1, 16777216, -1103853791);
               }
            }

            if (2 == var3) {
               if (var4 == 0) {
                  this.method4521(var1, var2, 545259520, 1336024317);
                  this.method4521(var1 - 1, var2, 33554432, 1060346989);
                  this.method4521(var1, 1 + var2, 134217728, 924194268);
               }

               if (var4 == 1) {
                  this.method4521(var1, var2, 41943040, 904733021);
                  this.method4521(var1, 1 + var2, 134217728, -213082013);
                  this.method4521(1 + var1, var2, 536870912, -844475745);
               }

               if (var4 == 2) {
                  this.method4521(var1, var2, 167772160, 1177840791);
                  this.method4521(var1 + 1, var2, 536870912, 455577522);
                  this.method4521(var1, var2 - 1, 8388608, 867277877);
               }

               if (var4 == 3) {
                  this.method4521(var1, var2, 671088640, -1868687626);
                  this.method4521(var1, var2 - 1, 8388608, -1057716925);
                  this.method4521(var1 - 1, var2, 33554432, 301167292);
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "lz.b(" + ')');
      }
   }

   public void method4519(int var1, int var2, byte var3) {
      try {
         var1 -= 1487776559 * this.field8179;
         var2 -= 1415525851 * this.field8180;
         this.field8183[var1][var2] |= 2097152;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lz.i(" + ')');
      }
   }

   public void method4520(int var1, int var2, byte var3) {
      try {
         var1 -= this.field8179 * 1487776559;
         var2 -= this.field8180 * 1415525851;
         this.field8183[var1][var2] |= 262144;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lz.k(" + ')');
      }
   }

   void method4521(int var1, int var2, int var3, int var4) {
      try {
         this.field8183[var1][var2] |= var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "lz.d(" + ')');
      }
   }

   public void method4522(int var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, byte var8) {
      try {
         int var9 = 256;
         if (var6) {
            var9 |= 131072;
         }

         if (var7) {
            var9 |= 1073741824;
         }

         var1 -= this.field8179 * 1487776559;
         var2 -= this.field8180 * 1415525851;
         int var10;
         if (1 == var5 || 3 == var5) {
            var10 = var3;
            var3 = var4;
            var4 = var10;
         }

         for(var10 = var1; var10 < var1 + var3; ++var10) {
            if (var10 >= 0 && var10 < 843157589 * this.field8181) {
               for(int var11 = var2; var11 < var2 + var4; ++var11) {
                  if (var11 >= 0 && var11 < this.field8182 * -16196483) {
                     this.method4523(var10, var11, var9, (byte)-13);
                  }
               }
            }
         }

      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "lz.x(" + ')');
      }
   }

   void method4523(int var1, int var2, int var3, byte var4) {
      try {
         this.field8183[var1][var2] &= ~var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "lz.r(" + ')');
      }
   }

   public void method4524(int var1, int var2, int var3) {
      try {
         var1 -= this.field8179 * 1487776559;
         var2 -= 1415525851 * this.field8180;
         this.field8183[var1][var2] &= -262145;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lz.n(" + ')');
      }
   }

   public boolean method4525(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         if (var3 > 1) {
            return class923.method6258(var1, var2, var3, var3, var4, var5, var6, var7, -173263894) ? true : this.method4526(var1, var2, var3, var3, var4, var5, var6, var7, var8, (byte)-47);
         } else {
            int var10 = var6 + var4 - 1;
            int var11 = var7 + var5 - 1;
            if (var1 >= var4 && var1 <= var10 && var2 >= var5 && var2 <= var11) {
               return true;
            } else if (var1 == var4 - 1 && var2 >= var5 && var2 <= var11 && (this.field8183[var1 - 1487776559 * this.field8179][var2 - 1415525851 * this.field8180] & 8) == 0 && (var8 & 8) == 0) {
               return true;
            } else if (1 + var10 == var1 && var2 >= var5 && var2 <= var11 && (this.field8183[var1 - this.field8179 * 1487776559][var2 - this.field8180 * 1415525851] & 128) == 0 && (var8 & 2) == 0) {
               return true;
            } else if (var5 - 1 == var2 && var1 >= var4 && var1 <= var10 && (this.field8183[var1 - this.field8179 * 1487776559][var2 - 1415525851 * this.field8180] & 2) == 0 && (var8 & 4) == 0) {
               return true;
            } else {
               return var2 == var11 + 1 && var1 >= var4 && var1 <= var10 && (this.field8183[var1 - this.field8179 * 1487776559][var2 - 1415525851 * this.field8180] & 32) == 0 && (var8 & 1) == 0;
            }
         }
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "lz.z(" + ')');
      }
   }

   public boolean method4526(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte var10) {
      try {
         int var11 = var1 + var3;
         int var12 = var4 + var2;
         int var13 = var5 + var7;
         int var14 = var6 + var8;
         int var15;
         int var16;
         if (var13 == var1 && (var9 & 2) == 0) {
            var15 = var2 > var6 ? var2 : var6;

            for(var16 = var12 < var14 ? var12 : var14; var15 < var16; ++var15) {
               if ((this.field8183[var13 - 1 - 1487776559 * this.field8179][var15 - this.field8180 * 1415525851] & 8) == 0) {
                  return true;
               }
            }
         } else if (var5 == var11 && (var9 & 8) == 0) {
            var15 = var2 > var6 ? var2 : var6;

            for(var16 = var12 < var14 ? var12 : var14; var15 < var16; ++var15) {
               if ((this.field8183[var5 - 1487776559 * this.field8179][var15 - this.field8180 * 1415525851] & 128) == 0) {
                  return true;
               }
            }
         } else if (var14 == var2 && (var9 & 1) == 0) {
            var15 = var1 > var5 ? var1 : var5;

            for(var16 = var11 < var13 ? var11 : var13; var15 < var16; ++var15) {
               if ((this.field8183[var15 - 1487776559 * this.field8179][var14 - 1 - 1415525851 * this.field8180] & 2) == 0) {
                  return true;
               }
            }
         } else if (var6 == var12 && (var9 & 4) == 0) {
            var15 = var1 > var5 ? var1 : var5;

            for(var16 = var11 < var13 ? var11 : var13; var15 < var16; ++var15) {
               if ((this.field8183[var15 - 1487776559 * this.field8179][var6 - this.field8180 * 1415525851] & 32) == 0) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "lz.y(" + ')');
      }
   }

   public void method4527(int var1, int var2, int var3, int var4, boolean var5, boolean var6, byte var7) {
      try {
         int var8 = 256;
         if (var5) {
            var8 |= 131072;
         }

         if (var6) {
            var8 |= 1073741824;
         }

         var1 -= this.field8179 * 1487776559;
         var2 -= 1415525851 * this.field8180;

         for(int var9 = var1; var9 < var3 + var1; ++var9) {
            if (var9 >= 0 && var9 < 843157589 * this.field8181) {
               for(int var10 = var2; var10 < var4 + var2; ++var10) {
                  if (var10 >= 0 && var10 < -16196483 * this.field8182) {
                     this.method4521(var9, var10, var8, 1009782178);
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "lz.p(" + ')');
      }
   }

   public boolean method4528(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (1 == var3) {
            if (var4 == var1 && var5 == var2) {
               return true;
            }
         } else if (var4 >= var1 && var4 <= var3 + var1 - 1 && var5 >= var5 && var5 <= var5 + var3 - 1) {
            return true;
         }

         var1 -= 1487776559 * this.field8179;
         var2 -= this.field8180 * 1415525851;
         var4 -= this.field8179 * 1487776559;
         var5 -= this.field8180 * 1415525851;
         if (1 == var3) {
            if (var6 == 0) {
               if (var7 == 0) {
                  if (var1 == var4 - 1 && var5 == var2) {
                     return true;
                  }

                  if (var1 == var4 && 1 + var5 == var2 && (this.field8183[var1][var2] & 2883872) == 0) {
                     return true;
                  }

                  if (var1 == var4 && var2 == var5 - 1 && (this.field8183[var1][var2] & 2883842) == 0) {
                     return true;
                  }
               } else if (1 == var7) {
                  if (var4 == var1 && var2 == 1 + var5) {
                     return true;
                  }

                  if (var4 - 1 == var1 && var2 == var5 && (this.field8183[var1][var2] & 2883848) == 0) {
                     return true;
                  }

                  if (1 + var4 == var1 && var5 == var2 && (this.field8183[var1][var2] & 2883968) == 0) {
                     return true;
                  }
               } else if (2 == var7) {
                  if (1 + var4 == var1 && var5 == var2) {
                     return true;
                  }

                  if (var1 == var4 && var2 == 1 + var5 && (this.field8183[var1][var2] & 2883872) == 0) {
                     return true;
                  }

                  if (var1 == var4 && var2 == var5 - 1 && (this.field8183[var1][var2] & 2883842) == 0) {
                     return true;
                  }
               } else if (var7 == 3) {
                  if (var1 == var4 && var5 - 1 == var2) {
                     return true;
                  }

                  if (var4 - 1 == var1 && var2 == var5 && (this.field8183[var1][var2] & 2883848) == 0) {
                     return true;
                  }

                  if (var1 == 1 + var4 && var5 == var2 && (this.field8183[var1][var2] & 2883968) == 0) {
                     return true;
                  }
               }
            }

            if (var6 == 2) {
               if (var7 == 0) {
                  if (var4 - 1 == var1 && var2 == var5) {
                     return true;
                  }

                  if (var1 == var4 && 1 + var5 == var2) {
                     return true;
                  }

                  if (var1 == var4 + 1 && var5 == var2 && (this.field8183[var1][var2] & 2883968) == 0) {
                     return true;
                  }

                  if (var1 == var4 && var5 - 1 == var2 && (this.field8183[var1][var2] & 2883842) == 0) {
                     return true;
                  }
               } else if (var7 == 1) {
                  if (var4 - 1 == var1 && var5 == var2 && (this.field8183[var1][var2] & 2883848) == 0) {
                     return true;
                  }

                  if (var1 == var4 && 1 + var5 == var2) {
                     return true;
                  }

                  if (var1 == 1 + var4 && var2 == var5) {
                     return true;
                  }

                  if (var1 == var4 && var5 - 1 == var2 && (this.field8183[var1][var2] & 2883842) == 0) {
                     return true;
                  }
               } else if (2 == var7) {
                  if (var4 - 1 == var1 && var2 == var5 && (this.field8183[var1][var2] & 2883848) == 0) {
                     return true;
                  }

                  if (var1 == var4 && var2 == 1 + var5 && (this.field8183[var1][var2] & 2883872) == 0) {
                     return true;
                  }

                  if (var1 == var4 + 1 && var5 == var2) {
                     return true;
                  }

                  if (var1 == var4 && var2 == var5 - 1) {
                     return true;
                  }
               } else if (3 == var7) {
                  if (var4 - 1 == var1 && var2 == var5) {
                     return true;
                  }

                  if (var1 == var4 && var5 + 1 == var2 && (this.field8183[var1][var2] & 2883872) == 0) {
                     return true;
                  }

                  if (1 + var4 == var1 && var5 == var2 && (this.field8183[var1][var2] & 2883968) == 0) {
                     return true;
                  }

                  if (var1 == var4 && var5 - 1 == var2) {
                     return true;
                  }
               }
            }

            if (9 == var6) {
               if (var4 == var1 && 1 + var5 == var2 && (this.field8183[var1][var2] & 32) == 0) {
                  return true;
               }

               if (var1 == var4 && var2 == var5 - 1 && (this.field8183[var1][var2] & 2) == 0) {
                  return true;
               }

               if (var4 - 1 == var1 && var5 == var2 && (this.field8183[var1][var2] & 8) == 0) {
                  return true;
               }

               if (var1 == 1 + var4 && var5 == var2 && (this.field8183[var1][var2] & 128) == 0) {
                  return true;
               }
            }
         } else {
            int var9 = var3 + var1 - 1;
            int var10 = var3 + var2 - 1;
            if (var6 == 0) {
               if (var7 == 0) {
                  if (var4 - var3 == var1 && var5 >= var2 && var5 <= var10) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && var2 == var5 + 1 && (this.field8183[var4][var2] & 2883872) == 0) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && var2 == var5 - var3 && (this.field8183[var4][var10] & 2883842) == 0) {
                     return true;
                  }
               } else if (var7 == 1) {
                  if (var4 >= var1 && var4 <= var9 && var2 == 1 + var5) {
                     return true;
                  }

                  if (var4 - var3 == var1 && var5 >= var2 && var5 <= var10 && (this.field8183[var9][var5] & 2883848) == 0) {
                     return true;
                  }

                  if (var4 + 1 == var1 && var5 >= var2 && var5 <= var10 && (this.field8183[var1][var5] & 2883968) == 0) {
                     return true;
                  }
               } else if (var7 == 2) {
                  if (var1 == 1 + var4 && var5 >= var2 && var5 <= var10) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && var5 + 1 == var2 && (this.field8183[var4][var2] & 2883872) == 0) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && var5 - var3 == var2 && (this.field8183[var4][var10] & 2883842) == 0) {
                     return true;
                  }
               } else if (3 == var7) {
                  if (var4 >= var1 && var4 <= var9 && var5 - var3 == var2) {
                     return true;
                  }

                  if (var4 - var3 == var1 && var5 >= var2 && var5 <= var10 && (this.field8183[var9][var5] & 2883848) == 0) {
                     return true;
                  }

                  if (var1 == var4 + 1 && var5 >= var2 && var5 <= var10 && (this.field8183[var1][var5] & 2883968) == 0) {
                     return true;
                  }
               }
            }

            if (2 == var6) {
               if (var7 == 0) {
                  if (var1 == var4 - var3 && var5 >= var2 && var5 <= var10) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && var2 == 1 + var5) {
                     return true;
                  }

                  if (var4 + 1 == var1 && var5 >= var2 && var5 <= var10 && (this.field8183[var1][var5] & 2883968) == 0) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && var2 == var5 - var3 && (this.field8183[var4][var10] & 2883842) == 0) {
                     return true;
                  }
               } else if (var7 == 1) {
                  if (var1 == var4 - var3 && var5 >= var2 && var5 <= var10 && (this.field8183[var9][var5] & 2883848) == 0) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && 1 + var5 == var2) {
                     return true;
                  }

                  if (var1 == 1 + var4 && var5 >= var2 && var5 <= var10) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && var2 == var5 - var3 && (this.field8183[var4][var10] & 2883842) == 0) {
                     return true;
                  }
               } else if (var7 == 2) {
                  if (var4 - var3 == var1 && var5 >= var2 && var5 <= var10 && (this.field8183[var9][var5] & 2883848) == 0) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && var5 + 1 == var2 && (this.field8183[var4][var2] & 2883872) == 0) {
                     return true;
                  }

                  if (var1 == var4 + 1 && var5 >= var2 && var5 <= var10) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && var5 - var3 == var2) {
                     return true;
                  }
               } else if (3 == var7) {
                  if (var1 == var4 - var3 && var5 >= var2 && var5 <= var10) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && var5 + 1 == var2 && (this.field8183[var4][var2] & 2883872) == 0) {
                     return true;
                  }

                  if (1 + var4 == var1 && var5 >= var2 && var5 <= var10 && (this.field8183[var1][var5] & 2883968) == 0) {
                     return true;
                  }

                  if (var4 >= var1 && var4 <= var9 && var5 - var3 == var2) {
                     return true;
                  }
               }
            }

            if (9 == var6) {
               if (var4 >= var1 && var4 <= var9 && var5 + 1 == var2 && (this.field8183[var4][var2] & 2883872) == 0) {
                  return true;
               }

               if (var4 >= var1 && var4 <= var9 && var2 == var5 - var3 && (this.field8183[var4][var10] & 2883842) == 0) {
                  return true;
               }

               if (var4 - var3 == var1 && var5 >= var2 && var5 <= var10 && (this.field8183[var9][var5] & 2883848) == 0) {
                  return true;
               }

               if (1 + var4 == var1 && var5 >= var2 && var5 <= var10 && (this.field8183[var1][var5] & 2883968) == 0) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "lz.s(" + ')');
      }
   }

   public void method4529(int var1, int var2, int var3, int var4, boolean var5, boolean var6, byte var7) {
      try {
         var1 -= 1487776559 * this.field8179;
         var2 -= this.field8180 * 1415525851;
         if (var3 == 0) {
            if (var4 == 0) {
               this.method4523(var1, var2, 128, (byte)-26);
               this.method4523(var1 - 1, var2, 8, (byte)-13);
            }

            if (var4 == 1) {
               this.method4523(var1, var2, 2, (byte)23);
               this.method4523(var1, var2 + 1, 32, (byte)-16);
            }

            if (var4 == 2) {
               this.method4523(var1, var2, 8, (byte)5);
               this.method4523(var1 + 1, var2, 128, (byte)-42);
            }

            if (var4 == 3) {
               this.method4523(var1, var2, 32, (byte)-12);
               this.method4523(var1, var2 - 1, 2, (byte)81);
            }
         }

         if (var3 == 1 || 3 == var3) {
            if (var4 == 0) {
               this.method4523(var1, var2, 1, (byte)93);
               this.method4523(var1 - 1, var2 + 1, 16, (byte)-43);
            }

            if (var4 == 1) {
               this.method4523(var1, var2, 4, (byte)92);
               this.method4523(1 + var1, var2 + 1, 64, (byte)48);
            }

            if (var4 == 2) {
               this.method4523(var1, var2, 16, (byte)13);
               this.method4523(1 + var1, var2 - 1, 1, (byte)-84);
            }

            if (var4 == 3) {
               this.method4523(var1, var2, 64, (byte)-11);
               this.method4523(var1 - 1, var2 - 1, 4, (byte)-50);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method4523(var1, var2, 130, (byte)-105);
               this.method4523(var1 - 1, var2, 8, (byte)-47);
               this.method4523(var1, var2 + 1, 32, (byte)4);
            }

            if (var4 == 1) {
               this.method4523(var1, var2, 10, (byte)53);
               this.method4523(var1, var2 + 1, 32, (byte)-27);
               this.method4523(var1 + 1, var2, 128, (byte)3);
            }

            if (var4 == 2) {
               this.method4523(var1, var2, 40, (byte)-72);
               this.method4523(var1 + 1, var2, 128, (byte)86);
               this.method4523(var1, var2 - 1, 2, (byte)-21);
            }

            if (var4 == 3) {
               this.method4523(var1, var2, 160, (byte)-31);
               this.method4523(var1, var2 - 1, 2, (byte)-20);
               this.method4523(var1 - 1, var2, 8, (byte)-49);
            }
         }

         if (var5) {
            if (var3 == 0) {
               if (var4 == 0) {
                  this.method4523(var1, var2, 65536, (byte)13);
                  this.method4523(var1 - 1, var2, 4096, (byte)51);
               }

               if (1 == var4) {
                  this.method4523(var1, var2, 1024, (byte)-68);
                  this.method4523(var1, 1 + var2, 16384, (byte)-15);
               }

               if (2 == var4) {
                  this.method4523(var1, var2, 4096, (byte)76);
                  this.method4523(var1 + 1, var2, 65536, (byte)-79);
               }

               if (var4 == 3) {
                  this.method4523(var1, var2, 16384, (byte)-30);
                  this.method4523(var1, var2 - 1, 1024, (byte)-32);
               }
            }

            if (1 == var3 || 3 == var3) {
               if (var4 == 0) {
                  this.method4523(var1, var2, 512, (byte)109);
                  this.method4523(var1 - 1, var2 + 1, 8192, (byte)-18);
               }

               if (1 == var4) {
                  this.method4523(var1, var2, 2048, (byte)20);
                  this.method4523(var1 + 1, var2 + 1, 32768, (byte)8);
               }

               if (var4 == 2) {
                  this.method4523(var1, var2, 8192, (byte)-7);
                  this.method4523(var1 + 1, var2 - 1, 512, (byte)-35);
               }

               if (var4 == 3) {
                  this.method4523(var1, var2, 32768, (byte)23);
                  this.method4523(var1 - 1, var2 - 1, 2048, (byte)85);
               }
            }

            if (2 == var3) {
               if (var4 == 0) {
                  this.method4523(var1, var2, 66560, (byte)-97);
                  this.method4523(var1 - 1, var2, 4096, (byte)4);
                  this.method4523(var1, var2 + 1, 16384, (byte)9);
               }

               if (1 == var4) {
                  this.method4523(var1, var2, 5120, (byte)-23);
                  this.method4523(var1, 1 + var2, 16384, (byte)24);
                  this.method4523(var1 + 1, var2, 65536, (byte)-1);
               }

               if (var4 == 2) {
                  this.method4523(var1, var2, 20480, (byte)83);
                  this.method4523(var1 + 1, var2, 65536, (byte)-79);
                  this.method4523(var1, var2 - 1, 1024, (byte)-98);
               }

               if (var4 == 3) {
                  this.method4523(var1, var2, 81920, (byte)13);
                  this.method4523(var1, var2 - 1, 1024, (byte)-67);
                  this.method4523(var1 - 1, var2, 4096, (byte)75);
               }
            }
         }

         if (var6) {
            if (var3 == 0) {
               if (var4 == 0) {
                  this.method4523(var1, var2, 536870912, (byte)79);
                  this.method4523(var1 - 1, var2, 33554432, (byte)-26);
               }

               if (1 == var4) {
                  this.method4523(var1, var2, 8388608, (byte)91);
                  this.method4523(var1, var2 + 1, 134217728, (byte)-32);
               }

               if (var4 == 2) {
                  this.method4523(var1, var2, 33554432, (byte)78);
                  this.method4523(var1 + 1, var2, 536870912, (byte)6);
               }

               if (var4 == 3) {
                  this.method4523(var1, var2, 134217728, (byte)-27);
                  this.method4523(var1, var2 - 1, 8388608, (byte)-52);
               }
            }

            if (var3 == 1 || 3 == var3) {
               if (var4 == 0) {
                  this.method4523(var1, var2, 4194304, (byte)12);
                  this.method4523(var1 - 1, 1 + var2, 67108864, (byte)-38);
               }

               if (var4 == 1) {
                  this.method4523(var1, var2, 16777216, (byte)33);
                  this.method4523(1 + var1, var2 + 1, 268435456, (byte)71);
               }

               if (2 == var4) {
                  this.method4523(var1, var2, 67108864, (byte)-69);
                  this.method4523(var1 + 1, var2 - 1, 4194304, (byte)-66);
               }

               if (3 == var4) {
                  this.method4523(var1, var2, 268435456, (byte)-29);
                  this.method4523(var1 - 1, var2 - 1, 16777216, (byte)-32);
               }
            }

            if (var3 == 2) {
               if (var4 == 0) {
                  this.method4523(var1, var2, 545259520, (byte)-72);
                  this.method4523(var1 - 1, var2, 33554432, (byte)62);
                  this.method4523(var1, 1 + var2, 134217728, (byte)17);
               }

               if (1 == var4) {
                  this.method4523(var1, var2, 41943040, (byte)-58);
                  this.method4523(var1, 1 + var2, 134217728, (byte)-18);
                  this.method4523(1 + var1, var2, 536870912, (byte)95);
               }

               if (var4 == 2) {
                  this.method4523(var1, var2, 167772160, (byte)9);
                  this.method4523(1 + var1, var2, 536870912, (byte)-34);
                  this.method4523(var1, var2 - 1, 8388608, (byte)51);
               }

               if (3 == var4) {
                  this.method4523(var1, var2, 671088640, (byte)71);
                  this.method4523(var1, var2 - 1, 8388608, (byte)-23);
                  this.method4523(var1 - 1, var2, 33554432, (byte)1);
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "lz.u(" + ')');
      }
   }

   public void method4530(int var1, int var2, int var3) {
      try {
         var1 -= 1487776559 * this.field8179;
         var2 -= 1415525851 * this.field8180;
         this.field8183[var1][var2] &= -2097153;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lz.q(" + ')');
      }
   }

   static final void method4531(class744 var0, int var1) {
      try {
         var0.field3162 -= -1365138610;
         if (var0.field3168[1685767703 * var0.field3162] < var0.field3168[1685767703 * var0.field3162 + 1]) {
            var0.field3176 += var0.field3174[1883543357 * var0.field3176] * 286750741;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lz.bo(" + ')');
      }
   }

   static final void method4532(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         int var2 = var0.field3161[681479919 * var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156 * 681479919];
         class833 var4 = class808.field4598.method4721(var2, 1528209569);
         char var10000 = var4.field9171;
         var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = var4.method5423(var3, (byte)-30);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lz.vy(" + ')');
      }
   }
}
