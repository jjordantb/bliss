import java.awt.Canvas;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;

public class class529 {
   public static class529 field3652 = new class529();
   static class529 field3653 = new class529();
   public static class529 field3654 = new class529();
   static class529 field3655 = new class529();

   public static void method2213(String var0, boolean var1, boolean var2, String var3, boolean var4, boolean var5, int var6) {
      try {
         if (var1) {
            if (!var4 && Desktop.getDesktop().isSupported(Action.BROWSE)) {
               try {
                  Desktop.getDesktop().browse(new URI(var0));
                  return;
               } catch (Exception var8) {
                  ;
               }
            }

            if (class407.field9261.startsWith("win") && !var4) {
               class474.method4669(var0, 0, (byte)23);
            } else if (class407.field9261.startsWith("mac")) {
               class948.method1939(var0, 1, var3, -1988096952);
            } else {
               class474.method4669(var0, 2, (byte)77);
            }
         } else {
            class474.method4669(var0, 3, (byte)71);
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "li.f(" + ')');
      }
   }

   static final void method2214(class744 var0, int var1) {
      try {
         var0.field3158 -= 2;
         var0.field3161[++var0.field3156 - 1] = class822.method5367((String)var0.field3157[var0.field3158], (String)var0.field3157[var0.field3158 + 1], class321.field1066, -1813623072);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "li.zz(" + ')');
      }
   }

   static final void method2215(class744 var0, int var1) {
      try {
         boolean var2 = false;
         if (class730.field2616) {
            try {
               Object var3 = class662.field9729.method5800(new Object[]{class206.field7099, 1 == class923.local.field3399, var0.field3161[--var0.field3156]}, -1838433046);
               if (var3 != null) {
                  var2 = ((Boolean)var3).booleanValue();
               }
            } catch (Throwable var4) {
               ;
            }
         }

         var0.field3161[++var0.field3156 - 1] = var2 ? 1 : 0;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "li.ant(" + ')');
      }
   }

   static void method2216(int var0, int var1, int var2, boolean var3, int var4, boolean var5, byte var6) {
      try {
         if (var0 < var1) {
            int var7 = (var0 + var1) / 2;
            int var8 = var0;
            class471 var9 = class601.field9199[var7];
            class601.field9199[var7] = class601.field9199[var1];
            class601.field9199[var1] = var9;

            for(int var10 = var0; var10 < var1; ++var10) {
               if (class738.method1796(class601.field9199[var10], var9, var2, var3, var4, var5, -279850410) <= 0) {
                  class471 var11 = class601.field9199[var10];
                  class601.field9199[var10] = class601.field9199[var8];
                  class601.field9199[var8++] = var11;
               }
            }

            class601.field9199[var1] = class601.field9199[var8];
            class601.field9199[var8] = var9;
            method2216(var0, var8 - 1, var2, var3, var4, var5, (byte)-43);
            method2216(1 + var8, var1, var2, var3, var4, var5, (byte)54);
         }

      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "li.x(" + ')');
      }
   }

   public static class848 method2217(Canvas var0, class478 var1, int var2, int var3, byte var4) {
      try {
         return new class955(var0, var1, var2, var3);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "li.a(" + ')');
      }
   }

   static final void method2218(class744 var0, short var1) {
      try {
         var0.field3156 -= 3;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         int var4 = var0.field3161[var0.field3156 + 2];
         class740.method1920(9, var2 << 16 | var3, var4, "", -529750443);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "li.alx(" + ')');
      }
   }

   public static int method2219(short var0) {
      return 14;
   }

   public static void method2220(InputStream var0, int var1, byte var2) {
      try {
         class149 var3 = new class149();
         var3.field1529 = var0.method6371();
         var3.field1533 = var0.method6420((byte)43);
         var3.field1528 = new int[var3.field1529];
         var3.field1527 = new int[var3.field1529];
         var3.field1530 = new Field[var3.field1529];
         var3.field1526 = new int[var3.field1529];
         var3.field1532 = new Method[var3.field1529];
         var3.field1531 = new byte[var3.field1529][][];

         for(int var4 = 0; var4 < var3.field1529; ++var4) {
            try {
               int var5 = var0.method6371();
               String var6;
               String var7;
               int var8;
               if (var5 != 0 && var5 != 1 && 2 != var5) {
                  if (var5 == 3 || 4 == var5) {
                     var6 = var0.method6379(-1377559322);
                     var7 = var0.method6379(1945683710);
                     var8 = var0.method6371();
                     String[] var9 = new String[var8];

                     for(int var10 = 0; var10 < var8; ++var10) {
                        var9[var10] = var0.method6379(-1854507369);
                     }

                     String var27 = var0.method6379(-1619475079);
                     byte[][] var11 = new byte[var8][];
                     int var13;
                     if (var5 == 3) {
                        for(int var12 = 0; var12 < var8; ++var12) {
                           var13 = var0.method6420((byte)-44);
                           var11[var12] = new byte[var13];
                           var0.method6381(var11[var12], 0, var13, -953523806);
                        }
                     }

                     var3.field1528[var4] = var5;
                     Class[] var28 = new Class[var8];

                     for(var13 = 0; var13 < var8; ++var13) {
                        var28[var13] = class128.method1585(var9[var13], (byte)64);
                     }

                     Class var29 = class128.method1585(var27, (byte)5);
                     if (class128.method1585(var6, (byte)23).getClassLoader() == null) {
                        throw new SecurityException();
                     }

                     Method[] var14 = class128.method1585(var6, (byte)42).getDeclaredMethods();
                     Method[] var15 = var14;

                     for(int var16 = 0; var16 < var15.length; ++var16) {
                        Method var17 = var15[var16];
                        if (var17.getName().equals(var7)) {
                           Class[] var18 = var17.getParameterTypes();
                           if (var28.length == var18.length) {
                              boolean var19 = true;

                              for(int var20 = 0; var20 < var28.length; ++var20) {
                                 if (var28[var20] != var18[var20]) {
                                    var19 = false;
                                    break;
                                 }
                              }

                              if (var19 && var29 == var17.getReturnType()) {
                                 var3.field1532[var4] = var17;
                              }
                           }
                        }
                     }

                     var3.field1531[var4] = var11;
                  }
               } else {
                  var6 = var0.method6379(-1707497835);
                  var7 = var0.method6379(-976277803);
                  var8 = 0;
                  if (1 == var5) {
                     var8 = var0.method6420((byte)-46);
                  }

                  var3.field1528[var4] = var5;
                  var3.field1526[var4] = var8;
                  if (class128.method1585(var6, (byte)67).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  var3.field1530[var4] = class128.method1585(var6, (byte)81).getDeclaredField(var7);
               }
            } catch (ClassNotFoundException var21) {
               var3.field1527[var4] = -1;
            } catch (SecurityException var22) {
               var3.field1527[var4] = -2;
            } catch (NullPointerException var23) {
               var3.field1527[var4] = -3;
            } catch (Exception var24) {
               var3.field1527[var4] = -4;
            } catch (Throwable var25) {
               var3.field1527[var4] = -5;
            }
         }

         class79.field1525.method897(var3, 512081003);
      } catch (RuntimeException var26) {
         throw class158.method3445(var26, "li.p(" + ')');
      }
   }
}
