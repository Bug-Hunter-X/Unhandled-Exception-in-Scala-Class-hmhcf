```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge >= 0) {
      _age = newAge
    } else {
      throw new IllegalArgumentException("Age cannot be negative")
    }
  }
}

object Main extends App {
  val myInstance = new MyClass("John")
  try {
    myInstance.age = 30
    println(myInstance.age) // prints 30
    myInstance.age = -5 //This will throw exception
    println(myInstance.age)
  } catch {
    case e: IllegalArgumentException => println("Error: " + e.getMessage)
    case e: Exception => println("An unexpected error occurred: " + e.getMessage)
  }
}
```