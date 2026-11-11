package pract.pract22_1.sunRai;
//Планеты солнечной системы. Создайте три Singleton-класса: Sun,
//Moon и Earth. Затем реализуйте в них интерфейс CosmicBody с некоторыми операциями.
public class Main {
    public static void main(String[] args) {

        CosmicBody moon =Moon.getInstance();

        System.out.println(moon.isWater());
    }

}
