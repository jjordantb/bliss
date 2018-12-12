import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class class817 extends class888 implements MouseListener, MouseMotionListener, MouseWheelListener {
   class373 field4626 = new class373();
   static int field4627 = 2;
   int field4628;
   int field4629;
   static int field4630 = 4;
   int field4631;
   class373 field4632 = new class373();
   int field4633;
   int field4634;
   int field4635;
   static int field4636 = 1;
   Component field4637;
   boolean field4638;

   public boolean method5508(int var1) {
      try {
         return (-31480187 * this.field4631 & 1) != 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.p(" + ')');
      }
   }

   void method2905(Component var1, int var2) {
      try {
         this.method2906(1230262531);
         this.field4637 = var1;
         this.field4637.addMouseListener(this);
         this.field4637.addMouseMotionListener(this);
         this.field4637.addMouseWheelListener(this);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aci.at(" + ')');
      }
   }

   void method2906(int var1) {
      try {
         if (this.field4637 != null) {
            this.field4637.removeMouseWheelListener(this);
            this.field4637.removeMouseMotionListener(this);
            this.field4637.removeMouseListener(this);
            this.field4637 = null;
            this.field4631 = 0;
            this.field4635 = 0;
            this.field4629 = 0;
            this.field4628 = 0;
            this.field4634 = 0;
            this.field4633 = 0;
            this.field4632 = null;
            this.field4626 = null;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.ah(" + ')');
      }
   }

   public boolean method5520() {
      return (-31480187 * this.field4631 & 1) != 0;
   }

   void method2907(int var1, int var2, int var3) {
      try {
         this.field4633 = var1 * -213131387;
         this.field4634 = var2 * -968658837;
         if (this.field4638) {
            this.method2908(-1, var1, var2, 0, 1553525097);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aci.al(" + ')');
      }
   }

   public boolean method5517(int var1) {
      try {
         return (-31480187 * this.field4631 & 2) != 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.i(" + ')');
      }
   }

   class817(Component var1, boolean var2) {
      this.method2905(var1, -1437014279);
      this.field4638 = var2;
   }

   void method2908(int var1, int var2, int var3, int var4, int var5) {
      try {
         class358 var6 = class317.method473(var1, var2, var3, class27.method3468((byte)1), var4, -1798824718);
         this.field4626.method897(var6, 534328737);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aci.ai(" + ')');
      }
   }

   public boolean method5510(byte var1) {
      try {
         return (this.field4631 * -31480187 & 4) != 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.k(" + ')');
      }
   }

   public int method5529() {
      return this.field4635 * 28748355;
   }

   public int method5513(byte var1) {
      try {
         return this.field4635 * 28748355;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.x(" + ')');
      }
   }

   public void method5512(byte var1) {
      try {
         this.method2906(868673993);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.q(" + ')');
      }
   }

   public synchronized void mouseClicked(MouseEvent var1) {
      try {
         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.mouseClicked(" + ')');
      }
   }

   public synchronized void mouseEntered(MouseEvent var1) {
      try {
         this.method2907(var1.getX(), var1.getY(), 459711214);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.mouseEntered(" + ')');
      }
   }

   public synchronized void mouseExited(MouseEvent var1) {
      try {
         this.method2907(var1.getX(), var1.getY(), 1366931071);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.mouseExited(" + ')');
      }
   }

   int method2909(MouseEvent var1, int var2) {
      try {
         if (var1.getButton() == 1) {
            return var1.isMetaDown() ? 4 : 1;
         } else if (var1.getButton() == 2) {
            return 2;
         } else {
            return var1.getButton() == 3 ? 4 : 0;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aci.az(" + ')');
      }
   }

   public synchronized void mousePressed(MouseEvent var1) {
      try {
         int var2 = this.method2909(var1, 1930435178);
         if (1 == var2) {
            this.method2908(0, var1.getX(), var1.getY(), var1.getClickCount(), 1989072538);
         } else if (var2 == 4) {
            this.method2908(2, var1.getX(), var1.getY(), var1.getClickCount(), 1922972976);
         } else if (2 == var2) {
            this.method2908(1, var1.getX(), var1.getY(), var1.getClickCount(), 2016030026);
         }

         this.field4628 = (2114498315 * this.field4628 | var2) * 1282483363;
         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.mousePressed(" + ')');
      }
   }

   public synchronized void mouseReleased(MouseEvent var1) {
      try {
         int var2 = this.method2909(var1, 1755922620);
         if ((2114498315 * this.field4628 & var2) == 0) {
            var2 = this.field4628 * 2114498315;
         }

         if ((var2 & 1) != 0) {
            this.method2908(3, var1.getX(), var1.getY(), var1.getClickCount(), 1931509920);
         }

         if ((var2 & 4) != 0) {
            this.method2908(5, var1.getX(), var1.getY(), var1.getClickCount(), 1062616351);
         }

         if ((var2 & 2) != 0) {
            this.method2908(4, var1.getX(), var1.getY(), var1.getClickCount(), 1204760399);
         }

         this.field4628 = (this.field4628 * 2114498315 & ~var2) * 1282483363;
         if (var1.isPopupTrigger()) {
            var1.consume();
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.mouseReleased(" + ')');
      }
   }

   public synchronized void mouseDragged(MouseEvent var1) {
      try {
         this.method2907(var1.getX(), var1.getY(), -2027156244);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.mouseDragged(" + ')');
      }
   }

   public synchronized void mouseMoved(MouseEvent var1) {
      try {
         this.method2907(var1.getX(), var1.getY(), -1257091860);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.mouseMoved(" + ')');
      }
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      try {
         if (var1.isShiftDown()) {
            if (var1.getWheelRotation() == 1) {
               if (Client.field2617 < 100) {
                  return;
               }

               Client.field2617 -= Client.field2617 / 16;
               class839.method5406(184, Client.field2617, 644551429);
            }

            if (var1.getWheelRotation() == -1) {
               if (Client.field2617 >= 600) {
                  return;
               }

               Client.field2617 += Client.field2617 / 16;
               class839.method5406(184, Client.field2617, 644551429);
            }
         }

         int var2 = var1.getX();
         int var3 = var1.getY();
         int var4 = var1.getWheelRotation();
         this.method2908(6, var2, var3, var4, 1166829560);
         var1.consume();
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aci.mouseWheelMoved(" + ')');
      }
   }

   public synchronized void method5507() {
      this.field4629 = this.field4633 * -867321853;
      this.field4635 = this.field4634 * -1698396671;
      this.field4631 = this.field4628 * 866311247;
      class373 var1 = this.field4632;
      this.field4632 = this.field4626;
      this.field4626 = var1;
      this.field4626.method905((byte)1);
   }

   public synchronized void method5514() {
      this.field4629 = this.field4633 * -867321853;
      this.field4635 = this.field4634 * -1698396671;
      this.field4631 = this.field4628 * 866311247;
      class373 var1 = this.field4632;
      this.field4632 = this.field4626;
      this.field4626 = var1;
      this.field4626.method905((byte)1);
   }

   public boolean method5519() {
      return (-31480187 * this.field4631 & 2) != 0;
   }

   public void method5528() {
      this.method2906(-1710561997);
   }

   public boolean method5518() {
      return (-31480187 * this.field4631 & 1) != 0;
   }

   public boolean method5522() {
      return (-31480187 * this.field4631 & 2) != 0;
   }

   public synchronized void method5516(int var1) {
      try {
         this.field4629 = this.field4633 * -867321853;
         this.field4635 = this.field4634 * -1698396671;
         this.field4631 = this.field4628 * 866311247;
         class373 var2 = this.field4632;
         this.field4632 = this.field4626;
         this.field4626 = var2;
         this.field4626.method905((byte)1);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.b(" + ')');
      }
   }

   public boolean method5523() {
      return (this.field4631 * -31480187 & 4) != 0;
   }

   public int method5525() {
      return this.field4629 * 1215441007;
   }

   public class284 method5526() {
      return (class284)this.field4632.method898(2123266868);
   }

   public class284 method5515() {
      return (class284)this.field4632.method898(2127727655);
   }

   public int method5524(byte var1) {
      try {
         return this.field4629 * 1215441007;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.u(" + ')');
      }
   }

   public class284 method5509(int var1) {
      try {
         return (class284)this.field4632.method898(2114584348);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aci.r(" + ')');
      }
   }

   public void method5527() {
      this.method2906(-1322459721);
   }

   public boolean method5521() {
      return (-31480187 * this.field4631 & 1) != 0;
   }
}
