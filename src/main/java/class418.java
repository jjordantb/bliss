public class class418 {
   class5 field9553;
   static int field9554 = 615272440;
   long field9555 = 0L;
   static float field9556 = 0.69921875F;
   static float field9557 = 1.2F;
   static int field9558 = -50;
   static int field9559 = -60;
   static int field9560 = -50;
   static int field9561 = 0;
   static float field9562 = 1.1523438F;
   static int field9563 = -816669807;
   class848 field9564;
   class5[][] field9565;
   int field9566 = 0;
   int field9567 = -1117911945;
   public static int[] field9568;
   class32 field9569 = new class32(-50.0F, -60.0F, -50.0F);
   class5 field9570;
   class5 field9571;
   class5 field9572;
   static int field9573 = 1373663905;
   class1 field9574 = new class1(8);
   boolean field9575 = false;
   class1 field9576 = new class1(8);

   public class418(class848 var1, int var2, int var3) {
      this.field9564 = var1;
      this.field9565 = new class5[var2][var3];
      if (field9568 != null) {
         class842.field9213 = this.method5678(field9568[0], field9568[1], field9568[2], field9568[3], field9568[4], field9568[5], 2001255265);
      }

      class474.field8270 = null;
      this.field9570 = new class5();
      this.field9571 = new class5();
      this.field9553 = new class5();
      this.field9572 = new class5();
      this.method5673(-1545496874);
   }

   public class5 method5665(byte var1) {
      try {
         return this.field9571;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pd.f(" + ')');
      }
   }

   public void method5666(byte var1) {
      try {
         this.field9574.method2977();
         this.field9576.method2977();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pd.p(" + ')');
      }
   }

   void method5667(byte var1) {
      try {
         this.field9564.method5063((0.7F + (float)class615.field8903.field9118.method5874(-712203354) * 0.1F + Client.field2697.method5275(2016671740)) * this.field9571.field4933);
         this.field9564.method4872(-1951302757 * this.field9571.field4936, this.field9571.field4934, this.field9571.field4940, (float)((int)this.field9569.field5296 << 2), (float)((int)this.field9569.field5300 << 2), (float)((int)this.field9569.field5299 << 2));
         this.field9564.method4950(this.field9571.field4939);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pd.s(" + ')');
      }
   }

   public void method5668(int var1, int var2, class5 var3, byte var4) {
      try {
         this.field9565[var1][var2] = var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "pd.d(" + ')');
      }
   }

   public void method5669(byte var1) {
      try {
         for(int var2 = 0; var2 < this.field9565.length; ++var2) {
            for(int var3 = 0; var3 < this.field9565[var2].length; ++var3) {
               this.field9565[var2][var3] = this.field9570;
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pd.u(" + ')');
      }
   }

   public void method5670(int var1, int var2, int var3) {
      try {
         class5 var4 = this.field9565[var1][var2];
         if (var4 != null) {
            this.field9569.method3298(var4.field4932);
         }

         this.method5667((byte)-41);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pd.x(" + ')');
      }
   }

   void method5671(int var1, int var2, int var3, int var4) {
      try {
         class5 var5 = this.field9565[var1][var2];
         if (var5 == null) {
            var5 = this.field9570;
         }

         if (this.field9575) {
            this.field9575 = false;
            var3 = 0;
         }

         if (!this.field9572.method2953(var5, -759773054)) {
            this.field9572.method2949(var5, (byte)-51);
            this.field9555 = class27.method3468((byte)1) * 858881257410153067L;
            this.field9566 = (this.field9567 = 1117911945 * var3) * -2145126213;
            if (913546523 * this.field9566 != 0) {
               this.field9553.method2949(this.field9571, (byte)-80);
               if (this.field9571.field4943 != null) {
                  if (this.field9571.field4943.method2356((byte)-18)) {
                     this.field9571.field4943 = this.field9553.field4943 = this.field9571.field4943.method2357(1076468319);
                  }

                  if (this.field9571.field4943 != null && this.field9572.field4943 != this.field9571.field4943) {
                     this.field9571.field4943.method2354(this.field9572.field4943, -583959548);
                  }
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "pd.r(" + ')');
      }
   }

   public void method5672(class623 var1, int var2) {
      try {
         if (!class162.method3544(-1233866115 * Client.field2733, 2068577506) && !class669.method4121(-1233866115 * Client.field2733, 1765230881)) {
            int var3 = -1;
            int var4 = -1;
            if (class923.field10295 != null) {
               var3 = class923.field10295.field4085[0] >> 3;
               var4 = class923.field10295.field4055[0] >> 3;
            }

            if (var3 >= 0 && var3 < var1.method5271(-2064159072) >> 3 && var4 >= 0 && var4 < var1.method5272(-1098820218) >> 3) {
               this.method5671(var3, var4, field9563 * -450037889, -908271345);
            } else {
               this.method5671(var1.method5271(-1944264656) >> 4, var1.method5272(211843254) >> 4, 0, -1158726222);
            }
         } else {
            this.method5671(class103.field205 * -1740717447 >> 12, -299812095 * class7.field4918 >> 12, field9563 * -450037889, -1055017698);
         }

         this.method5679(828656850);
         this.method5667((byte)67);
         this.method5674(394959545);
         this.method5680((byte)7);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pd.a(" + ')');
      }
   }

   public void method5673(int var1) {
      try {
         this.field9575 = true;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pd.n(" + ')');
      }
   }

   void method5674(int var1) {
      try {
         this.field9564.method5018(this.field9571.field4935, this.field9571.field4942, this.field9571.field4941, -1795302913);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pd.y(" + ')');
      }
   }

   public void method5675(byte var1) {
      try {
         this.field9564.method5063((0.7F + (float)class615.field8903.field9118.method5874(-1693044274) * 0.1F + Client.field2697.method5275(1910914073)) * 1.1523438F);
         this.field9564.method4872(field9573 * 332664479, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
         this.field9564.method4874(field9554 * -1971415573, -1, 0);
         this.field9564.method4950(class842.field9213);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pd.t(" + ')');
      }
   }

   public void method5676(class418 var1, int var2) {
      try {
         this.field9571.method2949(var1.field9571, (byte)37);
         this.field9553.method2949(var1.field9553, (byte)-76);
         this.field9572.method2949(var1.field9572, (byte)34);
         this.field9555 = var1.field9555 * 1L;
         this.field9566 = 1 * var1.field9566;
         this.field9567 = var1.field9567 * 1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pd.b(" + ')');
      }
   }

   class544 method5677(int var1, int var2, int var3, int var4, short var5) {
      try {
         long var6 = ((long)var2 & 65535L) << 48 | ((long)var3 & 65535L) << 32 | ((long)var4 & 65535L) << 16 | (long)var1 & 65535L;
         class544 var8 = (class544)this.field9576.method2974(var6);
         if (var8 == null) {
            var8 = class490.field7866.method3405(var1, var2, var3, var4, class527.field3690, (byte)-51);
            this.field9576.method2984(var8, var6);
         }

         return var8;
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "pd.k(" + ')');
      }
   }

   class621 method5678(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         long var8 = 67481L * (long)var1 ^ (long)var2 * 97549L ^ 475427L * (long)var3 ^ (long)var4 * 986053L ^ (long)var5 * 32147369L ^ (long)var6 * 76724863L;
         class621 var10 = (class621)this.field9574.method2974(var8);
         if (var10 != null) {
            return var10;
         } else {
            var10 = this.field9564.method4851(var1, var2, var3, var4, var5, var6);
            this.field9574.method2984(var10, var8);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "pd.i(" + ')');
      }
   }

   void method5679(int var1) {
      try {
         if (this.field9567 * -1051268423 >= 0) {
            long var2 = class27.method3468((byte)1);
            this.field9567 = (int)((long)this.field9567 - (var2 - 5777556104771211843L * this.field9555) * 1117911945L);
            if (-1051268423 * this.field9567 > 0) {
               this.field9571.method2950(this.field9564, this.field9553, this.field9572, (float)(913546523 * this.field9566 - this.field9567 * -1051268423) / (float)(913546523 * this.field9566), 937279263);
            } else {
               this.field9571.method2949(this.field9572, (byte)-42);
               if (this.field9571.field4943 != null) {
                  this.field9571.field4943.method2355((byte)-128);
               }

               this.field9567 = -1117911945;
            }

            this.field9555 = 858881257410153067L * var2;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pd.q(" + ')');
      }
   }

   public void method5680(byte var1) {
      try {
         byte var2 = 0;
         int var3 = var2 + (this.field9571.field4938 * -1939701499 + 256 << 2);
         this.field9564.method4874(this.field9571.field4937 * -1269717659, class615.field8903.field9122.method2653(1323547629) == 1 ? var3 : -1, 0);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pd.z(" + ')');
      }
   }

   static final void method5681(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[(var0.field3158 -= 969361751) * -203050393];
         class684 var3 = class423.method5712((short)512);
         class701 var4 = class637.method5936(class643.field10003, var3.field7765, (byte)109);
         var4.field3364.method6361(0);
         int var5 = 385051775 * var4.field3364.field10376;
         var4.field3364.method6366(var2, 2120587039);
         var4.field3364.method6362(var0.field3160.field6482 * -2034569943, 16711935);
         var0.field3160.field6483.method6656(var4.field3364, var0.field3160.field6484, 535185989);
         var4.field3364.method6426(var4.field3364.field10376 * 385051775 - var5, (byte)-99);
         var3.method4380(var4, (byte)-26);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "pd.acd(" + ')');
      }
   }

   static final void method5682(class744 var0, int var1) {
      try {
         class82.method920(false, (byte)38);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pd.ahb(" + ')');
      }
   }

   public static boolean method5683(char var0, int var1) {
      try {
         return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pd.s(" + ')');
      }
   }

   static final void method5684(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class458.method3830(var3, var4, var0, -1905856494);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pd.ir(" + ')');
      }
   }

   public static class235 method5685(int var0) {
      try {
         return class904.field10356 == null ? class235.field8247 : class904.field10356;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "pd.d(" + ')');
      }
   }
}
