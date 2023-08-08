object Q4b extends App{
  def attendees(tp:Int):Int=120+(15-tp)/5*20
  
  def revenue(tp:Int):Int=attendees(tp)*tp
  
  def cost(tp:Int):Int=500+attendees(tp)
  
  def profit(tp:Int):Int=revenue(tp)-cost(tp)
  
  val result=profit(5)
  printf("\n%d",result)
  
  
}