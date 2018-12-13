import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class class936 {
   int field10309;
   static int field10310;
   ReferenceQueue field10311 = new ReferenceQueue();
   class445[] field10312 = new class445[16];
   public static class769 field10313;
   public static class48 field10314;

   public void method6271(Object var1, Object var2, int var3) {
      try {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.method6272(1702492864);
            int var4 = System.identityHashCode(var1);
            int var5 = var4 & this.field10312.length - 1;
            class445 var6 = this.field10312[var5];
            if (var6 == null) {
               this.field10312[var5] = new class445(var1, this.field10311, var4, var2);
               ++this.field10309;
               if (this.field10309 >= this.field10312.length) {
                  this.method6275(-354056618);
               }
            } else {
               while(var6.get() != var1) {
                  if (var6.field7574 == null) {
                     var6.field7574 = new class445(var1, this.field10311, var4, var2);
                     ++this.field10309;
                     if (this.field10309 >= this.field10312.length) {
                        this.method6275(-2117837549);
                     }
                     break;
                  }

                  var6 = var6.field7574;
               }
            }

         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "us.a(" + ')');
      }
   }

   void method6272(int var1) {
      try {
         while(true) {
            class445 var2 = (class445)this.field10311.poll();
            if (var2 == null) {
               return;
            }

            int var3 = var2.field7573 & this.field10312.length - 1;
            class445 var4 = this.field10312[var3];
            if (var2 == var4) {
               this.field10312[var3] = var2.field7574;
               --this.field10309;
            } else {
               while(var4 != null && var2 != var4.field7574) {
                  var4 = var4.field7574;
               }

               if (var4 != null) {
                  var4.field7574 = var2.field7574;
                  --this.field10309;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "us.i(" + ')');
      }
   }

   public ArrayList method6273(int var1) {
      try {
         this.method6272(-93976926);
         ArrayList var2 = new ArrayList(this.field10309);
         class445[] var3 = this.field10312;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            for(class445 var5 = var3[var4]; var5 != null; var5 = var5.field7574) {
               Object var6 = var5.get();
               if (var6 != null) {
                  var2.add(var6);
               }
            }
         }

         return var2;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "us.b(" + ')');
      }
   }

   public void method6274(Object var1, int var2) {
      try {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.method6272(-439163515);
            int var3 = System.identityHashCode(var1);
            int var4 = var3 & this.field10312.length - 1;
            class445 var5 = this.field10312[var4];
            if (var5 != null) {
               if (var5.get() == var1) {
                  this.field10312[var4] = var5.field7574;
                  --this.field10309;
               } else {
                  while(true) {
                     class445 var6 = var5.field7574;
                     if (var6 == null) {
                        if (var2 < 125611783) {
                           ;
                        }
                        break;
                     }

                     if (var6.get() == var1) {
                        var5.field7574 = var6.field7574;
                        --this.field10309;
                        break;
                     }

                     var5 = var6;
                  }
               }
            }

         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "us.f(" + ')');
      }
   }

   void method6275(int var1) {
      try {
         class445[] var2 = this.field10312;
         this.field10312 = new class445[2 * var2.length];
         class445[] var3 = var2;

         class445 var6;
         for(int var4 = 0; var4 < var3.length; ++var4) {
            for(class445 var5 = var3[var4]; var5 != null; var5 = var6) {
               var6 = var5.field7574;
               int var7 = var5.field7573 & this.field10312.length - 1;
               var5.field7574 = this.field10312[var7];
               this.field10312[var7] = var5;
            }
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "us.p(" + ')');
      }
   }

   public static void method6276(boolean var0, int var1) {
      try {
         if (var0) {
            if (-1 != class730.field2822) {
               class407.method5536(class730.field2822, -2042512871);
            }

            for(class256 var2 = (class256)class730.field2823.method2946(1741120464); var2 != null; var2 = (class256)class730.field2823.method2945((byte)42)) {
               if (!var2.method546(-629325116)) {
                  var2 = (class256)class730.field2823.method2946(1941104676);
                  if (var2 == null) {
                     if (var1 >= -995600773) {
                        return;
                     }
                     break;
                  }
               }

               class526.method2226(var2, true, false, -113822480);
            }

            class730.field2822 = -1;
            class730.field2823 = new NodeTable(8);
            class515.method2693((short)255);
            class730.field2822 = NodeTable.field4931.field9533;
            class161.method3551(false, (byte)8);
            class881.method6172(-960032596);
            class228.method4586(class730.field2822, (int[])null, 2019085039);
         }

         class440.method4333(-2068735860);
         class881.field10184 = false;
         class490.method4437(1449725764);
         class730.field2919 = -1;
         class779.method2323(class730.field2813, 614001892);
         class923.local = new Player((class545)null);
         class923.local.method1515((float)(class730.field2697.method5271(-1895849411) * 512 / 2), 0.0F, (float)(class730.field2697.method5272(501771104) * 512 / 2));
         class923.local.field4085[0] = class730.field2697.method5271(-1873805931) / 2;
         class923.local.field4055[0] = class730.field2697.method5272(2001443939) / 2;
         class7.field4918 = 0;
         class103.field205 = 0;
         if (3 == class563.field1083) {
            class103.field205 = class747.field4147 << 9;
            class7.field4918 = class124.field2411 << 9;
         } else {
            class515.method2694((byte)90);
         }

         class730.field2697.method5282((byte)-45).method5673(-1834713428);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "us.fs(" + ')');
      }
   }

   static final void method6277(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)-38);
         var0.field3161[++var0.field3156 - 1] = var3.field868;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "us.qx(" + ')');
      }
   }

   static boolean method6278(class513 var0, int var1, int var2) {
      try {
         int var3 = var0.method2647(2);
         int var4;
         int var5;
         int var9;
         int var10;
         int var11;
         if (var3 == 0) {
            if (var0.method2647(1) != 0) {
               method6278(var0, var1, -1136734730);
            }

            var4 = var0.method2647(6);
            var5 = var0.method2647(6);
            boolean var17 = var0.method2647(1) == 1;
            if (var17) {
               class498.field8113[++class498.field8112 - 1] = var1;
            }

            if (class730.loaded[var1] != null) {
               throw new RuntimeException();
            } else {
               class370 var18 = class498.field8111[var1];
               Player var19 = class730.loaded[var1] = new Player(class730.field2697.method5317(-1611682495));
               var19.field4028 = var1;
               if (class498.field8106[var1] != null) {
                  var19.method1990(class498.field8106[var1], (byte)3);
               }

               var19.method2543(var18.field1093, true, 1449559817);
               var19.field4054 = var18.field1092;
               var9 = var18.field1095;
               var10 = var9 >> 28;
               var11 = var9 >> 14 & 255;
               int var12 = var9 & 255;
               class389 var13 = class730.field2697.method5270(681479919);
               int var14 = (var11 << 6) + var4 - var13.field1521;
               int var15 = (var12 << 6) + var5 - var13.field1522;
               var19.field3382 = var18.field1094;
               var19.field3401 = var18.field1096;
               var19.field4074[0] = class498.field8105[var1];
               var19.field3639 = var19.field3640 = (byte)var10;
               if (class730.field2697.method5296(1040339757).method3386(var14, var15, -937818147)) {
                  ++var19.field3640;
               }

               var19.method1995(var14, var15, -2040915654);
               var19.field3396 = false;
               class498.field8111[var1] = null;
               return true;
            }
         } else if (1 == var3) {
            var4 = var0.method2647(2);
            var5 = class498.field8111[var1].field1095;
            class498.field8111[var1].field1095 = ((var4 + (var5 >> 28) & 3) << 28) + (var5 & 268435455);
            return false;
         } else {
            int var6;
            int var7;
            int var8;
            if (var3 == 2) {
               var4 = var0.method2647(5);
               var5 = var4 >> 3;
               var6 = var4 & 7;
               var7 = class498.field8111[var1].field1095;
               var8 = (var7 >> 28) + var5 & 3;
               var9 = var7 >> 14 & 255;
               var10 = var7 & 255;
               if (var6 == 0) {
                  --var9;
                  --var10;
               }

               if (var6 == 1) {
                  --var10;
               }

               if (var6 == 2) {
                  ++var9;
                  --var10;
               }

               if (3 == var6) {
                  --var9;
               }

               if (4 == var6) {
                  ++var9;
               }

               if (var6 == 5) {
                  --var9;
                  ++var10;
               }

               if (6 == var6) {
                  ++var10;
               }

               if (var6 == 7) {
                  ++var9;
                  ++var10;
               }

               class498.field8111[var1].field1095 = var10 + (var8 << 28) + (var9 << 14);
               return false;
            } else {
               var4 = var0.method2647(18);
               var5 = var4 >> 16;
               var6 = var4 >> 8 & 255;
               var7 = var4 & 255;
               var8 = class498.field8111[var1].field1095;
               var9 = var5 + (var8 >> 28) & 3;
               var10 = var6 + (var8 >> 14) & 255;
               var11 = var8 + var7 & 255;
               class498.field8111[var1].field1095 = var11 + (var10 << 14) + (var9 << 28);
               return false;
            }
         }
      } catch (RuntimeException var16) {
         throw class158.method3445(var16, "us.k(" + ')');
      }
   }

   static void method6279(int var0, String var1, int var2) {
      try {
         class682 var3 = class370.method881(2, (long)var0);
         var3.method4340((byte)54);
         var3.field7688 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "us.at(" + ')');
      }
   }

   static void method6280(File var0, byte[] var1, int var2, int var3) throws IOException {
      try {
         DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(var0)));

         try {
            var4.readFully(var1, 0, var2);
         } catch (EOFException var6) {
            ;
         }

         var4.close();
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "us.a(" + ')');
      }
   }
}
