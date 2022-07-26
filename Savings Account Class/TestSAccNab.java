package testsaccnab;
/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
class SavingAccount {
    static float annualIntrestRate;
    private double SavingsBalance;

    public void setAIR(float air) {
        annualIntrestRate = air;
    }
    float getAIR() {
        return annualIntrestRate;
    }

    SavingAccount(double sb) {
        SavingsBalance = sb;
    }

    //double mit=(SavingsBalance*annualIntrestRate)/12;
    double calmonthlyintrest() {
        double mit = (SavingsBalance * annualIntrestRate) / 12;
        return mit;
    }

    double printNewBalance() {
        double NewBal = calmonthlyintrest() + SavingsBalance;
        return NewBal;
    }

    static float modifyIntRate(float mir) {
        annualIntrestRate = mir;
        return annualIntrestRate;
    }
}

public class TestSAccNab {


    public static void main(String[] args) {
        SavingAccount save1 = new SavingAccount(2000);
        SavingAccount save2 = new SavingAccount(3000);
        save1.setAIR(0.04 f);
        System.out.println("Monthly Interest at 4% on $2000 is: " + save1.calmonthlyintrest() + " %");
        System.out.println("The New Balance for Saver1 is: $" + save1.printNewBalance());
        save2.setAIR(0.05 f);
        System.out.println("Monthly Interest at 5% on $3000 is: " + save2.calmonthlyintrest() + " %");
        System.out.println("The New Balance for Saver2 is: $" + save2.printNewBalance());
    }
}