package generics;

/*
    1. In main() 2 instances of Storage Class are created, each with a different type. This way we can use the same class with
    different type objects. Generics give us the ability to use general Classes and specify the concrete type items at runtime.
    2. Since we have instantiated Storage Class with BankAccount, we cannot use an Object type argument to its methods without
    casting it to BankAccount type. Also, we cannot call a method of BankAccount class from an Object type object.
    3. We are trying to initiate a BankAccount object with an object of Type Object. Therefore, the compiler gives us an incompatible
    types error indicating that we should cast baCls before creating a new instance of its type and passing it to myAccount.
    4. In that case the compiler performs the operation and this is not dynamic but static casting.
    5. By declaring what type of object (BankAccount) we want to create/expect we dont create a generic Object anymore.
    Therefore, there is no reason for casting when creating the new instance.
    6. The output is EQUAL because both of our objects are instances of the generic Class Storage, although they are using
    it as different type objects.
 */

public class Driver {

    public static void main(String[] args) {
        Storage<BankAccount> aStorage = new Storage<>();
        Storage<String> sStorage = new Storage<>();

        Class<BankAccount> baCls = BankAccount.class;
        try {
            BankAccount myAccount = baCls.newInstance();
            aStorage.setValue(myAccount);
            // Deposit
            myAccount.deposit(15);

            System.out.println( aStorage.getValue().showBalance() );

            if( aStorage.getClass() == sStorage.getClass() ) {
                System.out.println( "EQUAL" );
            } else {
                System.out.println( "NOT EQUAL" );
            }
        }
        catch ( InstantiationException e ) {
            // ...
        }
        catch ( IllegalAccessException e ) {
            // ...
        }

    }
}