import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cooperativa coop = new Cooperativa();
        coop.init();

        int opcion=0;
        while (opcion != 5){
            System.out.println("\n=== MENÚ COOPERATIVA ===");
            System.out.println("1. Listar equipos");
            System.out.println("2. Buscar por ID");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Ordenar por consumo");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                     coop.listarEquipos();
                case 2:
                     {
                    System.out.print("Ingresa ID: ");
                    coop.buscarPorId(sc.nextLine());
                }
                case 3:
                    {
                    System.out.print("Ingresa nombre: ");
                    coop.buscarPorNombre(sc.nextLine());
                }
                case 4:
                    coop.ordenarPorConsumo();
                case 5:
                     System.out.println("Saliendo");
                break; 
                
            }
        } 
    }
}
