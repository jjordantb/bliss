import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Iterator;

public final class class4 {
   public static boolean field4946;

   class4() throws Throwable {
      throw new Error();
   }

   static final void method2962(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         long var2 = (long)var0.field3161[var0.field3156 * 681479919];
         long var4 = (long)var0.field3161[var0.field3156 * 681479919 + 1];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int)(var2 + var2 * var4 / 100L);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "qw.yx(" + ')');
      }
   }

   static final void method2963(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         int var2 = var0.field3161[681479919 * var0.field3156];
         int var3 = var0.field3161[var0.field3156 * 681479919 + 1];
         if (class382.field1410[var2] == null) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class382.field1410[var2].field1103[var3].field866 * -914988669;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qw.ale(" + ')');
      }
   }

   static final void method2964(boolean var0, int var1) {
      try {
         Client.field2689 = 0;
         Client.field2789 = 0;
         Client.field2688 += 1968119283;
         class603.method5083(1694864911);
         class823.method5362(var0, -775686729);
         class253.method4480((short)-6102);
         boolean var2 = false;

         int var3;
         int var4;
         for(var3 = 0; var3 < Client.field2689 * -1508392173; ++var3) {
            var4 = Client.field2690[var3];
            class437 var5 = (class437) Client.field2677.method2942((long)var4);
            class60 var6 = (class60)var5.field7515;
            if (-1402769421 * var6.field4039 != Client.field2688 * 440189755) {
               if (class602.field8645 && class779.method2322(var4, 351851633)) {
                  class979.method1835(2025307040);
               }

               if (var6.field1637.method6112((byte)32)) {
                  class153.method3396(var6, (byte)35);
               }

               var6.method1248((class401)null, 1734282756);
               var5.method545(-1460969981);
               var2 = true;
            }
         }

         if (var2) {
            var3 = 1962237353 * Client.field2753;
            Client.field2753 = Client.field2677.method2944(1946710966) * -118843751;
            var4 = 0;

            class437 var9;
            for(Iterator var8 = Client.field2677.iterator(); var8.hasNext(); Client.field2797[var4++] = var9) {
               var9 = (class437)var8.next();
            }

            for(int var10 = Client.field2753 * 1962237353; var10 < var3; ++var10) {
               Client.field2797[var10] = null;
            }
         }

         int var10000 = Client.field2692.field7768.field10376;
         var10000 = Client.field2692.field7771;

         for(var3 = 0; var3 < -1230451913 * Client.field2684; ++var3) {
            Client.field2677.method2942((long) Client.field2680[var3]);
         }

         var10000 = Client.field2753;
         var10000 = Client.field2684;

         for(var3 = 0; var3 < Client.field2753 * 1962237353; ++var3) {
            var10000 = ((class746) Client.field2797[var3].field7515).field4039;
            var10000 = Client.field2688;
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "qw.jq(" + ')');
      }
   }

   public static final void method2965(int var0, String var1, Color var2, Color var3, Color var4, byte var5) {
      try {
         try {
            Graphics var6 = class837.field9161.getGraphics();
            if (class56.field2320 == null) {
               class56.field2320 = new Font("Helvetica", 1, 13);
            }

            if (var2 == null) {
               var2 = new Color(140, 17, 17);
            }

            if (var3 == null) {
               var3 = new Color(140, 17, 17);
            }

            if (var4 == null) {
               var4 = new Color(255, 255, 255);
            }

            int var8;
            int var9;
            try {
               if (class654.field9352 == null) {
                  class654.field9352 = class837.field9161.createImage(-2110394505 * class759.field4331, class97.field614 * -1111710645);
               }

               Graphics var7 = class654.field9352.getGraphics();
               var7.setColor(Color.black);
               var7.fillRect(0, 0, -2110394505 * class759.field4331, class97.field614 * -1111710645);
               var8 = class759.field4331 * -2110394505 / 2 - 152;
               var9 = -1111710645 * class97.field614 / 2 - 18;
               var7.setColor(var3);
               var7.drawRect(var8, var9, 303, 33);
               var7.setColor(var2);
               var7.fillRect(var8 + 2, var9 + 2, var0 * 3, 30);
               var7.setColor(Color.black);
               var7.drawRect(var8 + 1, var9 + 1, 301, 31);
               var7.fillRect(var0 * 3 + 2 + var8, var9 + 2, 300 - 3 * var0, 30);
               var7.setFont(class56.field2320);
               var7.setColor(var4);
               var7.drawString(var1, var8 + (304 - var1.length() * 6) / 2, 22 + var9);
               if (class69.field1825 != null) {
                  var7.setFont(class56.field2320);
                  var7.setColor(var4);
                  var7.drawString(class69.field1825, -2110394505 * class759.field4331 / 2 - class69.field1825.length() * 6 / 2, class97.field614 * -1111710645 / 2 - 26);
               }

               var6.drawImage(class654.field9352, 0, 0, (ImageObserver)null);
            } catch (Exception var10) {
               var6.setColor(Color.black);
               var6.fillRect(0, 0, -2110394505 * class759.field4331, class97.field614 * -1111710645);
               var8 = -2110394505 * class759.field4331 / 2 - 152;
               var9 = class97.field614 * -1111710645 / 2 - 18;
               var6.setColor(var3);
               var6.drawRect(var8, var9, 303, 33);
               var6.setColor(var2);
               var6.fillRect(var8 + 2, var9 + 2, 3 * var0, 30);
               var6.setColor(Color.black);
               var6.drawRect(var8 + 1, 1 + var9, 301, 31);
               var6.fillRect(var0 * 3 + var8 + 2, 2 + var9, 300 - var0 * 3, 30);
               var6.setFont(class56.field2320);
               var6.setColor(var4);
               if (class69.field1825 != null) {
                  var6.setFont(class56.field2320);
                  var6.setColor(var4);
                  var6.drawString(class69.field1825, class759.field4331 * -2110394505 / 2 - class69.field1825.length() * 6 / 2, class97.field614 * -1111710645 / 2 - 26);
               }

               var6.drawString(var1, var8 + (304 - var1.length() * 6) / 2, 22 + var9);
            }
         } catch (Exception var11) {
            class837.field9161.repaint();
         }

      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "qw.av(" + ')');
      }
   }
}
