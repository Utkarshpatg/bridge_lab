//package oopBasedQuestion;
//
//public class Cars {
//    String brand;
//    int speed;
//    static int wheel = 4;
//
//    public Cars(String brand,int speed){
//        this.brand = brand;
//        this.speed = speed;
//    }
//    public void displayInfo(){
//        System.out.print("brand "+ brand+" ,");
//        System.out.print("speed " + speed + " km/hr ,");
//        System.out.println("wheels " + wheel+" ," );
//    }
//
//    public static void main(String[] args) {
//        Cars car1 = new Cars("toyota",100);
//        Cars car2 = new Cars("suzuki",80);
//        Cars car3 = new Cars("renault",60);
//
//        car1.displayInfo();
//        car2.displayInfo();
//        car3.displayInfo();
//    }
//
//
//}

package oopBasedQuestion;

import java.util.Scanner;

public class Cars {
        String brand;
        int speed;
        static int wheel = 4;

        public Cars(String brand,int speed){
            this.brand = brand;
            this.speed = speed;
        }
        public void displayInfo(){
            System.out.println("Brand: "+brand);
            System.out.println("speed: "+speed+" km/r ,");
            System.out.println("wheels: "+wheel+" ,");
            System.out.println("------------------");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//            System.out.print("How many car you wants to create: ");
//            int n = sc.nextInt();
            Cars car[] = new Cars[3];

            for(int i =0;i<3;i++){
                System.out.println("Enter Brand for car"+(i+1)+ " :");
                String brand = sc.nextLine();

                System.out.println("Enter speed for car"+(i+1)+" :");
                int speed = sc.nextInt();
                sc.nextLine();

                car[i] = new Cars(brand,speed);
            }
            for(Cars c: car){
                c.displayInfo();
            }
            System.out.println("changing wheels through first car...");
            car[0].wheel = 6;

            for(Cars c : car){
                c.displayInfo();
            }
            sc.close();
        }
    }
