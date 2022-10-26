package BehavioralDP.ChainOfResponsibility;

public class Memur extends Approver{

    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<100){
            System.out.println("memur onayladi");
        } else if (chief!=null) {
            System.out.println("miktar memurun onaylama siniri disinda," +
                    " sefe yonlendiriliyor");
            return chief.approveLoan(amount);
        }
       return false;
    }
}
