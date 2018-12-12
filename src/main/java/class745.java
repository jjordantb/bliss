public class class745 {
   int field4104;
   int field4105 = -48388469;
   int field4106;
   public int field4107 = -761293581;
   short[] field4108;
   short[] field4109;
   short[] field4110;
   short[] field4111;
   class382 field4112;
   int field4113 = -2062770560;
   int field4114 = 0;
   int field4115 = 0;
   int field4116 = 0;
   public boolean field4117 = false;
   public byte field4118 = 0;
   int field4119 = -1498254464;

   void method2588(class907 var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               if (var2 == -1) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method2589(var1, var3, 84112235);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qm.a(" + ')');
      }
   }

   void method2589(class907 var1, int var2, int var3) {
      try {
         if (1 == var2) {
            this.field4106 = var1.method6423(1235052657) * 422607467;
         } else if (var2 == 2) {
            this.field4107 = var1.method6423(1235052657) * 761293581;
         } else if (4 == var2) {
            this.field4119 = var1.method6374() * -1420991257;
         } else if (var2 == 5) {
            this.field4113 = var1.method6374() * -586540739;
         } else if (var2 == 6) {
            this.field4114 = var1.method6374() * -79411937;
         } else if (7 == var2) {
            this.field4115 = var1.method6371() * 1905965041;
         } else if (8 == var2) {
            this.field4116 = var1.method6371() * -241990007;
         } else if (9 == var2) {
            this.field4118 = 3;
            this.field4105 = -1485189472;
         } else if (10 == var2) {
            this.field4117 = true;
         } else if (var2 == 11) {
            this.field4118 = 1;
         } else if (12 == var2) {
            this.field4118 = 4;
         } else if (var2 == 13) {
            this.field4118 = 5;
         } else if (14 == var2) {
            this.field4118 = 2;
            this.field4105 = var1.method6371() * -497453824;
         } else if (var2 == 15) {
            this.field4118 = 3;
            this.field4105 = var1.method6374() * 48388469;
         } else if (16 == var2) {
            this.field4118 = 3;
            this.field4105 = var1.method6420((byte)52) * 48388469;
         } else {
            int var4;
            int var5;
            if (40 == var2) {
               var4 = var1.method6371();
               this.field4108 = new short[var4];
               this.field4109 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field4108[var5] = (short)var1.method6374();
                  this.field4109[var5] = (short)var1.method6374();
               }
            } else if (41 == var2) {
               var4 = var1.method6371();
               this.field4110 = new short[var4];
               this.field4111 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field4110[var5] = (short)var1.method6374();
                  this.field4111[var5] = (short)var1.method6374();
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "qm.f(" + ')');
      }
   }

   public final class879 method2590(class848 var1, int var2, class765 var3, byte var4, int var5) {
      try {
         return this.method2591(var1, var2, false, (class454)null, (class454)null, 0, 0, 0, var3, var4, 1256553464);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "qm.b(" + ')');
      }
   }

   public final class879 method2591(class848 var1, int var2, boolean var3, class454 var4, class454 var5, int var6, int var7, int var8, class765 var9, byte var10, int var11) {
      try {
         int var12 = var2;
         var3 &= this.field4118 != 0;
         if (var9 != null) {
            var12 = var2 | var9.method2785(-1790708337);
         }

         if (var3) {
            var12 |= this.field4118 == 3 ? 7 : 2;
         }

         if (this.field4113 * -64059883 != 128) {
            var12 |= 2;
         }

         if (128 != this.field4119 * -1869386025 || this.field4114 * -614140193 != 0) {
            var12 |= 5;
         }

         class1 var13 = this.field4112.field1407;
         class879 var14;
         synchronized(this.field4112.field1407) {
            var14 = (class879)this.field4112.field1407.method2974((long)((this.field4104 = 1757755963 * (-559444237 * this.field4104 | var1.field8580 * 580915349 << 29)) * -559444237));
         }

         if (var14 == null || var1.method4836(var14.method5948(), var12) != 0) {
            if (var14 != null) {
               var12 = var1.method4817(var12, var14.method5948());
            }

            int var20 = var12;
            if (this.field4108 != null) {
               var20 = var12 | 16384;
            }

            if (this.field4110 != null) {
               var20 |= 32768;
            }

            class25 var15 = class25.method3454(this.field4112.field1405, this.field4106 * -283549117, 0);
            if (var15 == null) {
               return null;
            }

            if (var15.field6462 < 13) {
               var15.method3458(2);
            }

            var14 = var1.method4861(var15, var20, -258957271 * this.field4112.field1408, 64 + -2043193071 * this.field4115, 850 + 1459867577 * this.field4116);
            int var16;
            if (this.field4108 != null) {
               for(var16 = 0; var16 < this.field4108.length; ++var16) {
                  var14.method5984(this.field4108[var16], this.field4109[var16]);
               }
            }

            if (this.field4110 != null) {
               for(var16 = 0; var16 < this.field4110.length; ++var16) {
                  var14.method5986(this.field4110[var16], this.field4111[var16]);
               }
            }

            var14.method5947(var12);
            class1 var22 = this.field4112.field1407;
            synchronized(this.field4112.field1407) {
               this.field4112.field1407.method2984(var14, (long)((this.field4104 = (this.field4104 * -559444237 | 580915349 * var1.field8580 << 29) * 1757755963) * -559444237));
            }
         }

         class879 var21 = var14.method6017(var10, var12, true);
         if (var9 != null) {
            var9.method2795(var21, 0, -400006457);
         }

         if (-1869386025 * this.field4119 != 128 || this.field4113 * -64059883 != 128) {
            var21.method5955(-1869386025 * this.field4119, this.field4113 * -64059883, -1869386025 * this.field4119);
         }

         if (-614140193 * this.field4114 != 0) {
            if (this.field4114 * -614140193 == 90) {
               var21.method6016(4096);
            }

            if (-614140193 * this.field4114 == 180) {
               var21.method6016(8192);
            }

            if (270 == -614140193 * this.field4114) {
               var21.method6016(12288);
            }
         }

         if (var3) {
            var21.method5961(this.field4118, 167177949 * this.field4105, var4, var5, var6, var7, var8);
         }

         var21.method5947(var2);
         return var21;
      } catch (RuntimeException var19) {
         throw class158.method3445(var19, "qm.p(" + ')');
      }
   }

   public final boolean method2592(byte var1) {
      try {
         return this.field4106 * -283549117 == -1 ? true : this.field4112.field1405.method3260(-283549117 * this.field4106, 0, -676484272);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qm.i(" + ')');
      }
   }

   static boolean method2593(int var0, short var1) {
      try {
         if (var0 != 18 && 19 != var0 && 20 != var0 && var0 != 21 && 22 != var0 && 1004 != var0) {
            return 17 == var0;
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qm.bo(" + ')');
      }
   }

   public static boolean method2594(char var0, int var1) {
      try {
         if ((var0 <= 0 || var0 >= '\u0080') && (var0 < ' ' || var0 > 'ÿ')) {
            if (var0 != 0) {
               char[] var2 = class519.field4212;

               for(int var3 = 0; var3 < var2.length; ++var3) {
                  char var4 = var2[var3];
                  if (var4 == var0) {
                     return true;
                  }
               }
            }

            return false;
         } else {
            return true;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qm.f(" + ')');
      }
   }

   public static final void method2595(String var0, int var1) {
      try {
         if (class776.field3731 != null) {
            class684 var2 = class423.method5712((short)512);
            class701 var3 = class637.method5936(class643.field10004, var2.field7765, (byte)6);
            var3.field3364.method6361(class305.method372(var0, 1482909411));
            var3.field3364.method6366(var0, 2132300359);
            var2.method4380(var3, (byte)-58);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qm.mr(" + ')');
      }
   }

   static final void method2596(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (var2 >= 1 && var3 >= 1 && var2 <= Client.field2697.method5271(-1936425983) - 2 && var3 <= Client.field2697.method5272(-1245034974) - 2) {
            int var9 = var0;
            if (var0 < 3 && Client.field2697.method5296(511320643).method3386(var2, var3, 549965572)) {
               var9 = var0 + 1;
            }

            if (Client.field2697.method5317(-1611682495) != null) {
               Client.field2697.method5286(-1368274969).method97(class593.field1623, var0, var1, var2, var3, Client.field2697.method5281(var0), 366084983);
               if (var4 >= 0) {
                  int var10 = class615.field8903.field9113.method971(-810781268);
                  class615.field8903.method5391(class615.field8903.field9113, 1, 650835797);
                  Client.field2697.method5286(-630573167).method106(class593.field1623, var9, var0, var2, var3, var4, var5, var6, Client.field2697.method5281(var0), var7, 2073430416);
                  class615.field8903.method5391(class615.field8903.field9113, var10, 631929348);
               }
            }
         }

      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "qm.d(" + ')');
      }
   }

   public static int method2597(CharSequence var0, int var1, byte var2) {
      try {
         return class535.method2280(var0, var1, true, -566000595);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qm.k(" + ')');
      }
   }

   static final void method2598(class744 var0, int var1) {
      try {
         class615.field8903.method5391(class615.field8903.field9139, var0.field3161[(var0.field3156 -= -391880689) * 681479919] != 0 ? 1 : 0, -856880407);
         class95.method523(656179282);
         Client.field2697.method5309(1778418334);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qm.aip(" + ')');
      }
   }
}
