# IBM_1
# Que hace el API:
# L·a base de datos se encuentra dentro de un archivo .sql, el cual permite crear e insertar los registros cada que se ejecuta # la api.
# Al iniciar springboot instala y configura las dependencias del pom, consumiendo H2 para poder hacer lo anterior.
# Para consultar los datos de la base se creo un query (find by) comparando las entradas como pasión, edad (va por rangos) y # salario (va por rangos).
# Para mostrar la información necesaria, se utilizo JsonIgnore.


#     localhost:8080/api/ej1

# {
#     "pasion”:STRING,
#     "edad”:NUMERIC,
#     "salario": NUMERIC
# }
