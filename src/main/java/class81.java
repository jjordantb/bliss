import java.io.IOException;

public class class81 extends class341 {
   class348 field1085;

   public void method242() {
      if (this.field1085 != null) {
         try {
            this.field313.field10376 = 0;
            this.field313.method6361(7);
            this.field313.method6360(0L);
            this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 990569572);
         } catch (IOException var4) {
            try {
               this.field1085.method179(-2134679805);
            } catch (Exception var3) {
               ;
            }

            this.field1085 = null;
            this.field304 += 686188557;
            this.field314 = -1707252930;
         }
      }

   }

   void method246(int var1) {
      try {
         try {
            this.field1085.method179(-2144712239);
         } catch (Exception var3) {
            ;
         }

         this.field1085 = null;
         this.field304 += 686188557;
         this.field314 = 1293857183;
         this.field312 = (byte)((int)(Math.random() * 255.0D + 1.0D));
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aae.k(" + ')');
      }
   }

   public boolean method238(int var1) {
      try {
         int var4;
         if (this.field1085 != null) {
            long var2 = class27.method3468((byte)1);
            var4 = (int)(var2 - 5958027995888260733L * this.field310);
            this.field310 = var2 * 2125194141775565525L;
            if (var4 > 200) {
               var4 = 200;
            }

            this.field309 += var4 * 506122611;
            if (987675579 * this.field309 > 30000) {
               try {
                  this.field1085.method179(-2044434923);
               } catch (Exception var21) {
                  ;
               }

               this.field1085 = null;
            }
         }

         if (this.field1085 == null) {
            return this.method235(1210007977) == 0 && this.method228(899560496) == 0;
         } else {
            boolean var19;
            try {
               class448 var6;
               for(var6 = (class448)this.field305.method2706(1668468099); var6 != null; var6 = (class448)this.field305.method2707(-1920602300)) {
                  this.field313.field10376 = 0;
                  this.field313.method6361(1);
                  this.field313.method6360(-5533549728640346679L * var6.field209);
                  this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 1349162562);
                  this.field311.method2704(var6, (byte)-109);
               }

               for(var6 = (class448)this.field307.method2706(-1137298228); var6 != null; var6 = (class448)this.field307.method2707(1503165244)) {
                  this.field313.field10376 = 0;
                  this.field313.method6361(0);
                  this.field313.method6360(var6.field209 * -5533549728640346679L);
                  this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 385615633);
                  this.field301.method2704(var6, (byte)-76);
               }

               for(int var24 = 0; var24 < 100; ++var24) {
                  var4 = this.field1085.method176(1329342411);
                  if (var4 < 0) {
                     throw new IOException();
                  }

                  if (var4 == 0) {
                     if (var1 != -358267640) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  this.field309 = 0;
                  byte var5 = 0;
                  if (this.field316 == null) {
                     var5 = 10;
                  } else if (1488798733 * this.field316.field7102 == 0) {
                     var5 = 1;
                  }

                  int var7;
                  int var8;
                  int var9;
                  if (var5 > 0) {
                     var7 = var5 - this.field306.field10376 * 385051775;
                     if (var7 > var4) {
                        var7 = var4;
                     }

                     this.field1085.method177(this.field306.field10375, 385051775 * this.field306.field10376, var7, (byte)56);
                     if (this.field312 != 0) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           this.field306.field10375[this.field306.field10376 * 385051775 + var8] ^= this.field312;
                        }
                     }

                     this.field306.field10376 += 116413311 * var7;
                     if (this.field306.field10376 * 385051775 >= var5) {
                        if (this.field316 == null) {
                           this.field306.field10376 = 0;
                           var8 = this.field306.method6371();
                           var9 = this.field306.method6420((byte)-46);
                           int var10 = this.field306.method6371();
                           int var11 = this.field306.method6420((byte)41);
                           int var12 = var10 & 127;
                           boolean var13 = (var10 & 128) != 0;
                           long var14 = ((long)var8 << 32) + (long)var9;
                           Object var16 = null;
                           class448 var17;
                           if (var13) {
                              for(var17 = (class448)this.field301.method2706(737223474); var17 != null; var17 = (class448)this.field301.method2707(-1305306888)) {
                                 if (-5533549728640346679L * var17.field209 == var14) {
                                    if (var1 != -358267640) {
                                       throw new IllegalStateException();
                                    }
                                    break;
                                 }
                              }
                           } else {
                              for(var17 = (class448)this.field311.method2706(-1834989032); var17 != null; var17 = (class448)this.field311.method2707(247272517)) {
                                 if (var14 == var17.field209 * -5533549728640346679L) {
                                    if (var1 != -358267640) {
                                       throw new IllegalStateException();
                                    }
                                    break;
                                 }
                              }
                           }

                           if (var17 == null) {
                              throw new IOException();
                           }

                           int var18 = var12 == 0 ? 5 : 9;
                           this.field316 = var17;
                           this.field316.field7101 = new class907(this.field316.field7100 + var18 + var11);
                           this.field316.field7101.method6361(var12);
                           this.field316.field7101.method6364(var11, 756032699);
                           this.field316.field7102 = 154839986;
                           this.field306.field10376 = 0;
                        } else {
                           if (1488798733 * this.field316.field7102 != 0) {
                              throw new IOException();
                           }

                           if (-1 == this.field306.field10375[0]) {
                              this.field316.field7102 = 1733470917;
                              this.field306.field10376 = 0;
                           } else {
                              this.field316 = null;
                           }
                        }
                     }
                  } else {
                     var7 = this.field316.field7101.field10375.length - this.field316.field7100;
                     var8 = 512 - 1488798733 * this.field316.field7102;
                     if (var8 > var7 - this.field316.field7101.field10376 * 385051775) {
                        var8 = var7 - 385051775 * this.field316.field7101.field10376;
                     }

                     if (var8 > var4) {
                        var8 = var4;
                     }

                     this.field1085.method177(this.field316.field7101.field10375, 385051775 * this.field316.field7101.field10376, var8, (byte)-56);
                     if (this.field312 != 0) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           this.field316.field7101.field10375[this.field316.field7101.field10376 * 385051775 + var9] ^= this.field312;
                        }
                     }

                     this.field316.field7101.field10376 += 116413311 * var8;
                     this.field316.field7102 += var8 * 1733470917;
                     if (this.field316.field7101.field10376 * 385051775 == var7) {
                        this.field316.method156(-278229196);
                        this.field316.field3464 = false;
                        this.field316 = null;
                     } else if (512 == this.field316.field7102 * 1488798733) {
                        this.field316.field7102 = 0;
                     }
                  }
               }

               var19 = true;
            } catch (IOException var22) {
               try {
                  this.field1085.method179(-2108190565);
               } catch (Exception var20) {
                  ;
               }

               this.field1085 = null;
               this.field304 += 686188557;
               this.field314 = -1707252930;
               if (this.method235(1098571032) == 0 && this.method228(-1686765895) == 0) {
                  return true;
               }

               return false;
            }

            return var19;
         }
      } catch (RuntimeException var23) {
         throw class158.method3445(var23, "aae.d(" + ')');
      }
   }

   void method237() {
      try {
         this.field1085.method179(-2125954897);
      } catch (Exception var2) {
         ;
      }

      this.field1085 = null;
      this.field304 += 686188557;
      this.field314 = 1293857183;
      this.field312 = (byte)((int)(Math.random() * 255.0D + 1.0D));
   }

   public void method230(boolean var1, int var2) {
      try {
         if (this.field1085 != null) {
            try {
               this.field313.field10376 = 0;
               this.field313.method6361(var1 ? 2 : 3);
               this.field313.method6360(0L);
               this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 1744086498);
            } catch (IOException var6) {
               try {
                  this.field1085.method179(-2080652682);
               } catch (Exception var5) {
                  ;
               }

               this.field1085 = null;
               this.field304 += 686188557;
               this.field314 = -1707252930;
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aae.x(" + ')');
      }
   }

   public void method232(byte var1) {
      try {
         if (this.field1085 != null) {
            try {
               this.field313.field10376 = 0;
               this.field313.method6361(7);
               this.field313.method6360(0L);
               this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 1169980549);
            } catch (IOException var5) {
               try {
                  this.field1085.method179(-2123957197);
               } catch (Exception var4) {
                  ;
               }

               this.field1085 = null;
               this.field304 += 686188557;
               this.field314 = -1707252930;
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aae.r(" + ')');
      }
   }

   public boolean method236() {
      int var3;
      if (this.field1085 != null) {
         long var1 = class27.method3468((byte)1);
         var3 = (int)(var1 - 5958027995888260733L * this.field310);
         this.field310 = var1 * 2125194141775565525L;
         if (var3 > 200) {
            var3 = 200;
         }

         this.field309 += var3 * 506122611;
         if (987675579 * this.field309 > 30000) {
            try {
               this.field1085.method179(-2093256937);
            } catch (Exception var20) {
               ;
            }

            this.field1085 = null;
         }
      }

      if (this.field1085 == null) {
         return this.method235(1287680829) == 0 && this.method228(-114453322) == 0;
      } else {
         try {
            class448 var5;
            for(var5 = (class448)this.field305.method2706(1086397119); var5 != null; var5 = (class448)this.field305.method2707(1266046110)) {
               this.field313.field10376 = 0;
               this.field313.method6361(1);
               this.field313.method6360(-5533549728640346679L * var5.field209);
               this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 1284911720);
               this.field311.method2704(var5, (byte)-76);
            }

            for(var5 = (class448)this.field307.method2706(-1912843547); var5 != null; var5 = (class448)this.field307.method2707(654070036)) {
               this.field313.field10376 = 0;
               this.field313.method6361(0);
               this.field313.method6360(var5.field209 * -5533549728640346679L);
               this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 1283304286);
               this.field301.method2704(var5, (byte)-44);
            }

            for(int var22 = 0; var22 < 100; ++var22) {
               var3 = this.field1085.method176(2130771659);
               if (var3 < 0) {
                  throw new IOException();
               }

               if (var3 == 0) {
                  break;
               }

               this.field309 = 0;
               byte var4 = 0;
               if (this.field316 == null) {
                  var4 = 10;
               } else if (1488798733 * this.field316.field7102 == 0) {
                  var4 = 1;
               }

               int var6;
               int var7;
               int var8;
               if (var4 > 0) {
                  var6 = var4 - this.field306.field10376 * 385051775;
                  if (var6 > var3) {
                     var6 = var3;
                  }

                  this.field1085.method177(this.field306.field10375, 385051775 * this.field306.field10376, var6, (byte)56);
                  if (this.field312 != 0) {
                     for(var7 = 0; var7 < var6; ++var7) {
                        this.field306.field10375[this.field306.field10376 * 385051775 + var7] ^= this.field312;
                     }
                  }

                  this.field306.field10376 += 116413311 * var6;
                  if (this.field306.field10376 * 385051775 >= var4) {
                     if (this.field316 == null) {
                        this.field306.field10376 = 0;
                        var7 = this.field306.method6371();
                        var8 = this.field306.method6420((byte)7);
                        int var9 = this.field306.method6371();
                        int var10 = this.field306.method6420((byte)35);
                        int var11 = var9 & 127;
                        boolean var12 = (var9 & 128) != 0;
                        long var13 = ((long)var7 << 32) + (long)var8;
                        Object var15 = null;
                        class448 var16;
                        if (var12) {
                           for(var16 = (class448)this.field301.method2706(-456659045); var16 != null && -5533549728640346679L * var16.field209 != var13; var16 = (class448)this.field301.method2707(-434579116)) {
                              ;
                           }
                        } else {
                           for(var16 = (class448)this.field311.method2706(1426068327); var16 != null && var13 != var16.field209 * -5533549728640346679L; var16 = (class448)this.field311.method2707(932547542)) {
                              ;
                           }
                        }

                        if (var16 == null) {
                           throw new IOException();
                        }

                        int var17 = var11 == 0 ? 5 : 9;
                        this.field316 = var16;
                        this.field316.field7101 = new class907(this.field316.field7100 + var17 + var10);
                        this.field316.field7101.method6361(var11);
                        this.field316.field7101.method6364(var10, -19456274);
                        this.field316.field7102 = 154839986;
                        this.field306.field10376 = 0;
                     } else {
                        if (1488798733 * this.field316.field7102 != 0) {
                           throw new IOException();
                        }

                        if (-1 == this.field306.field10375[0]) {
                           this.field316.field7102 = 1733470917;
                           this.field306.field10376 = 0;
                        } else {
                           this.field316 = null;
                        }
                     }
                  }
               } else {
                  var6 = this.field316.field7101.field10375.length - this.field316.field7100;
                  var7 = 512 - 1488798733 * this.field316.field7102;
                  if (var7 > var6 - this.field316.field7101.field10376 * 385051775) {
                     var7 = var6 - 385051775 * this.field316.field7101.field10376;
                  }

                  if (var7 > var3) {
                     var7 = var3;
                  }

                  this.field1085.method177(this.field316.field7101.field10375, 385051775 * this.field316.field7101.field10376, var7, (byte)-75);
                  if (this.field312 != 0) {
                     for(var8 = 0; var8 < var7; ++var8) {
                        this.field316.field7101.field10375[this.field316.field7101.field10376 * 385051775 + var8] ^= this.field312;
                     }
                  }

                  this.field316.field7101.field10376 += 116413311 * var7;
                  this.field316.field7102 += var7 * 1733470917;
                  if (this.field316.field7101.field10376 * 385051775 == var6) {
                     this.field316.method156(494534453);
                     this.field316.field3464 = false;
                     this.field316 = null;
                  } else if (512 == this.field316.field7102 * 1488798733) {
                     this.field316.field7102 = 0;
                  }
               }
            }

            boolean var18 = true;
            return var18;
         } catch (IOException var21) {
            try {
               this.field1085.method179(-2123570388);
            } catch (Exception var19) {
               ;
            }

            this.field1085 = null;
            this.field304 += 686188557;
            this.field314 = -1707252930;
            return this.method235(1136063774) == 0 && this.method228(-2006233546) == 0;
         }
      }
   }

   public void method240(short var1) {
      try {
         if (this.field1085 != null) {
            this.field1085.method186((byte)53);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aae.n(" + ')');
      }
   }

   void method224() {
      try {
         this.field1085.method179(-2136011625);
      } catch (Exception var2) {
         ;
      }

      this.field1085 = null;
      this.field304 += 686188557;
      this.field314 = 1293857183;
      this.field312 = (byte)((int)(Math.random() * 255.0D + 1.0D));
   }

   public void method245() {
      if (this.field1085 != null) {
         this.field1085.method179(-2053952452);
      }

   }

   public void method239(Object var1, boolean var2) {
      if (this.field1085 != null) {
         try {
            this.field1085.method179(-2106353350);
         } catch (Exception var7) {
            ;
         }

         this.field1085 = null;
      }

      this.field1085 = (class348)var1;
      this.method865((byte)-1);
      this.method230(var2, -1530614013);
      this.field306.field10376 = 0;
      this.field316 = null;

      while(true) {
         class448 var3 = (class448)this.field311.method2705(-2134403806);
         if (var3 == null) {
            while(true) {
               var3 = (class448)this.field301.method2705(-2132241559);
               if (var3 == null) {
                  if (this.field312 != 0) {
                     try {
                        this.field313.field10376 = 0;
                        this.field313.method6361(4);
                        this.field313.method6361(this.field312);
                        this.field313.method6364(0, 989665208);
                        this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 912447224);
                     } catch (IOException var6) {
                        try {
                           this.field1085.method179(-2096143374);
                        } catch (Exception var5) {
                           ;
                        }

                        this.field1085 = null;
                        this.field304 += 686188557;
                        this.field314 = -1707252930;
                     }
                  }

                  this.field309 = 0;
                  this.field310 = class27.method3468((byte)1) * 2125194141775565525L;
                  return;
               }

               this.field307.method2704(var3, (byte)-88);
            }
         }

         this.field305.method2704(var3, (byte)-83);
      }
   }

   public void method229(Object var1, boolean var2) {
      if (this.field1085 != null) {
         try {
            this.field1085.method179(-2051664325);
         } catch (Exception var7) {
            ;
         }

         this.field1085 = null;
      }

      this.field1085 = (class348)var1;
      this.method865((byte)-1);
      this.method230(var2, -151384054);
      this.field306.field10376 = 0;
      this.field316 = null;

      while(true) {
         class448 var3 = (class448)this.field311.method2705(-2120333543);
         if (var3 == null) {
            while(true) {
               var3 = (class448)this.field301.method2705(-2119072430);
               if (var3 == null) {
                  if (this.field312 != 0) {
                     try {
                        this.field313.field10376 = 0;
                        this.field313.method6361(4);
                        this.field313.method6361(this.field312);
                        this.field313.method6364(0, -1509704923);
                        this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 1793980922);
                     } catch (IOException var6) {
                        try {
                           this.field1085.method179(-2133771313);
                        } catch (Exception var5) {
                           ;
                        }

                        this.field1085 = null;
                        this.field304 += 686188557;
                        this.field314 = -1707252930;
                     }
                  }

                  this.field309 = 0;
                  this.field310 = class27.method3468((byte)1) * 2125194141775565525L;
                  return;
               }

               this.field307.method2704(var3, (byte)2);
            }
         }

         this.field305.method2704(var3, (byte)-68);
      }
   }

   public void method241(boolean var1) {
      if (this.field1085 != null) {
         try {
            this.field313.field10376 = 0;
            this.field313.method6361(var1 ? 2 : 3);
            this.field313.method6360(0L);
            this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 677572641);
         } catch (IOException var5) {
            try {
               this.field1085.method179(-2112400508);
            } catch (Exception var4) {
               ;
            }

            this.field1085 = null;
            this.field304 += 686188557;
            this.field314 = -1707252930;
         }
      }

   }

   public void method233(byte var1) {
      try {
         if (this.field1085 != null) {
            this.field1085.method179(-2087316954);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aae.q(" + ')');
      }
   }

   public void method243() {
      if (this.field1085 != null) {
         this.field1085.method179(-2050259999);
      }

   }

   public void method244() {
      if (this.field1085 != null) {
         this.field1085.method179(-2069186230);
      }

   }

   public void method248() {
      if (this.field1085 != null) {
         this.field1085.method186((byte)90);
      }

   }

   public void method226() {
      if (this.field1085 != null) {
         this.field1085.method179(-2132893999);
      }

   }

   public void method247() {
      if (this.field1085 != null) {
         this.field1085.method186((byte)35);
      }

   }

   void method865(byte var1) {
      try {
         if (this.field1085 != null) {
            try {
               this.field313.field10376 = 0;
               this.field313.method6361(6);
               this.field313.method6411(3, (byte)103);
               this.field313.method6362(0, 16711935);
               this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 759871193);
            } catch (IOException var5) {
               try {
                  this.field1085.method179(-2111171220);
               } catch (Exception var4) {
                  ;
               }

               this.field1085 = null;
               this.field304 += 686188557;
               this.field314 = -1707252930;
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aae.ah(" + ')');
      }
   }

   public void method231(Object var1, boolean var2, int var3) {
      try {
         if (this.field1085 != null) {
            try {
               this.field1085.method179(-2074632995);
            } catch (Exception var8) {
               ;
            }

            this.field1085 = null;
         }

         this.field1085 = (class348)var1;
         this.method865((byte)-1);
         this.method230(var2, -1391987547);
         this.field306.field10376 = 0;
         this.field316 = null;

         while(true) {
            class448 var4 = (class448)this.field311.method2705(-2123417897);
            if (var4 == null) {
               while(true) {
                  var4 = (class448)this.field301.method2705(-2132898612);
                  if (var4 == null) {
                     if (this.field312 != 0) {
                        try {
                           this.field313.field10376 = 0;
                           this.field313.method6361(4);
                           this.field313.method6361(this.field312);
                           this.field313.method6364(0, -1954980636);
                           this.field1085.method187(this.field313.field10375, 0, this.field313.field10375.length, 1173685692);
                        } catch (IOException var7) {
                           try {
                              this.field1085.method179(-2053859803);
                           } catch (Exception var6) {
                              ;
                           }

                           this.field1085 = null;
                           this.field304 += 686188557;
                           this.field314 = -1707252930;
                        }
                     }

                     this.field309 = 0;
                     this.field310 = class27.method3468((byte)1) * 2125194141775565525L;
                     return;
                  }

                  this.field307.method2704(var4, (byte)-21);
               }
            }

            this.field305.method2704(var4, (byte)-106);
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "aae.u(" + ')');
      }
   }

   static final void method866(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class643.method6119(var3, var4, var0, -724499626);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aae.li(" + ')');
      }
   }
}
