import jaclib.memory.Stream;

public class class782 extends class907 {
   void method2468(float var1) {
      int var2 = Stream.floatToRawIntBits(var1);
      this.field10375[(this.field10376 += 116413311) * 385051775 - 1] = (byte)(var2 >> 24);
      this.field10375[(this.field10376 += 116413311) * 385051775 - 1] = (byte)(var2 >> 16);
      this.field10375[(this.field10376 += 116413311) * 385051775 - 1] = (byte)(var2 >> 8);
      this.field10375[(this.field10376 += 116413311) * 385051775 - 1] = (byte)var2;
   }

   class782(int var1) {
      super(var1);
   }

   void method2469(float var1) {
      int var2 = Stream.floatToRawIntBits(var1);
      this.field10375[(this.field10376 += 116413311) * 385051775 - 1] = (byte)var2;
      this.field10375[(this.field10376 += 116413311) * 385051775 - 1] = (byte)(var2 >> 8);
      this.field10375[(this.field10376 += 116413311) * 385051775 - 1] = (byte)(var2 >> 16);
      this.field10375[(this.field10376 += 116413311) * 385051775 - 1] = (byte)(var2 >> 24);
   }
}
