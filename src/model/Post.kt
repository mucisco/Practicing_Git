package model

open class Post {
    var userName:String=""
    var content=""

    var likeCount=0
    private set
    var commentsCount=0
    private set

    var comments= mutableListOf<String>()

    fun like(){
        likeCount++
        println("Have a new like")
    }
    fun addComment(comment:String){
        comments.add(comment)
        commentsCount++
    }





}