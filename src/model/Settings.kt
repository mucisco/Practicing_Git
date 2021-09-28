package model

object Settings {
    var language:String="Arabic"
    private set
    var theme:String="Dark"
    private set

    fun changeLanguageToArabic(){ language="Arabic"}
    fun changeLanguageToEnglish(){language="English"}

    fun changeThemeToDark(){theme="Dark"}
    fun changeThemeToLight(){theme="Ligh"}

    fun userLogOut(user:User){
        println("user ${user.name} logout")
    }





}