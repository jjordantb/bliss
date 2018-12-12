package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {
   public int a;
   public int f;
   public int[] pixels;

   static {
      init();
   }

   public Frame(int var1, int var2) {
      this.a = var1 * -1504155185;
      this.f = -156270913 * var2;
      this.pixels = new int[1264450863 * this.a * -1459424961 * this.f];
   }

   private static native void init();

   protected native void clear();

   protected native void k();

   protected native void d();
}
