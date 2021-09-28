package model
class User(var name: String, var yearOfBirth: Int, city: String?=null) {
       var age:Int
       private set
      var  CURRENT_YEAR = 2021
      init {
        age=CURRENT_YEAR-yearOfBirth
          usersCount++
      }
      fun printInfo(){
        println("User name: $name")
        println("User age: $age")
   // println("City: ")
      }
    companion object{
        var usersCount:Int=0
        private set
    }
}