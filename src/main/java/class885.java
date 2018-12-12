public class class885 extends class454 {
   class257 field10037;
   float field10038;
   float field10039;
   static boolean field10040 = false;
   static int field10041 = 4;
   static int field10042 = 1;
   static boolean field10043 = true;
   class67[][] field10044;
   int field10045;
   class805[][] field10046;
   class796[][] field10047;
   class786[][] field10048;
   static int field10049 = -1694498816;
   float field10050;
   float field10051;
   float field10052;
   float field10053;
   float field10054;
   float field10055;
   static int field10056 = 64;
   float field10057;
   float field10058;
   float field10059;
   float field10060;
   float field10061;
   float field10062;
   float field10063;
   float field10064;
   byte[][] field10065;
   byte[][] field10066;
   static boolean field10067 = true;
   class970[][] field10068;
   static int field10069 = 2;

   public void method3893(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   public void method3881(int var1, int var2, int var3) {
      if (this.field10066[var1][var2] < var3) {
         this.field10066[var1][var2] = (byte)var3;
      }

   }

   public void method3883(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      if (this.field10044 == null) {
         this.field10044 = new class67[this.field7226 * -506105871][this.field7225 * -1148794921];
         this.field10048 = new class786[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10046 != null || this.field10068 != null) {
         throw new IllegalStateException();
      }

      boolean var16 = false;
      int var18;
      int var19;
      if (var10.length == 2 && var7.length == 2 && (var10[0] == var10[1] || var12[0] != -1 && var12[0] == var12[1])) {
         var16 = true;

         for(int var17 = 1; var17 < 2; ++var17) {
            var18 = var3[var7[var17]];
            var19 = var5[var7[var17]];
            if (var18 != 0 && var18 != this.field7227 * -1212653763 || var19 != 0 && var19 != this.field7227 * -1212653763) {
               var16 = false;
               break;
            }
         }
      }

      if (!var16) {
         class786 var25 = new class786();
         short var27 = (short)var3.length;
         short var28 = (short)var10.length;
         var25.field3796 = var27;
         var25.field3802 = new short[var27];
         var25.field3799 = new short[var27];
         var25.field3800 = new short[var27];
         var25.field3801 = new short[var27];

         int var21;
         int var22;
         int var23;
         for(int var20 = 0; var20 < var27; ++var20) {
            var21 = var3[var20];
            var22 = var5[var20];
            int var24;
            if (var21 == 0 && var22 == 0) {
               var25.field3802[var20] = (short)(this.field10065[var1][var2] - this.field10066[var1][var2]);
            } else if (var21 == 0 && var22 == this.field7227 * -1212653763) {
               var25.field3802[var20] = (short)(this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]);
            } else if (var21 == this.field7227 * -1212653763 && var22 == this.field7227 * -1212653763) {
               var25.field3802[var20] = (short)(this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]);
            } else if (var21 == this.field7227 * -1212653763 && var22 == 0) {
               var25.field3802[var20] = (short)(this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]);
            } else {
               var23 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var21;
               var24 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var21;
               var25.field3802[var20] = (short)(var23 * (this.field7227 * -1212653763 - var22) + var24 * var22 >> this.field7228 * 20267538);
            }

            var23 = (var1 << this.field7228 * -2137349879) + var21;
            var24 = (var2 << this.field7228 * -2137349879) + var22;
            var25.field3799[var20] = (short)var21;
            var25.field3801[var20] = (short)var22;
            var25.field3800[var20] = (short)(this.method3887(var23, var24, -1429601116) + (var4 != null ? var4[var20] : 0));
            if (var25.field3802[var20] < 2) {
               var25.field3802[var20] = 2;
            }
         }

         boolean var29 = false;
         var21 = 0;

         for(var22 = 0; var22 < var28; ++var22) {
            if (var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               ++var21;
            }

            var23 = var12[var22];
            if (var23 != -1) {
               class414 var32 = this.field10037.field8581.method4625(var23, 416661720);
               if (!var32.field9378) {
                  var29 = true;
                  if (this.method6123(var32.field9383) || var32.field9389 != 0 || var32.field9363 != 0) {
                     var25.field3807 = (byte)(var25.field3807 | 4);
                  }
               }
            }
         }

         var25.field3808 = new int[var21];
         if (var11 != null) {
            var25.field3809 = new int[var21];
         }

         var25.field3803 = new short[var21];
         var25.field3798 = new short[var21];
         var25.field3805 = new short[var21];
         if (var29) {
            var25.field3806 = new short[var21];
            var25.field3797 = new short[var21];
         }

         for(var22 = 0; var22 < var28; ++var22) {
            if (var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               if (var10[var22] >= 0) {
                  var25.field3808[var25.field3804] = class526.method2228(var10[var22], (byte)0);
               } else {
                  var25.field3808[var25.field3804] = -1;
               }

               if (var11 != null) {
                  if (var11[var22] != -1) {
                     var25.field3809[var25.field3804] = class526.method2228(var11[var22], (byte)0);
                  } else {
                     var25.field3809[var25.field3804] = -1;
                  }
               }

               var25.field3803[var25.field3804] = (short)var7[var22];
               var25.field3798[var25.field3804] = (short)var8[var22];
               var25.field3805[var25.field3804] = (short)var9[var22];
               if (var29) {
                  if (var12[var22] != -1 && !this.field10037.field8581.method4625(var12[var22], 849589384).field9378) {
                     var25.field3806[var25.field3804] = (short)var12[var22];
                     var25.field3797[var25.field3804] = (short)var13[var22];
                  } else {
                     var25.field3806[var25.field3804] = -1;
                  }
               }

               ++var25.field3804;
            }
         }

         this.field10048[var1][var2] = var25;
      } else if (var10[0] >= 0 || var11 != null && var11[0] >= 0) {
         class67 var26 = new class67();
         var18 = var10[0];
         var19 = var12[0];
         if (var11 != null) {
            var26.field1691 = class63.method1253(class526.method2228(var11[0], (byte)0), this.field10065[var1][var2] - this.field10066[var1][var2], -952106382);
            if (var18 == -1) {
               var26.field1688 = (byte)(var26.field1688 | 2);
            }
         }

         if (this.field7229[var1][var2] == this.field7229[var1 + 1][var2] && this.field7229[var1][var2] == this.field7229[var1 + 1][var2 + 1] && this.field7229[var1][var2] == this.field7229[var1][var2 + 1]) {
            var26.field1688 = (byte)(var26.field1688 | 1);
         }

         class414 var30 = null;
         if (var19 != -1) {
            var30 = this.field10037.field8581.method4625(var19, 2110054256);
         }

         if (var30 != null && (var26.field1688 & 2) == 0 && !var30.field9378) {
            var26.field1692 = (short)(this.field10065[var1][var2] - this.field10066[var1][var2]);
            var26.field1689 = (short)(this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]);
            var26.field1690 = (short)(this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]);
            var26.field1687 = (short)(this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]);
            var26.field1693 = (short)var19;
            if (this.method6123(var30.field9383) || var30.field9389 != 0 || var30.field9363 != 0) {
               var26.field1688 = (byte)(var26.field1688 | 4);
            }
         } else {
            short var31 = class526.method2228(var18, (byte)0);
            var26.field1692 = (short)class63.method1253(var31, this.field10065[var1][var2] - this.field10066[var1][var2], -952106382);
            var26.field1689 = (short)class63.method1253(var31, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2], -952106382);
            var26.field1690 = (short)class63.method1253(var31, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1], -952106382);
            var26.field1687 = (short)class63.method1253(var31, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1], -952106382);
            var26.field1693 = -1;
         }

         this.field10044[var1][var2] = var26;
      }

   }

   boolean method6123(int var1) {
      if ((this.field10045 & 8) == 0) {
         return false;
      } else if (var1 == 4) {
         return true;
      } else if (var1 == 8) {
         return true;
      } else {
         return var1 == 9;
      }
   }

   static int method6124(int var0, int var1) {
      int var2 = (var0 & 16711680) * var1 >> 23;
      if (var2 < 2) {
         var2 = 2;
      } else if (var2 > 253) {
         var2 = 253;
      }

      int var3 = (var0 & '\uff00') * var1 >> 15;
      if (var3 < 2) {
         var3 = 2;
      } else if (var3 > 253) {
         var3 = 253;
      }

      int var4 = (var0 & 255) * var1 >> 7;
      if (var4 < 2) {
         var4 = 2;
      } else if (var4 > 253) {
         var4 = 253;
      }

      return var2 << 16 | var3 << 8 | var4;
   }

   public void method3898() {
      this.field10065 = null;
      this.field10066 = null;
   }

   public void method3882(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      boolean var13 = (this.field10045 & 32) == 0;
      if (this.field10046 == null && !var13) {
         this.field10046 = new class805[this.field7226 * -506105871][this.field7225 * -1148794921];
         this.field10047 = new class796[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10068 == null && var13) {
         this.field10068 = new class970[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10044 != null) {
         throw new IllegalStateException();
      }

      if (var3 != null && var3.length != 0) {
         int var14;
         for(var14 = 0; var14 < var7.length; ++var14) {
            if (var7[var14] == -1) {
               var7[var14] = 0;
            } else {
               var7[var14] = class543.field3817[class526.method2228(var7[var14], (byte)0) & '\uffff'] << 8 | 255;
            }
         }

         if (var8 != null) {
            for(var14 = 0; var14 < var8.length; ++var14) {
               if (var8[var14] == -1) {
                  var8[var14] = 0;
               } else {
                  var8[var14] = class543.field3817[class526.method2228(var8[var14], (byte)0) & '\uffff'] << 8 | 255;
               }
            }
         }

         int var15;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var33;
         if (var13) {
            class970 var29 = new class970();
            var29.field2989 = (short)var3.length;
            var29.field2991 = (short)(var3.length / 3);
            var29.field2990 = new short[var29.field2989];
            var29.field2996 = new short[var29.field2989];
            var29.field2998 = new short[var29.field2989];
            var29.field2992 = new int[var29.field2989];
            var29.field2994 = new short[var29.field2989];
            var29.field2995 = new short[var29.field2989];
            var29.field2997 = new byte[var29.field2989];
            if (var6 != null) {
               var29.field2993 = new short[var29.field2989];
            }

            for(var15 = 0; var15 < var29.field2989; ++var15) {
               var16 = var3[var15];
               var17 = var5[var15];
               boolean var18 = false;
               if (var16 == 0 && var17 == 0) {
                  var19 = this.field10065[var1][var2] - this.field10066[var1][var2];
               } else if (var16 == 0 && var17 == this.field7227 * -1212653763) {
                  var19 = this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1];
               } else if (var16 == this.field7227 * -1212653763 && var17 == this.field7227 * -1212653763) {
                  var19 = this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1];
               } else if (var16 == this.field7227 * -1212653763 && var17 == 0) {
                  var19 = this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2];
               } else {
                  var20 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var16) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var16;
                  var21 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var16) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var16;
                  var19 = var20 * (this.field7227 * -1212653763 - var17) + var21 * var17 >> this.field7228 * 20267538;
               }

               var20 = (var1 << this.field7228 * -2137349879) + var16;
               var21 = (var2 << this.field7228 * -2137349879) + var17;
               var29.field2990[var15] = (short)var16;
               var29.field2998[var15] = (short)var17;
               var29.field2996[var15] = (short)(this.method3887(var20, var21, -1931764542) + (var4 != null ? var4[var15] : 0));
               if (var19 < 0) {
                  var19 = 0;
               }

               if (var7[var15] == 0) {
                  var29.field2992[var15] = 0;
                  if (var8 != null) {
                     var29.field2997[var15] = (byte)var19;
                  }
               } else {
                  var22 = 0;
                  if (var6 != null) {
                     short var23 = var29.field2993[var15] = (short)var6[var15];
                     if (var11.field10425 * 1996750669 != 0) {
                        var22 = 255 * var23 / (var11.field10425 * 1996750669);
                        if (var22 < 0) {
                           var22 = 0;
                        } else if (var22 > 255) {
                           var22 = 255;
                        }
                     }
                  }

                  var33 = -16777216;
                  if (var9[var15] != -1 && this.method6123(this.field10037.field8581.method4625(var9[var15], 287759489).field9383)) {
                     var33 = -1694498816;
                  }

                  var29.field2992[var15] = var33 | class109.method1210(method6124(var7[var15] >> 8, var19), var11.field10426 * -1212608691, var22, 1420703605);
                  if (var8 != null) {
                     var29.field2997[var15] = (byte)var19;
                  }
               }

               var29.field2994[var15] = (short)var9[var15];
               var29.field2995[var15] = (short)var10[var15];
            }

            if (var8 != null) {
               var29.field2988 = new int[var29.field2991];
            }

            for(var15 = 0; var15 < var29.field2991; ++var15) {
               var16 = var15 * 3;
               if (var8 != null && var8[var16] != 0) {
                  var29.field2988[var15] = -16777216 | var8[var16] >> 8;
               }
            }

            this.field10068[var1][var2] = var29;
         } else {
            boolean var30 = true;
            var15 = -1;
            var16 = -1;
            var17 = -1;
            int var31 = -1;
            if (var3.length != 6) {
               var30 = false;
            } else {
               for(var19 = 0; var19 < 6; ++var19) {
                  if (var3[var19] == 0 && var5[var19] == 0) {
                     if (var15 != -1 && var7[var15] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var15 = var19;
                  } else if (var3[var19] == this.field7227 * -1212653763 && var5[var19] == 0) {
                     if (var16 != -1 && var7[var16] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var16 = var19;
                  } else if (var3[var19] == this.field7227 * -1212653763 && var5[var19] == this.field7227 * -1212653763) {
                     if (var17 != -1 && var7[var17] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var17 = var19;
                  } else if (var3[var19] == 0 && var5[var19] == this.field7227 * -1212653763) {
                     if (var31 != -1 && var7[var31] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var31 = var19;
                  }
               }

               if (var15 == -1 || var16 == -1 || var17 == -1 || var31 == -1) {
                  var30 = false;
               }

               if (var30) {
                  if (var4 != null) {
                     for(var19 = 0; var19 < 4; ++var19) {
                        if (var4[var19] != 0) {
                           var30 = false;
                           break;
                        }
                     }
                  }

                  if (var30) {
                     for(var19 = 1; var19 < 4; ++var19) {
                        if (var3[var19] != var3[0] && var3[var19] != var3[0] + this.field7227 * -1212653763 && var3[var19] != var3[0] - this.field7227 * -1212653763) {
                           var30 = false;
                           break;
                        }

                        if (var5[var19] != var5[0] && var5[var19] != var5[0] + this.field7227 * -1212653763 && var5[var19] != var5[0] - this.field7227 * -1212653763) {
                           var30 = false;
                           break;
                        }
                     }
                  }
               }
            }

            if (var30) {
               class805 var34 = new class805();
               var20 = var7[0];
               var21 = var9[0];
               if (var8 != null) {
                  var34.field4408 = var8[0] >> 8;
                  if (var20 == 0) {
                     var34.field4403 = (byte)(var34.field4403 | 2);
                  }
               } else if (var20 == 0) {
                  return;
               }

               if (this.field7229[var1][var2] == this.field7229[var1 + 1][var2] && this.field7229[var1][var2] == this.field7229[var1 + 1][var2 + 1] && this.field7229[var1][var2] == this.field7229[var1][var2 + 1]) {
                  var34.field4403 = (byte)(var34.field4403 | 1);
               }

               if (var21 != -1 && (var34.field4403 & 2) == 0 && !this.field10037.field8581.method4625(var21, 285040637).field9378) {
                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var15] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4400 = class109.method1210(method6124(var7[var15] >> 8, this.field10065[var1][var2] - this.field10066[var1][var2]), var11.field10426 * -1212608691, var22, 1805401631);
                  if (var34.field4408 != 0) {
                     var34.field4400 |= 255 - (this.field10065[var1][var2] - this.field10066[var1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var16] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4401 = class109.method1210(method6124(var7[var16] >> 8, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]), var11.field10426 * -1212608691, var22, 1836463174);
                  if (var34.field4408 != 0) {
                     var34.field4401 |= 255 - (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var17] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4399 = class109.method1210(method6124(var7[var17] >> 8, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]), var11.field10426 * -1212608691, var22, 1746783911);
                  if (var34.field4408 != 0) {
                     var34.field4399 |= 255 - (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var31] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4407 = class109.method1210(method6124(var7[var31] >> 8, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]), var11.field10426 * -1212608691, var22, 1813550716);
                  var34.field4409 = (short)var21;
               } else {
                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var15] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4400 = class109.method1210(method6124(var7[var15] >> 8, this.field10065[var1][var2] - this.field10066[var1][var2]), var11.field10426 * -1212608691, var22, 2101653274);
                  if (var34.field4408 != 0) {
                     var34.field4400 |= 255 - (this.field10065[var1][var2] - this.field10066[var1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var16] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4401 = class109.method1210(method6124(var7[var16] >> 8, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]), var11.field10426 * -1212608691, var22, 2112012401);
                  if (var34.field4408 != 0) {
                     var34.field4401 |= 255 - (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var17] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4399 = class109.method1210(method6124(var7[var17] >> 8, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]), var11.field10426 * -1212608691, var22, 1949068625);
                  if (var34.field4408 != 0) {
                     var34.field4399 |= 255 - (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var31] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4407 = class109.method1210(method6124(var7[var31] >> 8, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]), var11.field10426 * -1212608691, var22, 1419239335);
                  if (var34.field4408 != 0) {
                     var34.field4407 |= 255 - (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) << 25;
                  }

                  var34.field4409 = -1;
               }

               if (var6 != null) {
                  var34.field4406 = (short)var6[var17];
                  var34.field4404 = (short)var6[var31];
                  var34.field4405 = (short)var6[var16];
                  var34.field4402 = (short)var6[var15];
               }

               this.field10046[var1][var2] = var34;
            } else {
               class796 var35 = new class796();
               var35.field483 = (short)var3.length;
               var35.field492 = (short)(var3.length / 3);
               var35.field482 = new short[var35.field483];
               var35.field486 = new short[var35.field483];
               var35.field487 = new short[var35.field483];
               var35.field489 = new int[var35.field483];
               if (var6 != null) {
                  var35.field490 = new short[var35.field483];
               }

               int var24;
               int var27;
               for(var20 = 0; var20 < var35.field483; ++var20) {
                  var21 = var3[var20];
                  var22 = var5[var20];
                  boolean var36 = false;
                  int var25;
                  int var26;
                  if (var21 == 0 && var22 == 0) {
                     var24 = this.field10065[var1][var2] - this.field10066[var1][var2];
                  } else if (var21 == 0 && var22 == this.field7227 * -1212653763) {
                     var24 = this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1];
                  } else if (var21 == this.field7227 * -1212653763 && var22 == this.field7227 * -1212653763) {
                     var24 = this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1];
                  } else if (var21 == this.field7227 * -1212653763 && var22 == 0) {
                     var24 = this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2];
                  } else {
                     var25 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var21;
                     var26 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var21;
                     var24 = var25 * (this.field7227 * -1212653763 - var22) + var26 * var22 >> this.field7228 * 20267538;
                  }

                  var25 = (var1 << this.field7228 * -2137349879) + var21;
                  var26 = (var2 << this.field7228 * -2137349879) + var22;
                  var35.field482[var20] = (short)var21;
                  var35.field487[var20] = (short)var22;
                  var35.field486[var20] = (short)(this.method3887(var25, var26, -1382494062) + (var4 != null ? var4[var20] : 0));
                  if (var24 < 0) {
                     var24 = 0;
                  }

                  if (var7[var20] == 0) {
                     if (var8 != null) {
                        var35.field489[var20] = var24 << 25;
                     } else {
                        var35.field489[var20] = 0;
                     }
                  } else {
                     var27 = 0;
                     if (var6 != null) {
                        short var28 = var35.field490[var20] = (short)var6[var20];
                        if (var11.field10425 * 1996750669 != 0) {
                           var27 = 255 * var28 / (var11.field10425 * 1996750669);
                           if (var27 < 0) {
                              var27 = 0;
                           } else if (var27 > 255) {
                              var27 = 255;
                           }
                        }
                     }

                     var35.field489[var20] = class109.method1210(method6124(var7[var20] >> 8, var24), var11.field10426 * -1212608691, var27, 1325895467);
                     if (var8 != null) {
                        var35.field489[var20] |= var24 << 25;
                     }
                  }
               }

               boolean var32 = false;

               for(var21 = 0; var21 < var35.field492; ++var21) {
                  if (var9[var21 * 3] != -1 && !this.field10037.field8581.method4625(var9[var21 * 3], 2143447780).field9378) {
                     var32 = true;
                  }
               }

               if (var8 != null) {
                  var35.field488 = new int[var35.field492];
               }

               if (var32) {
                  var35.field491 = new short[var35.field492];
                  var35.field485 = new short[var35.field492];
               }

               for(var21 = 0; var21 < var35.field492; ++var21) {
                  var22 = var21 * 3;
                  if (var8 != null && var8[var22] != 0) {
                     var35.field488[var21] = var8[var22] >> 8;
                  }

                  if (var32) {
                     var33 = var22 + 1;
                     var24 = var33 + 1;
                     boolean var37 = false;
                     boolean var38 = true;
                     var27 = var9[var22];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 983325299).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     var27 = var9[var33];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 474134304).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     var27 = var9[var24];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1093441537).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     if (var38) {
                        var35.field491[var21] = (short)var27;
                        var35.field485[var21] = (short)var10[var22];
                     } else {
                        if (var37) {
                           var27 = var9[var22];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 534720229).field9378) {
                              var35.field489[var22] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 2084283479).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }

                           var27 = var9[var33];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 2025975294).field9378) {
                              var35.field489[var33] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 537097363).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }

                           var27 = var9[var24];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 644933930).field9378) {
                              var35.field489[var24] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 2115246212).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }
                        }

                        var35.field491[var21] = -1;
                     }
                  }
               }

               this.field10047[var1][var2] = var35;
            }
         }
      }

   }

   void method6125(int var1, int var2, int var3) {
      class258 var4 = this.field10037.method4450(Thread.currentThread());
      var4.field7881.field335 = 0;
      if (this.field10046 != null) {
         this.method6126(var1, var2, var4.field7875, var4, var4.field7881, var4.field7907, var4.field7870, var4.field7912, var4.field7910, var4.field7911, var3);
      } else if (this.field10044 != null) {
         this.method6129(var1, var2, var4.field7881, var4.field7907, var4.field7870, var4.field7912, var4.field7910, var4.field7911, var3);
      } else if (this.field10068 != null) {
         this.method6127(var1, var2, var4.field7875, var4, var4.field7881, var4.field7907, var4.field7870, var4.field7912, var4.field7910, var4.field7911, var3);
      }

   }

   public void method3913(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      if (this.field10044 == null) {
         this.field10044 = new class67[this.field7226 * -506105871][this.field7225 * -1148794921];
         this.field10048 = new class786[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10046 != null || this.field10068 != null) {
         throw new IllegalStateException();
      }

      boolean var16 = false;
      int var18;
      int var19;
      if (var10.length == 2 && var7.length == 2 && (var10[0] == var10[1] || var12[0] != -1 && var12[0] == var12[1])) {
         var16 = true;

         for(int var17 = 1; var17 < 2; ++var17) {
            var18 = var3[var7[var17]];
            var19 = var5[var7[var17]];
            if (var18 != 0 && var18 != this.field7227 * -1212653763 || var19 != 0 && var19 != this.field7227 * -1212653763) {
               var16 = false;
               break;
            }
         }
      }

      if (!var16) {
         class786 var25 = new class786();
         short var27 = (short)var3.length;
         short var28 = (short)var10.length;
         var25.field3796 = var27;
         var25.field3802 = new short[var27];
         var25.field3799 = new short[var27];
         var25.field3800 = new short[var27];
         var25.field3801 = new short[var27];

         int var21;
         int var22;
         int var23;
         for(int var20 = 0; var20 < var27; ++var20) {
            var21 = var3[var20];
            var22 = var5[var20];
            int var24;
            if (var21 == 0 && var22 == 0) {
               var25.field3802[var20] = (short)(this.field10065[var1][var2] - this.field10066[var1][var2]);
            } else if (var21 == 0 && var22 == this.field7227 * -1212653763) {
               var25.field3802[var20] = (short)(this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]);
            } else if (var21 == this.field7227 * -1212653763 && var22 == this.field7227 * -1212653763) {
               var25.field3802[var20] = (short)(this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]);
            } else if (var21 == this.field7227 * -1212653763 && var22 == 0) {
               var25.field3802[var20] = (short)(this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]);
            } else {
               var23 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var21;
               var24 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var21;
               var25.field3802[var20] = (short)(var23 * (this.field7227 * -1212653763 - var22) + var24 * var22 >> this.field7228 * 20267538);
            }

            var23 = (var1 << this.field7228 * -2137349879) + var21;
            var24 = (var2 << this.field7228 * -2137349879) + var22;
            var25.field3799[var20] = (short)var21;
            var25.field3801[var20] = (short)var22;
            var25.field3800[var20] = (short)(this.method3887(var23, var24, -1605816038) + (var4 != null ? var4[var20] : 0));
            if (var25.field3802[var20] < 2) {
               var25.field3802[var20] = 2;
            }
         }

         boolean var29 = false;
         var21 = 0;

         for(var22 = 0; var22 < var28; ++var22) {
            if (var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               ++var21;
            }

            var23 = var12[var22];
            if (var23 != -1) {
               class414 var32 = this.field10037.field8581.method4625(var23, 115927744);
               if (!var32.field9378) {
                  var29 = true;
                  if (this.method6123(var32.field9383) || var32.field9389 != 0 || var32.field9363 != 0) {
                     var25.field3807 = (byte)(var25.field3807 | 4);
                  }
               }
            }
         }

         var25.field3808 = new int[var21];
         if (var11 != null) {
            var25.field3809 = new int[var21];
         }

         var25.field3803 = new short[var21];
         var25.field3798 = new short[var21];
         var25.field3805 = new short[var21];
         if (var29) {
            var25.field3806 = new short[var21];
            var25.field3797 = new short[var21];
         }

         for(var22 = 0; var22 < var28; ++var22) {
            if (var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               if (var10[var22] >= 0) {
                  var25.field3808[var25.field3804] = class526.method2228(var10[var22], (byte)0);
               } else {
                  var25.field3808[var25.field3804] = -1;
               }

               if (var11 != null) {
                  if (var11[var22] != -1) {
                     var25.field3809[var25.field3804] = class526.method2228(var11[var22], (byte)0);
                  } else {
                     var25.field3809[var25.field3804] = -1;
                  }
               }

               var25.field3803[var25.field3804] = (short)var7[var22];
               var25.field3798[var25.field3804] = (short)var8[var22];
               var25.field3805[var25.field3804] = (short)var9[var22];
               if (var29) {
                  if (var12[var22] != -1 && !this.field10037.field8581.method4625(var12[var22], 965315960).field9378) {
                     var25.field3806[var25.field3804] = (short)var12[var22];
                     var25.field3797[var25.field3804] = (short)var13[var22];
                  } else {
                     var25.field3806[var25.field3804] = -1;
                  }
               }

               ++var25.field3804;
            }
         }

         this.field10048[var1][var2] = var25;
      } else if (var10[0] >= 0 || var11 != null && var11[0] >= 0) {
         class67 var26 = new class67();
         var18 = var10[0];
         var19 = var12[0];
         if (var11 != null) {
            var26.field1691 = class63.method1253(class526.method2228(var11[0], (byte)0), this.field10065[var1][var2] - this.field10066[var1][var2], -952106382);
            if (var18 == -1) {
               var26.field1688 = (byte)(var26.field1688 | 2);
            }
         }

         if (this.field7229[var1][var2] == this.field7229[var1 + 1][var2] && this.field7229[var1][var2] == this.field7229[var1 + 1][var2 + 1] && this.field7229[var1][var2] == this.field7229[var1][var2 + 1]) {
            var26.field1688 = (byte)(var26.field1688 | 1);
         }

         class414 var30 = null;
         if (var19 != -1) {
            var30 = this.field10037.field8581.method4625(var19, 723351718);
         }

         if (var30 != null && (var26.field1688 & 2) == 0 && !var30.field9378) {
            var26.field1692 = (short)(this.field10065[var1][var2] - this.field10066[var1][var2]);
            var26.field1689 = (short)(this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]);
            var26.field1690 = (short)(this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]);
            var26.field1687 = (short)(this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]);
            var26.field1693 = (short)var19;
            if (this.method6123(var30.field9383) || var30.field9389 != 0 || var30.field9363 != 0) {
               var26.field1688 = (byte)(var26.field1688 | 4);
            }
         } else {
            short var31 = class526.method2228(var18, (byte)0);
            var26.field1692 = (short)class63.method1253(var31, this.field10065[var1][var2] - this.field10066[var1][var2], -952106382);
            var26.field1689 = (short)class63.method1253(var31, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2], -952106382);
            var26.field1690 = (short)class63.method1253(var31, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1], -952106382);
            var26.field1687 = (short)class63.method1253(var31, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1], -952106382);
            var26.field1693 = -1;
         }

         this.field10044[var1][var2] = var26;
      }

   }

   void method6126(int var1, int var2, boolean var3, class258 var4, class585 var5, float[] var6, float[] var7, float[] var8, float[] var9, float[] var10, int var11) {
      class805 var12 = this.field10046[var1][var2];
      int var14;
      int var15;
      int var16;
      float var18;
      float var19;
      float var20;
      float var25;
      float var27;
      float var29;
      float var31;
      if (var12 != null) {
         if ((var12.field4403 & 2) == 0) {
            if (var11 != 0) {
               if ((var12.field4403 & 4) != 0) {
                  if ((var11 & 1) != 0) {
                     return;
                  }
               } else if ((var11 & 2) != 0) {
                  return;
               }
            }

            int var13 = var1 * this.field7227 * -1212653763;
            var14 = var13 + this.field7227 * -1212653763;
            var15 = var2 * this.field7227 * -1212653763;
            var16 = var15 + this.field7227 * -1212653763;
            float var17 = 0.0F;
            var18 = 0.0F;
            var19 = 0.0F;
            var20 = 0.0F;
            int var21;
            int var23;
            float var26;
            float var28;
            float var30;
            float var32;
            float var33;
            float var34;
            float var35;
            float var36;
            float var37;
            float var39;
            float var40;
            float var41;
            float var42;
            float var43;
            float var44;
            float var45;
            float var46;
            float var47;
            float var48;
            float var49;
            float var50;
            float var51;
            float var53;
            float var57;
            float var63;
            if ((var12.field4403 & 1) != 0 && !var3) {
               var21 = this.field7229[var1][var2];
               var57 = this.field10055 * (float)var21;
               float var58 = this.field10039 * (float)var21;
               float var59 = this.field10063 + this.field10051 * (float)var13 + var57 + this.field10059 * (float)var15;
               var25 = this.field10064 + this.field10038 * (float)var13 + var58 + this.field10060 * (float)var15;
               if (var59 < -var25) {
                  return;
               }

               var26 = this.field10063 + this.field10051 * (float)var14 + var57 + this.field10059 * (float)var15;
               var27 = this.field10064 + this.field10038 * (float)var14 + var58 + this.field10060 * (float)var15;
               if (var26 < -var27) {
                  return;
               }

               var28 = this.field10063 + this.field10051 * (float)var14 + var57 + this.field10059 * (float)var16;
               var29 = this.field10064 + this.field10038 * (float)var14 + var58 + this.field10060 * (float)var16;
               if (var28 < -var29) {
                  return;
               }

               var30 = this.field10063 + this.field10051 * (float)var13 + var57 + this.field10059 * (float)var16;
               var31 = this.field10064 + this.field10038 * (float)var13 + var58 + this.field10060 * (float)var16;
               if (var30 < -var31) {
                  return;
               }

               var32 = var5.field343 + var5.field362 * var59 / var25;
               var33 = var5.field343 + var5.field362 * var26 / var27;
               var34 = var5.field343 + var5.field362 * var28 / var29;
               var35 = var5.field343 + var5.field362 * var30 / var31;
               if (var4.field7905) {
                  var36 = var59 - var4.field7894;
                  if (var36 > 0.0F) {
                     var17 = var36 / var4.field7872;
                     if (var17 > 1.0F) {
                        var17 = 1.0F;
                     }
                  }

                  var36 = var26 - var4.field7894;
                  if (var36 > 0.0F) {
                     var18 = var36 / var4.field7872;
                     if (var18 > 1.0F) {
                        var18 = 1.0F;
                     }
                  }

                  var36 = var28 - var4.field7894;
                  if (var36 > 0.0F) {
                     var19 = var36 / var4.field7872;
                     if (var19 > 1.0F) {
                        var19 = 1.0F;
                     }
                  }

                  var36 = var30 - var4.field7894;
                  if (var36 > 0.0F) {
                     var20 = var36 / var4.field7872;
                     if (var20 > 1.0F) {
                        var20 = 1.0F;
                     }
                  }
               }

               var36 = this.field10053 * (float)var21;
               var37 = this.field10054 * (float)var21;
               var63 = this.field10061 + this.field10052 * (float)var13 + var36 + this.field10057 * (float)var15;
               var39 = var5.field339 + var5.field333 * var63 / var25;
               var40 = this.field10062 + this.field10050 * (float)var13 + var37 + this.field10058 * (float)var15;
               var41 = var5.field341 + var5.field342 * var40 / var25;
               var42 = this.field10061 + this.field10052 * (float)var14 + var36 + this.field10057 * (float)var15;
               var43 = var5.field339 + var5.field333 * var42 / var27;
               var44 = this.field10062 + this.field10050 * (float)var14 + var37 + this.field10058 * (float)var15;
               var45 = var5.field341 + var5.field342 * var44 / var27;
               var46 = this.field10061 + this.field10052 * (float)var14 + var36 + this.field10057 * (float)var16;
               var47 = var5.field339 + var5.field333 * var46 / var29;
               var48 = this.field10062 + this.field10050 * (float)var14 + var37 + this.field10058 * (float)var16;
               var49 = var5.field341 + var5.field342 * var48 / var29;
               var50 = this.field10061 + this.field10052 * (float)var13 + var36 + this.field10057 * (float)var16;
               var51 = var5.field339 + var5.field333 * var50 / var31;
               float var52 = this.field10062 + this.field10050 * (float)var13 + var37 + this.field10058 * (float)var16;
               var53 = var5.field341 + var5.field342 * var52 / var31;
            } else {
               var21 = this.field7229[var1][var2];
               int var22 = this.field7229[var1 + 1][var2];
               var23 = this.field7229[var1 + 1][var2 + 1];
               int var24 = this.field7229[var1][var2 + 1];
               var26 = this.field10063 + this.field10051 * (float)var13 + this.field10055 * (float)var21 + this.field10059 * (float)var15;
               var25 = this.field10064 + this.field10038 * (float)var13 + this.field10039 * (float)var21 + this.field10060 * (float)var15;
               if (var26 < -var25) {
                  return;
               }

               var28 = this.field10063 + this.field10051 * (float)var14 + this.field10055 * (float)var22 + this.field10059 * (float)var15;
               var27 = this.field10064 + this.field10038 * (float)var14 + this.field10039 * (float)var22 + this.field10060 * (float)var15;
               if (var28 < -var27) {
                  return;
               }

               var30 = this.field10063 + this.field10051 * (float)var14 + this.field10055 * (float)var23 + this.field10059 * (float)var16;
               var29 = this.field10064 + this.field10038 * (float)var14 + this.field10039 * (float)var23 + this.field10060 * (float)var16;
               if (var30 < -var29) {
                  return;
               }

               var36 = this.field10063 + this.field10051 * (float)var13 + this.field10055 * (float)var24 + this.field10059 * (float)var16;
               var31 = this.field10064 + this.field10038 * (float)var13 + this.field10039 * (float)var24 + this.field10060 * (float)var16;
               if (var36 < -var31) {
                  return;
               }

               var32 = var5.field343 + var5.field362 * var26 / var25;
               var33 = var5.field343 + var5.field362 * var28 / var27;
               var34 = var5.field343 + var5.field362 * var30 / var29;
               var35 = var5.field343 + var5.field362 * var36 / var31;
               if (var3) {
                  var37 = var26 - var4.field7894;
                  int var38;
                  if (var37 > 0.0F) {
                     var37 /= var4.field7872;
                     if (var37 > 1.0F) {
                        var37 = 1.0F;
                     }

                     var17 = var37;
                     var38 = (int)((float)var12.field4402 * var37);
                     if (var38 > 0) {
                        var21 -= var38;
                     }
                  }

                  var37 = var28 - var4.field7894;
                  if (var37 > 0.0F) {
                     var37 /= var4.field7872;
                     if (var37 > 1.0F) {
                        var37 = 1.0F;
                     }

                     var18 = var37;
                     var38 = (int)((float)var12.field4405 * var37);
                     if (var38 > 0) {
                        var22 -= var38;
                     }
                  }

                  var37 = var30 - var4.field7894;
                  if (var37 > 0.0F) {
                     var37 /= var4.field7872;
                     if (var37 > 1.0F) {
                        var37 = 1.0F;
                     }

                     var19 = var37;
                     var38 = (int)((float)var12.field4406 * var37);
                     if (var38 > 0) {
                        var23 -= var38;
                     }
                  }

                  var37 = var36 - var4.field7894;
                  if (var37 > 0.0F) {
                     var37 /= var4.field7872;
                     if (var37 > 1.0F) {
                        var37 = 1.0F;
                     }

                     var20 = var37;
                     var38 = (int)((float)var12.field4404 * var37);
                     if (var38 > 0) {
                        var24 -= var38;
                     }
                  }
               } else if (var4.field7905) {
                  var37 = var26 - var4.field7894;
                  if (var37 > 0.0F) {
                     var17 = var37 / var4.field7872;
                     if (var17 > 1.0F) {
                        var17 = 1.0F;
                     }
                  }

                  var37 = var28 - var4.field7894;
                  if (var37 > 0.0F) {
                     var18 = var37 / var4.field7872;
                     if (var18 > 1.0F) {
                        var18 = 1.0F;
                     }
                  }

                  var37 = var30 - var4.field7894;
                  if (var37 > 0.0F) {
                     var19 = var37 / var4.field7872;
                     if (var19 > 1.0F) {
                        var19 = 1.0F;
                     }
                  }

                  var37 = var36 - var4.field7894;
                  if (var37 > 0.0F) {
                     var20 = var37 / var4.field7872;
                     if (var20 > 1.0F) {
                        var20 = 1.0F;
                     }
                  }
               }

               var37 = this.field10061 + this.field10052 * (float)var13 + this.field10053 * (float)var21 + this.field10057 * (float)var15;
               var39 = var5.field339 + var5.field333 * var37 / var25;
               var63 = this.field10062 + this.field10050 * (float)var13 + this.field10054 * (float)var21 + this.field10058 * (float)var15;
               var41 = var5.field341 + var5.field342 * var63 / var25;
               var40 = this.field10061 + this.field10052 * (float)var14 + this.field10053 * (float)var22 + this.field10057 * (float)var15;
               var43 = var5.field339 + var5.field333 * var40 / var27;
               var42 = this.field10062 + this.field10050 * (float)var14 + this.field10054 * (float)var22 + this.field10058 * (float)var15;
               var45 = var5.field341 + var5.field342 * var42 / var27;
               var44 = this.field10061 + this.field10052 * (float)var14 + this.field10053 * (float)var23 + this.field10057 * (float)var16;
               var47 = var5.field339 + var5.field333 * var44 / var29;
               var46 = this.field10062 + this.field10050 * (float)var14 + this.field10054 * (float)var23 + this.field10058 * (float)var16;
               var49 = var5.field341 + var5.field342 * var46 / var29;
               var48 = this.field10061 + this.field10052 * (float)var13 + this.field10053 * (float)var24 + this.field10057 * (float)var16;
               var51 = var5.field339 + var5.field333 * var48 / var31;
               var50 = this.field10062 + this.field10050 * (float)var13 + this.field10054 * (float)var24 + this.field10058 * (float)var16;
               var53 = var5.field341 + var5.field342 * var50 / var31;
            }

            boolean var56 = var12.field4409 != -1 && this.method6123(this.field10037.field8581.method4625(var12.field4409, 2063434356).field9383);
            var57 = var18 + var19 + var20;
            if ((var47 - var51) * (var45 - var53) - (var49 - var53) * (var43 - var51) > 0.0F) {
               var5.field336 = var47 < 0.0F || var51 < 0.0F || var43 < 0.0F || var47 > (float)var5.field338 || var51 > (float)var5.field338 || var43 > (float)var5.field338;
               if (var57 < 3.0F) {
                  if (var57 > 0.0F) {
                     if (var12.field4409 >= 0) {
                        var23 = -16777216;
                        if (var56) {
                           var23 = -1694498816;
                        }

                        var5.method338(true, true, false, var49, var53, var45, var47, var51, var43, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var23 | var12.field4399 & 16777215, var23 | var12.field4407 & 16777215, var23 | var12.field4401 & 16777215, var4.field7873 * 688695183, var19 * 255.0F, var20 * 255.0F, var18 * 255.0F, var12.field4409);
                     } else {
                        if (var56) {
                           var5.field335 = 100;
                        }

                        var5.method340(true, true, false, var49, var53, var45, var47, var51, var43, var34, var35, var33, class305.method371(var12.field4399, (int)(var19 * 255.0F) << 24 | var4.field7873 * 688695183, 1183249329), class305.method371(var12.field4407, (int)(var20 * 255.0F) << 24 | var4.field7873 * 688695183, 1625753097), class305.method371(var12.field4401, (int)(var18 * 255.0F) << 24 | var4.field7873 * 688695183, 1260334891));
                        var5.field335 = 0;
                     }
                  } else if (var12.field4409 >= 0) {
                     var23 = -16777216;
                     if (var56) {
                        var23 = -1694498816;
                     }

                     var5.method338(true, true, false, var49, var53, var45, var47, var51, var43, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var23 | var12.field4399 & 16777215, var23 | var12.field4407 & 16777215, var23 | var12.field4401 & 16777215, 0, 0.0F, 0.0F, 0.0F, var12.field4409);
                  } else {
                     if (var56) {
                        var5.field335 = 100;
                     }

                     var5.method340(true, true, false, var49, var53, var45, var47, var51, var43, var34, var35, var33, var12.field4399, var12.field4407, var12.field4401);
                     var5.field335 = 0;
                  }
               } else {
                  var5.method341(true, true, false, var49, var53, var45, var47, var51, var43, var34, var35, var33, var4.field7873 * 688695183);
               }
            }

            var57 = var17 + var18 + var20;
            if ((var39 - var43) * (var53 - var45) - (var41 - var45) * (var51 - var43) > 0.0F) {
               var5.field336 = var39 < 0.0F || var43 < 0.0F || var51 < 0.0F || var39 > (float)var5.field338 || var43 > (float)var5.field338 || var51 > (float)var5.field338;
               if (var57 < 3.0F) {
                  if (var56) {
                     var5.field335 = -1694498816;
                  }

                  if (var57 > 0.0F) {
                     if (var12.field4409 >= 0) {
                        var23 = -16777216;
                        if (var56) {
                           var23 = -1694498816;
                        }

                        var5.method338(true, true, false, var41, var45, var53, var39, var43, var51, var32, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var23 | var12.field4400 & 16777215, var23 | var12.field4401 & 16777215, var23 | var12.field4407 & 16777215, var4.field7873 * 688695183, var17 * 255.0F, var18 * 255.0F, var20 * 255.0F, var12.field4409);
                     } else {
                        if (var56) {
                           var5.field335 = 100;
                        }

                        var5.method340(true, true, false, var41, var45, var53, var39, var43, var51, var32, var33, var35, class305.method371(var12.field4400, (int)(var17 * 255.0F) << 24 | var4.field7873 * 688695183, -865428811), class305.method371(var12.field4401, (int)(var18 * 255.0F) << 24 | var4.field7873 * 688695183, 555680362), class305.method371(var12.field4407, (int)(var20 * 255.0F) << 24 | var4.field7873 * 688695183, -466486142));
                        var5.field335 = 0;
                     }
                  } else if (var12.field4409 >= 0) {
                     var23 = -16777216;
                     if (var56) {
                        var23 = -1694498816;
                     }

                     var5.method338(true, true, false, var41, var45, var53, var39, var43, var51, var32, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var23 | var12.field4400 & 16777215, var23 | var12.field4401 & 16777215, var23 | var12.field4407 & 16777215, 0, 0.0F, 0.0F, 0.0F, var12.field4409);
                  } else {
                     if (var56) {
                        var5.field335 = 100;
                     }

                     var5.method340(true, true, false, var41, var45, var53, var39, var43, var51, var32, var33, var35, var12.field4400, var12.field4401, var12.field4407);
                     var5.field335 = 0;
                  }
               } else {
                  var5.method341(true, true, false, var41, var45, var53, var39, var43, var51, var32, var33, var35, var4.field7873 * 688695183);
               }
            }
         }
      } else {
         class796 var54 = this.field10047[var1][var2];
         if (var54 != null) {
            if (var11 != 0) {
               if ((var54.field484 & 4) != 0) {
                  if ((var11 & 1) != 0) {
                     return;
                  }
               } else if ((var11 & 2) != 0) {
                  return;
               }
            }

            int var55;
            for(var14 = 0; var14 < var54.field483; ++var14) {
               var15 = var54.field482[var14] + (var1 << this.field7228 * -2137349879);
               var16 = var54.field486[var14];
               var55 = var54.field487[var14] + (var2 << this.field7228 * -2137349879);
               var18 = this.field10063 + this.field10051 * (float)var15 + this.field10055 * (float)var16 + this.field10059 * (float)var55;
               var19 = this.field10064 + this.field10038 * (float)var15 + this.field10039 * (float)var16 + this.field10060 * (float)var55;
               if (var18 < -var19) {
                  return;
               }

               var20 = var5.field343 + var5.field362 * var18 / var19;
               var10[var14] = 0.0F;
               if (var3) {
                  var25 = var18 - var4.field7894;
                  if (var25 > 0.0F) {
                     var25 /= var4.field7872;
                     if (var25 > 1.0F) {
                        var25 = 1.0F;
                     }

                     var10[var14] = var25;
                     int var60 = (int)((float)var54.field490[var14] * var25);
                     if (var60 > 0) {
                        var16 -= var60;
                     }
                  }
               } else if (var4.field7905) {
                  var25 = var18 - var4.field7894;
                  if (var25 > 0.0F) {
                     var10[var14] = var25 / var4.field7872;
                     if (var10[var14] > 1.0F) {
                        var10[var14] = 1.0F;
                     }
                  }
               }

               var25 = this.field10061 + this.field10052 * (float)var15 + this.field10053 * (float)var16 + this.field10057 * (float)var55;
               var27 = this.field10062 + this.field10050 * (float)var15 + this.field10054 * (float)var16 + this.field10058 * (float)var55;
               var6[var14] = var5.field339 + var5.field333 * var25 / var19;
               var7[var14] = var5.field341 + var5.field342 * var27 / var19;
               var8[var14] = var20;
               var9[var14] = var19;
            }

            if (var54.field491 != null) {
               for(var14 = 0; var14 < var54.field492; ++var14) {
                  var15 = var14 * 3;
                  var16 = var15 + 1;
                  var55 = var16 + 1;
                  var18 = var6[var15];
                  var19 = var6[var16];
                  var20 = var6[var55];
                  var25 = var7[var15];
                  var27 = var7[var16];
                  var29 = var7[var55];
                  var31 = var10[var15] + var10[var16] + var10[var55];
                  if ((var18 - var19) * (var29 - var27) - (var25 - var27) * (var20 - var19) > 0.0F) {
                     var5.field336 = var18 < 0.0F || var19 < 0.0F || var20 < 0.0F || var18 > (float)var5.field338 || var19 > (float)var5.field338 || var20 > (float)var5.field338;
                     short var61 = var54.field491[var14];
                     if (var31 < 3.0F) {
                        int var62;
                        if (var31 > 0.0F) {
                           if (var61 != -1) {
                              var62 = -16777216;
                              if (var61 != -1 && this.method6123(this.field10037.field8581.method4625(var61, 1198381224).field9383)) {
                                 var62 = -1694498816;
                              }

                              var5.method338(true, true, false, var25, var27, var29, var18, var19, var20, var8[var15], var8[var16], var8[var55], var9[var15], var9[var16], var9[var55], (float)var54.field482[var15] / (float)(this.field7227 * -1212653763), (float)var54.field482[var16] / (float)(this.field7227 * -1212653763), (float)var54.field482[var55] / (float)(this.field7227 * -1212653763), (float)var54.field487[var15] / (float)(this.field7227 * -1212653763), (float)var54.field487[var16] / (float)(this.field7227 * -1212653763), (float)var54.field487[var55] / (float)(this.field7227 * -1212653763), var62 | var54.field489[var15] & 16777215, var62 | var54.field489[var16] & 16777215, var62 | var54.field489[var55] & 16777215, var4.field7873 * 688695183, var10[var15] * 255.0F, var10[var16] * 255.0F, var10[var55] * 255.0F, var61);
                           } else if ((var54.field489[var15] & 16777215) != 0) {
                              if (var61 != -1 && this.method6123(this.field10037.field8581.method4625(var61, 1822320471).field9383)) {
                                 var5.field335 = -1694498816;
                              }

                              var5.method340(true, true, false, var25, var27, var29, var18, var19, var20, var8[var15], var8[var16], var8[var55], class305.method371(var54.field489[var15], (int)(var10[var15] * 255.0F) << 24 | var4.field7873 * 688695183, 849679881), class305.method371(var54.field489[var16], (int)(var10[var16] * 255.0F) << 24 | var4.field7873 * 688695183, 705980790), class305.method371(var54.field489[var55], (int)(var10[var55] * 255.0F) << 24 | var4.field7873 * 688695183, 1153707665));
                              var5.field335 = 0;
                           }
                        } else if (var61 != -1) {
                           var62 = -16777216;
                           if (var61 != -1 && this.method6123(this.field10037.field8581.method4625(var61, 1935078014).field9383)) {
                              var62 = -1694498816;
                           }

                           var5.method338(true, true, false, var25, var27, var29, var18, var19, var20, var8[var15], var8[var16], var8[var55], var9[var15], var9[var16], var9[var55], (float)var54.field482[var15] / (float)(this.field7227 * -1212653763), (float)var54.field482[var16] / (float)(this.field7227 * -1212653763), (float)var54.field482[var55] / (float)(this.field7227 * -1212653763), (float)var54.field487[var15] / (float)(this.field7227 * -1212653763), (float)var54.field487[var16] / (float)(this.field7227 * -1212653763), (float)var54.field487[var55] / (float)(this.field7227 * -1212653763), var62 | var54.field489[var15] & 16777215, var62 | var54.field489[var16] & 16777215, var62 | var54.field489[var55] & 16777215, 0, 0.0F, 0.0F, 0.0F, var61);
                        } else if ((var54.field489[var15] & 16777215) != 0) {
                           if (var61 != -1 && this.method6123(this.field10037.field8581.method4625(var61, 2120381680).field9383)) {
                              var5.field335 = -1694498816;
                           }

                           var5.method340(true, true, false, var25, var27, var29, var18, var19, var20, var8[var15], var8[var16], var8[var55], var54.field489[var15], var54.field489[var16], var54.field489[var55]);
                           var5.field335 = 0;
                        }
                     } else {
                        var5.method341(true, true, false, var25, var27, var29, var18, var19, var20, var8[var15], var8[var16], var8[var55], var4.field7873 * 688695183);
                     }
                  }
               }
            } else {
               for(var14 = 0; var14 < var54.field492; ++var14) {
                  var15 = var14 * 3;
                  var16 = var15 + 1;
                  var55 = var16 + 1;
                  var18 = var6[var15];
                  var19 = var6[var16];
                  var20 = var6[var55];
                  var25 = var7[var15];
                  var27 = var7[var16];
                  var29 = var7[var55];
                  var31 = var10[var15] + var10[var16] + var10[var55];
                  if ((var18 - var19) * (var29 - var27) - (var25 - var27) * (var20 - var19) > 0.0F) {
                     var5.field336 = var18 < 0.0F || var19 < 0.0F || var20 < 0.0F || var18 > (float)var5.field338 || var19 > (float)var5.field338 || var20 > (float)var5.field338;
                     if (var31 < 3.0F) {
                        if (var31 > 0.0F) {
                           if ((var54.field489[var15] & 16777215) != 0) {
                              var5.method340(true, true, false, var25, var27, var29, var18, var19, var20, var8[var15], var8[var16], var8[var55], class507.method2511(var54.field489[var15], var4.field7873 * 688695183, var10[var15] * 255.0F, -833068669), class507.method2511(var54.field489[var16], var4.field7873 * 688695183, var10[var16] * 255.0F, -6644641), class507.method2511(var54.field489[var55], var4.field7873 * 688695183, var10[var55] * 255.0F, 1179362294));
                           }
                        } else if ((var54.field489[var15] & 16777215) != 0) {
                           var5.method340(true, true, false, var25, var27, var29, var18, var19, var20, var8[var15], var8[var16], var8[var55], var54.field489[var15], var54.field489[var16], var54.field489[var55]);
                        }
                     } else {
                        var5.method341(true, true, false, var25, var27, var29, var18, var19, var20, var8[var15], var8[var16], var8[var55], var4.field7873 * 688695183);
                     }
                  }
               }
            }
         }
      }

   }

   void method6127(int var1, int var2, boolean var3, class258 var4, class585 var5, float[] var6, float[] var7, float[] var8, float[] var9, float[] var10, int var11) {
      class970 var12 = this.field10068[var1][var2];
      if ((var11 == 0 || (var11 & 2) == 0) && var12 != null) {
         int var14;
         int var15;
         int var16;
         float var18;
         float var19;
         float var28;
         for(int var13 = 0; var13 < var12.field2989; ++var13) {
            var14 = var12.field2990[var13] + (var1 << this.field7228 * -2137349879);
            var15 = var12.field2996[var13];
            var16 = var12.field2998[var13] + (var2 << this.field7228 * -2137349879);
            float var17 = this.field10063 + this.field10051 * (float)var14 + this.field10055 * (float)var15 + this.field10059 * (float)var16;
            var18 = this.field10064 + this.field10038 * (float)var14 + this.field10039 * (float)var15 + this.field10060 * (float)var16;
            if (var17 < -var18) {
               return;
            }

            var10[var13] = 0.0F;
            if (var3) {
               var19 = var17 - var4.field7894;
               if (var19 > 0.0F) {
                  var19 /= var4.field7872;
                  if (var19 > 1.0F) {
                     var19 = 1.0F;
                  }

                  var10[var13] = var19;
                  int var20 = (int)((float)var12.field2993[var13] * var19);
                  if (var20 > 0) {
                     var15 -= var20;
                  }
               }
            } else if (var4.field7905) {
               var19 = var17 - var4.field7894;
               if (var19 > 0.0F) {
                  var10[var13] = var19 / var4.field7872;
                  if (var10[var13] > 1.0F) {
                     var10[var13] = 1.0F;
                  }
               }
            }

            var19 = this.field10061 + this.field10052 * (float)var14 + this.field10053 * (float)var15 + this.field10057 * (float)var16;
            var28 = this.field10062 + this.field10050 * (float)var14 + this.field10054 * (float)var15 + this.field10058 * (float)var16;
            var6[var13] = var5.field339 + var5.field333 * var19 / var18;
            var7[var13] = var5.field341 + var5.field342 * var28 / var18;
            var8[var13] = var5.field343 + var5.field362 * var17 / var18;
            var9[var13] = var18;
         }

         float var26 = (float)(this.field7227 * -1212653763);

         for(var14 = 0; var14 < var12.field2991; ++var14) {
            var15 = var14 * 3;
            var16 = var15 + 1;
            int var27 = var16 + 1;
            var18 = var6[var15];
            var19 = var6[var16];
            var28 = var6[var27];
            float var21 = var7[var15];
            float var22 = var7[var16];
            float var23 = var7[var27];
            if ((var18 - var19) * (var23 - var22) - (var21 - var22) * (var28 - var19) > 0.0F) {
               var5.field336 = var18 < 0.0F || var19 < 0.0F || var28 < 0.0F || var18 > (float)var5.field338 || var19 > (float)var5.field338 || var28 > (float)var5.field338;
               if (var10[var15] + var10[var16] + var10[var27] < 3.0F) {
                  int var24 = var1 << this.field7228 * -2137349879;
                  int var25 = var2 << this.field7228 * -2137349879;
                  if ((var12.field2992[var15] & 16777215) != 0) {
                     if (var12.field2994[var15] == var12.field2994[var16] && var12.field2994[var15] == var12.field2994[var27] && var12.field2995[var15] == var12.field2995[var16] && var12.field2995[var15] == var12.field2995[var27]) {
                        var5.method338(true, true, false, var21, var22, var23, var18, var19, var28, var8[var15], var8[var16], var8[var27], var9[var15], var9[var16], var9[var27], (float)(var24 + var12.field2990[var15]) / (float)var12.field2995[var15], (float)(var24 + var12.field2990[var16]) / (float)var12.field2995[var16], (float)(var24 + var12.field2990[var27]) / (float)var12.field2995[var27], (float)(var25 + var12.field2998[var15]) / (float)var12.field2995[var15], (float)(var25 + var12.field2998[var16]) / (float)var12.field2995[var16], (float)(var25 + var12.field2998[var27]) / (float)var12.field2995[var27], var12.field2992[var15], var12.field2992[var16], var12.field2992[var27], var4.field7873 * 688695183, var10[var15] * 255.0F, var10[var16] * 255.0F, var10[var27] * 255.0F, var12.field2994[var15]);
                     } else {
                        var5.method344(true, true, false, var21, var22, var23, var18, var19, var28, var8[var15], var8[var16], var8[var27], var9[var15], var9[var16], var9[var27], (float)(var24 + var12.field2990[var15]) / var26, (float)(var24 + var12.field2990[var16]) / var26, (float)(var24 + var12.field2990[var27]) / var26, (float)(var25 + var12.field2998[var15]) / var26, (float)(var25 + var12.field2998[var16]) / var26, (float)(var25 + var12.field2998[var27]) / var26, var12.field2992[var15], var12.field2992[var16], var12.field2992[var27], var4.field7873 * 688695183, var10[var15] * 255.0F, var10[var16] * 255.0F, var10[var27] * 255.0F, var12.field2994[var15], var26 / (float)var12.field2995[var15], var12.field2994[var16], var26 / (float)var12.field2995[var16], var12.field2994[var27], var26 / (float)var12.field2995[var27]);
                     }
                  }
               } else {
                  var5.method341(true, true, false, var21, var22, var23, var18, var19, var28, var8[var15], var8[var16], var8[var27], var4.field7873 * 688695183);
               }
            }
         }
      }

   }

   public boolean method3911(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return false;
   }

   public void method3914(int var1, int var2, int var3) {
      if (this.field10066[var1][var2] < var3) {
         this.field10066[var1][var2] = (byte)var3;
      }

   }

   void method6128(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8, class258 var9, class585 var10, float[] var11, float[] var12) {
      int var13 = (var7 - var5) * var3 / 256;
      int var14 = var3 >> 8;
      boolean var15 = var9.field7896;
      this.field10037.method4869(false);
      var10.field332 = false;
      var10.field364 = false;
      int var16 = var1;
      int var17 = var2 + var13;

      for(int var18 = var4; var18 < var6; ++var18) {
         for(int var19 = var5; var19 < var7; ++var19) {
            if (var8[var18 - var4][var19 - var5]) {
               int var21;
               if (this.field10044[var18][var19] != null) {
                  class67 var32 = this.field10044[var18][var19];
                  if (var32.field1693 != -1 && (var32.field1688 & 2) == 0 && var32.field1691 == -1) {
                     var21 = this.field10037.method4454(var32.field1693);
                     var10.method347(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)class63.method1253(var21, var32.field1690 & '\uffff', -952106382), (float)class63.method1253(var21, var32.field1687 & '\uffff', -952106382), (float)class63.method1253(var21, var32.field1689 & '\uffff', -952106382));
                     var10.method347(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)class63.method1253(var21, var32.field1692 & '\uffff', -952106382), (float)class63.method1253(var21, var32.field1689 & '\uffff', -952106382), (float)class63.method1253(var21, var32.field1687 & '\uffff', -952106382));
                  } else if (var32.field1691 == -1) {
                     var10.method347(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)(var32.field1690 & '\uffff'), (float)(var32.field1687 & '\uffff'), (float)(var32.field1689 & '\uffff'));
                     var10.method347(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)(var32.field1692 & '\uffff'), (float)(var32.field1689 & '\uffff'), (float)(var32.field1687 & '\uffff'));
                  } else {
                     var21 = var32.field1691;
                     var10.method347(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)var21, (float)var21, (float)var21);
                     var10.method347(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)var21, (float)var21, (float)var21);
                  }
               } else if (this.field10048[var18][var19] != null) {
                  class786 var20 = this.field10048[var18][var19];

                  for(var21 = 0; var21 < var20.field3796; ++var21) {
                     var11[var21] = (float)(var16 + var20.field3799[var21] * var14 / (this.field7227 * -1212653763));
                     var12[var21] = (float)(var17 - var20.field3801[var21] * var14 / (this.field7227 * -1212653763));
                  }

                  for(var21 = 0; var21 < var20.field3804; ++var21) {
                     short var22 = var20.field3803[var21];
                     short var23 = var20.field3798[var21];
                     short var24 = var20.field3805[var21];
                     float var25 = var11[var22];
                     float var26 = var11[var23];
                     float var27 = var11[var24];
                     float var28 = var12[var22];
                     float var29 = var12[var23];
                     float var30 = var12[var24];
                     int var31;
                     if (var20.field3809 != null && var20.field3809[var21] != -1) {
                        var31 = var20.field3809[var21];
                        var10.method347(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)class63.method1253(var31, var20.field3802[var22], -952106382), (float)class63.method1253(var31, var20.field3802[var23], -952106382), (float)class63.method1253(var31, var20.field3802[var24], -952106382));
                     } else if (var20.field3806 != null && var20.field3806[var21] != -1) {
                        var31 = this.field10037.method4454(var20.field3806[var21]);
                        var10.method347(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)class63.method1253(var31, var20.field3802[var22], -952106382), (float)class63.method1253(var31, var20.field3802[var23], -952106382), (float)class63.method1253(var31, var20.field3802[var24], -952106382));
                     } else {
                        var31 = var20.field3808[var21];
                        var10.method347(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)class63.method1253(var31, var20.field3802[var22], -952106382), (float)class63.method1253(var31, var20.field3802[var23], -952106382), (float)class63.method1253(var31, var20.field3802[var24], -952106382));
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = var2 + var13;
         var16 += var14;
      }

      var10.field332 = true;
      this.field10037.method4869(var15);
   }

   public void method3900(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class258 var9 = this.field10037.method4450(Thread.currentThread());
      class585 var10 = var9.field7881;
      var10.field335 = 0;
      var10.field336 = true;
      this.field10037.method4446();
      if (this.field10046 == null && this.field10068 == null) {
         if (this.field10044 != null) {
            this.method6128(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
         }
      } else {
         this.method6130(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
      }

   }

   public class770 method3889(int var1, int var2, class770 var3) {
      return null;
   }

   public void method3890(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   public void method3891(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   public void method3892(class639 var1, int[] var2) {
   }

   public void method3884(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      if (this.field10044 == null) {
         this.field10044 = new class67[this.field7226 * -506105871][this.field7225 * -1148794921];
         this.field10048 = new class786[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10046 != null || this.field10068 != null) {
         throw new IllegalStateException();
      }

      boolean var16 = false;
      int var18;
      int var19;
      if (var10.length == 2 && var7.length == 2 && (var10[0] == var10[1] || var12[0] != -1 && var12[0] == var12[1])) {
         var16 = true;

         for(int var17 = 1; var17 < 2; ++var17) {
            var18 = var3[var7[var17]];
            var19 = var5[var7[var17]];
            if (var18 != 0 && var18 != this.field7227 * -1212653763 || var19 != 0 && var19 != this.field7227 * -1212653763) {
               var16 = false;
               break;
            }
         }
      }

      if (!var16) {
         class786 var25 = new class786();
         short var27 = (short)var3.length;
         short var28 = (short)var10.length;
         var25.field3796 = var27;
         var25.field3802 = new short[var27];
         var25.field3799 = new short[var27];
         var25.field3800 = new short[var27];
         var25.field3801 = new short[var27];

         int var21;
         int var22;
         int var23;
         for(int var20 = 0; var20 < var27; ++var20) {
            var21 = var3[var20];
            var22 = var5[var20];
            int var24;
            if (var21 == 0 && var22 == 0) {
               var25.field3802[var20] = (short)(this.field10065[var1][var2] - this.field10066[var1][var2]);
            } else if (var21 == 0 && var22 == this.field7227 * -1212653763) {
               var25.field3802[var20] = (short)(this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]);
            } else if (var21 == this.field7227 * -1212653763 && var22 == this.field7227 * -1212653763) {
               var25.field3802[var20] = (short)(this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]);
            } else if (var21 == this.field7227 * -1212653763 && var22 == 0) {
               var25.field3802[var20] = (short)(this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]);
            } else {
               var23 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var21;
               var24 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var21;
               var25.field3802[var20] = (short)(var23 * (this.field7227 * -1212653763 - var22) + var24 * var22 >> this.field7228 * 20267538);
            }

            var23 = (var1 << this.field7228 * -2137349879) + var21;
            var24 = (var2 << this.field7228 * -2137349879) + var22;
            var25.field3799[var20] = (short)var21;
            var25.field3801[var20] = (short)var22;
            var25.field3800[var20] = (short)(this.method3887(var23, var24, -1457437132) + (var4 != null ? var4[var20] : 0));
            if (var25.field3802[var20] < 2) {
               var25.field3802[var20] = 2;
            }
         }

         boolean var29 = false;
         var21 = 0;

         for(var22 = 0; var22 < var28; ++var22) {
            if (var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               ++var21;
            }

            var23 = var12[var22];
            if (var23 != -1) {
               class414 var32 = this.field10037.field8581.method4625(var23, 685935265);
               if (!var32.field9378) {
                  var29 = true;
                  if (this.method6123(var32.field9383) || var32.field9389 != 0 || var32.field9363 != 0) {
                     var25.field3807 = (byte)(var25.field3807 | 4);
                  }
               }
            }
         }

         var25.field3808 = new int[var21];
         if (var11 != null) {
            var25.field3809 = new int[var21];
         }

         var25.field3803 = new short[var21];
         var25.field3798 = new short[var21];
         var25.field3805 = new short[var21];
         if (var29) {
            var25.field3806 = new short[var21];
            var25.field3797 = new short[var21];
         }

         for(var22 = 0; var22 < var28; ++var22) {
            if (var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               if (var10[var22] >= 0) {
                  var25.field3808[var25.field3804] = class526.method2228(var10[var22], (byte)0);
               } else {
                  var25.field3808[var25.field3804] = -1;
               }

               if (var11 != null) {
                  if (var11[var22] != -1) {
                     var25.field3809[var25.field3804] = class526.method2228(var11[var22], (byte)0);
                  } else {
                     var25.field3809[var25.field3804] = -1;
                  }
               }

               var25.field3803[var25.field3804] = (short)var7[var22];
               var25.field3798[var25.field3804] = (short)var8[var22];
               var25.field3805[var25.field3804] = (short)var9[var22];
               if (var29) {
                  if (var12[var22] != -1 && !this.field10037.field8581.method4625(var12[var22], 1558897776).field9378) {
                     var25.field3806[var25.field3804] = (short)var12[var22];
                     var25.field3797[var25.field3804] = (short)var13[var22];
                  } else {
                     var25.field3806[var25.field3804] = -1;
                  }
               }

               ++var25.field3804;
            }
         }

         this.field10048[var1][var2] = var25;
      } else if (var10[0] >= 0 || var11 != null && var11[0] >= 0) {
         class67 var26 = new class67();
         var18 = var10[0];
         var19 = var12[0];
         if (var11 != null) {
            var26.field1691 = class63.method1253(class526.method2228(var11[0], (byte)0), this.field10065[var1][var2] - this.field10066[var1][var2], -952106382);
            if (var18 == -1) {
               var26.field1688 = (byte)(var26.field1688 | 2);
            }
         }

         if (this.field7229[var1][var2] == this.field7229[var1 + 1][var2] && this.field7229[var1][var2] == this.field7229[var1 + 1][var2 + 1] && this.field7229[var1][var2] == this.field7229[var1][var2 + 1]) {
            var26.field1688 = (byte)(var26.field1688 | 1);
         }

         class414 var30 = null;
         if (var19 != -1) {
            var30 = this.field10037.field8581.method4625(var19, 864442826);
         }

         if (var30 != null && (var26.field1688 & 2) == 0 && !var30.field9378) {
            var26.field1692 = (short)(this.field10065[var1][var2] - this.field10066[var1][var2]);
            var26.field1689 = (short)(this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]);
            var26.field1690 = (short)(this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]);
            var26.field1687 = (short)(this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]);
            var26.field1693 = (short)var19;
            if (this.method6123(var30.field9383) || var30.field9389 != 0 || var30.field9363 != 0) {
               var26.field1688 = (byte)(var26.field1688 | 4);
            }
         } else {
            short var31 = class526.method2228(var18, (byte)0);
            var26.field1692 = (short)class63.method1253(var31, this.field10065[var1][var2] - this.field10066[var1][var2], -952106382);
            var26.field1689 = (short)class63.method1253(var31, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2], -952106382);
            var26.field1690 = (short)class63.method1253(var31, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1], -952106382);
            var26.field1687 = (short)class63.method1253(var31, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1], -952106382);
            var26.field1693 = -1;
         }

         this.field10044[var1][var2] = var26;
      }

   }

   public void method3894(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      if (this.field10044 == null) {
         this.field10044 = new class67[this.field7226 * -506105871][this.field7225 * -1148794921];
         this.field10048 = new class786[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10046 != null || this.field10068 != null) {
         throw new IllegalStateException();
      }

      boolean var16 = false;
      int var18;
      int var19;
      if (var10.length == 2 && var7.length == 2 && (var10[0] == var10[1] || var12[0] != -1 && var12[0] == var12[1])) {
         var16 = true;

         for(int var17 = 1; var17 < 2; ++var17) {
            var18 = var3[var7[var17]];
            var19 = var5[var7[var17]];
            if (var18 != 0 && var18 != this.field7227 * -1212653763 || var19 != 0 && var19 != this.field7227 * -1212653763) {
               var16 = false;
               break;
            }
         }
      }

      if (!var16) {
         class786 var25 = new class786();
         short var27 = (short)var3.length;
         short var28 = (short)var10.length;
         var25.field3796 = var27;
         var25.field3802 = new short[var27];
         var25.field3799 = new short[var27];
         var25.field3800 = new short[var27];
         var25.field3801 = new short[var27];

         int var21;
         int var22;
         int var23;
         for(int var20 = 0; var20 < var27; ++var20) {
            var21 = var3[var20];
            var22 = var5[var20];
            int var24;
            if (var21 == 0 && var22 == 0) {
               var25.field3802[var20] = (short)(this.field10065[var1][var2] - this.field10066[var1][var2]);
            } else if (var21 == 0 && var22 == this.field7227 * -1212653763) {
               var25.field3802[var20] = (short)(this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]);
            } else if (var21 == this.field7227 * -1212653763 && var22 == this.field7227 * -1212653763) {
               var25.field3802[var20] = (short)(this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]);
            } else if (var21 == this.field7227 * -1212653763 && var22 == 0) {
               var25.field3802[var20] = (short)(this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]);
            } else {
               var23 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var21;
               var24 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var21;
               var25.field3802[var20] = (short)(var23 * (this.field7227 * -1212653763 - var22) + var24 * var22 >> this.field7228 * 20267538);
            }

            var23 = (var1 << this.field7228 * -2137349879) + var21;
            var24 = (var2 << this.field7228 * -2137349879) + var22;
            var25.field3799[var20] = (short)var21;
            var25.field3801[var20] = (short)var22;
            var25.field3800[var20] = (short)(this.method3887(var23, var24, -2032546575) + (var4 != null ? var4[var20] : 0));
            if (var25.field3802[var20] < 2) {
               var25.field3802[var20] = 2;
            }
         }

         boolean var29 = false;
         var21 = 0;

         for(var22 = 0; var22 < var28; ++var22) {
            if (var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               ++var21;
            }

            var23 = var12[var22];
            if (var23 != -1) {
               class414 var32 = this.field10037.field8581.method4625(var23, 254420286);
               if (!var32.field9378) {
                  var29 = true;
                  if (this.method6123(var32.field9383) || var32.field9389 != 0 || var32.field9363 != 0) {
                     var25.field3807 = (byte)(var25.field3807 | 4);
                  }
               }
            }
         }

         var25.field3808 = new int[var21];
         if (var11 != null) {
            var25.field3809 = new int[var21];
         }

         var25.field3803 = new short[var21];
         var25.field3798 = new short[var21];
         var25.field3805 = new short[var21];
         if (var29) {
            var25.field3806 = new short[var21];
            var25.field3797 = new short[var21];
         }

         for(var22 = 0; var22 < var28; ++var22) {
            if (var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               if (var10[var22] >= 0) {
                  var25.field3808[var25.field3804] = class526.method2228(var10[var22], (byte)0);
               } else {
                  var25.field3808[var25.field3804] = -1;
               }

               if (var11 != null) {
                  if (var11[var22] != -1) {
                     var25.field3809[var25.field3804] = class526.method2228(var11[var22], (byte)0);
                  } else {
                     var25.field3809[var25.field3804] = -1;
                  }
               }

               var25.field3803[var25.field3804] = (short)var7[var22];
               var25.field3798[var25.field3804] = (short)var8[var22];
               var25.field3805[var25.field3804] = (short)var9[var22];
               if (var29) {
                  if (var12[var22] != -1 && !this.field10037.field8581.method4625(var12[var22], 1342986540).field9378) {
                     var25.field3806[var25.field3804] = (short)var12[var22];
                     var25.field3797[var25.field3804] = (short)var13[var22];
                  } else {
                     var25.field3806[var25.field3804] = -1;
                  }
               }

               ++var25.field3804;
            }
         }

         this.field10048[var1][var2] = var25;
      } else if (var10[0] >= 0 || var11 != null && var11[0] >= 0) {
         class67 var26 = new class67();
         var18 = var10[0];
         var19 = var12[0];
         if (var11 != null) {
            var26.field1691 = class63.method1253(class526.method2228(var11[0], (byte)0), this.field10065[var1][var2] - this.field10066[var1][var2], -952106382);
            if (var18 == -1) {
               var26.field1688 = (byte)(var26.field1688 | 2);
            }
         }

         if (this.field7229[var1][var2] == this.field7229[var1 + 1][var2] && this.field7229[var1][var2] == this.field7229[var1 + 1][var2 + 1] && this.field7229[var1][var2] == this.field7229[var1][var2 + 1]) {
            var26.field1688 = (byte)(var26.field1688 | 1);
         }

         class414 var30 = null;
         if (var19 != -1) {
            var30 = this.field10037.field8581.method4625(var19, 1689468609);
         }

         if (var30 != null && (var26.field1688 & 2) == 0 && !var30.field9378) {
            var26.field1692 = (short)(this.field10065[var1][var2] - this.field10066[var1][var2]);
            var26.field1689 = (short)(this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]);
            var26.field1690 = (short)(this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]);
            var26.field1687 = (short)(this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]);
            var26.field1693 = (short)var19;
            if (this.method6123(var30.field9383) || var30.field9389 != 0 || var30.field9363 != 0) {
               var26.field1688 = (byte)(var26.field1688 | 4);
            }
         } else {
            short var31 = class526.method2228(var18, (byte)0);
            var26.field1692 = (short)class63.method1253(var31, this.field10065[var1][var2] - this.field10066[var1][var2], -952106382);
            var26.field1689 = (short)class63.method1253(var31, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2], -952106382);
            var26.field1690 = (short)class63.method1253(var31, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1], -952106382);
            var26.field1687 = (short)class63.method1253(var31, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1], -952106382);
            var26.field1693 = -1;
         }

         this.field10044[var1][var2] = var26;
      }

   }

   public void method3917(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      boolean var13 = (this.field10045 & 32) == 0;
      if (this.field10046 == null && !var13) {
         this.field10046 = new class805[this.field7226 * -506105871][this.field7225 * -1148794921];
         this.field10047 = new class796[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10068 == null && var13) {
         this.field10068 = new class970[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10044 != null) {
         throw new IllegalStateException();
      }

      if (var3 != null && var3.length != 0) {
         int var14;
         for(var14 = 0; var14 < var7.length; ++var14) {
            if (var7[var14] == -1) {
               var7[var14] = 0;
            } else {
               var7[var14] = class543.field3817[class526.method2228(var7[var14], (byte)0) & '\uffff'] << 8 | 255;
            }
         }

         if (var8 != null) {
            for(var14 = 0; var14 < var8.length; ++var14) {
               if (var8[var14] == -1) {
                  var8[var14] = 0;
               } else {
                  var8[var14] = class543.field3817[class526.method2228(var8[var14], (byte)0) & '\uffff'] << 8 | 255;
               }
            }
         }

         int var15;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var33;
         if (var13) {
            class970 var29 = new class970();
            var29.field2989 = (short)var3.length;
            var29.field2991 = (short)(var3.length / 3);
            var29.field2990 = new short[var29.field2989];
            var29.field2996 = new short[var29.field2989];
            var29.field2998 = new short[var29.field2989];
            var29.field2992 = new int[var29.field2989];
            var29.field2994 = new short[var29.field2989];
            var29.field2995 = new short[var29.field2989];
            var29.field2997 = new byte[var29.field2989];
            if (var6 != null) {
               var29.field2993 = new short[var29.field2989];
            }

            for(var15 = 0; var15 < var29.field2989; ++var15) {
               var16 = var3[var15];
               var17 = var5[var15];
               boolean var18 = false;
               if (var16 == 0 && var17 == 0) {
                  var19 = this.field10065[var1][var2] - this.field10066[var1][var2];
               } else if (var16 == 0 && var17 == this.field7227 * -1212653763) {
                  var19 = this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1];
               } else if (var16 == this.field7227 * -1212653763 && var17 == this.field7227 * -1212653763) {
                  var19 = this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1];
               } else if (var16 == this.field7227 * -1212653763 && var17 == 0) {
                  var19 = this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2];
               } else {
                  var20 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var16) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var16;
                  var21 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var16) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var16;
                  var19 = var20 * (this.field7227 * -1212653763 - var17) + var21 * var17 >> this.field7228 * 20267538;
               }

               var20 = (var1 << this.field7228 * -2137349879) + var16;
               var21 = (var2 << this.field7228 * -2137349879) + var17;
               var29.field2990[var15] = (short)var16;
               var29.field2998[var15] = (short)var17;
               var29.field2996[var15] = (short)(this.method3887(var20, var21, -2009080291) + (var4 != null ? var4[var15] : 0));
               if (var19 < 0) {
                  var19 = 0;
               }

               if (var7[var15] == 0) {
                  var29.field2992[var15] = 0;
                  if (var8 != null) {
                     var29.field2997[var15] = (byte)var19;
                  }
               } else {
                  var22 = 0;
                  if (var6 != null) {
                     short var23 = var29.field2993[var15] = (short)var6[var15];
                     if (var11.field10425 * 1996750669 != 0) {
                        var22 = 255 * var23 / (var11.field10425 * 1996750669);
                        if (var22 < 0) {
                           var22 = 0;
                        } else if (var22 > 255) {
                           var22 = 255;
                        }
                     }
                  }

                  var33 = -16777216;
                  if (var9[var15] != -1 && this.method6123(this.field10037.field8581.method4625(var9[var15], 655564725).field9383)) {
                     var33 = -1694498816;
                  }

                  var29.field2992[var15] = var33 | class109.method1210(method6124(var7[var15] >> 8, var19), var11.field10426 * -1212608691, var22, 1960218609);
                  if (var8 != null) {
                     var29.field2997[var15] = (byte)var19;
                  }
               }

               var29.field2994[var15] = (short)var9[var15];
               var29.field2995[var15] = (short)var10[var15];
            }

            if (var8 != null) {
               var29.field2988 = new int[var29.field2991];
            }

            for(var15 = 0; var15 < var29.field2991; ++var15) {
               var16 = var15 * 3;
               if (var8 != null && var8[var16] != 0) {
                  var29.field2988[var15] = -16777216 | var8[var16] >> 8;
               }
            }

            this.field10068[var1][var2] = var29;
         } else {
            boolean var30 = true;
            var15 = -1;
            var16 = -1;
            var17 = -1;
            int var31 = -1;
            if (var3.length != 6) {
               var30 = false;
            } else {
               for(var19 = 0; var19 < 6; ++var19) {
                  if (var3[var19] == 0 && var5[var19] == 0) {
                     if (var15 != -1 && var7[var15] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var15 = var19;
                  } else if (var3[var19] == this.field7227 * -1212653763 && var5[var19] == 0) {
                     if (var16 != -1 && var7[var16] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var16 = var19;
                  } else if (var3[var19] == this.field7227 * -1212653763 && var5[var19] == this.field7227 * -1212653763) {
                     if (var17 != -1 && var7[var17] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var17 = var19;
                  } else if (var3[var19] == 0 && var5[var19] == this.field7227 * -1212653763) {
                     if (var31 != -1 && var7[var31] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var31 = var19;
                  }
               }

               if (var15 == -1 || var16 == -1 || var17 == -1 || var31 == -1) {
                  var30 = false;
               }

               if (var30) {
                  if (var4 != null) {
                     for(var19 = 0; var19 < 4; ++var19) {
                        if (var4[var19] != 0) {
                           var30 = false;
                           break;
                        }
                     }
                  }

                  if (var30) {
                     for(var19 = 1; var19 < 4; ++var19) {
                        if (var3[var19] != var3[0] && var3[var19] != var3[0] + this.field7227 * -1212653763 && var3[var19] != var3[0] - this.field7227 * -1212653763) {
                           var30 = false;
                           break;
                        }

                        if (var5[var19] != var5[0] && var5[var19] != var5[0] + this.field7227 * -1212653763 && var5[var19] != var5[0] - this.field7227 * -1212653763) {
                           var30 = false;
                           break;
                        }
                     }
                  }
               }
            }

            if (var30) {
               class805 var34 = new class805();
               var20 = var7[0];
               var21 = var9[0];
               if (var8 != null) {
                  var34.field4408 = var8[0] >> 8;
                  if (var20 == 0) {
                     var34.field4403 = (byte)(var34.field4403 | 2);
                  }
               } else if (var20 == 0) {
                  return;
               }

               if (this.field7229[var1][var2] == this.field7229[var1 + 1][var2] && this.field7229[var1][var2] == this.field7229[var1 + 1][var2 + 1] && this.field7229[var1][var2] == this.field7229[var1][var2 + 1]) {
                  var34.field4403 = (byte)(var34.field4403 | 1);
               }

               if (var21 != -1 && (var34.field4403 & 2) == 0 && !this.field10037.field8581.method4625(var21, 1091806927).field9378) {
                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var15] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4400 = class109.method1210(method6124(var7[var15] >> 8, this.field10065[var1][var2] - this.field10066[var1][var2]), var11.field10426 * -1212608691, var22, 1531970140);
                  if (var34.field4408 != 0) {
                     var34.field4400 |= 255 - (this.field10065[var1][var2] - this.field10066[var1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var16] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4401 = class109.method1210(method6124(var7[var16] >> 8, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]), var11.field10426 * -1212608691, var22, 1359167181);
                  if (var34.field4408 != 0) {
                     var34.field4401 |= 255 - (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var17] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4399 = class109.method1210(method6124(var7[var17] >> 8, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]), var11.field10426 * -1212608691, var22, 1398076984);
                  if (var34.field4408 != 0) {
                     var34.field4399 |= 255 - (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var31] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4407 = class109.method1210(method6124(var7[var31] >> 8, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]), var11.field10426 * -1212608691, var22, 1767017217);
                  var34.field4409 = (short)var21;
               } else {
                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var15] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4400 = class109.method1210(method6124(var7[var15] >> 8, this.field10065[var1][var2] - this.field10066[var1][var2]), var11.field10426 * -1212608691, var22, 1749633676);
                  if (var34.field4408 != 0) {
                     var34.field4400 |= 255 - (this.field10065[var1][var2] - this.field10066[var1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var16] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4401 = class109.method1210(method6124(var7[var16] >> 8, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]), var11.field10426 * -1212608691, var22, 1537855018);
                  if (var34.field4408 != 0) {
                     var34.field4401 |= 255 - (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var17] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4399 = class109.method1210(method6124(var7[var17] >> 8, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]), var11.field10426 * -1212608691, var22, 1849957541);
                  if (var34.field4408 != 0) {
                     var34.field4399 |= 255 - (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var31] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4407 = class109.method1210(method6124(var7[var31] >> 8, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]), var11.field10426 * -1212608691, var22, 1734535343);
                  if (var34.field4408 != 0) {
                     var34.field4407 |= 255 - (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) << 25;
                  }

                  var34.field4409 = -1;
               }

               if (var6 != null) {
                  var34.field4406 = (short)var6[var17];
                  var34.field4404 = (short)var6[var31];
                  var34.field4405 = (short)var6[var16];
                  var34.field4402 = (short)var6[var15];
               }

               this.field10046[var1][var2] = var34;
            } else {
               class796 var35 = new class796();
               var35.field483 = (short)var3.length;
               var35.field492 = (short)(var3.length / 3);
               var35.field482 = new short[var35.field483];
               var35.field486 = new short[var35.field483];
               var35.field487 = new short[var35.field483];
               var35.field489 = new int[var35.field483];
               if (var6 != null) {
                  var35.field490 = new short[var35.field483];
               }

               int var24;
               int var27;
               for(var20 = 0; var20 < var35.field483; ++var20) {
                  var21 = var3[var20];
                  var22 = var5[var20];
                  boolean var36 = false;
                  int var25;
                  int var26;
                  if (var21 == 0 && var22 == 0) {
                     var24 = this.field10065[var1][var2] - this.field10066[var1][var2];
                  } else if (var21 == 0 && var22 == this.field7227 * -1212653763) {
                     var24 = this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1];
                  } else if (var21 == this.field7227 * -1212653763 && var22 == this.field7227 * -1212653763) {
                     var24 = this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1];
                  } else if (var21 == this.field7227 * -1212653763 && var22 == 0) {
                     var24 = this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2];
                  } else {
                     var25 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var21;
                     var26 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var21;
                     var24 = var25 * (this.field7227 * -1212653763 - var22) + var26 * var22 >> this.field7228 * 20267538;
                  }

                  var25 = (var1 << this.field7228 * -2137349879) + var21;
                  var26 = (var2 << this.field7228 * -2137349879) + var22;
                  var35.field482[var20] = (short)var21;
                  var35.field487[var20] = (short)var22;
                  var35.field486[var20] = (short)(this.method3887(var25, var26, -1593082213) + (var4 != null ? var4[var20] : 0));
                  if (var24 < 0) {
                     var24 = 0;
                  }

                  if (var7[var20] == 0) {
                     if (var8 != null) {
                        var35.field489[var20] = var24 << 25;
                     } else {
                        var35.field489[var20] = 0;
                     }
                  } else {
                     var27 = 0;
                     if (var6 != null) {
                        short var28 = var35.field490[var20] = (short)var6[var20];
                        if (var11.field10425 * 1996750669 != 0) {
                           var27 = 255 * var28 / (var11.field10425 * 1996750669);
                           if (var27 < 0) {
                              var27 = 0;
                           } else if (var27 > 255) {
                              var27 = 255;
                           }
                        }
                     }

                     var35.field489[var20] = class109.method1210(method6124(var7[var20] >> 8, var24), var11.field10426 * -1212608691, var27, 2119536139);
                     if (var8 != null) {
                        var35.field489[var20] |= var24 << 25;
                     }
                  }
               }

               boolean var32 = false;

               for(var21 = 0; var21 < var35.field492; ++var21) {
                  if (var9[var21 * 3] != -1 && !this.field10037.field8581.method4625(var9[var21 * 3], 437593944).field9378) {
                     var32 = true;
                  }
               }

               if (var8 != null) {
                  var35.field488 = new int[var35.field492];
               }

               if (var32) {
                  var35.field491 = new short[var35.field492];
                  var35.field485 = new short[var35.field492];
               }

               for(var21 = 0; var21 < var35.field492; ++var21) {
                  var22 = var21 * 3;
                  if (var8 != null && var8[var22] != 0) {
                     var35.field488[var21] = var8[var22] >> 8;
                  }

                  if (var32) {
                     var33 = var22 + 1;
                     var24 = var33 + 1;
                     boolean var37 = false;
                     boolean var38 = true;
                     var27 = var9[var22];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1926498774).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     var27 = var9[var33];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1409820429).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     var27 = var9[var24];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 194423041).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     if (var38) {
                        var35.field491[var21] = (short)var27;
                        var35.field485[var21] = (short)var10[var22];
                     } else {
                        if (var37) {
                           var27 = var9[var22];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1212763495).field9378) {
                              var35.field489[var22] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 126116111).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }

                           var27 = var9[var33];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1723986111).field9378) {
                              var35.field489[var33] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 733883645).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }

                           var27 = var9[var24];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 288250128).field9378) {
                              var35.field489[var24] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 235996796).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }
                        }

                        var35.field491[var21] = -1;
                     }
                  }
               }

               this.field10047[var1][var2] = var35;
            }
         }
      }

   }

   public void method3897(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      boolean var13 = (this.field10045 & 32) == 0;
      if (this.field10046 == null && !var13) {
         this.field10046 = new class805[this.field7226 * -506105871][this.field7225 * -1148794921];
         this.field10047 = new class796[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10068 == null && var13) {
         this.field10068 = new class970[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10044 != null) {
         throw new IllegalStateException();
      }

      if (var3 != null && var3.length != 0) {
         int var14;
         for(var14 = 0; var14 < var7.length; ++var14) {
            if (var7[var14] == -1) {
               var7[var14] = 0;
            } else {
               var7[var14] = class543.field3817[class526.method2228(var7[var14], (byte)0) & '\uffff'] << 8 | 255;
            }
         }

         if (var8 != null) {
            for(var14 = 0; var14 < var8.length; ++var14) {
               if (var8[var14] == -1) {
                  var8[var14] = 0;
               } else {
                  var8[var14] = class543.field3817[class526.method2228(var8[var14], (byte)0) & '\uffff'] << 8 | 255;
               }
            }
         }

         int var15;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var33;
         if (var13) {
            class970 var29 = new class970();
            var29.field2989 = (short)var3.length;
            var29.field2991 = (short)(var3.length / 3);
            var29.field2990 = new short[var29.field2989];
            var29.field2996 = new short[var29.field2989];
            var29.field2998 = new short[var29.field2989];
            var29.field2992 = new int[var29.field2989];
            var29.field2994 = new short[var29.field2989];
            var29.field2995 = new short[var29.field2989];
            var29.field2997 = new byte[var29.field2989];
            if (var6 != null) {
               var29.field2993 = new short[var29.field2989];
            }

            for(var15 = 0; var15 < var29.field2989; ++var15) {
               var16 = var3[var15];
               var17 = var5[var15];
               boolean var18 = false;
               if (var16 == 0 && var17 == 0) {
                  var19 = this.field10065[var1][var2] - this.field10066[var1][var2];
               } else if (var16 == 0 && var17 == this.field7227 * -1212653763) {
                  var19 = this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1];
               } else if (var16 == this.field7227 * -1212653763 && var17 == this.field7227 * -1212653763) {
                  var19 = this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1];
               } else if (var16 == this.field7227 * -1212653763 && var17 == 0) {
                  var19 = this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2];
               } else {
                  var20 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var16) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var16;
                  var21 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var16) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var16;
                  var19 = var20 * (this.field7227 * -1212653763 - var17) + var21 * var17 >> this.field7228 * 20267538;
               }

               var20 = (var1 << this.field7228 * -2137349879) + var16;
               var21 = (var2 << this.field7228 * -2137349879) + var17;
               var29.field2990[var15] = (short)var16;
               var29.field2998[var15] = (short)var17;
               var29.field2996[var15] = (short)(this.method3887(var20, var21, -2056223292) + (var4 != null ? var4[var15] : 0));
               if (var19 < 0) {
                  var19 = 0;
               }

               if (var7[var15] == 0) {
                  var29.field2992[var15] = 0;
                  if (var8 != null) {
                     var29.field2997[var15] = (byte)var19;
                  }
               } else {
                  var22 = 0;
                  if (var6 != null) {
                     short var23 = var29.field2993[var15] = (short)var6[var15];
                     if (var11.field10425 * 1996750669 != 0) {
                        var22 = 255 * var23 / (var11.field10425 * 1996750669);
                        if (var22 < 0) {
                           var22 = 0;
                        } else if (var22 > 255) {
                           var22 = 255;
                        }
                     }
                  }

                  var33 = -16777216;
                  if (var9[var15] != -1 && this.method6123(this.field10037.field8581.method4625(var9[var15], 1064315801).field9383)) {
                     var33 = -1694498816;
                  }

                  var29.field2992[var15] = var33 | class109.method1210(method6124(var7[var15] >> 8, var19), var11.field10426 * -1212608691, var22, 1457043822);
                  if (var8 != null) {
                     var29.field2997[var15] = (byte)var19;
                  }
               }

               var29.field2994[var15] = (short)var9[var15];
               var29.field2995[var15] = (short)var10[var15];
            }

            if (var8 != null) {
               var29.field2988 = new int[var29.field2991];
            }

            for(var15 = 0; var15 < var29.field2991; ++var15) {
               var16 = var15 * 3;
               if (var8 != null && var8[var16] != 0) {
                  var29.field2988[var15] = -16777216 | var8[var16] >> 8;
               }
            }

            this.field10068[var1][var2] = var29;
         } else {
            boolean var30 = true;
            var15 = -1;
            var16 = -1;
            var17 = -1;
            int var31 = -1;
            if (var3.length != 6) {
               var30 = false;
            } else {
               for(var19 = 0; var19 < 6; ++var19) {
                  if (var3[var19] == 0 && var5[var19] == 0) {
                     if (var15 != -1 && var7[var15] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var15 = var19;
                  } else if (var3[var19] == this.field7227 * -1212653763 && var5[var19] == 0) {
                     if (var16 != -1 && var7[var16] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var16 = var19;
                  } else if (var3[var19] == this.field7227 * -1212653763 && var5[var19] == this.field7227 * -1212653763) {
                     if (var17 != -1 && var7[var17] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var17 = var19;
                  } else if (var3[var19] == 0 && var5[var19] == this.field7227 * -1212653763) {
                     if (var31 != -1 && var7[var31] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var31 = var19;
                  }
               }

               if (var15 == -1 || var16 == -1 || var17 == -1 || var31 == -1) {
                  var30 = false;
               }

               if (var30) {
                  if (var4 != null) {
                     for(var19 = 0; var19 < 4; ++var19) {
                        if (var4[var19] != 0) {
                           var30 = false;
                           break;
                        }
                     }
                  }

                  if (var30) {
                     for(var19 = 1; var19 < 4; ++var19) {
                        if (var3[var19] != var3[0] && var3[var19] != var3[0] + this.field7227 * -1212653763 && var3[var19] != var3[0] - this.field7227 * -1212653763) {
                           var30 = false;
                           break;
                        }

                        if (var5[var19] != var5[0] && var5[var19] != var5[0] + this.field7227 * -1212653763 && var5[var19] != var5[0] - this.field7227 * -1212653763) {
                           var30 = false;
                           break;
                        }
                     }
                  }
               }
            }

            if (var30) {
               class805 var34 = new class805();
               var20 = var7[0];
               var21 = var9[0];
               if (var8 != null) {
                  var34.field4408 = var8[0] >> 8;
                  if (var20 == 0) {
                     var34.field4403 = (byte)(var34.field4403 | 2);
                  }
               } else if (var20 == 0) {
                  return;
               }

               if (this.field7229[var1][var2] == this.field7229[var1 + 1][var2] && this.field7229[var1][var2] == this.field7229[var1 + 1][var2 + 1] && this.field7229[var1][var2] == this.field7229[var1][var2 + 1]) {
                  var34.field4403 = (byte)(var34.field4403 | 1);
               }

               if (var21 != -1 && (var34.field4403 & 2) == 0 && !this.field10037.field8581.method4625(var21, 877964845).field9378) {
                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var15] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4400 = class109.method1210(method6124(var7[var15] >> 8, this.field10065[var1][var2] - this.field10066[var1][var2]), var11.field10426 * -1212608691, var22, 2014166016);
                  if (var34.field4408 != 0) {
                     var34.field4400 |= 255 - (this.field10065[var1][var2] - this.field10066[var1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var16] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4401 = class109.method1210(method6124(var7[var16] >> 8, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]), var11.field10426 * -1212608691, var22, 1449289394);
                  if (var34.field4408 != 0) {
                     var34.field4401 |= 255 - (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var17] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4399 = class109.method1210(method6124(var7[var17] >> 8, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]), var11.field10426 * -1212608691, var22, 2027722285);
                  if (var34.field4408 != 0) {
                     var34.field4399 |= 255 - (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var31] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4407 = class109.method1210(method6124(var7[var31] >> 8, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]), var11.field10426 * -1212608691, var22, 1736085661);
                  var34.field4409 = (short)var21;
               } else {
                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var15] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4400 = class109.method1210(method6124(var7[var15] >> 8, this.field10065[var1][var2] - this.field10066[var1][var2]), var11.field10426 * -1212608691, var22, 1646809251);
                  if (var34.field4408 != 0) {
                     var34.field4400 |= 255 - (this.field10065[var1][var2] - this.field10066[var1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var16] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4401 = class109.method1210(method6124(var7[var16] >> 8, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]), var11.field10426 * -1212608691, var22, 1494836787);
                  if (var34.field4408 != 0) {
                     var34.field4401 |= 255 - (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var17] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4399 = class109.method1210(method6124(var7[var17] >> 8, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]), var11.field10426 * -1212608691, var22, 1688257678);
                  if (var34.field4408 != 0) {
                     var34.field4399 |= 255 - (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var31] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4407 = class109.method1210(method6124(var7[var31] >> 8, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]), var11.field10426 * -1212608691, var22, 1726070019);
                  if (var34.field4408 != 0) {
                     var34.field4407 |= 255 - (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) << 25;
                  }

                  var34.field4409 = -1;
               }

               if (var6 != null) {
                  var34.field4406 = (short)var6[var17];
                  var34.field4404 = (short)var6[var31];
                  var34.field4405 = (short)var6[var16];
                  var34.field4402 = (short)var6[var15];
               }

               this.field10046[var1][var2] = var34;
            } else {
               class796 var35 = new class796();
               var35.field483 = (short)var3.length;
               var35.field492 = (short)(var3.length / 3);
               var35.field482 = new short[var35.field483];
               var35.field486 = new short[var35.field483];
               var35.field487 = new short[var35.field483];
               var35.field489 = new int[var35.field483];
               if (var6 != null) {
                  var35.field490 = new short[var35.field483];
               }

               int var24;
               int var27;
               for(var20 = 0; var20 < var35.field483; ++var20) {
                  var21 = var3[var20];
                  var22 = var5[var20];
                  boolean var36 = false;
                  int var25;
                  int var26;
                  if (var21 == 0 && var22 == 0) {
                     var24 = this.field10065[var1][var2] - this.field10066[var1][var2];
                  } else if (var21 == 0 && var22 == this.field7227 * -1212653763) {
                     var24 = this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1];
                  } else if (var21 == this.field7227 * -1212653763 && var22 == this.field7227 * -1212653763) {
                     var24 = this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1];
                  } else if (var21 == this.field7227 * -1212653763 && var22 == 0) {
                     var24 = this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2];
                  } else {
                     var25 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var21;
                     var26 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var21;
                     var24 = var25 * (this.field7227 * -1212653763 - var22) + var26 * var22 >> this.field7228 * 20267538;
                  }

                  var25 = (var1 << this.field7228 * -2137349879) + var21;
                  var26 = (var2 << this.field7228 * -2137349879) + var22;
                  var35.field482[var20] = (short)var21;
                  var35.field487[var20] = (short)var22;
                  var35.field486[var20] = (short)(this.method3887(var25, var26, -1384967448) + (var4 != null ? var4[var20] : 0));
                  if (var24 < 0) {
                     var24 = 0;
                  }

                  if (var7[var20] == 0) {
                     if (var8 != null) {
                        var35.field489[var20] = var24 << 25;
                     } else {
                        var35.field489[var20] = 0;
                     }
                  } else {
                     var27 = 0;
                     if (var6 != null) {
                        short var28 = var35.field490[var20] = (short)var6[var20];
                        if (var11.field10425 * 1996750669 != 0) {
                           var27 = 255 * var28 / (var11.field10425 * 1996750669);
                           if (var27 < 0) {
                              var27 = 0;
                           } else if (var27 > 255) {
                              var27 = 255;
                           }
                        }
                     }

                     var35.field489[var20] = class109.method1210(method6124(var7[var20] >> 8, var24), var11.field10426 * -1212608691, var27, 1828406784);
                     if (var8 != null) {
                        var35.field489[var20] |= var24 << 25;
                     }
                  }
               }

               boolean var32 = false;

               for(var21 = 0; var21 < var35.field492; ++var21) {
                  if (var9[var21 * 3] != -1 && !this.field10037.field8581.method4625(var9[var21 * 3], 1735356467).field9378) {
                     var32 = true;
                  }
               }

               if (var8 != null) {
                  var35.field488 = new int[var35.field492];
               }

               if (var32) {
                  var35.field491 = new short[var35.field492];
                  var35.field485 = new short[var35.field492];
               }

               for(var21 = 0; var21 < var35.field492; ++var21) {
                  var22 = var21 * 3;
                  if (var8 != null && var8[var22] != 0) {
                     var35.field488[var21] = var8[var22] >> 8;
                  }

                  if (var32) {
                     var33 = var22 + 1;
                     var24 = var33 + 1;
                     boolean var37 = false;
                     boolean var38 = true;
                     var27 = var9[var22];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1509673183).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     var27 = var9[var33];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1797633713).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     var27 = var9[var24];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 858725008).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     if (var38) {
                        var35.field491[var21] = (short)var27;
                        var35.field485[var21] = (short)var10[var22];
                     } else {
                        if (var37) {
                           var27 = var9[var22];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1600359220).field9378) {
                              var35.field489[var22] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 221958675).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }

                           var27 = var9[var33];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1243444825).field9378) {
                              var35.field489[var33] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 402575610).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }

                           var27 = var9[var24];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 956050141).field9378) {
                              var35.field489[var24] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 130835557).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }
                        }

                        var35.field491[var21] = -1;
                     }
                  }
               }

               this.field10047[var1][var2] = var35;
            }
         }
      }

   }

   public void method3896(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      boolean var13 = (this.field10045 & 32) == 0;
      if (this.field10046 == null && !var13) {
         this.field10046 = new class805[this.field7226 * -506105871][this.field7225 * -1148794921];
         this.field10047 = new class796[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10068 == null && var13) {
         this.field10068 = new class970[this.field7226 * -506105871][this.field7225 * -1148794921];
      } else if (this.field10044 != null) {
         throw new IllegalStateException();
      }

      if (var3 != null && var3.length != 0) {
         int var14;
         for(var14 = 0; var14 < var7.length; ++var14) {
            if (var7[var14] == -1) {
               var7[var14] = 0;
            } else {
               var7[var14] = class543.field3817[class526.method2228(var7[var14], (byte)0) & '\uffff'] << 8 | 255;
            }
         }

         if (var8 != null) {
            for(var14 = 0; var14 < var8.length; ++var14) {
               if (var8[var14] == -1) {
                  var8[var14] = 0;
               } else {
                  var8[var14] = class543.field3817[class526.method2228(var8[var14], (byte)0) & '\uffff'] << 8 | 255;
               }
            }
         }

         int var15;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var33;
         if (var13) {
            class970 var29 = new class970();
            var29.field2989 = (short)var3.length;
            var29.field2991 = (short)(var3.length / 3);
            var29.field2990 = new short[var29.field2989];
            var29.field2996 = new short[var29.field2989];
            var29.field2998 = new short[var29.field2989];
            var29.field2992 = new int[var29.field2989];
            var29.field2994 = new short[var29.field2989];
            var29.field2995 = new short[var29.field2989];
            var29.field2997 = new byte[var29.field2989];
            if (var6 != null) {
               var29.field2993 = new short[var29.field2989];
            }

            for(var15 = 0; var15 < var29.field2989; ++var15) {
               var16 = var3[var15];
               var17 = var5[var15];
               boolean var18 = false;
               if (var16 == 0 && var17 == 0) {
                  var19 = this.field10065[var1][var2] - this.field10066[var1][var2];
               } else if (var16 == 0 && var17 == this.field7227 * -1212653763) {
                  var19 = this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1];
               } else if (var16 == this.field7227 * -1212653763 && var17 == this.field7227 * -1212653763) {
                  var19 = this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1];
               } else if (var16 == this.field7227 * -1212653763 && var17 == 0) {
                  var19 = this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2];
               } else {
                  var20 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var16) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var16;
                  var21 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var16) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var16;
                  var19 = var20 * (this.field7227 * -1212653763 - var17) + var21 * var17 >> this.field7228 * 20267538;
               }

               var20 = (var1 << this.field7228 * -2137349879) + var16;
               var21 = (var2 << this.field7228 * -2137349879) + var17;
               var29.field2990[var15] = (short)var16;
               var29.field2998[var15] = (short)var17;
               var29.field2996[var15] = (short)(this.method3887(var20, var21, -1431096124) + (var4 != null ? var4[var15] : 0));
               if (var19 < 0) {
                  var19 = 0;
               }

               if (var7[var15] == 0) {
                  var29.field2992[var15] = 0;
                  if (var8 != null) {
                     var29.field2997[var15] = (byte)var19;
                  }
               } else {
                  var22 = 0;
                  if (var6 != null) {
                     short var23 = var29.field2993[var15] = (short)var6[var15];
                     if (var11.field10425 * 1996750669 != 0) {
                        var22 = 255 * var23 / (var11.field10425 * 1996750669);
                        if (var22 < 0) {
                           var22 = 0;
                        } else if (var22 > 255) {
                           var22 = 255;
                        }
                     }
                  }

                  var33 = -16777216;
                  if (var9[var15] != -1 && this.method6123(this.field10037.field8581.method4625(var9[var15], 1642098791).field9383)) {
                     var33 = -1694498816;
                  }

                  var29.field2992[var15] = var33 | class109.method1210(method6124(var7[var15] >> 8, var19), var11.field10426 * -1212608691, var22, 1894029973);
                  if (var8 != null) {
                     var29.field2997[var15] = (byte)var19;
                  }
               }

               var29.field2994[var15] = (short)var9[var15];
               var29.field2995[var15] = (short)var10[var15];
            }

            if (var8 != null) {
               var29.field2988 = new int[var29.field2991];
            }

            for(var15 = 0; var15 < var29.field2991; ++var15) {
               var16 = var15 * 3;
               if (var8 != null && var8[var16] != 0) {
                  var29.field2988[var15] = -16777216 | var8[var16] >> 8;
               }
            }

            this.field10068[var1][var2] = var29;
         } else {
            boolean var30 = true;
            var15 = -1;
            var16 = -1;
            var17 = -1;
            int var31 = -1;
            if (var3.length != 6) {
               var30 = false;
            } else {
               for(var19 = 0; var19 < 6; ++var19) {
                  if (var3[var19] == 0 && var5[var19] == 0) {
                     if (var15 != -1 && var7[var15] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var15 = var19;
                  } else if (var3[var19] == this.field7227 * -1212653763 && var5[var19] == 0) {
                     if (var16 != -1 && var7[var16] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var16 = var19;
                  } else if (var3[var19] == this.field7227 * -1212653763 && var5[var19] == this.field7227 * -1212653763) {
                     if (var17 != -1 && var7[var17] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var17 = var19;
                  } else if (var3[var19] == 0 && var5[var19] == this.field7227 * -1212653763) {
                     if (var31 != -1 && var7[var31] != var7[var19]) {
                        var30 = false;
                        break;
                     }

                     var31 = var19;
                  }
               }

               if (var15 == -1 || var16 == -1 || var17 == -1 || var31 == -1) {
                  var30 = false;
               }

               if (var30) {
                  if (var4 != null) {
                     for(var19 = 0; var19 < 4; ++var19) {
                        if (var4[var19] != 0) {
                           var30 = false;
                           break;
                        }
                     }
                  }

                  if (var30) {
                     for(var19 = 1; var19 < 4; ++var19) {
                        if (var3[var19] != var3[0] && var3[var19] != var3[0] + this.field7227 * -1212653763 && var3[var19] != var3[0] - this.field7227 * -1212653763) {
                           var30 = false;
                           break;
                        }

                        if (var5[var19] != var5[0] && var5[var19] != var5[0] + this.field7227 * -1212653763 && var5[var19] != var5[0] - this.field7227 * -1212653763) {
                           var30 = false;
                           break;
                        }
                     }
                  }
               }
            }

            if (var30) {
               class805 var34 = new class805();
               var20 = var7[0];
               var21 = var9[0];
               if (var8 != null) {
                  var34.field4408 = var8[0] >> 8;
                  if (var20 == 0) {
                     var34.field4403 = (byte)(var34.field4403 | 2);
                  }
               } else if (var20 == 0) {
                  return;
               }

               if (this.field7229[var1][var2] == this.field7229[var1 + 1][var2] && this.field7229[var1][var2] == this.field7229[var1 + 1][var2 + 1] && this.field7229[var1][var2] == this.field7229[var1][var2 + 1]) {
                  var34.field4403 = (byte)(var34.field4403 | 1);
               }

               if (var21 != -1 && (var34.field4403 & 2) == 0 && !this.field10037.field8581.method4625(var21, 1879191473).field9378) {
                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var15] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4400 = class109.method1210(method6124(var7[var15] >> 8, this.field10065[var1][var2] - this.field10066[var1][var2]), var11.field10426 * -1212608691, var22, 1823240106);
                  if (var34.field4408 != 0) {
                     var34.field4400 |= 255 - (this.field10065[var1][var2] - this.field10066[var1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var16] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4401 = class109.method1210(method6124(var7[var16] >> 8, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]), var11.field10426 * -1212608691, var22, 1716238340);
                  if (var34.field4408 != 0) {
                     var34.field4401 |= 255 - (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var17] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4399 = class109.method1210(method6124(var7[var17] >> 8, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]), var11.field10426 * -1212608691, var22, 1430345602);
                  if (var34.field4408 != 0) {
                     var34.field4399 |= 255 - (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var31] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4407 = class109.method1210(method6124(var7[var31] >> 8, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]), var11.field10426 * -1212608691, var22, 1660945313);
                  var34.field4409 = (short)var21;
               } else {
                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var15] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4400 = class109.method1210(method6124(var7[var15] >> 8, this.field10065[var1][var2] - this.field10066[var1][var2]), var11.field10426 * -1212608691, var22, 1728630425);
                  if (var34.field4408 != 0) {
                     var34.field4400 |= 255 - (this.field10065[var1][var2] - this.field10066[var1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var16] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4401 = class109.method1210(method6124(var7[var16] >> 8, this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]), var11.field10426 * -1212608691, var22, 1920320730);
                  if (var34.field4408 != 0) {
                     var34.field4401 |= 255 - (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var17] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4399 = class109.method1210(method6124(var7[var17] >> 8, this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]), var11.field10426 * -1212608691, var22, 1751085912);
                  if (var34.field4408 != 0) {
                     var34.field4399 |= 255 - (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) << 25;
                  }

                  if (var6 != null && var11.field10425 * 1996750669 != 0) {
                     var22 = 255 * var6[var31] / (var11.field10425 * 1996750669);
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 255) {
                        var22 = 255;
                     }
                  } else {
                     var22 = 0;
                  }

                  var34.field4407 = class109.method1210(method6124(var7[var31] >> 8, this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]), var11.field10426 * -1212608691, var22, 1650127448);
                  if (var34.field4408 != 0) {
                     var34.field4407 |= 255 - (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) << 25;
                  }

                  var34.field4409 = -1;
               }

               if (var6 != null) {
                  var34.field4406 = (short)var6[var17];
                  var34.field4404 = (short)var6[var31];
                  var34.field4405 = (short)var6[var16];
                  var34.field4402 = (short)var6[var15];
               }

               this.field10046[var1][var2] = var34;
            } else {
               class796 var35 = new class796();
               var35.field483 = (short)var3.length;
               var35.field492 = (short)(var3.length / 3);
               var35.field482 = new short[var35.field483];
               var35.field486 = new short[var35.field483];
               var35.field487 = new short[var35.field483];
               var35.field489 = new int[var35.field483];
               if (var6 != null) {
                  var35.field490 = new short[var35.field483];
               }

               int var24;
               int var27;
               for(var20 = 0; var20 < var35.field483; ++var20) {
                  var21 = var3[var20];
                  var22 = var5[var20];
                  boolean var36 = false;
                  int var25;
                  int var26;
                  if (var21 == 0 && var22 == 0) {
                     var24 = this.field10065[var1][var2] - this.field10066[var1][var2];
                  } else if (var21 == 0 && var22 == this.field7227 * -1212653763) {
                     var24 = this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1];
                  } else if (var21 == this.field7227 * -1212653763 && var22 == this.field7227 * -1212653763) {
                     var24 = this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1];
                  } else if (var21 == this.field7227 * -1212653763 && var22 == 0) {
                     var24 = this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2];
                  } else {
                     var25 = (this.field10065[var1][var2] - this.field10066[var1][var2]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2] - this.field10066[var1 + 1][var2]) * var21;
                     var26 = (this.field10065[var1][var2 + 1] - this.field10066[var1][var2 + 1]) * (this.field7227 * -1212653763 - var21) + (this.field10065[var1 + 1][var2 + 1] - this.field10066[var1 + 1][var2 + 1]) * var21;
                     var24 = var25 * (this.field7227 * -1212653763 - var22) + var26 * var22 >> this.field7228 * 20267538;
                  }

                  var25 = (var1 << this.field7228 * -2137349879) + var21;
                  var26 = (var2 << this.field7228 * -2137349879) + var22;
                  var35.field482[var20] = (short)var21;
                  var35.field487[var20] = (short)var22;
                  var35.field486[var20] = (short)(this.method3887(var25, var26, -1932766126) + (var4 != null ? var4[var20] : 0));
                  if (var24 < 0) {
                     var24 = 0;
                  }

                  if (var7[var20] == 0) {
                     if (var8 != null) {
                        var35.field489[var20] = var24 << 25;
                     } else {
                        var35.field489[var20] = 0;
                     }
                  } else {
                     var27 = 0;
                     if (var6 != null) {
                        short var28 = var35.field490[var20] = (short)var6[var20];
                        if (var11.field10425 * 1996750669 != 0) {
                           var27 = 255 * var28 / (var11.field10425 * 1996750669);
                           if (var27 < 0) {
                              var27 = 0;
                           } else if (var27 > 255) {
                              var27 = 255;
                           }
                        }
                     }

                     var35.field489[var20] = class109.method1210(method6124(var7[var20] >> 8, var24), var11.field10426 * -1212608691, var27, 1730023012);
                     if (var8 != null) {
                        var35.field489[var20] |= var24 << 25;
                     }
                  }
               }

               boolean var32 = false;

               for(var21 = 0; var21 < var35.field492; ++var21) {
                  if (var9[var21 * 3] != -1 && !this.field10037.field8581.method4625(var9[var21 * 3], 446327197).field9378) {
                     var32 = true;
                  }
               }

               if (var8 != null) {
                  var35.field488 = new int[var35.field492];
               }

               if (var32) {
                  var35.field491 = new short[var35.field492];
                  var35.field485 = new short[var35.field492];
               }

               for(var21 = 0; var21 < var35.field492; ++var21) {
                  var22 = var21 * 3;
                  if (var8 != null && var8[var22] != 0) {
                     var35.field488[var21] = var8[var22] >> 8;
                  }

                  if (var32) {
                     var33 = var22 + 1;
                     var24 = var33 + 1;
                     boolean var37 = false;
                     boolean var38 = true;
                     var27 = var9[var22];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 128967240).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     var27 = var9[var33];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1235125716).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     var27 = var9[var24];
                     if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1067305886).field9378) {
                        var37 = true;
                     } else {
                        var38 = false;
                     }

                     if (var38) {
                        var35.field491[var21] = (short)var27;
                        var35.field485[var21] = (short)var10[var22];
                     } else {
                        if (var37) {
                           var27 = var9[var22];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1218075250).field9378) {
                              var35.field489[var22] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 898008414).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }

                           var27 = var9[var33];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 1191420617).field9378) {
                              var35.field489[var33] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 1207038980).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }

                           var27 = var9[var24];
                           if (var27 != -1 && !this.field10037.field8581.method4625(var27, 2140358678).field9378) {
                              var35.field489[var24] = class543.field3817[class526.method2228(this.field10037.field8581.method4625(var27, 1452984161).field9386 & '\uffff', (byte)0) & '\uffff'];
                           }
                        }

                        var35.field491[var21] = -1;
                     }
                  }
               }

               this.field10047[var1][var2] = var35;
            }
         }
      }

   }

   public void method3899() {
      this.field10065 = null;
      this.field10066 = null;
   }

   public void method3886(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class258 var9 = this.field10037.method4450(Thread.currentThread());
      class585 var10 = var9.field7881;
      var10.field335 = 0;
      var10.field336 = true;
      this.field10037.method4446();
      if (this.field10046 == null && this.field10068 == null) {
         if (this.field10044 != null) {
            this.method6128(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
         }
      } else {
         this.method6130(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
      }

   }

   public void method3901(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if (this.field10037.field7914 != null && this.field10037.field7920 != null) {
         class344 var7 = this.field10037.field7934;
         this.field10052 = var7.field325[0];
         this.field10050 = var7.field325[1];
         this.field10051 = var7.field325[2];
         this.field10038 = var7.field325[3];
         this.field10053 = var7.field325[4];
         this.field10054 = var7.field325[5];
         this.field10055 = var7.field325[6];
         this.field10039 = var7.field325[7];
         this.field10057 = var7.field325[8];
         this.field10058 = var7.field325[9];
         this.field10059 = var7.field325[10];
         this.field10060 = var7.field325[11];
         this.field10061 = var7.field325[12];
         this.field10062 = var7.field325[13];
         this.field10063 = var7.field325[14];
         this.field10064 = var7.field325[15];

         for(int var8 = 0; var8 < var3 + var3; ++var8) {
            for(int var9 = 0; var9 < var3 + var3; ++var9) {
               if (var4[var8][var9]) {
                  int var10 = var1 - var3 + var8;
                  int var11 = var2 - var3 + var9;
                  if (var10 >= 0 && var10 < this.field7226 * -506105871 && var11 >= 0 && var11 < this.field7225 * -1148794921) {
                     this.method6125(var10, var11, var6);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   public void method3880(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   class885(class257 var1, int var2, int var3, int var4, int var5, int[][] var6, int[][] var7, int var8) {
      super(var4, var5, var8, var6);
      this.field10037 = var1;
      this.field10045 = var3;
      this.field10065 = new byte[var4 + 1][var5 + 1];
      int var9 = this.field10037.field7930 * -697249431 >> 9;

      for(int var10 = 1; var10 < var5; ++var10) {
         for(int var11 = 1; var11 < var4; ++var11) {
            int var13 = var7[var11 + 1][var10] - var7[var11 - 1][var10];
            int var14 = var7[var11][var10 + 1] - var7[var11][var10 - 1];
            int var15 = (int)Math.sqrt((double)(var13 * var13 + 512 * var8 + var14 * var14));
            int var16 = (var13 << 8) / var15;
            int var17 = -512 * var8 / var15;
            int var18 = (var14 << 8) / var15;
            int var12 = var9 + (this.field10037.field7925 * 760881147 * var16 + this.field10037.field7926 * -181413563 * var17 + this.field10037.field7928 * -1601750017 * var18 >> 17);
            var12 >>= 1;
            if (var12 < 2) {
               var12 = 2;
            } else if (var12 > 126) {
               var12 = 126;
            }

            this.field10065[var11][var10] = (byte)var12;
         }
      }

      this.field10066 = new byte[var4 + 1][var5 + 1];
   }

   public void method3885(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if (this.field10037.field7914 != null && this.field10037.field7920 != null) {
         class344 var7 = this.field10037.field7934;
         this.field10052 = var7.field325[0];
         this.field10050 = var7.field325[1];
         this.field10051 = var7.field325[2];
         this.field10038 = var7.field325[3];
         this.field10053 = var7.field325[4];
         this.field10054 = var7.field325[5];
         this.field10055 = var7.field325[6];
         this.field10039 = var7.field325[7];
         this.field10057 = var7.field325[8];
         this.field10058 = var7.field325[9];
         this.field10059 = var7.field325[10];
         this.field10060 = var7.field325[11];
         this.field10061 = var7.field325[12];
         this.field10062 = var7.field325[13];
         this.field10063 = var7.field325[14];
         this.field10064 = var7.field325[15];

         for(int var8 = 0; var8 < var3 + var3; ++var8) {
            for(int var9 = 0; var9 < var3 + var3; ++var9) {
               if (var4[var8][var9]) {
                  int var10 = var1 - var3 + var8;
                  int var11 = var2 - var3 + var9;
                  if (var10 >= 0 && var10 < this.field7226 * -506105871 && var11 >= 0 && var11 < this.field7225 * -1148794921) {
                     this.method6125(var10, var11, var6);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   void method6129(int var1, int var2, class585 var3, float[] var4, float[] var5, float[] var6, float[] var7, float[] var8, int var9) {
      class67 var10 = this.field10044[var1][var2];
      int var12;
      int var13;
      float var21;
      float var23;
      float var25;
      float var29;
      float var31;
      float var32;
      if (var10 != null) {
         if ((var10.field1688 & 2) == 0) {
            if (var9 != 0) {
               if ((var10.field1688 & 4) != 0) {
                  if ((var9 & 1) != 0) {
                     return;
                  }
               } else if ((var9 & 2) != 0) {
                  return;
               }
            }

            int var11 = var1 * this.field7227 * -1212653763;
            var12 = var11 + this.field7227 * -1212653763;
            var13 = var2 * this.field7227 * -1212653763;
            int var14 = var13 + this.field7227 * -1212653763;
            int var15;
            float var19;
            float var20;
            float var22;
            float var24;
            float var26;
            float var27;
            float var28;
            float var30;
            float var33;
            float var34;
            float var35;
            float var36;
            float var37;
            float var38;
            float var39;
            float var40;
            float var41;
            float var42;
            float var43;
            float var44;
            float var46;
            float var47;
            if ((var10.field1688 & 1) != 0) {
               var15 = this.field7229[var1][var2];
               float var16 = this.field10055 * (float)var15;
               float var17 = this.field10039 * (float)var15;
               float var18 = this.field10063 + this.field10051 * (float)var11 + var16 + this.field10059 * (float)var13;
               var19 = this.field10064 + this.field10038 * (float)var11 + var17 + this.field10060 * (float)var13;
               if (var18 < -var19) {
                  return;
               }

               var20 = this.field10063 + this.field10051 * (float)var12 + var16 + this.field10059 * (float)var13;
               var21 = this.field10064 + this.field10038 * (float)var12 + var17 + this.field10060 * (float)var13;
               if (var20 < -var21) {
                  return;
               }

               var22 = this.field10063 + this.field10051 * (float)var12 + var16 + this.field10059 * (float)var14;
               var23 = this.field10064 + this.field10038 * (float)var12 + var17 + this.field10060 * (float)var14;
               if (var22 < -var23) {
                  return;
               }

               var24 = this.field10063 + this.field10051 * (float)var11 + var16 + this.field10059 * (float)var14;
               var25 = this.field10064 + this.field10038 * (float)var11 + var17 + this.field10060 * (float)var14;
               if (var24 < -var25) {
                  return;
               }

               var26 = this.field10053 * (float)var15;
               var27 = this.field10054 * (float)var15;
               var28 = this.field10061 + this.field10052 * (float)var11 + var26 + this.field10057 * (float)var13;
               var29 = var3.field339 + var3.field333 * var28 / var19;
               var30 = this.field10062 + this.field10050 * (float)var11 + var27 + this.field10058 * (float)var13;
               var31 = var3.field341 + var3.field342 * var30 / var19;
               var32 = var3.field343 + var3.field362 * var18 / var19;
               var33 = this.field10061 + this.field10052 * (float)var12 + var26 + this.field10057 * (float)var13;
               var34 = var3.field339 + var3.field333 * var33 / var21;
               var35 = this.field10062 + this.field10050 * (float)var12 + var27 + this.field10058 * (float)var13;
               var36 = var3.field341 + var3.field342 * var35 / var21;
               var37 = var3.field343 + var3.field362 * var20 / var21;
               var38 = this.field10061 + this.field10052 * (float)var12 + var26 + this.field10057 * (float)var14;
               var39 = var3.field339 + var3.field333 * var38 / var23;
               var40 = this.field10062 + this.field10050 * (float)var12 + var27 + this.field10058 * (float)var14;
               var41 = var3.field341 + var3.field342 * var40 / var23;
               var42 = var3.field343 + var3.field362 * var22 / var23;
               var43 = this.field10061 + this.field10052 * (float)var11 + var26 + this.field10057 * (float)var14;
               var44 = var3.field339 + var3.field333 * var43 / var25;
               float var45 = this.field10062 + this.field10050 * (float)var11 + var27 + this.field10058 * (float)var14;
               var46 = var3.field341 + var3.field342 * var45 / var25;
               var47 = var3.field343 + var3.field362 * var24 / var25;
            } else {
               var15 = this.field7229[var1][var2];
               int var51 = this.field7229[var1 + 1][var2];
               int var52 = this.field7229[var1 + 1][var2 + 1];
               int var53 = this.field7229[var1][var2 + 1];
               var20 = this.field10063 + this.field10051 * (float)var11 + this.field10055 * (float)var15 + this.field10059 * (float)var13;
               var19 = this.field10064 + this.field10038 * (float)var11 + this.field10039 * (float)var15 + this.field10060 * (float)var13;
               if (var20 < -var19) {
                  return;
               }

               var22 = this.field10063 + this.field10051 * (float)var12 + this.field10055 * (float)var51 + this.field10059 * (float)var13;
               var21 = this.field10064 + this.field10038 * (float)var12 + this.field10039 * (float)var51 + this.field10060 * (float)var13;
               if (var22 < -var21) {
                  return;
               }

               var24 = this.field10063 + this.field10051 * (float)var12 + this.field10055 * (float)var52 + this.field10059 * (float)var14;
               var23 = this.field10064 + this.field10038 * (float)var12 + this.field10039 * (float)var52 + this.field10060 * (float)var14;
               if (var24 < -var23) {
                  return;
               }

               var26 = this.field10063 + this.field10051 * (float)var11 + this.field10055 * (float)var53 + this.field10059 * (float)var14;
               var25 = this.field10064 + this.field10038 * (float)var11 + this.field10039 * (float)var53 + this.field10060 * (float)var14;
               if (var26 < -var25) {
                  return;
               }

               var27 = this.field10061 + this.field10052 * (float)var11 + this.field10053 * (float)var15 + this.field10057 * (float)var13;
               var29 = var3.field339 + var3.field333 * var27 / var19;
               var28 = this.field10062 + this.field10050 * (float)var11 + this.field10054 * (float)var15 + this.field10058 * (float)var13;
               var31 = var3.field341 + var3.field342 * var28 / var19;
               var32 = var3.field343 + var3.field362 * var20 / var19;
               var30 = this.field10061 + this.field10052 * (float)var12 + this.field10053 * (float)var51 + this.field10057 * (float)var13;
               var34 = var3.field339 + var3.field333 * var30 / var21;
               var33 = this.field10062 + this.field10050 * (float)var12 + this.field10054 * (float)var51 + this.field10058 * (float)var13;
               var36 = var3.field341 + var3.field342 * var33 / var21;
               var37 = var3.field343 + var3.field362 * var22 / var21;
               var35 = this.field10061 + this.field10052 * (float)var12 + this.field10053 * (float)var52 + this.field10057 * (float)var14;
               var39 = var3.field339 + var3.field333 * var35 / var23;
               var38 = this.field10062 + this.field10050 * (float)var12 + this.field10054 * (float)var52 + this.field10058 * (float)var14;
               var41 = var3.field341 + var3.field342 * var38 / var23;
               var42 = var3.field343 + var3.field362 * var24 / var23;
               var40 = this.field10061 + this.field10052 * (float)var11 + this.field10053 * (float)var53 + this.field10057 * (float)var14;
               var44 = var3.field339 + var3.field333 * var40 / var25;
               var43 = this.field10062 + this.field10050 * (float)var11 + this.field10054 * (float)var53 + this.field10058 * (float)var14;
               var46 = var3.field341 + var3.field342 * var43 / var25;
               var47 = var3.field343 + var3.field362 * var26 / var25;
            }

            if ((var39 - var44) * (var36 - var46) - (var41 - var46) * (var34 - var44) > 0.0F) {
               var3.field336 = var39 < 0.0F || var44 < 0.0F || var34 < 0.0F || var39 > (float)var3.field338 || var44 > (float)var3.field338 || var34 > (float)var3.field338;
               if (var10.field1693 >= 0) {
                  var3.method338(true, true, false, var41, var46, var36, var39, var44, var34, var42, var47, var37, var23, var25, var21, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class543.field3817[var10.field1690 & '\uffff'] & 16777215, -16777216 | class543.field3817[var10.field1687 & '\uffff'] & 16777215, -16777216 | class543.field3817[var10.field1689 & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var10.field1693);
               } else {
                  var3.method347(true, true, false, var41, var46, var36, var39, var44, var34, var42, var47, var37, (float)(var10.field1690 & '\uffff'), (float)(var10.field1687 & '\uffff'), (float)(var10.field1689 & '\uffff'));
               }
            }

            if ((var29 - var34) * (var46 - var36) - (var31 - var36) * (var44 - var34) > 0.0F) {
               var3.field336 = var29 < 0.0F || var34 < 0.0F || var44 < 0.0F || var29 > (float)var3.field338 || var34 > (float)var3.field338 || var44 > (float)var3.field338;
               if (var10.field1693 >= 0) {
                  var3.method338(true, true, false, var31, var36, var46, var29, var34, var44, var32, var37, var47, var19, var21, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class543.field3817[var10.field1692 & '\uffff'] & 16777215, -16777216 | class543.field3817[var10.field1689 & '\uffff'] & 16777215, -16777216 | class543.field3817[var10.field1687 & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var10.field1693);
               } else {
                  var3.method347(true, true, false, var31, var36, var46, var29, var34, var44, var32, var37, var47, (float)(var10.field1692 & '\uffff'), (float)(var10.field1689 & '\uffff'), (float)(var10.field1687 & '\uffff'));
               }
            }
         }
      } else {
         class786 var48 = this.field10048[var1][var2];
         if (var48 != null) {
            if (var9 != 0) {
               if ((var48.field3807 & 4) != 0) {
                  if ((var9 & 1) != 0) {
                     return;
                  }
               } else if ((var9 & 2) != 0) {
                  return;
               }
            }

            short var50;
            for(var12 = 0; var12 < var48.field3796; ++var12) {
               var13 = var48.field3799[var12] + (var1 << this.field7228 * -2137349879);
               var50 = var48.field3800[var12];
               int var54 = var48.field3801[var12] + (var2 << this.field7228 * -2137349879);
               var21 = this.field10063 + this.field10051 * (float)var13 + this.field10055 * (float)var50 + this.field10059 * (float)var54;
               var23 = this.field10064 + this.field10038 * (float)var13 + this.field10039 * (float)var50 + this.field10060 * (float)var54;
               if (var21 < -var23) {
                  return;
               }

               var25 = this.field10061 + this.field10052 * (float)var13 + this.field10053 * (float)var50 + this.field10057 * (float)var54;
               var29 = this.field10062 + this.field10050 * (float)var13 + this.field10054 * (float)var50 + this.field10058 * (float)var54;
               var4[var12] = var3.field339 + var3.field333 * var25 / var23;
               var5[var12] = var3.field341 + var3.field342 * var29 / var23;
               var6[var12] = var3.field343 + var3.field362 * var21 / var23;
               var7[var12] = var23;
            }

            short var49;
            short var55;
            if (var48.field3806 != null) {
               for(var12 = 0; var12 < var48.field3804; ++var12) {
                  var49 = var48.field3803[var12];
                  var50 = var48.field3798[var12];
                  var55 = var48.field3805[var12];
                  var21 = var4[var49];
                  var23 = var4[var50];
                  var25 = var4[var55];
                  var29 = var5[var49];
                  var31 = var5[var50];
                  var32 = var5[var55];
                  if ((var21 - var23) * (var32 - var31) - (var29 - var31) * (var25 - var23) > 0.0F) {
                     var3.field336 = var21 < 0.0F || var23 < 0.0F || var25 < 0.0F || var21 > (float)var3.field338 || var23 > (float)var3.field338 || var25 > (float)var3.field338;
                     short var56 = var48.field3806[var12];
                     if (var56 != -1) {
                        var3.method338(true, true, false, var29, var31, var32, var21, var23, var25, var6[var49], var6[var50], var6[var55], var7[var49], var7[var50], var7[var55], (float)var48.field3799[var49] / (float)(this.field7227 * -1212653763), (float)var48.field3799[var50] / (float)(this.field7227 * -1212653763), (float)var48.field3799[var55] / (float)(this.field7227 * -1212653763), (float)var48.field3801[var49] / (float)(this.field7227 * -1212653763), (float)var48.field3801[var50] / (float)(this.field7227 * -1212653763), (float)var48.field3801[var55] / (float)(this.field7227 * -1212653763), -16777216 | class543.field3817[var48.field3802[var49] & '\uffff'] & 16777215, -16777216 | class543.field3817[var48.field3802[var50] & '\uffff'] & 16777215, -16777216 | class543.field3817[var48.field3802[var55] & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var56);
                     } else {
                        int var58 = var48.field3808[var12];
                        if (var58 != -1) {
                           var3.method347(true, true, false, var29, var31, var32, var21, var23, var25, var6[var49], var6[var50], var6[var55], (float)class63.method1253(var58, var48.field3802[var49], -952106382), (float)class63.method1253(var58, var48.field3802[var50], -952106382), (float)class63.method1253(var58, var48.field3802[var55], -952106382));
                        }
                     }
                  }
               }
            } else {
               for(var12 = 0; var12 < var48.field3804; ++var12) {
                  var49 = var48.field3803[var12];
                  var50 = var48.field3798[var12];
                  var55 = var48.field3805[var12];
                  var21 = var4[var49];
                  var23 = var4[var50];
                  var25 = var4[var55];
                  var29 = var5[var49];
                  var31 = var5[var50];
                  var32 = var5[var55];
                  if ((var21 - var23) * (var32 - var31) - (var29 - var31) * (var25 - var23) > 0.0F) {
                     int var57 = var48.field3808[var12];
                     if (var57 != -1) {
                        var3.field336 = var21 < 0.0F || var23 < 0.0F || var25 < 0.0F || var21 > (float)var3.field338 || var23 > (float)var3.field338 || var25 > (float)var3.field338;
                        var3.method347(true, true, false, var29, var31, var32, var21, var23, var25, var6[var49], var6[var50], var6[var55], (float)class63.method1253(var57, var48.field3802[var49], -952106382), (float)class63.method1253(var57, var48.field3802[var50], -952106382), (float)class63.method1253(var57, var48.field3802[var55], -952106382));
                     }
                  }
               }
            }
         }
      }

   }

   public boolean method3908(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return false;
   }

   public void method3903(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class258 var9 = this.field10037.method4450(Thread.currentThread());
      class585 var10 = var9.field7881;
      var10.field335 = 0;
      var10.field336 = true;
      this.field10037.method4446();
      if (this.field10046 == null && this.field10068 == null) {
         if (this.field10044 != null) {
            this.method6128(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
         }
      } else {
         this.method6130(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
      }

   }

   public void method3904(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class258 var9 = this.field10037.method4450(Thread.currentThread());
      class585 var10 = var9.field7881;
      var10.field335 = 0;
      var10.field336 = true;
      this.field10037.method4446();
      if (this.field10046 == null && this.field10068 == null) {
         if (this.field10044 != null) {
            this.method6128(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
         }
      } else {
         this.method6130(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
      }

   }

   public void method3905(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class258 var9 = this.field10037.method4450(Thread.currentThread());
      class585 var10 = var9.field7881;
      var10.field335 = 0;
      var10.field336 = true;
      this.field10037.method4446();
      if (this.field10046 == null && this.field10068 == null) {
         if (this.field10044 != null) {
            this.method6128(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
         }
      } else {
         this.method6130(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
      }

   }

   public void method3906(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class258 var9 = this.field10037.method4450(Thread.currentThread());
      class585 var10 = var9.field7881;
      var10.field335 = 0;
      var10.field336 = true;
      this.field10037.method4446();
      if (this.field10046 == null && this.field10068 == null) {
         if (this.field10044 != null) {
            this.method6128(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
         }
      } else {
         this.method6130(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.field7907, var9.field7870);
      }

   }

   public class770 method3907(int var1, int var2, class770 var3) {
      return null;
   }

   public class770 method3902(int var1, int var2, class770 var3) {
      return null;
   }

   public void method3910(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   void method6130(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8, class258 var9, class585 var10, float[] var11, float[] var12) {
      int var13 = (var7 - var5) * var3 / 256;
      int var14 = var3 >> 8;
      boolean var15 = var9.field7896;
      this.field10037.method4869(false);
      var10.field332 = false;
      var10.field364 = false;
      int var16 = var1;
      int var17 = var2 + var13;

      for(int var18 = var4; var18 < var6; ++var18) {
         for(int var19 = var5; var19 < var7; ++var19) {
            if (var8[var18 - var4][var19 - var5]) {
               int var21;
               int var22;
               int var23;
               int var24;
               float var25;
               float var26;
               float var27;
               float var28;
               float var29;
               float var30;
               int var31;
               if (this.field10046 != null) {
                  if (this.field10046[var18][var19] != null) {
                     class805 var33 = this.field10046[var18][var19];
                     if (var33.field4409 != -1 && (var33.field4403 & 2) == 0 && var33.field4408 == 0) {
                        var21 = this.field10037.method4454(var33.field4409);
                        var10.method347(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)class63.method1253(var21, var33.field4399, -952106382), (float)class63.method1253(var21, var33.field4407, -952106382), (float)class63.method1253(var21, var33.field4401, -952106382));
                        var10.method347(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)class63.method1253(var21, var33.field4400, -952106382), (float)class63.method1253(var21, var33.field4401, -952106382), (float)class63.method1253(var21, var33.field4407, -952106382));
                     } else if (var33.field4408 == 0) {
                        var10.method340(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, var33.field4399, var33.field4407, var33.field4401);
                        var10.method340(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, var33.field4400, var33.field4401, var33.field4407);
                     } else {
                        var21 = var33.field4408;
                        var10.method340(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, class305.method371(var21, var33.field4399 & -16777216, 335533519), class305.method371(var21, var33.field4407 & -16777216, -1260528057), class305.method371(var21, var33.field4401 & -16777216, -1356989871));
                        var10.method340(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, class305.method371(var21, var33.field4400 & -16777216, 1935967232), class305.method371(var21, var33.field4401 & -16777216, -614860911), class305.method371(var21, var33.field4407 & -16777216, 604792555));
                     }
                  } else if (this.field10047[var18][var19] != null) {
                     class796 var32 = this.field10047[var18][var19];

                     for(var21 = 0; var21 < var32.field483; ++var21) {
                        var11[var21] = (float)(var16 + var32.field482[var21] * var14 / (this.field7227 * -1212653763));
                        var12[var21] = (float)(var17 - var32.field487[var21] * var14 / (this.field7227 * -1212653763));
                     }

                     for(var21 = 0; var21 < var32.field492; ++var21) {
                        var22 = var21 * 3;
                        var23 = var22 + 1;
                        var24 = var23 + 1;
                        var25 = var11[var22];
                        var26 = var11[var23];
                        var27 = var11[var24];
                        var28 = var12[var22];
                        var29 = var12[var23];
                        var30 = var12[var24];
                        if (var32.field488 == null || var32.field488[var21] == 0 || var32.field491 != null && (var32.field491 == null || var32.field491[var21] != -1)) {
                           if (var32.field491 != null && var32.field491[var21] != -1) {
                              var31 = this.field10037.method4454(var32.field491[var21]);
                              var10.method347(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)var31, (float)var31, (float)var31);
                           } else {
                              var10.method340(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var32.field489[var22], var32.field489[var23], var32.field489[var24]);
                           }
                        } else {
                           var31 = var32.field488[var21];
                           var10.method340(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, class305.method371(var31, -16777216 - (var32.field489[var22] & -16777216), 412802637), class305.method371(var31, -16777216 - (var32.field489[var23] & -16777216), -232734877), class305.method371(var31, -16777216 - (var32.field489[var24] & -16777216), 2113694902));
                        }
                     }
                  }
               } else if (this.field10068[var18][var19] != null) {
                  class970 var20 = this.field10068[var18][var19];

                  for(var21 = 0; var21 < var20.field2989; ++var21) {
                     var11[var21] = (float)(var16 + var20.field2990[var21] * var14 / (this.field7227 * -1212653763));
                     var12[var21] = (float)(var17 - var20.field2998[var21] * var14 / (this.field7227 * -1212653763));
                  }

                  for(var21 = 0; var21 < var20.field2991; ++var21) {
                     var22 = var21 * 3;
                     var23 = var22 + 1;
                     var24 = var23 + 1;
                     var25 = var11[var22];
                     var26 = var11[var23];
                     var27 = var11[var24];
                     var28 = var12[var22];
                     var29 = var12[var23];
                     var30 = var12[var24];
                     if (var20.field2988 != null && var20.field2988[var21] != 0) {
                        var31 = var20.field2988[var21];
                        var10.method340(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var31, var31, var31);
                     } else {
                        var10.method340(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var20.field2992[var22], var20.field2992[var23], var20.field2992[var24]);
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = var2 + var13;
         var16 += var14;
      }

      var10.field332 = true;
      this.field10037.method4869(var15);
   }

   public boolean method3912(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return false;
   }

   public class770 method3909(int var1, int var2, class770 var3) {
      return null;
   }

   public void method3915(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if (this.field10037.field7914 != null && this.field10037.field7920 != null) {
         class344 var7 = this.field10037.field7934;
         this.field10052 = var7.field325[0];
         this.field10050 = var7.field325[1];
         this.field10051 = var7.field325[2];
         this.field10038 = var7.field325[3];
         this.field10053 = var7.field325[4];
         this.field10054 = var7.field325[5];
         this.field10055 = var7.field325[6];
         this.field10039 = var7.field325[7];
         this.field10057 = var7.field325[8];
         this.field10058 = var7.field325[9];
         this.field10059 = var7.field325[10];
         this.field10060 = var7.field325[11];
         this.field10061 = var7.field325[12];
         this.field10062 = var7.field325[13];
         this.field10063 = var7.field325[14];
         this.field10064 = var7.field325[15];

         for(int var8 = 0; var8 < var3 + var3; ++var8) {
            for(int var9 = 0; var9 < var3 + var3; ++var9) {
               if (var4[var8][var9]) {
                  int var10 = var1 - var3 + var8;
                  int var11 = var2 - var3 + var9;
                  if (var10 >= 0 && var10 < this.field7226 * -506105871 && var11 >= 0 && var11 < this.field7225 * -1148794921) {
                     this.method6125(var10, var11, var6);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   public void method3895(class639 var1, int[] var2) {
   }

   public void method3916(class639 var1, int[] var2) {
   }
}
