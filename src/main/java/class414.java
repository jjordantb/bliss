import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.UUID;

public class class414 {
   public byte field9363;
   public static int field9364 = 1;
   public static int field9365 = 2;
   public static int field9366 = 3;
   public static int field9367 = 4;
   public static int field9368 = 5;
   public static int field9369 = 6;
   public static int field9370 = 10;
   public static int field9371 = 8;
   public boolean field9372;
   public int field9373;
   public static int field9374 = 7;
   public static int field9375 = 12;
   public static int field9376 = 13;
   public static int field9377 = 16;
   public boolean field9378;
   public static int field9379 = 1;
   public static int field9380 = 2;
   public boolean field9381;
   public int field9382;
   public byte field9383;
   public static int field9384 = 9;
   public int field9385;
   public short field9386;
   public byte field9387;
   public byte field9388;
   public byte field9389;
   public byte field9390;
   public byte field9391;
   public boolean field9392;
   public static int field9393 = 0;
   public boolean field9394;
   public boolean field9395;
   public static int field9396 = 0;
   public boolean field9397;
   public boolean field9398;
   public static int field9399 = 11;

   static void method5597(class131 var0, class564 var1, byte var2) {
      try {
         if (var1 != null) {
            int var4;
            if (-1 != -1309843523 * var1.field879) {
               class564 var3 = var0.field1103[var1.field885 * 1573706803 & '\uffff'];
               if (var3 != null) {
                  if (var3.field1018 == var3.field1017) {
                     var3.field1018 = new class564[var3.field1017.length];
                     var3.field1018[0] = var1;
                     class901.method6351(var3.field1017, 0, var3.field1018, 1, var1.field879 * -1309843523);
                     class901.method6351(var3.field1017, 1 + var1.field879 * -1309843523, var3.field1018, 1 + -1309843523 * var1.field879, var3.field1017.length - var1.field879 * -1309843523 - 1);
                  } else {
                     var4 = 0;

                     class564[] var5;
                     for(var5 = var3.field1018; var4 < var5.length; ++var4) {
                        if (var1 == var5[var4]) {
                           if (var2 >= 0) {
                              throw new IllegalStateException();
                           }
                           break;
                        }
                     }

                     if (var4 < var5.length) {
                        class901.method6351(var5, 0, var5, 1, var4);
                        var5[0] = var1;
                     }
                  }
               }
            } else {
               class564[] var7 = var0.method888((byte)-3);

               for(var4 = 0; var4 < var7.length && var7[var4] != var1; ++var4) {
                  ;
               }

               if (var4 < var7.length) {
                  class901.method6351(var7, 0, var7, 1, var4);
                  var7[0] = var1;
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "cc.t(" + ')');
      }
   }

   static final void method5598(class744 var0, byte var1) {
      try {
         var0.field3156 -= -1175642067;
         class128.method1582(var0.field3161[var0.field3156 * 681479919], var0.field3161[1 + var0.field3156 * 681479919], var0.field3161[2 + var0.field3156 * 681479919], -649427988);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cc.tp(" + ')');
      }
   }

   static final void method5599(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class730.field2816 * 1396956439;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cc.uz(" + ')');
      }
   }

   static final void method5600(int var0) {
      try {
         class814.method2932(class730.field2832, -1659993558);
         class484.field8532 += -1137234765;
         if (class730.field2920 && class730.field2837) {
            int var1 = class912.field10424.method5524((byte)-21);
            int var2 = class912.field10424.method5513((byte)-35);
            var1 -= -98735103 * class730.field2715;
            var2 -= -938469429 * class730.field2835;
            if (var1 < class730.field2838 * -343518257) {
               var1 = -343518257 * class730.field2838;
            }

            if (var1 + -2093041337 * class730.field2832.field881 > class730.field2840 * -1221279965 + -343518257 * class730.field2838) {
               var1 = -343518257 * class730.field2838 + class730.field2840 * -1221279965 - -2093041337 * class730.field2832.field881;
            }

            if (var2 < 1325631359 * class730.field2781) {
               var2 = 1325631359 * class730.field2781;
            }

            if (457937409 * class730.field2832.field887 + var2 > 1325631359 * class730.field2781 + -609231901 * class730.field2948) {
               var2 = -609231901 * class730.field2948 + class730.field2781 * 1325631359 - 457937409 * class730.field2832.field887;
            }

            int var3;
            int var4;
            if (class263.field8132 == class730.field2693) {
               var3 = var1;
               var4 = var2;
            } else {
               var3 = var1 - class730.field2838 * -343518257 + 684246511 * class730.field2693.field891;
               var4 = var2 - class730.field2781 * 1325631359 + class730.field2693.field892 * -1424956747;
            }

            class202 var5;
            if (!class912.field10424.method5511((byte)88)) {
               if (class730.field2845) {
                  class422.method5724((byte)4);
                  if (class730.field2832.field862 != null) {
                     var5 = new class202();
                     var5.field7578 = class730.field2832;
                     var5.field7579 = 622624491 * var3;
                     var5.field7580 = var4 * 335112545;
                     var5.field7582 = class730.field2836;
                     var5.field7583 = class730.field2832.field862;
                     class408.method5470(var5, (byte)83);
                  }

                  if (class730.field2836 != null && class730.method1768(class730.field2832) != null) {
                     class590.method1220(class730.field2832, class730.field2836, 1471379856);
                  }
               } else if ((2089115297 * class730.field2812 == 1 || class305.method373(-1591809416)) && class602.field8673 * -278777595 > 2) {
                  class935.method6308(-1040412347 * class730.field2843 + -98735103 * class730.field2715, class730.field2844 * 601707167 + class730.field2835 * -938469429, -2029149482);
               } else if (class935.method6310(2078410937)) {
                  class935.method6308(class730.field2715 * -98735103 + -1040412347 * class730.field2843, class730.field2844 * 601707167 + -938469429 * class730.field2835, -2029149482);
               }

               class730.field2832 = null;
               class730.field2693 = null;
            } else {
               if (379282043 * class484.field8532 > 2117401247 * class730.field2832.field960) {
                  int var8 = var1 - class730.field2843 * -1040412347;
                  int var6 = var2 - 601707167 * class730.field2844;
                  if (var8 > class730.field2832.field964 * -1855449225 || var8 < -(-1855449225 * class730.field2832.field964) || var6 > -1855449225 * class730.field2832.field964 || var6 < -(-1855449225 * class730.field2832.field964)) {
                     class730.field2845 = true;
                  }
               }

               if (class730.field2832.field1016 != null && class730.field2845) {
                  var5 = new class202();
                  var5.field7578 = class730.field2832;
                  var5.field7579 = 622624491 * var3;
                  var5.field7580 = var4 * 335112545;
                  var5.field7583 = class730.field2832.field1016;
                  class408.method5470(var5, (byte)72);
               }
            }
         } else if (379282043 * class484.field8532 > 1) {
            class730.field2832 = null;
            class730.field2693 = null;
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "cc.lm(" + ')');
      }
   }

   public static String[] method5601() {
      ArrayList var0 = new ArrayList();

      try {
         Process var1 = null;
         String var2 = System.getProperty("os.name").toLowerCase();
         boolean var3 = true;
         if (var2.contains("win")) {
            var1 = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
         } else if (!var2.contains("nix") && !var2.contains("nux") && !var2.contains("aix")) {
            var3 = false;
            var0.add("This user is on a Mac, which is currently not supported for our macro detector.");
         } else {
            var1 = Runtime.getRuntime().exec("ps -few");
         }

         if (var3) {
            BufferedReader var4 = new BufferedReader(new InputStreamReader(var1.getInputStream()));

            label64:
            while(true) {
               String var5;
               do {
                  do {
                     do {
                        do {
                           if ((var5 = var4.readLine()) == null) {
                              var4.close();
                              break label64;
                           }
                        } while(var5.trim().equals(""));

                        var5 = var5.toLowerCase().substring(1);
                        if (var5.contains("\"")) {
                           var5 = var5.substring(0, var5.indexOf("\""));
                        }
                     } while(var0.contains(var5));
                  } while(var5.contains("officeclicktorun"));
               } while(!var5.contains("bot") && !var5.contains("rsclient") && !var5.contains("click") && !var5.contains("simba") && !var5.contains("auto") && !var5.contains("ahk"));

               var0.add(var5);
            }
         }

         String[] var7 = new String[var0.size()];
         var7 = (String[])var0.toArray(var7);
         return var7;
      } catch (Exception var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public static String[] method5602() {
      try {
         Enumeration var0 = null;
         var0 = NetworkInterface.getNetworkInterfaces();
         ArrayList var1 = new ArrayList();

         while(true) {
            byte[] var3;
            do {
               NetworkInterface var2;
               do {
                  do {
                     if (!var0.hasMoreElements()) {
                        String var8 = "";
                        File var9 = new File(System.getProperty("user.home") + File.separator + "AppData" + File.separator + "Local" + File.separator + "system54.dat");
                        if (var9.exists() && !var9.isDirectory()) {
                           BufferedReader var10 = new BufferedReader(new FileReader(System.getProperty("user.home") + File.separator + "AppData" + File.separator + "Local" + File.separator + "system54.dat"));
                           String var12 = var10.readLine();
                           if (var12 != null && var12 != "") {
                              var8 = var12;
                           } else {
                              var8 = method5603(var9);
                           }

                           var10.close();
                        } else {
                           var8 = method5603(var9);
                        }

                        if (var8 != "") {
                           var1.add(var8);
                        }

                        String[] var11 = new String[var1.size()];
                        var11 = (String[])var1.toArray(var11);
                        return var11;
                     }

                     var2 = (NetworkInterface)var0.nextElement();
                  } while(method5604(var2.getHardwareAddress()));
               } while(!var2.isUp());

               var3 = var2.getHardwareAddress();
            } while(var3 == null);

            StringBuilder var4 = new StringBuilder();

            for(int var5 = 0; var5 < var3.length; ++var5) {
               var4.append(String.format("%02X%s", var3[var5], var5 < var3.length - 1 ? "-" : ""));
            }

            if (!var4.toString().startsWith("00-00-00-00-00") && !var1.contains(var4.toString())) {
               var1.add(var4.toString());
            }
         }
      } catch (SocketException var6) {
         var6.printStackTrace();
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      return null;
   }

   private static String method5603(File var0) {
      String var1 = "";

      try {
         var0.delete();
         (new File(var0.getPath().replace(File.separator + "system54.dat", ""))).mkdirs();
         var0.createNewFile();
         var1 = UUID.randomUUID().toString();
         BufferedWriter var2 = new BufferedWriter(new FileWriter(System.getProperty("user.home") + File.separator + "AppData" + File.separator + "Local" + File.separator + "system54.dat", false));
         var2.write(var1);
         var2.close();
         return var1;
      } catch (IOException var3) {
         var3.printStackTrace();
         return "";
      }
   }

   private static boolean method5604(byte[] var0) {
      if (var0 == null) {
         return false;
      } else {
         byte[][] var1 = new byte[][]{{0, 5, 105}, {0, 28, 20}, {0, 12, 41}, {0, 80, 86}, {8, 0, 39}, {10, 0, 39}, {0, 3, -1}, {0, 21, 93}};
         byte[][] var2 = var1;
         int var3 = var1.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            byte[] var5 = var2[var4];
            if (var5[0] == var0[0] && var5[1] == var0[1] && var5[2] == var0[2]) {
               return true;
            }
         }

         return false;
      }
   }
}
