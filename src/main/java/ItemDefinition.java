import java.awt.Dimension;

public class ItemDefinition {
   public static int[] field4215 = new int[1];
   public static int[] field4216 = new int[1];
   public int field4217 = 0;
   public static int field4218 = 1;
   int field4219 = 128;
   public int field4220 = -1;
   public int field4221 = 0;
   public static int field4222 = 2;
   short[] field4223;
   public String name = "null";
   byte[] field4225;
   public int field4226 = -1;
   int field4227 = 0;
   short[] field4228;
   short[] field4229;
   public int field4230 = 2000;
   public int field4231 = 0;
   public int field4232 = 0;
   public int field4233 = 0;
   public int field4234 = 0;
   public int field4235 = 0;
   public int field4236 = -1;
   public int field4237 = -1;
   public int field4238 = 1;
   public int field4239 = -1;
   public String[] field4240;
   public int field4241 = -1;
   public int field4242 = -1;
   public static int field4243 = 0;
   public int field4244 = -1;
   public int field4245 = -1;
   public int field4246 = -1;
   public int field4247 = -1;
   public boolean field4248 = false;
   public String[] field4249;
   public String[] field4250;
   public int field4251 = -1;
   public boolean field4252 = false;
   public int field4253 = -1;
   public int field4254 = -1;
   int field4255 = -1;
   int field4256;
   int field4257 = 128;
   int field4258;
   int field4259 = -1;
   int field4260 = 0;
   int field4261 = 0;
   int field4262 = 0;
   int field4263 = 0;
   int field4264 = -1;
   public int field4265 = -1;
   int field4266 = 0;
   int field4267 = -1;
   int field4268 = -1;
   class58 field4269;
   int[] field4270;
   int[] field4271;
   short[] field4272;
   public int field4273 = -1;
   int field4274 = -1;
   public static short[] field4275 = new short[256];
   int field4276 = 128;
   int field4277 = -1;
   int field4278 = -1;
   int field4279 = 0;
   int field4280 = 0;
   public int field4281;
   int field4282 = -1;
   public int field4283 = 0;
   class6 field4284;
   public int[] field4285;
   public int field4286 = 0;
   int field4287 = -1;
   public int field4288 = -1;
   public boolean field4289 = false;
   public int field4290 = -1;

   void method2670(int var1) {
   }

   void method2671(InputStream var1, boolean var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.getItemDefinition(var1, var3, var2);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "th.f(" + ')');
      }
   }

   void method2673(ItemDefinition var1, ItemDefinition var2, int var3) {
      try {
         this.field4256 = var1.field4256;
         this.field4230 = var1.field4230;
         this.field4231 = var1.field4231;
         this.field4232 = var1.field4232;
         this.field4233 = var1.field4233;
         this.field4234 = var1.field4234;
         this.field4235 = var1.field4235;
         this.field4272 = var1.field4272;
         this.field4223 = var1.field4223;
         this.field4225 = var1.field4225;
         this.field4228 = var1.field4228;
         this.field4229 = var1.field4229;
         this.name = var2.name;
         this.field4248 = var2.field4248;
         this.field4238 = var2.field4238;
         this.field4221 = 1;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "th.p(" + ')');
      }
   }

   public final class25 method2674(boolean var1, class241 var2, int var3) {
      try {
         int var4;
         int var5;
         int var6;
         if (var1) {
            if (var2 != null && var2.field8376 != null) {
               var4 = var2.field8376[0];
               var5 = var2.field8376[1];
               var6 = var2.field8376[2];
            } else {
               var4 = this.field4265;
               var5 = this.field4264;
               var6 = this.field4259;
            }
         } else if (var2 != null && var2.field8375 != null) {
            var4 = var2.field8375[0];
            var5 = var2.field8375[1];
            var6 = var2.field8375[2];
         } else {
            var4 = this.field4241;
            var5 = this.field4255;
            var6 = this.field4277;
         }

         if (var4 == -1) {
            return null;
         } else {
            class25 var7 = class25.method3454(this.field4269.field2333, var4, 0);
            if (var7 == null) {
               return null;
            } else {
               if (var7.field6462 < 13) {
                  var7.method3458(2);
               }

               if (var5 != -1) {
                  class25 var8 = class25.method3454(this.field4269.field2333, var5, 0);
                  if (var8.field6462 < 13) {
                     var8.method3458(2);
                  }

                  if (var6 != -1) {
                     class25 var9 = class25.method3454(this.field4269.field2333, var6, 0);
                     if (var9.field6462 < 13) {
                        var9.method3458(2);
                     }

                     class25[] var10 = new class25[]{var7, var8, var9};
                     var7 = new class25(var10, 3);
                  } else {
                     class25[] var13 = new class25[]{var7, var8};
                     var7 = new class25(var13, 2);
                  }
               }

               if (!var1 && (this.field4260 != 0 || this.field4262 != 0 || this.field4266 != 0)) {
                  var7.method3456(this.field4260, this.field4262, this.field4266);
               }

               if (var1 && (this.field4261 != 0 || this.field4263 != 0 || this.field4227 != 0)) {
                  var7.method3456(this.field4261, this.field4263, this.field4227);
               }

               short[] var12;
               int var14;
               if (this.field4272 != null) {
                  if (var2 != null && var2.field8379 != null) {
                     var12 = var2.field8379;
                  } else {
                     var12 = this.field4223;
                  }

                  for(var14 = 0; var14 < this.field4272.length; ++var14) {
                     var7.method3459(this.field4272[var14], var12[var14]);
                  }
               }

               if (this.field4228 != null) {
                  if (var2 != null && var2.field8380 != null) {
                     var12 = var2.field8380;
                  } else {
                     var12 = this.field4229;
                  }

                  for(var14 = 0; var14 < this.field4228.length; ++var14) {
                     var7.method3455(this.field4228[var14], var12[var14]);
                  }
               }

               return var7;
            }
         }
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "th.z(" + ')');
      }
   }

   public final class879 method2675(class848 var1, int var2, int var3, class365 var4, Animator var5, int var6, int var7, int var8, int var9, int var10) {
      try {
         int var11;
         if (this.field4270 != null && var3 > 1) {
            var11 = -1;

            for(int var12 = 0; var12 < 10; ++var12) {
               if (var3 >= this.field4271[var12] && this.field4271[var12] != 0) {
                  var11 = this.field4270[var12];
               }
            }

            if (var11 != -1) {
               return this.field4269.method1566(var11).method2675(var1, var2, 1, var4, var5, var6, var7, var8, var9, 2041211835);
            }
         }

         var11 = var2;
         if (var5 != null) {
            var11 = var2 | var5.method2785(-1790708337);
         }

         class1 var13 = this.field4269.field2335;
         class879 var20;
         synchronized(this.field4269.field2335) {
            var20 = (class879)this.field4269.field2335.method2974((long)(this.field4258 | var1.field8580 << 29));
         }

         if (var20 == null || var1.method4836(var20.method5948(), var11) != 0) {
            if (var20 != null) {
               var11 = var1.method4817(var11, var20.method5948());
            }

            int var21 = var11;
            if (this.field4228 != null) {
               var21 = var11 | '耀';
            }

            if (this.field4272 != null || var4 != null) {
               var21 |= 16384;
            }

            if (128 != this.field4276) {
               var21 |= 1;
            }

            if (128 != this.field4276) {
               var21 |= 2;
            }

            if (this.field4276 != 128) {
               var21 |= 4;
            }

            class25 var14 = class25.method3454(this.field4269.field2333, this.field4256, 0);
            int var15;
            if (this.field4258 == 11724) {
               var15 = this.field4256;
               var15 += 0;
            }

            if (var14 == null) {
               return null;
            }

            if (var14.field6462 < 13) {
               var14.method3458(2);
            }

            var20 = var1.method4861(var14, var21, this.field4269.field2332, 64 + this.field4279, this.field4280 + 850);
            if (this.field4276 != 128 || 128 != this.field4219 || 128 != this.field4257) {
               var20.method5955(this.field4276, this.field4219, this.field4257);
            }

            if (this.field4272 != null) {
               for(var15 = 0; var15 < this.field4272.length; ++var15) {
                  if (this.field4225 != null && var15 < this.field4225.length) {
                     var20.method5984(this.field4272[var15], field4275[this.field4225[var15] & 255]);
                  } else {
                     var20.method5984(this.field4272[var15], this.field4223[var15]);
                  }
               }
            }

            if (this.field4228 != null) {
               for(var15 = 0; var15 < this.field4228.length; ++var15) {
                  var20.method5986(this.field4228[var15], this.field4229[var15]);
               }
            }

            if (var4 != null) {
               for(var15 = 0; var15 < 10; ++var15) {
                  for(int var16 = 0; var16 < class365.field2440[var15].length; ++var16) {
                     if (var4.field2443[var15] < class629.field9737[var15][var16].length) {
                        var20.method5984(class365.field2440[var15][var16], class629.field9737[var15][var16][var4.field2443[var15]]);
                     }
                  }
               }
            }

            var20.method5947(var11);
            class1 var22 = this.field4269.field2335;
            synchronized(this.field4269.field2335) {
               this.field4269.field2335.method2984(var20, (long)(this.field4258 | var1.field8580 << 29));
            }
         }

         if (var5 != null || var9 != 0) {
            var20 = var20.method6017((byte)1, var11, true);
            if (var5 != null) {
               var5.method2795(var20, 0, -1330952412);
            }

            if (var9 != 0) {
               var20.method5987(var6, var7, var8, var9);
            }
         }

         var20.method5947(var2);
         return var20;
      } catch (RuntimeException var19) {
         throw class158.method3445(var19, "th.d(" + ')');
      }
   }

   public ItemDefinition method2676(int var1, int var2) {
      try {
         if (this.field4270 != null && var1 > 1) {
            int var3 = -1;

            for(int var4 = 0; var4 < 10; ++var4) {
               if (var1 >= this.field4271[var4] && this.field4271[var4] != 0) {
                  var3 = this.field4270[var4];
               }
            }

            if (-1 != var3) {
               return this.field4269.method1566(var3);
            }
         }

         return this;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "th.u(" + ')');
      }
   }

   int[] method2677(class848 var1, class848 var2, int var3, int var4, int var5, boolean var6, int var7, class727 var8, class365 var9, int var10) {
      try {
         class25 var11 = class25.method3454(this.field4269.field2333, this.field4256, 0);
         if (var11 == null) {
            return null;
         } else {
            if (var11.field6462 < 13) {
               var11.method3458(2);
            }

            int var12;
            if (this.field4272 != null) {
               for(var12 = 0; var12 < this.field4272.length; ++var12) {
                  if (this.field4225 != null && var12 < this.field4225.length) {
                     var11.method3459(this.field4272[var12], field4275[this.field4225[var12] & 255]);
                  } else {
                     var11.method3459(this.field4272[var12], this.field4223[var12]);
                  }
               }
            }

            if (this.field4228 != null) {
               for(var12 = 0; var12 < this.field4228.length; ++var12) {
                  var11.method3455(this.field4228[var12], this.field4229[var12]);
               }
            }

            if (var9 != null) {
               for(var12 = 0; var12 < 10; ++var12) {
                  for(int var13 = 0; var13 < class365.field2440[var12].length; ++var13) {
                     if (var9.field2443[var12] < class629.field9737[var12][var13].length) {
                        var11.method3459(class365.field2440[var12][var13], class629.field9737[var12][var13][var9.field2443[var12]]);
                     }
                  }
               }
            }

            var12 = 2048;
            boolean var24 = false;
            if (this.field4276 != 128 || 128 != this.field4219 || this.field4257 != 128) {
               var24 = true;
               var12 |= 7;
            }

            class879 var14 = var1.method4861(var11, var12, 64, this.field4279 + 64, 768 + this.field4280);
            if (!var14.method5988()) {
               return null;
            } else {
               if (var24) {
                  var14.method5955(this.field4276, this.field4219, this.field4257);
               }

               class48 var15 = null;
               if (-1 != this.field4273) {
                  var15 = this.field4269.method1571(var1, var2, this.field4226, 10, 1, 0, true, true, 0, var8, var9, -1795675060);
                  if (var15 == null) {
                     return null;
                  }
               } else if (this.field4236 != -1) {
                  var15 = this.field4269.method1571(var1, var2, this.field4274, var3, var4, var5, false, true, 0, var8, var9, 1124646536);
                  if (var15 == null) {
                     return null;
                  }
               } else if (-1 != this.field4288) {
                  var15 = this.field4269.method1571(var1, var2, this.field4287, var3, var4, var5, false, true, 0, var8, var9, 311548691);
                  if (var15 == null) {
                     return null;
                  }
               }

               int var16;
               if (var6) {
                  var16 = (int)((double)this.field4230 * 1.5D) << 2;
               } else if (2 == var4) {
                  var16 = (int)((double)this.field4230 * 1.04D) << 2;
               } else {
                  var16 = this.field4230 << 2;
               }

               class344 var17 = var1.method4870();
               class344 var18 = var1.method4860();
               var18.method279(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float)var1.method4800((short)-14576).method2481(), (float)var1.method4800((short)-3255).method2493());
               var1.method5054(var18);
               var1.method5059(0, 0, var1.method4800((short)19509).method2481(), var1.method4800((short)21763).method2493());
               class135 var19 = new class135();
               var1.method4867(var19);
               var1.method5063(0.95F + (float)(Math.random() / 10.0D));
               var1.method4872(16777215, 0.95F + (float)(Math.random() / 10.0D), 0.95F + (float)(Math.random() / 10.0D), -50.0F, -10.0F, -50.0F);
               class135 var20 = var1.method5048();
               var20.method1013(0.0F, 0.0F, 1.0F, class703.method2002(-this.field4233 << 3));
               var20.method1025(0.0F, 1.0F, 0.0F, class703.method2002(this.field4232 << 3));
               var20.method1018((float)(this.field4234 << 2), (float)((class703.field3413[this.field4231 << 3] * var16 >> 14) - var14.method5976() / 2 + (this.field4235 << 2)), (float)((class703.field3404[this.field4231 << 3] * var16 >> 14) + (this.field4235 << 2)));
               var20.method1025(1.0F, 0.0F, 0.0F, class703.method2002(this.field4231 << 3));
               var1.method4831(2, 0);
               var1.method4827();
               var1.method4984(0, 0, 36, 32, 0, 0);
               var14.method5965(var20, (class211)null, 1);
               var1.method5054(var17);
               int[] var21 = var1.method5051(0, 0, 36, 32);
               if (var4 >= 1) {
                  var21 = this.method2678(var21, -16777214, 224723616);
                  if (var4 >= 2) {
                     var21 = this.method2678(var21, -1, 1899522127);
                  }
               }

               if (var5 != 0) {
                  this.method2679(var21, var5, 1738452390);
               }

               if (-1 != this.field4236) {
                  var15.method3128(0, 0);
               } else if (-1 != this.field4288) {
                  var15.method3128(0, 0);
               }

               var1.method4854(var21, 0, 36, 36, 32, -1432690829).method3128(0, 0);
               if (-1 != this.field4273) {
                  var15.method3128(0, 0);
               }

               if (1 == var7 || 2 == var7 && (this.field4221 == 1 || 1 != var3) && var3 != -1) {
                  var8.method1678(class220.method4043(var3, this.field4269.field2338, -2134002342), 0, 9, -256, -16777215, 1072909030);
               }

               var21 = var1.method5051(0, 0, 36, 32);

               for(int var22 = 0; var22 < var21.length; ++var22) {
                  if ((var21[var22] & 16777215) == 0) {
                     var21[var22] = 0;
                  } else {
                     var21[var22] |= -16777216;
                  }
               }

               return var21;
            }
         }
      } catch (RuntimeException var23) {
         throw class158.method3445(var23, "th.x(" + ')');
      }
   }

   int[] method2678(int[] var1, int var2, int var3) {
      try {
         int[] var4 = new int[1152];
         int var5 = 0;

         for(int var6 = 0; var6 < 32; ++var6) {
            for(int var7 = 0; var7 < 36; ++var7) {
               int var8 = var1[var5];
               if (var8 == 0) {
                  if (var7 > 0 && var1[var5 - 1] != 0) {
                     var8 = var2;
                  } else if (var6 > 0 && var1[var5 - 36] != 0) {
                     var8 = var2;
                  } else if (var7 < 35 && var1[1 + var5] != 0) {
                     var8 = var2;
                  } else if (var6 < 31 && var1[var5 + 36] != 0) {
                     var8 = var2;
                  }
               }

               var4[var5++] = var8;
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "th.r(" + ')');
      }
   }

   void method2679(int[] var1, int var2, int var3) {
      try {
         for(int var4 = 31; var4 > 0; --var4) {
            int var5 = var4 * 36;

            for(int var6 = 35; var6 > 0; --var6) {
               if (var1[var6 + var5] == 0 && var1[var5 + var6 - 1 - 36] != 0) {
                  var1[var5 + var6] = var2;
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "th.q(" + ')');
      }
   }

   public final boolean method2680(boolean var1, class241 var2, byte var3) {
      try {
         int var4;
         int var5;
         int var6;
         if (var1) {
            if (var2 != null && var2.field8376 != null) {
               var4 = var2.field8376[0];
               var5 = var2.field8376[1];
               var6 = var2.field8376[2];
            } else {
               var4 = this.field4265;
               var5 = this.field4264;
               var6 = this.field4259;
            }
         } else if (var2 != null && var2.field8375 != null) {
            var4 = var2.field8375[0];
            var5 = var2.field8375[1];
            var6 = var2.field8375[2];
         } else {
            var4 = this.field4241;
            var5 = this.field4255;
            var6 = this.field4277;
         }

         if (-1 == var4) {
            return true;
         } else {
            boolean var7 = true;
            if (!this.field4269.field2333.method3260(var4, 0, -870541215)) {
               var7 = false;
            }

            if (var5 != -1 && !this.field4269.field2333.method3260(var5, 0, -1713048725)) {
               var7 = false;
            }

            if (var6 != -1 && !this.field4269.field2333.method3260(var6, 0, -818152674)) {
               var7 = false;
            }

            return var7;
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "th.s(" + ')');
      }
   }

   public final boolean method2681(boolean var1, class241 var2, byte var3) {
      try {
         int var4;
         int var5;
         if (var1) {
            if (var2 != null && var2.field8378 != null) {
               var4 = var2.field8378[0];
               var5 = var2.field8378[1];
            } else {
               var4 = this.field4268;
               var5 = this.field4282;
            }
         } else if (var2 != null && var2.field8371 != null) {
            var4 = var2.field8371[0];
            var5 = var2.field8371[1];
         } else {
            var4 = this.field4278;
            var5 = this.field4267;
         }

         if (var4 == -1) {
            return true;
         } else {
            boolean var6 = true;
            if (!this.field4269.field2333.method3260(var4, 0, -1403829212)) {
               var6 = false;
            }

            if (-1 != var5 && !this.field4269.field2333.method3260(var5, 0, -1542572465)) {
               var6 = false;
            }

            return var6;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "th.y(" + ')');
      }
   }

   void method2682(ItemDefinition var1, ItemDefinition var2, int var3) {
      try {
         this.field4238 = 0;
         this.field4256 = var1.field4256;
         this.field4230 = var1.field4230;
         this.field4231 = var1.field4231;
         this.field4232 = var1.field4232;
         this.field4233 = var1.field4233;
         this.field4234 = var1.field4234;
         this.field4235 = var1.field4235;
         this.field4272 = var2.field4272;
         this.field4223 = var2.field4223;
         this.field4225 = var2.field4225;
         this.field4228 = var2.field4228;
         this.field4229 = var2.field4229;
         this.name = var2.name;
         this.field4248 = var2.field4248;
         this.field4251 = var2.field4251;
         this.field4290 = var2.field4290;
         this.field4253 = var2.field4253;
         this.field4241 = var2.field4241;
         this.field4255 = var2.field4255;
         this.field4277 = var2.field4277;
         this.field4265 = var2.field4265;
         this.field4264 = var2.field4264;
         this.field4259 = var2.field4259;
         this.field4260 = var2.field4260;
         this.field4261 = var2.field4261;
         this.field4262 = var2.field4262;
         this.field4263 = var2.field4263;
         this.field4266 = var2.field4266;
         this.field4227 = var2.field4227;
         this.field4278 = var2.field4278;
         this.field4267 = var2.field4267;
         this.field4268 = var2.field4268;
         this.field4282 = var2.field4282;
         this.field4217 = var2.field4217;
         this.field4240 = var2.field4240;
         this.field4284 = var2.field4284;
         this.field4221 = var2.field4221;
         this.field4249 = new String[5];
         if (var2.field4249 != null) {
            for(int var4 = 0; var4 < 4; ++var4) {
               this.field4249[var4] = var2.field4249[var4];
            }
         }

         this.field4249[4] = class814.field4777.method2927(this.field4269.field2338, -875414210);
         this.method2691();
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "th.k(" + ')');
      }
   }

   public int method2683(int var1, int var2, int var3) {
      try {
         if (this.field4284 == null) {
            return var2;
         } else {
            class722 var4 = (class722)this.field4284.method2942((long)var1);
            return var4 == null ? var2 : var4.field3631;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "th.h(" + ')');
      }
   }

   void getItemDefinition(InputStream var1, int var2, boolean var3) {
      try {
         if (1 == var2) {
            this.field4256 = var3 ? var1.method6373() : var1.method6423(1235052657);
         } else if (2 == var2) {
            this.name = var1.method6379(1338906243);
         } else if (var2 == 4) {
            this.field4230 = var1.method6374();
         } else if (5 == var2) {
            this.field4231 = var1.method6374();
         } else if (6 == var2) {
            this.field4232 = var1.method6374();
         } else if (7 == var2) {
            this.field4234 = var1.method6374();
            if (this.field4234 > 32767) {
               this.field4234 -= 65536;
            }
         } else if (var2 == 8) {
            this.field4235 = var1.method6374();
            if (this.field4235 > 32767) {
               this.field4235 -= 65536;
            }
         } else if (var2 == 11) {
            this.field4221 = 1;
         } else if (12 == var2) {
            this.field4238 = var1.method6420((byte)-4);
         } else if (var2 == 13) {
            this.field4251 = var1.method6371();
         } else if (14 == var2) {
            this.field4290 = var1.method6371();
         } else if (16 == var2) {
            this.field4248 = true;
         } else if (18 == var2) {
            this.field4237 = var1.method6374();
         } else if (var2 == 23) {
            this.field4241 = var3 ? var1.method6373() : var1.method6423(1235052657);
         } else if (var2 == 24) {
            this.field4255 = var3 ? var1.method6373() : var1.method6423(1235052657);
         } else if (25 == var2) {
            this.field4265 = var3 ? var1.method6373() : var1.method6423(1235052657);
         } else if (26 == var2) {
            this.field4264 = var3 ? var1.method6373() : var1.method6423(1235052657);
         } else if (var2 == 27) {
            this.field4253 = var1.method6371();
         } else if (var2 >= 30 && var2 < 35) {
            this.field4240[var2 - 30] = var1.method6379(2111111360);
         } else if (var2 >= 35 && var2 < 40) {
            this.field4249[var2 - 35] = var1.method6379(-101192414);
            this.method2691();
         } else {
            int var4;
            int var5;
            if (40 == var2) {
               var4 = var1.method6371();
               this.field4272 = new short[var4];
               this.field4223 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field4272[var5] = (short)var1.method6374();
                  this.field4223[var5] = (short)var1.method6374();
               }
            } else if (41 == var2) {
               var4 = var1.method6371();
               this.field4228 = new short[var4];
               this.field4229 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field4228[var5] = (short)var1.method6374();
                  this.field4229[var5] = (short)var1.method6374();
               }
            } else if (var2 == 42) {
               var4 = var1.method6371();
               this.field4225 = new byte[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field4225[var5] = var1.method6372(-12558881);
               }
            } else if (43 == var2) {
               this.field4281 = var1.method6420((byte)6);
               this.field4289 = true;
            } else if (65 == var2) {
               this.field4252 = true;
            } else if (78 == var2) {
               this.field4277 = var3 ? var1.method6373() : var1.method6423(1235052657);
            } else if (var2 == 79) {
               this.field4259 = var3 ? var1.method6373() : var1.method6423(1235052657);
            } else if (var2 == 90) {
               this.field4278 = var3 ? var1.method6373() : var1.method6423(1235052657);
            } else if (var2 == 91) {
               this.field4268 = var3 ? var1.method6373() : var1.method6423(1235052657);
            } else if (var2 == 92) {
               this.field4267 = var3 ? var1.method6373() : var1.method6423(1235052657);
            } else if (93 == var2) {
               this.field4282 = var3 ? var1.method6373() : var1.method6423(1235052657);
            } else if (95 == var2) {
               this.field4233 = var1.method6374();
            } else if (96 == var2) {
               this.field4283 = var1.method6371();
            } else if (var2 == 97) {
               this.field4226 = var1.method6374();
            } else if (98 == var2) {
               this.field4273 = var1.method6374();
            } else if (var2 >= 100 && var2 < 110) {
               if (this.field4270 == null) {
                  this.field4270 = new int[10];
                  this.field4271 = new int[10];
               }

               this.field4270[var2 - 100] = var1.method6374();
               this.field4271[var2 - 100] = var1.method6374();
            } else if (var2 == 110) {
               this.field4276 = var1.method6374();
            } else if (111 == var2) {
               this.field4219 = var1.method6374();
            } else if (var2 == 112) {
               this.field4257 = var1.method6374();
            } else if (var2 == 113) {
               this.field4279 = var1.method6372(-12558881);
            } else if (var2 == 114) {
               this.field4280 = var1.method6372(-12558881) * 5;
            } else if (115 == var2) {
               this.field4217 = var1.method6371();
            } else if (121 == var2) {
               this.field4274 = var1.method6374();
            } else if (122 == var2) {
               this.field4236 = var1.method6374();
            } else if (var2 == 125) {
               this.field4260 = var1.method6372(-12558881) << 2;
               this.field4262 = var1.method6372(-12558881) << 2;
               this.field4266 = var1.method6372(-12558881) << 2;
            } else if (var2 == 126) {
               this.field4261 = var1.method6372(-12558881) << 2;
               this.field4263 = var1.method6372(-12558881) << 2;
               this.field4227 = var1.method6372(-12558881) << 2;
            } else if (var2 == 127) {
               this.field4246 = var1.method6371();
               this.field4242 = var1.method6374();
            } else if (128 == var2) {
               this.field4247 = var1.method6371();
               this.field4220 = var1.method6374();
            } else if (129 == var2) {
               this.field4254 = var1.method6371();
               this.field4244 = var1.method6374();
            } else if (var2 == 130) {
               this.field4239 = var1.method6371();
               this.field4245 = var1.method6374();
            } else if (132 == var2) {
               var4 = var1.method6371();
               this.field4285 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field4285[var5] = var1.method6374();
               }
            } else if (134 == var2) {
               this.field4286 = var1.method6371();
            } else if (139 == var2) {
               this.field4287 = var1.method6374();
            } else if (var2 == 140) {
               this.field4288 = var1.method6374();
            } else if (249 == var2) {
               var4 = var1.method6371();
               if (this.field4284 == null) {
                  var5 = class18.method3687(var4, (byte)16);
                  this.field4284 = new class6(var5);
               }

               for(var5 = 0; var5 < var4; ++var5) {
                  boolean var6 = var1.method6371() == 1;
                  int var7 = var1.method6390((byte)15);
                  Object var8;
                  if (var6) {
                     var8 = new class437(var1.method6379(-1208778402));
                  } else {
                     var8 = new class722(var1.method6420((byte)69));
                  }

                  this.field4284.method2947((class568)var8, (long)var7);
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "th.b(" + ')');
      }
   }

   void method2685(ItemDefinition var1, ItemDefinition var2, int var3) {
      try {
         this.field4238 = 0;
         this.field4256 = var1.field4256;
         this.field4230 = var1.field4230;
         this.field4231 = var1.field4231;
         this.field4232 = var1.field4232;
         this.field4233 = var1.field4233;
         this.field4234 = var1.field4234;
         this.field4235 = var1.field4235;
         this.field4272 = var2.field4272;
         this.field4223 = var2.field4223;
         this.field4225 = var2.field4225;
         this.field4228 = var2.field4228;
         this.field4229 = var2.field4229;
         this.name = var2.name;
         this.field4248 = var2.field4248;
         this.field4251 = var2.field4251;
         this.field4290 = var2.field4290;
         this.field4253 = var2.field4253;
         this.field4241 = var2.field4241;
         this.field4255 = var2.field4255;
         this.field4277 = var2.field4277;
         this.field4265 = var2.field4265;
         this.field4264 = var2.field4264;
         this.field4259 = var2.field4259;
         this.field4260 = var2.field4260;
         this.field4261 = var2.field4261;
         this.field4262 = var2.field4262;
         this.field4263 = var2.field4263;
         this.field4266 = var2.field4266;
         this.field4227 = var2.field4227;
         this.field4278 = var2.field4278;
         this.field4267 = var2.field4267;
         this.field4268 = var2.field4268;
         this.field4282 = var2.field4282;
         this.field4217 = var2.field4217;
         this.field4240 = var2.field4240;
         this.field4284 = var2.field4284;
         this.field4249 = new String[5];
         if (var2.field4249 != null) {
            for(int var4 = 0; var4 < 4; ++var4) {
               this.field4249[var4] = var2.field4249[var4];
            }
         }

         this.field4249[4] = class814.field4729.method2927(this.field4269.field2338, -875414210);
         this.method2691();
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "th.i(" + ')');
      }
   }

   public final class25 method2686(boolean var1, class241 var2, int var3) {
      try {
         int var4;
         int var5;
         if (var1) {
            if (var2 != null && var2.field8378 != null) {
               var4 = var2.field8378[0];
               var5 = var2.field8378[1];
            } else {
               var4 = this.field4268;
               var5 = this.field4282;
            }
         } else if (var2 != null && var2.field8371 != null) {
            var4 = var2.field8371[0];
            var5 = var2.field8371[1];
         } else {
            var4 = this.field4278;
            var5 = this.field4267;
         }

         if (-1 == var4) {
            return null;
         } else {
            class25 var6 = class25.method3454(this.field4269.field2333, var4, 0);
            if (var6.field6462 < 13) {
               var6.method3458(2);
            }

            if (-1 != var5) {
               class25 var7 = class25.method3454(this.field4269.field2333, var5, 0);
               if (var7.field6462 < 13) {
                  var7.method3458(2);
               }

               class25[] var8 = new class25[]{var6, var7};
               var6 = new class25(var8, 2);
            }

            short[] var10;
            int var11;
            if (this.field4272 != null) {
               if (var2 != null && var2.field8379 != null) {
                  var10 = var2.field8379;
               } else {
                  var10 = this.field4223;
               }

               for(var11 = 0; var11 < this.field4272.length; ++var11) {
                  var6.method3459(this.field4272[var11], var10[var11]);
               }
            }

            if (this.field4228 != null) {
               if (var2 != null && var2.field8380 != null) {
                  var10 = var2.field8380;
               } else {
                  var10 = this.field4229;
               }

               for(var11 = 0; var11 < this.field4228.length; ++var11) {
                  var6.method3455(this.field4228[var11], var10[var11]);
               }
            }

            return var6;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "th.t(" + ')');
      }
   }

   public String method2687(int var1, String var2, short var3) {
      try {
         if (this.field4284 == null) {
            return var2;
         } else {
            class437 var4 = (class437)this.field4284.method2942((long)var1);
            return var4 == null ? var2 : (String)var4.field7515;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "th.v(" + ')');
      }
   }

   static final void method2688(int var0, int var1, int var2) {
      try {
         if (class491.field7808 < class491.field7809) {
            class491.field7808 = (float)((double)class491.field7808 + (double)class491.field7808 / 30.0D);
            if (class491.field7808 > class491.field7809) {
               class491.field7808 = class491.field7809;
            }

            class640.method6191(65536);
            class491.field7829 = (int)class491.field7808 >> 1;
            class491.field7804 = class470.method4592(class491.field7829, 818170582);
         } else if (class491.field7808 > class491.field7809) {
            class491.field7808 = (float)((double)class491.field7808 - (double)class491.field7808 / 30.0D);
            if (class491.field7808 < class491.field7809) {
               class491.field7808 = class491.field7809;
            }

            class640.method6191(65536);
            class491.field7829 = (int)class491.field7808 >> 1;
            class491.field7804 = class470.method4592(class491.field7829, 1742182898);
         }

         if (class740.field3206 != -1 && -1 != class740.field3201) {
            int var3 = class740.field3206 - class896.field9358;
            if (var3 < 2 || var3 > 2) {
               var3 /= 8;
            }

            int var4 = class740.field3201 - class747.field4148;
            if (var4 < 2 || var4 > 2) {
               var4 /= 8;
            }

            class896.field9358 += var3;
            class747.field4148 += var4;
            if (var3 == 0 && var4 == 0) {
               class740.field3206 = -1;
               class740.field3201 = -1;
            }

            class640.method6191(65536);
         }

         if (class10.field6652 > 0) {
            --class622.field9010;
            if (class622.field9010 == 0) {
               --class10.field6652;
               class622.field9010 = 100;
            }
         } else {
            class740.field3207 = -1;
            class740.field3204 = -1;
         }

         if (class740.field3202 && class439.field7537 != null) {
            for(class960 var6 = (class960)class439.field7537.method901(1766612795); var6 != null; var6 = (class960)class439.field7537.method906(49146)) {
               class718 var7 = class491.field7826.method5091(var6.field3646.field5396, -1186797555);
               if (var6.method2211(var0, var1, (byte)19)) {
                  if (var7.field3493 != null) {
                     if (var7.field3493[4] != null) {
                        class984.method1875(var7.field3493[4], var7.field3504, -1, 1012, -1, (long)var6.field3646.field5396, var7.field3532, 0, true, false, (long)var6.field3646.field5396, false, -1324353170);
                     }

                     if (var7.field3493[3] != null) {
                        class984.method1875(var7.field3493[3], var7.field3504, -1, 1011, -1, (long)var6.field3646.field5396, var7.field3532, 0, true, false, (long)var6.field3646.field5396, false, -1509752920);
                     }

                     if (var7.field3493[2] != null) {
                        class984.method1875(var7.field3493[2], var7.field3504, -1, 1010, -1, (long)var6.field3646.field5396, var7.field3532, 0, true, false, (long)var6.field3646.field5396, false, -1074248386);
                     }

                     if (var7.field3493[1] != null) {
                        class984.method1875(var7.field3493[1], var7.field3504, -1, 1009, -1, (long)var6.field3646.field5396, var7.field3532, 0, true, false, (long)var6.field3646.field5396, false, -1424985903);
                     }

                     if (var7.field3493[0] != null) {
                        class984.method1875(var7.field3493[0], var7.field3504, -1, 1008, -1, (long)var6.field3646.field5396, var7.field3532, 0, true, false, (long)var6.field3646.field5396, false, -2019134484);
                     }
                  }

                  if (!var6.field3646.field5399) {
                     var6.field3646.field5399 = true;
                     class574.method131(class112.field2122, var6.field3646.field5396, var7.field3532, 20917601);
                  }

                  if (var6.field3646.field5399) {
                     class574.method131(class112.field2116, var6.field3646.field5396, var7.field3532, -1586023399);
                  }
               } else if (var6.field3646.field5399) {
                  var6.field3646.field5399 = false;
                  class574.method131(class112.field2113, var6.field3646.field5396, var7.field3532, -1187185253);
               }
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "th.bz(" + ')');
      }
   }

   public static int method2689(int var0, int var1, int var2) {
      try {
         if (class6.field4931.field9526 == -1) {
            return 1;
         } else {
            if (var0 != class615.field8903.field9137.method3689(-2106508116)) {
               class416.method5649(var0, class814.field4663.method2927(class321.field1066, -875414210), true, (byte)53);
               if (class615.field8903.field9137.method3689(-1001808225) != var0) {
                  return -1;
               }
            }

            int var15;
            try {
               Dimension var3 = class837.field9161.getSize();
               class971.method1789(class814.field4663.method2927(class321.field1066, -875414210), true, class593.field1623, class958.field3479, class378.field1158, (byte)5);
               class25 var4 = class25.method3454(class389.field1524, class6.field4931.field9526, 0);
               long var5 = class27.method3468((byte)1);
               class593.field1623.method4827();
               class730.field2853.method1016(0.0F, 256.0F, 0.0F);
               class593.field1623.method4867(class730.field2853);
               class344 var7 = class593.field1623.method4860();
               var7.method279((float)(var3.width / 2), (float)(var3.height / 2), 512.0F, 512.0F, (float)class730.field2697.method5276((byte)-121), (float)class730.field2697.method5277(1789119116), (float)var3.width, (float)var3.height);
               class593.field1623.method5054(var7);
               class593.field1623.method5063(1.0F);
               class593.field1623.method4872(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
               class879 var8 = class593.field1623.method4861(var4, 2048, 64, 64, 768);
               int var9 = 0;

               label54:
               for(int var10 = 0; var10 < 500; ++var10) {
                  class593.field1623.method4831(3, 0);

                  for(int var11 = 15; var11 >= 0; --var11) {
                     for(int var12 = 0; var12 <= var11; ++var12) {
                        class730.field2950.method1016((float)((int)(512.0F * ((float)var12 - (float)var11 / 2.0F))), 0.0F, (float)((1 + var11) * 512));
                        var8.method5965(class730.field2950, (class211)null, 0);
                        ++var9;
                        if (class27.method3468((byte)1) - var5 >= (long)var1) {
                           if (var2 >= 1017103058) {
                              throw new IllegalStateException();
                           }
                           break label54;
                        }
                     }
                  }
               }

               class593.field1623.method4909();
               long var13 = (long)(var9 * 1000) / (class27.method3468((byte)1) - var5);
               class593.field1623.method4831(3, 0);
               var15 = (int)var13;
            } catch (Throwable var16) {
               var16.printStackTrace();
               return -1;
            }

            return var15;
         }
      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "th.gt(" + ')');
      }
   }

   public String method2690(int var1) {
      return class730.field2618 ? this.field4250[var1] : this.field4249[var1];
   }

   public void method2691() {
      this.field4250 = new String[]{"Drop", this.field4249[0], this.field4249[1], this.field4249[2], this.field4249[3]};
   }
}
