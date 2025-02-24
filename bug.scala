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
  myInstance.age = 30
  println(myInstance.age) // prints 30

  myInstance.age = -5 // Throws IllegalArgumentException
  println(myInstance.age)
}
```