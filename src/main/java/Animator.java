public class Animator {
   public static int field4370 = 2;
   public static int field4371 = 1;
   int field4372;
   Animation animation;
   int field4374;
   int field4375;
   int field4376;
   public static int field4377 = 0;
   int timeAnimating;
   boolean field4379 = false;
   boolean field4380 = false;
   int field4381 = 0;
   boolean field4382 = false;
   class866 field4383;
   class866 field4384;

   public final boolean method2775(byte var1) {
      try {
         return this.animation != null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.b(" + ')');
      }
   }

   public final Animation method2776(int var1) {
      try {
         return this.animation;
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
         if (this.animation != null && var1 != 0) {
            if (this.field4375 > 0) {
               if (this.field4375 >= var1) {
                  this.field4375 -= var1;
                  return false;
               }

               var1 -= this.field4375;
               this.field4375 = 0;
               this.method2793(this.animation, this.field4372, (byte)71);
            }

            var1 += this.field4374;
            boolean var3 = this.animation.field6660 | Animation.field6670;
            if (var1 > 100 && this.animation.field6659 > 0) {
               int var4;
               for(var4 = this.animation.field6656.length - this.animation.field6659; this.field4372 < var4 && var1 > this.animation.field6653[this.field4372]; ++this.field4372) {
                  var1 -= this.animation.field6653[this.field4372];
               }

               if (this.field4372 >= var4) {
                  int var5 = 0;

                  for(int var6 = var4; var6 < this.animation.field6656.length; ++var6) {
                     var5 += this.animation.field6653[var6];
                  }

                  if (this.field4381 == 0) {
                     this.field4376 += var1 / var5;
                  }

                  var1 %= var5;
               }

               this.timeAnimating = this.field4372 + 1;
               if (this.timeAnimating >= this.animation.field6656.length) {
                  if (this.animation.field6659 == -1 && this.field4382) {
                     this.timeAnimating = 0;
                  } else {
                     this.timeAnimating -= this.animation.field6659;
                  }

                  if (this.timeAnimating < 0 || this.timeAnimating >= this.animation.field6656.length) {
                     this.timeAnimating = -1;
                  }
               }

               var3 = true;
            }

            while(var1 > this.animation.field6653[this.field4372]) {
               var3 = true;
               var1 -= this.animation.field6653[++this.field4372 - 1];
               if (this.field4372 >= this.animation.field6656.length) {
                  if (this.animation.field6659 != -1 && this.field4381 != 2) {
                     this.field4372 -= this.animation.field6659;
                     if (this.field4381 == 0) {
                        ++this.field4376;
                     }
                  }

                  if (this.field4376 >= this.animation.field6665 || this.field4372 < 0 || this.field4372 >= this.animation.field6656.length) {
                     this.field4379 = true;
                     break;
                  }
               }

               this.method2793(this.animation, this.field4372, (byte)75);
               this.timeAnimating = this.field4372 + 1;
               if (this.timeAnimating >= this.animation.field6656.length) {
                  if (-1 == this.animation.field6659 && this.field4382) {
                     this.timeAnimating = 0;
                  } else {
                     this.timeAnimating -= this.animation.field6659;
                  }

                  if (this.timeAnimating < 0 || this.timeAnimating >= this.animation.field6656.length) {
                     this.timeAnimating = -1;
                  }
               }
            }

            this.field4374 = var1;
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
         return this.animation != null ? -1945308871 * this.animation.id * -523719415 : -1;
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
               this.animation = null;
            } else {
               if (this.animation != null && var1 == this.animation.id) {
                  if (this.animation.field6668 == 0) {
                     return;
                  }
               } else {
                  this.animation = class508.field3965.method2256(var1, (byte)32);
               }

               this.field4376 = 0;
               this.field4375 = var2;
               this.field4381 = var3;
               this.field4382 = var5;
               if (var4) {
                  this.field4372 = (int)(Math.random() * (double)this.animation.field6656.length);
                  this.field4374 = (int)(Math.random() * (double)this.animation.field6653[this.field4372]);
               } else {
                  this.field4372 = 0;
                  this.field4374 = 0;
               }

               this.timeAnimating = 1 + this.field4372;
               if (this.timeAnimating < 0 || this.timeAnimating >= this.animation.field6656.length) {
                  this.timeAnimating = -1;
               }

               if (this.field4375 == 0) {
                  this.method2793(this.animation, this.field4372, (byte)59);
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
         return this.field4375 != 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.n(" + ')');
      }
   }

   public final int method2783(short var1) {
      try {
         return this.field4375;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sb.s(" + ')');
      }
   }

   public final void method2784(int var1, int var2) {
      try {
         this.field4375 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sb.z(" + ')');
      }
   }

   public final int method2785(int var1) {
      try {
         if (this.method2794((short)225)) {
            int var2 = 0;
            if (this.method2794((short)225)) {
               var2 |= this.field4383.field9765;
               if (this.field4380 && this.animation.field6658 != null) {
                  var2 |= this.field4384.field9765;
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
         if (this.animation.field6656 != null && this.method2794((short)225)) {
            var1.method6056(this.field4383.field9760, this.field4383.field9761, this.field4383.field9764, this.field4383.field9763, this.field4374, this.animation.field6653[this.field4372], var2, var3, this.animation.field6669, (int[])null);
            if (this.field4380 && this.animation.field6658 != null && this.field4384.field9762) {
               var1.method6056(this.field4384.field9760, this.field4384.field9761, this.field4384.field9764, this.field4384.field9763, this.field4374, this.animation.field6653[this.field4372], var2, var3, this.animation.field6669, (int[])null);
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "sb.h(" + ')');
      }
   }

   public final void method2787(class879 var1, int var2) {
      try {
         if (this.animation.field6656 != null && this.method2794((short)225)) {
            var1.method5963(this.field4383.field9760, this.field4383.field9761);
            if (this.field4380 && this.animation.field6658 != null && this.field4384.field9762) {
               var1.method5963(this.field4384.field9760, this.field4384.field9761);
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
         this.timeAnimating = this.animation.field6656.length > 1 ? 1 : -1;
         this.field4374 = 0;
         this.field4379 = false;
         this.field4375 = var1;
         this.field4376 = 0;
         if (this.animation != null & this.animation.field6656 != null) {
            this.method2793(this.animation, this.field4372, (byte)-16);
            this.method2800(1713813277);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sb.w(" + ')');
      }
   }

   public final boolean method2792(int var1, int var2) {
      try {
         return this.animation == null | (var1 -= this.field4375) <= 0 ? false : this.animation.field6660 | this.field4374 + var1 > this.animation.field6653[this.field4372];
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sb.o(" + ')');
      }
   }

   void method2793(Animation var1, int var2, byte var3) {
   }

   final boolean method2794(short var1) {
      try {
         if (this.animation != null) {
            boolean var2 = this.field4383.method5838(class508.field3965, this.animation, this.field4372, this.timeAnimating, this.animation.field6656, (byte)103);
            if (var2 && this.field4380 && this.animation.field6658 != null) {
               this.field4384.method5838(class508.field3965, this.animation, this.field4372, this.timeAnimating, this.animation.field6658, (byte)103);
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
         if (this.animation != null && this.animation.field6656 != null && this.method2794((short)225)) {
            var1.method5960(this.field4383.field9760, this.field4383.field9761, this.field4383.field9764, this.field4383.field9763, this.field4374, this.animation.field6653[this.field4372], var2, this.animation.field6669);
            if (this.field4380 && this.animation.field6658 != null && this.field4384.field9762) {
               var1.method5960(this.field4384.field9760, this.field4384.field9761, this.field4384.field9764, this.field4384.field9763, this.field4374, this.animation.field6653[this.field4372], var2, this.animation.field6669);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sb.t(" + ')');
      }
   }

   public final void method2796(Animator var1, int var2) {
      try {
         this.animation = var1.animation;
         this.field4379 = var1.field4379;
         this.field4380 = var1.field4380;
         this.field4375 = var1.field4375;
         this.field4376 = var1.field4376;
         this.field4372 = var1.field4372;
         this.timeAnimating = var1.timeAnimating;
         this.field4374 = var1.field4374;
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

   Animator(boolean var1) {
      this.field4380 = var1;
      this.field4383 = new class866();
      if (this.field4380) {
         this.field4384 = new class866();
      } else {
         this.field4384 = null;
      }

   }

   public static void method2801(WidgetContainer var0, Widget var1, int var2) {
      try {
         Widget var3 = class317.method471(var0, var1, -499945373);
         int var4;
         int var5;
         if (var3 == null) {
            var4 = class759.field4331;
            var5 = class97.field614;
         } else {
            var4 = var3.field881;
            var5 = var3.field887;
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
