public class class765 {
   public static int field4370 = 2;
   public static int field4371 = 1;
   int field4372;
   class160 field4373;
   int field4374;
   int field4375;
   int field4376;
   public static int field4377 = 0;
   int field4378;
   boolean field4379 = false;
   boolean field4380 = false;
   int field4381 = 0;
   boolean field4382 = false;
   class866 field4383;
   class866 field4384;

   public final boolean method2775(byte var1) {
      try {
         return this.field4373 != null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.b(" + ')');
      }
   }

   public final class160 method2776(int var1) {
      try {
         return this.field4373;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.p(" + ')');
      }
   }

   public final void method2777(int var1, int var2) {
      try {
         this.method2780(var1, 0, 0, false, (byte)0);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sb.k(" + ')');
      }
   }

   public final boolean method2778(int var1, int var2) {
      try {
         if (this.field4373 != null && var1 != 0) {
            if (this.field4375 * -1577984117 > 0) {
               if (-1577984117 * this.field4375 >= var1) {
                  this.field4375 -= -2070327261 * var1;
                  return false;
               }

               var1 -= this.field4375 * -1577984117;
               this.field4375 = 0;
               this.method2793(this.field4373, -8792169 * this.field4372, (byte)71);
            }

            var1 += this.field4374 * 458730501;
            boolean var3 = this.field4373.field6660 | class160.field6670;
            if (var1 > 100 && this.field4373.field6659 * -658922537 > 0) {
               int var4;
               for(var4 = this.field4373.field6656.length - this.field4373.field6659 * -658922537; this.field4372 * -8792169 < var4 && var1 > this.field4373.field6653[this.field4372 * -8792169]; this.field4372 += 282466343) {
                  var1 -= this.field4373.field6653[this.field4372 * -8792169];
               }

               if (this.field4372 * -8792169 >= var4) {
                  int var5 = 0;

                  for(int var6 = var4; var6 < this.field4373.field6656.length; ++var6) {
                     var5 += this.field4373.field6653[var6];
                  }

                  if (this.field4381 * -1542612693 == 0) {
                     this.field4376 += 1129171511 * (var1 / var5);
                  }

                  var1 %= var5;
               }

               this.field4378 = -64061137 * this.field4372 + -1266936279;
               if (-112073191 * this.field4378 >= this.field4373.field6656.length) {
                  if (this.field4373.field6659 * -658922537 == -1 && this.field4382) {
                     this.field4378 = 0;
                  } else {
                     this.field4378 -= this.field4373.field6659 * 838055791;
                  }

                  if (this.field4378 * -112073191 < 0 || this.field4378 * -112073191 >= this.field4373.field6656.length) {
                     this.field4378 = 1266936279;
                  }
               }

               var3 = true;
            }

            while(var1 > this.field4373.field6653[-8792169 * this.field4372]) {
               var3 = true;
               var1 -= this.field4373.field6653[(this.field4372 += 282466343) * -8792169 - 1];
               if (-8792169 * this.field4372 >= this.field4373.field6656.length) {
                  if (this.field4373.field6659 * -658922537 != -1 && -1542612693 * this.field4381 != 2) {
                     this.field4372 -= this.field4373.field6659 * -782361151;
                     if (-1542612693 * this.field4381 == 0) {
                        this.field4376 += 1129171511;
                     }
                  }

                  if (2063993735 * this.field4376 >= this.field4373.field6665 * -23055529 || -8792169 * this.field4372 < 0 || -8792169 * this.field4372 >= this.field4373.field6656.length) {
                     this.field4379 = true;
                     break;
                  }
               }

               this.method2793(this.field4373, -8792169 * this.field4372, (byte)75);
               this.field4378 = this.field4372 * -64061137 + -1266936279;
               if (-112073191 * this.field4378 >= this.field4373.field6656.length) {
                  if (-1 == this.field4373.field6659 * -658922537 && this.field4382) {
                     this.field4378 = 0;
                  } else {
                     this.field4378 -= 838055791 * this.field4373.field6659;
                  }

                  if (-112073191 * this.field4378 < 0 || this.field4378 * -112073191 >= this.field4373.field6656.length) {
                     this.field4378 = 1266936279;
                  }
               }
            }

            this.field4374 = -993902387 * var1;
            if (var3) {
               this.method2800(1397320731);
            }

            return var3;
         } else {
            return false;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "sb.j(" + ')');
      }
   }

   public final int method2779(int var1) {
      try {
         return this.field4373 != null ? -1945308871 * this.field4373.field6655 : -1;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.i(" + ')');
      }
   }

   public final void method2780(int var1, int var2, int var3, boolean var4, byte var5) {
      try {
         this.method2781(var1, var2, var3, var4, false, -1437479972);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "sb.r(" + ')');
      }
   }

   final void method2781(int var1, int var2, int var3, boolean var4, boolean var5, int var6) {
      try {
         if (var1 != this.method2779(1947694560)) {
            if (-1 == var1) {
               this.field4373 = null;
            } else {
               if (this.field4373 != null && var1 == this.field4373.field6655 * -1945308871) {
                  if (-1117238071 * this.field4373.field6668 == 0) {
                     return;
                  }
               } else {
                  this.field4373 = class508.field3965.method2256(var1, (byte)32);
               }

               this.field4376 = 0;
               this.field4375 = var2 * -2070327261;
               this.field4381 = -1775084157 * var3;
               this.field4382 = var5;
               if (var4) {
                  this.field4372 = (int)(Math.random() * (double)this.field4373.field6656.length) * 282466343;
                  this.field4374 = (int)(Math.random() * (double)this.field4373.field6653[-8792169 * this.field4372]) * -993902387;
               } else {
                  this.field4372 = 0;
                  this.field4374 = 0;
               }

               this.field4378 = -1266936279 + -64061137 * this.field4372;
               if (this.field4378 * -112073191 < 0 || this.field4378 * -112073191 >= this.field4373.field6656.length) {
                  this.field4378 = 1266936279;
               }

               if (-1577984117 * this.field4375 == 0) {
                  this.method2793(this.field4373, -8792169 * this.field4372, (byte)59);
               }

               this.field4379 = false;
            }

            this.method2800(898280732);
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "sb.q(" + ')');
      }
   }

   public final boolean method2782(int var1) {
      try {
         return -1577984117 * this.field4375 != 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.n(" + ')');
      }
   }

   public final int method2783(short var1) {
      try {
         return -1577984117 * this.field4375;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.s(" + ')');
      }
   }

   public final void method2784(int var1, int var2) {
      try {
         this.field4375 = var1 * -2070327261;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sb.z(" + ')');
      }
   }

   public final int method2785(int var1) {
      try {
         if (this.method2794((short)225)) {
            int var2 = 0;
            if (this.method2794((short)225)) {
               var2 |= -1050600049 * this.field4383.field9765;
               if (this.field4380 && this.field4373.field6658 != null) {
                  var2 |= -1050600049 * this.field4384.field9765;
               }
            }

            return var2;
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.y(" + ')');
      }
   }

   public final void method2786(class879 var1, int var2, int var3, byte var4) {
      try {
         if (this.field4373.field6656 != null && this.method2794((short)225)) {
            var1.method6056(this.field4383.field9760, this.field4383.field9761 * 806878007, this.field4383.field9764, -643912397 * this.field4383.field9763, 458730501 * this.field4374, this.field4373.field6653[-8792169 * this.field4372], var2, var3, this.field4373.field6669, (int[])null);
            if (this.field4380 && this.field4373.field6658 != null && this.field4384.field9762) {
               var1.method6056(this.field4384.field9760, this.field4384.field9761 * 806878007, this.field4384.field9764, -643912397 * this.field4384.field9763, 458730501 * this.field4374, this.field4373.field6653[-8792169 * this.field4372], var2, var3, this.field4373.field6669, (int[])null);
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "sb.h(" + ')');
      }
   }

   public final void method2787(class879 var1, int var2) {
      try {
         if (this.field4373.field6656 != null && this.method2794((short)225)) {
            var1.method5963(this.field4383.field9760, this.field4383.field9761 * 806878007);
            if (this.field4380 && this.field4373.field6658 != null && this.field4384.field9762) {
               var1.method5963(this.field4384.field9760, this.field4384.field9761 * 806878007);
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sb.v(" + ')');
      }
   }

   public final boolean method2788(int var1) {
      try {
         return this.field4379;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.e(" + ')');
      }
   }

   public final void method2789(int var1, int var2, int var3) {
      try {
         this.method2780(var1, var2, 0, false, (byte)0);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sb.d(" + ')');
      }
   }

   public final void method2790(int var1) {
      try {
         this.method2791(0, (byte)97);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.m(" + ')');
      }
   }

   public final void method2791(int var1, byte var2) {
      try {
         this.field4372 = 0;
         this.field4378 = -1266936279 * (this.field4373.field6656.length > 1 ? 1 : -1);
         this.field4374 = 0;
         this.field4379 = false;
         this.field4375 = var1 * -2070327261;
         this.field4376 = 0;
         if (this.field4373 != null & this.field4373.field6656 != null) {
            this.method2793(this.field4373, -8792169 * this.field4372, (byte)-16);
            this.method2800(1713813277);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sb.w(" + ')');
      }
   }

   public final boolean method2792(int var1, int var2) {
      try {
         return this.field4373 == null | (var1 -= this.field4375 * -1577984117) <= 0 ? false : this.field4373.field6660 | 458730501 * this.field4374 + var1 > this.field4373.field6653[-8792169 * this.field4372];
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sb.o(" + ')');
      }
   }

   void method2793(class160 var1, int var2, byte var3) {
   }

   final boolean method2794(short var1) {
      try {
         if (this.field4373 != null) {
            boolean var2 = this.field4383.method5838(class508.field3965, this.field4373, this.field4372 * -8792169, -112073191 * this.field4378, this.field4373.field6656, (byte)103);
            if (var2 && this.field4380 && this.field4373.field6658 != null) {
               this.field4384.method5838(class508.field3965, this.field4373, this.field4372 * -8792169, this.field4378 * -112073191, this.field4373.field6658, (byte)103);
            }

            return var2;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.ax(" + ')');
      }
   }

   public final void method2795(class879 var1, int var2, int var3) {
      try {
         if (this.field4373 != null && this.field4373.field6656 != null && this.method2794((short)225)) {
            var1.method5960(this.field4383.field9760, this.field4383.field9761 * 806878007, this.field4383.field9764, this.field4383.field9763 * -643912397, this.field4374 * 458730501, this.field4373.field6653[-8792169 * this.field4372], var2, this.field4373.field6669);
            if (this.field4380 && this.field4373.field6658 != null && this.field4384.field9762) {
               var1.method5960(this.field4384.field9760, this.field4384.field9761 * 806878007, this.field4384.field9764, -643912397 * this.field4384.field9763, this.field4374 * 458730501, this.field4373.field6653[-8792169 * this.field4372], var2, this.field4373.field6669);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sb.t(" + ')');
      }
   }

   public final void method2796(class765 var1, int var2) {
      try {
         this.field4373 = var1.field4373;
         this.field4379 = var1.field4379;
         this.field4380 = var1.field4380;
         this.field4375 = 1 * var1.field4375;
         this.field4376 = var1.field4376 * 1;
         this.field4372 = var1.field4372 * 1;
         this.field4378 = var1.field4378 * 1;
         this.field4374 = 1 * var1.field4374;
         this.method2800(853197244);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sb.f(" + ')');
      }
   }

   public final void method2797(int var1, boolean var2, boolean var3, byte var4) {
      try {
         this.method2781(var1, 0, 0, var2, var3, -1437479972);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "sb.x(" + ')');
      }
   }

   public final void method2798(int var1) {
      try {
         this.field4376 = 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.c(" + ')');
      }
   }

   public final void method2799(int var1, boolean var2, int var3) {
      try {
         this.method2780(var1, 0, 0, var2, (byte)0);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sb.u(" + ')');
      }
   }

   final void method2800(int var1) {
      try {
         this.field4383.method5839(-2015637843);
         if (this.field4380) {
            this.field4384.method5839(-2050586678);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.aa(" + ')');
      }
   }

   class765(boolean var1) {
      this.field4380 = var1;
      this.field4383 = new class866();
      if (this.field4380) {
         this.field4384 = new class866();
      } else {
         this.field4384 = null;
      }

   }

   public static void method2801(class131 var0, class564 var1, int var2) {
      try {
         class564 var3 = class317.method471(var0, var1, -499945373);
         int var4;
         int var5;
         if (var3 == null) {
            var4 = class759.field4331 * -2110394505;
            var5 = class97.field614 * -1111710645;
         } else {
            var4 = -2093041337 * var3.field881;
            var5 = var3.field887 * 457937409;
         }

         class929.method6263(var1, var4, var5, false, (byte)-73);
         class99.method537(var1, var4, var5, (byte)6);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "sb.kz(" + ')');
      }
   }

   public static void method2802(String var0, boolean var1, int var2, int var3, int var4) {
      try {
         class379.method964(var0, var1, var2, var3, (String)null, false, (short)-5215);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "sb.nl(" + ')');
      }
   }
}
