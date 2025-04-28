package at.fhj.msd;
 
import java.util.ArrayList;
import java.util.List;
 
public class Cocktail extends Drink {
 
    private List<Liquid> liquids;
 
    public Cocktail(String name) {
        super(name);
        this.liquids = new ArrayList<>();
    }
 
    public void addLiquid(Liquid liquid) {
        liquids.add(liquid);
    }
 
    public List<Liquid> getLiquids() {
        return liquids;
    }
 
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid l : liquids) {
            volume += l.getVolume();
        }
        return volume;
    }
 
    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0) return 0;
 
        double alcoholVolume = 0;
        for (Liquid l : liquids) {
            if (l.isAlcoholic()) {
                alcoholVolume += l.getVolume();
            }
        }
        return (alcoholVolume / totalVolume) * 100;
    }
 
    @Override
    public boolean isAlcoholic() {
      for (Liquid l : liquids) {
          if (l.isAlcoholic()) {
              return true;
          }
      }
      return false;
    }
  
 
}
