package oit.is.z1381.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lec02Controller {

  /**
   *
   *
   *
   * @param user
   * @param param1
   * @param model
   * @return
   */
  @GetMapping("/lec02")
  public String lec02() {
    return "lec02.html";
  }

  @PostMapping("/lec02")
  public String lec02(@RequestParam String user, ModelMap model) {
    model.addAttribute("user", user);
    return "lec02.html";
  }

  @GetMapping("/lec02/{param1}")
  public String lec021(@PathVariable String param1, ModelMap model) {
    String player = "";
    String cpu = "";
    String judge = "";
    if (param1.equals("g")) {
      judge = "drow";
      cpu = "gu";
      player = "gu";
    } else if (param1.equals("t")) {
      judge = "You Lose!";
      cpu = "gu";
      player = "cyoki";
    } else if (param1.equals("p")) {
      judge = "You Win!";
      cpu = "gu";
      player = "pa";
    } else {
      judge = "";
      cpu = "";
      player = "";
    }
    model.addAttribute("player", player);
    model.addAttribute("cpu", cpu);
    model.addAttribute("judge", judge);
    return "lec02.html";
  }
}
