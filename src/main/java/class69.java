import jaclib.nanotime.QueryPerformanceCounter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

public abstract class class69 implements class217, Runnable, FocusListener, WindowListener {
   static class99 field1806 = null;
   public static int field1807 = 0;
   static String field1808 = "rw";
   static int field1809 = 32;
   public static int field1810 = 1;
   protected static volatile boolean field1811 = true;
   protected static int field1812;
   public static int field1813 = 0;
   public static int field1814 = 0;
   static class645 field1815 = null;
   protected static class645 field1816 = null;
   static int field1817 = 500;
   protected static volatile boolean field1818 = false;
   static long[] field1819 = new long[32];
   protected static boolean field1820 = false;
   static volatile boolean field1821 = true;
   static int field1822 = 524288000;
   static int field1823 = 1048576;
   static long field1824 = 20000000L;
   protected static String field1825 = null;
   static long[] field1826 = new long[32];
   public static int field1827 = -1;
   static String field1828 = "main_file_cache.idx255";
   static String field1829 = "random.dat";
   static String field1830 = "main_file_cache.idx";
   static volatile long field1831 = 0L;
   public static class461 field1832;
   static int field1833 = 0;
   static String field1834 = "main_file_cache.dat2";
   static int field1835 = 1;
   static long field1836 = 0L;
   static boolean field1837 = false;
   boolean field1838 = false;
   static class645 field1839 = null;
   static File field1840;
   boolean field1841 = false;

   public final void windowOpened(WindowEvent var1) {
   }

   public void method3943(Applet var1) {
      try {
         class833.field9178 = var1;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mc.supplyApplet(" + ')');
      }
   }

   final void method1301(class716 var1, String var2, String var3, int var4, int var5, int var6, int var7, boolean var8, byte var9) {
      try {
         try {
            this.method1312(class99.field626, var8, (short)-2229);
            class919.field10433 = class759.field4331 = var1.method2041((byte)-35);
            field1812 = class97.field614 = var1.method2045(2024501789);
            field1813 = 0;
            field1814 = 0;
            if (class382.method1061((byte)35) == class99.field627) {
               class919.field10433 += 2 * var1.method2042((byte)52);
               field1812 += 2 * var1.method2043(-974427485);
               this.method1330(var1.method2044(1376340372), -260131528);
            }

            class862.field8933 = class833.field9178;
            this.method1302(var2, var3, var4, var5, var6, var7, (byte)95);
         } catch (Throwable var11) {
            class764.method2747((String)null, var11, (short)-30442);
            this.method1328("crash", 1946443012);
         }

      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "mc.a(" + ')');
      }
   }

   final void method1302(String var1, String var2, int var3, int var4, int var5, int var6, byte var7) throws Exception {
      try {
         class738.field3001 = var4;
         class971.field2987 = var3;
         class862.field8934 = var5;
         class878.field9821 = var6;
         class507.field4017 = "Unknown";
         class981.field3273 = "1.1";

         try {
            class507.field4017 = System.getProperty("java.vendor");
            class981.field3273 = System.getProperty("java.version");
         } catch (Exception var20) {
            ;
         }

         try {
            class199.field7036 = System.getProperty("os.name");
         } catch (Exception var19) {
            class199.field7036 = "Unknown";
         }

         class407.field9261 = class199.field7036.toLowerCase();

         try {
            class198.field7050 = System.getProperty("os.arch").toLowerCase();
         } catch (Exception var18) {
            class198.field7050 = "";
         }

         try {
            class322.field841 = System.getProperty("os.version").toLowerCase();
         } catch (Exception var17) {
            class322.field841 = "";
         }

         try {
            class323.field631 = System.getProperty("user.home");
            if (class323.field631 != null) {
               class323.field631 = class323.field631 + "/";
            }
         } catch (Exception var16) {
            ;
         }

         try {
            if (class407.field9261.startsWith("win")) {
               if (class323.field631 == null) {
                  class323.field631 = System.getenv("USERPROFILE");
               }
            } else if (class323.field631 == null) {
               class323.field631 = System.getenv("HOME");
            }

            if (class323.field631 != null) {
               class323.field631 = class323.field631 + "/";
            }
         } catch (Exception var15) {
            ;
         }

         if (class323.field631 == null) {
            class323.field631 = "~/";
         }

         try {
            class744.field3179 = Toolkit.getDefaultToolkit().getSystemEventQueue();
         } catch (Throwable var14) {
            ;
         }

         class82.field1108 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class323.field631, "/tmp/", ""};
         class396.field6516 = new String[]{".matrix_cache_" + class971.field2987, ".file_store_" + class971.field2987};
         int var8 = 0;

         label141:
         while(var8 < 4) {
            field1840 = this.method1333(var1, var2, var8, (short)8683);
            if (!field1840.exists()) {
               field1840.mkdirs();
            }

            File[] var9 = field1840.listFiles();
            if (var9 == null) {
               break;
            }

            File[] var10 = var9;
            int var11 = 0;

            while(true) {
               if (var11 >= var10.length) {
                  break label141;
               }

               File var12 = var10[var11];
               if (!this.method1303(var12, false, -547060345)) {
                  if (var7 <= 3) {
                     return;
                  }

                  ++var8;
                  break;
               }

               ++var11;
            }
         }

         class729.method1703(field1840, (byte)113);
         class246.method4734(527600768);
         field1816 = new class645(new class439(class299.method6554("main_file_cache.dat2", (byte)-19), "rw", 524288000L), 5200, 0);
         field1815 = new class645(new class439(class299.method6554("main_file_cache.idx255", (byte)-21), "rw", 1048576L), 6000, 0);
         class785.field3828 = new class645[class738.field3001];

         for(var8 = 0; var8 < class738.field3001; ++var8) {
            class785.field3828[var8] = new class645(new class439(class299.method6554("main_file_cache.idx" + var8, (byte)-49), "rw", 1048576L), 6000, 0);
         }

         try {
            class382.field1409 = new class549();
         } catch (Exception var13) {
            class53.field2311 = false;
         }

         class462.field7361 = new class581();
         ThreadGroup var22 = Thread.currentThread().getThreadGroup();

         for(ThreadGroup var23 = var22.getParent(); var23 != null; var23 = var23.getParent()) {
            var22 = var23;
         }

         Thread[] var24 = new Thread[1000];
         var22.enumerate(var24);

         for(int var25 = 0; var25 < var24.length; ++var25) {
            if (var24[var25] != null && var24[var25].getName().startsWith("AWT")) {
               var24[var25].setPriority(1);
            }
         }

         Thread var26 = new Thread(this);
         var26.setDaemon(true);
         var26.start();
         var26.setPriority(1);
      } catch (RuntimeException var21) {
         throw class158.method3445(var21, "mc.f(" + ')');
      }
   }

   boolean method1303(File var1, boolean var2, int var3) {
      try {
         boolean var6;
         try {
            RandomAccessFile var4 = new RandomAccessFile(var1, "rw");
            int var5 = var4.read();
            var4.seek(0L);
            var4.write(var5);
            var4.seek(0L);
            var4.close();
            if (var2) {
               var1.delete();
            }

            var6 = true;
         } catch (Exception var7) {
            return false;
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "mc.k(" + ')');
      }
   }

   public boolean method1304(File var1, int var2) {
      try {
         if (var1 == null) {
            return false;
         } else if (!var1.exists()) {
            return false;
         } else if (!var1.isDirectory()) {
            return false;
         } else if (var1.listFiles().length != 0) {
            return false;
         } else if (!this.method1303(new File(var1, "test.dat"), true, -1050192338)) {
            return false;
         } else {
            this.method1305(var1, field1840, 285238690);
            return true;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mc.p(" + ')');
      }
   }

   void method1305(File var1, File var2, int var3) {
      try {
         try {
            class439 var4 = new class439(class691.field7134, "rw", 10000L);
            InputStream var5 = new InputStream(500);
            var5.method6361(2);
            var5.method6361(var2 != null ? 1 : 0);
            var5.method6418(var1.getPath(), (short)3940);
            if (var2 != null) {
               var5.method6418(var2.getPath(), (short)-4942);
            }

            var4.method4275(var5.field10375, 0, var5.field10376, -1059972794);
            var4.method4276(1033544132);
         } catch (IOException var6) {
            var6.printStackTrace();
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "mc.i(" + ')');
      }
   }

   synchronized void method1306(int var1) {
      try {
         this.method1307(-924154311);
         Container var2 = class348.method193((byte)114);
         class837.field9161 = new CanvasImpl(var2);
         this.method1327(var2, -1139610021);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mc.y(" + ')');
      }
   }

   void method1307(int var1) {
      try {
         if (class837.field9161 != null) {
            class837.field9161.removeFocusListener(this);
            class837.field9161.getParent().setBackground(Color.black);
            class837.field9161.getParent().remove(class837.field9161);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mc.v(" + ')');
      }
   }

   final boolean method1308(int var1) {
      try {
         String var2 = class833.field9178.getDocumentBase().getHost().toLowerCase();
         if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
            if (!var2.equals("matrixftw.com") && !var2.endsWith(".matrixftw.com")) {
               if (!var2.equals("matrixrsps.com") && !var2.endsWith(".matrixrsps.com")) {
                  if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
                     if (!var2.equals("stellardawn.com") && !var2.endsWith(".stellardawn.com")) {
                        if (!var2.endsWith("127.0.0.1") && !var2.endsWith(Loader.field6960)) {
                           while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                              var2 = var2.substring(0, var2.length() - 1);
                           }

                           if (var2.endsWith("192.168.1.")) {
                              return true;
                           } else {
                              this.method1328("invalidhost", 827144132);
                              return false;
                           }
                        } else {
                           return true;
                        }
                     } else {
                        return true;
                     }
                  } else {
                     return true;
                  }
               } else {
                  return true;
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mc.g(" + ')');
      }
   }

   public void run() {
      try {
         try {
            try {
               this.method1309((byte)52);
            } catch (ThreadDeath var2) {
               throw var2;
            } catch (Throwable var3) {
               class764.method2747(this.method1311((byte)7), var3, (short)-23042);
               this.method1328("crash", 1023949022);
               this.method1326(true, (byte)127);
               return;
            }

            this.method1326(true, (byte)85);
         } catch (RuntimeException var4) {
            this.method1326(true, (byte)16);
            throw var4;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mc.run(" + ')');
      }
   }

   void method1309(byte var1) {
      try {
         if (class507.field4017 != null) {
            String var2 = class507.field4017.toLowerCase();
            if (var2.indexOf("sun") != -1 || var2.indexOf("apple") != -1) {
               String var3 = class981.field3273;
               if (var3.equals("1.1") || var3.startsWith("1.1.") || var3.equals("1.2") || var3.startsWith("1.2.") || var3.equals("1.3") || var3.startsWith("1.3.") || var3.equals("1.4") || var3.startsWith("1.4.") || var3.equals("1.5") || var3.startsWith("1.5.") || var3.equals("1.6.0")) {
                  this.method1328("wrongjava", -1275699738);
                  return;
               }

               if (var3.startsWith("1.6.0_")) {
                  int var4;
                  for(var4 = 6; var4 < var3.length() && class488.method4736(var3.charAt(var4), -1385964882); ++var4) {
                     ;
                  }

                  String var5 = var3.substring(6, var4);
                  if (class808.method2894(var5, 1847779492) && class82.method917(var5, (short)-16539) < 10) {
                     this.method1328("wrongjava", 1520717461);
                     return;
                  }
               }
            }
         }

         class348.method193((byte)121).setFocusCycleRoot(true);
         field1827 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
         field1810 = Runtime.getRuntime().availableProcessors();
         this.method1306(-781587209);
         this.method1313((byte)1);
         field1832 = class881.method6173(-978847778);

         while(0L == field1836 || class27.method3468((byte)1) < field1836) {
            class845.field8630 = field1832.method3977(field1824);

            for(int var7 = 0; var7 < class845.field8630; ++var7) {
               this.method1314((byte)1);
            }

            this.method1310(-454270165);
            class447.method4320(class837.field9161, -2014187301);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "mc.e(" + ')');
      }
   }

   void method1310(int var1) {
      try {
         long var2 = class27.method3468((byte)1);
         long var4 = field1826[class111.field1907];
         field1826[class111.field1907] = var2;
         class111.field1907 = class111.field1907 + 1 & 31;
         if (var4 != 0L && var2 > var4) {
            int var6 = (int)(var2 - var4);
            field1807 = ((var6 >> 1) + 32000) / var6;
         }

         if (++field1817 - 1 > 50) {
            field1817 -= 50;
            field1811 = true;
            class837.field9161.setSize(class759.field4331, class97.field614);
            class837.field9161.setVisible(true);
            if (class701.field3371 != null && class296.field10468 == null) {
               Insets var9 = class701.field3371.getInsets();
               class837.field9161.setLocation(var9.left + field1813, field1814 + var9.top);
            } else {
               class837.field9161.setLocation(field1813, field1814);
            }
         }

         this.method1324(1539562437);
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "mc.w(" + ')');
      }
   }

   String method1311(byte var1) {
      return null;
   }

   void method1312(class99 var1, boolean var2, short var3) {
      try {
         if (var1 == null) {
            throw new NullPointerException();
         } else if (var1 != class99.field626 && class99.field625 != var1) {
            throw new IllegalStateException();
         } else {
            field1806 = var1;
            if (field1806 != class99.field625 && var2) {
               field1806 = class99.field627;
            }

         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mc.az(" + ')');
      }
   }

   public final synchronized void method3947(Graphics var1) {
      try {
         if (!field1837) {
            field1811 = true;
            if (class27.method3468((byte)1) - field1831 > 1000L) {
               Rectangle var2 = var1.getClipBounds();
               if (var2 == null || var2.width >= class919.field10433 && var2.height >= field1812) {
                  field1818 = true;
               }
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mc.paint(" + ')');
      }
   }

   public final void focusGained(FocusEvent var1) {
      try {
         field1821 = true;
         field1811 = true;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mc.focusGained(" + ')');
      }
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      try {
         field1820 = true;
         this.method3945();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mc.windowClosing(" + ')');
      }
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public void method3956() {
      try {
         if (!field1837) {
            field1836 = 0L;
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "mc.start(" + ')');
      }
   }

   public abstract void method3941();

   abstract void method1313(byte var1);

   void method1314(byte var1) {
      try {
         long var2 = class27.method3468((byte)1);
         long var4 = field1819[class596.field2141];
         field1819[class596.field2141] = var2;
         class596.field2141 = 1 + class596.field2141 & 31;
         if (0L != var4) {
            ;
         }

         synchronized(this) {
            class619.field8869 = field1821;
         }

         this.method1323((byte)17);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "mc.m(" + ')');
      }
   }

   abstract void method1315(int var1);

   public boolean method1316(int var1) {
      try {
         this.field1841 = class933.method6286(-1461998657).method3930("jaclib", 888400764);
         if (this.field1841) {
            try {
               QueryPerformanceCounter.init();
            } catch (Throwable var3) {
               ;
            }
         }

         return this.field1841;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mc.ai(" + ')');
      }
   }

   public boolean method1317(int var1) {
      try {
         return class933.method6286(-975726550).method3930("jagtheora", 1050805065);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mc.al(" + ')');
      }
   }

   public void method3945() {
      try {
         if (!field1837) {
            field1836 = class27.method3468((byte)1);
            class764.method2745(5000L);
            this.method1326(false, (byte)120);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "mc.destroy(" + ')');
      }
   }

   abstract void method1323(byte var1);

   abstract void method1324(int var1);

   final void method1326(boolean var1, byte var2) {
      try {
         synchronized(this) {
            if (field1837) {
               return;
            }

            field1837 = true;
         }

         try {
            this.method1315(2099588371);
         } catch (Exception var6) {
            ;
         }

         try {
            field1816.method6149(23087728);

            for(int var3 = 0; var3 < class738.field3001; ++var3) {
               class785.field3828[var3].method6149(1779540289);
            }

            field1815.method6149(1551725262);
            field1839.method6149(1640504231);
         } catch (Exception var7) {
            ;
         }

         if (this.field1841) {
            try {
               QueryPerformanceCounter.quit();
            } catch (Throwable var5) {
               ;
            }
         }

         class189.method3364(true, 32768);
         if (class307.method390(-1578689153)) {
            class933.method6286(-1456500375).method3929(-242181565);
         }

         if (class837.field9161 != null) {
            try {
               class837.field9161.removeFocusListener(this);
               class837.field9161.getParent().remove(class837.field9161);
            } catch (Exception var4) {
               ;
            }
         }

         if (class701.field3371 != null) {
            class701.field3371.setVisible(false);
            class701.field3371.dispose();
            class701.field3371 = null;
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "mc.o(" + ')');
      }
   }

   void method1327(Container var1, int var2) {
      try {
         var1.setBackground(Color.black);
         var1.setLayout((LayoutManager)null);
         var1.add(class837.field9161);
         class837.field9161.setSize(class759.field4331, class97.field614);
         class837.field9161.setVisible(true);
         if (var1 == class701.field3371) {
            Insets var3 = class701.field3371.getInsets();
            class837.field9161.setLocation(var3.left + field1813, field1814 + var3.top);
         } else {
            class837.field9161.setLocation(field1813, field1814);
         }

         class837.field9161.addFocusListener(this);
         class837.field9161.requestFocus();
         class619.field8869 = true;
         field1821 = true;
         class837.field9161.setFocusTraversalKeysEnabled(false);
         field1811 = true;
         field1818 = false;
         field1831 = class27.method3468((byte)1);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mc.h(" + ')');
      }
   }

   void method1328(String var1, int var2) {
      try {
         if (!this.field1838) {
            this.field1838 = true;
            System.out.println("error_game_" + var1);

            try {
               class872.method5894(class833.field9178, "loggedout", (short)19911);
            } catch (Throwable var5) {
               ;
            }

            try {
               class833.field9178.getAppletContext().showDocument(new URL(class833.field9178.getCodeBase(), "error_game_" + var1 + ".ws"), "_top");
            } catch (Exception var4) {
               ;
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "mc.ah(" + ')');
      }
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   synchronized void method1330(String var1, int var2) {
      try {
         class701.field3371 = new Frame();
         class701.field3371.setTitle(var1);
         class701.field3371.setResizable(true);
         class701.field3371.addWindowListener(this);
         class701.field3371.setBackground(Color.black);
         class701.field3371.setVisible(true);
         class701.field3371.toFront();
         Insets var3 = class701.field3371.getInsets();
         class701.field3371.setSize(var3.right + class919.field10433 + var3.left, field1812 + var3.top + var3.bottom);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mc.z(" + ')');
      }
   }

   public final void focusLost(FocusEvent var1) {
      try {
         field1821 = false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mc.focusLost(" + ')');
      }
   }

   File method1333(String var1, String var2, int var3, short var4) {
      try {
         String var5 = var3 == 0 ? "" : "" + var3;
         class691.field7134 = new File(class323.field631, "matrix_cl_" + var1 + "_" + var2 + var5 + ".dat");
         String var6 = null;
         String var7 = null;
         boolean var8 = false;
         int var11;
         File var20;
         if (class691.field7134.exists()) {
            try {
               class439 var9 = new class439(class691.field7134, "rw", 10000L);

               InputStream var10;
               for(var10 = new InputStream((int)var9.method4277(-840924897)); var10.field10376 < var10.field10375.length; var10.field10376 += var11) {
                  var11 = var9.method4278(var10.field10375, var10.field10376, var10.field10375.length - var10.field10376, (short)-10746);
                  if (var11 == -1) {
                     throw new IOException();
                  }
               }

               var10.field10376 = 0;
               var11 = var10.method6371();
               if (var11 < 1 || var11 > 2) {
                  throw new IOException("" + var11);
               }

               int var12 = 0;
               if (var11 > 1) {
                  var12 = var10.method6371();
               }

               var6 = var10.method6413(681479919);
               if (1 == var12) {
                  var7 = var10.method6413(681479919);
               }

               var9.method4276(554571748);
            } catch (IOException var18) {
               var18.printStackTrace();
            }

            if (var6 != null) {
               var20 = new File(var6);
               if (!var20.exists()) {
                  var6 = null;
               }
            }

            if (var6 != null) {
               var20 = new File(var6, "test.dat");
               if (!this.method1303(var20, true, -332239711)) {
                  var6 = null;
               }
            }
         }

         if (var6 == null && var3 == 0) {
            label101:
            for(int var21 = 0; var21 < class396.field6516.length; ++var21) {
               for(var11 = 0; var11 < class82.field1108.length; ++var11) {
                  File var22 = new File(class82.field1108[var11] + class396.field6516[var21] + File.separatorChar + var1 + File.separatorChar);
                  if (var22.exists() && this.method1303(new File(var22, "test.dat"), true, -1984790861)) {
                     var6 = var22.toString();
                     var8 = true;
                     break label101;
                  }
               }
            }
         }

         if (var6 == null) {
            var6 = class323.field631 + File.separatorChar + "BlissScapeCache" + var5 + File.separatorChar + var1 + File.separatorChar + var2 + File.separatorChar;
            var8 = true;
         }

         if (var7 != null) {
            var20 = new File(var7);
            File var24 = new File(var6);

            try {
               File[] var23 = var20.listFiles();
               File[] var25 = var23;

               for(int var13 = 0; var13 < var25.length; ++var13) {
                  File var14 = var25[var13];
                  File var15 = new File(var24, var14.getName());
                  boolean var16 = var14.renameTo(var15);
                  if (!var16) {
                     throw new IOException();
                  }
               }
            } catch (Exception var17) {
               var17.printStackTrace();
            }

            var8 = true;
         }

         if (var8) {
            this.method1305(new File(var6), (File)null, 359278649);
         }

         return new File(var6);
      } catch (RuntimeException var19) {
         throw class158.method3445(var19, "mc.b(" + ')');
      }
   }

   public static class888 method1335(Component var0, boolean var1, short var2) {
      try {
         return new class817(var0, var1);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mc.a(" + ')');
      }
   }

   static final void method1336(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class492.method4395(var3, var4, var0, (byte)-29);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mc.eq(" + ')');
      }
   }

   static final void method1337(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         var0.field903 = var2.field3161[--var2.field3156];
         class814.method2932(var0, 510093055);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mc.fy(" + ')');
      }
   }

   static final void method1338(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         var0.field3161[++var0.field3156 - 1] = var3.field892;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mc.pz(" + ')');
      }
   }

   static class98 method1339(int var0, byte var1) {
      try {
         class98[] var2 = class307.method384(-1851883668);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class98 var4 = var2[var3];
            if (var4.field610 == var0) {
               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mc.f(" + ')');
      }
   }

   static final void method1340(class744 var0, int var1) {
      try {
         var0.field3161[var0.field3156 - 1] = var0.field3169.method5781((byte)4)[var0.field3161[var0.field3156 - 1]];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mc.xv(" + ')');
      }
   }

   static void method1341(int var0, String var1, String var2, int var3) {
      try {
         if (class730.field2692 != null) {
            class701 var4 = class637.method5936(class643.field10025, class730.field2692.field7765, (byte)94);
            var4.field3364.method6362(1 + class981.method1930(var1, (byte)-1) + class981.method1930(var2, (byte)-1), 16711935);
            var4.field3364.method6418(var2, (short)-29506);
            var4.field3364.method6415(var0, (byte)1);
            var4.field3364.method6418(var1, (short)12393);
            class730.field2692.method4380(var4, (byte)-120);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mc.apk(" + ')');
      }
   }
}
