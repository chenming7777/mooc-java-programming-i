
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.00;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double affordableMealPrice = 2.50;
        double change = payment;
        if(payment >= affordableMealPrice){
            change = payment - affordableMealPrice;
            this.affordableMeals++;
            this.money += 2.5;
        }
        return change;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double affordableMealPrice = 2.50;   
        if(card.takeMoney(affordableMealPrice)){
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double heartilyMealPrice = 4.30;
        double change = payment;
        if(payment >= heartilyMealPrice){
            change = payment - heartilyMealPrice;
            this.heartyMeals++;
            this.money += 4.3;
        }
        return change;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        // an affordable meal costs 4.30 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double heartilyMealPrice = 4.30;   
        if(card.takeMoney(heartilyMealPrice)){
            this.heartyMeals++;
            return true;
        }
        return false;
    }
    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum >= 0){
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
