import kotlin.browser.document
import kotlin.browser.window

fun main() {
    val callurl = window.document.URL
    if(callurl.contains("sec.html")){
        document.write("Hello, in document 2!")
    }else {
        window.onload = {
            println("loaded sucessfully")
            document.getElementById("test").apply {
                if(this != null){
                    println("found")
                    this.innerHTML= "hello world 2"
                }else{
                    println("not found")
                }
            }
        }
        document.write("Hello, world!")

        val req = Requester()
        req.request()
    }

}