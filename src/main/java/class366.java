public class class366 {
   int field2413 = 0;
   static short[] field2414 = new short[500];
   static short[] field2415 = new short[500];
   static short[] field2416 = new short[500];
   static short[] field2417 = new short[500];
   short[] field2418;
   class652 field2419 = null;
   static short[] field2420 = new short[500];
   short[] field2421;
   short[] field2422;
   static int field2423 = 2;
   short[] field2424;
   short[] field2425;
   byte[] field2426;
   boolean field2427 = false;
   boolean field2428 = false;
   boolean field2429 = false;
   static int field2430 = 1;
   static int field2431 = 2;
   static byte[] field2432 = new byte[500];

   class366(byte[] var1, class652 var2) {
      this.field2419 = var2;

      try {
         class907 var3 = new class907(var1);
         class907 var4 = new class907(var1);
         var3.method6371();
         var3.field10376 += 232826622;
         int var5 = var3.method6371();
         int var6 = 0;
         int var7 = -1;
         int var8 = -1;
         var4.field10376 = (var3.field10376 * 385051775 + var5) * 116413311;

         int var9;
         for(var9 = 0; var9 < var5; ++var9) {
            int var10 = this.field2419.field9461[var9];
            if (var10 == 0) {
               var7 = var9;
            }

            int var11 = var3.method6371();
            if (var11 > 0) {
               if (var10 == 0) {
                  var8 = var9;
               }

               field2415[var6] = (short)var9;
               short var12 = 0;
               if (var10 == 3 || var10 == 10) {
                  var12 = 128;
               }

               if ((var11 & 1) != 0) {
                  field2414[var6] = (short)var4.method6422(590991010);
               } else {
                  field2414[var6] = var12;
               }

               if ((var11 & 2) != 0) {
                  field2420[var6] = (short)var4.method6422(590991010);
               } else {
                  field2420[var6] = var12;
               }

               if ((var11 & 4) != 0) {
                  field2416[var6] = (short)var4.method6422(590991010);
               } else {
                  field2416[var6] = var12;
               }

               field2432[var6] = (byte)(var11 >>> 3 & 3);
               if (var10 == 2 || var10 == 9) {
                  field2414[var6] = (short)(field2414[var6] << 2 & 16383);
                  field2420[var6] = (short)(field2420[var6] << 2 & 16383);
                  field2416[var6] = (short)(field2416[var6] << 2 & 16383);
               }

               field2417[var6] = -1;
               if (var10 != 1 && var10 != 2 && var10 != 3) {
                  if (var10 == 5) {
                     this.field2427 = true;
                  } else if (var10 == 7) {
                     this.field2428 = true;
                  } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                     this.field2429 = true;
                  }
               } else if (var7 > var8) {
                  field2417[var6] = (short)var7;
                  var8 = var7;
               }

               ++var6;
            }
         }

         if (var4.field10376 * 385051775 != var1.length) {
            throw new RuntimeException();
         }

         this.field2413 = var6;
         this.field2421 = new short[var6];
         this.field2422 = new short[var6];
         this.field2418 = new short[var6];
         this.field2424 = new short[var6];
         this.field2425 = new short[var6];
         this.field2426 = new byte[var6];

         for(var9 = 0; var9 < var6; ++var9) {
            this.field2421[var9] = field2415[var9];
            this.field2422[var9] = field2414[var9];
            this.field2418[var9] = field2420[var9];
            this.field2424[var9] = field2416[var9];
            this.field2425[var9] = field2417[var9];
            this.field2426[var9] = field2432[var9];
         }
      } catch (Exception var13) {
         this.field2413 = 0;
         this.field2427 = false;
         this.field2428 = false;
      }

   }
}
