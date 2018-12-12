public class class580 {
   static float[] field158 = new float[16384];
   static float[] field159 = new float[16384];

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field158[var2] = (float)Math.sin((double)var2 * var0);
         field159[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   class580() throws Throwable {
      throw new Error();
   }
}
