package ex_24_Exceptions;

public class Lab_21_Bank {

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    private String currency;
   // Parametrise constructore
    public Lab_21_Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    private Integer amount;

    public Integer add(Lab_21_Bank bankName) throws CurrencyMisMatchException {
        if (bankName.currency.equals("INR")){
            return bankName.amount + this.amount;

        }else {
            throw new CurrencyMisMatchException("Currency Mistmatch");
        }

    }

    class CurrencyMisMatchException extends Exception{
        public CurrencyMisMatchException(String mag){
            super(mag);
        }
    }


}
