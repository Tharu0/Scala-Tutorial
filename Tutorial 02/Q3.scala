object Q3 extends App{
  var(a:Int,b:Int, c:Int, d:Int)=(2,3,4,5)
  var k=4.3
  var g=4.0
  
  //printf("\n%d",--b*a+c*d--) //scala not support decrement operator
  //printf("\n%d",a++) //scala not support increment operator
  printf("\n%.2f",-2*(g-k)+c) //output generated. it is 4.60
  printf("\n%d",c=c++) // can't execute in scala
  printf("\n%d",c=++c*a++) // scala not support increment operator
}
