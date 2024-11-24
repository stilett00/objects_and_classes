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
                posts[index] = post.copy(reposts = post.reposts.copy())
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