public class class96 {
    int field587;
    int field588 = 128;
    int field589 = 128;
    int field590;
    int field591;
    int field592;

    class96(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.field592 = var1;
        this.field588 = var2;
        this.field589 = var3;
        this.field590 = var4;
        this.field587 = var5;
        this.field591 = var6;
    }

    class96(int var1) {
        this.field592 = var1;
    }

    void method521(class96 var1) {
        this.field588 = var1.field588;
        this.field589 = var1.field589;
        this.field590 = var1.field590;
        this.field587 = var1.field587;
        this.field592 = var1.field592;
        this.field591 = var1.field591;
    }

    class96 method522() {
        return new class96(this.field592, this.field588, this.field589, this.field590, this.field587, this.field591);
    }
}
