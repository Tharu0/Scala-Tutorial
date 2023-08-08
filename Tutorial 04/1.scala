import scala.io.StdIn.readDouble //import scala.io.Stdln object to get readDouble() methods 
object  Q1 extends App{

    def Interest(sal:Double):Double=sal match{
        case x if x<=20000 => x*0.02
        case x if x<=200000 => x*0.04
        case x if x<=2000000 => x*0.035
        case x => x*0.065
    }

    printf("Enter your salary: ")
    var salary=readDouble() //reads a line and returns a floating point number
    
    printf("Amount of interest: %.2f",Interest(salary))
}