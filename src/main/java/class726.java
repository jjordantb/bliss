import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class726 {
   int field2536 = 0;
   boolean field2537 = false;
   class737[] field2538 = new class737[8192];
   int field2539 = 0;
   long field2540;
   class874 field2541 = new class874();
   List field2542 = new LinkedList();
   int field2543;
   List field2544 = new LinkedList();
   int field2545 = 0;
   boolean field2546 = false;
   boolean field2547 = false;
   public boolean field2548 = false;
   long field2549;
   static boolean[] field2550 = new boolean[32];
   static boolean[] field2551 = new boolean[8];

   class726(int var1, boolean var2) {
      this.method1719(var1, var2);
   }

   void method1719(int var1, boolean var2) {
      class198.field7046.add(this);
      this.field2549 = (long)var1;
      this.field2540 = (long)var1;
      this.field2546 = true;
      this.field2547 = var2;
   }

   public void method1720() {
      this.field2546 = true;
   }

   public void method1721() {
      this.field2537 = true;
   }

   boolean method1722(class848 var1, long var2) {
      if (this.field2549 != this.field2540) {
         this.method1721();
      } else {
         this.method1730();
      }

      if (var2 - this.field2549 > 750L) {
         this.method1723();
         return false;
      } else {
         int var4 = (int)(var2 - this.field2540);
         Iterator var5;
         class363 var6;
         if (this.field2546) {
            var5 = this.field2542.iterator();

            while(var5.hasNext()) {
               var6 = (class363)var5.next();

               for(int var7 = 0; var7 < var6.field2395.field1758 * 1095253617; ++var7) {
                  var6.method1624(var1, var2, 1, !this.field2537, (byte)63);
               }
            }

            this.field2546 = false;
         }

         var5 = this.field2542.iterator();

         while(var5.hasNext()) {
            var6 = (class363)var5.next();
            var6.method1624(var1, var2, var4, !this.field2537, (byte)45);
         }

         this.field2540 = var2;
         return true;
      }
   }

   void method1723() {
      this.field2548 = true;
      Iterator var1 = this.field2544.iterator();

      while(var1.hasNext()) {
         class713 var2 = (class713)var1.next();
         if (var2.field3534.field9650 * -1955592777 == 1) {
            var2.method545(-1460969981);
         }
      }

      for(int var3 = 0; var3 < this.field2538.length; ++var3) {
         if (this.field2538[var3] != null) {
            this.field2538[var3].method1827();
            this.field2538[var3] = null;
         }
      }

      this.field2539 = 0;
      this.field2542 = new LinkedList();
      this.field2536 = 0;
      this.field2544 = new LinkedList();
      this.field2545 = 0;
   }

   void method1724(class848 var1, class933[] var2, boolean var3) {
      for(int var4 = 0; var4 < 32; ++var4) {
         field2550[var4] = false;
      }

      Iterator var7 = this.field2542.iterator();

      while(true) {
         label58:
         while(var7.hasNext()) {
            class363 var5 = (class363)var7.next();
            if (var2 != null) {
               for(int var6 = 0; var6 < var2.length; ++var6) {
                  if (var5.field2401 == var2[var6] || var5.field2401 == var2[var6].field10329) {
                     field2550[var6] = true;
                     var5.method1623((byte)-40);
                     var5.field2403 = false;
                     continue label58;
                  }
               }
            }

            if (!var3) {
               if (var5.field2391 * -917784967 == 0) {
                  var7.remove();
                  --this.field2536;
               } else {
                  var5.field2403 = true;
               }
            }
         }

         if (var2 != null) {
            for(int var8 = 0; var8 < var2.length && var8 != 32 && this.field2536 != 32; ++var8) {
               if (!field2550[var8]) {
                  class363 var9 = new class363(var1, var2[var8], this, this.field2549);
                  this.field2542.add(var9);
                  ++this.field2536;
                  field2550[var8] = true;
               }
            }
         }

         return;
      }
   }

   void method1725(class396[] var1, boolean var2) {
      for(int var3 = 0; var3 < 8; ++var3) {
         field2551[var3] = false;
      }

      Iterator var6 = this.field2544.iterator();

      while(true) {
         label67:
         while(var6.hasNext()) {
            class713 var4 = (class713)var6.next();
            if (var1 != null) {
               for(int var5 = 0; var5 < var1.length; ++var5) {
                  if (var4.field3538 == var1[var5] || var4.field3538 == var1[var5].field6509) {
                     field2551[var5] = true;
                     var4.method2075(-219401060);
                     continue label67;
                  }
               }
            }

            if (!var2) {
               var4.method545(-1460969981);
               --this.field2545;
               if (var4.method546(-629325116)) {
                  var4.method545(-1460969981);
                  class198.field7048 -= 817588661;
               }
            }
         }

         if (var1 != null) {
            for(int var7 = 0; var7 < var1.length && var7 != 8 && this.field2545 != 8; ++var7) {
               if (!field2551[var7]) {
                  class713 var8 = null;
                  if (var1[var7].method3493((byte)3).field9650 * -1955592777 == 1 && class198.field7048 * -1237648227 < 32) {
                     var8 = new class713(var1[var7], this);
                     class198.field7047.method2947(var8, (long)(var1[var7].field6510 * 617796067));
                     class198.field7048 += 817588661;
                  }

                  if (var8 == null) {
                     var8 = new class713(var1[var7], this);
                  }

                  this.field2544.add(var8);
                  ++this.field2545;
                  field2551[var7] = true;
               }
            }
         }

         return;
      }
   }

   public class874 method1726() {
      this.field2541.field9777.method5865(198538836);

      for(int var1 = 0; var1 < this.field2538.length; ++var1) {
         if (this.field2538[var1] != null && this.field2538[var1].field3079 != null) {
            this.field2541.field9777.method5866(this.field2538[var1], (byte)-89);
         }
      }

      return this.field2541;
   }

   public void method1727(int var1, int var2, int var3, int var4, int var5) {
      this.field2543 = var1;
   }

   void method1728(class545 var1, class848 var2) {
      this.field2541.field9777.method5865(-1313547025);
      Iterator var3 = this.field2542.iterator();

      while(var3.hasNext()) {
         class363 var4 = (class363)var3.next();
         var4.method1625(var1, var2, this.field2540);
      }

   }

   public class874 method1729() {
      return this.field2541;
   }

   void method1730() {
      this.field2537 = false;
   }

   public void method1731(class848 var1, long var2, class933[] var4, class396[] var5, boolean var6) {
      if (!this.field2548) {
         this.method1724(var1, var4, var6);
         this.method1725(var5, var6);
         this.field2549 = var2;
      }

   }

   public static class726 method1732(int var0, boolean var1) {
      if (class198.field7044 * -1264407527 != class198.field7043 * 274948937) {
         class726 var2 = class198.field7042[class198.field7043 * 274948937];
         class198.field7043 = (class198.field7043 * 274948937 + 1 & class948.field3284[class198.field7038 * 1197525581]) * 172162809;
         var2.method1719(var0, var1);
         return var2;
      } else {
         return new class726(var0, var1);
      }
   }

   public void method1733(long var1) {
      this.field2549 = var1;
   }
}
