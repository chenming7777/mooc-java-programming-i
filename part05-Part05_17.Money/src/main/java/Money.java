
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition){
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;
        Money newMoney = new Money(totalEuros, totalCents);
        return newMoney;
    }
    public boolean lessThan(Money compared){
        
        if(this.euros < compared.euros){
            return true;
        }
        return this.euros == compared.euros && this.cents < compared.euros;
    }
    public Money minus(Money decreaser){
        if(this.lessThan(decreaser)){
            Money newMoney = new Money(0,0);
            return newMoney;
        }else{
            int totalEuros = this.euros - decreaser.euros;
            int totalCents = this.cents - decreaser.cents;
            while (totalCents < 0){
                totalCents += 100;
                totalEuros --;
            }
            Money newMoney = new Money(totalEuros, totalCents);
            return newMoney;
        }
    }
}
