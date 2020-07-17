package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class HeaderController {
    private final Logger logger = LoggerFactory.getLogger(HeaderController.class);

    @GetMapping("/showUserAgent")
    public String showUserAgent(@RequestHeader(value = "User-Agent") String userAgent, Model model) {
        model.addAttribute("userAgent", userAgent);
        logger.debug("shown UserAgent");
        return "userAgent";
    }
}