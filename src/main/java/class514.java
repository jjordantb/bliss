import java.util.Iterator;

public class class514 implements Iterable {
   public class345 field4317 = new class345();
   class345 field4318;
   static int field4319;

   public class514() {
      this.field4317.field208 = this.field4317;
      this.field4317.field207 = this.field4317;
   }

   public void method2704(class345 var1, byte var2) {
      try {
         if (var1.field207 != null) {
            var1.method156(1066671336);
         }

         var1.field207 = this.field4317.field207;
         var1.field208 = this.field4317;
         var1.field207.field208 = var1;
         var1.field208.field207 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sz.f(" + ')');
      }
   }

   public class345 method2705(int var1) {
      try {
         class345 var2 = this.field4317.field208;
         if (this.field4317 == var2) {
            return null;
         } else {
            var2.method156(-785195500);
            return var2;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sz.i(" + ')');
      }
   }

   public class345 method2706(int var1) {
      try {
         return this.method2709((class345)null, -232966576);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sz.k(" + ')');
      }
   }

   public class345 method2707(int var1) {
      try {
         class345 var2 = this.field4318;
         if (this.field4317 == var2) {
            this.field4318 = null;
            return null;
         } else {
            this.field4318 = var2.field208;
            return var2;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sz.u(" + ')');
      }
   }

   public int method2708(short var1) {
      try {
         int var2 = 0;

         for(class345 var3 = this.field4317.field208; this.field4317 != var3; var3 = var3.field208) {
            ++var2;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sz.x(" + ')');
      }
   }

   public Iterator iterator() {
      try {
         return new class906(this);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sz.iterator(" + ')');
      }
   }

   class345 method2709(class345 var1, int var2) {
      try {
         class345 var3;
         if (var1 == null) {
            var3 = this.field4317.field208;
         } else {
            var3 = var1;
         }

         if (this.field4317 == var3) {
            this.field4318 = null;
            return null;
         } else {
            this.field4318 = var3.field208;
            return var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sz.d(" + ')');
      }
   }

   public void method2710(int var1) {
      try {
         while(this.field4317.field208 != this.field4317) {
            this.field4317.field208.method156(834138083);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sz.a(" + ')');
      }
   }

   static void method2711(class206 var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         if (-1 != var0.field7086 * 391847895 || var0.field7075 != null) {
            int var6 = 0;
            int var7 = var0.field7092 * 43235291 * class615.field8903.field9148.method2717(-2144866042) >> 8;
            if (var2 > -1012062621 * var0.field7070) {
               var6 += var2 - -1012062621 * var0.field7070;
            } else if (var2 < -1808325887 * var0.field7068) {
               var6 += -1808325887 * var0.field7068 - var2;
            }

            if (var3 > -720500331 * var0.field7071) {
               var6 += var3 - -720500331 * var0.field7071;
            } else if (var3 < var0.field7066 * 757346071) {
               var6 += 757346071 * var0.field7066 - var3;
            }

            if (826975881 * var0.field7073 != 0 && var6 - 256 <= 826975881 * var0.field7073 && class615.field8903.field9148.method2717(-2144778383) != 0 && -1926928785 * var0.field7067 == var1) {
               var6 -= 256;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var8 = 826975881 * var0.field7073 - -2024907801 * var0.field7072;
               if (var8 < 0) {
                  var8 = var0.field7073 * 826975881;
               }

               int var9 = var7;
               int var10 = var6 - -2024907801 * var0.field7072;
               if (var10 > 0 && var8 > 0) {
                  var9 = (var8 - var10) * var7 / var8;
               }

               class923.field10295.method2550();
               int var11 = 8192;
               int var12 = (var0.field7068 * -1808325887 + var0.field7070 * -1012062621) / 2 - var2;
               int var13 = (-720500331 * var0.field7071 + 757346071 * var0.field7066) / 2 - var3;
               if (var12 != 0 || var13 != 0) {
                  int var14 = -(-1847894591 * class232.field8266) - (int)(Math.atan2((double)var12, (double)var13) * 2607.5945876176133D) - 4096 & 16383;
                  if (var14 > 8192) {
                     var14 = 16384 - var14;
                  }

                  int var15;
                  if (var6 <= 0) {
                     var15 = 8192;
                  } else if (var6 >= 4096) {
                     var15 = 16384;
                  } else {
                     var15 = var6 * 8192 / 4096 + 8192;
                  }

                  var11 = var14 * var15 / 8192 + (16384 - var15 >> 1);
               }

               class436 var16;
               class436 var18;
               class624 var19;
               class656 var20;
               if (var0.field7090 == null) {
                  if (391847895 * var0.field7086 >= 0) {
                     var12 = -455518897 * var0.field7095 == 256 && var0.field7084 * 1495381837 == 256 ? 256 : class160.method3569(1495381837 * var0.field7084, var0.field7095 * -455518897, -1122963701);
                     if (var0.field7087) {
                        if (var0.field7088 == null) {
                           var0.field7088 = class29.method3510(class967.field2604, var0.field7086 * 391847895);
                        }

                        if (var0.field7088 != null) {
                           if (var0.field7089 == null) {
                              var0.field7089 = var0.field7088.method3511(new int[]{22050});
                           }

                           if (var0.field7089 != null) {
                              var18 = class436.method4208(var0.field7089, var12, var9 << 6, var11);
                              var18.method4172(-1);
                              class56.field2321.method3870(var18);
                              var0.field7090 = var18;
                           }
                        }
                     } else {
                        var19 = class624.method5837(class783.field3963, var0.field7086 * 391847895, 0);
                        if (var19 != null) {
                           var20 = var19.method5834().method5605(class647.field9234);
                           var16 = class436.method4208(var20, var12, var9 << 6, var11);
                           var16.method4172(-1);
                           class56.field2321.method3870(var16);
                           var0.field7090 = var16;
                        }
                     }
                  }
               } else {
                  var0.field7090.method4173(var9);
                  var0.field7090.method4170(var11);
               }

               if (var0.field7069 == null) {
                  if (var0.field7075 != null && (var0.field7097 -= 950219665 * var4) * -1221989007 <= 0) {
                     var12 = var0.field7095 * -455518897 == 256 && 256 == var0.field7084 * 1495381837 ? 256 : (int)(Math.random() * (double)(-455518897 * var0.field7095 - var0.field7084 * 1495381837)) + var0.field7084 * 1495381837;
                     if (var0.field7094) {
                        if (var0.field7063 == null) {
                           var13 = (int)(Math.random() * (double)var0.field7075.length);
                           var0.field7063 = class29.method3510(class967.field2604, var0.field7075[var13]);
                        }

                        if (var0.field7063 != null) {
                           if (var0.field7096 == null) {
                              var0.field7096 = var0.field7063.method3511(new int[]{22050});
                           }

                           if (var0.field7096 != null) {
                              var18 = class436.method4208(var0.field7096, var12, var9 << 6, var11);
                              var18.method4172(0);
                              class56.field2321.method3870(var18);
                              var0.field7069 = var18;
                              var0.field7097 = (var0.field7093 * -15898815 + (int)(Math.random() * (double)(-1398300237 * var0.field7065 - -15898815 * var0.field7093))) * 950219665;
                           }
                        }
                     } else {
                        var13 = (int)(Math.random() * (double)var0.field7075.length);
                        var19 = class624.method5837(class783.field3963, var0.field7075[var13], 0);
                        if (var19 != null) {
                           var20 = var19.method5834().method5605(class647.field9234);
                           var16 = class436.method4208(var20, var12, var9 << 6, var11);
                           var16.method4172(0);
                           class56.field2321.method3870(var16);
                           var0.field7069 = var16;
                           var0.field7097 = (-15898815 * var0.field7093 + (int)(Math.random() * (double)(var0.field7065 * -1398300237 - -15898815 * var0.field7093))) * 950219665;
                        }
                     }
                  }
               } else {
                  var0.field7069.method4173(var9);
                  var0.field7069.method4170(var11);
                  if (!var0.field7069.method546(-629325116)) {
                     var0.field7069 = null;
                     var0.field7063 = null;
                     var0.field7096 = null;
                  }
               }
            } else {
               if (var0.field7090 != null) {
                  class56.field2321.method3875(var0.field7090);
                  var0.field7090 = null;
                  var0.field7089 = null;
                  var0.field7088 = null;
               }

               if (var0.field7069 != null) {
                  class56.field2321.method3875(var0.field7069);
                  var0.field7069 = null;
                  var0.field7063 = null;
                  var0.field7096 = null;
               }
            }
         }

      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "sz.n(" + ')');
      }
   }
}
