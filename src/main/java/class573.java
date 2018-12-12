import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

public class class573 extends class571 {
   VorbisInfo field102 = new VorbisInfo();
   VorbisComment field103 = new VorbisComment();
   VorbisBlock field104;
   static int field105;
   class91 field106;
   class977 field107;
   double field108;
   int field109;
   static int field110;
   DSPState field111;

   void method23(OggPacket var1, int var2) {
      try {
         if (this.field38 * -1312498565 < 3) {
            int var7 = this.field102.headerIn(this.field103, var1);
            if (var7 < 0) {
               throw new IllegalStateException("" + var7);
            }

            if (-1312498565 * this.field38 == 2) {
               if (this.field102.channels > 2 || this.field102.channels < 1) {
                  throw new RuntimeException("" + this.field102.channels);
               }

               this.field111 = new DSPState(this.field102);
               this.field104 = new VorbisBlock(this.field111);
               this.field106 = new class91(this.field102.rate, 1164070869 * class752.field4179);
               this.field107 = new class977(this.field102.channels);
            }
         } else {
            if (this.field104.synthesis(var1) == 0) {
               this.field111.blockIn(this.field104);
            }

            float[][] var3 = this.field111.pcmOut(this.field102.channels);
            this.field108 = this.field111.granuleTime();
            if (-1.0D == this.field108) {
               this.field108 = (double)((float)(253299067 * this.field109) / (float)this.field102.rate);
            }

            this.field111.read(var3[0].length);
            this.field109 += var3[0].length * -87069261;
            class784 var4 = this.field107.method1806(var3[0].length, this.field108);
            class299.method6556(var3, var4.field3953, (byte)-17);

            for(int var5 = 0; var5 < this.field102.channels; ++var5) {
               var4.field3953[var5] = this.field106.method492(var4.field3953[var5], (byte)3);
            }

            this.field107.method1808(var4, -1634784761);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aiy.f(" + ')');
      }
   }

   void method28() {
      if (this.field104 != null) {
         this.field104.f();
      }

      if (this.field111 != null) {
         this.field111.f();
      }

      this.field103.f();
      this.field102.f();
      if (this.field107 != null) {
         this.field107.method1809(1484582250);
      }

   }

   class573(OggStreamState var1) {
      super(var1);
   }

   void method24(int var1) {
      try {
         if (this.field104 != null) {
            this.field104.f();
         }

         if (this.field111 != null) {
            this.field111.f();
         }

         this.field103.f();
         this.field102.f();
         if (this.field107 != null) {
            this.field107.method1809(141709442);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aiy.b(" + ')');
      }
   }

   void method21() {
      if (this.field104 != null) {
         this.field104.f();
      }

      if (this.field111 != null) {
         this.field111.f();
      }

      this.field103.f();
      this.field102.f();
      if (this.field107 != null) {
         this.field107.method1809(-1123680185);
      }

   }

   void method25(OggPacket var1) {
      if (this.field38 * -1312498565 < 3) {
         int var5 = this.field102.headerIn(this.field103, var1);
         if (var5 < 0) {
            throw new IllegalStateException("" + var5);
         }

         if (-1312498565 * this.field38 == 2) {
            if (this.field102.channels > 2 || this.field102.channels < 1) {
               throw new RuntimeException("" + this.field102.channels);
            }

            this.field111 = new DSPState(this.field102);
            this.field104 = new VorbisBlock(this.field111);
            this.field106 = new class91(this.field102.rate, 1164070869 * class752.field4179);
            this.field107 = new class977(this.field102.channels);
         }
      } else {
         if (this.field104.synthesis(var1) == 0) {
            this.field111.blockIn(this.field104);
         }

         float[][] var2 = this.field111.pcmOut(this.field102.channels);
         this.field108 = this.field111.granuleTime();
         if (-1.0D == this.field108) {
            this.field108 = (double)((float)(253299067 * this.field109) / (float)this.field102.rate);
         }

         this.field111.read(var2[0].length);
         this.field109 += var2[0].length * -87069261;
         class784 var3 = this.field107.method1806(var2[0].length, this.field108);
         class299.method6556(var2, var3.field3953, (byte)-116);

         for(int var4 = 0; var4 < this.field102.channels; ++var4) {
            var3.field3953[var4] = this.field106.method492(var3.field3953[var4], (byte)12);
         }

         this.field107.method1808(var3, -585602714);
      }

   }

   void method26(OggPacket var1) {
      if (this.field38 * -1312498565 < 3) {
         int var5 = this.field102.headerIn(this.field103, var1);
         if (var5 < 0) {
            throw new IllegalStateException("" + var5);
         }

         if (-1312498565 * this.field38 == 2) {
            if (this.field102.channels > 2 || this.field102.channels < 1) {
               throw new RuntimeException("" + this.field102.channels);
            }

            this.field111 = new DSPState(this.field102);
            this.field104 = new VorbisBlock(this.field111);
            this.field106 = new class91(this.field102.rate, 1164070869 * class752.field4179);
            this.field107 = new class977(this.field102.channels);
         }
      } else {
         if (this.field104.synthesis(var1) == 0) {
            this.field111.blockIn(this.field104);
         }

         float[][] var2 = this.field111.pcmOut(this.field102.channels);
         this.field108 = this.field111.granuleTime();
         if (-1.0D == this.field108) {
            this.field108 = (double)((float)(253299067 * this.field109) / (float)this.field102.rate);
         }

         this.field111.read(var2[0].length);
         this.field109 += var2[0].length * -87069261;
         class784 var3 = this.field107.method1806(var2[0].length, this.field108);
         class299.method6556(var2, var3.field3953, (byte)-54);

         for(int var4 = 0; var4 < this.field102.channels; ++var4) {
            var3.field3953[var4] = this.field106.method492(var3.field3953[var4], (byte)-8);
         }

         this.field107.method1808(var3, -830115957);
      }

   }

   void method27(OggPacket var1) {
      if (this.field38 * -1312498565 < 3) {
         int var5 = this.field102.headerIn(this.field103, var1);
         if (var5 < 0) {
            throw new IllegalStateException("" + var5);
         }

         if (-1312498565 * this.field38 == 2) {
            if (this.field102.channels > 2 || this.field102.channels < 1) {
               throw new RuntimeException("" + this.field102.channels);
            }

            this.field111 = new DSPState(this.field102);
            this.field104 = new VorbisBlock(this.field111);
            this.field106 = new class91(this.field102.rate, 1164070869 * class752.field4179);
            this.field107 = new class977(this.field102.channels);
         }
      } else {
         if (this.field104.synthesis(var1) == 0) {
            this.field111.blockIn(this.field104);
         }

         float[][] var2 = this.field111.pcmOut(this.field102.channels);
         this.field108 = this.field111.granuleTime();
         if (-1.0D == this.field108) {
            this.field108 = (double)((float)(253299067 * this.field109) / (float)this.field102.rate);
         }

         this.field111.read(var2[0].length);
         this.field109 += var2[0].length * -87069261;
         class784 var3 = this.field107.method1806(var2[0].length, this.field108);
         class299.method6556(var2, var3.field3953, (byte)-23);

         for(int var4 = 0; var4 < this.field102.channels; ++var4) {
            var3.field3953[var4] = this.field106.method492(var3.field3953[var4], (byte)-76);
         }

         this.field107.method1808(var3, -1886056518);
      }

   }

   double method92(int var1) {
      try {
         double var2 = this.field108;
         if (this.field107 != null) {
            var2 = this.field107.method1812(1578639792);
            if (var2 < 0.0D) {
               var2 = this.field108;
            }
         }

         return var2 - (double)(256.0F / (float)(class752.field4179 * 1164070869));
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aiy.s(" + ')');
      }
   }

   public class977 method93(int var1) {
      try {
         return this.field107;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aiy.n(" + ')');
      }
   }

   int method94(int var1) {
      try {
         return this.field107 == null ? 0 : this.field107.method1805(920577613);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aiy.z(" + ')');
      }
   }
}
