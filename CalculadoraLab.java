import java.util.Scanner;
public class CalculadoraLab {
    public static void Sumar(double n1, double n2){
        double resultado = n1+n2;
        System.out.println("R: "+ resultado);
    };
    public static void Restar(double n1, double n2){
        double resultado = n1-n2;
        System.out.println("R: "+ resultado);
    };
    public static void Multiplicar(double n1, double n2){
        double resultado = n1*n2;
        System.out.println("R: "+ resultado);
    };
    public static void Dividir(double n1, double n2){
        if (n2 != 0){
            double resultado = n1/n2;
            System.out.println("R: "+ resultado);
        }else{
            System.out.println("No se puede dividir entre cero");
        }
    };
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1=0;
        double n2=0;
        int opc;
        do{
            System.out.println("Seleccione una opción:");
            System.out.println("1.SUMA\n2.RESTA\n3.MULTIPLICACION\n4.DIVISION\n5.SALIR");
            opc = scanner.nextInt();
            if (opc != 5){
                System.out.println("PRIMER DIGITO: ");
                n1 = scanner.nextInt();
                System.out.println("SEGUNDO DIGITO: ");
                n2 = scanner.nextInt();
            }
            switch (opc){
                case 1://Código de suma
                    Sumar(n1,n2);
                    break;
                case 2: //Código de resta
                    Restar(n1,n2);
                    break;
                case 3: //Código de multiplicación
                    Multiplicar(n1, n2);
                    break;
                case 4: //Código de división
                    Dividir(n1, n2);
                    break;
                case 5:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR-");
                    break;
            }
        } while(opc !=5);
    }

}