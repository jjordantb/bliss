import jaclib.hardware_info.HardwareInfo;
import java.util.HashMap;

public class class734 extends Node {
   int field3020;
   static int field3021 = 3;
   static int field3022 = 4;
   int field3023;
   public static int field3024 = 0;
   int field3025;
   static int field3026 = 5;
   static int field3027 = 1;
   static int field3028 = 2;
   static int field3029 = 3;
   static int field3030 = 3;
   static int field3031 = 2;
   static int field3032 = 4;
   static int field3033 = 7;
   static int field3034 = 8;
   static int field3035 = 6;
   String field3036;
   static int field3037 = 21;
   static int field3038 = 22;
   static int field3039 = 23;
   int field3040;
   static int field3041 = 1;
   static int field3042 = 9;
   int field3043;
   static int field3044 = 4;
   int field3045;
   public int field3046;
   int field3047;
   public int field3048;
   boolean field3049;
   String field3050;
   static int field3051 = 0;
   int field3052;
   static int field3053 = 20;
   static int field3054 = 2;
   int field3055;
   String field3056;
   String field3057;
   static int field3058 = 1;
   String field3059;
   int field3060;
   int field3061;
   static int field3062 = 6;
   boolean field3063;
   public int field3064;
   String field3065;
   int[] field3066 = new int[3];
   int field3067;

   void method1817(int var1) {
      try {
         if (this.field3056.length() > 40) {
            this.field3056 = this.field3056.substring(0, 40);
         }

         if (this.field3057.length() > 40) {
            this.field3057 = this.field3057.substring(0, 40);
         }

         if (this.field3036.length() > 10) {
            this.field3036 = this.field3036.substring(0, 10);
         }

         if (this.field3059.length() > 10) {
            this.field3059 = this.field3059.substring(0, 10);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "acc.a(" + ')');
      }
   }

   public void method1818(InputStream var1, int var2) {
      try {
         var1.method6361(6);
         var1.method6361(this.field3025);
         var1.method6361(this.field3063 ? 1 : 0);
         var1.method6361(this.field3040);
         var1.method6361(this.field3045);
         var1.method6361(this.field3046);
         var1.method6361(this.field3047);
         var1.method6361(this.field3048);
         var1.method6361(this.field3049 ? 1 : 0);
         var1.method6362(this.field3023, 16711935);
         var1.method6361(this.field3052);
         var1.method6411(this.field3064, (byte)115);
         var1.method6362(this.field3055, 16711935);
         var1.method6418(this.field3056, (short)14956);
         var1.method6418(this.field3057, (short)23186);
         var1.method6418(this.field3036, (short)15519);
         var1.method6418(this.field3059, (short)4727);
         var1.method6361(this.field3061);
         var1.method6362(this.field3060, 16711935);
         var1.method6418(this.field3050, (short)3988);
         var1.method6418(this.field3065, (short)-4559);
         var1.method6361(this.field3020);
         var1.method6361(this.field3043);

         for(int var3 = 0; var3 < this.field3066.length; ++var3) {
            var1.method6364(this.field3066[var3], -1856682920);
         }

         var1.method6364(this.field3067, -1047358922);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "acc.f(" + ')');
      }
   }

   public int method1819(int var1) {
      try {
         byte var2 = 38;
         int var4 = var2 + class981.method1930(this.field3056, (byte)-1);
         var4 += class981.method1930(this.field3057, (byte)-1);
         var4 += class981.method1930(this.field3036, (byte)-1);
         var4 += class981.method1930(this.field3059, (byte)-1);
         var4 += class981.method1930(this.field3050, (byte)-1);
         var4 += class981.method1930(this.field3065, (byte)-1);
         return var4;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "acc.b(" + ')');
      }
   }

   public class734(boolean var1) {
      if (var1) {
         if (class407.field9261.startsWith("win")) {
            this.field3025 = 1;
         } else if (class407.field9261.startsWith("mac")) {
            this.field3025 = 2;
         } else if (class407.field9261.startsWith("linux")) {
            this.field3025 = 3;
         } else {
            this.field3025 = 4;
         }

         if (!class198.field7050.startsWith("amd64") && !class198.field7050.startsWith("x86_64")) {
            this.field3063 = false;
         } else {
            this.field3063 = true;
         }

         if (1 == this.field3025) {
            if (class322.field841.indexOf("4.0") != -1) {
               this.field3040 = 1;
            } else if (class322.field841.indexOf("4.1") != -1) {
               this.field3040 = 2;
            } else if (class322.field841.indexOf("4.9") != -1) {
               this.field3040 = 3;
            } else if (class322.field841.indexOf("5.0") != -1) {
               this.field3040 = 4;
            } else if (class322.field841.indexOf("5.1") != -1) {
               this.field3040 = 5;
            } else if (class322.field841.indexOf("5.2") != -1) {
               this.field3040 = 8;
            } else if (class322.field841.indexOf("6.0") != -1) {
               this.field3040 = 6;
            } else if (class322.field841.indexOf("6.1") != -1) {
               this.field3040 = 7;
            } else if (class322.field841.indexOf("6.2") != -1) {
               this.field3040 = 9;
            }
         } else if (2 == this.field3025) {
            if (class322.field841.indexOf("10.4") != -1) {
               this.field3040 = 20;
            } else if (class322.field841.indexOf("10.5") != -1) {
               this.field3040 = 21;
            } else if (class322.field841.indexOf("10.6") != -1) {
               this.field3040 = 22;
            } else if (class322.field841.indexOf("10.7") != -1) {
               this.field3040 = 23;
            }
         }

         if (class507.field4017.toLowerCase().indexOf("sun") != -1) {
            this.field3045 = 1;
         } else if (class507.field4017.toLowerCase().indexOf("microsoft") != -1) {
            this.field3045 = 2;
         } else if (class507.field4017.toLowerCase().indexOf("apple") != -1) {
            this.field3045 = 3;
         } else {
            this.field3045 = 4;
         }

         int var2 = 2;
         int var3 = 0;

         char var4;
         try {
            while(var2 < class981.field3273.length()) {
               var4 = class981.field3273.charAt(var2);
               if (var4 < '0' || var4 > '9') {
                  break;
               }

               var3 = var4 - 48 + var3 * 10;
               ++var2;
            }
         } catch (Exception var18) {
            ;
         }

         this.field3046 = var3;
         var2 = class981.field3273.indexOf(46, 2) + 1;
         var3 = 0;

         try {
            while(var2 < class981.field3273.length()) {
               var4 = class981.field3273.charAt(var2);
               if (var4 < '0' || var4 > '9') {
                  break;
               }

               var3 = var4 - 48 + 10 * var3;
               ++var2;
            }
         } catch (Exception var17) {
            ;
         }

         this.field3047 = var3;
         var2 = class981.field3273.indexOf(95, 4) + 1;
         var3 = 0;

         try {
            while(var2 < class981.field3273.length()) {
               var4 = class981.field3273.charAt(var2);
               if (var4 < '0' || var4 > '9') {
                  break;
               }

               var3 = var3 * 10 + (var4 - 48);
               ++var2;
            }
         } catch (Exception var16) {
            ;
         }

         this.field3048 = var3;
         this.field3049 = false;
         this.field3023 = class69.field1827;
         if (this.field3046 > 3) {
            this.field3052 = class69.field1810;
         } else {
            this.field3052 = 0;
         }

         try {
            int[] var19 = HardwareInfo.getCPUInfo();
            if (var19 != null && 3 == var19.length) {
               this.field3020 = var19[0];
               this.field3055 = var19[1];
               this.field3064 = var19[2];
            }

            int[] var5 = HardwareInfo.getRawCPUInfo();
            int var7;
            int var9;
            int var10;
            int var11;
            if (var5 != null && var5.length % 5 == 0) {
               HashMap var6 = new HashMap();

               for(var7 = 0; var7 < var5.length / 5; ++var7) {
                  int var8 = var5[var7 * 5];
                  var9 = var5[5 * var7 + 1];
                  var10 = var5[2 + var7 * 5];
                  var11 = var5[var7 * 5 + 3];
                  int var12 = var5[4 + var7 * 5];
                  class905 var13 = new class905(var8, var9, var10, var11, var12);
                  var6.put(var8, var13);
               }

               class905 var21 = (class905)var6.get(Integer.valueOf(0));
               if (var21 != null) {
                  InputStream var22 = new InputStream(13);
                  var22.method6365(var21.field10364, 162325587);
                  var22.method6365(var21.field10368, -487042280);
                  var22.method6365(var21.field10367, 164405285);
                  var22.field10376 = 0;
                  this.field3050 = var22.method6379(512996154);
               }

               class905 var24 = (class905)var6.get(Integer.valueOf(1));
               if (var24 != null) {
                  this.field3067 = var24.field10365;
                  var9 = var24.field10364;
                  this.field3043 = var9 >> 16 & 255;
                  this.field3066[0] = var24.field10367;
                  this.field3066[1] = var24.field10368;
               }

               class905 var26 = (class905)var6.get(-2147483647);
               if (var26 != null) {
                  this.field3066[2] = var26.field10368;
               }

               InputStream var28 = new InputStream(49);

               for(var11 = -2147483646; var11 <= -2147483644; ++var11) {
                  class905 var30 = (class905)var6.get(var11);
                  if (var30 != null) {
                     var28.method6365(var30.field10365, 1924293641);
                     var28.method6365(var30.field10364, -1273071648);
                     var28.method6365(var30.field10367, 293591119);
                     var28.method6365(var30.field10368, -1803597625);
                  }
               }

               var28.field10376 = 0;
               this.field3065 = var28.method6379(-1784035682);
            }

            String[][] var20 = HardwareInfo.getDXDiagDisplayDevicesProps();
            String var25;
            if (var20 != null && var20.length > 0 && var20[0] != null) {
               for(var7 = 0; var7 < var20[0].length; var7 += 2) {
                  if (var20[0][var7].equalsIgnoreCase("szDescription")) {
                     this.field3056 = var20[0][var7 + 1];
                  } else if (var20[0][var7].equalsIgnoreCase("szDriverDateEnglish")) {
                     var25 = var20[0][var7 + 1];

                     try {
                        var9 = var25.indexOf("/");
                        var10 = var25.indexOf("/", 1 + var9);
                        this.field3061 = Integer.parseInt(var25.substring(0, var9));
                        this.field3060 = Integer.parseInt(var25.substring(1 + var10, var25.indexOf(" ", var10)));
                     } catch (Exception var14) {
                        ;
                     }
                  }
               }
            }

            String[] var23 = HardwareInfo.getDXDiagSystemProps();
            if (var23 != null) {
               var25 = "";
               String var27 = "";
               String var29 = "";

               for(var11 = 0; var11 < var23.length; var11 += 2) {
                  if (var23[var11].equalsIgnoreCase("dwDirectXVersionMajor")) {
                     var25 = var23[1 + var11];
                  } else if (var23[var11].equalsIgnoreCase("dwDirectXVersionMinor")) {
                     var27 = var23[1 + var11];
                  } else if (var23[var11].equalsIgnoreCase("dwDirectXVersionLetter")) {
                     var29 = var23[1 + var11];
                  }
               }

               this.field3036 = var25 + "." + var27 + var29;
            }
         } catch (Throwable var15) {
            this.field3064 = 0;
         }
      }

      if (this.field3056 == null) {
         this.field3056 = "";
      }

      if (this.field3057 == null) {
         this.field3057 = "";
      }

      if (this.field3036 == null) {
         this.field3036 = "";
      }

      if (this.field3059 == null) {
         this.field3059 = "";
      }

      if (this.field3050 == null) {
         this.field3050 = "";
      }

      if (this.field3065 == null) {
         this.field3065 = "";
      }

      this.method1817(1932457780);
   }

   static class12[] method1820(byte var0) {
      try {
         return new class12[]{class12.field6678, class12.field6677, class12.field6676};
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "acc.a(" + ')');
      }
   }
}
