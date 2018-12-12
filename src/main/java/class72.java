import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class72 implements Iterator {
   int field1418;
   int field1419 = 0;
   class226 field1420;

   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "hw.remove(" + ')');
      }
   }

   public boolean hasNext() {
      try {
         return this.field1419 < this.field1420.field7332;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "hw.hasNext(" + ')');
      }
   }

   public Object next() {
      try {
         if (this.field1418 != this.field1420.field7334) {
            throw new ConcurrentModificationException();
         } else if (this.field1419 < this.field1420.field7332) {
            Object var1 = this.field1420.field7331[this.field1419].field1433;
            ++this.field1419;
            return var1;
         } else {
            throw new NoSuchElementException();
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "hw.next(" + ')');
      }
   }

   class72(class226 var1) {
      this.field1418 = this.field1420.field7334;
      this.field1420 = var1;
   }

   static final void method1071(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class140.method1045(var3, var4, var0, (byte)74);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "hw.kq(" + ')');
      }
   }

   static final void method1072(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         var0.field3161[++var0.field3156 - 1] = class776.method2296(var2, var3, true, 15837685);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "hw.td(" + ')');
      }
   }

   static final void method1073(class744 var0, int var1) {
      try {
         var0.field3156 -= 3;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         int var4 = var0.field3161[var0.field3156 + 2];
         class740.method1920(4, var2 << 16 | var3, var4, "", -1102364535);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "hw.ald(" + ')');
      }
   }
}
