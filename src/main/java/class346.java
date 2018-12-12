public class class346 extends class345 {
   public String field171;
   public int field172;
   public class20[] field173;
   public int[] field174;
   public long[] field175;
   public class112 field176;
   public int field177;
   public int field178;
   public int field179;
   public int field180;
   public Object[] field181;
   public int field182;
   public class6[] field183;

   int method148(class907 var1, int var2) {
      try {
         var1.field10376 = 116413311 * (var1.field10375.length - 2);
         int var3 = var1.method6374();
         int var4 = var1.field10375.length - 2 - var3 - 16;
         var1.field10376 = var4 * 116413311;
         int var5 = var1.method6420((byte)-30);
         this.field177 = var1.method6374() * 1835188737;
         this.field178 = var1.method6374() * 906205405;
         this.field179 = var1.method6374() * 229244435;
         this.field180 = var1.method6374() * 1421877143;
         this.field172 = var1.method6374() * -479946185;
         this.field182 = var1.method6374() * 896501837;
         int var6 = var1.method6371();
         if (var6 > 0) {
            this.field183 = new class6[var6];

            for(int var7 = 0; var7 < var6; ++var7) {
               int var8 = var1.method6374();
               class6 var9 = new class6(class18.method3687(var8, (byte)16));
               this.field183[var7] = var9;

               while(var8-- > 0) {
                  int var10 = var1.method6420((byte)61);
                  int var11 = var1.method6420((byte)-1);
                  var9.method2947(new class722(var11), (long)var10);
               }
            }
         }

         var1.field10376 = 0;
         this.field171 = var1.method6429(-517364695);
         this.field173 = new class20[var5];
         return var4;
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "aiz.f(" + ')');
      }
   }

   public class346(class907 var1) {
      int var2 = this.method148(var1, 1653647818);
      int var3 = 0;

      for(class20[] var4 = class202.method4299((byte)-29); 385051775 * var1.field10376 < var2; ++var3) {
         class20 var5 = this.method149(var1, var4, (byte)29);
         this.method150(var1, var3, var5, (byte)-25);
      }

   }

   class20 method149(class907 var1, class20[] var2, byte var3) {
      try {
         int var4 = var1.method6374();
         if (var4 >= 0 && var4 < var2.length) {
            class20 var5 = var2[var4];
            return var5;
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aiz.a(" + ')');
      }
   }

   void method150(class907 var1, int var2, class20 var3, byte var4) {
      try {
         int var5 = this.field173.length;
         if (var3 == class20.field6163) {
            if (this.field181 == null) {
               this.field181 = new String[var5];
            }

            String var6 = var1.method6379(1264292705);
            if (var6.toLowerCase().contains("runescape")) {
               var6 = var6.replace("runescape", "BlissScape");
               var6 = var6.replace("RuneScape", "BlissScape");
               var6 = var6.replace("Runescape", "BlissScape");
            }

            if (var6.toLowerCase().contains("your account has been disabled")) {
               var6 = var6.replace("Your account has been disabled.", "Your account has been temporarily banned.");
            } else if (var6.toLowerCase().contains("check your message centre")) {
               var6 = "Check the forums for details.";
            } else if (var6.contains("Message Centre")) {
               var6 = var6.replace("Message Centre", "Go to Forums");
            } else if (var6.contains("You are standing in a members-only")) {
               var6 = "The server is currently under maintanance. Please wait a few minutes and try again.";
            } else if (var6.toLowerCase().contains("login:")) {
               var6 = "Login or Email:";
            } else if (var6.toLowerCase().contains("could not complete login. please try using a different world.")) {
               var6 = "Invalid email. Your account has a verified email address and must use that to log in.";
            } else if (var6.toLowerCase().contains("invalid login or password")) {
               var6 = "Invalid username or password";
            } else if (var6.toLowerCase().contains("for accounts created after the 24th of")) {
               var6 = "If you have a verified email address, use that to log in. If not, use your username.";
            } else if (var6.toLowerCase().contains("forgotten your password?")) {
               var6 = "Forgot your Password?";
            } else if (var6.toLowerCase().contains("unexpected server response. please try using a different world.")) {
               var6 = "You need to verify your identity before logging in from a new ip address. Log in using the code that was just sent to your email address instead of your email to log in.";
            } else if (var6.toLowerCase().contains("the instance you tried to join no longer exists")) {
               var6 = "Your client is out of date. Please relaunch through the BlissScape Launcher to update.";
            } else if (var6.toLowerCase().contains("you cannot earn construction xp without owning a house")) {
               var6 = "You have selected Construction, though the interface cannot highlight the icon.";
            }

            this.field181[var2] = var6.intern();
         } else if (class20.field5465 == var3) {
            if (this.field175 == null) {
               this.field175 = new long[var5];
            }

            this.field175[var2] = var1.method6375((short)21817);
         } else {
            if (this.field174 == null) {
               this.field174 = new int[var5];
            }

            if (var3.field6426) {
               this.field174[var2] = var1.method6420((byte)-2);
            } else {
               this.field174[var2] = var1.method6371();
            }
         }

         this.field173[var2] = var3;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aiz.b(" + ')');
      }
   }
}
