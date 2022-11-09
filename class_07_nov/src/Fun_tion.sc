//ejercicio --> 1
val names : List[String] = List("leo", "jose","Cristian", "Enner", "Felipe")
names.map(_.length)

//ejercicio --> 2

val numbers = List(3,4,7,11,12)
val isPrime = (nro : Int) => (2 to nro - 1).forall(nro % _ != 0)
numbers.map(isPrime) match {
  case true => 1
  case false => 0
}


//ejercicio

