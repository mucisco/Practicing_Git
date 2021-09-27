fun isEven(inputNumber:Int)=inputNumber%2==0
fun isPositive(inputNumber: Int)=inputNumber>=0
fun isGreater(inputNumber: Int,secondInputNumber:Int)=inputNumber>secondInputNumber
fun getFriendsDetails(friendsList:List<String>)="You have ${friendsList.size} friends"
fun main(){
    var friends= mutableListOf("Mustafa","Ahmed","Ali")
    print(getFriendsDetails(friends))

}


