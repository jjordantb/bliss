import java.util.zip.CRC32;

public class class702 extends class721 {
   class6 field3334 = new class6(16);
   class341 field3335;
   byte[] field3336;
   int field3337;
   class675 field3338;
   class959 field3339;
   class213 field3340;
   int field3341 = 0;
   class675 field3342;
   class695 field3343;
   static byte field3344 = 0;
   static byte field3345 = 1;
   static byte field3346 = -1;
   byte[] field3347;
   static int field3348 = 1000;
   class373 field3349;
   int field3350 = 0;
   boolean field3351;
   int field3352;
   static int field3353 = 0;
   class373 field3354 = new class373();
   boolean field3355;
   long field3356 = 0L;
   int field3357;
   static int field3358 = 250;
   static CRC32 field3359 = new CRC32();
   boolean field3360;
   static int field3361 = 1;
   static int field3362 = 2;

   public int method1957(int var1) {
      try {
         if (this.method2136(2127930788) == null) {
            return this.field3339 == null ? 0 : this.field3339.method2036(-2104540777);
         } else {
            return 100;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aaz.v(" + ')');
      }
   }

   void method2142(int var1, short var2) {
      try {
         if (this.field3342 != null) {
            class568 var3;
            for(var3 = this.field3354.method901(1766612795); var3 != null; var3 = this.field3354.method906(49146)) {
               if (var3.field641 == (long)var1) {
                  return;
               }
            }

            var3 = new class568();
            var3.field641 = (long)var1;
            this.field3354.method897(var3, -68518310);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aaz.b(" + ')');
      }
   }

   class959 method1958(int var1, int var2, byte var3) {
      try {
         Object var4 = (class959)this.field3334.method2942((long)var1);
         if (var4 != null && var2 == 0 && !((class959)var4).field3466 && ((class959)var4).field3464) {
            ((class959)var4).method545(-1460969981);
            var4 = null;
         }

         if (var4 == null) {
            if (var2 == 0) {
               if (this.field3342 != null && this.field3347[var1] != -1) {
                  var4 = this.field3340.method3805(var1, this.field3342, -1787098666);
               } else {
                  if (this.field3335.method227((byte)14)) {
                     return null;
                  }

                  var4 = this.field3335.method225(this.field3337, var1, (byte)2, true, -393413622);
               }
            } else if (var2 == 1) {
               if (this.field3342 == null) {
                  throw new RuntimeException();
               }

               var4 = this.field3340.method3804(var1, this.field3342, (byte)-18);
            } else {
               if (2 != var2) {
                  throw new RuntimeException();
               }

               if (this.field3342 == null) {
                  throw new RuntimeException();
               }

               if (-1 != this.field3347[var1]) {
                  throw new RuntimeException();
               }

               if (this.field3335.method234((byte)-70)) {
                  return null;
               }

               var4 = this.field3335.method225(this.field3337, var1, (byte)2, false, 67458398);
            }

            this.field3334.method2947((class568)var4, (long)var1);
         }

         if (((class959)var4).field3464) {
            return null;
         } else {
            byte[] var5 = ((class959)var4).method2033((short)657);
            byte[] var7;
            if (var4 instanceof class174) {
               Object var19;
               try {
                  if (var5 == null || var5.length <= 2) {
                     throw new RuntimeException();
                  }

                  field3359.reset();
                  field3359.update(var5, 0, var5.length - 2);
                  int var15 = (int)field3359.getValue();
                  if (this.field3343.field7260[var1] != var15) {
                     throw new RuntimeException();
                  }

                  if (this.field3343.field7254 != null && this.field3343.field7254[var1] != null) {
                     var7 = this.field3343.field7254[var1];
                     byte[] var18 = class76.method1111(var5, 0, var5.length - 2, (byte)21);

                     for(int var9 = 0; var9 < 64; ++var9) {
                        if (var7[var9] != var18[var9]) {
                           throw new RuntimeException();
                        }
                     }
                  }

                  int var17 = (var5[var5.length - 1] & 255) + ((var5[var5.length - 2] & 255) << 8);
                  if (var17 != (this.field3343.field7252[var1] & '\uffff')) {
                     throw new RuntimeException();
                  }

                  if (this.field3347[var1] != 1) {
                     byte var10000 = this.field3347[var1];
                     ++this.field3341;
                     this.field3347[var1] = 1;
                  }

                  if (!((class959)var4).field3466) {
                     ((class959)var4).method545(-1460969981);
                  }

                  var19 = var4;
               } catch (Exception var11) {
                  this.field3347[var1] = -1;
                  ((class959)var4).method545(-1460969981);
                  if (((class959)var4).field3466 && !this.field3335.method227((byte)14)) {
                     class448 var16 = this.field3335.method225(this.field3337, var1, (byte)2, true, 61291917);
                     this.field3334.method2947(var16, (long)var1);
                  }

                  return null;
               }

               return (class959)var19;
            } else {
               try {
                  label174: {
                     if (var5 != null && var5.length > 2) {
                        field3359.reset();
                        field3359.update(var5, 0, var5.length - 2);
                        int var10 = (int)field3359.getValue();
                        if (var10 != this.field3343.field7260[var1]) {
                           throw new RuntimeException();
                        }

                        if (this.field3343.field7254 == null || this.field3343.field7254[var1] == null) {
                           break label174;
                        }

                        byte[] var14 = this.field3343.field7254[var1];
                        var7 = class76.method1111(var5, 0, var5.length - 2, (byte)-6);
                        int var8 = 0;

                        while(true) {
                           if (var8 >= 64) {
                              break label174;
                           }

                           if (var14[var8] != var7[var8]) {
                              throw new RuntimeException();
                           }

                           ++var8;
                        }
                     }

                     throw new RuntimeException();
                  }

                  this.field3335.field304 = 0;
                  this.field3335.field314 = 0;
               } catch (RuntimeException var12) {
                  this.field3335.method246(-1195501767);
                  ((class959)var4).method545(-1460969981);
                  if (((class959)var4).field3466 && !this.field3335.method227((byte)14)) {
                     class448 var6 = this.field3335.method225(this.field3337, var1, (byte)2, true, -791962540);
                     this.field3334.method2947(var6, (long)var1);
                  }

                  return null;
               }

               var5[var5.length - 2] = (byte)(this.field3343.field7252[var1] >>> 8);
               var5[var5.length - 1] = (byte)this.field3343.field7252[var1];
               if (this.field3342 != null) {
                  this.field3340.method3806(var1, var5, this.field3342, -645332532);
                  if (this.field3347[var1] != 1) {
                     ++this.field3341;
                     this.field3347[var1] = 1;
                  }
               }

               if (!((class959)var4).field3466) {
                  ((class959)var4).method545(-1460969981);
               }

               return (class959)var4;
            }
         }
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "aaz.g(" + ')');
      }
   }

   void method1959(byte var1) {
      try {
         if (this.field3349 != null && this.method2136(2079218396) != null) {
            for(class568 var2 = this.field3354.method901(1766612795); var2 != null; var2 = this.field3354.method906(49146)) {
               int var3 = (int)var2.field641;
               if (var3 >= 0 && var3 < this.field3343.field7259 && this.field3343.field7263[var3] != 0) {
                  if (this.field3347[var3] == 0) {
                     this.method1958(var3, 1, (byte)96);
                  }

                  if (-1 == this.field3347[var3]) {
                     this.method1958(var3, 2, (byte)26);
                  }

                  if (1 == this.field3347[var3]) {
                     var2.method545(-1460969981);
                  }
               } else {
                  var2.method545(-1460969981);
               }
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aaz.e(" + ')');
      }
   }

   void method1960(int var1) {
      try {
         if (this.field3349 != null) {
            if (this.method2136(2060715797) == null) {
               return;
            }

            boolean var2;
            class568 var3;
            int var4;
            if (this.field3351) {
               var2 = true;

               for(var3 = this.field3349.method901(1766612795); var3 != null; var3 = this.field3349.method906(49146)) {
                  var4 = (int)var3.field641;
                  if (this.field3347[var4] == 0) {
                     this.method1958(var4, 1, (byte)113);
                  }

                  if (this.field3347[var4] != 0) {
                     var3.method545(-1460969981);
                  } else {
                     var2 = false;
                  }
               }

               while(this.field3350 < this.field3343.field7263.length) {
                  if (this.field3343.field7263[this.field3350] == 0) {
                     ++this.field3350;
                  } else {
                     if (this.field3340.field7196 >= 250) {
                        var2 = false;
                        break;
                     }

                     if (this.field3347[this.field3350] == 0) {
                        this.method1958(this.field3350, 1, (byte)122);
                     }

                     if (this.field3347[this.field3350] == 0) {
                        var3 = new class568();
                        var3.field641 = (long)this.field3350;
                        this.field3349.method897(var3, 2047339116);
                        var2 = false;
                     }

                     ++this.field3350;
                  }
               }

               if (var2) {
                  this.field3351 = false;
                  this.field3350 = 0;
               }
            } else if (this.field3360) {
               var2 = true;

               for(var3 = this.field3349.method901(1766612795); var3 != null; var3 = this.field3349.method906(49146)) {
                  var4 = (int)var3.field641;
                  if (this.field3347[var4] != 1) {
                     this.method1958(var4, 2, (byte)80);
                  }

                  if (1 == this.field3347[var4]) {
                     var3.method545(-1460969981);
                  } else {
                     var2 = false;
                  }
               }

               while(this.field3350 < this.field3343.field7263.length) {
                  if (this.field3343.field7263[this.field3350] == 0) {
                     ++this.field3350;
                  } else {
                     if (this.field3335.method234((byte)57)) {
                        var2 = false;
                        break;
                     }

                     if (1 != this.field3347[this.field3350]) {
                        this.method1958(this.field3350, 2, (byte)99);
                     }

                     if (1 != this.field3347[this.field3350]) {
                        var3 = new class568();
                        var3.field641 = (long)this.field3350;
                        this.field3349.method897(var3, 120115319);
                        var2 = false;
                     }

                     ++this.field3350;
                  }
               }

               if (var2) {
                  this.field3360 = false;
                  this.field3350 = 0;
               }
            } else {
               this.field3349 = null;
            }
         }

         if (this.field3355 && class27.method3468((byte)1) >= this.field3356) {
            for(class959 var6 = (class959)this.field3334.method2946(1614241493); var6 != null; var6 = (class959)this.field3334.method2945((byte)-12)) {
               if (var6.field3464) {
                  if (var1 == -1065641321) {
                     return;
                  }
               } else if (var6.field3465) {
                  if (!var6.field3466) {
                     throw new RuntimeException();
                  }

                  var6.method545(-1460969981);
               } else {
                  var6.field3465 = true;
               }
            }

            this.field3356 = class27.method3468((byte)1) + 1000L;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aaz.c(" + ')');
      }
   }

   class702(int var1, class675 var2, class675 var3, class341 var4, class213 var5, int var6, byte[] var7, int var8, boolean var9) {
      this.field3337 = var1;
      this.field3342 = var2;
      if (this.field3342 == null) {
         this.field3351 = false;
      } else {
         this.field3351 = true;
         this.field3349 = new class373();
      }

      this.field3338 = var3;
      this.field3335 = var4;
      this.field3340 = var5;
      this.field3357 = var6;
      this.field3336 = var7;
      this.field3352 = var8;
      this.field3355 = var9;
      if (this.field3338 != null) {
         this.field3339 = this.field3340.method3805(this.field3337, this.field3338, -1787098666);
      }

   }

   public int method1961(byte var1) {
      try {
         return this.field3341;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aaz.w(" + ')');
      }
   }

   public int method1962(int var1) {
      try {
         if (this.field3343 == null) {
            return 0;
         } else if (!this.field3351) {
            return this.field3343.field7265;
         } else {
            class568 var2 = this.field3349.method901(1766612795);
            return var2 == null ? 0 : (int)var2.field641;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aaz.j(" + ')');
      }
   }

   int method2139(int var1, int var2) {
      try {
         class959 var3 = (class959)this.field3334.method2942((long)var1);
         return var3 != null ? var3.method2036(-2048847327) : 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aaz.p(" + ')');
      }
   }

   byte[] method2137(int var1, byte var2) {
      try {
         class959 var3 = this.method1958(var1, 0, (byte)38);
         if (var3 == null) {
            return null;
         } else {
            byte[] var4 = var3.method2033((short)6593);
            var3.method545(-1460969981);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aaz.f(" + ')');
      }
   }

   public void method1965(byte var1) {
      try {
         if (this.field3342 != null) {
            this.field3360 = true;
            if (this.field3349 == null) {
               this.field3349 = new class373();
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aaz.o(" + ')');
      }
   }

   class695 method2136(int var1) {
      try {
         if (this.field3343 != null) {
            return this.field3343;
         } else {
            if (this.field3339 == null) {
               if (this.field3335.method227((byte)14)) {
                  return null;
               }

               this.field3339 = this.field3335.method225(255, this.field3337, (byte)0, true, -1469164318);
            }

            if (this.field3339.field3464) {
               return null;
            } else {
               byte[] var2 = this.field3339.method2033((short)-4612);
               if (this.field3339 instanceof class174) {
                  try {
                     if (var2 == null) {
                        throw new RuntimeException();
                     }

                     this.field3343 = new class695(var2, this.field3357, this.field3336);
                     if (this.field3352 != this.field3343.field7267) {
                        throw new RuntimeException();
                     }
                  } catch (RuntimeException var4) {
                     this.field3343 = null;
                     if (this.field3335.method227((byte)14)) {
                        this.field3339 = null;
                     } else {
                        this.field3339 = this.field3335.method225(255, this.field3337, (byte)0, true, -165290458);
                     }

                     return null;
                  }
               } else {
                  try {
                     if (var2 == null) {
                        throw new RuntimeException();
                     }

                     this.field3343 = new class695(var2, this.field3357, this.field3336);
                  } catch (RuntimeException var5) {
                     this.field3335.method246(674708053);
                     this.field3343 = null;
                     if (this.field3335.method227((byte)14)) {
                        this.field3339 = null;
                     } else {
                        this.field3339 = this.field3335.method225(255, this.field3337, (byte)0, true, 1947550865);
                     }

                     return null;
                  }

                  if (this.field3338 != null) {
                     this.field3340.method3806(this.field3337, var2, this.field3338, -586951023);
                  }
               }

               this.field3339 = null;
               if (this.field3342 != null) {
                  this.field3347 = new byte[this.field3343.field7259];
                  this.field3341 = 0;
               }

               return this.field3343;
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aaz.a(" + ')');
      }
   }

   public int method1966(int var1) {
      try {
         return this.field3343 == null ? 0 : this.field3343.field7265;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aaz.m(" + ')');
      }
   }

   static void method1967(int var0, byte var1) {
      try {
         for(class568 var2 = class730.field2878.method2946(2109381941); var2 != null; var2 = class730.field2878.method2945((byte)-58)) {
            if ((long)var0 == (var2.field641 >> 48 & 65535L)) {
               var2.method545(-1460969981);
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aaz.mu(" + ')');
      }
   }

   static final void method1968(class744 var0, short var1) {
      try {
         if (class53.field2311 && class296.field10468 != null) {
            class739.method1795(class615.field8903.field9109.method6159((byte)4), -1, -1, false, 1414482658);
         }

         String var2 = (String)var0.field3157[--var0.field3158];
         boolean var3 = var0.field3161[--var0.field3156] == 1;
         String var4 = class833.method5432((byte)-59) + var2;
         if (var4.equals("http://www.BlissScape.com/l=en/a=0/p=wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk/loginapplet/loginapplet.ws?ssl=1&expired=0&mod=accountappeal&dest=passwordchoice.ws")) {
            var4 = "http://www.blissscape.com/forums/m/33734747/viewforum/6249200";
         } else if (var4.equals("http://www.BlissScape.com/l=en/a=0/p=wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk/loginapplet/loginapplet.ws?ssl=1&expired=0&mod=www&dest=account_settings.ws?mod=messages")) {
            var4 = "http://www.blissscape.com/forums/m/33734747/viewforum/6249197";
         }

         class158.method3442(var4, var3, class615.field8903.field9137.method3689(-1851684401) == 5, class730.field2849, class730.field2632, (byte)49);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aaz.afo(" + ')');
      }
   }

   public static void method1969(int var0, int var1, String var2, String var3, String var4, String var5, int var6) {
      try {
         class684.method4383(var0, var1, var2, var3, var4, var5, (String)null, -1, 1446000206);
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "aaz.p(" + ')');
      }
   }

   static void method1970(byte var0) {
      try {
         int var1 = 0;
         if (class615.field8903 != null) {
            var1 = class615.field8903.field9132.method2605(-1747444886);
         }

         int var2;
         int var3;
         if (var1 == 2) {
            var2 = class919.field10433 > 800 ? 800 : class919.field10433 * 1325868603 * -639974669;
            var3 = class69.field1812 > 600 ? 600 : 1282634425 * class69.field1812 * -2115832951;
            class759.field4331 = var2;
            class69.field1813 = (class919.field10433 - var2) / 2;
            class97.field614 = var3;
            class69.field1814 = 0;
         } else if (var1 == 1) {
            var2 = class919.field10433 > 1024 ? 1024 : class919.field10433 * 1325868603 * -639974669;
            var3 = class69.field1812 > 768 ? 768 : class69.field1812 * -2115832951 * 1282634425;
            class759.field4331 = var2;
            class69.field1813 = (class919.field10433 - var2) / 2;
            class97.field614 = var3;
            class69.field1814 = 0;
         } else {
            class759.field4331 = class919.field10433;
            class69.field1813 = 0;
            class97.field614 = class69.field1812;
            class69.field1814 = 0;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aaz.gm(" + ')');
      }
   }
}
