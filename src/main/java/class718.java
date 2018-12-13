public class class718 {
   class844 field3491;
   public byte[] field3492;
   public String[] field3493 = new String[5];
   public int field3494 = -1;
   public boolean field3495 = false;
   public int field3496;
   public int field3497 = -1;
   public int field3498 = 0;
   public int field3499;
   public int field3500 = -1;
   public static int field3501 = 2;
   public int field3502;
   public int field3503 = -1;
   public String field3504;
   int field3505 = -1;
   public boolean field3506 = true;
   public String field3507;
   public int field3508 = Integer.MIN_VALUE;
   int field3509 = -1;
   int field3510;
   int field3511;
   int field3512 = -1;
   int field3513 = -1;
   public int field3514 = -1;
   int field3515;
   int field3516 = -1;
   public int field3517;
   public int[] field3518;
   public int field3519 = Integer.MAX_VALUE;
   public int field3520 = Integer.MAX_VALUE;
   public int field3521 = -1;
   public int field3522 = Integer.MIN_VALUE;
   public int field3523;
   public static int field3524 = 0;
   public boolean field3525 = true;
   NodeTable field3526;
   public int field3527;
   public int field3528;
   public int[] field3529;
   int field3530;
   public boolean field3531 = true;
   public int field3532 = -1;
   public static int field3533 = 1;

   void method2060(InputStream var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.method2061(var1, var3, (short)3170);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "or.a(" + ')');
      }
   }

   void method2061(InputStream var1, int var2, short var3) {
      try {
         if (1 == var2) {
            this.field3500 = var1.method6423(1235052657);
         } else if (var2 == 2) {
            this.field3494 = var1.method6423(1235052657);
         } else if (3 == var2) {
            this.field3507 = var1.method6379(-730966089);
         } else if (4 == var2) {
            this.field3496 = var1.method6390((byte)-65);
         } else if (5 == var2) {
            this.field3497 = var1.method6390((byte)-42);
         } else if (var2 == 6) {
            this.field3498 = var1.method6371();
         } else {
            int var4;
            if (7 == var2) {
               var4 = var1.method6371();
               if ((var4 & 1) == 0) {
                  this.field3525 = false;
               }

               if ((var4 & 2) == 2) {
                  this.field3495 = true;
               }
            } else if (8 == var2) {
               this.field3506 = var1.method6371() == 1;
            } else if (9 == var2) {
               this.field3512 = var1.method6374();
               if (65535 == this.field3512) {
                  this.field3512 = -1;
               }

               this.field3513 = var1.method6374();
               if (this.field3513 == 65535) {
                  this.field3513 = -1;
               }

               this.field3510 = var1.method6420((byte)-62);
               this.field3511 = var1.method6420((byte)-20);
            } else if (var2 >= 10 && var2 <= 14) {
               this.field3493[var2 - 10] = var1.method6379(-1381247713);
            } else {
               int var5;
               if (var2 == 15) {
                  var4 = var1.method6371();
                  this.field3518 = new int[2 * var4];

                  for(var5 = 0; var5 < 2 * var4; ++var5) {
                     this.field3518[var5] = var1.method6367(1914193224);
                  }

                  this.field3523 = var1.method6420((byte)-21);
                  var5 = var1.method6371();
                  this.field3529 = new int[var5];

                  int var6;
                  for(var6 = 0; var6 < this.field3529.length; ++var6) {
                     this.field3529[var6] = var1.method6420((byte)10);
                  }

                  this.field3492 = new byte[var4];

                  for(var6 = 0; var6 < var4; ++var6) {
                     this.field3492[var6] = var1.method6372(-12558881);
                  }
               } else if (var2 == 16) {
                  this.field3531 = false;
               } else if (17 == var2) {
                  this.field3504 = var1.method6379(-136783420);
               } else if (18 == var2) {
                  this.field3509 = var1.method6423(1235052657);
               } else if (19 == var2) {
                  this.field3532 = var1.method6374();
               } else if (20 == var2) {
                  this.field3516 = var1.method6374();
                  if (this.field3516 == 65535) {
                     this.field3516 = -1;
                  }

                  this.field3505 = var1.method6374();
                  if (this.field3505 == 65535) {
                     this.field3505 = -1;
                  }

                  this.field3530 = var1.method6420((byte)28);
                  this.field3515 = var1.method6420((byte)99);
               } else if (var2 == 21) {
                  this.field3517 = var1.method6420((byte)-43);
               } else if (22 == var2) {
                  this.field3502 = var1.method6420((byte)-10);
               } else if (var2 == 23) {
                  this.field3521 = var1.method6371();
                  this.field3514 = var1.method6371();
                  this.field3503 = var1.method6371();
               } else if (var2 == 24) {
                  this.field3527 = var1.method6367(2027309656);
                  this.field3528 = var1.method6367(1532524522);
               } else if (var2 == 249) {
                  var4 = var1.method6371();
                  if (this.field3526 == null) {
                     var5 = class18.method3687(var4, (byte)16);
                     this.field3526 = new NodeTable(var5);
                  }

                  for(var5 = 0; var5 < var4; ++var5) {
                     boolean var10 = var1.method6371() == 1;
                     int var7 = var1.method6390((byte)-26);
                     Object var8;
                     if (var10) {
                        var8 = new class437(var1.method6379(-826702559));
                     } else {
                        var8 = new class722(var1.method6420((byte)97));
                     }

                     this.field3526.method2947((Node)var8, (long)var7);
                  }
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "or.f(" + ')');
      }
   }

   void method2062(int var1) {
      try {
         if (this.field3518 != null) {
            for(int var2 = 0; var2 < this.field3518.length; var2 += 2) {
               if (this.field3518[var2] < this.field3519) {
                  this.field3519 = this.field3518[var2];
               } else if (this.field3518[var2] > this.field3508) {
                  this.field3508 = this.field3518[var2];
               }

               if (this.field3518[var2 + 1] < this.field3520) {
                  this.field3520 = this.field3518[var2 + 1];
               } else if (this.field3518[1 + var2] > this.field3522) {
                  this.field3522 = this.field3518[1 + var2];
               }
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "or.b(" + ')');
      }
   }

   public boolean method2063(class415 var1, int var2) {
      try {
         int var3;
         if (-1 != this.field3513) {
            var3 = var1.method5655(this.field3513, (byte)44);
         } else {
            if (-1 == this.field3512) {
               return true;
            }

            var3 = var1.method5653(this.field3512, (byte)24);
         }

         if (var3 >= this.field3510 && var3 <= this.field3511) {
            boolean var4 = false;
            int var5;
            if (this.field3505 != -1) {
               var5 = var1.method5655(this.field3505, (byte)17);
            } else {
               if (-1 == this.field3516) {
                  return true;
               }

               var5 = var1.method5653(this.field3516, (byte)72);
            }

            return var5 >= this.field3530 && var5 <= this.field3515;
         } else {
            return false;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "or.p(" + ')');
      }
   }

   public class48 method2064(class848 var1, boolean var2, int var3) {
      try {
         int var4 = var2 ? this.field3494 * -1006024925 * -1413078901 : this.field3500 * -1126107561 * 715019623;
         int var5 = var4 | var1.field8580 << 29;
         class48 var6 = (class48)this.field3491.field8681.method2974((long)var5);
         if (var6 != null) {
            return var6;
         } else if (!this.field3491.field8684.method3280(var4, -457216440)) {
            return null;
         } else {
            class922 var7 = class922.method6242(this.field3491.field8684, var4, 0);
            if (var7 != null) {
               var6 = var1.method4982(var7, true);
               this.field3491.field8681.method2984(var6, (long)var5);
            }

            return var6;
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "or.i(" + ')');
      }
   }

   public String method2065(int var1, String var2, byte var3) {
      try {
         if (this.field3526 == null) {
            return var2;
         } else {
            class437 var4 = (class437)this.field3526.method2942((long)var1);
            return var4 == null ? var2 : (String)var4.field7515;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "or.u(" + ')');
      }
   }

   public class48 method2066(class848 var1, int var2) {
      try {
         class48 var3 = (class48)this.field3491.field8681.method2974((long)(this.field3509 | 131072 | var1.field8580 << 29));
         if (var3 != null) {
            return var3;
         } else {
            this.field3491.field8684.method3280(this.field3509, -457216440);
            class922 var4 = class922.method6242(this.field3491.field8684, this.field3509, 0);
            if (var4 != null) {
               var3 = var1.method4982(var4, true);
               this.field3491.field8681.method2984(var3, (long)(this.field3509 | 131072 | var1.field8580 << 29));
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "or.k(" + ')');
      }
   }

   public int method2067(int var1, int var2, int var3) {
      try {
         if (this.field3526 == null) {
            return var2;
         } else {
            class722 var4 = (class722)this.field3526.method2942((long)var1);
            return var4 == null ? var2 : var4.field3631;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "or.d(" + ')');
      }
   }

   static final void method2068(class744 var0, byte var1) {
      try {
         var0.field3156 -= 5;
         class671.method4237(var0.field3161[var0.field3156], var0.field3161[var0.field3156 + 1], var0.field3161[2 + var0.field3156], var0.field3161[3 + var0.field3156], false, var0.field3161[var0.field3156 + 4], 2026903657);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "or.to(" + ')');
      }
   }

   static final void method2069(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = class540.field3930.method2319(var2, 614874976).field4579;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "or.ta(" + ')');
      }
   }

   public static class469 method2070(int var0, byte var1) {
      try {
         class469[] var2 = class754.method2660((byte)75);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class469 var4 = var2[var3];
            if (var4.field7327 == var0) {
               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "or.f(" + ')');
      }
   }

   public static int method2071(long var0) {
      try {
         class411.method5593(var0);
         return class308.field416.get(1);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "or.q(" + ')');
      }
   }

   static void method2072(int var0, byte var1) {
      try {
         class747.field4148 = var0;
         class740.field3201 = -1;
         class740.field3201 = -1;
         class640.method6191(65536);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "or.co(" + ')');
      }
   }

   static final void method2073(class744 var0, byte var1) {
      try {
         var0.field3156 -= 2;
         class503.field4103[var0.field3161[var0.field3156]] = (short)class22.method3436(var0.field3161[var0.field3156 + 1], (byte)-118);
         class85.field1121.method1576((byte)-85);
         class85.field1121.method1574(-1524552538);
         class258.field7913.method16((byte)14);
         class881.method6172(658986741);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "or.afg(" + ')');
      }
   }

   static final void method2074(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3157[++var0.field3158 - 1] = class85.field1121.method1566(var2).name;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "or.aaj(" + ')');
      }
   }
}
