public class class572 extends class175 {
   class240 field114;
   static boolean field115 = false;
   static int[] field116 = new int[]{1, -1, -1, 1};
   static int[] field117 = new int[]{0, -1, 0, 1};
   static int field118 = 2;
   static int field119 = 3;
   static int[] field120 = new int[]{1, 0, -1, 0};
   static int field121 = 0;
   class418 field122;
   static int[] field123 = new int[]{-1, -1, 1, 1};
   int field124 = 99;
   static int field125 = 1;
   static boolean field126 = false;

   void method97(class848 var1, int var2, int var3, int var4, int var5, class262 var6, int var7) {
      try {
         class265 var8 = this.method104(var2, var3, var4, var5, 1530247338);
         if (var8 != null) {
            ObjectDefinition var9 = this.field114.method4713(var8.method4551((byte)80));
            int var10 = var8.method4548(726839210);
            int var11 = var8.method4549((short)20316);
            if (var9.method1494(-1167401239)) {
               class373.method913(var2, var4, var5, var9, 16515072);
            }

            if (var8.method4558(-1865139931)) {
               var8.method4556(var1, -959766431);
            }

            if (var3 == 0) {
               super.field4990.method2419(var2, var4, var5, -1330802605);
               super.field4990.method2420(var2, var4, var5, (byte)-1);
               if (var9.field2212 != 0) {
                  var6.method4529(var4, var5, var10, var11, var9.field2256, !var9.field2248, (byte)108);
               }

               if (var9.field2208 == 1) {
                  if (var11 == 0) {
                     super.field4990.field3857.method1648(1, var2, var4, var5);
                  } else if (1 == var11) {
                     super.field4990.field3857.method1648(2, var2, var4, 1 + var5);
                  } else if (2 == var11) {
                     super.field4990.field3857.method1648(1, var2, var4 + 1, var5);
                  } else if (var11 == 3) {
                     super.field4990.field3857.method1648(2, var2, var4, var5);
                  }
               }
            } else if (1 == var3) {
               super.field4990.method2448(var2, var4, var5, (byte)59);
               super.field4990.method2421(var2, var4, var5, -391880689);
            } else if (2 == var3) {
               super.field4990.method2422(var2, var4, var5, class730.field2942, (short)-414);
               if (var9.field2212 != 0 && var9.field2218 + var4 < super.field4998 && var9.field2218 + var5 < super.field4999 && var9.field2215 + var4 < super.field4998 && var9.field2215 + var5 < super.field4999) {
                  var6.method4522(var4, var5, var9.field2218, var9.field2215, var11, var9.field2256, !var9.field2248, (byte)38);
               }

               if (class15.field6903.field6921 == var10) {
                  if ((var11 & 1) == 0) {
                     super.field4990.field3857.method1648(8, var2, var4, var5);
                  } else {
                     super.field4990.field3857.method1648(16, var2, var4, var5);
                  }
               }
            } else if (3 == var3) {
               super.field4990.method2403(var2, var4, var5, 2008906043);
               if (var9.field2212 == 1) {
                  var6.method4524(var4, var5, -1244104271);
               }
            }
         }

      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "aaa.cr(" + ')');
      }
   }

   public final void method98(class848 var1, InputStream var2, int var3, int var4, byte var5) {
      try {
         if (!super.field5000) {
            boolean var6 = false;
            class5 var7 = null;

            while(true) {
               int var8;
               int var9;
               int var11;
               int var12;
               int var18;
               while(var2.field10376 < var2.field10375.length) {
                  var8 = var2.method6371();
                  if (var8 == 0) {
                     if (var7 == null) {
                        var7 = new class5(var2, this.field122);
                     } else {
                        var7.method2951(var2, this.field122, (short)1342);
                     }
                  } else {
                     int var13;
                     int var14;
                     int var15;
                     if (1 == var8) {
                        var9 = var2.method6371();
                        if (var9 > 0) {
                           for(var18 = 0; var18 < var9; ++var18) {
                              class321 var20 = new class321(var1, super.field4990.field3849, var2, 2);
                              if (var20.field1060 == 31) {
                                 class954 var21 = class229.field8212.method2658(var2.method6374(), -1728729634);
                                 var20.method849(var21.field3581, var21.field3580, var21.field3578, var21.field3579, 320507599);
                              }

                              if (var1.method4876() > 0) {
                                 class639 var22 = var20.field1046;
                                 var13 = var22.method5902(823958259) + (var3 << 9);
                                 var14 = var22.method5904((byte)113) + (var4 << 9);
                                 var15 = var13 >> 9;
                                 int var16 = var14 >> 9;
                                 if (var15 >= 0 && var16 >= 0 && var15 < super.field4998 && var16 < super.field4999) {
                                    var22.method5906(var13, super.field5024[var20.field1054][var15][var16] - var22.method5901(1382635254), var14, (byte)37);
                                    super.field4990.method2445(var20, 763639750);
                                 }
                              }
                           }
                        }
                     } else if (var8 == 2) {
                        if (var7 == null) {
                           var7 = new class5();
                        }

                        var7.method2952(var2, -1319879858);
                     } else if (128 == var8) {
                        if (var7 == null) {
                           var7 = new class5();
                        }

                        var7.method2957(var2, this.field122, (byte)11);
                     } else {
                        if (129 != var8) {
                           throw new IllegalStateException("");
                        }

                        if (super.field5002 == null) {
                           super.field5002 = new byte[4][][];
                        }

                        for(var9 = 0; var9 < 4; ++var9) {
                           byte var10 = var2.method6372(-12558881);
                           if (var10 == 0 && super.field5002[var9] != null) {
                              var11 = var3;
                              var12 = var3 + 64;
                              var13 = var4;
                              var14 = 64 + var4;
                              if (var3 < 0) {
                                 var11 = 0;
                              } else if (var3 >= super.field4998) {
                                 var11 = super.field4998;
                              }

                              if (var12 < 0) {
                                 var12 = 0;
                              } else if (var12 >= super.field4998) {
                                 var12 = super.field4998;
                              }

                              if (var4 < 0) {
                                 var13 = 0;
                              } else if (var4 >= super.field4999) {
                                 var13 = super.field4999;
                              }

                              if (var14 < 0) {
                                 var14 = 0;
                              } else if (var14 >= super.field4999) {
                                 var14 = super.field4999;
                              }

                              while(var11 < var12) {
                                 while(var13 < var14) {
                                    super.field5002[var9][var11][var13] = 0;
                                    ++var13;
                                 }

                                 ++var11;
                              }
                           } else if (var10 == 1) {
                              if (super.field5002[var9] == null) {
                                 super.field5002[var9] = new byte[super.field4998 + 1][1 + super.field4999];
                              }

                              for(var11 = 0; var11 < 64; var11 += 4) {
                                 for(var12 = 0; var12 < 64; var12 += 4) {
                                    byte var19 = var2.method6372(-12558881);

                                    for(var14 = var11 + var3; var14 < 4 + var11 + var3; ++var14) {
                                       for(var15 = var12 + var4; var15 < 4 + var4 + var12; ++var15) {
                                          if (var14 >= 0 && var14 < super.field4998 && var15 >= 0 && var15 < super.field4999) {
                                             super.field5002[var9][var14][var15] = var19;
                                          }
                                       }
                                    }
                                 }
                              }
                           } else if (2 == var10) {
                              if (super.field5002[var9] == null) {
                                 super.field5002[var9] = new byte[super.field4998 + 1][super.field4999 + 1];
                              }

                              if (var9 > 0) {
                                 var11 = var3;
                                 var12 = 64 + var3;
                                 var13 = var4;
                                 var14 = 64 + var4;
                                 if (var3 < 0) {
                                    var11 = 0;
                                 } else if (var3 >= super.field4998) {
                                    var11 = super.field4998;
                                 }

                                 if (var12 < 0) {
                                    var12 = 0;
                                 } else if (var12 >= super.field4998) {
                                    var12 = super.field4998;
                                 }

                                 if (var4 < 0) {
                                    var13 = 0;
                                 } else if (var4 >= super.field4999) {
                                    var13 = super.field4999;
                                 }

                                 if (var14 < 0) {
                                    var14 = 0;
                                 } else if (var14 >= super.field4999) {
                                    var14 = super.field4999;
                                 }

                                 while(var11 < var12) {
                                    while(var13 < var14) {
                                       super.field5002[var9][var11][var13] = super.field5002[var9 - 1][var11][var13];
                                       ++var13;
                                    }

                                    ++var11;
                                 }
                              }
                           }
                        }

                        var6 = true;
                     }
                  }
               }

               if (var7 != null) {
                  for(var8 = 0; var8 < 8; ++var8) {
                     for(var9 = 0; var9 < 8; ++var9) {
                        var18 = var8 + (var3 >> 3);
                        var11 = (var4 >> 3) + var9;
                        if (var18 >= 0 && var18 < super.field4998 >> 3 && var11 >= 0 && var11 < super.field4999 >> 3) {
                           this.field122.method5668(var18, var11, var7, (byte)-2);
                        }
                     }
                  }
               }

               if (!var6 && super.field5002 != null) {
                  for(var8 = 0; var8 < 4; ++var8) {
                     if (super.field5002[var8] != null) {
                        for(var9 = 0; var9 < 16; ++var9) {
                           for(var18 = 0; var18 < 16; ++var18) {
                              var11 = (var3 >> 2) + var9;
                              var12 = var18 + (var4 >> 2);
                              if (var11 >= 0 && var11 < 26 && var12 >= 0 && var12 < 26) {
                                 super.field5002[var8][var11][var12] = 0;
                              }
                           }
                        }
                     }
                  }
               }
               break;
            }
         }

      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "aaa.ck(" + ')');
      }
   }

   public final void method99(class848 var1, InputStream var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      try {
         if (!super.field5000) {
            boolean var11 = false;
            class5 var12 = null;
            int var13 = 8 * (var7 & 7);
            int var14 = (var8 & 7) * 8;

            while(true) {
               int var15;
               int var16;
               int var18;
               int var26;
               while(var2.field10376 < var2.field10375.length) {
                  var15 = var2.method6371();
                  if (var15 == 0) {
                     if (var12 == null) {
                        var12 = new class5(var2, this.field122);
                     } else {
                        var12.method2951(var2, this.field122, (short)1534);
                     }
                  } else {
                     int var21;
                     int var22;
                     int var23;
                     int var28;
                     if (1 == var15) {
                        var16 = var2.method6371();
                        if (var16 > 0) {
                           for(var26 = 0; var26 < var16; ++var26) {
                              class321 var27 = new class321(var1, super.field4990.field3849, var2, 2);
                              if (31 == var27.field1060) {
                                 class954 var29 = class229.field8212.method2658(var2.method6374(), -1427443057);
                                 var27.method849(var29.field3581, var29.field3580, var29.field3578, var29.field3579, -1699648006);
                              }

                              if (var1.method4876() > 0) {
                                 class639 var30 = var27.field1046;
                                 var28 = var30.method5902(823958259) >> 9;
                                 var21 = var30.method5904((byte)113) >> 9;
                                 if (var6 == var27.field1054 && var28 >= var13 && var28 < var13 + 8 && var21 >= var14 && var21 < var14 + 8) {
                                    var22 = (var4 << 9) + class575.method125(var30.method5902(823958259) & 4095, var30.method5904((byte)107) & 4095, var9, (byte)91);
                                    var23 = (var5 << 9) + class175.method3053(var30.method5902(823958259) & 4095, var30.method5904((byte)68) & 4095, var9, (short)27107);
                                    var28 = var22 >> 9;
                                    var21 = var23 >> 9;
                                    if (var28 >= 0 && var21 >= 0 && var28 < super.field4998 && var21 < super.field4999) {
                                       var30.method5906(var22, super.field5024[var6][var28][var21] - var30.method5901(-2061162182), var23, (byte)-72);
                                       super.field4990.method2445(var27, -1995203079);
                                    }
                                 }
                              }
                           }
                        }
                     } else if (2 == var15) {
                        if (var12 == null) {
                           var12 = new class5();
                        }

                        var12.method2952(var2, -1319879858);
                     } else if (var15 == 128) {
                        if (var12 == null) {
                           var12 = new class5();
                        }

                        var12.method2957(var2, this.field122, (byte)53);
                     } else {
                        if (var15 != 129) {
                           throw new IllegalStateException("");
                        }

                        if (super.field5002 == null) {
                           super.field5002 = new byte[4][][];
                        }

                        for(var16 = 0; var16 < 4; ++var16) {
                           byte var17 = var2.method6372(-12558881);
                           int var19;
                           if (var17 == 0 && super.field5002[var3] != null) {
                              if (var16 <= var6) {
                                 var18 = var4;
                                 var19 = var4 + 7;
                                 var28 = var5;
                                 var21 = 7 + var5;
                                 if (var4 < 0) {
                                    var18 = 0;
                                 } else if (var4 >= super.field4998) {
                                    var18 = super.field4998;
                                 }

                                 if (var19 < 0) {
                                    var19 = 0;
                                 } else if (var19 >= super.field4998) {
                                    var19 = super.field4998;
                                 }

                                 if (var5 < 0) {
                                    var28 = 0;
                                 } else if (var5 >= super.field4999) {
                                    var28 = super.field4999;
                                 }

                                 if (var21 < 0) {
                                    var21 = 0;
                                 } else if (var21 >= super.field4999) {
                                    var21 = super.field4999;
                                 }

                                 while(var18 < var19) {
                                    while(var28 < var21) {
                                       super.field5002[var3][var18][var28] = 0;
                                       ++var28;
                                    }

                                    ++var18;
                                 }
                              }
                           } else if (var17 != 1) {
                              if (2 == var17) {
                                 ;
                              }
                           } else {
                              if (super.field5002[var3] == null) {
                                 super.field5002[var3] = new byte[super.field4998 + 1][1 + super.field4999];
                              }

                              for(var18 = 0; var18 < 64; var18 += 4) {
                                 for(var19 = 0; var19 < 64; var19 += 4) {
                                    byte var20 = var2.method6372(-12558881);
                                    if (var16 <= var6) {
                                       for(var21 = var18; var21 < 4 + var18; ++var21) {
                                          for(var22 = var19; var22 < var19 + 4; ++var22) {
                                             if (var21 >= var13 && var21 < 8 + var13 && var22 >= var14 && var22 < 8 + var14) {
                                                var23 = var4 + class596.method1456(var21 & 7, var22 & 7, var9, -1280307862);
                                                int var24 = var5 + class905.method6345(var21 & 7, var22 & 7, var9, (byte)-51);
                                                if (var23 >= 0 && var23 < super.field4998 && var24 >= 0 && var24 < super.field4999) {
                                                   super.field5002[var3][var23][var24] = var20;
                                                   var11 = true;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (var12 != null) {
                  this.field122.method5668(var4 >> 3, var5 >> 3, var12, (byte)-31);
               }

               if (!var11 && super.field5002 != null && super.field5002[var3] != null) {
                  var15 = var4 + 7;
                  var16 = var5 + 7;

                  for(var26 = var4; var26 < var15; ++var26) {
                     for(var18 = var5; var18 < var16; ++var18) {
                        super.field5002[var3][var26][var18] = 0;
                     }
                  }
               }
               break;
            }
         }

      } catch (RuntimeException var25) {
         throw class158.method3445(var25, "aaa.cn(" + ')');
      }
   }

   public final void method100(class848 var1, byte[] var2, int var3, int var4, class262[] var5, int var6) {
      try {
         InputStream var7 = new InputStream(var2);
         int var8 = -1;

         while(true) {
            int var9 = var7.method6383((short)255);
            if (var9 == 0) {
               return;
            }

            var8 += var9;
            int var10 = 0;

            while(true) {
               int var11 = var7.method6382(1723054621);
               if (var11 == 0) {
                  break;
               }

               var10 += var11 - 1;
               int var12 = var10 & 63;
               int var13 = var10 >> 6 & 63;
               int var14 = var10 >> 12;
               int var15 = var7.method6371();
               int var16 = var15 >> 2;
               int var17 = var15 & 3;
               int var18 = var13 + var3;
               int var19 = var12 + var4;
               if (var18 > 0 && var19 > 0 && var18 < super.field4998 - 1 && var19 < super.field4999 - 1) {
                  class262 var20 = null;
                  if (!super.field5000) {
                     int var21 = var14;
                     if (2 == (super.field5006.field5406[1][var18][var19] & 2)) {
                        var21 = var14 - 1;
                     }

                     if (var21 >= 0) {
                        var20 = var5[var21];
                     }
                  }

                  this.method106(var1, var14, var14, var18, var19, var8, var17, var16, var20, -1, 1769761748);
               }
            }
         }
      } catch (RuntimeException var22) {
         throw class158.method3445(var22, "aaa.cc(" + ')');
      }
   }

   public final void method101(class848 var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class262[] var10, int var11) {
      try {
         InputStream var12 = new InputStream(var2);
         int var13 = -1;

         do {
            int var14 = var12.method6383((short)255);
            if (var14 == 0) {
               if (var11 == -174685332) {
                  ;
               }

               return;
            }

            var13 += var14;
            int var15 = 0;

            while(true) {
               int var16 = var12.method6382(1723054621);
               if (var16 == 0) {
                  break;
               }

               var15 += var16 - 1;
               int var17 = var15 & 63;
               int var18 = var15 >> 6 & 63;
               int var19 = var15 >> 12;
               int var20 = var12.method6371();
               int var21 = var20 >> 2;
               int var22 = var20 & 3;
               if (var6 == var19 && var18 >= var7 && var18 < 8 + var7 && var17 >= var8 && var17 < 8 + var8) {
                  ObjectDefinition var23 = this.field114.method4713(var13);
                  int var24 = var4 + class618.method5162(var18 & 7, var17 & 7, var9, var23.field2218, var23.field2215, var22, 181137699);
                  int var25 = var5 + class673.method4257(var18 & 7, var17 & 7, var9, var23.field2218, var23.field2215, var22, 1981614763);
                  if (var24 > 0 && var25 > 0 && var24 < super.field4998 - 1 && var25 < super.field4999 - 1) {
                     class262 var26 = null;
                     if (!super.field5000) {
                        int var27 = var3;
                        if (2 == (super.field5006.field5406[1][var24][var25] & 2)) {
                           var27 = var3 - 1;
                        }

                        if (var27 >= 0) {
                           var26 = var10[var27];
                        }
                     }

                     this.method106(var1, var3, var3, var24, var25, var13, var9 + var22 & 3, var21, var26, -1, 2074281649);
                  }
               }
            }
         } while(var11 == -174685332);

         throw new IllegalStateException();
      } catch (RuntimeException var28) {
         throw class158.method3445(var28, "aaa.ca(" + ')');
      }
   }

   boolean method102(class848 var1, int var2, int var3, boolean var4, ObjectDefinition var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, boolean var14, class454 var15, class262 var16, int var17, int var18, byte var19) {
      try {
         int var27;
         Object var30;
         if (class15.field6922.field6921 == var2) {
            var27 = var5.field2208;
            if (field115 && -1 == var5.field2208) {
               var27 = 1;
            }

            if (var4) {
               class729 var26 = new class729(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var2, var3, var14);
               if (var26.method4558(-1364237139)) {
                  var26.method4552(var1, -2008903061);
               }

               var30 = var26;
            } else {
               var30 = new class397(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var2, var3, var6);
            }

            super.field4990.method2414(var7, var12, var13, (class676)var30, (class676)null, (byte)53);
            if (var3 == 0) {
               if (super.field5003 && var5.field2237) {
                  var15.method3881(var12, var13, 50);
                  var15.method3881(var12, var13 + 1, 50);
               }

               if (var27 == 1 && !super.field5000) {
                  super.field4990.field3857.method1647(1, var7, var12, var13, var5.field2219, var5.field2220);
               }
            } else if (var3 == 1) {
               if (super.field5003 && var5.field2237) {
                  var15.method3881(var12, 1 + var13, 50);
                  var15.method3881(var12 + 1, var13 + 1, 50);
               }

               if (var27 == 1 && !super.field5000) {
                  super.field4990.field3857.method1647(2, var7, var12, 1 + var13, var5.field2219, -var5.field2220);
               }
            } else if (var3 == 2) {
               if (super.field5003 && var5.field2237) {
                  var15.method3881(var12 + 1, var13, 50);
                  var15.method3881(1 + var12, 1 + var13, 50);
               }

               if (1 == var27 && !super.field5000) {
                  super.field4990.field3857.method1647(1, var7, 1 + var12, var13, var5.field2219, -var5.field2220);
               }
            } else if (var3 == 3) {
               if (super.field5003 && var5.field2237) {
                  var15.method3881(var12, var13, 50);
                  var15.method3881(1 + var12, var13, 50);
               }

               if (1 == var27 && !super.field5000) {
                  super.field4990.field3857.method1647(2, var7, var12, var13, var5.field2219, var5.field2220);
               }
            }

            if (var5.field2212 != 0 && var16 != null) {
               var16.method4518(var12, var13, var2, var3, var5.field2256, !var5.field2248, (byte)0);
            }

            if (var5.field2223 != 64) {
               super.field4990.method2417(var7, var12, var13, var5.field2223, (byte)-54);
            }

            return true;
         } else {
            Object var20;
            class729 var29;
            if (var2 == class15.field6900.field6921) {
               if (var4) {
                  var29 = new class729(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var2, var3, var14);
                  if (var29.method4558(-1749970817)) {
                     var29.method4552(var1, -2130877816);
                  }

                  var20 = var29;
               } else {
                  var20 = new class397(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var2, var3, var6);
               }

               super.field4990.method2414(var7, var12, var13, (class676)var20, (class676)null, (byte)117);
               if (var5.field2237 && super.field5003) {
                  if (var3 == 0) {
                     var15.method3881(var12, var13 + 1, 50);
                  } else if (1 == var3) {
                     var15.method3881(1 + var12, var13 + 1, 50);
                  } else if (2 == var3) {
                     var15.method3881(var12 + 1, var13, 50);
                  } else if (3 == var3) {
                     var15.method3881(var12, var13, 50);
                  }
               }

               if (var5.field2212 != 0 && var16 != null) {
                  var16.method4518(var12, var13, var2, var3, var5.field2256, !var5.field2248, (byte)0);
               }

               return true;
            } else if (var2 == class15.field6901.field6921) {
               var27 = var3 + 1 & 3;
               Object var21;
               if (var4) {
                  class729 var23 = new class729(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var2, 4 + var3, var14);
                  class729 var24 = new class729(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var2, var27, var14);
                  if (var23.method4558(-1679564366)) {
                     var23.method4552(var1, -2079126659);
                  }

                  if (var24.method4558(-1782980621)) {
                     var24.method4552(var1, -2050070618);
                  }

                  var30 = var23;
                  var21 = var24;
               } else {
                  var30 = new class397(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var2, 4 + var3, var6);
                  var21 = new class397(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var2, var27, var6);
               }

               super.field4990.method2414(var7, var12, var13, (class676)var30, (class676)var21, (byte)48);
               if ((var5.field2208 == 1 || field115 && -1 == var5.field2208) && !super.field5000) {
                  if (var3 == 0) {
                     super.field4990.field3857.method1647(1, var7, var12, var13, var5.field2219, var5.field2220);
                     super.field4990.field3857.method1647(2, var7, var12, 1 + var13, var5.field2219, var5.field2220);
                  } else if (var3 == 1) {
                     super.field4990.field3857.method1647(1, var7, var12 + 1, var13, var5.field2219, var5.field2220);
                     super.field4990.field3857.method1647(2, var7, var12, 1 + var13, var5.field2219, var5.field2220);
                  } else if (var3 == 2) {
                     super.field4990.field3857.method1647(1, var7, 1 + var12, var13, var5.field2219, var5.field2220);
                     super.field4990.field3857.method1647(2, var7, var12, var13, var5.field2219, var5.field2220);
                  } else if (3 == var3) {
                     super.field4990.field3857.method1647(1, var7, var12, var13, var5.field2219, var5.field2220);
                     super.field4990.field3857.method1647(2, var7, var12, var13, var5.field2219, var5.field2220);
                  }
               }

               if (var5.field2212 != 0 && var16 != null) {
                  var16.method4518(var12, var13, var2, var3, var5.field2256, !var5.field2248, (byte)0);
               }

               if (var5.field2223 != 64) {
                  super.field4990.method2417(var7, var12, var13, var5.field2223, (byte)12);
               }

               return true;
            } else if (var2 == class15.field6902.field6921) {
               if (var4) {
                  var29 = new class729(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var2, var3, var14);
                  if (var29.method4558(-1956737069)) {
                     var29.method4552(var1, -2085613160);
                  }

                  var20 = var29;
               } else {
                  var20 = new class397(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var2, var3, var6);
               }

               super.field4990.method2414(var7, var12, var13, (class676)var20, (class676)null, (byte)58);
               if (var5.field2237 && super.field5003) {
                  if (var3 == 0) {
                     var15.method3881(var12, 1 + var13, 50);
                  } else if (var3 == 1) {
                     var15.method3881(var12 + 1, var13 + 1, 50);
                  } else if (2 == var3) {
                     var15.method3881(var12 + 1, var13, 50);
                  } else if (3 == var3) {
                     var15.method3881(var12, var13, 50);
                  }
               }

               if (var5.field2212 != 0 && var16 != null) {
                  var16.method4518(var12, var13, var2, var3, var5.field2256, !var5.field2248, (byte)0);
               }

               return true;
            } else if (var2 == class15.field6903.field6921) {
               if (var4) {
                  class0 var22 = new class0(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var12, var12, var13, var13, var2, var3, var14);
                  if (var22.method4558(-2055372332)) {
                     var22.method4552(var1, -2053499485);
                  }

                  var20 = var22;
               } else {
                  var20 = new class589(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var12, var17 + var12 - 1, var13, var13 + var18 - 1, var2, var3, var6);
               }

               super.field4990.method2416((Animable)var20, false, (byte)0);
               if (1 == var5.field2208 && !super.field5000) {
                  byte var28;
                  if ((var3 & 1) == 0) {
                     var28 = 8;
                  } else {
                     var28 = 16;
                  }

                  super.field4990.field3857.method1647(var28, var7, var12, var13, var5.field2219, 0);
               }

               if (var5.field2212 != 0 && var16 != null) {
                  var16.method4527(var12, var13, var17, var18, var5.field2256, !var5.field2248, (byte)2);
               }

               if (var5.field2223 != 64) {
                  super.field4990.method2417(var7, var12, var13, var5.field2223, (byte)23);
               }

               return true;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var25) {
         throw class158.method3445(var25, "aaa.ce(" + ')');
      }
   }

   boolean method103(class848 var1, int var2, int var3, boolean var4, ObjectDefinition var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      try {
         if (var2 == class15.field6904.field6921) {
            Object var29;
            if (var4) {
               class199 var25 = new class199(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, 0, 0, var2, var3);
               if (var25.method4558(-1870688116)) {
                  var25.method4552(var1, -2124402842);
               }

               var29 = var25;
            } else {
               var29 = new class715(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, 0, 0, var2, var3, var6);
            }

            super.field4990.method2415(var7, var12, var13, (class732)var29, (class732)null, 861548591);
            return true;
         } else {
            int var16;
            class265 var24;
            class199 var26;
            Object var28;
            if (var2 == class15.field6909.field6921) {
               var16 = 65;
               var24 = (class265)super.field4990.method2425(var7, var12, var13, 644917110);
               if (var24 != null) {
                  var16 = this.field114.method4713(var24.method4551((byte)27)).field2223 + 1;
               }

               if (var4) {
                  var26 = new class199(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, field120[var3] * var16, field117[var3] * var16, var2, var3);
                  if (var26.method4558(-1591018559)) {
                     var26.method4552(var1, -2011263790);
                  }

                  var28 = var26;
               } else {
                  var28 = new class715(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var16 * field120[var3], var16 * field117[var3], var2, var3, var6);
               }

               super.field4990.method2415(var7, var12, var13, (class732)var28, (class732)null, 1859376340);
               return true;
            } else if (class15.field6906.field6921 == var2) {
               var16 = 33;
               var24 = (class265)super.field4990.method2425(var7, var12, var13, 552550945);
               if (var24 != null) {
                  var16 = this.field114.method4713(var24.method4551((byte)14)).field2223 / 2 + 1;
               }

               if (var4) {
                  var26 = new class199(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var16 * field120[var3], var16 * field117[var3], var2, var3 + 4);
                  if (var26.method4558(-1847078642)) {
                     var26.method4552(var1, -2043548826);
                  }

                  var28 = var26;
               } else {
                  var28 = new class715(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var16 * field116[var3], field123[var3] * var16, var2, var3 + 4, var6);
               }

               super.field4990.method2415(var7, var12, var13, (class732)var28, (class732)null, 1431954302);
               return true;
            } else if (class15.field6907.field6921 == var2) {
               var16 = var3 + 2 & 3;
               Object var23;
               if (var4) {
                  class199 var27 = new class199(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, 0, 0, var2, var16 + 4);
                  if (var27.method4558(-1553150372)) {
                     var27.method4552(var1, -2133567145);
                  }

                  var23 = var27;
               } else {
                  var23 = new class715(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, 0, 0, var2, var16 + 4, var6);
               }

               super.field4990.method2415(var7, var12, var13, (class732)var23, (class732)null, 1921538390);
               return true;
            } else if (class15.field6908.field6921 == var2) {
               var16 = var3 + 2 & 3;
               int var15 = 33;
               class265 var18 = (class265)super.field4990.method2425(var7, var12, var13, 2110046759);
               if (var18 != null) {
                  var15 = this.field114.method4713(var18.method4551((byte)14)).field2223 / 2 + 1;
               }

               Object var17;
               Object var21;
               if (var4) {
                  class199 var19 = new class199(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var15 * field116[var3], field123[var3] * var15, var2, var3 + 4);
                  class199 var20 = new class199(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, 0, 0, var2, var16 + 4);
                  if (var19.method4558(-1237533744)) {
                     var19.method4552(var1, -2074609967);
                  }

                  if (var20.method4558(-1449189890)) {
                     var20.method4552(var1, -2061447636);
                  }

                  var17 = var19;
                  var21 = var20;
               } else {
                  class715 var30 = new class715(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, var15 * field116[var3], var15 * field123[var3], var2, var3 + 4, var6);
                  class715 var31 = new class715(super.field4990, var1, this.field114, var5, var7, var8, var9, var10, var11, super.field5000, 0, 0, var2, 4 + var16, var6);
                  var17 = var30;
                  var21 = var31;
               }

               super.field4990.method2415(var7, var12, var13, (class732)var17, (class732)var21, 1357750473);
               return true;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var22) {
         throw class158.method3445(var22, "aaa.cb(" + ')');
      }
   }

   class265 method104(int var1, int var2, int var3, int var4, int var5) {
      try {
         class265 var6 = null;
         if (var2 == 0) {
            var6 = (class265)super.field4990.method2425(var1, var3, var4, 212388673);
         }

         if (1 == var2) {
            var6 = (class265)super.field4990.method2427(var1, var3, var4, 1080081135);
         }

         if (var2 == 2) {
            var6 = (class265)super.field4990.method2429(var1, var3, var4, class730.field2942, -1336288750);
         }

         if (var2 == 3) {
            var6 = (class265)super.field4990.method2452(var1, var3, var4, (byte)50);
         }

         return var6;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aaa.cu(" + ')');
      }
   }

   public final void method105(class848 var1, boolean var2, int var3) {
      try {
         super.field4990.method2431();
         if (!var2) {
            int var4;
            int var5;
            if (super.field4997 > 1) {
               for(var4 = 0; var4 < super.field4998; ++var4) {
                  for(var5 = 0; var5 < super.field4999; ++var5) {
                     if ((super.field5006.field5406[1][var4][var5] & 2) == 2) {
                        super.field4990.method2405(var4, var5, -1135071672);
                     }
                  }
               }
            }

            for(var4 = 0; var4 < super.field4997; ++var4) {
               for(var5 = 0; var5 <= super.field4999; ++var5) {
                  for(int var6 = 0; var6 <= super.field4998; ++var6) {
                     if ((super.field5008[var4][var6][var5] & 4) != 0) {
                        int var7 = var6;
                        int var8 = var6;
                        int var9 = var5;

                        int var10;
                        for(var10 = var5; var9 > 0 && (super.field5008[var4][var6][var9 - 1] & 4) != 0 && var10 - var9 < 10; --var9) {
                           ;
                        }

                        while(var10 < super.field4999 && (super.field5008[var4][var6][var10 + 1] & 4) != 0 && var10 - var9 < 10) {
                           ++var10;
                        }

                        int var11;
                        label122:
                        while(var7 > 0 && var8 - var7 < 10) {
                           for(var11 = var9; var11 <= var10; ++var11) {
                              if ((super.field5008[var4][var7 - 1][var11] & 4) == 0) {
                                 if (var3 != 1773155741) {
                                    return;
                                 }
                                 break label122;
                              }
                           }

                           --var7;
                        }

                        label107:
                        while(var8 < super.field4998 && var8 - var7 < 10) {
                           for(var11 = var9; var11 <= var10; ++var11) {
                              if ((super.field5008[var4][var8 + 1][var11] & 4) == 0) {
                                 break label107;
                              }
                           }

                           ++var8;
                        }

                        if ((1 + (var10 - var9)) * (var8 - var7 + 1) >= 4) {
                           var11 = super.field5024[var4][var7][var9];
                           super.field4990.field3857.method1650(4, var4, var7 << 9, (var8 << 9) + 512, var9 << 9, 512 + (var10 << 9), var11, var11);

                           for(int var12 = var7; var12 <= var8; ++var12) {
                              for(int var13 = var9; var13 <= var10; ++var13) {
                                 super.field5008[var4][var12][var13] &= -5;
                              }
                           }
                        }
                     }
                  }
               }
            }

            super.field4990.field3857.method1660();
         }

         super.field5008 = null;
      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "aaa.cp(" + ')');
      }
   }

   final void method106(class848 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class262 var9, int var10, int var11) {
      try {
         if (var3 < this.field124) {
            this.field124 = var3;
         }

         ObjectDefinition var12 = this.field114.method4713(var6);
         if (class615.field8903.field9123.method5845(1871358652) != 0 || !var12.field2264) {
            int var13;
            int var14;
            if (1 != var7 && var7 != 3) {
               var13 = var12.field2218;
               var14 = var12.field2215;
            } else {
               var13 = var12.field2215;
               var14 = var12.field2218;
            }

            int var15;
            int var16;
            if (var13 + var4 <= super.field4998) {
               var15 = (var13 >> 1) + var4;
               var16 = (var13 + 1 >> 1) + var4;
            } else {
               var15 = var4;
               var16 = var4 + 1;
            }

            int var17;
            int var18;
            if (var14 + var5 <= super.field4999) {
               var17 = var5 + (var14 >> 1);
               var18 = var5 + (1 + var14 >> 1);
            } else {
               var17 = var5;
               var18 = 1 + var5;
            }

            class454 var19 = super.field4990.field3862[var2];
            int var20 = var19.method3888(var15, var17, (byte)-48) + var19.method3888(var16, var17, (byte)-81) + var19.method3888(var15, var18, (byte)-94) + var19.method3888(var16, var18, (byte)-87) >> 2;
            int var21 = (var13 << 8) + (var4 << 9);
            int var22 = (var14 << 8) + (var5 << 9);
            boolean var23 = super.field5003 && !super.field5000 && var12.field2217;
            if (var12.method1494(-1167401239)) {
               Animation.method3565(var3, var4, var5, var7, var12, (Npc)null, (Player)null, (byte)37);
            }

            boolean var24 = -1 == var10 && !var12.method1489(934270378) && var12.field2198 == null && !var12.field2213 && !var12.field2221;
            if (!field126 || (!class26.method3482(var8, (byte)13) || var12.field2208 == 1) && (!class200.method4352(var8, 1378507148) || var12.field2208 != 0)) {
               Object var26;
               if (var8 == class15.field6918.field6921) {
                  if (class615.field8903.field9113.method971(-807116560) != 0 || var12.field2214 != 0 || var12.field2212 == 1 || var12.field2242) {
                     if (var24) {
                        class505 var25 = new class505(super.field4990, var1, this.field114, var12, var3, var2, var21, var20, var22, super.field5000, var7, var23);
                        if (var25.method4558(-1997643666)) {
                           var25.method4552(var1, -2091324745);
                        }

                        var26 = var25;
                     } else {
                        var26 = new class547(super.field4990, var1, this.field114, var12, var3, var2, var21, var20, var22, super.field5000, var7, var10);
                     }

                     super.field4990.method2451(var3, var4, var5, (class824)var26, 1853221006);
                     if (1 == var12.field2212 && var9 != null) {
                        var9.method4520(var4, var5, (byte)2);
                     }
                  }
               } else if (class15.field6919.field6921 != var8 && var8 != class15.field6912.field6921) {
                  if (!class200.method4352(var8, -865214392) && !class636.method5912(var8, (byte)-21)) {
                     if (!this.method102(var1, var8, var7, var24, var12, var10, var3, var2, var21, var20, var22, var4, var5, var23, var19, var9, var13, var14, (byte)-37)) {
                        this.method103(var1, var8, var7, var24, var12, var10, var3, var2, var21, var20, var22, var4, var5, -1189422227);
                     }
                  } else {
                     if (var24) {
                        class0 var32 = new class0(super.field4990, var1, this.field114, var12, var3, var2, var21, var20, var22, super.field5000, var4, var13 + var4 - 1, var5, var14 + var5 - 1, var8, var7, var23);
                        if (var32.method4558(-1419053588)) {
                           var32.method4552(var1, -2081421218);
                        }

                        var26 = var32;
                     } else {
                        var26 = new class589(super.field4990, var1, this.field114, var12, var3, var2, var21, var20, var22, super.field5000, var4, var4 + var13 - 1, var5, var5 + var14 - 1, var8, var7, var10);
                     }

                     super.field4990.method2416((Animable)var26, false, (byte)0);
                     if (super.field5003 && !super.field5000 && class200.method4352(var8, 1932287279) && class15.field6910.field6921 != var8 && var3 > 0 && var12.field2208 != 0) {
                        super.field5008[var3][var4][var5] = (byte)(super.field5008[var3][var4][var5] | 4);
                     }

                     if (var12.field2212 != 0 && var9 != null) {
                        var9.method4527(var4, var5, var13, var14, var12.field2256, !var12.field2248, (byte)4);
                     }
                  }
               } else {
                  class0 var33 = null;
                  int var28;
                  Object var31;
                  if (var24) {
                     class0 var27 = new class0(super.field4990, var1, this.field114, var12, var3, var2, var21, var20, var22, super.field5000, var4, var4 + var13 - 1, var5, var14 + var5 - 1, var8, var7, var23);
                     var28 = var27.method2991((short)230);
                     var31 = var27;
                     var33 = var27;
                  } else {
                     var31 = new class589(super.field4990, var1, this.field114, var12, var3, var2, var21, var20, var22, super.field5000, var4, var4 + var13 - 1, var5, var5 + var14 - 1, var8, var7, var10);
                     var28 = 15;
                  }

                  if (super.field4990.method2416((Animable)var31, false, (byte)0)) {
                     if (var33 != null && var33.method4558(-2136957466)) {
                        var33.method4552(var1, -2130479152);
                     }

                     if (var12.field2237 && super.field5003) {
                        if (var28 > 30) {
                           var28 = 30;
                        }

                        for(int var34 = 0; var34 <= var13; ++var34) {
                           for(int var29 = 0; var29 <= var14; ++var29) {
                              var19.method3881(var4 + var34, var29 + var5, var28);
                           }
                        }
                     }
                  }

                  if (var12.field2212 != 0 && var9 != null) {
                     var9.method4527(var4, var5, var13, var14, var12.field2256, !var12.field2248, (byte)15);
                  }
               }
            }
         }

      } catch (RuntimeException var30) {
         throw class158.method3445(var30, "aaa.ci(" + ')');
      }
   }

   public class572(class545 var1, class240 var2, int var3, int var4, int var5, boolean var6, class153 var7, class418 var8) {
      super(var1, var3, var4, var5, var6, class851.field8731, class980.field3196, var7);
      this.field114 = var2;
      this.field122 = var8;
   }

   static final void method107(class564 var0, class131 var1, class744 var2, byte var3) {
      try {
         String var4 = (String)var2.field3157[--var2.field3158];
         int[] var5 = class960.method2212(var4, var2, -247465484);
         if (var5 != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field925 = class634.method5872(var4, var2, -2046058202);
         var0.field983 = var5;
         var0.field963 = true;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aaa.oy(" + ')');
      }
   }

   static final void method108(class744 var0, int var1) {
      try {
         var0.field3156 -= 5;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         int var4 = var0.field3161[var0.field3156 + 2];
         int var5 = var0.field3161[3 + var0.field3156];
         int var6 = var0.field3161[4 + var0.field3156];
         if (-1 == var4) {
            throw new RuntimeException();
         } else {
            class833 var7 = class808.field4598.method4721(var4, 1528209569);
            if (var3 != var7.field9176) {
               throw new RuntimeException();
            } else if (var7.field9171 != var2) {
               throw new RuntimeException();
            } else {
               int[] var8 = var7.method5429(var5, (short)3608);
               if (var6 >= 0 && var8 != null && var8.length > var6) {
                  var0.field3161[++var0.field3156 - 1] = var8[var6];
               } else {
                  throw new RuntimeException();
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "aaa.vv(" + ')');
      }
   }

   static final void method109(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         var0.field3161[++var0.field3156 - 1] = var3.field909 == 1 ? var3.field876 * -1825442367 * 572201537 : -1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aaa.pn(" + ')');
      }
   }
}
