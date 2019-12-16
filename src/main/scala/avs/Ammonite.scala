package avs

object Ammonite {

  def main(args: Array[String]): Unit = {
    ammonite.Main(
      predefCode =
        """
          |import avs.ops;
          |import avs.domain._;
          |
          |val personLs = List(Person(23, "alice"), Person(35, "bob"), Person(21, "charlie"));
          |val intLs = List(-5, 8, 10, 2, 5);
        """.stripMargin
    ).run()
  }
}
