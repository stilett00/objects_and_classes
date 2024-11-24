data class Post(
    val authorId: Int,
    val date: Int,
    val text: String,
    val id: Int = 0,
    val friendsOnly: Boolean = false,
    val likes: Int = 0,
    val reposts: Reposts = Reposts(),
    val views: Int = 0
) {
}