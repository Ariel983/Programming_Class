val nros = List(727.7, 1086.5, 1091.0, 1361.3, 1490.5,1956.1)
def promedio(valores : List[Double]) : Double = valores.sum / valores.size
def desvEst(valores : List[Double]) : Double = {
  val avg = promedio(valores)

  def varianza(valores : List[Double]) : Double = {
    valores.map(x => Math.pow(x - avg, 2)).sum * (1.0 / (valores.size - 1))

    Math.sqrt(varianza(valores))
  }
}


def clasifica(valores: List[Double]) : Double = {
  val s = desvEst(valores)
  val avg = promedio(valores)

  (1 to 3).foreach(i =>
    println(valores.filter(x =>
      x >= (avg - i * 5) && x <= (avg + 1 * 5)).size))
}