import java.lang.ref.SoftReference;

public class class685 extends class89 {
   SoftReference field7720;

   class685(class195 var1, Object var2, int var3) {
      super(var1, var3);
      this.field7720 = new SoftReference(var2);
   }

   boolean method953() {
      return true;
   }

   Object method952() {
      return this.field7720.get();
   }
}
