import java.io.EOFException;
import java.io.IOException;

public final class class675 {
   class645 field7437 = null;
   static byte[] field7438 = new byte[520];
   class645 field7439 = null;
   int field7440;
   int field7441 = 65000;

   boolean method4162(int var1, byte[] var2, int var3, boolean var4, int var5) {
      try {
         class645 var6 = this.field7437;
         synchronized(this.field7437) {
            boolean var7;
            try {
               int var8;
               boolean var10000;
               if (var4) {
                  if (this.field7439.method6151(-1460152461) < (long)(var1 * 6 + 6)) {
                     var7 = false;
                     var10000 = var7;
                     return var10000;
                  }

                  this.field7439.method6156((long)(6 * var1));
                  this.field7439.method6155(field7438, 0, 6, -1945961108);
                  var8 = ((field7438[3] & 255) << 16) + ((field7438[4] & 255) << 8) + (field7438[5] & 255);
                  if (var8 <= 0 || (long)var8 > this.field7437.method6151(-1513278544) / 520L) {
                     var7 = false;
                     var10000 = var7;
                     return var10000;
                  }
               } else {
                  var8 = (int)((this.field7437.method6151(-1893675250) + 519L) / 520L);
                  if (var8 == 0) {
                     var8 = 1;
                  }
               }

               field7438[0] = (byte)(var3 >> 16);
               field7438[1] = (byte)(var3 >> 8);
               field7438[2] = (byte)var3;
               field7438[3] = (byte)(var8 >> 16);
               field7438[4] = (byte)(var8 >> 8);
               field7438[5] = (byte)var8;
               this.field7439.method6156((long)(var1 * 6));
               this.field7439.method6150(field7438, 0, 6, 1699083209);
               int var21 = 0;
               int var9 = 0;

               while(true) {
                  if (var21 < var3) {
                     label159: {
                        int var10 = 0;
                        int var12;
                        if (var4) {
                           this.field7437.method6156((long)(var8 * 520));
                           int var13;
                           int var14;
                           if (var1 > 65535) {
                              try {
                                 this.field7437.method6155(field7438, 0, 10, -1753859317);
                              } catch (EOFException var17) {
                                 break label159;
                              }

                              var12 = ((field7438[2] & 255) << 8) + ((field7438[0] & 255) << 24) + ((field7438[1] & 255) << 16) + (field7438[3] & 255);
                              var13 = (field7438[5] & 255) + ((field7438[4] & 255) << 8);
                              var10 = ((field7438[7] & 255) << 8) + ((field7438[6] & 255) << 16) + (field7438[8] & 255);
                              var14 = field7438[9] & 255;
                           } else {
                              try {
                                 this.field7437.method6155(field7438, 0, 8, -1374964621);
                              } catch (EOFException var16) {
                                 break label159;
                              }

                              var12 = (field7438[1] & 255) + ((field7438[0] & 255) << 8);
                              var13 = ((field7438[2] & 255) << 8) + (field7438[3] & 255);
                              var10 = (field7438[6] & 255) + ((field7438[5] & 255) << 8) + ((field7438[4] & 255) << 16);
                              var14 = field7438[7] & 255;
                           }

                           boolean var11;
                           if (var12 != var1 || var9 != var13 || var14 != this.field7440) {
                              var11 = false;
                              var10000 = var11;
                              return var10000;
                           }

                           if (var10 < 0 || (long)var10 > this.field7437.method6151(-1633796509) / 520L) {
                              var11 = false;
                              var10000 = var11;
                              return var10000;
                           }
                        }

                        if (var10 == 0) {
                           var4 = false;
                           var10 = (int)((this.field7437.method6151(-1603705353) + 519L) / 520L);
                           if (var10 == 0) {
                              ++var10;
                           }

                           if (var10 == var8) {
                              ++var10;
                           }
                        }

                        if (var3 - var21 <= 512) {
                           var10 = 0;
                        }

                        if (var1 > 65535) {
                           field7438[0] = (byte)(var1 >> 24);
                           field7438[1] = (byte)(var1 >> 16);
                           field7438[2] = (byte)(var1 >> 8);
                           field7438[3] = (byte)var1;
                           field7438[4] = (byte)(var9 >> 8);
                           field7438[5] = (byte)var9;
                           field7438[6] = (byte)(var10 >> 16);
                           field7438[7] = (byte)(var10 >> 8);
                           field7438[8] = (byte)var10;
                           field7438[9] = (byte)this.field7440;
                           this.field7437.method6156((long)(var8 * 520));
                           this.field7437.method6150(field7438, 0, 10, 1531111935);
                           var12 = var3 - var21;
                           if (var12 > 510) {
                              var12 = 510;
                           }

                           this.field7437.method6150(var2, var21, var12, 1227506688);
                           var21 += var12;
                        } else {
                           field7438[0] = (byte)(var1 >> 8);
                           field7438[1] = (byte)var1;
                           field7438[2] = (byte)(var9 >> 8);
                           field7438[3] = (byte)var9;
                           field7438[4] = (byte)(var10 >> 16);
                           field7438[5] = (byte)(var10 >> 8);
                           field7438[6] = (byte)var10;
                           field7438[7] = (byte)this.field7440;
                           this.field7437.method6156((long)(var8 * 520));
                           this.field7437.method6150(field7438, 0, 8, 1542282258);
                           var12 = var3 - var21;
                           if (var12 > 512) {
                              var12 = 512;
                           }

                           this.field7437.method6150(var2, var21, var12, 1907873622);
                           var21 += var12;
                        }

                        var8 = var10;
                        ++var9;
                        continue;
                     }
                  }

                  boolean var15 = true;
                  return var15;
               }
            } catch (IOException var18) {
               var7 = false;
               return var7;
            }
         }
      } catch (RuntimeException var20) {
         throw class158.method3445(var20, "ns.b(" + ')');
      }
   }

   public byte[] method4163(int var1, int var2) {
      try {
         class645 var3 = this.field7437;
         synchronized(this.field7437) {
            Object var10000;
            try {
               if (this.field7439.method6151(-1862419954) < (long)(6 * var1 + 6)) {
                  Object var21 = null;
                  var10000 = var21;
                  return (byte[])var10000;
               }

               this.field7439.method6156((long)(6 * var1));
               this.field7439.method6155(field7438, 0, 6, -1665251619);
               int var4 = ((field7438[0] & 255) << 16) + ((field7438[1] & 255) << 8) + (field7438[2] & 255);
               int var22 = (field7438[5] & 255) + ((field7438[4] & 255) << 8) + ((field7438[3] & 255) << 16);
               Object var6;
               if (var4 < 0 || var4 > this.field7441) {
                  var6 = null;
                  var10000 = var6;
                  return (byte[])var10000;
               }

               if (var22 > 0 && (long)var22 <= this.field7437.method6151(-1393462746) / 520L) {
                  byte[] var23 = new byte[var4];
                  int var7 = 0;
                  int var8 = 0;

                  while(var7 < var4) {
                     if (var22 == 0) {
                        Object var24 = null;
                        var10000 = var24;
                        return (byte[])var10000;
                     }

                     this.field7437.method6156((long)(520 * var22));
                     int var9 = var4 - var7;
                     byte var10;
                     int var11;
                     int var12;
                     int var13;
                     int var14;
                     if (var1 > 65535) {
                        if (var9 > 510) {
                           var9 = 510;
                        }

                        var10 = 10;
                        this.field7437.method6155(field7438, 0, var10 + var9, -2124921702);
                        var11 = ((field7438[2] & 255) << 8) + ((field7438[0] & 255) << 24) + ((field7438[1] & 255) << 16) + (field7438[3] & 255);
                        var12 = ((field7438[4] & 255) << 8) + (field7438[5] & 255);
                        var13 = ((field7438[6] & 255) << 16) + ((field7438[7] & 255) << 8) + (field7438[8] & 255);
                        var14 = field7438[9] & 255;
                     } else {
                        if (var9 > 512) {
                           var9 = 512;
                        }

                        var10 = 8;
                        this.field7437.method6155(field7438, 0, var10 + var9, -1642020087);
                        var11 = ((field7438[0] & 255) << 8) + (field7438[1] & 255);
                        var12 = (field7438[3] & 255) + ((field7438[2] & 255) << 8);
                        var13 = ((field7438[5] & 255) << 8) + ((field7438[4] & 255) << 16) + (field7438[6] & 255);
                        var14 = field7438[7] & 255;
                     }

                     Object var15;
                     if (var11 == var1 && var12 == var8 && this.field7440 == var14) {
                        if (var13 >= 0 && (long)var13 <= this.field7437.method6151(-1934019874) / 520L) {
                           int var25 = var9 + var10;

                           for(int var16 = var10; var16 < var25; ++var16) {
                              var23[var7++] = field7438[var16];
                           }

                           var22 = var13;
                           ++var8;
                           continue;
                        }

                        var15 = null;
                        var10000 = var15;
                        return (byte[])var10000;
                     }

                     var15 = null;
                     var10000 = var15;
                     return (byte[])var10000;
                  }

                  byte[] var17 = var23;
                  return var17;
               }

               var6 = null;
               var10000 = var6;
            } catch (IOException var18) {
               Object var5 = null;
               return (byte[])var5;
            }

            return (byte[])var10000;
         }
      } catch (RuntimeException var20) {
         throw class158.method3445(var20, "ns.a(" + ')');
      }
   }

   public boolean method4164(int var1, byte[] var2, int var3, int var4) {
      try {
         class645 var5 = this.field7437;
         synchronized(this.field7437) {
            if (var3 >= 0 && var3 <= this.field7441) {
               boolean var6 = this.method4162(var1, var2, var3, true, 1494361890);
               if (!var6) {
                  var6 = this.method4162(var1, var2, var3, false, 1552417971);
               }

               return var6;
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ns.f(" + ')');
      }
   }

   public String toString() {
      try {
         return "" + this.field7440;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ns.toString(" + ')');
      }
   }

   public class675(int var1, class645 var2, class645 var3, int var4) {
      this.field7440 = var1;
      this.field7437 = var2;
      this.field7439 = var3;
      this.field7441 = var4;
   }

   static void method4165(byte var0) {
      try {
         if (class134.field1398 == null) {
            class134.field1398 = new int[65536];
            class543.field3819 = new int[65536];
            double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);

            for(int var3 = 0; var3 < 65536; ++var3) {
               double var4 = (double)(var3 >> 10 & 63) / 64.0D + 0.0078125D;
               double var6 = 0.0625D + (double)(var3 >> 7 & 7) / 8.0D;
               double var8 = (double)(var3 & 127) / 128.0D;
               double var10 = var8;
               double var12 = var8;
               double var14 = var8;
               if (0.0D != var6) {
                  double var16;
                  if (var8 < 0.5D) {
                     var16 = var8 * (1.0D + var6);
                  } else {
                     var16 = var8 + var6 - var8 * var6;
                  }

                  double var18 = var8 * 2.0D - var16;
                  double var20 = var4 + 0.3333333333333333D;
                  if (var20 > 1.0D) {
                     --var20;
                  }

                  double var24 = var4 - 0.3333333333333333D;
                  if (var24 < 0.0D) {
                     ++var24;
                  }

                  if (6.0D * var20 < 1.0D) {
                     var10 = (var16 - var18) * 6.0D * var20 + var18;
                  } else if (var20 * 2.0D < 1.0D) {
                     var10 = var16;
                  } else if (var20 * 3.0D < 2.0D) {
                     var10 = var18 + 6.0D * (var16 - var18) * (0.6666666666666666D - var20);
                  } else {
                     var10 = var18;
                  }

                  if (6.0D * var4 < 1.0D) {
                     var12 = var18 + (var16 - var18) * 6.0D * var4;
                  } else if (var4 * 2.0D < 1.0D) {
                     var12 = var16;
                  } else if (3.0D * var4 < 2.0D) {
                     var12 = 6.0D * (0.6666666666666666D - var4) * (var16 - var18) + var18;
                  } else {
                     var12 = var18;
                  }

                  if (var24 * 6.0D < 1.0D) {
                     var14 = var24 * (var16 - var18) * 6.0D + var18;
                  } else if (2.0D * var24 < 1.0D) {
                     var14 = var16;
                  } else if (3.0D * var24 < 2.0D) {
                     var14 = 6.0D * (0.6666666666666666D - var24) * (var16 - var18) + var18;
                  } else {
                     var14 = var18;
                  }
               }

               var10 = Math.pow(var10, var1);
               var12 = Math.pow(var12, var1);
               var14 = Math.pow(var14, var1);
               int var26 = (int)(256.0D * var10);
               int var27 = (int)(256.0D * var12);
               int var28 = (int)(256.0D * var14);
               int var29 = var28 + (var27 << 8) + (var26 << 16);
               class134.field1398[var3] = var29 & 16777215;
               int var30 = var26 + (var27 << 8) + (var28 << 16);
               class543.field3819[var3] = var30;
            }
         }

      } catch (RuntimeException var32) {
         throw class158.method3445(var32, "ns.p(" + ')');
      }
   }

   static final void method4166(class744 var0, byte var1) {
      try {
         int var2 = var0.field3174[var0.field3176];
         String var3 = var0.field3169.method5780(class730.field2926.field7327 << 16 | var2, -1713280768);
         String var4;
         if (var3 == null) {
            var4 = "";
         } else {
            var4 = var3;
         }

         var0.field3157[++var0.field3158 - 1] = var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ns.bi(" + ')');
      }
   }

   static final void method4167(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)-43);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class296.method6509(var3, var4, var0, -2030984421);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ns.mi(" + ')');
      }
   }

   static final void method4168(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         class701 var3 = class637.method5936(class643.field10010, class730.field2692.field7765, (byte)13);
         var3.field3364.method6361(var2.length() + 1);
         var3.field3364.method6366(var2, 2108270585);
         class730.field2692.method4380(var3, (byte)-64);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ns.sn(" + ')');
      }
   }
}
