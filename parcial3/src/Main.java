import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        ArrayList<Integer> lista = new ArrayList<>();

        // Agregar elementos
        // array no se puede agregar
        lista.add(10);
        lista.add(20);
        lista.add(0, 30);  // [30, 10, 20]

        // Acceder a un elemento
        arr[1] = 10;
        lista.get(1);

        // Mostrar el tamaño
        System.out.println(arr.length);
        System.out.println(lista.size());

        System.out.println("Esta 50? " + lista.indexOf(50));
        System.out.println("Esta 10? " + lista.indexOf(10));

        // Eliminar elementos
        // array no puedo eliminar

        Integer entero = 30;

        lista.remove(entero);

        System.out.println(lista);

        // recorrido array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int item : arr) {
            System.out.println(item);
        }

        // recorrido: arraylist
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for(int item : lista) {
            System.out.println(item);
        }
        
    }
}


// 10 ->  1010
// >> 1 = 101...0 = 5
// << 1 = 10100 = 20

