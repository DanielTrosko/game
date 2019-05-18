import player.Player;

public class Main {
    public static void main(String[] args) {
       Player player= Dialog.choise();
        System.out.println("Dobrze wybrałeś " + player.getPersonType() + " Bedziesz nazywał sie " + player.getName());
        System.out.println();
    }
}
