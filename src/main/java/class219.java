import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class class219 {
   int[] field7277;
   static int field7278 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"�$%^&*()-_=+[{]};:'@#~,<.>/?\\| ��������������������������������������������������".length();
   static int[] field7279 = new int[256];
   boolean field7280 = false;
   class48[] field7281;
   int field7282;
   static String field7283 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"�$%^&*()-_=+[{]};:'@#~,<.>/?\\| ��������������������������������������������������";
   int field7284;
   int[] field7285 = new int[4];

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"�$%^&*()-_=+[{]};:'@#~,<.>/?\\| ��������������������������������������������������".indexOf(var0);
         if (var1 == -1) {
            var1 = 74;
         }

         field7279[var0] = var1;
      }

   }

   void method3968(class848 var1, String var2, int[] var3, int var4, int var5, int var6, boolean var7) {
      if (var6 == 0) {
         var7 = false;
      }

      var6 |= -16777216;

      for(int var8 = 0; var8 < var2.length(); ++var8) {
         int var9 = field7279[var2.charAt(var8)];
         if (var7) {
            this.field7281[var9].method3114(var4 + 1, var5 + 1, 0, -16777216, 1);
         }

         this.field7281[var9].method3114(var4, var5, 0, var6, 1);
         var4 += this.field7277[var9];
      }

   }

   void method3969(class848 var1, Font var2, FontMetrics var3, char var4, int var5, boolean var6) {
      int var7 = var3.charWidth(var4);
      int var8 = var7;
      if (var6) {
         try {
            if (var4 == '/') {
               var6 = false;
            }

            if (var4 == 'f' || var4 == 't' || var4 == 'w' || var4 == 'v' || var4 == 'k' || var4 == 'x' || var4 == 'y' || var4 == 'A' || var4 == 'V' || var4 == 'W') {
               ++var7;
            }
         } catch (Exception var22) {
            ;
         }
      }

      int var9 = var3.getMaxAscent();
      int var10 = var3.getMaxAscent() + var3.getMaxDescent();
      int var11 = var3.getHeight();
      Image var12 = class837.field9161.createImage(var7, var10);
      Graphics var13 = var12.getGraphics();
      var13.setColor(Color.black);
      var13.fillRect(0, 0, var7, var10);
      var13.setColor(Color.white);
      var13.setFont(var2);
      var13.drawString(var4 + "", 0, var9);
      if (var6) {
         var13.drawString(var4 + "", 1, var9);
      }

      int[] var14 = new int[var7 * var10];
      PixelGrabber var15 = new PixelGrabber(var12, 0, 0, var7, var10, var14, 0, var7);

      try {
         var15.grabPixels();
      } catch (Exception var21) {
         ;
      }

      var12.flush();
      Object var16 = null;
      int var17 = 0;

      int var18;
      label66:
      for(var18 = 0; var18 < var10; ++var18) {
         for(int var19 = 0; var19 < var7; ++var19) {
            int var20 = var14[var19 + var18 * var7];
            if ((var20 & 16777215) != 0) {
               var17 = var18;
               break label66;
            }
         }
      }

      for(var18 = 0; var18 < var14.length; ++var18) {
         if ((var14[var18] & 16777215) == 0) {
            var14[var18] = 0;
         }
      }

      this.field7284 = var9 - var17;
      this.field7282 = var11;
      this.field7277[var5] = var8;
      this.field7281[var5] = var1.method4854(var14, 0, var7, var7, var10, -939201391);
   }

   int method3970() {
      return this.field7284;
   }

   int method3971(String var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         int var4 = field7279[var1.charAt(var3)];
         var2 += this.field7277[var4];
      }

      return var2;
   }

   class219(class848 var1, int var2, boolean var3, Component var4) {
      this.field7280 = false;
      this.field7281 = new class48[256];
      this.field7277 = new int[256];
      Font var5 = new Font("Helvetica", var3 ? 1 : 0, var2);
      FontMetrics var6 = var4.getFontMetrics(var5);

      int var7;
      for(var7 = 0; var7 < field7278; ++var7) {
         this.method3969(var1, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"�$%^&*()-_=+[{]};:'@#~,<.>/?\\| ��������������������������������������������������".charAt(var7), var7, false);
      }

      if (var3 && this.field7280) {
         this.field7280 = false;
         var5 = new Font("Helvetica", 0, var2);
         var6 = var4.getFontMetrics(var5);

         for(var7 = 0; var7 < field7278; ++var7) {
            this.method3969(var1, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"�$%^&*()-_=+[{]};:'@#~,<.>/?\\| ��������������������������������������������������".charAt(var7), var7, false);
         }

         if (!this.field7280) {
            this.field7280 = false;

            for(var7 = 0; var7 < field7278; ++var7) {
               this.method3969(var1, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"�$%^&*()-_=+[{]};:'@#~,<.>/?\\| ��������������������������������������������������".charAt(var7), var7, true);
            }
         }
      }

   }

   void method3972(class848 var1, String var2, int var3, int var4, int var5, boolean var6) {
      int var7 = this.method3971(var2) / 2;
      var1.method4830(this.field7285);
      if (var3 - var7 <= this.field7285[2] && var3 + var7 >= this.field7285[0] && var4 - this.field7284 <= this.field7285[3] && var4 + this.field7282 >= this.field7285[1]) {
         this.method3968(var1, var2, this.field7285, var3 - var7, var4, var5, var6);
      }

   }

   int method3973() {
      return this.field7282 - 1;
   }
}
