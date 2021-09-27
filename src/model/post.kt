package model

class post {
    //region variables
    var userName:String="Muhammad"
    var postDate:String="17/4/2000"
    var likesCount=0
    //endregion
    //region methods
    fun like()=likesCount++
    fun dislike()=likesCount--
    //endregion
}
