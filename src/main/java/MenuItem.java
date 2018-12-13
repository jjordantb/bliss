public class MenuItem extends class345 {

   String name;
   int regionX;
   int regionY;
   int field1700;
   long field1701;
   int opcode;
   int field1703;
   boolean field1704;
   boolean field1705;
   long field1706;
   String action;
   boolean field1708;
   String field1709;

   MenuItem(String var1, String var2, int var3, int op, int var5, long var6, int var8, int var9, boolean var10, boolean var11, long var12, boolean var14) {
      this.name = var2;
      this.action = var1;
      this.regionY = var3;
      this.opcode = op;
      this.field1700 = var5;
      this.field1701 = var6;
      this.regionX = var8;
      this.field1703 = var9;
      this.field1704 = var10;
      this.field1705 = var11;
      this.field1706 = var12;
      this.field1708 = var14;
   }

    @Override
    public String toString() {
        return "MenuItem{\"" +
                this.name + "\", \"" +
                this.action + "\", " +
                this.regionY + ", " +
                this.opcode + ", " +
                this.field1700 + ", " +
                this.field1701 + ", " +
                this.regionX + ", " +
                this.field1703 + ", " +
                this.field1704 + ", " +
                this.field1705 + ", " +
                this.field1706 + ", " +
                this.field1708 +
                "}";
    }
}
