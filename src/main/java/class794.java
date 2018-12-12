import java.util.LinkedList;

public class class794 implements Runnable {
   volatile boolean field538 = false;
   LinkedList field539 = new LinkedList();
   class623 field540 = new class623(true);
   public static class341 field541;

   public void method458(class240 var1, int var2) {
      try {
         this.field540.method5287(var1, -441647750);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "kj.a(" + ')');
      }
   }

   public boolean method459(int var1) {
      try {
         return this.field538;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kj.b(" + ')');
      }
   }

   void method460(class623 var1, int var2) {
      try {
         this.field540 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "kj.i(" + ')');
      }
   }

   public void run() {
      try {
         while(true) {
            this.method461((byte)0);
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "kj.run(" + ')');
      }
   }

   void method461(byte var1) {
      try {
         Object var2 = null;
         LinkedList var3 = this.field539;
         class406 var5;
         synchronized(this.field539) {
            try {
               this.field539.wait();
            } catch (InterruptedException var6) {
               ;
            }

            var5 = (class406)this.field539.pollFirst();
         }

         try {
            try {
               if (var5 != null) {
                  this.field538 = true;
                  this.method462(var5, 1924370616);
               }
            } catch (Exception var8) {
               this.field538 = false;
               return;
            }

            this.field538 = false;
         } catch (RuntimeException var9) {
            this.field538 = false;
            throw var9;
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "kj.k(" + ')');
      }
   }

   void method462(class406 var1, int var2) {
      try {
         if (class335.field50 == var1.field9266) {
            this.field540.method5309(528640146);
         } else {
            this.field540.method5292(var1, -1991819579);
         }

         for(boolean var3 = this.field540.method5314(-1688450979); !var3; var3 = this.field540.method5314(-770547477)) {
            ;
         }

         this.field540.method5315((byte)119);
         Client.field2697.method5315((byte)25);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "kj.d(" + ')');
      }
   }

   public class623 method463(short var1) {
      try {
         return this.field540;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kj.p(" + ')');
      }
   }

   public void method464(class406 var1, int var2) {
      try {
         LinkedList var3 = this.field539;
         synchronized(this.field539) {
            this.field539.add(var1);
            this.field539.notify();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "kj.f(" + ')');
      }
   }

   static final void method465(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[(var0.field3158 -= 969361751) * -203050393];
         String var3 = (String)var0.field3157[(var0.field3158 -= 969361751) * -203050393];
         class701 var4 = class637.method5936(class643.field10005, Client.field2674.field7765, (byte)47);
         var4.field3364.method6362(class305.method372(var2, -250227687) + class305.method372(var3, -433489347), 16711935);
         var4.field3364.method6366(var2, 2110683902);
         var4.field3364.method6366(var3, 2142092723);
         Client.field2674.method4380(var4, (byte)-123);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "kj.vq(" + ')');
      }
   }

   static final void method466(class744 var0, byte var1) {
      try {
         class587.method165(var0.field3161[(var0.field3156 -= -391880689) * 681479919], -292908966);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kj.adc(" + ')');
      }
   }

   public static String method467(String var0, int var1) {
      try {
         int var2 = var0.length();
         int var3 = 0;

         for(int var4 = 0; var4 < var2; ++var4) {
            char var5 = var0.charAt(var4);
            if ('<' == var5 || var5 == '>') {
               var3 += 3;
            }
         }

         StringBuilder var8 = new StringBuilder(var2 + var3);

         for(int var9 = 0; var9 < var2; ++var9) {
            char var6 = var0.charAt(var9);
            if ('<' == var6) {
               var8.append("<lt>");
            } else if ('>' == var6) {
               var8.append("<gt>");
            } else {
               var8.append(var6);
            }
         }

         return var8.toString();
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "kj.a(" + ')');
      }
   }

   static void method468(class848 var0, class23 var1, class564 var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      try {
         class718 var9 = class333.field139.method5091(var7, -405562208);
         if (var9 != null && var9.field3495 && var9.method2063(class827.field9037, 1844230404)) {
            int var11;
            if (var9.field3518 != null) {
               int[] var10 = new int[var9.field3518.length];

               int var12;
               int var13;
               int var14;
               for(var11 = 0; var11 < var10.length / 2; ++var11) {
                  if (-863531439 * class563.field1083 == 2) {
                     var12 = (int) Client.field2931 & 16383;
                  } else {
                     var12 = Client.field2782 * 1227356013 + (int) Client.field2931 & 16383;
                  }

                  var13 = class703.field3413[var12];
                  var14 = class703.field3404[var12];
                  if (class563.field1083 * -863531439 != 2) {
                     var13 = 256 * var13 / (Client.field2730 * 356727603 + 256);
                     var14 = var14 * 256 / (256 + 356727603 * Client.field2730);
                  }

                  var10[var11 * 2] = ((var6 + 4 * var9.field3518[var11 * 2 + 1]) * var13 + (var5 + 4 * var9.field3518[var11 * 2]) * var14 >> 14) + var2.field881 * -2093041337 / 2 + var3;
                  var10[var11 * 2 + 1] = var4 + var2.field887 * 457937409 / 2 - (var14 * (var9.field3518[1 + 2 * var11] * 4 + var6) - (4 * var9.field3518[2 * var11] + var5) * var13 >> 14);
               }

               class118 var21 = var2.method826(var0, 973176237);
               if (var21 != null) {
                  class421.method5753(var0, var10, var9.field3523 * -248291889, var21.field2155, var21.field2154);
               }

               if (var9.field3521 * -972644285 > 0) {
                  int var15;
                  int var16;
                  int var17;
                  for(var12 = 0; var12 < var10.length / 2 - 1; ++var12) {
                     var13 = var10[var12 * 2];
                     var14 = var10[1 + 2 * var12];
                     var15 = var10[(var12 + 1) * 2];
                     var16 = var10[2 * (var12 + 1) + 1];
                     if (var15 < var13) {
                        var17 = var13;
                        int var18 = var14;
                        var13 = var15;
                        var14 = var16;
                        var15 = var17;
                        var16 = var18;
                     } else if (var15 == var13 && var16 < var14) {
                        var17 = var14;
                        var14 = var16;
                        var16 = var17;
                     }

                     var0.method4820(var13, var14, var15, var16, var9.field3529[var9.field3492[var12] & 255], 1, var1, var3, var4, var9.field3521 * -972644285, var9.field3514 * 2123190239, -176015499 * var9.field3503);
                  }

                  var12 = var10[var10.length - 2];
                  var13 = var10[var10.length - 1];
                  var14 = var10[0];
                  var15 = var10[1];
                  if (var14 < var12) {
                     var16 = var12;
                     var17 = var13;
                     var12 = var14;
                     var13 = var15;
                     var14 = var16;
                     var15 = var17;
                  } else if (var14 == var12 && var15 < var13) {
                     var16 = var13;
                     var13 = var15;
                     var15 = var16;
                  }

                  var0.method4820(var12, var13, var14, var15, var9.field3529[var9.field3492[var9.field3492.length - 1] & 255], 1, var1, var3, var4, -972644285 * var9.field3521, 2123190239 * var9.field3514, var9.field3503 * -176015499);
               } else {
                  for(var12 = 0; var12 < var10.length / 2 - 1; ++var12) {
                     var0.method4845(var10[2 * var12], var10[1 + 2 * var12], var10[(var12 + 1) * 2], var10[1 + 2 * (1 + var12)], var9.field3529[var9.field3492[var12] & 255], 1, var1, var3, var4);
                  }

                  var0.method4845(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field3529[var9.field3492[var9.field3492.length - 1] & 255], 1, var1, var3, var4);
               }
            }

            class48 var20 = null;
            if (-1 != var9.field3500 * 715019623) {
               var20 = var9.method2064(var0, false, -98402151);
               if (var20 != null) {
                  class758.method2734(var2, var1, var3, var4, var5, var6, var20, (byte)-86);
               }
            }

            if (var9.field3507 != null) {
               var11 = 0;
               if (var20 != null) {
                  var11 = var20.method3108();
               }

               class727 var22 = class202.field7587;
               class230 var23 = class295.field10474;
               if (var9.field3498 * 1023000389 == 1) {
                  var22 = class958.field3479;
                  var23 = class378.field1158;
               }

               if (var9.field3498 * 1023000389 == 2) {
                  var22 = class501.field3182;
                  var23 = class271.field10557;
               }

               class399.method3532(var2, var1, var3, var4, var5, var6, var11, var9.field3507, var22, var23, -1836991893 * var9.field3496, 1768300509);
            }
         }

      } catch (RuntimeException var19) {
         throw class158.method3445(var19, "kj.z(" + ')');
      }
   }
}
