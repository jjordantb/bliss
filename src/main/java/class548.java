public class class548 {
   static float[] field396 = new float[16384];
   static float[] field397 = new float[16384];

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field397[var2] = (float)Math.sin((double)var2 * var0);
         field396[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   class548() throws Throwable {
      throw new Error();
   }
}
