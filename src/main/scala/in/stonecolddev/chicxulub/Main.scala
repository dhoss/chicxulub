package in.stonecolddev.chicxulub

import scalatags.Text.all._

object Main extends cask.MainRoutes {

  // TODO: implement some sort of configuration

  // TODO: organize routes into case classes
  @cask.get("/")
  def root() = {
    // TODO: move database code to its own class
    import scalikejdbc._
    // TODO: make database connection information configurable
    //    look into scalikejdbc-config
    Class.forName("org.postgresql.Driver")
    ConnectionPool.singleton("jdbc:postgresql://localhost:5432/chicxulub", "chicxulub", "chicxulub")
    // TODO: create case class representing a post

    // TODO: consider hikari for connection pooling
    // TODO: use DB object for sessions
    implicit val session = AutoSession
    // TODO: scalatags html should be contained in "views"
    html(
      body(
        div(
          h1(id:="title", "Chicxulub"),
          p("Chicxulub blog")
        )
      )
    )
  }

  // TODO: define an actual logger, for some reason you can only call debug through this instance
  override def main(args: Array[String]): Unit = {
    log.debug("Starting Chicxulub server")
    super.main(args)
  }

  // TODO: host needs to be configurable
  override def host: String = "0.0.0.0"

  initialize()
}