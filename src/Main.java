import java.util.Random;


public class Main {


    public static void main(String[] args) {


        // 1
        String usedMethod_1 = test(21, 30);
        System.out.println(usedMethod_1);

        //2
        String usedMethod_2 = test(60, 20);
        System.out.println(usedMethod_2);

        //3
        String usedMethod_3 = test(47, 25);
        System.out.println(usedMethod_3);

        //4
        String usedMethod_4 = test(80, -5);
        System.out.println(usedMethod_4);

        //5
        String usedMethod_5 = test(21, 50);
        System.out.println(usedMethod_5);


        // ДЗ НА СООБРАЗИТЕЛЬНОСТЬ

        String methodAnswer = test(generateRandomAge(), 10);
        System.out.println(methodAnswer);
    }

    public static String test(int age, int temperature) {

        String answer;

        if ((age > 20 && age < 40) && (temperature > -20 && temperature < 30)) {
            answer = "Можно идти гулять";


        } else if (age < 20 && (temperature > 0 && temperature < 28)) {
            answer = "Можно идти гулять";


        } else if (age > 45 && (temperature > -10 && temperature < 25)) {
            answer = "Можно идти гулять";
        } else {
            answer = "Остовайтесь дома";
        }

        return answer;

    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt();
    }
}