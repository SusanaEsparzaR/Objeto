package objeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author susan
 */
public class Objeto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lista;
        List list = new ArrayList();
        
        System.out.print("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.print("\nIngrese dato tipo string: ");
        String s = scan.nextLine ();
        conocerTipoObjeto(s);
        System.out.print("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.print("\nIngrese dato tipo número: ");
        double i = scan.nextDouble();
        conocerTipoObjeto(i);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.print("Para crear una lista, ingrese una palabra:");
        lista = scan.nextLine();
        lista = scan.nextLine();
        list.add(lista);
        System.out.print("Para crear una lista, ingrese una palabra:");
        lista = scan.nextLine();
        list.add(lista);
        System.out.print("Para crear una lista, ingrese una palabra:");
        lista = scan.nextLine();
        list.add(lista);
        System.out.print("Para crear una lista, ingrese una palabra:");
        lista = scan.nextLine();
        list.add(lista);
        conocerTipoObjeto(list);
        System.out.print("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("\nPara probar el otro tipo de dato se le mandará un char con el dato @");
        char otro = '@';
        conocerTipoObjeto(otro);
        System.out.print("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }
    
    public static void conocerTipoObjeto(Object obj){
        if(obj.getClass() == String.class){
            System.out.println(obj + " - Es una palabra");	
	 }else if(obj.getClass() == Integer.class || obj.getClass() == Long.class || obj.getClass() == Short.class || obj.getClass() == Double.class) {	
            System.out.println(obj + " - Es un número");	
	}else if(obj.getClass() == List.class || obj.getClass() == Arrays.class || obj.getClass() == ArrayList.class ){	
            System.out.println(obj + "- Es una lista");
	}else {	
            System.out.println(obj + " - Es de otro tipo de dato");
	}
    }
}