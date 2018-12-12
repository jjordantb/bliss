import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

public class class709 extends class571 {
   boolean field3428;
   TheoraInfo field3429 = new TheoraInfo();
   SetupInfo field3430 = new SetupInfo();
   static int field3431 = 2048;
   static int field3432 = 1024;
   DecoderContext field3433;
   double field3434;
   Frame field3435;
   int field3436;
   long field3437;
   boolean field3438;
   GranulePos field3439;
   int field3440;
   TheoraComment field3441 = new TheoraComment();
   boolean field3442;
   Object field3443;
   boolean field3444;

   class709(OggStreamState var1) {
      super(var1);
   }

   float method2010(int var1) {
      try {
         return this.field3438 && !this.field3429.a() ? (float)this.field3429.fpsNumerator / (float)this.field3429.fpsDenominator : 0.0F;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajq.n(" + ')');
      }
   }

   double method2011(int var1) {
      try {
         return this.field3434;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajq.s(" + ')');
      }
   }

   long method2012(byte var1) {
      try {
         return this.field3437;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajq.z(" + ')');
      }
   }

   boolean method2013(int var1) {
      try {
         return this.field3438;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajq.y(" + ')');
      }
   }

   void method24(int var1) {
      try {
         if (this.field3435 != null) {
            this.field3435.f();
         }

         if (this.field3433 != null) {
            this.field3433.f();
            this.field3433 = null;
         }

         if (this.field3439 != null) {
            this.field3439.f();
            this.field3439 = null;
         }

         this.field3429.f();
         this.field3441.f();
         this.field3430.f();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajq.b(" + ')');
      }
   }

   public Object method2014(class951 var1, int var2) {
      try {
         if (this.field3435 == null) {
            return null;
         } else if (!this.field3444 && this.field3443 != null) {
            return this.field3443;
         } else {
            this.field3443 = var1.method2019(this.field3435.pixels, 0, this.field3435.a, this.field3435.a, this.field3435.f, false, 1108085908);
            this.field3444 = false;
            return this.field3443;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajq.c(" + ')');
      }
   }

   void method23(OggPacket var1, int var2) {
      try {
         int var3;
         if (!this.field3438) {
            var3 = this.field3430.decodeHeader(this.field3429, this.field3441, var1);
            if (var3 == 0) {
               this.field3438 = true;
               if (this.field3429.frameWidth > 2048 || this.field3429.frameHeight > 1024) {
                  throw new IllegalStateException();
               }

               this.field3433 = new DecoderContext(this.field3429, this.field3430);
               this.field3439 = new GranulePos();
               this.field3435 = new Frame(this.field3429.frameWidth, this.field3429.frameHeight);
               this.field3440 = this.field3433.getMaxPostProcessingLevel();
               this.method2015(this.field3436, (byte)41);
            } else if (var3 < 0) {
               throw new IllegalStateException("" + var3);
            }
         } else {
            this.field3437 = class27.method3468((byte)1);
            var3 = this.field3433.decodePacketIn(var1, this.field3439);
            if (var3 < 0) {
               throw new IllegalStateException("" + var3);
            }

            this.field3433.granuleFrame(this.field3439);
            this.field3434 = this.field3433.granuleTime(this.field3439);
            if (this.field3442) {
               boolean var4 = var1.isKeyFrame() == 1;
               if (!var4) {
                  return;
               }

               this.field3442 = false;
            }

            if (!this.field3428 || var1.isKeyFrame() == 1) {
               if (this.field3433.decodeFrame(this.field3435) != 0) {
                  throw new IllegalStateException("" + var3);
               }

               this.field3444 = true;
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ajq.f(" + ')');
      }
   }

   void method2015(int var1, byte var2) {
      try {
         this.field3436 = var1;
         if (this.field3438) {
            if (this.field3436 > this.field3440) {
               this.field3436 = this.field3440;
            }

            if (this.field3436 < 0) {
               this.field3436 = 0;
            }

            this.field3433.setPostProcessingLevel(this.field3436);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajq.q(" + ')');
      }
   }

   public static boolean method2016(int var0, int var1) {
      try {
         if (class949.field3332 != var0 || class122.field2373 == null) {
            class59.method1617(224664390);
            class122.field2373 = class622.field9008;
            class949.field3332 = var0;
         }

         int var4;
         int var5;
         int var6;
         if (class122.field2373 == class622.field9008) {
            byte[] var2 = class966.field2522.method3264(var0, (byte)45);
            if (var2 == null) {
               return false;
            }

            InputStream var3 = new InputStream(var2);
            class844.method5100(var3, -2093041337);
            var4 = var3.method6371();

            for(var5 = 0; var5 < var4; ++var5) {
               class949.field3327.method897(new class459(var3), -51345743);
            }

            var5 = var3.method6382(1723054621);
            class949.field3333 = new class456[var5];

            for(var6 = 0; var6 < var5; ++var6) {
               class949.field3333[var6] = new class456(var3);
            }

            var6 = var3.method6382(1723054621);
            class949.field3322 = new class283[var6];

            int var7;
            for(var7 = 0; var7 < var6; ++var7) {
               class949.field3322[var7] = new class283(var3, var7);
            }

            var7 = var3.method6382(1723054621);
            class949.field3326 = new class22[var7];

            int var8;
            for(var8 = 0; var8 < var7; ++var8) {
               class949.field3326[var8] = new class22(var3);
            }

            var8 = var3.method6382(1723054621);
            class949.field3323 = new class278[var8];

            int var9;
            for(var9 = 0; var9 < var8; ++var9) {
               class949.field3323[var9] = new class278(var3);
            }

            var9 = var3.method6382(1723054621);
            class949.field3325 = new class304[var9];

            for(int var10 = 0; var10 < var9; ++var10) {
               class949.field3325[var10] = class638.method5931(var3, (byte)-73);
            }

            class122.field2373 = class622.field9009;
         }

         if (class122.field2373 == class622.field9009) {
            boolean var12 = true;
            class283[] var13 = class949.field3322;

            for(var4 = 0; var4 < var13.length; ++var4) {
               class283 var15 = var13[var4];
               if (!var15.method6640(1510757465)) {
                  var12 = false;
               }
            }

            class304[] var14 = class949.field3325;

            for(var5 = 0; var5 < var14.length; ++var5) {
               class304 var17 = var14[var5];
               if (!var17.method2387(856848171)) {
                  var12 = false;
               }
            }

            class22[] var16 = class949.field3326;

            for(var6 = 0; var6 < var16.length; ++var6) {
               class22 var18 = var16[var6];
               if (!var18.method3432((byte)81)) {
                  var12 = false;
               }
            }

            if (!var12) {
               return false;
            }

            class122.field2373 = class622.field9007;
         }

         return true;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "ajq.a(" + ')');
      }
   }
}
