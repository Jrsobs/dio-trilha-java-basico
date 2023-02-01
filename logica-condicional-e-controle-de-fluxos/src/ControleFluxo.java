public class ControleFluxo {

    public static void main(String[] args) {

    int mes = 11;
    
    String mes1 = "Janeiro";
    String mes2 = "Fevereiro";
    String mes3 = "Março";
    String mes4 = "Abril";
    String mes5 = "Maio";
    String mes6 = "Junho";
    String mes7 = "Julho";
    String mes8 = "Agosto";
    String mes9 = "Setembro";
    String mes10 = "Outubro";
    String mes11 = "Novembro";
    String mes12 ="Dezembro";
    
    if (mes == 1) {
        System.out.println(mes1);
    } else { if (mes == 2) {
        
        System.out.println(mes2);

    } else if (mes == 3) {

        System.out.println(mes3);

    } else if (mes == 4) {

        System.out.println(mes4);

    } else if (mes == 5) {

        System.out.println(mes5);

    } else if (mes == 6) {
        
        System.out.println(mes6);
    
    } else if (mes == 7) {
        
        System.out.println(mes7);
    
    } else if (mes == 8) {
        
        System.out.println(mes8);
    
    } else if (mes == 9) {
        
        System.out.println(mes9);
    
    } else if (mes == 10) {
        
        System.out.println(mes10);
    
    } else if (mes == 11) {
        
        System.out.println(mes11);
    
    } else if (mes == 12) {
        
        System.out.println(mes12);
    
    } else {
        
        System.out.println("Mês Indefinido!");
    
    } 
    }

    if (mes == 6) {
        System.out.println("Férias");
    } else if (mes == 11) {
        System.out.println("Férias");
    } else if (mes == 12) {
        System.out.println("Férias");
    };
    
    String diaDaSemana = "quarta";

    switch (diaDaSemana) {
        case "domingo": System.out.println(1); 
            
            break;
            case "segunda": System.out.println(2); 
            
            break;
            case "terça": System.out.println(3); 
            
            break;
            case "quarta": System.out.println(4); 
            
            break;
        default: System.out.println("domingo, segunda, terça, quarta, quinta, sexta ou sábado");
            break;
    }

    int check = 5;

    switch (check) {
        case 1: System.out.println("Certo");
            
            break;
        case 2: System.out.println("Certo");
            
            break;
        case 3: System.out.println("Certo");
            
            break;
        case 4: System.out.println("Errado");
            
            break;
        case 5: System.out.println("Talvez");
            
            break;
        default:System.out.println("Valor indefinido");
            break;
    }

    }
    }
 