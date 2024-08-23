package org.example


sealed class Error

class FileError(val fileName: String) : Error()
class DatabaseError(val dbmsType: DbmsType) : Error()
class RedisError(val host: String) : Error()


enum class DbmsType {
    MYSQL, MARIA, ORACLE, H2
}


fun getCharacter(error: Error) = when (error) {
    is FileError -> error.fileName
    is DatabaseError -> error.dbmsType
    is RedisError -> error.host

}