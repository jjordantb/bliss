package jaclib.memory;

public class NativeBuffer implements I, Z {
   private int a = -1;
   private long f;

   public final int a() {
      return this.a;
   }

   public final long f() {
      return this.f;
   }

   public void b(byte[] var1, int var2, int var3, int var4) {
      if (0L == this.f | var1 == null | var2 < 0 | var2 + var4 > var1.length | var3 < 0 | var4 + var3 > this.a) {
         throw new RuntimeException();
      } else {
         this.put(this.f, var1, var2, var3, var4);
      }
   }

   private final native void get(long var1, byte[] var3, int var4, int var5, int var6);

   private final native void put(long var1, byte[] var3, int var4, int var5, int var6);

   public void p(byte[] var1, int var2, int var3, int var4) {
      if (0L == this.f | var1 == null | var2 < 0 | var2 + var4 > var1.length | var3 < 0 | var4 + var3 > this.a) {
         throw new RuntimeException();
      } else {
         this.put(this.f, var1, var2, var3, var4);
      }
   }

   public void i(byte[] var1, int var2, int var3, int var4) {
      if (0L == this.f | var1 == null | var2 < 0 | var2 + var4 > var1.length | var3 < 0 | var4 + var3 > this.a) {
         throw new RuntimeException();
      } else {
         this.put(this.f, var1, var2, var3, var4);
      }
   }

   public void k(byte[] var1, int var2, int var3, int var4) {
      if (0L == this.f | var1 == null | var2 < 0 | var2 + var4 > var1.length | var3 < 0 | var4 + var3 > this.a) {
         throw new RuntimeException();
      } else {
         this.put(this.f, var1, var2, var3, var4);
      }
   }

   public final long d() {
      return this.f;
   }

   public final long u() {
      return this.f;
   }

   public final int x() {
      return this.a;
   }

   public final int r() {
      return this.a;
   }

   public final int q() {
      return this.a;
   }

   public final int n() {
      return this.a;
   }
}
