public class class227 {
   int field7305 = 0;
   public static int field7306 = 64;
   static int field7307 = 10;
   static String field7308 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886";
   static long[][] field7309 = new long[8][256];
   static long[] field7310 = new long[11];
   byte[] field7311 = new byte[32];
   byte[] field7312 = new byte[64];
   static int field7313 = 512;
   int field7314 = 0;
   long[] field7315 = new long[8];
   long[] field7316 = new long[8];
   long[] field7317 = new long[8];
   long[] field7318 = new long[8];
   long[] field7319 = new long[8];

   static {
      int var0;
      for(var0 = 0; var0 < 256; ++var0) {
         char var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
         long var2 = (var0 & 1) == 0 ? (long)(var1 >>> 8) : (long)(var1 & 255);
         long var4 = var2 << 1;
         if (var4 >= 256L) {
            var4 ^= 285L;
         }

         long var6 = var4 << 1;
         if (var6 >= 256L) {
            var6 ^= 285L;
         }

         long var8 = var6 ^ var2;
         long var10 = var6 << 1;
         if (var10 >= 256L) {
            var10 ^= 285L;
         }

         long var12 = var10 ^ var2;
         field7309[0][var0] = var2 << 56 | var2 << 48 | var6 << 40 | var2 << 32 | var10 << 24 | var8 << 16 | var4 << 8 | var12;

         for(int var14 = 1; var14 < 8; ++var14) {
            field7309[var14][var0] = field7309[var14 - 1][var0] >>> 8 | field7309[var14 - 1][var0] << 56;
         }
      }

      field7310[0] = 0L;

      for(var0 = 1; var0 <= 10; ++var0) {
         int var15 = (var0 - 1) * 8;
         field7310[var0] = field7309[0][var15] & -72057594037927936L ^ field7309[1][var15 + 1] & 71776119061217280L ^ field7309[2][2 + var15] & 280375465082880L ^ field7309[3][var15 + 3] & 1095216660480L ^ field7309[4][4 + var15] & 4278190080L ^ field7309[5][5 + var15] & 16711680L ^ field7309[6][6 + var15] & 65280L ^ field7309[7][7 + var15] & 255L;
      }

   }

   void method4010(int var1) {
      try {
         int var2;
         for(var2 = 0; var2 < 32; ++var2) {
            this.field7311[var2] = 0;
         }

         this.field7314 = 0;
         this.field7305 = 0;
         this.field7312[0] = 0;

         for(var2 = 0; var2 < 8; ++var2) {
            this.field7316[var2] = 0L;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "st.f(" + ')');
      }
   }

   void method4011(byte[] var1, long var2) {
      try {
         int var4 = 0;
         int var5 = 8 - ((int)var2 & 7) & 7;
         int var6 = this.field7305 * 1985592997 & 7;
         long var7 = var2;
         int var9 = 31;

         for(int var10 = 0; var9 >= 0; --var9) {
            var10 += (this.field7311[var9] & 255) + ((int)var7 & 255);
            this.field7311[var9] = (byte)var10;
            var10 >>>= 8;
            var7 >>>= 8;
         }

         int var11;
         while(var2 > 8L) {
            var11 = var1[var4] << var5 & 255 | (var1[1 + var4] & 255) >>> 8 - var5;
            if (var11 < 0 || var11 >= 256) {
               throw new RuntimeException();
            }

            this.field7312[this.field7314 * 1412698381] = (byte)(this.field7312[this.field7314 * 1412698381] | var11 >>> var6);
            this.field7314 += -715643451;
            this.field7305 += (8 - var6) * 833616173;
            if (512 == 1985592997 * this.field7305) {
               this.method4013((byte)4);
               this.field7314 = 0;
               this.field7305 = 0;
            }

            this.field7312[1412698381 * this.field7314] = (byte)(var11 << 8 - var6 & 255);
            this.field7305 += 833616173 * var6;
            var2 -= 8L;
            ++var4;
         }

         if (var2 > 0L) {
            var11 = var1[var4] << var5 & 255;
            this.field7312[1412698381 * this.field7314] = (byte)(this.field7312[1412698381 * this.field7314] | var11 >>> var6);
         } else {
            var11 = 0;
         }

         if (var2 + (long)var6 < 8L) {
            this.field7305 = (int)((long)this.field7305 + 833616173L * var2);
         } else {
            this.field7314 += -715643451;
            this.field7305 += (8 - var6) * 833616173;
            var2 -= (long)(8 - var6);
            if (1985592997 * this.field7305 == 512) {
               this.method4013((byte)4);
               this.field7314 = 0;
               this.field7305 = 0;
            }

            this.field7312[1412698381 * this.field7314] = (byte)(var11 << 8 - var6 & 255);
            this.field7305 += 833616173 * (int)var2;
         }

      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "st.b(" + ')');
      }
   }

   void method4012(byte[] var1, int var2, int var3) {
      try {
         this.field7312[this.field7314 * 1412698381] = (byte)(this.field7312[this.field7314 * 1412698381] | 128 >>> (1985592997 * this.field7305 & 7));
         this.field7314 += -715643451;
         if (1412698381 * this.field7314 > 32) {
            while(true) {
               if (this.field7314 * 1412698381 >= 64) {
                  this.method4013((byte)4);
                  this.field7314 = 0;
                  break;
               }

               this.field7312[(this.field7314 += -715643451) * 1412698381 - 1] = 0;
            }
         }

         while(this.field7314 * 1412698381 < 32) {
            this.field7312[(this.field7314 += -715643451) * 1412698381 - 1] = 0;
         }

         System.arraycopy(this.field7311, 0, this.field7312, 32, 32);
         this.method4013((byte)4);
         int var4 = 0;

         for(int var5 = var2; var4 < 8; var5 += 8) {
            long var6 = this.field7316[var4];
            var1[var5] = (byte)((int)(var6 >>> 56));
            var1[1 + var5] = (byte)((int)(var6 >>> 48));
            var1[var5 + 2] = (byte)((int)(var6 >>> 40));
            var1[var5 + 3] = (byte)((int)(var6 >>> 32));
            var1[var5 + 4] = (byte)((int)(var6 >>> 24));
            var1[5 + var5] = (byte)((int)(var6 >>> 16));
            var1[var5 + 6] = (byte)((int)(var6 >>> 8));
            var1[7 + var5] = (byte)((int)var6);
            ++var4;
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "st.p(" + ')');
      }
   }

   void method4013(byte var1) {
      try {
         int var2 = 0;

         int var3;
         for(var3 = 0; var2 < 8; var3 += 8) {
            this.field7318[var2] = (long)this.field7312[var3] << 56 ^ ((long)this.field7312[1 + var3] & 255L) << 48 ^ ((long)this.field7312[2 + var3] & 255L) << 40 ^ ((long)this.field7312[var3 + 3] & 255L) << 32 ^ ((long)this.field7312[4 + var3] & 255L) << 24 ^ ((long)this.field7312[5 + var3] & 255L) << 16 ^ ((long)this.field7312[6 + var3] & 255L) << 8 ^ (long)this.field7312[7 + var3] & 255L;
            ++var2;
         }

         for(var2 = 0; var2 < 8; ++var2) {
            this.field7319[var2] = this.field7318[var2] ^ (this.field7315[var2] = this.field7316[var2]);
         }

         for(var2 = 1; var2 <= 10; ++var2) {
            int var4;
            int var5;
            for(var3 = 0; var3 < 8; ++var3) {
               this.field7317[var3] = 0L;
               var4 = 0;

               for(var5 = 56; var4 < 8; var5 -= 8) {
                  this.field7317[var3] ^= field7309[var4][(int)(this.field7315[var3 - var4 & 7] >>> var5) & 255];
                  ++var4;
               }
            }

            for(var3 = 0; var3 < 8; ++var3) {
               this.field7315[var3] = this.field7317[var3];
            }

            this.field7315[0] ^= field7310[var2];

            for(var3 = 0; var3 < 8; ++var3) {
               this.field7317[var3] = this.field7315[var3];
               var4 = 0;

               for(var5 = 56; var4 < 8; var5 -= 8) {
                  this.field7317[var3] ^= field7309[var4][(int)(this.field7319[var3 - var4 & 7] >>> var5) & 255];
                  ++var4;
               }
            }

            for(var3 = 0; var3 < 8; ++var3) {
               this.field7319[var3] = this.field7317[var3];
            }
         }

         for(var2 = 0; var2 < 8; ++var2) {
            this.field7316[var2] ^= this.field7319[var2] ^ this.field7318[var2];
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "st.a(" + ')');
      }
   }

   public static void method4014(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (var2 == var3) {
            class56.method1548(var0, var1, var2, var4, var5, var6, -790065680);
         } else if (var0 - var2 >= -1424479739 * class465.field1416 && var2 + var0 <= class465.field1413 * 1135094847 && var1 - var3 >= 1155384281 * class465.field1414 && var1 + var3 <= -1062447355 * class465.field1415) {
            class630.method5892(var0, var1, var2, var3, var4, var5, var6, (byte)121);
         } else {
            class383.method1099(var0, var1, var2, var3, var4, var5, var6, -568588475);
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "st.ae(" + ')');
      }
   }

   static void method4015(class848 var0, int var1, int var2, class564 var3, int var4, int var5) {
      try {
         for(int var6 = 7; var6 >= 0; --var6) {
            for(int var7 = 127; var7 >= 0; --var7) {
               int var8 = (var4 & 63) << 10 | (var6 & 7) << 7 | var7 & 127;
               class771.method2300(false, true, -162450455);
               int var9 = class134.field1398[var8];
               class82.method919(false, true, (short)-6266);
               var0.method4984(var1 + (var3.field881 * -2093041337 * var7 >> 7), var2 + ((7 - var6) * var3.field887 * 457937409 >> 3), (var3.field881 * -2093041337 >> 7) + 1, (457937409 * var3.field887 >> 3) + 1, var9, 0);
            }
         }

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "st.f(" + ')');
      }
   }
}
