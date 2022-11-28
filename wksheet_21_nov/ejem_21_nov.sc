
val goleadores = List(
  ("Francisco Fydriszewski", 10),
  ("Joaquin Verges", 9),
  ("Santiago Giordana", 9),
  ("Ismael Diaz", 8),
  ("Tomas Molina", 7),
  ("Danny luna", 7),
  ("Cristian Martines", 7),
  ("Gabriel Cortes", 7),
  ("Leonardo Villagra", 6),
  ("Michael Hoyos",6))

goleadores.groupBy{case(_, goals) => goals}

//respuesta segunda pregunta
goleadores.groupBy{
  case(_, goals) => goals
}.map(row => row match {
  case(goles, listas) => (goles, listas.size)
}).toList.sortBy(_._2).reverse


//version mas corta

goleadores.groupBy{
  case(_, goals) => goals
}.map {
  case(goles, listas) => (goles, listas.size)
}.toList.sortBy(_._2)























