val par = (1, "Abad Ana")

println(par._2)


val goleadores = (("Oscar Becerra", 17),
  ("Luis Amarilla", 16),
  ("Michael Estada", 16),
  ("Fidel Martines", 16),
  ("Gonzalo Matriani", 13),
  ("Leonel Vides", 13),
  ("Rodrigo Aguirre", 12),
  ("Carlos Garces", 12),
  ("Jonathal Borja", 11))

val goles = goleadores.map(_._2).map(_.toDouble)


val datos = ("Pedro", "M",45,95.1,true)

//Declarar con tipo

//val estu: Tuple2[Int, String]

val(edad, nombre) = goleadores
print(edad)
println(nombre)

goleadores.canEqual(1,"Abad Ana")
















