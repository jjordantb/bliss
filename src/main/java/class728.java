public class class728 {
   int[] field2452;
   boolean field2453 = true;
   int[] field2454;
   static int field2455 = 102;
   class545 field2456;
   class493 field2457;
   int[] field2458;
   public boolean field2459 = true;
   int field2460;
   int[][][] field2461;
   int field2462;
   class167[] field2463;
   int field2464;
   int[] field2465 = new int[2];
   int field2466;
   class167[] field2467;
   int field2468 = 0;
   class167[] field2469;
   static float field2470 = 3.0F;
   int[] field2471;
   int[] field2472;
   class167[] field2473;
   boolean field2474 = false;
   int[] field2475;
   int field2476;
   float[] field2477 = new float[3];
   static class848 field2478;
   int field2479 = -1;
   int field2480 = -1;
   boolean field2481 = true;

   final boolean method1646(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (!this.method1658(var1, var2, var3)) {
         return false;
      } else {
         var1 = (int)this.field2477[0];
         var2 = (int)this.field2477[1];
         var3 = (int)this.field2477[2];
         if (!this.method1658(var4, var5, var6)) {
            return false;
         } else {
            var4 = (int)this.field2477[0];
            var5 = (int)this.field2477[1];
            var6 = (int)this.field2477[2];
            if (!this.method1658(var7, var8, var9)) {
               return false;
            } else {
               var7 = (int)this.field2477[0];
               var8 = (int)this.field2477[1];
               var9 = (int)this.field2477[2];
               return this.field2457.method4427(var2, var5, var8, var1, var4, var7, var3, var6, var9);
            }
         }
      }
   }

   public void method1647(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != 8 && var1 != 16) {
         class190 var13 = this.field2456.field3861[var2][var3][var4];
         if (var13 == null) {
            this.field2456.field3861[var2][var3][var4] = var13 = new class190(var2);
         }

         if (var1 == 1) {
            var13.field7014 = (short)var5;
            var13.field7015 = (short)var6;
         } else if (var1 == 2) {
            var13.field7013 = (short)var5;
            var13.field7017 = (short)var6;
         }

         if (this.field2474) {
            this.method1659();
         }
      } else {
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if (var1 == 8) {
            var7 = var3 << this.field2456.field3849 * -1688804109;
            var8 = var7 + this.field2456.field3881 * 1828905535;
            var9 = var4 << this.field2456.field3849 * -1688804109;
            var10 = var9 + this.field2456.field3881 * 1828905535;
            var11 = this.field2456.field3864[var2].method3888(var3, var4, (byte)-46);
            var12 = this.field2456.field3864[var2].method3888(var3 + 1, var4 + 1, (byte)-53);
            this.field2473[this.field2466++] = new class167(this.field2456, var1, var2, var7, var8, var8, var7, var11, var12, var12 - var5, var11 - var5, var9, var10, var10, var9);
         } else {
            var7 = (var3 << this.field2456.field3849 * -1688804109) + this.field2456.field3881 * 1828905535;
            var8 = var7 - this.field2456.field3881 * 1828905535;
            var9 = var4 << this.field2456.field3849 * -1688804109;
            var10 = var9 + this.field2456.field3881 * 1828905535;
            var11 = this.field2456.field3864[var2].method3888(var3 + 1, var4, (byte)-128);
            var12 = this.field2456.field3864[var2].method3888(var3, var4 + 1, (byte)-126);
            this.field2473[this.field2466++] = new class167(this.field2456, var1, var2, var7, var8, var8, var7, var11, var12, var12 - var5, var11 - var5, var9, var10, var10, var9);
         }
      }

   }

   public void method1648(int var1, int var2, int var3, int var4) {
      if (var1 != 8 && var1 != 16) {
         class190 var7 = this.field2456.field3861[var2][var3][var4];
         if (var7 != null) {
            if (var1 == 1) {
               var7.field7014 = 0;
            } else if (var1 == 2) {
               var7.field7013 = 0;
            }
         }

         this.method1659();
      } else {
         for(int var5 = 0; var5 < this.field2466; ++var5) {
            class167 var6 = this.field2473[var5];
            if (var6.field6946 == var1 && var6.field6943 == var2 && (var6.field6951 == var3 && var6.field6944 == var4 || var6.field6945 == var3 && var6.field6947 == var4)) {
               if (var5 != this.field2466) {
                  System.arraycopy(this.field2473, var5 + 1, this.field2473, var5, this.field2473.length - (var5 + 1));
               }

               --this.field2466;
               break;
            }
         }
      }

   }

   void method1649(class848 var1, class167 var2, int var3) {
      field2478 = var1;
      int var4;
      if (this.field2454 != null && var2.field6943 >= var3) {
         for(var4 = 0; var4 < this.field2454.length; ++var4) {
            if (this.field2454[var4] != -1000000 && (var2.field6949[0] <= this.field2454[var4] || var2.field6949[1] <= this.field2454[var4] || var2.field6949[2] <= this.field2454[var4] || var2.field6949[3] <= this.field2454[var4]) && (var2.field6948[0] <= this.field2472[var4] || var2.field6948[1] <= this.field2472[var4] || var2.field6948[2] <= this.field2472[var4] || var2.field6948[3] <= this.field2472[var4]) && (var2.field6948[0] >= this.field2471[var4] || var2.field6948[1] >= this.field2471[var4] || var2.field6948[2] >= this.field2471[var4] || var2.field6948[3] >= this.field2471[var4]) && (var2.field6950[0] <= this.field2458[var4] || var2.field6950[1] <= this.field2458[var4] || var2.field6950[2] <= this.field2458[var4] || var2.field6950[3] <= this.field2458[var4]) && (var2.field6950[0] >= this.field2452[var4] || var2.field6950[1] >= this.field2452[var4] || var2.field6950[2] >= this.field2452[var4] || var2.field6950[3] >= this.field2452[var4])) {
               return;
            }
         }
      }

      int var5;
      int var6;
      boolean var7;
      float var8;
      if (var2.field6946 == 1) {
         var4 = var2.field6951 - this.field2456.field3898 * -804213305 + this.field2456.field3883 * 583010427;
         if (var4 >= 0 && var4 <= this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427) {
            var5 = var2.field6944 - this.field2456.field3858 * 465603579 + this.field2456.field3883 * 583010427;
            if (var5 < 0) {
               var5 = 0;
            } else if (var5 > this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427) {
               return;
            }

            var6 = var2.field6947 - this.field2456.field3858 * 465603579 + this.field2456.field3883 * 583010427;
            if (var6 > this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427) {
               var6 = this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427;
            } else if (var6 < 0) {
               return;
            }

            var7 = false;

            while(var5 <= var6) {
               if (this.field2456.field3908[var4][var5++]) {
                  var7 = true;
                  break;
               }
            }

            if (var7) {
               var8 = (float)(this.field2456.field3887 * -343859235 - var2.field6948[0]);
               if (var8 < 0.0F) {
                  var8 *= -1.0F;
               }

               if (var8 >= (float)this.field2460 && this.method1656(var2, 0) && this.method1656(var2, 1) && this.method1656(var2, 2) && this.method1656(var2, 3)) {
                  this.field2469[this.field2468++] = var2;
               }
            }
         }
      } else if (var2.field6946 == 2) {
         var4 = var2.field6944 - this.field2456.field3858 * 465603579 + this.field2456.field3883 * 583010427;
         if (var4 >= 0 && var4 <= this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427) {
            var5 = var2.field6951 - this.field2456.field3898 * -804213305 + this.field2456.field3883 * 583010427;
            if (var5 < 0) {
               var5 = 0;
            } else if (var5 > this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427) {
               return;
            }

            var6 = var2.field6945 - this.field2456.field3898 * -804213305 + this.field2456.field3883 * 583010427;
            if (var6 > this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427) {
               var6 = this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427;
            } else if (var6 < 0) {
               return;
            }

            var7 = false;

            while(var5 <= var6) {
               if (this.field2456.field3908[var5++][var4]) {
                  var7 = true;
                  break;
               }
            }

            if (var7) {
               var8 = (float)(this.field2456.field3888 * -1526003751 - var2.field6950[0]);
               if (var8 < 0.0F) {
                  var8 *= -1.0F;
               }

               if (var8 >= (float)this.field2460 && this.method1656(var2, 0) && this.method1656(var2, 1) && this.method1656(var2, 2) && this.method1656(var2, 3)) {
                  this.field2469[this.field2468++] = var2;
               }
            }
         }
      } else if (var2.field6946 != 16 && var2.field6946 != 8) {
         if (var2.field6946 == 4) {
            float var12 = (float)(var2.field6949[0] - this.field2456.field3889 * 2104557959);
            if (var12 > (float)this.field2476) {
               var5 = var2.field6944 - this.field2456.field3858 * 465603579 + this.field2456.field3883 * 583010427;
               if (var5 < 0) {
                  var5 = 0;
               } else if (var5 > this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427) {
                  return;
               }

               var6 = var2.field6947 - this.field2456.field3858 * 465603579 + this.field2456.field3883 * 583010427;
               if (var6 > this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427) {
                  var6 = this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427;
               } else if (var6 < 0) {
                  return;
               }

               int var15 = var2.field6951 - this.field2456.field3898 * -804213305 + this.field2456.field3883 * 583010427;
               if (var15 < 0) {
                  var15 = 0;
               } else if (var15 > this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427) {
                  return;
               }

               int var16 = var2.field6945 - this.field2456.field3898 * -804213305 + this.field2456.field3883 * 583010427;
               if (var16 > this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427) {
                  var16 = this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427;
               } else if (var16 < 0) {
                  return;
               }

               boolean var9 = false;

               label211:
               for(int var10 = var15; var10 <= var16; ++var10) {
                  for(int var11 = var5; var11 <= var6; ++var11) {
                     if (this.field2456.field3908[var10][var11]) {
                        var9 = true;
                        break label211;
                     }
                  }
               }

               if (var9 && this.method1656(var2, 0) && this.method1656(var2, 1) && this.method1656(var2, 2) && this.method1656(var2, 3)) {
                  this.field2469[this.field2468++] = var2;
               }
            }
         }
      } else {
         var4 = var2.field6951 - this.field2456.field3898 * -804213305 + this.field2456.field3883 * 583010427;
         if (var4 >= 0 && var4 <= this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427) {
            var5 = var2.field6944 - this.field2456.field3858 * 465603579 + this.field2456.field3883 * 583010427;
            if (var5 >= 0 && var5 <= this.field2456.field3883 * 583010427 + this.field2456.field3883 * 583010427 && this.field2456.field3908[var4][var5]) {
               float var13 = (float)(this.field2456.field3887 * -343859235 - var2.field6948[0]);
               if (var13 < 0.0F) {
                  var13 *= -1.0F;
               }

               float var14 = (float)(this.field2456.field3888 * -1526003751 - var2.field6950[0]);
               if (var14 < 0.0F) {
                  var14 *= -1.0F;
               }

               if ((var13 >= (float)this.field2460 || var14 >= (float)this.field2460) && this.method1656(var2, 0) && this.method1656(var2, 1) && this.method1656(var2, 2) && this.method1656(var2, 3)) {
                  this.field2469[this.field2468++] = var2;
               }
            }
         }
      }

   }

   public void method1650(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.field2463[this.field2462++] = new class167(this.field2456, var1, var2, var3, var4, var4, var3, var7, var8, var8, var7, var5, var5, var6, var6);
   }

   class728(class545 var1) {
      this.field2460 = var1.field3881 * 1828905535;
      this.field2476 = var1.field3881 * 1828905535;
      this.field2456 = var1;
      this.field2463 = new class167[535];
      this.field2462 = 0;
      this.field2467 = new class167[2045];
      this.field2464 = 0;
      this.field2473 = new class167[1027];
      this.field2466 = 0;
      this.field2469 = new class167[1045];
      this.field2468 = 0;
      this.field2461 = new int[this.field2456.field3893 * 1678382205][this.field2456.field3859 * 1988988347 + 1][this.field2456.field3894 * 1340714547 + 1];
      this.field2474 = false;
      if (this.field2456.field3853 instanceof class955) {
         this.field2459 = false;
      } else {
         this.field2459 = true;
      }

      if (this.field2459) {
         this.field2457 = new class493(this);
      }

   }

   boolean method1651(int var1, int var2, int var3) {
      if (this.field2459 && this.field2453) {
         if (this.field2457.field7853 < 102) {
            return false;
         } else {
            int var4 = this.field2461[var1][var2][var3];
            if (var4 == -(this.field2456.field3890 * -847572923)) {
               return false;
            } else if (var4 == this.field2456.field3890 * -847572923) {
               return true;
            } else if (this.field2456.field3862 == this.field2456.field3866) {
               return false;
            } else {
               int var5 = var2 << this.field2456.field3849 * -1688804109;
               int var6 = var3 << this.field2456.field3849 * -1688804109;
               if (this.method1646(var5 + 1, this.field2456.field3862[var1].method3888(var2, var3, (byte)-88), var6 + 1, var5 + this.field2456.field3881 * 1828905535 - 1, this.field2456.field3862[var1].method3888(var2 + 1, var3 + 1, (byte)-108), var6 + this.field2456.field3881 * 1828905535 - 1, var5 + 1, this.field2456.field3862[var1].method3888(var2, var3 + 1, (byte)-91), var6 + this.field2456.field3881 * 1828905535 - 1) && this.method1646(var5 + 1, this.field2456.field3862[var1].method3888(var2, var3, (byte)-42), var6 + 1, var5 + this.field2456.field3881 * 1828905535 - 1, this.field2456.field3862[var1].method3888(var2 + 1, var3, (byte)-46), var6 + 1, var5 + this.field2456.field3881 * 1828905535 - 1, this.field2456.field3862[var1].method3888(var2 + 1, var3 + 1, (byte)-12), var6 + this.field2456.field3881 * 1828905535 - 1)) {
                  this.field2461[var1][var2][var3] = this.field2456.field3890 * -847572923;
                  return true;
               } else {
                  this.field2461[var1][var2][var3] = -(this.field2456.field3890 * -847572923);
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   boolean method1652(class676 var1, int var2, int var3, int var4) {
      if (this.field2459 && this.field2453) {
         if (this.field2457.field7853 < 102) {
            return false;
         } else if (!this.method1651(var2, var3, var4)) {
            return false;
         } else {
            int var5 = var3 << this.field2456.field3849 * -1688804109;
            int var6 = var4 << this.field2456.field3849 * -1688804109;
            int var7 = this.field2456.field3862[var2].method3888(var3, var4, (byte)-91) - 1;
            int var8 = var7 + var1.method2168(1951240662);
            if (var1.field7433 == 1) {
               if (!this.method1646(var5, var7, var6, var5, var8, var6, var5, var8, var6 + this.field2456.field3881 * 1828905535)) {
                  return false;
               } else {
                  return this.method1646(var5, var7, var6, var5, var8, var6 + this.field2456.field3881 * 1828905535, var5, var7, var6 + this.field2456.field3881 * 1828905535);
               }
            } else if (var1.field7433 == 2) {
               if (!this.method1646(var5, var7, var6 + this.field2456.field3881 * 1828905535, var5 + this.field2456.field3881 * 1828905535, var8, var6 + this.field2456.field3881 * 1828905535, var5, var8, var6 + this.field2456.field3881 * 1828905535)) {
                  return false;
               } else {
                  return this.method1646(var5, var7, var6 + this.field2456.field3881 * 1828905535, var5 + this.field2456.field3881 * 1828905535, var7, var6 + this.field2456.field3881 * 1828905535, var5 + this.field2456.field3881 * 1828905535, var8, var6 + this.field2456.field3881 * 1828905535);
               }
            } else if (var1.field7433 == 4) {
               if (!this.method1646(var5 + this.field2456.field3881 * 1828905535, var7, var6, var5 + this.field2456.field3881 * 1828905535, var8, var6, var5 + this.field2456.field3881 * 1828905535, var8, var6 + this.field2456.field3881 * 1828905535)) {
                  return false;
               } else {
                  return this.method1646(var5 + this.field2456.field3881 * 1828905535, var7, var6, var5 + this.field2456.field3881 * 1828905535, var8, var6 + this.field2456.field3881 * 1828905535, var5 + this.field2456.field3881 * 1828905535, var7, var6 + this.field2456.field3881 * 1828905535);
               }
            } else if (var1.field7433 == 8) {
               if (!this.method1646(var5, var7, var6, var5 + this.field2456.field3881 * 1828905535, var8, var6, var5, var8, var6)) {
                  return false;
               } else {
                  return this.method1646(var5, var7, var6, var5 + this.field2456.field3881 * 1828905535, var7, var6, var5 + this.field2456.field3881 * 1828905535, var8, var6);
               }
            } else if (var1.field7433 == 16) {
               return this.method1657(var5, var7, var6 + this.field2456.field3891 * 394962841, this.field2456.field3891 * 394962841, var8, this.field2456.field3891 * 394962841);
            } else if (var1.field7433 == 32) {
               return this.method1657(var5 + this.field2456.field3891 * 394962841, var7, var6 + this.field2456.field3891 * 394962841, this.field2456.field3891 * 394962841, var8, this.field2456.field3891 * 394962841);
            } else if (var1.field7433 == 64) {
               return this.method1657(var5 + this.field2456.field3891 * 394962841, var7, var6, this.field2456.field3891 * 394962841, var8, this.field2456.field3891 * 394962841);
            } else if (var1.field7433 == 128) {
               return this.method1657(var5, var7, var6, this.field2456.field3891 * 394962841, var8, this.field2456.field3891 * 394962841);
            } else {
               return true;
            }
         }
      } else {
         return false;
      }
   }

   boolean method1653(int var1, int var2, int var3, int var4) {
      if (this.field2459 && this.field2453) {
         if (this.field2457.field7853 < 102) {
            return false;
         } else if (!this.method1651(var1, var2, var3)) {
            return false;
         } else {
            int var5 = var2 << this.field2456.field3849 * -1688804109;
            int var6 = var3 << this.field2456.field3849 * -1688804109;
            return this.method1657(var5, this.field2456.field3862[var1].method3888(var2, var3, (byte)-113), var6, this.field2456.field3881 * 1828905535, var4, this.field2456.field3881 * 1828905535);
         }
      } else {
         return false;
      }
   }

   boolean method1654(int var1, int var2, int var3, int var4, int var5, class719 var6) {
      if (this.field2459 && this.field2453) {
         if (this.field2457.field7853 < 102) {
            return false;
         } else if (var2 == var3 && var4 == var5) {
            if (!this.method1651(var1, var2, var4)) {
               return false;
            } else {
               return this.method1655(var6);
            }
         } else {
            for(int var7 = var2; var7 <= var3; ++var7) {
               for(int var8 = var4; var8 <= var5; ++var8) {
                  if (this.field2461[var1][var7][var8] == -(this.field2456.field3890 * -847572923)) {
                     return false;
                  }
               }
            }

            if (!this.method1655(var6)) {
               return false;
            } else {
               return true;
            }
         }
      } else {
         return false;
      }
   }

   final boolean method1655(class719 var1) {
      return var1 == null ? false : this.method1657(var1.field3485, var1.field3487, var1.field3488, var1.field3489 - var1.field3485, var1.field3482 - var1.field3487, var1.field3490 - var1.field3488);
   }

   boolean method1656(class167 var1, int var2) {
      if (!this.method1658(var1.field6948[var2], var1.field6949[var2], var1.field6950[var2])) {
         return false;
      } else {
         var1.field6938[var2] = (short)((int)this.field2477[0]);
         var1.field6952[var2] = (short)((int)this.field2477[1]);
         var1.field6953[var2] = (short)((int)this.field2477[2]);
         return true;
      }
   }

   final boolean method1657(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var4;
      int var8 = var2 + var5;
      int var9 = var3 + var6;
      if (!this.method1646(var1, var8, var3, var7, var8, var9, var1, var8, var9)) {
         return false;
      } else if (!this.method1646(var1, var8, var3, var7, var8, var3, var7, var8, var9)) {
         return false;
      } else {
         if (var1 < this.field2456.field3887 * -343859235) {
            if (!this.method1646(var1, var2, var9, var1, var8, var3, var1, var8, var9)) {
               return false;
            }

            if (!this.method1646(var1, var2, var9, var1, var2, var3, var1, var8, var3)) {
               return false;
            }
         } else {
            if (!this.method1646(var7, var2, var9, var7, var8, var3, var7, var8, var9)) {
               return false;
            }

            if (!this.method1646(var7, var2, var9, var7, var2, var3, var7, var8, var3)) {
               return false;
            }
         }

         if (var3 < this.field2456.field3888 * -1526003751) {
            if (!this.method1646(var1, var2, var3, var7, var8, var3, var1, var8, var3)) {
               return false;
            }

            if (!this.method1646(var1, var2, var3, var7, var2, var3, var7, var8, var3)) {
               return false;
            }
         } else {
            if (!this.method1646(var1, var2, var9, var7, var8, var9, var1, var8, var9)) {
               return false;
            }

            if (!this.method1646(var1, var2, var9, var7, var2, var9, var7, var8, var9)) {
               return false;
            }
         }

         return true;
      }
   }

   final boolean method1658(int var1, int var2, int var3) {
      field2478.method4890((float)var1, (float)var2, (float)var3, this.field2477);
      if (this.field2477[2] < 50.0F) {
         return false;
      } else {
         this.field2477[0] /= 3.0F;
         this.field2477[1] /= 3.0F;
         return true;
      }
   }

   void method1659() {
      int var1;
      for(var1 = 0; var1 < this.field2464; ++var1) {
         this.field2467[var1] = null;
      }

      this.field2464 = 0;

      int var2;
      int var3;
      class190 var4;
      for(var1 = 0; var1 < this.field2456.field3893 * 1678382205; ++var1) {
         for(var2 = 0; var2 < this.field2456.field3859 * 1988988347; ++var2) {
            for(var3 = 0; var3 < this.field2456.field3894 * 1340714547; ++var3) {
               var4 = this.field2456.field3861[var1][var3][var2];
               if (var4 != null) {
                  if (var4.field7014 > 0) {
                     var4.field7014 = (short)(var4.field7014 * -1);
                  }

                  if (var4.field7013 > 0) {
                     var4.field7013 = (short)(var4.field7013 * -1);
                  }
               }
            }
         }
      }

      for(var1 = 0; var1 < this.field2456.field3893 * 1678382205; ++var1) {
         for(var2 = 0; var2 < this.field2456.field3859 * 1988988347; ++var2) {
            for(var3 = 0; var3 < this.field2456.field3894 * 1340714547; ++var3) {
               var4 = this.field2456.field3861[var1][var3][var2];
               if (var4 != null) {
                  boolean var5 = this.field2456.field3861[0][var3][var2] != null && this.field2456.field3861[0][var3][var2].field7005 != null;
                  int var6;
                  int var7;
                  int var9;
                  class190 var10;
                  int var11;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  int var16;
                  int var17;
                  int var18;
                  int var19;
                  int var20;
                  int var21;
                  if (var4.field7014 < 0) {
                     var6 = var2;
                     var7 = var2;
                     var9 = var1;
                     var10 = this.field2456.field3861[var1][var3][var2 - 1];

                     for(var11 = this.field2456.field3864[var1].method3888(var3, var2, (byte)-58); var6 > 0 && var10 != null && var10.field7014 < 0 && var10.field7014 == var4.field7014 && var10.field7015 == var4.field7015 && var11 == this.field2456.field3864[var1].method3888(var3, var6 - 1, (byte)-78) && (var6 - 1 <= 0 || var11 == this.field2456.field3864[var1].method3888(var3, var6 - 2, (byte)-92)); var10 = this.field2456.field3861[var1][var3][var6 - 1]) {
                        --var6;
                     }

                     for(var10 = this.field2456.field3861[var1][var3][var2 + 1]; var7 < this.field2456.field3894 * 1340714547 && var10 != null && var10.field7014 < 0 && var10.field7014 == var4.field7014 && var10.field7015 == var4.field7015 && var11 == this.field2456.field3864[var1].method3888(var3, var7 + 1, (byte)-51) && (var7 + 1 >= this.field2456.field3894 * 1340714547 || var11 == this.field2456.field3864[var1].method3888(var3, var7 + 2, (byte)-31)); var10 = this.field2456.field3861[var1][var3][var7 + 1]) {
                        ++var7;
                     }

                     var12 = var1 - var1 + 1;
                     var13 = this.field2456.field3864[var5 ? var1 + 1 : var1].method3888(var3, var6, (byte)-52);
                     var14 = var13 + var4.field7014 * var12;
                     var15 = this.field2456.field3864[var5 ? var1 + 1 : var1].method3888(var3, var7 + 1, (byte)-12);
                     var16 = var15 + var4.field7014 * var12;
                     var17 = var3 << this.field2456.field3849 * -1688804109;
                     var18 = var6 << this.field2456.field3849 * -1688804109;
                     var19 = (var7 << this.field2456.field3849 * -1688804109) + this.field2456.field3881 * 1828905535;
                     this.field2467[this.field2464++] = new class167(this.field2456, 1, var1, var17 + var4.field7015, var17 + var4.field7015, var17 + var4.field7015, var17 + var4.field7015, var13, var15, var16, var14, var18, var19, var19, var18);

                     for(var20 = var1; var20 <= var9; ++var20) {
                        for(var21 = var6; var21 <= var7; ++var21) {
                           this.field2456.field3861[var20][var3][var21].field7014 = (short)(this.field2456.field3861[var20][var3][var21].field7014 * -1);
                        }
                     }
                  }

                  if (var4.field7013 < 0) {
                     var6 = var3;
                     var7 = var3;
                     var9 = var1;
                     var10 = this.field2456.field3861[var1][var3 - 1][var2];

                     for(var11 = this.field2456.field3864[var1].method3888(var3, var2, (byte)-77); var6 > 0 && var10 != null && var10.field7013 < 0 && var10.field7013 == var4.field7013 && var10.field7017 == var4.field7017 && var11 == this.field2456.field3864[var1].method3888(var6 - 1, var2, (byte)-104) && (var6 - 1 <= 0 || var11 == this.field2456.field3864[var1].method3888(var6 - 2, var2, (byte)-71)); var10 = this.field2456.field3861[var1][var6 - 1][var2]) {
                        --var6;
                     }

                     for(var10 = this.field2456.field3861[var1][var3 + 1][var2]; var7 < this.field2456.field3859 * 1988988347 && var10 != null && var10.field7013 < 0 && var10.field7013 == var4.field7013 && var10.field7017 == var4.field7017 && var11 == this.field2456.field3864[var1].method3888(var7 + 1, var2, (byte)-31) && (var7 + 1 >= this.field2456.field3859 * 1988988347 || var11 == this.field2456.field3864[var1].method3888(var7 + 2, var2, (byte)-27)); var10 = this.field2456.field3861[var1][var7 + 1][var2]) {
                        ++var7;
                     }

                     var12 = var1 - var1 + 1;
                     var13 = this.field2456.field3864[var5 ? var1 + 1 : var1].method3888(var6, var2, (byte)-116);
                     var14 = var13 + var4.field7013 * var12;
                     var15 = this.field2456.field3864[var5 ? var1 + 1 : var1].method3888(var7 + 1, var2, (byte)-68);
                     var16 = var15 + var4.field7013 * var12;
                     var17 = var6 << this.field2456.field3849 * -1688804109;
                     var18 = (var7 << this.field2456.field3849 * -1688804109) + this.field2456.field3881 * 1828905535;
                     var19 = var2 << this.field2456.field3849 * -1688804109;
                     this.field2467[this.field2464++] = new class167(this.field2456, 2, var1, var17, var18, var18, var17, var13, var15, var16, var14, var19 + var4.field7017, var19 + var4.field7017, var19 + var4.field7017, var19 + var4.field7017);

                     for(var20 = var1; var20 <= var9; ++var20) {
                        for(var21 = var6; var21 <= var7; ++var21) {
                           this.field2456.field3861[var20][var21][var2].field7013 = (short)(this.field2456.field3861[var20][var21][var2].field7013 * -1);
                        }
                     }
                  }
               }
            }
         }
      }

      this.field2474 = true;
   }

   public void method1660() {
      this.method1659();
   }

   void method1661(class848 var1, int var2) {
      field2478 = var1;
      if (this.field2459 && this.field2453) {
         if (this.field2481) {
            this.field2456.field3854.method6163(1748002530);
         }

         field2478.method4812(this.field2465);
         if (this.field2479 != (int)((float)this.field2465[0] / 3.0F) || this.field2480 != (int)((float)this.field2465[1] / 3.0F)) {
            this.field2479 = (int)((float)this.field2465[0] / 3.0F);
            this.field2480 = (int)((float)this.field2465[1] / 3.0F);
            this.field2475 = new int[this.field2479 * this.field2480];
         }

         this.field2468 = 0;

         int var3;
         for(var3 = 0; var3 < this.field2462; ++var3) {
            this.method1649(field2478, this.field2463[var3], var2);
         }

         for(var3 = 0; var3 < this.field2464; ++var3) {
            this.method1649(field2478, this.field2467[var3], var2);
         }

         for(var3 = 0; var3 < this.field2466; ++var3) {
            this.method1649(field2478, this.field2473[var3], var2);
         }

         this.field2457.field7853 = 0;
         if (this.field2468 > 0) {
            var3 = this.field2475.length;
            int var4 = var3 - var3 & 7;

            int var5;
            for(var5 = 0; var5 < var4; this.field2475[var5++] = Integer.MAX_VALUE) {
               this.field2475[var5++] = Integer.MAX_VALUE;
               this.field2475[var5++] = Integer.MAX_VALUE;
               this.field2475[var5++] = Integer.MAX_VALUE;
               this.field2475[var5++] = Integer.MAX_VALUE;
               this.field2475[var5++] = Integer.MAX_VALUE;
               this.field2475[var5++] = Integer.MAX_VALUE;
               this.field2475[var5++] = Integer.MAX_VALUE;
            }

            while(var5 < var3) {
               this.field2475[var5++] = Integer.MAX_VALUE;
            }

            this.field2457.field7858 = 1;

            for(int var6 = 0; var6 < this.field2468; ++var6) {
               class167 var7 = this.field2469[var6];
               this.field2457.method4427(var7.field6952[0], var7.field6952[1], var7.field6952[3], var7.field6938[0], var7.field6938[1], var7.field6938[3], var7.field6953[0], var7.field6953[1], var7.field6953[3]);
               this.field2457.method4427(var7.field6952[1], var7.field6952[2], var7.field6952[3], var7.field6938[1], var7.field6938[2], var7.field6938[3], var7.field6953[1], var7.field6953[2], var7.field6953[3]);
            }

            this.field2457.field7858 = 2;
         }

         if (this.field2481) {
            this.field2456.field3854.method6163(140602310);
         }
      } else {
         this.field2468 = 0;
      }

   }
}
