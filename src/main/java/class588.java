import jaggl.OpenGL;

public class class588 extends class223 {
   int field184;
   class608 field185;
   class194 field186;

   public void method4081() {
      if (this.field185.field8618 != this.field186) {
         if (this.field186 == null) {
            throw new class845();
         }

         OpenGL.glUseProgram(this.field184);
         this.field185.field8618 = this.field186;
      }

   }

   void method4079() {
      for(int var1 = 0; var1 < this.method4054(-1467018991); ++var1) {
         ((class194)this.method4095(var1, 862535051)).method2755();
      }

      super.method4079();
   }

   public boolean method4057(class184 var1) {
      if (this.field186 == var1) {
         return true;
      } else if (!var1.method3237()) {
         return false;
      } else {
         boolean var2 = this.method4100();
         this.field186 = (class194)var1;
         this.field7369 = this.method4055(var1, -180449856) * -1776466383;
         if (this.field7369 * -33664303 == -1) {
            throw new IllegalArgumentException();
         } else {
            this.field184 = this.field186.field6979;
            if (var2) {
               OpenGL.glUseProgram(this.field184);
               this.field185.field8618 = this.field186;
            }

            return true;
         }
      }
   }

   class655 method4093(class151 var1) {
      return new class315(this, var1);
   }

   public void method4066() {
      if (this.field185.field8618 != this.field186) {
         if (this.field186 == null) {
            throw new class845();
         }

         OpenGL.glUseProgram(this.field184);
         this.field185.field8618 = this.field186;
      }

   }

   public void method4098() {
   }

   public boolean method4100() {
      return this.field185.field8618 == this.field186;
   }

   public void method4084() {
   }

   public void method4080() {
      if (this.field185.field8618 != this.field186) {
         if (this.field186 == null) {
            throw new class845();
         }

         OpenGL.glUseProgram(this.field184);
         this.field185.field8618 = this.field186;
      }

   }

   class184 method4088(class325 var1, class220 var2) {
      return new class194((class608)var1, this, var2);
   }

   public void method4099() {
      if (this.field185.field8618 != this.field186) {
         if (this.field186 == null) {
            throw new class845();
         }

         OpenGL.glUseProgram(this.field184);
         this.field185.field8618 = this.field186;
      }

   }

   public boolean method4075(class184 var1) {
      if (this.field186 == var1) {
         return true;
      } else if (!var1.method3237()) {
         return false;
      } else {
         boolean var2 = this.method4100();
         this.field186 = (class194)var1;
         this.field7369 = this.method4055(var1, -180449856) * -1776466383;
         if (this.field7369 * -33664303 == -1) {
            throw new IllegalArgumentException();
         } else {
            this.field184 = this.field186.field6979;
            if (var2) {
               OpenGL.glUseProgram(this.field184);
               this.field185.field8618 = this.field186;
            }

            return true;
         }
      }
   }

   public void method4083() {
   }

   public boolean method4101(class184 var1) {
      if (this.field186 == var1) {
         return true;
      } else if (!var1.method3237()) {
         return false;
      } else {
         boolean var2 = this.method4100();
         this.field186 = (class194)var1;
         this.field7369 = this.method4055(var1, -180449856) * -1776466383;
         if (this.field7369 * -33664303 == -1) {
            throw new IllegalArgumentException();
         } else {
            this.field184 = this.field186.field6979;
            if (var2) {
               OpenGL.glUseProgram(this.field184);
               this.field185.field8618 = this.field186;
            }

            return true;
         }
      }
   }

   void method151() {
      for(int var1 = 0; var1 < this.method4054(-1467018991); ++var1) {
         ((class194)this.method4095(var1, 1695242016)).method2755();
      }

      super.method4079();
   }

   public boolean method4097() {
      return this.field185.field8618 == this.field186;
   }

   public void method4082() {
   }

   class184 method4087(class325 var1, class220 var2) {
      return new class194((class608)var1, this, var2);
   }

   class655 method4090(class151 var1) {
      return new class315(this, var1);
   }

   class588(class608 var1, class222 var2) {
      super(var1, var2);
      this.field185 = var1;
   }

   class184 method4052(class325 var1, class220 var2) {
      return new class194((class608)var1, this, var2);
   }

   public boolean method4085() {
      return this.field185.field8618 == this.field186;
   }

   public boolean method4102(class184 var1) {
      if (this.field186 == var1) {
         return true;
      } else if (!var1.method3237()) {
         return false;
      } else {
         boolean var2 = this.method4100();
         this.field186 = (class194)var1;
         this.field7369 = this.method4055(var1, -180449856) * -1776466383;
         if (this.field7369 * -33664303 == -1) {
            throw new IllegalArgumentException();
         } else {
            this.field184 = this.field186.field6979;
            if (var2) {
               OpenGL.glUseProgram(this.field184);
               this.field185.field8618 = this.field186;
            }

            return true;
         }
      }
   }
}
