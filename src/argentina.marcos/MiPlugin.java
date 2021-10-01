package argentina.marcos;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public class MiPlugin extends JavaPlugin {
    public static void main(String[] args) {
        Collection co1;
        Iterator i;
        co1 = new ArrayList();
        TreeSet arbol = new TreeSet();
        SortedSet sorted = new TreeSet();
        sorted.add("Buenas");
        sorted.add("Tardes");
        sorted.add("Señor");
        Object[] array = sorted.toArray();
        System.out.println("Segundo elemento del array " + array[1]);
        SortedSet<Integer> c = new TreeSet<Integer>();
        HashMap<Integer,String> ss = new HashMap<Integer,String>();
        ss.put(1,"HOla");
        ss.put(2,"HOlaa");
        ss.put(3,"HOlaaaa");
        System.out.println(ss);
        i = co1.iterator();
        while(i.hasNext()){
            System.out.println("Coleccion " + i.next());
        }
        List list = new LinkedList();
    }
    @Override
    public void onEnable(){
        System.out.println("Vamo lo pibe");
        this.getCommand("MiPlugin").setExecutor(new Clase1());

    }
    @Override
    public void onDisable(){

    }
}
