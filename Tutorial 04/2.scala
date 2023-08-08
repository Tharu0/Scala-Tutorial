import scala.io.StdIn.readInt //import scala.io.Stdln object to get readInt() methods 
object Q4 extends App{

    def check(num:Int):String= num match{
        case x if x<=0 => "Negative/Zero Input"
        case x if x%2==0 => "Even number"
        case x if x%2==1 => "Odd number"
    }

    printf("Enter number: ")
    var num=readInt()

    printf("Given number is %s",check(num))
}