public abstract class class746 extends class476 {
   static int field4026 = 5;
   public int field4027;
   public int field4028;
   int field4029;
   public int field4030;
   class726 field4031;
   public int field4032;
   public int field4033;
   public int field4034;
   public int field4035;
   static int field4036 = 20;
   int field4037;
   int field4038;
   public int field4039;
   public class932[] field4040;
   public class765 field4041;
   public class765 field4042;
   public int[] field4043;
   public int[] field4044;
   public int[] field4045;
   public class879[] field4046;
   public int[] field4047;
   public class890 field4048;
   public int[] field4049;
   public int field4050;
   public int field4051;
   public int field4052;
   int field4053;
   public int field4054;
   public int[] field4055;
   public int[] field4056;
   public int[] field4057;
   public boolean field4058;
   public int field4059;
   public int field4060;
   int field4061;
   public int field4062;
   public int field4063;
   public int field4064;
   public int field4065;
   public int[] field4066;
   public int field4067;
   public int field4068;
   public int field4069;
   public int field4070;
   int field4071;
   public byte field4072;
   public byte field4073;
   public byte[] field4074;
   public class890 field4075;
   public class761[] field4076;
   public class890 field4077;
   public int field4078;
   public int field4079;
   public int field4080;
   public byte field4081;
   class625 field4082;
   public boolean field4083;
   public int field4084;
   public int[] field4085;
   int field4086;
   public boolean field4087;
   public int field4088;
   public int field4089;
   public int field4090;
   public int[] field4091;
   boolean field4092;
   boolean field4093;
   public byte field4094;
   public class131 field4095;
   public int field4096;
   byte field4097;

   public void method2541(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         if (this.method2567(-1427124632)) {
            class730.method1760(this.field4095, this.field4095.method887((byte)20), -1, var1, var2, var3, var4, var5, var6, var7, var8);
         }

      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "akn.cx(" + ')');
      }
   }

   boolean method2206(byte var1) {
      return false;
   }

   public void method2542(int var1, byte var2) {
      try {
         class507 var3 = this.method2554(654212117);
         if (var3.field4002 * -2079528661 != 0 || 907865649 * this.field4079 != 0) {
            this.field4048.method5554((byte)67);
            int var4 = var1 - 259411823 * this.field4048.field9268 & 16383;
            if (var4 > 8192) {
               this.field4032 = (this.field4048.field9268 * 259411823 - (16384 - var4)) * 1874549911;
            } else {
               this.field4032 = (this.field4048.field9268 * 259411823 + var4) * 1874549911;
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "akn.a(" + ')');
      }
   }

   public void method2543(int var1, boolean var2, int var3) {
      try {
         class507 var4 = this.method2554(-124866780);
         if (var2 || -2079528661 * var4.field4002 != 0 || 907865649 * this.field4079 != 0) {
            this.field4032 = (var1 & 16383) * 1874549911;
            this.field4048.method5552(2145248039 * this.field4032, -1986657311);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "akn.f(" + ')');
      }
   }

   void method2544(byte var1) {
      try {
         if (-1 != this.field4096 * 1097409519) {
            class554.method429(1097409519 * this.field4096, -1417106299);
            this.field4095 = null;
            this.field4096 = -441346831;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akn.cs(" + ')');
      }
   }

   boolean method2189() {
      return this.field4093;
   }

   public boolean method2545(int var1, int var2, byte var3) {
      try {
         if (this.field4049 == null) {
            if (-1 == var2) {
               return true;
            }

            this.field4049 = new int[class413.field9412.field1542.length];

            for(int var4 = 0; var4 < class413.field9412.field1542.length; ++var4) {
               this.field4049[var4] = -1;
            }
         }

         class507 var11 = this.method2554(-401641714);
         int var5 = 256;
         if (var11.field4000 != null && var11.field4000[var1] > 0) {
            var5 = var11.field4000[var1];
         }

         int var6;
         int var7;
         if (-1 == var2) {
            if (this.field4049[var1] == -1) {
               return true;
            } else {
               var6 = this.field4048.method5553((byte)0);
               var7 = this.field4049[var1];
               int var8 = var6 - var7;
               if (var8 >= -var5 && var8 <= var5) {
                  this.field4049[var1] = -1;

                  for(int var9 = 0; var9 < class413.field9412.field1542.length; ++var9) {
                     if (this.field4049[var9] != -1) {
                        return true;
                     }
                  }

                  this.field4049 = null;
                  return true;
               } else {
                  if ((var8 <= 0 || var8 > 8192) && var8 > -8192) {
                     this.field4049[var1] = var7 - var5 & 16383;
                  } else {
                     this.field4049[var1] = var7 + var5 & 16383;
                  }

                  return false;
               }
            }
         } else {
            if (-1 == this.field4049[var1]) {
               this.field4049[var1] = this.field4048.method5553((byte)0);
            }

            var6 = this.field4049[var1];
            var7 = var2 - var6;
            if (var7 >= -var5 && var7 <= var5) {
               this.field4049[var1] = var2;
               return true;
            } else {
               if ((var7 <= 0 || var7 > 8192) && var7 > -8192) {
                  this.field4049[var1] = var6 - var5 & 16383;
               } else {
                  this.field4049[var1] = var5 + var6 & 16383;
               }

               return false;
            }
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "akn.i(" + ')');
      }
   }

   public final void method2546(int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      try {
         class932 var8 = this.field4040[var6];
         int var9 = -967533709 * var8.field10341;
         if (var1 != -1 && var9 != -1) {
            class745 var10;
            if (var9 == var1) {
               var10 = class635.field9823.method1053(var1, -1791372939);
               if (var10.field4117 && 1505778629 * var10.field4107 != -1) {
                  class160 var11 = class936.field10313.method2256(var10.field4107 * 1505778629, (byte)-43);
                  int var12 = var11.field6668 * -1117238071;
                  if (var12 == 0) {
                     return;
                  }

                  if (2 == var12) {
                     var8.field10340.method2798(1476401100);
                     return;
                  }
               }
            } else {
               var10 = class635.field9823.method1053(var1, -1699460112);
               class745 var16 = class635.field9823.method1053(var9, -1865033182);
               if (1505778629 * var10.field4107 != -1 && 1505778629 * var16.field4107 != -1) {
                  class160 var17 = class936.field10313.method2256(1505778629 * var10.field4107, (byte)50);
                  class160 var13 = class936.field10313.method2256(1505778629 * var16.field4107, (byte)-13);
                  if (-1445588039 * var17.field6662 < var13.field6662 * -1445588039) {
                     return;
                  }
               }
            }
         }

         byte var15 = 0;
         if (var1 != -1 && !class635.field9823.method1053(var1, -2139980686).field4117) {
            var15 = 2;
         }

         if (-1 != var1 && var5) {
            var15 = 1;
         }

         var8.field10341 = 1313669563 * var1;
         var8.field10339 = 1533439965 * var4;
         var8.field10343 = 1755371497 * (var2 >> 16);
         var8.field10342 = var3 * 1949040559;
         var8.field10340.method2780(-1 != var1 ? class635.field9823.method1053(var1, -2144045629).field4107 * 1505778629 : -1, var2 & '\uffff', var15, false, (byte)0);
      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "akn.d(" + ')');
      }
   }

   public final void method2547(int var1) {
      try {
         this.field4084 = 0;
         this.field4089 = 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akn.u(" + ')');
      }
   }

   public final void method2548(int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      try {
         boolean var9 = true;
         boolean var10 = true;

         int var11;
         for(var11 = 0; var11 < class6.field4931.field9523 * -942466371; ++var11) {
            if (this.field4044[var11] > var5) {
               var9 = false;
            } else {
               var10 = false;
            }
         }

         var11 = -1;
         int var12 = -1;
         int var13 = 0;
         if (var1 >= 0) {
            class399 var14 = class339.field157.method1211(var1, -1682094753);
            var12 = var14.field6576 * 100473069;
            var13 = -169339039 * var14.field6567;
         }

         int var17;
         if (var10) {
            if (var12 == -1) {
               return;
            }

            var11 = 0;
            var17 = 0;
            if (var12 == 0) {
               var17 = this.field4044[0];
            } else if (var12 == 1) {
               var17 = this.field4043[0];
            }

            for(int var15 = 1; var15 < -942466371 * class6.field4931.field9523; ++var15) {
               if (var12 == 0) {
                  if (this.field4044[var15] < var17) {
                     var11 = var15;
                     var17 = this.field4044[var15];
                  }
               } else if (1 == var12 && this.field4043[var15] < var17) {
                  var11 = var15;
                  var17 = this.field4043[var15];
               }
            }

            if (var12 == 1 && var17 >= var2) {
               return;
            }
         } else {
            if (var9) {
               this.field4097 = 0;
            }

            for(var17 = 0; var17 < class6.field4931.field9523 * -942466371; ++var17) {
               byte var18 = this.field4097;
               this.field4097 = (byte)((this.field4097 + 1) % (-942466371 * class6.field4931.field9523));
               if (this.field4044[var18] <= var5) {
                  var11 = var18;
                  break;
               }
            }
         }

         if (var11 >= 0) {
            this.field4066[var11] = var1;
            this.field4043[var11] = var2;
            this.field4091[var11] = var3;
            this.field4047[var11] = var4;
            this.field4044[var11] = var6 + var5 + var13;
            this.field4045[var11] = var7;
         }

      } catch (RuntimeException var16) {
         throw class158.method3445(var16, "akn.x(" + ')');
      }
   }

   public int method2170(byte var1) {
      try {
         class507 var2 = this.method2554(219719478);
         int var3;
         if (1638157075 * var2.field3974 != -1) {
            var3 = var2.field3974 * 1638157075;
         } else if (-32768 == this.field4053 * 1507955715) {
            var3 = 200;
         } else {
            var3 = -(1507955715 * this.field4053);
         }

         class446 var4 = this.method1511();
         int var5 = (int)var4.field7637.field5296 >> 9;
         int var6 = (int)var4.field7637.field5299 >> 9;
         if (this.field3638 != null && var5 >= 1 && var6 >= 1 && var5 <= class730.field2697.method5271(-2008930035) - 1 && var6 <= class730.field2697.method5272(-33342416) - 1) {
            class190 var7 = this.field3638.field3861[this.field3639][var5][var6];
            if (var7 != null && var7.field7011 != null) {
               return var3 + var7.field7011.field9059;
            }
         }

         return var3;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "akn.bx(" + ')');
      }
   }

   public void method2549(int var1, int var2) {
      try {
         this.field4029 = -1934893373 * var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "akn.r(" + ')');
      }
   }

   public int method2550() {
      try {
         return this instanceof class60 && ((class60)this).field1633.equals("Chicken God") ? 5 : 1173963243 * this.field4029;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "akn.q(" + ')');
      }
   }

   public void method4691(int var1) {
      try {
         int var2 = (this.field4029 * 1173963243 - 1 << 8) + 240;
         class32 var3 = this.method1511().field7637;
         this.field8299 = (short)((int)var3.field5296 - var2 >> 9);
         this.field8296 = (short)((int)var3.field5299 - var2 >> 9);
         this.field8297 = (short)((int)var3.field5296 + var2 >> 9);
         this.field8298 = (short)((int)var3.field5299 + var2 >> 9);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "akn.ew(" + ')');
      }
   }

   void method2551(class879 var1, int var2) {
      try {
         int var3 = this.field4077.field9268 * 259411823;
         int var4 = 259411823 * this.field4075.field9268;
         if (var3 != 0 || var4 != 0) {
            int var5 = var1.method5976() / 2;
            var1.method5953(0, -var5, 0);
            var1.method6041(var3 & 16383);
            var1.method5952(var4 & 16383);
            var1.method5953(0, var5, 0);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "akn.n(" + ')');
      }
   }

   void method2552(class848 var1, class507 var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         for(int var8 = 0; var8 < this.field4040.length; ++var8) {
            byte var9 = 0;
            if (var8 == 0) {
               var9 = 2;
            } else if (1 == var8) {
               var9 = 5;
            } else if (var8 == 2) {
               var9 = 1;
            } else if (3 == var8) {
               var9 = 7;
            }

            class932 var10 = this.field4040[var8];
            if (-1 != var10.field10341 * -967533709 && !var10.field10340.method2782(-65534)) {
               class745 var11 = class635.field9823.method1053(var10.field10341 * -967533709, -2040253952);
               boolean var12 = var11.field4118 == 3 && (var4 != 0 || var5 != 0);
               int var13 = var3;
               if (var12) {
                  var13 = var3 | 7;
               } else {
                  if (-885344433 * var10.field10342 != 0) {
                     var13 = var3 | 5;
                  }

                  if (1615294553 * var10.field10343 != 0) {
                     var13 |= 2;
                  }

                  if (var10.field10339 * -1418960779 >= 0) {
                     var13 |= 7;
                  }
               }

               class879 var14 = this.field4046[var8 + 1] = var11.method2590(var1, var13, var10.field10340, var9, 2124203678);
               if (var14 != null) {
                  if (var10.field10339 * -1418960779 >= 0 && var2.field3968 != null && var2.field3968[-1418960779 * var10.field10339] != null) {
                     int var15 = 0;
                     int var16 = 0;
                     int var17 = 0;
                     if (var2.field3968 != null && var2.field3968[var10.field10339 * -1418960779] != null) {
                        var15 += var2.field3968[-1418960779 * var10.field10339][0];
                        var16 += var2.field3968[-1418960779 * var10.field10339][1];
                        var17 += var2.field3968[var10.field10339 * -1418960779][2];
                     }

                     if (var2.field4011 != null && var2.field4011[var10.field10339 * -1418960779] != null) {
                        var15 += var2.field4011[-1418960779 * var10.field10339][0];
                        var16 += var2.field4011[var10.field10339 * -1418960779][1];
                        var17 += var2.field4011[var10.field10339 * -1418960779][2];
                     }

                     if (var17 != 0 || var15 != 0) {
                        int var18 = var6;
                        if (this.field4049 != null && this.field4049[var10.field10339 * -1418960779] != -1) {
                           var18 = this.field4049[-1418960779 * var10.field10339];
                        }

                        int var19 = var18 + -709199872 * var10.field10342 - var6 & 16383;
                        if (var19 != 0) {
                           var14.method6016(var19);
                        }

                        int var20 = class703.field3413[var19];
                        int var21 = class703.field3404[var19];
                        int var22 = var21 * var15 + var17 * var20 >> 14;
                        var17 = var21 * var17 - var20 * var15 >> 14;
                        var15 = var22;
                     }

                     var14.method5953(var15, var16, var17);
                  } else if (var10.field10342 * -885344433 != 0) {
                     var14.method6016(-709199872 * var10.field10342);
                  }

                  if (var10.field10343 * 1615294553 != 0) {
                     var14.method5953(0, -(1615294553 * var10.field10343) << 2, 0);
                  }

                  if (var12) {
                     if (-155466425 * this.field4061 != 0) {
                        var14.method5952(this.field4061 * -155466425);
                     }

                     if (-197572281 * this.field4037 != 0) {
                        var14.method6041(this.field4037 * -197572281);
                     }

                     if (this.field4038 * -104151209 != 0) {
                        var14.method5953(0, -104151209 * this.field4038, 0);
                     }
                  }
               }
            } else {
               this.field4046[1 + var8] = null;
            }
         }

      } catch (RuntimeException var23) {
         throw class158.method3445(var23, "akn.s(" + ')');
      }
   }

   void method2553(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         class32 var7 = this.method1511().field7637;
         int var8 = this.field8297 + this.field8299 >> 1;
         int var9 = this.field8296 + this.field8298 >> 1;
         int var10 = class703.field3413[var1];
         int var11 = class703.field3404[var1];
         int var12 = -var2 / 2;
         int var13 = -var3 / 2;
         int var14 = var12 * var11 + var10 * var13 >> 14;
         int var15 = var11 * var13 - var10 * var12 >> 14;
         int var16 = class917.method6454(var14 + (int)var7.field5296, (int)var7.field5299 + var15, var8, var9, this.field3639, (byte)13);
         int var17 = var2 / 2;
         int var18 = -var3 / 2;
         int var19 = var17 * var11 + var10 * var18 >> 14;
         int var20 = var18 * var11 - var17 * var10 >> 14;
         int var21 = class917.method6454(var19 + (int)var7.field5296, (int)var7.field5299 + var20, var8, var9, this.field3639, (byte)-9);
         int var22 = -var2 / 2;
         int var23 = var3 / 2;
         int var24 = var22 * var11 + var23 * var10 >> 14;
         int var25 = var11 * var23 - var10 * var22 >> 14;
         int var26 = class917.method6454((int)var7.field5296 + var24, var25 + (int)var7.field5299, var8, var9, this.field3639, (byte)105);
         int var27 = var2 / 2;
         int var28 = var3 / 2;
         int var29 = var11 * var27 + var10 * var28 >> 14;
         int var30 = var28 * var11 - var10 * var27 >> 14;
         int var31 = class917.method6454(var29 + (int)var7.field5296, var30 + (int)var7.field5299, var8, var9, this.field3639, (byte)97);
         int var32 = var16 < var21 ? var16 : var21;
         int var33 = var26 < var31 ? var26 : var31;
         int var34 = var21 < var31 ? var21 : var31;
         int var35 = var16 < var26 ? var16 : var26;
         this.field4061 = ((int)(Math.atan2((double)(var32 - var33), (double)var3) * 2607.5945876176133D) & 16383) * 1814320247;
         this.field4037 = ((int)(Math.atan2((double)(var35 - var34), (double)var2) * 2607.5945876176133D) & 16383) * -1037987721;
         int var36;
         if (this.field4061 * -155466425 != 0 && var4 != 0) {
            var36 = 16384 - var4;
            if (this.field4061 * -155466425 > 8192) {
               if (-155466425 * this.field4061 < var36) {
                  this.field4061 = 1814320247 * var36;
               }
            } else if (this.field4061 * -155466425 > var4) {
               this.field4061 = var4 * 1814320247;
            }
         }

         if (-197572281 * this.field4037 != 0 && var5 != 0) {
            var36 = 16384 - var5;
            if (this.field4037 * -197572281 > 8192) {
               if (this.field4037 * -197572281 < var36) {
                  this.field4037 = var36 * -1037987721;
               }
            } else if (-197572281 * this.field4037 > var5) {
               this.field4037 = var5 * -1037987721;
            }
         }

         this.field4038 = (var16 + var31) * 1400968295;
         if (var21 + var26 < -104151209 * this.field4038) {
            this.field4038 = 1400968295 * (var21 + var26);
         }

         this.field4038 = 1400968295 * ((this.field4038 * -104151209 >> 1) - (int)var7.field5300);
      } catch (RuntimeException var37) {
         throw class158.method3445(var37, "akn.z(" + ')');
      }
   }

   public class507 method2554(int var1) {
      try {
         int var2 = this.method2560(-40678538);
         return -1 == var2 ? class193.field7020 : class283.field10614.method3736(var2, (byte)11);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akn.y(" + ')');
      }
   }

   public abstract int method2555(byte var1);

   public void method2556(int var1) {
      try {
         if (this.field4082 != null && this.field4082.field9748 != null) {
            this.field4082.field9751 -= -1979671751;
            if (this.field4082.field9751 * -1542462711 == 0) {
               this.field4082.field9748 = null;
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akn.v(" + ')');
      }
   }

   public abstract boolean method2557(byte var1);

   public void method2558(String var1, int var2, int var3, int var4, byte var5) {
      try {
         if (this.field4082 == null) {
            this.field4082 = new class625();
         }

         this.field4082.field9748 = var1;
         this.field4082.field9747 = -883265885 * var2;
         this.field4082.field9749 = -998781563 * var3;
         this.field4082.field9751 = (this.field4082.field9750 = var4 * -1166793105) * 1683680471;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "akn.br(" + ')');
      }
   }

   public void method2559(int var1, int var2) {
      try {
         if (this.field4096 * 1097409519 != 1992528251 * this.field4071) {
            this.method2544((byte)-65);
         }

         this.field4071 = var1 * 543663539;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "akn.bz(" + ')');
      }
   }

   abstract int method2560(int var1);

   boolean method2561(int var1, int var2) {
      try {
         if (1097409519 * this.field4096 == var1) {
            return true;
         } else {
            this.field4095 = class886.method6167(var1, (int[])null, (class131)null, true, (byte)3);
            if (this.field4095 == null) {
               return false;
            } else {
               this.field4096 = var1 * 441346831;
               class932.method6294(this.field4095.field1103, -1178956884);
               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "akn.cd(" + ')');
      }
   }

   public void method2562() {
      int var1 = (this.field4029 * 1173963243 - 1 << 8) + 240;
      class32 var2 = this.method1511().field7637;
      this.field8299 = (short)((int)var2.field5296 - var1 >> 9);
      this.field8296 = (short)((int)var2.field5299 - var1 >> 9);
      this.field8297 = (short)((int)var2.field5296 + var1 >> 9);
      this.field8298 = (short)((int)var2.field5299 + var1 >> 9);
   }

   public int method2168(int var1) {
      try {
         return -32768 == this.field4053 * 1507955715 ? 0 : this.field4053 * 1507955715;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akn.bm(" + ')');
      }
   }

   boolean method2160() {
      return false;
   }

   public int method2186() {
      return -32768 == this.field4053 * 1507955715 ? 0 : this.field4053 * 1507955715;
   }

   boolean method2181() {
      return false;
   }

   public int method2563() {
      class507 var1 = this.method2554(1643711288);
      int var2;
      if (1638157075 * var1.field3974 != -1) {
         var2 = var1.field3974 * 1638157075;
      } else if (-32768 == this.field4053 * 1507955715) {
         var2 = 200;
      } else {
         var2 = -(1507955715 * this.field4053);
      }

      class446 var3 = this.method1511();
      int var4 = (int)var3.field7637.field5296 >> 9;
      int var5 = (int)var3.field7637.field5299 >> 9;
      if (this.field3638 != null && var4 >= 1 && var5 >= 1 && var4 <= class730.field2697.method5271(-2022187323) - 1 && var5 <= class730.field2697.method5272(1908645218) - 1) {
         class190 var6 = this.field3638.field3861[this.field3639][var4][var5];
         if (var6 != null && var6.field7011 != null) {
            return var2 + var6.field7011.field9059;
         }
      }

      return var2;
   }

   public int method2564() {
      class507 var1 = this.method2554(1920081667);
      int var2;
      if (1638157075 * var1.field3974 != -1) {
         var2 = var1.field3974 * 1638157075;
      } else if (-32768 == this.field4053 * 1507955715) {
         var2 = 200;
      } else {
         var2 = -(1507955715 * this.field4053);
      }

      class446 var3 = this.method1511();
      int var4 = (int)var3.field7637.field5296 >> 9;
      int var5 = (int)var3.field7637.field5299 >> 9;
      if (this.field3638 != null && var4 >= 1 && var5 >= 1 && var4 <= class730.field2697.method5271(-2141154955) - 1 && var5 <= class730.field2697.method5272(145346949) - 1) {
         class190 var6 = this.field3638.field3861[this.field3639][var4][var5];
         if (var6 != null && var6.field7011 != null) {
            return var2 + var6.field7011.field9059;
         }
      }

      return var2;
   }

   public abstract class625 method2565(int var1);

   abstract int method2566();

   public int method2188() {
      return -32768 == this.field4053 * 1507955715 ? 0 : this.field4053 * 1507955715;
   }

   boolean method2567(int var1) {
      try {
         return this.field4071 * 1992528251 == -1 ? false : this.method2561(1992528251 * this.field4071, -1999241902);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akn.cm(" + ')');
      }
   }

   boolean method2176() {
      return this.field4093;
   }

   boolean method2172() {
      return false;
   }

   public abstract boolean method2568();

   public void method2569(int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      try {
         if (!this.method2567(-377564191)) {
            if (-1 != var1) {
               class730.field2882[var1] = true;
            } else {
               for(int var9 = 0; var9 < 113; ++var9) {
                  class730.field2882[var9] = true;
               }
            }
         } else {
            class536.method2328(this.field4095.method887((byte)-37), -1, var2, var3, var4, var5, var6, var7, var1, false, (byte)0);
         }

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "akn.cp(" + ')');
      }
   }

   public void method2570(int var1, int var2, boolean var3, int var4) {
      try {
         if (this.method2567(-551216163)) {
            class381.method1066(this.field4095.field1103, -1, var1, var2, var3, (short)-1055);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "akn.cq(" + ')');
      }
   }

   public abstract class625 method2571();

   boolean method2183(short var1) {
      try {
         return this.field4093;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akn.be(" + ')');
      }
   }

   public void method2572() {
      int var1 = (this.field4029 * 1173963243 - 1 << 8) + 240;
      class32 var2 = this.method1511().field7637;
      this.field8299 = (short)((int)var2.field5296 - var1 >> 9);
      this.field8296 = (short)((int)var2.field5299 - var1 >> 9);
      this.field8297 = (short)((int)var2.field5296 + var1 >> 9);
      this.field8298 = (short)((int)var2.field5299 + var1 >> 9);
   }

   class746(class545 var1, int var2) {
      super(var1, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte)0);
      this.field4029 = -1934893373;
      this.field4053 = -1532329984;
      this.field4087 = true;
      this.field4033 = 0;
      this.field4034 = -2135118589;
      this.field4035 = 0;
      this.field4086 = 0;
      this.field4097 = 0;
      this.field4066 = new int[-942466371 * class6.field4931.field9523];
      this.field4043 = new int[-942466371 * class6.field4931.field9523];
      this.field4044 = new int[-942466371 * class6.field4931.field9523];
      this.field4045 = new int[class6.field4931.field9523 * -942466371];
      this.field4091 = new int[class6.field4931.field9523 * -942466371];
      this.field4047 = new int[class6.field4931.field9523 * -942466371];
      this.field4080 = 1208121000;
      this.field4050 = 875976968;
      this.field4083 = false;
      this.field4054 = -283914955;
      this.field4057 = null;
      this.field4058 = false;
      this.field4041 = new class511(this, false);
      this.field4042 = new class511(this, false);
      this.field4069 = -1828453179;
      this.field4070 = 473408095;
      this.field4094 = 0;
      this.field4039 = 0;
      this.field4078 = 0;
      this.field4079 = 1168822528;
      this.field4048 = new class890();
      this.field4077 = new class890();
      this.field4075 = new class890();
      this.field4084 = 0;
      this.field4088 = 0;
      this.field4089 = 0;
      this.field4090 = 0;
      this.field4092 = false;
      this.field4093 = false;
      this.field4096 = -441346831;
      this.field4071 = -543663539;
      this.field4085 = new int[var2];
      this.field4055 = new int[var2];
      this.field4074 = new byte[var2];
      this.field4046 = new class879[5];
      this.field4040 = new class932[4];

      for(int var3 = 0; var3 < 4; ++var3) {
         this.field4040[var3] = new class932(this);
      }

      this.field4076 = new class761[class413.field9412.field1542.length];
   }

   void method2573(class848 var1, class879[] var2, class135 var3, boolean var4, int var5) {
      try {
         if (!var4) {
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = -1;
            int var11 = -1;
            class933[][] var12 = new class933[var2.length][];
            class396[][] var13 = new class396[var2.length][];

            for(int var14 = 0; var14 < var2.length; ++var14) {
               if (var2[var14] != null) {
                  var2[var14].method6096(var3);
                  var12[var14] = var2[var14].method6089();
                  var13[var14] = var2[var14].method5941();
                  if (var12[var14] != null) {
                     var10 = var14;
                     ++var7;
                     var6 += var12[var14].length;
                  }

                  if (var13[var14] != null) {
                     var11 = var14;
                     ++var9;
                     var8 += var13[var14].length;
                  }
               }
            }

            if ((this.field4031 == null || this.field4031.field2548) && (var7 > 0 || var9 > 0)) {
               this.field4031 = class726.method1732(class730.field2866 * 443738891, true);
            }

            if (this.field4031 != null) {
               Object var21 = null;
               class933[] var15;
               if (var7 == 1) {
                  var15 = var12[var10];
               } else {
                  var15 = new class933[var6];
                  int var16 = 0;

                  for(int var17 = 0; var17 < var2.length; ++var17) {
                     if (var12[var17] != null) {
                        System.arraycopy(var12[var17], 0, var15, var16, var12[var17].length);
                        var16 += var12[var17].length;
                     }
                  }
               }

               Object var22 = null;
               class396[] var23;
               if (var9 == 1) {
                  var23 = var13[var11];
               } else {
                  var23 = new class396[var8];
                  int var18 = 0;

                  for(int var19 = 0; var19 < var2.length; ++var19) {
                     if (var13[var19] != null) {
                        System.arraycopy(var13[var19], 0, var23, var18, var13[var19].length);
                        var18 += var13[var19].length;
                     }
                  }
               }

               this.field4031.method1731(var1, (long)(443738891 * class730.field2866), var15, var23, false);
               this.field4092 = true;
            }
         } else if (this.field4031 != null) {
            this.field4031.method1733((long)(class730.field2866 * 443738891));
         }

         if (this.field4031 != null) {
            this.field4031.method1727(this.field3639, this.field8299, this.field8297, this.field8296, this.field8298);
         }

      } catch (RuntimeException var20) {
         throw class158.method3445(var20, "akn.k(" + ')');
      }
   }

   abstract int method2574();

   abstract int method2575();

   abstract int method2576();

   public abstract int method2577();

   public int method2578(short var1) {
      try {
         class507 var2 = this.method2554(80856829);
         int var3 = 259411823 * this.field4048.field9268;
         boolean var4;
         if (var2.field4002 * -2079528661 != 0) {
            var4 = this.field4048.method5551(this.field4032 * 2145248039, -2079528661 * var2.field4002, var2.field4003 * -1460258951, (byte)-24);
         } else {
            var4 = this.field4048.method5551(this.field4032 * 2145248039, 907865649 * this.field4079, this.field4079 * 907865649, (byte)-44);
         }

         int var5 = 259411823 * this.field4048.field9268 - var3;
         if (var5 != 0) {
            this.field4078 += 1666755029;
         } else {
            this.field4078 = 0;
            this.field4048.method5552(2145248039 * this.field4032, -43132362);
         }

         if (var4) {
            if (var2.field3984 * 1496476593 != 0) {
               if (var5 > 0) {
                  this.field4077.method5551(var2.field4006 * 1185872679, var2.field3984 * 1496476593, 827802659 * var2.field4005, (byte)-96);
               } else {
                  this.field4077.method5551(-(var2.field4006 * 1185872679), 1496476593 * var2.field3984, var2.field4005 * 827802659, (byte)-111);
               }
            }

            if (var2.field3978 * 847512459 != 0) {
               this.field4075.method5551(-330229359 * var2.field4009, 847512459 * var2.field3978, var2.field4008 * 1308368525, (byte)-37);
            }
         } else {
            if (1496476593 * var2.field3984 != 0) {
               this.field4077.method5551(0, var2.field3984 * 1496476593, 827802659 * var2.field4005, (byte)-2);
            } else {
               this.field4077.method5552(0, -1696263872);
            }

            if (var2.field3978 * 847512459 != 0) {
               this.field4075.method5551(0, 847512459 * var2.field3978, var2.field4008 * 1308368525, (byte)-85);
            } else {
               this.field4075.method5552(0, -146971224);
            }
         }

         return var5;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "akn.b(" + ')');
      }
   }

   class746(class545 var1) {
      this(var1, 10);
   }

   public void method2579(int[] var1, int[] var2, int var3) {
      try {
         if (this.field4056 == null && var1 != null) {
            this.field4056 = new int[class413.field9412.field1542.length];
         } else if (var1 == null) {
            this.field4056 = null;
            return;
         }

         int var4;
         for(var4 = 0; var4 < this.field4056.length; ++var4) {
            this.field4056[var4] = -1;
         }

         for(var4 = 0; var4 < var1.length; ++var4) {
            int var5 = var2[var4];

            for(int var6 = 0; var6 < this.field4056.length; var5 >>= 1) {
               if ((var5 & 1) != 0) {
                  this.field4056[var6] = var1[var4];
               }

               ++var6;
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "akn.p(" + ')');
      }
   }

   boolean method2156() {
      return this.field4093;
   }

   boolean method2190() {
      return this.field4093;
   }

   boolean method2158() {
      return this.field4093;
   }

   public int method2187() {
      return -32768 == this.field4053 * 1507955715 ? 0 : this.field4053 * 1507955715;
   }

   public abstract boolean method2580();
}
