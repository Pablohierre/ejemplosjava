
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> clase = new ArrayList<>();
        clase.add("Luis");
        clase.add("Rober");
        clase.add("Ridouan");
        clase.add("Pablo");
        clase.add("Pablo");
        clase.add("Pablo");
        clase.add("Pablo");
        clase.add("Pablo");
        clase.add("Pablo");
        
        System.out.println(clase.size());
        
        if(clase.contains("Pablo")){
            System.out.println("Está Pablo");
            
        }
        
        for(String alumno : clase){
            System.out.println("Nombre :" +alumno);
        }
        
        Iterator<String> iteradorClase =  clase.iterator();
        while(iteradorClase.hasNext()){
            System.out.println(iteradorClase.next());   
        }
        
        System.out.println(clase);
        clase.remove("Rober");
        
        HashSet<String> clase2 = new HashSet<>();
        clase2.add("Pablo");
        clase2.add("Pablo");
        clase2.add("Pablo");
        clase2.add("Pablo");
        clase2.add("Pablo");
        clase2.add("Alejandro");
        
        clase2.remove("Pablo");
        System.out.println(clase2);
        
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj);
        
        HashMap<Integer, String> clase3 = new HashMap<Integer, String>();
        
        clase3.put(10, "David");
        clase3.put(11, "Roberto");
        clase3.put(7, "Diego");
        
        clase3.remove(11);
        
        System.out.println(clase3.containsValue("Roberto"));
        System.out.println(clase3.containsKey(7));
        System.out.println(clase3.get(7));
        
        System.out.println(clase3);
        
        for(Map.Entry m:clase3.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
        
        for(Integer i : clase3.keySet()){
            System.out.println(clase.get(i));
        }
        
        Iterator<Integer> ite=clase3.keySet().iterator();
        while(ite.hasNext()){
            System.out.println(clase3.get(ite.hasNext()));
        }
    }
    
}
