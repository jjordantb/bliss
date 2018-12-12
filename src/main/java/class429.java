import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;

public class class429 extends class752 {
   byte[] field7408;
   SourceDataLine field7409;
   int field7410;
   AudioFormat field7411;
   boolean field7412 = false;
   public static class180 field7413;

   int method4137() {
      return -975542179 * this.field7410 - (this.field7409.available() >> (field4167 ? 2 : 1));
   }

   void method2629(Component var1, byte var2) {
      try {
         Info[] var3 = AudioSystem.getMixerInfo();
         if (var3 != null) {
            Info[] var4 = var3;

            for(int var5 = 0; var5 < var4.length; ++var5) {
               Info var6 = var4[var5];
               if (var6 != null) {
                  String var7 = var6.getName();
                  if (var7 != null && var7.toLowerCase().indexOf("soundmax") >= 0) {
                     this.field7412 = true;
                  }
               }
            }
         }

         this.field7411 = new AudioFormat((float)(1164070869 * field4179), 16, field4167 ? 2 : 1, true, false);
         this.field7408 = new byte[256 << (field4167 ? 2 : 1)];
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "aas.q(" + ')');
      }
   }

   void method4138() throws LineUnavailableException {
      this.field7409.flush();
      if (this.field7412) {
         this.field7409.close();
         this.field7409 = null;
         javax.sound.sampled.DataLine.Info var1 = null;
         var1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.field7411, this.field7410 * -975542179 << (field4167 ? 2 : 1));
         this.field7409 = (SourceDataLine)AudioSystem.getLine(var1);
         this.field7409.open();
         this.field7409.start();
      }

   }

   int method2634(int var1) {
      try {
         return -975542179 * this.field7410 - (this.field7409.available() >> (field4167 ? 2 : 1));
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aas.s(" + ')');
      }
   }

   void method2631() {
      int var1 = 256;
      if (field4167) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field4172[var2];
         if ((8388608 + var3 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field7408[2 * var2] = (byte)(var3 >> 8);
         this.field7408[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.field7409.write(this.field7408, 0, var1 << 1);
   }

   void method2632(int var1) {
      try {
         if (this.field7409 != null) {
            this.field7409.close();
            this.field7409 = null;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aas.y(" + ')');
      }
   }

   void method2633(short var1) throws LineUnavailableException {
      try {
         this.field7409.flush();
         if (this.field7412) {
            this.field7409.close();
            this.field7409 = null;
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.field7411, this.field7410 * -975542179 << (field4167 ? 2 : 1));
            this.field7409 = (SourceDataLine)AudioSystem.getLine(var2);
            this.field7409.open();
            this.field7409.start();
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aas.t(" + ')');
      }
   }

   void method4139(Component var1) {
      Info[] var2 = AudioSystem.getMixerInfo();
      if (var2 != null) {
         Info[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            Info var5 = var3[var4];
            if (var5 != null) {
               String var6 = var5.getName();
               if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                  this.field7412 = true;
               }
            }
         }
      }

      this.field7411 = new AudioFormat((float)(1164070869 * field4179), 16, field4167 ? 2 : 1, true, false);
      this.field7408 = new byte[256 << (field4167 ? 2 : 1)];
   }

   void method4140(int var1) throws LineUnavailableException {
      try {
         javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.field7411, var1 << (field4167 ? 2 : 1));
         this.field7409 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field7409.open();
         this.field7409.start();
         this.field7410 = var1 * 1460972533;
      } catch (LineUnavailableException var3) {
         if (class526.method2223(var1, -2116869304) == 1) {
            this.field7409 = null;
            throw var3;
         }

         this.method2630(class18.method3687(var1, (byte)16), 1699827460);
      }

   }

   void method4141(int var1) throws LineUnavailableException {
      try {
         javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.field7411, var1 << (field4167 ? 2 : 1));
         this.field7409 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field7409.open();
         this.field7409.start();
         this.field7410 = var1 * 1460972533;
      } catch (LineUnavailableException var3) {
         if (class526.method2223(var1, -409743758) == 1) {
            this.field7409 = null;
            throw var3;
         }

         this.method2630(class18.method3687(var1, (byte)16), 1094341768);
      }

   }

   void method4142() throws LineUnavailableException {
      this.field7409.flush();
      if (this.field7412) {
         this.field7409.close();
         this.field7409 = null;
         javax.sound.sampled.DataLine.Info var1 = null;
         var1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.field7411, this.field7410 * -975542179 << (field4167 ? 2 : 1));
         this.field7409 = (SourceDataLine)AudioSystem.getLine(var1);
         this.field7409.open();
         this.field7409.start();
      }

   }

   void method2630(int var1, int var2) throws LineUnavailableException {
      try {
         javax.sound.sampled.DataLine.Info var3 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.field7411, var1 << (field4167 ? 2 : 1));
         this.field7409 = (SourceDataLine)AudioSystem.getLine(var3);
         this.field7409.open();
         this.field7409.start();
         this.field7410 = var1 * 1460972533;
      } catch (LineUnavailableException var4) {
         if (class526.method2223(var1, 970764696) == 1) {
            this.field7409 = null;
            throw var4;
         }

         this.method2630(class18.method3687(var1, (byte)16), 1535957198);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aas.n(" + ')');
      }

   }

   void method4143() {
      if (this.field7409 != null) {
         this.field7409.close();
         this.field7409 = null;
      }

   }

   void method4144() {
      int var1 = 256;
      if (field4167) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field4172[var2];
         if ((8388608 + var3 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field7408[2 * var2] = (byte)(var3 >> 8);
         this.field7408[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.field7409.write(this.field7408, 0, var1 << 1);
   }

   void method4145() {
      int var1 = 256;
      if (field4167) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field4172[var2];
         if ((8388608 + var3 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field7408[2 * var2] = (byte)(var3 >> 8);
         this.field7408[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.field7409.write(this.field7408, 0, var1 << 1);
   }

   void method4146() {
      int var1 = 256;
      if (field4167) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field4172[var2];
         if ((8388608 + var3 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field7408[2 * var2] = (byte)(var3 >> 8);
         this.field7408[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.field7409.write(this.field7408, 0, var1 << 1);
   }

   static final void method4147(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)-36);
         class131 var4 = class382.field1410[var2 >> 16];
         class649.method5545(var3, var4, var0, -1432183738);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aas.eb(" + ')');
      }
   }
}
