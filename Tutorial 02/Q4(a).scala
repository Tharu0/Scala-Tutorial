object Q4a extends App{
  
  def wage(hours:Int):Int=hours*250;

  def OT(hours:Int):Int=hours*85;

  def income(h1:Int, h2:Int):Int=wage(h1)+OT(h2);

  def tax(income:Int):Double=income*.12

  def Balance(h1:Int, h2:Int):Double=income(h1,h2)-tax(income(h1,h2));

  val salary=Balance(40,30)
  printf("%.3f",salary)
}
