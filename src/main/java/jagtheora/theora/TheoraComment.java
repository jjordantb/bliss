package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraComment extends SimplePeer {
   public TheoraComment() {
      this.init();
      if (this.a()) {
         throw new IllegalStateException();
      }
   }

   private native void init();

   protected native void clear();

   protected native void k();

   protected native void d();
}
