package classwork;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMapColor {
    private Map<String, Color> colorMap;
    
    public HashMapColor(){
        colorMap = new HashMap<>();
        colorMap.put("black", Color.black);
        colorMap.put("blue", Color.blue);
        colorMap.put("cyan", Color.cyan);
        colorMap.put("darkGray", Color.darkGray);
        colorMap.put("gray", Color.gray);
        colorMap.put("green", Color.green);
        colorMap.put("lightGray", Color.lightGray);
        colorMap.put("magenta", Color.magenta);
        colorMap.put("orange", Color.orange);
        colorMap.put("pink", Color.pink);
        colorMap.put("red", Color.red);
        colorMap.put("white", Color.white);
        colorMap.put("yellow", Color.yellow);
    }
    
    public Map<String, Color> getMap(){
        return colorMap;
    }
    
    public void displayColors(){
        Set<String> keys = colorMap.keySet(); // get keys

      // sort keys
      TreeSet<String> sortedKeys = new TreeSet<>(keys);

      System.out.printf("%nMap contains:%nKey\t\tValue%n");

      // generate output for each key in map
      for (String key : sortedKeys)
         System.out.printf("%-10s%10s%n", key, colorMap.get(key));
      
      System.out.printf(
         "%nsize: %d%nisEmpty: %b%n", colorMap.size(), colorMap.isEmpty());
    }
}
