package ru.itpark;
public class Main {
    public static void main(String[] args) {
        Auto Mitsubishi = new Auto();
        Auto BMW = new Auto();
        Auto Opel = new Auto();
        Mitsubishi.setColor("Black");
        Mitsubishi.setNumber("xxx");
        Mitsubishi.getPower(300);
        BMW.setColor("Red");
        BMW.setNumber("yyy");
        BMW.getPower(400);
        Opel.setColor("White");
        Opel.setNumber("zzz");
        Opel.getPower(200);
        Auto auto[] = {Mitsubishi, BMW, Opel};
        for (int i = auto.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (auto[j].getPower() > auto[j + 1].getPower()) {
                    Auto temp = auto[j];
                    auto[j] = auto[j + 1];
                    auto[j + 1] = temp;
                }
            }
        }
        for (int z = 0; z < auto.length; z++) {
            System.out.println(auto[z].getNumber() + " " + auto[z].getPower());
        }
    }
}

