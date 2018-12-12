import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class class472 {
   int field8231 = 0;
   boolean field8232 = false;
   int field8233 = 0;
   public List field8234 = new LinkedList();

   public void method4610(int var1) {
      try {
         Iterator var2 = this.field8234.iterator();

         while(var2.hasNext()) {
            class192 var3 = (class192)var2.next();
            var2.remove();
            class661.method5743(var3, (byte)-40);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "nn.a(" + ')');
      }
   }

   void method4611(class192 var1, int var2) {
      try {
         Interactable var3 = var1.field7022;
         boolean var4 = true;
         class211[] var5 = var1.field7022.field3642;

         for(int var6 = 0; var6 < var5.length; ++var6) {
            if (var5[var6].field7249) {
               var4 = false;
               break;
            }
         }

         if (!var4) {
            var1.field7024 = this;
            class192 var7;
            if (this.field8232) {
               Iterator var9 = this.field8234.iterator();

               while(var9.hasNext()) {
                  var7 = (class192)var9.next();
                  if (var7.field7022 == var3) {
                     var9.remove();
                     class661.method5743(var7, (byte)-92);
                  }
               }
            }

            ListIterator var10 = this.field8234.listIterator();

            while(var10.hasNext()) {
               var7 = (class192)var10.next();
               if (var3.height >= var7.field7022.height) {
                  var10.previous();
                  var10.add(var1);
                  return;
               }
            }

            this.field8234.add(var1);
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "nn.f(" + ')');
      }
   }

   class472(boolean var1) {
      this.field8232 = var1;
   }

   static final void method4612(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         String var4 = (String)var2.field3157[--var2.field3158];
         if (class960.method2212(var4, var2, -562423925) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field1012 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nn.ot(" + ')');
      }
   }

   static final void method4613(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class752.method2640(var3, var0, -1302150014);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "nn.qj(" + ')');
      }
   }

   static void method4614(class744 var0, byte var1) {
      try {
         class865 var2 = class735.field3009.method4224(var0.field3161[--var0.field3156], 245040087);
         var0.field3161[++var0.field3156 - 1] = var2.field8993 == null ? 0 : var2.field8993.length;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nn.d(" + ')');
      }
   }
}
