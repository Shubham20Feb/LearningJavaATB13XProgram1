package ex_24_Exceptions;

public class Lab_20_Custom_Exception {
    public static void main(String[] args) throws Lab_21_Bank.CurrencyMisMatchException {

        Lab_21_Bank sbi = new Lab_21_Bank("INR", 100);
        Lab_21_Bank iciic = new Lab_21_Bank("INR", 156);

        int total = sbi.add(iciic);
        System.out.println(total);

        Lab_21_Bank Jp = new Lab_21_Bank("USD", 101);
        int totalnew = sbi.add(Jp);
        System.out.println(totalnew);
    }
}
