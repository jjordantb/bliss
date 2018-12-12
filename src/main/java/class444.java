import java.util.Random;

public class class444 extends class347 {
   static int field7588 = 2048;
   static int field7589 = 0;
   static int field7590 = 1024;
   static int field7591 = 1024;
   int field7592 = -1706813215;
   static int field7593 = 409;
   static int field7594 = 819;
   static int field7595 = 1024;
   int field7596 = 1947781120;
   static int field7597 = 0;
   int field7598 = 0;
   int field7599 = 395516928;
   static int field7600 = 0;
   int field7601 = 1461579169;
   static int field7602 = 1024;
   int field7603 = -1450445824;
   int field7604 = 0;
   int field7605 = -475675648;
   int field7606 = 1247955968;
   int field7607;

   void method4300(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field7598 = var2.method6371() * -653192821;
         break;
      case 1:
         this.field7599 = var2.method6374() * -8002361;
         break;
      case 2:
         this.field7596 = var2.method6374() * 334398233;
         break;
      case 3:
         this.field7601 = var2.method6374() * -2128158391;
         break;
      case 4:
         this.field7592 = var2.method6374() * 1340421019;
         break;
      case 5:
         this.field7603 = var2.method6374() * -420846851;
         break;
      case 6:
         this.field7604 = var2.method6371() * 1663137711;
         break;
      case 7:
         this.field7605 = var2.method6374() * 741927281;
         break;
      case 8:
         this.field7606 = var2.method6374() * 1393727635;
      }

   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 1803226244);
         if (this.field270.field6612) {
            int[][] var4 = this.field270.method3547(-772888514);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = 1499569399 * this.field7599 * -1474554145 * class322.field831 >> 12;
            int var15 = class322.field831 * -1474554145 * -235001559 * this.field7596 >> 12;
            int var16 = class322.field832 * 461985445 * -1432887047 * this.field7601 >> 12;
            int var17 = class322.field832 * 461985445 * this.field7592 * 467335827 >> 12;
            if (var17 <= 1) {
               return var4[var1];
            } else {
               this.field7607 = (-1474554145 * class322.field831 / 8 * this.field7603 * -1630516651 >> 12) * 800544861;
               int var18 = 1 + -1474554145 * class322.field831 / var14;
               int[][] var19 = new int[var18][3];
               int[][] var20 = new int[var18][3];
               Random var21 = new Random((long)(this.field7598 * -2017522141));

               while(true) {
                  while(true) {
                     int var22 = var14 + class977.method1813(var21, var15 - var14, (byte)36);
                     int var23 = var16 + class977.method1813(var21, var17 - var16, (byte)-88);
                     int var24 = var22 + var8;
                     if (var24 > class322.field831 * -1474554145) {
                        var22 = -1474554145 * class322.field831 - var8;
                        var24 = -1474554145 * class322.field831;
                     }

                     int var27;
                     int var30;
                     if (var11) {
                        var30 = 0;
                     } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        var27 = 0;
                        int var28 = var24 + var5;
                        if (var28 < 0) {
                           var28 += -1474554145 * class322.field831;
                        }

                        if (var28 > class322.field831 * -1474554145) {
                           var28 -= class322.field831 * -1474554145;
                        }

                        while(true) {
                           int[] var29 = var20[var25];
                           if (var28 >= var29[0] && var28 <= var29[1]) {
                              var30 = var26[2];
                              if (var25 != var9) {
                                 int var41 = var5 + var8;
                                 if (var41 < 0) {
                                    var41 += -1474554145 * class322.field831;
                                 }

                                 if (var41 > class322.field831 * -1474554145) {
                                    var41 -= -1474554145 * class322.field831;
                                 }

                                 int var31;
                                 int[] var32;
                                 for(var31 = 1; var31 <= var27; ++var31) {
                                    var32 = var20[(var31 + var9) % var12];
                                    var30 = Math.max(var30, var32[2]);
                                 }

                                 for(var31 = 0; var31 <= var27; ++var31) {
                                    var32 = var20[(var9 + var31) % var12];
                                    int var33 = var32[2];
                                    if (var33 != var30) {
                                       int var34 = var32[0];
                                       int var35 = var32[1];
                                       int var36;
                                       int var37;
                                       if (var41 < var28) {
                                          var36 = Math.max(var41, var34);
                                          var37 = Math.min(var28, var35);
                                       } else if (var34 == 0) {
                                          var36 = 0;
                                          var37 = Math.min(var28, var35);
                                       } else {
                                          var36 = Math.max(var41, var34);
                                          var37 = class322.field831 * -1474554145;
                                       }

                                       this.method4303(var21, var4, var36 + var7, var33, var37 - var36, var30 - var33, -1120469720);
                                    }
                                 }
                              }

                              var9 = var25;
                              break;
                           }

                           ++var25;
                           if (var25 >= var12) {
                              var25 = 0;
                           }

                           ++var27;
                        }
                     }

                     if (var30 + var23 > class322.field832 * 461985445) {
                        var23 = 461985445 * class322.field832 - var30;
                     } else {
                        var10 = false;
                     }

                     int[] var39;
                     if (class322.field831 * -1474554145 == var24) {
                        this.method4303(var21, var4, var6 + var8, var30, var22, var23, -22985350);
                        if (var10) {
                           if (var2 == -484575331) {
                              throw new IllegalStateException();
                           }

                           return var3;
                        }

                        var10 = true;
                        var39 = var19[var13++];
                        var39[0] = var8;
                        var39[1] = var24;
                        var39[2] = var30 + var23;
                        int[][] var40 = var20;
                        var20 = var19;
                        var19 = var40;
                        var12 = var13;
                        var13 = 0;
                        var7 = var6;
                        var6 = class977.method1813(var21, -1474554145 * class322.field831, (byte)-66);
                        var5 = var6 - var7;
                        var8 = 0;
                        var27 = var5;
                        if (var5 < 0) {
                           var27 = var5 + class322.field831 * -1474554145;
                        }

                        if (var27 > -1474554145 * class322.field831) {
                           var27 -= class322.field831 * -1474554145;
                        }

                        var9 = 0;

                        while(true) {
                           int[] var42 = var20[var9];
                           if (var27 >= var42[0] && var27 <= var42[1]) {
                              var11 = false;
                              break;
                           }

                           ++var9;
                           if (var9 >= var12) {
                              var9 = 0;
                           }
                        }
                     } else {
                        var39 = var19[var13++];
                        var39[0] = var8;
                        var39[1] = var24;
                        var39[2] = var30 + var23;
                        this.method4303(var21, var4, var6 + var8, var30, var22, var23, -1208339553);
                        var8 = var24;
                     }
                  }
               }
            }
         } else {
            return var3;
         }
      } catch (RuntimeException var38) {
         throw class158.method3445(var38, "ahv.i(" + ')');
      }
   }

   int[] method4301(int var1) {
      int[] var2 = this.field270.method3546(var1, 525237222);
      if (this.field270.field6612) {
         int[][] var3 = this.field270.method3547(1732475144);
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         boolean var9 = true;
         boolean var10 = true;
         int var11 = 0;
         int var12 = 0;
         int var13 = 1499569399 * this.field7599 * -1474554145 * class322.field831 >> 12;
         int var14 = class322.field831 * -1474554145 * -235001559 * this.field7596 >> 12;
         int var15 = class322.field832 * 461985445 * -1432887047 * this.field7601 >> 12;
         int var16 = class322.field832 * 461985445 * this.field7592 * 467335827 >> 12;
         if (var16 <= 1) {
            return var3[var1];
         } else {
            this.field7607 = (-1474554145 * class322.field831 / 8 * this.field7603 * -1630516651 >> 12) * 800544861;
            int var17 = 1 + -1474554145 * class322.field831 / var13;
            int[][] var18 = new int[var17][3];
            int[][] var19 = new int[var17][3];
            Random var20 = new Random((long)(this.field7598 * -2017522141));

            while(true) {
               while(true) {
                  int var21 = var13 + class977.method1813(var20, var14 - var13, (byte)-66);
                  int var22 = var15 + class977.method1813(var20, var16 - var15, (byte)-28);
                  int var23 = var21 + var7;
                  if (var23 > class322.field831 * -1474554145) {
                     var21 = -1474554145 * class322.field831 - var7;
                     var23 = -1474554145 * class322.field831;
                  }

                  int var26;
                  int var29;
                  if (var10) {
                     var29 = 0;
                  } else {
                     int var24 = var8;
                     int[] var25 = var19[var8];
                     var26 = 0;
                     int var27 = var23 + var4;
                     if (var27 < 0) {
                        var27 += -1474554145 * class322.field831;
                     }

                     if (var27 > class322.field831 * -1474554145) {
                        var27 -= class322.field831 * -1474554145;
                     }

                     while(true) {
                        int[] var28 = var19[var24];
                        if (var27 >= var28[0] && var27 <= var28[1]) {
                           var29 = var25[2];
                           if (var24 != var8) {
                              int var39 = var4 + var7;
                              if (var39 < 0) {
                                 var39 += -1474554145 * class322.field831;
                              }

                              if (var39 > class322.field831 * -1474554145) {
                                 var39 -= -1474554145 * class322.field831;
                              }

                              int var30;
                              int[] var31;
                              for(var30 = 1; var30 <= var26; ++var30) {
                                 var31 = var19[(var30 + var8) % var11];
                                 var29 = Math.max(var29, var31[2]);
                              }

                              for(var30 = 0; var30 <= var26; ++var30) {
                                 var31 = var19[(var8 + var30) % var11];
                                 int var32 = var31[2];
                                 if (var32 != var29) {
                                    int var33 = var31[0];
                                    int var34 = var31[1];
                                    int var35;
                                    int var36;
                                    if (var39 < var27) {
                                       var35 = Math.max(var39, var33);
                                       var36 = Math.min(var27, var34);
                                    } else if (var33 == 0) {
                                       var35 = 0;
                                       var36 = Math.min(var27, var34);
                                    } else {
                                       var35 = Math.max(var39, var33);
                                       var36 = class322.field831 * -1474554145;
                                    }

                                    this.method4303(var20, var3, var35 + var6, var32, var36 - var35, var29 - var32, -1679820011);
                                 }
                              }
                           }

                           var8 = var24;
                           break;
                        }

                        ++var24;
                        if (var24 >= var11) {
                           var24 = 0;
                        }

                        ++var26;
                     }
                  }

                  if (var29 + var22 > class322.field832 * 461985445) {
                     var22 = 461985445 * class322.field832 - var29;
                  } else {
                     var9 = false;
                  }

                  int[] var37;
                  if (class322.field831 * -1474554145 == var23) {
                     this.method4303(var20, var3, var5 + var7, var29, var21, var22, -764186178);
                     if (var9) {
                        return var2;
                     }

                     var9 = true;
                     var37 = var18[var12++];
                     var37[0] = var7;
                     var37[1] = var23;
                     var37[2] = var29 + var22;
                     int[][] var38 = var19;
                     var19 = var18;
                     var18 = var38;
                     var11 = var12;
                     var12 = 0;
                     var6 = var5;
                     var5 = class977.method1813(var20, -1474554145 * class322.field831, (byte)-49);
                     var4 = var5 - var6;
                     var7 = 0;
                     var26 = var4;
                     if (var4 < 0) {
                        var26 = var4 + class322.field831 * -1474554145;
                     }

                     if (var26 > -1474554145 * class322.field831) {
                        var26 -= class322.field831 * -1474554145;
                     }

                     var8 = 0;

                     while(true) {
                        int[] var40 = var19[var8];
                        if (var26 >= var40[0] && var26 <= var40[1]) {
                           var10 = false;
                           break;
                        }

                        ++var8;
                        if (var8 >= var11) {
                           var8 = 0;
                        }
                     }
                  } else {
                     var37 = var18[var12++];
                     var37[0] = var7;
                     var37[1] = var23;
                     var37[2] = var29 + var22;
                     this.method4303(var20, var3, var5 + var7, var29, var21, var22, 106077294);
                     var7 = var23;
                  }
               }
            }
         }
      } else {
         return var2;
      }
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field7598 = var2.method6371() * -653192821;
            break;
         case 1:
            this.field7599 = var2.method6374() * -8002361;
            break;
         case 2:
            this.field7596 = var2.method6374() * 334398233;
            break;
         case 3:
            this.field7601 = var2.method6374() * -2128158391;
            break;
         case 4:
            this.field7592 = var2.method6374() * 1340421019;
            break;
         case 5:
            this.field7603 = var2.method6374() * -420846851;
            break;
         case 6:
            this.field7604 = var2.method6371() * 1663137711;
            break;
         case 7:
            this.field7605 = var2.method6374() * 741927281;
            break;
         case 8:
            this.field7606 = var2.method6374() * 1393727635;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahv.r(" + ')');
      }
   }

   int[] method4302(int var1) {
      int[] var2 = this.field270.method3546(var1, 2093617595);
      if (this.field270.field6612) {
         int[][] var3 = this.field270.method3547(-2130665076);
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         boolean var9 = true;
         boolean var10 = true;
         int var11 = 0;
         int var12 = 0;
         int var13 = 1499569399 * this.field7599 * -1474554145 * class322.field831 >> 12;
         int var14 = class322.field831 * -1474554145 * -235001559 * this.field7596 >> 12;
         int var15 = class322.field832 * 461985445 * -1432887047 * this.field7601 >> 12;
         int var16 = class322.field832 * 461985445 * this.field7592 * 467335827 >> 12;
         if (var16 <= 1) {
            return var3[var1];
         } else {
            this.field7607 = (-1474554145 * class322.field831 / 8 * this.field7603 * -1630516651 >> 12) * 800544861;
            int var17 = 1 + -1474554145 * class322.field831 / var13;
            int[][] var18 = new int[var17][3];
            int[][] var19 = new int[var17][3];
            Random var20 = new Random((long)(this.field7598 * -2017522141));

            while(true) {
               while(true) {
                  int var21 = var13 + class977.method1813(var20, var14 - var13, (byte)96);
                  int var22 = var15 + class977.method1813(var20, var16 - var15, (byte)8);
                  int var23 = var21 + var7;
                  if (var23 > class322.field831 * -1474554145) {
                     var21 = -1474554145 * class322.field831 - var7;
                     var23 = -1474554145 * class322.field831;
                  }

                  int var26;
                  int var29;
                  if (var10) {
                     var29 = 0;
                  } else {
                     int var24 = var8;
                     int[] var25 = var19[var8];
                     var26 = 0;
                     int var27 = var23 + var4;
                     if (var27 < 0) {
                        var27 += -1474554145 * class322.field831;
                     }

                     if (var27 > class322.field831 * -1474554145) {
                        var27 -= class322.field831 * -1474554145;
                     }

                     while(true) {
                        int[] var28 = var19[var24];
                        if (var27 >= var28[0] && var27 <= var28[1]) {
                           var29 = var25[2];
                           if (var24 != var8) {
                              int var39 = var4 + var7;
                              if (var39 < 0) {
                                 var39 += -1474554145 * class322.field831;
                              }

                              if (var39 > class322.field831 * -1474554145) {
                                 var39 -= -1474554145 * class322.field831;
                              }

                              int var30;
                              int[] var31;
                              for(var30 = 1; var30 <= var26; ++var30) {
                                 var31 = var19[(var30 + var8) % var11];
                                 var29 = Math.max(var29, var31[2]);
                              }

                              for(var30 = 0; var30 <= var26; ++var30) {
                                 var31 = var19[(var8 + var30) % var11];
                                 int var32 = var31[2];
                                 if (var32 != var29) {
                                    int var33 = var31[0];
                                    int var34 = var31[1];
                                    int var35;
                                    int var36;
                                    if (var39 < var27) {
                                       var35 = Math.max(var39, var33);
                                       var36 = Math.min(var27, var34);
                                    } else if (var33 == 0) {
                                       var35 = 0;
                                       var36 = Math.min(var27, var34);
                                    } else {
                                       var35 = Math.max(var39, var33);
                                       var36 = class322.field831 * -1474554145;
                                    }

                                    this.method4303(var20, var3, var35 + var6, var32, var36 - var35, var29 - var32, 167475133);
                                 }
                              }
                           }

                           var8 = var24;
                           break;
                        }

                        ++var24;
                        if (var24 >= var11) {
                           var24 = 0;
                        }

                        ++var26;
                     }
                  }

                  if (var29 + var22 > class322.field832 * 461985445) {
                     var22 = 461985445 * class322.field832 - var29;
                  } else {
                     var9 = false;
                  }

                  int[] var37;
                  if (class322.field831 * -1474554145 == var23) {
                     this.method4303(var20, var3, var5 + var7, var29, var21, var22, 1099535944);
                     if (var9) {
                        return var2;
                     }

                     var9 = true;
                     var37 = var18[var12++];
                     var37[0] = var7;
                     var37[1] = var23;
                     var37[2] = var29 + var22;
                     int[][] var38 = var19;
                     var19 = var18;
                     var18 = var38;
                     var11 = var12;
                     var12 = 0;
                     var6 = var5;
                     var5 = class977.method1813(var20, -1474554145 * class322.field831, (byte)-56);
                     var4 = var5 - var6;
                     var7 = 0;
                     var26 = var4;
                     if (var4 < 0) {
                        var26 = var4 + class322.field831 * -1474554145;
                     }

                     if (var26 > -1474554145 * class322.field831) {
                        var26 -= class322.field831 * -1474554145;
                     }

                     var8 = 0;

                     while(true) {
                        int[] var40 = var19[var8];
                        if (var26 >= var40[0] && var26 <= var40[1]) {
                           var10 = false;
                           break;
                        }

                        ++var8;
                        if (var8 >= var11) {
                           var8 = 0;
                        }
                     }
                  } else {
                     var37 = var18[var12++];
                     var37[0] = var7;
                     var37[1] = var23;
                     var37[2] = var29 + var22;
                     this.method4303(var20, var3, var5 + var7, var29, var21, var22, -413457222);
                     var7 = var23;
                  }
               }
            }
         }
      } else {
         return var2;
      }
   }

   final void method4303(Random var1, int[][] var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         int var8 = this.field7606 * -2052438629 > 0 ? 4096 - class977.method1813(var1, this.field7606 * -2052438629, (byte)90) : 4096;
         int var9 = 908540917 * this.field7607 * this.field7605 * 19183505 >> 12;
         int var10 = this.field7607 * 908540917 - (var9 > 0 ? class977.method1813(var1, var9, (byte)-95) : 0);
         if (var3 >= class322.field831 * -1474554145) {
            var3 -= class322.field831 * -1474554145;
         }

         int var11;
         int var12;
         if (var10 > 0) {
            if (var6 > 0 && var5 > 0) {
               var11 = var5 / 2;
               var12 = var6 / 2;
               int var13 = var11 < var10 ? var11 : var10;
               int var14 = var12 < var10 ? var12 : var10;
               int var15 = var13 + var3;
               int var16 = var5 - 2 * var13;

               for(int var17 = 0; var17 < var6; ++var17) {
                  int[] var18 = var2[var4 + var17];
                  int var19;
                  int var20;
                  int var21;
                  if (var17 < var14) {
                     var19 = var8 * var17 / var14;
                     if (this.field7604 * 1833451343 == 0) {
                        for(var20 = 0; var20 < var13; ++var20) {
                           var21 = var20 * var8 / var13;
                           var18[var3 + var20 & -901777799 * class322.field829] = var18[var5 + var3 - var20 - 1 & class322.field829 * -901777799] = var21 * var19 >> 12;
                        }
                     } else {
                        for(var20 = 0; var20 < var13; ++var20) {
                           var21 = var8 * var20 / var13;
                           var18[var20 + var3 & class322.field829 * -901777799] = var18[var5 + var3 - var20 - 1 & class322.field829 * -901777799] = var21 < var19 ? var21 : var19;
                        }
                     }

                     if (var15 + var16 > -1474554145 * class322.field831) {
                        var20 = class322.field831 * -1474554145 - var15;
                        class901.method6354(var18, var15, var20, var19);
                        class901.method6354(var18, 0, var16 - var20, var19);
                     } else {
                        class901.method6354(var18, var15, var16, var19);
                     }
                  } else {
                     var19 = var6 - var17 - 1;
                     if (var19 < var14) {
                        var20 = var19 * var8 / var14;
                        int var22;
                        if (this.field7604 * 1833451343 == 0) {
                           for(var21 = 0; var21 < var13; ++var21) {
                              var22 = var21 * var8 / var13;
                              var18[var21 + var3 & class322.field829 * -901777799] = var18[var3 + var5 - var21 - 1 & class322.field829 * -901777799] = var22 * var20 >> 12;
                           }
                        } else {
                           for(var21 = 0; var21 < var13; ++var21) {
                              var22 = var8 * var21 / var13;
                              var18[var21 + var3 & -901777799 * class322.field829] = var18[var3 + var5 - var21 - 1 & class322.field829 * -901777799] = var22 < var20 ? var22 : var20;
                           }
                        }

                        if (var15 + var16 > -1474554145 * class322.field831) {
                           var21 = -1474554145 * class322.field831 - var15;
                           class901.method6354(var18, var15, var21, var20);
                           class901.method6354(var18, 0, var16 - var21, var20);
                        } else {
                           class901.method6354(var18, var15, var16, var20);
                        }
                     } else {
                        for(var20 = 0; var20 < var13; ++var20) {
                           var18[var20 + var3 & -901777799 * class322.field829] = var18[var3 + var5 - var20 - 1 & class322.field829 * -901777799] = var8 * var20 / var13;
                        }

                        if (var15 + var16 > class322.field831 * -1474554145) {
                           var20 = class322.field831 * -1474554145 - var15;
                           class901.method6354(var18, var15, var20, var8);
                           class901.method6354(var18, 0, var16 - var20, var8);
                        } else {
                           class901.method6354(var18, var15, var16, var8);
                        }
                     }
                  }
               }
            }
         } else if (var5 + var3 > -1474554145 * class322.field831) {
            var11 = -1474554145 * class322.field831 - var3;

            for(var12 = 0; var12 < var6; ++var12) {
               int[] var24 = var2[var4 + var12];
               class901.method6354(var24, var3, var11, var8);
               class901.method6354(var24, 0, var5 - var11, var8);
            }
         } else {
            for(var11 = 0; var11 < var6; ++var11) {
               class901.method6354(var2[var4 + var11], var3, var5, var8);
            }
         }

      } catch (RuntimeException var23) {
         throw class158.method3445(var23, "ahv.ac(" + ')');
      }
   }

   void method4304() {
   }

   void method4305() {
   }

   void method4306(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field7598 = var2.method6371() * -653192821;
         break;
      case 1:
         this.field7599 = var2.method6374() * -8002361;
         break;
      case 2:
         this.field7596 = var2.method6374() * 334398233;
         break;
      case 3:
         this.field7601 = var2.method6374() * -2128158391;
         break;
      case 4:
         this.field7592 = var2.method6374() * 1340421019;
         break;
      case 5:
         this.field7603 = var2.method6374() * -420846851;
         break;
      case 6:
         this.field7604 = var2.method6371() * 1663137711;
         break;
      case 7:
         this.field7605 = var2.method6374() * 741927281;
         break;
      case 8:
         this.field7606 = var2.method6374() * 1393727635;
      }

   }

   void method4307() {
   }

   public class444() {
      super(0, true);
   }

   void method205(int var1) {
   }
}
