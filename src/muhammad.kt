import model.Settings
import model.User
import model.post
//region functions
fun isEven(inputNumber:Int)=inputNumber%2==0 //this function used to know if the number is even or not
fun isPositive(inputNumber: Int)=inputNumber>=0 //this function used to know if the number is positive or not
fun isGreater(inputNumber: Int,secondInputNumber:Int)=inputNumber>secondInputNumber //this function used to know if the 1st no. is greater than 2nd no,
fun getFriendsDetails(friendsList:List<String>)="You have ${friendsList.size} friends" //this funtion used to display number of friends

fun namesStartWith(inputListOfNames:List<String>,firtsChar:Char):List<String>{
        val filteredList= mutableListOf<String>()
        inputListOfNames.forEach(){
                if(it.get(0)=='A')
                        filteredList.add(it)
        }
        return filteredList
}
fun nameCheck(inputNames:List<String>,wantedName:String):Boolean  {inputNames.forEach() {
        if(it==wantedName) return true
}
      return false
}
fun enterName()=print("Enter your name please: ")
fun enterYearOfBirth()= print("Enter your year of birth please: ")
fun enterCity()=print("Enter your city (optional): ")
//endregion

fun main(){
        val user=User("Muhammad",2000,"Baghdad")
        println("user: ${user.name}")
        println("language: ${Settings.language}")
        println("Theme: ${Settings.theme}")
        Settings.userLogOut(user)


}


