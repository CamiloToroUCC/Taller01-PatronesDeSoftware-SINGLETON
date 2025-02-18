public class Main {
    public static void main(String[] args) {
        // Se obtiene la instancia única de GameSettings
        GameSettings settings = GameSettings.getInstance();
        System.out.println("Configuración inicial:");
        settings.printSettings();

        // Se modifica la configuración
        settings.setDifficulty("Difícil");
        settings.setVolume(87);

        // Se obtiene la instancia nuevamente y print de la configuración actualizada
        GameSettings settings2 = GameSettings.getInstance();
        System.out.println("Configuración actualizada:");
        settings2.printSettings();

        // Comprobación: ambas variables apuntan a la misma instancia
        if (settings == settings2) {
            System.out.println("Ambas variables comparten la misma instancia de GameSettings.");
        }
    }
}
