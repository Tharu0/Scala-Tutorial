import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

class Account(a:String, b:Int, c:Double){
    val Nic:String=a
    val AcNo:Int=b;
    var Balance:Double=c;
    override def toString ="["+Nic+":"+AcNo +":"+ Balance+"]"

    def withdraw(transfer_amount:Double)=this.Balance-transfer_amount;
    def deposit(transfer_amount:Double)=this.Balance+transfer_amount;

    def transfer(acnt:Account,trans:Double) ={
        this.Balance = this.withdraw(trans)
        acnt.Balance=acnt.deposit(trans)
    }
}

object Q3 extends App{

    printf("Money for transfer: ")
    val trans=readInt()
   
    val person1=new Account("996632261V", 12345, 75000)
    val person2=new Account("342312563V", 67891, 40000)

    person1.transfer(person2,trans)
    println("Balance of money sender: "+person1.Balance)
    println("Balance of money receiver: "+person2.Balance)

}
