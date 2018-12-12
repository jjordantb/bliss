import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;

public abstract class class353 {
   class573 field1908;
   static int field1909 = 10;
   byte[] field1910;
   OggPage field1911;
   OggPacket field1912;
   OggSyncState field1913;
   String field1914;
   static int field1915 = 50;
   boolean field1916;
   boolean field1917;
   class709 field1918;
   class6 field1919;
   class36 field1920;
   boolean field1921;
   boolean field1922;

   public class573 method1362(int var1) {
      try {
         return this.field1908;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mu.r(" + ')');
      }
   }

   public void method1363(String var1, byte var2) {
      try {
         this.field1914 = var1;
         if (this.field1914 == null) {
            this.field1920 = null;
         } else {
            if (this.field1920 != null && !this.field1914.equals(this.field1920.method3331((byte)108))) {
               this.field1920 = null;
            }

            if (this.field1920 == null) {
               for(class571 var3 = (class571)this.field1919.method2946(1591555400); var3 != null; var3 = (class571)this.field1919.method2945((byte)-51)) {
                  if (var3 instanceof class36) {
                     class36 var4 = (class36)var3;
                     if (this.field1914.equals(var4.method3331((byte)59))) {
                        this.field1920 = var4;
                        break;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mu.s(" + ')');
      }
   }

   void method1364(int var1) throws IOException {
      try {
         while(this.field1918.field37.packetOut(this.field1912) != 1) {
            class571 var2 = this.method1373((byte)0);
            if (var2 == null) {
               if (this.field1917) {
                  this.method1368(444648186);
               }

               return;
            }

            if (this.field1920 == var2) {
               this.method1366((byte)76);
            }
         }

         this.field1918.method22(this.field1912, -1226862921);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mu.p(" + ')');
      }
   }

   abstract int method1365(byte[] var1) throws IOException;

   void method1366(byte var1) {
      try {
         for(class571 var2 = (class571)this.field1919.method2946(2015139315); var2 != null; var2 = (class571)this.field1919.method2945((byte)5)) {
            if (var2 instanceof class36) {
               class36 var3 = (class36)var2;

               while((var3.field38 * -1312498565 <= 8 || this.method1378((short)30482) > (double)var3.method3333(-136313953)) && var3.field37.packetOut(this.field1912) == 1) {
                  var3.method22(this.field1912, -1226862921);
               }
            }
         }

         this.method1363(this.field1914, (byte)111);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mu.i(" + ')');
      }
   }

   boolean method1367(int var1) {
      try {
         if (this.field1908 != null) {
            return !this.field1918.method2013(-1737998296) || this.method1378((short)7060) > this.field1918.method2011(-2077117247);
         } else {
            double var2 = (double)this.field1918.method2010(-1240396603);
            return 0.0D == var2 || (double)class27.method3468((byte)1) >= (double)this.field1918.method2012((byte)0) + 1000.0D / var2;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mu.k(" + ')');
      }
   }

   void method1368(int var1) {
      try {
         for(class571 var2 = (class571)this.field1919.method2946(2104844471); var2 != null; var2 = (class571)this.field1919.method2945((byte)-42)) {
            if (this.field1918 != var2) {
               while(var2.field37.packetOut() == 1) {
                  var2.method22(this.field1912, -1226862921);
               }
            }
         }

         if (this.field1918 != null) {
            for(int var4 = 0; var4 < 10 && this.method1367(-1610938594); ++var4) {
               if (this.field1918.field37.packetOut() != 1) {
                  this.method1370((byte)61);
                  break;
               }

               this.field1918.method22(this.field1912, -1226862921);
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mu.d(" + ')');
      }
   }

   public class709 method1369(byte var1) {
      try {
         return this.field1918;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mu.x(" + ')');
      }
   }

   public void method1370(byte var1) {
      try {
         if (!this.field1916) {
            for(class571 var2 = (class571)this.field1919.method2946(1658578802); var2 != null; var2 = (class571)this.field1919.method2945((byte)-74)) {
               var2.method24(1392127048);
               var2.field37.f();
            }

            this.field1912.f();
            this.field1911.f();
            this.field1913.f();
            this.field1916 = true;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mu.u(" + ')');
      }
   }

   public class36 method1371(byte var1) {
      try {
         return this.field1920;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mu.q(" + ')');
      }
   }

   public boolean method1372(int var1) {
      try {
         if (!this.field1916 && !this.field1917) {
            return false;
         } else {
            return this.field1908 == null || this.field1908.method94(-693943954) <= 0;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mu.n(" + ')');
      }
   }

   class571 method1373(byte var1) throws IOException {
      try {
         if (this.field1916) {
            throw new IllegalStateException();
         } else if (this.field1917) {
            return null;
         } else {
            int var2;
            while(this.field1913.pageOut(this.field1911) <= 0) {
               var2 = this.method1374(this.field1910, -2116572420);
               if (-1 == var2) {
                  this.field1917 = true;
                  return null;
               }

               if (var2 == 0) {
                  return null;
               }

               if (!this.field1913.write(this.field1910, var2)) {
                  throw new RuntimeException("");
               }
            }

            var2 = this.field1911.getSerialNumber();
            if (!this.field1911.isBOS()) {
               class571 var9 = (class571)this.field1919.method2942((long)var2);
               if (!var9.field37.pageIn(this.field1911)) {
                  throw new IllegalStateException();
               } else {
                  return var9;
               }
            } else {
               OggStreamState var3 = new OggStreamState(var2);
               if (!var3.pageIn(this.field1911)) {
                  throw new IllegalStateException();
               } else if (var3.packetPeek(this.field1912) != 1) {
                  throw new IllegalStateException();
               } else {
                  Object var4;
                  if (this.field1918 == null && this.field1912.isTheora()) {
                     this.field1918 = new class709(var3);
                     var4 = this.field1918;
                  } else if (this.field1908 == null && this.field1912.isVorbis()) {
                     this.field1908 = new class573(var3);
                     var4 = this.field1908;
                  } else {
                     byte[] var5 = this.field1912.getData();
                     StringBuilder var6 = new StringBuilder();

                     for(int var7 = 1; var7 < var5.length && Character.isLetterOrDigit((char)var5[var7]); ++var7) {
                        var6.append((char)var5[var7]);
                     }

                     String var10 = var6.toString();
                     if (var10.equals("kate")) {
                        var4 = new class36(var3);
                     } else {
                        var4 = new class627(var3);
                     }
                  }

                  this.field1919.method2947((class568)var4, (long)var2);
                  return (class571)var4;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "mu.f(" + ')');
      }
   }

   abstract int method1374(byte[] var1, int var2) throws IOException;

   public void method1375(boolean var1, int var2) {
      try {
         if (this.field1908 != null) {
            class977 var3 = this.field1908.method93(-840425248);
            if (var3 != null) {
               var3.method1810(var1, 1527417335);
            }
         }

         this.field1922 = !this.field1922;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mu.y(" + ')');
      }
   }

   abstract int method1376(byte[] var1) throws IOException;

   abstract int method1377(byte[] var1) throws IOException;

   public double method1378(short var1) {
      try {
         if (this.field1908 != null) {
            return this.field1908.method92(-762609524);
         } else {
            return this.field1918 != null ? this.field1918.method2011(-831725814) : 0.0D;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mu.z(" + ')');
      }
   }

   public void method1379(byte var1) throws IOException {
      try {
         if (!this.field1922) {
            for(; !this.field1916; this.field1921 = false) {
               class571 var2;
               if (!this.field1921) {
                  var2 = this.method1373((byte)0);
                  if (var2 == null) {
                     if (this.field1917) {
                        this.method1368(483146986);
                     }
                     break;
                  }

                  if (var2 == null) {
                     throw new IllegalStateException();
                  }

                  this.field1921 = true;
               } else {
                  var2 = (class571)this.field1919.method2942((long)this.field1911.getSerialNumber());
               }

               if (var2 == this.field1908) {
                  if (this.field1908.method94(-693943954) >= 50) {
                     break;
                  }

                  while(this.field1908.field37.packetOut(this.field1912) == 1) {
                     this.field1908.method22(this.field1912, -1226862921);
                     this.method1366((byte)126);
                     if (this.field1918 != null) {
                        double var3 = this.field1918.method2011(-820053880);

                        for(int var5 = 0; var5 < 10 && this.method1367(1506745043); ++var5) {
                           this.method1364(-508179442);
                           if (this.field1916) {
                              return;
                           }
                        }

                        if (var3 < this.field1918.method2011(-1579482552)) {
                           return;
                        }
                     }

                     if (this.field1908.method94(-693943954) >= 50) {
                        return;
                     }
                  }
               } else if (var2 instanceof class36) {
                  this.method1366((byte)72);
               } else if (var2 != this.field1918) {
                  for(; var2.field37.packetOut(this.field1912) == 1; var2.method22(this.field1912, -1226862921)) {
                     if (1 == var2.field38 * -1312498565 && var2 instanceof class36) {
                        this.method1363(this.field1914, (byte)43);
                     }
                  }
               } else if (this.field1908 == null && !this.field1922) {
                  for(int var6 = 0; var6 < 10 && this.method1367(1830575914); ++var6) {
                     this.method1364(-508179442);
                     if (this.field1916) {
                        return;
                     }
                  }

                  return;
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "mu.b(" + ')');
      }
   }

   class353(int var1) {
      if (!class933.method6286(-1260275656).method3930("jagtheora", -1126695495)) {
         throw new RuntimeException("");
      } else {
         this.field1910 = new byte[var1];
         this.field1913 = new OggSyncState();
         this.field1911 = new OggPage();
         this.field1912 = new OggPacket();
         this.field1919 = new class6(8);
      }
   }

   static final void method1380(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)10);
         class131 var4 = class382.field1410[var2 >> 16];
         class590.method1222(var3, var4, var0, 1808304001);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mu.la(" + ')');
      }
   }

   static final void method1381(int var0, int var1, int var2, int var3, int var4) {
      try {
         int var5 = 0;
         int var6 = var2;
         int var7 = -var2;
         int var8 = -1;
         int var9 = class972.method1776(var2 + var0, class964.field1416 * -1424479739, class964.field1413 * 1135094847, -1212608691);
         int var10 = class972.method1776(var0 - var2, class964.field1416 * -1424479739, 1135094847 * class964.field1413, -1212608691);
         class484.method4769(class964.field1412[var1], var10, var9, var3, 410046201);

         while(var6 > var5) {
            var8 += 2;
            var7 += var8;
            int var11;
            int var12;
            int var13;
            int var14;
            if (var7 > 0) {
               --var6;
               var7 -= var6 << 1;
               var11 = var1 - var6;
               var12 = var1 + var6;
               if (var12 >= 1155384281 * class964.field1414 && var11 <= class964.field1415 * -1062447355) {
                  var13 = class972.method1776(var5 + var0, class964.field1416 * -1424479739, 1135094847 * class964.field1413, -1212608691);
                  var14 = class972.method1776(var0 - var5, -1424479739 * class964.field1416, class964.field1413 * 1135094847, -1212608691);
                  if (var12 <= class964.field1415 * -1062447355) {
                     class484.method4769(class964.field1412[var12], var14, var13, var3, 483446032);
                  }

                  if (var11 >= 1155384281 * class964.field1414) {
                     class484.method4769(class964.field1412[var11], var14, var13, var3, 694694186);
                  }
               }
            }

            ++var5;
            var11 = var1 - var5;
            var12 = var5 + var1;
            if (var12 >= 1155384281 * class964.field1414 && var11 <= -1062447355 * class964.field1415) {
               var13 = class972.method1776(var6 + var0, -1424479739 * class964.field1416, class964.field1413 * 1135094847, -1212608691);
               var14 = class972.method1776(var0 - var6, class964.field1416 * -1424479739, 1135094847 * class964.field1413, -1212608691);
               if (var12 <= class964.field1415 * -1062447355) {
                  class484.method4769(class964.field1412[var12], var14, var13, var3, -698175360);
               }

               if (var11 >= class964.field1414 * 1155384281) {
                  class484.method4769(class964.field1412[var11], var14, var13, var3, -1368687138);
               }
            }
         }

      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "mu.n(" + ')');
      }
   }

   static final void method1382(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class91.method495(var3, var4, var0, 1489338850);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mu.dh(" + ')');
      }
   }

   public static void method1383(byte var0) {
      try {
         if (class601.field9194) {
            if (class601.field9195 * -64101949 < -1648308965 * class769.field3692) {
               class601.field9195 = class769.field3692 * 1429182921;
            }

            while(true) {
               while(class601.field9195 * -64101949 < -499146007 * class886.field10135) {
                  class471 var1 = class695.method3937(class601.field9195 * -64101949, (byte)-50);
                  if (var1 != null && -1 == var1.field8238 * 512449113) {
                     if (class601.field9202 == null) {
                        class601.field9202 = class730.field2696.method5472(var1.field8236, (byte)111);
                     }

                     int var2 = class601.field9202.field544 * -747638219;
                     if (var2 == -1) {
                        return;
                     }

                     var1.field8238 = var2 * -718385687;
                     class601.field9195 += 854136555;
                     class601.field9202 = null;
                  } else {
                     class601.field9195 += 854136555;
                  }
               }

               return;
            }
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mu.a(" + ')');
      }
   }
}
