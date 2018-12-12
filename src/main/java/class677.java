import java.io.File;

public class class677 {
   class865[] field7462;
   int field7463;
   class180 field7464;
   public static int field7465;

   public class865 method4224(int var1, int var2) {
      try {
         return this.field7462[var1];
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pb.a(" + ')');
      }
   }

   int method4225(class415 var1, int var2) {
      try {
         int var3 = 0;

         for(int var4 = 0; var4 < this.field7463; ++var4) {
            class865 var5 = this.method4224(var4, 245040087);
            if (var5.method5325(var1, -1717639697)) {
               var3 += var5.field8991;
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "pb.f(" + ')');
      }
   }

   public class677(class469 var1, class423 var2, class180 var3, boolean var4) {
      this.field7464 = var3;
      if (this.field7464 != null) {
         this.field7463 = this.field7464.method3286(class981.field3251.field3271, -941078932);
      } else {
         this.field7463 = 0;
      }

      if (var4) {
         this.field7462 = new class865[this.field7463];

         for(int var5 = 0; var5 < this.field7463; ++var5) {
            class180 var6 = this.field7464;
            byte[] var7;
            synchronized(this.field7464) {
               var7 = this.field7464.method3285(class981.field3251.field3271, var5, (byte)-67);
            }

            class865 var9 = new class865();
            if (var7 != null) {
               var9.method5321(new InputStream(var7), -1666342024);
            }

            var9.method5323(234785741);
            this.field7462[var5] = var9;
            this.field7462[var5].field8984 = this;
         }
      }

   }

   static final void method4226(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         int var3 = class730.field2902[var2].method6657(-574288948);
         var0.field3161[++var0.field3156 - 1] = var3 == 0 ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pb.ys(" + ')');
      }
   }

   public static void method4227(class453 var0, byte var1) {
      try {
         if (class889.field9235 != null) {
            throw new IllegalStateException("");
         } else {
            class889.field9235 = var0;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pb.a(" + ')');
      }
   }

   public static byte[] method4228(File var0, int var1) {
      try {
         return class232.method4663(var0, (int)var0.length(), 1835792429);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pb.b(" + ')');
      }
   }

   static final void method4229(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (2 == class730.field2924 && var2 < class730.field2923) {
            var0.field3161[++var0.field3156 - 1] = class730.field2928[var2];
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pb.vx(" + ')');
      }
   }
}
