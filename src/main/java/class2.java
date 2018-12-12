import java.util.zip.Inflater;

public class class2 {
   Inflater field4947;
   public static int[] field4948;

   public byte[] method2969(byte[] var1, short var2) {
      try {
         InputStream var3 = new InputStream(var1);
         var3.field10376 = var1.length - 4;
         int var4 = var3.method6377(-471458915);
         byte[] var5 = new byte[var4];
         var3.field10376 = 0;
         this.method2970(var3, var5, -1056793705);
         return var5;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "vv.a(" + ')');
      }
   }

   public void method2970(InputStream var1, byte[] var2, int var3) {
      try {
         if (31 == var1.field10375[var1.field10376] && -117 == var1.field10375[var1.field10376 + 1]) {
            if (this.field4947 == null) {
               this.field4947 = new Inflater(true);
            }

            try {
               this.field4947.setInput(var1.field10375, 10 + var1.field10376, var1.field10375.length - (8 + var1.field10376 + 10));
               this.field4947.inflate(var2);
            } catch (Exception var5) {
               this.field4947.reset();
               throw new RuntimeException("");
            }

            this.field4947.reset();
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "vv.f(" + ')');
      }
   }

   public class2() {
      this(-1, 1000000, 1000000);
   }

   class2(int var1, int var2, int var3) {
   }

   static final String[] method2971(String[] var0, int var1) {
      try {
         String[] var2 = new String[5];

         for(int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = var3 + " ";
            if (var0 != null && var0[var3] != null) {
               var2[var3] = var2[var3] + var0[var3];
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "vv.ly(" + ')');
      }
   }
}
