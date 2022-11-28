//declaracion de listas

val valores = List(23,2,42,52,3)
val names = List("JOSE","Marco")

//operaciones con listas
//Foldleft
valores.foldLeft(0) ((x, y) => x + y)
valores.foldLeft(0) (_ + _)

//Foldright

valores.foldRight(0) ((x, y) => x + y)
valores.foldRight(0) (_ + _)

//ejemplo foldleft

def average(valores : Seq[Double]) : Double = {
  val t = valores.foldLeft((0.0, 0))((acc, currVal) =>  (acc._1 + currVal,acc._2 + 1))
  t._1 / t._2
}

def average2(valores: Seq[Double]) : Double = {
  val t = valores.foldLeft((0.0, 0)) { (acc, currVal) =>
    val sum = acc._1 + currVal
    val cont = acc._2 + 1
    printf("suma %f - contador: %d%n",sum, cont)
    (sum,cont)
  }
  t._1 / t._2
}

