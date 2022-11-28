val par = (1, "Abad Ana")

println(par._2)


val student = (1, "Abad Ana")

val datos = ("Pedro", "M",45,95.1,true)

//Declarar con tipo

//val estu: Tuple2[Int, String]

val(edad, nombre) = student
print(edad)
println(nombre)

student.swap

student.canEqual(1,"Abad Ana")