import java.awt.Container;
import java.awt.Insets;

public class class83 implements class54 {
   class809 field1098;
   class554 field1099;
   static int field1100;

   class83(class554 var1, class809 var2) {
      this.field1098 = var2;
      this.field1099 = var1;
   }

   public boolean method1537(int var1) {
      try {
         return this.field1099.method422(2031023614);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ff.b(" + ')');
      }
   }

   public void method1543(boolean var1, byte var2) {
      try {
         class600 var3 = this.field1099.method421(this.field1098.field4593, -257545820);
         if (var3 != null) {
            int var4 = this.field1098.field4588.method1786(this.field1098.field4591, class730.field2775, -2108328767) + this.field1098.field4585;
            int var5 = this.field1098.field4589.method3090(this.field1098.field4592, class730.field2784, -1943367798) + this.field1098.field4587;
            if (this.field1098.field4594) {
               class593.field1623.method4838(var4, var5, this.field1098.field4591, this.field1098.field4592, this.field1098.field4590, 0);
            }

            var5 += this.method882(class501.field3182, var3.field9209, var4, var5, 5, 1663137711) * 12;
            var5 += 8;
            if (this.field1098.field4594) {
               class593.field1623.method4934(var4, var5, this.field1098.field4591 + var4 - 1, var5, this.field1098.field4590, 0);
            }

            ++var5;
            var5 += this.method882(class501.field3182, var3.field9210, var4, var5, 5, 1663137711) * 12;
            var5 += 5;
            int var10000 = var5 + this.method882(class501.field3182, var3.field9208, var4, var5, 5, 1663137711) * 12;
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ff.f(" + ')');
      }
   }

   int method882(class727 var1, String var2, int var3, int var4, int var5, int var6) {
      try {
         return var1.method1663(var2, var3 + var5, var4 + var5, this.field1098.field4591 - 2 * var5, this.field1098.field4592 - var5 * 2, this.field1098.field4584, this.field1098.field4586, 0, 0, 0, (class48[])null, (int[])null, (class23)null, 0, 0, -45995166);
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "ff.x(" + ')');
      }
   }

   public void method1538(int var1) {
   }

   static final void method883(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class758.method2738(var3, var4, var0, -352941486);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ff.kr(" + ')');
      }
   }

   static final void method884(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class730.field2759 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ff.th(" + ')');
      }
   }

   static void method885(int var0, int var1, int var2, int var3, boolean var4, byte var5) {
      try {
         if (class53.field2311 && class296.field10468 != null && (3 != var1 || class488.field8421 != var2 || class849.field8567 != var3)) {
            class386.method1167(class382.field1409, class296.field10468, 1593156326);
            class296.field10468 = null;
         }

         if (class53.field2311 && 3 == var1 && class296.field10468 == null) {
            class296.field10468 = class614.method5191(class382.field1409, var2, var3, 0, 0, -1107425870);
            if (class296.field10468 != null) {
               class488.field8421 = var2;
               class849.field8567 = var3;
               class95.method523(656179282);
            }
         }

         if (var1 == 3 && (!class53.field2311 || class296.field10468 == null)) {
            method885(var0, class615.field8903.field9109.method6159((byte)118), -1, -1, true, (byte)24);
         } else {
            Container var6 = class348.method193((byte)31);
            Insets var7;
            if (class296.field10468 != null) {
               class919.field10433 = var2;
               class69.field1812 = var3;
            } else if (class701.field3371 != null) {
               var7 = class701.field3371.getInsets();
               int var10001 = var7.left + var7.right;
               class919.field10433 = class701.field3371.getSize().width - var10001;
               var10001 = var7.top + var7.bottom;
               class69.field1812 = class701.field3371.getSize().height - var10001;
            } else {
               class919.field10433 = var6.getSize().width;
               class69.field1812 = var6.getSize().height;
            }

            if (class919.field10433 <= 0) {
               class919.field10433 = 1;
            }

            if (class69.field1812 <= 0) {
               class69.field1812 = 1;
            }

            if (1 != var1) {
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

            if (!var4) {
               class837.field9161.setSize(class759.field4331, class97.field614);
               class593.field1623.method5043(class837.field9161, class759.field4331, class97.field614, (byte)20);
               if (class701.field3371 == var6) {
                  var7 = class701.field3371.getInsets();
                  class837.field9161.setLocation(class69.field1813 + var7.left, var7.top + class69.field1814);
               } else {
                  class837.field9161.setLocation(class69.field1813, class69.field1814);
               }
            } else {
               class192.method3742(1305054317);
            }

            if (var1 >= 2) {
               class730.field2780 = true;
            } else {
               class730.field2780 = false;
            }

            class112.method1443(-375091038);
            if (-1 != class730.field2822) {
               class161.method3551(true, (byte)8);
            }

            if (class730.field2692.method4377(537308016) != null && class552.method457(class730.field2733, (byte)76)) {
               class190.method3732(-2137735375);
            }

            for(int var9 = 0; var9 < 113; ++var9) {
               class730.field2882[var9] = true;
            }

            class69.field1811 = true;
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "ff.gq(" + ')');
      }
   }

   static final int method886(int var0, int var1, int var2) {
      try {
         int var3 = var0 + var1 * 57;
         var3 ^= var3 << 13;
         int var4 = 1376312589 + var3 * (789221 + 15731 * var3 * var3) & Integer.MAX_VALUE;
         return var4 >> 19 & 255;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ff.l(" + ')');
      }
   }
}
