public final class class283 {
   int field10607;
   int[] field10608;
   static int field10609 = 25;
   public int field10610;
   class60 field10611 = null;
   class946 field10612 = null;
   public boolean field10613 = false;
   public static class193 field10614;

   class283(class907 var1, int var2) {
      this.field10607 = var2 * 1288449687;
      int var3 = var1.method6371();
      switch(var3) {
      case 0:
         this.field10610 = var1.method6423(1235052657) * -44295909;
         break;
      case 1:
         this.field10610 = 44295909;
         break;
      default:
         this.field10610 = 44295909;
      }

      var1.method6379(-494050654);
   }

   public class746 method6636(int var1) {
      try {
         return (class746)(this.field10611 != null ? this.field10611 : this.field10612);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "dv.p(" + ')');
      }
   }

   void method6637(byte var1) {
      try {
         this.field10611 = null;
         this.field10612 = null;
         this.field10613 = false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "dv.f(" + ')');
      }
   }

   void method6638(int var1, int var2, int var3, int var4) {
      try {
         if (this.field10611 != null) {
            this.field10611.method1240(var1, var2, var3, true, this.field10611.method2550(), (byte)21);
         } else {
            this.field10612.field3639 = this.field10612.field3640 = (byte)var1;
            this.field10612.method1995(var2, var3, -1945697758);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "dv.b(" + ')');
      }
   }

   void method6639(int var1, int var2, int var3, int var4, int var5) {
      try {
         if (!this.field10613) {
            this.field10613 = true;
            if (1762367763 * this.field10610 >= 0) {
               this.field10611 = new class60(Client.field2697.method5317(-1611682495), 25);
               this.field10611.field4028 = this.field10607 * 302956801;
               this.field10611.field4039 = Client.field2866 * -128551287;
               this.field10611.method1248(class258.field7913.method12(this.field10610 * 1762367763, 1863267717), 2139515630);
               this.field10611.method2549(-2095128707 * this.field10611.field1637.field9923, -1254496694);
               this.field10611.field4079 = -1186616623 * (this.field10611.field1637.field9917 * -1927065533 << 3);
               this.field10611.field4035 = ((class949.field3331 += 2029434363) * -132903629 - 1) * -689024993;
            } else {
               this.field10612 = new class946(Client.field2697.method5317(-1611682495), 25);
               this.field10612.method1990(class665.field9597, (byte)3);
               this.field10612.field4028 = 302956801 * this.field10607;
               this.field10612.field4039 = -128551287 * Client.field2866;
               this.field10612.field4035 = ((class949.field3331 += 2029434363) * -132903629 - 1) * -689024993;
            }
         }

         if (1762367763 * this.field10610 >= 0) {
            this.field10611.method1240(var3, var1, var2, true, this.field10611.method2550(), (byte)43);
            this.field10611.method2543(var4, true, 43552435);
         } else {
            this.field10612.field3639 = this.field10612.field3640 = (byte)var3;
            this.field10612.method1995(var1, var2, -2044145189);
            this.field10612.method2543(var4, true, 1586583742);
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "dv.a(" + ')');
      }
   }

   boolean method6640(int var1) {
      try {
         if (this.field10610 * 1762367763 < 0) {
            return true;
         } else {
            class401 var2 = class258.field7913.method12(1762367763 * this.field10610, 2059716043);
            boolean var3 = var2.method6108(-1621243143);
            if (this.field10608 == null) {
               class507 var4 = field10614.method3736(var2.field9868 * 525312939, (byte)47);
               this.field10608 = var4.method2506(2115260709);
            }

            int[] var8 = this.field10608;

            for(int var5 = 0; var5 < var8.length; ++var5) {
               int var6 = var8[var5];
               var3 &= class936.field10313.method2256(var6, (byte)66).method3561(1245807797);
            }

            return var3;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "dv.i(" + ')');
      }
   }

   public static class157 method6641(int var0, int var1) {
      try {
         class157[] var2 = class629.method5805(-966564932);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class157 var4 = var2[var3];
            if (var0 == -160182505 * var4.field6556) {
               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "dv.f(" + ')');
      }
   }

   static final void method6642(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class576.method67(var3, var4, var0, 1780401940);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "dv.gb(" + ')');
      }
   }

   static final void method6643(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class75.method1118(var3, var4, true, 0, var0, 338177533);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "dv.hn(" + ')');
      }
   }

   static final void method6644(class744 var0, int var1) {
      try {
         class615.field8903.method5391(class615.field8903.field9126, var0.field3161[(var0.field3156 -= -391880689) * 681479919] == 1 ? 1 : 0, -1851948852);
         class362.method1508(-1900445314);
         Client.field2697.method5282((byte)-42).method5673(134111872);
         class95.method523(656179282);
         Client.field2647 = false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "dv.aif(" + ')');
      }
   }

   static final void method6645(class744 var0, int var1) {
      try {
         class564.method845((class963)var0.field3150, var0, -778688640);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "dv.apd(" + ')');
      }
   }

   static final void method6646(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "dv.tb(" + ')');
      }
   }

   static final void method6647(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         if (-257444687 * Client.field2822 != -1) {
            if (var2 == 0) {
               var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = Client.field2822 * -257444687;
               return;
            }

            --var2;
         }

         class256 var3;
         for(var3 = (class256) Client.field2823.method2946(1645730647); var2-- > 0; var3 = (class256) Client.field2823.method2945((byte)-33)) {
            ;
         }

         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -1617025021 * var3.field8101;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "dv.alc(" + ')');
      }
   }
}
