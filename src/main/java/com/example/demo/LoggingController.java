package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoggingController {
    Logger logger = LoggerFactory.getLogger(LoggingController.class);



    @GetMapping("/")
    public @ResponseBody String welcome() {
        return "endpoints available: trace, debug, info, warning, error";
    }


    /**
     * Trace is the most detailed type of logging
     * @param message: String
     * @return: String
     */
    @GetMapping("/traceLevel/{message}")
    public @ResponseBody String trace(@PathVariable("message") String message) {
        logger.trace(message);
        return "this is trace level";
    }

    /**
     * Debug log provides detailed information.
     * @param message: String
     * @return: String
     */
    @GetMapping("/debugLevel/{message}")
    public @ResponseBody String debug(@PathVariable("message") String message) {
        logger.debug(message);
        return "this is debug level";
    }

    /**
     * Normal application behaviour is logged by a info level log.
     * @param message: String
     * @return: String
     */
    @GetMapping("/infoLevel/{message}")
    public @ResponseBody String info(@PathVariable("message") String message) {
        logger.info(message);
        return "this is info level";
    }

    /**
     * Warn level indicates that there might be a problem.
     * @param message: String
     * @return: String
     */
    @GetMapping("/warnLevel/{message}")
    public @ResponseBody String warn(@PathVariable("message") String message) {
        logger.warn(message);
        return "this is warn level";
    }


    /**
     * Error level indicates that an error occured that needs to be looked into.
     * @param message: String
     * @return: String
     */
    @GetMapping("/errorLevel/{message}")
    public @ResponseBody String error(@PathVariable("message") String message) {
        logger.error(message);
        return "this is error level";
    }

}
