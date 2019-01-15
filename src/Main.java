import java.util.Scanner;

public class Main {

    public static String menuOff(){
        String menu = "";
        menu += "Presione e para encender el radio\n";
        return menu;
    }
    public static String menuOn(){
        String menu = "";
        menu += "Presione e para apagar el radio\n";
        menu += "Presione s para cambiar de frecuencia\n";
        menu += "Presione d para cambiar de estacion\n";
        menu += "Presione c para guardar una estacion en un boton\n";
        menu += "Ingrese el numero del boton para cambiar su estacion favorita\n";
        return menu;
    }

    public static void main (String args[]){
        Radio radio = new RadioImp();
        while (4 < 5) {
            Scanner input = new Scanner(System.in);
            if (!radio.getState()){
                System.out.println(radio);
                System.out.println(menuOff());
                System.out.println("Ingrese la opcion que desea realizar\n");
                String option = input.nextLine();
                if (option.equals("e")){
                    radio.toggle();
                }
            }else {
                System.out.println(radio);
                System.out.println(menuOn());
                System.out.println("Ingrese la opcion que su corazon anhele\n");
                String option = input.nextLine();
                switch (option) {
                    case "e": radio.toggle();
                    break;
                    case "s": radio.changeFrecuency();
                    break;
                    case "d":
                        boolean subirEstacion;
                        System.out.println("Desea subir de estacion? (si o no)\n");
                        String answer = input.nextLine();
                        if (answer.equals("si")){
                            subirEstacion = true;
                            radio.changeStation(subirEstacion);
                        } else if (answer.equals("no")){
                            subirEstacion = false;
                            radio.changeStation(subirEstacion);
                    }else {
                            System.out.println("Opcion invalida");
                        }
                    break;
                    case "c":
                        System.out.println("Ingrese el numero del boton donde desea guardar la estacion\n");
                        int numero = input.nextInt();
                        radio.saveStation(numero);
                    break;
                    case "1":
                        radio.changeStationButton(Integer.parseInt(option));
                     break;
                    case "2":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "3":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "4":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "5":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "6":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "7":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "8":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "9":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "10":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "11":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "12":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;


                }
            }
        }
    }

}

