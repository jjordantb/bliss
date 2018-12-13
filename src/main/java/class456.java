import java.awt.Component;

public class class456 {
   int[] field7156;
   int[] field7157;
   int[] field7158;
   int[] field7159;
   int[] field7160;
   int[] field7161;
   int[] field7162;
   public static int field7163;

   void method3790(int var1, int var2) {
      try {
         int[][] var3 = new int[this.field7160.length << 1][4];

         for(int var4 = 0; var4 < this.field7160.length; ++var4) {
            var3[var4 * 2][0] = this.field7160[var4];
            var3[2 * var4][1] = this.field7157[var4];
            var3[2 * var4][2] = this.field7158[var4];
            var3[2 * var4][3] = this.field7162[var4];
            var3[1 + 2 * var4][0] = this.field7159[var4];
            var3[1 + var4 * 2][1] = this.field7156[var4];
            var3[1 + 2 * var4][2] = this.field7161[var4];
            var3[2 * var4 + 1][3] = this.field7162[var4];
         }

         class730.field2748[var1] = var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "da.a(" + ')');
      }
   }

   class456(InputStream var1) {
      int var2 = var1.method6382(1723054621);
      this.field7160 = new int[var2];
      this.field7157 = new int[var2];
      this.field7158 = new int[var2];
      this.field7162 = new int[var2];
      this.field7159 = new int[var2];
      this.field7156 = new int[var2];
      this.field7161 = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.field7160[var3] = var1.method6374() - 5120;
         this.field7158[var3] = var1.method6374() - 5120;
         this.field7157[var3] = var1.method6367(1563719109);
         this.field7159[var3] = var1.method6374() - 5120;
         this.field7161[var3] = var1.method6374() - 5120;
         this.field7156[var3] = var1.method6367(2133929202);
         this.field7162[var3] = var1.method6367(1967809784);
      }

   }

   public static final class752 method3791(Component var0, int var1, int var2, int var3) {
      try {
         if (class752.field4179 == 0) {
            throw new IllegalStateException();
         } else if (var1 >= 0 && var1 < 2) {
            if (var2 < 256) {
               var2 = 256;
            }

            class429 var6;
            try {
               class429 var4 = new class429();
               var4.field4172 = new int[(class752.field4167 ? 2 : 1) * 256];
               var4.field4191 = var2;
               var4.method2629(var0, (byte)127);
               var4.field4166 = (var2 & -1024) + 1024;
               if (var4.field4166 > 16384) {
                  var4.field4166 = 16384;
               }

               var4.method2630(var4.field4166, 557897773);
               if (class752.field4168 > 0 && class752.field4177 == null) {
                  class752.field4177 = new class302();
                  Thread var5 = new Thread(class752.field4177);
                  var5.setDaemon(true);
                  var5.start();
                  var5.setPriority(class752.field4168);
               }

               if (class752.field4177 != null) {
                  if (class752.field4177.field9264[var1] != null) {
                     throw new IllegalArgumentException();
                  }

                  class752.field4177.field9264[var1] = var4;
               }

               var6 = var4;
            } catch (Throwable var7) {
               return new class752();
            }

            return var6;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "da.f(" + ')');
      }
   }

   static final void method3792(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
      try {
         var0.field953 = (String)var2.field3157[--var2.field3158];
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "da.js(" + ')');
      }
   }

   static final void method3793(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (class740.field3211 != null) {
            Node var3 = class740.field3211.method2942((long)var2);
            var0.field3161[++var0.field3156 - 1] = var3 != null ? 1 : 0;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "da.aey(" + ')');
      }
   }

   static void method3794(class497 var0, int var1) {
      try {
         boolean var2 = false;
         var0.method156(-1845829409);

         for(class497 var3 = (class497)class602.field8649.method2706(-1268764084); var3 != null; var3 = (class497)class602.field8649.method2707(-1549897657)) {
            if (class871.method5899(var0.method4501(-610126190), var3.method4501(-1229609996), -537262415)) {
               class599.method1287(var0, var3, -1541675772);
               var2 = true;
               break;
            }
         }

         if (!var2) {
            class602.field8649.method2704(var0, (byte)-51);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "da.h(" + ')');
      }
   }

   static final void method3795(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class250.method4387(var3, var4, var0, -535116520);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "da.fv(" + ')');
      }
   }
}
