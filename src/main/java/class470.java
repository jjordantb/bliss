import jaclib.ping.IcmpService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class470 extends IcmpService {
   static volatile class470 field8223;
   List field8224 = new ArrayList();

   protected void notify(int var1, int var2, int var3) {
      try {
         Iterator var4 = this.field8224.iterator();

         while(var4.hasNext()) {
            class477 var5 = (class477)var4.next();
            var5.method4643(var1, var2, var3, (short)1503);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "adv.notify(" + ')');
      }
   }

   protected void notify(int var1) {
      try {
         Iterator var2 = this.field8224.iterator();

         while(var2.hasNext()) {
            class477 var3 = (class477)var2.next();
            var3.method4645(var1 == 0, (byte)5);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "adv.notify(" + ')');
      }
   }

   protected void b(int var1, int var2, int var3) {
      Iterator var4 = this.field8224.iterator();

      while(var4.hasNext()) {
         class477 var5 = (class477)var4.next();
         var5.method4643(var1, var2, var3, (short)5654);
      }

   }

   protected void a(int var1) {
      Iterator var2 = this.field8224.iterator();

      while(var2.hasNext()) {
         class477 var3 = (class477)var2.next();
         var3.method4645(var1 == 0, (byte)5);
      }

   }

   protected void f(int var1) {
      Iterator var2 = this.field8224.iterator();

      while(var2.hasNext()) {
         class477 var3 = (class477)var2.next();
         var3.method4645(var1 == 0, (byte)5);
      }

   }

   protected void p(int var1, int var2, int var3) {
      Iterator var4 = this.field8224.iterator();

      while(var4.hasNext()) {
         class477 var5 = (class477)var4.next();
         var5.method4643(var1, var2, var3, (short)26137);
      }

   }

   public static byte[][][] method4592(int var0, int var1) {
      try {
         byte[][][] var2 = new byte[8][4][];
         int var3 = var0;
         int var4 = var0;
         byte[] var5 = new byte[var0 * var0];
         int var6 = 0;

         int var7;
         int var8;
         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 <= var7) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[0][0] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = 0; var8 < var4; ++var8) {
               if (var8 <= var7) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[0][1] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 >= var7) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[0][2] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 >= var7) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[0][3] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 <= var7 >> 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[1][0] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var6 >= 0 && var6 < var5.length) {
                  if (var8 >= var7 << 1) {
                     var5[var6] = -1;
                  }

                  ++var6;
               } else {
                  ++var6;
               }
            }
         }

         var2[1][1] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 <= var7 >> 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[1][2] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 >= var7 << 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[1][3] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 <= var7 >> 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[2][0] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 >= var7 << 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[2][1] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 <= var7 >> 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[2][2] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 >= var7 << 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[2][3] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 >= var7 >> 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[3][0] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 <= var7 << 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[3][1] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 >= var7 >> 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[3][2] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 <= var7 << 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[3][3] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 >= var7 >> 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[4][0] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 <= var7 << 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[4][1] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 >= var7 >> 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[4][2] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 <= var7 << 1) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[4][3] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 <= var3 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[5][0] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var7 <= var4 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[5][1] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 >= var3 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[5][2] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var7 >= var4 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[5][3] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 <= var7 - var4 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[6][0] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 <= var7 - var4 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[6][1] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 <= var7 - var4 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[6][2] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 <= var7 - var4 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[6][3] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 >= var7 - var4 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[7][0] = var5;
         var5 = new byte[var3 * var4];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = 0; var8 < var3; ++var8) {
               if (var8 >= var7 - var4 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[7][1] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = var4 - 1; var7 >= 0; --var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 >= var7 - var4 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[7][2] = var5;
         var5 = new byte[var4 * var3];
         var6 = 0;

         for(var7 = 0; var7 < var4; ++var7) {
            for(var8 = var3 - 1; var8 >= 0; --var8) {
               if (var8 >= var7 - var4 / 2) {
                  var5[var6] = -1;
               }

               ++var6;
            }
         }

         var2[7][3] = var5;
         return var2;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "adv.f(" + ')');
      }
   }

   static void method4593(boolean var0, int var1) {
      try {
         if (var0) {
            if (-1 != -257444687 * class730.field2822) {
               class407.method5536(-257444687 * class730.field2822, -2042512871);
            }

            for(class256 var2 = (class256)class730.field2823.method2946(2118062141); var2 != null; var2 = (class256)class730.field2823.method2945((byte)56)) {
               if (!var2.method546(-629325116)) {
                  var2 = (class256)class730.field2823.method2946(1715939754);
                  if (var2 == null) {
                     break;
                  }
               }

               class526.method2226(var2, true, false, -113822480);
            }

            class730.field2822 = -1785861201;
            class730.field2823 = new class6(8);
            class515.method2693((short)255);
            class730.field2822 = -391544995 * class6.field4931.field9522;
            class161.method3551(false, (byte)8);
            class881.method6172(-1204145082);
            class228.method4586(-257444687 * class730.field2822, (int[])null, 188692666);
         }

         class881.field10184 = true;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adv.fr(" + ')');
      }
   }
}
