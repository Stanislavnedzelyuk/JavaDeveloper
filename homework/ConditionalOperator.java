package homework;

public class ConditionalOperator {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }
        public static void task1 () {
            int age = 17;
            if (age >= 18) {
                System.out.println("Если возраст человека равен" + " " + age + ", то он совершеннолетний");
            }
            if (age < 18) {
                System.out.println("Если возраст человека равен" + " " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
            }
        }
        public static void task2 () {
            short temperature = 5;
            if (temperature < 5) {
                System.out.println("На улице" + " " + temperature + ", нужно надеть шапку");
            }
            if (temperature >= 5) {
                System.out.println("На улице" + " " + temperature + ", можно идти без шапки");
            }
        }
        public static void task3 () {
            short speed = 60;
            if (speed >= 60) {
                System.out.println("Если скорость" + " " + speed + ", то придется заплатить штраф");
            if (speed < 60) {
                System.out.println("Если скорость" + " " + speed + ", то можно ездить спокойно");
            }
            }
        }
        public static void task4 () {
            short age = 3;
            if (age >= 2 && age < 6) {
                System.out.println("Если возвраст человека равен" + " " + age + ",то ему нужно ходить в детский сад");
            }
            if (age >= 7 && age < 18) {
                System.out.println("Если возвраст человека равен" + " " + age + ",то ему нужно ходить в школу");
            }
            if (age >= 18 && age < 24) {
                System.out.println("Если возвраст человека равен" + " " + age + ",то ему пора ходить на работу");
            }
        }
        public static void task5 () {
            short age = 6;
            if (age < 5) {
                System.out.println("Если возраст ребенка равен" + " " + age + ",нельзя кататься на аттракционе");
            }
            if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен" + " " + age + ",можно кататься на аттракционе в сопровождении");
            }
            if (age > 14) {
                System.out.println("Если возраст ребенка равен" + " " + age + ",без сопровождения взрослого");
            }

        }
        public static void task6 () {
            int van = 102;
            int vanSitting = 60;
            int vanStaying = van-vanSitting;
            if (vanSitting < 60) {
            System.out.println("Сидяие места в вагоне есть");
            } else {
            System.out.println("Сидячих мест в вагоне нет");
        }
        }
        public static void task7 () {
             int one = 1;
             int two = 2;
             int three = 3;

                 System.out.println();
             }
         }





   /*  int age = 17;
if (age >= 18) {
        System.out.println("Ты можешь водить");
        } else {
        System.out.println("Ты не можешь водить");
        }

    */
