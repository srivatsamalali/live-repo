
public class Materials {
	public static void main(String[] args) {
   //Make Door and set price
   Door door = new Door();
   door.price = 500;
   Window window = new Window();
   window.price = 600;

   Materials materials = new Materials();
   int price = materials.addMaterial(door,window);
   System.out.println(price);
   //Make Window and set price
   //use all 4 addMaterial
   }

   public int addMaterial(int doorPrice, int windowPrice){
      return 0;
   }
      public int addMaterial(Door door, Window window){
         return door.price + window.price;
   }
      public int addMaterial(int doorPrice,  Window window){
      return 0;
   }
      public int addMaterial(Door door, int windowPrice){
      return 0;
   }
}

class Door {
	int price;
}

class Window {
	int price;
}