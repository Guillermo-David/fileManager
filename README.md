# fileManager
Sistema de gestión de archivos en base de datos

Este proyecto pretende ser un sistema de gestión de archivos que permita no tener
que almacenarlos directamente en la base de datos, sino que solo se almacene una referencia.

La idea es que una entidad lleve asociada una referencia (FileReference) y que 
cada archivo (File), a su vez, esté asociado a dicha referencia.

A medida que avance el proyecto, cobrará importancia el uso de una 
tercera entidad: FileType, que permitirá distinguir de qué tipo de
archivo se trata más allá de la extensión del mismo.

(En construcción)
