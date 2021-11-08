package oit.is.z1381.kaizi.janken.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import oit.is.z1381.kaizi.janken.model.UserMapper;
import oit.is.z1381.kaizi.janken.model.User;

@Controller
public class Lec02Controller {

  @Autowired
  UserMapper uMapper;

  /**
   *
   * @param user
   * @param param1
   * @param model
   * @return
   */

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

  @GetMapping("/lec02")
  @Transactional
  public String lec022(ModelMap model) {
    ArrayList<User> users1 = uMapper.selectAllUser();
    model.addAttribute("users1", users1);
    return "lec02.html";
  }
}
