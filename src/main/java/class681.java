import java.lang.ref.SoftReference;

public class class681 extends class142 {
   public static byte[][][] field7538;
   SoftReference field7539;

   Object method1075(int var1) {
      try {
         return this.field7539.get();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akt.a(" + ')');
      }
   }

   boolean method1076(int var1) {
      return true;
   }

   class681(Object var1, int var2) {
      super(var2);
      this.field7539 = new SoftReference(var1);
   }
}
