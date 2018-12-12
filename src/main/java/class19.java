import java.util.Iterator;

public class class19 implements Iterator {
   class373 field5361;
   class568 field5362;
   class568 field5363 = null;
   static int field5364;

   public void method3365(class373 var1, int var2) {
      try {
         this.field5361 = var1;
         this.field5362 = this.field5361.field1104.field640;
         this.field5363 = null;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sk.d(" + ')');
      }
   }

   void method3366(int var1) {
      try {
         this.field5362 = this.field5361.field1104.field640;
         this.field5363 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sk.u(" + ')');
      }
   }

   public class568 method3367(int var1) {
      try {
         this.method3366(1114782715);
         return (class568)this.next();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sk.x(" + ')');
      }
   }

   public boolean hasNext() {
      try {
         return this.field5362 != this.field5361.field1104;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sk.hasNext(" + ')');
      }
   }

   public void remove() {
      try {
         if (this.field5363 == null) {
            throw new IllegalStateException();
         } else {
            this.field5363.method545(-1460969981);
            this.field5363 = null;
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sk.remove(" + ')');
      }
   }

   public class19(class373 var1) {
      this.field5361 = var1;
      this.field5362 = this.field5361.field1104.field640;
      this.field5363 = null;
   }

   public Object next() {
      try {
         class568 var1 = this.field5362;
         if (this.field5361.field1104 == var1) {
            var1 = null;
            this.field5362 = null;
         } else {
            this.field5362 = var1.field640;
         }

         this.field5363 = var1;
         return var1;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sk.next(" + ')');
      }
   }

   static final void method3368(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         if (class53.field2311) {
            class125[] var3 = class528.method2244((byte)18);
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 28445523 * var3[var2].field2325;
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 262154323 * var3[var2].field2327;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sk.aek(" + ')');
      }
   }

   static final void method3369(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class14.field6693[var0.field3174[1883543357 * var0.field3176]];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sk.aq(" + ')');
      }
   }
}
