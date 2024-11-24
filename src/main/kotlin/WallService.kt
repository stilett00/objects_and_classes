object WallService {
    private var posts = emptyArray<Post>()
    private var nextID = 1

    fun add(post: Post): Post {
        val newPost = post.copy(id = nextID++)
        posts += newPost
        return posts.last()
    }

    fun printPostsText() {
        posts.forEach { println("${it.id} ${it.text}") }
    }

    fun update(post: Post): Boolean {
        for ((index, existingPost) in posts.withIndex()) {
            if (existingPost.id == post.id) {
                posts[index] = existingPost.copy(
                    authorId = post.authorId,
                    date = post.date,
                    text = post.text,
                    friendsOnly = post.friendsOnly,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views
                )
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
        nextID = 1
    }
}