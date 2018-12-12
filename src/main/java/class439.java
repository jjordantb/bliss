import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class class439 {
   long field7534;
   RandomAccessFile field7535;
   long field7536;
   static class373 field7537;

   final void method4274(long var1) throws IOException {
      try {
         this.field7535.seek(var1);
         this.field7536 = 5892097441890682535L * var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "tp.a(" + ')');
      }
   }

   public final void method4275(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if (-1855833292870549225L * this.field7536 + (long)var3 > this.field7534 * -1095537870969537929L) {
            this.field7535.seek(-1095537870969537929L * this.field7534);
            this.field7535.write(1);
            throw new EOFException();
         } else {
            this.field7535.write(var1, var2, var3);
            this.field7536 += 5892097441890682535L * (long)var3;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "tp.f(" + ')');
      }
   }

   public final void method4276(int var1) throws IOException {
      try {
         if (this.field7535 != null) {
            this.field7535.close();
            this.field7535 = null;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "tp.b(" + ')');
      }
   }

   public final long method4277(int var1) throws IOException {
      try {
         return this.field7535.length();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "tp.p(" + ')');
      }
   }

   public final int method4278(byte[] var1, int var2, int var3, short var4) throws IOException {
      try {
         int var5 = this.field7535.read(var1, var2, var3);
         if (var5 > 0) {
            this.field7536 += (long)var5 * 5892097441890682535L;
         }

         return var5;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "tp.i(" + ')');
      }
   }

   protected void finalize() throws Throwable {
      try {
         if (this.field7535 != null) {
            this.method4276(601212046);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "tp.finalize(" + ')');
      }
   }

   public class439(File var1, String var2, long var3) throws IOException {
      if (var3 == -1L) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() > var3) {
         var1.delete();
      }

      this.field7535 = new RandomAccessFile(var1, var2);
      this.field7534 = var3 * 1728399846774964039L;
      this.field7536 = 0L;
      int var5 = this.field7535.read();
      if (-1 != var5 && !var2.equals("r")) {
         this.field7535.seek(0L);
         this.field7535.write(var5);
      }

      this.field7535.seek(0L);
   }

   static final void method4279(class744 var0, byte var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 707299179 * class881.field10164;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "tp.ahm(" + ')');
      }
   }

   static final void method4280(int var0, int var1, int var2, int var3) {
      try {
         String var4 = "tele " + var0 + class822.field9050 + (var1 >> 6) + class822.field9050 + (var2 >> 6) + class822.field9050 + (var1 & 63) + class822.field9050 + (var2 & 63);
         class519.method2669(var4, true, false, 1405738364);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "tp.gd(" + ')');
      }
   }
}
