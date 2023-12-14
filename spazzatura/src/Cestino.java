import java.util.ArrayList;

public class Cestino {
   int size;
   ArrayList<Integer> spazzatura;

   public Cestino(int dimensione, int numero_giorni) {
      this.size = dimensione;
      this.spazzatura = new ArrayList<>();
   }

   public int calcolaCosto() {
      int costo = 0;
      for (int i = 0; i < spazzatura.size(); i++) {
         if (i != 0) {
            addToItem(spazzatura, i, spazzatura.get(i - 1));
         }
         if (spazzatura.get(i) > size) {
            addToItem(spazzatura, i, -(spazzatura.get(i - 1)));
            costo += (size - spazzatura.get(i - 1));
         }
      }
      if (spazzatura.get(spazzatura.size() - 1) > 0) {
         costo += size - spazzatura.get(spazzatura.size() - 1);
      }
      return costo;
   }

   public void add(int scoazze) {
      spazzatura.add(scoazze);
   }

   private static void addToItem(ArrayList<Integer> array, int index, int value) {
      array.set(index, array.get(index) + value);
   }
}
