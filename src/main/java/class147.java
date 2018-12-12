public class class147 {
   int[] field1517;
   byte[] field1518;
   int[] field1519;
   public static class564 field1520;

   public class147(byte[] var1) {
      int var2 = var1.length;
      this.field1517 = new int[var2];
      this.field1518 = var1;
      int[] var3 = new int[33];
      this.field1519 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         byte var6 = var1[var5];
         if (var6 != 0) {
            int var7 = 1 << 32 - var6;
            int var8 = var3[var6];
            this.field1517[var5] = var8;
            int var9;
            int var10;
            int var11;
            int var12;
            if ((var8 & var7) != 0) {
               var9 = var3[var6 - 1];
            } else {
               var9 = var8 | var7;

               for(var10 = var6 - 1; var10 >= 1; --var10) {
                  var11 = var3[var10];
                  if (var8 != var11) {
                     break;
                  }

                  var12 = 1 << 32 - var10;
                  if ((var11 & var12) != 0) {
                     var3[var10] = var3[var10 - 1];
                     break;
                  }

                  var3[var10] = var11 | var12;
               }
            }

            var3[var6] = var9;

            for(var10 = 1 + var6; var10 <= 32; ++var10) {
               if (var3[var10] == var8) {
                  var3[var10] = var9;
               }
            }

            var10 = 0;

            for(var11 = 0; var11 < var6; ++var11) {
               var12 = Integer.MIN_VALUE >>> var11;
               if ((var8 & var12) != 0) {
                  if (this.field1519[var10] == 0) {
                     this.field1519[var10] = var4;
                  }

                  var10 = this.field1519[var10];
               } else {
                  ++var10;
               }

               if (var10 >= this.field1519.length) {
                  int[] var13 = new int[2 * this.field1519.length];

                  for(int var14 = 0; var14 < this.field1519.length; ++var14) {
                     var13[var14] = this.field1519[var14];
                  }

                  this.field1519 = var13;
               }

               var12 >>>= 1;
            }

            this.field1519[var10] = ~var5;
            if (var10 >= var4) {
               var4 = 1 + var10;
            }
         }
      }

   }

   int method1136(byte[] var1, int var2, byte[] var3, int var4, int var5, int var6) {
      try {
         if (var5 == 0) {
            return 0;
         } else {
            int var7 = 0;
            var5 += var4;
            int var8 = var2;

            while(true) {
               byte var9 = var1[var8];
               if (var9 < 0) {
                  var7 = this.field1519[var7];
               } else {
                  ++var7;
               }

               int var10;
               if ((var10 = this.field1519[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if ((var9 & 64) != 0) {
                  var7 = this.field1519[var7];
               } else {
                  ++var7;
               }

               if ((var10 = this.field1519[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 == 787727170) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if ((var9 & 32) != 0) {
                  var7 = this.field1519[var7];
               } else {
                  ++var7;
               }

               if ((var10 = this.field1519[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if ((var9 & 16) != 0) {
                  var7 = this.field1519[var7];
               } else {
                  ++var7;
               }

               if ((var10 = this.field1519[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if ((var9 & 8) != 0) {
                  var7 = this.field1519[var7];
               } else {
                  ++var7;
               }

               if ((var10 = this.field1519[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 == 787727170) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if ((var9 & 4) != 0) {
                  var7 = this.field1519[var7];
               } else {
                  ++var7;
               }

               if ((var10 = this.field1519[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if ((var9 & 2) != 0) {
                  var7 = this.field1519[var7];
               } else {
                  ++var7;
               }

               if ((var10 = this.field1519[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 == 787727170) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if ((var9 & 1) != 0) {
                  var7 = this.field1519[var7];
               } else {
                  ++var7;
               }

               if ((var10 = this.field1519[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 == 787727170) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               ++var8;
            }

            return var8 + 1 - var2;
         }
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "ep.f(" + ')');
      }
   }

   int method1137(byte[] var1, int var2, int var3, byte[] var4, int var5, byte var6) {
      try {
         int var7 = 0;
         int var8 = var5 << 3;

         for(var3 += var2; var2 < var3; ++var2) {
            int var9 = var1[var2] & 255;
            int var10 = this.field1517[var9];
            byte var11 = this.field1518[var9];
            if (var11 == 0) {
               throw new RuntimeException("" + var9);
            }

            int var12 = var8 >> 3;
            int var13 = var8 & 7;
            var7 &= -var13 >> 31;
            int var14 = var12 + (var13 + var11 - 1 >> 3);
            var13 += 24;
            var4[var12] = (byte)(var7 |= var10 >>> var13);
            if (var12 >= var14) {
               if (var6 >= 23) {
                  throw new IllegalStateException();
               }
            } else {
               ++var12;
               var13 -= 8;
               var4[var12] = (byte)(var7 = var10 >>> var13);
               if (var12 < var14) {
                  ++var12;
                  var13 -= 8;
                  var4[var12] = (byte)(var7 = var10 >>> var13);
                  if (var12 < var14) {
                     ++var12;
                     var13 -= 8;
                     var4[var12] = (byte)(var7 = var10 >>> var13);
                     if (var12 < var14) {
                        ++var12;
                        var13 -= 8;
                        var4[var12] = (byte)(var7 = var10 << -var13);
                     }
                  }
               }
            }

            var8 += var11;
         }

         return (var8 + 7 >> 3) - var5;
      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "ep.a(" + ')');
      }
   }

   public static final void method1138(int var0) {
      try {
         class69.field1832.method3978(841920910);

         int var1;
         for(var1 = 0; var1 < 32; ++var1) {
            class69.field1826[var1] = 0L;
         }

         for(var1 = 0; var1 < 32; ++var1) {
            class69.field1819[var1] = 0L;
         }

         class845.field8630 = 0;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ep.ax(" + ')');
      }
   }

   static final void method1139(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-77);
         class131 var4 = class382.field1410[var2 >> 16];
         class852.method5144(var3, var4, var0, -1171777109);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ep.eo(" + ')');
      }
   }

   static final void method1140(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-77);
         class131 var4 = class382.field1410[var2 >> 16];
         class679.method4270(var3, var4, var0, 268393846);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ep.ll(" + ')');
      }
   }

   static final void method1141(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-61);
         var0.field3161[++var0.field3156 - 1] = var3.field892;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ep.re(" + ')');
      }
   }

   static final void method1142(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (class730.field2785 != null && var2 < class556.field503) {
            var0.field3161[++var0.field3156 - 1] = class776.field3731[var2].field8119;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ep.wh(" + ')');
      }
   }

   static final void method1143(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9144.method1564(-1397951801);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ep.akj(" + ')');
      }
   }

   static byte method1144(int var0, int var1, int var2) {
      try {
         if (var0 != class15.field6903.field6921) {
            return 0;
         } else {
            return (byte)((var1 & 1) == 0 ? 1 : 2);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ep.by(" + ')');
      }
   }

   public static final class256 method1145(int var0, class256 var1, int[] var2, boolean var3, int var4) {
      try {
         class256 var5 = (class256)class730.field2823.method2942((long)var0);
         if (var5 != null) {
            class526.method2226(var5, var5.field8101 != var1.field8101, var3, -113822480);
         }

         class730.field2823.method2947(var1, (long)var0);
         class342.method223(var1.field8101, var2, 888891171);
         class564 var6 = class449.method3756(var0, (byte)49);
         if (var6 != null) {
            class814.method2932(var6, -702811353);
         }

         if (class730.field2633 != null) {
            class814.method2932(class730.field2633, 961005010);
            class730.field2633 = null;
         }

         class341.method263(-662741241);
         if (var6 != null) {
            class948.method1938(class382.field1410[var6.field867 >>> 16], var6, !var3, 112223880);
         }

         if (!var3) {
            class228.method4586(var1.field8101, var2, -746339380);
         }

         if (!var3 && class730.field2822 != -1) {
            class929.method6262(class730.field2822, 1, -2018560763);
         }

         return var1;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "ep.ld(" + ')');
      }
   }

   public static class49[] method1146(int var0) {
      try {
         return new class49[]{class49.field5183, class49.field5184, class49.field5182};
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ep.a(" + ')');
      }
   }
}
