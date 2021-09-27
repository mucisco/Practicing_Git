import model.post

//region functions
fun isEven(inputNumber:Int)=inputNumber%2==0 //this function used to know if the number is even or not
fun isPositive(inputNumber: Int)=inputNumber>=0 //this function used to know if the number is positive or not
fun isGreater(inputNumber: Int,secondInputNumber:Int)=inputNumber>secondInputNumber //this function used to know if the 1st no. is greater than 2nd no,
fun getFriendsDetails(friendsList:List<String>)="You have ${friendsList.size} friends" //this funtion used to display number of friends
// endregion

fun getNameStartWith(names:List<String>,firstChar:Char):List<String>{
     var filteredList= mutableListOf<String>()
    names.forEach(){
        if(it.get(0)=='A')
            filteredList.add(it)
    }
    return filteredList
}
fun main(){
        val myPost=post()
        println(myPost.likesCount)
         myPost.like()
         myPost.like()
        println(myPost.likesCount)
}


