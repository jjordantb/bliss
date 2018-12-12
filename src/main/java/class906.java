import java.util.Iterator;

public class class906 implements Iterator {
   class514 field10360;
   class345 field10361;
   class345 field10362 = null;
   public static class756 field10363;

   void method6340(int var1) {
      try {
         this.field10361 = this.field10360.field4317.field208;
         this.field10362 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sl.d(" + ')');
      }
   }

   public class345 method6341(short var1) {
      try {
         this.method6340(2013094835);
         return (class345)this.next();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sl.u(" + ')');
      }
   }

   public Object next() {
      try {
         class345 var1 = this.field10361;
         if (this.field10360.field4317 == var1) {
            var1 = null;
            this.field10361 = null;
         } else {
            this.field10361 = var1.field208;
         }

         this.field10362 = var1;
         return var1;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sl.next(" + ')');
      }
   }

   public class906(class514 var1) {
      this.field10360 = var1;
      this.field10361 = this.field10360.field4317.field208;
      this.field10362 = null;
   }

   public void remove() {
      try {
         if (this.field10362 == null) {
            throw new IllegalStateException();
         } else {
            this.field10362.method156(-404609448);
            this.field10362 = null;
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sl.remove(" + ')');
      }
   }

   public boolean hasNext() {
      try {
         return this.field10360.field4317 != this.field10361;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sl.hasNext(" + ')');
      }
   }

   public static void method6342(int var0) {
      try {
         for(class497 var1 = (class497)class602.field8649.method2706(1694693115); var1 != null; var1 = (class497)class602.field8649.method2707(283371396)) {
            if (-628325139 * var1.field8120 > 1) {
               var1.field8120 = 0;
               class602.field8631.method2984(var1, ((class357)var1.field8121.field4317.field208).field1706 * 6619564980435866523L);
               var1.field8121.method2710(2069073381);
            }
         }

         class602.field8646 = 0;
         class602.field8673 = 0;
         class602.field8647.method905((byte)1);
         class602.field8637.method2941((byte)-2);
         class602.field8649.method2710(-330141284);
         class602.field8645 = false;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sl.aa(" + ')');
      }
   }

   static final void method6343(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[(var0.field3158 -= 969361751) * -203050393];
         var0.field3156 -= -783761378;
         int var3 = var0.field3161[681479919 * var0.field3156];
         int var4 = var0.field3161[681479919 * var0.field3156 + 1];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var2.indexOf(var3, var4);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sl.aau(" + ')');
      }
   }
}
