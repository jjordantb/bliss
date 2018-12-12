import java.io.IOException;
import java.util.Date;

public class class213 implements Runnable {
   boolean field7194 = false;
   Thread field7195 = new Thread(this);
   int field7196 = 0;
   class514 field7197 = new class514();
   static class219 field7198;

   class174 method3804(int var1, class675 var2, byte var3) {
      try {
         class174 var4 = new class174();
         var4.field5076 = -745165359;
         var4.field209 = (long)var1 * 1476940603538232441L;
         var4.field5080 = var2;
         var4.field3466 = false;
         this.method3807(var4, (byte)103);
         return var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "kr.b(" + ')');
      }
   }

   class174 method3805(int var1, class675 var2, int var3) {
      try {
         class174 var4 = new class174();
         var4.field5076 = -248388453;
         class514 var5 = this.field7197;
         synchronized(this.field7197) {
            for(class174 var6 = (class174)this.field7197.method2706(686363137); var6 != null; var6 = (class174)this.field7197.method2707(-852978429)) {
               if ((long)var1 == -5533549728640346679L * var6.field209 && var2 == var6.field5080 && -1906220653 * var6.field5076 == 2) {
                  var4.field5081 = var6.field5081;
                  var4.field3464 = false;
                  return var4;
               }
            }
         }

         var4.field5081 = var2.method4163(var1, -250604251);
         var4.field3464 = false;
         var4.field3466 = true;
         return var4;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "kr.a(" + ')');
      }
   }

   class174 method3806(int var1, byte[] var2, class675 var3, int var4) {
      try {
         class174 var5 = new class174();
         var5.field5076 = -496776906;
         var5.field209 = 1476940603538232441L * (long)var1;
         var5.field5081 = var2;
         var5.field5080 = var3;
         var5.field3466 = false;
         this.method3807(var5, (byte)39);
         return var5;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "kr.f(" + ')');
      }
   }

   void method3807(class174 var1, byte var2) {
      try {
         class514 var3 = this.field7197;
         synchronized(this.field7197) {
            this.field7197.method2704(var1, (byte)-98);
            this.field7196 += 872113935;
            this.field7197.notifyAll();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "kr.p(" + ')');
      }
   }

   public void run() {
      try {
         while(!this.field7194) {
            class514 var1 = this.field7197;
            class174 var2;
            synchronized(this.field7197) {
               var2 = (class174)this.field7197.method2705(-2118324639);
               if (var2 == null) {
                  try {
                     this.field7197.wait();
                  } catch (InterruptedException var5) {
                     ;
                  }
                  continue;
               }

               this.field7196 -= 872113935;
            }

            try {
               if (-1906220653 * var2.field5076 == 2) {
                  var2.field5080.method4164((int)(var2.field209 * -5533549728640346679L), var2.field5081, var2.field5081.length, 267663991);
               } else if (3 == var2.field5076 * -1906220653) {
                  var2.field5081 = var2.field5080.method4163((int)(-5533549728640346679L * var2.field209), -250604251);
               }
            } catch (Exception var4) {
               class764.method2747((String)null, var4, (short)666);
            }

            var2.field3464 = false;
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "kr.run(" + ')');
      }
   }

   public class213() {
      this.field7195.setDaemon(true);
      this.field7195.start();
      this.field7195.setPriority(1);
   }

   public void method3808(int var1) {
      try {
         this.field7194 = true;
         class514 var2 = this.field7197;
         synchronized(this.field7197) {
            this.field7197.notifyAll();
         }

         try {
            this.field7195.join();
         } catch (InterruptedException var3) {
            ;
         }

         this.field7195 = null;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "kr.i(" + ')');
      }
   }

   static final void method3809(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9139.method2806((byte)12) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kr.anz(" + ')');
      }
   }

   public static void method3810(String var0, int var1) {
      try {
         if (class342.field287 == null) {
            class534.method2290(-219758847);
         }

         class730.field2739.setTime(new Date(class27.method3468((byte)1)));
         int var2 = class730.field2739.get(11);
         int var3 = class730.field2739.get(12);
         int var4 = class730.field2739.get(13);
         String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
         String[] var6 = class715.method2097(var0, '\n', 1593698305);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            for(int var8 = -2035787443 * class342.field282; var8 > 0; --var8) {
               class342.field287[var8] = class342.field287[var8 - 1];
            }

            class342.field287[0] = var5 + ": " + var6[var7];
            if (class919.field10431 != null) {
               try {
                  class919.field10431.write(class482.method4718(class342.field287[0] + "\n", 6758905));
               } catch (IOException var9) {
                  ;
               }
            }

            if (class342.field282 * -2035787443 < class342.field287.length - 1) {
               class342.field282 += 674924421;
               if (class342.field283 * -1731316011 > 0) {
                  class342.field283 += 205738621;
               }
            }
         }

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "kr.n(" + ')');
      }
   }

   public static class928 method3811(int var0, int var1) {
      try {
         class928[] var2 = class671.method4238((byte)-107);
         class928[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            class928 var5 = var3[var4];
            if (-509770143 * var5.field10206 == var0) {
               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "kr.f(" + ')');
      }
   }

   static class163 method3812(int var0, boolean var1, int var2) {
      try {
         long var3 = (long)(var0 | (var1 ? Integer.MIN_VALUE : 0));
         return (class163)class163.field6617.method2942(var3);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "kr.k(" + ')');
      }
   }

   static final void method3813(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class754.method2662(var3, var4, var0, (byte)20);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "kr.le(" + ')');
      }
   }

   public static class230 method3814(class180 var0, int var1, int var2) {
      try {
         byte[] var3 = var0.method3264(var1, (byte)105);
         return var3 == null ? null : new class230(var3);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "kr.f(" + ')');
      }
   }

   static final void method3815(class963 var0, int var1, int var2) {
      try {
         class133.method996(var0, var1, false, -630739459);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "kr.ju(" + ')');
      }
   }
}
