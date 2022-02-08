package CustomizedExceptionAssignment;

public class MainAssignmentQues {
    public static void main(String[] args) throws InvalidAmountException {
        BankOperations obj_op=new BankOperations(30000.25);
        try{
            try{
                obj_op.withdraw(35000.00);
            }
            catch (InsufficientBalanceException e){
                System.out.println(e);
            }
            obj_op.deposit(0.0);
        }
        catch (InvalidAmountException e){
            System.out.println(e);
        }
    }
}
