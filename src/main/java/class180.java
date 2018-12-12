public final class class180 {
   static int field5282 = 0;
   public static int field5283 = 1;
   class695 field5284 = null;
   static class2 field5285 = new class2();
   boolean field5286;
   static int field5287 = 0;
   Object[] field5288;
   Object[][] field5289;
   int field5290;
   class721 field5291;
   static boolean field5292 = false;
   static int field5293 = 0;
   public static int field5294 = 2;
   static int field5295 = 1;

   synchronized boolean method3254(int var1) {
      try {
         if (this.field5284 == null) {
            this.field5284 = this.field5291.method2136(2102263091);
            if (this.field5284 == null) {
               return false;
            }

            this.field5288 = new Object[this.field5284.field7259];
            this.field5289 = new Object[this.field5284.field7259][];
         }

         return true;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ke.a(" + ')');
      }
   }

   public int method3255(byte var1) {
      try {
         if (!this.method3254(14382781)) {
            throw new IllegalStateException("");
         } else {
            return this.field5284.field7251;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ke.f(" + ')');
      }
   }

   synchronized boolean method3256(int var1, int var2, byte var3) {
      try {
         if (!this.method3254(24313456)) {
            return false;
         } else if (var1 >= 0 && var2 >= 0 && var1 < this.field5284.field7255.length && var2 < this.field5284.field7255[var1]) {
            return true;
         } else if (field5292) {
            throw new IllegalArgumentException(var1 + " " + var2);
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ke.p(" + ')');
      }
   }

   synchronized void method3257(int var1, byte var2) {
      try {
         if (this.field5286) {
            this.field5288[var1] = this.field5291.method2137(var1, (byte)-83);
         } else {
            this.field5288[var1] = class562.method812(this.field5291.method2137(var1, (byte)-115), false, (short)-5444);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.i(" + ')');
      }
   }

   void method3258(int var1, byte var2) {
      try {
         this.field5291.method2142(var1, (short)-11867);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.k(" + ')');
      }
   }

   public synchronized byte[] method3259(int var1, int var2, int[] var3, int var4) {
      try {
         if (!this.method3256(var1, var2, (byte)106)) {
            return null;
         } else {
            byte[] var5 = null;
            if (this.field5289[var1] == null || this.field5289[var1][var2] == null) {
               boolean var6 = this.method3276(var1, var2, var3, (byte)1);
               if (!var6) {
                  this.method3257(var1, (byte)23);
                  var6 = this.method3276(var1, var2, var3, (byte)1);
                  if (!var6) {
                     return null;
                  }
               }
            }

            if (this.field5289[var1] == null) {
               throw new RuntimeException("");
            } else {
               if (this.field5289[var1][var2] != null) {
                  var5 = class886.method6166(this.field5289[var1][var2], false, -390800011);
                  if (var5 == null) {
                     throw new RuntimeException("");
                  }
               }

               if (var5 != null) {
                  if (this.field5290 == 1) {
                     this.field5289[var1][var2] = null;
                     if (1 == this.field5284.field7255[var1]) {
                        this.field5289[var1] = null;
                     }
                  } else if (this.field5290 == 2) {
                     this.field5289[var1] = null;
                  }
               }

               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "ke.u(" + ')');
      }
   }

   public synchronized boolean method3260(int var1, int var2, int var3) {
      try {
         if (!this.method3256(var1, var2, (byte)52)) {
            return false;
         } else if (this.field5289[var1] != null && this.field5289[var1][var2] != null) {
            return true;
         } else if (this.field5288[var1] != null) {
            return true;
         } else {
            this.method3257(var1, (byte)102);
            return this.field5288[var1] != null;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ke.x(" + ')');
      }
   }

   public synchronized boolean method3261(int var1, int var2) {
      try {
         if (!this.method3279(var1, (byte)1)) {
            return false;
         } else if (this.field5288[var1] != null) {
            return true;
         } else {
            this.method3257(var1, (byte)60);
            return this.field5288[var1] != null;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.q(" + ')');
      }
   }

   public synchronized boolean method3262(int var1) {
      try {
         if (!this.method3254(1564303970)) {
            return false;
         } else {
            boolean var2 = true;

            for(int var3 = 0; var3 < this.field5284.field7256.length; ++var3) {
               int var4 = this.field5284.field7256[var3];
               if (this.field5288[var4] == null) {
                  this.method3257(var4, (byte)10);
                  if (this.field5288[var4] == null) {
                     var2 = false;
                  }
               }
            }

            return var2;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ke.n(" + ')');
      }
   }

   public synchronized int method3263(byte var1) {
      try {
         if (!this.method3254(-561688978)) {
            return 0;
         } else {
            int var2 = 0;
            int var3 = 0;

            int var4;
            for(var4 = 0; var4 < this.field5288.length; ++var4) {
               if (this.field5284.field7263[var4] > 0) {
                  var2 += 100;
                  var3 += this.method3273(var4, (byte)1);
               }
            }

            if (var2 == 0) {
               return 100;
            } else {
               var4 = var3 * 100 / var2;
               return var4;
            }
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ke.z(" + ')');
      }
   }

   public synchronized byte[] method3264(int var1, byte var2) {
      try {
         if (!this.method3254(-1120870395)) {
            return null;
         } else if (this.field5284.field7255.length == 1) {
            return this.method3285(0, var1, (byte)-42);
         } else if (!this.method3279(var1, (byte)1)) {
            return null;
         } else if (this.field5284.field7255[var1] == 1) {
            return this.method3285(var1, 0, (byte)-48);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.y(" + ')');
      }
   }

   public boolean method3265(String var1, int var2) {
      try {
         if (!this.method3254(2084387932)) {
            return false;
         } else {
            var1 = var1.toLowerCase();
            int var3 = this.field5284.field7258.method1172(class153.method3394(var1, -1973803814), 867865737);
            return var3 >= 0;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.j(" + ')');
      }
   }

   public int method3266(int var1) {
      try {
         return !this.method3254(-1854256654) ? -1 : this.field5284.field7255.length;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ke.v(" + ')');
      }
   }

   public synchronized void method3267(int var1, int var2) {
      try {
         if (this.method3279(var1, (byte)1) && this.field5289 != null) {
            this.field5289[var1] = null;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.g(" + ')');
      }
   }

   public void method3268(boolean var1, boolean var2, int var3) {
      try {
         if (this.method3254(843198070)) {
            if (var1) {
               this.field5284.field7257 = null;
               this.field5284.field7258 = null;
            }

            if (var2) {
               this.field5284.field7261 = null;
               this.field5284.field7266 = null;
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ke.e(" + ')');
      }
   }

   public class180(class721 var1, boolean var2, int var3) {
      if (var3 >= 0 && var3 <= 2) {
         this.field5291 = var1;
         this.field5286 = var2;
         this.field5290 = var3;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   public int method3269(int var1, int var2) {
      try {
         if (!this.method3254(-1669476342)) {
            return -1;
         } else {
            int var3 = this.field5284.field7258.method1172(var1, 1079998267);
            return !this.method3279(var3, (byte)1) ? -1 : var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.w(" + ')');
      }
   }

   public boolean method3270(String var1, String var2, byte var3) {
      try {
         if (!this.method3254(-574952224)) {
            return false;
         } else {
            var1 = var1.toLowerCase();
            var2 = var2.toLowerCase();
            int var4 = this.field5284.field7258.method1172(class153.method3394(var1, -1984349791), 728033014);
            if (var4 < 0) {
               return false;
            } else {
               int var5 = this.field5284.field7266[var4].method1172(class153.method3394(var2, -2081152646), 2090644563);
               return var5 >= 0;
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ke.o(" + ')');
      }
   }

   public synchronized byte[] method3271(String var1, String var2, int var3) {
      try {
         if (!this.method3254(-1323260380)) {
            return null;
         } else {
            var1 = var1.toLowerCase();
            var2 = var2.toLowerCase();
            int var4 = this.field5284.field7258.method1172(class153.method3394(var1, -1961901970), 1404802795);
            if (!this.method3279(var4, (byte)1)) {
               return null;
            } else {
               int var5 = this.field5284.field7266[var4].method1172(class153.method3394(var2, -2059879258), 838109915);
               return this.method3285(var4, var5, (byte)-34);
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ke.l(" + ')');
      }
   }

   boolean method3272(String var1, String var2, int var3) {
      try {
         if (!this.method3254(391595632)) {
            return false;
         } else {
            var1 = var1.toLowerCase();
            var2 = var2.toLowerCase();
            int var4 = this.field5284.field7258.method1172(class153.method3394(var1, -2027002851), 906979105);
            if (!this.method3279(var4, (byte)1)) {
               return false;
            } else {
               int var5 = this.field5284.field7266[var4].method1172(class153.method3394(var2, -2028561031), 2121455333);
               return this.method3260(var4, var5, -1219568896);
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ke.ax(" + ')');
      }
   }

   synchronized int method3273(int var1, byte var2) {
      try {
         if (!this.method3279(var1, (byte)1)) {
            return 0;
         } else {
            return this.field5288[var1] != null ? 100 : this.field5291.method2139(var1, 65535);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.s(" + ')');
      }
   }

   public void method3274(String var1, int var2) {
      try {
         if (this.method3254(1339347995)) {
            var1 = var1.toLowerCase();
            int var3 = this.field5284.field7258.method1172(class153.method3394(var1, -2097971535), 1493933726);
            this.method3258(var3, (byte)98);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.ae(" + ')');
      }
   }

   public int method3275(String var1, int var2) {
      try {
         if (!this.method3254(2032881212)) {
            return 0;
         } else {
            var1 = var1.toLowerCase();
            int var3 = this.field5284.field7258.method1172(class153.method3394(var1, -2069451291), 96817353);
            return this.method3273(var3, (byte)1);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.ao(" + ')');
      }
   }

   synchronized boolean method3276(int var1, int var2, int[] var3, byte var4) {
      try {
         if (!this.method3279(var1, (byte)1)) {
            return false;
         } else if (this.field5288[var1] == null) {
            return false;
         } else {
            int var5 = this.field5284.field7263[var1];
            int[] var6 = this.field5284.field7264[var1];
            if (this.field5289[var1] == null) {
               this.field5289[var1] = new Object[this.field5284.field7255[var1]];
            }

            Object[] var7 = this.field5289[var1];
            boolean var8 = true;

            for(int var9 = 0; var9 < var5; ++var9) {
               int var10;
               if (var6 == null) {
                  var10 = var9;
               } else {
                  var10 = var6[var9];
               }

               if (var7[var10] == null) {
                  var8 = false;
                  break;
               }
            }

            if (var8) {
               return true;
            } else {
               byte[] var24;
               if (var3 == null || var3[0] == 0 && var3[1] == 0 && var3[2] == 0 && var3[3] == 0) {
                  var24 = class886.method6166(this.field5288[var1], false, -144584373);
               } else {
                  var24 = class886.method6166(this.field5288[var1], true, -858479492);
                  InputStream var25 = new InputStream(var24);
                  var25.method6389(var3, 5, var25.field10375.length, -1429633724);
               }

               byte[] var26;
               try {
                  var26 = class35.method3335(var24, 1072675128);
               } catch (RuntimeException var22) {
                  throw class158.method3445(var22, (var3 != null) + " " + var1 + " " + var24.length + " " + class528.method2247(var24, var24.length, -1914018334) + " " + class528.method2247(var24, var24.length - 2, -1788280058) + " " + this.field5284.field7260[var1] + " " + this.field5284.field7251);
               }

               if (this.field5286) {
                  this.field5288[var1] = null;
               }

               int var11;
               if (var5 > 1) {
                  int var12;
                  InputStream var13;
                  int var15;
                  int var16;
                  int var17;
                  int var18;
                  int var19;
                  if (2 != this.field5290) {
                     var11 = var26.length;
                     --var11;
                     var12 = var26[var11] & 255;
                     var11 -= 4 * var12 * var5;
                     var13 = new InputStream(var26);
                     int[] var14 = new int[var5];
                     var13.field10376 = var11;

                     for(var15 = 0; var15 < var12; ++var15) {
                        var16 = 0;

                        for(var17 = 0; var17 < var5; ++var17) {
                           var16 += var13.method6420((byte)13);
                           var14[var17] += var16;
                        }
                     }

                     byte[][] var28 = new byte[var5][];

                     for(var16 = 0; var16 < var5; ++var16) {
                        var28[var16] = new byte[var14[var16]];
                        var14[var16] = 0;
                     }

                     var13.field10376 = var11;
                     var16 = 0;

                     for(var17 = 0; var17 < var12; ++var17) {
                        var18 = 0;

                        for(var19 = 0; var19 < var5; ++var19) {
                           var18 += var13.method6420((byte)-32);
                           System.arraycopy(var26, var16, var28[var19], var14[var19], var18);
                           var14[var19] += var18;
                           var16 += var18;
                        }
                     }

                     for(var17 = 0; var17 < var5; ++var17) {
                        if (var6 == null) {
                           var18 = var17;
                        } else {
                           var18 = var6[var17];
                        }

                        if (this.field5290 == 0) {
                           var7[var18] = class562.method812(var28[var17], false, (short)-26522);
                        } else {
                           var7[var18] = var28[var17];
                        }
                     }
                  } else {
                     var11 = var26.length;
                     --var11;
                     var12 = var26[var11] & 255;
                     var11 -= var5 * var12 * 4;
                     var13 = new InputStream(var26);
                     int var27 = 0;
                     var15 = 0;
                     var13.field10376 = var11;

                     for(var16 = 0; var16 < var12; ++var16) {
                        var17 = 0;

                        for(var18 = 0; var18 < var5; ++var18) {
                           var17 += var13.method6420((byte)-36);
                           if (var6 == null) {
                              var19 = var18;
                           } else {
                              var19 = var6[var18];
                           }

                           if (var19 == var2) {
                              var27 += var17;
                              var15 = var19;
                           }
                        }
                     }

                     if (var27 == 0) {
                        return true;
                     }

                     byte[] var29 = new byte[var27];
                     var27 = 0;
                     var13.field10376 = var11;
                     var17 = 0;

                     for(var18 = 0; var18 < var12; ++var18) {
                        var19 = 0;

                        for(int var20 = 0; var20 < var5; ++var20) {
                           var19 += var13.method6420((byte)-26);
                           int var21;
                           if (var6 == null) {
                              var21 = var20;
                           } else {
                              var21 = var6[var20];
                           }

                           if (var21 == var2) {
                              System.arraycopy(var26, var17, var29, var27, var19);
                              var27 += var19;
                           }

                           var17 += var19;
                        }
                     }

                     var7[var15] = var29;
                  }
               } else {
                  if (var6 == null) {
                     var11 = 0;
                  } else {
                     var11 = var6[0];
                  }

                  if (this.field5290 == 0) {
                     var7[var11] = class562.method812(var26, false, (short)-11343);
                  } else {
                     var7[var11] = var26;
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var23) {
         throw class158.method3445(var23, "ke.c(" + ')');
      }
   }

   public synchronized int[] method3277(int var1, int var2) {
      try {
         if (!this.method3279(var1, (byte)1)) {
            return null;
         } else {
            int[] var3 = this.field5284.field7264[var1];
            if (var3 == null) {
               var3 = new int[this.field5284.field7263[var1]];

               for(int var4 = 0; var4 < var3.length; var3[var4] = var4++) {
                  ;
               }
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ke.t(" + ')');
      }
   }

   synchronized boolean method3279(int var1, byte var2) {
      try {
         if (!this.method3254(-1888148215)) {
            return false;
         } else if (var1 >= 0 && var1 < this.field5284.field7255.length && this.field5284.field7255[var1] != 0) {
            return true;
         } else if (field5292) {
            throw new IllegalArgumentException(Integer.toString(var1));
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.b(" + ')');
      }
   }

   public synchronized boolean method3280(int var1, int var2) {
      try {
         if (!this.method3254(-259904989)) {
            return false;
         } else if (1 == this.field5284.field7255.length) {
            return this.method3260(0, var1, -1025716899);
         } else if (!this.method3279(var1, (byte)1)) {
            return false;
         } else if (this.field5284.field7255[var1] == 1) {
            return this.method3260(var1, 0, -2065975004);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.r(" + ')');
      }
   }

   public int method3281(String var1, int var2) {
      try {
         if (!this.method3254(1289573635)) {
            return -1;
         } else {
            var1 = var1.toLowerCase();
            int var3 = this.field5284.field7258.method1172(class153.method3394(var1, -2067562497), 403552753);
            return !this.method3279(var3, (byte)1) ? -1 : var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.m(" + ')');
      }
   }

   public boolean method3282(String var1, int var2) {
      try {
         if (!this.method3254(-492791802)) {
            return false;
         } else {
            var1 = var1.toLowerCase();
            int var3 = this.field5284.field7258.method1172(class153.method3394(var1, -2120237955), 187766103);
            return this.method3261(var3, 1717306833);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.ak(" + ')');
      }
   }

   public boolean method3283(String var1, int var2) {
      try {
         int var3 = this.method3281("", -1723903675);
         return var3 != -1 ? this.method3272("", var1, -563288883) : this.method3272(var1, "", -859462811);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.aa(" + ')');
      }
   }

   public byte[] method3285(int var1, int var2, byte var3) {
      try {
         return this.method3259(var1, var2, (int[])null, -1954204331);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ke.d(" + ')');
      }
   }

   public int method3286(int var1, int var2) {
      try {
         return !this.method3279(var1, (byte)1) ? 0 : this.field5284.field7255[var1];
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ke.h(" + ')');
      }
   }

   static final void method3287(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         String var4 = (String)var2.field3157[--var2.field3158];
         if (class960.method2212(var4, var2, -1820459724) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field998 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ke.nf(" + ')');
      }
   }

   static final void method3288(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = (int)(class27.method3468((byte)1) / 86400000L) - 11745;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ke.aka(" + ')');
      }
   }
}
