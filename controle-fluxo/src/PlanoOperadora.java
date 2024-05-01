public class PlanoOperadora {
    public static void main(String[] args) {
        
        String planoOperadora = "P";


        switch (planoOperadora) {
            case "P": {
                System.out.println("O Plano é M, ligação ilimitada mais 05GB de Internet");
                break;
            }
            case "M": {
                System.out.println("O Plano é M, ligação ilimitada mais 10GB de Internet");
                break;
            }
            case "G": {
                System.out.println("O Plano é G, ligação ilimitada mais 20GB de Internet");
            }
            default:
                System.out.println("Plano não localizado!");
                break;
        }

    }
}
