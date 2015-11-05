package vu.co.kaiyin.countablejs

import org.scalajs.dom
import org.scalajs.dom.raw.Element
import vu.co.kaiyin.sjsdp.domepk.Dome.{Dome, dome}

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

/**
  * Created by kaiyin on 04/11/2015.
  */
@JSExport
object Main {
  @JSExport
  def main(): Unit = {
    val mathp: Element = dom.document.getElementById("pick")
    Countable.live(mathp, (e: dom.Element, res: CountResult) => {
      dom.document.getElementById("count").textContent = "%d, %d, %d, %d, %d".format(res.all, res.characters, res.paragraphs, res.sentences, res.words)
    })
  }

}
