import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class735 implements Runnable {
   int field3002;
   InputStream field3003;
   IOException field3004;
   byte[] field3005;
   int field3006 = 0;
   Thread field3007;
   int field3008 = 0;
   public static class677 field3009;

   void method1798(int var1) {
      try {
         this.field3003 = new class410();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ne.i(" + ')');
      }
   }

   public void run() {
      try {
         while(true) {
            int var2;
            synchronized(this) {
               while(true) {
                  if (this.field3004 != null) {
                     return;
                  }

                  if (this.field3008 == 0) {
                     var2 = this.field3002 - this.field3006 - 1;
                  } else if (this.field3008 <= this.field3006) {
                     var2 = this.field3002 - this.field3006;
                  } else {
                     var2 = this.field3008 - this.field3006 - 1;
                  }

                  if (var2 > 0) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var7) {
                     ;
                  }
               }
            }

            int var1;
            try {
               var1 = this.field3003.read(this.field3005, this.field3006, var2);
               if (-1 == var1) {
                  throw new EOFException();
               }
            } catch (IOException var8) {
               IOException var3 = var8;
               synchronized(this) {
                  this.field3004 = var3;
                  return;
               }
            }

            synchronized(this) {
               this.field3006 = (this.field3006 + var1) % this.field3002;
            }
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "ne.run(" + ')');
      }
   }

   boolean method1799(int var1, int var2) throws IOException {
      try {
         if (var1 > 0 && var1 < this.field3002) {
            synchronized(this) {
               int var4;
               if (this.field3008 <= this.field3006) {
                  var4 = this.field3006 - this.field3008;
               } else {
                  var4 = this.field3002 - this.field3008 + this.field3006;
               }

               boolean var5;
               if (var4 < var1) {
                  if (this.field3004 != null) {
                     throw new IOException(this.field3004.toString());
                  } else {
                     this.notifyAll();
                     var5 = false;
                     return var5;
                  }
               } else {
                  var5 = true;
                  return var5;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "ne.a(" + ')');
      }
   }

   int method1800(byte var1) throws IOException {
      try {
         synchronized(this) {
            int var3;
            if (this.field3008 <= this.field3006) {
               var3 = this.field3006 - this.field3008;
            } else {
               var3 = this.field3006 + (this.field3002 - this.field3008);
            }

            if (this.field3004 != null) {
               throw new IOException(this.field3004.toString());
            } else {
               this.notifyAll();
               return var3;
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ne.f(" + ')');
      }
   }

   void method1801(int var1) {
      try {
         synchronized(this) {
            if (this.field3004 == null) {
               this.field3004 = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.field3007.join();
         } catch (InterruptedException var3) {
            ;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ne.p(" + ')');
      }
   }

   int method1802(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
            synchronized(this) {
               int var6;
               if (this.field3008 <= this.field3006) {
                  var6 = this.field3006 - this.field3008;
               } else {
                  var6 = this.field3002 - this.field3008 + this.field3006;
               }

               if (var3 > var6) {
                  var3 = var6;
               }

               if (var3 == 0 && this.field3004 != null) {
                  throw new IOException(this.field3004.toString());
               } else {
                  if (this.field3008 + var3 <= this.field3002) {
                     System.arraycopy(this.field3005, this.field3008, var1, var2, var3);
                  } else {
                     int var7 = this.field3002 - this.field3008;
                     System.arraycopy(this.field3005, this.field3008, var1, var2, var7);
                     System.arraycopy(this.field3005, 0, var1, var2 + var7, var3 - var7);
                  }

                  this.field3008 = (this.field3008 + var3) % this.field3002;
                  this.notifyAll();
                  return var3;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ne.b(" + ')');
      }
   }

   class735(InputStream var1, int var2) {
      this.field3003 = var1;
      this.field3002 = var2 + 1;
      this.field3005 = new byte[this.field3002];
      this.field3007 = new Thread(this);
      this.field3007.setDaemon(true);
      this.field3007.start();
   }

   static final void method1803(int var0, NodeTable var1, int var2) {
      try {
         if (-1 != var0 && var1.method2942((long)var0) == null) {
            var1.method2947(new Node(), (long)var0);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ne.d(" + ')');
      }
   }
}
