package jaclib.ping;

public abstract class IcmpService implements Runnable {
   protected abstract void notify(int var1);

   protected abstract void notify(int var1, int var2, int var3);

   public native void run();

   public native void quit();

   public static native boolean available();

   public native void q();

   public native void n();

   protected abstract void a(int var1);

   protected abstract void f(int var1);

   protected abstract void b(int var1, int var2, int var3);

   protected abstract void p(int var1, int var2, int var3);
}
