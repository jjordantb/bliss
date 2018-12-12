import jaclib.ping.Ping;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

public class class405 implements Runnable {
   Thread field9225 = new Thread(this);
   Object field9226 = new Object();
   Queue field9227 = new LinkedList();

   public class559 method5472(String var1, byte var2) {
      try {
         if (this.field9225 == null) {
            throw new IllegalStateException("");
         } else if (var1 == null) {
            throw new IllegalArgumentException("");
         } else {
            class559 var3 = new class559(var1);
            this.method5473(var3, 1206892874);
            return var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qu.a(" + ')');
      }
   }

   void method5473(Object var1, int var2) {
      try {
         Queue var3 = this.field9227;
         synchronized(this.field9227) {
            this.field9227.add(var1);
            this.field9227.notify();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qu.b(" + ')');
      }
   }

   public void method5474(int var1) {
      try {
         if (this.field9225 != null) {
            this.method5473(this.field9226, 1206892874);

            try {
               this.field9225.join();
            } catch (InterruptedException var3) {
               ;
            }

            this.field9225 = null;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qu.f(" + ')');
      }
   }

   public class405() {
      this.field9225.setDaemon(true);
      this.field9225.start();
   }

   public void run() {
      try {
         while(true) {
            Queue var1 = this.field9227;
            class559 var4;
            synchronized(this.field9227) {
               Object var2;
               for(var2 = this.field9227.poll(); var2 == null; var2 = this.field9227.poll()) {
                  try {
                     this.field9227.wait();
                  } catch (InterruptedException var6) {
                     ;
                  }
               }

               if (this.field9226 == var2) {
                  return;
               }

               var4 = (class559)var2;
            }

            int var9;
            try {
               byte[] var10 = InetAddress.getByName(var4.field543).getAddress();
               var9 = Ping.a(var10[0], var10[1], var10[2], var10[3], 1000L);
            } catch (Throwable var5) {
               var9 = 1000;
            }

            var4.field544 = var9 * 842879005;
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "qu.run(" + ')');
      }
   }

   static final void method5475(class744 var0, int var1) {
      try {
         int var2 = var0.field3174[var0.field3176 * 1883543357];
         class14.field6693[var2] = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class379.method968(var2, (byte)0);
         class730.field2717 |= class474.field8271[var2];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qu.ag(" + ')');
      }
   }

   static final void method5476(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class85.field1121.method1566(var2).field4251 * -906758929;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qu.aai(" + ')');
      }
   }

   static final void method5477(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9136.method3689(-1832021198);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qu.akf(" + ')');
      }
   }

   public static String method5478(long var0) {
      try {
         if (var0 > 0L && var0 < 6582952005840035281L) {
            if (var0 % 37L == 0L) {
               return null;
            } else {
               int var2 = 0;

               for(long var3 = var0; var3 != 0L; var3 /= 37L) {
                  ++var2;
               }

               StringBuilder var5;
               char var8;
               for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
                  long var6 = var0;
                  var0 /= 37L;
                  var8 = class965.field2532[(int)(var6 - 37L * var0)];
                  if (var8 == '_') {
                     int var9 = var5.length() - 1;
                     var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                     var8 = ' ';
                  }
               }

               var5.reverse();
               var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
               return var5.toString();
            }
         } else {
            return null;
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "qu.b(" + ')');
      }
   }

   static final void method5479(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -1232467723 * var3.field1005;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qu.pv(" + ')');
      }
   }

   static final void method5480(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class506.method2602(var3, var4, var0, -1934689497);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qu.do(" + ')');
      }
   }
}
