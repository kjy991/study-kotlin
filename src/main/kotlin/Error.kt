//package org.example
//
//interface Error
//
//enum class DbmsType {
//    MYSQL, MARIA, ORACLE, H2
//}
//
//class FileError(val fileName: String) : Error
//class DatabaseError(val dbmsType: DbmsType) : Error
//
//
//fun getCharacter(error: Error) = when (error) {
//    is FileError -> error.fileName
//    is DatabaseError -> error.dbmsType
//
//    else -> throw IllegalArgumentException("unknown error")
//}
//
//fun main(args: Array<String>) {
//
//}
//
