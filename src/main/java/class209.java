import java.io.IOException;
import java.io.OutputStream;

public class class209 implements Runnable {
   Thread field7103;
   OutputStream field7104;
   int field7105 = 0;
   byte[] field7106;
   int field7107;
   int field7108 = 0;
   IOException field7109;
   boolean field7110;

   void method3767(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
            synchronized(this) {
               if (this.field7109 != null) {
                  throw new IOException(this.field7109.toString());
               } else {
                  int var6;
                  if (825739053 * this.field7105 <= 517453779 * this.field7108) {
                     var6 = this.field7105 * 825739053 + (75932039 * this.field7107 - this.field7108 * 517453779) - 1;
                  } else {
                     var6 = 825739053 * this.field7105 - this.field7108 * 517453779 - 1;
                  }

                  if (var6 < var3) {
                     throw new IOException("");
                  } else {
                     if (this.field7108 * 517453779 + var3 <= 75932039 * this.field7107) {
                        System.arraycopy(var1, var2, this.field7106, 517453779 * this.field7108, var3);
                     } else {
                        int var7 = this.field7107 * 75932039 - this.field7108 * 517453779;
                        System.arraycopy(var1, var2, this.field7106, this.field7108 * 517453779, var7);
                        System.arraycopy(var1, var7 + var2, this.field7106, 0, var3 - var7);
                     }

                     this.field7108 = (var3 + 517453779 * this.field7108) % (75932039 * this.field7107) * -255412133;
                     this.notifyAll();
                  }
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "nt.f(" + ')');
      }
   }

   boolean method3768(int var1) {
      try {
         if (this.field7110) {
            try {
               this.field7104.close();
               if (this.field7109 == null) {
                  this.field7109 = new IOException("");
               }
            } catch (IOException var3) {
               if (this.field7109 == null) {
                  this.field7109 = new IOException(var3);
               }
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "nt.a(" + ')');
      }
   }

   void method3769(byte var1) {
      try {
         this.field7104 = new class926();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nt.p(" + ')');
      }
   }

   void method3770(int var1) {
      try {
         synchronized(this) {
            this.field7110 = true;
            this.notifyAll();
         }

         try {
            this.field7103.join();
         } catch (InterruptedException var3) {
            ;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nt.b(" + ')');
      }
   }

   public void run() {
      try {
         do {
            int var2;
            synchronized(this) {
               while(true) {
                  if (this.field7109 != null) {
                     return;
                  }

                  if (825739053 * this.field7105 <= 517453779 * this.field7108) {
                     var2 = this.field7108 * 517453779 - 825739053 * this.field7105;
                  } else {
                     var2 = this.field7108 * 517453779 + (75932039 * this.field7107 - 825739053 * this.field7105);
                  }

                  if (var2 > 0) {
                     break;
                  }

                  try {
                     this.field7104.flush();
                  } catch (IOException var6) {
                     this.field7109 = var6;
                     return;
                  }

                  if (this.method3768(-1835611724)) {
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var7) {
                     ;
                  }
               }
            }

            try {
               if (var2 + this.field7105 * 825739053 <= 75932039 * this.field7107) {
                  this.field7104.write(this.field7106, this.field7105 * 825739053, var2);
               } else {
                  int var11 = 75932039 * this.field7107 - this.field7105 * 825739053;
                  this.field7104.write(this.field7106, this.field7105 * 825739053, var11);
                  this.field7104.write(this.field7106, 0, var2 - var11);
               }
            } catch (IOException var8) {
               IOException var1 = var8;
               synchronized(this) {
                  this.field7109 = var1;
                  return;
               }
            }

            synchronized(this) {
               this.field7105 = (825739053 * this.field7105 + var2) % (this.field7107 * 75932039) * 1059266725;
            }
         } while(!this.method3768(-1331950055));

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "nt.run(" + ')');
      }
   }

   class209(OutputStream var1, int var2) {
      this.field7104 = var1;
      this.field7107 = (var2 + 1) * 370496567;
      this.field7106 = new byte[this.field7107 * 75932039];
      this.field7103 = new Thread(this);
      this.field7103.setDaemon(true);
      this.field7103.start();
   }

   static final void method3771(class744 var0, byte var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class923.field10295.field3385 * 696798311;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nt.ue(" + ')');
      }
   }

   static final void method3772(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class747.method2613(var2, 2048910777);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nt.ahi(" + ')');
      }
   }

   static final void method3773(class744 var0, int var1) {
      try {
         var0.field3152[var0.field3174[var0.field3176 * 1883543357]] = var0.field3168[(var0.field3162 -= -682569305) * 1685767703];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nt.bm(" + ')');
      }
   }

   public static void method3774(int var0) {
      try {
         class114.field1721.method2977();
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "nt.k(" + ')');
      }
   }

   static final boolean method3775(int var0, int var1, class312 var2, class262 var3, int var4) {
      try {
         int var5 = var0;
         int var6 = var1;
         byte var7 = 64;
         byte var8 = 64;
         int var9 = var0 - var7;
         int var10 = var1 - var8;
         class56.field2314[var7][var8] = 99;
         class56.field2318[var7][var8] = 0;
         byte var11 = 0;
         int var12 = 0;
         class56.field2315[var11] = var0;
         byte var10001 = var11;
         int var20 = var11 + 1;
         class56.field2312[var10001] = var1;
         int[][] var13 = var3.field8183;

         while(var12 != var20) {
            var5 = class56.field2315[var12];
            var6 = class56.field2312[var12];
            var12 = 1 + var12 & 4095;
            int var18 = var5 - var9;
            int var19 = var6 - var10;
            int var14 = var5 - 1487776559 * var3.field8179;
            int var15 = var6 - 1415525851 * var3.field8180;
            if (var2.method415(1, var5, var6, var3, -16711936)) {
               class56.field2316 = var5 * 1021042197;
               class78.field1500 = -575994451 * var6;
               return true;
            }

            int var16 = class56.field2318[var18][var19] + 1;
            if (var18 > 0 && class56.field2314[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 1109655552) == 0) {
               class56.field2315[var20] = var5 - 1;
               class56.field2312[var20] = var6;
               var20 = 1 + var20 & 4095;
               class56.field2314[var18 - 1][var19] = 2;
               class56.field2318[var18 - 1][var19] = var16;
            }

            if (var18 < 127 && class56.field2314[var18 + 1][var19] == 0 && (var13[1 + var14][var15] & 1612972032) == 0) {
               class56.field2315[var20] = var5 + 1;
               class56.field2312[var20] = var6;
               var20 = var20 + 1 & 4095;
               class56.field2314[1 + var18][var19] = 8;
               class56.field2318[var18 + 1][var19] = var16;
            }

            if (var19 > 0 && class56.field2314[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 1084489728) == 0) {
               class56.field2315[var20] = var5;
               class56.field2312[var20] = var6 - 1;
               var20 = 1 + var20 & 4095;
               class56.field2314[var18][var19 - 1] = 1;
               class56.field2318[var18][var19 - 1] = var16;
            }

            if (var19 < 127 && class56.field2314[var18][var19 + 1] == 0 && (var13[var14][1 + var15] & 1210318848) == 0) {
               class56.field2315[var20] = var5;
               class56.field2312[var20] = 1 + var6;
               var20 = 1 + var20 & 4095;
               class56.field2314[var18][var19 + 1] = 4;
               class56.field2318[var18][var19 + 1] = var16;
            }

            if (var18 > 0 && var19 > 0 && class56.field2314[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 1134821376) == 0 && (var13[var14 - 1][var15] & 1109655552) == 0 && (var13[var14][var15 - 1] & 1084489728) == 0) {
               class56.field2315[var20] = var5 - 1;
               class56.field2312[var20] = var6 - 1;
               var20 = var20 + 1 & 4095;
               class56.field2314[var18 - 1][var19 - 1] = 3;
               class56.field2318[var18 - 1][var19 - 1] = var16;
            }

            if (var18 < 127 && var19 > 0 && class56.field2314[1 + var18][var19 - 1] == 0 && (var13[var14 + 1][var15 - 1] & 1625554944) == 0 && (var13[var14 + 1][var15] & 1612972032) == 0 && (var13[var14][var15 - 1] & 1084489728) == 0) {
               class56.field2315[var20] = var5 + 1;
               class56.field2312[var20] = var6 - 1;
               var20 = var20 + 1 & 4095;
               class56.field2314[1 + var18][var19 - 1] = 9;
               class56.field2318[var18 + 1][var19 - 1] = var16;
            }

            if (var18 > 0 && var19 < 127 && class56.field2314[var18 - 1][1 + var19] == 0 && (var13[var14 - 1][1 + var15] & 1310982144) == 0 && (var13[var14 - 1][var15] & 1109655552) == 0 && (var13[var14][1 + var15] & 1210318848) == 0) {
               class56.field2315[var20] = var5 - 1;
               class56.field2312[var20] = var6 + 1;
               var20 = var20 + 1 & 4095;
               class56.field2314[var18 - 1][var19 + 1] = 6;
               class56.field2318[var18 - 1][1 + var19] = var16;
            }

            if (var18 < 127 && var19 < 127 && class56.field2314[1 + var18][1 + var19] == 0 && (var13[1 + var14][1 + var15] & 2015625216) == 0 && (var13[1 + var14][var15] & 1612972032) == 0 && (var13[var14][var15 + 1] & 1210318848) == 0) {
               class56.field2315[var20] = 1 + var5;
               class56.field2312[var20] = 1 + var6;
               var20 = var20 + 1 & 4095;
               class56.field2314[var18 + 1][1 + var19] = 12;
               class56.field2318[var18 + 1][1 + var19] = var16;
            }
         }

         class56.field2316 = 1021042197 * var5;
         class78.field1500 = -575994451 * var6;
         return false;
      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "nt.f(" + ')');
      }
   }
}
