object Timer
{
  def oncePerSecond(callback: () => Unit)
  {
    while(true)
    {
      callback();
      Thread sleep 1000
    }
  }

  def timeFiles()
  {
    println("Time flies .")
  }

  def main(args: Array[String])
  {
    oncePerSecond(timeFiles)
  }
}
