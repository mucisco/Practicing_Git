package model

object Settings {
    /**
     * @sample language contains the system language
     * @sample theme contains system theme
     */
    var language:String="Arabic"
    private set
    var theme:String="Dark"
    private set
//region change theme and language
    /**
     * @see changeLanguageToEnglish this function is to change system language to English
     * @see changeLanguageToArabic this function is to change system language Arabic
     */
    fun changeLanguageToArabic(){ language="Arabic"}
    fun changeLanguageToEnglish(){language="English"}

    fun changeThemeToDark(){theme="Dark"}
    fun changeThemeToLight(){theme="Ligh"}
//endregion
    fun userLogOut(user:User){
        println("user ${user.name} logout")
    }
}