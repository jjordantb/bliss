import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class class830 implements class311 {
   class180 field9060;

   public int method444(int var1) {
      try {
         return this.field9060.method3262(380717281) ? 100 : this.field9060.method3263((byte)4);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jl.a(" + ')');
      }
   }

   public class972 method448(int var1) {
      try {
         return class972.field2963;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jl.f(" + ')');
      }
   }

   class830(class180 var1) {
      this.field9060 = var1;
   }

   static final void method5371(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-35);
         class131 var4 = class382.field1410[var2 >> 16];
         class896.method5589(var3, var4, var0, 2138455691);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "jl.ia(" + ')');
      }
   }

   static final void method5372(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)14);
         class131 var4 = class382.field1410[var2 >> 16];
         class537.method2317(var3, var4, var0, 1442704062);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "jl.lw(" + ')');
      }
   }

   static final void method5373(class744 var0, int var1) {
      try {
         var0.field3156 -= 4;
         class671.method4237(var0.field3161[var0.field3156], var0.field3161[1 + var0.field3156], var0.field3161[2 + var0.field3156], var0.field3161[3 + var0.field3156], false, 256, 1465436328);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jl.ty(" + ')');
      }
   }

   static class48 method5374(byte[] var0, int var1) {
      try {
         if (var0 == null) {
            throw new RuntimeException("");
         } else {
            while(true) {
               class48 var8;
               try {
                  Image var2 = Toolkit.getDefaultToolkit().createImage(var0);
                  MediaTracker var3 = new MediaTracker(class833.field9178);
                  var3.addImage(var2, 0);
                  var3.waitForAll();
                  int var4 = var2.getWidth(class833.field9178);
                  int var5 = var2.getHeight(class833.field9178);
                  if (var3.isErrorAny() || var4 < 0 || var5 < 0) {
                     throw new RuntimeException("");
                  }

                  int[] var6 = new int[var5 * var4];
                  PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                  var7.grabPixels();
                  var8 = class593.field1623.method4854(var6, 0, var4, var4, var5, 708696378);
               } catch (InterruptedException var9) {
                  continue;
               }

               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "jl.i(" + ')');
      }
   }

   public static final void method5375(boolean var0, int var1) {
      try {
         if (!var0) {
            class851.field8731.method2530((byte)90);
            class980.field3196.method4148(-176522889);
            class662.field9736.method5717((byte)-92);
            class730.field2697.method5283(1825433072).method4710(1390466939);
            class258.field7913.method15(-862794511);
            class85.field1121.method1573((short)23106);
            class936.field10313.method2254(-726986844);
            class635.field9823.method1054(-2092821995);
            class905.field10369.method5454(755423550);
            class539.field3762.method5740(-134753684);
            class619.field8868.method1555(1929779125);
            class473.field8291.method5164((byte)104);
            class899.field9551.method3676(-1223470139);
            class669.field7396.method73((byte)63);
            class283.field10614.method3733(-1850735168);
            class981.field3274.method2005((byte)115);
            class333.field139.method5093(478354698);
            class452.field7216.method5147(-1692960093);
            class490.field7866.method3406((byte)-6);
            class527.field3690.method6630((short)26025);
            class229.field8212.method2656((byte)10);
            class770.field3733.method2910((byte)37);
            class339.field157.method1212((short)16742);
            class285.method6659((byte)-99);
            class342.method221(1407497429);
            class785.field3827.method1854(575838917);
            class981.method1929((byte)-57);
            if (class721.field3634 != class916.field10415) {
               for(int var2 = 0; var2 < class138.field1171.length; ++var2) {
                  class138.field1171[var2] = null;
               }

               class730.field2658 = 0;
            }

            class730.field2697.method5282((byte)31).method5666((byte)24);
            class916.method6458((byte)-90);
            class299.method6555(-1075754274);
            class209.method3774(-1407310804);
            class762.method2813((byte)-26);
            class384.field1426.method2977();
            class730.field2761.method2977();
            class730.field2880.method2977();
            class730.field2678.method2977();
            class602.field8667.method2977();
         }

         class858.method5220(1675886592);
         class21.method3416(-707841245);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jl.gx(" + ')');
      }
   }

   static final void method5376(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class86.method948(var3, var4, var0, (byte)24);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "jl.du(" + ')');
      }
   }

   static final void method5377(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         for(class281 var7 = (class281)class730.field2631.method5207(-16777216); var7 != null; var7 = (class281)class730.field2631.method5211(1278684124)) {
            if (class730.field2866 >= var7.field10640) {
               var7.method2028(1699061251);
            } else {
               class971.method1790(var7.field10638, 256 + (var7.field10637 << 9), 256 + (var7.field10641 << 9), var7.field10639 * 2, -549885479);
               class501.field3182.method1681(var7.field10642, (int)((float)var0 + class730.field2873[0]), (int)(class730.field2873[1] + (float)var1), -16777216 | var7.field10636, 0, 8619684);
            }
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "jl.ji(" + ')');
      }
   }

   public static void method5378(String[] var0, short[] var1, int var2) {
      try {
         class606.method4787(var0, var1, 0, var0.length - 1, 2094440127);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "jl.a(" + ')');
      }
   }
}
