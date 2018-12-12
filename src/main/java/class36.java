import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class class36 extends class571 {
   String field5331;
   static int field5332 = 0;
   int field5333;
   static int field5334 = 128;
   String field5335;
   String field5336;
   float field5337;
   float field5338;
   int field5339;

   void method23(OggPacket var1, int var2) {
      try {
         if (this.field38 * -1312498565 <= 0 || "SUB".equals(this.field5336)) {
            class907 var3 = new class907(var1.getData());
            int var4 = var3.method6371();
            if (-1312498565 * this.field38 <= 8) {
               if ((var4 | 128) == 0) {
                  throw new IllegalStateException();
               }

               if (-1312498565 * this.field38 == 0) {
                  var3.field10376 += -1617461143;
                  this.field5333 = var3.method6377(1431459183) * 33758645;
                  this.field5339 = var3.method6377(-150244186) * 1857578037;
                  if (this.field5333 * -180836195 == 0 || this.field5339 * 2110967325 == 0) {
                     throw new IllegalStateException();
                  }

                  class907 var5 = new class907(16);
                  var3.method6381(var5.field10375, 0, 16, -953523806);
                  this.field5335 = var5.method6379(-1838621769);
                  var5.field10376 = 0;
                  var3.method6381(var5.field10375, 0, 16, -953523806);
                  this.field5336 = var5.method6379(1476138543);
               }
            } else {
               if (var4 == 0) {
                  long var6 = var3.method6417(1976358727);
                  long var8 = var3.method6417(1286401972);
                  long var10 = var3.method6417(1829097486);
                  if (var6 < 0L || var8 < 0L || var10 < 0L || var10 > var6) {
                     throw new IllegalStateException();
                  }

                  this.field5337 = (float)(var6 * (long)(2110967325 * this.field5339)) / (float)(-180836195 * this.field5333);
                  this.field5338 = (float)((var6 + var8) * (long)(this.field5339 * 2110967325)) / (float)(-180836195 * this.field5333);
                  int var12 = var3.method6377(-941704037);
                  if (var12 < 0 || var12 > var3.field10375.length - 385051775 * var3.field10376) {
                     throw new IllegalStateException();
                  }

                  this.field5331 = class140.method1051(var3.field10375, var3.field10376 * 385051775, var12, -730069426);
               }

               if ((var4 | 128) != 0) {
                  return;
               }
            }
         }

      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "ajv.f(" + ')');
      }
   }

   String method3331(byte var1) {
      try {
         return this.field5335;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajv.q(" + ')');
      }
   }

   public float method3332(byte var1) {
      try {
         return this.field5337;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajv.n(" + ')');
      }
   }

   public float method3333(int var1) {
      try {
         return this.field5338;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajv.s(" + ')');
      }
   }

   public String method3334(int var1) {
      try {
         return this.field5331;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajv.z(" + ')');
      }
   }

   void method28() {
   }

   void method26(OggPacket var1) {
      if (this.field38 * -1312498565 <= 0 || "SUB".equals(this.field5336)) {
         class907 var2 = new class907(var1.getData());
         int var3 = var2.method6371();
         if (-1312498565 * this.field38 <= 8) {
            if ((var3 | 128) == 0) {
               throw new IllegalStateException();
            }

            if (-1312498565 * this.field38 == 0) {
               var2.field10376 += -1617461143;
               this.field5333 = var2.method6377(-1960945614) * 33758645;
               this.field5339 = var2.method6377(1105841706) * 1857578037;
               if (this.field5333 * -180836195 == 0 || this.field5339 * 2110967325 == 0) {
                  throw new IllegalStateException();
               }

               class907 var4 = new class907(16);
               var2.method6381(var4.field10375, 0, 16, -953523806);
               this.field5335 = var4.method6379(-2059271269);
               var4.field10376 = 0;
               var2.method6381(var4.field10375, 0, 16, -953523806);
               this.field5336 = var4.method6379(254290400);
            }
         } else {
            if (var3 == 0) {
               long var5 = var2.method6417(1922871636);
               long var7 = var2.method6417(1312894396);
               long var9 = var2.method6417(718042704);
               if (var5 < 0L || var7 < 0L || var9 < 0L || var9 > var5) {
                  throw new IllegalStateException();
               }

               this.field5337 = (float)(var5 * (long)(2110967325 * this.field5339)) / (float)(-180836195 * this.field5333);
               this.field5338 = (float)((var5 + var7) * (long)(this.field5339 * 2110967325)) / (float)(-180836195 * this.field5333);
               int var11 = var2.method6377(1321488370);
               if (var11 < 0 || var11 > var2.field10375.length - 385051775 * var2.field10376) {
                  throw new IllegalStateException();
               }

               this.field5331 = class140.method1051(var2.field10375, var2.field10376 * 385051775, var11, -932621904);
            }

            if ((var3 | 128) != 0) {
               return;
            }
         }
      }

   }

   void method27(OggPacket var1) {
      if (this.field38 * -1312498565 <= 0 || "SUB".equals(this.field5336)) {
         class907 var2 = new class907(var1.getData());
         int var3 = var2.method6371();
         if (-1312498565 * this.field38 <= 8) {
            if ((var3 | 128) == 0) {
               throw new IllegalStateException();
            }

            if (-1312498565 * this.field38 == 0) {
               var2.field10376 += -1617461143;
               this.field5333 = var2.method6377(-1885777054) * 33758645;
               this.field5339 = var2.method6377(-1908777764) * 1857578037;
               if (this.field5333 * -180836195 == 0 || this.field5339 * 2110967325 == 0) {
                  throw new IllegalStateException();
               }

               class907 var4 = new class907(16);
               var2.method6381(var4.field10375, 0, 16, -953523806);
               this.field5335 = var4.method6379(933165446);
               var4.field10376 = 0;
               var2.method6381(var4.field10375, 0, 16, -953523806);
               this.field5336 = var4.method6379(-1680071522);
            }
         } else {
            if (var3 == 0) {
               long var5 = var2.method6417(1453589293);
               long var7 = var2.method6417(216828969);
               long var9 = var2.method6417(958666578);
               if (var5 < 0L || var7 < 0L || var9 < 0L || var9 > var5) {
                  throw new IllegalStateException();
               }

               this.field5337 = (float)(var5 * (long)(2110967325 * this.field5339)) / (float)(-180836195 * this.field5333);
               this.field5338 = (float)((var5 + var7) * (long)(this.field5339 * 2110967325)) / (float)(-180836195 * this.field5333);
               int var11 = var2.method6377(-1427296069);
               if (var11 < 0 || var11 > var2.field10375.length - 385051775 * var2.field10376) {
                  throw new IllegalStateException();
               }

               this.field5331 = class140.method1051(var2.field10375, var2.field10376 * 385051775, var11, -854138275);
            }

            if ((var3 | 128) != 0) {
               return;
            }
         }
      }

   }

   void method21() {
   }

   void method25(OggPacket var1) {
      if (this.field38 * -1312498565 <= 0 || "SUB".equals(this.field5336)) {
         class907 var2 = new class907(var1.getData());
         int var3 = var2.method6371();
         if (-1312498565 * this.field38 <= 8) {
            if ((var3 | 128) == 0) {
               throw new IllegalStateException();
            }

            if (-1312498565 * this.field38 == 0) {
               var2.field10376 += -1617461143;
               this.field5333 = var2.method6377(-1909623846) * 33758645;
               this.field5339 = var2.method6377(1996267542) * 1857578037;
               if (this.field5333 * -180836195 == 0 || this.field5339 * 2110967325 == 0) {
                  throw new IllegalStateException();
               }

               class907 var4 = new class907(16);
               var2.method6381(var4.field10375, 0, 16, -953523806);
               this.field5335 = var4.method6379(-1904784161);
               var4.field10376 = 0;
               var2.method6381(var4.field10375, 0, 16, -953523806);
               this.field5336 = var4.method6379(333136246);
            }
         } else {
            if (var3 == 0) {
               long var5 = var2.method6417(1871449900);
               long var7 = var2.method6417(2001133775);
               long var9 = var2.method6417(1245800446);
               if (var5 < 0L || var7 < 0L || var9 < 0L || var9 > var5) {
                  throw new IllegalStateException();
               }

               this.field5337 = (float)(var5 * (long)(2110967325 * this.field5339)) / (float)(-180836195 * this.field5333);
               this.field5338 = (float)((var5 + var7) * (long)(this.field5339 * 2110967325)) / (float)(-180836195 * this.field5333);
               int var11 = var2.method6377(1651625621);
               if (var11 < 0 || var11 > var2.field10375.length - 385051775 * var2.field10376) {
                  throw new IllegalStateException();
               }

               this.field5331 = class140.method1051(var2.field10375, var2.field10376 * 385051775, var11, 1348372434);
            }

            if ((var3 | 128) != 0) {
               return;
            }
         }
      }

   }

   void method24(int var1) {
   }

   class36(OggStreamState var1) {
      super(var1);
   }
}
