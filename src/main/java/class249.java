import javax.swing.filechooser.FileFilter;
import java.io.File;

public class class249 extends FileFilter {
    class140 field8424;
    class140 field8425;

    class249(class140 var1, class140 var2) {
        this.field8424 = var1;
        this.field8425 = var2;
    }

    public boolean accept(File var1) {
        try {
            if (this.field8425.method1043(564359284) && var1.isDirectory()) {
                return true;
            } else {
                return !this.field8425.method1043(842824305);
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "aeo.accept(" + ')');
        }
    }

    public String getDescription() {
        return null;
    }
}
