package jaclib.memory.heap;

import jaclib.memory.Z;

public final class I implements jaclib.memory.I, Z {
   private int a;
   public NativeHeap f;
   private int b;
   private boolean p = true;

   I(NativeHeap var1, int var2, int var3) {
      this.f = var1;
      this.b = 615403225 * var2;
      this.a = var3 * -2102913487;
   }

   private final synchronized boolean s() {
      return this.f.a() && this.p;
   }

   public final long f() {
      return this.f.getBufferAddress(this.b * -1901637271);
   }

   public final int a() {
      return 877757137 * this.a;
   }

   public final synchronized void b(byte[] var1, int var2, int var3, int var4) {
      if (!this.s() | var1 == null | var2 < 0 | var4 + var2 > var1.length | var3 < 0 | var4 + var3 > 877757137 * this.a) {
         throw new RuntimeException();
      } else {
         this.f.put(-1901637271 * this.b, var1, var2, var3, var4);
      }
   }

   public final void z(Z var1) {
      this.y(var1, 0L, 0L, var1.a());
   }

   private final synchronized void y(Z var1, long var2, long var4, int var6) {
      if (var1.f() != 0L && this.f() != 0L) {
         this.f.copy(this.f() + var4, var1.f() + var2, var6);
      } else {
         throw new NullPointerException();
      }
   }

   public final synchronized void t() {
      if (this.s()) {
         this.f.deallocateBuffer(-1901637271 * this.b);
      }

      this.p = false;
   }

   protected void finalize() throws Throwable {
      super.finalize();
      this.t();
   }

   public final synchronized void p(byte[] var1, int var2, int var3, int var4) {
      if (!this.s() | var1 == null | var2 < 0 | var4 + var2 > var1.length | var3 < 0 | var4 + var3 > 877757137 * this.a) {
         throw new RuntimeException();
      } else {
         this.f.put(-1901637271 * this.b, var1, var2, var3, var4);
      }
   }

   public final synchronized void i(byte[] var1, int var2, int var3, int var4) {
      if (!this.s() | var1 == null | var2 < 0 | var4 + var2 > var1.length | var3 < 0 | var4 + var3 > 877757137 * this.a) {
         throw new RuntimeException();
      } else {
         this.f.put(-1901637271 * this.b, var1, var2, var3, var4);
      }
   }

   public final synchronized void k(byte[] var1, int var2, int var3, int var4) {
      if (!this.s() | var1 == null | var2 < 0 | var4 + var2 > var1.length | var3 < 0 | var4 + var3 > 877757137 * this.a) {
         throw new RuntimeException();
      } else {
         this.f.put(-1901637271 * this.b, var1, var2, var3, var4);
      }
   }

   public final long d() {
      return this.f.getBufferAddress(this.b * -1901637271);
   }

   public final long u() {
      return this.f.getBufferAddress(this.b * -1901637271);
   }

   public final int x() {
      return 877757137 * this.a;
   }

   public final int r() {
      return 877757137 * this.a;
   }

   public final int q() {
      return 877757137 * this.a;
   }

   public final int n() {
      return 877757137 * this.a;
   }
}
