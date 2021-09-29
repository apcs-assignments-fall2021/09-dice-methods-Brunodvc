public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {

        return (int) (Math.random() * 6)+1;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        // REPLACE WITH YOUR CODE HERE

        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
        double counter = 0.0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 6; j++) {
                if ((int) (Math.random() * 6) + 1 == 6) {
                counter += 1.0;
                break;
            }
        }
        }

        return (counter/10000)*100;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        double counter = 0.0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 12; j++) {
                if ((int) (Math.random() * 6) + 1 == 6) {
                    counter += 1.0;
                }
                else if (counter > 2.0){
                    break;
                }
            }
        }

        return (counter/10000)*100;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        // REPLACE WITH YOUR CODE HERE
        return -1.0;
    }

    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
