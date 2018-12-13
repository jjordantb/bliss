import java.awt.Component;

public class class752 {
   int field4166;
   public static boolean field4167;
   static int field4168;
   static int field4169 = 8;
   public static int field4170 = 256;
   long field4171 = class27.resetTimer((byte)1);
   int[] field4172;
   boolean field4173 = false;
   class298 field4174;
   int field4175 = 32;
   int field4176;
   static class649 field4177;
   class298[] field4178 = new class298[8];
   public static int field4179;
   long field4180 = 0L;
   int field4181 = 0;
   int field4182 = 0;
   int field4183 = 0;
   long field4184 = 0L;
   boolean field4185 = true;
   static int field4186 = 3;
   static int field4187 = 16384;
   static int field4188 = 2;
   static int field4189 = 4;
   static int field4190 = 286331153;
   int field4191;
   int field4192 = 0;
   class298[] field4193 = new class298[8];

   public final synchronized void method2625(class298 var1, int var2) {
      try {
         this.field4174 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lu.b(" + ')');
      }
   }

   public final synchronized void method2626(int var1) {
      try {
         if (!this.field4173) {
            long var2 = class27.resetTimer((byte)1);

            try {
               if (var2 > this.field4171 + 6000L) {
                  this.field4171 = var2 - 6000L;
               }

               while(var2 > this.field4171 + 5000L) {
                  this.method2627(256, -518493991);
                  this.field4171 += (long)(256000 / field4179);
                  var2 = class27.resetTimer((byte)1);
               }
            } catch (Exception var8) {
               this.field4171 = var2;
            }

            if (this.field4172 != null) {
               try {
                  if (0L != this.field4180) {
                     if (var2 < this.field4180) {
                        return;
                     }

                     this.method2630(this.field4166, 816646714);
                     this.field4180 = 0L;
                     this.field4185 = true;
                  }

                  int var4 = this.method2634(-2047791436);
                  if (this.field4183 - var4 > this.field4181) {
                     this.field4181 = this.field4183 - var4;
                  }

                  int var5 = this.field4176 + this.field4191;
                  if (var5 + 256 > 16384) {
                     var5 = 16128;
                  }

                  if (var5 + 256 > this.field4166) {
                     this.field4166 += 1024;
                     if (this.field4166 > 16384) {
                        this.field4166 = 16384;
                     }

                     this.method2632(331463442);
                     this.method2630(this.field4166, 1013749816);
                     var4 = 0;
                     this.field4185 = true;
                     if (var5 + 256 > this.field4166) {
                        var5 = this.field4166 - 256;
                        this.field4176 = var5 - this.field4191;
                     }
                  }

                  while(var4 < var5) {
                     this.method2628(this.field4172, 256);
                     this.method2631();
                     var4 += 256;
                  }

                  if (var2 > this.field4184) {
                     if (!this.field4185) {
                        if (this.field4181 == 0 && this.field4182 == 0) {
                           this.method2632(331463442);
                           this.field4180 = 2000L + var2;
                           return;
                        }

                        this.field4176 = Math.min(this.field4182, this.field4181);
                        this.field4182 = this.field4181;
                     } else {
                        this.field4185 = false;
                     }

                     this.field4181 = 0;
                     this.field4184 = var2 + 2000L;
                  }

                  this.field4183 = var4;
               } catch (Exception var7) {
                  this.method2632(331463442);
                  this.field4180 = var2 + 2000L;
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "lu.p(" + ')');
      }
   }

   final void method2627(int var1, int var2) {
      try {
         this.field4192 -= var1;
         if (this.field4192 < 0) {
            this.field4192 = 0;
         }

         if (this.field4174 != null) {
            this.field4174.method6534(var1);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lu.d(" + ')');
      }
   }

   final void method2628(int[] var1, int var2) {
      int var3 = var2;
      if (field4167) {
         var3 = var2 << 1;
      }

      class901.method6356(var1, 0, var3);
      this.field4192 -= var2;
      if (this.field4174 != null && this.field4192 <= 0) {
         this.field4192 += field4179 >> 4;
         class625.method5830(this.field4174, -1934060670);
         this.method2637(this.field4174, this.field4174.method6549(), (byte)-73);
         int var4 = 0;
         int var5 = 255;

         int var6;
         class298 var10;
         label104:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class298 var11 = this.field4178[var7];

                  label98:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label98;
                        }

                        class828 var12 = var11.field10520;
                        if (var12 != null && var12.field9042 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field10521;
                        } else {
                           var11.field10518 = true;
                           int var13 = var11.method6528();
                           var4 += var13;
                           if (var12 != null) {
                              var12.field9042 += var13;
                           }

                           if (var4 >= this.field4175) {
                              break label104;
                           }

                           class298 var14 = var11.method6529();
                           if (var14 != null) {
                              for(int var15 = var11.field10519; var14 != null; var14 = var11.method6530()) {
                                 this.method2637(var14, var15 * var14.method6549() >> 8, (byte)-50);
                              }
                           }

                           class298 var18 = var11.field10521;
                           var11.field10521 = null;
                           if (var10 == null) {
                              this.field4178[var7] = var18;
                           } else {
                              var10.field10521 = var18;
                           }

                           if (var18 == null) {
                              this.field4193[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class298 var16 = this.field4178[var6];
            class298[] var17 = this.field4178;
            this.field4193[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field10521;
               var16.field10521 = null;
            }
         }
      }

      if (this.field4192 < 0) {
         this.field4192 = 0;
      }

      if (this.field4174 != null) {
         this.field4174.method6533(var1, 0, var2);
      }

      this.field4171 = class27.resetTimer((byte)1);
   }

   void method2629(Component var1, byte var2) throws Exception {
   }

   void method2630(int var1, int var2) throws Exception {
   }

   void method2631() throws Exception {
   }

   void method2632(int var1) {
   }

   void method2633(short var1) throws Exception {
   }

   int method2634(int var1) throws Exception {
      try {
         return this.field4166;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lu.s(" + ')');
      }
   }

   public final synchronized void method2635(int var1) {
      try {
         this.field4185 = true;

         try {
            this.method2633((short)-24697);
         } catch (Exception var3) {
            this.method2632(331463442);
            this.field4180 = class27.resetTimer((byte)1) + 2000L;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lu.i(" + ')');
      }
   }

   public final synchronized void method2636(byte var1) {
      try {
         if (field4177 != null) {
            boolean var2 = true;

            for(int var3 = 0; var3 < 2; ++var3) {
               if (this == field4177.field9264[var3]) {
                  field4177.field9264[var3] = null;
               }

               if (field4177.field9264[var3] != null) {
                  var2 = false;
               }
            }

            if (var2) {
               field4177.field9263 = true;

               while(field4177.field9262) {
                  class764.method2745(50L);
               }

               field4177 = null;
            }
         }

         this.method2632(331463442);
         this.field4172 = null;
         this.field4173 = true;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lu.k(" + ')');
      }
   }

   final void method2637(class298 var1, int var2, byte var3) {
      try {
         int var4 = var2 >> 5;
         class298 var5 = this.field4193[var4];
         if (var5 == null) {
            this.field4178[var4] = var1;
         } else {
            var5.field10521 = var1;
         }

         this.field4193[var4] = var1;
         var1.field10519 = var2;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "lu.r(" + ')');
      }
   }

   public static void method2638(int var0, int var1) {
      try {
         class1 var2 = class365.field2449;
         synchronized(class365.field2449) {
            class365.field2449.method2976(var0, -1178838695);
         }

         var2 = class365.field2450;
         synchronized(class365.field2450) {
            class365.field2450.method2976(var0, 391081227);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lu.s(" + ')');
      }
   }

   static final void method2639(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         var0.field3161[++var0.field3156 - 1] = var3.field881;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lu.oc(" + ')');
      }
   }

   static final void method2640(Widget var0, class744 var1, int var2) {
      try {
         int var3 = var1.field3161[--var1.field3156];
         int var4 = var1.field3161[--var1.field3156] - 1;
         if (var0.field909 != 6 && 2 != var0.field909) {
            throw new RuntimeException("");
         } else {
            NpcDefinition var5 = class258.field7913.method12(var0.field876, 2035169508);
            if (var0.field1032 == null) {
               var0.field1032 = new class692(var5, var0.field909 == 6);
            }

            var0.field1032.field7133 = class390.method3422(954429430);
            if (var5.field9870 != null && var4 >= 0 && var4 < var5.field9870.length) {
               var0.field1032.field7132[var4] = (short)var3;
               class814.method2932(var0, -579030149);
            } else {
               throw new RuntimeException("");
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "lu.qi(" + ')');
      }
   }

   static final void method2641(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9117.method5848(207850013) == 1 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lu.ajo(" + ')');
      }
   }

   static final void method2642(Widget var0, WidgetContainer var1, class744 var2, short var3) {
      try {
         var2.field3156 -= 2;
         int var4 = var2.field3161[var2.field3156];
         int var5 = var2.field3161[var2.field3156 + 1];
         class785 var6 = class452.field7216.method5148(var4, 493338480);
         if (var6.field3822 != var5) {
            var0.method835(var4, var5, 1223650775);
         } else {
            var0.method833(var4, 1279288503);
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "lu.gp(" + ')');
      }
   }

   static final void method2643(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = ObjectDefinition.method1498((char)var2, (short)160) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lu.zq(" + ')');
      }
   }
}
