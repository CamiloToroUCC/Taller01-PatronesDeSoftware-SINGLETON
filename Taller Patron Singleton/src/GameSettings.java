public class GameSettings {
    // Instancia única
    private static GameSettings instance;

    // Atributos de configuración del juego
    private String difficulty;
    private int volume;

    // Constructor privado para evitar instanciación externa
    private GameSettings() {
        // Configuración por defecto
        this.difficulty = "Normal";
        this.volume = 50;
    }

    // Metodo estático para instancia
    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    // Getters y setters
    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Metodo para imprimir la configuración actual
    public void printSettings() {
        System.out.println("Dificultad: " + difficulty);
        System.out.println("Volumen: " + volume);
    }
}
