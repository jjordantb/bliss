import java.util.HashMap;
import java.util.Map;

public final class class962 {
   class226 field3621;
   int field3622;
   class226 field3623;
   long field3624;
   class474 field3625;
   Map field3626;
   public static class478 field3627;

   public Object method2120(Object var1, Object var2, byte var3) {
      try {
         synchronized(this) {
            if (this.field3624 != -1L) {
               this.method2124(-1215407622);
            }

            class510 var5 = (class510)this.field3626.get(var1);
            if (var5 != null) {
               Object var10 = var5.field4162;
               var5.field4162 = var2;
               this.method2123(var5, false, (byte)115);
               return var10;
            } else {
               class510 var6;
               if (this.method2121((byte)3) && this.field3626.size() == this.field3622) {
                  var6 = (class510)this.field3623.remove();
                  this.field3626.remove(var6.field4164);
                  this.field3621.remove(var6);
               }

               var6 = new class510(var2, var1);
               this.field3626.put(var1, var6);
               this.method2123(var6, true, (byte)18);
               Object var7 = null;
               return var7;
            }
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "kp.b(" + ')');
      }
   }

   class962(long var1, int var3, class474 var4) {
      this.field3624 = var1;
      this.field3622 = var3;
      this.field3625 = var4;
      if (this.field3622 == -1) {
         this.field3626 = new HashMap(64);
         this.field3621 = new class226(64);
         this.field3623 = null;
      } else {
         if (this.field3625 == null) {
            throw new IllegalArgumentException("");
         }

         this.field3626 = new HashMap(this.field3622);
         this.field3621 = new class226(this.field3622);
         this.field3623 = new class226(this.field3622);
      }

   }

   boolean method2121(byte var1) {
      try {
         return this.field3622 != -1;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kp.a(" + ')');
      }
   }

   public Object method2122(Object var1, byte var2) {
      try {
         synchronized(this) {
            if (this.field3624 != -1L) {
               this.method2124(-379360900);
            }

            class510 var4 = (class510)this.field3626.get(var1);
            Object var5;
            if (var4 == null) {
               var5 = null;
               return var5;
            } else {
               this.method2123(var4, false, (byte)110);
               var5 = var4.field4162;
               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "kp.f(" + ')');
      }
   }

   public class962(int var1, class474 var2) {
      this(-1L, var1, var2);
   }

   void method2123(class510 var1, boolean var2, byte var3) {
      try {
         if (!var2) {
            this.field3621.remove(var1);
            if (this.method2121((byte)3) && !this.field3623.remove(var1)) {
               throw new IllegalStateException("");
            }
         }

         var1.field4163 = System.currentTimeMillis();
         if (this.method2121((byte)3)) {
            switch(this.field3625.field8269) {
            case 0:
               var1.field4161 = var1.field4163;
               break;
            case 1:
               ++var1.field4161;
            }

            this.field3623.add(var1);
         }

         this.field3621.add(var1);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "kp.i(" + ')');
      }
   }

   void method2124(int var1) {
      try {
         if (this.field3624 == -1L) {
            throw new IllegalStateException("");
         } else {
            long var2 = System.currentTimeMillis() - this.field3624;

            while(!this.field3621.isEmpty()) {
               class510 var4 = (class510)this.field3621.peek();
               if (var4.field4163 >= var2) {
                  break;
               }

               this.field3626.remove(var4.field4164);
               this.field3621.remove(var4);
               if (this.method2121((byte)3)) {
                  this.field3623.remove(var4);
               }
            }

         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "kp.k(" + ')');
      }
   }

   public void method2125(int var1) {
      try {
         synchronized(this) {
            this.field3626.clear();
            this.field3621.clear();
            if (this.method2121((byte)3)) {
               this.field3623.clear();
            }

         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "kp.d(" + ')');
      }
   }

   public Object method2126(Object var1, int var2) {
      try {
         synchronized(this) {
            if (-1L != this.field3624) {
               this.method2124(-583861644);
            }

            class510 var4 = (class510)this.field3626.remove(var1);
            Object var5;
            if (var4 != null) {
               this.field3621.remove(var4);
               if (this.method2121((byte)3)) {
                  this.field3623.remove(var4);
               }

               var5 = var4.field4162;
               return var5;
            } else {
               var5 = null;
               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "kp.p(" + ')');
      }
   }

   static final void method2127(class744 var0, byte var1) {
      try {
         --var0.field3156;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kp.ab(" + ')');
      }
   }

   static final void method2128(class744 var0, byte var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         if (var2.startsWith(class341.method255(0, -278777595)) || var2.startsWith(class341.method255(1, -278777595))) {
            var2 = var2.substring(7);
         }

         var0.field3161[++var0.field3156 - 1] = class79.method1157(var2, -1316013258);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kp.wi(" + ')');
      }
   }

   static final void method2129(class744 var0, byte var1) {
      try {
         class471 var2 = class458.method3832((byte)29);
         var0.field3161[++var0.field3156 - 1] = var2 == null ? 0 : var2.field3476 * -743493231 * -877023375;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kp.alt(" + ')');
      }
   }

   static final void method2130(class744 var0, byte var1) {
      try {
         int var2 = var0.field3174[var0.field3176];
         var0.field3161[++var0.field3156 - 1] = ((Player)var0.field3159).field3402.method6446(var2, -1034906382);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kp.ae(" + ')');
      }
   }

   static void method2131(int var0, int var1, int var2, int var3, int var4) {
      try {
         class682 var5 = class370.method881(10, (long)var0);
         var5.method4340((byte)101);
         var5.field7687 = var1;
         var5.field7685 = var2;
         var5.field7686 = var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "kp.ab(" + ')');
      }
   }
}
