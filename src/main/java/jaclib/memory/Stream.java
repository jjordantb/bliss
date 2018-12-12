package jaclib.memory;

public final class Stream {
   private I a;
   private int f;
   private int b;
   private int p;
   private byte[] i;
   private static boolean k = getLSB(-65536) == -1;

   public Stream() {
      this(4096);
   }

   private Stream(int var1) {
      this.i = new byte[var1];
   }

   public Stream(I var1) {
      this(var1, 0, var1.a());
   }

   public Stream(I var1, int var2, int var3) {
      this(var1.a() < 4096 ? var1.a() : 4096);
      this.a(var1, var2, var3);
   }

   private void a(I var1, int var2, int var3) {
      this.x();
      this.a = var1;
      this.b = var2;
      this.f = var3 + var2;
      if (this.f > var1.a()) {
         throw new RuntimeException();
      }
   }

   public int f() {
      return this.p + this.b;
   }

   public void b(int var1) {
      this.x();
      this.b = var1;
   }

   public void p(int var1) {
      if (this.p >= this.i.length) {
         this.x();
      }

      this.i[++this.p - 1] = (byte)var1;
   }

   public void i(int var1) {
      if (3 + this.p >= this.i.length) {
         this.x();
      }

      this.i[++this.p - 1] = (byte)var1;
      this.i[++this.p - 1] = (byte)(var1 >> 8);
      this.i[++this.p - 1] = (byte)(var1 >> 16);
      this.i[++this.p - 1] = (byte)(var1 >> 24);
   }

   public void k(int var1) {
      if (3 + this.p >= this.i.length) {
         this.x();
      }

      this.i[++this.p - 1] = (byte)(var1 >> 16);
      this.i[++this.p - 1] = (byte)(var1 >> 8);
      this.i[++this.p - 1] = (byte)var1;
      this.i[++this.p - 1] = (byte)(var1 >> 24);
   }

   public void d(float var1) {
      if (this.p + 3 >= this.i.length) {
         this.x();
      }

      int var2 = floatToRawIntBits(var1);
      this.i[++this.p - 1] = (byte)(var2 >> 24);
      this.i[++this.p - 1] = (byte)(var2 >> 16);
      this.i[++this.p - 1] = (byte)(var2 >> 8);
      this.i[++this.p - 1] = (byte)var2;
   }

   public void u(float var1) {
      if (3 + this.p >= this.i.length) {
         this.x();
      }

      int var2 = floatToRawIntBits(var1);
      this.i[++this.p - 1] = (byte)var2;
      this.i[++this.p - 1] = (byte)(var2 >> 8);
      this.i[++this.p - 1] = (byte)(var2 >> 16);
      this.i[++this.p - 1] = (byte)(var2 >> 24);
   }

   public void x() {
      if (this.p > 0) {
         if (this.p + this.b > this.f) {
            throw new RuntimeException();
         }

         this.a.b(this.i, 0, this.b, this.p);
         this.b += this.p;
         this.p = 0;
      }

   }

   public static final boolean r() {
      return k;
   }

   public static native int floatToRawIntBits(float var0);

   private static final native byte getLSB(int var0);
}
