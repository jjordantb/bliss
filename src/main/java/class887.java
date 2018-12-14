import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class887 extends class792 implements class297 {
    long field10129;

    class887(class955 var1, int var2) {
        this.sa(var1, var2);
    }

    native void sa(class955 var1, int var2);

    protected void finalize() {
        try {
            if (this.field10129 != 0L) {
                class189.method3360(this, (short) -1633);
            }

            try {
                Class var1 = ClassLoader.class;
                Field var2 = var1.getDeclaredField("nativeLibraries");
                Class var3 = AccessibleObject.class;
                Method var4 = var3.getDeclaredMethod("setAccessible", Boolean.TYPE);
                var4.invoke(var2, Boolean.TRUE);
            } catch (Throwable var5) {
                ;
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ba.finalize(" + ')');
        }
    }

    public native void method6550(boolean var1);

    native void ha();

    native void u();
}
