//@main
//(n: Int) => (1 until n).filter(div => n % div == 0)

//factorial escalado

def Factorial_Escalonado (n : Int) : Int = {
  n % 2 match {
    case 0 => (2 to n by 2).product
    case _ => (1 to n by 2).product
  }
}
Factorial_Escalonado(8)
Factorial_Escalonado(9)


val numbers = (1 to 20).toList
//Contar pares

numbers.filter(nro =>  nro % 2 == 0).size
numbers.count(nro =>  nro % 2 == 0)


//contar impares
numbers.filter(nro =>  nro % 2 != 0).size


//contar primos
def contarPrimos(nros : List[Int]) : Int = {
  val isPrime = (n :Int) => (2 until n).forall(n % _!=0)
  nros.filter(isPrime).size
  nros.count(isPrime)
}

contarPrimos(numbers)

//Presentar 3 factores

def tresFactores(nros: List[Int]) : List[Int] = {
  val factores = (n: Int) => (2 until n).filter(n % _ ==0)

  nros.filter(nro => factores(nro).size == 3)
}

tresFactores((1 to 1000).toList)
