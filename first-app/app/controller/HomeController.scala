package controller

import javax.inject.{Inject, Singleton}

import akka.http.scaladsl.model.HttpHeader.ParsingResult.Ok
import play.api.mvc.{AbstractController, Action, ControllerComponents}

/**
  * @author khaled
  */
@Singleton
class HomeController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {
  def index() = Action {
    Ok("Hello World")
  }

  def hello(name:String) = Action {
    Ok("Hello "+name)
  }
}
