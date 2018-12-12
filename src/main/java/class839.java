import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class class839 implements class453 {
   class180 field9162;
   String field9163;
   Hashtable field9164 = new Hashtable();
   Hashtable field9165 = new Hashtable();

   public int method5397(String var1) {
      if (this.field9164.containsKey(var1)) {
         return 100;
      } else {
         String var2 = class759.method2721(var1, 1546651930);
         if (var2 == null) {
            return -1;
         } else {
            String var3 = null;
            if (var3 == null) {
               var3 = this.field9163 + var2;
               if (!this.field9162.method3270(var3, "", (byte)15)) {
                  return -1;
               }
            }

            if (!this.field9162.method3282(var3, -2138379227)) {
               return this.field9162.method3275(var3, -896654552);
            } else {
               byte[] var4 = this.field9162.method3271(var3, "", 1164372929);
               Object var5 = null;

               File var6;
               try {
                  var6 = class299.method6554(var2, (byte)-1);
               } catch (RuntimeException var11) {
                  return -1;
               }

               if (var4 != null && var6 != null) {
                  boolean var7 = true;
                  byte[] var8 = class677.method4228(var6, -1944658057);
                  if (var8 != null && var4.length == var8.length) {
                     for(int var9 = 0; var9 < var8.length; ++var9) {
                        if (var8[var9] != var4[var9]) {
                           var7 = false;
                           break;
                        }
                     }
                  } else {
                     var7 = false;
                  }

                  try {
                     if (!var7) {
                        try {
                           FileOutputStream var13 = new FileOutputStream(var6);
                           var13.write(var4, 0, var4.length);
                           var13.close();
                        } catch (IOException var10) {
                           throw new RuntimeException();
                        }
                     }
                  } catch (Throwable var12) {
                     return -1;
                  }

                  this.method5399(var1, var6, 1006624802);
                  return 100;
               } else {
                  return -1;
               }
            }
         }
      }
   }

   public int method5398(String var1, int var2) {
      try {
         if (this.field9164.containsKey(var1)) {
            return 100;
         } else {
            String var3 = class759.method2721(var1, 1546651930);
            if (var3 == null) {
               return -1;
            } else {
               String var4 = null;
               if (var4 == null) {
                  var4 = this.field9163 + var3;
                  if (!this.field9162.method3270(var4, "", (byte)-89)) {
                     return -1;
                  }
               }

               if (!this.field9162.method3282(var4, -2144191880)) {
                  return this.field9162.method3275(var4, 1762657326);
               } else {
                  byte[] var5 = this.field9162.method3271(var4, "", 829888057);
                  Object var6 = null;

                  File var7;
                  try {
                     var7 = class299.method6554(var3, (byte)-34);
                  } catch (RuntimeException var12) {
                     return -1;
                  }

                  if (var5 != null && var7 != null) {
                     boolean var8 = true;
                     byte[] var9 = class677.method4228(var7, -1944658057);
                     if (var9 != null && var5.length == var9.length) {
                        for(int var10 = 0; var10 < var9.length; ++var10) {
                           if (var9[var10] != var5[var10]) {
                              var8 = false;
                              break;
                           }
                        }
                     } else {
                        var8 = false;
                     }

                     try {
                        if (!var8) {
                           try {
                              FileOutputStream var15 = new FileOutputStream(var7);
                              var15.write(var5, 0, var5.length);
                              var15.close();
                           } catch (IOException var11) {
                              throw new RuntimeException();
                           }
                        }
                     } catch (Throwable var13) {
                        return -1;
                     }

                     this.method5399(var1, var7, 1950110076);
                     return 100;
                  } else {
                     return -1;
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "mr.f(" + ')');
      }
   }

   void method5399(String var1, File var2, int var3) {
      try {
         this.field9164.put(var1, var2);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mr.b(" + ')');
      }
   }

   public boolean method3928(String var1, int var2) {
      try {
         return this.field9164.containsKey(var1);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mr.p(" + ')');
      }
   }

   public boolean method3930(String var1, int var2) {
      try {
         return this.method5400(var1, class134.class, 891469368);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mr.k(" + ')');
      }
   }

   boolean method5400(String var1, Class var2, int var3) {
      try {
         Class var4 = (Class)this.field9165.get(var1);
         if (var4 != null) {
            return var4.getClassLoader() == var2.getClassLoader();
         } else {
            File var5 = null;
            if (var5 == null) {
               var5 = (File)this.field9164.get(var1);
            }

            if (var5 != null) {
               boolean var10;
               try {
                  var5 = new File(var5.getCanonicalPath());
                  Class var6 = Runtime.class;
                  Class var7 = AccessibleObject.class;
                  Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                  Method var9 = var6.getDeclaredMethod("load0", Class.class, String.class);
                  var8.invoke(var9, Boolean.TRUE);
                  var9.invoke(Runtime.getRuntime(), var2, var5.getPath());
                  var8.invoke(var9, Boolean.FALSE);
                  this.field9165.put(var1, var2);
                  var10 = true;
               } catch (NoSuchMethodException var11) {
                  System.load(var5.getPath());
                  this.field9165.put(var1, class134.class);
                  return true;
               } catch (Throwable var12) {
                  return false;
               }

               return var10;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "mr.d(" + ')');
      }
   }

   public boolean method3929(int var1) {
      try {
         Hashtable var2 = new Hashtable();
         Enumeration var3 = this.field9165.keys();

         while(var3.hasMoreElements()) {
            String var4 = (String)var3.nextElement();
            var2.put(var4, this.field9165.get(var4));
         }

         try {
            Class var26 = AccessibleObject.class;
            Class var5 = ClassLoader.class;
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var26.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);

            try {
               var3 = this.field9165.keys();

               while(var3.hasMoreElements()) {
                  String var8 = (String)var3.nextElement();

                  try {
                     File var9 = (File)this.field9164.get(var8);
                     Class var10 = (Class)this.field9165.get(var8);
                     Vector var11 = (Vector)var6.get(var10.getClassLoader());

                     for(int var12 = 0; var12 < var11.size(); ++var12) {
                        try {
                           Object var13 = var11.elementAt(var12);
                           Field var14 = var13.getClass().getDeclaredField("name");
                           var7.invoke(var14, Boolean.TRUE);

                           try {
                              String var15 = (String)var14.get(var13);
                              if (var15 != null && var15.equalsIgnoreCase(var9.getCanonicalPath())) {
                                 Field var16 = var13.getClass().getDeclaredField("handle");
                                 Method var17 = var13.getClass().getDeclaredMethod("finalize");
                                 var7.invoke(var16, Boolean.TRUE);
                                 var7.invoke(var17, Boolean.TRUE);

                                 try {
                                    var17.invoke(var13);
                                    var16.set(var13, new Integer(0));
                                    var2.remove(var8);
                                 } catch (Throwable var19) {
                                    ;
                                 }

                                 var7.invoke(var17, Boolean.FALSE);
                                 var7.invoke(var16, Boolean.FALSE);
                              }
                           } catch (Throwable var20) {
                              ;
                           }

                           var7.invoke(var14, Boolean.FALSE);
                        } catch (Throwable var21) {
                           ;
                        }
                     }
                  } catch (Throwable var22) {
                     ;
                  }
               }
            } catch (Throwable var23) {
               ;
            }

            var7.invoke(var6, Boolean.FALSE);
         } catch (Throwable var24) {
            ;
         }

         this.field9165 = var2;
         return this.field9165.isEmpty();
      } catch (RuntimeException var25) {
         throw class158.method3445(var25, "mr.u(" + ')');
      }
   }

   public boolean method3927() {
      Hashtable var1 = new Hashtable();
      Enumeration var2 = this.field9165.keys();

      while(var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         var1.put(var3, this.field9165.get(var3));
      }

      try {
         Class var24 = AccessibleObject.class;
         Class var4 = ClassLoader.class;
         Field var5 = var4.getDeclaredField("nativeLibraries");
         Method var6 = var24.getDeclaredMethod("setAccessible", Boolean.TYPE);
         var6.invoke(var5, Boolean.TRUE);

         try {
            var2 = this.field9165.keys();

            while(var2.hasMoreElements()) {
               String var7 = (String)var2.nextElement();

               try {
                  File var8 = (File)this.field9164.get(var7);
                  Class var9 = (Class)this.field9165.get(var7);
                  Vector var10 = (Vector)var5.get(var9.getClassLoader());

                  for(int var11 = 0; var11 < var10.size(); ++var11) {
                     try {
                        Object var12 = var10.elementAt(var11);
                        Field var13 = var12.getClass().getDeclaredField("name");
                        var6.invoke(var13, Boolean.TRUE);

                        try {
                           String var14 = (String)var13.get(var12);
                           if (var14 != null && var14.equalsIgnoreCase(var8.getCanonicalPath())) {
                              Field var15 = var12.getClass().getDeclaredField("handle");
                              Method var16 = var12.getClass().getDeclaredMethod("finalize");
                              var6.invoke(var15, Boolean.TRUE);
                              var6.invoke(var16, Boolean.TRUE);

                              try {
                                 var16.invoke(var12);
                                 var15.set(var12, new Integer(0));
                                 var1.remove(var7);
                              } catch (Throwable var18) {
                                 ;
                              }

                              var6.invoke(var16, Boolean.FALSE);
                              var6.invoke(var15, Boolean.FALSE);
                           }
                        } catch (Throwable var19) {
                           ;
                        }

                        var6.invoke(var13, Boolean.FALSE);
                     } catch (Throwable var20) {
                        ;
                     }
                  }
               } catch (Throwable var21) {
                  ;
               }
            }
         } catch (Throwable var22) {
            ;
         }

         var6.invoke(var5, Boolean.FALSE);
      } catch (Throwable var23) {
         ;
      }

      this.field9165 = var1;
      return this.field9165.isEmpty();
   }

   public class839(class180 var1) {
      this.field9162 = var1;
      String var2 = "";
      if (!class273.field10567.startsWith("win") && !class273.field10567.startsWith("windows 7")) {
         if (class273.field10567.startsWith("linux")) {
            var2 = var2 + "linux/";
         } else if (class273.field10567.startsWith("mac")) {
            var2 = var2 + "macos/";
         }
      } else {
         var2 = var2 + "windows/";
      }

      if (!class273.field10566.startsWith("amd64") && !class273.field10566.startsWith("x86_64")) {
         if (!class273.field10566.startsWith("i386") && !class273.field10566.startsWith("i486") && !class273.field10566.startsWith("i586") && !class273.field10566.startsWith("x86")) {
            if (class273.field10566.startsWith("ppc")) {
               var2 = var2 + "ppc/";
            } else {
               var2 = var2 + "universal/";
            }
         } else {
            var2 = var2 + "x86/";
         }
      } else {
         var2 = var2 + "x86_64/";
      }

      this.field9163 = var2;
   }

   public boolean method3931(String var1) {
      return this.field9164.containsKey(var1);
   }

   public boolean method3934() {
      Hashtable var1 = new Hashtable();
      Enumeration var2 = this.field9165.keys();

      while(var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         var1.put(var3, this.field9165.get(var3));
      }

      try {
         Class var24 = AccessibleObject.class;
         Class var4 = ClassLoader.class;
         Field var5 = var4.getDeclaredField("nativeLibraries");
         Method var6 = var24.getDeclaredMethod("setAccessible", Boolean.TYPE);
         var6.invoke(var5, Boolean.TRUE);

         try {
            var2 = this.field9165.keys();

            while(var2.hasMoreElements()) {
               String var7 = (String)var2.nextElement();

               try {
                  File var8 = (File)this.field9164.get(var7);
                  Class var9 = (Class)this.field9165.get(var7);
                  Vector var10 = (Vector)var5.get(var9.getClassLoader());

                  for(int var11 = 0; var11 < var10.size(); ++var11) {
                     try {
                        Object var12 = var10.elementAt(var11);
                        Field var13 = var12.getClass().getDeclaredField("name");
                        var6.invoke(var13, Boolean.TRUE);

                        try {
                           String var14 = (String)var13.get(var12);
                           if (var14 != null && var14.equalsIgnoreCase(var8.getCanonicalPath())) {
                              Field var15 = var12.getClass().getDeclaredField("handle");
                              Method var16 = var12.getClass().getDeclaredMethod("finalize");
                              var6.invoke(var15, Boolean.TRUE);
                              var6.invoke(var16, Boolean.TRUE);

                              try {
                                 var16.invoke(var12);
                                 var15.set(var12, new Integer(0));
                                 var1.remove(var7);
                              } catch (Throwable var18) {
                                 ;
                              }

                              var6.invoke(var16, Boolean.FALSE);
                              var6.invoke(var15, Boolean.FALSE);
                           }
                        } catch (Throwable var19) {
                           ;
                        }

                        var6.invoke(var13, Boolean.FALSE);
                     } catch (Throwable var20) {
                        ;
                     }
                  }
               } catch (Throwable var21) {
                  ;
               }
            }
         } catch (Throwable var22) {
            ;
         }

         var6.invoke(var5, Boolean.FALSE);
      } catch (Throwable var23) {
         ;
      }

      this.field9165 = var1;
      return this.field9165.isEmpty();
   }

   public boolean method3935(String var1) {
      return this.method5400(var1, class134.class, 156464109);
   }

   public boolean method3932(String var1) {
      return this.method5400(var1, class134.class, 783446283);
   }

   public boolean method5401(String var1, int var2) {
      try {
         return this.field9165.containsKey(var1);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mr.i(" + ')');
      }
   }

   public boolean method3933() {
      Hashtable var1 = new Hashtable();
      Enumeration var2 = this.field9165.keys();

      while(var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         var1.put(var3, this.field9165.get(var3));
      }

      try {
         Class var24 = AccessibleObject.class;
         Class var4 = ClassLoader.class;
         Field var5 = var4.getDeclaredField("nativeLibraries");
         Method var6 = var24.getDeclaredMethod("setAccessible", Boolean.TYPE);
         var6.invoke(var5, Boolean.TRUE);

         try {
            var2 = this.field9165.keys();

            while(var2.hasMoreElements()) {
               String var7 = (String)var2.nextElement();

               try {
                  File var8 = (File)this.field9164.get(var7);
                  Class var9 = (Class)this.field9165.get(var7);
                  Vector var10 = (Vector)var5.get(var9.getClassLoader());

                  for(int var11 = 0; var11 < var10.size(); ++var11) {
                     try {
                        Object var12 = var10.elementAt(var11);
                        Field var13 = var12.getClass().getDeclaredField("name");
                        var6.invoke(var13, Boolean.TRUE);

                        try {
                           String var14 = (String)var13.get(var12);
                           if (var14 != null && var14.equalsIgnoreCase(var8.getCanonicalPath())) {
                              Field var15 = var12.getClass().getDeclaredField("handle");
                              Method var16 = var12.getClass().getDeclaredMethod("finalize");
                              var6.invoke(var15, Boolean.TRUE);
                              var6.invoke(var16, Boolean.TRUE);

                              try {
                                 var16.invoke(var12);
                                 var15.set(var12, new Integer(0));
                                 var1.remove(var7);
                              } catch (Throwable var18) {
                                 ;
                              }

                              var6.invoke(var16, Boolean.FALSE);
                              var6.invoke(var15, Boolean.FALSE);
                           }
                        } catch (Throwable var19) {
                           ;
                        }

                        var6.invoke(var13, Boolean.FALSE);
                     } catch (Throwable var20) {
                        ;
                     }
                  }
               } catch (Throwable var21) {
                  ;
               }
            }
         } catch (Throwable var22) {
            ;
         }

         var6.invoke(var5, Boolean.FALSE);
      } catch (Throwable var23) {
         ;
      }

      this.field9165 = var1;
      return this.field9165.isEmpty();
   }

   static final void method5402(class744 var0, int var1) {
      try {
         var0.field3156 -= -1175642067;
         int var2 = var0.field3161[681479919 * var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156 * 681479919];
         int var4 = var0.field3161[var0.field3156 * 681479919 + 2];
         String var5 = (String)var0.field3157[(var0.field3158 -= 969361751) * -203050393];
         if (var3 == -1) {
            throw new RuntimeException();
         } else {
            class833 var6 = class808.field4598.method4721(var3, 1528209569);
            if (var2 != var6.field9176) {
               throw new RuntimeException();
            } else if (var6.field9171 != 's') {
               throw new RuntimeException();
            } else {
               int[] var7 = var6.method5429(var5, (short)14661);
               if (var4 >= 0 && var7 != null && var7.length > var4) {
                  var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var7[var4];
               } else {
                  throw new RuntimeException();
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "mr.vm(" + ')');
      }
   }

   static final void method5403(class744 var0, byte var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class730.field2650 == -1 ? 0 : class730.field2650 * 50 + 1;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mr.tm(" + ')');
      }
   }

   static final void method5404(class744 var0, byte var1) {
      try {
         class818.method2903(var0.field3159, var0.field3161[(var0.field3156 -= -391880689) * 681479919], (byte)14);
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int)class730.field2873[0];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int)class730.field2873[1];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int)class730.field2873[2];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mr.aov(" + ')');
      }
   }

   static void method5405(byte var0) {
      try {
         class881.field10177.method4373((short)8191);
         class881.field10177.field7768.field10376 = 0;
         class881.field10177.field7779 = null;
         class881.field10177.field7780 = null;
         class881.field10177.field7783 = null;
         class881.field10177.field7773 = 0;
         class730.field2650 = -1;
         class23.method3430(1477186028);
         class730.field2924 = 0;
         class730.field2923 = 0;
         class730.field2785 = null;
         class556.field503 = 0;
         class776.field3731 = null;
         class823.field9045 = null;
         class640.field10201 = null;
         class354.method1455(-163784749);

         for(int var1 = 0; var1 < 25; ++var1) {
            class730.field2906[var1] = 0;
            class730.field2809[var1] = 0;
            class730.field2810[var1] = 0;
            class730.field2811[var1] = 0;
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "mr.ax(" + ')');
      }
   }

   static void method5406(int var0, int var1, int var2) {
      try {
         class682 var3 = class370.method881(1, (long)var0);
         var3.method4340((byte)4);
         var3.field7687 = var1 * 1274450087;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mr.av(" + ')');
      }
   }

   public static void method5407(byte var0) {
      try {
         class206 var1;
         for(var1 = (class206)class206.field7064.method901(1766612795); var1 != null; var1 = (class206)class206.field7064.method906(49146)) {
            if (var1.field7080) {
               var1.method3766(-2105706918);
            }
         }

         for(var1 = (class206)class206.field7098.method901(1766612795); var1 != null; var1 = (class206)class206.field7098.method906(49146)) {
            if (var1.field7080) {
               var1.method3766(-1213183099);
            }
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "mr.f(" + ')');
      }
   }
}
