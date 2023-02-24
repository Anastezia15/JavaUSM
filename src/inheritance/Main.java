package inheritance;
/*
Создайте иерархию классов Точка - Круг - Конус.
Класс Конус должен содержать метод для определения объема конуса.
Создайте метод MAIN, в котором создается 2 конуса, определяется какой из конусов меньший,
а также входит ли меньший конус полностью в больший.
 */

public class Main {
    public static void main(String[] args) {
        Cone cone1 = new Cone(2.1f, 3.5f, 15, 8);
        Cone cone2=new Cone(2.1f,3.5f,15,8);
        int res = biggerCone(cone1,cone2);
        switch (res) {
            case 1 -> {
                System.out.println("Cone 1 is bigger");
            }
            case 2 -> {
                System.out.println("Cone 2 is bigger");
            }
            case 0 -> {
                System.out.println("They are equal");
            }
        }
        howMany(cone1,cone2);
    }

    public static int biggerCone(Cone cone1, Cone cone2) {
        int res = 0;
        if (cone1.coneVolume() > cone2.coneVolume()) {
            res = 1;
        } else if (cone2.coneVolume() > cone1.coneVolume())
            res = 2;

        return res;    }

    public static void howMany(Cone cone1, Cone cone2) {
        if (biggerCone(cone1, cone2) == 0) System.out.println("They have the same size");
        else if (biggerCone(cone1, cone2) == 1)
            System.out.println("Cone 2 fits in cone 1 "+ cone1.coneVolume()/cone2.coneVolume()+" times");
         else if (biggerCone(cone1,cone2)==2)
            System.out.println("Cone 1 fits in cone 2 " + cone2.coneVolume() / cone1.coneVolume() + " times");
    }
}
