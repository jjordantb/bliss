import java.io.EOFException;
import java.io.IOException;

public class class645 {
   class439 field10116;
   static int field10117 = 200000000;
   long field10118;
   long field10119 = -8905853134302459951L;
   int field10120;
   byte[] field10121;
   long field10122 = -483645590008820269L;
   byte[] field10123;
   int field10124 = 0;
   long field10125;
   long field10126;
   long field10127;
   static int field10128;

   public void method6149(int var1) throws IOException {
      try {
         this.method6154((byte)63);
         this.field10116.method4276(1916877965);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ty.a(" + ')');
      }
   }

   public void method6150(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         try {
            if (2482753095985495469L * this.field10118 + (long)var3 > this.field10126 * -7034414526671508465L) {
               this.field10126 = (2482753095985495469L * this.field10118 + (long)var3) * 1637511753732440815L;
            }

            if (-1L != -3151226325898744411L * this.field10122 && (2482753095985495469L * this.field10118 < -3151226325898744411L * this.field10122 || this.field10118 * 2482753095985495469L > -3151226325898744411L * this.field10122 + (long)(447269525 * this.field10124))) {
               this.method6154((byte)104);
            }

            if (-3151226325898744411L * this.field10122 != -1L && (long)var3 + 2482753095985495469L * this.field10118 > -3151226325898744411L * this.field10122 + (long)this.field10121.length) {
               int var5 = (int)((long)this.field10121.length - (2482753095985495469L * this.field10118 - this.field10122 * -3151226325898744411L));
               System.arraycopy(var1, var2, this.field10121, (int)(2482753095985495469L * this.field10118 - this.field10122 * -3151226325898744411L), var5);
               this.field10118 += -4167043960764305883L * (long)var5;
               var2 += var5;
               var3 -= var5;
               this.field10124 = 44871869 * this.field10121.length;
               this.method6154((byte)18);
            }

            if (var3 > this.field10121.length) {
               if (-6802897060071190031L * this.field10127 != 2482753095985495469L * this.field10118) {
                  this.field10116.method4274(this.field10118 * 2482753095985495469L);
                  this.field10127 = this.field10118 * -4798501635493713027L;
               }

               this.field10116.method4275(var1, var2, var3, -590463539);
               this.field10127 += (long)var3 * -6791912350805098735L;
               if (-6802897060071190031L * this.field10127 > 4615439178561396315L * this.field10125) {
                  this.field10125 = this.field10127 * -4019893457238828381L;
               }

               long var6 = -1L;
               long var8 = -1L;
               if (2482753095985495469L * this.field10118 >= this.field10119 * -6509381880913424689L && this.field10118 * 2482753095985495469L < -6509381880913424689L * this.field10119 + (long)(this.field10120 * 998848593)) {
                  var6 = this.field10118 * 2482753095985495469L;
               } else if (-6509381880913424689L * this.field10119 >= this.field10118 * 2482753095985495469L && -6509381880913424689L * this.field10119 < 2482753095985495469L * this.field10118 + (long)var3) {
                  var6 = this.field10119 * -6509381880913424689L;
               }

               if ((long)var3 + 2482753095985495469L * this.field10118 > -6509381880913424689L * this.field10119 && (long)var3 + 2482753095985495469L * this.field10118 <= (long)(998848593 * this.field10120) + this.field10119 * -6509381880913424689L) {
                  var8 = (long)var3 + 2482753095985495469L * this.field10118;
               } else if (this.field10119 * -6509381880913424689L + (long)(this.field10120 * 998848593) > this.field10118 * 2482753095985495469L && (long)(998848593 * this.field10120) + this.field10119 * -6509381880913424689L <= 2482753095985495469L * this.field10118 + (long)var3) {
                  var8 = (long)(this.field10120 * 998848593) + this.field10119 * -6509381880913424689L;
               }

               if (var6 > -1L && var8 > var6) {
                  int var10 = (int)(var8 - var6);
                  System.arraycopy(var1, (int)((long)var2 + var6 - 2482753095985495469L * this.field10118), this.field10123, (int)(var6 - this.field10119 * -6509381880913424689L), var10);
               }

               this.field10118 += (long)var3 * -4167043960764305883L;
            } else if (var3 > 0) {
               if (-1L == -3151226325898744411L * this.field10122) {
                  this.field10122 = 2209468448714957161L * this.field10118;
               }

               System.arraycopy(var1, var2, this.field10121, (int)(this.field10118 * 2482753095985495469L - this.field10122 * -3151226325898744411L), var3);
               this.field10118 += -4167043960764305883L * (long)var3;
               if (2482753095985495469L * this.field10118 - -3151226325898744411L * this.field10122 > (long)(this.field10124 * 447269525)) {
                  this.field10124 = 44871869 * (int)(2482753095985495469L * this.field10118 - -3151226325898744411L * this.field10122);
               }
            }

         } catch (IOException var11) {
            this.field10127 = 6791912350805098735L;
            throw var11;
         }
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "ty.d(" + ')');
      }
   }

   public long method6151(int var1) {
      try {
         return this.field10126 * -7034414526671508465L;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ty.b(" + ')');
      }
   }

   public void method6152(byte[] var1, int var2) throws IOException {
      try {
         this.method6155(var1, 0, var1.length, -1421240116);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ty.p(" + ')');
      }
   }

   void method6153(int var1) throws IOException {
      try {
         this.field10120 = 0;
         if (2482753095985495469L * this.field10118 != -6802897060071190031L * this.field10127) {
            this.field10116.method4274(2482753095985495469L * this.field10118);
            this.field10127 = -4798501635493713027L * this.field10118;
         }

         int var3;
         for(this.field10119 = -3797790670521537853L * this.field10118; 998848593 * this.field10120 < this.field10123.length; this.field10120 += var3 * -1121251151) {
            int var2 = this.field10123.length - this.field10120 * 998848593;
            if (var2 > 200000000) {
               var2 = 200000000;
            }

            var3 = this.field10116.method4278(this.field10123, this.field10120 * 998848593, var2, (short)2486);
            if (-1 == var3) {
               break;
            }

            this.field10127 += (long)var3 * -6791912350805098735L;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ty.k(" + ')');
      }
   }

   void method6154(byte var1) throws IOException {
      try {
         if (-3151226325898744411L * this.field10122 != -1L) {
            if (-3151226325898744411L * this.field10122 != this.field10127 * -6802897060071190031L) {
               this.field10116.method4274(this.field10122 * -3151226325898744411L);
               this.field10127 = this.field10122 * 8772800544907846389L;
            }

            this.field10116.method4275(this.field10121, 0, this.field10124 * 447269525, -372145186);
            this.field10127 += -7564286584664531227L * (long)this.field10124;
            if (-6802897060071190031L * this.field10127 > this.field10125 * 4615439178561396315L) {
               this.field10125 = -4019893457238828381L * this.field10127;
            }

            long var2 = -1L;
            long var4 = -1L;
            if (-3151226325898744411L * this.field10122 >= this.field10119 * -6509381880913424689L && this.field10122 * -3151226325898744411L < -6509381880913424689L * this.field10119 + (long)(this.field10120 * 998848593)) {
               var2 = this.field10122 * -3151226325898744411L;
            } else if (this.field10119 * -6509381880913424689L >= this.field10122 * -3151226325898744411L && -6509381880913424689L * this.field10119 < -3151226325898744411L * this.field10122 + (long)(447269525 * this.field10124)) {
               var2 = -6509381880913424689L * this.field10119;
            }

            if (-3151226325898744411L * this.field10122 + (long)(this.field10124 * 447269525) > -6509381880913424689L * this.field10119 && (long)(447269525 * this.field10124) + this.field10122 * -3151226325898744411L <= (long)(998848593 * this.field10120) + -6509381880913424689L * this.field10119) {
               var4 = this.field10122 * -3151226325898744411L + (long)(this.field10124 * 447269525);
            } else if ((long)(998848593 * this.field10120) + this.field10119 * -6509381880913424689L > this.field10122 * -3151226325898744411L && this.field10119 * -6509381880913424689L + (long)(this.field10120 * 998848593) <= -3151226325898744411L * this.field10122 + (long)(447269525 * this.field10124)) {
               var4 = (long)(998848593 * this.field10120) + this.field10119 * -6509381880913424689L;
            }

            if (var2 > -1L && var4 > var2) {
               int var6 = (int)(var4 - var2);
               System.arraycopy(this.field10121, (int)(var2 - -3151226325898744411L * this.field10122), this.field10123, (int)(var2 - this.field10119 * -6509381880913424689L), var6);
            }

            this.field10122 = -483645590008820269L;
            this.field10124 = 0;
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "ty.u(" + ')');
      }
   }

   public void method6155(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         try {
            if (var3 + var2 > var1.length) {
               throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
            }

            if (-1L != -3151226325898744411L * this.field10122 && this.field10118 * 2482753095985495469L >= -3151226325898744411L * this.field10122 && 2482753095985495469L * this.field10118 + (long)var3 <= (long)(447269525 * this.field10124) + this.field10122 * -3151226325898744411L) {
               System.arraycopy(this.field10121, (int)(2482753095985495469L * this.field10118 - this.field10122 * -3151226325898744411L), var1, var2, var3);
               this.field10118 += -4167043960764305883L * (long)var3;
               return;
            }

            long var5 = 2482753095985495469L * this.field10118;
            int var8 = var3;
            int var9;
            if (this.field10118 * 2482753095985495469L >= -6509381880913424689L * this.field10119 && 2482753095985495469L * this.field10118 < (long)(998848593 * this.field10120) + -6509381880913424689L * this.field10119) {
               var9 = (int)((long)(this.field10120 * 998848593) - (this.field10118 * 2482753095985495469L - -6509381880913424689L * this.field10119));
               if (var9 > var3) {
                  var9 = var3;
               }

               System.arraycopy(this.field10123, (int)(2482753095985495469L * this.field10118 - -6509381880913424689L * this.field10119), var1, var2, var9);
               this.field10118 += (long)var9 * -4167043960764305883L;
               var2 += var9;
               var3 -= var9;
            }

            if (var3 > this.field10123.length) {
               this.field10116.method4274(2482753095985495469L * this.field10118);

               for(this.field10127 = this.field10118 * -4798501635493713027L; var3 > 0; var3 -= var9) {
                  var9 = this.field10116.method4278(var1, var2, var3, (short)17941);
                  if (var9 == -1) {
                     break;
                  }

                  this.field10127 += -6791912350805098735L * (long)var9;
                  this.field10118 += -4167043960764305883L * (long)var9;
                  var2 += var9;
               }
            } else if (var3 > 0) {
               this.method6153(334196140);
               var9 = var3;
               if (var3 > 998848593 * this.field10120) {
                  var9 = 998848593 * this.field10120;
               }

               System.arraycopy(this.field10123, 0, var1, var2, var9);
               var2 += var9;
               var3 -= var9;
               this.field10118 += -4167043960764305883L * (long)var9;
            }

            if (-3151226325898744411L * this.field10122 != -1L) {
               if (-3151226325898744411L * this.field10122 > 2482753095985495469L * this.field10118 && var3 > 0) {
                  var9 = var2 + (int)(-3151226325898744411L * this.field10122 - 2482753095985495469L * this.field10118);
                  if (var9 > var3 + var2) {
                     var9 = var2 + var3;
                  }

                  while(var2 < var9) {
                     var1[var2++] = 0;
                     --var3;
                     this.field10118 += -4167043960764305883L;
                  }
               }

               long var10 = -1L;
               long var12 = -1L;
               if (this.field10122 * -3151226325898744411L >= var5 && this.field10122 * -3151226325898744411L < (long)var8 + var5) {
                  var10 = -3151226325898744411L * this.field10122;
               } else if (var5 >= this.field10122 * -3151226325898744411L && var5 < (long)(447269525 * this.field10124) + -3151226325898744411L * this.field10122) {
                  var10 = var5;
               }

               if (-3151226325898744411L * this.field10122 + (long)(this.field10124 * 447269525) > var5 && (long)(447269525 * this.field10124) + this.field10122 * -3151226325898744411L <= (long)var8 + var5) {
                  var12 = this.field10122 * -3151226325898744411L + (long)(this.field10124 * 447269525);
               } else if (var5 + (long)var8 > -3151226325898744411L * this.field10122 && var5 + (long)var8 <= -3151226325898744411L * this.field10122 + (long)(447269525 * this.field10124)) {
                  var12 = (long)var8 + var5;
               }

               if (var10 > -1L && var12 > var10) {
                  int var14 = (int)(var12 - var10);
                  System.arraycopy(this.field10121, (int)(var10 - -3151226325898744411L * this.field10122), var1, var2 + (int)(var10 - var5), var14);
                  if (var12 > 2482753095985495469L * this.field10118) {
                     var3 = (int)((long)var3 - (var12 - this.field10118 * 2482753095985495469L));
                     this.field10118 = -4167043960764305883L * var12;
                  }
               }
            }
         } catch (IOException var16) {
            this.field10127 = 6791912350805098735L;
            throw var16;
         }

         if (var3 > 0) {
            throw new EOFException();
         }
      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "ty.i(" + ')');
      }
   }

   public void method6156(long var1) throws IOException {
      try {
         if (var1 < 0L) {
            throw new IOException();
         } else {
            this.field10118 = var1 * -4167043960764305883L;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ty.f(" + ')');
      }
   }

   public class645(class439 var1, int var2, int var3) throws IOException {
      this.field10116 = var1;
      this.field10126 = (this.field10125 = var1.method4277(-248360076) * -2138022200351563309L) * 4755452723842239733L;
      this.field10123 = new byte[var2];
      this.field10121 = new byte[var3];
      this.field10118 = 0L;
   }

   static void method6157(int var0, byte var1) {
      try {
         class921.field10285.method2976(var0, 266431320);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ty.p(" + ')');
      }
   }

   static final void method6158(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         var2.field3156 -= 1943683162;
         var0.field1022 = var2.field3161[681479919 * var2.field3156] * -2075416171;
         var0.field973 = -1373128517 * var2.field3161[var2.field3156 * 681479919 + 1];
         var0.field915 = -801721775 * var2.field3161[var2.field3156 * 681479919 + 2];
         var0.field987 = var2.field3161[var2.field3156 * 681479919 + 3] * 1590511671;
         var0.field917 = var2.field3161[681479919 * var2.field3156 + 4] * -2064327287;
         var0.field1009 = -1066050969 * var2.field3161[5 + 681479919 * var2.field3156];
         class814.method2932(var0, -212905305);
         if (var0.field879 * -1309843523 == -1 && !var1.field1101) {
            class466.method4009(var0.field867 * -440872681, 1280161457);
            class917.method6455(var0.field867 * -440872681, 1365886574);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ty.dw(" + ')');
      }
   }
}
