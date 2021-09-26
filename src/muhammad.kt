fun like(oldLikesCount:Int):Int=oldLikesCount+1
fun dislike(oldLikesCount: Int):Int=oldLikesCount-1
fun getLikesDetails(likesCount:Int):String="Likes: $likesCount"
fun showLikes(likesCount: Int)= println(getLikesDetails(likesCount))
fun sayHello(name:String="Friend")="Hello $name"
fun showSayHelloMessage(name: String)= print(sayHello(name))
fun main(){
    
    var names= listOf("Muhammad","Bassem")

    var inputName:String= readLine()!!
    for (element in names)
        if (element==inputName) checker=true
    print(if (checker) "found" else "not found")
}


