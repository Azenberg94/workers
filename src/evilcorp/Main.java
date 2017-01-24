package evilcorp;

/**
 * Created by Az on 24/01/2017.
 */
public class Main {

    public static void main(String[] args) {
        Factory f = new Factory();
        CommandHandler commandHandler = new CommandHandler(f);

        // On check si des paramètres ont été entrés
        if (args.length > 0){
            // On check le premier paramètre afin de savoir de quelle commande il s'agit
            switch(args[0]){
                case "activity" :
                case "robot" :
                    commandHandler.handleMonoCommand(args);
                    break;

                case "--file" :
                    commandHandler.handleJSONFile(args);
                    break;

                default:
                    System.out.println("Paramètre(s) non valide(s) !");
            }
        }
    }
}