public class NpcDefinition {
   public boolean field9860 = false;
   class329 field9861;
   public int field9862;
   public String name = "null";
   public int field9864 = -1;
   public int[] field9865;
   public int[] field9866;
   public int[] field9867;
   public int field9868 = -1;
   short[] field9869;
   public short[] field9870;
   byte[] field9871;
   short[] field9872;
   int field9873 = 0;
   byte field9874;
   byte field9875;
   public int field9876 = 0;
   byte field9877 = 0;
   public String[] field9878;
   public int field9879 = -1;
   public int field9880 = -1;
   public int field9881 = -1;
   public int field9882 = -1;
   public int field9883 = -1;
   public boolean field9884 = true;
   public int field9885 = -1;
   int field9886 = 128;
   public int field9887 = -1;
   public byte field9888 = -16;
   public short field9889 = 0;
   public short[] field9890;
   public boolean field9891 = false;
   int field9892 = 0;
   byte field9893;
   public byte field9894;
   class6 field9895;
   int field9896 = 128;
   public int field9897;
   int field9898 = -1;
   public boolean field9899 = true;
   public boolean field9900 = true;
   public boolean field9901 = true;
   int[][] field9902;
   public int field9903 = -1;
   public byte field9904 = -96;
   public int field9905 = -1;
   public byte field9906 = 0;
   int field9907 = -1;
   public static int field9908 = 2;
   public boolean field9909 = false;
   public int field9910 = -1;
   public int field9911 = 0;
   public int field9912 = -1;
   public static int field9913 = 1;
   public int field9914 = -1;
   public int field9915 = 255;
   public boolean field9916;
   public int field9917 = 32;
   public static short[] field9918 = new short[256];
   public class77 field9919;
   public int field9920 = -1;
   public int field9921 = -1;
   public int field9922;
   public int field9923 = 1;
   public int[] field9924;
   public int field9925;
   public int field9926;
   public short field9927 = 0;
   public int field9928;
   public boolean field9929;

   void method6105(InputStream var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.getNpcDefinition(var1, var3, 1663900566);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "uu.a(" + ')');
      }
   }

   public final class879 method6106(class848 var1, int var2, class193 var3, class415 var4, Animator var5, Animator var6, Animator[] var7, int[] var8, int var9, class692 var10, int var11, boolean var12, int var13) {
      try {
         if (this.field9924 != null) {
            NpcDefinition var38 = this.method6110(var4, 1886245346);
            return var38 == null ? null : var38.method6106(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, -679459424);
         } else {
            int var14 = var2;
            if (this.field9896 != 128) {
               var14 = var2 | 2;
            }

            if (128 != this.field9886) {
               var14 |= 5;
            }

            boolean var15 = false;
            int var16 = var7 != null ? var7.length : 0;

            for(int var17 = 0; var17 < var16; ++var17) {
               if (var7[var17] != null) {
                  var14 |= var7[var17].method2785(-1790708337);
                  var15 = true;
               }
            }

            if (var5 != null) {
               var14 |= var5.method2785(-1790708337);
               var15 = true;
            }

            if (var6 != null) {
               var14 |= var6.method2785(-1790708337);
               var15 = true;
            }

            long var18 = (long)(this.field9862 | var1.field8580 << 16);
            if (var10 != null) {
               var18 |= var10.field7133 << 24;
            }

            class1 var20 = this.field9861.field27;
            class879 var21;
            synchronized(this.field9861.field27) {
               var21 = (class879)this.field9861.field27.method2974(var18);
            }

            class507 var39 = null;
            if (!var12 && var11 != -1) {
               var39 = var3.method3736(var11, (byte)59);
            } else if (-1 != this.field9868) {
               var39 = var3.method3736(this.field9868, (byte)89);
            }

            int var26;
            if (var21 == null || (var21.method5948() & var14) != var14) {
               if (var21 != null) {
                  var14 |= var21.method5948();
               }

               int var22 = var14;
               if (this.field9869 != null) {
                  var22 = var14 | 16384;
               }

               if (this.field9872 != null) {
                  var22 |= 32768;
               }

               if (this.field9877 != 0) {
                  var22 |= 524288;
               }

               int[] var23 = var10 != null && var10.field7131 != null ? var10.field7131 : this.field9865;
               boolean var24 = false;
               class180 var25 = this.field9861.field31;
               synchronized(this.field9861.field31) {
                  var26 = 0;

                  while(true) {
                     if (var26 >= var23.length) {
                        break;
                     }

                     if (var23[var26] == -1) {
                        if (var13 != -679459424) {
                           throw new IllegalStateException();
                        }
                     } else if (!this.field9861.field31.method3260(var23[var26], 0, -1819291215)) {
                        var24 = true;
                     }

                     ++var26;
                  }
               }

               if (var24) {
                  return null;
               }

               class25[] var44 = new class25[var23.length];

               for(var26 = 0; var26 < var23.length; ++var26) {
                  if (var23[var26] == -1) {
                     if (var13 != -679459424) {
                        throw new IllegalStateException();
                     }
                  } else {
                     class180 var27 = this.field9861.field31;
                     synchronized(this.field9861.field31) {
                        var44[var26] = class25.method3454(this.field9861.field31, var23[var26], 0);
                     }

                     if (var44[var26] != null) {
                        if (var44[var26].field6462 < 13) {
                           var44[var26].method3458(2);
                        }

                        if (this.field9902 != null && this.field9902[var26] != null) {
                           var44[var26].method3456(this.field9902[var26][0], this.field9902[var26][1], this.field9902[var26][2]);
                        }
                     }
                  }
               }

               int var28;
               if (var39 != null && var39.field3968 != null) {
                  for(var26 = 0; var26 < var39.field3968.length; ++var26) {
                     if (var26 < var44.length) {
                        if (var44[var26] == null) {
                           if (var13 != -679459424) {
                              throw new IllegalStateException();
                           }
                        } else {
                           int var46 = 0;
                           var28 = 0;
                           int var29 = 0;
                           int var30 = 0;
                           int var31 = 0;
                           int var32 = 0;
                           if (var39.field3968[var26] != null) {
                              var46 = var39.field3968[var26][0];
                              var28 = var39.field3968[var26][1];
                              var29 = var39.field3968[var26][2];
                              var30 = var39.field3968[var26][3] << 3;
                              var31 = var39.field3968[var26][4] << 3;
                              var32 = var39.field3968[var26][5] << 3;
                           }

                           if (var30 != 0 || var31 != 0 || var32 != 0) {
                              var44[var26].method3457(var30, var31, var32);
                           }

                           if (var46 != 0 || var28 != 0 || var29 != 0) {
                              var44[var26].method3456(var46, var28, var29);
                           }
                        }
                     }
                  }
               }

               class25 var47;
               if (1 == var44.length) {
                  var47 = var44[0];
               } else {
                  var47 = new class25(var44, var44.length);
               }

               var21 = var1.method4861(var47, var22, this.field9861.field33, this.field9873 + 64, 850 + this.field9892);
               short[] var48;
               if (this.field9869 != null) {
                  if (var10 != null && var10.field7132 != null) {
                     var48 = var10.field7132;
                  } else {
                     var48 = this.field9870;
                  }

                  for(var28 = 0; var28 < this.field9869.length; ++var28) {
                     if (this.field9871 != null && var28 < this.field9871.length) {
                        var21.method5984(this.field9869[var28], field9918[this.field9871[var28] & 255]);
                     } else {
                        var21.method5984(this.field9869[var28], var48[var28]);
                     }
                  }
               }

               if (this.field9872 != null) {
                  if (var10 != null && var10.field7130 != null) {
                     var48 = var10.field7130;
                  } else {
                     var48 = this.field9890;
                  }

                  for(var28 = 0; var28 < this.field9872.length; ++var28) {
                     var21.method5986(this.field9872[var28], var48[var28]);
                  }
               }

               if (this.field9877 != 0) {
                  var21.method5987(this.field9874, this.field9875, this.field9893, this.field9877 & 255);
               }

               var21.method5947(var14);
               class1 var49 = this.field9861.field27;
               synchronized(this.field9861.field27) {
                  this.field9861.field27.method2984(var21, var18);
               }
            }

            class879 var41 = var21.method6017((byte)4, var14, true);
            boolean var40 = false;
            if (var8 != null) {
               for(int var42 = 0; var42 < 12; ++var42) {
                  if (-1 != var8[var42]) {
                     var40 = true;
                  }
               }
            }

            if (!var15 && !var40) {
               return var41;
            } else {
               class135[] var43 = null;
               if (var39 != null) {
                  var43 = var39.method2503((byte)22);
               }

               int var45;
               if (var40 && var43 != null) {
                  for(var45 = 0; var45 < 12; ++var45) {
                     if (var43[var45] != null) {
                        var41.method5970(var43[var45], 1 << var45, true);
                     }
                  }
               }

               var45 = 0;

               for(var26 = 1; var45 < var16; var26 <<= 1) {
                  if (var7[var45] != null) {
                     var7[var45].method2786(var41, 0, var26, (byte)125);
                  }

                  ++var45;
               }

               if (var40) {
                  for(var45 = 0; var45 < 12; ++var45) {
                     if (-1 != var8[var45]) {
                        var26 = var8[var45] - var9;
                        var26 &= 16383;
                        class135 var50 = new class135();
                        var50.method1013(0.0F, 1.0F, 0.0F, class703.method2002(var26));
                        var41.method5970(var50, 1 << var45, false);
                     }
                  }
               }

               if (var40 && var43 != null) {
                  for(var45 = 0; var45 < 12; ++var45) {
                     if (var43[var45] != null) {
                        var41.method5970(var43[var45], 1 << var45, false);
                     }
                  }
               }

               if (var5 != null && var6 != null) {
                  class878.method5920(var41, var5, var6, -1827693647);
               } else if (var5 != null) {
                  var5.method2795(var41, 0, 339112441);
               } else if (var6 != null) {
                  var6.method2795(var41, 0, -1538889562);
               }

               if (this.field9886 != 128 || 128 != this.field9896) {
                  var41.method5955(this.field9886, this.field9896, this.field9886);
               }

               var41.method5947(var2);
               return var41;
            }
         }
      } catch (RuntimeException var37) {
         throw class158.method3445(var37, "uu.i(" + ')');
      }
   }

   public final class879 method6107(class848 var1, int var2, class415 var3, Animator var4, class692 var5, int var6) {
      try {
         if (this.field9924 != null) {
            NpcDefinition var23 = this.method6110(var3, 1912809157);
            return var23 == null ? null : var23.method6107(var1, var2, var3, var4, var5, -1500196036);
         } else if (this.field9866 != null || var5 != null && var5.field7131 != null) {
            int var7 = var2;
            if (var4 != null) {
               var7 = var2 | var4.method2785(-1790708337);
            }

            long var8 = (long)(this.field9862 | var1.field8580 << 16);
            if (var5 != null) {
               var8 |= var5.field7133 << 24;
            }

            class1 var10 = this.field9861.field34;
            class879 var11;
            synchronized(this.field9861.field34) {
               var11 = (class879)this.field9861.field34.method2974(var8);
            }

            if (var11 == null || (var11.method5948() & var7) != var7) {
               if (var11 != null) {
                  var7 |= var11.method5948();
               }

               int var24 = var7;
               if (this.field9869 != null) {
                  var24 = var7 | 16384;
               }

               if (this.field9872 != null) {
                  var24 |= 32768;
               }

               if (this.field9877 != 0) {
                  var24 |= 524288;
               }

               int[] var12 = var5 != null && var5.field7131 != null ? var5.field7131 : this.field9866;
               boolean var13 = false;
               class180 var14 = this.field9861.field31;
               int var15;
               synchronized(this.field9861.field31) {
                  for(var15 = 0; var15 < var12.length; ++var15) {
                     if (!this.field9861.field31.method3260(var12[var15], 0, -602703169)) {
                        var13 = true;
                     }
                  }
               }

               if (var13) {
                  return null;
               }

               class25[] var25 = new class25[var12.length];
               class180 var26 = this.field9861.field31;
               synchronized(this.field9861.field31) {
                  for(int var16 = 0; var16 < var12.length; ++var16) {
                     var25[var16] = class25.method3454(this.field9861.field31, var12[var16], 0);
                  }
               }

               for(var15 = 0; var15 < var12.length; ++var15) {
                  if (var25[var15] != null && var25[var15].field6462 < 13) {
                     var25[var15].method3458(2);
                  }
               }

               class25 var27;
               if (var25.length == 1) {
                  var27 = var25[0];
               } else {
                  var27 = new class25(var25, var25.length);
               }

               var11 = var1.method4861(var27, var24, this.field9861.field33, 64, 768);
               int var17;
               short[] var28;
               if (this.field9869 != null) {
                  if (var5 != null && var5.field7132 != null) {
                     var28 = var5.field7132;
                  } else {
                     var28 = this.field9870;
                  }

                  for(var17 = 0; var17 < this.field9869.length; ++var17) {
                     if (this.field9871 != null && var17 < this.field9871.length) {
                        var11.method5984(this.field9869[var17], field9918[this.field9871[var17] & 255]);
                     } else {
                        var11.method5984(this.field9869[var17], var28[var17]);
                     }
                  }
               }

               if (this.field9872 != null) {
                  if (var5 != null && var5.field7130 != null) {
                     var28 = var5.field7130;
                  } else {
                     var28 = this.field9890;
                  }

                  for(var17 = 0; var17 < this.field9872.length; ++var17) {
                     var11.method5986(this.field9872[var17], var28[var17]);
                  }
               }

               if (this.field9877 != 0) {
                  var11.method5987(this.field9874, this.field9875, this.field9893, this.field9877 & 255);
               }

               var11.method5947(var7);
               class1 var29 = this.field9861.field34;
               synchronized(this.field9861.field34) {
                  this.field9861.field34.method2984(var11, var8);
               }
            }

            if (var4 != null) {
               var11 = var11.method6017((byte)1, var7, true);
               var4.method2795(var11, 0, -731129719);
            }

            var11.method5947(var2);
            return var11;
         } else {
            return null;
         }
      } catch (RuntimeException var22) {
         throw class158.method3445(var22, "uu.k(" + ')');
      }
   }

   public final boolean method6108(int var1) {
      try {
         if (this.field9865 == null) {
            return true;
         } else {
            boolean var2 = true;
            int[] var3 = this.field9865;

            for(int var4 = 0; var4 < var3.length; ++var4) {
               int var5 = var3[var4];
               if (!this.field9861.field31.method3260(var5, 0, -463050298)) {
                  var2 = false;
               }
            }

            return var2;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "uu.d(" + ')');
      }
   }

   public int method6109(int var1, int var2, byte var3) {
      try {
         if (this.field9895 == null) {
            return var2;
         } else {
            class722 var4 = (class722)this.field9895.method2942((long)var1);
            return var4 == null ? var2 : var4.field3631;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uu.u(" + ')');
      }
   }

   public final NpcDefinition method6110(class415 var1, int var2) {
      try {
         int var3 = -1;
         if (this.field9907 != -1) {
            var3 = var1.method5653(this.field9907, (byte)122);
         } else if (this.field9898 != -1) {
            var3 = var1.method5655(this.field9898, (byte)49);
         }

         if (var3 >= 0 && var3 < this.field9924.length - 1 && -1 != this.field9924[var3]) {
            return this.field9861.method12(this.field9924[var3], 541835254);
         } else {
            int var4 = this.field9924[this.field9924.length - 1];
            return var4 != -1 ? this.field9861.method12(var4, 749174826) : null;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uu.r(" + ')');
      }
   }

   NpcDefinition() {
      this.field9919 = class77.field1507;
      this.field9922 = -1;
      this.field9894 = -1;
      this.field9925 = -1;
      this.field9926 = 256;
      this.field9897 = 256;
      this.field9928 = 0;
      this.field9929 = true;
   }

   public boolean method6111(class415 var1, int var2) {
      try {
         if (this.field9924 == null) {
            return true;
         } else {
            int var3 = -1;
            if (-1 != this.field9907) {
               var3 = var1.method5653(this.field9907, (byte)4);
            } else if (this.field9898 != -1) {
               var3 = var1.method5655(this.field9898, (byte)94);
            }

            if (var3 >= 0 && var3 < this.field9924.length - 1 && this.field9924[var3] != -1) {
               return true;
            } else {
               int var4 = this.field9924[this.field9924.length - 1];
               return -1 != var4;
            }
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uu.q(" + ')');
      }
   }

   public boolean method6112(byte var1) {
      try {
         if (this.field9924 == null) {
            return -1 != this.field9887 || -1 != this.field9905 || this.field9912 != -1;
         } else {
            for(int var2 = 0; var2 < this.field9924.length; ++var2) {
               if (-1 != this.field9924[var2]) {
                  NpcDefinition var3 = this.field9861.method12(this.field9924[var2], -1960092896);
                  if (var3.field9887 != -1 || -1 != var3.field9905 || var3.field9912 != -1) {
                     return true;
                  }
               }
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "uu.n(" + ')');
      }
   }

   void method6113(int var1) {
      try {
         if (this.field9865 == null) {
            this.field9865 = new int[0];
         }

         if (this.field9894 == -1) {
            if (this.field9861.field28 == class469.field7324) {
               this.field9894 = 1;
            } else {
               this.field9894 = 0;
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "uu.b(" + ')');
      }
   }

   void getNpcDefinition(InputStream var1, int var2, int var3) {
      try {
         int var4;
         int var5;
         if (var2 == 1) {
            var4 = var1.method6371();
            this.field9865 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field9865[var5] = var1.method6423(1235052657);
            }
         } else if (var2 == 2) {
            this.name = var1.method6379(-1611525197);
         } else if (12 == var2) {
            this.field9923 = var1.method6371();
         } else if (var2 >= 30 && var2 < 35) {
            this.field9878[var2 - 30] = var1.method6379(-329838492);
            if (this.field9878[var2 - 30].equals("Atack")) {
               this.field9878[var2 - 30] = "Attack";
            }
         } else if (var2 == 40) {
            var4 = var1.method6371();
            this.field9869 = new short[var4];
            this.field9870 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field9869[var5] = (short)var1.method6374();
               this.field9870[var5] = (short)var1.method6374();
            }
         } else if (var2 == 41) {
            var4 = var1.method6371();
            this.field9872 = new short[var4];
            this.field9890 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field9872[var5] = (short)var1.method6374();
               this.field9890[var5] = (short)var1.method6374();
            }
         } else if (var2 == 42) {
            var4 = var1.method6371();
            this.field9871 = new byte[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field9871[var5] = var1.method6372(-12558881);
            }
         } else if (var2 == 60) {
            var4 = var1.method6371();
            this.field9866 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field9866[var5] = var1.method6423(1235052657);
            }
         } else if (var2 == 93) {
            this.field9884 = false;
         } else if (var2 == 95) {
            this.field9885 = var1.method6374();
         } else if (var2 == 97) {
            this.field9886 = var1.method6374();
         } else if (98 == var2) {
            this.field9896 = var1.method6374();
         } else if (var2 == 99) {
            this.field9860 = true;
         } else if (var2 == 100) {
            this.field9873 = var1.method6372(-12558881);
         } else if (101 == var2) {
            this.field9892 = var1.method6372(-12558881) * 5;
         } else if (var2 == 102) {
            this.field9921 = var1.method6374();
         } else if (103 == var2) {
            this.field9917 = var1.method6374();
         } else {
            int var6;
            if (var2 != 106 && 118 != var2) {
               if (var2 == 107) {
                  this.field9899 = false;
               } else if (var2 == 109) {
                  this.field9900 = false;
               } else if (111 == var2) {
                  this.field9901 = false;
               } else if (var2 == 113) {
                  this.field9927 = (short)var1.method6374();
                  this.field9889 = (short)var1.method6374();
               } else if (114 == var2) {
                  this.field9904 = var1.method6372(-12558881);
                  this.field9888 = var1.method6372(-12558881);
               } else if (119 == var2) {
                  this.field9906 = var1.method6372(-12558881);
               } else if (var2 == 121) {
                  this.field9902 = new int[this.field9865.length][];
                  var4 = var1.method6371();

                  for(var5 = 0; var5 < var4; ++var5) {
                     var6 = var1.method6371();
                     int[] var7 = this.field9902[var6] = new int[3];
                     var7[0] = var1.method6372(-12558881);
                     var7[1] = var1.method6372(-12558881);
                     var7[2] = var1.method6372(-12558881);
                  }
               } else if (var2 == 122) {
                  this.field9903 = var1.method6423(1235052657);
               } else if (var2 == 123) {
                  this.field9879 = var1.method6374();
               } else if (var2 == 125) {
                  this.field9919 = (class77)class367.method1565(class669.method4119(-1901608125), var1.method6372(-12558881), (byte)2);
               } else if (127 == var2) {
                  this.field9868 = var1.method6374();
               } else if (128 == var2) {
                  class367.method1565(class458.method3829((byte)-83), var1.method6371(), (byte)2);
               } else if (var2 == 134) {
                  this.field9887 = var1.method6374();
                  if (65535 == this.field9887) {
                     this.field9887 = -1;
                  }

                  this.field9910 = var1.method6374();
                  if (65535 == this.field9910) {
                     this.field9910 = -1;
                  }

                  this.field9905 = var1.method6374();
                  if (65535 == this.field9905) {
                     this.field9905 = -1;
                  }

                  this.field9912 = var1.method6374();
                  if (this.field9912 == 65535) {
                     this.field9912 = -1;
                  }

                  this.field9876 = var1.method6371();
               } else if (var2 == 135) {
                  this.field9881 = var1.method6371();
                  this.field9864 = var1.method6374();
               } else if (136 == var2) {
                  this.field9882 = var1.method6371();
                  this.field9880 = var1.method6374();
               } else if (var2 == 137) {
                  this.field9883 = var1.method6374();
               } else if (var2 == 138) {
                  this.field9914 = var1.method6423(1235052657);
               } else if (139 == var2) {
                  this.field9920 = var1.method6423(1235052657);
               } else if (var2 == 140) {
                  this.field9915 = var1.method6371();
               } else if (var2 == 141) {
                  this.field9909 = true;
               } else if (var2 == 142) {
                  this.field9922 = var1.method6374();
               } else if (143 == var2) {
                  this.field9891 = true;
               } else if (var2 >= 150 && var2 < 155) {
                  this.field9878[var2 - 150] = var1.method6379(1280562882);
                  if (!this.field9861.field32) {
                     this.field9878[var2 - 150] = null;
                  }
               } else if (var2 == 155) {
                  this.field9874 = var1.method6372(-12558881);
                  this.field9875 = var1.method6372(-12558881);
                  this.field9893 = var1.method6372(-12558881);
                  this.field9877 = var1.method6372(-12558881);
               } else if (158 == var2) {
                  this.field9894 = 1;
               } else if (var2 == 159) {
                  this.field9894 = 0;
               } else if (var2 == 160) {
                  var4 = var1.method6371();
                  this.field9867 = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     this.field9867[var5] = var1.method6374();
                  }
               } else if (var2 == 162) {
                  this.field9916 = true;
               } else if (var2 == 163) {
                  this.field9925 = var1.method6371();
               } else if (164 == var2) {
                  this.field9926 = var1.method6374();
                  this.field9897 = var1.method6374();
               } else if (165 == var2) {
                  this.field9928 = var1.method6371();
               } else if (168 == var2) {
                  this.field9911 = var1.method6371();
               } else if (var2 == 169) {
                  this.field9929 = false;
               } else if (249 == var2) {
                  var4 = var1.method6371();
                  if (this.field9895 == null) {
                     var5 = class18.method3687(var4, (byte)16);
                     this.field9895 = new class6(var5);
                  }

                  for(var5 = 0; var5 < var4; ++var5) {
                     boolean var10 = var1.method6371() == 1;
                     int var11 = var1.method6390((byte)-8);
                     Object var8;
                     if (var10) {
                        var8 = new class437(var1.method6379(1107258472));
                     } else {
                        var8 = new class722(var1.method6420((byte)-18));
                     }

                     this.field9895.method2947((class568)var8, (long)var11);
                  }
               }
            } else {
               this.field9907 = var1.method6374();
               if (this.field9907 == 65535) {
                  this.field9907 = -1;
               }

               this.field9898 = var1.method6374();
               if (this.field9898 == 65535) {
                  this.field9898 = -1;
               }

               var4 = -1;
               if (var2 == 118) {
                  var4 = var1.method6374();
                  if (var4 == 65535) {
                     var4 = -1;
                  }
               }

               var5 = var1.method6371();
               this.field9924 = new int[2 + var5];

               for(var6 = 0; var6 <= var5; ++var6) {
                  this.field9924[var6] = var1.method6374();
                  if (65535 == this.field9924[var6]) {
                     this.field9924[var6] = -1;
                  }
               }

               this.field9924[var5 + 1] = var4;
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "uu.f(" + ')');
      }
   }

   public String method6115(int var1, String var2, int var3) {
      try {
         if (this.field9895 == null) {
            return var2;
         } else {
            class437 var4 = (class437)this.field9895.method2942((long)var1);
            return var4 == null ? var2 : (String)var4.field7515;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uu.x(" + ')');
      }
   }

   public final class879 method6116(class848 var1, int var2, class193 var3, class415 var4, Animator var5, Animator var6, Animator[] var7, int[] var8, int var9, class692 var10, int var11) {
      try {
         return this.method6106(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, this.field9868, true, -679459424);
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "uu.p(" + ')');
      }
   }

   public static class827 method6117(InputStream var0, int var1) {
      try {
         class827 var2 = class932.method6291(var0, -2098410603);
         int var3 = var0.method6420((byte)-118);
         int var4 = var0.method6420((byte)85);
         return new class634(var2.field9028, var2.field9029, var2.field9033, var2.field9031, var2.field9032, var2.field9036, var2.field9034, var2.field9035, var2.field9030, var3, var4);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uu.i(" + ')');
      }
   }
}
