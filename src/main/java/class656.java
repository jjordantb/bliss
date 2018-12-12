public class class656 extends class828 {
   public byte[] field9400;
   int field9401;
   public int field9402;
   public int field9403;
   public boolean field9404;

   class656(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field9403 = var1;
      this.field9400 = var2;
      this.field9402 = var3;
      this.field9401 = var4;
      this.field9404 = var5;
   }

   public class656 method5605(class91 var1) {
      this.field9400 = var1.method491(this.field9400, -1269328247);
      this.field9403 = var1.method493(this.field9403, -1038860736);
      if (this.field9402 == this.field9401) {
         this.field9402 = this.field9401 = var1.method494(this.field9402, -1221225571);
      } else {
         this.field9402 = var1.method494(this.field9402, 465158744);
         this.field9401 = var1.method494(this.field9401, -220655901);
         if (this.field9402 == this.field9401) {
            --this.field9402;
         }
      }

      return this;
   }

   class656(int var1, byte[] var2, int var3, int var4) {
      this.field9403 = var1;
      this.field9400 = var2;
      this.field9402 = var3;
      this.field9401 = var4;
   }
}
