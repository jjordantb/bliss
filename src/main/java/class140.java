import java.awt.Container;
import java.awt.Frame;
import java.io.File;
import javax.swing.JFileChooser;

public class class140 implements Runnable {
   File field1400 = null;
   String field1401;
   boolean field1402;
   boolean field1403 = false;

   public boolean method1041(int var1) {
      try {
         return this.field1403;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "j.f(" + ')');
      }
   }

   public void run() {
      try {
         Container var1 = class348.method193((byte)11);
         Frame var2 = null;
         if (class701.field3371 != null) {
            var2 = class701.field3371;
         } else {
            while(var1 != null) {
               if (var1 instanceof Frame) {
                  var2 = (Frame)var1;
                  break;
               }

               var1 = var1.getParent();
            }
         }

         if (var2 == null) {
            throw new RuntimeException("");
         } else {
            JFileChooser var3 = new JFileChooser("");
            var3.setDialogTitle(this.field1401);
            var3.setFileFilter(new class249(this, this));
            var3.setFileSelectionMode(1);
            var3.setAcceptAllFileFilterUsed(false);
            int var4 = var3.showOpenDialog(var2);
            if (var4 == 0) {
               this.field1400 = var3.getSelectedFile();
            }

            this.field1403 = true;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "j.run(" + ')');
      }
   }

   public File method1042(short var1) {
      try {
         return this.field1400;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "j.a(" + ')');
      }
   }

   public class140(String var1, boolean var2) {
      this.field1401 = var1;
      this.field1402 = var2;
      (new Thread(this)).start();
   }

   boolean method1043(int var1) {
      try {
         return this.field1402;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "j.b(" + ')');
      }
   }

   static final void method1044(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class461.method3992(var3, var4, var0, (byte)12);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "j.fl(" + ')');
      }
   }

   static final void method1045(class564 var0, class131 var1, class744 var2, byte var3) {
      try {
         var0.field997 = var2.field3161[--var2.field3156];
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "j.kb(" + ')');
      }
   }

   static final void method1046(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class232.method4661(var3, var0, 171697285);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "j.qa(" + ')');
      }
   }

   static final void method1047(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         class928.method6200(var2, -878846096);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "j.wq(" + ')');
      }
   }

   static final void method1048(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3157[++var0.field3158 - 1] = var0.field3154.field1165[var2].field1497;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "j.xm(" + ')');
      }
   }

   static boolean method1049(int var0, int var1) {
      try {
         return 57 == var0 || 58 == var0 || var0 == 1007 || var0 == 25 || 30 == var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "j.bx(" + ')');
      }
   }

   static final void method1050(class744 var0, int var1) {
      try {
         String var2 = null;
         if (class285.field10627 != null) {
            var2 = class285.field10627.method95(-161430345);
         }

         if (var2 == null) {
            var2 = "";
         }

         var0.field3157[++var0.field3158 - 1] = var2;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "j.afh(" + ')');
      }
   }

   public static String method1051(byte[] var0, int var1, int var2, int var3) {
      try {
         char[] var4 = new char[var2];
         int var5 = 0;
         int var6 = var1;

         int var9;
         for(int var7 = var1 + var2; var6 < var7; var4[var5++] = (char)var9) {
            int var8 = var0[var6++] & 255;
            if (var8 < 128) {
               if (var8 == 0) {
                  var9 = 65533;
               } else {
                  var9 = var8;
               }
            } else if (var8 < 192) {
               var9 = 65533;
            } else if (var8 < 224) {
               if (var6 < var7 && (var0[var6] & 192) == 128) {
                  var9 = (var8 & 31) << 6 | var0[var6++] & 63;
                  if (var9 < 128) {
                     var9 = 65533;
                  }
               } else {
                  var9 = 65533;
               }
            } else if (var8 < 240) {
               if (1 + var6 < var7 && (var0[var6] & 192) == 128 && 128 == (var0[1 + var6] & 192)) {
                  var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                  if (var9 < 2048) {
                     var9 = 65533;
                  }
               } else {
                  var9 = 65533;
               }
            } else if (var8 < 248) {
               if (2 + var6 < var7 && 128 == (var0[var6] & 192) && 128 == (var0[var6 + 1] & 192) && (var0[var6 + 2] & 192) == 128) {
                  var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                  if (var9 >= 65536 && var9 <= 1114111) {
                     var9 = 65533;
                  } else {
                     var9 = 65533;
                  }
               } else {
                  var9 = 65533;
               }
            } else {
               var9 = 65533;
            }
         }

         return new String(var4, 0, var5);
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "j.a(" + ')');
      }
   }
}
