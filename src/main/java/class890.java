import java.util.Arrays;

public class class890 {
   int field9267;
   public int field9268;
   static int field9269;
   public static class764 field9270;

   public boolean method5551(int var1, int var2, int var3, byte var4) {
      try {
         int var5 = this.field9267;
         if (var1 == this.field9268 && this.field9267 == 0) {
            return false;
         } else {
            boolean var6;
            int var7;
            if (this.field9267 != 0) {
               int var8;
               if (this.field9267 > 0 && var1 > this.field9268) {
                  var7 = this.field9267 * this.field9267 / (var2 * 2);
                  var8 = var7 + this.field9268;
                  if (var8 < var1 && var8 >= this.field9268) {
                     var6 = true;
                  } else {
                     var6 = false;
                  }
               } else if (this.field9267 < 0 && var1 < this.field9268) {
                  var7 = this.field9267 * this.field9267 / (2 * var2);
                  var8 = this.field9268 - var7;
                  if (var8 > var1 && var8 <= this.field9268) {
                     var6 = true;
                  } else {
                     var6 = false;
                  }
               } else {
                  var6 = false;
               }
            } else {
               if (var1 > this.field9268 && var1 <= var2 + this.field9268 || var1 < this.field9268 && var1 >= this.field9268 - var2) {
                  this.field9268 = var1;
                  return false;
               }

               var6 = true;
            }

            if (var6) {
               if (var1 > this.field9268) {
                  this.field9267 += var2;
                  if (var3 != 0 && this.field9267 > var3) {
                     this.field9267 = var3;
                  }
               } else {
                  this.field9267 -= var2;
                  if (var3 != 0 && this.field9267 < -var3) {
                     this.field9267 = -var3;
                  }
               }

               if (var5 != this.field9267) {
                  var7 = this.field9267 * this.field9267 / (var2 * 2);
                  if (var1 > this.field9268) {
                     if (var7 + this.field9268 > var1) {
                        this.field9267 = var5;
                     }
                  } else if (var1 < this.field9268 && this.field9268 - var7 < var1) {
                     this.field9267 = var5;
                  }
               }
            } else if (this.field9267 > 0) {
               this.field9267 -= var2;
               if (this.field9267 < 0) {
                  this.field9267 = 0;
               }
            } else {
               this.field9267 += var2;
               if (this.field9267 > 0) {
                  this.field9267 = 0;
               }
            }

            this.field9268 += this.field9267 + var5 >> 1;
            return var6;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "q.a(" + ')');
      }
   }

   public void method5552(int var1, int var2) {
      try {
         this.field9268 = var1;
         this.field9267 = 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "q.f(" + ')');
      }
   }

   public int method5553(byte var1) {
      try {
         return this.field9268 & 16383;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "q.b(" + ')');
      }
   }

   public void method5554(byte var1) {
      try {
         this.field9268 &= 16383;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "q.p(" + ')');
      }
   }

   static void method5555(class245 var0, byte var1) {
      try {
         class215.field7206 = var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "q.q(" + ')');
      }
   }

   static void method5556(class744 var0, int var1) {
      try {
         var0.field3161[var0.field3156 - 1] = class735.field3009.method4224(var0.field3161[var0.field3156 - 1], 245040087).field9004 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "q.i(" + ')');
      }
   }

   static final void method5557(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)4);
         class131 var4 = class382.field1410[var2 >> 16];
         class75.method1118(var3, var4, false, 0, var0, 1906637065);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "q.hs(" + ')');
      }
   }

   static final void method5558(class744 var0, byte var1) {
      try {
         if (class381.field1417.method1392(86, 2033280350)) {
            var0.field3161[++var0.field3156 - 1] = 1;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "q.add(" + ')');
      }
   }

   public static void method5559(Player var0, int var1, int var2, int var3) {
      try {
         int[] var4 = new int[class458.method3829((byte)-113).length];
         Arrays.fill(var4, 0, var4.length, var1);
         class488.method4740(var0, var4, var2, false, (byte)-13);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "q.ij(" + ')');
      }
   }

   static boolean method5560(class848 var0, class392 var1, class718 var2, int var3, int var4, int var5) {
      try {
         int var6 = Integer.MAX_VALUE;
         int var7 = Integer.MIN_VALUE;
         int var8 = Integer.MAX_VALUE;
         int var9 = Integer.MIN_VALUE;
         if (var2.field3518 != null) {
            var6 = class491.field7796 + (var1.field5395 + var2.field3519 - class491.field7805) * (class491.field7831 - class491.field7796) / (class491.field7827 - class491.field7805);
            var7 = (var2.field3508 + var1.field5395 - class491.field7805) * (class491.field7831 - class491.field7796) / (class491.field7827 - class491.field7805) + class491.field7796;
            var9 = class491.field7832 - (var2.field3520 + var1.field5398 - class491.field7817) * (class491.field7832 - class491.field7830) / (class491.field7816 - class491.field7817);
            var8 = class491.field7832 - (var2.field3522 + var1.field5398 - class491.field7817) * (class491.field7832 - class491.field7830) / (class491.field7816 - class491.field7817);
         }

         class48 var10 = null;
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         if (-1 != var2.field3500) {
            if (var1.field5399 && -1 != var2.field3494) {
               var10 = var2.method2064(var0, true, -1522042693);
            } else {
               var10 = var2.method2064(var0, false, 857159502);
            }

            if (var10 != null) {
               var11 = var1.field5397 - (var10.method5594() + 1 >> 1);
               if (var11 < var6) {
                  var6 = var11;
               }

               var12 = var1.field5397 + (var10.method5594() + 1 >> 1);
               if (var12 > var7) {
                  var7 = var12;
               }

               var13 = var1.field5394 - (var10.method3109() + 1 >> 1);
               if (var13 < var8) {
                  var8 = var13;
               }

               var14 = var1.field5394 + (var10.method3109() + 1 >> 1);
               if (var14 > var9) {
                  var9 = var14;
               }
            }
         }

         class219 var15 = null;
         int var16 = 0;
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         int var20 = 0;
         int var21 = 0;
         int var22 = 0;
         int var23 = 0;
         int var24;
         if (var2.field3507 != null) {
            var15 = class783.method2496(var2.field3498, (byte)-97);
            if (var15 != null) {
               var16 = class295.field10474.method4598(var2.field3507, (int[])null, class740.field3212, (class653[])null, (byte)20);
               var17 = var2.field3527 * (class491.field7831 - class491.field7796) / (class491.field7827 - class491.field7805) + var1.field5397;
               var18 = var1.field5394 - var2.field3528 * (class491.field7832 - class491.field7830) / (class491.field7816 - class491.field7817);
               if (var10 == null) {
                  var18 -= var15.method3970() * var16 / 2;
               } else {
                  var18 -= (var10.method3109() >> 1) + var15.method3973() * var16;
               }

               for(var24 = 0; var24 < var16; ++var24) {
                  String var25 = class740.field3212[var24];
                  if (var24 < var16 - 1) {
                     var25 = var25.substring(0, var25.length() - 4);
                  }

                  int var26 = var15.method3971(var25);
                  if (var26 > var19) {
                     var19 = var26;
                  }
               }

               var20 = var17 - var19 / 2 + var3;
               if (var20 < var6) {
                  var6 = var20;
               }

               var21 = var3 + var17 + var19 / 2;
               if (var21 > var7) {
                  var7 = var21;
               }

               var22 = var4 + var18;
               if (var22 < var8) {
                  var8 = var22;
               }

               var23 = var18 + var16 * var15.method3973() + var4;
               if (var23 > var9) {
                  var9 = var23;
               }
            }
         }

         if (var7 >= class491.field7796 && var6 <= class491.field7831 && var9 >= class491.field7830 && var8 <= class491.field7832) {
            class740.method4418(var0, var1, var2);
            if (var10 != null) {
               if (class10.field6652 > 0 && (class740.field3207 != -1 && class740.field3207 == var1.field5396 || class740.field3204 != -1 && class740.field3204 == var2.field3532)) {
                  if (class622.field9010 > 50) {
                     var24 = 200 - class622.field9010 * 2;
                  } else {
                     var24 = class622.field9010 * 2;
                  }

                  int var29 = var24 << 24 | 16776960;
                  var0.method4834(var1.field5397, var1.field5394, var10.method3106() / 2 + 7, var29, -675033662);
                  var0.method4834(var1.field5397, var1.field5394, var10.method3106() / 2 + 5, var29, -675033662);
                  var0.method4834(var1.field5397, var1.field5394, var10.method3106() / 2 + 3, var29, -675033662);
                  var0.method4834(var1.field5397, var1.field5394, var10.method3106() / 2 + 1, var29, -675033662);
                  var0.method4834(var1.field5397, var1.field5394, var10.method3106() / 2, var29, -675033662);
               }

               var10.method3128(var1.field5397 - (var10.method5594() >> 1), var1.field5394 - (var10.method3109() >> 1));
            }

            if (var2.field3507 != null && var15 != null) {
               class276.method6618(var0, var1, var2, var16, var17, var18, var19, var15, -1957009990);
            }

            if (-1 != var2.field3500 || var2.field3507 != null) {
               class960 var28 = new class960(var1);
               var28.field3649 = var11;
               var28.field3644 = var12;
               var28.field3645 = var13;
               var28.field3650 = var14;
               var28.field3651 = var20;
               var28.field3648 = var21;
               var28.field3647 = var22;
               var28.field3643 = var23;
               class439.field7537.method897(var28, 267740013);
            }

            return false;
         } else {
            return true;
         }
      } catch (RuntimeException var27) {
         throw class158.method3445(var27, "q.bi(" + ')');
      }
   }

   static void method5561(class744 var0, int var1) {
      try {
         var0.field3161[var0.field3156 - 1] = class735.field3009.method4224(var0.field3161[var0.field3156 - 1], 245040087).field8991;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "q.k(" + ')');
      }
   }
}
