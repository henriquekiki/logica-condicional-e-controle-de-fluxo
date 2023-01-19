import java.util.Locale;
import java.util.Scanner;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        ifmes();
        switchDiaSemana();
    }
    public static void ifmes(){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Digite o numero do mês: ");
        int mes = scanner.nextInt();
        
        if (mes == 1){
            System.out.println("Janeiro.");
            
        } else if (mes == 2){
            System.out.println("Fevereiro.");
        } else if (mes == 3){
            System.out.println("Março.");
        } else if (mes == 4){
            System.out.println("Abril.");
        } else if (mes == 5){
            System.out.println("Maio.");
        } else if (mes == 6){
            System.out.println("Junho.");
        } else if (mes == 7){
            System.out.println("Julho.");
        }else if (mes == 8){
            System.out.println("Agosto.");
        } else if (mes == 9){
            System.out.println("Setembro.");
        } else if (mes == 10){
            System.out.println("Outobro.");
        } else if (mes == 11){
            System.out.println("Novembro.");
        } else if (mes == 12){
            System.out.println("Dezembro");
        }
        switch (mes) {
            case 1:
            case 7:
            case 12:
                System.out.println("Mês de FÉRIAS!");
                break;
            default:
                System.out.println("Não é mês de férias.");
                break;
            
        }
    }
    
    public static void switchDiaSemana(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o numero do dia: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Segunda.");
                break;
            case 2:
                System.out.println("Terça.");
                break;
            case 3:
                System.out.println("Quarta.");
                break;
            case 4:
                System.out.println("Quinta.");
                break;
            case 5:
                System.out.println("Sexta.");
                break;
            case 6:
                System.out.println("Sábado.");
                break;
            case 7:
                System.out.println("Domingo.");
                break;
            default:
                System.out.println("Digite um numero de 1 a 7.");
        }
    }
    
}
    
    

