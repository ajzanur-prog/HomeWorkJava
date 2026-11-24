package lesson_3;

public class Park {

    public class Attraction {
        private String name;
        private String workingTime;
        private double price;

        public Attraction(String name, String workingTime, double price) {
            this.name = name;
            this.workingTime = workingTime;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingTime);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        Park.Attraction[] attractions = new Park.Attraction[3];

        attractions[0] = park.new Attraction("Колесо обозрения", "10:00 - 20:00", 600);
        attractions[1] = park.new Attraction("Американские горки", "10:00 - 20:00", 1000);
        attractions[2] = park.new Attraction("Комната страха", "10:00 - 20:00", 550);

        for (Park.Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }
}
