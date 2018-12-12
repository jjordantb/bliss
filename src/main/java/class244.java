public final class class244 {
   static int field8546 = 23;
   static int field8547 = 16;
   static class967 field8548 = new class967();
   static int field8549 = 6;
   static int field8550 = 1;
   static int field8551 = 4096;
   static int field8552 = 50;
   static int field8553 = 0;

   public static int method4772(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      class967 var5 = field8548;
      synchronized(field8548) {
         field8548.field2565 = var2;
         field8548.field2572 = var4 * 497351807;
         field8548.field2579 = var0;
         field8548.field2575 = 0;
         field8548.field2576 = var1 * 329554717;
         field8548.field2581 = 0;
         field8548.field2580 = 0;
         field8548.field2573 = 0;
         field8548.field2577 = 0;
         method4774(field8548);
         var1 -= field8548.field2576 * 66256693;
         field8548.field2565 = null;
         field8548.field2579 = null;
         return var1;
      }
   }

   static void method4773(class967 var0) {
      byte var1 = var0.field2599;
      int var2 = var0.field2600 * -966285967;
      int var3 = var0.field2584 * 849607515;
      int var4 = var0.field2571 * 1013527997;
      int[] var5 = class967.field2589;
      int var6 = var0.field2585 * 1501792989;
      byte[] var7 = var0.field2579;
      int var8 = var0.field2575 * -1701270189;
      int var9 = var0.field2576 * 66256693;
      int var11 = var0.field2603 * -69219207 + 1;

      label59:
      while(true) {
         if (var2 > 0) {
            while(true) {
               if (var9 == 0) {
                  break label59;
               }

               if (var2 == 1) {
                  if (var9 == 0) {
                     var2 = 1;
                     break label59;
                  }

                  var7[var8] = var1;
                  ++var8;
                  --var9;
                  break;
               }

               var7[var8] = var1;
               --var2;
               ++var8;
               --var9;
            }
         }

         while(var3 != var11) {
            var1 = (byte)var4;
            var6 = var5[var6];
            byte var12 = (byte)var6;
            var6 >>= 8;
            ++var3;
            if (var12 != var4) {
               var4 = var12;
               if (var9 == 0) {
                  var2 = 1;
                  break label59;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
            } else {
               if (var3 != var11) {
                  var2 = 2;
                  var6 = var5[var6];
                  var12 = (byte)var6;
                  var6 >>= 8;
                  ++var3;
                  if (var3 != var11) {
                     if (var12 != var4) {
                        var4 = var12;
                     } else {
                        var2 = 3;
                        var6 = var5[var6];
                        var12 = (byte)var6;
                        var6 >>= 8;
                        ++var3;
                        if (var3 != var11) {
                           if (var12 != var4) {
                              var4 = var12;
                           } else {
                              var6 = var5[var6];
                              var12 = (byte)var6;
                              var6 >>= 8;
                              ++var3;
                              var2 = (var12 & 255) + 4;
                              var6 = var5[var6];
                              var4 = (byte)var6;
                              var6 >>= 8;
                              ++var3;
                           }
                        }
                     }
                  }
                  continue label59;
               }

               if (var9 == 0) {
                  var2 = 1;
                  break label59;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
            }
         }

         var2 = 0;
         break;
      }

      int var13 = var0.field2577 * 1847985911;
      var0.field2577 += (var9 - var9) * 834706119;
      int var10000 = var0.field2577;
      var0.field2599 = var1;
      var0.field2600 = var2 * 1622047633;
      var0.field2584 = var3 * 1402191059;
      var0.field2571 = var4 * -84955755;
      class967.field2589 = var5;
      var0.field2585 = var6 * -1642553995;
      var0.field2579 = var7;
      var0.field2575 = var8 * -1038344485;
      var0.field2576 = var9 * 329554717;
   }

   static void method4774(class967 var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      int var19 = 0;
      int[] var20 = null;
      int[] var21 = null;
      int[] var22 = null;
      var0.field2582 = -1770501691;
      if (class967.field2589 == null) {
         class967.field2589 = new int[var0.field2582 * 605156896];
      }

      boolean var23 = true;

      while(var23) {
         byte var24 = method4775(var0);
         if (var24 == 23) {
            break;
         }

         var24 = method4775(var0);
         var24 = method4775(var0);
         var24 = method4775(var0);
         var24 = method4775(var0);
         var24 = method4775(var0);
         var24 = method4775(var0);
         var24 = method4775(var0);
         var24 = method4775(var0);
         var24 = method4775(var0);
         var24 = method4777(var0);
         var0.field2583 = 0;
         byte var25 = method4775(var0);
         var0.field2583 = (var0.field2583 * -1963861893 << 8 | var25 & 255) * -1428404557;
         var25 = method4775(var0);
         var0.field2583 = (var0.field2583 * -1963861893 << 8 | var25 & 255) * -1428404557;
         var25 = method4775(var0);
         var0.field2583 = (var0.field2583 * -1963861893 << 8 | var25 & 255) * -1428404557;

         int var26;
         for(var26 = 0; var26 < 16; ++var26) {
            var24 = method4777(var0);
            if (var24 == 1) {
               var0.field2592[var26] = true;
            } else {
               var0.field2592[var26] = false;
            }
         }

         for(var26 = 0; var26 < 256; ++var26) {
            var0.field2602[var26] = false;
         }

         int var27;
         for(var26 = 0; var26 < 16; ++var26) {
            if (var0.field2592[var26]) {
               for(var27 = 0; var27 < 16; ++var27) {
                  var24 = method4777(var0);
                  if (var24 == 1) {
                     var0.field2602[var26 * 16 + var27] = true;
                  }
               }
            }
         }

         method4776(var0);
         var26 = var0.field2590 * -2130856323 + 2;
         var27 = method4778(3, var0);
         int var28 = method4778(15, var0);

         int var30;
         for(int var29 = 0; var29 < var28; ++var29) {
            var30 = 0;

            while(true) {
               var24 = method4777(var0);
               if (var24 == 0) {
                  var0.field2591[var29] = (byte)var30;
                  break;
               }

               ++var30;
            }
         }

         byte[] var45 = new byte[6];

         for(byte var46 = 0; var46 < var27; var45[var46] = var46++) {
            ;
         }

         byte var31;
         byte var32;
         for(var30 = 0; var30 < var28; ++var30) {
            var31 = var0.field2591[var30];

            for(var32 = var45[var31]; var31 > 0; --var31) {
               var45[var31] = var45[var31 - 1];
            }

            var45[0] = var32;
            var0.field2596[var30] = var32;
         }

         int var47;
         int var48;
         for(var30 = 0; var30 < var27; ++var30) {
            var47 = method4778(5, var0);

            for(var48 = 0; var48 < var26; ++var48) {
               while(true) {
                  var24 = method4777(var0);
                  if (var24 == 0) {
                     var0.field2578[var30][var48] = (byte)var47;
                     break;
                  }

                  var24 = method4777(var0);
                  if (var24 == 0) {
                     ++var47;
                  } else {
                     --var47;
                  }
               }
            }
         }

         int var33;
         for(var30 = 0; var30 < var27; ++var30) {
            var31 = 32;
            var32 = 0;

            for(var33 = 0; var33 < var26; ++var33) {
               if (var0.field2578[var30][var33] > var32) {
                  var32 = var0.field2578[var30][var33];
               }

               if (var0.field2578[var30][var33] < var31) {
                  var31 = var0.field2578[var30][var33];
               }
            }

            method4779(var0.field2594[var30], var0.field2569[var30], var0.field2601[var30], var0.field2578[var30], var31, var32, var26);
            var0.field2595[var30] = var31;
         }

         var30 = var0.field2590 * -2130856323 + 1;
         var47 = -1;
         byte var49 = 0;

         for(var33 = 0; var33 <= 255; ++var33) {
            var0.field2586[var33] = 0;
         }

         var33 = 4095;

         int var34;
         int var35;
         for(var34 = 15; var34 >= 0; --var34) {
            for(var35 = 15; var35 >= 0; --var35) {
               var0.field2597[var33] = (byte)(var34 * 16 + var35);
               --var33;
            }

            var0.field2598[var34] = var33 + 1;
         }

         var34 = 0;
         if (var49 == 0) {
            ++var47;
            var49 = 50;
            byte var50 = var0.field2596[var47];
            var19 = var0.field2595[var50];
            var20 = var0.field2594[var50];
            var22 = var0.field2601[var50];
            var21 = var0.field2569[var50];
         }

         var48 = var49 - 1;
         var35 = var19;

         int var36;
         byte var37;
         for(var36 = method4778(var19, var0); var36 > var20[var35]; var36 = var36 << 1 | var37) {
            ++var35;
            var37 = method4777(var0);
         }

         int var38 = var22[var36 - var21[var35]];

         while(true) {
            int var39;
            while(var38 != var30) {
               int var40;
               if (var38 != 0 && var38 != 1) {
                  var39 = var38 - 1;
                  int var51;
                  if (var39 < 16) {
                     var40 = var0.field2598[0];

                     for(var24 = var0.field2597[var40 + var39]; var39 > 3; var39 -= 4) {
                        var51 = var40 + var39;
                        var0.field2597[var51] = var0.field2597[var51 - 1];
                        var0.field2597[var51 - 1] = var0.field2597[var51 - 2];
                        var0.field2597[var51 - 2] = var0.field2597[var51 - 3];
                        var0.field2597[var51 - 3] = var0.field2597[var51 - 4];
                     }

                     while(var39 > 0) {
                        var0.field2597[var40 + var39] = var0.field2597[var40 + var39 - 1];
                        --var39;
                     }

                     var0.field2597[var40] = var24;
                  } else {
                     var40 = var39 / 16;
                     var51 = var39 % 16;
                     int var42 = var0.field2598[var40] + var51;

                     for(var24 = var0.field2597[var42]; var42 > var0.field2598[var40]; --var42) {
                        var0.field2597[var42] = var0.field2597[var42 - 1];
                     }

                     ++var0.field2598[var40];

                     while(var40 > 0) {
                        --var0.field2598[var40];
                        var0.field2597[var0.field2598[var40]] = var0.field2597[var0.field2598[var40 - 1] + 16 - 1];
                        --var40;
                     }

                     --var0.field2598[0];
                     var0.field2597[var0.field2598[0]] = var24;
                     if (var0.field2598[0] == 0) {
                        var33 = 4095;

                        for(int var43 = 15; var43 >= 0; --var43) {
                           for(int var44 = 15; var44 >= 0; --var44) {
                              var0.field2597[var33] = var0.field2597[var0.field2598[var43] + var44];
                              --var33;
                           }

                           var0.field2598[var43] = var33 + 1;
                        }
                     }
                  }

                  ++var0.field2586[var0.field2593[var24 & 255] & 255];
                  class967.field2589[var34] = var0.field2593[var24 & 255] & 255;
                  ++var34;
                  if (var48 == 0) {
                     ++var47;
                     var48 = 50;
                     byte var52 = var0.field2596[var47];
                     var19 = var0.field2595[var52];
                     var20 = var0.field2594[var52];
                     var22 = var0.field2601[var52];
                     var21 = var0.field2569[var52];
                  }

                  --var48;
                  var35 = var19;

                  for(var36 = method4778(var19, var0); var36 > var20[var35]; var36 = var36 << 1 | var37) {
                     ++var35;
                     var37 = method4777(var0);
                  }

                  var38 = var22[var36 - var21[var35]];
               } else {
                  var39 = -1;
                  var40 = 1;

                  do {
                     if (var38 == 0) {
                        var39 += 1 * var40;
                     } else if (var38 == 1) {
                        var39 += 2 * var40;
                     }

                     var40 *= 2;
                     if (var48 == 0) {
                        ++var47;
                        var48 = 50;
                        byte var41 = var0.field2596[var47];
                        var19 = var0.field2595[var41];
                        var20 = var0.field2594[var41];
                        var22 = var0.field2601[var41];
                        var21 = var0.field2569[var41];
                     }

                     --var48;
                     var35 = var19;

                     for(var36 = method4778(var19, var0); var36 > var20[var35]; var36 = var36 << 1 | var37) {
                        ++var35;
                        var37 = method4777(var0);
                     }

                     var38 = var22[var36 - var21[var35]];
                  } while(var38 == 0 || var38 == 1);

                  ++var39;
                  var25 = var0.field2593[var0.field2597[var0.field2598[0]] & 255];

                  for(var0.field2586[var25 & 255] += var39; var39 > 0; --var39) {
                     class967.field2589[var34] = var25 & 255;
                     ++var34;
                  }
               }
            }

            var0.field2600 = 0;
            var0.field2599 = 0;
            var0.field2588[0] = 0;

            for(var39 = 1; var39 <= 256; ++var39) {
               var0.field2588[var39] = var0.field2586[var39 - 1];
            }

            for(var39 = 1; var39 <= 256; ++var39) {
               var0.field2588[var39] += var0.field2588[var39 - 1];
            }

            for(var39 = 0; var39 < var34; ++var39) {
               var25 = (byte)(class967.field2589[var39] & 255);
               class967.field2589[var0.field2588[var25 & 255]] |= var39 << 8;
               ++var0.field2588[var25 & 255];
            }

            var0.field2585 = (class967.field2589[var0.field2583 * -1963861893] >> 8) * -1642553995;
            var0.field2584 = 0;
            var0.field2585 = class967.field2589[var0.field2585 * 1501792989] * -1642553995;
            var0.field2571 = (byte)(var0.field2585 * 1501792989 & 255) * -84955755;
            var0.field2585 = (var0.field2585 * 1501792989 >> 8) * -1642553995;
            var0.field2584 += 1402191059;
            var0.field2603 = var34 * -555426359;
            method4773(var0);
            if (var0.field2584 * 849607515 == var0.field2603 * -69219207 + 1 && var0.field2600 * -966285967 == 0) {
               var23 = true;
               break;
            }

            var23 = false;
            break;
         }
      }

   }

   static byte method4775(class967 var0) {
      return (byte)method4778(8, var0);
   }

   static void method4776(class967 var0) {
      var0.field2590 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.field2602[var1]) {
            var0.field2593[var0.field2590 * -2130856323] = (byte)var1;
            var0.field2590 += -603327787;
         }
      }

   }

   static byte method4777(class967 var0) {
      return (byte)method4778(1, var0);
   }

   class244() throws Throwable {
      throw new Error();
   }

   static int method4778(int var0, class967 var1) {
      while(var1.field2581 * 1660824337 < var0) {
         var1.field2580 = (var1.field2580 * -1710803227 << 8 | var1.field2565[var1.field2572 * -1070677121] & 255) * 1040750317;
         var1.field2581 += 1409363848;
         var1.field2572 += 497351807;
         var1.field2573 += -1183153807;
         int var10000 = var1.field2573;
      }

      int var2 = var1.field2580 * -1710803227 >> var1.field2581 * 1660824337 - var0 & (1 << var0) - 1;
      var1.field2581 -= var0 * -360700431;
      return var2;
   }

   static void method4779(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      int var9;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      var8 = 0;

      for(var9 = var4; var9 <= var5; ++var9) {
         var8 += var1[var9 + 1] - var1[var9];
         var0[var9] = var8 - 1;
         var8 <<= 1;
      }

      for(var9 = var4 + 1; var9 <= var5; ++var9) {
         var1[var9] = (var0[var9 - 1] + 1 << 1) - var1[var9];
      }

   }
}
