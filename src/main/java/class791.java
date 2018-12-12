import java.awt.Container;
import java.awt.Insets;

public class class791 implements class940 {
   boolean field438;
   class466 field439;
   static class1 field440 = new class1(128, 4);
   class54[] field441;
   int field442;
   int field443;
   class848 field444;
   static byte[] field445 = new byte[]{31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0};
   static int field446;
   static int field447;

   public void method6315(int var1) {
      try {
         if (this.field444 != class593.field1623) {
            this.field444 = class593.field1623;
            this.field438 = true;
         }

         this.field444.method4831(3, 0);
         class54[] var2 = this.field441;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class54 var4 = var2[var3];
            if (var4 != null) {
               var4.method1538(-264951465);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "jr.d(" + ')');
      }
   }

   public void method6325(boolean var1, int var2) {
      try {
         var1 = true;
         class54[] var3 = this.field441;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            class54 var5 = var3[var4];
            if (var5 != null) {
               var5.method1543(var1 || this.field438, (byte)-77);
            }
         }

         this.field438 = false;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "jr.b(" + ')');
      }
   }

   public int method6324(byte var1) {
      try {
         int var2 = 0;
         class54[] var3 = this.field441;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            class54 var5 = var3[var4];
            if (var5 == null || var5.method1537(1744525008)) {
               ++var2;
            }
         }

         return var2 * 100 / this.field441.length;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "jr.u(" + ')');
      }
   }

   public void method6314(short var1) {
   }

   public boolean method6318(long var1) {
      try {
         return class27.method3468((byte)1) >= var1 + (long)this.field442;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "jr.x(" + ')');
      }
   }

   public int method6316(int var1) {
      try {
         return this.field443;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jr.r(" + ')');
      }
   }

   class791(class466 var1, int var2, int var3, class762 var4) {
      this.field439 = var1;
      this.field442 = var2;
      this.field443 = var3;
      this.field441 = new class54[this.field439.field7304.length];

      for(int var5 = 0; var5 < this.field441.length; ++var5) {
         this.field441[var5] = var4.method2807(this.field439.field7304[var5], (byte)86);
      }

   }

   static class356 method396(byte var0) {
      try {
         class356 var1 = (class356)class356.field1795.method5210((byte)3);
         if (var1 != null) {
            --class356.field1796;
            return var1;
         } else {
            return new class356();
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "jr.b(" + ')');
      }
   }

   public static int method397(int var0) {
      try {
         if (3.0D == (double)class491.field7809) {
            return 37;
         } else if (4.0D == (double)class491.field7809) {
            return 50;
         } else if (6.0D == (double)class491.field7809) {
            return 75;
         } else {
            return 8.0D == (double)class491.field7809 ? 100 : 200;
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "jr.cy(" + ')');
      }
   }

   public static void method398(byte var0) {
      try {
         class730 var1 = class5.field4944;
         synchronized(class5.field4944) {
            if (class296.field10468 == null) {
               Container var2 = class348.method193((byte)84);
               if (var2 != null) {
                  class919.field10433 = var2.getSize().width;
                  class69.field1812 = var2.getSize().height;
                  Insets var3;
                  if (class701.field3371 == var2) {
                     var3 = class701.field3371.getInsets();
                     class919.field10433 -= var3.left + var3.right;
                     class69.field1812 -= var3.bottom + var3.top;
                  }

                  if (class919.field10433 <= 0) {
                     class919.field10433 = 1;
                  }

                  if (class69.field1812 <= 0) {
                     class69.field1812 = 1;
                  }

                  if (class660.method5750((byte)-55) != 1) {
                     class702.method1970((byte)3);
                  } else {
                     class759.field4331 = class730.field2775;
                     class69.field1813 = (class919.field10433 - class730.field2775) / 2;
                     class97.field614 = class730.field2784;
                     class69.field1814 = 0;
                  }

                  if (class721.field3634 != class916.field10415 && class759.field4331 < 1024) {
                     int var10000 = class97.field614 * 1445266787;
                  }

                  class837.field9161.setSize(class759.field4331, class97.field614);
                  if (class593.field1623 != null) {
                     class593.field1623.method5043(class837.field9161, class759.field4331, class97.field614, (byte)20);
                  }

                  if (var2 == class701.field3371) {
                     var3 = class701.field3371.getInsets();
                     class837.field9161.setLocation(var3.left + class69.field1813, class69.field1814 + var3.top);
                  } else {
                     class837.field9161.setLocation(class69.field1813, class69.field1814);
                  }

                  class112.method1443(-167626743);
                  if (class730.field2822 != -1) {
                     class161.method3551(true, (byte)8);
                  }

                  class646.method5504((byte)45);
               }
            }

         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "jr.gn(" + ')');
      }
   }
}
