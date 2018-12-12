public class class555 extends class304 {
   int field472;
   int field473;

   public void method2383(int var1) {
      try {
         Client.field2709 = 938117879 * Client.field2866;
         Client.field2718 = 1303928015 * Client.field2866 + 1252628863 * this.field472;
         class152.field5415 = Client.field2662 * -1680550441;
         class220.field7357 = 410053157 * Client.field2712;
         class601.field9204 = Client.field2713 * -1645861677;
         class157.field6558 = Client.field2701 * -933884753;
         Client.field2662 = 563175129 * (392492523 * this.field473 >>> 24);
         Client.field2712 = -1719011785 * (this.field473 * 392492523 >>> 16 & 255);
         Client.field2713 = -1294785203 * (392492523 * this.field473 >>> 8 & 255);
         Client.field2701 = -1656733051 * (392492523 * this.field473 & 255);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ya.f(" + ')');
      }
   }

   class555(class907 var1) {
      super(var1);
      this.field472 = var1.method6374() * -477707085;
      this.field473 = var1.method6420((byte)-19) * -1164408125;
   }

   public void method2385() {
      Client.field2709 = 938117879 * Client.field2866;
      Client.field2718 = 1303928015 * Client.field2866 + 1252628863 * this.field472;
      class152.field5415 = Client.field2662 * -1680550441;
      class220.field7357 = 410053157 * Client.field2712;
      class601.field9204 = Client.field2713 * -1645861677;
      class157.field6558 = Client.field2701 * -933884753;
      Client.field2662 = 563175129 * (392492523 * this.field473 >>> 24);
      Client.field2712 = -1719011785 * (this.field473 * 392492523 >>> 16 & 255);
      Client.field2713 = -1294785203 * (392492523 * this.field473 >>> 8 & 255);
      Client.field2701 = -1656733051 * (392492523 * this.field473 & 255);
   }

   public void method2386() {
      Client.field2709 = 938117879 * Client.field2866;
      Client.field2718 = 1303928015 * Client.field2866 + 1252628863 * this.field472;
      class152.field5415 = Client.field2662 * -1680550441;
      class220.field7357 = 410053157 * Client.field2712;
      class601.field9204 = Client.field2713 * -1645861677;
      class157.field6558 = Client.field2701 * -933884753;
      Client.field2662 = 563175129 * (392492523 * this.field473 >>> 24);
      Client.field2712 = -1719011785 * (this.field473 * 392492523 >>> 16 & 255);
      Client.field2713 = -1294785203 * (392492523 * this.field473 >>> 8 & 255);
      Client.field2701 = -1656733051 * (392492523 * this.field473 & 255);
   }

   public static final int method412(class240 var0, byte[] var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         int var7 = 0;
         class907 var8 = new class907(var1);
         int var9 = -1;

         label66:
         do {
            label64:
            while(true) {
               int var10 = var8.method6383((short)255);
               if (var10 == 0) {
                  return var7;
               }

               var9 += var10;
               int var11 = 0;
               boolean var12 = false;

               while(true) {
                  int var13;
                  while(!var12) {
                     var13 = var8.method6382(1723054621);
                     if (var13 == 0) {
                        continue label64;
                     }

                     var11 += var13 - 1;
                     int var14 = var11 & 63;
                     int var15 = var11 >> 6 & 63;
                     int var16 = var8.method6371() >> 2;
                     int var17 = var2 + var15;
                     int var18 = var14 + var3;
                     if (var17 > 0 && var18 > 0 && var17 < var4 - 1 && var18 < var5 - 1) {
                        class50 var19 = var0.method4713(var9);
                        if (-1976050083 * class15.field6918.field6921 != var16 || class615.field8903.field9113.method971(-1915667162) != 0 || 1532834983 * var19.field2214 != 0 || -2144543407 * var19.field2212 == 1 || var19.field2242) {
                           if (!var19.method1482(-1755524122)) {
                              ++var7;
                           }

                           var12 = true;
                        }
                     }
                  }

                  var13 = var8.method6382(1723054621);
                  if (var13 == 0) {
                     continue label66;
                  }

                  var8.method6371();
               }
            }
         } while(var6 != 3);

         throw new IllegalStateException();
      } catch (RuntimeException var20) {
         throw class158.method3445(var20, "ya.ch(" + ')');
      }
   }
}
