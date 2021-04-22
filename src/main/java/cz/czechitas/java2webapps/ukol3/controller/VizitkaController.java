package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Card;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    private final List<Card> cards;

    public VizitkaController() {
        cards = List.of(
                new Card("name 0", "Czechitas z. s.", "street 1", "Brno 63900", "email@email.com", "phoneNumber", "www.address.com"),
                new Card("name 1", "Czechitas z. s.", "street 1/2", "Brno 63900", "email@email.com", "phoneNumber", null),
                new Card("name 2", "Czechitas z. s.", "street 9 3/4", "Praha 11000", null, "phoneNumber", "www.address.com"),
                new Card("name 3", "Czechitas z. s.", "street 9", "Brno 63900", "email@email.com", null, "www.address.com")

        );
    }

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("card", cards);
        return modelAndView;
    }

    @GetMapping("/detail")
    public ModelAndView detail(int id) {
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("card", cards.get(id));
        return modelAndView;
    }
}
