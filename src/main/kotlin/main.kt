fun main() {

    WallService.add(Post(22, 1735034034, "My first post!"))
    WallService.add(Post(1234, 1835034034, "My second post"))

    WallService.printPostsText()

    WallService.update(Post(22, 1900000000, "My edited post", id = 1))
    WallService.printPostsText()
}