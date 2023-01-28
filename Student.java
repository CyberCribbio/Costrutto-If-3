 import java.util.Random;

    public class Student {
        public String name;
        public int age;

        public Student(String studentName, int studentAge) {
            this.name = studentName;
            this.age = studentAge;
        }

        public void guessingAge() {
            Random random = new Random();
            int randomNumber = random.nextInt(21);
            System.out.println("Ho generato il valore randomico " + randomNumber + " per lo studente " + this.name);
            String output = "";
            if (randomNumber == this.age) {
                output = "equal";
            } else if (randomNumber > this.age) {
                output = "greater";
            } else {
                output = "lower";
            }

            System.out.println("Il valore randomico è: " + output);
        }
    }


